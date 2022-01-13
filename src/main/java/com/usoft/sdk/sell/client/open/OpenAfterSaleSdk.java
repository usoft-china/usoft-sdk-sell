package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.client.BaseSdk;
import com.usoft.sdk.sell.utils.HttpUtil;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 售后服务
 *
 * @author CODE-GEN-GO
 */
public class OpenAfterSaleSdk extends BaseSdk {

	public OpenAfterSaleSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenAfterSaleSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
     
	/**
	 * 申请售后
	 *
	 * @param req
	 * @return
	 */
	public ApplyAfterSaleResp applyAfterSale(ApplyAfterSaleReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/aftersale/apply";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		ApplyAfterSaleResp.Builder resp = ProtoBufUtil.toProtoBuf(ApplyAfterSaleResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 审核售后
	 *
	 * @param req
	 * @return
	 */
	public AuditAfterSaleResp auditAfterSale(AuditAfterSaleReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/aftersale/audit";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		AuditAfterSaleResp.Builder resp = ProtoBufUtil.toProtoBuf(AuditAfterSaleResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 查询买家售后详情
	 *
	 * @param req
	 * @return
	 */
	public GetBuyerAfterSaleDetailResp getBuyerAfterSaleDetail(GetBuyerAfterSaleDetailReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/aftersale/detail/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetBuyerAfterSaleDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetBuyerAfterSaleDetailResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 查询卖家售后详情
	 *
	 * @param req
	 * @return
	 */
	public GetSellerAfterSaleDetailResp getSellerAfterSaleDetail(GetSellerAfterSaleDetailReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/aftersale/detail/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetSellerAfterSaleDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetSellerAfterSaleDetailResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询买家售后列表
	 *
	 * @param req
	 * @return
	 */
	public PagingBuyerAfterSaleResp pagingBuyerAfterSale(PagingBuyerAfterSaleReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/aftersale/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingBuyerAfterSaleResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingBuyerAfterSaleResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询卖家售后列表
	 *
	 * @param req
	 * @return
	 */
	public PagingSellerAfterSaleResp pagingSellerAfterSale(PagingSellerAfterSaleReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/aftersale/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingSellerAfterSaleResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingSellerAfterSaleResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 卖家售后收货
	 *
	 * @param req
	 * @return
	 */
	public ReceiveGoodsAfterSaleResp receiveGoodsAfterSale(ReceiveGoodsAfterSaleReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/aftersale/goods/receive";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		ReceiveGoodsAfterSaleResp.Builder resp = ProtoBufUtil.toProtoBuf(ReceiveGoodsAfterSaleResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 买家售后退货
	 *
	 * @param req
	 * @return
	 */
	public ReturnGoodsAfterSaleResp returnGoodsAfterSale(ReturnGoodsAfterSaleReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/aftersale/goods/return";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		ReturnGoodsAfterSaleResp.Builder resp = ProtoBufUtil.toProtoBuf(ReturnGoodsAfterSaleResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
