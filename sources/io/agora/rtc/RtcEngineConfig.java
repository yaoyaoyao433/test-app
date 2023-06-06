package io.agora.rtc;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RtcEngineConfig {
    public Context mContext = null;
    public IRtcEngineEventHandler mEventHandler = null;
    public String mAppId = "";
    public int mAreaCode = -1;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class AreaCode {
        public static final int AREA_CODE_AS = 8;
        public static final int AREA_CODE_CN = 1;
        public static final int AREA_CODE_EU = 4;
        public static final int AREA_CODE_GLOB = -1;
        public static final int AREA_CODE_IN = 32;
        public static final int AREA_CODE_JP = 16;
        public static final int AREA_CODE_NA = 2;
    }
}
