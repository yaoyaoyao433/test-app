package com.meituan.android.common.statistics.utils;

import android.content.Context;
import com.meituan.android.common.analyse.BuildConfig;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class LogUtil {
    private static boolean LOG_SWITCH = true;
    private static final String TAG_LOG = "lx_sdk";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean sLogSwitch;

    @Deprecated
    public static void d(String str, Object obj) {
    }

    @Deprecated
    public static void e(String str, Object obj, Throwable th) {
    }

    @Deprecated
    public static void i(String str, Object obj) {
    }

    public static void log(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f23df3f3c4ba90a38b7c3138fe41e36a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f23df3f3c4ba90a38b7c3138fe41e36a");
        }
    }

    @Deprecated
    public static void printDebugInfo(String str, String... strArr) {
    }

    @Deprecated
    public static void v(String str, Object obj) {
    }

    @Deprecated
    public static void w(String str, Object obj, Throwable th) {
    }

    public static void init(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "204e413266a5677f91ffde421c4cd78c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "204e413266a5677f91ffde421c4cd78c");
            return;
        }
        try {
            boolean z2 = (context.getApplicationInfo().flags & 2) != 0;
            boolean contains = BuildConfig.LX_VERSION_NAME.contains("test");
            if (!z2 && !contains) {
                z = false;
            }
            sLogSwitch = z;
        } catch (Exception unused) {
        }
    }

    public static void enable(boolean z) {
        sLogSwitch = z;
    }

    public static boolean isLogEnabled() {
        return sLogSwitch;
    }

    public static void log(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b7560a016872d2e00ac305a3e0ea8fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b7560a016872d2e00ac305a3e0ea8fb");
        } else {
            log(TAG_LOG, str);
        }
    }

    public static void reportErrorImmediateSC(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0c16c0787d6980f66a2222df8f52035", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0c16c0787d6980f66a2222df8f52035");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), "b_techportal_2i62p1hi_sc", hashMap, "c_techportal_e25gpzo9");
        } catch (Exception unused) {
        }
    }
}
