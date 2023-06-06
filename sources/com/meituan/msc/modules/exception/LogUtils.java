package com.meituan.msc.modules.exception;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class LogUtils {
    private static ExecutorService a = com.sankuai.android.jarvis.c.a("reportLog");

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LEVEL {
    }
}
