package com.meituan.android.common.aidata.resources.manager;

import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EventDataCacheManager {
    public static final int CACHE_DEFAULT_NUM = 400;
    private static final int CACHE_MAX_NUM = 700;
    private static final long TIMEOUT_MILLIS = 60000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile EventDataCacheManager mInstance;
    private int mCacheMaxNum;
    private ArrayList<EventData> mCacheQueue;
    private final Set<String> mHasProcessedCacheBundleSet;
    private boolean mIsValid;

    public EventDataCacheManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc4ebf03cc1116d40685d5ee440d711f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc4ebf03cc1116d40685d5ee440d711f");
            return;
        }
        this.mCacheQueue = new ArrayList<>();
        this.mHasProcessedCacheBundleSet = new HashSet();
        this.mCacheMaxNum = 400;
        init();
    }

    public static EventDataCacheManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "343f260824cdb267ec7ee0861fd6ecdb", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventDataCacheManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "343f260824cdb267ec7ee0861fd6ecdb");
        }
        if (mInstance == null) {
            synchronized (EventDataCacheManager.class) {
                if (mInstance == null) {
                    mInstance = new EventDataCacheManager();
                }
            }
        }
        return mInstance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0ea3b1f138ea195abcb029305730fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0ea3b1f138ea195abcb029305730fa3");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(EventDataCacheManager.class.getSimpleName());
        sb.append(", cache init");
        this.mIsValid = true;
        c.c("aidata_receive_lx_data").schedule(new Runnable() { // from class: com.meituan.android.common.aidata.resources.manager.EventDataCacheManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c2420346f60a212d29a3833cc7ae2642", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c2420346f60a212d29a3833cc7ae2642");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(EventDataCacheManager.class.getSimpleName());
                sb2.append(", cache timeout");
                EventDataCacheManager.this.mIsValid = false;
                synchronized (EventDataCacheManager.this) {
                    EventDataCacheManager.this.mCacheQueue.clear();
                }
                EventDataCacheManager.this.mHasProcessedCacheBundleSet.clear();
            }
        }, 60000L, TimeUnit.MILLISECONDS);
    }

    public synchronized void cacheEvent(EventData eventData) {
        Object[] objArr = {eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26276c89738b16710ceba69b3c963009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26276c89738b16710ceba69b3c963009");
            return;
        }
        if (LogUtil.isLogEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append(EventDataCacheManager.class.getSimpleName());
            sb.append(", cacheEvent mIsValid=");
            sb.append(this.mIsValid);
            sb.append(", current event num=");
            sb.append(this.mCacheQueue.size());
            sb.append(", cache max num=");
            sb.append(this.mCacheMaxNum);
        }
        if (this.mIsValid && this.mCacheQueue.size() < this.mCacheMaxNum) {
            this.mCacheQueue.add(eventData);
        }
    }

    public List<EventData> getCacheQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "becb4322f5133cea93dd1a9b231bdfdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "becb4322f5133cea93dd1a9b231bdfdf");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(EventDataCacheManager.class.getSimpleName());
        sb.append(",getCacheQueue mIsValid=");
        sb.append(this.mIsValid);
        return this.mCacheQueue;
    }

    public boolean isValid() {
        return this.mIsValid;
    }

    public Set<String> getHasProcessedCacheBundles() {
        return this.mHasProcessedCacheBundleSet;
    }

    public boolean hasProcessedCacheBundles(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28bb45164c9f092050e82dd58cc4ae23", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28bb45164c9f092050e82dd58cc4ae23")).booleanValue() : !TextUtils.isEmpty(str) && this.mHasProcessedCacheBundleSet.contains(str);
    }

    public void addHasProcessedCacheBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "229aa117a68e481c232cd6dc70a619a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "229aa117a68e481c232cd6dc70a619a8");
        } else {
            this.mHasProcessedCacheBundleSet.add(str);
        }
    }

    public void setCacheMaxNum(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27aa0304e1d41fb1be8819c7d2e57ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27aa0304e1d41fb1be8819c7d2e57ea");
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        if (i > 700) {
            i = 700;
        }
        this.mCacheMaxNum = i;
    }
}
