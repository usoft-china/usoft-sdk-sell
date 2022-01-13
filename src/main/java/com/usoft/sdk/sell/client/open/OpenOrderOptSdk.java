package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.client.BaseSdk;
import com.usoft.sdk.sell.utils.HttpUtil;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.*;
/**
 * 订单操作服务
 *
 * @author CODE-GEN-GO
 */
public class OpenOrderOptSdk extends BaseSdk {

	public OpenOrderOptSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenOrderOptSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
     
	/**
	 * 取消订单
	 *
	 * @param req
	 * @return
	 */
	public CancelOrderResp cancelOrder(CancelOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/open/buyer/order/cancel";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		CancelOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(CancelOrderResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 订单发货
	 *
	 * @param req
	 * @return
	 */
	public DeliverOrderResp deliverOrder(DeliverOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/open/order/deliver";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		DeliverOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(DeliverOrderResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 订单收货
	 *
	 * @param req
	 * @return
	 */
	public ReceiveOrderResp receiveOrder(ReceiveOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/open/order/receive";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		ReceiveOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(ReceiveOrderResp.newBuilder(), respJson);
		return resp.build();
	}

}
