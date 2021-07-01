package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.client.BaseSdk;
import com.usoft.sdk.sell.utils.HttpUtil;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 订单查询服务
 *
 * @author CODE-GEN-GO
 */
public class OpenOrderGetSdk extends BaseSdk {

	public OpenOrderGetSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenOrderGetSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
    
	/**
	 * 查询买家采购订单详情
	 *
	 * @param req
	 * @return
	 */
	public GetBuyerOrderDetailResp getBuyerOrderDetail(GetBuyerOrderDetailReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/order/detail/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetBuyerOrderDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetBuyerOrderDetailResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 买家订单列表tab获取
	 *
	 * @param req
	 * @return
	 */
	public GetBuyerTabResp getBuyerTab(GetBuyerTabReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/order/tab/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetBuyerTabResp.Builder resp = ProtoBufUtil.toProtoBuf(GetBuyerTabResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 查询卖家采购订单详情
	 *
	 * @param req
	 * @return
	 */
	public GetSellerOrderDetailResp getSellerOrderDetail(GetSellerOrderDetailReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/order/detail/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetSellerOrderDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetSellerOrderDetailResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 卖家订单列表tab获取
	 *
	 * @param req
	 * @return
	 */
	public GetSellerTabResp getSellerTab(GetSellerTabReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/order/tab/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetSellerTabResp.Builder resp = ProtoBufUtil.toProtoBuf(GetSellerTabResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询买家采购订单
	 *
	 * @param req
	 * @return
	 */
	public PagingBuyerOrderResp pagingBuyerOrder(PagingBuyerOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/order/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingBuyerOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingBuyerOrderResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询卖家采购订单
	 *
	 * @param req
	 * @return
	 */
	public PagingSellerOrderResp pagingSellerOrder(PagingSellerOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/order/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingSellerOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingSellerOrderResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
