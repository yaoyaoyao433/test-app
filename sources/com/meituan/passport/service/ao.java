package com.meituan.passport.service;

import android.support.annotation.RestrictTo;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.YodaResult;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ao extends ag<com.meituan.passport.pojo.request.j, SmsResult> implements a.b {
    public static ChangeQuickRedirect a;
    private a.C0517a b;
    private com.meituan.passport.converter.m<YodaResult> c;
    private boolean i;

    @Override // com.meituan.passport.service.ag, com.meituan.passport.service.w
    public final /* synthetic */ void a(com.meituan.passport.pojo.request.b bVar) {
        com.meituan.passport.pojo.request.j jVar = (com.meituan.passport.pojo.request.j) bVar;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b996a0d915315869be9b190bb4a1f3ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b996a0d915315869be9b190bb4a1f3ec");
        } else {
            super.a((ao) jVar);
        }
    }

    @Override // com.meituan.passport.service.ag
    public final void a() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bace3729114ae00f07fbde1a9b216450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bace3729114ae00f07fbde1a9b216450");
            return;
        }
        FragmentActivity c = c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da36ccfa55b51dc58a5ad6a785aa79f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da36ccfa55b51dc58a5ad6a785aa79f0");
        } else {
            this.b = (a.C0517a) com.meituan.passport.yoda.a.a(c(), (com.meituan.passport.pojo.request.j) this.e, 1);
            this.b.b = this;
        }
        if (TextUtils.isEmpty(((com.meituan.passport.pojo.request.j) this.e).i.b()) && c != null) {
            this.i = ((com.meituan.passport.pojo.request.j) this.e).l.b().booleanValue();
            int a2 = com.meituan.passport.utils.al.a();
            T t = this.e;
            Object[] objArr3 = {t};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.utils.al.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f7f60c1fc129c2d60cc9c854cd79571c", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f7f60c1fc129c2d60cc9c854cd79571c")).intValue();
            } else {
                i = (t.a("fromOrderFragment") != null || PassportConfig.o()) ? 2 : 1;
            }
            com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.e(c)).b;
            com.meituan.passport.handler.exception.c cVar = (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.b(c, this.g, Integer.valueOf((int) AccountApi.user_err_mobile_inval), Integer.valueOf((int) AccountApi.user_err_denied_1m), Integer.valueOf((int) AccountApi.user_err_denied_24h), Integer.valueOf((int) AccountApi.user_err_login_need_captcha), Integer.valueOf((int) AccountApi.user_err_login_captcha_err))).a(new com.meituan.passport.handler.exception.e(c, this.g, 200)).a(new com.meituan.passport.handler.exception.f(c, this.g)).b;
            String b = com.meituan.passport.encryption.a.b(((com.meituan.passport.pojo.request.j) this.e).j.b().number);
            Object[] objArr4 = {this, b, Integer.valueOf(a2), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = ap.a;
            rx.d<T> a3 = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4f8034424e799cc474f7741dc2d424e6", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4f8034424e799cc474f7741dc2d424e6") : new ap(this, b, a2, i));
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = aq.a;
            this.c = new com.meituan.passport.successcallback.d(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1c4b8fe8395d1f58f6af26a35398649a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.m) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1c4b8fe8395d1f58f6af26a35398649a") : new aq(this));
            com.meituan.passport.converter.h a4 = com.meituan.passport.converter.h.a();
            a4.g = cVar;
            a4.h = bVar;
            com.meituan.passport.converter.h a5 = a4.a(c.getSupportFragmentManager());
            a5.i = a3;
            a5.a(this.c).b();
            return;
        }
        this.b.a();
    }

    public static /* synthetic */ rx.d a(ao aoVar, String str, int i, int i2, String str2, String str3) {
        Object[] objArr = {aoVar, str, Integer.valueOf(i), Integer.valueOf(i2), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2055f3a582f18efb06714d1ce27d2447", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2055f3a582f18efb06714d1ce27d2447");
        }
        return com.meituan.passport.utils.s.a().mobileLoginApply(str, ((com.meituan.passport.pojo.request.j) aoVar.e).j.b().countryCode, i, i2, null, "", aoVar.i ? 1 : 0, str2, str3);
    }

    @Override // com.meituan.passport.yoda.a.b
    public final boolean a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67de5d3152df08301eb61083ee7e835c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67de5d3152df08301eb61083ee7e835c")).booleanValue();
        }
        com.meituan.passport.converter.b bVar = this.g;
        if (c() == null || bVar == null) {
            return true;
        }
        return bVar.a(apiException, false);
    }

    @Override // com.meituan.passport.yoda.a.b
    public final void a(SmsResult smsResult) {
        Object[] objArr = {smsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b8b942a0441fff419fc8c29f094d17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b8b942a0441fff419fc8c29f094d17");
            return;
        }
        com.meituan.passport.converter.m<R> mVar = this.f;
        if (c() == null || mVar == 0) {
            return;
        }
        mVar.a(smsResult);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public static /* synthetic */ void a(ao aoVar, SmsRequestCode smsRequestCode) {
        Object[] objArr = {smsRequestCode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aoVar, changeQuickRedirect, false, "c92fafcff670eea7bc6a9f93bb835150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aoVar, changeQuickRedirect, false, "c92fafcff670eea7bc6a9f93bb835150");
        } else if (aoVar.c() == null || smsRequestCode == null) {
        } else {
            ((com.meituan.passport.pojo.request.j) aoVar.e).i.b = smsRequestCode.value;
            ((com.meituan.passport.pojo.request.j) aoVar.e).k = smsRequestCode.action;
            aoVar.b.a();
        }
    }
}
