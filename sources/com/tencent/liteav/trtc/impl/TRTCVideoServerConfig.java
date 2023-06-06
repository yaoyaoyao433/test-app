package com.tencent.liteav.trtc.impl;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TRTCVideoServerConfig {
    private static final String KEY_ENABLE_DEC_VUI = "enable_hw_vui";
    private static final String VIDEO_SERVER_CONFIG = "trtc_video_server_config";
    public boolean enableHWVUI = true;

    public String toString() {
        return "enableHWVUI: " + this.enableHWVUI;
    }

    public static void saveToSharedPreferences(Context context, TRTCVideoServerConfig tRTCVideoServerConfig) {
        synchronized (TRTCVideoServerConfig.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences(VIDEO_SERVER_CONFIG, 0).edit();
            edit.putBoolean(KEY_ENABLE_DEC_VUI, tRTCVideoServerConfig.enableHWVUI);
            edit.apply();
        }
    }

    public static TRTCVideoServerConfig loadFromSharedPreferences(Context context) {
        TRTCVideoServerConfig tRTCVideoServerConfig;
        synchronized (TRTCVideoServerConfig.class) {
            tRTCVideoServerConfig = new TRTCVideoServerConfig();
            tRTCVideoServerConfig.enableHWVUI = context.getSharedPreferences(VIDEO_SERVER_CONFIG, 0).getBoolean(KEY_ENABLE_DEC_VUI, true);
        }
        return tRTCVideoServerConfig;
    }
}
