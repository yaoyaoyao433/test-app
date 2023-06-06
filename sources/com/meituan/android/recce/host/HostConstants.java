package com.meituan.android.recce.host;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HostConstants {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ErrorOrigin {
        public static final int Host = 1;
        public static final int Wasm = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ErrorCategory {
        public static final int Custom = 1;
        private static final String[] ERROR_CATEGORIES = {"jsError", "customError"};
        public static final int Panic = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        public static String getRaptorErrorCategory(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4bca95082fa8bd77a069657e2ba32b6", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4bca95082fa8bd77a069657e2ba32b6");
            }
            String[] strArr = ERROR_CATEGORIES;
            return strArr[Math.min(i, strArr.length)];
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ErrorLevel {
        public static final int Debug = 3;
        public static final int Error = 0;
        public static final int Info = 2;
        private static final String[] LEVEL_NAMES = {"error", "warn", "info", "debug"};
        public static final int Warn = 1;
        public static ChangeQuickRedirect changeQuickRedirect;

        public static String getLevelName(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11d1f65652297c3258624d0ddd0d0bc4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11d1f65652297c3258624d0ddd0d0bc4");
            }
            String[] strArr = LEVEL_NAMES;
            return strArr[Math.min(i, strArr.length)];
        }
    }
}
