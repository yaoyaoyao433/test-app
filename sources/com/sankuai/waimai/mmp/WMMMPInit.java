package com.sankuai.waimai.mmp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.singleton.i;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.mmp.lib.api.address.AbsAddressModule;
import com.meituan.mmp.lib.api.extension.ExtensionApiLoader;
import com.meituan.mmp.lib.api.location.AbsMapLocationModule;
import com.meituan.mmp.lib.api.share.AbsShareApi;
import com.meituan.mmp.lib.api.share.BaseShareApi;
import com.meituan.mmp.lib.api.user.AbsUserModule;
import com.meituan.mmp.lib.engine.MMPHornPreloadConfig;
import com.meituan.mmp.lib.engine.l;
import com.meituan.mmp.lib.engine.o;
import com.meituan.mmp.main.IEnvInfo;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.mmp.main.j;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.ArbiterHook;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.mmp.modules.address.WMMMPAddressModule;
import com.sankuai.waimai.mmp.modules.location.WMMMPMapLocationModule;
import com.sankuai.waimai.mmp.modules.user.WMUserModule;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMMPInit extends AbsInit {
    private static final String ADDRESS_MMP_KEY = "be7dcad4cf774fed";
    private static final String DRUG_MMP_APPID = "0493c7b31c6f45ce";
    private static final String RICE_MMP_KEY = "b75b8f2e8db84d05";
    private static final String TAG = "WMMMPInit";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final String[] forceMsiApi = {"mtRequestPayment", "getSelectedCityInfo", "getRiskControlFingerprint", "mtShare", "mtLogin", "mtLogout", "mtGetUserInfo", "mtCheckSession", "chooseInvoiceTitle"};
    private static volatile boolean hasInit = false;
    private static com.meituan.msc.extern.d userCenter;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return TAG;
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59345feb949701c7875e580c653d8fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59345feb949701c7875e580c653d8fc4");
        } else {
            initMMP(application);
        }
    }

    private void initMMP(final Application application) {
        boolean z;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8419f7a05b8825402aa542b6f2447a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8419f7a05b8825402aa542b6f2447a80");
        } else if (hasInit) {
        } else {
            hasInit = true;
            ab.a("WMMMPInit.initMMP");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ArbiterHook.injectInstrumentationHook(application);
                ArbiterHook.addMTInstrumentation(new com.sankuai.waimai.mmp.modules.router.a(application));
                ArbiterHook.addMTInstrumentation(new com.sankuai.waimai.mmp.modules.router.d(application));
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.c(TAG, "外卖MMP：ArbiterHook Exception : " + e.toString(), new Object[0]);
            }
            com.meituan.mmp.lib.api.h.c(0);
            j.a(i.a("defaultnvnetwork"));
            MMPEnvHelper.setMsiSupportAppApis(Arrays.asList(forceMsiApi));
            MMPEnvHelper.init(new IEnvInfo() { // from class: com.sankuai.waimai.mmp.WMMMPInit.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getAliasAppName() {
                    return "waimai";
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getAppCode() {
                    return "waimai";
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getAppID() {
                    return "10320";
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getAppName() {
                    return "waimai";
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final int getMobileAppId() {
                    return 11;
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getWXAppId() {
                    return "wxa552e31d6839de85";
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final Context getApplicationContext() {
                    return application;
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getUUID() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4bd8246f5e48da13dea979fc675b7d8e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4bd8246f5e48da13dea979fc675b7d8e") : com.sankuai.waimai.platform.b.A().c();
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getUserID() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6007ed04fb8d063c42b3b2926d795231", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6007ed04fb8d063c42b3b2926d795231") : com.sankuai.waimai.platform.b.A().B();
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getChannel() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d1006a9e1a654844b6f0ceb5c1f49150", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d1006a9e1a654844b6f0ceb5c1f49150") : com.sankuai.waimai.platform.b.A().d();
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final String getAppVersionName() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "231a822a292378cc56736e209a423933", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "231a822a292378cc56736e209a423933");
                    }
                    String i = com.sankuai.waimai.platform.b.A().i();
                    return !TextUtils.isEmpty(i) ? i : "7.44.0";
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final int getAppVersionCode() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d07f923362e3337d74c3aecee4ba945c", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d07f923362e3337d74c3aecee4ba945c")).intValue();
                    }
                    int j = com.sankuai.waimai.platform.b.A().j();
                    if (j != 0) {
                        return j;
                    }
                    return 700440000;
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final boolean isProdEnv() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe6254f5618e4b90bf6f64c1c4fd3f7c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe6254f5618e4b90bf6f64c1c4fd3f7c")).booleanValue() : !com.sankuai.waimai.foundation.core.a.b();
                }

                @Override // com.meituan.mmp.main.IEnvInfo
                public final boolean isThirdMiniProgram(String str) {
                    boolean z2;
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "50f491f85dba0217e89f7c3452137cf6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "50f491f85dba0217e89f7c3452137cf6")).booleanValue();
                    }
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "300bb6ff034f310e00a2bb5bb0fb4e87", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "300bb6ff034f310e00a2bb5bb0fb4e87")).booleanValue();
                    } else {
                        z2 = "gh_f18c2f54b12e".equals(str) || "gh_9345487b8876".equals(str) || "gh_8bf72fddce3f".equals(str) || "gh_870576f3c6f9".equals(str) || "gh_d9004ba7511f".equals(str) || "gh_2f6dc0344214".equals(str) || "mmp_ffd0ee8b449c".equals(str) || "mmp_87dffc23944d".equals(str) || "gh_8dc6c08b45e2".equals(str) || "fmp_qcs_invoice".equals(str) || "wx57a97043c197f4a6".equals(str);
                    }
                    return !z2;
                }
            });
            com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.sankuai.waimai.mmp.WMMMPInit.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9bbdf05d82d264927397fc7fae691749", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9bbdf05d82d264927397fc7fae691749");
                    } else {
                        MMPEnvHelper.getEnvInfo().getUUID();
                    }
                }
            });
            MMPEnvHelper.setLocationLoaderProvider(new com.meituan.mmp.lib.map.d() { // from class: com.sankuai.waimai.mmp.WMMMPInit.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.map.d
                @NonNull
                public final com.meituan.mmp.lib.map.c a(Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
                    Object[] objArr2 = {activity, cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65a3a1c6c700aee54a9bdb4a56900efb", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.map.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65a3a1c6c700aee54a9bdb4a56900efb") : new c(activity, cVar);
                }
            });
            Context context = com.meituan.android.singleton.b.a;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.utils.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "8259fcb61a1852d1981a936a18b7b04a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "8259fcb61a1852d1981a936a18b7b04a")).booleanValue();
            } else {
                z = com.sankuai.waimai.foundation.core.a.b() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "mmp_debug", false);
            }
            MMPEnvHelper.setCheckUpdateFromTestEnv(z);
            MMPEnvHelper.setSniffer(new e());
            MMPEnvHelper.setCatHelper(new a());
            MMPEnvHelper.setCityController(new b());
            MMPEnvHelper.setAppBrandTaskSwitcher(new com.sankuai.waimai.mmp.modules.router.e());
            MMPEnvHelper.setMapType(3);
            MMPEnvHelper.setIPersonalizationInfo(new com.sankuai.waimai.mmp.modules.personalization.a());
            MMPEnvHelper.setMMPUserCenter(new WMUserModule());
            com.meituan.mmp.lib.api.f fVar = new com.meituan.mmp.lib.api.f();
            fVar.o = new com.meituan.mmp.lib.api.e<AbsShareApi.AbsShare>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsShareApi.AbsShare a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1d1974068a04864c24111d89c36e19c5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (AbsShareApi.AbsShare) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1d1974068a04864c24111d89c36e19c5");
                    }
                    com.sankuai.waimai.mmp.modules.share.a aVar = new com.sankuai.waimai.mmp.modules.share.a();
                    aVar.getClass();
                    return new BaseShareApi.Share();
                }
            };
            fVar.n = new com.meituan.mmp.lib.api.e<AbsShareApi.AbsMtShare>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsShareApi.AbsMtShare a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3c8921fcc498bb4b6b0df6d65dc35326", RobustBitConfig.DEFAULT_VALUE)) {
                        return (AbsShareApi.AbsMtShare) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3c8921fcc498bb4b6b0df6d65dc35326");
                    }
                    com.sankuai.waimai.mmp.modules.share.a aVar = new com.sankuai.waimai.mmp.modules.share.a();
                    aVar.getClass();
                    return new BaseShareApi.MTShare();
                }
            };
            fVar.k = new com.meituan.mmp.lib.api.e<AbsMapLocationModule.AbsOpenLocation>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.11
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsMapLocationModule.AbsOpenLocation a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ad678fee725285c2a16d8ccdf1960a9b", RobustBitConfig.DEFAULT_VALUE) ? (AbsMapLocationModule.AbsOpenLocation) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ad678fee725285c2a16d8ccdf1960a9b") : new WMMMPMapLocationModule.OpenLocation();
                }
            };
            fVar.t = new com.meituan.mmp.lib.api.e<AbsAddressModule.AbsChooseAddress>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.12
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsAddressModule.AbsChooseAddress a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1281924b8a2abf5eb7cc23f674dbcf88", RobustBitConfig.DEFAULT_VALUE) ? (AbsAddressModule.AbsChooseAddress) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1281924b8a2abf5eb7cc23f674dbcf88") : new WMMMPAddressModule.ChooseAddress();
                }
            };
            fVar.c = new com.meituan.mmp.lib.api.e<AbsUserModule.AbsLogin>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.13
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsUserModule.AbsLogin a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "931714c470e1323228343983d23513a2", RobustBitConfig.DEFAULT_VALUE) ? (AbsUserModule.AbsLogin) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "931714c470e1323228343983d23513a2") : new WMUserModule.Login();
                }
            };
            fVar.f = new com.meituan.mmp.lib.api.e<AbsUserModule.AbsCheckSession>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.14
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsUserModule.AbsCheckSession a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a59a31018830066ac21c77c0c26419c0", RobustBitConfig.DEFAULT_VALUE) ? (AbsUserModule.AbsCheckSession) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a59a31018830066ac21c77c0c26419c0") : new WMUserModule.CheckSession();
                }
            };
            fVar.g = new com.meituan.mmp.lib.api.e<AbsUserModule.AbsGetUserInfo>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsUserModule.AbsGetUserInfo a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a2b6185cc3331238ca92b62e0c9d99f7", RobustBitConfig.DEFAULT_VALUE) ? (AbsUserModule.AbsGetUserInfo) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a2b6185cc3331238ca92b62e0c9d99f7") : new WMUserModule.GetUserInfo();
                }
            };
            fVar.i = new com.meituan.mmp.lib.api.e<AbsUserModule.AbsGetPhoneNumber>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsUserModule.AbsGetPhoneNumber a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cbc02aa9ac0170937deab0b43e3f0b45", RobustBitConfig.DEFAULT_VALUE) ? (AbsUserModule.AbsGetPhoneNumber) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cbc02aa9ac0170937deab0b43e3f0b45") : new WMUserModule.GetPhoneNumber();
                }
            };
            fVar.j = new com.meituan.mmp.lib.api.e<AbsUserModule.AbsAuthorizeFail>() { // from class: com.sankuai.waimai.mmp.WMMMPInit.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.e
                public final /* synthetic */ AbsUserModule.AbsAuthorizeFail a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "15f07f8efe37a01ddced05413e551380", RobustBitConfig.DEFAULT_VALUE) ? (AbsUserModule.AbsAuthorizeFail) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "15f07f8efe37a01ddced05413e551380") : new WMUserModule.AuthorizeFail();
                }
            };
            WMUserModule.c();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.api.f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "d29f16ebe10660223ffdc7a5ade0affd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "d29f16ebe10660223ffdc7a5ade0affd");
            } else {
                ExtensionApiLoader.a();
                MMPEnvHelper.registerWXApi("mtLogin", null, fVar.b);
                MMPEnvHelper.registerWXApi("login", null, fVar.c);
                MMPEnvHelper.registerWXApi("mtLogout", null, fVar.d);
                MMPEnvHelper.registerWXApi("mtCheckSession", null, fVar.e);
                MMPEnvHelper.registerWXApi("checkSession", null, fVar.f);
                MMPEnvHelper.registerWXApi("getUserInfo", null, fVar.g);
                MMPEnvHelper.registerWXApi("getMTUserInfo", null, fVar.h);
                MMPEnvHelper.registerWXApi("getPhoneNumber", null, fVar.i);
                MMPEnvHelper.registerWXApi("authorizeFail", null, fVar.j);
                MMPEnvHelper.registerWXApi("openLocation", null, fVar.k);
                MMPEnvHelper.registerWXApi("openPOILocation", null, fVar.l);
                MMPEnvHelper.registerWXApi("chooseLocation", null, fVar.m);
                MMPEnvHelper.registerWXApi("mtShare", null, fVar.n);
                MMPEnvHelper.registerWXApi("share", null, fVar.o);
                MMPEnvHelper.registerWXApi("scanCode", new String[]{PermissionGuard.PERMISSION_CAMERA}, fVar.p);
                MMPEnvHelper.registerWXApi("mtRequestPayment", null, fVar.q);
                MMPEnvHelper.registerWXApi("openPaymentCommissionContract", null, fVar.r);
                MMPEnvHelper.registerWXApi("chooseInvoiceTitle", null, fVar.s);
                MMPEnvHelper.registerWXApi("chooseAddress", null, fVar.t);
                MMPEnvHelper.registerWXApi("getSelectedCityInfo", null, fVar.u);
                MMPEnvHelper.registerWXApi("getRiskControlFingerprint", null, fVar.v);
                MMPEnvHelper.registerWXApi("getUTMFromKNB", null, fVar.w);
                MMPEnvHelper.registerWXApi("updateHostApp", null, com.meituan.mmp.lib.api.f.x);
                MMPEnvHelper.registerPrivateApi("showCategoryEntry", null, fVar.y);
            }
            com.sankuai.waimai.foundation.utils.log.a.c(TAG, "外卖MMP：配置初始化完成 共耗时 %d 毫秒", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            mscInit(application);
            ab.a();
        }
    }

    private void mscInit(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd803b4c83242f3b1e49183df14a177f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd803b4c83242f3b1e49183df14a177f");
            return;
        }
        com.meituan.android.msc.csslib.a.a(application);
        com.meituan.msc.modules.update.metainfo.a a = com.meituan.msc.modules.update.metainfo.a.a();
        Object[] objArr2 = {"7122f6e193de47c1", "12.4.400"};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.metainfo.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "424bae677ec402838d23da77ca8cafc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "424bae677ec402838d23da77ca8cafc0");
        } else {
            a.d.put("7122f6e193de47c1", "12.4.400");
        }
        MSCEnvHelper.init(new com.meituan.msc.extern.IEnvInfo() { // from class: com.sankuai.waimai.mmp.WMMMPInit.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getAliasAppName() {
                return "waimai";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getAppCode() {
                return "waimai";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getAppID() {
                return "10320";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getAppName() {
                return "waimai";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getKNBHostScheme() {
                return "meituanwaimai://waimai.meituan.com/browser";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final int getMobileAppId() {
                return 11;
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getWXAppId() {
                return "wxa552e31d6839de85";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final Context getApplicationContext() {
                return application;
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getUUID() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e5886236b58ba4d233eb359751480370", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e5886236b58ba4d233eb359751480370") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getUserID() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a5a31ea6d7f68a00e7fc56c832a82d04", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a5a31ea6d7f68a00e7fc56c832a82d04") : com.sankuai.waimai.platform.b.A().B();
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getChannel() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d1722861d02a305e931c8c58655d5470", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d1722861d02a305e931c8c58655d5470") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getAppVersionName() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b43fc6957e34bef2ecf36e730e7351b5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b43fc6957e34bef2ecf36e730e7351b5");
                }
                String i = com.sankuai.waimai.platform.b.A().i();
                return !TextUtils.isEmpty(i) ? i : "7.86.0";
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final int getAppVersionCode() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f1dc1c92311003b171d23164549e6468", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f1dc1c92311003b171d23164549e6468")).intValue();
                }
                int j = com.sankuai.waimai.platform.b.A().j();
                if (j != 0) {
                    return j;
                }
                return 700860000;
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final boolean isProdEnv() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cdc2f5bff6d79dc8515dae1622e29996", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cdc2f5bff6d79dc8515dae1622e29996")).booleanValue() : !com.sankuai.waimai.foundation.core.a.b();
            }

            @Override // com.meituan.msc.extern.IEnvInfo
            public final String getBuildNumber() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "32b931a57501f957ecc2e0003de7ea58", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "32b931a57501f957ecc2e0003de7ea58") : String.valueOf(com.sankuai.waimai.platform.b.A().k);
            }
        });
        if (com.sankuai.waimai.foundation.core.a.b()) {
            try {
                Class.forName("com.meituan.msc.modules.devtools.MSCV8InspectorUtil").getMethod("initV8DebugSo", Context.class).invoke(null, application);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.meituan.msc.extern.e.a(i.a("defaultnvnetwork"));
        MSCEnvHelper.setMSCUserCenter(getMSCUserCenter());
        MSCEnvHelper.setCityController(new g());
        com.meituan.msc.modules.api.msi.permission.d.a(com.meituan.msc.common.config.b.j());
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleAsyncInit(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "592f5f93769e28283c410219239473e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "592f5f93769e28283c410219239473e5");
            return;
        }
        final MMPHornPreloadConfig a = MMPHornPreloadConfig.a();
        Object[] objArr2 = {application, (byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = MMPHornPreloadConfig.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "8843c3cb00675397b39756503f2fd689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "8843c3cb00675397b39756503f2fd689");
        } else {
            final l lVar = l.DEFAULT;
            Object[] objArr3 = {application, (byte) 1, (byte) 1, lVar};
            ChangeQuickRedirect changeQuickRedirect4 = MMPHornPreloadConfig.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect4, false, "f6eebe11083611d844ea7a9cb9cfd85f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect4, false, "f6eebe11083611d844ea7a9cb9cfd85f");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("cityId", Long.valueOf(com.meituan.android.singleton.a.a().b()));
                hashMap.put("chromeVersion", MMPHornPreloadConfig.a(application));
                hashMap.put("deviceLevel", Integer.valueOf(DeviceUtil.getDeviceLevel(MMPEnvHelper.getContext()).getValue()));
                Horn.register(lVar.d, new HornCallback() { // from class: com.meituan.mmp.lib.engine.MMPHornPreloadConfig.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:62:0x0078  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0094  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0098  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
                    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
                    @Override // com.meituan.android.common.horn.HornCallback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onChanged(boolean r21, java.lang.String r22) {
                        /*
                            Method dump skipped, instructions count: 222
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.engine.MMPHornPreloadConfig.AnonymousClass1.onChanged(boolean, java.lang.String):void");
                    }
                }, hashMap);
            }
        }
        MMPEnvHelper.ensureFullInited();
        o.a(ADDRESS_MMP_KEY, 1, "address_init", false, null);
        o.a(RICE_MMP_KEY, 1, "rice_init", false, null);
        o.a(DRUG_MMP_APPID, 1, "drug_init", false, null);
    }

    private static com.meituan.msc.extern.d getMSCUserCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9785127bcacf77f045cf68416f65179", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.extern.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9785127bcacf77f045cf68416f65179");
        }
        if (userCenter == null) {
            userCenter = new com.meituan.msc.extern.d() { // from class: com.sankuai.waimai.mmp.WMMMPInit.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.extern.d
                public final boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a61cef23f77436bd02dfce6aa94e0f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a61cef23f77436bd02dfce6aa94e0f8")).booleanValue() : UserCenter.getInstance(MSCEnvHelper.getContext()).isLogin();
                }

                @Override // com.meituan.msc.extern.d
                public final String b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49ecbe0a4c5daff43ca4bfa0eca28245", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49ecbe0a4c5daff43ca4bfa0eca28245") : UserCenter.getInstance(MSCEnvHelper.getContext()).getToken();
                }
            };
        }
        return userCenter;
    }
}
