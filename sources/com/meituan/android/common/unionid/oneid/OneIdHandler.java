package com.meituan.android.common.unionid.oneid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.android.meituan.multiprocess.e;
import com.android.meituan.multiprocess.init.a;
import com.meituan.android.common.unionid.UnionIdHandler;
import com.meituan.android.common.unionid.oneid.appid.AppIdCallback;
import com.meituan.android.common.unionid.oneid.appid.AppIdHandler;
import com.meituan.android.common.unionid.oneid.cache.DpidCallback;
import com.meituan.android.common.unionid.oneid.cache.IOneIdCallback;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.log.LogApiRetrofit;
import com.meituan.android.common.unionid.oneid.monitor.ILogger;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.LifecycleManager;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.ProcessUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdHandler {
    public static volatile String DPID = "";
    private static final String TAG = "OneIdHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context mContext;
    private static OneIdHandler sInstance;
    protected Executor SINGLE_THREAD_EXECUTOR;
    private volatile boolean isInitialized;
    private volatile boolean isIpcInitialized;
    private volatile boolean isStricMode;
    private List<IOneIdCallback> mCallbacks;
    private List<DpidCallback> mDpidCallbacks;
    private Handler mHandler;
    protected AtomicBoolean mIsDpidRunning;
    protected AtomicBoolean mIsUnionIdRunning;
    private OneIdNetworkHandler mOneIdNetworkHandler;
    private volatile boolean startAfterInit;

    private void initDeviceBaseInfo() {
    }

    public static void initMonitor(Context context, int i) {
    }

    @Deprecated
    public String getOneIdByUuid(Pair<String, Integer> pair, StatUtil statUtil) {
        return "";
    }

    public String getOneIdByUuid(String str, Pair<String, Integer> pair) {
        return "";
    }

    public String getOneIdByUuid(String str, Pair<String, Integer> pair, StatUtil statUtil) {
        return "";
    }

    @Deprecated
    public boolean isSupportMultiProcess() {
        return false;
    }

    public OneIdHandler(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dad34068ada92692368efba7b848337", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dad34068ada92692368efba7b848337");
            return;
        }
        this.isInitialized = false;
        this.isIpcInitialized = false;
        this.isStricMode = false;
        this.startAfterInit = false;
        mContext = AppUtil.getAppContext(context);
        this.mIsUnionIdRunning = new AtomicBoolean(false);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mCallbacks = new CopyOnWriteArrayList();
        this.mDpidCallbacks = new CopyOnWriteArrayList();
        this.mIsDpidRunning = new AtomicBoolean(false);
        LogMonitor.setSdkVersion(AppUtil.getSdkVersion(context));
        this.SINGLE_THREAD_EXECUTOR = c.a("oneid-task-thread");
    }

    public static synchronized OneIdHandler getInstance(@NonNull Context context) {
        synchronized (OneIdHandler.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3adb6ef3772fcc3eb866a54e28cc46f8", RobustBitConfig.DEFAULT_VALUE)) {
                return (OneIdHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3adb6ef3772fcc3eb866a54e28cc46f8");
            }
            if (sInstance == null) {
                sInstance = new OneIdHandler(AppUtil.getAppContext(context));
            } else if (context != null) {
                sInstance.setContext(context);
                OneIdHelper.setContext(context);
            }
            return sInstance;
        }
    }

    private void setContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67903a2b0792674566924810117b175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67903a2b0792674566924810117b175");
        } else if (mContext != null || context == null) {
        } else {
            mContext = AppUtil.getAppContext(context);
        }
    }

    public static Context getContext() {
        return mContext;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ca0b01a513856822c12aa4b226f2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ca0b01a513856822c12aa4b226f2e1");
        } else if (ProcessUtils.isMainThread()) {
            b.a(this.SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c3937ec5cd2659cea47dbcccef1549a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c3937ec5cd2659cea47dbcccef1549a9");
                    } else {
                        OneIdHandler.this._init(false);
                    }
                }
            });
        } else {
            _init(false);
        }
    }

    public void init(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca85ef2fc44fec6afb27e51bae93a154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca85ef2fc44fec6afb27e51bae93a154");
            return;
        }
        this.isStricMode = z;
        this.startAfterInit = z2;
        if (ProcessUtils.isMainThread()) {
            b.a(this.SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9c84658952420d9aba993c35ba0f34bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9c84658952420d9aba993c35ba0f34bf");
                    } else {
                        OneIdHandler.this._init(false);
                    }
                }
            });
        } else {
            _init(false);
        }
    }

    public void initOnIot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e121c373b612b785fc753831f5844d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e121c373b612b785fc753831f5844d6");
        } else if (ProcessUtils.isMainThread()) {
            b.a(this.SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "80fb9cfcd07345cb95a4ad59886d99e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "80fb9cfcd07345cb95a4ad59886d99e0");
                    } else {
                        OneIdHandler.this._init(true);
                    }
                }
            });
        } else {
            _init(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void _init(boolean z) {
        if (this.isInitialized) {
            return;
        }
        OneIdPrivacyHelper.registerPrivacyMode(mContext);
        if (z) {
            LogApiRetrofit.SEND_URL = "https://data-sdk-uuid-report.dreport.zservey.com/";
            OneIdConstants.ONE_ID_BASE_URL = "https://api-unionid.zservey.com/unionid/";
            OneIdHelper.SERVER_REGISTER_URL = OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_REGISTER;
            OneIdHelper.SERVER_UPDATE_URL = OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_UPDATE;
        }
        this.isInitialized = true;
        this.mOneIdNetworkHandler = new OneIdNetworkHandler();
        initIPC();
        OneIdHelper.init(mContext, this.mHandler);
        resetRefreshTime();
        initDeviceBaseInfo();
    }

    private void initIPC() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "280da189d002a02b43b1ca1e39a87ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "280da189d002a02b43b1ca1e39a87ab2");
        } else if (mContext == null && this.isIpcInitialized) {
        } else {
            LogUtils.i("session_id", "init sessionid:" + ProcessUtils.getCurrentProcessName(mContext) + "  isStrictMode:" + this.isStricMode);
            if (this.isStricMode) {
                e.a(mContext, new a() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.android.meituan.multiprocess.init.a
                    public void addServiceManager(com.android.meituan.multiprocess.c cVar) {
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public void onAddTypeTransfer(com.android.meituan.multiprocess.init.b bVar) {
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public void setLog(com.android.meituan.multiprocess.c cVar) {
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public void addService(com.android.meituan.multiprocess.c cVar) {
                        Object[] objArr2 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7dfba559e8a2af3979d629265a2a1a0c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7dfba559e8a2af3979d629265a2a1a0c");
                            return;
                        }
                        String packageName = OneIdHandler.mContext.getPackageName();
                        cVar.a(packageName, "content://" + OneIdHandler.mContext.getPackageName() + ".AppIdProvider");
                    }
                });
            }
            this.isIpcInitialized = true;
        }
    }

    private void resetRefreshTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47536fd04239316226f5b50cc801ca51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47536fd04239316226f5b50cc801ca51");
        } else if (OneIdSharePref.getInstance(getContext()).isRefreshLastSyncTime()) {
        } else {
            if (OneIdSharePref.getInstance(mContext).getLastSyncTime() != -1) {
                OneIdSharePref.getInstance(getContext()).setLastSyncTime(System.currentTimeMillis());
            }
            OneIdSharePref.getInstance(mContext).setRefreshLastSyncTime(true);
        }
    }

    public void registerChangeListener(DpidCallback dpidCallback) {
        Object[] objArr = {dpidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ebf6447266ae6123d2ad55b104aef5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ebf6447266ae6123d2ad55b104aef5f");
        } else {
            this.mDpidCallbacks.add(dpidCallback);
        }
    }

    public void unRegisterChangeListener(DpidCallback dpidCallback) {
        Object[] objArr = {dpidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f947a8ce104f80fca75db34366c9804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f947a8ce104f80fca75db34366c9804");
        } else if (this.mDpidCallbacks.contains(dpidCallback)) {
            this.mDpidCallbacks.remove(dpidCallback);
        }
    }

    public void registerOneIdChangeListener(IOneIdCallback iOneIdCallback) {
        Object[] objArr = {iOneIdCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06482e13dac15d02c352a721d69ede98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06482e13dac15d02c352a721d69ede98");
        } else {
            this.mCallbacks.add(iOneIdCallback);
        }
    }

    public void unRegisterOneIdChangeListener(IOneIdCallback iOneIdCallback) {
        Object[] objArr = {iOneIdCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a3ca357bd294e4a08086e3b1f6f719a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a3ca357bd294e4a08086e3b1f6f719a");
        } else if (this.mCallbacks.contains(iOneIdCallback)) {
            this.mCallbacks.remove(iOneIdCallback);
        }
    }

    public String getOneIdFromLocal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bdbc597404b6d162b6737f2d293601e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bdbc597404b6d162b6737f2d293601e");
        }
        if (OneIdPrivacyHelper.isPrivateSessionId(mContext)) {
            return OneIdSharePref.getInstance(mContext).getPrivateUnionid();
        }
        return UnionIdHandler.getSingleInstance(mContext).getUnionIdFromLocal();
    }

    public String getLocalOneId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69e2d3440b3e89ae1a0e0e1ad319bd9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69e2d3440b3e89ae1a0e0e1ad319bd9c");
        }
        String memoryCacheOneId = OneIdHelper.getMemoryCacheOneId();
        if (TextUtils.isEmpty(memoryCacheOneId)) {
            if (mContext == null) {
                return "";
            }
            init();
            getOneId(new IOneIdCallback() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
                public void call(String str) {
                }
            });
            return memoryCacheOneId;
        }
        return memoryCacheOneId;
    }

    public String getOneIdThroughLocal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8decf9542f14f10d5b11b28bf8dfd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8decf9542f14f10d5b11b28bf8dfd6");
        }
        String memoryCacheOneId = OneIdHelper.getMemoryCacheOneId();
        if (TextUtils.isEmpty(memoryCacheOneId)) {
            if (mContext == null) {
                return "";
            }
            init();
            getOneId(new IOneIdCallback() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
                public void call(String str) {
                }
            });
            if (OneIdPrivacyHelper.isPrivateSessionId(mContext)) {
                return OneIdSharePref.getInstance(mContext).getPrivateUnionid();
            }
            return UnionIdHandler.getSingleInstance(mContext).getUnionIdFromLocal();
        }
        return memoryCacheOneId;
    }

    public void getOneId(final IOneIdCallback iOneIdCallback) {
        Object[] objArr = {iOneIdCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db321bffe90e3cc36a52a2135f3ac57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db321bffe90e3cc36a52a2135f3ac57b");
        } else if (ProcessUtils.isMainThread()) {
            b.a(this.SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d1f8926a5ef499bb7d4849edb37b467", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d1f8926a5ef499bb7d4849edb37b467");
                    } else {
                        OneIdHandler.this._getOneId(iOneIdCallback);
                    }
                }
            });
        } else {
            _getOneId(iOneIdCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void _getOneId(IOneIdCallback iOneIdCallback) {
        if (iOneIdCallback != null) {
            try {
                if (!this.mCallbacks.contains(iOneIdCallback)) {
                    this.mCallbacks.add(iOneIdCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.isInitialized) {
            init();
        }
        OneIdHelper.registerOrUpdate(mContext, this.mOneIdNetworkHandler, this.mCallbacks);
    }

    public String getLocalDpid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f99af500c893f5fb8d63e0dd95118e61", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f99af500c893f5fb8d63e0dd95118e61") : OneIdHelper.getDpidBySharePref(context);
    }

    public synchronized String getOneIdByDpid(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfebba797a7edd9c55278d56bfb00057", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfebba797a7edd9c55278d56bfb00057");
        }
        if (TextUtils.isEmpty(DPID)) {
            String[] strArr = {str, str2, str3, str4};
            StatUtil statUtil = new StatUtil();
            statUtil.monitorLog = MonitorManager.createNewMonitor(statUtil, getContext(), System.currentTimeMillis(), "dpid");
            if (!this.isInitialized) {
                init();
            }
            DPID = OneIdHelper.registerOrUpdateDpid(mContext, this.mOneIdNetworkHandler, this.mDpidCallbacks, strArr, statUtil);
        }
        return DPID;
    }

    public synchronized String getOneIdByDpid(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f89b4cf3677a24a78d25581e825c9b6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f89b4cf3677a24a78d25581e825c9b6e");
        }
        if (TextUtils.isEmpty(DPID)) {
            StatUtil statUtil = new StatUtil();
            statUtil.monitorLog = MonitorManager.createNewMonitor(statUtil, getContext(), System.currentTimeMillis(), "dpid");
            DPID = OneIdHelper.registerOrUpdateDpid(mContext, this.mOneIdNetworkHandler, this.mDpidCallbacks, new String[]{str, str2, str3, str4, str5}, statUtil);
        }
        return DPID;
    }

    public Pair<Boolean, String> getOneIdByUuid(DeviceInfo deviceInfo, String str, Pair<String, Integer> pair, StatUtil statUtil) {
        Object[] objArr = {deviceInfo, str, pair, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dda89523c282cc979cab6f5209fcea9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dda89523c282cc979cab6f5209fcea9");
        }
        if (!this.isInitialized) {
            init();
        }
        return OneIdHelper.registerOrUpdateUuid(deviceInfo, mContext, str, this.mOneIdNetworkHandler, pair, statUtil);
    }

    public static void setLogger(ILogger iLogger) {
        Object[] objArr = {iLogger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39e5d5f618aa1783f8388b67ded90540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39e5d5f618aa1783f8388b67ded90540");
        } else {
            LogMonitor.setLogger(iLogger);
        }
    }

    @Deprecated
    public String getAppId(final AppIdCallback appIdCallback) {
        Object[] objArr = {appIdCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ec4542e32e60c9918ab826ac481b0bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ec4542e32e60c9918ab826ac481b0bd");
        }
        b.a(this.SINGLE_THREAD_EXECUTOR, new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHandler.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c37cdc030ec758b72c32df329aaa4385", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c37cdc030ec758b72c32df329aaa4385");
                    return;
                }
                String[] appId = AppIdHandler.getAppId(OneIdHandler.mContext);
                if (appIdCallback == null || appId == null || appId.length <= 0) {
                    return;
                }
                for (String str : appId) {
                    if (!TextUtils.isEmpty(str)) {
                        appIdCallback.call(str);
                        return;
                    }
                }
            }
        });
        return OneIdSharePref.getInstance(mContext).getLocalAppid();
    }

    public void getOAID(OaidCallback oaidCallback) {
        Object[] objArr = {oaidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a4b45c0878982aa9f48b3597b6f724a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a4b45c0878982aa9f48b3597b6f724a");
        } else if (mContext == null || oaidCallback == null) {
        } else {
            OaidManager.getInstance().getOaid(mContext, oaidCallback);
        }
    }

    public String getOAID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b3dd01e43d6be4d455d5a08d1f70d85", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b3dd01e43d6be4d455d5a08d1f70d85") : mContext != null ? OaidManager.getInstance().getOaid(mContext) : "";
    }

    public void registerActivityLifecycleCallback(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac8e35ae2245cfeadf731b44f7e2dc73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac8e35ae2245cfeadf731b44f7e2dc73");
        } else {
            LifecycleManager.register(context);
        }
    }

    public String getLastUuuidInPrivacyChange(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c24a4aa40ab9f57f4bcfb4f01f003a00", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c24a4aa40ab9f57f4bcfb4f01f003a00") : context != null ? OneIdSharePref.getInstance(context).getOldUuid() : "";
    }

    public String getLastDpidInPrivacyChange(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9090dcdcf9fb41cbb69ef34de5c0833", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9090dcdcf9fb41cbb69ef34de5c0833") : context != null ? OneIdSharePref.getInstance(context).getOldDpid() : "";
    }

    public boolean isStartAfterInit() {
        return this.startAfterInit;
    }

    public boolean isStricMode() {
        return this.isStricMode;
    }
}
