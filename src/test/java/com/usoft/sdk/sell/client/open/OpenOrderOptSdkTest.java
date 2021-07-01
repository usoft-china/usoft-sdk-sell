package com.usoft.sdk.sell.client.open;

import com.usoft.sell.external.open.api.protobuf.*;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * 订单操作服务
 *
 * @author CODE-GEN-GO
 */
public class OpenOrderOptSdkTest {
    /**
     * 测试地址
     */
    private OpenOrderOptSdk openOrderOptSdk = new OpenOrderOptSdk("https://sellrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");
    
    @Test
    public void cancelOrder() throws Exception {
        CancelOrderReq.Builder req = CancelOrderReq.newBuilder();
        // 订单编号
        req.setCode("");

        CancelOrderResp resp = openOrderOptSdk.cancelOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void deliverOrder() throws Exception {
        DeliverOrderReq.Builder req = DeliverOrderReq.newBuilder();
        //订单编号
        req.setCode("OR210701511136956512");
        //物流公司/送货人
        req.setExpressInc("123");
        //物流单号/联系方式
        req.setExpressCode("321");

        DeliverOrderResp resp = openOrderOptSdk.deliverOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void orderEnsurePay() throws Exception {
        OrderEnsurePayReq.Builder req = OrderEnsurePayReq.newBuilder();
        //订单编号
        req.setCode("OR210701511136956512");

        OrderEnsurePayResp resp = openOrderOptSdk.orderEnsurePay(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void receiveOrder() throws Exception {
        ReceiveOrderReq.Builder req = ReceiveOrderReq.newBuilder();
        //订单编号
        req.setCode("OR210701511136956512");

        ReceiveOrderResp resp = openOrderOptSdk.receiveOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void uploadPayFile() throws Exception {
        UploadPayFileReq.Builder req = UploadPayFileReq.newBuilder();
        // 订单编号
        req.setCode("OR210701511136956512");
        // 支付凭证编号
        req.addPayFileCode("");

        UploadPayFileResp resp = openOrderOptSdk.uploadPayFile(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}