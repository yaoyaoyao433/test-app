package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ap;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.q;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends b<User> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<User> e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;

    public i(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, String str4) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, str, Integer.valueOf(i), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67c30b13fa098879a9db93814ccdee8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67c30b13fa098879a9db93814ccdee8");
            return;
        }
        this.e = rx.subjects.b.g();
        this.f = str;
        this.g = i;
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<User> a(ApiException apiException, FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6966ecbb520162a53b7197587d7b0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6966ecbb520162a53b7197587d7b0a");
        }
        List asList = Arrays.asList(401, 404, 403, 402, 405);
        if (apiException != null && asList.contains(Integer.valueOf(apiException.code))) {
            Object[] objArr2 = {fragmentActivity, apiException};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "049f3a376861e4294acb0de79a6e0ab4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "049f3a376861e4294acb0de79a6e0ab4");
            } else {
                int i = this.g;
                if (i == 100) {
                    ai.a().b(fragmentActivity, apiException.code);
                } else if (i == 200) {
                    String str = this.h;
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -840075834) {
                        if (hashCode == 2124767295 && str.equals(UserCenter.OAUTH_TYPE_DYNAMIC)) {
                            c = 1;
                        }
                    } else if (str.equals("fast_login")) {
                        c = 0;
                    }
                    switch (c) {
                        case 0:
                            ai.a().b(fragmentActivity, 2, apiException.code);
                            break;
                        case 1:
                            ai.a().a(fragmentActivity, 2, apiException.code);
                            break;
                    }
                } else if (i == 700) {
                    ai.a().b(fragmentActivity, this.h, this.i, apiException.code);
                }
            }
            int i2 = this.g;
            Object[] objArr3 = {apiException, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1067d4efa22934dfffe5c4864027c513", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1067d4efa22934dfffe5c4864027c513");
            } else {
                HashMap hashMap = new HashMap();
                if (apiException != null) {
                    hashMap.put("code", Integer.valueOf(apiException.code));
                    hashMap.put("message", apiException.getMessage());
                    hashMap.put("type", apiException.type);
                }
                if (i2 == 100) {
                    com.meituan.passport.exception.skyeyemonitor.module.a aVar = (com.meituan.passport.exception.skyeyemonitor.module.a) com.meituan.passport.exception.skyeyemonitor.a.a().a("account_login");
                    Object[] objArr4 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.exception.skyeyemonitor.module.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "a871e7844f2eed1361eaa6ea77d2826d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "a871e7844f2eed1361eaa6ea77d2826d");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "account_login", "account_login_passport_exception", "后台返回错误", hashMap);
                    }
                } else if (i2 == 200) {
                    com.meituan.passport.exception.skyeyemonitor.module.k kVar = (com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login");
                    Object[] objArr5 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.passport.exception.skyeyemonitor.module.k.a;
                    if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "f65f1e8530eb8fe4e86d69dff1610e49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "f65f1e8530eb8fe4e86d69dff1610e49");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "dynamic_login", "dynamic_login_passport_exception", "后台返回错误", hashMap);
                    }
                } else if (i2 != 500) {
                    if (i2 == 600) {
                        q qVar = (q) com.meituan.passport.exception.skyeyemonitor.a.a().a("new_share_login");
                        Object[] objArr6 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect6 = q.a;
                        if (PatchProxy.isSupport(objArr6, qVar, changeQuickRedirect6, false, "4e2303cc476058a58820a6835dc6b3bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, qVar, changeQuickRedirect6, false, "4e2303cc476058a58820a6835dc6b3bd");
                        } else {
                            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "new_share_login", "new_share_login_passport_exception", "后台返回错误", hashMap);
                        }
                    }
                } else if (com.meituan.passport.plugins.q.a().j instanceof com.meituan.passport.plugins.k) {
                    com.meituan.passport.exception.skyeyemonitor.module.d dVar = (com.meituan.passport.exception.skyeyemonitor.module.d) com.meituan.passport.exception.skyeyemonitor.a.a().a("chinamobile_meituan_login");
                    Object[] objArr7 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect7 = com.meituan.passport.exception.skyeyemonitor.module.d.a;
                    if (PatchProxy.isSupport(objArr7, dVar, changeQuickRedirect7, false, "a8a636772b31a19194d614d107268b21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, dVar, changeQuickRedirect7, false, "a8a636772b31a19194d614d107268b21");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "chinamobile_meituan_login", "chinamobile_meituan_login_passport_exception", "后台返回错误", hashMap);
                    }
                } else {
                    com.meituan.passport.exception.skyeyemonitor.module.f fVar = (com.meituan.passport.exception.skyeyemonitor.module.f) com.meituan.passport.exception.skyeyemonitor.a.a().a("chinatelecom_meituan_login");
                    Object[] objArr8 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect8 = com.meituan.passport.exception.skyeyemonitor.module.f.a;
                    if (PatchProxy.isSupport(objArr8, fVar, changeQuickRedirect8, false, "09c59064156b55d63795b2e46af9e347", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, fVar, changeQuickRedirect8, false, "09c59064156b55d63795b2e46af9e347");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "chinatelecom_meituan_login", "chinatelecom_meituan_login_passport_exception", "401~405错误", hashMap);
                    }
                }
            }
            p.a().a(fragmentActivity, apiException.code, this.i, this.j);
            p.a().c(fragmentActivity, this.i, this.j, apiException.code);
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            if (this.g == 700) {
                p.a().b(fragmentActivity, this.i, this.j, apiException.code);
            }
            if (!TextUtils.isEmpty(apiException.data)) {
                try {
                    JsonObject asJsonObject = new JsonParser().parse(apiException.data).getAsJsonObject();
                    if (asJsonObject.has("username")) {
                        String asString = asJsonObject.get("username").getAsString();
                        if (!TextUtils.isEmpty(asString)) {
                            this.f = asString;
                        }
                    }
                } catch (Exception e) {
                    com.meituan.passport.utils.m.a(e);
                }
            }
            ap.a().a(fragmentActivity, apiException.code, apiException.getMessage(), this.f, new ap.a() { // from class: com.meituan.passport.handler.resume.i.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.ap.a
                public final void a(boolean z, Throwable th) {
                    Object[] objArr9 = {(byte) 1, null};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "53b5313654bd19877285695b53187b61", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "53b5313654bd19877285695b53187b61");
                    } else if (i.this.e != null) {
                        i.this.e.onCompleted();
                    }
                }
            });
            return rx.d.b();
        }
        return rx.d.a((Throwable) apiException);
    }
}
