package com.meituan.passport.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.api.ICallbackBase;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.LogoutPath;
import com.meituan.passport.pojo.ResetTokenData;
import com.meituan.passport.pojo.Result;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af {
    public static ChangeQuickRedirect a;

    static com.meituan.android.cipstorage.q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4979fb58a749c5deeb545978d4e31dc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4979fb58a749c5deeb545978d4e31dc7");
        }
        if (context != null) {
            return com.meituan.android.cipstorage.q.a(context, "homepage_passport", 2);
        }
        return null;
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e153c4a932435c18ff2abe8c899fc19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e153c4a932435c18ff2abe8c899fc19");
            return;
        }
        com.meituan.android.cipstorage.q a2 = a(context);
        if (a2 != null) {
            a2.a("report_count", i);
        }
    }

    public static void a(Context context, User user, int i) {
        String str;
        Object[] objArr = {context, user, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07e4d9f3d6933840c35c9e9e4a0b36d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07e4d9f3d6933840c35c9e9e4a0b36d1");
        } else if (user == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("token", user.token);
            hashMap.put("reporttype", String.valueOf(i));
            try {
                str = OneIdHandler.getInstance(context).getLocalOneId();
            } catch (Exception unused) {
                str = "";
            }
            hashMap.put("unionid", str);
            com.sankuai.android.jarvis.c.a("thread-reportUserLoginInfo", new AnonymousClass1(hashMap, i, context, user, str)).start();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.utils.af$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ User e;
        public final /* synthetic */ String f;

        public AnonymousClass1(Map map, int i, Context context, User user, String str) {
            this.b = map;
            this.c = i;
            this.d = context;
            this.e = user;
            this.f = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f9c5ef052a16ce3b1aebf43218d3f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f9c5ef052a16ce3b1aebf43218d3f2");
                return;
            }
            final String f = s.f();
            if (TextUtils.isEmpty(f)) {
                return;
            }
            final String g = s.g();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.passport.utils.af.1.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5e1e0b10de54d282bd5d8c5ecea5f49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5e1e0b10de54d282bd5d8c5ecea5f49");
                        return;
                    }
                    s.e().reportLoginInfo(f, g, AnonymousClass1.this.b).a(new com.sankuai.meituan.retrofit2.f<Result>() { // from class: com.meituan.passport.utils.af.1.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onResponse(Call<Result> call, Response<Result> response) {
                            Object[] objArr3 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5bd62ca75a578278ae7412087eef2af", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5bd62ca75a578278ae7412087eef2af");
                                return;
                            }
                            if (((response == null || !response.f() || response.e() == null) ? false : true) && AnonymousClass1.this.c == 1) {
                                Context context = AnonymousClass1.this.d;
                                String str = AnonymousClass1.this.e.mobile;
                                Object[] objArr4 = {context, str};
                                ChangeQuickRedirect changeQuickRedirect4 = af.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8db00ec757fb15474d6cba2abc32d0ac", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8db00ec757fb15474d6cba2abc32d0ac");
                                } else {
                                    com.meituan.android.cipstorage.q a2 = af.a(context);
                                    if (a2 != null) {
                                        a2.a("report_status" + str, true);
                                    }
                                }
                                af.a(AnonymousClass1.this.d, 0);
                            }
                        }

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onFailure(Call<Result> call, Throwable th) {
                            int i = 0;
                            Object[] objArr3 = {call, th};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d5011327b74ca64b5761d240d4b30108", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d5011327b74ca64b5761d240d4b30108");
                            } else if (AnonymousClass1.this.c == 1) {
                                Context context = AnonymousClass1.this.d;
                                Object[] objArr4 = {context};
                                ChangeQuickRedirect changeQuickRedirect4 = af.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "12e54d38fb58bce74d0e0d8f16c09191", RobustBitConfig.DEFAULT_VALUE)) {
                                    i = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "12e54d38fb58bce74d0e0d8f16c09191")).intValue();
                                } else {
                                    com.meituan.android.cipstorage.q a2 = af.a(context);
                                    if (a2 != null) {
                                        i = a2.b("report_count", 0);
                                    }
                                }
                                af.a(AnonymousClass1.this.d, i + 1);
                            }
                        }
                    });
                    n.a("ReportLogInfoUtils.reportUserLoginInfo", "unionId is: ", "unionId: " + AnonymousClass1.this.f);
                }
            });
        }
    }

    public static void a(final com.meituan.passport.pojo.request.h hVar, final ICallbackBase<ResetTokenData> iCallbackBase) {
        Object[] objArr = {hVar, iCallbackBase};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e51c035531afc0c24041a667911be75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e51c035531afc0c24041a667911be75");
        } else {
            com.sankuai.android.jarvis.c.a("thread-reportUserLogoutInfo", new Runnable() { // from class: com.meituan.passport.utils.af.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    PassportConfig d;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3e661eeb323d0d4c6f51d2b574e44fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3e661eeb323d0d4c6f51d2b574e44fb");
                        return;
                    }
                    String f = s.f();
                    if (TextUtils.isEmpty(f)) {
                        return;
                    }
                    Call<ResetTokenData> reportLogoutInfo = s.e().reportLogoutInfo(f, s.g(), com.meituan.passport.pojo.request.h.this.c());
                    n.a("ReportLogInfoUtils.requestResetToken", "start to report", "");
                    reportLogoutInfo.a(new com.sankuai.meituan.retrofit2.f<ResetTokenData>() { // from class: com.meituan.passport.utils.af.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onResponse(Call<ResetTokenData> call, Response<ResetTokenData> response) {
                            Object[] objArr3 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "10384acc18a65ccb52c57da7fa62739c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "10384acc18a65ccb52c57da7fa62739c");
                            } else if (response == null || response.e() == null || !response.f()) {
                            } else {
                                ResetTokenData e = response.e();
                                if (iCallbackBase != null) {
                                    iCallbackBase.onSuccess(e);
                                }
                            }
                        }

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onFailure(Call<ResetTokenData> call, Throwable th) {
                            Object[] objArr3 = {call, th};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9d437b66109696f549310d16394df4d5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9d437b66109696f549310d16394df4d5");
                                return;
                            }
                            Utils.a(getClass(), th);
                            if (iCallbackBase != null) {
                                iCallbackBase.onFailed(th);
                            }
                        }
                    });
                    PassportConfig.a s = PassportConfig.s();
                    Object[] objArr3 = {null};
                    ChangeQuickRedirect changeQuickRedirect3 = PassportConfig.a.a;
                    if (PatchProxy.isSupport(objArr3, s, changeQuickRedirect3, false, "7cdd0748aec03b4d4e55b63dffd1b1d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PassportConfig.a aVar = (PassportConfig.a) PatchProxy.accessDispatch(objArr3, s, changeQuickRedirect3, false, "7cdd0748aec03b4d4e55b63dffd1b1d5");
                    } else {
                        d = PassportConfig.d();
                        PassportConfig.a(d, (ArrayDeque) null);
                        T t = s.b;
                    }
                    n.a("ReportLogInfoUtils.reportUserLogoutInfo", "unionId is: ", "unionId: " + com.meituan.passport.pojo.request.h.this.c);
                }
            }).start();
        }
    }

    public static String a(@Nullable LogoutInfo logoutInfo) {
        Object[] objArr = {logoutInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "621535ab3ca0eec5ab54260ec9a0f496", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "621535ab3ca0eec5ab54260ec9a0f496");
        }
        ArrayDeque<LogoutPath> k = PassportConfig.k();
        LogoutPath[] logoutPathArr = new LogoutPath[5];
        if (k != null && !k.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                logoutPathArr[i] = k.pollFirst();
                if (k.isEmpty()) {
                    break;
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                LogoutPath logoutPath = logoutPathArr[i2];
                if (logoutPath != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("receiveTime", logoutPath.receiveTime);
                    jSONObject2.put("path", logoutPath.path);
                    jSONObject2.put("code", logoutPath.code);
                    jSONArray.put(jSONObject2);
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        jSONObject.put("pathArray", jSONArray);
        jSONObject.put("methodDetail", r.a().b);
        jSONObject.put("isMainProcess", ProcessUtils.isMainProcess(com.meituan.android.singleton.b.a()));
        if (logoutInfo != null) {
            jSONObject.put("componentName", logoutInfo.getComponentName());
            jSONObject.put("logoutScenes", logoutInfo.getLogoutScene());
            jSONObject.put("extraInfo", logoutInfo.getLogoutExtraInfo());
        }
        return jSONObject.toString();
    }
}
