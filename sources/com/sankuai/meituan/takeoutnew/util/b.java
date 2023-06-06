package com.sankuai.meituan.takeoutnew.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.waimai.foundation.utils.af;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static String c = "wm_external_jump";
    public static a[] d = {new a("market.waimai.meituan.com", new String[]{"gd", "gd2"}), new a("market.waimai.test.sankuai.com", new String[]{"gd", "gd2"}), new a("market.waimai.st.sankuai.com", new String[]{"gd", "gd2"})};

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public String[] b;

        public a(String str, String[] strArr) {
            this.a = str;
            this.b = strArr;
        }
    }

    public static boolean a() {
        return b;
    }

    public static void a(boolean z) {
        b = z;
    }

    public static Uri a(Uri uri) {
        String b2;
        a[] aVarArr;
        boolean z;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b363eb64f9dcfebfea13fd72280e617b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b363eb64f9dcfebfea13fd72280e617b");
        }
        if (WaimaiSP.e() && uri != null && uri.isHierarchical() && "/browser".equals(uri.getPath())) {
            try {
                b2 = af.b(uri, "inner_url", "");
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.b("appendJumpParamUri", th);
            }
            if (TextUtils.isEmpty(b2)) {
                return uri;
            }
            Uri parse = Uri.parse(b2);
            if (parse.isHierarchical()) {
                Uri.Builder buildUpon = parse.buildUpon();
                boolean isEmpty = TextUtils.isEmpty(parse.getQueryParameter(c));
                String host = parse.getHost();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(path)) {
                    for (a aVar : d) {
                        if (host.equals(aVar.a)) {
                            String[] strArr = aVar.b;
                            Object[] objArr2 = {path, strArr};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8fc7432695b558e970f6f71fc4a52f24", RobustBitConfig.DEFAULT_VALUE)) {
                                if (!com.sankuai.waimai.foundation.utils.b.a(strArr)) {
                                    for (String str : strArr) {
                                        if (TextUtils.isEmpty(str) || !path.contains(str)) {
                                        }
                                    }
                                    z = false;
                                }
                                z = true;
                                break;
                            } else {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8fc7432695b558e970f6f71fc4a52f24")).booleanValue();
                            }
                            if (z && isEmpty) {
                                return af.c(uri, "inner_url", buildUpon.appendQueryParameter(c, "1").build().toString());
                            }
                        }
                    }
                }
                return uri;
            }
            return uri;
        }
        return uri;
    }
}
