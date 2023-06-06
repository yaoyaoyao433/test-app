package com.meituan.android.common.weaver.impl.utils;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.natives.GridsChecker;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Logger {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Logger sEmpty = new Logger();
    public static Logger sLogger;

    public void afterOnePiece(@NonNull GridsChecker gridsChecker) {
    }

    public void d(String str) {
    }

    public void d(Object... objArr) {
    }

    public void df(String str, Object... objArr) {
    }

    public void update18Grids(int i, int i2, int i3, int i4) {
    }

    @NonNull
    public static Logger getLogger() {
        Logger logger = sLogger;
        return logger == null ? sEmpty : logger;
    }
}
