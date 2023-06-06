package com.meituan.passport.oauthlogin.handler;

import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.api.AccountApiFactory;
import com.meituan.passport.converter.h;
import com.meituan.passport.converter.m;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.y;
import com.meituan.passport.k;
import com.meituan.passport.plugins.e;
import com.meituan.passport.plugins.q;
import com.meituan.passport.pojo.BindStatus;
import com.meituan.passport.pojo.YodaConfirmData;
import com.meituan.passport.pojo.request.l;
import com.meituan.passport.service.ag;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.n;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.passport.handler.resume.b<BindStatus> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<BindStatus> e;
    m<BindStatus> f;
    com.meituan.passport.converter.b g;
    com.meituan.passport.oauthlogin.model.a h;
    private String i;

    public b(FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar, m<BindStatus> mVar, com.meituan.passport.converter.b bVar) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar, mVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afdadb4bc462ed2102652a5604e952ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afdadb4bc462ed2102652a5604e952ee");
            return;
        }
        this.e = rx.subjects.b.g();
        this.f = mVar;
        this.h = aVar;
        this.g = bVar;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final d<BindStatus> a(ApiException apiException, FragmentActivity fragmentActivity) {
        YodaConfirmData yodaConfirmData;
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183600006ce64b1e24297b44bf29ccd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183600006ce64b1e24297b44bf29ccd4");
        }
        if (apiException.code == 101157 && !TextUtils.isEmpty(apiException.data)) {
            n.a("OauthYodaConfirmErrorResumeHandler.errorResume", "need_yoda_verify", "");
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            try {
                yodaConfirmData = (YodaConfirmData) k.a().b().fromJson((JsonElement) new JsonParser().parse(apiException.data).getAsJsonObject(), (Class<Object>) YodaConfirmData.class);
            } catch (Exception e) {
                com.meituan.passport.utils.m.a(e);
                yodaConfirmData = null;
            }
            if (yodaConfirmData == null || TextUtils.isEmpty(yodaConfirmData.jumpUrl) || TextUtils.isEmpty(yodaConfirmData.param) || TextUtils.isEmpty(yodaConfirmData.succCallbackUrl) || TextUtils.isEmpty(yodaConfirmData.userTicket)) {
                return d.a((Throwable) apiException);
            }
            AccountApi create = AccountApiFactory.getInstance().create();
            e c = q.a().c();
            this.i = Uri.parse(yodaConfirmData.jumpUrl + CommonConstant.Symbol.QUESTION_MARK + yodaConfirmData.param).getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
            if (TextUtils.isEmpty(this.i)) {
                if (this.e != null) {
                    this.e.onCompleted();
                }
            } else if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c, create, yodaConfirmData, fragmentActivity);
                try {
                    com.meituan.android.yoda.d a2 = com.meituan.android.yoda.d.a();
                    a2.c = fragmentActivity.getResources().getString(R.string.passport_confirm_title);
                    a2.b = R.style.PassportYodaStyle;
                    a2.d = fragmentActivity.getResources().getString(R.string.passport_confirm_toast);
                    YodaConfirm.getInstance(fragmentActivity, anonymousClass1).registerBusinessUIConfig(a2).startConfirm(this.i);
                } catch (Exception e2) {
                    return d.a((Throwable) e2);
                }
            }
            if (this.e != null) {
                return this.e.c();
            }
        }
        return d.a((Throwable) apiException);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.oauthlogin.handler.b$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements YodaResponseListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ e b;
        public final /* synthetic */ AccountApi c;
        public final /* synthetic */ YodaConfirmData d;
        public final /* synthetic */ FragmentActivity e;

        public AnonymousClass1(e eVar, AccountApi accountApi, YodaConfirmData yodaConfirmData, FragmentActivity fragmentActivity) {
            this.b = eVar;
            this.c = accountApi;
            this.d = yodaConfirmData;
            this.e = fragmentActivity;
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onYodaResponse(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e69eb5312109aa50e291f17c312d14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e69eb5312109aa50e291f17c312d14");
            } else if (this.b != null) {
                d<String> a2 = this.b.a();
                AccountApi accountApi = this.c;
                YodaConfirmData yodaConfirmData = this.d;
                FragmentActivity fragmentActivity = this.e;
                Object[] objArr2 = {this, accountApi, str2, yodaConfirmData, str, fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                a2.c(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "09237900311b5c32762481820970b2c9", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "09237900311b5c32762481820970b2c9") : new c(this, accountApi, str2, yodaConfirmData, str, fragmentActivity));
            }
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, AccountApi accountApi, String str, YodaConfirmData yodaConfirmData, String str2, FragmentActivity fragmentActivity, String str3) {
            Object[] objArr = {anonymousClass1, accountApi, str, yodaConfirmData, str2, fragmentActivity, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04adc4b61aa6791e017b462e6c7dc934", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04adc4b61aa6791e017b462e6c7dc934");
            } else if (accountApi == null || b.this.e == null) {
            } else {
                final b bVar = b.this;
                final String str4 = yodaConfirmData.userTicket;
                Object[] objArr2 = {str, str4, str2, fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect2 = b.b;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7a8d76021a3b383946b23a03c416d03b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7a8d76021a3b383946b23a03c416d03b");
                    return;
                }
                aj.b(fragmentActivity, "b_group_8qlh2ze6_mv", "c_group_4lnmt8fq", null);
                a aVar = new a(bVar, null);
                aVar.a((a) new l(str, str4, str2));
                aVar.a(fragmentActivity);
                aVar.f = new m<BindStatus>() { // from class: com.meituan.passport.oauthlogin.handler.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.converter.m
                    public final /* synthetic */ void a(BindStatus bindStatus) {
                        BindStatus bindStatus2 = bindStatus;
                        Object[] objArr3 = {bindStatus2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d604b62dc039d13cca3ee2d993f3b716", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d604b62dc039d13cca3ee2d993f3b716");
                            return;
                        }
                        ((y) com.meituan.passport.exception.skyeyemonitor.a.a().a("second_verification")).a((Map<String, Object>) null);
                        if (bindStatus2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bindStatus2.isBinded);
                            n.a("OauthYodaConfirmErrorResumeHandler.sendVerifyLoginRequest", "onSuccess", sb.toString());
                        }
                        if (b.this.f != null) {
                            b.this.f.a(bindStatus2);
                        }
                        b.this.e.onCompleted();
                    }
                };
                aVar.g = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.oauthlogin.handler.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.converter.b
                    public final boolean a(ApiException apiException, boolean z) {
                        Object[] objArr3 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae001149f4f8fcec8b4edc9f0f93fa84", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae001149f4f8fcec8b4edc9f0f93fa84")).booleanValue();
                        }
                        ((y) com.meituan.passport.exception.skyeyemonitor.a.a().a("second_verification")).a(apiException);
                        if (apiException != null) {
                            n.a("OauthYodaConfirmErrorResumeHandler.sendVerifyLoginRequest", "failed", apiException.toString());
                        }
                        if (b.this.g != null) {
                            b.this.g.a(apiException, z);
                        }
                        b.this.e.onError(new ApiException(str4, 1, ""));
                        return false;
                    }
                };
                aVar.b();
            }
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onCancel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01f054f5008ff544a2826271b5f9764", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01f054f5008ff544a2826271b5f9764");
            } else if (b.this.e != null) {
                b.this.e.onCompleted();
            }
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onError(String str, Error error) {
            Object[] objArr = {str, error};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ec8a92bfa8576e4de6b75f09abd06f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ec8a92bfa8576e4de6b75f09abd06f");
            } else if (b.this.e != null) {
                b.this.e.onCompleted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends ag<l, BindStatus> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e565d47b92341d66a4ec78ddeb2268", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e565d47b92341d66a4ec78ddeb2268");
            }
        }

        public /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.meituan.passport.service.ag
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1511f575bc5a4a2e82fdca66bbc51c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1511f575bc5a4a2e82fdca66bbc51c0");
                return;
            }
            FragmentActivity c = c();
            if (c == null || !UserCenter.getInstance(c).isLogin() || b.this.h == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("afterSecondVerify", Boolean.TRUE);
            hashMap.put(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY, ((l) this.e).b.b());
            hashMap.put("userTicket", ((l) this.e).c.b());
            hashMap.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, ((l) this.e).i.b());
            d dVar = null;
            if (TextUtils.equals(b.this.h.b, UserCenter.OAUTH_TYPE_WEIXIN)) {
                dVar = s.b().bindOauthCode(b.this.h.b, b.this.h.e, com.sankuai.meituan.oauth.a.c(c), hashMap);
            } else if (TextUtils.equals(b.this.h.b, UserCenter.OAUTH_TYPE_QQ)) {
                String a2 = q.a().d().a();
                if (TextUtils.isEmpty(a2)) {
                    a2 = com.sankuai.meituan.oauth.a.e(c);
                }
                String str = a2;
                q.a().d();
                dVar = s.b().bind(TextUtils.isEmpty(null) ? b.this.h.b : null, b.this.h.d, b.this.h.c, str, hashMap);
            }
            h a3 = h.a();
            a3.g = b(c);
            h a4 = a3.a(c.getSupportFragmentManager());
            a4.i = dVar;
            a4.a((m) this.f).b();
        }
    }
}
