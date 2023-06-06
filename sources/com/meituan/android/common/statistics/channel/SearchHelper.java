package com.meituan.android.common.statistics.channel;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SearchHelper {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static long defaultWaitTimeout = 5000;
    private static long maxWaitTimeout = 30000;
    private static volatile SearchHelper singleton;
    public Future<?> mFuture;
    private final ScheduledExecutorService mThreadExecutor;
    private Runnable mTimeoutRunnable;
    private static Lock lock = new ReentrantLock();
    private static ArrayDeque<CacheItem> cacheList = new ArrayDeque<>();

    public static SearchHelper getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8aa5e35d88095c0606d654463c5fb281", 6917529027641081856L)) {
            return (SearchHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8aa5e35d88095c0606d654463c5fb281");
        }
        if (singleton == null) {
            synchronized (SearchHelper.class) {
                if (singleton == null) {
                    singleton = new SearchHelper();
                }
            }
        }
        return singleton;
    }

    public SearchHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6df7ab9c82365aea66183eb4b2a2b81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6df7ab9c82365aea66183eb4b2a2b81");
            return;
        }
        this.mThreadExecutor = c.b("Statistics-SearchHelper", 1);
        this.mFuture = null;
        this.mTimeoutRunnable = null;
    }

    public void cacheEventInfo(Context context, CacheItem cacheItem) {
        Object[] objArr = {context, cacheItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88f4708bfe899798e34732b6d781328f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88f4708bfe899798e34732b6d781328f");
            return;
        }
        lock.lock();
        try {
            try {
                cacheList.add(cacheItem);
                setTimeout(context);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            lock.unlock();
        }
    }

    public Queue<CacheItem> getCacheEventList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dde017292ea8520ed6f1f31b81019194", 6917529027641081856L)) {
            return (Queue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dde017292ea8520ed6f1f31b81019194");
        }
        if (cacheList == null || cacheList.size() <= 0) {
            return null;
        }
        lock.lock();
        try {
            clearTimeout();
            ArrayDeque<CacheItem> clone = cacheList.clone();
            cacheList.clear();
            return clone;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return null;
            } finally {
                lock.unlock();
            }
        }
    }

    private void setTimeout(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61c1289e41ac23e47ba4ed8fa36f6476", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61c1289e41ac23e47ba4ed8fa36f6476");
            return;
        }
        try {
            if (this.mTimeoutRunnable == null) {
                this.mTimeoutRunnable = new Runnable() { // from class: com.meituan.android.common.statistics.channel.SearchHelper.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b437e4b1e4d9d5468c5d46ec3c3ab7af", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b437e4b1e4d9d5468c5d46ec3c3ab7af");
                            return;
                        }
                        Queue<CacheItem> cacheEventList = SearchHelper.getInstance().getCacheEventList();
                        if (Statistics.getChannel() != null) {
                            Statistics.getChannel().reportCacheEventListAfterPv(cacheEventList, null, true);
                        }
                    }
                };
                this.mFuture = this.mThreadExecutor.schedule(this.mTimeoutRunnable, getWaitTimeout(context), TimeUnit.MILLISECONDS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "061be759c31e8d45e5b50604641b6074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "061be759c31e8d45e5b50604641b6074");
            return;
        }
        try {
            if (this.mFuture == null || this.mFuture.isCancelled()) {
                return;
            }
            this.mFuture.cancel(false);
            this.mTimeoutRunnable = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class CacheItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map environment;
        public JSONObject eventInfo;
        public EventLevel eventLevel;

        public CacheItem(EventLevel eventLevel, JSONObject jSONObject, Map<String, String> map) {
            Object[] objArr = {eventLevel, jSONObject, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "398f2541816b728c17e32078f5b6c32c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "398f2541816b728c17e32078f5b6c32c");
                return;
            }
            this.eventLevel = eventLevel;
            this.eventInfo = jSONObject;
            this.environment = map;
        }

        public final boolean compare(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1316c23a09d8062b6c200ecece01c3ef", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1316c23a09d8062b6c200ecece01c3ef")).booleanValue();
            }
            if (this.eventInfo != null && jSONObject != null) {
                String optString = this.eventInfo.optString("page_info_key");
                String optString2 = this.eventInfo.optString("val_cid");
                String optString3 = jSONObject.optString("page_info_key");
                String optString4 = jSONObject.optString("val_cid");
                if ((!TextUtils.isEmpty(optString) && optString.equals(optString3)) || (!TextUtils.isEmpty(optString2) && optString2.equals(optString4))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static long getWaitTimeout(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5458219f4f35863faf09daa6f7af01a", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5458219f4f35863faf09daa6f7af01a")).longValue();
        }
        long waitPvTimeout = ConfigManager.getInstance(context).waitPvTimeout();
        return (waitPvTimeout < 0 || waitPvTimeout > maxWaitTimeout) ? defaultWaitTimeout : waitPvTimeout;
    }
}
