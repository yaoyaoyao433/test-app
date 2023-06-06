package com.meituan.mmp.lib.api.user;

import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.lib.router.a;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsUserModule {
    public static a a;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes3.dex */
    public static abstract class AbsAuthorizeFail extends ApiFunction<Empty, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsCheckSession extends ApiFunction<Empty, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetMTUserInfo extends ApiFunction<Empty, GetMTUserInfoResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetPhoneNumber extends ApiFunction<Empty, JSONObject> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetUserInfo extends ApiFunction<GetUserInfoParams, JSONObject> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsLogin extends ApiFunction<LoginParams, LoginResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsMtCheckSession extends ApiFunction<Empty, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsMtLogin extends ApiFunction<Empty, MtLoginResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class GetMTUserInfoResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public MTUserInfo userInfo;
        public String uuid;

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class MTUserInfo extends UserInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public long userId;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class GetUserInfoParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean withCredentials = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LoginParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long timeout = -1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LoginResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String code;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class MtLoginResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String code;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class UserInfo implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String avatarUrl;
        public String city;
        public String country;
        public int gender;
        public String language;
        public String nickName;
        public String province;
        public String token;
        public int userChannel;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AbsMtLogout extends ApiFunction<Empty, Empty> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, Empty empty, IApiCallback iApiCallback) {
            Object[] objArr = {str, empty, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d96abac039f0f0ef514ac97d85ffb62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d96abac039f0f0ef514ac97d85ffb62");
            } else if (isInnerApp() && MMPEnvHelper.getMMPUserCenter() != null) {
                AbsUserModule.a = getAppBrandTask();
                String str2 = null;
                ab pageManager = getPageManager();
                if (pageManager != null && pageManager.e() != null) {
                    str2 = pageManager.e().getPagePath();
                }
                MMPEnvHelper.getMMPUserCenter().a(getAppId(), str2, iApiCallback);
            } else {
                iApiCallback.onFail(codeJson(-1, "not supported"));
            }
        }
    }
}
