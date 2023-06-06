package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.UserCenter;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aj extends ag<com.meituan.passport.pojo.request.f, User> {
    public static ChangeQuickRedirect a;
    private String b;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0bb6de95cd0cba7f77da84c699fdd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0bb6de95cd0cba7f77da84c699fdd0");
            return;
        }
        FragmentActivity c = c();
        if (c == null || c.isFinishing()) {
            return;
        }
        com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.h(c, this.f, this.h, this.b, UserCenter.OAUTH_TYPE_UNIQUE, "action")).a(new com.meituan.passport.handler.resume.i(c, "", 600, this.b, UserCenter.OAUTH_TYPE_UNIQUE, "login")).a(new com.meituan.passport.handler.resume.a(c, UserCenter.OAUTH_TYPE_UNIQUE)).a(new com.meituan.passport.handler.resume.j(c, this.f, this.h, UserCenter.OAUTH_TYPE_UNIQUE, "login")).b;
        com.meituan.passport.handler.exception.c cVar = (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(c, this.g, 600)).a(new com.meituan.passport.handler.exception.f(c, this.g)).a(new com.meituan.passport.handler.exception.d(c, this.g)).b;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = ak.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "92d2e0850de4fec4b94de45eff7e5eb6", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "92d2e0850de4fec4b94de45eff7e5eb6") : new ak(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.h = bVar;
        a3.g = cVar;
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        com.meituan.passport.converter.h a5 = a4.a((com.meituan.passport.converter.m) this.f);
        a5.j = com.meituan.passport.exception.monitor.e.a(400);
        a5.b();
    }

    public static /* synthetic */ rx.d a(aj ajVar, String str, String str2) {
        Object[] objArr = {ajVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e7a1a932593ba8e3bf817e05353414c", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e7a1a932593ba8e3bf817e05353414c") : com.meituan.passport.utils.s.e().newShareLogin(((com.meituan.passport.pojo.request.f) ajVar.e).c(), str, ((com.meituan.passport.pojo.request.f) ajVar.e).b.b());
    }
}
