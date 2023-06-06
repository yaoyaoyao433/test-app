package com.dianping.titans.bridge;

import android.content.Context;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IBridgeConfig {
    Map<String, String> appInfoExtra();

    int catId();

    String getDeviceLevel(Context context);

    String imei(Context context);

    String innerUrlKey();

    boolean isAccessWhite(String str);

    boolean isDebug();

    boolean isSchemeInWhite(String str);

    String knbAppid();

    String mac(Context context);

    String scheme();

    String userToken();

    String wxId();
}
