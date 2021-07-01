package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.client.BaseSdk;
import com.usoft.sdk.sell.utils.HttpUtil;
import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 商家服务
 *
 * @author CODE-GEN-GO
 */
public class OpenSellerSdk extends BaseSdk {

	public OpenSellerSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenSellerSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
     
	/**
	 * 新增或修改商家广告信息
	 *
	 * @param req
	 * @return
	 */
	public CreateOrModifySellerAdvertResp createOrModifySellerAdvert(CreateOrModifySellerAdvertReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/advert/save";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		CreateOrModifySellerAdvertResp.Builder resp = ProtoBufUtil.toProtoBuf(CreateOrModifySellerAdvertResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 删除商家广告信息
	 *
	 * @param req
	 * @return
	 */
	public DeleteSellerAdvertResp deleteSellerAdvert(DeleteSellerAdvertReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/advert/delete";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		DeleteSellerAdvertResp.Builder resp = ProtoBufUtil.toProtoBuf(DeleteSellerAdvertResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 查询商家信息
	 *
	 * @param req
	 * @return
	 */
	public GetSellerResp getSeller(GetSellerReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetSellerResp.Builder resp = ProtoBufUtil.toProtoBuf(GetSellerResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 查询商家广告列表信息
	 *
	 * @param req
	 * @return
	 */
	public GetSellerAdvertListResp getSellerAdvertList(GetSellerAdvertListReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/advert/list/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetSellerAdvertListResp.Builder resp = ProtoBufUtil.toProtoBuf(GetSellerAdvertListResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询商家信息
	 *
	 * @param req
	 * @return
	 */
	public PagingSellerResp pagingSeller(PagingSellerReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingSellerResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingSellerResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 保存商家信息
	 *
	 * @param req
	 * @return
	 */
	public SaveSellerResp saveSeller(SaveSellerReq.Builder req) throws Exception {
		String url = baseUrl + "/open/seller/save";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		SaveSellerResp.Builder resp = ProtoBufUtil.toProtoBuf(SaveSellerResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
