package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HmsHiAnalyticsUtils {
    public static void enableLog() {
        l1.a();
    }

    public static boolean getInitFlag() {
        return j1.b();
    }

    public static void init(Context context, boolean z, boolean z2, boolean z3, String str, String str2) {
        new k1(context).a(z).c(z2).b(z3).a(0, str).a(1, str).a(str2).a();
    }

    public static void onEvent(Context context, String str, String str2) {
        j1.a(context, str, str2);
    }

    public static void onReport() {
        j1.c();
    }

    public static void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        j1.a(i, str, linkedHashMap);
    }
}
