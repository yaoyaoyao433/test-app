package com.meituan.android.customerservice.retrofit;

import android.content.Context;
import com.meituan.android.customerservice.utils.b;
import com.meituan.android.customerservice.utils.c;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, String str2, j jVar) {
        Object[] objArr = {context, str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e954db6f378695ba9e3355e5eb5813c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e954db6f378695ba9e3355e5eb5813c2");
            return;
        }
        c.a("queryFloatingStatus", "unionId=" + b.d() + ",appId=" + b.c() + ",visitId=" + str + ",userToken=" + str2);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("unionId", b.d());
        hashMap.put("appId", Integer.valueOf(b.c()));
        d.a(jVar, ((CSService) a(b.a(context), null, 60L).a(CSService.class)).queryCSChatStatus(str, str2, hashMap).b(rx.schedulers.a.e()).a(rx.schedulers.a.d()));
    }

    public static void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1940bd15f8722e25646dbbfabadeba4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1940bd15f8722e25646dbbfabadeba4d");
        } else {
            d.a(new j<ap>() { // from class: com.meituan.android.customerservice.retrofit.a.1
                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                }
            }, ((CSService) a("https://cscanaltics.dper.com", null, 60L).a(CSService.class)).sendCSLog(hashMap).b(rx.schedulers.a.e()));
        }
    }

    public static ar a(String str, t tVar, long j) {
        Object[] objArr = {str, tVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ab2d6ff57f4c9450e87a7f2f1723310", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ab2d6ff57f4c9450e87a7f2f1723310");
        }
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        if (tVar != null) {
            a2.g.add(tVar);
        }
        a2.u = false;
        a2.a(j, TimeUnit.SECONDS);
        a2.b(j, TimeUnit.SECONDS);
        a2.j = new com.meituan.android.customerservice.kit.utils.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(w.HTTP_1_1);
        arrayList.add(w.SPDY_3);
        arrayList.add(w.HTTP_2);
        a2.a(arrayList);
        return new ar.a().a(str).a(com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a2)).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(f.a()).a();
    }
}
