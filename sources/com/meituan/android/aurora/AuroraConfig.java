package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AuroraConfig {
    public static final String CHANNEL = "aurora_channel";
    public static final String MAIN_LOOPER_KEY = "mainlooper";
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean isEnableMainLooper() {
        return false;
    }
}
