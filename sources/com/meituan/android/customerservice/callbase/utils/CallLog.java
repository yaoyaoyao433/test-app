package com.meituan.android.customerservice.callbase.utils;

import com.meituan.android.log.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallLog extends a {
    public static final String TAG = "cs_call.";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void verbose(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f4a8782da478b7504a36a6188f1d885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f4a8782da478b7504a36a6188f1d885");
            return;
        }
        a.v(TAG + str, str2);
    }

    public static void verbose(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "309de97121da7b51d25b1064fcfafff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "309de97121da7b51d25b1064fcfafff2");
        } else {
            verbose(cls.getSimpleName(), str);
        }
    }

    public static void log(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bc3f7051048ad177bbf77af89978ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1bc3f7051048ad177bbf77af89978ec5");
            return;
        }
        a.i(TAG + str, str2);
    }

    public static void log(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "723f611d62fee934021cb006f219c519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "723f611d62fee934021cb006f219c519");
        } else {
            log(cls.getSimpleName(), str);
        }
    }

    public static void debug(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f1285ae2f54096f67b804e94509a531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f1285ae2f54096f67b804e94509a531");
            return;
        }
        a.d(TAG + str, str2);
    }

    public static void debug(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9e174f6a13d5576d8165dc1e6aaf7d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9e174f6a13d5576d8165dc1e6aaf7d4");
        } else {
            debug(cls.getSimpleName(), str);
        }
    }

    public static void error(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7db01df840082f0c51c681c45a90705a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7db01df840082f0c51c681c45a90705a");
            return;
        }
        a.e(TAG + str, str2);
    }

    public static void error(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41325207443d812bff4d6b56d16c58c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41325207443d812bff4d6b56d16c58c5");
        } else {
            error(cls.getSimpleName(), str);
        }
    }

    public static void warn(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa505d97165085e1d38328a546182367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa505d97165085e1d38328a546182367");
            return;
        }
        a.w(TAG + str, str2);
    }

    public static void warn(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bdbeb74a9b2b8984900d06f74d5a3d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bdbeb74a9b2b8984900d06f74d5a3d8b");
        } else {
            warn(cls.getSimpleName(), str);
        }
    }
}
