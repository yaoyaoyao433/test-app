package com.meituan.robust.assistant;

import com.meituan.android.common.tcreporter.CrashInfo;
import com.meituan.android.common.tcreporter.RCReporter;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThrowableReporter {
    public static final String REPORTER_TOKEN = "58802eca9c5c6168cb478dfb";

    public static void report(Throwable th) {
        try {
            RCReporter.sdkReport(th, CrashInfo.newSDKCrashInfo(REPORTER_TOKEN, "0.8.28"));
        } catch (Throwable unused) {
        }
    }

    public static void report(Throwable th, Map<String, Object> map) {
        try {
            RCReporter.sdkReport(th, CrashInfo.newSDKCrashInfo(REPORTER_TOKEN, "0.8.28", map));
        } catch (Throwable unused) {
        }
    }
}
