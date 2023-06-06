package com.meituan.passport.service;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.YodaResult;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends ag<MobileParams, SmsResult> implements a.b {
    public static ChangeQuickRedirect a;
    private a.C0517a b;
    private com.meituan.passport.pojo.request.j c;
    private com.meituan.passport.converter.m<YodaResult> i;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38980105f366d5a32490c6912e8f3fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38980105f366d5a32490c6912e8f3fc");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        this.i = new com.meituan.passport.successcallback.d(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "296ebafa80fab7915a7340bfbd6351ca", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.m) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "296ebafa80fab7915a7340bfbd6351ca") : new g(this));
    }

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72c18a203785c48ad49c603621c2623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72c18a203785c48ad49c603621c2623");
            return;
        }
        FragmentActivity c = c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c42f921546efd9fd013ed723fce38a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c42f921546efd9fd013ed723fce38a3");
        } else {
            this.c = new com.meituan.passport.pojo.request.j();
            this.c.j = ((MobileParams) this.e).b;
            this.c.l = com.meituan.passport.clickaction.d.a(Boolean.FALSE);
            this.c.b("loginType", ((MobileParams) this.e).b("loginType"));
            this.b = (a.C0517a) com.meituan.passport.yoda.a.a(c(), this.c, 1);
            if (this.b != null) {
                this.b.b = this;
            }
        }
        if (c == null || c.isFinishing()) {
            return;
        }
        Object[] objArr3 = {c};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30b7a8662c6b3808c579fde25d8d588e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30b7a8662c6b3808c579fde25d8d588e");
            return;
        }
        com.meituan.passport.clickaction.d<String> b = this.c != null ? this.c.b("loginType") : null;
        String b2 = b != null ? b.b() : "";
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = h.a;
        rx.d<T> h = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f867749f8033c76105419825f5f1c17e", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f867749f8033c76105419825f5f1c17e") : new h(this)).b(i.a()).d(j.a()).h(k.a());
        com.meituan.passport.converter.h a2 = com.meituan.passport.converter.h.a();
        a2.g = a(c, 300, b2);
        com.meituan.passport.converter.h a3 = a2.a(c.getSupportFragmentManager());
        a3.i = h;
        a3.a(this.i).b();
    }

    public static /* synthetic */ rx.d a(f fVar, String str, String str2) {
        Object[] objArr = {fVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7e8491fa2f4e19167d3ce20910f4d02", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7e8491fa2f4e19167d3ce20910f4d02") : com.meituan.passport.utils.s.a().bindMobileLoginCode(((MobileParams) fVar.e).c(), str, str2);
    }

    public static /* synthetic */ Boolean b(YodaResult yodaResult) {
        boolean z = true;
        Object[] objArr = {yodaResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7198d817f0c14611129ee85616986943", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7198d817f0c14611129ee85616986943");
        }
        return Boolean.valueOf((yodaResult == null || yodaResult.data == null || !yodaResult.data.containsKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) ? false : false);
    }

    public static /* synthetic */ String a(YodaResult yodaResult) {
        Object[] objArr = {yodaResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b113f971df73bda08200a890446bc9e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b113f971df73bda08200a890446bc9e3") : (String) yodaResult.data.get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
    }

    public static /* synthetic */ rx.d a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d031ef4f38cd0bea3bcd1bb5f5c3b96d", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d031ef4f38cd0bea3bcd1bb5f5c3b96d") : com.meituan.passport.utils.s.c().getPageData(str, str2, str3);
    }

    @Override // com.meituan.passport.yoda.a.b
    public final boolean a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be534ed63340e707886ad5c3a18e563c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be534ed63340e707886ad5c3a18e563c")).booleanValue();
        }
        com.meituan.passport.converter.b bVar = this.g;
        return c() == null || bVar == null || bVar.a(apiException, false);
    }

    @Override // com.meituan.passport.yoda.a.b
    public final void a(SmsResult smsResult) {
        Object[] objArr = {smsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf16ddc9a08710ac57e740b37bbb7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf16ddc9a08710ac57e740b37bbb7e0");
            return;
        }
        com.meituan.passport.converter.m<R> mVar = this.f;
        if (c() == null || mVar == 0) {
            return;
        }
        mVar.a(smsResult);
    }

    public static /* synthetic */ rx.d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3e0ae7e062465a94d323025a4ecb41f", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3e0ae7e062465a94d323025a4ecb41f");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        return com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f1f85f5cf0b57a8b3fbfc3ade743e083", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f1f85f5cf0b57a8b3fbfc3ade743e083") : new l(str));
    }

    public static /* synthetic */ void a(f fVar, SmsRequestCode smsRequestCode) {
        Object[] objArr = {smsRequestCode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "43174a9ee8ad363f124342d1a38bff92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "43174a9ee8ad363f124342d1a38bff92");
            return;
        }
        FragmentActivity c = fVar.c();
        if (c == null || smsRequestCode == null) {
            return;
        }
        fVar.c.i = com.meituan.passport.clickaction.d.a(smsRequestCode.value);
        fVar.c.k = smsRequestCode.action;
        com.meituan.passport.utils.p.a().a((Activity) c, fVar.c.b("loginType").b(), fVar.c.e());
        fVar.b.a();
    }
}
