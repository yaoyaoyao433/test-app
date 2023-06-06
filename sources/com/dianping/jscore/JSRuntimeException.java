package com.dianping.jscore;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class JSRuntimeException extends RuntimeException {
    protected static final String STACK_STRING = "/***StackTrace***/";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public JSRuntimeException(String str) {
        super(getStackString(str));
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dfef0013be73d4d706275f64a00df58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dfef0013be73d4d706275f64a00df58");
        }
    }

    @Keep
    private static String getStackString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "413d6158094797777740f4a1a44ebb57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "413d6158094797777740f4a1a44ebb57");
        }
        if (str == null || !str.endsWith(STACK_STRING)) {
            return str + "\n/***StackTrace***/\n\n/***StackTrace***/";
        }
        return str;
    }
}
