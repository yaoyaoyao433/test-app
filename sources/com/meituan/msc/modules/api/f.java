package com.meituan.msc.modules.api;

import com.meituan.msc.common.utils.ab;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.page.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "PageApi")
/* loaded from: classes3.dex */
public class f extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod(isSync = false)
    public void customReport(JSONObject jSONObject, int i) {
        com.meituan.msc.modules.page.render.a l;
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4852ffed6049fd3f91ce43ad5dab3d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4852ffed6049fd3f91ce43ad5dab3d64");
            return;
        }
        Object[] objArr2 = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c8e5da2b79c4c945a851c60ecafaf59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c8e5da2b79c4c945a851c60ecafaf59");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("PageApi", "reportRouteSucceed", jSONObject, U_());
        com.meituan.msc.modules.page.e g = g(i);
        if (jSONObject == null || g == null || (l = g.l()) == null) {
            q a2 = q.a(U_());
            Object[] objArr3 = {jSONObject, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = q.d;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "73c91183536253b3dfd2eb1cffcdc3db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "73c91183536253b3dfd2eb1cffcdc3db");
                return;
            } else {
                a2.b("msc.page.route.exception.count").a(ab.a(jSONObject)).a("viewId", Integer.valueOf(i)).a("routeExceptCount", (Object) (-1)).c();
                return;
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("reportRouteSuccess");
        Object[] objArr4 = {optJSONObject};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.page.render.a.d;
        if (PatchProxy.isSupport(objArr4, l, changeQuickRedirect4, false, "1680fb2ce02fcb575039519d0162b44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, l, changeQuickRedirect4, false, "1680fb2ce02fcb575039519d0162b44e");
            return;
        }
        l.b("msc.page.route.end.count").a(1.0d).a(ab.a(optJSONObject)).c();
        com.meituan.msc.modules.reporter.g.d("MSCReporter", "reportRouteSucceed routeExceptCount", Integer.valueOf(q.e.decrementAndGet()), l.h, optJSONObject);
    }

    @MSCMethod(isSync = true)
    public void pageNotFoundCallback(String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad516d3fadb0ecda69d4f80d7891083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad516d3fadb0ecda69d4f80d7891083");
        } else {
            com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.api.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    com.meituan.msc.modules.page.c d;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bc12a7794d7d29d04c063fce1865c59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bc12a7794d7d29d04c063fce1865c59");
                        return;
                    }
                    com.meituan.msc.modules.container.q b = f.this.U_().b();
                    if (b == null || (d = b.d(i)) == null) {
                        return;
                    }
                    d.a();
                }
            });
        }
    }
}
