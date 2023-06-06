package com.meituan.android.common.statistics.dispatcher;

import android.os.Process;
import android.os.SystemClock;
import com.meituan.android.common.aidata.BuildConfig;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.gesture.GestureManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EventManager {
    private static final String THREAD_TAG = "LXSDK-";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile EventManager singleton;
    private List<CachedEvent> cachedEventList;
    private long firstCacheTm;
    private long initTimeStamp;
    private int lostCacheNum;
    private final ExecutorService mDispatchThreadExecutor;
    private ConcurrentHashMap<IEventCallback, Client> mListeners;

    public static EventManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8f2cb13f89efcc43cdfe3b3d55d2e1a", 6917529027641081856L)) {
            return (EventManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8f2cb13f89efcc43cdfe3b3d55d2e1a");
        }
        if (singleton == null) {
            synchronized (EventManager.class) {
                if (singleton == null) {
                    singleton = new EventManager();
                }
            }
        }
        return singleton;
    }

    public EventManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39ea1170fe2c60dcc37daa6868b7f324", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39ea1170fe2c60dcc37daa6868b7f324");
            return;
        }
        this.mDispatchThreadExecutor = c.a("LXSDK-DispatchManger");
        init();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3805f8c9043bbea1c7e40e307568d138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3805f8c9043bbea1c7e40e307568d138");
            return;
        }
        this.mListeners = new ConcurrentHashMap<>();
        this.cachedEventList = Collections.synchronizedList(new ArrayList());
        this.initTimeStamp = SystemClock.elapsedRealtime();
    }

    public synchronized void subscribeData(FilterConfig filterConfig, IEventCallback iEventCallback) {
        Object[] objArr = {filterConfig, iEventCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec8958bc48bae4d1c14f9ecf9c732e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec8958bc48bae4d1c14f9ecf9c732e7");
            return;
        }
        if (iEventCallback != null && this.mListeners != null) {
            this.mListeners.put(iEventCallback, new Client(filterConfig, iEventCallback));
        }
        if (iEventCallback != null && iEventCallback.getClass().getName().contains(BuildConfig.APPLICATION_ID)) {
            processTimeout();
            processCacheEvent();
        }
    }

    public synchronized boolean unsubscribeData(IEventCallback iEventCallback) {
        Object[] objArr = {iEventCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e4d858c02148d4e4a1a588f0055c24c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e4d858c02148d4e4a1a588f0055c24c")).booleanValue();
        }
        if (this.mListeners != null && this.mListeners.size() > 0 && this.mListeners.containsKey(iEventCallback)) {
            this.mListeners.remove(iEventCallback);
        }
        return true;
    }

    public synchronized void dispatchData(String str, EventLevel eventLevel, Map<String, String> map, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object[] objArr = {str, eventLevel, map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06932ce7c15cbab02c90c16bdf599ef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06932ce7c15cbab02c90c16bdf599ef5");
            return;
        }
        try {
            LogUtil.log("EventManager.dispatchData(), mListeners size: " + this.mListeners.size() + ", processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
            if (map == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = new JSONObject(map);
            }
            jSONObject2.put("category", str);
            jSONObject2.put("evs", new JSONObject(jSONObject.toString()));
            if (this.mListeners == null) {
                return;
            }
            if (needWaitInit()) {
                cacheEvents(str, jSONObject2);
            } else {
                processCacheEvent();
                LogUtil.log("EventManager.dispatchData(), normal post, processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
                post(str, jSONObject2);
            }
            processTimeout();
        } catch (Exception unused) {
        }
    }

    private void processCacheEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fce208b92f829e0f9d25f7e6c29bd7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fce208b92f829e0f9d25f7e6c29bd7f");
        } else if (this.cachedEventList != null) {
            LogUtil.log("EventManager.dispatchData(), cachedEventList size: " + this.cachedEventList.size() + ", processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
            for (CachedEvent cachedEvent : this.cachedEventList) {
                LogUtil.log("EventManager.dispatchData(), for loop post, processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
                try {
                    post(cachedEvent.channel, cachedEvent.event);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (this.lostCacheNum > 0) {
                CatMonitorManager.getInstance().reportLoss(getCatExtra(this.cachedEventList.size()));
                this.firstCacheTm = 0L;
                this.lostCacheNum = 0;
            }
            this.cachedEventList = null;
            this.initTimeStamp = 0L;
        }
    }

    private void processTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01694140ae3aefa7a7cb5bb80b052f2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01694140ae3aefa7a7cb5bb80b052f2d");
        } else if (this.cachedEventList == null || SystemClock.elapsedRealtime() - this.initTimeStamp <= 120000) {
        } else {
            LogUtil.log("EventManager.dispatchData(), exceed 120 seconds !");
            CatMonitorManager.getInstance().reportTimeout(getCatExtra(this.cachedEventList.size()));
            this.firstCacheTm = 0L;
            this.lostCacheNum = 0;
            this.cachedEventList = null;
            this.initTimeStamp = 0L;
        }
    }

    private boolean needWaitInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97d0f48f1c0e9cbf08164666f0aab69a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97d0f48f1c0e9cbf08164666f0aab69a")).booleanValue();
        }
        if (this.cachedEventList == null) {
            LogUtil.log("EventManager.needWaitInit(), cachedEventList == null, processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
            return false;
        }
        try {
            Class.forName("com.meituan.android.common.aidata.AIData");
            LogUtil.log("EventManager.needWaitInit(), com.meituan.android.common.aidata.AIData exists !");
            if (this.mListeners != null) {
                if (this.mListeners.size() > 0) {
                    for (Map.Entry<IEventCallback, Client> entry : this.mListeners.entrySet()) {
                        if (entry.getKey().getClass().getName().contains(BuildConfig.APPLICATION_ID)) {
                            return false;
                        }
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            LogUtil.log("EventManager.needWaitInit(), com.meituan.android.common.aidata.AIData not exists !");
            return false;
        }
    }

    private void post(final String str, final JSONObject jSONObject) throws JSONException {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed4c79629f6a02c345ff92af475b608d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed4c79629f6a02c345ff92af475b608d");
            return;
        }
        LogUtil.log("EventManager.post(), nm: " + jSONObject.optString("nm") + ", processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
        this.mDispatchThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.dispatcher.EventManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dbb11de28ee861ca29af159d7e5fd785", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dbb11de28ee861ca29af159d7e5fd785");
                    return;
                }
                LogUtil.log("EventManager.post() mDispatchThreadExecutor post()  nm: " + jSONObject.optString("nm") + ", processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
                if (EventManager.this.mListeners == null || EventManager.this.mListeners.size() <= 0) {
                    return;
                }
                for (Map.Entry entry : EventManager.this.mListeners.entrySet()) {
                    Client client = (Client) entry.getValue();
                    if (client == null || client.mFilter == null || client.mFilter.filter(str, jSONObject)) {
                        IEventCallback iEventCallback = (IEventCallback) entry.getKey();
                        if (iEventCallback != null) {
                            if (!SpecifiedEventConfig.getInstance().isGestureSpecified(jSONObject)) {
                                iEventCallback.onEvent(jSONObject);
                            } else if (iEventCallback instanceof GestureManager) {
                                iEventCallback.onEvent(jSONObject);
                            }
                        }
                    }
                }
            }
        });
    }

    private void cacheEvents(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02fbaae4f3928d1600ce04ccf11dedfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02fbaae4f3928d1600ce04ccf11dedfd");
        } else if (this.cachedEventList != null) {
            if (this.cachedEventList.size() == 0) {
                this.firstCacheTm = System.currentTimeMillis();
            }
            ConfigManager configManager = ConfigManager.getInstance(Statistics.getContext());
            LogUtil.log("EventManager.cacheEvents(), cache size: " + this.cachedEventList.size() + ", size limit: " + configManager.getBlueCacheCountLimit());
            LogUtil.log("EventManager.cacheEvents(), cache time: " + (SystemClock.elapsedRealtime() - this.initTimeStamp) + ", time limit:" + configManager.getBlueCacheTimeout());
            if (this.cachedEventList.size() < configManager.getBlueCacheCountLimit() && SystemClock.elapsedRealtime() - this.initTimeStamp < configManager.getBlueCacheTimeout()) {
                this.cachedEventList.add(new CachedEvent(str, jSONObject));
                LogUtil.log("EventManager.cacheEvents(),  nm: " + jSONObject.optString("nm") + ", add, cache size: " + this.cachedEventList.size() + ", cache time: " + (SystemClock.elapsedRealtime() - this.initTimeStamp) + ", processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
                return;
            }
            this.lostCacheNum++;
            LogUtil.log("EventManager.cacheEvents(), ignore, cache size: " + this.cachedEventList.size() + ", cache time: " + (SystemClock.elapsedRealtime() - this.initTimeStamp) + ", ignore size: " + this.lostCacheNum + ", processId: " + Process.myPid() + ", threadId: " + Thread.currentThread().getId());
        }
    }

    private String getCatExtra(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13bce63a4bda5f3afea6073837b4f1ac", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13bce63a4bda5f3afea6073837b4f1ac");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("first_cache_tm", this.firstCacheTm);
            jSONObject.put("tm", System.currentTimeMillis());
            jSONObject.put("max_cache_num", ConfigManager.getInstance(Statistics.getContext()).getBlueCacheCountLimit());
            jSONObject.put("cache_num", i);
            jSONObject.put("lost_cache_num", this.lostCacheNum);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Client {
        public static ChangeQuickRedirect changeQuickRedirect;
        public IEventCallback mCallback;
        public FilterConfig mFilter;

        public Client(FilterConfig filterConfig, IEventCallback iEventCallback) {
            this.mFilter = filterConfig;
            this.mCallback = iEventCallback;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class CachedEvent {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String channel;
        public JSONObject event;

        public CachedEvent(String str, JSONObject jSONObject) {
            this.channel = str;
            this.event = jSONObject;
        }
    }
}
