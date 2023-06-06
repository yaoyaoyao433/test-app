package com.meituan.android.common.mtguard.collect;

import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cad11029fac30ba2d7df5d5876ef2253", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cad11029fac30ba2d7df5d5876ef2253");
        }
        try {
            Class<?> cls = Class.forName(str);
            String str2 = (String) cls.getMethod("getActivityReferrer", new Class[0]).invoke(cls, new Object[0]);
            MTGuardLog.setLogan("referrer: ".concat(String.valueOf(str2)));
            return str2;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3120399f1df04c74883c50899a39d98", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3120399f1df04c74883c50899a39d98");
        }
        try {
            Class<?> cls = Class.forName(str);
            String str2 = (String) cls.getMethod("getActivityLch", new Class[0]).invoke(cls, new Object[0]);
            MTGuardLog.setLogan("lch: ".concat(String.valueOf(str2)));
            return str2;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }
}
