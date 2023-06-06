package com.meituan.android.common.statistics.flowmanager.client;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HighFlowBidManager {
    private static final int DEFAULT_MAX_SUM = 1000;
    private static final int DEFAULT_SCHEDULED_TIME = 10000;
    private static final String TAG = "HighFlowBidManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, Integer> mBidMap;
    private Map<String, Integer> mBlackMap;
    private JSONArray mMMPBlackJsonArray;
    private int mMaxSum;
    private ScheduledFuture<?> mScheduledFuture;
    private int mScheduledTime;
    private ScheduledExecutorService mUrgentEventExecutor;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HighFlowBidManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static HighFlowBidManager highFlowBidManager = new HighFlowBidManager();
    }

    public HighFlowBidManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bdecf0f682ec00e7c293dc22172c4c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bdecf0f682ec00e7c293dc22172c4c1");
            return;
        }
        this.mMaxSum = 1000;
        this.mScheduledTime = 10000;
        this.mBidMap = new ConcurrentHashMap();
        this.mBlackMap = new ConcurrentHashMap();
        this.mUrgentEventExecutor = c.b("Statistics-FixedSchedule", 1);
    }

    public static HighFlowBidManager getInstance() {
        return HighFlowBidManagerHolder.highFlowBidManager;
    }

    private void checkHornHighFlowLimitParam(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f8343070c39a919ad777f1a7fd1c48c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f8343070c39a919ad777f1a7fd1c48c");
        } else if (context == null) {
            LogUtil.log(TAG, "checkHornHighFlowLimitParam() context is null");
            LogUtil.log(TAG, "scheduled time : " + this.mScheduledTime);
            LogUtil.log(TAG, "max sum        : " + this.mMaxSum);
        } else {
            this.mScheduledTime = ConfigManager.getInstance(context).getHighFlowLimitTime() * 1000;
            this.mMaxSum = ConfigManager.getInstance(context).getHighFlowLimitMax();
            if (this.mScheduledTime <= 0) {
                this.mScheduledTime = 10000;
            }
            if (this.mMaxSum <= 0) {
                this.mMaxSum = 1000;
            }
            LogUtil.log(TAG, "scheduled time : " + this.mScheduledTime);
            LogUtil.log(TAG, "max sum        : " + this.mMaxSum);
        }
    }

    public void startCheck(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20aa435ad177fc8e90d5e8eb18937d4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20aa435ad177fc8e90d5e8eb18937d4d");
            return;
        }
        LogUtil.log(TAG, "start check");
        checkHornHighFlowLimitParam(context);
        this.mScheduledFuture = this.mUrgentEventExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.android.common.statistics.flowmanager.client.HighFlowBidManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f811702346cc000a6e68a6310c233ef3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f811702346cc000a6e68a6310c233ef3");
                } else if (HighFlowBidManager.this.mBidMap != null && !HighFlowBidManager.this.mBidMap.isEmpty()) {
                    LogUtil.log(HighFlowBidManager.TAG, "bidMap= " + HighFlowBidManager.this.mBidMap.toString());
                    LogUtil.log(HighFlowBidManager.TAG, "blackMap= " + HighFlowBidManager.this.mBlackMap.toString());
                    LogUtil.log(HighFlowBidManager.TAG, "bidMap   size= " + HighFlowBidManager.this.mBidMap.size());
                    LogUtil.log(HighFlowBidManager.TAG, "blackMap size= " + HighFlowBidManager.this.mBlackMap.size());
                    for (Map.Entry entry : HighFlowBidManager.this.mBidMap.entrySet()) {
                        if (entry != null) {
                            if (((Integer) entry.getValue()).intValue() > HighFlowBidManager.this.mMaxSum) {
                                HighFlowBidManager.this.mBlackMap.put(entry.getKey(), 0);
                                HighFlowBidManager.this.mBidMap.remove(entry.getKey());
                            } else {
                                HighFlowBidManager.this.mBidMap.put(entry.getKey(), 0);
                            }
                        }
                    }
                }
            }
        }, 0L, this.mScheduledTime, TimeUnit.MILLISECONDS);
    }

    public void stopCheck() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fafa63d85508565844c5115ecef4318e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fafa63d85508565844c5115ecef4318e");
            return;
        }
        LogUtil.log(TAG, "stop check");
        if (this.mScheduledFuture == null || this.mScheduledFuture.isCancelled()) {
            return;
        }
        this.mScheduledFuture.cancel(true);
    }

    public boolean collectBid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf4e25b88d13dfd47fa7ef2ba3830854", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf4e25b88d13dfd47fa7ef2ba3830854")).booleanValue();
        }
        if (this.mBidMap != null && !TextUtils.isEmpty(str)) {
            if (this.mBlackMap.containsKey(str)) {
                int intValue = this.mBlackMap.get(str).intValue() + 1;
                this.mBlackMap.put(str, Integer.valueOf(intValue));
                LogUtil.log(TAG, "bid = " + str + " is in blacklist, intercept " + intValue);
                return true;
            } else if (this.mBidMap.containsKey(str)) {
                this.mBidMap.put(str, Integer.valueOf(this.mBidMap.get(str).intValue() + 1));
            } else {
                this.mBidMap.put(str, 1);
            }
        }
        return false;
    }

    public Map<String, Integer> getBlackMap() {
        return this.mBlackMap;
    }
}
