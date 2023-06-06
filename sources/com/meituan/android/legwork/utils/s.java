package com.meituan.android.legwork.utils;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1cfbf9e29e0e5d99a45c3a10bdae672", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1cfbf9e29e0e5d99a45c3a10bdae672");
        }
        try {
            Uri parse = Uri.parse(str2);
            return Uri.parse(str).buildUpon().scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).build().toString();
        } catch (Exception e) {
            x.e("NetUtil.replaceDomain()", "exception msg:", e);
            x.a(e);
            return str;
        }
    }
}
