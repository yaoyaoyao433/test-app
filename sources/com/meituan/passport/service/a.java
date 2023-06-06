package com.meituan.passport.service;

import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.UserCenter;
import com.meituan.passport.handler.a;
import com.meituan.passport.handler.resume.l;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a extends ag<com.meituan.passport.pojo.request.a, User> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca31c043260d34cad43052b3648b601c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca31c043260d34cad43052b3648b601c");
            return;
        }
        FragmentActivity c = c();
        if (c == null || this.e == 0) {
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.l(c, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "74f60894c92442afbf7cb62f0c3a8381", RobustBitConfig.DEFAULT_VALUE) ? (l.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "74f60894c92442afbf7cb62f0c3a8381") : new b(this), UserCenter.OAUTH_TYPE_ACCOUNT, "login")).a(new com.meituan.passport.handler.resume.h(c, this.f, this.h, ((com.meituan.passport.pojo.request.a) this.e).b, "", UserCenter.OAUTH_TYPE_ACCOUNT, "login")).a(new com.meituan.passport.handler.resume.i(c, ((com.meituan.passport.pojo.request.a) this.e).b.b().number, 100, "", UserCenter.OAUTH_TYPE_ACCOUNT, "login")).a(new com.meituan.passport.handler.resume.d(c, ((com.meituan.passport.pojo.request.a) this.e).b.b().number, ((com.meituan.passport.pojo.request.a) this.e).b.b().countryCode, UserCenter.OAUTH_TYPE_ACCOUNT, this.f, "login")).a(new com.meituan.passport.handler.resume.j(c, this.f, this.h, UserCenter.OAUTH_TYPE_ACCOUNT, "login")).a(new com.meituan.passport.handler.resume.a(c, UserCenter.OAUTH_TYPE_ACCOUNT)).b;
        com.meituan.passport.converter.m mVar = this.f;
        if (mVar == null) {
            mVar = new com.meituan.passport.successcallback.a(c);
            this.f = mVar;
        }
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4da898d67344377be07ebac1be84a9f1", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4da898d67344377be07ebac1be84a9f1") : new c(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.h = bVar;
        a3.g = a(c, 100);
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        com.meituan.passport.converter.h a5 = a4.a(mVar);
        a5.j = com.meituan.passport.exception.monitor.e.a(100);
        a5.k = R.string.passport_login_loading;
        a5.b();
    }

    public static /* synthetic */ rx.d a(a aVar, String str, String str2, String str3, String str4) {
        Object[] objArr = {aVar, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13a59c05ce7955617b65d551768b2e03", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13a59c05ce7955617b65d551768b2e03") : com.meituan.passport.utils.s.a().loginv7(((com.meituan.passport.pojo.request.a) aVar.e).c(), str, str2, str3, str4);
    }

    public static /* synthetic */ rx.d a(a aVar, String str, String str2) {
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fc28e4e2dbf49b47997f79f54bf1686", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fc28e4e2dbf49b47997f79f54bf1686") : com.meituan.passport.utils.s.a().loginv7(((com.meituan.passport.pojo.request.a) aVar.e).c(), "", "", str, str2);
    }

    public static /* synthetic */ rx.d b(a aVar, String str, String str2) {
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81735a56050a80a7a6a98d90bd534b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81735a56050a80a7a6a98d90bd534b26");
        }
        Object[] objArr2 = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        return com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc4758d7da54ab8b35445d9dbc2972e8", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc4758d7da54ab8b35445d9dbc2972e8") : new d(aVar, str, str2));
    }
}
