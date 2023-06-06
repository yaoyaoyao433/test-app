package com.meituan.passport.handler.resume;

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
import com.meituan.passport.bindphone.BindPhoneActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.y;
import com.meituan.passport.plugins.q;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.YodaConfirmData;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.n;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends b<User> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<User> e;
    com.meituan.passport.converter.m f;
    com.meituan.passport.converter.m g;
    String h;
    String i;
    private String j;
    private boolean k;

    public j(FragmentActivity fragmentActivity, com.meituan.passport.converter.m mVar, com.meituan.passport.converter.m mVar2, String str, String str2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, mVar, mVar2, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482e325298af816225225f2dccd307f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482e325298af816225225f2dccd307f0");
            return;
        }
        this.e = rx.subjects.b.g();
        this.k = false;
        this.f = mVar2;
        this.g = mVar;
        this.h = str;
        this.i = str2;
    }

    public j(FragmentActivity fragmentActivity, com.meituan.passport.converter.m mVar, com.meituan.passport.converter.m mVar2, String str, String str2, boolean z) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, mVar, mVar2, str, str2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d3959de627191713752c3e29c7c8fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d3959de627191713752c3e29c7c8fc");
            return;
        }
        this.e = rx.subjects.b.g();
        this.k = false;
        this.f = mVar2;
        this.g = mVar;
        this.h = str;
        this.i = str2;
        this.k = true;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<User> a(ApiException apiException, FragmentActivity fragmentActivity) {
        YodaConfirmData yodaConfirmData;
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfede375a05dcc8ebd3fc881ba3c1233", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfede375a05dcc8ebd3fc881ba3c1233");
        }
        if (apiException.code == 101157 && !TextUtils.isEmpty(apiException.data)) {
            if (this.k) {
                p.a().a(fragmentActivity, this.h, apiException.code, this.i);
            }
            p.a().a(fragmentActivity, apiException.code, this.h, this.i);
            p.a().c(fragmentActivity, this.h, this.i, 1);
            if (fragmentActivity != null && (fragmentActivity instanceof BindPhoneActivity) && !this.k) {
                p.a().b(fragmentActivity, this.h, this.i, apiException.code);
            }
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            try {
                yodaConfirmData = (YodaConfirmData) com.meituan.passport.k.a().b().fromJson((JsonElement) new JsonParser().parse(apiException.data).getAsJsonObject(), (Class<Object>) YodaConfirmData.class);
            } catch (Exception e) {
                com.meituan.passport.utils.m.a(e);
                yodaConfirmData = null;
            }
            if (yodaConfirmData == null || TextUtils.isEmpty(yodaConfirmData.jumpUrl) || TextUtils.isEmpty(yodaConfirmData.param) || TextUtils.isEmpty(yodaConfirmData.succCallbackUrl) || TextUtils.isEmpty(yodaConfirmData.userTicket)) {
                return rx.d.a((Throwable) apiException);
            }
            AccountApi create = AccountApiFactory.getInstance().create();
            com.meituan.passport.plugins.e c = q.a().c();
            this.j = a(yodaConfirmData.jumpUrl + CommonConstant.Symbol.QUESTION_MARK + yodaConfirmData.param).get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
            if (TextUtils.isEmpty(this.j)) {
                if (this.e != null) {
                    this.e.onCompleted();
                }
            } else if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c, create, yodaConfirmData, fragmentActivity);
                try {
                    com.meituan.android.yoda.d a = com.meituan.android.yoda.d.a();
                    a.c = fragmentActivity.getResources().getString(R.string.passport_confirm_title);
                    a.d = fragmentActivity.getResources().getString(R.string.passport_confirm_toast);
                    a.b = R.style.PassportYodaStyle;
                    YodaConfirm.getInstance(fragmentActivity, anonymousClass1).registerBusinessUIConfig(a).startConfirm(this.j);
                    p.a().a(fragmentActivity, this.h, apiException.code);
                } catch (Exception e2) {
                    return rx.d.a((Throwable) e2);
                }
            }
            if (this.e != null) {
                return this.e.c();
            }
        }
        return rx.d.a((Throwable) apiException);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.handler.resume.j$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements YodaResponseListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.meituan.passport.plugins.e b;
        public final /* synthetic */ AccountApi c;
        public final /* synthetic */ YodaConfirmData d;
        public final /* synthetic */ FragmentActivity e;

        public AnonymousClass1(com.meituan.passport.plugins.e eVar, AccountApi accountApi, YodaConfirmData yodaConfirmData, FragmentActivity fragmentActivity) {
            this.b = eVar;
            this.c = accountApi;
            this.d = yodaConfirmData;
            this.e = fragmentActivity;
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onYodaResponse(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c6847a922637a719752a936d9bcc6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c6847a922637a719752a936d9bcc6e");
                return;
            }
            if (this.b != null) {
                rx.d<String> a2 = this.b.a();
                AccountApi accountApi = this.c;
                YodaConfirmData yodaConfirmData = this.d;
                FragmentActivity fragmentActivity = this.e;
                Object[] objArr2 = {this, accountApi, str2, yodaConfirmData, str, fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect2 = k.a;
                a2.c(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3395737025015e3d703ef41181760d62", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3395737025015e3d703ef41181760d62") : new k(this, accountApi, str2, yodaConfirmData, str, fragmentActivity));
            }
            p.a().a(this.e, j.this.h, 1);
            n.a("YodaConfirmErrorResumeHandler.errorResume", "onYodaResponse", "requestCode is : " + str);
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, AccountApi accountApi, String str, YodaConfirmData yodaConfirmData, String str2, final FragmentActivity fragmentActivity, String str3) {
            Object[] objArr = {anonymousClass1, accountApi, str, yodaConfirmData, str2, fragmentActivity, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0141588f355516bcb7f1c11e0a9fa774", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0141588f355516bcb7f1c11e0a9fa774");
            } else if (accountApi == null || j.this.e == null) {
            } else {
                final j jVar = j.this;
                String str4 = yodaConfirmData.userTicket;
                Object[] objArr2 = {str, str4, str2, fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect2 = j.b;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "74cd69f757df8978a652e9caff3a355d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "74cd69f757df8978a652e9caff3a355d");
                    return;
                }
                w a2 = com.meituan.passport.c.a().a(ai.TYPE_VERIFY_LOGIN);
                a2.a((w) new com.meituan.passport.pojo.request.l(str, str4, str2));
                a2.a(fragmentActivity);
                a2.a(new com.meituan.passport.converter.m<User>() { // from class: com.meituan.passport.handler.resume.j.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.converter.m
                    public final /* synthetic */ void a(User user) {
                        User user2 = user;
                        Object[] objArr3 = {user2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08916db8a32a3921162f858f4ca991d0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08916db8a32a3921162f858f4ca991d0");
                            return;
                        }
                        ((y) com.meituan.passport.exception.skyeyemonitor.a.a().a("second_verification")).a((Map<String, Object>) null);
                        if (j.this.g != null) {
                            if (j.this.g instanceof com.meituan.passport.successcallback.f) {
                                ((com.meituan.passport.successcallback.f) j.this.g).b(false);
                                ((com.meituan.passport.successcallback.f) j.this.g).c(false);
                                ((com.meituan.passport.successcallback.f) j.this.g).d(false);
                            }
                            j.this.g.a(user2);
                            if (j.this.f == null) {
                                com.meituan.passport.utils.q.a(fragmentActivity);
                            }
                        } else {
                            UserCenter.getInstance(fragmentActivity).loginSuccess(user2);
                        }
                        if (j.this.e != null) {
                            j.this.e.onCompleted();
                        }
                    }
                });
                a2.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.handler.resume.j.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.converter.b
                    public final boolean a(ApiException apiException, boolean z) {
                        Object[] objArr3 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96ecb6ef3c1fbf7d95e061c37c13efa3", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96ecb6ef3c1fbf7d95e061c37c13efa3")).booleanValue();
                        }
                        ((y) com.meituan.passport.exception.skyeyemonitor.a.a().a("second_verification")).a(apiException);
                        if (apiException != null) {
                            p.a().a(fragmentActivity, apiException.code, j.this.h, j.this.i);
                        } else {
                            p.a().a(fragmentActivity, -999, j.this.h, j.this.i);
                        }
                        if (j.this.e != null) {
                            j.this.e.onCompleted();
                        }
                        return true;
                    }
                });
                if ((fragmentActivity instanceof com.meituan.passport.m) || (fragmentActivity instanceof BindPhoneActivity)) {
                    a2.b(jVar.f);
                }
                a2.b();
            }
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onCancel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8720c77a006eda677f9a65238c727e6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8720c77a006eda677f9a65238c727e6a");
                return;
            }
            if (j.this.e != null) {
                j.this.e.onCompleted();
            }
            n.a("YodaConfirmErrorResumeHandler.errorResume", "onCancel", "requestCode is : " + str);
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onError(String str, Error error) {
            Object[] objArr = {str, error};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b97a65985dc57b677b175bebe121c28c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b97a65985dc57b677b175bebe121c28c");
                return;
            }
            if (j.this.e != null) {
                j.this.e.onCompleted();
            }
            p.a().a(this.e, j.this.h, error != null ? error.code : -999);
            StringBuilder sb = new StringBuilder("requestCode is : ");
            sb.append(str);
            sb.append(", , error code is : ");
            sb.append(error != null ? Integer.valueOf(error.code) : "error is null");
            n.a("YodaConfirmErrorResumeHandler.errorResume", "onError", sb.toString());
        }
    }

    private Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a38e421a1afa013f107307ac05b0694", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a38e421a1afa013f107307ac05b0694");
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            try {
                String[] split = str.split("\\?", 2);
                if (split.length >= 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split[1]);
                    if (sb.toString().contains("&")) {
                        for (String str2 : sb.toString().split("&")) {
                            String[] split2 = str2.split("=");
                            if (split2.length <= 1) {
                                hashMap.put(URLDecoder.decode(split2[0], "UTF-8"), "");
                            } else {
                                hashMap.put(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                            }
                        }
                    } else {
                        String[] split3 = sb.toString().split("=");
                        if (split3.length <= 1) {
                            hashMap.put(URLDecoder.decode(split3[0], "UTF-8"), "");
                        } else {
                            hashMap.put(URLDecoder.decode(split3[0], "UTF-8"), URLDecoder.decode(split3[1], "UTF-8"));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
