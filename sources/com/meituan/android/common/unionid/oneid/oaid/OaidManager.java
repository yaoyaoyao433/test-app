package com.meituan.android.common.unionid.oneid.oaid;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider;
import com.meituan.android.common.unionid.oneid.oaid.provider.BaseResponse;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.AESUtils;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OaidManager {
    private static final String OAIDCALLTIMES = "oaidCallTimes";
    public static final String THREAD_TAG = "OManager-";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean mChanged = false;
    private static volatile OaidManager singleton;
    private final ExecutorService mASyncThreadExecutor;
    private final Condition mCondition;
    private AtomicBoolean mIsRunning;
    private Set<OaidCallback> mListeners;
    private AtomicBoolean mLoaded;
    private final ReentrantLock mLock;
    private String mOaid;
    private int mOaidStatus;
    private AtomicBoolean mUpdated;
    private BaseResponse sdkRes;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum Source {
        FILE(1001),
        SYSTEM(1002);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int from;

        public static Source valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67c726bb3134de43b8e38c267c44b0cc", RobustBitConfig.DEFAULT_VALUE) ? (Source) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67c726bb3134de43b8e38c267c44b0cc") : (Source) Enum.valueOf(Source.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Source[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8deed2815c25f0f83e13ee3fe9ab2dd", RobustBitConfig.DEFAULT_VALUE) ? (Source[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8deed2815c25f0f83e13ee3fe9ab2dd") : (Source[]) values().clone();
        }

        Source(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a17bcf9243ba3f4e8cffbba1e295f6e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a17bcf9243ba3f4e8cffbba1e295f6e");
            } else {
                this.from = i;
            }
        }
    }

    public static OaidManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa56cd6ed609f356570ab5712ef90489", RobustBitConfig.DEFAULT_VALUE)) {
            return (OaidManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa56cd6ed609f356570ab5712ef90489");
        }
        if (singleton == null) {
            synchronized (OaidManager.class) {
                if (singleton == null) {
                    singleton = new OaidManager();
                }
            }
        }
        return singleton;
    }

    public OaidManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "218f00d7a174b74be73ac2d20fc45dc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "218f00d7a174b74be73ac2d20fc45dc9");
            return;
        }
        this.mOaid = null;
        this.mOaidStatus = 0;
        this.sdkRes = null;
        this.mLock = new ReentrantLock();
        this.mCondition = this.mLock.newCondition();
        this.mLoaded = new AtomicBoolean(false);
        this.mIsRunning = new AtomicBoolean(false);
        this.mUpdated = new AtomicBoolean(false);
        this.mASyncThreadExecutor = c.a("OManager-async-thread");
        init();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8675bfc63bb9ffa5174d36ab8a611b06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8675bfc63bb9ffa5174d36ab8a611b06");
        } else {
            this.mListeners = Collections.newSetFromMap(new ConcurrentHashMap());
        }
    }

    public String getLocalOAID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbe3f8ab22895867c9d503a3347c68c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbe3f8ab22895867c9d503a3347c68c2") : getLocalOAID(context, null);
    }

    public String getLocalOAID(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a2f66c574490b3643a2225d2c9bdbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a2f66c574490b3643a2225d2c9bdbb");
        }
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat("oaid", 11);
                return "";
            }
            return "";
        } else if (!TextUtils.isEmpty(this.mOaid) || this.mLoaded.get()) {
            stasticOaidStatus(statUtil, this.mOaid, this.mOaidStatus);
            return this.mOaid;
        } else {
            if (!this.mLoaded.get()) {
                this.mOaid = Utils.getLocalOaid(context);
                this.mOaidStatus = Utils.getLocalOaidStatus(context);
                if (Utils.isDeviceDataTransfer(context)) {
                    this.mOaid = "";
                    this.mOaidStatus = 0;
                }
                this.mLoaded.compareAndSet(false, true);
            }
            stasticOaidStatus(statUtil, this.mOaid, this.mOaidStatus);
            LogUtils.i("oaidmanager", "getLocalOAID:" + this.mOaid);
            return this.mOaid;
        }
    }

    private void stasticOaidStatus(StatUtil statUtil, String str, int i) {
        Object[] objArr = {statUtil, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51faf736f895602cc1b6779c8f7620a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51faf736f895602cc1b6779c8f7620a9");
        } else if (!TextUtils.isEmpty(str)) {
            if (statUtil != null) {
                statUtil.markStat("oaid", 130);
            }
        } else if (statUtil != null) {
            if (i == 200) {
                statUtil.markStat("oaid", 8);
            } else if (i == 400) {
                statUtil.markStat("oaid", 6);
            } else if (i == 500) {
                statUtil.markStat("oaid", 7);
            } else if (i == 600) {
                statUtil.markStat("oaid", 12);
            } else {
                statUtil.markStat("oaid", 9);
            }
        }
    }

    public void getOaid(final Context context, final OaidCallback oaidCallback) {
        Object[] objArr = {context, oaidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "136e7c350dfd480a6cd1ce9995e7b341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "136e7c350dfd480a6cd1ce9995e7b341");
        } else if (!this.mUpdated.get()) {
            if (context == null || oaidCallback == null) {
                return;
            }
            final Context applicationContext = context.getApplicationContext();
            try {
                this.mListeners.add(oaidCallback);
                if (OneIdPrivacyHelper.isPrivacyMode(context)) {
                    return;
                }
                this.mASyncThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.oaid.OaidManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffda82c683e1417cb783d9005c9035ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffda82c683e1417cb783d9005c9035ea");
                            return;
                        }
                        if (OaidManager.this.sdkRes != null && OaidManager.this.sdkRes.status && !TextUtils.isEmpty(OaidManager.this.sdkRes.oaid)) {
                            OaidManager.this.mOaid = OaidManager.this.sdkRes.oaid;
                            if (oaidCallback != null) {
                                if (oaidCallback instanceof OaidCallback2) {
                                    LogUtils.i("OneIdHelper", "callback2 cache");
                                    ((OaidCallback2) oaidCallback).onSuccuss(OaidManager.mChanged, OaidManager.this.sdkRes.oaid, OaidManager.this.sdkRes.isLimitAdTrackingEnabled, Source.SYSTEM);
                                } else if (oaidCallback instanceof OaidCallback) {
                                    oaidCallback.onSuccuss(OaidManager.mChanged, OaidManager.this.sdkRes.oaid, OaidManager.this.sdkRes.isLimitAdTrackingEnabled);
                                }
                            }
                        }
                        OaidManager.this.mLock.lock();
                        MonitorManager.addEvent("oaid", 0, true, (JSONObject) null);
                        try {
                            if (OaidManager.this.mIsRunning.compareAndSet(false, true)) {
                                LogUtils.i("oaidmanager", "async RouteSelector selectProvider ");
                                AbstractProvider selectProvider = RouteSelector.selectProvider(applicationContext);
                                if (selectProvider != null && selectProvider.isOaidSupported(applicationContext)) {
                                    LogUtils.i("oaidmanager", "async provider.getOaid ");
                                    OaidManager.this.sdkRes = selectProvider.getOaid(applicationContext);
                                    OaidManager.this.saveOaid(applicationContext, OaidManager.this.sdkRes);
                                    if (OaidManager.this.sdkRes != null && TextUtils.isEmpty(OaidManager.this.sdkRes.oaid)) {
                                        if (OaidManager.this.sdkRes.isLimitAdTrackingEnabled) {
                                            OaidManager.this.saveOaidStatus(applicationContext, 500);
                                        } else if (AbstractProvider.fail_cause_api_null.equals(OaidManager.this.sdkRes.cause)) {
                                            OaidManager.this.saveOaidStatus(applicationContext, 200);
                                        } else if (AbstractProvider.fail_cause_api_exception.equals(OaidManager.this.sdkRes.cause)) {
                                            OaidManager.this.saveOaidStatus(applicationContext, 600);
                                        }
                                    }
                                } else {
                                    if (selectProvider == null || (selectProvider != null && selectProvider.isOaidSupported(applicationContext))) {
                                        OaidManager.this.saveOaidStatus(applicationContext, 400);
                                    }
                                    LogUtils.i("oaidmanager", "async provider route selector, but no suitable provider");
                                }
                                OaidManager.this.mIsRunning.set(false);
                                OaidManager.this.mUpdated.compareAndSet(false, true);
                                OaidManager.this.callback(context, OaidManager.this.sdkRes);
                                MonitorManager.addEvent("oaid", 0, false, OaidManager.this.getOaidMsgJSONObject(OaidManager.this.sdkRes, OaidManager.this.mUpdated.get()));
                            }
                        } finally {
                            OaidManager.this.mCondition.signalAll();
                            OaidManager.this.mLock.unlock();
                        }
                    }
                });
            } finally {
                this.mIsRunning.set(false);
            }
        } else if (this.sdkRes != null && this.sdkRes.status) {
            LogUtils.i("oaidmanager", "mUpdated: sdkRes :status" + this.sdkRes.status + "- oaid:" + this.sdkRes.oaid + " isLimitAdTrackingEnabled:" + this.sdkRes.isLimitAdTrackingEnabled);
            if (!TextUtils.isEmpty(this.sdkRes.oaid)) {
                this.mOaid = this.sdkRes.oaid;
                if (oaidCallback != null) {
                    if (oaidCallback instanceof OaidCallback2) {
                        ((OaidCallback2) oaidCallback).onSuccuss(mChanged, this.sdkRes.oaid, this.sdkRes.isLimitAdTrackingEnabled, Source.SYSTEM);
                        return;
                    } else if (oaidCallback instanceof OaidCallback) {
                        oaidCallback.onSuccuss(mChanged, this.sdkRes.oaid, this.sdkRes.isLimitAdTrackingEnabled);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            MonitorManager.addEvent("oaid", 0, true, (JSONObject) null);
            getOaidCallbackFromLocal(context, this.sdkRes, oaidCallback);
            MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
        } else {
            MonitorManager.addEvent("oaid", 0, true, (JSONObject) null);
            getOaidCallbackFromLocal(context, this.sdkRes, oaidCallback);
            MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject getOaidMsgJSONObject(BaseResponse baseResponse, boolean z) {
        Object[] objArr = {baseResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cdd2bc99073ba8f16a71808bfcc731a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cdd2bc99073ba8f16a71808bfcc731a");
        }
        JSONObject jSONObject = new JSONObject();
        if (baseResponse != null) {
            try {
                jSONObject.put("status", baseResponse.status);
                jSONObject.put("tokeno", AESUtils.encrypt(baseResponse.oaid));
                jSONObject.put("isLimitAdTrackingEnabled", baseResponse.isLimitAdTrackingEnabled);
                jSONObject.put("cause", baseResponse.cause);
            } catch (Throwable unused) {
            }
        }
        jSONObject.put("isUpdated", z);
        return jSONObject;
    }

    private JSONObject getOaidMsgJSONObject(BaseResponse baseResponse, boolean z, String str) {
        Object[] objArr = {baseResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f3a2c48c8ba532b0b0cf387fe077b5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f3a2c48c8ba532b0b0cf387fe077b5c");
        }
        JSONObject oaidMsgJSONObject = getOaidMsgJSONObject(baseResponse, z);
        try {
            oaidMsgJSONObject.put("localOaid", str);
        } catch (Throwable unused) {
        }
        return oaidMsgJSONObject;
    }

    @Deprecated
    public String getOaid(Context context) {
        String localOAID;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbeb5c9d41bb683a947b6ec1d65d95da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbeb5c9d41bb683a947b6ec1d65d95da");
        }
        if (OneIdPrivacyHelper.isPrivacyMode(context)) {
            return "";
        }
        if (this.mUpdated.get()) {
            if (this.sdkRes != null && this.sdkRes.status && !TextUtils.isEmpty(this.sdkRes.oaid)) {
                return this.sdkRes.oaid;
            }
            MonitorManager.addEvent("oaid", 0, true, (JSONObject) null);
            String localOAID2 = getLocalOAID(context);
            MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
            return localOAID2;
        }
        MonitorManager.addEvent("oaid", 0, true, (JSONObject) null);
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        try {
            try {
                this.mLock.lock();
                while (this.mIsRunning.get()) {
                    this.mCondition.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!this.mUpdated.get()) {
                if (this.mIsRunning.compareAndSet(false, true)) {
                    AbstractProvider selectProvider = RouteSelector.selectProvider(applicationContext);
                    if (selectProvider != null && selectProvider.isOaidSupported(applicationContext)) {
                        LogUtils.i("oaidmanager", "getOaid from routed provider");
                        this.sdkRes = selectProvider.getOaid(applicationContext);
                        saveOaid(applicationContext, this.sdkRes);
                        this.mUpdated.compareAndSet(false, true);
                        this.mIsRunning.set(false);
                        if (this.sdkRes != null && this.sdkRes.status && !TextUtils.isEmpty(this.sdkRes.oaid)) {
                            LogUtils.i("oaidmanager", "getOaid from routed provider oaid:" + this.sdkRes.oaid);
                            MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
                            localOAID = this.sdkRes.oaid;
                        } else {
                            localOAID = getLocalOAID(context);
                            MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
                        }
                    } else {
                        LogUtils.i("oaidmanager", "async provider route selector, but no suitable provider");
                    }
                }
                return null;
            } else if (this.sdkRes != null && this.sdkRes.status && !TextUtils.isEmpty(this.sdkRes.oaid)) {
                MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
                localOAID = this.sdkRes.oaid;
            } else {
                localOAID = getLocalOAID(context);
                MonitorManager.addEvent("oaid", 0, false, getOaidMsgJSONObject(this.sdkRes, this.mUpdated.get()));
            }
            return localOAID;
        } finally {
            this.mIsRunning.set(false);
            this.mCondition.signalAll();
            this.mLock.unlock();
        }
    }

    private void getOaidCallbackFromLocal(Context context, BaseResponse baseResponse, OaidCallback oaidCallback) {
        Object[] objArr = {context, baseResponse, oaidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ff587e8e43bb8aa90cf799fde02f887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ff587e8e43bb8aa90cf799fde02f887");
            return;
        }
        String localOAID = getLocalOAID(context);
        if (!TextUtils.isEmpty(localOAID)) {
            if (oaidCallback != null) {
                if (oaidCallback instanceof OaidCallback2) {
                    ((OaidCallback2) oaidCallback).onSuccuss(false, localOAID, baseResponse != null ? baseResponse.isLimitAdTrackingEnabled : false, Source.FILE);
                } else if (oaidCallback instanceof OaidCallback) {
                    oaidCallback.onSuccuss(false, localOAID, baseResponse != null ? baseResponse.isLimitAdTrackingEnabled : false);
                }
            }
        } else if (baseResponse == null || !baseResponse.status) {
            if (oaidCallback != null) {
                oaidCallback.onFail((baseResponse == null || TextUtils.isEmpty(baseResponse.cause)) ? "get oaid exception" : baseResponse.cause);
            }
        } else if (oaidCallback != null) {
            if (oaidCallback instanceof OaidCallback2) {
                ((OaidCallback2) oaidCallback).onSuccuss(false, "", baseResponse != null ? baseResponse.isLimitAdTrackingEnabled : false, Source.SYSTEM);
            } else if (oaidCallback instanceof OaidCallback) {
                oaidCallback.onSuccuss(false, "", baseResponse != null ? baseResponse.isLimitAdTrackingEnabled : false);
            }
        }
    }

    public synchronized void registerListener(OaidCallback oaidCallback) {
        Object[] objArr = {oaidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5657f902da563cc067bf25f89249f417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5657f902da563cc067bf25f89249f417");
            return;
        }
        if (this.mListeners != null) {
            this.mListeners.add(oaidCallback);
        }
    }

    public synchronized boolean unRegisterListener(OaidCallback oaidCallback) {
        Object[] objArr = {oaidCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dfd8d16a62cf2e3901913cca15a71e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dfd8d16a62cf2e3901913cca15a71e9")).booleanValue();
        } else if (this.mListeners == null || this.mListeners.size() <= 0 || !this.mListeners.contains(oaidCallback)) {
            return true;
        } else {
            return this.mListeners.remove(oaidCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callback(Context context, BaseResponse baseResponse) {
        Object[] objArr = {context, baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d35199c7434fb928d0933dbd8472587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d35199c7434fb928d0933dbd8472587");
        } else if (this.mListeners != null && this.mListeners.size() != 0) {
            try {
                for (OaidCallback oaidCallback : this.mListeners) {
                    if (oaidCallback != null) {
                        if (baseResponse != null) {
                            if (baseResponse.status && !TextUtils.isEmpty(baseResponse.oaid)) {
                                this.mOaid = baseResponse.oaid;
                                if (oaidCallback instanceof OaidCallback2) {
                                    ((OaidCallback2) oaidCallback).onSuccuss(mChanged, baseResponse.oaid, baseResponse.isLimitAdTrackingEnabled, Source.SYSTEM);
                                } else if (oaidCallback instanceof OaidCallback) {
                                    oaidCallback.onSuccuss(mChanged, baseResponse.oaid, baseResponse.isLimitAdTrackingEnabled);
                                }
                            } else {
                                getOaidCallbackFromLocal(context, baseResponse, oaidCallback);
                            }
                        } else {
                            getOaidCallbackFromLocal(context, baseResponse, oaidCallback);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            this.mListeners.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveOaidStatus(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f47f113b6be709fe3cfe63700e35d5cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f47f113b6be709fe3cfe63700e35d5cd");
        } else {
            Utils.setLocalOaidStatus(context, i);
        }
    }

    private int getOaidStatus(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6884528bf8dc21d57e153f75cc4376b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6884528bf8dc21d57e153f75cc4376b4")).intValue() : Utils.getLocalOaidStatus(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveOaid(Context context, BaseResponse baseResponse) {
        Object[] objArr = {context, baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98e1f6e12953cc207dfc999f774530db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98e1f6e12953cc207dfc999f774530db");
            return;
        }
        if (baseResponse != null && baseResponse.status && !TextUtils.isEmpty(baseResponse.oaid)) {
            this.mOaid = baseResponse.oaid;
        }
        saveToSp(context, baseResponse);
        OneIdSharePref.getInstance(context).saveDeviceInfoCallTimes(OAIDCALLTIMES, OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(OAIDCALLTIMES) + 1);
    }

    private void saveToSp(Context context, BaseResponse baseResponse) {
        Object[] objArr = {context, baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38ce59e8f7542b1c701e372c20e8dd5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38ce59e8f7542b1c701e372c20e8dd5f");
        } else if (baseResponse == null || !baseResponse.status || TextUtils.isEmpty(baseResponse.oaid)) {
        } else {
            String localOaid = Utils.getLocalOaid(context);
            if (TextUtils.isEmpty(localOaid) || !baseResponse.oaid.equals(localOaid)) {
                mChanged = true;
                Utils.setLocalOaid(context, baseResponse.oaid);
            }
        }
    }

    public int getOaidCallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2392763bb806f698aa0e987e2294a950", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2392763bb806f698aa0e987e2294a950")).intValue();
        }
        if (context == null) {
            return 0;
        }
        return OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(OAIDCALLTIMES);
    }
}
