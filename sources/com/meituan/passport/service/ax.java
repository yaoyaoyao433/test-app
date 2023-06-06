package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ax extends ag<com.meituan.passport.pojo.request.l, User> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f82e22f754c76297da7d5ac5c7861ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f82e22f754c76297da7d5ac5c7861ec");
            return;
        }
        FragmentActivity c = c();
        if (c == null) {
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = ay.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3660f07633150d428d7d02ec4ef2796", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3660f07633150d428d7d02ec4ef2796") : new ay(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.g = b(c);
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        a4.a((com.meituan.passport.converter.m) this.f).b();
    }

    public static /* synthetic */ rx.d a(ax axVar, String str, String str2) {
        Object[] objArr = {axVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5443c3ca7f94776dea16cc42db3e8e7", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5443c3ca7f94776dea16cc42db3e8e7") : com.meituan.passport.utils.s.a().verifyLogin(((com.meituan.passport.pojo.request.l) axVar.e).c(), ((com.meituan.passport.pojo.request.l) axVar.e).b.b(), ((com.meituan.passport.pojo.request.l) axVar.e).c.b(), ((com.meituan.passport.pojo.request.l) axVar.e).i.b(), str);
    }
}
