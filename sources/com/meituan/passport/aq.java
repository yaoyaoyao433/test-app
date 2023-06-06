package com.meituan.passport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.passport.api.ILogoutCallback;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aq {
    public static ChangeQuickRedirect a;
    private static aq c;
    final Context b;

    public static synchronized aq a(Context context) {
        synchronized (aq.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d96aaaed3b284dc2696f5a1482866cec", RobustBitConfig.DEFAULT_VALUE)) {
                return (aq) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d96aaaed3b284dc2696f5a1482866cec");
            }
            if (c == null) {
                c = new aq(context);
            }
            return c;
        }
    }

    private aq(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b13e872a243afaf5987983a106a71d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b13e872a243afaf5987983a106a71d");
        } else if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e254b36400b081cefda019f48d355a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e254b36400b081cefda019f48d355a");
            return;
        }
        final UserCenter userCenter = UserCenter.getInstance(this.b);
        if (!userCenter.isLogin()) {
            if (b.a()) {
                throw new IllegalStateException("User do not login");
            }
            return;
        }
        final String str = userCenter.getUser().token;
        final WeakReference weakReference = new WeakReference(activity);
        com.meituan.passport.utils.s.b().updateUser(str, User.ALL_USER_FIELDS_KEYS).a(new com.sankuai.meituan.retrofit2.f<User>() { // from class: com.meituan.passport.aq.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<User> call, Response<User> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6483a973087e0311c5f6c8c171d46f11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6483a973087e0311c5f6c8c171d46f11");
                    return;
                }
                if ((response == null || !response.f() || response.e() == null) ? false : true) {
                    User e = response.e();
                    e.token = str;
                    aq aqVar = aq.this;
                    Object[] objArr3 = {e};
                    ChangeQuickRedirect changeQuickRedirect3 = aq.a;
                    if (PatchProxy.isSupport(objArr3, aqVar, changeQuickRedirect3, false, "d3b3d76272408ea18f0226e0d64f330a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aqVar, changeQuickRedirect3, false, "d3b3d76272408ea18f0226e0d64f330a");
                    } else {
                        UserCenter.getInstance(aqVar.b).updateUserInfo(e);
                    }
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<User> call, Throwable th) {
                ApiException apiException;
                final Activity activity2;
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5671430b63186c7182d078ab2c1e54d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5671430b63186c7182d078ab2c1e54d6");
                    return;
                }
                if (th instanceof ApiException) {
                    apiException = (ApiException) th;
                } else {
                    apiException = (th == null || !(th.getCause() instanceof ApiException)) ? null : (ApiException) th.getCause();
                }
                if (apiException == null || (activity2 = (Activity) weakReference.get()) == null) {
                    return;
                }
                final int i = apiException.code;
                final String message = apiException.getMessage();
                if (i <= 400 || i >= 406 || activity2.isFinishing() || !userCenter.isLogin()) {
                    return;
                }
                LogoutInfo logoutInfo = new LogoutInfo("com.meituan.passport", new LogoutInfo.NativeUrlData("user/info", i), (HashMap<String, String>) null);
                final ap a2 = ap.a();
                Object[] objArr3 = {activity2, Integer.valueOf(i), message, logoutInfo};
                ChangeQuickRedirect changeQuickRedirect3 = ap.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b72dffbec0990ea074fb1140790c71a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b72dffbec0990ea074fb1140790c71a8");
                    return;
                }
                com.meituan.passport.utils.r.a().b = com.meituan.passport.utils.r.a().a(a2.getClass().getName());
                Object[] objArr4 = {activity2, Integer.valueOf(i), message, null, logoutInfo};
                ChangeQuickRedirect changeQuickRedirect4 = ap.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "b4b1a79b8a2c157fcdf14ebb7e60f1f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "b4b1a79b8a2c157fcdf14ebb7e60f1f5");
                    return;
                }
                if (TextUtils.isEmpty(com.meituan.passport.utils.r.a().b)) {
                    com.meituan.passport.utils.r.a().b = com.meituan.passport.utils.r.a().a(a2.getClass().getName());
                }
                UserCenter userCenter2 = UserCenter.getInstance(activity2);
                final String str2 = userCenter2.isLogin() ? userCenter2.getUser().username : null;
                if (userCenter2.isLogin()) {
                    userCenter2.negativeLogout(logoutInfo, new ILogoutCallback() { // from class: com.meituan.passport.ap.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.passport.api.ILogoutCallback
                        public final void onFailed() {
                        }

                        @Override // com.meituan.passport.api.ILogoutCallback
                        public final void onSuccess() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "084df139f8b2f6485a0d9bf877db329a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "084df139f8b2f6485a0d9bf877db329a");
                            } else {
                                ap.this.a(activity2, i, message, str2, r6);
                            }
                        }
                    });
                }
            }
        });
    }
}
