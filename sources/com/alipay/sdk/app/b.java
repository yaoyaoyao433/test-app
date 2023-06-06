package com.alipay.sdk.app;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static final Map<String, a> a = new ConcurrentHashMap();
    public static long b = -1;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    public static void a(String str, int i, String str2, Bundle bundle) {
        if (a.remove(str) != null) {
        }
    }
}
