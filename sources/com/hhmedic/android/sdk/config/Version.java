package com.hhmedic.android.sdk.config;

import android.text.TextUtils;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Version implements Serializable {
    private static String APP_VERSION = "6.4.0";

    public static String getVersion() {
        if (TextUtils.isEmpty(APP_VERSION)) {
            APP_VERSION = HHConfig.APP_VERSION;
        }
        return APP_VERSION;
    }
}
