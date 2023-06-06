package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Log {
    private static final String KEY_ORDER_ID = "orderId";
    private static final String KEY_ORDER_STATUS = "orderStatus";

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LogStatus {
        public static final String AUDIO_RECORDER_OPEN_ERROR = "audio_recorder_open_error";
        public static final String AUTH = "auth_exception";
        public static final String CONNECTED = "channel_connect";
        public static final String VIDEO = "video_draw";
        public static final String VIDEO_RECORD = "video_record";
    }

    public static void sendVideoRecord(Context context, String str, HashMap<String, Object> hashMap) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new HHGsonRequest(new LogConfig(Maps.of("orderId", str, KEY_ORDER_STATUS, LogStatus.VIDEO_RECORD), hashMap), null).start();
    }

    public static void sendLog(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "0";
        }
        new HHGsonRequest(new LogConfig(Maps.of("orderId", str, KEY_ORDER_STATUS, str2, RemoteMessageConst.Notification.CHANNEL_ID, str3)), null).start();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class LogConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/order/log";
        }

        LogConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        LogConfig(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
            super(hashMap, hashMap2);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.module.video.data.Log.LogConfig.1
            }.getType();
        }
    }
}
