package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.client.BaseSdk;
import com.usoft.sdk.sell.utils.HttpUtil;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.GetMallSaleStatsReq;
import com.usoft.sell.external.open.api.protobuf.GetMallSaleStatsResp;

import java.util.Map;

/**
 * 统计服务
 *
 * @author CODE-GEN-GO
 */
public class OpenStatsGetSdk extends BaseSdk {

	public OpenStatsGetSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenStatsGetSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
    
	/**
	 * 查询商城销售统计
	 *
	 * @param req
	 * @return
	 */
	public GetMallSaleStatsResp getMallSaleStats(GetMallSaleStatsReq.Builder req) throws Exception {
		String url = baseUrl + "/open/mall/stats/sale/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetMallSaleStatsResp.Builder resp = ProtoBufUtil.toProtoBuf(GetMallSaleStatsResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
