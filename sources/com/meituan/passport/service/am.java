package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class am extends ag<com.meituan.passport.pojo.request.i, Result> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d3995774ea8570e165d906446d0799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d3995774ea8570e165d906446d0799");
            return;
        }
        FragmentActivity c = c();
        if (c == null || this.e == 0) {
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = an.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dce208bd367f48239e2ecda3d3e790d5", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dce208bd367f48239e2ecda3d3e790d5") : new an(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.g = (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(c, this.g)).a(new com.meituan.passport.handler.exception.f(c, this.g)).b;
        a3.i = a2;
        a3.a((com.meituan.passport.converter.m) this.f).b();
    }

    public static /* synthetic */ rx.d a(am amVar, String str, String str2) {
        Object[] objArr = {amVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0d7e161f7260c25e82eca110653a964", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0d7e161f7260c25e82eca110653a964") : com.meituan.passport.utils.s.b().resetPasswordV2(((com.meituan.passport.pojo.request.i) amVar.e).c(), str, str2);
    }
}
