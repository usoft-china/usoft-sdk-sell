package com.usoft.sdk.sell.client.open;

import com.usoft.sdk.sell.utils.ProtoBufUtil;
import com.usoft.sell.external.open.api.protobuf.GetMallSaleStatsReq;
import com.usoft.sell.external.open.api.protobuf.GetMallSaleStatsResp;
import org.junit.jupiter.api.Test;

/**
 * 统计服务
 *
 * @author CODE-GEN-GO
 */
public class OpenStatsGetSdkTest {
    /**
     * 测试地址
     */
    private OpenStatsGetSdk openStatsGetSdk = new OpenStatsGetSdk("https://sellrest.uuzcc.cn", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");
    
    @Test
    public void getMallSaleStats() throws Exception {
        GetMallSaleStatsReq.Builder req = GetMallSaleStatsReq.newBuilder();
        req.setStartTime("2022-10-01");

        GetMallSaleStatsResp resp = openStatsGetSdk.getMallSaleStats(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}