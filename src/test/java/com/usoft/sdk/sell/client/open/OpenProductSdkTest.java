package com.usoft.sdk.sell.client.open;

import com.usoft.sell.external.api.entity.AttachFile;
import com.usoft.sell.external.open.api.protobuf.*;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * @author uas
 * @date 2020/5/28 11:35
 */
public class OpenProductSdkTest {
    /**
     * 测试地址
     */
    private OpenProductSdk productSdk = new OpenProductSdk("https://sellrest.uuzcc.cn", "50000092","c49f7be6a861461ab951e55030055a5c");

    @Test
    public void createOrUpdateProduct() throws Exception {
        CreateOrUpdateProductReq.Builder req = CreateOrUpdateProductReq.newBuilder();
//		req.setCode("PD210604277672775900");
        req.setMaterialCode("MaterialCode005");
        req.setTitle("123");
        req.setModel("Model3");
        req.setBrand("Brand3");
        req.setName("Name3");
        req.setSpec("Spec3");
        req.setUnit("PCS");
        req.setUnitPrice(87897.12345678);
        req.setReserve(10100);
        AttachFile.Builder file = AttachFile.newBuilder();
        file.setName("11.jpg");
        file.setUrl("http://1812.img.pp.sohu.com.cn/images/blog/2009/11/18/18/8/125b6560a6ag214.jpg");
//        req.setImageAF(file);
        req.setCreatedTime("2021-06-01 10:00:00");
        CreateOrUpdateProductResp resp = productSdk.createOrUpdateProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getProduct() throws Exception{
        GetProductReq.Builder req = GetProductReq.newBuilder();
//        req.setCode("PD200616229890022300");
        req.setCode("PD210604277672775900");
        GetProductResp resp = productSdk.getProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void pagingProduct() throws Exception{
        PagingProductReq.Builder req = PagingProductReq.newBuilder();
        req.setPageSize(10);
        req.setPageNumber(1);
        req.setKeywords("1");
        req.setStatus(20);
        PagingProductResp resp = productSdk.pagingProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void batchDeleteProduct() throws Exception {
        BatchDeleteProductReq.Builder req = BatchDeleteProductReq.newBuilder();
        req.addCode("PD210604277672775900");
        req.addCode("PD210604277738487401");
        BatchDeleteProductResp resp = productSdk.batchDeleteProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void batchReleaseProduct() throws Exception {
        BatchReleaseProductReq.Builder req = BatchReleaseProductReq.newBuilder();
        BatchReleaseProductResp resp = productSdk.batchReleaseProduct(req);
        ReleaseProduct.Builder builder = ReleaseProduct.newBuilder();
        builder.setCode("PD210610331920062605");
        builder.setPosition("123");
        builder.setReserve(50000);
        builder.setUnitPrice(999);
        req.addProduct(builder);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void batchRevokeProduct() throws Exception {
        BatchRevokeProductReq.Builder req = BatchRevokeProductReq.newBuilder();
        req.addCode("PD210604277672775900");
        req.addCode("PD210604277738487401");
        BatchRevokeProductResp resp = productSdk.batchRevokeProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateProductReserve() throws Exception {
        UpdateProductReserveReq.Builder req = UpdateProductReserveReq.newBuilder();
        req.setCode("PD210604277672775900");
        req.setReserve(1);
        req.setType(10);
        UpdateProductReserveResp resp = productSdk.updateProductReserve(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void listCategory() throws Exception {
        ListCategoryReq.Builder req = ListCategoryReq.newBuilder();
        // 父级类目编号
        req.setParentCode("CY210810856542965846");

        ListCategoryResp resp = productSdk.listCategory(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void listCategoryProperty() throws Exception {
        ListCategoryPropertyReq.Builder req = ListCategoryPropertyReq.newBuilder();
        // 类目编号
        req.setCategoryCode("");

        ListCategoryPropertyResp resp = productSdk.listCategoryProperty(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void searchCategory() throws Exception {
        SearchCategoryReq.Builder req = SearchCategoryReq.newBuilder();
        //关键词（类目名称）
        req.setKeywords("红酒");

        SearchCategoryResp resp = productSdk.searchCategory(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
