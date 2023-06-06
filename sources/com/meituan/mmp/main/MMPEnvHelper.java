package com.meituan.mmp.main;

import android.app.Activity;
import android.arch.lifecycle.d;
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
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.api.fehorn.FeHornConfig;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.api.update.UpdateHostAppModule;
import com.meituan.mmp.lib.engine.MMPHornPreloadConfig;
import com.meituan.mmp.lib.executor.a;
import com.meituan.mmp.lib.remote.RemoteService;
import com.meituan.mmp.lib.service.IServiceEngine;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.io.PrintStream;
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
public final class MMPEnvHelper {
    private static final String KEY_HOST_BETA_ENABLE = "mmp_host_beta_enable";
    public static final int MAP_TYPE_UNSPECIFIED = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static k cityController;
    private static Pair<String, String> customUA;
    private static String defaultAppID;
    private static Downloader downloader;
    private static volatile IEnvInfo envInfo;
    private static Boolean forceFusionMode;
    private static com.meituan.mmp.main.fusion.b fusionPageManager;
    private static boolean hideFirstPageNavigationBarBackImage;
    private static boolean hideNavigationBarBackImage;
    private static boolean hideNavigationBarMenu;
    private static h mmpUserCenter;
    public static com.meituan.mmp.lib.api.auth.g personalizationInfo;
    @Nullable
    private static com.meituan.mmp.lib.map.d sLocationLoaderProvider;
    private static Class<? extends IServiceEngine> serviceEngineClazz;
    private static com.meituan.mmp.lib.router.b taskSwitcher;
    private static DownloadListener webViewDownloadListener;
    public static final Object INIT_LOCK = new Object();
    private static HashMap<String, com.meituan.mmp.lib.api.c> userDefinedApis = new HashMap<>();
    private static HashMap<String, String> buildInPackage = new HashMap<>();
    private static boolean isDioBundleEnabled = true;
    private static Logger logger = new com.meituan.mmp.c();
    private static aa sniffer = new aa();
    public static f applicationStateDispatcher = new com.meituan.mmp.e();
    private static b catHelper = new b();
    private static int mapType = -1;
    private static final CountDownLatch fullInitLatch = new CountDownLatch(1);
    private static Set<String> mmpFeatureHitList = new HashSet();
    public static String setPassportJoinKey = "";

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        static volatile Runnable a;
    }

    public static /* synthetic */ boolean access$000() {
        return isFullInited();
    }

    public static Downloader getDownloader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dfb29e088955ef477305037bebdd7032", RobustBitConfig.DEFAULT_VALUE) ? (Downloader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dfb29e088955ef477305037bebdd7032") : downloaderLogic();
    }

    public static com.meituan.mmp.lib.api.auth.g getIPersonalizationInfo() {
        return personalizationInfo;
    }

    public static void setIPersonalizationInfo(com.meituan.mmp.lib.api.auth.g gVar) {
        personalizationInfo = gVar;
    }

    public static void init(IEnvInfo iEnvInfo) {
        Object[] objArr = {iEnvInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5fa6e806983b97bd9055aa56eb30137c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5fa6e806983b97bd9055aa56eb30137c");
            return;
        }
        envInfo = iEnvInfo;
        com.meituan.mmp.lib.mp.a.a(iEnvInfo.getApplicationContext());
        com.meituan.msi.a.a(iEnvInfo.getApplicationContext());
        ab.a("MMPEnvHelper.init");
        com.meituan.mmp.lib.mp.ipc.h.a(getContext());
        com.meituan.mmp.lib.config.b.a(false);
        if (MMPHornPreloadConfig.a().d.startPreloadByInit && com.meituan.mmp.lib.mp.a.f()) {
            a.c.a(new Runnable() { // from class: com.meituan.mmp.main.MMPEnvHelper.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "47482edf60a661cab3799e4b003c3521", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "47482edf60a661cab3799e4b003c3521");
                        return;
                    }
                    System.out.println("HeraTrace-MMPEnvHelper: start preload by init");
                    MMPEnvHelper.ensureFullInited();
                    com.meituan.mmp.lib.engine.o.a(MMPEnvHelper.getContext());
                }
            });
        } else {
            com.meituan.mmp.lib.executor.a.g(new Runnable() { // from class: com.meituan.mmp.main.MMPEnvHelper.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e3fba571e434090ed2a1e143ae5b2b41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e3fba571e434090ed2a1e143ae5b2b41");
                    } else if (MMPEnvHelper.access$000()) {
                    } else {
                        System.out.println("HeraTrace-MMPEnvHelper: ensure full init on first idle");
                        a.c.a(new Runnable() { // from class: com.meituan.mmp.main.MMPEnvHelper.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d3ad5b1d1064d18719ddab04e5c7476a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d3ad5b1d1064d18719ddab04e5c7476a");
                                } else {
                                    MMPEnvHelper.ensureFullInited();
                                }
                            }
                        });
                    }
                }
            });
        }
        ab.a();
    }

    private static void delayedInit() {
        com.meituan.mmp.lib.devtools.i b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1c1e9d7cb10f6202bfa2ae4ac6c2934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1c1e9d7cb10f6202bfa2ae4ac6c2934");
            return;
        }
        ab.a("MMPEnvHelper.delayedInit");
        com.meituan.android.picassohelper.c.a(getContext());
        if (!com.sankuai.meituan.serviceloader.b.a()) {
            com.sankuai.meituan.serviceloader.b.a(getContext());
        }
        downloader = downloaderLogic();
        if (serviceEngineClazz == null && com.meituan.mmp.lib.utils.m.a(m.b())) {
            setCustomServiceEngineClazz(com.meituan.mmp.lib.service.c.class);
            if (isInited() && !getEnvInfo().isProdEnv() && DebugHelper.b() && DebugHelper.e() && (b = com.meituan.mmp.lib.devtools.a.b()) != null && b.a() != null) {
                getContext();
            }
        }
        initDDD(getContext());
        com.meituan.mmp.lib.router.c.b();
        registerApis();
        if (fusionPageManager == null) {
            setFusionPageManager(new com.meituan.mmp.main.fusion.a());
        }
        if (com.meituan.mmp.lib.mp.a.f()) {
            com.meituan.mmp.lib.utils.f.a(getContext());
        } else {
            com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
            MetricsModule.a("mmp.launch.process.create", com.meituan.mmp.lib.utils.v.a("process", e == null ? "" : e.b()));
        }
        ab.a();
    }

    public static /* synthetic */ Class lambda$delayedInit$14() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ba9e3db052f9c852bac4695dff6a7be", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ba9e3db052f9c852bac4695dff6a7be") : com.meituan.mmp.lib.service.c.class;
    }

    private static void registerApis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7d5500cfb186cd8cf1ebc18e3ffbd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7d5500cfb186cd8cf1ebc18e3ffbd78");
            return;
        }
        ab.a("MMPEnvHelper.delayedInit.registerApis");
        registerWXApi("scanCode", null, o.b());
        registerWXApiIfNotExist("reportAnalytics", null, p.b());
        registerWXApiIfNotExist("setLxTag", null, q.b());
        registerWXApiIfNotExist("mtLogout", null, r.b());
        registerPrivateApiIfNotExist("lxlog", null, s.b());
        registerPrivateApiIfNotExist("logan", null, t.b());
        registerPrivateApiIfNotExist("getHornConfig", null, u.b());
        if (com.meituan.mmp.lib.utils.m.a(v.b())) {
            registerWXApi("updateHostApp", null, com.meituan.mmp.lib.api.f.x);
        }
        ab.a();
    }

    public static /* synthetic */ Class lambda$registerApis$15() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33cf18b2d417dcb84faee949da361d56", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33cf18b2d417dcb84faee949da361d56") : UpdateHostAppModule.UpdateHostApp.class;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void asyncInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6e99c2e880b7d177dada5f4eb6300a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6e99c2e880b7d177dada5f4eb6300a3");
            return;
        }
        ab.a("MMPEnvHelper.asyncInit");
        appendMMPBaseDataToCrashInfo();
        com.meituan.mmp.lib.p.a();
        com.meituan.mmp.lib.y.a(getContext());
        RemoteService.a(getContext());
        RemoteService.b();
        com.meituan.mmp.lib.config.c.a();
        com.meituan.mmp.lib.router.c.a();
        com.meituan.mmp.lib.config.b.c();
        FeHornConfig.a();
        com.meituan.mmp.lib.msi.h.a();
        com.meituan.mmp.lib.api.q.a();
        ab.a();
    }

    private static void appendMMPBaseDataToCrashInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b65b7a89d5a559d7ad19077a138a4d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b65b7a89d5a559d7ad19077a138a4d0f");
        } else {
            com.meituan.crashreporter.c.c().a(new com.meituan.crashreporter.a() { // from class: com.meituan.mmp.main.MMPEnvHelper.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.crashreporter.a
                public final Map<String, Object> getCrashInfo(String str, boolean z) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3a2f5d0844a7b20ec8fae5d78ca305d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3a2f5d0844a7b20ec8fae5d78ca305d");
                    }
                    HashMap hashMap = new HashMap();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.trace.a.a;
                    String str2 = null;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "6f3301c136a110c4eb3856f7b50f238c", RobustBitConfig.DEFAULT_VALUE)) {
                        str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "6f3301c136a110c4eb3856f7b50f238c");
                    } else if (com.meituan.mmp.a.c.d.a(d.b.CREATED)) {
                        Activity b = com.meituan.mmp.a.b.b();
                        if (b instanceof HeraActivity) {
                            str2 = ((HeraActivity) b).h();
                        }
                    }
                    hashMap.put("mmpAppVersion", str2);
                    hashMap.put("mmpAppId", com.meituan.mmp.lib.trace.a.c());
                    return hashMap;
                }
            });
        }
    }

    private static Downloader downloaderLogic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c08b03da04d98f5444d751fb874ecec7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Downloader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c08b03da04d98f5444d751fb874ecec7");
        }
        if (com.meituan.mmp.lib.config.b.o() == 0) {
            if (com.meituan.mmp.lib.utils.m.a(n.b())) {
                return new com.meituan.mmp.d();
            }
            return new ac();
        } else if (com.meituan.mmp.lib.config.b.o() == 1) {
            return new ac();
        } else {
            return new ac();
        }
    }

    public static /* synthetic */ Class lambda$downloaderLogic$16() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f06e86edf0c56c8cdba06a472a5c83a", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f06e86edf0c56c8cdba06a472a5c83a") : com.meituan.mmp.d.class;
    }

    private static void initDDD(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4233f0eca94c3f5ed196f52ee39e0e3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4233f0eca94c3f5ed196f52ee39e0e3a");
            return;
        }
        com.meituan.met.mercury.load.core.g.a(context, new com.meituan.met.mercury.load.core.l() { // from class: com.meituan.mmp.main.MMPEnvHelper.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.met.mercury.load.core.l
            public final String getUuid() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f1a2ca9dbdae48ded5d48fe419a30870", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f1a2ca9dbdae48ded5d48fe419a30870") : MMPEnvHelper.getEnvInfo().getUUID();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a3a6649a28832cee04f4e6862dfc0b7c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a3a6649a28832cee04f4e6862dfc0b7c") : MMPEnvHelper.getEnvInfo().getUserID();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getChannel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "986faa187e3cab53d3a43c3b27957708", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "986faa187e3cab53d3a43c3b27957708") : MMPEnvHelper.getEnvInfo().getChannel();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final int getMobileAppId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d54db2d8113b63d5391b7192396aaace", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d54db2d8113b63d5391b7192396aaace")).intValue() : MMPEnvHelper.getEnvInfo().getMobileAppId();
            }
        });
        com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.main.MMPEnvHelper.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aad79807d3367a07c6b547c44819247a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aad79807d3367a07c6b547c44819247a");
                } else {
                    com.meituan.mmp.lib.update.c.a();
                }
            }
        });
    }

    public static IEnvInfo getEnvInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9dff2829ed63c233efbbd21f1dc3c85", RobustBitConfig.DEFAULT_VALUE)) {
            return (IEnvInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9dff2829ed63c233efbbd21f1dc3c85");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c157a9b0dce6208cc24bff99650fef3", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c157a9b0dce6208cc24bff99650fef3") : getEnvInfo().getApplicationContext();
    }

    public static <T> T getSystemService(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5589ab974f21c7ab037c5fa9b1f40f3a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5589ab974f21c7ab037c5fa9b1f40f3a") : (T) getEnvInfo().getApplicationContext().getSystemService(str);
    }

    public static void setWebViewDownloadListener(DownloadListener downloadListener) {
        webViewDownloadListener = downloadListener;
    }

    @Nullable
    public static DownloadListener getWebViewDownloadListener() {
        return webViewDownloadListener;
    }

    public static void setLogger(Logger logger2) {
        logger = logger2;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setSniffer(aa aaVar) {
        sniffer = aaVar;
    }

    public static aa getSniffer() {
        return sniffer;
    }

    public static void setCityController(k kVar) {
        cityController = kVar;
    }

    @Nullable
    public static k getCityController() {
        return cityController;
    }

    public static void setMMPUserCenter(h hVar) {
        mmpUserCenter = hVar;
    }

    public static h getMMPUserCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        h hVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "daea88e95503a529989614fca6066d48", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "daea88e95503a529989614fca6066d48");
        }
        if (mmpUserCenter == null) {
            List a2 = com.sankuai.meituan.serviceloader.b.a(h.class, "mmp_user_center");
            if (a2 != null && a2.size() > 0) {
                hVar = (h) a2.get(0);
            }
            mmpUserCenter = hVar;
        }
        return mmpUserCenter;
    }

    public static void setCatHelper(b bVar) {
        catHelper = bVar;
    }

    public static b getCatHelper() {
        return catHelper;
    }

    public static SharedPreferences getSharedPreferences(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40cf770b57a634bc4b16524de2202ca4", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40cf770b57a634bc4b16524de2202ca4") : getSharedPreferences(getContext(), str);
    }

    public static SharedPreferences getSharedPreferences(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b19d83cc3cf0639d93f18fb23f172454", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b19d83cc3cf0639d93f18fb23f172454") : new z(context, str);
    }

    public static SharedPreferences getDefaultSharedPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "695dd996fd8b1f2312763fe4ff7db6a8", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "695dd996fd8b1f2312763fe4ff7db6a8") : getSharedPreferences(getContext(), ContainerInfo.ENV_MMP);
    }

    public static SharedPreferences getDefaultSharedPreferences(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ef52cfa0ceb0752854003ca1e603ad8", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ef52cfa0ceb0752854003ca1e603ad8") : getSharedPreferences(context, ContainerInfo.ENV_MMP);
    }

    public static void setCheckUpdateFromTestEnv(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8195546e572073bb6df0f35aac969c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8195546e572073bb6df0f35aac969c00");
        } else {
            getDefaultSharedPreferences().edit().putBoolean(KEY_HOST_BETA_ENABLE, z).apply();
        }
    }

    public static boolean shouldCheckUpdateFromTestEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cc8a63df590a6fca54fa54dee485ef1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cc8a63df590a6fca54fa54dee485ef1")).booleanValue() : getDefaultSharedPreferences().getBoolean(KEY_HOST_BETA_ENABLE, false);
    }

    public static Class<? extends IServiceEngine> getCustomServiceEngineClazz() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3487900b7275d69c43e175d5edce4404", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3487900b7275d69c43e175d5edce4404");
        }
        if (serviceEngineClazz == null) {
            serviceEngineClazz = getDefaultWebViewServiceEngineClazz();
        }
        return serviceEngineClazz;
    }

    public static void setCustomServiceEngineClazz(Class<? extends IServiceEngine> cls) {
        if (cls != null) {
            serviceEngineClazz = cls;
        }
    }

    public static Class<? extends IServiceEngine> getDefaultWebViewServiceEngineClazz() {
        return com.meituan.mmp.lib.service.e.class;
    }

    public static void setMapType(int i) {
        mapType = i;
    }

    public static int getMapType() {
        return mapType;
    }

    public static void addBuildInPackage(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a3a731f93ca0b569d86a8932e87226f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a3a731f93ca0b569d86a8932e87226f");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            buildInPackage.put(str, str2);
        }
    }

    public static HashMap<String, String> getBuildInPackage() {
        return buildInPackage;
    }

    public static Map<String, com.meituan.mmp.lib.api.c> getUserDefinedApis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5620753aa43b5814af3b1a061f908a7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5620753aa43b5814af3b1a061f908a7") : Collections.unmodifiableMap(userDefinedApis);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void registerWXApi(String str, String[] strArr, com.meituan.mmp.lib.api.e<?> eVar) {
        Object[] objArr = {str, strArr, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37cd2ef3ba318ac3785bfab93889409f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37cd2ef3ba318ac3785bfab93889409f");
        } else {
            registerApi(str, strArr, eVar, 0, false);
        }
    }

    private static void registerWXApiIfNotExist(String str, String[] strArr, com.meituan.mmp.lib.api.e<?> eVar) {
        Object[] objArr = {str, strArr, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61a712c88ac6e0e041267142a4175afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61a712c88ac6e0e041267142a4175afd");
        } else {
            registerApi(str, strArr, eVar, 0, true);
        }
    }

    public static void registerCustomApi(String str, String[] strArr, com.meituan.mmp.lib.api.e<?> eVar) {
        Object[] objArr = {str, strArr, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b8beb15f969995b0aa4bf1f0aa6da11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b8beb15f969995b0aa4bf1f0aa6da11");
        } else {
            registerApi(str, strArr, eVar, 1, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void registerPrivateApi(String str, String[] strArr, com.meituan.mmp.lib.api.e<?> eVar) {
        Object[] objArr = {str, strArr, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e27bb8faaf6066727c058a0202d6ec84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e27bb8faaf6066727c058a0202d6ec84");
        } else {
            registerApi(str, strArr, eVar, 2, false);
        }
    }

    private static void registerPrivateApiIfNotExist(String str, String[] strArr, com.meituan.mmp.lib.api.e<?> eVar) {
        Object[] objArr = {str, strArr, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe7d5f4ab432494961e2764402d5ef91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe7d5f4ab432494961e2764402d5ef91");
        } else {
            registerApi(str, strArr, eVar, 2, true);
        }
    }

    private static void registerApi(String str, String[] strArr, com.meituan.mmp.lib.api.e<?> eVar, int i, boolean z) {
        Object[] objArr = {str, strArr, eVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d53ccd54d72b00ecf65f46a5a632881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d53ccd54d72b00ecf65f46a5a632881");
        } else if (eVar == null) {
        } else {
            com.meituan.mmp.lib.api.c cVar = new com.meituan.mmp.lib.api.c(str, i, strArr, eVar);
            if (z && userDefinedApis.containsKey(cVar.b)) {
                return;
            }
            userDefinedApis.put(cVar.b, cVar);
        }
    }

    public static ICustomEventDispatch registerCustomEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73aec22bc917eda33c96ae0c5aeaee7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICustomEventDispatch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73aec22bc917eda33c96ae0c5aeaee7b");
        }
        return getEventDispatch("customEvent_" + str);
    }

    private static ICustomEventDispatch getEventDispatch(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b3a955c9d8ee52462fd5d25ef8f6cff", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICustomEventDispatch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b3a955c9d8ee52462fd5d25ef8f6cff");
        }
        if (x.d.containsKey(str)) {
            return x.d.get(str);
        }
        c cVar = new c(str);
        x.d.put(str, cVar);
        return cVar;
    }

    public static ICustomEventDispatch registerPrivateEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13c9f07f4575aed232ea64a28f256524", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICustomEventDispatch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13c9f07f4575aed232ea64a28f256524");
        }
        return getEventDispatch("privateEvent_" + str);
    }

    public static void setCustomUserAgentSuffix(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "038231dce975b12cbd0af8642ba0981f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "038231dce975b12cbd0af8642ba0981f");
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

    public static void setAppBrandTaskSwitcher(com.meituan.mmp.lib.router.b bVar) {
        taskSwitcher = bVar;
    }

    public static com.meituan.mmp.lib.router.b getAppBrandTaskSwitcher() {
        return taskSwitcher;
    }

    public static String getDefaultAppID() {
        return defaultAppID;
    }

    public static void setDefaultAppID(String str) {
        defaultAppID = str;
    }

    public static Boolean isForceFusionMode() {
        return forceFusionMode;
    }

    public static void setForceFusionMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e48f197d813c6bd394fcca2315092404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e48f197d813c6bd394fcca2315092404");
        } else {
            forceFusionMode = Boolean.valueOf(z);
        }
    }

    public static void onMMPContainerCreate(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6409929ae88ba950fe3414ee165021b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6409929ae88ba950fe3414ee165021b1");
            return;
        }
        startHostInit(context);
        com.meituan.mmp.a.a(context);
    }

    public static void startHostInit(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b98b8a8124a7a6a4591d09b4dcb46e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b98b8a8124a7a6a4591d09b4dcb46e4");
        } else if (isInited()) {
        } else {
            Context applicationContext = context.getApplicationContext();
            if (!com.sankuai.meituan.serviceloader.b.a()) {
                System.out.println("HeraTrace-MMPEnvHelper: init service loader by mmp startHostInit");
                com.sankuai.meituan.serviceloader.b.a(applicationContext, (b.a) null);
            }
            List a2 = com.sankuai.meituan.serviceloader.b.a(w.class, (String) null);
            if (a2.isEmpty()) {
                System.out.println("HeraTrace-MMPEnvHelper: HostInitializer not found");
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                it.next();
                System.out.println("HeraTrace-MMPEnvHelper: run hostInit");
            }
        }
    }

    private static boolean isFullInited() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "232b68a514428252b1c7f90c4d218078", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "232b68a514428252b1c7f90c4d218078")).booleanValue() : fullInitLatch.getCount() == 0;
    }

    public static void ensureFullInited() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e31ed8c89eaee123c0505699a7e26509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e31ed8c89eaee123c0505699a7e26509");
        } else if (isFullInited()) {
        } else {
            synchronized (fullInitLatch) {
                if (isFullInited()) {
                    return;
                }
                String name = Thread.currentThread().getName();
                PrintStream printStream = System.out;
                printStream.println("HeraTrace-MMPEnvHelper: start full init in thread " + name);
                Trace.beginSection("MMPEnvHelper.doFullInit");
                doFullInit();
                Trace.endSection();
                System.out.println("HeraTrace-MMPEnvHelper: end full init");
                fullInitLatch.countDown();
            }
        }
    }

    private static void doFullInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f13cd0daf4b41284a96e20bbd61233f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f13cd0daf4b41284a96e20bbd61233f");
            return;
        }
        if (!isInited()) {
            System.out.println("HeraTrace-MMPEnvHelper: base init not called before full init");
        }
        delayedInit();
        if (a.a != null) {
            a.a.run();
        }
        com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.main.MMPEnvHelper.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f16174e4557c3b4139fd826d0a8d47ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f16174e4557c3b4139fd826d0a8d47ff");
                } else {
                    MMPEnvHelper.asyncInit();
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

    public static com.meituan.mmp.main.fusion.b getFusionPageManager() {
        return fusionPageManager;
    }

    public static void setFusionPageManager(com.meituan.mmp.main.fusion.b bVar) {
        fusionPageManager = bVar;
    }

    public static boolean needHideNavigationBarBackImage() {
        return hideNavigationBarBackImage;
    }

    public static void setHideNavigationBarBackImage(boolean z) {
        hideNavigationBarBackImage = z;
    }

    public static boolean isDioBundleEnable() {
        return isDioBundleEnabled;
    }

    public static void setIsDioBundleEnabled(boolean z) {
        isDioBundleEnabled = z;
    }

    public static boolean needHideFirstPageNavigationBarBackImage() {
        return hideFirstPageNavigationBarBackImage;
    }

    public static void setHideFirstPageNavigationBarBackImage(boolean z) {
        hideFirstPageNavigationBarBackImage = z;
    }

    public static Set<String> getMmpFeatureHitList() {
        return mmpFeatureHitList;
    }

    public static void setMmpFeatureHitList(Set<String> set) {
        mmpFeatureHitList = set;
    }

    @NonNull
    public static com.meituan.mmp.lib.map.d getILocationLoaderProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba82bd0b57a30971fea19ee61ef1d310", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.map.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba82bd0b57a30971fea19ee61ef1d310");
        }
        if (sLocationLoaderProvider == null) {
            com.meituan.mmp.lib.map.d dVar = new com.meituan.mmp.lib.map.d() { // from class: com.meituan.mmp.main.MMPEnvHelper.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.map.d
                @NonNull
                public final com.meituan.mmp.lib.map.c a(Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
                    Object[] objArr2 = {activity, cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d1d0a14fbca6d726e37069de4bc18fe7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.meituan.mmp.lib.map.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d1d0a14fbca6d726e37069de4bc18fe7");
                    }
                    List a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.mmp.lib.api.location.b.class, "mmp_location_loader_creator");
                    if (a2 != null && a2.size() > 0) {
                        return ((com.meituan.mmp.lib.api.location.b) a2.get(0)).a(activity, cVar);
                    }
                    bb.b("need dependence mmp-plugin-locate or call setLocationLoaderProvider", new Object[0]);
                    return new com.meituan.mmp.lib.map.c() { // from class: com.meituan.mmp.main.MMPEnvHelper.7.1
                        @Override // com.meituan.mmp.lib.map.c
                        public final void a() {
                        }

                        @Override // com.meituan.mmp.lib.map.c
                        public final void a(com.meituan.mmp.lib.map.b bVar, String str) {
                        }
                    };
                }
            };
            sLocationLoaderProvider = dVar;
            return dVar;
        }
        return sLocationLoaderProvider;
    }

    public static void setLocationLoaderProvider(@NonNull com.meituan.mmp.lib.map.d dVar) {
        sLocationLoaderProvider = dVar;
    }

    public static void setMsiSupportAppApis(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8af332b24870f1c3ffbbc89bd9d74957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8af332b24870f1c3ffbbc89bd9d74957");
        } else {
            com.meituan.mmp.lib.msi.h.a(list);
        }
    }

    public static String getPassportJoinKey() {
        return setPassportJoinKey;
    }

    public static void setPassportJoinKey(String str) {
        setPassportJoinKey = str;
    }
}
