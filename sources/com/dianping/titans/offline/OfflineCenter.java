package com.dianping.titans.offline;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.dianping.titans.offline.entity.OfflineBlackCIPSerializer;
import com.dianping.titans.offline.entity.OfflineConfig;
import com.dianping.titans.offline.entity.OfflineConfigCIPSerializer;
import com.dianping.titans.offline.entity.OfflineDebugItem;
import com.dianping.titans.offline.entity.OfflineGlobalDebugItem;
import com.dianping.titans.offline.entity.OfflineHornConfig;
import com.dianping.titans.offline.entity.OfflineHornConfigEntity;
import com.dianping.titans.offline.entity.OfflineReportItem;
import com.dianping.titans.offline.entity.OfflineResponse;
import com.dianping.titans.offline.entity.OfflineRuleItem;
import com.dianping.titans.offline.entity.PresetConfig;
import com.dianping.titans.offline.entity.PresetConfigCIPSerializer;
import com.dianping.titans.offline.util.DefaultMonitorService;
import com.dianping.titans.offline.util.GsonProvider;
import com.dianping.titans.offline.util.MimeUtil;
import com.dianping.titans.offline.util.Reporter;
import com.dianping.titans.offline.util.ThreadUtil;
import com.dianping.titans.offline.util.UrlUtil;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.dio.easy.DioFile;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.d;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.met.mercury.load.core.l;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.offline.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class OfflineCenter {
    public static final String DEBUG_OFFLINE_TAG = "KNB_Debug_Offline";
    public static final int ERROR_BUNDLE_DOWNLOAD = 1100;
    public static final int ERROR_BUNDLE_NEWEST = 1102;
    public static final int ERROR_BUNDLE_OTHER = 1103;
    public static final int ERROR_BUNDLE_PARSE = 1101;
    private static final String FIRST_OFFLINE_CHANNEL = "index";
    public static final String GLOBAL_OFFLINE_PREFIX = "global_offline";
    private static final String HORN_OFFLINE = "offline_config";
    private static final String HORN_OFFLINE_DEBUG = "offline_config_debug";
    private static final String OFFLINE_BLACK_CHANNEL = "mtplatform_offline_black";
    private static final String OFFLINE_BLACK_URL_KEY = "blackList";
    private static final String OFFLINE_BUSINESS = "titansx";
    private static final String OFFLINE_CONFIG_CHANNEL = "mtplatform_offline_config";
    private static final String OFFLINE_PRESET_CONFIG_CHANNEL = "mtplatform_offline_preset";
    private static final String OFFLINE_SOURCE_CHANNEL = "mtplatform_offline_source";
    private static final String OFFLINE_URL_PREFIX = "https://";
    private static final Object callbackLock = new Object();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static q offlineBlackCIP;
    private static Context sApplicationContext;
    private static OfflineInitConfig sInitConfig;
    private static volatile OfflineCenter sOfflineCenter;
    private List<String> mBlackUrlList;
    private final DDLoadParams mDDLoadParams;
    private final d mDDLoader;
    private volatile List<OfflineHornConfig> mOfflineHornConfigList;
    private final Map<String, OfflineRuleItem> mOfflinePresetResource;
    private final Map<String, String> mOfflineReportMap;
    private final Map<String, List<String>> mOfflineScopeUrlMap;
    private final q mPresetConfigCIP;
    private final Map<String, List<String>> mPresetConfigMap;
    private final q offlineConfigCIP;
    private final Map<String, OfflineRuleItem> offlineResource;

    public OfflineCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec82c2b16853dbe8855f7f3dfe63955e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec82c2b16853dbe8855f7f3dfe63955e");
            return;
        }
        this.offlineResource = new ConcurrentHashMap();
        this.mOfflineReportMap = new ConcurrentHashMap();
        this.mOfflineScopeUrlMap = new ConcurrentHashMap();
        this.mOfflinePresetResource = new ConcurrentHashMap();
        this.mPresetConfigMap = new ConcurrentHashMap();
        this.mDDLoadParams = new DDLoadParams(1);
        this.offlineConfigCIP = q.a(sApplicationContext, OFFLINE_CONFIG_CHANNEL);
        this.mPresetConfigCIP = q.a(sApplicationContext, OFFLINE_PRESET_CONFIG_CHANNEL);
        offlineBlackCIP = q.a(sApplicationContext, OFFLINE_BLACK_CHANNEL);
        ThreadUtil.getInstance().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.offline.OfflineCenter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "26dbcfad0c3855a5cdb71e20e230ac6d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "26dbcfad0c3855a5cdb71e20e230ac6d");
                    return;
                }
                OfflineCenter.this.loadLocalResource();
                OfflineCenter.this.getLocalPresetConfig();
                OfflineCenter.this.getLocalBlackList();
                OfflineCenter.this.dropOldDir();
            }
        });
        g.a(sApplicationContext, new l() { // from class: com.dianping.titans.offline.OfflineCenter.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.met.mercury.load.core.l
            public String getUuid() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88a5f781e452381bbead7560ba6dba5f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88a5f781e452381bbead7560ba6dba5f") : OfflineCenter.sInitConfig.getUUID();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91acb8909d49550bfdf595f9d1a55748", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91acb8909d49550bfdf595f9d1a55748") : OfflineCenter.sInitConfig.getUserId();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public String getChannel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56a68af70e24caaed77b81ea3d5ddb21", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56a68af70e24caaed77b81ea3d5ddb21") : OfflineCenter.sInitConfig.getChannel();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public int getMobileAppId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42e367078badc8448d5b75e83ca60ca0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42e367078badc8448d5b75e83ca60ca0")).intValue() : OfflineCenter.sInitConfig.getCatId();
            }
        });
        this.mDDLoader = g.a(OFFLINE_BUSINESS);
        if (this.mDDLoader != null) {
            this.mDDLoader.a(new n() { // from class: com.dianping.titans.offline.OfflineCenter.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.met.mercury.load.core.n
                public void onFail(Exception exc) {
                }

                @Override // com.meituan.met.mercury.load.core.n
                public void onSuccess(@Nullable List<DDResource> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "856ec8b9300530b4d26f8a3e04ec718b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "856ec8b9300530b4d26f8a3e04ec718b");
                        return;
                    }
                    synchronized (OfflineCenter.callbackLock) {
                        if (list != null) {
                            try {
                                if (list.size() != 0) {
                                    OfflineDebugInfo.presetList.clear();
                                    for (DDResource dDResource : list) {
                                        OfflineCenter.this.parsePreset(dDResource);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                }
            });
        }
    }

    public static void createInstance(Context context, OfflineInitConfig offlineInitConfig) {
        Object[] objArr = {context, offlineInitConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ae7b29a89bc1153558b5f09f03656db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ae7b29a89bc1153558b5f09f03656db");
            return;
        }
        sApplicationContext = context.getApplicationContext();
        sInitConfig = offlineInitConfig;
        if (sOfflineCenter == null) {
            synchronized (OfflineCenter.class) {
                if (sOfflineCenter == null) {
                    sOfflineCenter = new OfflineCenter();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dropOldDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ba9c8be8c3bdf90b763e5e88054d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ba9c8be8c3bdf90b763e5e88054d72");
            return;
        }
        File b = q.b(sApplicationContext, OFFLINE_SOURCE_CHANNEL, null, u.e);
        if (b == null) {
            b = q.a(sApplicationContext, OFFLINE_SOURCE_CHANNEL, (String) null, u.e);
        }
        if (b.exists() || b.mkdirs()) {
            deleteRecursive(b);
        }
    }

    private void deleteRecursive(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8dc62022ecf7677f9107ec141f95b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8dc62022ecf7677f9107ec141f95b93");
        } else if (file != null) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    deleteRecursive(file2);
                }
            }
            file.delete();
        }
    }

    private Map<String, Object> makePullConfigQuery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b191dc5daa4c5ef046fb1767eb68b52", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b191dc5daa4c5ef046fb1767eb68b52");
        }
        String appId = sInitConfig.getAppId();
        HashMap hashMap = new HashMap();
        if (sInitConfig.isDebug()) {
            hashMap.put("isHornTest", Boolean.TRUE);
        }
        if (appId == null) {
            appId = "";
        }
        hashMap.put("appid", appId);
        hashMap.put("titansVersion", BuildConfig.VERSION_NAME);
        hashMap.put("source", "client");
        return hashMap;
    }

    public final List<OfflineHornConfig> getHornConfigList() {
        return this.mOfflineHornConfigList;
    }

    public final void pullOfflineConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23395158f342300498b631f492263e16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23395158f342300498b631f492263e16");
        } else {
            Horn.register(sInitConfig.isDebug() ? HORN_OFFLINE_DEBUG : HORN_OFFLINE, new HornCallback() { // from class: com.dianping.titans.offline.OfflineCenter.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d21ff843d6a74bf2ac6b4741e84b4bd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d21ff843d6a74bf2ac6b4741e84b4bd2");
                        return;
                    }
                    if (OfflineCenter.sInitConfig.isDebug()) {
                        Log.e(OfflineCenter.DEBUG_OFFLINE_TAG, str);
                    }
                    if (!z || TextUtils.isEmpty(str)) {
                        Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_CONFIG, "pullOfflineConfig", "config is empty!");
                        return;
                    }
                    try {
                        OfflineHornConfigEntity offlineHornConfigEntity = (OfflineHornConfigEntity) GsonProvider.getGson().fromJson(str, (Class<Object>) OfflineHornConfigEntity.class);
                        if (offlineHornConfigEntity == null) {
                            Reporter.getInstance().webLog("pullOfflineConfig", "Offline Horn Cast to Object error");
                            return;
                        }
                        Reporter.getInstance().webLog("pullOfflineConfig", "Offline Horn Config set to CIP Success");
                        OfflineCenter.this.receiveConfigFromHorn(offlineHornConfigEntity);
                    } catch (Throwable th) {
                        Reporter.getInstance().webLog("pullOfflineConfig", th);
                        Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_CONFIG, "pullOfflineConfig", th.getMessage());
                    }
                }
            }, makePullConfigQuery());
        }
    }

    public static OfflineCenter getInstance() {
        return sOfflineCenter;
    }

    public final void clearOfflineScopeMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fad4f64f7d69896d6c75e53cfdece83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fad4f64f7d69896d6c75e53cfdece83");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mOfflineScopeUrlMap.remove(str);
        }
    }

    public final void setOfflineScopeUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7d6a6936cefec5a6e879cb4ec681a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7d6a6936cefec5a6e879cb4ec681a8f");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            List<String> list = this.mOfflineScopeUrlMap.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.mOfflineScopeUrlMap.put(str, list);
            }
            list.add("https://" + str2);
        }
    }

    public final List<String> getOfflineUrlFromScope(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e97f61ff32705e172221da0fcef48a48", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e97f61ff32705e172221da0fcef48a48");
        }
        if (TextUtils.isEmpty(str) || (list = this.mOfflineScopeUrlMap.get(str)) == null || list.size() == 0) {
            return null;
        }
        return new ArrayList(list);
    }

    private void setOfflineResource(String str, OfflineRuleItem offlineRuleItem) {
        Object[] objArr = {str, offlineRuleItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1840a16767660303b72830abe3368aef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1840a16767660303b72830abe3368aef");
            return;
        }
        Map<String, OfflineRuleItem> map = this.offlineResource;
        OfflineRuleItem offlineRuleItem2 = map.get("https://" + str);
        if (offlineRuleItem2 == null || TextUtils.isEmpty(offlineRuleItem2.getProject()) || !offlineRuleItem2.getProject().startsWith(GLOBAL_OFFLINE_PREFIX)) {
            Map<String, OfflineRuleItem> map2 = this.offlineResource;
            map2.put("https://" + str, offlineRuleItem);
        }
    }

    public final OfflineRuleItem getOfflineResouce(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "237cfe20960a9c13a4c5fdc6cc84e2fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (OfflineRuleItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "237cfe20960a9c13a4c5fdc6cc84e2fd");
        }
        if (this.mBlackUrlList == null || this.mBlackUrlList.size() <= 0 || !this.mBlackUrlList.contains(str)) {
            return this.offlineResource.get(str);
        }
        return null;
    }

    private void setPresetResource(String str, OfflineRuleItem offlineRuleItem) {
        Object[] objArr = {str, offlineRuleItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "421e83b5346e794794d67f55b0062850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "421e83b5346e794794d67f55b0062850");
            return;
        }
        Map<String, OfflineRuleItem> map = this.mOfflinePresetResource;
        map.put("https://" + str, offlineRuleItem);
    }

    public final OfflineRuleItem getPresetResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b0978b99d94a53517e02095a1e6de63", RobustBitConfig.DEFAULT_VALUE) ? (OfflineRuleItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b0978b99d94a53517e02095a1e6de63") : this.mOfflinePresetResource.get(str);
    }

    @RequiresApi(api = 21)
    public final WebResourceResponse getWebResourceResponse(WebResourceRequest webResourceRequest, String str) {
        Object[] objArr = {webResourceRequest, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68f633ed312a3673717bbc4eb99d87cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68f633ed312a3673717bbc4eb99d87cc");
        }
        OfflineResponse offlineResponse = getOfflineResponse(webResourceRequest, str);
        if (offlineResponse.webResourceResponse == null) {
            reportOfflineResult(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl(), null, false, str, offlineResponse.errorMsg, offlineResponse.getStartTime());
            return null;
        }
        createDebugItem(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl(), offlineResponse.offlineRuleItem);
        reportOfflineResult(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl(), offlineResponse.offlineRuleItem, true, str, null, offlineResponse.getStartTime());
        return offlineResponse.webResourceResponse;
    }

    private void reportOfflineResult(boolean z, Uri uri, OfflineRuleItem offlineRuleItem, boolean z2, String str, String str2, long j) {
        String uri2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri, offlineRuleItem, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea11eb3c9061cf5c91e71d174b7bb3cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea11eb3c9061cf5c91e71d174b7bb3cf");
            return;
        }
        if (z) {
            uri2 = UrlUtil.pureBasicURLString(uri);
        } else {
            uri2 = uri.toString();
        }
        String str3 = uri2;
        String offlineReportName = getOfflineReportName(str3);
        if (TextUtils.isEmpty(offlineReportName)) {
            return;
        }
        if (z2) {
            DefaultMonitorService.getInstance().reportOfflineHit(offlineReportName, 200, offlineRuleItem != null ? offlineRuleItem.bundleVersion : "");
        } else {
            DefaultMonitorService.getInstance().reportOfflineHit(offlineReportName, 404, "");
        }
        babelOfflineHit(offlineRuleItem, str, str3, str2);
        reportOfflineHitTime(offlineRuleItem, str, str3, z2, j);
    }

    private void reportOfflineHitTime(OfflineRuleItem offlineRuleItem, String str, String str2, boolean z, long j) {
        Object[] objArr = {offlineRuleItem, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7899854c0db2e49837e70685ad9f9992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7899854c0db2e49837e70685ad9f9992");
        } else if (j <= 0) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str2);
            hashMap.put("offlinePluginVersion", BuildConfig.VERSION_NAME);
            hashMap.put("status", Integer.valueOf(z ? 1 : 0));
            if (offlineRuleItem != null) {
                hashMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, offlineRuleItem.bundleName);
                hashMap.put("bundleVersion", offlineRuleItem.bundleVersion);
            }
            Reporter.getInstance().reportRTKNBChannel("titans-offline-interceptor", hashMap, Long.valueOf(System.currentTimeMillis() - j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void babelOfflineDownload(String str, boolean z, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b00b8e51faa3dab97e33e94e236a99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b00b8e51faa3dab97e33e94e236a99a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, str);
        hashMap.put("status", Integer.valueOf(z ? 200 : 404));
        hashMap.put(SnifferDBHelper.COLUMN_LOG, str2);
        hashMap.put("titansVersion", BuildConfig.VERSION_NAME);
        Reporter.getInstance().reportRT("knb_offline_download", hashMap, 1L);
    }

    private void babelOfflineHit(OfflineRuleItem offlineRuleItem, String str, String str2, String str3) {
        Object[] objArr = {offlineRuleItem, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "294060331a73eb400d87a4b652c0cb30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "294060331a73eb400d87a4b652c0cb30");
            return;
        }
        HashMap hashMap = new HashMap();
        if (offlineRuleItem != null) {
            hashMap.put("status", 200);
            hashMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, offlineRuleItem.bundleName);
            hashMap.put("bundleVersion", offlineRuleItem.bundleVersion);
            hashMap.put("resourceOrigin", offlineRuleItem.isPreset ? "preset" : "offline");
        } else {
            hashMap.put("status", 404);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("errorMsg", str3);
        }
        hashMap.put("pageUrl", str);
        hashMap.put("resourceUrl", str2);
        hashMap.put("titansVersion", BuildConfig.VERSION_NAME);
        Reporter.getInstance().reportRT("knb_offline_count", hashMap, 1L);
    }

    private void createDebugItem(boolean z, Uri uri, OfflineRuleItem offlineRuleItem) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri, offlineRuleItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eab8dc4a750e0f1948e68c1ee1dd2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eab8dc4a750e0f1948e68c1ee1dd2ba");
        } else if (sInitConfig.isDebug()) {
            OfflineDebugItem offlineDebugItem = new OfflineDebugItem();
            if (z) {
                offlineDebugItem.url = UrlUtil.pureBasicURLString(uri);
                offlineDebugItem.packageHash = offlineRuleItem.packageHash;
                offlineDebugItem.scope = offlineRuleItem.getProject();
                offlineDebugItem.bundleName = offlineRuleItem.bundleName;
                offlineDebugItem.bundleVersion = offlineRuleItem.bundleVersion;
                offlineDebugItem.isPreset = offlineRuleItem.isPreset;
                OfflineDebugInfo.pageOfflineList.clear();
            } else {
                offlineDebugItem.url = uri.toString();
                offlineDebugItem.packageHash = offlineRuleItem.packageHash;
                offlineDebugItem.scope = offlineRuleItem.getProject();
                offlineDebugItem.bundleName = offlineRuleItem.bundleName;
                offlineDebugItem.bundleVersion = offlineRuleItem.bundleVersion;
                offlineDebugItem.isPreset = offlineRuleItem.isPreset;
            }
            OfflineDebugInfo.pageOfflineList.add(offlineDebugItem);
        }
    }

    @RequiresApi(api = 21)
    private OfflineResponse getOfflineResponse(WebResourceRequest webResourceRequest, String str) {
        OfflineRuleItem offlineResouce;
        List<String> list;
        Object[] objArr = {webResourceRequest, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6c05fd830a0c48b22cd89f4955b253d", RobustBitConfig.DEFAULT_VALUE)) {
            return (OfflineResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6c05fd830a0c48b22cd89f4955b253d");
        }
        if (webResourceRequest == null) {
            return new OfflineResponse("webResourceRequest is null");
        }
        String uri = webResourceRequest.getUrl().toString();
        String pureBasicURLString = UrlUtil.pureBasicURLString(Uri.parse(uri));
        Uri parse = Uri.parse(str);
        String pureBasicURLString2 = UrlUtil.pureBasicURLString(parse);
        if (TextUtils.isEmpty(uri)) {
            return new OfflineResponse("webResourceRequest.getUrl() is empty");
        }
        if ("0".equals(parse.getQueryParameter("offline"))) {
            Reporter.getInstance().webLog("close offline by url", uri + " host " + str);
            return new OfflineResponse("url contains query[offline = 0],url:" + uri);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            if (webResourceRequest.isForMainFrame() && getOfflineResouce(pureBasicURLString) != null) {
                Reporter.getInstance().webLog("js_host_error", uri);
            }
            return new OfflineResponse("isForMainFrame and has ruleItem but jsHostUrl is empty").setStartTime(currentTimeMillis);
        }
        if (webResourceRequest.isForMainFrame()) {
            offlineResouce = getOfflineResouce(pureBasicURLString);
        } else {
            offlineResouce = getOfflineResouce(uri);
        }
        if (offlineResouce == null) {
            if (webResourceRequest.isForMainFrame()) {
                offlineResouce = getPresetResource(pureBasicURLString);
            } else {
                offlineResouce = getPresetResource(uri);
            }
            if (offlineResouce != null && (list = this.mPresetConfigMap.get(offlineResouce.bundleName)) != null && list.contains(offlineResouce.bundleVersion)) {
                offlineResouce = null;
            }
        }
        if (offlineResouce == null) {
            StringBuilder sb = new StringBuilder("offlineRuleItem is null, url:");
            if (webResourceRequest.isForMainFrame()) {
                uri = pureBasicURLString;
            }
            sb.append(uri);
            return new OfflineResponse(sb.toString()).setStartTime(currentTimeMillis);
        }
        if (webResourceRequest.isForMainFrame() && !pureBasicURLString2.equals(pureBasicURLString)) {
            Reporter.getInstance().webLog("host_url_not_equal", uri + str);
        }
        InputStream resourceStream = offlineResouce.getResourceStream();
        if (resourceStream == null) {
            return new OfflineResponse("offlineRuleItem.getResourceStream() is null").setStartTime(currentTimeMillis);
        }
        try {
            return new OfflineResponse(offlineResouce, new WebResourceResponse(offlineResouce.getMime(), "UTF-8", 200, "OK", offlineResouce.getHeaders(), resourceStream)).setStartTime(currentTimeMillis);
        } catch (Exception e) {
            String str2 = webResourceRequest.getUrl() + ", ex: " + e.getMessage();
            Reporter.getInstance().webLog("intercept_error", str2);
            Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_INTERCEPTOR, "getOfflineResponse", str2);
            return new OfflineResponse("create WebResourceResponse catch exception:" + Log.getStackTraceString(e)).setStartTime(currentTimeMillis);
        }
    }

    public final void setupOfflineReportMap(List<OfflineReportItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "239a05095058d9a34ecb689bc41e8421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "239a05095058d9a34ecb689bc41e8421");
        } else if (list != null && list.size() != 0) {
            for (OfflineReportItem offlineReportItem : list) {
                if (offlineReportItem != null && !TextUtils.isEmpty(offlineReportItem.name) && !TextUtils.isEmpty(offlineReportItem.url)) {
                    this.mOfflineReportMap.put(offlineReportItem.url, offlineReportItem.name);
                }
            }
        }
    }

    public final String getOfflineReportName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ad927dc5ec60c7fe838f0c789167c6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ad927dc5ec60c7fe838f0c789167c6f");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mOfflineReportMap.get(str);
    }

    public final void receiveConfigFromHorn(OfflineHornConfigEntity offlineHornConfigEntity) {
        Object[] objArr = {offlineHornConfigEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b56c89ed94396a060cc9da306f61150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b56c89ed94396a060cc9da306f61150");
            return;
        }
        if (offlineHornConfigEntity.getConfigList() != null) {
            saveHornConfig(offlineHornConfigEntity.getConfigList());
        }
        if (offlineHornConfigEntity.presetConfig != null) {
            savePresetConfig(offlineHornConfigEntity.presetConfig, true);
        }
        cleanInvalidProject(this.mOfflineHornConfigList);
        saveBlackList(offlineHornConfigEntity.getBlackList());
        pullOffline("index");
    }

    public final synchronized void pullOffline(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4df952d8b7ad92469a0a38ce48eac68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4df952d8b7ad92469a0a38ce48eac68d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mOfflineHornConfigList != null && this.mOfflineHornConfigList.size() != 0) {
                Reporter reporter = Reporter.getInstance();
                reporter.webLog("分渠道下载-准备下载分频道资源 ", "channel is " + str);
                ArrayList arrayList = new ArrayList();
                Iterator<OfflineHornConfig> it = this.mOfflineHornConfigList.iterator();
                while (it.hasNext()) {
                    OfflineHornConfig next = it.next();
                    List<String> channels = next.getChannels();
                    if (!TextUtils.isEmpty(next.getBundleName()) && channels.contains(str) && next.isSwitcher()) {
                        arrayList.add(next);
                        it.remove();
                    }
                }
                downLoadBundle(arrayList, sInitConfig.isDebug(), false);
                return;
            }
            Reporter reporter2 = Reporter.getInstance();
            reporter2.webLog("分渠道下载-horn配置为空 ", "channel is " + str);
            Reporter reporter3 = Reporter.getInstance();
            reporter3.reportOfflineError(Reporter.OFFLINE_STAGE_CONFIG, "pullOffline", "分渠道下载-horn配置为空 channel is " + str);
        }
    }

    public final synchronized void saveBlackList(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1c8421d4fe07d7037f7df0ee145388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1c8421d4fe07d7037f7df0ee145388");
            return;
        }
        setBlackList(list);
        offlineBlackCIP.a(OFFLINE_BLACK_URL_KEY, (String) list, (ag<String>) new OfflineBlackCIPSerializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLocalBlackList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02adcc5368ceb527cd7b09aa050ea809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02adcc5368ceb527cd7b09aa050ea809");
        } else {
            setBlackList((List) offlineBlackCIP.a(OFFLINE_BLACK_URL_KEY, new OfflineBlackCIPSerializer()));
        }
    }

    private synchronized void setBlackList(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59ee529583876d1b64ae75ddc83f8ee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59ee529583876d1b64ae75ddc83f8ee0");
            return;
        }
        if (this.mBlackUrlList == null) {
            this.mBlackUrlList = new ArrayList();
        }
        this.mBlackUrlList.clear();
        if (list != null && list.size() > 0) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    Reporter.getInstance().webLog("黑名单: ", str);
                    List<String> list2 = this.mBlackUrlList;
                    list2.add("https://" + str);
                }
            }
        }
    }

    public final void downLoadBundle(List<OfflineHornConfig> list, boolean z, boolean z2) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9044e160374a32d4f7b505f79eb2bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9044e160374a32d4f7b505f79eb2bbe");
        } else if (this.mDDLoader == null || list == null || list.size() == 0) {
            String str = this.mDDLoader == null ? "dd的sdk没有初始化" : "拉包数量为0";
            Reporter.getInstance().webLog("初始化错误: ", new Exception(str));
            Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_DOWNLOAD_INIT, "downLoadBundle", str);
        } else {
            this.mDDLoader.c = z;
            final HashMap hashMap = new HashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (OfflineHornConfig offlineHornConfig : list) {
                Reporter reporter = Reporter.getInstance();
                reporter.webLog("download bundle: ", "bundleName: " + offlineHornConfig.getBundleName());
                hashMap.put(offlineHornConfig.getBundleName(), offlineHornConfig);
                linkedHashSet.add(offlineHornConfig.getBundleName());
            }
            OfflineDebugInfo.globalOfflineList.clear();
            k kVar = new k() { // from class: com.dianping.titans.offline.OfflineCenter.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.met.mercury.load.core.k
                public void onSuccess(@Nullable DDResource dDResource) {
                    OfflineHornConfig offlineHornConfig2;
                    OfflineConfig offlineConfig;
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a671aa0fe5eab8315e964d49d309d18f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a671aa0fe5eab8315e964d49d309d18f");
                        return;
                    }
                    synchronized (OfflineCenter.callbackLock) {
                        if (dDResource != null) {
                            try {
                                if (OfflineCenter.this.hasDioFile(dDResource.getLocalPath()) && (offlineHornConfig2 = (OfflineHornConfig) hashMap.get(dDResource.getName())) != null) {
                                    Map<String, OfflineConfig> allOfflineConfig = OfflineCenter.this.getAllOfflineConfig();
                                    if (allOfflineConfig == null || (offlineConfig = allOfflineConfig.get(offlineHornConfig2.getScope())) == null || TextUtils.isEmpty(offlineConfig.version) || !offlineConfig.version.equals(dDResource.getVersion()) || TextUtils.isEmpty(offlineConfig.dioPath) || !TextUtils.equals(offlineConfig.dioPath, dDResource.getLocalPath())) {
                                        if (OfflineCenter.sInitConfig.isDebug()) {
                                            OfflineGlobalDebugItem offlineGlobalDebugItem = new OfflineGlobalDebugItem();
                                            offlineGlobalDebugItem.scope = offlineHornConfig2.getScope();
                                            offlineGlobalDebugItem.group = offlineHornConfig2.getGroup();
                                            offlineGlobalDebugItem.bundleName = dDResource.getName();
                                            offlineGlobalDebugItem.bundleVersion = dDResource.getVersion();
                                            offlineGlobalDebugItem.hashCode = dDResource.getMd5();
                                            offlineGlobalDebugItem.updateTime = System.currentTimeMillis();
                                            offlineGlobalDebugItem.isPreset = false;
                                            OfflineDebugInfo.globalOfflineList.add(offlineGlobalDebugItem);
                                        }
                                        Reporter reporter2 = Reporter.getInstance();
                                        reporter2.webLog("download success", "bundleName: " + offlineHornConfig2.getBundleName() + " scope: " + offlineHornConfig2.getScope());
                                        OfflineCenter.this.deleteResourceMapping(offlineHornConfig2.getScope());
                                        OfflineCenter.this.parseOffline(dDResource, offlineHornConfig2);
                                    } else {
                                        if (offlineHornConfig2.getListener() != null) {
                                            offlineHornConfig2.getListener().onFinished(offlineHornConfig2, new OfflineException(1102, "本地已经是最新包"));
                                        }
                                        if (OfflineCenter.sInitConfig.isDebug()) {
                                            OfflineGlobalDebugItem offlineGlobalDebugItem2 = new OfflineGlobalDebugItem();
                                            offlineGlobalDebugItem2.scope = offlineHornConfig2.getScope();
                                            offlineGlobalDebugItem2.group = offlineHornConfig2.getGroup();
                                            offlineGlobalDebugItem2.bundleName = dDResource.getName();
                                            offlineGlobalDebugItem2.bundleVersion = dDResource.getVersion();
                                            offlineGlobalDebugItem2.hashCode = dDResource.getMd5();
                                            offlineGlobalDebugItem2.updateTime = offlineConfig.updateTime;
                                            offlineGlobalDebugItem2.isPreset = false;
                                            OfflineDebugInfo.globalOfflineList.add(offlineGlobalDebugItem2);
                                        }
                                        Reporter reporter3 = Reporter.getInstance();
                                        reporter3.webLog("本地是最新包: ", "bundleName: " + offlineHornConfig2.getBundleName() + " scope: " + offlineHornConfig2.getScope());
                                        OfflineCenter.this.babelOfflineDownload(dDResource.getName(), true, "本地是最新包:[bundleName:" + offlineHornConfig2.getBundleName() + ",scope:" + offlineHornConfig2.getScope() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }

                @Override // com.meituan.met.mercury.load.core.k
                public void onFail(Exception exc) {
                    OfflineHornConfig offlineHornConfig2;
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cfa0fd2bf3495522d773b0920355e2bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cfa0fd2bf3495522d773b0920355e2bc");
                        return;
                    }
                    synchronized (OfflineCenter.callbackLock) {
                        if (exc instanceof f) {
                            f fVar = (f) exc;
                            String str2 = fVar.d;
                            OfflineCenter.this.babelOfflineDownload(str2, false, Log.getStackTraceString(exc));
                            if (!TextUtils.isEmpty(str2) && (offlineHornConfig2 = (OfflineHornConfig) hashMap.get(str2)) != null) {
                                switch (fVar.c) {
                                    case 7:
                                    case 8:
                                        OfflineCenter.this.removeProjectAssets(offlineHornConfig2.getScope());
                                        if (offlineHornConfig2.getListener() != null) {
                                            offlineHornConfig2.getListener().onFinished(offlineHornConfig2, new OfflineException(OfflineCenter.ERROR_BUNDLE_DOWNLOAD, "离线包下载失败: " + fVar.getMessage()));
                                        }
                                        String str3 = "bundleName: " + offlineHornConfig2.getBundleName() + " scope: " + offlineHornConfig2.getScope() + "serviceMsg: " + fVar.getMessage();
                                        Reporter.getInstance().webLog("离线包下载失败: ", str3);
                                        Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_DOWNLOAD_BUNDLE, "downLoadBundle", str3);
                                        break;
                                    case 9:
                                    default:
                                        if (offlineHornConfig2.getListener() != null) {
                                            offlineHornConfig2.getListener().onFinished(offlineHornConfig2, new OfflineException(1103, "离线包获取失败: " + fVar.getMessage()));
                                        }
                                        String str4 = "bundleName: " + offlineHornConfig2.getBundleName() + " scope: " + offlineHornConfig2.getScope() + "serviceMsg: " + fVar.getMessage();
                                        Reporter.getInstance().webLog("离线包获取失败: ", str4);
                                        Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_GFT_BUNDLE_DETAIL, "downLoadBundle", str4);
                                        break;
                                    case 10:
                                        OfflineCenter.this.removeProjectAssets(offlineHornConfig2.getScope());
                                        if (offlineHornConfig2.getListener() != null) {
                                            offlineHornConfig2.getListener().onFinished(offlineHornConfig2, new OfflineException(1103, "远端下掉了离线包"));
                                        }
                                        Reporter.getInstance().webLog("远端离线包下线: ", "bundleName: " + offlineHornConfig2.getBundleName() + " scope: " + offlineHornConfig2.getScope());
                                        Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_GFT_BUNDLE_DETAIL, "downLoadBundle", "远端离线包下线-bundleName: " + offlineHornConfig2.getBundleName() + " scope: " + offlineHornConfig2.getScope());
                                        break;
                                }
                            }
                        }
                    }
                }
            };
            if (z2) {
                for (OfflineHornConfig offlineHornConfig2 : list) {
                    this.mDDLoader.a(offlineHornConfig2.getBundleName(), offlineHornConfig2.getVersion(), this.mDDLoadParams, kVar);
                }
                return;
            }
            this.mDDLoader.a(linkedHashSet, DDLoadStrategy.NET_ONLY, this.mDDLoadParams, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasDioFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35460d2b81e7f3c79bbccc84077cfa8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35460d2b81e7f3c79bbccc84077cfa8d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new DioFile(str).c();
        } catch (Exception unused) {
            return false;
        }
    }

    private synchronized void saveHornConfig(List<OfflineHornConfig> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4041a26bcf425c169a80687a6f195c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4041a26bcf425c169a80687a6f195c6");
            return;
        }
        if (this.mOfflineHornConfigList == null) {
            this.mOfflineHornConfigList = new ArrayList();
        }
        this.mOfflineHornConfigList.clear();
        this.mOfflineHornConfigList.addAll(list);
    }

    private void savePresetConfig(List<PresetConfig> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95870ba613fe455eb482846f91afb3b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95870ba613fe455eb482846f91afb3b1");
        } else if (list != null && list.size() != 0) {
            this.mPresetConfigMap.clear();
            PresetConfigCIPSerializer presetConfigCIPSerializer = new PresetConfigCIPSerializer();
            for (PresetConfig presetConfig : list) {
                if (presetConfig != null && !TextUtils.isEmpty(presetConfig.bundleName)) {
                    this.mPresetConfigMap.put(presetConfig.bundleName, presetConfig.forbiddenVersion);
                    if (z && this.mPresetConfigCIP != null) {
                        this.mPresetConfigCIP.a(presetConfig.bundleName, (String) presetConfig, (ag<String>) presetConfigCIPSerializer);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLocalPresetConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f2da6db11a2289f63912d2e68afe2af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f2da6db11a2289f63912d2e68afe2af");
        } else if (this.mPresetConfigCIP != null) {
            Map<String, ?> b = this.mPresetConfigCIP.b();
            ArrayList arrayList = new ArrayList();
            PresetConfigCIPSerializer presetConfigCIPSerializer = new PresetConfigCIPSerializer();
            Reporter.getInstance().webLog("[CIP get All presetConfig] load All presetConfig", b);
            for (Map.Entry<String, ?> entry : b.entrySet()) {
                Object value = entry.getValue();
                String str = (String) value;
                Reporter.getInstance().webLog("[CIP get single presetConfig] load single presetConfig " + entry.getKey(), str);
                PresetConfig presetConfig = null;
                if (value instanceof PresetConfig) {
                    presetConfig = (PresetConfig) value;
                } else if (value instanceof String) {
                    presetConfig = presetConfigCIPSerializer.deserializeFromString(str);
                }
                if (presetConfig != null) {
                    arrayList.add(presetConfig);
                }
            }
            savePresetConfig(arrayList, false);
        }
    }

    private void saveOfflineConfig(String str, OfflineConfig offlineConfig) {
        Object[] objArr = {str, offlineConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a8662c4dd02babeb603dec692bf9fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a8662c4dd02babeb603dec692bf9fcb");
        } else if (this.offlineConfigCIP == null) {
        } else {
            this.offlineConfigCIP.a(str, (String) offlineConfig, (ag<String>) new OfflineConfigCIPSerializer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadLocalResource() {
        List<OfflineRuleItem> resource;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b382533835016730ec33545b69fe2568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b382533835016730ec33545b69fe2568");
            return;
        }
        try {
            Map<String, OfflineConfig> allOfflineConfig = getAllOfflineConfig();
            Reporter.getInstance().webLog("[local resource]All offline config", allOfflineConfig);
            if (allOfflineConfig != null && !allOfflineConfig.isEmpty()) {
                for (Map.Entry<String, OfflineConfig> entry : allOfflineConfig.entrySet()) {
                    OfflineConfig value = entry.getValue();
                    if (value != null && (resource = value.getResource()) != null && resource.size() != 0) {
                        for (OfflineRuleItem offlineRuleItem : resource) {
                            if (this.offlineResource.get(offlineRuleItem.getUrl()) == null) {
                                setOfflineResource(offlineRuleItem.getUrl(), offlineRuleItem);
                                setOfflineScopeUrl(offlineRuleItem.getProject(), offlineRuleItem.getUrl());
                            }
                        }
                    }
                }
                Reporter.getInstance().webLog("[local resource]All offline Resource", this.offlineResource);
            }
        } catch (Exception e) {
            Reporter.getInstance().webLog("[local resource]All offline Resource error", e);
        }
    }

    public final Map<String, OfflineConfig> getAllOfflineConfig() {
        OfflineConfig deserializeFromString;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ada7b521fbdb9d8dc26863a4dc71c19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ada7b521fbdb9d8dc26863a4dc71c19");
        }
        if (this.offlineConfigCIP == null) {
            return null;
        }
        try {
            Map<String, ?> b = this.offlineConfigCIP.b();
            HashMap hashMap = new HashMap();
            OfflineConfigCIPSerializer offlineConfigCIPSerializer = new OfflineConfigCIPSerializer();
            for (Map.Entry<String, ?> entry : b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof OfflineConfig) {
                    deserializeFromString = (OfflineConfig) value;
                } else {
                    deserializeFromString = offlineConfigCIPSerializer.deserializeFromString((String) value);
                }
                if (deserializeFromString == null) {
                    if (Math.random() < 0.01d) {
                        Reporter reporter = Reporter.getInstance();
                        reporter.webLog("loadLocal", key + ": " + value);
                    }
                } else {
                    hashMap.put(key, deserializeFromString);
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void removeProjectAssets(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e30de6b33fbe1c6d4bb304144871fc8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e30de6b33fbe1c6d4bb304144871fc8a");
            return;
        }
        try {
            deleteResourceMapping(str);
            this.offlineConfigCIP.b(str);
        } catch (Exception e) {
            Reporter reporter = Reporter.getInstance();
            reporter.webLog("uninstall projectAssets" + str, e);
            Log.e(DEBUG_OFFLINE_TAG, "删除项目资源失败", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteResourceMapping(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09a46ee5871e72029253ef76bb02ec02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09a46ee5871e72029253ef76bb02ec02");
            return;
        }
        for (Map.Entry<String, OfflineRuleItem> entry : this.offlineResource.entrySet()) {
            if (entry != null && entry.getValue() != null && !TextUtils.isEmpty(entry.getValue().getProject()) && entry.getValue().getProject().equals(str)) {
                this.offlineResource.remove(entry.getKey());
            }
        }
        this.mOfflineScopeUrlMap.remove(str);
    }

    private void cleanInvalidProject(List<OfflineHornConfig> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b5592f4a81be2b57893cd26f539cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b5592f4a81be2b57893cd26f539cce");
            return;
        }
        Map<String, OfflineConfig> allOfflineConfig = getAllOfflineConfig();
        if (allOfflineConfig == null || allOfflineConfig.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (OfflineHornConfig offlineHornConfig : list) {
            hashMap.put(offlineHornConfig.getScope(), offlineHornConfig);
        }
        for (String str : allOfflineConfig.keySet()) {
            OfflineHornConfig offlineHornConfig2 = (OfflineHornConfig) hashMap.get(str);
            if (offlineHornConfig2 == null || !offlineHornConfig2.isSwitcher()) {
                Reporter.getInstance().webLog("uninstall ", str);
                removeProjectAssets(str);
            }
        }
    }

    private String readFileToString(DioFile dioFile) throws IOException {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa1a4afec394826536e6469febe078a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa1a4afec394826536e6469febe078a7");
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dioFile.b()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parsePreset(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba5e3378e4fe977e28082e87f1e25b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba5e3378e4fe977e28082e87f1e25b5f");
            return;
        }
        try {
            DioFile dioFile = new DioFile(dDResource.getLocalPath(), "bundle.json");
            if (!dioFile.c()) {
                throw new IOException("Bundle JSON File required");
            }
            JSONArray jSONArray = new JSONArray(readFileToString(dioFile));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Reporter reporter = Reporter.getInstance();
                reporter.webLog("parse preset info:" + dDResource.getName(), jSONObject.toString());
                String optString = jSONObject.optString("url");
                boolean optBoolean = jSONObject.optBoolean("noQuery");
                Map<String, String> map = (Map) new Gson().fromJson(jSONObject.optString("headers"), (Class<Object>) HashMap.class);
                String str = map.get("Content-Type");
                String defaultMime = MimeUtil.getDefaultMime(optString, !TextUtils.isEmpty(str) && str.contains(com.sankuai.titans.proxy.util.Constants.KEY_CONTENT_TYPE_HTML));
                OfflineRuleItem offlineRuleItem = new OfflineRuleItem();
                offlineRuleItem.setMime(defaultMime);
                offlineRuleItem.setNoQuery(optBoolean);
                offlineRuleItem.setUrl(optString);
                offlineRuleItem.setHeaders(map);
                offlineRuleItem.setContentType(map.get("Content-Type"));
                offlineRuleItem.setDioPath(dDResource.getLocalPath());
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                offlineRuleItem.setChildPath(sb.toString());
                offlineRuleItem.packageHash = dDResource.getMd5();
                offlineRuleItem.bundleName = dDResource.getName();
                offlineRuleItem.bundleVersion = dDResource.getVersion();
                offlineRuleItem.isPreset = true;
                setPresetResource(optString, offlineRuleItem);
            }
            if (sInitConfig.isDebug()) {
                OfflineGlobalDebugItem offlineGlobalDebugItem = new OfflineGlobalDebugItem();
                offlineGlobalDebugItem.bundleName = dDResource.getName();
                offlineGlobalDebugItem.bundleVersion = dDResource.getVersion();
                offlineGlobalDebugItem.hashCode = dDResource.getMd5();
                offlineGlobalDebugItem.scope = "无";
                offlineGlobalDebugItem.group = "无";
                offlineGlobalDebugItem.updateTime = System.currentTimeMillis();
                offlineGlobalDebugItem.isPreset = true;
                OfflineDebugInfo.presetList.add(offlineGlobalDebugItem);
            }
            Reporter.getInstance().webLog("parse preset finish", dDResource.getName());
        } catch (Exception e) {
            Reporter reporter2 = Reporter.getInstance();
            reporter2.webLog("parse preset fail", "bundleName: " + dDResource.getName() + " error: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseOffline(DDResource dDResource, OfflineHornConfig offlineHornConfig) {
        Object[] objArr = {dDResource, offlineHornConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8d2908f12ec4f817c428a271c205d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8d2908f12ec4f817c428a271c205d3");
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            DioFile dioFile = new DioFile(dDResource.getLocalPath(), "bundle.json");
            if (!dioFile.c()) {
                throw new IOException("Bundle JSON File required");
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray(readFileToString(dioFile));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Reporter reporter = Reporter.getInstance();
                reporter.webLog("write bundle info" + offlineHornConfig.getScope(), jSONObject.toString());
                String optString = jSONObject.optString("url");
                boolean optBoolean = jSONObject.optBoolean("noQuery");
                Map<String, String> map = (Map) new Gson().fromJson(jSONObject.optString("headers"), (Class<Object>) HashMap.class);
                String str = map.get("Content-Type");
                String defaultMime = MimeUtil.getDefaultMime(optString, !TextUtils.isEmpty(str) && str.contains(com.sankuai.titans.proxy.util.Constants.KEY_CONTENT_TYPE_HTML));
                OfflineRuleItem offlineRuleItem = new OfflineRuleItem();
                offlineRuleItem.setMime(defaultMime);
                offlineRuleItem.setNoQuery(optBoolean);
                offlineRuleItem.setUrl(optString);
                offlineRuleItem.setHeaders(map);
                offlineRuleItem.setContentType(map.get("Content-Type"));
                offlineRuleItem.setDioPath(dDResource.getLocalPath());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                offlineRuleItem.setChildPath(sb2.toString());
                offlineRuleItem.setProject(offlineHornConfig.getScope());
                offlineRuleItem.packageHash = dDResource.getMd5();
                offlineRuleItem.bundleName = dDResource.getName();
                offlineRuleItem.bundleVersion = dDResource.getVersion();
                offlineRuleItem.isPreset = false;
                arrayList.add(offlineRuleItem);
                setOfflineResource(optString, offlineRuleItem);
                setOfflineScopeUrl(offlineHornConfig.getScope(), optString);
            }
            OfflineConfig offlineConfig = new OfflineConfig();
            offlineConfig.setGroup(offlineHornConfig.getGroup());
            offlineConfig.setScope(offlineHornConfig.getScope());
            offlineConfig.setBundleMd5(dDResource.getMd5());
            offlineConfig.setResource(arrayList);
            offlineConfig.updateTime = System.currentTimeMillis();
            offlineConfig.version = dDResource.getVersion();
            offlineConfig.bundleName = dDResource.getName();
            saveOfflineConfig(offlineHornConfig.getScope(), offlineConfig);
            if (offlineHornConfig.getListener() != null) {
                offlineHornConfig.getListener().onFinished(offlineHornConfig, null);
            }
            Reporter.getInstance().webLog("write bundle info finish", offlineConfig.getScope());
            sb.append("离线包解析成功:[bundleName:");
            sb.append(offlineHornConfig.getBundleName());
            sb.append(",scope:");
            sb.append(offlineHornConfig.getScope());
            sb.append(",解析时间:");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            babelOfflineDownload(offlineHornConfig.getBundleName(), true, sb.toString());
        } catch (Exception e) {
            sb.append("离线包解析失败:[bundleName:");
            sb.append(offlineHornConfig.getBundleName());
            sb.append(",scope:");
            sb.append(offlineHornConfig.getScope());
            sb.append(",error:");
            sb.append(Log.getStackTraceString(e));
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            babelOfflineDownload(offlineHornConfig.getBundleName(), false, sb.toString());
            Reporter reporter2 = Reporter.getInstance();
            reporter2.webLog("parseAndWriteToStorage fail", "bundleName: " + offlineHornConfig.getBundleName() + " scope: " + offlineHornConfig.getScope() + " error: " + e.getMessage());
            if (offlineHornConfig.getListener() != null) {
                offlineHornConfig.getListener().onFinished(offlineHornConfig, new OfflineException(1101, e.getMessage()));
            }
            Reporter.getInstance().reportOfflineError(Reporter.OFFLINE_STAGE_UPDATE_MAP, "parseOffline", e.getMessage());
        }
    }
}
