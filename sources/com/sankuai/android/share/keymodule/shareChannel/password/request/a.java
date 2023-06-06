package com.sankuai.android.share.keymodule.shareChannel.password.request;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.util.c;
import com.sankuai.android.share.util.f;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.v;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public ar b;
    public Context c;

    private a(Context context) {
        a.InterfaceC0637a a2;
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46aa84defe439938799b9ba62c482676", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46aa84defe439938799b9ba62c482676");
        } else if (context == null) {
        } else {
            this.c = context;
            if (!TextUtils.equals(context.getPackageName(), "com.sankuai.meituan")) {
                v vVar = new v();
                OkHttp2Wrapper.addInterceptorToClient(vVar);
                a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(b.a(vVar));
            } else {
                a2 = f.a();
            }
            ar.a a3 = new ar.a().a(a2).a(com.sankuai.meituan.retrofit2.converter.gson.a.a());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d511795b98817c30020a494747fb68a", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d511795b98817c30020a494747fb68a");
            } else if (com.sankuai.android.share.constant.a.a() == 2) {
                c.a("口令请求test环境");
                str = "http://mf.travel.test.meituan.com";
            } else {
                c.a("口令请求prod环境");
                str = "https://i.meituan.com";
            }
            this.b = a3.a(str).a();
        }
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df7b8c9712d377ed7322315f07b03d55", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df7b8c9712d377ed7322315f07b03d55") : new a(context);
    }
}
