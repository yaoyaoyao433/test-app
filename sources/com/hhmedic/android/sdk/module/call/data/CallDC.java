package com.hhmedic.android.sdk.module.call.data;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.module.call.data.entity.Call;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallDC extends HHDataController<Call> {
    private static final String KEY_DEPT_ID = "deptId";
    private static final String KEY_ORDER_ID = "orderId";
    private static final String KEY_SUPPORT_QUEUE = "isSupportQueue";

    public CallDC(Context context) {
        super(context);
    }

    public static CallConfig create(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return CallConfig.create(Maps.of(KEY_DEPT_ID, str, "orderId", str2, KEY_SUPPORT_QUEUE, Boolean.TRUE));
    }

    public static CallConfig create(int i, boolean z, long j) {
        if (z) {
            return CallConfig.create(Maps.of(KEY_DEPT_ID, Integer.valueOf(i), "orderType", "many_video", "realPatientUuid", Long.valueOf(j)));
        }
        return CallConfig.create(Maps.of(KEY_DEPT_ID, Integer.valueOf(i), KEY_SUPPORT_QUEUE, Boolean.TRUE));
    }

    public static CallConfig create(long j) {
        return CallConfig.create(Maps.of("memberUuid", Long.valueOf(j), KEY_SUPPORT_QUEUE, Boolean.TRUE));
    }

    public static CallConfig create(String str) {
        return CallConfig.create(Maps.of("memberUserToken", str, KEY_SUPPORT_QUEUE, Boolean.TRUE));
    }

    public static CallConfig createForType(int i) {
        return CallConfig.create(Maps.of(KEY_DEPT_ID, Integer.valueOf(i), KEY_SUPPORT_QUEUE, Boolean.TRUE));
    }

    public void call(CallConfig callConfig, HHDataControllerListener hHDataControllerListener) {
        request(callConfig, hHDataControllerListener);
    }

    public boolean haveData() {
        return (this.mData == 0 || ((Call) this.mData).doctor == null) ? false : true;
    }

    public boolean isLimit() {
        return (this.mData == 0 || TextUtils.isEmpty(((Call) this.mData).pushFlowUrl)) ? false : true;
    }

    public boolean isAppointBusy() {
        return (haveData() || this.mData == 0 || TextUtils.isEmpty(((Call) this.mData).appoint)) ? false : true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CallConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/order/create";
        }

        CallConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<Call>>() { // from class: com.hhmedic.android.sdk.module.call.data.CallDC.CallConfig.1
            }.getType();
        }

        public static CallConfig create(HashMap<String, Object> hashMap) {
            if (hashMap != null && !TextUtils.isEmpty(HHConfig.getExtString())) {
                hashMap.put("ext", HHConfig.getExtString());
            }
            return new CallConfig(hashMap);
        }
    }
}
