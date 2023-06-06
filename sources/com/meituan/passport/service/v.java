package com.meituan.passport.service;

import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class v extends ag<com.meituan.passport.pojo.request.d, User> implements a.b {
    public static ChangeQuickRedirect a;
    public String b;
    private a.c c;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85608054189c5cf115d6b410c259822f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85608054189c5cf115d6b410c259822f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2266a396df11f09d71d7a973d9bf43b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2266a396df11f09d71d7a973d9bf43b5");
        } else {
            this.c = (a.c) com.meituan.passport.yoda.a.a(c(), ((com.meituan.passport.pojo.request.d) this.e).f(), 2);
            if (this.c != null) {
                this.c.b = this;
            }
        }
        this.c.f = ((com.meituan.passport.pojo.request.d) this.e).k == 3 ? R.string.passport_signup_loading : R.string.passport_login_loading;
        this.c.a(((com.meituan.passport.pojo.request.d) this.e).b.b());
    }

    @Override // com.meituan.passport.yoda.a.b
    public final boolean a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae8b81e6ddcc9694a6cd0df36ec8cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae8b81e6ddcc9694a6cd0df36ec8cc9")).booleanValue();
        }
        com.meituan.passport.utils.p.a().c(c(), UserCenter.OAUTH_TYPE_DYNAMIC, ((com.meituan.passport.pojo.request.d) this.e).k == 3 ? "signup" : "login", apiException != null ? apiException.code : -999);
        return this.g == null || this.g.a(apiException, true);
    }

    @Override // com.meituan.passport.yoda.a.b
    public final void a(SmsResult smsResult) {
        Object[] objArr = {smsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baeab503b927fc942e727f2a9bf80e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baeab503b927fc942e727f2a9bf80e31");
            return;
        }
        ae aeVar = new ae(smsResult, this.b);
        aeVar.a(c());
        aeVar.a((ae) this.e);
        aeVar.g = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.service.v.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30322e1deec01c2d44bf9cce04e7b274", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30322e1deec01c2d44bf9cce04e7b274")).booleanValue();
                }
                if (apiException != null) {
                    String str = v.this.b;
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -840075834) {
                        if (hashCode == 2124767295 && str.equals(UserCenter.OAUTH_TYPE_DYNAMIC)) {
                            c = 1;
                        }
                    } else if (str.equals("fast_login")) {
                        c = 0;
                    }
                    switch (c) {
                        case 0:
                            com.meituan.passport.utils.ai.a().b(v.this.c(), ((com.meituan.passport.pojo.request.d) v.this.e).k, apiException.code);
                            break;
                        case 1:
                            com.meituan.passport.utils.ai.a().a(v.this.c(), ((com.meituan.passport.pojo.request.d) v.this.e).k, apiException.code);
                            break;
                    }
                }
                if (apiException != null && apiException.code != 101144 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code))) {
                    ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a(apiException);
                }
                if (apiException != null && TextUtils.equals(v.this.b, UserCenter.OAUTH_TYPE_DYNAMIC) && apiException.code != 101159 && apiException.code != 101157 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code))) {
                    com.meituan.passport.utils.p.a().c(v.this.c(), UserCenter.OAUTH_TYPE_DYNAMIC, ((com.meituan.passport.pojo.request.d) v.this.e).k == 3 ? "signup" : "login", apiException.code);
                    com.meituan.passport.utils.p.a().a(v.this.c(), apiException.code, UserCenter.OAUTH_TYPE_DYNAMIC, ((com.meituan.passport.pojo.request.d) v.this.e).k == 3 ? "signup" : "login");
                }
                return true;
            }
        };
        aeVar.f = this.f;
        aeVar.h = this.h;
        aeVar.b();
    }
}
