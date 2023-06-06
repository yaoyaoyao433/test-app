package com.meituan.passport;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.pojo.Result;
import com.meituan.passport.pojo.User;
import com.meituan.passport.sso.SSOInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class an {
    public static ChangeQuickRedirect a;
    static Context b;
    static UserCenter d;
    private static an f;
    volatile User c;
    AccountApi e;

    public static synchronized an a() {
        synchronized (an.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32b3fb26d9431d82ee83e3f53828dc94", RobustBitConfig.DEFAULT_VALUE)) {
                return (an) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32b3fb26d9431d82ee83e3f53828dc94");
            }
            if (f == null) {
                f = new an();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "eabdcd556b2c86c11d735eb9da483d12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "eabdcd556b2c86c11d735eb9da483d12");
            } else {
                if (b == null) {
                    b = com.meituan.android.singleton.b.a();
                }
                if (d == null) {
                    d = UserCenter.getInstance(b);
                }
            }
            return f;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.an$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.meituan.passport.pojo.request.c b;

        public AnonymousClass2(com.meituan.passport.pojo.request.c cVar) {
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f53c875e2c634bf480d065b2a9febb4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f53c875e2c634bf480d065b2a9febb4");
                return;
            }
            com.meituan.passport.utils.n.a("UserCenterImpl.refreshToken", "Jarvis.newThread created ", null);
            final String f = com.meituan.passport.utils.s.f();
            if (TextUtils.isEmpty(f)) {
                com.meituan.passport.utils.n.a("UserCenterImpl.refreshToken", "fingerPrint is null", null);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.passport.an.2.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "271254dfc950a258d3be5bb3e3bc6068", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "271254dfc950a258d3be5bb3e3bc6068");
                            return;
                        }
                        Call<Result> refeshToken = an.this.e.refeshToken(AnonymousClass2.this.b.c(), an.this.c.token, f);
                        com.meituan.passport.utils.n.a("UserCenterImpl.refreshToken", "current token is : " + an.this.c.token, "start to refresh");
                        refeshToken.a(new com.sankuai.meituan.retrofit2.f<Result>() { // from class: com.meituan.passport.an.2.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<Result> call, Response<Result> response) {
                                SSOInfo sSOInfo;
                                Object[] objArr3 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b463ff01991a34c76f3980d78e0e94c8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b463ff01991a34c76f3980d78e0e94c8");
                                    return;
                                }
                                SSOInfo sSOInfo2 = null;
                                com.meituan.passport.utils.n.a("UserCenterImpl.refreshToken", "refreshToken succeed", null);
                                if ((response == null || !response.f() || response.e() == null) ? false : true) {
                                    Result e = response.e();
                                    if (!TextUtils.isEmpty(e.getToken())) {
                                        an anVar = an.this;
                                        String token = e.getToken();
                                        Object[] objArr4 = {token};
                                        ChangeQuickRedirect changeQuickRedirect4 = an.a;
                                        if (PatchProxy.isSupport(objArr4, anVar, changeQuickRedirect4, false, "92da45222014e10afa8cd2803b02a49f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, anVar, changeQuickRedirect4, false, "92da45222014e10afa8cd2803b02a49f");
                                            return;
                                        } else if (anVar.c == null) {
                                            com.meituan.passport.utils.n.a("UserCenterImpl.updateToken", "user is null", "return");
                                            return;
                                        } else {
                                            anVar.c.token = token;
                                            com.meituan.passport.utils.n.a("UserCenterImpl.updateToken", "token updates successfully, the new token is : ", token);
                                            com.meituan.passport.utils.n.a("UserCenterImpl.updateToken", "token updates successfully, UserCenter token is : ", UserCenter.getInstance(an.b).getUser() != null ? UserCenter.getInstance(an.b).getUser().token : "");
                                            Context context = an.b;
                                            User user = anVar.c;
                                            Object[] objArr5 = {context, user};
                                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.passport.sso.a.a;
                                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1b07ca6683046abc3d304223b565437d", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1b07ca6683046abc3d304223b565437d");
                                            } else {
                                                com.meituan.passport.sso.a.a(context, user);
                                                Object[] objArr6 = {context, user};
                                                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.passport.sso.a.a;
                                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "b6abbc90b72157c87bae96508b0b431e", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "b6abbc90b72157c87bae96508b0b431e");
                                                } else if (user != null) {
                                                    com.meituan.passport.plugins.c cVar = new com.meituan.passport.plugins.c();
                                                    com.meituan.android.cipstorage.q a2 = com.meituan.passport.sso.a.a(context);
                                                    if (a2 != null && a2.a("KEY_PASSPORT_USER_ID", com.meituan.android.cipstorage.u.f) && a2.b("KEY_PASSPORT_USER_ID", 0L) == user.id) {
                                                        com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.updateSSOToken", "updateToken, token:" + user.token, String.valueOf(a2.a("KEY_PASSPORT_USER_TOKEN", cVar.a(user.token))));
                                                        com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.updateSSOToken", "tokenUpdateTime, time:" + System.currentTimeMillis(), String.valueOf(a2.a("KEY_PASSPORT_LAST_UPDATE_TIME", System.currentTimeMillis())));
                                                    } else {
                                                        com.meituan.passport.sso.a.a(context, user.token, user.id);
                                                    }
                                                }
                                            }
                                            an.d.eventPublishSubject.onNext(new UserCenter.c(UserCenter.d.update, anVar.c));
                                            an.d.updateCookies();
                                            com.meituan.passport.utils.af.a(an.b, anVar.c, 1);
                                            return;
                                        }
                                    }
                                    an anVar2 = an.this;
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = an.a;
                                    if (PatchProxy.isSupport(objArr7, anVar2, changeQuickRedirect7, false, "3abca4ba72124f1f4657465e01ce9cf4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, anVar2, changeQuickRedirect7, false, "3abca4ba72124f1f4657465e01ce9cf4");
                                    } else if (com.meituan.passport.sso.a.b(an.b) == 0) {
                                        Context context2 = an.b;
                                        Object[] objArr8 = {context2};
                                        ChangeQuickRedirect changeQuickRedirect8 = com.meituan.passport.sso.a.a;
                                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "c372a5a48a25faa2d140929884046911", RobustBitConfig.DEFAULT_VALUE)) {
                                            sSOInfo2 = (SSOInfo) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "c372a5a48a25faa2d140929884046911");
                                        } else {
                                            com.meituan.passport.plugins.c cVar2 = new com.meituan.passport.plugins.c();
                                            com.meituan.android.cipstorage.q a3 = com.meituan.passport.sso.a.a(context2);
                                            if (a3 != null) {
                                                String b = a3.b("KEY_PASSPORT_USER_TOKEN", "");
                                                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.getFromPersistence", "get sso token, token: ", b);
                                                if (cVar2.c(b)) {
                                                    b = cVar2.b(b);
                                                }
                                                sSOInfo = new SSOInfo(b, a3.b("KEY_PASSPORT_USER_APPNAME", ""), a3.b("KEY_PASSPORT_USER_ID", 0L));
                                            } else {
                                                sSOInfo = null;
                                            }
                                            if (sSOInfo == null || sSOInfo.isEmptyToken()) {
                                                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.getFromPersistence", "get ssoInfo, ssoInfo: ", StringUtil.NULL);
                                            } else {
                                                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.getFromPersistence", "get ssoInfo, ssoInfo: ", "appName: " + sSOInfo.appName + ",userid: " + sSOInfo.id);
                                                sSOInfo2 = sSOInfo;
                                            }
                                        }
                                        if (sSOInfo2 == null) {
                                            com.meituan.passport.sso.a.a(an.b, anVar2.c.token, anVar2.c.id);
                                        }
                                    }
                                }
                            }

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onFailure(Call<Result> call, Throwable th) {
                                Object[] objArr3 = {call, th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "523a30a4025933f59fab068e57855982", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "523a30a4025933f59fab068e57855982");
                                } else {
                                    com.meituan.passport.utils.n.a("UserCenterImpl.refreshToken", "refreshToken failed, exception message = ", th != null ? th.getMessage() : "throwable is null");
                                }
                            }
                        });
                    }
                });
            }
        }
    }
}
