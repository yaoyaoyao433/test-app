package com.dianping.nvnetwork.util;

import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc50f9fa057c974950f5d7b7af4f76fc", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc50f9fa057c974950f5d7b7af4f76fc")).booleanValue() : !TextUtils.isEmpty(str) && str.startsWith(AbsApiFactory.HTTPS);
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9b2974cbf73ad8a49b3634a887e8c08", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9b2974cbf73ad8a49b3634a887e8c08")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.length() > str2.length()) {
            str = str.substring(0, str2.length());
        }
        return str.equalsIgnoreCase(str2);
    }
}
