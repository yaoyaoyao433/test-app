package com.sankuai.meituan.android.knb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.sdk.widget.d;
import com.dianping.monitor.impl.j;
import com.dianping.networklog.c;
import com.dianping.titans.TitansBaseWebManager;
import com.dianping.titans.adapters.AdapterManager;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.dianping.titans.bridge.IBridgeConfig;
import com.dianping.titans.cache.CachedResourceManager;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.AddTitleBarElementJsHandler;
import com.dianping.titans.js.jshandler.GetPageStateJsHandler;
import com.dianping.titans.js.jshandler.PostMessageJsHandler;
import com.dianping.titans.js.jshandler.RemoveTitleBarElementJsHandler;
import com.dianping.titans.js.jshandler.ReplaceTitleBarElementJsHandler;
import com.dianping.titans.js.jshandler.ResetTitleBarJsHandler;
import com.dianping.titans.js.jshandler.SendEventJsHandler;
import com.dianping.titans.js.jshandler.SetBackgroundColorJsHandler;
import com.dianping.titans.js.jshandler.SetHtmlTitleJsHandler;
import com.dianping.titans.js.jshandler.SetImageTitleJsHandler;
import com.dianping.titans.js.jshandler.SetLLButtonJsHandler;
import com.dianping.titans.js.jshandler.SetLRButtonJsHandler;
import com.dianping.titans.js.jshandler.SetNavigationBarHiddenJsHandler;
import com.dianping.titans.js.jshandler.SetNavigationBarJsHandler;
import com.dianping.titans.js.jshandler.SetRLButtonJsHandler;
import com.dianping.titans.js.jshandler.SetRRButtonJsHandler;
import com.dianping.titans.js.jshandler.SetSearchBarJsHandler;
import com.dianping.titans.js.jshandler.SetStatusBarStyleJsHandler;
import com.dianping.titans.js.jshandler.SetTitleBarActionJsHandler;
import com.dianping.titans.js.jshandler.SetTitleBarJsHandler;
import com.dianping.titans.js.jshandler.SetTitleJsHandler;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.OfflineInitConfig;
import com.dianping.titans.offline.util.DefaultMonitorService;
import com.dianping.titans.shark.SharkManager;
import com.dianping.titans.utils.GsonProvider;
import com.dianping.titansadapter.AbstractJSBPerformer;
import com.dianping.titansadapter.TitansWebManager;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.impl.DefaultSettingImpl;
import com.sankuai.meituan.android.knb.impl.DefaultWhiteSetImpl;
import com.sankuai.meituan.android.knb.listener.NeedWrapUrlListener;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.android.knb.listener.OnAppendUAListener;
import com.sankuai.meituan.android.knb.resource.LocalIdResourceHandler;
import com.sankuai.meituan.android.knb.util.EnvUtil;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.meituan.android.knb.util.UrlTokenUtils;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.result.privacy.ILogger;
import com.sankuai.titans.result.privacy.PrivacyTitansManager;
import com.sankuai.titans.result.privacy.TitansConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBWebManager {
    public static final String TAG = "knb-titans";
    private static final String TITANS_SWITCH = "titans_switch";
    public static String WXAppId = null;
    private static OnAnalyzeParamsListener analyzeParamsListener = null;
    private static int catAppId = -1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static a.InterfaceC0637a dddCallFactory = null;
    private static ISetCookie iSetCookie = null;
    private static KNBInitCallback initCallback = null;
    private static NeedWrapUrlListener needWrapUrlListener = null;
    private static AbstractJSBPerformer sAbstractJSBPerformer = null;
    private static boolean sEnableDebugMode = false;
    private static IEnvironment sEnvironment = null;
    public static OnAppendUAListener sOnAppendUAListener = null;
    private static ISetting sSetting = null;
    private static boolean sShowDebugUrl = false;
    private static IWhiteSet sWhiteSet;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IEnvironment extends TitansBaseWebManager.IEnvironment {
        public static final String WEBVIEW_URI = "imeituan://www.meituan.com/web";

        boolean geolocationEnable();

        Map<String, String> getAppInfoExtras();

        String getChannel();

        String getCityName();

        String getDeviceId();

        String getDeviceLevel();

        String getFingerprint();

        String getIMEI();

        String getKNBAppId();

        String getLocateCityId();

        String getLocateCityName();

        String getMac();

        String getUserId();

        String getWebviewUri();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ISetCookie {
        void onSetCookie();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ISetting {
        public static final int DEFAULT_TIMEOUT = 25000;

        int getWebTimeout();

        boolean isDebug();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IWhiteSet {
        @Deprecated
        Set<String> getHostWhiteSet();

        @NonNull
        Set<String> getPrefixWhiteSet();

        @NonNull
        Set<String> getSchemeWhiteSet();
    }

    public static void setDDDCallFactory(a.InterfaceC0637a interfaceC0637a) {
        dddCallFactory = interfaceC0637a;
    }

    public static NeedWrapUrlListener getNeedWrapUrlListener() {
        return needWrapUrlListener;
    }

    public static void setNeedWrapUrlListener(NeedWrapUrlListener needWrapUrlListener2) {
        needWrapUrlListener = needWrapUrlListener2;
    }

    public static OnAnalyzeParamsListener getAnalyzeParamsListener() {
        return analyzeParamsListener;
    }

    public static void setOnAnalyzeParamsListener(OnAnalyzeParamsListener onAnalyzeParamsListener) {
        analyzeParamsListener = onAnalyzeParamsListener;
    }

    public static void setOnAppendUAListener(OnAppendUAListener onAppendUAListener) {
        sOnAppendUAListener = onAppendUAListener;
    }

    public static KNBInitCallback getInitCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        List list = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2cc1f330d515abf6d6497a9e17ccc17f", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBInitCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2cc1f330d515abf6d6497a9e17ccc17f");
        }
        try {
            list = b.a(KNBInitCallback.class, "knb_init");
        } catch (Throwable th) {
            c.a("KNBWebManager ServiceLoader.load error:" + Log.getStackTraceString(th), 35, new String[]{"KNBInit"});
        }
        if (list != null && !list.isEmpty()) {
            initCallback = (KNBInitCallback) list.get(0);
        }
        if (initCallback == null) {
            c.a("KNBWebManager error: initCallback is null", 35, new String[]{"KNBInit"});
            try {
                initCallback = (KNBInitCallback) Class.forName("com.meituan.android.base.knb.KNBInit").newInstance();
            } catch (Exception unused) {
                c.a("KNBWebManager Class.forName error", 35, new String[]{"KNBInit"});
            }
        }
        return initCallback;
    }

    public static void setInitCallback(KNBInitCallback kNBInitCallback) {
        initCallback = kNBInitCallback;
    }

    private static void initInner(Context context, IWhiteSet iWhiteSet, ISetting iSetting, AbstractJSBPerformer abstractJSBPerformer, final int i, IEnvironment iEnvironment) {
        Object[] objArr = {context, iWhiteSet, iSetting, abstractJSBPerformer, Integer.valueOf(i), iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b72d465c35af8526a128dc513e35b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b72d465c35af8526a128dc513e35b26");
            return;
        }
        sWhiteSet = iWhiteSet;
        sSetting = iSetting;
        sAbstractJSBPerformer = abstractJSBPerformer;
        sEnvironment = iEnvironment;
        EnvUtil.self().init(context);
        KNBConfig.setAppId(sEnvironment.getKNBAppId());
        catAppId = i;
        TitansBaseWebManager.setEnvironment(sEnvironment);
        KNBRouterManager.getInstance().init(context.getApplicationContext());
        CachedResourceManager.addResourceHandler(DeviceInfo.LOCAL_ID, new LocalIdResourceHandler());
        CachedResourceManager.init(context);
        DefaultMonitorService.setUp(context, i);
        OfflineCenter.createInstance(context, new OfflineInitConfig() { // from class: com.sankuai.meituan.android.knb.KNBWebManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final int getCatId() {
                return i;
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getUUID() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a7f0c16fb5b56b405114adaf1ea7cb28", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a7f0c16fb5b56b405114adaf1ea7cb28") : KNBWebManager.sEnvironment.getUUID();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc5e3c529d517decfd948f3f360f9b62", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc5e3c529d517decfd948f3f360f9b62") : KNBWebManager.sEnvironment.getUserId();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getChannel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd9822772a3aba802c773428b5ce19ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd9822772a3aba802c773428b5ce19ca") : KNBWebManager.sEnvironment.getChannel();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final boolean isDebug() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "39e2c4af367118f6be5ae7a52e13ec50", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "39e2c4af367118f6be5ae7a52e13ec50")).booleanValue() : KNBWebManager.showDebugUrl();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getAppId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "edd80ca6c0fe1b1f2278803d2f5a3949", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "edd80ca6c0fe1b1f2278803d2f5a3949") : KNBWebManager.sEnvironment.getKNBAppId();
            }

            public final String getCityId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "682a0b0f43f73c3ddb9061b58d8eac70", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "682a0b0f43f73c3ddb9061b58d8eac70") : KNBWebManager.sEnvironment.getCityId();
            }

            @Nullable
            public final a.InterfaceC0637a getCallFactory() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81b2c4a72ae9c989fa29435caa51f88e", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81b2c4a72ae9c989fa29435caa51f88e") : KNBWebManager.dddCallFactory;
            }
        });
        KNBConfig.init(context);
        KNBConfig.titansEnvReady();
        j.a(context.getApplicationContext(), i, (String) null).e = 1;
        KNBRuntime.getRuntime().setContext(context);
        BridgeConfigManager.setBridgeConfig(new IBridgeConfig() { // from class: com.sankuai.meituan.android.knb.KNBWebManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String innerUrlKey() {
                return "url";
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final boolean isSchemeInWhite(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25d00a9c1dee3ecf9d698df14e84520c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25d00a9c1dee3ecf9d698df14e84520c")).booleanValue() : KNBWebManager.isInPrefixWhite(str);
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String imei(Context context2) {
                Object[] objArr2 = {context2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d72c2ed3c5f3d969fc488bfb9a07cad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d72c2ed3c5f3d969fc488bfb9a07cad") : KNBWebManager.sEnvironment.getIMEI();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String mac(Context context2) {
                Object[] objArr2 = {context2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b1dc67e897736fa75d07f5279ef583a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b1dc67e897736fa75d07f5279ef583a") : KNBWebManager.sEnvironment.getMac();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String knbAppid() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ec8ffeed1a96da499d3689a753d2eb8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ec8ffeed1a96da499d3689a753d2eb8") : KNBWebManager.sEnvironment.getKNBAppId();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String scheme() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b0270b2fb8bf001f9c4332136140abc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b0270b2fb8bf001f9c4332136140abc") : KNBWebManager.sEnvironment.getWebviewUri();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final Map<String, String> appInfoExtra() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c69b2c4d4b5b3faa1d2b94959f9a5ee", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c69b2c4d4b5b3faa1d2b94959f9a5ee") : KNBWebManager.sEnvironment.getAppInfoExtras();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String wxId() {
                return KNBWebManager.WXAppId;
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final int catId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a159b52ab22da0e3be752dd9921ea35", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a159b52ab22da0e3be752dd9921ea35")).intValue() : KNBWebManager.getCatAppId();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final boolean isDebug() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f8568904603e262db87c4d030819bc26", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f8568904603e262db87c4d030819bc26")).booleanValue() : EnvUtil.self().debugTitans();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final boolean isAccessWhite(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d205910274410e5f1539ad708e629781", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d205910274410e5f1539ad708e629781")).booleanValue() : UriUtil.hostEndWith(str, KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST));
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String userToken() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c29f97d8a7fefb7c867a8690918d6bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c29f97d8a7fefb7c867a8690918d6bc") : KNBWebManager.sEnvironment.getUserToken();
            }

            @Override // com.dianping.titans.bridge.IBridgeConfig
            public final String getDeviceLevel(Context context2) {
                Object[] objArr2 = {context2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "080315c360ac5e275224d93b9f6c783c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "080315c360ac5e275224d93b9f6c783c") : KNBWebManager.sEnvironment.getDeviceLevel();
            }
        });
        initPrivacyQueryCookie(context);
        JsHandlerFactory.registerJsHandler(d.o, "", SetTitleJsHandler.class);
        JsHandlerFactory.registerJsHandler("setLLButton", "", SetLLButtonJsHandler.class);
        JsHandlerFactory.registerJsHandler("setLRButton", "", SetLRButtonJsHandler.class);
        JsHandlerFactory.registerJsHandler("setRLButton", "", SetRLButtonJsHandler.class);
        JsHandlerFactory.registerJsHandler("setRRButton", "", SetRRButtonJsHandler.class);
        JsHandlerFactory.registerJsHandler("setBackgroundColor", "", SetBackgroundColorJsHandler.class);
        JsHandlerFactory.registerJsHandler("setNavigationBarHidden", "", SetNavigationBarHiddenJsHandler.class);
        JsHandlerFactory.registerJsHandler("basic.webview.setHtmlTitle", "", SetHtmlTitleJsHandler.class);
        JsHandlerFactory.registerJsHandler("setSearchBar", "", SetSearchBarJsHandler.class);
        JsHandlerFactory.registerJsHandler("setImageTitle", "", SetImageTitleJsHandler.class);
        JsHandlerFactory.registerJsHandler("setTitleBar", "", SetTitleBarJsHandler.class);
        JsHandlerFactory.registerJsHandler("resetTitleBar", "", ResetTitleBarJsHandler.class);
        JsHandlerFactory.registerJsHandler("removeTitleBarElement", "", RemoveTitleBarElementJsHandler.class);
        JsHandlerFactory.registerJsHandler("addTitleBarElement", "", AddTitleBarElementJsHandler.class);
        JsHandlerFactory.registerJsHandler("replaceTitleBarElement", "", ReplaceTitleBarElementJsHandler.class);
        JsHandlerFactory.registerJsHandler("setTitleBarAction", "", SetTitleBarActionJsHandler.class);
        JsHandlerFactory.registerJsHandler("getPageState", "", GetPageStateJsHandler.class);
        JsHandlerFactory.registerJsHandler("setStatusBarStyle", "", SetStatusBarStyleJsHandler.class);
        JsHandlerFactory.registerJsHandler("sendEvent", "", SendEventJsHandler.class);
        JsHandlerFactory.registerJsHandler("setNavigationBar", "", SetNavigationBarJsHandler.class);
        JsHandlerFactory.registerJsHandler("postMessage", "", PostMessageJsHandler.class);
    }

    private static void initPrivacyQueryCookie(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40656fb68fbf76f8714cc85b505610d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40656fb68fbf76f8714cc85b505610d0");
            return;
        }
        PrivacyTitansManager.getInstance().setILogger(new ILogger() { // from class: com.sankuai.meituan.android.knb.KNBWebManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.privacy.ILogger
            public final void log(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0d94e63801fc5d1fa0f8d43736d2c544", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0d94e63801fc5d1fa0f8d43736d2c544");
                } else {
                    c.a(str, 35, new String[]{str2});
                }
            }
        });
        Horn.register(TITANS_SWITCH, new HornCallback() { // from class: com.sankuai.meituan.android.knb.KNBWebManager.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb07972302de4de25119e44c60a09318", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb07972302de4de25119e44c60a09318");
                } else if (z) {
                    KNBWebManager.updateSwitchConfig(str);
                }
            }
        });
        String accessCache = Horn.accessCache(TITANS_SWITCH);
        if (TextUtils.isEmpty(accessCache)) {
            return;
        }
        updateSwitchConfig(accessCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateSwitchConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85bd9d9be554429a6ed0b8cdc2e5cbd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85bd9d9be554429a6ed0b8cdc2e5cbd6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                PrivacyTitansManager.getInstance().setConfig((TitansConfig) GsonProvider.getGson().fromJson(str, (Class<Object>) TitansConfig.class));
            } catch (Exception e) {
                c.a("updateSwitchConfig error message is " + e.getMessage(), 35, new String[]{"privacy_query"});
            }
        }
    }

    public static AdapterManager getAdapterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7ff152065aa9f33f1e598ba720c9969", RobustBitConfig.DEFAULT_VALUE) ? (AdapterManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7ff152065aa9f33f1e598ba720c9969") : AdapterManager.getInstance();
    }

    public static void init(@NonNull Context context, @NonNull IWhiteSet iWhiteSet, @NonNull ISetting iSetting, @NonNull AbstractJSBPerformer abstractJSBPerformer, @NonNull String str, int i, IEnvironment iEnvironment) {
        Object[] objArr = {context, iWhiteSet, iSetting, abstractJSBPerformer, str, Integer.valueOf(i), iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae05512df6b949e6a70e1e1415491717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae05512df6b949e6a70e1e1415491717");
            return;
        }
        initInner(context, iWhiteSet, iSetting, abstractJSBPerformer, i == 0 ? 10 : i, iEnvironment);
        TitansWebManager.initialTitansx(context.getApplicationContext(), str, abstractJSBPerformer);
    }

    public static void init(@NonNull Context context, @NonNull AbstractJSBPerformer abstractJSBPerformer, @NonNull String str, int i, IEnvironment iEnvironment) {
        Object[] objArr = {context, abstractJSBPerformer, str, Integer.valueOf(i), iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5f672351685d453fa82ead66bf73b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5f672351685d453fa82ead66bf73b76");
        } else {
            init(context, new DefaultWhiteSetImpl(), new DefaultSettingImpl(), abstractJSBPerformer, str, i, iEnvironment);
        }
    }

    public static void init(@NonNull Context context, @NonNull IWhiteSet iWhiteSet, @NonNull ISetting iSetting, @NonNull AbstractJSBPerformer abstractJSBPerformer, @NonNull String str, int i, IEnvironment iEnvironment, SharkManager.ISharkModule iSharkModule) {
        Object[] objArr = {context, iWhiteSet, iSetting, abstractJSBPerformer, str, Integer.valueOf(i), iEnvironment, iSharkModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5adb10f5b0a3c5f75031772ca83d3689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5adb10f5b0a3c5f75031772ca83d3689");
            return;
        }
        init(context, iWhiteSet, iSetting, abstractJSBPerformer, str, i, iEnvironment);
        SharkManager.setSharkModule(iSharkModule);
    }

    public static void init(@NonNull Context context, @NonNull AbstractJSBPerformer abstractJSBPerformer, @NonNull String str, int i, IEnvironment iEnvironment, SharkManager.ISharkModule iSharkModule) {
        Object[] objArr = {context, abstractJSBPerformer, str, Integer.valueOf(i), iEnvironment, iSharkModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fbececa6c6ad287b1c51494c5635d8ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fbececa6c6ad287b1c51494c5635d8ab");
            return;
        }
        init(context, abstractJSBPerformer, str, i, iEnvironment);
        SharkManager.setSharkModule(iSharkModule);
    }

    @Deprecated
    public static void initTitansNoX(@NonNull Context context, @NonNull IWhiteSet iWhiteSet, @NonNull ISetting iSetting, @NonNull AbstractJSBPerformer abstractJSBPerformer, @NonNull String str, int i, IEnvironment iEnvironment, com.dianping.nvnetwork.j jVar) {
        Object[] objArr = {context, iWhiteSet, iSetting, abstractJSBPerformer, str, Integer.valueOf(i), iEnvironment, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d78ea92ddc2991d86d70c42c7fb083ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d78ea92ddc2991d86d70c42c7fb083ad");
            return;
        }
        initTitansNoX(context, iWhiteSet, iSetting, abstractJSBPerformer, str, i, iEnvironment);
        SharkManager.setSharkModule(new KNBSharkModule(jVar));
    }

    @Deprecated
    public static void initTitansNoX(@NonNull Context context, @NonNull IWhiteSet iWhiteSet, @NonNull ISetting iSetting, @NonNull AbstractJSBPerformer abstractJSBPerformer, @NonNull String str, int i, IEnvironment iEnvironment) {
        Object[] objArr = {context, iWhiteSet, iSetting, abstractJSBPerformer, str, Integer.valueOf(i), iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01923690eed1449e47bab266dc7ce52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01923690eed1449e47bab266dc7ce52a");
            return;
        }
        initInner(context, iWhiteSet, iSetting, abstractJSBPerformer, i != 0 ? i : 1, iEnvironment);
        TitansWebManager.initialTitansNoX(context.getApplicationContext(), str, abstractJSBPerformer);
    }

    public static void setiSetCookie(ISetCookie iSetCookie2) {
        iSetCookie = iSetCookie2;
    }

    public static ISetCookie getiSetCookie() {
        return iSetCookie;
    }

    public static final AbstractJSBPerformer getJSBPerformer() {
        return sAbstractJSBPerformer;
    }

    public static final IEnvironment getEnvironment() {
        return sEnvironment;
    }

    public static void showDebugUrl(boolean z) {
        sShowDebugUrl = z;
    }

    public static boolean showDebugUrl() {
        return sShowDebugUrl;
    }

    public static void enableDebugMode(boolean z) {
        sEnableDebugMode = z;
    }

    public static final boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12a1bf0939d56e406b0bf275f14bd0c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12a1bf0939d56e406b0bf275f14bd0c6")).booleanValue();
        }
        if (sEnableDebugMode) {
            return true;
        }
        if (sSetting != null) {
            return sSetting.isDebug();
        }
        return false;
    }

    public static final int getWebTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f04c8e04e394e9c9f95f9cb5bdcc6f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f04c8e04e394e9c9f95f9cb5bdcc6f1")).intValue() : sSetting != null ? sSetting.getWebTimeout() : ISetting.DEFAULT_TIMEOUT;
    }

    public static final boolean isInSchemeWhite(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b33a7190f86617f09bf1d0c04814a37a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b33a7190f86617f09bf1d0c04814a37a")).booleanValue() : sWhiteSet != null && sWhiteSet.getSchemeWhiteSet().contains(str);
    }

    public static final boolean isInPrefixWhite(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd7507e7559e6b50f96de2aca87a67af", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd7507e7559e6b50f96de2aca87a67af")).booleanValue() : (sWhiteSet != null && sWhiteSet.getPrefixWhiteSet().contains(str)) || KNBConfig.getStringListConfig(KNBConfig.CONFIG_SCHEME_WHITE, Collections.EMPTY_LIST).contains(str);
    }

    public static final boolean isInBlackList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10d8c9682b0f814e7571a9deee169aae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10d8c9682b0f814e7571a9deee169aae")).booleanValue() : UriUtil.equalsWithHostAndPath(str, KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_BLACK, Collections.EMPTY_LIST));
    }

    public static final boolean needWrapUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b7694f9a901200b8afd90c37b3172de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b7694f9a901200b8afd90c37b3172de")).booleanValue();
        }
        if (needWrapUrlListener == null) {
            return false;
        }
        return needWrapUrlListener.needWrapUrl(str);
    }

    public static boolean needRemoveToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41521c893ef36910ed9eacaf35f4c06d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41521c893ef36910ed9eacaf35f4c06d")).booleanValue() : needRemoveToken(str, str);
    }

    public static boolean needRemoveTokenInRefer(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b09aab10036c642251e9b74a4a7ee69c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b09aab10036c642251e9b74a4a7ee69c")).booleanValue() : needRemoveToken(str, str2);
    }

    private static boolean needRemoveToken(String str, String str2) {
        List<String> stringListConfig;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f5a6cf8c59129778194790f3bd87438", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f5a6cf8c59129778194790f3bd87438")).booleanValue();
        }
        try {
            stringListConfig = KNBConfig.getStringListConfig(KNBConfig.CONFIG_COMPANY_INTERNAL_WHITE, null);
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str) || stringListConfig == null || stringListConfig.isEmpty() || !UrlTokenUtils.containTokenInUrlQuery(str2)) {
            return false;
        }
        return !UriUtil.hostEndWith(str, stringListConfig);
    }

    public static int getCatAppId() {
        return catAppId;
    }
}
