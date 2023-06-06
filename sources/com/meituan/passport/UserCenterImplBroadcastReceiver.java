package com.meituan.passport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.google.gson.Gson;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.passport.LoginActivity;
import com.meituan.passport.api.ICallbackBase;
import com.meituan.passport.pojo.H5Result;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.ResetTokenData;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UserCenterImplBroadcastReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        List list;
        boolean z;
        LoginActivity.c cVar;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2cc7d71f30fe7624f04affc2c986256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2cc7d71f30fe7624f04affc2c986256");
        } else if (context == null || intent == null || intent.getAction() == null) {
        } else {
            String action = intent.getAction();
            final an a2 = an.a();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1006907407) {
                if (hashCode != -842027902) {
                    if (hashCode == -558835872 && action.equals("KNB.Channel.Account.SetUserInfo")) {
                        c = 2;
                    }
                } else if (action.equals("com.meituan.passport.action.logout")) {
                    c = 0;
                }
            } else if (action.equals("com.meituan.passport.action.init.user")) {
                c = 1;
            }
            H5Result h5Result = null;
            switch (c) {
                case 0:
                    com.meituan.passport.utils.n.a("UserCenterImplBroadcastReceiver.onReceive", "receive logout action", action);
                    Object[] objArr2 = {intent};
                    ChangeQuickRedirect changeQuickRedirect2 = an.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "cf95d24334b2f21b406bb23031d98c37", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "cf95d24334b2f21b406bb23031d98c37");
                        return;
                    }
                    int a3 = com.sankuai.waimai.platform.utils.f.a(intent, "extra_type", (int) UserCenter.TYPE_LOGOUT_NEGATIVE);
                    if (a3 != 30000) {
                        String a4 = com.sankuai.waimai.platform.utils.f.a(intent, "extra_token");
                        LogoutInfo logoutInfo = (LogoutInfo) intent.getParcelableExtra("extra_logout_info");
                        Object[] objArr3 = {Integer.valueOf(a3), logoutInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = an.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8dd2ecc185e59c68554c748346f863b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8dd2ecc185e59c68554c748346f863b9");
                        } else if (a3 == 10000) {
                            com.meituan.passport.exception.skyeyemonitor.module.o oVar = (com.meituan.passport.exception.skyeyemonitor.module.o) com.meituan.passport.exception.skyeyemonitor.a.a().a("passport_logout");
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.exception.skyeyemonitor.module.o.a;
                            if (PatchProxy.isSupport(objArr4, oVar, changeQuickRedirect4, false, "b56cc9db29e5d1e9d793540e012bf555", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, oVar, changeQuickRedirect4, false, "b56cc9db29e5d1e9d793540e012bf555");
                            } else {
                                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "passport_logout", "passport_logout_normal", null);
                            }
                        } else if (a3 == 20000) {
                            com.meituan.passport.utils.aj.b(a2, "b_ishbbb3n", "c_4zobz6dy");
                            HashMap hashMap = new HashMap();
                            hashMap.put("type", Integer.valueOf((int) UserCenter.TYPE_LOGOUT_NEGATIVE));
                            hashMap.put("extra_logout_info", logoutInfo != null ? logoutInfo.toString() : "logoutInfo is null");
                            com.meituan.passport.exception.skyeyemonitor.module.o oVar2 = (com.meituan.passport.exception.skyeyemonitor.module.o) com.meituan.passport.exception.skyeyemonitor.a.a().a("passport_logout");
                            Object[] objArr5 = {hashMap};
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.passport.exception.skyeyemonitor.module.o.a;
                            if (PatchProxy.isSupport(objArr5, oVar2, changeQuickRedirect5, false, "959a0f210a337ed155cdc699751a94cf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, oVar2, changeQuickRedirect5, false, "959a0f210a337ed155cdc699751a94cf");
                            } else {
                                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "passport_logout", "passport_logout_abnormal", "被动退登", hashMap);
                            }
                        }
                        com.meituan.passport.utils.n.a("UserCenterImpl.doLogout", "needs reporting", logoutInfo != null ? logoutInfo.toString() : StringUtil.NULL);
                        Object[] objArr6 = {a4, Integer.valueOf(a3), logoutInfo};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.passport.utils.af.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "3b111260451d2d612c91d0fd698befc7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "3b111260451d2d612c91d0fd698befc7");
                        } else {
                            com.meituan.passport.pojo.request.h hVar = new com.meituan.passport.pojo.request.h();
                            hVar.b = com.meituan.passport.clickaction.d.a(a4);
                            String str = "";
                            try {
                                str = OneIdHandler.getInstance(com.meituan.android.singleton.b.a()).getLocalOneId();
                            } catch (Exception unused) {
                            }
                            hVar.c = com.meituan.passport.clickaction.d.a(str);
                            hVar.h = com.meituan.passport.clickaction.d.a(Integer.valueOf(a3));
                            hVar.i = com.meituan.passport.clickaction.d.a(com.meituan.passport.utils.af.a(logoutInfo));
                            com.meituan.passport.utils.af.a(hVar, new ICallbackBase<ResetTokenData>() { // from class: com.meituan.passport.utils.af.2
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.passport.api.ICallbackBase
                                public final /* synthetic */ void onSuccess(ResetTokenData resetTokenData) {
                                    Object[] objArr7 = {resetTokenData};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a0353627f2c8dd8ce54c2b85e3fe73d9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a0353627f2c8dd8ce54c2b85e3fe73d9");
                                        return;
                                    }
                                    n.a("ReportLogInfoUtils.reportUserLogoutInfo.onSuccess", "", "");
                                    r.a().b = null;
                                }

                                @Override // com.meituan.passport.api.ICallbackBase
                                public final void onFailed(Throwable th) {
                                    Object[] objArr7 = {th};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e7ec5ea89d01486ba98fbc92a06cb355", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e7ec5ea89d01486ba98fbc92a06cb355");
                                    } else {
                                        n.a("ReportLogInfoUtils.reportUserLogoutInfo.onFailed", "exception is: ", th != null ? th.getMessage() : "");
                                    }
                                }
                            });
                        }
                    }
                    if (ProcessUtils.isMainProcess(an.b)) {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = an.a;
                        if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "c1caa46c5407d9761c4c33fda07cfa74", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "c1caa46c5407d9761c4c33fda07cfa74");
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(DeviceInfo.USER_ID, String.valueOf(an.d.getUserId()));
                            com.meituan.passport.exception.monitor.b.a().a("logout", "passport_logout", hashMap2);
                        }
                        Object[] objArr8 = {an.b};
                        ChangeQuickRedirect changeQuickRedirect8 = com.meituan.passport.utils.ag.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "edeac5be9164b0bbb9c60e3f344197d0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "edeac5be9164b0bbb9c60e3f344197d0");
                            cVar = null;
                            z = false;
                        } else {
                            try {
                                list = com.sankuai.meituan.serviceloader.b.a(com.meituan.passport.interfaces.a.class, "passport.facelogin", new Object[0]);
                            } catch (Exception unused2) {
                                list = null;
                            }
                            if (CollectionUtils.isEmpty(list) || list.size() <= 0) {
                                z = false;
                            } else {
                                z = false;
                                list.get(0);
                            }
                            cVar = null;
                        }
                        com.meituan.passport.utils.ag.a(cVar);
                        com.meituan.passport.utils.o.a().a(z);
                        return;
                    }
                    return;
                case 1:
                    com.meituan.passport.utils.n.a("UserCenterImplBroadcastReceiver.onReceive", "receive init user action", action);
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = an.a;
                    if (PatchProxy.isSupport(objArr9, a2, changeQuickRedirect9, false, "65fe1ce98b221f482c4f17d06d937f39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, a2, changeQuickRedirect9, false, "65fe1ce98b221f482c4f17d06d937f39");
                        return;
                    }
                    com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.passport.an.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "e33e8620e6e234d9c02ef7242f3088e6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "e33e8620e6e234d9c02ef7242f3088e6");
                                return;
                            }
                            com.meituan.passport.exception.monitor.b.a(an.b);
                            com.meituan.passport.service.e.a().a(an.b);
                        }
                    });
                    a2.c = an.d.getUser();
                    if (a2.c == null) {
                        com.meituan.passport.utils.n.a("UserCenterImpl.userInit", "user init: user is null", "return");
                        return;
                    }
                    com.meituan.passport.utils.n.a("UserCenterImpl.userInit", "user init: user isn't null", "user init continues");
                    if (System.currentTimeMillis() - com.meituan.passport.sso.a.b(an.b) >= 2592000000L) {
                        com.meituan.passport.utils.n.a("UserCenterImpl.userInit", "token hasn't been updated for more than 30 days", "needs updating");
                        new Handler(Looper.getMainLooper()).post(ao.a(a2));
                        return;
                    }
                    com.meituan.passport.utils.n.a("UserCenterImpl.userInit", "token's updated for less than 30 days", "needs no updating");
                    return;
                case 2:
                    com.meituan.passport.utils.n.a("UserCenterImplBroadcastReceiver.onReceive", "receive webview action", action);
                    Object[] objArr10 = {intent};
                    ChangeQuickRedirect changeQuickRedirect10 = an.a;
                    if (PatchProxy.isSupport(objArr10, a2, changeQuickRedirect10, false, "664ff38f047c5d3f7b15b893accb6dc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, a2, changeQuickRedirect10, false, "664ff38f047c5d3f7b15b893accb6dc5");
                        return;
                    }
                    String sharedValue = StorageUtil.getSharedValue(an.b, "Channel.Account.SetUserInfo");
                    com.meituan.passport.utils.n.a("UserCenterImpl.doKNBLoginSuccess", "the user information is: ", sharedValue);
                    if (TextUtils.isEmpty(sharedValue)) {
                        return;
                    }
                    try {
                        a2.c = (User) new Gson().fromJson(sharedValue, (Class<Object>) User.class);
                    } catch (Exception unused3) {
                        a2.c = null;
                    }
                    if (a2.c != null) {
                        com.meituan.passport.utils.n.a("UserCenterImpl.doKNBLoginSuccess", "the user is: ", String.valueOf(a2.c.id));
                        try {
                            h5Result = (H5Result) new Gson().fromJson(intent.getExtras().get("data").toString(), (Class<Object>) H5Result.class);
                        } catch (Exception unused4) {
                        }
                        if (h5Result != null && h5Result.isLogin) {
                            com.meituan.passport.utils.n.a("UserCenterImpl.doKNBLoginSuccess", "is login", "");
                            an.d.loginSuccess(a2.c, 200);
                            com.meituan.passport.utils.af.a(an.b, a2.c, 2);
                            return;
                        }
                        com.meituan.passport.utils.n.a("UserCenterImpl.doKNBLoginSuccess", "is not login", "");
                        an.d.updateUserInfo(a2.c);
                        return;
                    }
                    com.meituan.passport.utils.n.a("UserCenterImpl.doKNBLoginSuccess", "the user is: ", null);
                    return;
                default:
                    return;
            }
        }
    }
}
