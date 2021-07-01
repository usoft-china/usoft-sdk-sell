package com.usoft.sdk.sell.client.open;

import com.usoft.sell.external.api.entity.AttachFile;
import com.usoft.sell.external.open.api.protobuf.*;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * 商家服务
 *
 * @author CODE-GEN-GO
 */
public class OpenSellerSdkTest {
    /**
     * 测试地址
     */
    private OpenSellerSdk openSellerSdk = new OpenSellerSdk("https://sellrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");
    
    @Test
    public void createOrModifySellerAdvert() throws Exception {
        CreateOrModifySellerAdvertReq.Builder req = CreateOrModifySellerAdvertReq.newBuilder();
        //编号
        req.setCode("SA210629493327609802");
        AttachFile.Builder builder = AttachFile.newBuilder();
        // 文件名称
        builder.setName("55.jpg");
        // 文件地址
        builder.setUrl("https://static.uuzcc.cn/appsell/11210629493730673811.jpg");
        // 文件大小
        builder.setSize(42507);
        req.setImageAF(builder);
        //标题
        req.setTitle("12333");
        //链接
        req.setUrl("www.baidu.comytrytr");
        //企业uu
        req.setEnuu(10050905);

        CreateOrModifySellerAdvertResp resp = openSellerSdk.createOrModifySellerAdvert(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void deleteSellerAdvert() throws Exception {
        DeleteSellerAdvertReq.Builder req = DeleteSellerAdvertReq.newBuilder();
        //编号
        req.setCode("");

        DeleteSellerAdvertResp resp = openSellerSdk.deleteSellerAdvert(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getSeller() throws Exception {
        GetSellerReq.Builder req = GetSellerReq.newBuilder();
        //企业uu
        req.setEnuu(10050905);

        GetSellerResp resp = openSellerSdk.getSeller(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getSellerAdvertList() throws Exception {
        GetSellerAdvertListReq.Builder req = GetSellerAdvertListReq.newBuilder();
        //企业uu
        req.setEnuu(10050905);

        GetSellerAdvertListResp resp = openSellerSdk.getSellerAdvertList(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void pagingSeller() throws Exception {
        PagingSellerReq.Builder req = PagingSellerReq.newBuilder();
        // 每页条数
        req.setPageSize(10);
        // 当前页码
        req.setPageNumber(1);
        //关键词（店铺名称）
        req.setKeywords("");

        PagingSellerResp resp = openSellerSdk.pagingSeller(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void saveSeller() throws Exception {
        SaveSellerReq.Builder req = SaveSellerReq.newBuilder();
        //商家名称
        req.setName("UAS卖家联调");
        //联系电话
        req.setContactMobile("98798");
        //配送方式 0:物流配送 10:商家配送
        req.setDeliveryCategory(0);
        //开户名称
        req.setBankAccountName("123");
        //银行卡号
        req.setBankAccount("321");
        //开户行
        req.setBankName("666");
        //企业uu
        req.setEnuu(10050905);

        SaveSellerResp resp = openSellerSdk.saveSeller(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}