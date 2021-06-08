package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.client.BaseSdk;
import com.usoft.sell.external.open.api.protobuf.*;
import com.usoft.sdk.sell.utils.HttpUtil;
import com.usoft.sdk.sell.utils.ProtoBufUtil;

import java.util.Map;

/**
 * @author open
 * @date 2020/5/27 16:32
 */
public class OpenProductSdk extends BaseSdk {

	public OpenProductSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenProductSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}

	/**
	 * 新增或修改产品
	 *
	 * @param req
	 * @return
	 */
	public CreateOrUpdateProductResp createOrUpdateProduct(CreateOrUpdateProductReq.Builder req) throws Exception {
		String url = baseUrl + "/open/product/createorupdate";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		CreateOrUpdateProductResp.Builder resp = ProtoBufUtil.toProtoBuf(CreateOrUpdateProductResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 分页查询产品
	 *
	 * @param req
	 * @return
	 */
	public PagingProductResp pagingProduct(PagingProductReq.Builder req) throws Exception {
		String url = baseUrl + "/open/product/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingProductResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingProductResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 获取产品
	 *
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public GetProductResp getProduct(GetProductReq.Builder req) throws Exception {
		String url = baseUrl + "/open/product/detail/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetProductResp.Builder resp = ProtoBufUtil.toProtoBuf(GetProductResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 批量删除产品
	 *
	 * @param req
	 * @return
	 */
	public BatchDeleteProductResp batchDeleteProduct(BatchDeleteProductReq.Builder req) throws Exception {
		String url = baseUrl + "/open/product/delete/batch";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		BatchDeleteProductResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchDeleteProductResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 批量上架产品
	 *
	 * @param req
	 * @return
	 */
	public BatchReleaseProductResp batchReleaseProduct(BatchReleaseProductReq.Builder req) throws Exception {
		String url = baseUrl + "/open/product/release/batch";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		BatchReleaseProductResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchReleaseProductResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 批量下架产品
	 *
	 * @param req
	 * @return
	 */
	public BatchRevokeProductResp batchRevokeProduct(BatchRevokeProductReq.Builder req) throws Exception {
		String url = baseUrl + "/open/product/revoke/batch";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		BatchRevokeProductResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchRevokeProductResp.newBuilder(), respJson);
		return resp.build();
	}
}