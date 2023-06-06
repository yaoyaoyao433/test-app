package com.meituan.android.mrn.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "097ef2cb921f7bdb094e70c462e45e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "097ef2cb921f7bdb094e70c462e45e4b");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("./")) {
            return str.substring(2);
        }
        if (str.startsWith("../")) {
            return str.substring(3);
        }
        return str.startsWith("/") ? str.substring(1) : str;
    }
}
