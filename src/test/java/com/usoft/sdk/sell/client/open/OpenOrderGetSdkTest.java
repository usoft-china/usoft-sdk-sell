package com.usoft.sdk.sell.client.open;

import com.usoft.sell.external.open.api.protobuf.*;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * 订单查询服务
 *
 * @author CODE-GEN-GO
 */
public class OpenOrderGetSdkTest {
    /**
     * 测试地址
     */
    private OpenOrderGetSdk openOrderGetSdk = new OpenOrderGetSdk("https://sellrest.uuzcc.cn", "50000092","c49f7be6a861461ab951e55030055a5c");
    
    @Test
    public void getBuyerOrderDetail() throws Exception {
        GetBuyerOrderDetailReq.Builder req = GetBuyerOrderDetailReq.newBuilder();
        //订单编号
        req.setCode("OR210618398674495919");

        GetBuyerOrderDetailResp resp = openOrderGetSdk.getBuyerOrderDetail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getBuyerTab() throws Exception {
        GetBuyerTabReq.Builder req = GetBuyerTabReq.newBuilder();
        //企业enuu
        req.setEnuu(10050624);
        // 个人uu
        req.setUu(1000002821);

        GetBuyerTabResp resp = openOrderGetSdk.getBuyerTab(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getSellerOrderDetail() throws Exception {
        GetSellerOrderDetailReq.Builder req = GetSellerOrderDetailReq.newBuilder();
        //订单编号
        req.setCode("OR230725027604984473");

        GetSellerOrderDetailResp resp = openOrderGetSdk.getSellerOrderDetail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getSellerTab() throws Exception {
        GetSellerTabReq.Builder req = GetSellerTabReq.newBuilder();
        //企业enuu
        req.setEnuu(10050905);

        GetSellerTabResp resp = openOrderGetSdk.getSellerTab(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void pagingBuyerOrder() throws Exception {
        PagingBuyerOrderReq.Builder req = PagingBuyerOrderReq.newBuilder();
        // 每页条数
        req.setPageSize(10);
        // 当前页码
        req.setPageNumber(1);
        //10：待支付，20：待收款，30：待发货，40：待收货，90：已取消
        req.setStatus(30);
        //关键词（商品标题/订单号）
        req.setKeywords("");
        //企业enuu
        req.setEnuu(50000092);
        // 个人uu
        req.setUu(1000002821);

        PagingBuyerOrderResp resp = openOrderGetSdk.pagingBuyerOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void pagingSellerOrder() throws Exception {
        PagingSellerOrderReq.Builder req = PagingSellerOrderReq.newBuilder();
        //企业enuu
        req.setEnuu(50000089);
        // 每页条数
        req.setPageSize(10);
        // 当前页码
        req.setPageNumber(1);
        //10：待支付，20：待收款，30：待发货，40：待收货，90：已取消
        req.setStatus(10);
        //关键词（商品标题/订单号）
        req.setKeywords("");

        PagingSellerOrderResp resp = openOrderGetSdk.pagingSellerOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}