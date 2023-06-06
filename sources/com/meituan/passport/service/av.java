package com.meituan.passport.service;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class av extends ag<com.meituan.passport.pojo.request.g<String>, User> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6584ff1291747bca9b496cfb9febb81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6584ff1291747bca9b496cfb9febb81");
            return;
        }
        Fragment d = d();
        if (d == null) {
            return;
        }
        FragmentActivity activity = d.getActivity();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = aw.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c83c561e18253545d81b6290125aa31", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c83c561e18253545d81b6290125aa31") : new aw(this));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.g = b(d);
        com.meituan.passport.converter.h a4 = a3.a(activity.getSupportFragmentManager());
        a4.i = a2;
        a4.a((com.meituan.passport.converter.m) this.f).b();
    }

    public static /* synthetic */ rx.d a(av avVar, String str, String str2) {
        Object[] objArr = {avVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd42cf22a57e6c007fe137603b7039d9", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd42cf22a57e6c007fe137603b7039d9") : com.meituan.passport.utils.s.a().ticketLogin(((com.meituan.passport.pojo.request.g) avVar.e).c(), (String) ((com.meituan.passport.pojo.request.g) avVar.e).b.b(), str, str2);
    }
}
