package com.meituan.passport;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.passport.api.CheckLogoutServiceProvider;
import com.meituan.passport.api.ICallbackBase;
import com.meituan.passport.api.ILogoutCallback;
import com.meituan.passport.api.ReportExChangeLoginProvider;
import com.meituan.passport.pojo.ExchangeableUser;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.LogoutResult;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class UserCenter {
    public static volatile Context APPCONTEXT = null;
    private static final int INITLOGINTYPE = -1;
    public static final int LOGIN_TYPE_BINDED_OAUTH = 700;
    public static final int LOGIN_TYPE_CHINA_MOBILE = 500;
    public static final int LOGIN_TYPE_DYNAMIC = 200;
    public static final int LOGIN_TYPE_FACE = 800;
    public static final int LOGIN_TYPE_NEW_SSO = 600;
    public static final int LOGIN_TYPE_NORMAL = 100;
    public static final int LOGIN_TYPE_SSO = 400;
    public static final int LOGIN_TYPE_UNION = 300;
    public static final String OAUTH_TYPE_ACCOUNT = "account";
    public static final String OAUTH_TYPE_CHINA_MOBILE = "password_free";
    public static final String OAUTH_TYPE_DYNAMIC = "dynamic";
    public static final String OAUTH_TYPE_QQ = "tencent";
    public static final String OAUTH_TYPE_UNIQUE = "same_account";
    public static final String OAUTH_TYPE_WEIXIN = "weixin";
    public static final int TYPE_LOGOUT_NEGATIVE = 20000;
    public static final int TYPE_LOGOUT_POSITIVE = 10000;
    public static final int TYPE_LOGOUT_SUB_PROCESS = 30000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile UserCenter sInstance;
    private final Context context;
    public final rx.subjects.b<c> eventPublishSubject;
    public volatile int loginType;
    private List<a> updateCookieListeners;
    private volatile User user;
    private volatile boolean userInited;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LoginType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LogoutType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(List<Map<String, Object>> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum d {
        login,
        cancel,
        logout,
        update;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0ef8a111e3c3b5cd3f2df2bf200f2d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0ef8a111e3c3b5cd3f2df2bf200f2d");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faea30d8d60f245af8f17152c4ce57da", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faea30d8d60f245af8f17152c4ce57da") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ee7e91fb36e77fe8986fbfaf1c7c09d", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ee7e91fb36e77fe8986fbfaf1c7c09d") : (d[]) values().clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends Exception {
        public b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public final d b;
        public final User c;

        public c(d dVar, User user) {
            Object[] objArr = {dVar, user};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9525c13f8b630764fa36e3cc0db27695", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9525c13f8b630764fa36e3cc0db27695");
                return;
            }
            this.b = dVar;
            this.c = user;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777ffd42d78dcb11c386215382aa47c4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777ffd42d78dcb11c386215382aa47c4")).booleanValue();
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return UserCenter.objectEquals(cVar.b, this.b) && UserCenter.objectEquals(cVar.c, this.c);
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae019167e32f10715843008e61db421", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae019167e32f10715843008e61db421")).intValue() : super.hashCode();
        }
    }

    public static synchronized UserCenter getInstance(@NonNull Context context) {
        synchronized (UserCenter.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04cec873a7ec3f2f388268942cca402b", RobustBitConfig.DEFAULT_VALUE)) {
                return (UserCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04cec873a7ec3f2f388268942cca402b");
            }
            if (sInstance == null) {
                sInstance = new UserCenter(context);
            }
            return sInstance;
        }
    }

    public UserCenter(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2445fce9baeb9e6ec55f33d5c6ffa0b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2445fce9baeb9e6ec55f33d5c6ffa0b2");
            return;
        }
        this.eventPublishSubject = rx.subjects.b.g();
        this.loginType = -1;
        this.updateCookieListeners = new ArrayList();
        if (context != null && context.getApplicationContext() != null) {
            this.context = context.getApplicationContext();
        } else {
            this.context = com.meituan.android.singleton.b.a();
        }
        if (APPCONTEXT == null) {
            APPCONTEXT = this.context;
        }
    }

    @Deprecated
    public final rx.d<User> userObservable(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf9e90ea80eceb61e9cb1e53471c2774", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf9e90ea80eceb61e9cb1e53471c2774");
        }
        WeakReference weakReference = new WeakReference(activity);
        Object[] objArr2 = {this, weakReference};
        ChangeQuickRedirect changeQuickRedirect3 = aj.a;
        return rx.d.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b8baf4e9a14d405a0a8463b09051fc04", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b8baf4e9a14d405a0a8463b09051fc04") : new aj(this, weakReference));
    }

    public static /* synthetic */ void lambda$userObservable$1(UserCenter userCenter, WeakReference weakReference, rx.j jVar) {
        Object[] objArr = {userCenter, weakReference, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e4a26be87326c593429af523b8ea0ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e4a26be87326c593429af523b8ea0ec");
        } else if (jVar.isUnsubscribed()) {
        } else {
            if (userCenter.getUser() == null) {
                rx.d<c> a2 = userCenter.eventPublishSubject.a(1);
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = ak.a;
                rx.functions.b<? super c> akVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1e9b16e066404b1f1ecc425a3888f32f", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1e9b16e066404b1f1ecc425a3888f32f") : new ak(jVar);
                jVar.getClass();
                Object[] objArr3 = {jVar};
                ChangeQuickRedirect changeQuickRedirect4 = al.a;
                rx.functions.b<Throwable> alVar = PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "766f9bc8a85d49f4c917e60412bb1488", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "766f9bc8a85d49f4c917e60412bb1488") : new al(jVar);
                jVar.getClass();
                Object[] objArr4 = {jVar};
                ChangeQuickRedirect changeQuickRedirect5 = am.a;
                jVar.add(a2.a(akVar, alVar, PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "c1824c194723cfa20567019b93e47262", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "c1824c194723cfa20567019b93e47262") : new am(jVar)));
                userCenter.startLoginActivity(weakReference);
                return;
            }
            jVar.onNext(userCenter.user);
            jVar.onCompleted();
        }
    }

    public static /* synthetic */ void lambda$null$0(rx.j jVar, c cVar) {
        Object[] objArr = {jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e9bda8bb08c1591f819851b6d1034f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e9bda8bb08c1591f819851b6d1034f9");
        } else if (cVar.b == d.login) {
            jVar.onNext(cVar.c);
            jVar.onCompleted();
        } else {
            jVar.onError(new b());
        }
    }

    private void startLoginActivity(WeakReference<Activity> weakReference) {
        Object[] objArr = {weakReference};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7136efd064b1ff2fe182c6f3919dc871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7136efd064b1ff2fe182c6f3919dc871");
            return;
        }
        Activity activity = weakReference.get();
        if (activity != null) {
            Intent intent = new Intent("com.meituan.android.intent.action.login");
            intent.setPackage(activity.getPackageName());
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            }
        }
    }

    public final void startLoginActivity(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c25426e448eb6dd4cdc277e4f513611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c25426e448eb6dd4cdc277e4f513611");
        } else {
            startLoginActivity(context, null);
        }
    }

    public final void startLoginActivity(Context context, Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d59e403638ff5fe9e340b128136ee61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d59e403638ff5fe9e340b128136ee61d");
        } else if (context != null) {
            Intent intent = new Intent("com.meituan.android.intent.action.login");
            intent.setPackage(context.getPackageName());
            if (!(context instanceof Activity)) {
                intent.setFlags(com.tencent.mapsdk.internal.y.a);
            }
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent, bundle);
            }
        }
    }

    public final void setMultiProcessUser(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92380896c2b8cd19b33a6043ae6b774b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92380896c2b8cd19b33a6043ae6b774b");
        } else if (ProcessUtils.isMainProcess(this.context)) {
        } else {
            this.user = user;
        }
    }

    public final void setUser(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b83fad4d1dde8b025e4e1032182328e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b83fad4d1dde8b025e4e1032182328e5");
        } else if (user != null) {
            this.user = user;
            this.eventPublishSubject.onNext(new c(d.login, user));
            updateCookies();
            com.meituan.passport.utils.n.a("UserCenter.setUser-DianPing", "setUser succeed, user is", user.toString());
        } else {
            com.meituan.passport.utils.n.a("UserCenter.setUser-DianPing", "fail to setUser", "user is null");
        }
    }

    public final void updateUser(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64ef6be4708298963cb49be350f151fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64ef6be4708298963cb49be350f151fc");
        } else if (user != null) {
            this.user = user;
            this.eventPublishSubject.onNext(new c(d.update, user));
            updateCookies();
            com.meituan.passport.utils.n.a("UserCenter.updateUser-DianPing", "updateUser succeed, user is:", user.toString());
        } else {
            com.meituan.passport.utils.n.a("UserCenter.updateUser-DianPing", "fail to updateUser, because user is null", "");
        }
    }

    public final void logOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17f93f2985d5cfc216ae43ad7ae4983f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17f93f2985d5cfc216ae43ad7ae4983f");
        } else if (this.user != null) {
            this.user = null;
            this.eventPublishSubject.onNext(new c(d.logout, null));
            updateCookies();
            com.meituan.passport.utils.n.a("UserCenter.logOut-DianPing", "logOut succeed", "user is null now");
        } else {
            com.meituan.passport.utils.n.a("UserCenter.logOut-DianPing", "fail to logout", "user is null");
        }
    }

    public final void cancelLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfce37f0dcaaa0fd78a3dd915584b106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfce37f0dcaaa0fd78a3dd915584b106");
            return;
        }
        this.eventPublishSubject.onNext(new c(d.cancel, null));
        com.meituan.passport.utils.n.a("UserCenter.cancelLogin-DianPing", "login has been cancelled", "");
    }

    public final rx.d<c> loginEventObservable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff219ca8eca86936fef177c7460d681e", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff219ca8eca86936fef177c7460d681e") : this.eventPublishSubject.c();
    }

    public final boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ec5343496156b4f4b77ea15c2329e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ec5343496156b4f4b77ea15c2329e5")).booleanValue();
        }
        User user = getUser();
        return (user == null || TextUtils.isEmpty(user.token)) ? false : true;
    }

    public final User getUser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6108c1d966ac39a88fbe40a9a429ecab", RobustBitConfig.DEFAULT_VALUE)) {
            return (User) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6108c1d966ac39a88fbe40a9a429ecab");
        }
        if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.utils.n.a("UserCenter.getUser-DianPing", "user is: ", this.user != null ? this.user.toString() : "");
            return this.user;
        }
        userInit();
        return this.user;
    }

    public final String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af23a1bbf2a2778a9d389a1fd7037091", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af23a1bbf2a2778a9d389a1fd7037091");
        }
        User user = getUser();
        return (user == null || !isLogin()) ? "" : user.token;
    }

    public final long getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08f8725b9825bdea62c7fba97f725f6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08f8725b9825bdea62c7fba97f725f6b")).longValue();
        }
        User user = getUser();
        if (user == null || !isLogin()) {
            return -1L;
        }
        return user.id;
    }

    public final int getLoginType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee4f6a41adc10edf42156d18efda2ef7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee4f6a41adc10edf42156d18efda2ef7")).intValue();
        }
        if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.utils.n.a("UserCenter.getLoginType-DianPing", "loginType is: ", String.valueOf(this.loginType));
            return this.loginType;
        }
        userInit();
        return this.loginType;
    }

    public final void loginSuccess(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bce998a49760052736008fe69666c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bce998a49760052736008fe69666c64");
        } else {
            loginSuccess(user, 100);
        }
    }

    public final void loginSuccess(final User user, int i) {
        List list;
        ReportExChangeLoginProvider reportExChangeLoginProvider;
        Object[] objArr = {user, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c243904babb553ad7ae3838a05648e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c243904babb553ad7ae3838a05648e2");
        } else if (user == null) {
            if (com.meituan.passport.utils.f.a()) {
                throw new IllegalArgumentException("user cannot be null");
            }
        } else {
            User user2 = this.user;
            Object[] objArr2 = {user2, user};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.utils.ah.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "f8c1e1e3b49d2e6ccfd74b94ffcb7b29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "f8c1e1e3b49d2e6ccfd74b94ffcb7b29");
            } else {
                try {
                    list = com.sankuai.meituan.serviceloader.b.a(ReportExChangeLoginProvider.class, "passport.exchange.report", new Object[0]);
                } catch (Exception unused) {
                    list = null;
                }
                if (!CollectionUtils.isEmpty(list) && list.size() > 0 && (reportExChangeLoginProvider = (ReportExChangeLoginProvider) list.get(0)) != null) {
                    reportExChangeLoginProvider.reportExChangeableUserLogin(user2, user);
                }
            }
            this.user = user;
            this.loginType = i;
            com.meituan.passport.utils.n.a("UserCenter.loginSuccess", "loginSuccess, user info is:", String.valueOf(user.id));
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.passport.UserCenter.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cb1ffe57dcde434765008a9fa9fb3008", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cb1ffe57dcde434765008a9fa9fb3008");
                        } else {
                            UserCenter.this.eventPublishSubject.onNext(new c(d.login, user));
                        }
                    }
                });
            } else {
                this.eventPublishSubject.onNext(new c(d.login, user));
            }
            Context context = this.context;
            Object[] objArr3 = {context, user, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.sso.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "bb81b29e39b5a3d134d574f228005d5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "bb81b29e39b5a3d134d574f228005d5e");
            } else if (user != null) {
                Object[] objArr4 = {context, user, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.passport.sso.a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "0fd325a8b4cae02804ae89a2c7ccb224", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "0fd325a8b4cae02804ae89a2c7ccb224");
                } else if (user != null) {
                    String a2 = new com.meituan.passport.plugins.c().a(k.a().b().toJson(user));
                    com.meituan.android.cipstorage.q c2 = com.meituan.passport.sso.a.c(context);
                    if (c2 != null) {
                        com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.writeToPassportPersistence", "setUser, user.mobile: " + user.mobile, String.valueOf(c2.a("user", a2)));
                        com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.writeToPassportPersistence", "setLoginType: ", String.valueOf(c2.a("loginType", i)));
                    }
                }
                com.meituan.passport.sso.a.a(context, user.token, user.id);
            }
            com.meituan.passport.sso.a.a(this.context, user.mobile, user.avatarurl);
            updateCookies();
        }
    }

    public final synchronized void addUpdateCookieListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15d0c1ee06fa369cf32f60a2fb35e9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15d0c1ee06fa369cf32f60a2fb35e9c6");
            return;
        }
        if (aVar != null && !this.updateCookieListeners.contains(aVar)) {
            this.updateCookieListeners.add(aVar);
        }
    }

    public final synchronized void removeUpdateCookieListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec5fcd5b53c2a0cdeda3a9fc416b6085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec5fcd5b53c2a0cdeda3a9fc416b6085");
            return;
        }
        if (aVar != null && this.updateCookieListeners.contains(aVar)) {
            this.updateCookieListeners.remove(aVar);
        }
    }

    public final synchronized void updateCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f9f5298891e07bccc827521dae1f00a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f9f5298891e07bccc827521dae1f00a");
            return;
        }
        if (!CollectionUtils.isEmpty(this.updateCookieListeners)) {
            List<Map<String, Object>> cookies = getCookies();
            for (a aVar : this.updateCookieListeners) {
                aVar.a(cookies);
            }
        }
        if (this.context != null) {
            final Context context = this.context;
            final String packageName = this.context.getPackageName();
            Object[] objArr2 = {context, packageName};
            ChangeQuickRedirect changeQuickRedirect3 = af.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "e4cb10a9f66affc17b2f81d664bd8240", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "e4cb10a9f66affc17b2f81d664bd8240");
                return;
            }
            com.sankuai.android.jarvis.c.a("multi_process_notify", new Runnable() { // from class: com.meituan.passport.af.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f9d4afb3aa2d7202c6a517d72f861dd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f9d4afb3aa2d7202c6a517d72f861dd0");
                        return;
                    }
                    com.meituan.passport.utils.n.a("PassportContentProviderUtils.notifyUserChanged.run", "Jarvis.newThread created", null);
                    try {
                        Uri a2 = PassportContentProvider.a(packageName, 1);
                        if (context != null) {
                            com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(context, "com.meituan.passport");
                            if (createContentResolver != null) {
                                createContentResolver.a(a2, (ContentValues) null, (String) null, (String[]) null);
                                com.meituan.passport.utils.n.a("PassportContentProviderUtils.notifyUserChanged.run", "update", null);
                            } else {
                                com.meituan.passport.utils.n.a("PassportContentProviderUtils.notifyUserChanged.run", "contentResolver is null", null);
                            }
                        }
                        System.out.println("multi_process_notify");
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        }
    }

    public final List<Map<String, Object>> getCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b82d22ea8861cc37cac30b1b50cb27cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b82d22ea8861cc37cac30b1b50cb27cc");
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("name", "mt_c_token");
        hashMap.put("value", this.user == null ? "" : this.user.token);
        arrayList.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", "token");
        hashMap2.put("value", this.user == null ? "" : this.user.token);
        arrayList.add(hashMap2);
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void updateUserInfo(final User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "555340ab19c3aa9108530b495ce102e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "555340ab19c3aa9108530b495ce102e5");
        } else if (!isLogin()) {
            if (com.meituan.passport.utils.f.a()) {
                throw new IllegalStateException("User do not login");
            }
        } else {
            this.user = user;
            j a2 = j.a();
            Object[] objArr2 = {user};
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "877572a603f3d1199d07185b4d602d1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "877572a603f3d1199d07185b4d602d1b");
            } else {
                com.meituan.passport.utils.n.a("ExchangeableUserManager.updateExChangeableUser-User", "user is: ", user != null ? String.valueOf(user.id) : "");
                if (user != null) {
                    ExchangeableUser exchangeableUser = new ExchangeableUser();
                    exchangeableUser.phoneNum = user.mobile;
                    exchangeableUser.userId = user.id;
                    exchangeableUser.userName = user.username;
                    exchangeableUser.avatarUrl = user.avatarurl;
                    a2.a(exchangeableUser);
                }
            }
            com.meituan.passport.utils.n.a("UserCenter.updateUserInfo", "current user is:", String.valueOf(user.id));
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.passport.UserCenter.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "67206a4c7b3a443bc40afb609f7f1a92", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "67206a4c7b3a443bc40afb609f7f1a92");
                        } else {
                            UserCenter.this.eventPublishSubject.onNext(new c(d.update, user));
                        }
                    }
                });
            } else {
                this.eventPublishSubject.onNext(new c(d.update, user));
            }
            com.meituan.passport.sso.a.a(this.context, user);
            updateCookies();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void loginCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41e43b5dc025e40ff90b9966260293bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41e43b5dc025e40ff90b9966260293bd");
            return;
        }
        this.loginType = -1;
        com.meituan.passport.utils.n.a("UserCenter.loginCancel", "loginCancel", null);
        this.eventPublishSubject.onNext(new c(d.cancel, null));
    }

    @Deprecated
    public final void logout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cf458c6202fd2ad50ed4927cb4fd495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cf458c6202fd2ad50ed4927cb4fd495");
        } else if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.plugins.w.a().b.logout();
            this.user = null;
            updateCookies();
        } else if (isLogin()) {
            sendLogoutBroadcast(getToken(), TYPE_LOGOUT_NEGATIVE, null);
            setLogoutCaller();
            setLogoutStatus();
        }
    }

    @Deprecated
    public final void logout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acfb578ce7b798795799a00ce7067703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acfb578ce7b798795799a00ce7067703");
        } else if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.plugins.w.a().b.logout();
            this.user = null;
            updateCookies();
        } else if (isLogin()) {
            if (i != 10000) {
                setLogoutCaller();
            }
            sendLogoutBroadcast(getToken(), i, null);
            setLogoutStatus();
        }
    }

    public final void positiveLogout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "598d70f7c224522c6c3f117554763227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "598d70f7c224522c6c3f117554763227");
        } else if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.plugins.w.a().b.logout();
            this.user = null;
            updateCookies();
        } else if (isLogin()) {
            sendLogoutBroadcast(getToken(), 10000, null);
            setLogoutStatus();
            com.meituan.passport.utils.n.a("UserCenter.positiveLogout", "", "");
        }
    }

    public final void subProcessLogout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73eb862489dc940e8175c9b45166e792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73eb862489dc940e8175c9b45166e792");
        } else if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.plugins.w.a().b.logout();
            this.user = null;
            updateCookies();
        } else if (isLogin()) {
            sendLogoutBroadcast(getToken(), 30000, null);
            this.loginType = -1;
            this.user = null;
            this.eventPublishSubject.onNext(new c(d.logout, null));
            updateCookies();
            com.meituan.passport.utils.n.a("UserCenter.subProcessLogout", "", "");
        }
    }

    public final void negativeLogout(final LogoutInfo logoutInfo, final ILogoutCallback iLogoutCallback) {
        List list;
        Object[] objArr = {logoutInfo, iLogoutCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46b9cf84f022d2299ec9eaf6af1ac750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46b9cf84f022d2299ec9eaf6af1ac750");
        } else if (com.meituan.passport.plugins.w.a().b != null) {
            com.meituan.passport.plugins.w.a().b.logout();
            this.user = null;
            updateCookies();
        } else if (isLogin()) {
            com.meituan.passport.utils.n.a("UserCenter.negativeLogout", "isLogin", "");
            String token = getToken();
            ICallbackBase<LogoutResult> iCallbackBase = new ICallbackBase<LogoutResult>() { // from class: com.meituan.passport.UserCenter.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.api.ICallbackBase
                public final /* synthetic */ void onSuccess(LogoutResult logoutResult) {
                    LogoutResult logoutResult2 = logoutResult;
                    Object[] objArr2 = {logoutResult2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "045d8c4a12e4079d38727c00b280727b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "045d8c4a12e4079d38727c00b280727b");
                    } else if (logoutResult2 != null && logoutResult2.code == 0) {
                        com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onSuccess", "should not logout", "code is 0");
                        if (UserCenter.this.isLogin()) {
                            if (iLogoutCallback != null) {
                                iLogoutCallback.onFailed();
                            }
                            com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onSuccess", "should not logout", "is login");
                            return;
                        }
                        if (iLogoutCallback != null) {
                            iLogoutCallback.onSuccess();
                        }
                        com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onSuccess", "should not logout", "is not login");
                    } else if (UserCenter.this.isLogin()) {
                        UserCenter.this.sendLogoutBroadcast(UserCenter.this.getToken(), UserCenter.TYPE_LOGOUT_NEGATIVE, logoutInfo);
                        UserCenter.this.setLogoutCaller();
                        UserCenter.this.setLogoutStatus();
                        com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onSuccess", "is login", "logout");
                        if (iLogoutCallback != null) {
                            iLogoutCallback.onSuccess();
                        }
                        final Context context = UserCenter.this.context;
                        Object[] objArr3 = {context};
                        ChangeQuickRedirect changeQuickRedirect4 = af.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "24a97f41e41d2bd8c1b7151662aaef67", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "24a97f41e41d2bd8c1b7151662aaef67");
                        } else if (ProcessUtils.isMainProcess(context) || context == null) {
                        } else {
                            com.sankuai.android.jarvis.c.a("multi_process_notify", new Runnable() { // from class: com.meituan.passport.af.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "7f1d6a46dfbd57016b7168ec8c3f4f5b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "7f1d6a46dfbd57016b7168ec8c3f4f5b");
                                        return;
                                    }
                                    try {
                                        com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(context, "com.meituan.passport");
                                        Uri a2 = PassportContentProvider.a(context.getPackageName(), 3);
                                        ContentValues contentValues = new ContentValues();
                                        if (createContentResolver != null) {
                                            createContentResolver.a(a2, contentValues, (String) null, (String[]) null);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }).start();
                        }
                    } else {
                        if (iLogoutCallback != null) {
                            iLogoutCallback.onSuccess();
                        }
                        com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onSuccess", "is not login", "");
                    }
                }

                @Override // com.meituan.passport.api.ICallbackBase
                public final void onFailed(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8f5f93084d0d87d91d65c206bc14e94f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8f5f93084d0d87d91d65c206bc14e94f");
                    } else if (UserCenter.this.isLogin()) {
                        UserCenter.this.sendLogoutBroadcast(UserCenter.this.getToken(), UserCenter.TYPE_LOGOUT_NEGATIVE, logoutInfo);
                        UserCenter.this.setLogoutCaller();
                        UserCenter.this.setLogoutStatus();
                        if (iLogoutCallback != null) {
                            iLogoutCallback.onSuccess();
                        }
                        com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onFailed", "is login", "logout");
                    } else {
                        if (iLogoutCallback != null) {
                            iLogoutCallback.onSuccess();
                        }
                        com.meituan.passport.utils.n.a("UserCenter.negativeLogout.onFailed", "is not login", "");
                    }
                }
            };
            Object[] objArr2 = {token, logoutInfo, iCallbackBase};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.utils.ah.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d8ce642b9b738ebf9e65110334ac2e89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d8ce642b9b738ebf9e65110334ac2e89");
                return;
            }
            try {
                list = com.sankuai.meituan.serviceloader.b.a(CheckLogoutServiceProvider.class, "passport.check.logout.service", new Object[0]);
            } catch (Exception unused) {
                list = null;
            }
            if (!CollectionUtils.isEmpty(list) && list.size() > 0) {
                CheckLogoutServiceProvider checkLogoutServiceProvider = (CheckLogoutServiceProvider) list.get(0);
                if (checkLogoutServiceProvider != null) {
                    checkLogoutServiceProvider.canLogoutAsync(token, logoutInfo, iCallbackBase);
                    return;
                }
                return;
            }
            iCallbackBase.onFailed(null);
        } else {
            if (iLogoutCallback != null) {
                iLogoutCallback.onSuccess();
            }
            com.meituan.passport.utils.n.a("UserCenter.negativeLogout", "is not login", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoutCaller() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61537b15271322b158bde16f8f7df0cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61537b15271322b158bde16f8f7df0cc");
        } else if (TextUtils.isEmpty(com.meituan.passport.utils.r.a().b)) {
            com.meituan.passport.utils.r.a().b = com.meituan.passport.utils.r.a().a(getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoutStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b33814a852d7e1333613536bf68d95a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b33814a852d7e1333613536bf68d95a");
            return;
        }
        j.a().a(getUserId());
        this.loginType = -1;
        this.user = null;
        com.meituan.passport.utils.n.a("UserCenter.setLogoutStatus", "logout", "user is null");
        this.eventPublishSubject.onNext(new c(d.logout, null));
        Context context = this.context;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.sso.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "ff59062be908318e0fd95bb91120dcbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "ff59062be908318e0fd95bb91120dcbd");
        } else {
            com.meituan.android.cipstorage.q c2 = com.meituan.passport.sso.a.c(context);
            if (c2 != null) {
                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.removeFromPersistence", "removeUser", String.valueOf(c2.b("user")));
                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.removeFromPersistence", "removeLoginType", String.valueOf(c2.b("loginType")));
            }
            com.meituan.android.cipstorage.q a2 = com.meituan.passport.sso.a.a(context);
            if (a2 != null) {
                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.removeFromPersistence", "removeUpdateTime", String.valueOf(a2.b("KEY_PASSPORT_LAST_UPDATE_TIME")));
                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.removeFromPersistence", "removeToken", String.valueOf(a2.b("KEY_PASSPORT_USER_TOKEN")));
                com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.removeFromPersistence", "removeAppName", String.valueOf(a2.b("KEY_PASSPORT_USER_APPNAME")));
            }
        }
        updateCookies();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLogoutBroadcast(String str, int i, @Nullable LogoutInfo logoutInfo) {
        Object[] objArr = {str, Integer.valueOf(i), logoutInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8aeb84db307eec6e9d7a33a7c5e7b46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8aeb84db307eec6e9d7a33a7c5e7b46");
            return;
        }
        Intent intent = new Intent("com.meituan.passport.action.logout");
        intent.putExtra("extra_token", str);
        intent.putExtra("extra_type", i);
        intent.putExtra("extra_logout_info", logoutInfo);
        if (this.context != null) {
            intent.setPackage(this.context.getPackageName());
            LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
            com.meituan.passport.utils.n.a("UserCenter.sendLogoutBroadcast", "send logout broadcast", "context is not null");
        }
        StringBuilder sb = new StringBuilder("extra_token is: ");
        sb.append(str);
        sb.append(", extra_type is: ");
        sb.append(i);
        sb.append(", extra_logout_info is: ");
        sb.append(logoutInfo != null ? logoutInfo.toString() : "NULL");
        com.meituan.passport.utils.n.a("UserCenter.sendLogoutBroadcast", "send logout broadcast", sb.toString());
    }

    private void userInit() {
        Pair<User, Integer> d2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f7ff2b7ded0834b55c5b481ce93761e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f7ff2b7ded0834b55c5b481ce93761e");
        } else if (this.userInited) {
        } else {
            com.meituan.passport.utils.n.a("UserCenter.userInit", "user init state: ", String.valueOf(this.userInited));
            if (this.user == null && (d2 = com.meituan.passport.sso.a.d(this.context)) != null) {
                this.user = (User) d2.first;
                this.loginType = ((Integer) d2.second).intValue();
            }
            com.sankuai.android.jarvis.c.a("passport_exchange_init", new Runnable() { // from class: com.meituan.passport.UserCenter.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09c9e7c5dfd40af47f32571825d070a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09c9e7c5dfd40af47f32571825d070a4");
                        return;
                    }
                    j a2 = j.a();
                    User user = UserCenter.this.user;
                    Object[] objArr3 = {user};
                    ChangeQuickRedirect changeQuickRedirect4 = j.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "efd4362ba314f6cdea2cc5765f04d8ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "efd4362ba314f6cdea2cc5765f04d8ea");
                        return;
                    }
                    com.meituan.passport.utils.n.a("ExchangeableUserManager.initExchangeUserList", "user is: ", user != null ? String.valueOf(user.id) : "");
                    a2.b = com.meituan.passport.sso.a.a(3);
                    a2.a(user);
                }
            }).start();
            this.userInited = true;
            if (this.user != null) {
                com.meituan.passport.utils.n.a("UserCenter.userInit", "userInit, user: " + this.user.id, "true");
                return;
            }
            com.meituan.passport.utils.n.a("UserCenter.userInit", "userInit, user: null", "false");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean objectEquals(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "547cf032987de005e74719ec42e1e6a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "547cf032987de005e74719ec42e1e6a6")).booleanValue();
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
