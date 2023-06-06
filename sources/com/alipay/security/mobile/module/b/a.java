package com.alipay.security.mobile.module.b;

import android.content.Context;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static a a = new a();

    public static a a() {
        return a;
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION;
        }
    }
}
