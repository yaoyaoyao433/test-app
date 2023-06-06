package com.meituan.passport.service;

import android.support.annotation.RestrictTo;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.YodaResult;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ar extends ag<MobileParams, SmsRequestCode> {
    public static ChangeQuickRedirect a;
    private com.meituan.passport.converter.m<YodaResult> b;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a85d70f33fffb313ca7bc85012333c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a85d70f33fffb313ca7bc85012333c");
            return;
        }
        FragmentActivity c = c();
        if (c != null) {
            int a2 = com.meituan.passport.utils.al.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.utils.al.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "107b15f9c2ce265f698664c3ff351c2e", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "107b15f9c2ce265f698664c3ff351c2e")).intValue();
            } else {
                i = !PassportConfig.o() ? 1 : 2;
            }
            boolean p = PassportConfig.p();
            this.b = new com.meituan.passport.successcallback.d(c, this.f);
            com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.e(c)).b;
            Object[] objArr3 = {this, Integer.valueOf(a2), Integer.valueOf(i), Byte.valueOf(p ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = as.a;
            rx.d<T> a3 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6695cf1d67297a3e691bcae91d4beafa", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6695cf1d67297a3e691bcae91d4beafa") : new as(this, a2, i, p));
            com.meituan.passport.converter.h a4 = com.meituan.passport.converter.h.a();
            a4.g = a(c, 200);
            a4.h = bVar;
            com.meituan.passport.converter.h a5 = a4.a(c.getSupportFragmentManager());
            a5.i = a3;
            a5.a(this.b).b();
        }
    }

    public static /* synthetic */ rx.d a(ar arVar, int i, int i2, boolean z, String str, String str2) {
        Object[] objArr = {arVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "024f3d4cd4840cd5d06ff5bdbada0480", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "024f3d4cd4840cd5d06ff5bdbada0480");
        }
        return com.meituan.passport.utils.s.a().peaseRequestCode(((MobileParams) arVar.e).c(), i, i2, z ? String.valueOf(PassportConfig.j()) : "", 0, str, str2);
    }
}
