package com.sankuai.waimai.mmp.modules.user;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.lib.api.user.AbsUserModule;
import com.meituan.mmp.lib.router.AppBrandRouterCenter;
import com.meituan.mmp.lib.utils.aa;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.h;
import com.meituan.mmp.main.j;
import com.meituan.mmp.main.k;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.ILogoutCallback;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.m;
import com.sankuai.meituan.retrofit2.o;
import com.sankuai.waimai.platform.domain.manager.user.BaseUserManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WMUserModule extends AbsUserModule implements h {
    public static ChangeQuickRedirect b;
    private static Class<? extends AppBrandHeraActivity> c;

    public static /* synthetic */ Class a(Class cls) {
        c = null;
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MtLogin extends AbsUserModule.AbsMtLogin {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, final IApiCallback iApiCallback) {
            Object[] objArr = {str, empty, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad1bb6f9179e9cf4c0dbad01a57f50c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad1bb6f9179e9cf4c0dbad01a57f50c");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("MtLogin"));
            WMUserModule.a(this, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.MtLogin.1
                public static ChangeQuickRedirect b;

                @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                public final void onSuccess(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4d8ca67180379c0de26428f140f1821", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4d8ca67180379c0de26428f140f1821");
                        return;
                    }
                    User user = UserCenter.getInstance(MtLogin.this.getContext()).getUser();
                    AbsUserModule.MtLoginResult mtLoginResult = new AbsUserModule.MtLoginResult();
                    if (user != null) {
                        mtLoginResult.code = user.token;
                    }
                    MtLogin.this.a(mtLoginResult, iApiCallback);
                }
            });
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7fd51e5a72f5980e21f2f63e360079", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7fd51e5a72f5980e21f2f63e360079");
            } else {
                WMUserModule.a(i, intent, iApiCallback);
            }
        }
    }

    public static void a(ApiFunction<?, ?> apiFunction, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c552791f5d719bf0f5aed3975f7717ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c552791f5d719bf0f5aed3975f7717ff");
            return;
        }
        Context context = apiFunction.getContext();
        c = apiFunction.getAppBrand();
        UserCenter userCenter = UserCenter.getInstance(context);
        a aVar = new a(context, iApiCallback);
        aVar.d = userCenter.loginEventObservable().c(aVar);
        if (userCenter.isLogin()) {
            iApiCallback.onSuccess(null);
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.a(context, new BaseUserManager.b());
        }
    }

    public static void a(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "210bf233bb107ff18f953f0009a68b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "210bf233bb107ff18f953f0009a68b07");
        } else if (-1 == i) {
            iApiCallback.onSuccess(null);
        } else {
            iApiCallback.onFail(null);
        }
    }

    public static void a(final String str, @Nullable final Map<String, String> map, final long j, final ApiFunction<?, ?> apiFunction, final IApiCallback iApiCallback) {
        Object[] objArr = {str, map, new Long(j), apiFunction, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39bcc4a58fab1b4d268e6548f360e712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39bcc4a58fab1b4d268e6548f360e712");
        } else {
            a(apiFunction, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.1
                public static ChangeQuickRedirect b;

                @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                public final void onSuccess(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d693ff9655becc34a647e8a151e6eddd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d693ff9655becc34a647e8a151e6eddd");
                    } else {
                        WMUserModule.b(str, map, j, apiFunction, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.1.1
                            public static ChangeQuickRedirect b;

                            @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                            public final void onSuccess(JSONObject jSONObject2) {
                                Object[] objArr3 = {jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect3 = b;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "853ded70b6f8240f3d609cb73f4cdd59", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "853ded70b6f8240f3d609cb73f4cdd59");
                                } else {
                                    iApiCallback.onSuccess(jSONObject2);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void b(String str, @Nullable Map<String, String> map, long j, ApiFunction<?, ?> apiFunction, final IApiCallback iApiCallback) {
        long j2 = j;
        Object[] objArr = {str, map, new Long(j2), apiFunction, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbacabe00ae042795b49605b60e7931a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbacabe00ae042795b49605b60e7931a");
            return;
        }
        String appId = apiFunction.getAppId();
        if (appId == null) {
            return;
        }
        String token = UserCenter.getInstance(apiFunction.getContext()).getToken();
        String str2 = "https://openapi.meituan.com/mmp" + str;
        o.a aVar = new o.a();
        aVar.a("appid", appId);
        aVar.a("token", token);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        m mVar = new m(j.a(), aa.c.a(false));
        aj.a a2 = new aj.a().b(str2).a("POST").a(aVar.a());
        if (j2 <= 0) {
            j2 = 10000;
        }
        mVar.b = a2.a("retrofit-mt-request-timeout", String.valueOf(j2)).a();
        mVar.a(new f<ap>() { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(@NonNull Call<ap> call, @NonNull Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9977dc3ecce4e823952e325978085b47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9977dc3ecce4e823952e325978085b47");
                } else {
                    IApiCallback.this.onFail(null);
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(@NonNull Call<ap> call, @NonNull Response<ap> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f2e1233ba80ba12b6d8b35f7dc928af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f2e1233ba80ba12b6d8b35f7dc928af");
                    return;
                }
                if (response.f() && response.e() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(response.e().string());
                        if (jSONObject.getInt("code") == 0) {
                            IApiCallback.this.onSuccess(jSONObject);
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.e("requestOpenApi fail: " + response.e().string());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                com.meituan.mmp.lib.trace.b.e("requestOpenApi fail: HTTP status " + response.b());
                IApiCallback.this.onFail(null);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Login extends AbsUserModule.AbsLogin {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsUserModule.LoginParams loginParams, final IApiCallback iApiCallback) {
            AbsUserModule.LoginParams loginParams2 = loginParams;
            Object[] objArr = {str, loginParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc767ff7a394095e5021b32a7b6742c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc767ff7a394095e5021b32a7b6742c");
                return;
            }
            long j = loginParams2.timeout;
            if (j < 0) {
                j = 10000;
            }
            if (j == 0) {
                j = 1;
            }
            WMUserModule.a("/auth/getCode", null, j, this, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.Login.1
                public static ChangeQuickRedirect b;

                @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                public final void onSuccess(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da17a57d2c2a6c8348de7f33b9915b97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da17a57d2c2a6c8348de7f33b9915b97");
                        return;
                    }
                    try {
                        AbsUserModule.LoginResult loginResult = new AbsUserModule.LoginResult();
                        loginResult.code = jSONObject.getJSONObject("data").getString("js_code");
                        Login.this.a(loginResult, iApiCallback);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        iApiCallback.onFail();
                    }
                }
            });
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7becbeb80496215f86136809ec527273", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7becbeb80496215f86136809ec527273");
            } else {
                WMUserModule.a(i, intent, iApiCallback);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GetUserInfo extends AbsUserModule.AbsGetUserInfo {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsUserModule.GetUserInfoParams getUserInfoParams, final IApiCallback iApiCallback) {
            AbsUserModule.GetUserInfoParams getUserInfoParams2 = getUserInfoParams;
            Object[] objArr = {str, getUserInfoParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8acd9545820695ea874460d80a74b86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8acd9545820695ea874460d80a74b86");
            } else if (isInnerApp()) {
                try {
                    a(new JSONObject(com.meituan.mmp.lib.utils.j.b.toJson(WMUserModule.a(this, str, null, iApiCallback))), iApiCallback);
                } catch (JSONException unused) {
                    a(iApiCallback);
                }
            } else {
                Object[] objArr2 = {str, getUserInfoParams2, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6be37746d8d763a56536a44d15ff17aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6be37746d8d763a56536a44d15ff17aa");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("withCredentials", String.valueOf(getUserInfoParams2.withCredentials));
                WMUserModule.a("/api/getUserInfo", hashMap, -1L, this, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.GetUserInfo.1
                    public static ChangeQuickRedirect b;

                    @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                    public final void onSuccess(JSONObject jSONObject) {
                        Object[] objArr3 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8e3c5c3b58bced86fa74fa307d28fce0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8e3c5c3b58bced86fa74fa307d28fce0");
                            return;
                        }
                        try {
                            GetUserInfo.this.a(jSONObject.getJSONObject("data"), iApiCallback);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            ApiFunction.a(iApiCallback);
                        }
                    }
                });
            }
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e766e0aab667728a18d446ccd5a879", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e766e0aab667728a18d446ccd5a879");
            } else {
                WMUserModule.a(i, intent, iApiCallback);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GetMTUserInfo extends AbsUserModule.AbsGetMTUserInfo {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, IApiCallback iApiCallback) {
            Empty empty2 = empty;
            Object[] objArr = {str, empty2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0836b61a7a8513965eddbce0c083bf2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0836b61a7a8513965eddbce0c083bf2a");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("getMTUserInfo"));
            AbsUserModule.GetMTUserInfoResult a = WMUserModule.a(this, str, empty2, iApiCallback);
            if (a == null) {
                a(iApiCallback);
            } else {
                a(a, iApiCallback);
            }
        }
    }

    public static AbsUserModule.GetMTUserInfoResult a(ApiFunction<?, ?> apiFunction, String str, Empty empty, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, str, empty, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32d3ebec759777e4c6a42ad0d30ea249", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsUserModule.GetMTUserInfoResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32d3ebec759777e4c6a42ad0d30ea249");
        }
        UserCenter userCenter = UserCenter.getInstance(apiFunction.getContext());
        if (userCenter.isLogin()) {
            User user = userCenter.getUser();
            k cityController = MMPEnvHelper.getCityController();
            AbsUserModule.GetMTUserInfoResult.MTUserInfo mTUserInfo = new AbsUserModule.GetMTUserInfoResult.MTUserInfo();
            mTUserInfo.nickName = user.username;
            mTUserInfo.avatarUrl = user.avatarurl;
            mTUserInfo.gender = 0;
            if (cityController != null) {
                mTUserInfo.city = cityController.b();
                mTUserInfo.province = cityController.b();
            }
            mTUserInfo.country = "中国";
            mTUserInfo.language = "zh_CN";
            mTUserInfo.token = user.token;
            mTUserInfo.userId = user.id;
            AbsUserModule.GetMTUserInfoResult getMTUserInfoResult = new AbsUserModule.GetMTUserInfoResult();
            getMTUserInfoResult.userInfo = mTUserInfo;
            getMTUserInfoResult.uuid = MMPEnvHelper.getEnvInfo().getUUID();
            return getMTUserInfoResult;
        }
        return null;
    }

    @Override // com.meituan.mmp.main.h
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e155a74bddc710225d75ead39e184cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e155a74bddc710225d75ead39e184cc")).booleanValue() : UserCenter.getInstance(MMPEnvHelper.getContext()).isLogin();
    }

    @Override // com.meituan.mmp.main.h
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62d2406c162b55010f8ce981038ece6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62d2406c162b55010f8ce981038ece6") : UserCenter.getInstance(MMPEnvHelper.getContext()).getToken();
    }

    @Override // com.meituan.mmp.main.h
    public final void a(String str, String str2, final IApiCallback iApiCallback) {
        Object[] objArr = {str, str2, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab76dfd01360ea5bea1045e6cc71d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab76dfd01360ea5bea1045e6cc71d73");
        } else {
            UserCenter.getInstance(MMPEnvHelper.getContext()).negativeLogout(new LogoutInfo("com.sankuai.waimai.platform", new LogoutInfo.MMPData(str, str2), (HashMap<String, String>) null), new ILogoutCallback() { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.api.ILogoutCallback
                public final void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0a8b002c3c9c28be6efe4fa7fe13c83", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0a8b002c3c9c28be6efe4fa7fe13c83");
                        return;
                    }
                    com.meituan.mmp.lib.trace.b.c("MTMMPUserCenter", "log out success");
                    iApiCallback.onSuccess(null);
                }

                @Override // com.meituan.passport.api.ILogoutCallback
                public final void onFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "850b797ed8e2e656469dc01f0f39b5a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "850b797ed8e2e656469dc01f0f39b5a8");
                        return;
                    }
                    com.meituan.mmp.lib.trace.b.c("MTMMPUserCenter", "log out failed");
                    iApiCallback.onFail(AbsApi.codeJson(-1, "log out failed"));
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MtCheckSession extends AbsUserModule.AbsMtCheckSession {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, IApiCallback iApiCallback) {
            Object[] objArr = {str, empty, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce7546d8085ad0fc23ac2a2514043b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce7546d8085ad0fc23ac2a2514043b5");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("mtCheckSession"));
            if (UserCenter.getInstance(getContext()).isLogin()) {
                iApiCallback.onSuccess(null);
            } else {
                iApiCallback.onFail(null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class CheckSession extends AbsUserModule.AbsCheckSession {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, final IApiCallback iApiCallback) {
            Object[] objArr = {str, empty, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de5d8ba75ea7dc0c556b805fe49f5bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de5d8ba75ea7dc0c556b805fe49f5bc");
            } else if (!UserCenter.getInstance(getContext()).isLogin()) {
                iApiCallback.onFail(null);
            } else {
                WMUserModule.b("/auth/checkSessionKey", null, -1L, this, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.CheckSession.1
                    public static ChangeQuickRedirect b;

                    @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                    public final void onSuccess(JSONObject jSONObject) {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7057676d8f4e81042f2d25d8848dd19", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7057676d8f4e81042f2d25d8848dd19");
                            return;
                        }
                        try {
                            if (jSONObject.getJSONObject("data").getInt("status") == 0) {
                                iApiCallback.onSuccess(null);
                                return;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        iApiCallback.onFail();
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class AuthorizeFail extends AbsUserModule.AbsAuthorizeFail {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, IApiCallback iApiCallback) {
            Object[] objArr = {str, empty, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7932700ae6ff40e99d996a6401bd472b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7932700ae6ff40e99d996a6401bd472b");
            } else {
                iApiCallback.onFail(null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GetPhoneNumber extends AbsUserModule.AbsGetPhoneNumber {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, final IApiCallback iApiCallback) {
            Object[] objArr = {str, empty, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88820d70b8c2840097172d1a012da127", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88820d70b8c2840097172d1a012da127");
            } else {
                WMUserModule.a("/api/getPhoneNumber", null, -1L, this, new com.meituan.mmp.lib.api.b(iApiCallback) { // from class: com.sankuai.waimai.mmp.modules.user.WMUserModule.GetPhoneNumber.1
                    public static ChangeQuickRedirect b;

                    @Override // com.meituan.mmp.lib.api.b, com.meituan.mmp.main.IApiCallback
                    public final void onSuccess(JSONObject jSONObject) {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5009d06d9e720ed470f9359adb3afea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5009d06d9e720ed470f9359adb3afea");
                            return;
                        }
                        try {
                            GetPhoneNumber.this.a(jSONObject.getJSONObject("data"), iApiCallback);
                        } catch (Exception e) {
                            e.printStackTrace();
                            iApiCallback.onFail();
                        }
                    }
                });
            }
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6597a2a12ed5806d6e13b26733cc5c30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6597a2a12ed5806d6e13b26733cc5c30");
            } else {
                WMUserModule.a(i, intent, iApiCallback);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a implements rx.functions.b<UserCenter.c> {
        public static ChangeQuickRedirect a;
        public final IApiCallback b;
        public final Context c;
        public rx.k d;

        @Override // rx.functions.b
        public final /* synthetic */ void call(UserCenter.c cVar) {
            UserCenter.c cVar2 = cVar;
            Object[] objArr = {cVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671c50b0caabd70b169467ae6fd580a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671c50b0caabd70b169467ae6fd580a2");
                return;
            }
            if (this.d != null && !this.d.isUnsubscribed()) {
                this.d.unsubscribe();
            }
            if (this.c != null) {
                if (cVar2.b == UserCenter.d.login || cVar2.b == UserCenter.d.update) {
                    UserCenter userCenter = UserCenter.getInstance(this.c);
                    if (userCenter.isLogin()) {
                        User user = userCenter.getUser();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", user.token);
                        } catch (JSONException unused) {
                        }
                        if (this.b != null) {
                            this.b.onSuccess(jSONObject);
                        }
                    } else if (this.b != null) {
                        this.b.onFail(null);
                    }
                } else if (this.b != null) {
                    this.b.onFail(null);
                }
            }
        }

        public a(Context context, IApiCallback iApiCallback) {
            Object[] objArr = {context, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cae5ee4587c46f1ea394681dbc226e7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cae5ee4587c46f1ea394681dbc226e7");
                return;
            }
            this.b = iApiCallback;
            this.c = context;
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3fc0e1cbb50c85d102509262f6969bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3fc0e1cbb50c85d102509262f6969bf");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("UserModule", "addUserChangeAction");
        UserCenter.getInstance(MMPEnvHelper.getContext()).loginEventObservable().c(new b());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class b implements rx.functions.b<UserCenter.c> {
        public static ChangeQuickRedirect a;

        @Override // rx.functions.b
        public final /* synthetic */ void call(UserCenter.c cVar) {
            UserCenter.c cVar2 = cVar;
            Object[] objArr = {cVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12e6993066839d7a42451a020f3669d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12e6993066839d7a42451a020f3669d");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("UserModule", "LogoutLoginAction.call " + cVar2.b.toString());
            if (cVar2.b == UserCenter.d.logout || cVar2.b == UserCenter.d.login) {
                AppBrandRouterCenter.a(WMUserModule.a);
            }
            WMUserModule.a(null);
        }
    }
}
