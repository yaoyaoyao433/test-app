package com.meituan.android.common.locate.provider;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class l {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile l e;
    private String a;
    private String b;
    private String c;
    private String d;

    public l(Context context) {
        a a;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c6489d69e379f17bf0dcc766bd04b75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c6489d69e379f17bf0dcc766bd04b75");
        } else if (context == null || (a = a.a(context)) == null) {
        } else {
            this.a = a.a;
            this.b = a.b;
            this.d = "2.34.1";
            try {
                this.c = this.d.substring(0, this.d.lastIndexOf(CommonConstant.Symbol.DOT));
            } catch (Throwable unused) {
                this.c = this.d;
            }
        }
    }

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c833c6448b88661dd77c50975566bf1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c833c6448b88661dd77c50975566bf1c");
        }
        if (e == null) {
            synchronized (l.class) {
                if (e == null) {
                    e = new l(g.a());
                }
            }
        }
        return e;
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cd0856477ab553f9fef99d25b8bfb6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cd0856477ab553f9fef99d25b8bfb6e");
        } else {
            e = new l(context);
        }
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.d;
    }
}
