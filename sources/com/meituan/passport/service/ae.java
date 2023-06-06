package com.meituan.passport.service;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.pojo.response.SmsVerifyResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae extends ag<com.meituan.passport.pojo.request.d, User> {
    public static ChangeQuickRedirect a;
    private SmsResult b;
    private String c;

    public ae(SmsResult smsResult, String str) {
        Object[] objArr = {smsResult, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a945c011d6ed71d8d2f2a0a8193dee0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a945c011d6ed71d8d2f2a0a8193dee0e");
            return;
        }
        this.b = smsResult;
        this.c = str;
    }

    public static /* synthetic */ rx.d a(ae aeVar, boolean z, String str, String str2) {
        Object[] objArr = {aeVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "256db2d6b544e60a50c85c6d32d4451d", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "256db2d6b544e60a50c85c6d32d4451d");
        }
        return com.meituan.passport.utils.s.a().mobileLoginv3(((com.meituan.passport.pojo.request.d) aeVar.e).c(), ((SmsVerifyResult) aeVar.b).responseCode, str, str2, z ? String.valueOf(PassportConfig.j()) : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.meituan.passport.converter.m<R>] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v35, types: [com.meituan.passport.exception.monitor.c] */
    /* JADX WARN: Type inference failed for: r1v36 */
    @Override // com.meituan.passport.service.ag
    public final void a() {
        com.meituan.passport.handler.resume.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d527fd663aa015a47d75663575b1c4fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d527fd663aa015a47d75663575b1c4fa");
            return;
        }
        ?? r0 = this.f;
        FragmentActivity c = c();
        boolean p = PassportConfig.p();
        if (c == null || this.b == null) {
            return;
        }
        com.meituan.passport.successcallback.c cVar = r0;
        if (this.b instanceof SmsVerifyResult) {
            if (r0 == null) {
                com.meituan.passport.successcallback.c cVar2 = new com.meituan.passport.successcallback.c(c, this.b.action);
                cVar2.a(false);
                cVar = cVar2;
            }
            ((com.meituan.passport.pojo.request.d) this.e).d();
            if (((com.meituan.passport.pojo.request.d) this.e).a("needIdentifyConfirm") != null) {
                dVar = new com.meituan.passport.handler.resume.d(c, ((com.meituan.passport.pojo.request.d) this.e).j.b().number, ((com.meituan.passport.pojo.request.d) this.e).j.b().countryCode, UserCenter.OAUTH_TYPE_DYNAMIC, this.f, ((com.meituan.passport.pojo.request.d) this.e).e());
            } else {
                dVar = new com.meituan.passport.handler.resume.d(c, ((com.meituan.passport.pojo.request.d) this.e).e());
            }
            com.meituan.passport.handler.resume.b bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.h(c, this.f, this.h, ((com.meituan.passport.pojo.request.d) this.e).j, this.c, UserCenter.OAUTH_TYPE_DYNAMIC, ((com.meituan.passport.pojo.request.d) this.e).e())).a(new com.meituan.passport.handler.resume.i(c, ((com.meituan.passport.pojo.request.d) this.e).j.b().number, 200, this.c, UserCenter.OAUTH_TYPE_DYNAMIC, ((com.meituan.passport.pojo.request.d) this.e).e())).a(dVar).a(new com.meituan.passport.handler.resume.j(c, this.f, this.h, UserCenter.OAUTH_TYPE_DYNAMIC, ((com.meituan.passport.pojo.request.d) this.e).e())).b;
            Object[] objArr2 = {this, Byte.valueOf(p ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = af.a;
            rx.d a2 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d37d0355705262d37c3d94ec9693ae7c", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d37d0355705262d37c3d94ec9693ae7c") : new af(this, p));
            com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
            a3.h = bVar;
            a3.g = a(c, 200);
            com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
            a4.i = a2;
            com.meituan.passport.converter.h a5 = a4.a(cVar);
            ?? r1 = this.b.action == 3 ? 1 : 0;
            Object[] objArr3 = {Byte.valueOf((byte) r1)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.exception.monitor.e.a;
            a5.j = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8e25bb01ebf8c10adbd0adf6a083f9dc", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.exception.monitor.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8e25bb01ebf8c10adbd0adf6a083f9dc") : new com.meituan.passport.exception.monitor.a(r1);
            a5.k = this.b.action == 3 ? R.string.passport_signup_loading : R.string.passport_login_loading;
            a5.b();
        }
    }
}
