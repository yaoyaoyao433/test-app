package com.alipay.sdk.app;

import com.huawei.hms.api.ConnectionResult;
import com.meituan.mtmap.rendersdk.MapConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum e {
    SUCCEEDED(ConnectionResult.NETWORK_ERROR, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PARAMS_ERROR(MapConstant.LayerPropertyFlag_MarkerSpacing, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");
    
    public int i;
    public String j;

    e(int i, String str) {
        this.i = i;
        this.j = str;
    }

    public static e a(int i) {
        if (i != 4001) {
            if (i != 5000) {
                if (i != 8000) {
                    if (i == 9000) {
                        return SUCCEEDED;
                    }
                    switch (i) {
                        case 6001:
                            return CANCELED;
                        case 6002:
                            return NETWORK_ERROR;
                        default:
                            return FAILED;
                    }
                }
                return PAY_WAITTING;
            }
            return DOUBLE_REQUEST;
        }
        return PARAMS_ERROR;
    }
}
