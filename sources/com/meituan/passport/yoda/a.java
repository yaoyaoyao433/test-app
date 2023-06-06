package com.meituan.passport.yoda;

import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.VerifyApi;
import com.meituan.passport.converter.m;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.handler.a;
import com.meituan.passport.handler.resume.l;
import com.meituan.passport.pojo.BaseResult;
import com.meituan.passport.pojo.YodaCodeInfo;
import com.meituan.passport.pojo.request.j;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.pojo.response.SmsVerifyResult;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public b b;
    public WeakReference<FragmentActivity> c;
    public j d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(SmsResult smsResult);

        boolean a(ApiException apiException);
    }

    public static a a(FragmentActivity fragmentActivity, j jVar, int i) {
        Object[] objArr = {fragmentActivity, jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa70f60e9633adde001b3e5d9abae391", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa70f60e9633adde001b3e5d9abae391");
        }
        switch (i) {
            case 1:
                return new C0517a(fragmentActivity, jVar);
            case 2:
                return new c(fragmentActivity, jVar);
            default:
                return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.yoda.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0517a extends a {
        public static ChangeQuickRedirect e;
        private m<BaseResult> f;
        private com.meituan.passport.converter.b g;

        private C0517a(FragmentActivity fragmentActivity, j jVar) {
            super(fragmentActivity, jVar);
            Object[] objArr = {fragmentActivity, jVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb4f8bf3b16ae7c865b87e2486b3b41", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb4f8bf3b16ae7c865b87e2486b3b41");
                return;
            }
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.yoda.b.a;
            this.g = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f70e9956d7e46211a26d7d3723fb0bad", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f70e9956d7e46211a26d7d3723fb0bad") : new com.meituan.passport.yoda.b(this);
            this.c = new WeakReference<>(fragmentActivity);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d20a65da652247abe0b2bf33f2db53", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d20a65da652247abe0b2bf33f2db53");
                return;
            }
            FragmentActivity fragmentActivity = this.c.get();
            if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                return;
            }
            b();
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d25478012334ac146a144d5ef13bb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d25478012334ac146a144d5ef13bb9");
                return;
            }
            FragmentActivity fragmentActivity = this.c.get();
            if (this.d == null || !this.d.a() || fragmentActivity == null || fragmentActivity.isFinishing()) {
                return;
            }
            Map<String, Object> c = this.d.c();
            if (c != null) {
                if (c.containsKey("mobile")) {
                    c.remove("mobile");
                }
                if (c.containsKey("mobileInterCode")) {
                    c.remove("mobileInterCode");
                }
            }
            com.meituan.passport.clickaction.d<String> b = this.d.b("loginType");
            String b2 = b != null ? b.b() : UserCenter.OAUTH_TYPE_DYNAMIC;
            if (TextUtils.isEmpty(b2)) {
                b2 = UserCenter.OAUTH_TYPE_DYNAMIC;
            }
            rx.d<T> a = v.a(com.meituan.passport.yoda.c.a(this, (Map) c));
            l.a a2 = d.a(a);
            a.C0506a a3 = a.C0506a.a();
            com.meituan.passport.converter.b bVar = this.g;
            Integer[] numArr = {Integer.valueOf((int) VerifyApi.user_err_voice_failed)};
            this.f = e.a(this);
            com.meituan.passport.converter.h a4 = com.meituan.passport.converter.h.a();
            a4.h = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new l(fragmentActivity, a2, b2, this.d.e())).b;
            a4.g = (com.meituan.passport.handler.exception.c) a3.a(new com.meituan.passport.handler.exception.b(fragmentActivity, bVar, numArr)).a(new com.meituan.passport.handler.exception.e(fragmentActivity, this.g)).a(new com.meituan.passport.handler.exception.f(fragmentActivity, this.g)).b;
            com.meituan.passport.converter.h a5 = a4.a(fragmentActivity.getSupportFragmentManager());
            a5.i = a;
            a5.a(this.f).b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends a {
        public static ChangeQuickRedirect e;
        @StringRes
        public int f;
        private com.meituan.passport.converter.b g;

        private c(FragmentActivity fragmentActivity, j jVar) {
            super(fragmentActivity, jVar);
            Object[] objArr = {fragmentActivity, jVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bff0a2a38b6e28ee81dc52418300b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bff0a2a38b6e28ee81dc52418300b3");
                return;
            }
            this.f = 0;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            this.g = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "29f6776a70a36cf7619f9c0f85c96c05", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "29f6776a70a36cf7619f9c0f85c96c05") : new g(this);
            this.c = new WeakReference<>(fragmentActivity);
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51f1da6e93e553ae9481add100f37f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51f1da6e93e553ae9481add100f37f0");
                return;
            }
            FragmentActivity fragmentActivity = this.c.get();
            if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                return;
            }
            b(str);
        }

        private void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545169572e304e970a5e02c1075ccc1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545169572e304e970a5e02c1075ccc1e");
                return;
            }
            FragmentActivity fragmentActivity = this.c.get();
            if (this.d == null || !this.d.a() || fragmentActivity == null || fragmentActivity.isFinishing()) {
                return;
            }
            com.meituan.passport.handler.exception.c cVar = (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragmentActivity, this.g)).a(new com.meituan.passport.handler.exception.f(fragmentActivity, this.g)).b;
            Map<String, Object> c = this.d.c();
            if (this.d.l.b().booleanValue() && c != null) {
                c.put("voicecode", str);
            } else if (c != null) {
                c.put("smscode", str);
            }
            if (c != null) {
                if (c.containsKey("mobile")) {
                    c.remove("mobile");
                }
                if (c.containsKey("mobileInterCode")) {
                    c.remove("mobileInterCode");
                }
            }
            rx.d<T> a = v.a(h.a(this, (Map) c));
            C0518a c0518a = new C0518a(fragmentActivity, this.d.k);
            com.meituan.passport.converter.h a2 = com.meituan.passport.converter.h.a();
            a2.g = cVar;
            com.meituan.passport.converter.h a3 = a2.a(fragmentActivity.getSupportFragmentManager());
            a3.i = a;
            a3.c = c0518a;
            a3.k = this.f;
            a3.b();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.passport.yoda.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0518a extends com.meituan.passport.successcallback.f<BaseResult<YodaCodeInfo>> {
            public static ChangeQuickRedirect a;
            private int c;

            @Override // com.meituan.passport.successcallback.f
            public final /* synthetic */ void a(BaseResult<YodaCodeInfo> baseResult, Fragment fragment) {
                BaseResult<YodaCodeInfo> baseResult2 = baseResult;
                Object[] objArr = {baseResult2, fragment};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854e881a533668e2cd00e55a3718ce3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854e881a533668e2cd00e55a3718ce3c");
                } else if (baseResult2 == null || c.this.b == null || baseResult2.data == null) {
                } else {
                    if (TextUtils.isEmpty(baseResult2.data.code) && fragment != null) {
                        ai.a().a(fragment.getActivity(), this.c, NumberUtils.parseInt(baseResult2.data.code, -1));
                    }
                    SmsVerifyResult smsVerifyResult = new SmsVerifyResult();
                    c.this.d.a(smsVerifyResult);
                    smsVerifyResult.responseCode = baseResult2.data.code;
                    c.this.b.a(smsVerifyResult);
                }
            }

            @Override // com.meituan.passport.successcallback.f
            public final /* synthetic */ void a(BaseResult<YodaCodeInfo> baseResult, FragmentActivity fragmentActivity) {
                BaseResult<YodaCodeInfo> baseResult2 = baseResult;
                Object[] objArr = {baseResult2, fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d99300241b5e8f1179871f621a670d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d99300241b5e8f1179871f621a670d");
                } else if (baseResult2 == null || c.this.b == null || baseResult2.data == null) {
                } else {
                    if (TextUtils.isEmpty(baseResult2.data.code)) {
                        ai.a().a(fragmentActivity, this.c, NumberUtils.parseInt(baseResult2.data.code, -1));
                    }
                    SmsVerifyResult smsVerifyResult = new SmsVerifyResult();
                    c.this.d.a(smsVerifyResult);
                    smsVerifyResult.responseCode = baseResult2.data.code;
                    c.this.b.a(smsVerifyResult);
                }
            }

            public C0518a(FragmentActivity fragmentActivity, int i) {
                super(fragmentActivity);
                Object[] objArr = {c.this, fragmentActivity, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2de0d43904dc522584360e5d0ad611", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2de0d43904dc522584360e5d0ad611");
                } else {
                    this.c = i;
                }
            }
        }
    }

    private a(FragmentActivity fragmentActivity, j jVar) {
        Object[] objArr = {fragmentActivity, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276c4ce843cac7b2e2255eeaa660edaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276c4ce843cac7b2e2255eeaa660edaa");
            return;
        }
        this.c = new WeakReference<>(fragmentActivity);
        this.d = jVar;
    }
}
