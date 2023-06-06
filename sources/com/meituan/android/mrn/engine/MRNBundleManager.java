package com.meituan.android.mrn.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.engine.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class MRNBundleManager {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ASSETS_BASE_JSON = "mrn_base.json";
    private static final String ASSETS_BUSINESS_JSON = "mrn_business.json";
    public static final String ASSETS_JSBUNDLE = "mrnbundle";
    private static final String ASSETS_MIN_VERSIONS_JSON = "mrn_min_bundle_versions.json";
    public static final String BASE_BUNDLE_NAME = "rn_mrn_base";
    public static final String DIO_BUNDLE_SUFFIX = ".dio";
    public static final String MRN_BUNDLE_SUFFIX = ".zip";
    public static final String STORE_KEY_ASSETS_BUNDLE_INFO = "mrn_assets_bundles";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile boolean sGetInstanceAllowed;
    private static volatile MRNBundleManager sInstance;
    private List<AssetsBundle> businessAssetsBundleList;
    private Map<String, AssetsBundle> businessAssetsBundleMap;
    private List<AssetsBundle> commonAssetsBundleList;
    private final List<Runnable> mBasePendingInitedCalls;
    private final Map<e, com.meituan.android.mrn.utils.t> mBundleLockMap;
    private Context mContext;
    private List<AssetsBundle> mDeleteAssetsBundleList;
    private AtomicBoolean mInitialized;
    private Map<String, String> mMinAvailableBundleList;
    private final Map<e, Boolean> mPendingRemoveBundleMap;
    private final x mStorageManager;
    private static final Pattern sBundleArchivePattern = Pattern.compile("^rn.*zip$");
    private static final String TAG = MRNBundleManager.class.getSimpleName();
    private static ExecutorService executorService = com.sankuai.android.jarvis.c.a("MRN-PRESET", 1);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public MRNBundleManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cddb0bd1ce6154812dc8bddc89c41d2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cddb0bd1ce6154812dc8bddc89c41d2a");
            return;
        }
        this.mInitialized = new AtomicBoolean();
        this.mBasePendingInitedCalls = new LinkedList();
        this.mMinAvailableBundleList = new HashMap();
        this.mBundleLockMap = new ConcurrentHashMap();
        this.mPendingRemoveBundleMap = new ConcurrentHashMap();
        this.businessAssetsBundleMap = new HashMap();
        this.mContext = context.getApplicationContext();
        this.mStorageManager = x.a(context.getApplicationContext());
        e.a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
        if (r0 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.MRNBundleManager.init():void");
    }

    public static synchronized MRNBundleManager createInstance(Context context) {
        synchronized (MRNBundleManager.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e01c539b0810a619b1a3a3dbc9dc0d74", RobustBitConfig.DEFAULT_VALUE)) {
                return (MRNBundleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e01c539b0810a619b1a3a3dbc9dc0d74");
            } else if (context == null) {
                throw new IllegalArgumentException("Invalid context argument");
            } else {
                if (sInstance == null) {
                    sInstance = new MRNBundleManager(context.getApplicationContext());
                    com.meituan.android.mrn.codecache.c.a(context.getApplicationContext());
                }
                sGetInstanceAllowed = true;
                return sInstance;
            }
        }
    }

    public static synchronized MRNBundleManager sharedInstance() {
        synchronized (MRNBundleManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26984b652d2106623eaebe6ea2a3582b", RobustBitConfig.DEFAULT_VALUE)) {
                return (MRNBundleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26984b652d2106623eaebe6ea2a3582b");
            } else if (!sGetInstanceAllowed) {
                throw new IllegalStateException("MRNBundleManager::createInstance() needs to be called before MRNBundleManager::sharedInstance()");
            } else {
                return sInstance;
            }
        }
    }

    private boolean isRNVersionIllegal(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f87957642c7b91df8150f07a6bfcaf03", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f87957642c7b91df8150f07a6bfcaf03")).booleanValue() : eVar == null || com.meituan.android.mrn.utils.e.a("0.63.3", eVar.j) < 0;
    }

    private void assertBaseBundleLegal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfe0580a34c07002b39d307cdcd49a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfe0580a34c07002b39d307cdcd49a9f");
            return;
        }
        List<e> b2 = this.mStorageManager.b(BASE_BUNDLE_NAME);
        AssetsBundle commonAssetsBundleByName = getCommonAssetsBundleByName(BASE_BUNDLE_NAME);
        for (e eVar : b2) {
            if (eVar != null && commonAssetsBundleByName != null && (isRNVersionIllegal(eVar) || com.meituan.android.mrn.utils.e.a(commonAssetsBundleByName.bundleVersion, eVar.f) < 0)) {
                this.mStorageManager.b(eVar);
            }
        }
    }

    private void initBundleFromAssets() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "477bba428f81f72ce470b88aaff5ffb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "477bba428f81f72ce470b88aaff5ffb7");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initBundleFromAssets]", "");
        this.commonAssetsBundleList = getBundleArchiveListInJSBundle(true);
        if (this.commonAssetsBundleList != null && needInstallBundleFromAssets()) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initBundleFromAssets]", "安装base或common预置包");
            assertBaseBundleLegal();
            try {
                try {
                    for (AssetsBundle assetsBundle : this.commonAssetsBundleList) {
                        b installBundleFromAssetsInner = installBundleFromAssetsInner(assetsBundle);
                        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@run]", assetsBundle.bundleName + StringUtil.SPACE + installBundleFromAssetsInner);
                    }
                } catch (Exception e) {
                    handleException("[MRNBundleManager@run]", e);
                }
                return;
            } finally {
                initBaseCompleted();
            }
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder("不需要安装预置包 ");
        sb.append(this.commonAssetsBundleList == null);
        objArr2[0] = sb.toString();
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initBundleFromAssets]", objArr2);
    }

    private void handleException(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c074c47110fa432a0ecd444d62d147e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c074c47110fa432a0ecd444d62d147e5");
        } else if (com.meituan.android.mrn.debug.a.a()) {
            throw new RuntimeException(th);
        } else {
            com.meituan.android.mrn.utils.c.a(str, th);
            th.printStackTrace();
        }
    }

    private boolean needInstallBundleFromAssets() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f210854dba598a30784ff10063827fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f210854dba598a30784ff10063827fa")).booleanValue();
        }
        if (!x.a().h()) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@needInstallBundleFromAssets]", "覆盖安装或卸载安装");
            return true;
        }
        List<e> b2 = x.a().b();
        if (b2 == null || b2.size() == 0) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@needInstallBundleFromAssets]", "内存为空");
            return true;
        } else if (installIfNeed(getCommonAssetsBundleByName(BASE_BUNDLE_NAME))) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@needInstallBundleFromAssets]", "base包或common包不存在");
            return true;
        } else {
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum b {
        ParamInvalid,
        NotRequired,
        ArchiveNameNotMatched,
        CopyFileFailed,
        UnzipFileFailed,
        Succeed;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "554d60355486bc4d8b001aca18f6de69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "554d60355486bc4d8b001aca18f6de69");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e003890fa18057829e4903a0515a2c6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e003890fa18057829e4903a0515a2c6") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "154dee270c344381cbd125dff1d41052", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "154dee270c344381cbd125dff1d41052") : (b[]) values().clone();
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18cb0b41f8143e29b43215fa929fcbf7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18cb0b41f8143e29b43215fa929fcbf7")).booleanValue() : equals(NotRequired) || equals(Succeed);
        }
    }

    private b installBundleFromAssetsInner(AssetsBundle assetsBundle) throws IOException {
        Object[] objArr = {assetsBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f408c176dd71a35d0f0058c123e88f1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f408c176dd71a35d0f0058c123e88f1d");
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleGetter@installBundleFromAssetsInner]", assetsBundle.fileName);
        if (assetsBundle == null || TextUtils.isEmpty(assetsBundle.archiveName)) {
            return b.ParamInvalid;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@installBundleFromAssetsInner]", assetsBundle.fileName);
        if (!installIfNeed(assetsBundle)) {
            return b.NotRequired;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@installBundleFromAssetsInner]", "start", assetsBundle.fileName);
        String str = assetsBundle.archiveName;
        if (!sBundleArchivePattern.matcher(str).matches()) {
            return b.ArchiveNameNotMatched;
        }
        ZipInputStream zipInputStream = new ZipInputStream(this.mContext.getAssets().open(String.format("%s/%s", ASSETS_JSBUNDLE, str)));
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry == null) {
            throw new FileNotFoundException("zip is empty");
        }
        if (nextEntry.getName() == null || !nextEntry.getName().endsWith(DIO_BUNDLE_SUFFIX)) {
            throw new FileNotFoundException(String.format("预置包 %s 不是dio格式，请确定 mrnpreset 插件版本 >= 0.1.0，且没有主动往 assets/mrnbundle 中放置预置包", str));
        }
        File d = x.a().d(assetsBundle.bundleName, assetsBundle.bundleVersion);
        if (!d.getParentFile().exists()) {
            d.getParentFile().mkdirs();
        }
        boolean z = false;
        for (int i = 0; i < 3 && !(z = com.meituan.android.mrn.utils.n.a(zipInputStream, d)); i++) {
        }
        if (!z) {
            d.delete();
            return b.CopyFileFailed;
        }
        if (f.c(com.meituan.android.mrn.common.a.a())) {
            try {
                com.meituan.android.mrn.update.k.a().a(assetsBundle.bundleName, assetsBundle.bundleVersion, assetsBundle.bundleId);
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("[MRNBundleManager@installBundleFromAssetsInner]", null, th);
            }
        }
        e a2 = e.a(d);
        if (h.b(a2)) {
            x.a().a(a2);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "e5fe0b0f55525efcff0095423d957131", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "e5fe0b0f55525efcff0095423d957131");
            } else {
                a2.a(false);
            }
        }
        return b.Succeed;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r1.size() > 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.meituan.android.mrn.engine.MRNBundleManager.AssetsBundle> getBundleArchiveListInJSBundle(boolean r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.MRNBundleManager.getBundleArchiveListInJSBundle(boolean):java.util.List");
    }

    private void initMRNStorage() {
        ObjectInputStream objectInputStream;
        List<e> b2;
        File[] listFiles;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cddd59a24d5d365ae78824d3aeb46202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cddd59a24d5d365ae78824d3aeb46202");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initMRNStorage]", "");
        x a2 = x.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = x.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "a91a77f1773f1388253547ead38846bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "a91a77f1773f1388253547ead38846bf");
        } else {
            File g = a2.g();
            if (g.exists() && g.isFile()) {
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(g));
                    try {
                        a2.a((List) objectInputStream.readObject());
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.facebook.common.logging.a.b("MRNStorageManager@startLoad", (String) null, th);
                            y.a(x.a().b());
                            b2 = x.a().b();
                            if (b2 != null) {
                            }
                            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initMRNStorage]", "bundleInfoList is null");
                            syncBundleFile2Json();
                            return;
                        } finally {
                            com.meituan.android.mrn.utils.n.a(objectInputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            }
        }
        y.a(x.a().b());
        b2 = x.a().b();
        if (b2 != null || b2.isEmpty()) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initMRNStorage]", "bundleInfoList is null");
            syncBundleFile2Json();
            return;
        }
        try {
            File d = x.a().d();
            if (d != null && d.exists() && (listFiles = d.listFiles()) != null && listFiles.length > 0) {
                i = 0 + listFiles.length;
            }
            if (i != b2.size()) {
                com.meituan.android.mrn.utils.c.a("[MRNBundleManager@initMRNStorage]", "内存数量和文件数量不一致");
            }
        } catch (Throwable th3) {
            com.meituan.android.mrn.utils.c.a(TAG + ":initMRNStorage", th3);
        }
    }

    private void syncBundleFile2Json() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24e0d5fdb3d445ad65f0f0e8878bd346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24e0d5fdb3d445ad65f0f0e8878bd346");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@syncDioBundleFile2Json]", TAG + ":syncDioBundleFile2Json");
        File d = x.a().d();
        if (d == null || !d.exists()) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@syncDioBundleFile2Json]", "bundle文件夹不存在");
            com.meituan.android.mrn.utils.c.a("[MRNBundleManager@syncDioBundleFile2Json]", "mrnOutDir is null or non exist");
            return;
        }
        File[] listFiles = d.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@syncDioBundleFile2Json]", TAG + ":syncBundleFile2Json bundle文件夹内容为空");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                e a2 = e.a(file);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (!CollectionUtils.isEmpty(arrayList)) {
                x.a().a(arrayList);
            } else {
                com.meituan.android.mrn.utils.c.a("[MRNBundleManager@syncDioBundleFile2Json]", "mrnBundles is empty");
            }
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("mrn_syncBundleFile2Json", th);
        }
    }

    public final void executeWhenBaseInitialized(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67b5c8e9789d697db8aca50c3a9d2c9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67b5c8e9789d697db8aca50c3a9d2c9e");
        } else if (runnable == null) {
        } else {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@executeWhenBaseInitialized]", "");
            if (this.mInitialized.get()) {
                runnable.run();
                return;
            }
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@executeWhenBaseInitialized]", "!mInitialized");
            synchronized (this.mBasePendingInitedCalls) {
                this.mBasePendingInitedCalls.add(runnable);
            }
        }
    }

    private void initBaseCompleted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6beb2a652b4a92256757ccfeaa59202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6beb2a652b4a92256757ccfeaa59202");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@initBaseCompleted]", "");
        this.mInitialized.set(true);
        synchronized (this.mBasePendingInitedCalls) {
            for (Runnable runnable : this.mBasePendingInitedCalls) {
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.mBasePendingInitedCalls.clear();
        }
    }

    public final void executeWhenBusinessInitialized(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "181d89dae34096181fbdf6ce1955d704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "181d89dae34096181fbdf6ce1955d704");
        } else if (runnable == null) {
        } else {
            executeWhenBaseInitialized(runnable);
        }
    }

    public final boolean hasBusinessCompleted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9afd90744b8dc6f187ec9edeaa3fc1c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9afd90744b8dc6f187ec9edeaa3fc1c")).booleanValue() : this.mInitialized.get();
    }

    private void initMinAvailableBundleVersions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c7ff3eb4ddf35f24cc674a43d8b04a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c7ff3eb4ddf35f24cc674a43d8b04a4");
            return;
        }
        String a2 = com.meituan.android.mrn.utils.k.a(this.mContext, "mrnbundle/mrn_min_bundle_versions.json", false);
        try {
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            Iterator<JsonElement> it = new JsonParser().parse(a2).getAsJsonArray().iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                String asString = next.getAsJsonObject().get("name").getAsString();
                String asString2 = next.getAsJsonObject().get("version").getAsString();
                if (!TextUtils.isEmpty(asString) && !TextUtils.isEmpty(asString2) && (!this.mMinAvailableBundleList.containsKey(asString) || com.meituan.android.mrn.utils.e.a(this.mMinAvailableBundleList.get(asString), asString2) <= 0)) {
                    this.mMinAvailableBundleList.put(asString, asString2);
                }
            }
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("initMinAvailableBundleVersions", th);
        }
    }

    public final String getMinVersionByBundleName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "406fd6426d053ae306695ebff332827a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "406fd6426d053ae306695ebff332827a");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mMinAvailableBundleList.get(str);
    }

    private void saveAssetsBundleInfo(List<AssetsBundle> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d15bcd756b413f91d767ca2c31a1fce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d15bcd756b413f91d767ca2c31a1fce5");
        } else if (this.mContext == null || list == null) {
        } else {
            com.meituan.android.mrn.common.b.a(this.mContext, STORE_KEY_ASSETS_BUNDLE_INFO, new Gson().toJson(list));
        }
    }

    public final boolean isAssetsBundle(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c171d67a63a166e0f168553be01edb05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c171d67a63a166e0f168553be01edb05")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (this.mDeleteAssetsBundleList == null) {
            String b2 = com.meituan.android.mrn.common.b.b(this.mContext, STORE_KEY_ASSETS_BUNDLE_INFO, (String) null);
            if (TextUtils.isEmpty(b2)) {
                return false;
            }
            this.mDeleteAssetsBundleList = (List) new Gson().fromJson(b2, new TypeToken<List<AssetsBundle>>() { // from class: com.meituan.android.mrn.engine.MRNBundleManager.2
            }.getType());
        }
        if (this.mDeleteAssetsBundleList != null) {
            for (AssetsBundle assetsBundle : this.mDeleteAssetsBundleList) {
                if (assetsBundle != null && TextUtils.equals(str, assetsBundle.bundleName) && TextUtils.equals(str2, assetsBundle.bundleVersion)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final e installBundleFromFile(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc5a66a64ec619421c0ba85b17a1fb5a", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc5a66a64ec619421c0ba85b17a1fb5a") : installBundleFromFile(file, false);
    }

    public final e installBundleFromFile(File file, boolean z) {
        Object[] objArr = {file, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e74e5932dd64f9a61b974d691c136933", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e74e5932dd64f9a61b974d691c136933");
        }
        if (file == null || !file.exists()) {
            return null;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@installBundleFromFile]", TAG + ":installBundleFromDioFile " + file.getAbsolutePath());
        e a2 = e.a(file);
        if (h.b(a2)) {
            x.a().a(a2);
            a2.a(z);
            x.a().a(a2, true, file.length());
            return a2;
        }
        return null;
    }

    public final e installBundleFromZipFile(String str, String str2, File file, String str3) {
        File a2;
        File file2;
        e eVar;
        Object[] objArr = {str, str2, file, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0492d54b6de4bd73b7d5d0f23c75dd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0492d54b6de4bd73b7d5d0f23c75dd9");
        }
        if (file == null || !file.exists()) {
            return null;
        }
        x a3 = x.a();
        String name = file.getName();
        Object[] objArr2 = {name};
        ChangeQuickRedirect changeQuickRedirect3 = x.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect3, false, "ba71b8bf9f780f2f7c91048095b56722", RobustBitConfig.DEFAULT_VALUE)) {
            file2 = (File) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect3, false, "ba71b8bf9f780f2f7c91048095b56722");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = x.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "13b30b0d4e885cf5133f8da8ca5d23ee", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (File) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "13b30b0d4e885cf5133f8da8ca5d23ee");
            } else {
                a2 = com.meituan.android.cipstorage.q.a(a3.b, "mrn_default", f.a(a3.b) + "mrn_zip");
                if (!a2.exists()) {
                    a2.mkdirs();
                }
            }
            file2 = new File(a2, name);
        }
        try {
            File absoluteFile = file.getAbsoluteFile();
            Object[] objArr4 = {absoluteFile, file2, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.utils.k.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "ee62aee519dec0cf6f7ba6a6160e67a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "ee62aee519dec0cf6f7ba6a6160e67a2");
            } else {
                com.meituan.android.mrn.utils.k.a(absoluteFile, file2);
                if (!absoluteFile.equals(file2)) {
                    if (file2.exists()) {
                        com.meituan.android.mrn.utils.k.d(file2);
                    }
                    if (absoluteFile.isFile()) {
                        com.meituan.android.mrn.utils.k.a(absoluteFile, file2, true, 3);
                    } else if (absoluteFile.isDirectory()) {
                        Object[] objArr5 = {absoluteFile, file2};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.mrn.utils.k.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "f75df7f3cec58e27c1af003a9859ac9b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "f75df7f3cec58e27c1af003a9859ac9b");
                        } else {
                            Object[] objArr6 = {absoluteFile, file2, (byte) 1};
                            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.mrn.utils.k.a;
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect7, true, "8029119d1cf05850a3a4ac5b8d30a29d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect7, true, "8029119d1cf05850a3a4ac5b8d30a29d");
                            } else {
                                Object[] objArr7 = {absoluteFile, file2, null, (byte) 1};
                                ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.mrn.utils.k.a;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect8, true, "1400a48d9338be2ffec66c5141c24bc4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect8, true, "1400a48d9338be2ffec66c5141c24bc4");
                                } else {
                                    com.meituan.android.mrn.utils.k.a(absoluteFile, file2, (FileFilter) null, true, true, 3);
                                }
                            }
                        }
                    }
                    com.meituan.android.mrn.utils.k.d(absoluteFile);
                }
            }
            eVar = e.a(str, str2, file2.getAbsolutePath(), str3);
            try {
                x.a().a(eVar);
                x.a().a(eVar, true, file.length());
            } catch (IOException e) {
                e = e;
                e.printStackTrace();
                return eVar;
            }
        } catch (IOException e2) {
            e = e2;
            eVar = null;
        }
        return eVar;
    }

    public final e getBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5d710cde97ee19cb0333d7bc70238f7", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5d710cde97ee19cb0333d7bc70238f7") : this.mStorageManager.a(str);
    }

    public final e getHighestBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "148403406933bc44dee232372e5b8238", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "148403406933bc44dee232372e5b8238");
        }
        x xVar = this.mStorageManager;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = x.a;
        if (PatchProxy.isSupport(objArr2, xVar, changeQuickRedirect3, false, "2a8a763b7bf983c0ffc1677d4289bbee", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr2, xVar, changeQuickRedirect3, false, "2a8a763b7bf983c0ffc1677d4289bbee");
        }
        e eVar = null;
        for (e eVar2 : xVar.c()) {
            if (eVar2 != null && TextUtils.equals(eVar2.c, str) && (!eVar2.j() || com.meituan.android.mrn.config.horn.i.b.a())) {
                if (eVar == null || com.meituan.android.mrn.utils.e.a(eVar.f, eVar2.f) < 0) {
                    eVar = eVar2;
                }
            }
        }
        return (eVar == null || !eVar.j()) ? eVar : y.a(eVar, false);
    }

    public final e getBundle(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28f10bebc094856d972384a1a2dc2982", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28f10bebc094856d972384a1a2dc2982") : this.mStorageManager.a(str, str2);
    }

    public final List<e> getBundle(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39abb4d6f1ac38a6ab3f7931dbc725a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39abb4d6f1ac38a6ab3f7931dbc725a7");
        }
        x xVar = this.mStorageManager;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect3 = x.a;
        if (PatchProxy.isSupport(objArr2, xVar, changeQuickRedirect3, false, "6b3fff6b55d0e178fce9fc1aef9d5846", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, xVar, changeQuickRedirect3, false, "6b3fff6b55d0e178fce9fc1aef9d5846");
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                e a2 = xVar.a(str);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public final List<e> getAllBundlesByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af2e45ab5369b1feeb56b774f102492f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af2e45ab5369b1feeb56b774f102492f") : this.mStorageManager.b(str);
    }

    public final List<e> getAllBundles() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b2a51b380a33b2396b1023a4457265d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b2a51b380a33b2396b1023a4457265d") : this.mStorageManager.b();
    }

    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    private void removeUnusedBundles() {
        int i;
        boolean startsWith;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0b620dd29cd8ea8e241a253bcb3acc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0b620dd29cd8ea8e241a253bcb3acc1");
            return;
        }
        List<e> allBundles = getAllBundles();
        if (CollectionUtils.isEmpty(allBundles)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = allBundles.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            e next = it.next();
            if (next != null) {
                Object[] objArr2 = new Object[1];
                objArr2[c] = next;
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "8fd980c4014b858864a354151be355a1", RobustBitConfig.DEFAULT_VALUE)) {
                    startsWith = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "8fd980c4014b858864a354151be355a1")).booleanValue();
                } else {
                    startsWith = (next == null || TextUtils.isEmpty(next.j)) ? false : next.j.startsWith("0.6");
                }
                if (!startsWith) {
                    arrayList.add(next);
                }
                if (isRNVersionIllegal(next)) {
                    arrayList.add(next);
                }
                c = 0;
            }
        }
        allBundles.removeAll(arrayList);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashSet hashSet = new HashSet();
        for (e eVar : allBundles) {
            if (eVar != null) {
                String minVersionByBundleName = getMinVersionByBundleName(eVar.c);
                if (eVar.h == 1 || isCoreBundle(eVar.c)) {
                    if (com.meituan.android.mrn.utils.e.a(eVar.f, (String) hashMap.get(eVar.c)) > 0 && (TextUtils.isEmpty(minVersionByBundleName) || com.meituan.android.mrn.utils.e.a(eVar.f, minVersionByBundleName) >= 0)) {
                        hashMap.put(eVar.c, eVar.f);
                        hashMap2.put(eVar.c, eVar.n);
                    } else {
                        MinAvailableBundle minAvailableBundle = new MinAvailableBundle(eVar.c, eVar.f);
                        if (!hashSet.contains(minAvailableBundle) && !this.mMinAvailableBundleList.isEmpty() && !TextUtils.isEmpty(minVersionByBundleName) && com.meituan.android.mrn.utils.e.a(eVar.f, minVersionByBundleName) < 0) {
                            hashSet.add(minAvailableBundle);
                        }
                    }
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        for (List list : hashMap2.values()) {
            hashSet2.addAll(list);
        }
        for (e eVar2 : allBundles) {
            if (eVar2 != null && !eVar2.g()) {
                if (eVar2.h == i || isCoreBundle(eVar2.c)) {
                    if (!TextUtils.equals(eVar2.f, (CharSequence) hashMap.get(eVar2.c))) {
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = "unused " + eVar2;
                        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@removeUnusedBundles]", objArr3);
                        arrayList.add(eVar2);
                        MinAvailableBundle minAvailableBundle2 = new MinAvailableBundle(eVar2.c, eVar2.f);
                        if (hashSet.contains(minAvailableBundle2)) {
                            com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a();
                            String str = eVar2.c;
                            String str2 = eVar2.f;
                            Object[] objArr4 = new Object[4];
                            objArr4[0] = str;
                            objArr4[i] = str2;
                            objArr4[2] = 0;
                            objArr4[3] = Byte.valueOf((byte) i);
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.monitor.g.a;
                            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "36038e2e18c3f5088b90940b3861d823", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "36038e2e18c3f5088b90940b3861d823");
                            } else {
                                a2.a(str, str2, 0, true, "onLaunch");
                            }
                            hashSet.remove(minAvailableBundle2);
                        }
                    }
                } else {
                    e.a aVar = new e.a();
                    aVar.b = eVar2.c;
                    aVar.c = eVar2.f;
                    if (!hashSet2.contains(aVar)) {
                        Object[] objArr5 = new Object[i];
                        objArr5[0] = eVar2;
                        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@removeUnusedBundles]", objArr5);
                        arrayList.add(eVar2);
                    } else if (eVar2.p) {
                        Object[] objArr6 = new Object[i];
                        objArr6[0] = "invalid " + eVar2;
                        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@removeUnusedBundles]", objArr6);
                        arrayList.add(eVar2);
                    }
                }
                i = 1;
            }
        }
        removeBundlesAndInstances(arrayList);
        if (hashSet.isEmpty()) {
            x a3 = x.a();
            Object[] objArr7 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect5 = x.a;
            if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect5, false, "3c9d54bb7b5d7708ae0124ad6f33b011", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect5, false, "3c9d54bb7b5d7708ae0124ad6f33b011");
            } else {
                com.meituan.android.cipstorage.q b2 = a3.b(a3.b);
                b2.a(com.meituan.android.mrn.utils.b.a(a3.b) + com.meituan.android.mrn.utils.b.b(a3.b) + "mrn_min_bundle_version_deleted", true);
            }
        }
        com.meituan.android.mrn.utils.k.c(this.mStorageManager.e());
    }

    private boolean installIfNeed(AssetsBundle assetsBundle) {
        Object[] objArr = {assetsBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e03f1853319a46eb20eca0b6f89bc58b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e03f1853319a46eb20eca0b6f89bc58b")).booleanValue();
        }
        if (assetsBundle == null) {
            return false;
        }
        return installIfNeed(assetsBundle, x.a().a(assetsBundle.bundleName));
    }

    private boolean installIfNeed(AssetsBundle assetsBundle, e eVar) {
        Object[] objArr = {assetsBundle, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "766f9923678d7608790c08926574e0b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "766f9923678d7608790c08926574e0b2")).booleanValue();
        }
        if (assetsBundle == null || TextUtils.isEmpty(assetsBundle.archiveName)) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleManager@installIfNeed]", "assetsBundle is null");
            return false;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@installIfNeed]", assetsBundle.archiveName);
        if (eVar != null && com.meituan.android.mrn.utils.e.a(eVar.f, assetsBundle.bundleVersion) >= 0) {
            return !h.b(eVar);
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundleManager@installIfNeed]", "内存没有此bundle,或者内存bundle的版本低于预置包的版本 " + eVar);
        return true;
    }

    public final AssetsBundle getBusinessAssetsBundleName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad526a8e6a816eb2cd884ca6b9ad383b", RobustBitConfig.DEFAULT_VALUE)) {
            return (AssetsBundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad526a8e6a816eb2cd884ca6b9ad383b");
        }
        if (this.businessAssetsBundleList == null || this.businessAssetsBundleList.size() <= 0) {
            return null;
        }
        for (AssetsBundle assetsBundle : this.businessAssetsBundleList) {
            if (TextUtils.equals(assetsBundle.bundleName, str)) {
                return assetsBundle;
            }
        }
        return null;
    }

    private AssetsBundle getCommonAssetsBundleByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b83612c11bacbfc75e3365155c3fe30e", RobustBitConfig.DEFAULT_VALUE)) {
            return (AssetsBundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b83612c11bacbfc75e3365155c3fe30e");
        }
        if (this.commonAssetsBundleList == null || this.commonAssetsBundleList.size() <= 0) {
            return null;
        }
        for (AssetsBundle assetsBundle : this.commonAssetsBundleList) {
            if (TextUtils.equals(assetsBundle.bundleName, str)) {
                return assetsBundle;
            }
        }
        return null;
    }

    public final e getCommonBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "888dcbac287ad175a1aba0af58aa33f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "888dcbac287ad175a1aba0af58aa33f6");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e bundle = getBundle(str);
        AssetsBundle commonAssetsBundleByName = getCommonAssetsBundleByName(str);
        if (installIfNeed(commonAssetsBundleByName, bundle)) {
            try {
                b installBundleFromAssetsInner = installBundleFromAssetsInner(commonAssetsBundleByName);
                com.meituan.android.mrn.utils.p.a("[MRNBundleManager@getCommonBundle]", commonAssetsBundleByName.bundleName + StringUtil.SPACE + installBundleFromAssetsInner);
            } catch (IOException e) {
                handleException("[MRNBundleManager@getCommonBundle]", e);
            }
            return getBundle(str);
        }
        return bundle;
    }

    public final boolean installBundleFromAssetsSync(AssetsBundle assetsBundle) {
        Object[] objArr = {assetsBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f15d89d83810a92941389d8d7305e37e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f15d89d83810a92941389d8d7305e37e")).booleanValue();
        }
        if (assetsBundle == null || TextUtils.isEmpty(assetsBundle.archiveName)) {
            return false;
        }
        try {
            if (!CollectionUtils.isEmpty(assetsBundle.meta)) {
                for (AssetsBundle assetsBundle2 : assetsBundle.meta) {
                    b installBundleFromAssetsInner = installBundleFromAssetsInner(assetsBundle2);
                    if (!installBundleFromAssetsInner.a()) {
                        return false;
                    }
                    com.meituan.android.mrn.utils.p.a("[MRNBundleManager@run]", assetsBundle2.bundleName + StringUtil.SPACE + installBundleFromAssetsInner);
                }
            }
            if (installBundleFromAssetsInner(assetsBundle).a()) {
                markDecompressPreset(assetsBundle.bundleName);
                return true;
            }
            return false;
        } catch (IOException e) {
            handleException("[MRNBundleManager@installBundleFromAssets]", e);
            return false;
        }
    }

    public final void installBundleFromAssets(final AssetsBundle assetsBundle, final a aVar) {
        Object[] objArr = {assetsBundle, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d15853afa9b265e6a89cb1d23ee13364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d15853afa9b265e6a89cb1d23ee13364");
        } else if (assetsBundle == null || aVar == null || TextUtils.isEmpty(assetsBundle.archiveName)) {
        } else {
            executorService.execute(new Runnable() { // from class: com.meituan.android.mrn.engine.MRNBundleManager.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e3a0ee12d9ff6852b6c51469361750cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e3a0ee12d9ff6852b6c51469361750cc");
                    } else {
                        MRNBundleManager.this.installBundleFromAssetsSync(assetsBundle);
                    }
                }
            });
        }
    }

    private boolean isCoreBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed4f310b8435a2e2cb786e8794b28c6f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed4f310b8435a2e2cb786e8794b28c6f")).booleanValue() : BASE_BUNDLE_NAME.equalsIgnoreCase(str);
    }

    public static boolean deleteBundleFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eda2695ad16b2f064335260e1ccd4710", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eda2695ad16b2f064335260e1ccd4710")).booleanValue();
        }
        if (str == null) {
            return true;
        }
        File file = new File(str);
        for (int i = 0; i < 3; i++) {
            if (com.meituan.android.mrn.utils.k.c(file)) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class AssetsBundle {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String archiveName;
        public String bundleId;
        public String bundleName;
        public String bundleVersion;
        public String fileName;
        public List<AssetsBundle> meta;

        public AssetsBundle(String str, String str2, String str3, String str4) {
            this.archiveName = str;
            this.fileName = str2;
            this.bundleName = str3;
            this.bundleVersion = str4;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class MinAvailableBundle {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;
        public String version;

        public MinAvailableBundle() {
        }

        public MinAvailableBundle(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4f146cc85c9611367fdcfb944a9ff1f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4f146cc85c9611367fdcfb944a9ff1f");
                return;
            }
            this.name = str;
            this.version = str2;
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab9979af95237dcb236944c596f8b863", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab9979af95237dcb236944c596f8b863")).booleanValue();
            }
            if (obj instanceof MinAvailableBundle) {
                MinAvailableBundle minAvailableBundle = (MinAvailableBundle) obj;
                return TextUtils.equals(this.name, minAvailableBundle.name) && TextUtils.equals(this.version, minAvailableBundle.version);
            }
            return false;
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1103cb2210613827b775969ef47a3d4b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1103cb2210613827b775969ef47a3d4b")).intValue();
            }
            if (this.name == null || this.version == null) {
                return super.hashCode();
            }
            return this.name.hashCode() + this.version.hashCode();
        }
    }

    public final e installDioBundle(com.meituan.dio.g gVar) throws IOException, JSONException {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f11d8219ba040073cc36df6fb28ddd62", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f11d8219ba040073cc36df6fb28ddd62");
        }
        if (gVar == null) {
            return null;
        }
        com.meituan.dio.e eVar = new com.meituan.dio.e(gVar);
        JSONObject a2 = com.meituan.android.mrn.utils.g.a(new String(com.meituan.dio.utils.c.a(eVar.a(eVar.a("meta.json")))));
        File d = x.a().d(a2.optString("name"), a2.optString("version"));
        com.meituan.android.mrn.utils.k.d(d);
        com.meituan.dio.utils.c.a(gVar.c(), new FileOutputStream(d), true);
        return installBundleFromFile(d);
    }

    public final List<String> getPresetBundleInfo() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ef2c4b270b1ed3f25fc9a928db0083", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ef2c4b270b1ed3f25fc9a928db0083");
        }
        String[] list = this.mContext.getAssets().list(ASSETS_JSBUNDLE);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.contains(BASE_BUNDLE_NAME)) {
                String baseZipName = getBaseZipName(str);
                if (!TextUtils.isEmpty(baseZipName)) {
                    arrayList.add(0, baseZipName);
                } else {
                    arrayList.add(str);
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007d -> B:44:0x0080). Please submit an issue!!! */
    private String getBaseZipName(String str) {
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db88a4d50a2d6a8b60c3e26e4673e4f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db88a4d50a2d6a8b60c3e26e4673e4f1");
        }
        ZipInputStream zipInputStream2 = 0;
        zipInputStream2 = null;
        try {
            try {
                try {
                    AssetManager assets = this.mContext.getAssets();
                    zipInputStream = new ZipInputStream(assets.open("mrnbundle/" + str));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            zipInputStream2 = e2;
        }
        try {
            nextEntry = zipInputStream.getNextEntry();
        } catch (Exception e3) {
            e = e3;
            zipInputStream2 = zipInputStream;
            e.printStackTrace();
            if (zipInputStream2 != null) {
                zipInputStream2.close();
                zipInputStream2 = zipInputStream2;
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 != 0) {
                try {
                    zipInputStream2.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
        if (nextEntry == null || nextEntry.getName().split("/").length <= 0) {
            zipInputStream.close();
            zipInputStream2 = nextEntry;
            return str;
        }
        String str2 = nextEntry.getName().split("/")[0];
        try {
            zipInputStream.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return str2;
    }

    public final void removeBundleForce(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9031bf2279868d3f736e08122800557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9031bf2279868d3f736e08122800557");
            return;
        }
        com.facebook.common.logging.a.b("[MRNBundleManager@removeBundleForce]", eVar.c + StringUtil.SPACE + eVar.f);
        this.mStorageManager.b(eVar);
        if (this.mPendingRemoveBundleMap.containsKey(eVar)) {
            this.mPendingRemoveBundleMap.remove(eVar);
        }
    }

    public final boolean removeBundleAndInstance(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af3c85ddefbb54d694744daf4c78c369", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af3c85ddefbb54d694744daf4c78c369")).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        com.facebook.common.logging.a.b("[MRNBundleManager@removeBundleSafe]", eVar.c + StringUtil.SPACE + eVar.f);
        boolean removeBundle = removeBundle(eVar, z);
        return !removeBundle ? removeBundle : removeInstance(eVar);
    }

    public final boolean removeBundle(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9b30054b4dd89bbf68808ccb6a61634", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9b30054b4dd89bbf68808ccb6a61634")).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        com.facebook.common.logging.a.b("[MRNBundleManager@removeBundle]", eVar.c + StringUtil.SPACE + eVar.f);
        com.meituan.android.mrn.utils.t tVar = this.mBundleLockMap.get(eVar);
        if (tVar == null || !tVar.c()) {
            if (z) {
                moveBundleToMark(eVar);
            }
            this.mStorageManager.b(eVar);
            return true;
        }
        if (z) {
            this.mPendingRemoveBundleMap.put(eVar, Boolean.TRUE);
        } else if (!this.mPendingRemoveBundleMap.containsKey(eVar)) {
            this.mPendingRemoveBundleMap.put(eVar, Boolean.FALSE);
        }
        return false;
    }

    public final void removeBundlesAndInstances(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c339b0a12f1a8cadd715c0162cdf4a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c339b0a12f1a8cadd715c0162cdf4a75");
            return;
        }
        com.facebook.common.logging.a.b("[MRNBundleManager@removeBundlesSafe]", "");
        List<e> removeBundles = removeBundles(list);
        if (o.a().c() == 0) {
            return;
        }
        for (e eVar : removeBundles) {
            com.facebook.common.logging.a.b("[MRNBundleManager@removeBundlesSafe]", eVar.c);
            removeInstance(eVar);
        }
    }

    public final List<e> removeBundles(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1adffae8abc6f19857ee1c9404072f9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1adffae8abc6f19857ee1c9404072f9f");
        }
        com.facebook.common.logging.a.b("[MRNBundleManager@removeBundles]", "");
        ArrayList arrayList = new ArrayList();
        for (e eVar : list) {
            com.meituan.android.mrn.utils.t tVar = this.mBundleLockMap.get(eVar);
            if (tVar != null && tVar.c()) {
                com.facebook.common.logging.a.b("[MRNBundleManager@removeBundles]", "bundle is lock " + eVar.c);
                this.mPendingRemoveBundleMap.put(eVar, Boolean.FALSE);
            } else {
                arrayList.add(eVar);
            }
        }
        this.mStorageManager.b(arrayList);
        return arrayList;
    }

    private boolean removeInstance(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198c5af4d863529fd65bc65918fd09c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198c5af4d863529fd65bc65918fd09c5")).booleanValue();
        }
        final k a2 = o.a().a(eVar);
        if (a2 == null) {
            return true;
        }
        if (a2.f != p.USED) {
            a2.e();
            return true;
        }
        a2.q = new k.a() { // from class: com.meituan.android.mrn.engine.MRNBundleManager.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.engine.k.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "45b8c4cc1d69cff6b1a26dc03f1f8280", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "45b8c4cc1d69cff6b1a26dc03f1f8280");
                } else if (a2 != null) {
                    a2.e();
                }
            }
        };
        return false;
    }

    public final void lockBundle(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c726556059b3eeb1fcf9ea562229760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c726556059b3eeb1fcf9ea562229760");
        } else if (eVar == null) {
        } else {
            com.facebook.common.logging.a.b("[MRNBundleManager@lockBundle]", eVar.c);
            com.meituan.android.mrn.utils.t tVar = this.mBundleLockMap.get(eVar);
            if (tVar == null) {
                tVar = new com.meituan.android.mrn.utils.t();
                this.mBundleLockMap.put(eVar, tVar);
            }
            tVar.a();
        }
    }

    public final void unlockBundle(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a750879828a9abc38361399327d42dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a750879828a9abc38361399327d42dbf");
        } else if (eVar == null) {
        } else {
            com.facebook.common.logging.a.b("[MRNBundleManager@unlockBundle]", eVar.c);
            com.meituan.android.mrn.utils.t tVar = this.mBundleLockMap.get(eVar);
            if (tVar == null) {
                return;
            }
            tVar.b();
            if (!tVar.c() && this.mPendingRemoveBundleMap.size() > 0) {
                Iterator<Map.Entry<e, Boolean>> it = this.mPendingRemoveBundleMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<e, Boolean> next = it.next();
                    e key = next.getKey();
                    if (key.equals(eVar)) {
                        com.facebook.common.logging.a.b("[MRNBundleManager@unlockBundle]", "removeBundle: " + eVar.c);
                        if (next.getValue().booleanValue()) {
                            moveBundleToMark(key);
                        }
                        this.mStorageManager.b(key);
                        removeInstance(key);
                    }
                }
                this.mPendingRemoveBundleMap.remove(eVar);
            }
        }
    }

    private void moveBundleToMark(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3742352d7b24d4c3a545bbecc4e87214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3742352d7b24d4c3a545bbecc4e87214");
        } else if (eVar == null) {
        } else {
            try {
                new File(eVar.m).renameTo(this.mStorageManager.b(eVar.c, eVar.f));
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("[MRNBundleManager@removeBundle]", "", th);
            }
        }
    }

    public final synchronized String getPresetVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9d73e145f392b85ea1bd3512bb38af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9d73e145f392b85ea1bd3512bb38af");
        }
        if (this.businessAssetsBundleList == null) {
            this.businessAssetsBundleList = getBundleArchiveListInJSBundle(false);
            if (this.businessAssetsBundleList != null) {
                for (AssetsBundle assetsBundle : this.businessAssetsBundleList) {
                    this.businessAssetsBundleMap.put(assetsBundle.bundleName, assetsBundle);
                }
            }
        }
        AssetsBundle assetsBundle2 = this.businessAssetsBundleMap.get(str);
        if (assetsBundle2 == null) {
            return null;
        }
        return assetsBundle2.bundleVersion;
    }

    public final boolean hasDecompressPreset(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf034881f88976d5fa3e9d63007c009b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf034881f88976d5fa3e9d63007c009b")).booleanValue();
        }
        com.meituan.android.cipstorage.q b2 = x.a().b(this.mContext);
        return b2.b(com.meituan.android.mrn.utils.b.a(this.mContext) + com.meituan.android.mrn.utils.b.b(this.mContext) + str, false);
    }

    public final void markDecompressPreset(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d28e3337a8afa38a6ae148539aef06d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d28e3337a8afa38a6ae148539aef06d3");
            return;
        }
        x.a().f();
        com.meituan.android.cipstorage.q b2 = x.a().b(this.mContext);
        b2.a(com.meituan.android.mrn.utils.b.a(this.mContext) + com.meituan.android.mrn.utils.b.b(this.mContext) + str, true);
    }
}
