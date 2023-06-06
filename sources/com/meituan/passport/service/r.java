package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.handler.a;
import com.meituan.passport.handler.resume.l;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.Ticket;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r extends ag<MobileParams, Ticket> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a679097697197f60f78e25d2edc818ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a679097697197f60f78e25d2edc818ed");
            return;
        }
        FragmentActivity c = c();
        if (c == null) {
            return;
        }
        Mobile b = ((MobileParams) this.e).b.b();
        String b2 = com.meituan.passport.encryption.a.b(b.number);
        Object[] objArr2 = {this, b2, b};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.l(c, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c4ebe2f4f16807325ac5b274c6b2f03", RobustBitConfig.DEFAULT_VALUE) ? (l.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c4ebe2f4f16807325ac5b274c6b2f03") : new s(this, b2, b))).b;
        com.meituan.passport.handler.exception.c cVar = (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(c, this.g)).a(new com.meituan.passport.handler.exception.f(c, this.g)).b;
        Object[] objArr3 = {this, b2, b};
        ChangeQuickRedirect changeQuickRedirect3 = t.a;
        rx.d<T> a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d6adef0344f32133f07f92cb9caae377", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d6adef0344f32133f07f92cb9caae377") : new t(this, b2, b));
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.g = cVar;
        a3.h = bVar;
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        a4.a((com.meituan.passport.converter.m) this.f).b();
    }

    public static /* synthetic */ rx.d a(r rVar, String str, Mobile mobile, String str2, String str3, String str4, String str5) {
        Object[] objArr = {rVar, str, mobile, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ace4b80adc1903070448f2ed7872a24", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ace4b80adc1903070448f2ed7872a24") : com.meituan.passport.utils.s.b().checkUserName(((MobileParams) rVar.e).c(), str, mobile.countryCode, str2, str3, str4, str5);
    }

    public static /* synthetic */ rx.d a(r rVar, String str, Mobile mobile, String str2, String str3) {
        Object[] objArr = {rVar, str, mobile, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cc962d404ea3493876b1af70bce1d20", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cc962d404ea3493876b1af70bce1d20") : com.meituan.passport.utils.s.b().checkUserName(((MobileParams) rVar.e).c(), str, mobile.countryCode, "", "", str2, str3);
    }

    public static /* synthetic */ rx.d b(r rVar, String str, Mobile mobile, String str2, String str3) {
        Object[] objArr = {rVar, str, mobile, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e2f417eb3e1fdab1dd101c07f1777c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e2f417eb3e1fdab1dd101c07f1777c4");
        }
        Object[] objArr2 = {rVar, str, mobile, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = u.a;
        return com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ccdff3057901cb0bcbdfd6a34d36988c", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ccdff3057901cb0bcbdfd6a34d36988c") : new u(rVar, str, mobile, str2, str3));
    }
}
