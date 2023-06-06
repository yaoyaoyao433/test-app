package com.meituan.msc.extern;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.DownloadListener;
import com.meituan.android.msc.csslib.CSSParserNative;
import com.meituan.met.mercury.load.core.l;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.common.executor.a;
import com.meituan.msc.common.remote.RemoteService;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.af;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.ay;
import com.meituan.msc.common.utils.k;
import com.meituan.msc.modules.api.location.MSCLocationLoaderCreator;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.preload.MSCHornPreloadConfig;
import com.meituan.msc.modules.service.IServiceEngine;
import com.meituan.msc.modules.service.codecache.CodeCacheConfig;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.serviceloader.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class MSCEnvHelper {
    public static final String TAG = "MSCEnvHelper";
    public static c applicationStateDispatcher;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static f cityController;
    private static Pair<String, String> customUA;
    private static String defaultAppID;
    private static volatile IEnvInfo envInfo;
    private static com.meituan.msc.modules.container.fusion.b fusionPageManager;
    private static boolean hideFirstPageNavigationBarBackImage;
    private static boolean hideNavigationBarBackImage;
    private static boolean hideNavigationBarMenu;
    private static d mscUserCenter;
    public static com.meituan.msc.modules.api.auth.b personalizationInfo;
    @Nullable
    private static com.meituan.msc.modules.api.map.c sLocationLoaderProvider;
    private static Class<? extends IServiceEngine> serviceEngineClazz;
    private static com.meituan.msc.modules.container.router.b taskSwitcher;
    private static DownloadListener webViewDownloadListener;
    public static final Object INIT_LOCK = new Object();
    private static final HashMap<String, com.meituan.msc.modules.api.a> userDefinedApis = new HashMap<>();
    private static com.meituan.msc.extern.a catHelper = new com.meituan.msc.extern.a();
    private static final CountDownLatch fullInitLatch = new CountDownLatch(1);
    private static Set<String> mscFeatureHitList = new HashSet();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        static volatile Runnable a;
    }

    public static Downloader getDownloader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "605da6aa55e86b3bc89b71cab427ec8a", RobustBitConfig.DEFAULT_VALUE) ? (Downloader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "605da6aa55e86b3bc89b71cab427ec8a") : downloaderLogic();
    }

    public static com.meituan.msc.modules.api.auth.b getIPersonalizationInfo() {
        return personalizationInfo;
    }

    public static void setIPersonalizationInfo(com.meituan.msc.modules.api.auth.b bVar) {
        personalizationInfo = bVar;
    }

    public static void init(IEnvInfo iEnvInfo) {
        Object[] objArr = {iEnvInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8b6b4b7bc0eec3eb57050ef2526f04c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8b6b4b7bc0eec3eb57050ef2526f04c");
        } else if (iEnvInfo == null || iEnvInfo.getApplicationContext() == null || (!ProcessUtils.isMainProcess(iEnvInfo.getApplicationContext()) && !ProcessUtils.getCurrentProcessName().contains(":mscMiniApp"))) {
            com.meituan.msc.modules.preload.e.a().b = "only main process or msc sub process trigger sdk init";
            com.meituan.msc.modules.reporter.g.d(TAG, "only main process or msc sub process trigger sdk init");
        } else {
            envInfo = iEnvInfo;
            com.meituan.msc.modules.reporter.g.a(new com.meituan.msc.modules.reporter.h());
            com.meituan.msc.common.process.a.a(iEnvInfo.getApplicationContext());
            com.meituan.msi.a.a(iEnvInfo.getApplicationContext());
            com.meituan.msc.common.process.ipc.g.a(getContext());
            com.meituan.msc.common.config.b.a(false);
            com.meituan.msc.modules.reporter.g.d(TAG, "ServiceInstance.staticInit");
            com.meituan.msc.modules.service.i.b();
            initDDD(getContext());
            initMSCDDDAdapter();
            com.meituan.msc.modules.update.packageattachment.e.a(getContext());
            com.meituan.msc.modules.service.codecache.c.a(getContext());
            a.c.a(new Runnable() { // from class: com.meituan.msc.extern.MSCEnvHelper.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c5de32f7295419061ac02bb7dcb80e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c5de32f7295419061ac02bb7dcb80e0");
                        return;
                    }
                    MSCEnvHelper.ensureFullInited();
                    com.meituan.msc.modules.preload.e.a().b();
                }
            });
        }
    }

    private static void delayedInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "487972abcbb259f8e9ba0273776b93eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "487972abcbb259f8e9ba0273776b93eb");
            return;
        }
        com.meituan.android.picassohelper.c.a(getContext());
        if (!com.sankuai.meituan.serviceloader.b.a()) {
            com.sankuai.meituan.serviceloader.b.a(getContext());
        }
        if (fusionPageManager == null) {
            setFusionPageManager(new com.meituan.msc.modules.container.fusion.a());
        }
        preloadCsslibInMainThread();
    }

    private static void preloadCsslibInMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ab4b75292718418d0c27e447a6aa0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ab4b75292718418d0c27e447a6aa0b0");
        } else if (MSCHornRollbackConfig.h()) {
        } else {
            final Runnable runnable = new Runnable() { // from class: com.meituan.msc.extern.MSCEnvHelper.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1bf487e35223587a35168936e5664f11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1bf487e35223587a35168936e5664f11");
                        return;
                    }
                    long nanoTime = System.nanoTime();
                    CSSParserNative.a(LaunchMode.LAUNCH_MODE_PRELOAD, new CSSParserNative.a() { // from class: com.meituan.msc.extern.MSCEnvHelper.3.1
                        @Override // com.meituan.android.msc.csslib.CSSParserNative.a
                        public final String a() {
                            return ".root{}";
                        }
                    });
                    com.meituan.msc.modules.reporter.g.d(MSCEnvHelper.TAG, "preload csslib in main thread(IdleHandler) , time: " + (System.nanoTime() - nanoTime));
                }
            };
            com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.extern.MSCEnvHelper.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a79607fb765ca71279729a9b00935ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a79607fb765ca71279729a9b00935ca");
                        return;
                    }
                    com.meituan.android.msc.csslib.a.a(MSCEnvHelper.getContext());
                    CSSParserNative.a();
                    com.meituan.msc.common.executor.a.g(runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void asyncInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9029b78c2af40849bda07579133ec08c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9029b78c2af40849bda07579133ec08c");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(TAG, "aysncInit");
        appendMSCBaseDataToCrashInfo();
        com.meituan.msc.modules.service.codecache.c.a(getContext());
        com.meituan.msc.modules.reporter.memory.c.a(getContext());
        RemoteService.a(getContext());
        RemoteService.b();
        com.meituan.msc.common.config.c.a();
        com.meituan.msc.common.config.b.a();
        com.meituan.msc.modules.apploader.c.c();
        MSCHornPreloadConfig.d().a();
        initBatchCheckUpdate();
        com.meituan.msc.modules.update.packageattachment.e a2 = com.meituan.msc.modules.update.packageattachment.e.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.packageattachment.e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "971c7e00459126d9cb75d978a4f3ba50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "971c7e00459126d9cb75d978a4f3ba50");
            return;
        }
        CodeCacheConfig codeCacheConfig = CodeCacheConfig.d;
        if (CodeCacheConfig.d()) {
            com.meituan.msc.modules.reporter.g.d("PackageAttachmentManager", "cleanAbandonedAttachmentAsync");
            a2.b.b(new com.meituan.msc.modules.update.packageattachment.b(a2));
        }
    }

    private static void initBatchCheckUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "607f5c7b0ae9df95acbb498056058e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "607f5c7b0ae9df95acbb498056058e48");
        } else if (!com.meituan.msc.common.config.b.y()) {
            com.meituan.msc.modules.reporter.g.b(TAG, "enableBatchCheckUpdate is false");
        } else {
            com.meituan.msc.modules.update.metainfo.a.a().b();
            com.meituan.msc.modules.container.a.a(getContext());
            com.meituan.msc.modules.container.a.b.a(new Runnable() { // from class: com.meituan.msc.extern.MSCEnvHelper.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ec86e90e11769379f6b51f015130e57", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ec86e90e11769379f6b51f015130e57");
                        return;
                    }
                    com.meituan.msc.modules.update.metainfo.a.a().b();
                    com.meituan.msc.modules.update.pkg.d.a().c();
                }
            });
        }
    }

    private static void initMSCDDDAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "beef59db08a9f866f560ad0252bb4885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "beef59db08a9f866f560ad0252bb4885");
            return;
        }
        com.meituan.android.mercury.msc.adaptor.core.b.a(new com.meituan.android.mercury.msc.adaptor.core.c() { // from class: com.meituan.msc.extern.MSCEnvHelper.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.core.c
            public final int c() {
                return 1;
            }

            @Override // com.meituan.android.mercury.msc.adaptor.core.c
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6a1d28c6ec918999565fc41eb267540a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6a1d28c6ec918999565fc41eb267540a") : MSCEnvHelper.getEnvInfo().getAppCode();
            }

            @Override // com.meituan.android.mercury.msc.adaptor.core.c
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "599610611c8aca20baf75049123281dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "599610611c8aca20baf75049123281dd") : ay.a();
            }

            @Override // com.meituan.android.mercury.msc.adaptor.core.c
            public final boolean d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b3941ea53a38850b7f2c1ecf1212769", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b3941ea53a38850b7f2c1ecf1212769")).booleanValue();
                }
                if (MSCEnvHelper.getEnvInfo().isProdEnv()) {
                    return false;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.b.a;
                return PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "bd043b0f9ca4eafef12395bd2dea32a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "bd043b0f9ca4eafef12395bd2dea32a1")).booleanValue() : com.meituan.msc.modules.update.b.a().getBoolean("msc_host_beta_enable", false);
            }
        });
        com.meituan.android.mercury.msc.adaptor.core.b.a(new com.meituan.android.mercury.msc.adaptor.callback.c() { // from class: com.meituan.msc.extern.MSCEnvHelper.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.c
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea33ff7f1aec7a2bef68100d44a30246", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea33ff7f1aec7a2bef68100d44a30246");
                } else {
                    com.meituan.msc.modules.reporter.g.d(MSCEnvHelper.TAG, "DDD offline, appId:", str, "publishId:", str2);
                }
            }
        });
    }

    private static void appendMSCBaseDataToCrashInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7b0bd251ebb2f2d3d60e0626373982f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7b0bd251ebb2f2d3d60e0626373982f");
        } else {
            com.meituan.crashreporter.c.c().a(new com.meituan.crashreporter.a() { // from class: com.meituan.msc.extern.MSCEnvHelper.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.crashreporter.a
                public final Map<String, Object> getCrashInfo(String str, boolean z) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "922ca0a63862026807957ce800b1561d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "922ca0a63862026807957ce800b1561d");
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("mscAppVersion", com.meituan.msc.modules.reporter.b.b(false));
                    String a2 = com.meituan.msc.modules.reporter.b.a(false);
                    hashMap.put("mscAppId", a2);
                    hashMap.put("mscPagePath", com.meituan.msc.modules.reporter.b.c(false));
                    MSCEnvHelper.appendBizTags(hashMap, a2);
                    MSCEnvHelper.appendCrashInfoOfWidget(hashMap);
                    return hashMap;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendCrashInfoOfWidget(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17f2857fd80e61636814d6d781e76278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17f2857fd80e61636814d6d781e76278");
        } else if (MSCHornRollbackConfig.d().c().isRollbackWidgetUserPerspectiveCrashReport) {
            com.meituan.msc.modules.reporter.g.c(TAG, "rollback appendCrashInfoOfWidget");
        } else {
            String a2 = com.meituan.msc.modules.reporter.b.a(true);
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("mscAppIdOfWidget", a2);
            }
            String b = com.meituan.msc.modules.reporter.b.b(true);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("mscAppVersionOfWidget", b);
            }
            String c = com.meituan.msc.modules.reporter.b.c(true);
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("mscPagePathOfWidget", c);
            }
            appendBizTagsOfWidget(hashMap, a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendBizTags(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6e04c215fccb4588ff9bdc8e6a08d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6e04c215fccb4588ff9bdc8e6a08d5b");
        } else if (isRollbackAppendBizTags(str)) {
        } else {
            Map<String, String> d = com.meituan.msc.modules.reporter.b.d(false);
            if (d != null) {
                map.put("mscBizTagsForPage", ab.a(d));
            }
            Map<String, String> a2 = com.meituan.msc.modules.reporter.b.a(str);
            if (a2 != null) {
                map.put("mscBizTagsForAppId", ab.a(a2));
            }
        }
    }

    private static void appendBizTagsOfWidget(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53a79ac1ac178e2ac1ebf16ec957e007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53a79ac1ac178e2ac1ebf16ec957e007");
            return;
        }
        Map<String, String> d = com.meituan.msc.modules.reporter.b.d(true);
        if (d != null) {
            map.put("mscBizTagsForPageOfWidget", ab.a(d));
        }
        Map<String, String> a2 = com.meituan.msc.modules.reporter.b.a(str);
        if (a2 != null) {
            map.put("mscBizTagsForAppIdOfWidget", ab.a(a2));
        }
    }

    private static boolean isRollbackAppendBizTags(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "543b9de84b8dc0ec391190b0ad4cda00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "543b9de84b8dc0ec391190b0ad4cda00")).booleanValue();
        }
        String[] strArr = MSCHornRollbackConfig.d().c().rollbackAppendBizTagsAppIds;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    private static Downloader downloaderLogic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8538d4aed1dc2d2703a119140e0f456b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Downloader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8538d4aed1dc2d2703a119140e0f456b");
        }
        if (com.meituan.msc.common.config.b.g() == 0) {
            if (k.a(g.b())) {
                return new com.meituan.msc.common.download.a();
            }
            return new com.meituan.msc.common.download.b();
        } else if (com.meituan.msc.common.config.b.g() == 1) {
            return new com.meituan.msc.common.download.b();
        } else {
            return new com.meituan.msc.common.download.b();
        }
    }

    public static /* synthetic */ Class lambda$downloaderLogic$18() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "126a57381250112407e2d1558fe66a9a", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "126a57381250112407e2d1558fe66a9a") : com.meituan.msc.common.download.a.class;
    }

    private static void initDDD(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f63164b553aefaecd9f554876b447e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f63164b553aefaecd9f554876b447e6");
        } else {
            com.meituan.met.mercury.load.core.g.a(context, new l() { // from class: com.meituan.msc.extern.MSCEnvHelper.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.l
                public final String getUuid() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "528b8b80e9e2e61a75580eae6004a5d8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "528b8b80e9e2e61a75580eae6004a5d8") : MSCEnvHelper.getEnvInfo().getUUID();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final String getUserId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eaf52c6b85ee4a54109e230b8c53e9bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eaf52c6b85ee4a54109e230b8c53e9bc") : MSCEnvHelper.getEnvInfo().getUserID();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final String getChannel() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "625403cd7dd611390cc7429a87f3be55", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "625403cd7dd611390cc7429a87f3be55") : MSCEnvHelper.getEnvInfo().getChannel();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final int getMobileAppId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb16a0ac0ed27ddbde07b99398ae3816", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb16a0ac0ed27ddbde07b99398ae3816")).intValue() : MSCEnvHelper.getEnvInfo().getMobileAppId();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final boolean enableDebug() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8c049d0c43741cdd8a527f90a8840a0", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8c049d0c43741cdd8a527f90a8840a0")).booleanValue();
                    }
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "c7d21eb7f5823a7f1cbcfda44e293bb4", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "c7d21eb7f5823a7f1cbcfda44e293bb4")).booleanValue();
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.update.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "e6b8bf9b5b74ed29936dd17f87ea42e7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "e6b8bf9b5b74ed29936dd17f87ea42e7")).booleanValue() : MSCEnvHelper.getEnvInfo().isProdEnv()) {
                        return false;
                    }
                    return com.meituan.msc.modules.update.b.a().getBoolean("msc_dd_loader_debug_enable", false);
                }
            });
        }
    }

    public static IEnvInfo getEnvInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f810a7a6718e6337dbcdecc018708075", RobustBitConfig.DEFAULT_VALUE)) {
            return (IEnvInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f810a7a6718e6337dbcdecc018708075");
        }
        if (envInfo == null) {
            synchronized (INIT_LOCK) {
                if (envInfo == null) {
                    throw new RuntimeException("need init first");
                }
            }
        }
        return envInfo;
    }

    public static boolean isInited() {
        return envInfo != null;
    }

    public static Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae7b5158a6117729b784e735ac487219", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae7b5158a6117729b784e735ac487219") : getEnvInfo().getApplicationContext();
    }

    public static <T> T getSystemService(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee412cceeb008e3b7c3dbd1dc4c31931", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee412cceeb008e3b7c3dbd1dc4c31931") : (T) getEnvInfo().getApplicationContext().getSystemService(str);
    }

    public static void setWebViewDownloadListener(DownloadListener downloadListener) {
        webViewDownloadListener = downloadListener;
    }

    @Nullable
    public static DownloadListener getWebViewDownloadListener() {
        return webViewDownloadListener;
    }

    public static void setCityController(f fVar) {
        cityController = fVar;
    }

    @Nullable
    public static f getCityController() {
        return cityController;
    }

    public static void setMSCUserCenter(d dVar) {
        mscUserCenter = dVar;
    }

    public static d getMSCUserCenter() {
        return mscUserCenter;
    }

    public static void setCatHelper(com.meituan.msc.extern.a aVar) {
        catHelper = aVar;
    }

    public static com.meituan.msc.extern.a getCatHelper() {
        return catHelper;
    }

    public static SharedPreferences getSharedPreferences(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a8d31ef5cbeb94f768b29c50fb3614d", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a8d31ef5cbeb94f768b29c50fb3614d") : getSharedPreferences(getContext(), str);
    }

    public static SharedPreferences getSharedPreferences(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8feeaf1d92c99fda79b26482b40a1d0c", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8feeaf1d92c99fda79b26482b40a1d0c") : new af(context, str);
    }

    public static SharedPreferences getDefaultSharedPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e078a049d272e038dfe20e02ac01b96b", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e078a049d272e038dfe20e02ac01b96b") : getSharedPreferences(getContext(), ContainerInfo.ENV_MSC);
    }

    public static SharedPreferences getDefaultSharedPreferences(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3efd56c49edb30c8de9d712b594ec64d", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3efd56c49edb30c8de9d712b594ec64d") : getSharedPreferences(context, ContainerInfo.ENV_MSC);
    }

    public static Map<String, com.meituan.msc.modules.api.a> getUserDefinedApis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f138c9515fb6f7061f441e29e6c8c39f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f138c9515fb6f7061f441e29e6c8c39f") : Collections.unmodifiableMap(userDefinedApis);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void registerWXApi(String str, String[] strArr, com.meituan.msc.modules.api.c<?> cVar) {
        Object[] objArr = {str, strArr, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d04d163495702554c9857b93c5d32b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d04d163495702554c9857b93c5d32b4");
        } else {
            registerApi(str, strArr, cVar, 0, false);
        }
    }

    private static void registerWXApiIfNotExist(String str, String[] strArr, com.meituan.msc.modules.api.c<?> cVar) {
        Object[] objArr = {str, strArr, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a648c61eb45795142a4a7a666de0b330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a648c61eb45795142a4a7a666de0b330");
        } else {
            registerApi(str, strArr, cVar, 0, true);
        }
    }

    public static void registerCustomApi(String str, String[] strArr, com.meituan.msc.modules.api.c<?> cVar) {
        Object[] objArr = {str, strArr, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77cf20cbe3e313288d11e7d26e5ee327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77cf20cbe3e313288d11e7d26e5ee327");
        } else {
            registerApi(str, strArr, cVar, 1, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void registerPrivateApi(String str, String[] strArr, com.meituan.msc.modules.api.c<?> cVar) {
        Object[] objArr = {str, strArr, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b1a3ca3cacda79cde1722e3c30fada9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b1a3ca3cacda79cde1722e3c30fada9");
        } else {
            registerApi(str, strArr, cVar, 2, false);
        }
    }

    private static void registerPrivateApiIfNotExist(String str, String[] strArr, com.meituan.msc.modules.api.c<?> cVar) {
        Object[] objArr = {str, strArr, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25bd5b3015832a9b77ddbe7d66f32076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25bd5b3015832a9b77ddbe7d66f32076");
        } else {
            registerApi(str, strArr, cVar, 2, true);
        }
    }

    private static void registerApi(String str, String[] strArr, com.meituan.msc.modules.api.c<?> cVar, int i, boolean z) {
        Object[] objArr = {str, strArr, cVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "186b980f9d9df9a723b6398a961c6505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "186b980f9d9df9a723b6398a961c6505");
        } else if (cVar == null) {
        } else {
            com.meituan.msc.modules.api.a aVar = new com.meituan.msc.modules.api.a(str, i, strArr, cVar);
            if (z && userDefinedApis.containsKey(aVar.b)) {
                return;
            }
            userDefinedApis.put(aVar.b, aVar);
        }
    }

    public static void setCustomUserAgentSuffix(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "deecb8a10e204a301660f08ba4c0256c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "deecb8a10e204a301660f08ba4c0256c");
        } else if (TextUtils.isEmpty(str) || str.contains(StringUtil.SPACE) || str.contains("/")) {
            throw new IllegalArgumentException("uaKey 不能包含空格和/");
        } else {
            if (TextUtils.isEmpty(str2) || str2.contains(StringUtil.SPACE) || str2.contains("/")) {
                throw new IllegalArgumentException("uaValue 不能包含空格和/");
            }
            customUA = new Pair<>(str, str2);
        }
    }

    public static Pair<String, String> getCustomUA() {
        return customUA;
    }

    public static void setAppBrandTaskSwitcher(com.meituan.msc.modules.container.router.b bVar) {
        taskSwitcher = bVar;
    }

    public static com.meituan.msc.modules.container.router.b getAppBrandTaskSwitcher() {
        return taskSwitcher;
    }

    public static String getDefaultAppID() {
        return defaultAppID;
    }

    public static void setDefaultAppID(String str) {
        defaultAppID = str;
    }

    public static void onMSCContainerCreate(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b6747e5e2a4856064724f4ba72fbb8ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b6747e5e2a4856064724f4ba72fbb8ab");
            return;
        }
        startHostInit(context);
        com.meituan.msc.modules.container.a.a(context);
    }

    public static void startHostInit(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d485c609e56a02f20d62d53c89484bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d485c609e56a02f20d62d53c89484bdd");
        } else if (isInited()) {
        } else {
            Context applicationContext = context.getApplicationContext();
            if (!com.sankuai.meituan.serviceloader.b.a()) {
                com.meituan.msc.modules.reporter.g.b("HeraTrace-MSCEnvHelper: init service loader by MSC startHostInit");
                com.sankuai.meituan.serviceloader.b.a(applicationContext, (b.a) null);
            }
            List a2 = com.sankuai.meituan.serviceloader.b.a(h.class, (String) null);
            if (a2.isEmpty()) {
                com.meituan.msc.modules.reporter.g.b("HeraTrace-MSCEnvHelper: HostInitializer not found");
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                it.next();
                com.meituan.msc.modules.reporter.g.b("HeraTrace-MSCEnvHelper: run hostInit");
            }
        }
    }

    private static boolean isFullInited() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa235b2f2a84ec0cd20a501b3f37667c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa235b2f2a84ec0cd20a501b3f37667c")).booleanValue() : fullInitLatch.getCount() == 0;
    }

    public static void ensureFullInited() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9637a0b64b192e6cd5f4cfabc2e729a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9637a0b64b192e6cd5f4cfabc2e729a");
        } else if (isFullInited()) {
        } else {
            synchronized (fullInitLatch) {
                if (isFullInited()) {
                    return;
                }
                String name = Thread.currentThread().getName();
                com.meituan.msc.modules.reporter.g.b("HeraTrace-MSCEnvHelper: start full init in thread " + name);
                Trace.beginSection("MSCEnvHelper.doFullInit");
                doFullInit();
                Trace.endSection();
                com.meituan.msc.modules.reporter.g.b("HeraTrace-MSCEnvHelper: end full init");
                fullInitLatch.countDown();
            }
        }
    }

    private static void doFullInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38f0fc0620ef8c73b943081dcf2dd50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38f0fc0620ef8c73b943081dcf2dd50b");
            return;
        }
        if (!isInited()) {
            com.meituan.msc.modules.reporter.g.b("HeraTrace-MSCEnvHelper: base init not called before full init");
        }
        delayedInit();
        if (a.a != null) {
            a.a.run();
        }
        com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.extern.MSCEnvHelper.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55ce7b6a9429de661ad0412581ebca67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55ce7b6a9429de661ad0412581ebca67");
                } else {
                    MSCEnvHelper.asyncInit();
                }
            }
        });
    }

    public static boolean needHideNavigationBarMenu() {
        return hideNavigationBarMenu;
    }

    public static void setHideNavigationBarMenu(boolean z) {
        hideNavigationBarMenu = z;
    }

    public static com.meituan.msc.modules.container.fusion.b getFusionPageManager() {
        return fusionPageManager;
    }

    public static void setFusionPageManager(com.meituan.msc.modules.container.fusion.b bVar) {
        fusionPageManager = bVar;
    }

    public static boolean needHideNavigationBarBackImage() {
        return hideNavigationBarBackImage;
    }

    public static void setHideNavigationBarBackImage(boolean z) {
        hideNavigationBarBackImage = z;
    }

    public static boolean needHideFirstPageNavigationBarBackImage() {
        return hideFirstPageNavigationBarBackImage;
    }

    public static void setHideFirstPageNavigationBarBackImage(boolean z) {
        hideFirstPageNavigationBarBackImage = z;
    }

    public static Set<String> getMSCFeatureHitList() {
        return mscFeatureHitList;
    }

    public static void setMSCFeatureHitList(Set<String> set) {
        mscFeatureHitList = set;
    }

    @NonNull
    public static com.meituan.msc.modules.api.map.c getILocationLoaderProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a028b1b4bccd878707586f8ced43708", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.api.map.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a028b1b4bccd878707586f8ced43708");
        }
        if (sLocationLoaderProvider == null) {
            com.meituan.msc.modules.api.map.c cVar = new com.meituan.msc.modules.api.map.c() { // from class: com.meituan.msc.extern.MSCEnvHelper.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.api.map.c
                @NonNull
                public final com.meituan.msc.modules.api.map.b a(@NonNull Activity activity, @NonNull com.meituan.msi.provider.c cVar2) {
                    Object[] objArr2 = {activity, cVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "006f03f034af40c4a87003f6777f342b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.meituan.msc.modules.api.map.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "006f03f034af40c4a87003f6777f342b");
                    }
                    List a2 = com.sankuai.meituan.serviceloader.b.a(MSCLocationLoaderCreator.class, "msc_location_loader_creator");
                    if (a2 != null && a2.size() > 0) {
                        return ((MSCLocationLoaderCreator) a2.get(0)).a(activity, cVar2);
                    }
                    aw.b("need dependence msc-plugin-locate or call setLocationLoaderProvider", new Object[0]);
                    return new com.meituan.msc.modules.api.map.b() { // from class: com.meituan.msc.extern.MSCEnvHelper.2.1
                        @Override // com.meituan.msc.modules.api.map.b
                        public final void a() {
                        }

                        @Override // com.meituan.msc.modules.api.map.b
                        public final void a(com.meituan.msc.modules.api.map.a aVar, String str) {
                        }
                    };
                }
            };
            sLocationLoaderProvider = cVar;
            return cVar;
        }
        return sLocationLoaderProvider;
    }

    public static void setLocationLoaderProvider(@NonNull com.meituan.msc.modules.api.map.c cVar) {
        sLocationLoaderProvider = cVar;
    }
}
