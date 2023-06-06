package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class v {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    public v(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ab94e054289041a8756744383bc32b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ab94e054289041a8756744383bc32b");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9659a17d2edf6c935292cc54e3a871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9659a17d2edf6c935292cc54e3a871");
        } else {
            u.a(this.b, d(str));
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b787a802bc133ac34fcabec8c8ae0a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b787a802bc133ac34fcabec8c8ae0a2");
        } else {
            u.b(this.b, d(str));
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7900a9c9fafcb5a8d676e747ee6b97f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7900a9c9fafcb5a8d676e747ee6b97f5");
        } else {
            u.c(this.b, d(str));
        }
    }

    public final void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7eb40e61d5ab7e9dd13386731cc3777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7eb40e61d5ab7e9dd13386731cc3777");
        } else {
            u.a(this.b, d(str), th);
        }
    }

    public final void b(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d53d186b4bf0de4fdc1a1aec278e30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d53d186b4bf0de4fdc1a1aec278e30f");
        } else {
            u.b(this.b, d(str), th);
        }
    }

    private String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d21ac2828daa3124a433380126474899", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d21ac2828daa3124a433380126474899");
        }
        return "[" + this.c + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str;
    }
}
