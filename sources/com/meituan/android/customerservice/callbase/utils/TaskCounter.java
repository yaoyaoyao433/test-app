package com.meituan.android.customerservice.callbase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TaskCounter {
    private static final String TAG = "TaskCounter";
    private static final int TEST_STATISTICS_INTERVAL = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int count;
    private String counterName;
    private int currMaxCount;
    private long lastPrintTime;
    private int maxCount;

    public TaskCounter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7c5bb0af6da20c426b2b1076cda28c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7c5bb0af6da20c426b2b1076cda28c3");
        } else {
            this.counterName = str;
        }
    }

    public synchronized void add() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c1dcceee7a6760ce702e13ed24715f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c1dcceee7a6760ce702e13ed24715f2");
        } else if (this.count < 0) {
            CallLog.error(TAG, "TaskCounter add error, name = " + this.counterName + " ,count = " + this.count);
        } else {
            this.count++;
            if (this.count > this.currMaxCount) {
                this.currMaxCount = this.count;
            }
            statistic();
        }
    }

    public synchronized void sub() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f4c3ff4e0f51cdaa7cdd56c52a7c9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f4c3ff4e0f51cdaa7cdd56c52a7c9d4");
        } else if (this.count <= 0) {
            CallLog.error(TAG, "TaskCounter sub error, name = " + this.counterName + " ,count = " + this.count);
        } else {
            this.count--;
            statistic();
        }
    }

    public synchronized void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a50da10d0fd9890b5758eb954a2a4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a50da10d0fd9890b5758eb954a2a4cd");
            return;
        }
        statistic();
        this.count = 0;
        this.currMaxCount = 0;
        this.lastPrintTime = 0L;
        CallLog.log(TAG, "TaskCounter reset, name = " + this.counterName);
    }

    public String getName() {
        return this.counterName;
    }

    public int getCount() {
        return this.count;
    }

    private void statistic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "913a0d6d3760cd526cfafc1c21be5555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "913a0d6d3760cd526cfafc1c21be5555");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.lastPrintTime == 0 || currentTimeMillis - this.lastPrintTime > 1000) {
            this.lastPrintTime = currentTimeMillis;
            if (this.currMaxCount > this.maxCount) {
                this.maxCount = this.currMaxCount;
            }
            this.currMaxCount = 0;
        }
    }
}
