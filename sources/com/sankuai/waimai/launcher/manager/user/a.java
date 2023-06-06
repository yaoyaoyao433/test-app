package com.sankuai.waimai.launcher.manager.user;

import android.app.Application;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.singleton.i;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.plugins.g;
import com.meituan.passport.plugins.h;
import com.meituan.passport.plugins.m;
import com.meituan.passport.plugins.q;
import com.meituan.passport.plugins.v;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.t;
import com.sankuai.waimai.business.user.api.user.request.AccountReq;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.kit.login.user.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static boolean c;

    public static /* synthetic */ void a(UserCenter.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9690cbbe177caf3a999f047c3231d053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9690cbbe177caf3a999f047c3231d053");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("UserController", "send a loginevent broadcast", new Object[0]);
        com.sankuai.waimai.business.knb.api.b.a(com.meituan.android.singleton.b.a, dVar);
    }

    public static /* synthetic */ void a(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f0cc2b8397af1871160d7a289dc3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f0cc2b8397af1871160d7a289dc3cc");
        } else if (user != null) {
            boolean z = com.sankuai.waimai.business.user.api.user.a.d;
            Object[] objArr2 = {user, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0850f36bfe20df87a1038ce89c008ebe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0850f36bfe20df87a1038ce89c008ebe");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("UserController", "bindUser, isSmsVerified = %s", Boolean.valueOf(z));
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AccountReq) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AccountReq.class)).bindUser(user.token, String.valueOf(z ? 1 : 0)), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.launcher.manager.user.a.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f8d613f9335071b2ef09179ecc4e64d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f8d613f9335071b2ef09179ecc4e64d");
                        } else if (baseResponse == null) {
                            a();
                        } else {
                            try {
                                new com.sankuai.waimai.platform.capacity.network.errorhanding.d().a(baseResponse.code, baseResponse.msg);
                                if (baseResponse.code == 0) {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7d53a71b3dfc3da6dd9daba5015a8099", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7d53a71b3dfc3da6dd9daba5015a8099");
                                        return;
                                    }
                                    com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.LOGIN);
                                    com.sankuai.waimai.kit.login.user.c.a().a(b.a.LOGIN);
                                    return;
                                }
                            } catch (Exception unused) {
                            }
                            a();
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "26bdafd84f64d8e8d8b6a3b284e97fb7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "26bdafd84f64d8e8d8b6a3b284e97fb7");
                            return;
                        }
                        com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.BIND_FAILED);
                        com.sankuai.waimai.kit.login.user.c.a().a(b.a.BIND_FAILED);
                    }

                    private void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7521c06e89d6337d0e3124e908462bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7521c06e89d6337d0e3124e908462bd");
                            return;
                        }
                        a.a(true);
                        UserCenter.getInstance(com.meituan.android.singleton.b.a).negativeLogout(new LogoutInfo("com.meituan.passport", new LogoutInfo.DefaultData("bind failure dialog"), (HashMap<String, String>) null), null);
                        com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.BIND_FAILED);
                        com.sankuai.waimai.kit.login.user.c.a().a(b.a.BIND_FAILED);
                    }
                }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
                com.sankuai.waimai.business.user.api.user.a.b = "";
                com.sankuai.waimai.platform.domain.manager.user.a.i().d = "";
                com.sankuai.waimai.kit.login.user.c.a().c = "";
            }
            com.sankuai.waimai.business.user.api.user.a.d = false;
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        c = true;
        return true;
    }

    public static /* synthetic */ void b(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbaf33f92523c46a261f412984bcaf4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbaf33f92523c46a261f412984bcaf4e");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("UserController", "logoutFromPassport, mIsBindFailedLogout = %s", Boolean.valueOf(c));
        if (c) {
            c = false;
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.LOGOUT);
        com.sankuai.waimai.kit.login.user.c.a().a(b.a.LOGOUT);
    }

    public static /* synthetic */ void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07a200abbe916d050f51fd5ac4f97a40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07a200abbe916d050f51fd5ac4f97a40");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("UserController", "loginCancelFromPassport", new Object[0]);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.CANCEL);
        com.sankuai.waimai.kit.login.user.c.a().a(b.a.CANCEL);
    }

    public static /* synthetic */ void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc84365f98305fb235cf39c6fa51dab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc84365f98305fb235cf39c6fa51dab2");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("UserController", "userInfoUpdateFromPassport", new Object[0]);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.EnumC0948b.INFO);
        com.sankuai.waimai.kit.login.user.c a2 = com.sankuai.waimai.kit.login.user.c.a();
        Object[] objArr2 = {b.EnumC0982b.INFO};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.kit.login.user.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4e5412c19f26dafef372b2803f1a71d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4e5412c19f26dafef372b2803f1a71d7");
        } else if (a2.b != null) {
            a2.b.toArray();
        }
    }

    public static void a(Application application) {
        PassportConfig d2;
        PassportConfig d3;
        Object obj;
        PassportConfig d4;
        Object obj2;
        PassportConfig d5;
        Object obj3;
        PassportConfig d6;
        Object obj4;
        PassportConfig d7;
        Object obj5;
        PassportConfig d8;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d06b64697c292a4ae7613886797b117f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d06b64697c292a4ae7613886797b117f");
            return;
        }
        final q a2 = q.a();
        com.meituan.passport.plugins.e eVar = new com.meituan.passport.plugins.e() { // from class: com.sankuai.waimai.launcher.manager.user.a.1
            public static ChangeQuickRedirect b;

            @Override // com.meituan.passport.plugins.e
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "813cdea53baf1a8bb23eefec073a0656", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "813cdea53baf1a8bb23eefec073a0656") : com.sankuai.waimai.kit.fingerPrint.a.a().b.fingerprint();
            }
        };
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c476836435b18fb6c1686b1a6646d804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c476836435b18fb6c1686b1a6646d804");
        } else {
            if (!a2.d.compareAndSet(null, eVar)) {
                String str = a2.b;
                Log.e(str, "Another strategy was already registered: " + a2.d.get());
            }
            com.meituan.android.yoda.plugins.d.a().a(new com.meituan.android.yoda.plugins.a() { // from class: com.meituan.passport.plugins.q.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.plugins.a
                public final String a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72200d2c44e4bf7e6a9734ae135eef0b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72200d2c44e4bf7e6a9734ae135eef0b") : q.a().c().d();
                }
            });
        }
        final q a3 = q.a();
        d dVar = new d();
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = q.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "634f249500afc6c7ed1bf7796918a682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "634f249500afc6c7ed1bf7796918a682");
        } else {
            if (!a3.c.compareAndSet(null, dVar)) {
                String str2 = a3.b;
                Log.e(str2, "Another strategy was already registered: " + a3.c.get());
            }
            com.meituan.android.yoda.plugins.d.a().c().a(new com.meituan.android.yoda.plugins.c() { // from class: com.meituan.passport.plugins.q.2
                @Override // com.meituan.android.yoda.plugins.c
                public final int getNetEnv() {
                    return 1;
                }
            });
        }
        q a4 = q.a();
        c cVar = new c();
        Object[] objArr4 = {cVar};
        ChangeQuickRedirect changeQuickRedirect4 = q.a;
        if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "02e13a9de5ee795f927251d2ef53415d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "02e13a9de5ee795f927251d2ef53415d");
        } else if (!a4.e.compareAndSet(null, cVar)) {
            String str3 = a4.b;
            Log.e(str3, "Another strategy was already registered: " + a4.e.get());
        }
        q a5 = q.a();
        b bVar = new b();
        Object[] objArr5 = {bVar};
        ChangeQuickRedirect changeQuickRedirect5 = q.a;
        if (PatchProxy.isSupport(objArr5, a5, changeQuickRedirect5, false, "76fb17cbb1aa0f6b1456f9a5dca75d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a5, changeQuickRedirect5, false, "76fb17cbb1aa0f6b1456f9a5dca75d64");
        } else if (!a5.f.compareAndSet(null, bVar)) {
            String str4 = a5.b;
            Log.e(str4, "Another strategy was already registered: " + a5.f.get());
        }
        q a6 = q.a();
        C0992a c0992a = new C0992a();
        Object[] objArr6 = {c0992a};
        ChangeQuickRedirect changeQuickRedirect6 = q.a;
        if (PatchProxy.isSupport(objArr6, a6, changeQuickRedirect6, false, "326e53db20c663b9f6b8fa638ed08ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a6, changeQuickRedirect6, false, "326e53db20c663b9f6b8fa638ed08ed8");
        } else if (!a6.g.compareAndSet(null, c0992a)) {
            String str5 = a6.b;
            Log.e(str5, "Another strategy was already registered: " + a6.g.get());
        }
        q a7 = q.a();
        h hVar = new h() { // from class: com.sankuai.waimai.launcher.manager.user.a.2
            @Override // com.meituan.passport.plugins.h
            public final String a() {
                return "meituanwaimai://waimai.meituan.com/browser";
            }
        };
        Object[] objArr7 = {hVar};
        ChangeQuickRedirect changeQuickRedirect7 = q.a;
        if (PatchProxy.isSupport(objArr7, a7, changeQuickRedirect7, false, "3700fd341c34700bf232a19791658d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, a7, changeQuickRedirect7, false, "3700fd341c34700bf232a19791658d48");
        } else if (!a7.i.compareAndSet(null, hVar)) {
            String str6 = a7.b;
            Log.e(str6, "Another strategy was already registered: " + a7.i.get());
        }
        PassportConfig.b(6);
        PassportConfig.a s = PassportConfig.s();
        Object[] objArr8 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect8 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr8, s, changeQuickRedirect8, false, "a213358b08bf3661be232d3455e6d178", RobustBitConfig.DEFAULT_VALUE)) {
            PassportConfig.a aVar = (PassportConfig.a) PatchProxy.accessDispatch(objArr8, s, changeQuickRedirect8, false, "a213358b08bf3661be232d3455e6d178");
        } else {
            d2 = PassportConfig.d();
            PassportConfig.b(d2, false);
            T t = s.b;
        }
        PassportUIConfig.a J = PassportUIConfig.J();
        Object[] objArr9 = {"100161_50906206"};
        ChangeQuickRedirect changeQuickRedirect9 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr9, J, changeQuickRedirect9, false, "4f66601b9d4a6c05dc76d2590a2e26d9", RobustBitConfig.DEFAULT_VALUE)) {
            obj = (T) PatchProxy.accessDispatch(objArr9, J, changeQuickRedirect9, false, "4f66601b9d4a6c05dc76d2590a2e26d9");
        } else {
            d3 = PassportConfig.d();
            PassportConfig.a(d3, "100161_50906206");
            obj = J.b;
        }
        PassportUIConfig.a aVar2 = (PassportUIConfig.a) obj;
        Object[] objArr10 = {2};
        ChangeQuickRedirect changeQuickRedirect10 = PassportUIConfig.a.c;
        if (PatchProxy.isSupport(objArr10, aVar2, changeQuickRedirect10, false, "d8292d652dec1ec737c62e7c84d95567", RobustBitConfig.DEFAULT_VALUE)) {
            aVar2 = (PassportUIConfig.a) PatchProxy.accessDispatch(objArr10, aVar2, changeQuickRedirect10, false, "d8292d652dec1ec737c62e7c84d95567");
        } else {
            PassportUIConfig.u = 2;
        }
        Object[] objArr11 = {"login_waimaiapp"};
        ChangeQuickRedirect changeQuickRedirect11 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr11, aVar2, changeQuickRedirect11, false, "e86f31f9af9cd39981aed22c0d69213a", RobustBitConfig.DEFAULT_VALUE)) {
            obj2 = (T) PatchProxy.accessDispatch(objArr11, aVar2, changeQuickRedirect11, false, "e86f31f9af9cd39981aed22c0d69213a");
        } else {
            d4 = PassportConfig.d();
            PassportConfig.c(d4, "login_waimaiapp");
            obj2 = aVar2.b;
        }
        PassportUIConfig.a aVar3 = (PassportUIConfig.a) obj2;
        Object[] objArr12 = {"MT_WAIMAI_APP"};
        ChangeQuickRedirect changeQuickRedirect12 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr12, aVar3, changeQuickRedirect12, false, "8431dfee6e67a8628b12b3ed1cb36f1d", RobustBitConfig.DEFAULT_VALUE)) {
            obj3 = (T) PatchProxy.accessDispatch(objArr12, aVar3, changeQuickRedirect12, false, "8431dfee6e67a8628b12b3ed1cb36f1d");
        } else {
            d5 = PassportConfig.d();
            PassportConfig.b(d5, "MT_WAIMAI_APP");
            obj3 = aVar3.b;
        }
        PassportUIConfig.a aVar4 = (PassportUIConfig.a) obj3;
        String string = com.meituan.android.singleton.b.a.getString(R.string.wm_common_app_name);
        Object[] objArr13 = {string};
        ChangeQuickRedirect changeQuickRedirect13 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr13, aVar4, changeQuickRedirect13, false, "d471d7cef119918e6c61e520634a0c47", RobustBitConfig.DEFAULT_VALUE)) {
            obj4 = (T) PatchProxy.accessDispatch(objArr13, aVar4, changeQuickRedirect13, false, "d471d7cef119918e6c61e520634a0c47");
        } else {
            d6 = PassportConfig.d();
            PassportConfig.d(d6, string);
            obj4 = aVar4.b;
        }
        PassportUIConfig.a aVar5 = (PassportUIConfig.a) obj4;
        Object[] objArr14 = {"YsPCMIpNEugciGV3mNHtEg"};
        ChangeQuickRedirect changeQuickRedirect14 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr14, aVar5, changeQuickRedirect14, false, "a0ff93c4740522785ea1f4d6c8a09fa9", RobustBitConfig.DEFAULT_VALUE)) {
            obj5 = (T) PatchProxy.accessDispatch(objArr14, aVar5, changeQuickRedirect14, false, "a0ff93c4740522785ea1f4d6c8a09fa9");
        } else {
            d7 = PassportConfig.d();
            Object[] objArr15 = {"YsPCMIpNEugciGV3mNHtEg"};
            ChangeQuickRedirect changeQuickRedirect15 = PassportConfig.a;
            if (PatchProxy.isSupport(objArr15, d7, changeQuickRedirect15, false, "09583f37aae4de41f8fdb61ddd1a6539", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, d7, changeQuickRedirect15, false, "09583f37aae4de41f8fdb61ddd1a6539");
            } else {
                PassportConfig.d().b = "YsPCMIpNEugciGV3mNHtEg";
                StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "Channel.Account.TokenId", "YsPCMIpNEugciGV3mNHtEg", 0);
            }
            obj5 = aVar5.b;
        }
        PassportUIConfig.a aVar6 = (PassportUIConfig.a) obj5;
        Object[] objArr16 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect16 = PassportConfig.a.a;
        if (PatchProxy.isSupport(objArr16, aVar6, changeQuickRedirect16, false, "e332291cb05bd106d5095950e7cf4182", RobustBitConfig.DEFAULT_VALUE)) {
            PassportConfig.a aVar7 = (PassportConfig.a) PatchProxy.accessDispatch(objArr16, aVar6, changeQuickRedirect16, false, "e332291cb05bd106d5095950e7cf4182");
        } else {
            d8 = PassportConfig.d();
            d8.n = true;
            T t2 = aVar6.b;
        }
        application.registerActivityLifecycleCallbacks(ac.a());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.manager.user.a$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] a = new int[UserCenter.d.valuesCustom().length];

        static {
            try {
                a[UserCenter.d.login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UserCenter.d.logout.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UserCenter.d.cancel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UserCenter.d.update.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class e implements Interceptor {
        public static ChangeQuickRedirect a;

        public e() {
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            String str;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabccbd0b5211f8f00bf1945115c21e5", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabccbd0b5211f8f00bf1945115c21e5");
            }
            aj request = aVar.request();
            t e = t.e(request.b());
            aj.a a2 = request.a();
            String aSCIIString = e.a().toASCIIString();
            Object[] objArr2 = {aSCIIString};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb25226a4ec109a14fd0b0825bbb3643", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb25226a4ec109a14fd0b0825bbb3643");
            } else {
                if (!TextUtils.isEmpty(aSCIIString) && aSCIIString.contains("verify.inf.dev.sankuai.com")) {
                    aSCIIString = aSCIIString.replace("verify.inf.dev.sankuai.com", "verify.inf.test.sankuai.com");
                }
                str = aSCIIString;
            }
            return aVar.a(a2.b(str).a());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d extends v {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // com.meituan.passport.plugins.v
        public final List<Interceptor> c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ef00e2cb3cd9ba8ecb4e473ed50962", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ef00e2cb3cd9ba8ecb4e473ed50962");
            }
            if (com.sankuai.waimai.platform.net.c.a().d()) {
                return Collections.singletonList(new e());
            }
            return super.c();
        }

        @Override // com.meituan.passport.plugins.v
        public final int b() {
            String str;
            boolean a2;
            String str2;
            boolean a3;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5169a18f51e294a8548e099f97b60737", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5169a18f51e294a8548e099f97b60737")).intValue();
            }
            if (com.sankuai.waimai.platform.net.c.a().d()) {
                com.sankuai.waimai.platform.net.c a4 = com.sankuai.waimai.platform.net.c.a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.c.a;
                if (PatchProxy.isSupport(objArr2, a4, changeQuickRedirect2, false, "33d623d9c100069129c28b7f74fdff8a", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = ((Boolean) PatchProxy.accessDispatch(objArr2, a4, changeQuickRedirect2, false, "33d623d9c100069129c28b7f74fdff8a")).booleanValue();
                } else {
                    str = a4.m.d;
                    a2 = a4.a("https://passport.wpt.st.sankuai.com", str);
                }
                if (a2) {
                    return 2;
                }
                com.sankuai.waimai.platform.net.c a5 = com.sankuai.waimai.platform.net.c.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.c.a;
                if (PatchProxy.isSupport(objArr3, a5, changeQuickRedirect3, false, "8c4fbab57ab6579113f321f387827102", RobustBitConfig.DEFAULT_VALUE)) {
                    a3 = ((Boolean) PatchProxy.accessDispatch(objArr3, a5, changeQuickRedirect3, false, "8c4fbab57ab6579113f321f387827102")).booleanValue();
                } else {
                    str2 = a5.m.d;
                    a3 = a5.a("https://passport.meituan.com", str2);
                }
                return a3 ? 1 : 3;
            }
            return super.b();
        }

        @Override // com.meituan.passport.plugins.v
        public final a.InterfaceC0637a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cec895defa00db7cc9f92dc57f9cbe4", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cec895defa00db7cc9f92dc57f9cbe4") : i.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends m {
        @Override // com.meituan.passport.plugins.m
        public final String a() {
            return "1101145703";
        }

        public c() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.meituan.passport.plugins.i {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.passport.plugins.i
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f3644545208ea34f07c2d409e49eb0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f3644545208ea34f07c2d409e49eb0")).intValue();
            }
            try {
                City m = g.a().m();
                if (m != null) {
                    return Integer.parseInt(m.getCityCode());
                }
            } catch (NumberFormatException e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
            return 0;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.manager.user.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0992a extends com.meituan.passport.plugins.g {
        public static ChangeQuickRedirect b;

        public C0992a() {
        }

        @Override // com.meituan.passport.plugins.g
        public final void a(String str, final g.a aVar) {
            Object[] objArr = {str, aVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3f829533402724c9f78f28c45691f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3f829533402724c9f78f28c45691f1");
                return;
            }
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.c = str;
            c.a(new b.a() { // from class: com.sankuai.waimai.launcher.manager.user.a.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "128f4df616243ed18ecf52537afb946c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "128f4df616243ed18ecf52537afb946c");
                    } else {
                        aVar.a(bitmap);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5e010e9c2a1254d3848b247160a7bf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5e010e9c2a1254d3848b247160a7bf7");
                    } else {
                        aVar.a();
                    }
                }
            });
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9d811db589c9acd3bf30a449a17fb88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9d811db589c9acd3bf30a449a17fb88");
            return;
        }
        synchronized (a.class) {
            if (!b && !TextUtils.isEmpty(com.sankuai.waimai.platform.b.A().c())) {
                b = true;
                com.sankuai.waimai.platform.domain.manager.user.a.i().j();
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4256de1c70748814f6a5a341febd624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4256de1c70748814f6a5a341febd624");
        } else {
            UserCenter.getInstance(com.meituan.android.singleton.b.a).loginEventObservable().a(rx.android.schedulers.a.a()).c(new rx.functions.b<UserCenter.c>() { // from class: com.sankuai.waimai.launcher.manager.user.a.3
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(UserCenter.c cVar) {
                    UserCenter.c cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89a6dbcccad1a62ca92a1ea1084de54f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89a6dbcccad1a62ca92a1ea1084de54f");
                        return;
                    }
                    a.a(cVar2.b);
                    switch (AnonymousClass5.a[cVar2.b.ordinal()]) {
                        case 1:
                            a.a(cVar2.c);
                            break;
                        case 2:
                            a.b(cVar2.c);
                            break;
                        case 3:
                            a.c();
                            break;
                        case 4:
                            a.d();
                            break;
                    }
                    if (cVar2.b != UserCenter.d.cancel) {
                        com.sankuai.waimai.platform.domain.manager.user.a.i().j();
                    }
                }
            });
        }
    }
}
