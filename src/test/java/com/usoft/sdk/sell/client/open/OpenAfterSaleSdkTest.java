package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.*;
import org.junit.jupiter.api.Test;

/**
 * 售后服务
 *
 * @author CODE-GEN-GO
 */
public class OpenAfterSaleSdkTest {
    /**
     * 测试地址
     */
    private OpenAfterSaleSdk openAfterSaleSdk = new OpenAfterSaleSdk("https://sellrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");
    
    @Test
    public void applyAfterSale() throws Exception {
        ApplyAfterSaleReq.Builder req = ApplyAfterSaleReq.newBuilder();
        //售后类型 10：仅退款 20：退货退款
        req.setCategory(0);
        //货物状态 10：未收到货 20：已收到货
        req.setGoodsStatus(0);
        //退款金额
        req.setAmount(0);
        //退款原因
        req.setReturnReason("");
        //退款说明
        req.setReturnRemark("");
        //图片文件编号
        req.addImageFileCode("");
        //订单产品编号
        req.setOrderProductCode("");
        //申请人uu
        req.setApplyUu(0);

        ApplyAfterSaleResp resp = openAfterSaleSdk.applyAfterSale(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void auditAfterSale() throws Exception {
        AuditAfterSaleReq.Builder req = AuditAfterSaleReq.newBuilder();
        // 售后编号
        req.setCode("");
        //审核状态 10：同意 20：拒绝
        req.setAuditStatus(0);
        //拒绝原因
        req.setRejectReason("");
        //审核人uu
        req.setAuditUu(0);

        AuditAfterSaleResp resp = openAfterSaleSdk.auditAfterSale(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getBuyerAfterSaleDetail() throws Exception {
        GetBuyerAfterSaleDetailReq.Builder req = GetBuyerAfterSaleDetailReq.newBuilder();
        // 售后编号
        req.setCode("AF220111188175686101");

        GetBuyerAfterSaleDetailResp resp = openAfterSaleSdk.getBuyerAfterSaleDetail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getSellerAfterSaleDetail() throws Exception {
        GetSellerAfterSaleDetailReq.Builder req = GetSellerAfterSaleDetailReq.newBuilder();
        // 售后编号
        req.setCode("AF220111188175686101");

        GetSellerAfterSaleDetailResp resp = openAfterSaleSdk.getSellerAfterSaleDetail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void pagingBuyerAfterSale() throws Exception {
        PagingBuyerAfterSaleReq.Builder req = PagingBuyerAfterSaleReq.newBuilder();
        // 每页条数
        req.setPageSize(0);
        // 当前页码
        req.setPageNumber(0);
        //关键词（商品标题/订单号）
        req.setKeywords("AF220111188175686101");
        //企业enuu
        req.setEnuu(0);
        // 个人uu
        req.setUu(0);

        PagingBuyerAfterSaleResp resp = openAfterSaleSdk.pagingBuyerAfterSale(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void pagingSellerAfterSale() throws Exception {
        PagingSellerAfterSaleReq.Builder req = PagingSellerAfterSaleReq.newBuilder();
        // 每页条数
        req.setPageSize(0);
        // 当前页码
        req.setPageNumber(0);
        //关键词（商品标题/订单号）
        req.setKeywords("");
        //售后类型 10：仅退款 20：退货退款
        req.setCategory(0);
        //企业enuu
        req.setEnuu(0);

        PagingSellerAfterSaleResp resp = openAfterSaleSdk.pagingSellerAfterSale(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void receiveGoodsAfterSale() throws Exception {
        ReceiveGoodsAfterSaleReq.Builder req = ReceiveGoodsAfterSaleReq.newBuilder();
        // 售后编号
        req.setCode("");

        ReceiveGoodsAfterSaleResp resp = openAfterSaleSdk.receiveGoodsAfterSale(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void returnGoodsAfterSale() throws Exception {
        ReturnGoodsAfterSaleReq.Builder req = ReturnGoodsAfterSaleReq.newBuilder();
        // 售后编号
        req.setCode("");
        //物流公司
        req.setExpressInc("");
        //物流单号
        req.setExpressCode("");

        ReturnGoodsAfterSaleResp resp = openAfterSaleSdk.returnGoodsAfterSale(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}