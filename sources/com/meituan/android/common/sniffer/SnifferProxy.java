package com.meituan.android.common.sniffer;

import android.content.Context;
import com.meituan.android.common.babel.Babel;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class SnifferProxy implements ISnifferM {
    private static final String SNIFFER = "sniffer";
    private static final String SNIFFER_BABEL_TOKEN = "5950cabfec1c0d24761bf346";
    public static volatile ISnifferM sniffer = new DefaultSnifferImpl();
    private static final SnifferProxy sInstance = new SnifferProxy();
    private static volatile boolean isInit = false;

    private SnifferProxy() {
    }

    public static ISniffer getSniffer() {
        return sInstance;
    }

    public static ISnifferM getSnifferM() {
        return sInstance;
    }

    public static void init(Context context) {
        if (isInit) {
            return;
        }
        isInit = true;
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        ContextHolder.getInstance().updateContext(context);
        Babel.initSDK(context, "sniffer", SNIFFER_BABEL_TOKEN);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void normal(String str, String str2, String str3) {
        normal(str, str2, str3, (String) null);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void normal(String str, String str2, String str3, String str4) {
        normal(str, str2, str3, str4, 1L);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, long j) {
        normal(str, str2, str3, null, 1L);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, String str4, long j) {
        normal(str, str2, str3, str4, 1L, null);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, String str4, long j, Map<String, String> map) {
        normal(str, str2, "", str3, str4, j, map);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        if (sniffer != null) {
            sniffer.normal(str, str2, str3, str4, str5, j, map);
        }
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void smell(String str, String str2, String str3) {
        smell(str, str2, str3, null);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void smell(String str, String str2, String str3, String str4) {
        smell(str, str2, str3, str4, null);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void smell(String str, String str2, String str3, String str4, String str5) {
        smell(str, str2, str3, str4, str5, 1L);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void smell(String str, String str2, String str3, String str4, String str5, long j) {
        smell(str, str2, str3, str4, str5, 1L, null);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void smell(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        smell(str, str2, "", str3, str4, str5, j, map);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void smell(String str, String str2, String str3, String str4, String str5, String str6, long j, Map<String, String> map) {
        if (sniffer != null) {
            sniffer.smell(str, str2, str3, str4, str5, str6, j, map);
        }
    }
}
