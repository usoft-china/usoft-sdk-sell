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
    private OpenProductSdk productSdk = new OpenProductSdk("https://sellrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

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
        req.setImageAF(file);
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
        req.addCode("PD210604277672775900");
        req.addCode("PD210604277738487401");
        BatchReleaseProductResp resp = productSdk.batchReleaseProduct(req);
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
}
