package com.sankuai.meituan.android.knb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.entity.OfflineReportItem;
import com.dianping.titans.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfigEntity;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.base.AppHostProvider;
import com.sankuai.meituan.android.knb.util.AndroidAdapter;
import com.sankuai.meituan.android.knb.util.CrashUtil;
import com.sankuai.meituan.android.knb.util.EnvUtil;
import com.sankuai.meituan.android.knb.util.WebViewCacheHandler;
import com.sankuai.titans.EventReporter;
import com.sankuai.titans.Mainboard;
import com.sankuai.titans.config.ConfigManager;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBConfig {
    private static final int CACHE_ITEM_COUNT = 10;
    private static final String CIP_KEY_HIGH_DEVICE = "HIGH_DEVICE";
    public static final String CONFIG_ACCESS_BLACK = "access_black";
    public static final String CONFIG_ACCESS_CERTIFICATE = "access_certificate";
    public static final String CONFIG_ACCESS_SHARK = "access_shark";
    public static final String CONFIG_ACCESS_WHITE = "access_white";
    public static final String CONFIG_BRIDGE_GREEN = "bridge_green";
    public static final String CONFIG_CLEAR_CACHE = "clear";
    public static final String CONFIG_CLEAR_CUSTOM_KEY = "custom_key";
    public static final String CONFIG_CLEAR_FILE_LIST = "clearFileList";
    public static final String CONFIG_COMPANY_INTERNAL_WHITE = "access_internalWhite";
    public static final String CONFIG_DEPLOY_WHITE = "deploy_white";
    public static final String CONFIG_DESIGN_TITLE_BAR = "design_title_bar";
    private static final String CONFIG_FILE_NAME = "knb_union_config.json";
    public static final String CONFIG_FILE_PROTOCOL_WHITE_LIST = "file_protocol_white_list";
    public static final String CONFIG_INJECT_DEBUG_JS = "inject_debug_js";
    public static final String CONFIG_INJECT_PATCH_JS = "inject_patch_js";
    public static final String CONFIG_REPORT_DEVICES = "report_devices";
    public static final String CONFIG_REPORT_DNS = "report_dns";
    public static final String CONFIG_REPORT_OFFLINE = "config_report_offline";
    public static final String CONFIG_REPORT_QUERY = "report_query";
    public static final String CONFIG_SCHEME_EHWEBVIEW = "scheme_ehwebview";
    public static final String CONFIG_SCHEME_WHITE = "scheme_white";
    public static final String CONFIG_SWITCH_ALLOW_GEOLOCATION = "switch_allow_geolocation";
    public static final String CONFIG_SWITCH_OFFLINE_USING_MAIN_FRAME = "switch_offline_using_main_frame";
    public static final String CONFIG_SWITCH_REVERT_FILE_CHOOSER_LOGIC = "switch_revert_file_chooser_logic";
    public static final String CONFIG_SWITCH_USING_CHECK_HTTP_ERROR = "switch_using_check_http_error";
    public static final String CONFIG_SWITCH_USING_CHECK_SSL_ERROR = "switch_using_check_ssl_error";
    public static final String CONFIG_SWITCH_USING_ENCODE = "switch_using_encode";
    public static final String CONFIG_SWITCH_USING_OFFLINE = "switch_using_offline";
    public static final String CONFIG_SWITCH_USING_SHARK = "switch_using_shark";
    public static final String CONFIG_SWITCH_USING_SLOW_DRAW = "switch_using_slow_draw";
    public static final String CONFIG_WEB_ACTION_BLACK = "access_web_action_black";
    public static final List<String> DEFAULT_ACCESS_WHITE_LIST;
    public static final List<String> DEFAULT_BRIDGE_WHITE_LIST;
    public static final List<String> DEFAULT_WHITE_LIST;
    public static final String HORN_WEBVIEW = "webview";
    private static final long MIN_PULL_CYCLE_DURATION = 600000;
    private static final String OFFLINE_CONFIG_STORAGE = "mtplatform_knb_offline";
    private static final String TAG = "knb_config";
    private static Context appContext;
    private static Map<String, Map<String, Object>> cachedConfigs;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static q cipStorageCenter;
    private static Map<String, JSONObject> configs;
    private static volatile boolean firstPageIsWeb;
    private static volatile boolean initFlag;
    public static volatile boolean isAllowFileAccess;
    public static volatile boolean isAllowFileAccessFromFileURLs;
    public static volatile boolean isAllowUniversalAccessFromFileURLs;
    private static ArrayList<IKNBConfigObserver> knbConfigObservers;
    private static String mOfflineConifgStatus;
    private static volatile boolean preloadConfigReady;
    private static String sAppId;
    private static final LruCache<String, Object> sCache;
    private static String sConfigFilePath;
    private static final Gson sGson;
    private static long sLastPullStamp;
    private static String sPkgName;
    private static final ReadWriteLock sRWLock;
    private static volatile boolean titansEnvReady;

    static {
        List<String> asList = Arrays.asList(".jchunuo.com", "dpurl.cn", ".dianping.com", ".51ping.com", ".dpfile.com", ".alpha.dp", ".dper.com", ".kuxun.cn", ".neixin.cn", ".meituan.com", ".meituan.net", ".sankuai.com", ".sankuai.info", ".maoyan.com", ".zhenguo.com", "t8.pub", ".mobike.io", ".mobike.com", ".gewara.com", "vss.baobaoaichi.cn");
        DEFAULT_WHITE_LIST = asList;
        DEFAULT_ACCESS_WHITE_LIST = asList;
        DEFAULT_BRIDGE_WHITE_LIST = DEFAULT_WHITE_LIST;
        preloadConfigReady = false;
        titansEnvReady = false;
        mOfflineConifgStatus = "无";
        sCache = new LruCache<>(10);
        configs = new ConcurrentHashMap();
        cachedConfigs = new ConcurrentHashMap();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(JSONObject.class, new JsonDeserializer<JSONObject>() { // from class: com.sankuai.meituan.android.knb.KNBConfig.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.google.gson.JsonDeserializer
            public final JSONObject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                Object[] objArr = {jsonElement, type, jsonDeserializationContext};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d00ce2de88afa5d8f392f15d77f8ab6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d00ce2de88afa5d8f392f15d77f8ab6");
                }
                try {
                    return new JSONObject(jsonElement.toString());
                } catch (JSONException unused) {
                    return null;
                }
            }
        });
        gsonBuilder.registerTypeAdapter(JSONArray.class, new JsonDeserializer<JSONArray>() { // from class: com.sankuai.meituan.android.knb.KNBConfig.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.google.gson.JsonDeserializer
            public final JSONArray deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                Object[] objArr = {jsonElement, type, jsonDeserializationContext};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c183ae2b4918188b0f0e119feba5ee46", RobustBitConfig.DEFAULT_VALUE)) {
                    return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c183ae2b4918188b0f0e119feba5ee46");
                }
                try {
                    return new JSONArray(jsonElement.toString());
                } catch (JSONException unused) {
                    return null;
                }
            }
        });
        sGson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().create();
        sRWLock = new ReentrantReadWriteLock();
        firstPageIsWeb = false;
        isAllowUniversalAccessFromFileURLs = false;
        isAllowFileAccessFromFileURLs = false;
        isAllowFileAccess = false;
    }

    public static String getOfflineConfigStatus() {
        return mOfflineConifgStatus;
    }

    public static void setOversea(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad67fa86f7da3787a4bb2249684c1846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad67fa86f7da3787a4bb2249684c1846");
        } else if (z) {
            Constants.WEBSAFE_HOST = Constants.WEBSAFE_HOST_OVERSEA;
            Constants.BUNDLE_URL = Constants.BUNDLE_OVERSEA;
        } else {
            Constants.WEBSAFE_HOST = Constants.WEBSAFE_HOST_STAGING;
            Constants.BUNDLE_URL = Constants.BUNDLE_STAGING;
        }
    }

    public static boolean hasInited() {
        return initFlag;
    }

    public static void setFirstPageWeb(boolean z) {
        firstPageIsWeb = z;
    }

    public static boolean isFirstPageWeb() {
        return firstPageIsWeb;
    }

    public static void setAppId(String str) {
        sAppId = str;
    }

    public static synchronized void init(Context context) {
        synchronized (KNBConfig.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b1c15115c7a00cb11540651793f3896", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b1c15115c7a00cb11540651793f3896");
            } else if (initFlag) {
            } else {
                if (context != null && context.getApplicationContext() != null) {
                    appContext = context.getApplicationContext();
                    EnvUtil.self().init(appContext);
                    CrashUtil.init(appContext);
                    AndroidAdapter.init(appContext);
                    cipStorageCenter = q.a(appContext, OFFLINE_CONFIG_STORAGE);
                    if (TextUtils.isEmpty(sConfigFilePath)) {
                        sConfigFilePath = q.a(appContext, "mtplatform_titans", CONFIG_FILE_NAME, u.e).getPath();
                    }
                    if (TextUtils.isEmpty(sPkgName)) {
                        sPkgName = appContext.getPackageName();
                    }
                    pullConfig();
                    initMainBoard();
                    initFlag = true;
                }
            }
        }
    }

    public static void initMainBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b6a8ea80743a99c9ccecc13092d3936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b6a8ea80743a99c9ccecc13092d3936");
            return;
        }
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 0);
            KNBWebManager.IEnvironment environment = KNBWebManager.getEnvironment();
            if (environment == null) {
                Log.e(TAG, "no environment to debug");
                return;
            }
            String uuid = environment.getUUID();
            if (TextUtils.isEmpty(uuid)) {
                uuid = environment.getDeviceId();
            }
            String str = sAppId;
            if (EnvUtil.self().debugTitans()) {
                str = str.substring(0, str.length() - 1) + "1";
            }
            AppHostProvider appHostProvider = new AppHostProvider();
            appHostProvider.setAppID(str);
            appHostProvider.setAppVersion(packageInfo.versionName);
            appHostProvider.setContext(appContext);
            appHostProvider.setDeviceID(uuid);
            Mainboard.getInstance().registerHostAppProvider(appHostProvider);
        } catch (Throwable th) {
            Log.e(TAG, null, th);
        }
    }

    public static Context getContext() {
        return appContext;
    }

    private static void closeQuiet(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e2c4a04c8d4f67ae7f858675476539a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e2c4a04c8d4f67ae7f858675476539a");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static org.json.JSONObject getAllConfig() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.sankuai.meituan.android.knb.KNBConfig.changeQuickRedirect
            java.lang.String r9 = "b9f2f852d81b3c3f16f7a5d3adc787d6"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r8, r1, r9)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L1c:
            java.lang.String r0 = com.sankuai.meituan.android.knb.KNBConfig.sConfigFilePath
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L39
            boolean r0 = com.sankuai.meituan.android.knb.KNBWebManager.isDebug()
            if (r0 != 0) goto L30
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        L30:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "no init"
            r0.<init>(r1)
            throw r0
        L39:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L8d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L89
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L89
            long r1 = r1.length()     // Catch: java.lang.Throwable -> L8a
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L8a
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L8a
            r0.read(r1)     // Catch: java.lang.Throwable -> L8a
            boolean r2 = com.sankuai.meituan.android.knb.KNBWebManager.isDebug()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L73
            java.lang.String r2 = "knb_config"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = "getAllConfig: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L8a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8a
            android.util.Log.e(r2, r3)     // Catch: java.lang.Throwable -> L8a
        L73:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L8a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a
            closeQuiet(r0)
            return r2
        L81:
            r1 = move-exception
            goto L85
        L83:
            r1 = move-exception
            r0 = r2
        L85:
            closeQuiet(r0)
            throw r1
        L89:
            r0 = r2
        L8a:
            closeQuiet(r0)
        L8d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.KNBConfig.getAllConfig():org.json.JSONObject");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List, java.lang.Object, java.util.ArrayList] */
    public static <T> T getConfig(String str, Class<T> cls) {
        T t;
        T t2;
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "296ba82457d409916443bfeda088c575", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "296ba82457d409916443bfeda088c575");
        }
        if (TextUtils.isEmpty(str) || cls == null) {
            return null;
        }
        sRWLock.readLock().lock();
        try {
            t = (T) sCache.get(str);
        } catch (Throwable th) {
            try {
                if (KNBWebManager.isDebug()) {
                    throw th;
                }
            } finally {
                sRWLock.readLock().unlock();
            }
        }
        if (t != null) {
            Class<?> cls2 = t.getClass();
            if (cls2 != cls && !cls.isAssignableFrom(cls2)) {
                T t3 = (T) sGson.fromJson(t.toString(), (Class<Object>) cls);
                sCache.put(str, t3);
                t2 = t3;
            }
            return t;
        }
        JSONObject allConfig = getAllConfig();
        String optString = allConfig.optString(str, null);
        if (optString != null) {
            T t4 = (T) sGson.fromJson(optString, (Class<Object>) cls);
            if (sCache.size() <= 0) {
                int maxSize = sCache.maxSize();
                Iterator<String> keys = allConfig.keys();
                for (int i = 1; i < maxSize && keys.hasNext(); i++) {
                    String next = keys.next();
                    if (!str.equals(next)) {
                        sCache.put(next, allConfig.optString(next, null));
                    }
                }
            }
            sCache.put(str, t4);
            t2 = t4;
        } else {
            if (CONFIG_FILE_PROTOCOL_WHITE_LIST.equals(str)) {
                ?? r12 = (T) new ArrayList();
                String path = q.a(appContext, "mtplatform_titans", (String) null, u.b).getPath();
                r12.add(path + "/h5/");
                r12.add("/android_asset/");
                r12.add("/android_res/");
                sCache.put(str, r12);
                t2 = r12;
            }
            return null;
        }
        return t2;
    }

    public static q getOfflineCIPStorageCenter() {
        return cipStorageCenter;
    }

    public static <T> T getConfig(String str, Class<T> cls, T t) {
        Object[] objArr = {str, cls, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60ceba1fc9c63640085c95845a4c55ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60ceba1fc9c63640085c95845a4c55ae");
        }
        T t2 = (T) getConfig(str, cls);
        return t2 == null ? t : t2;
    }

    public static List<String> getStringListConfig(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20e26d2410d1722e1f6b18c67d79fe2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20e26d2410d1722e1f6b18c67d79fe2b");
        }
        List<String> list2 = (List) getConfig(str, List.class);
        return list2 == null ? list : list2;
    }

    public static boolean getBooleanConfig(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6fabd7b8d481cd3f045355a3f44e70e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6fabd7b8d481cd3f045355a3f44e70e8")).booleanValue();
        }
        Boolean bool = (Boolean) getConfig(str, Boolean.class);
        return bool == null ? z : bool.booleanValue();
    }

    public static String getStringConfig(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb723142a73eb346a66ab3c1819e8f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb723142a73eb346a66ab3c1819e8f5a");
        }
        String str3 = (String) getConfig(str, String.class);
        return str3 == null ? str2 : str3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean setConfig(java.util.Map<java.lang.String, java.lang.Object> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.KNBConfig.setConfig(java.util.Map, boolean):boolean");
    }

    public static boolean setConfig(Context context, Map<String, Object> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "032780418b0a2fd415bc9884438a0e81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "032780418b0a2fd415bc9884438a0e81")).booleanValue();
        }
        init(context);
        return setConfig(map, false);
    }

    public static boolean setConfig(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa62f6aef38a38a2600d6bc1ae852c05", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa62f6aef38a38a2600d6bc1ae852c05")).booleanValue() : setConfig(map, false);
    }

    public static boolean setConfig(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0cf6b91bd47a8a8003a0cfa873a89707", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0cf6b91bd47a8a8003a0cfa873a89707")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return setConfig((Map<String, Object>) Collections.singletonMap(str, obj), false);
    }

    public static void pullConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bff1b868613099fd78eacdd1f89c6b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bff1b868613099fd78eacdd1f89c6b4d");
        } else if (Math.abs(System.currentTimeMillis() - sLastPullStamp) >= MIN_PULL_CYCLE_DURATION && !TextUtils.isEmpty(sAppId)) {
            pullWebViewConfig(makePullConfigQuery());
            OfflineCenter.getInstance().pullOfflineConfig();
        }
    }

    private static Map<String, Object> makePullConfigQuery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "46b73fe434d0f1ba951811a74fe5e2f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "46b73fe434d0f1ba951811a74fe5e2f6");
        }
        String str = sAppId;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (EnvUtil.self().debugTitans()) {
            hashMap.put("isHornTest", Boolean.TRUE);
        }
        if (str == null) {
            str = "";
        }
        hashMap.put("appid", str);
        hashMap.put("titansVersion", "20.11.9");
        hashMap.put("source", "client");
        return hashMap;
    }

    public static void titansEnvReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "380f9b3ca18bf3d8af332fbf6c444d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "380f9b3ca18bf3d8af332fbf6c444d3b");
            return;
        }
        titansEnvReady = true;
        if (EnvUtil.self().debugTitans()) {
            Log.e("Preload", "titansEnvReady titansEnvReady: " + titansEnvReady + " preloadConfigReady: " + preloadConfigReady);
        }
    }

    public static void subscribeKNBConfigReady(IKNBConfigObserver iKNBConfigObserver) {
        Object[] objArr = {iKNBConfigObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acbaeb1154c61891132bad1980ce58ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acbaeb1154c61891132bad1980ce58ae");
        } else if (iKNBConfigObserver == null) {
        } else {
            if (knbConfigObservers == null) {
                synchronized (KNBConfig.class) {
                    if (knbConfigObservers == null) {
                        knbConfigObservers = new ArrayList<>();
                    }
                }
            }
            knbConfigObservers.add(iKNBConfigObserver);
        }
    }

    public static boolean hasKNBConfigObserver(IKNBConfigObserver iKNBConfigObserver) {
        Object[] objArr = {iKNBConfigObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60b0e4392a06dbd5e2e46ec6821e2e6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60b0e4392a06dbd5e2e46ec6821e2e6e")).booleanValue();
        }
        if (knbConfigObservers != null) {
            return knbConfigObservers.contains(iKNBConfigObserver);
        }
        return false;
    }

    private static void pullWebViewConfig(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8f130592e4b0efa28fbfae22b17e6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8f130592e4b0efa28fbfae22b17e6d8");
        } else {
            ConfigManager.pullConfig("webview", new HornCallback() { // from class: com.sankuai.meituan.android.knb.KNBConfig.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2d059b36f1c521a94546e12582c255f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2d059b36f1c521a94546e12582c255f6");
                        return;
                    }
                    if (KNBWebManager.isDebug()) {
                        Log.e(KNBConfig.TAG, "horn enable: " + z + " result: " + str);
                    }
                    if (!z || TextUtils.isEmpty(str)) {
                        return;
                    }
                    long unused = KNBConfig.sLastPullStamp = System.currentTimeMillis();
                    KNBConfigEntity kNBConfigEntity = (KNBConfigEntity) KNBConfig.sGson.fromJson(str, (Class<Object>) KNBConfigEntity.class);
                    KNBConfig.updateConfig("webview", str);
                    if (kNBConfigEntity.cache != null) {
                        WebViewCacheHandler.handle(KNBConfig.appContext, kNBConfigEntity.switcher.clearWebViewCache, kNBConfigEntity.cache.customKey, kNBConfigEntity.cache.clear, kNBConfigEntity.cache.clearFileList);
                    }
                    if (kNBConfigEntity.report != null && kNBConfigEntity.report.query != null) {
                        EventReporter.getInstance().setQueryWhiteList(kNBConfigEntity.report.query);
                    }
                    KNBConfig.handlePullResult(kNBConfigEntity);
                    KNBConfig.setupOfflineReport();
                }
            }, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setupOfflineReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e7f0a5aee97ba1b1c76ade35dd08db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e7f0a5aee97ba1b1c76ade35dd08db8");
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = (JSONArray) getConfig(CONFIG_REPORT_OFFLINE, JSONArray.class);
        if (jSONArray != null) {
            int length = jSONArray.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("name");
                        String optString2 = optJSONObject.optString("url");
                        OfflineReportItem offlineReportItem = new OfflineReportItem();
                        offlineReportItem.name = optString;
                        offlineReportItem.url = optString2;
                        arrayList.add(offlineReportItem);
                    }
                }
            }
            OfflineCenter.getInstance().setupOfflineReportMap(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateConfig(String str, String str2) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25d5528bf27b7bb12b2e2ad5f5856cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25d5528bf27b7bb12b2e2ad5f5856cee");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "{}";
            }
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable th) {
                Log.e(TAG, "config " + str + " parse failed", th);
                jSONObject = null;
            }
            if (jSONObject == null) {
                return;
            }
            synchronized (configs) {
                cachedConfigs.remove(str);
                configs.put(str, jSONObject);
            }
        }
    }

    public static void fillConfigMap(Object obj, Map<String, Object> map) {
        Field[] declaredFields;
        Object[] objArr = {obj, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c287d31387642080f0bbb533b55291b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c287d31387642080f0bbb533b55291b");
        } else if (obj.getClass().getName().startsWith(KNBConfigEntity.class.getName()) && (declaredFields = obj.getClass().getDeclaredFields()) != null && declaredFields.length > 0) {
            try {
                for (Field field : declaredFields) {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        fillConfigMap(obj2, map);
                        KNBConfigEntity.TiledConfig tiledConfig = (KNBConfigEntity.TiledConfig) field.getAnnotation(KNBConfigEntity.TiledConfig.class);
                        if (tiledConfig != null) {
                            String name = tiledConfig.name();
                            if (!TextUtils.isEmpty(name)) {
                                map.put(name, obj2);
                            }
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handlePullResult(KNBConfigEntity kNBConfigEntity) {
        Object[] objArr = {kNBConfigEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce0402fedc957638502da6d390251872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce0402fedc957638502da6d390251872");
            return;
        }
        HashMap hashMap = new HashMap();
        if (kNBConfigEntity == null) {
            setConfig((Map<String, Object>) hashMap, true);
            return;
        }
        fillConfigMap(kNBConfigEntity, hashMap);
        setConfig((Map<String, Object>) hashMap, true);
    }

    public static void setAllowUniversalAccessFromFileURLs(boolean z) {
        isAllowUniversalAccessFromFileURLs = z;
    }

    public static void setAllowFileAccessFromFileURLs(boolean z) {
        isAllowFileAccessFromFileURLs = z;
    }

    public static void setAllowFileAccess(boolean z) {
        isAllowFileAccess = z;
    }

    public static Gson gson() {
        return sGson;
    }
}
