package com.meituan.android.yoda.help;

import android.os.Bundle;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), 108};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3a168c67f6ced8218e150aeda227cce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3a168c67f6ced8218e150aeda227cce");
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                return "http://verify.inf.test.meituan.com/feedback/face/#/";
            default:
                return "https://verify.meituan.com/feedback/face/#/";
        }
    }

    public static Bundle a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bea341ba41b8cd8bd398ea045332e09", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bea341ba41b8cd8bd398ea045332e09");
        }
        String d = x.d(str + "?requestCode=" + str2);
        Bundle bundle = new Bundle();
        bundle.putString("wenview_url", d);
        return bundle;
    }
}
