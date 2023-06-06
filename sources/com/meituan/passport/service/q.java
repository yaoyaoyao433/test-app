package com.meituan.passport.service;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.pojo.response.SmsVerifyResult;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q extends ag<com.meituan.passport.pojo.request.d, User> implements a.b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private a.c i;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c083c1d16e0d2fa2de604a8acf4cae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c083c1d16e0d2fa2de604a8acf4cae3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8da5e8e8574d6a0adffb387079740801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8da5e8e8574d6a0adffb387079740801");
        } else {
            this.i = (a.c) com.meituan.passport.yoda.a.a(c(), ((com.meituan.passport.pojo.request.d) this.e).f(), 2);
            if (this.i != null) {
                this.i.b = this;
            }
        }
        this.i.a(((com.meituan.passport.pojo.request.d) this.e).b.b());
    }

    @Override // com.meituan.passport.yoda.a.b
    public final void a(final SmsResult smsResult) {
        Object[] objArr = {smsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b969eff02c25bffd10e4f6c0c2accc9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b969eff02c25bffd10e4f6c0c2accc9f");
            return;
        }
        final FragmentActivity c = c();
        if (c == null || !(smsResult instanceof SmsVerifyResult)) {
            return;
        }
        ((com.meituan.passport.pojo.request.d) this.e).d();
        ((com.meituan.passport.pojo.request.d) this.e).b(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY, com.meituan.passport.clickaction.d.a(((SmsVerifyResult) smsResult).responseCode));
        ((com.meituan.passport.pojo.request.d) this.e).b("supportVerifyLogin", com.meituan.passport.clickaction.d.a("1"));
        w a2 = com.meituan.passport.c.a().a(ai.TYPE_BIND_MOBILE_LOGIN);
        a2.a(c);
        a2.a((w) this.e);
        if (a2 instanceof m) {
            m mVar = (m) a2;
            mVar.b = this.b;
            mVar.c = this.c;
        }
        a2.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.service.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "809aef88e866726ea4948c3ca094e7d5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "809aef88e866726ea4948c3ca094e7d5")).booleanValue();
                }
                com.meituan.passport.utils.ai.a().b(c, q.this.b, q.this.c, 3);
                com.meituan.passport.utils.p.a().b(q.this.c(), q.this.c, smsResult.action == 3 ? "signup" : "login", apiException != null ? apiException.code : -999);
                if (apiException != null && apiException.code != 101144 && Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code))) {
                    com.meituan.passport.exception.skyeyemonitor.module.t tVar = (com.meituan.passport.exception.skyeyemonitor.module.t) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_unbinded");
                    String str = q.this.c;
                    Object[] objArr3 = {apiException, str};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.exception.skyeyemonitor.module.t.a;
                    if (PatchProxy.isSupport(objArr3, tVar, changeQuickRedirect3, false, "d6085f77dbdeb535b68d88fafa64234b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, tVar, changeQuickRedirect3, false, "d6085f77dbdeb535b68d88fafa64234b");
                    } else {
                        HashMap hashMap = new HashMap();
                        if (apiException != null) {
                            hashMap.put("code", Integer.valueOf(apiException.code));
                            hashMap.put("message", apiException.getMessage());
                            hashMap.put("type", apiException.type);
                            hashMap.put("oauth_type", str);
                        }
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "oauth_login_unbinded", "oauth_login_unbinded_other", "其它异常", hashMap);
                    }
                }
                com.meituan.passport.utils.p.a().a(q.this.c(), apiException == null ? -999 : apiException.code, q.this.c, ((com.meituan.passport.pojo.request.d) q.this.e).e());
                if (apiException != null && apiException.code != 101157 && apiException.code != 101159 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code)) && apiException.code != 101055) {
                    com.meituan.passport.utils.p.a().c(q.this.c(), q.this.c, ((com.meituan.passport.pojo.request.d) q.this.e).e(), apiException.code);
                }
                return true;
            }
        });
        a2.b(this.h);
        a2.a(new com.meituan.passport.successcallback.b(c, smsResult.action != 3 ? 0 : 3, this.c, this.b));
        a2.b();
    }

    @Override // com.meituan.passport.yoda.a.b
    public final boolean a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1080f042a727fce63d52db35c49ed9f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1080f042a727fce63d52db35c49ed9f9")).booleanValue() : this.g == null || this.g.a(apiException, false);
    }
}
