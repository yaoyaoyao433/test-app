package com.sankuai.waimai.alita.platform.monitor.js;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.alita.core.dataupload.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    public ar b;
    private Gson d;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f09807db1a8775ddd53e845ede7fcc7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f09807db1a8775ddd53e845ede7fcc7e");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "280d74f17166a61115f89c658b33693f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "280d74f17166a61115f89c658b33693f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.d = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91a510aab4aedc4daeb4808e67867a3a", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91a510aab4aedc4daeb4808e67867a3a") : new GsonBuilder().create();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        this.b = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8efff68f81427c4754112d84fcb53d75", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8efff68f81427c4754112d84fcb53d75") : new ar.a().a("https://catfront.dianping.com/").a(f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(this.d)).a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a()).a();
    }
}
