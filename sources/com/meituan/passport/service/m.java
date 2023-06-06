package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.handler.a;
import com.meituan.passport.handler.resume.g;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m extends ag<com.meituan.passport.pojo.request.d, User> implements g.a {
    public static ChangeQuickRedirect a;
    String b;
    String c;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e731b04b90d649029acdf31aa67b40a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e731b04b90d649029acdf31aa67b40a");
            return;
        }
        FragmentActivity c = c();
        com.meituan.passport.converter.m mVar = this.f;
        if (c == null || this.e == 0) {
            return;
        }
        com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.h(c, this.f, this.h, ((com.meituan.passport.pojo.request.d) this.e).j, this.b, this.c, ((com.meituan.passport.pojo.request.d) this.e).e())).a(new com.meituan.passport.handler.resume.i(c, ((com.meituan.passport.pojo.request.d) this.e).j.b().number, 700, this.b, this.c, ((com.meituan.passport.pojo.request.d) this.e).e())).a(new com.meituan.passport.handler.resume.g(c, this, this.c, ((com.meituan.passport.pojo.request.d) this.e).e())).a(new com.meituan.passport.handler.resume.d(c, this.c, mVar, ((com.meituan.passport.pojo.request.d) this.e).e())).a(new com.meituan.passport.handler.resume.j(c, this.f, this.h, this.c, ((com.meituan.passport.pojo.request.d) this.e).e())).b;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0935131389a54f4705a582b5d4bcb1ae", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0935131389a54f4705a582b5d4bcb1ae") : new n(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.h = bVar;
        a3.g = b(c);
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        a4.c = mVar;
        a4.b();
    }

    public static /* synthetic */ rx.d a(m mVar, String str, String str2) {
        Object[] objArr = {mVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94a6d13f0be8abadbf3f795770be5acc", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94a6d13f0be8abadbf3f795770be5acc") : com.meituan.passport.utils.s.a().bindmobilelogin(((com.meituan.passport.pojo.request.d) mVar.e).c(), 1, 0, str, str2);
    }

    public static /* synthetic */ rx.d a(m mVar, Integer num) {
        Object[] objArr = {mVar, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a5d470514eafa7364bb37ad48525d72", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a5d470514eafa7364bb37ad48525d72");
        }
        ((com.meituan.passport.pojo.request.d) mVar.e).a("confirm", com.meituan.passport.clickaction.d.a(Integer.toString(num.intValue())));
        Object[] objArr2 = {mVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = p.a;
        return com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1cf6bf8117383067ed13ac7b7704c5c5", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1cf6bf8117383067ed13ac7b7704c5c5") : new p(mVar, num));
    }

    public static /* synthetic */ rx.d a(m mVar, Integer num, String str, String str2) {
        Object[] objArr = {mVar, num, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a80f4476b7044e32b06b7c961c62940", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a80f4476b7044e32b06b7c961c62940") : com.meituan.passport.utils.s.a().bindmobilelogin(((com.meituan.passport.pojo.request.d) mVar.e).c(), 1, num.intValue(), str, str2);
    }

    @Override // com.meituan.passport.handler.resume.g.a
    public final rx.d<User> a(rx.d<Integer> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e545f1c8c637fc3f31c8aa6998e93baf", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e545f1c8c637fc3f31c8aa6998e93baf");
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        return dVar.h(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a30339f2949d0a8c696c4d226b9ef39d", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.g) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a30339f2949d0a8c696c4d226b9ef39d") : new o(this));
    }
}
