package com.hhmedic.android.sdk.logger;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SystemNetLog {
    public static void send(Context context, HashMap<String, Object> hashMap) {
        new HHGsonRequest(new NetLogConfig(hashMap), null).start();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class NetLogConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public int getRequestMethod() {
            return 1;
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/informationFlow/log";
        }

        NetLogConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.logger.SystemNetLog.NetLogConfig.1
            }.getType();
        }
    }
}
