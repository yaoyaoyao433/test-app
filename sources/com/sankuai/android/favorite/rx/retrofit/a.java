package com.sankuai.android.favorite.rx.retrofit;

import android.content.Context;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    public ar b;

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd08009df81d8c974a2ac41b2835cfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd08009df81d8c974a2ac41b2835cfa");
        } else {
            this.b = new ar.a().a("http://apimobile.meituan.com/").a(i.a("oknv")).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(f.a()).a();
        }
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f818b714c2c7a758e7d25b0bae66f690", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f818b714c2c7a758e7d25b0bae66f690");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a(context);
                }
            }
        }
        return c;
    }

    public String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5c02ed886d74fd1f10498b1981b8f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5c02ed886d74fd1f10498b1981b8f9");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        return sb.substring(0, sb.length() - 1);
    }
}
