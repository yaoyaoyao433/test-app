package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.pojo.UserBaseInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class at extends ag<com.meituan.passport.pojo.request.g<String>, UserBaseInfo> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815aab5929aba21d5a5fc4954919cf19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815aab5929aba21d5a5fc4954919cf19");
            return;
        }
        FragmentActivity c = c();
        if (c == null) {
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = au.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c0836cab04ad0333aaf842d0f47eed16", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c0836cab04ad0333aaf842d0f47eed16") : new au(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.g = b(c);
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        a4.a((com.meituan.passport.converter.m) this.f).b();
    }

    public static /* synthetic */ rx.d a(at atVar, String str, String str2) {
        Object[] objArr = {atVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86048af91fc445c04a0e14d8e8f6473e", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86048af91fc445c04a0e14d8e8f6473e") : com.meituan.passport.utils.s.a().ticketLoginCheck((String) ((com.meituan.passport.pojo.request.g) atVar.e).b.b(), str, str2);
    }
}
