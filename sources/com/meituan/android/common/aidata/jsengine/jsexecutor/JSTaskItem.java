package com.meituan.android.common.aidata.jsengine.jsexecutor;

import com.meituan.android.common.aidata.jsengine.utils.IJSCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSTaskItem implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IJSCallback mJSCallback;
    private String mJSFrameworkId;
    private Runnable mRunnable;
    private long mStartTime;
    private TaskStatus mStatus;
    private String mTaskId;
    private long mTimeOut;

    public JSTaskItem(String str, Runnable runnable, IJSCallback iJSCallback, long j, String str2) {
        Object[] objArr = {str, runnable, iJSCallback, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a74c7a38437a09d524882b626df78fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a74c7a38437a09d524882b626df78fe");
            return;
        }
        this.mStatus = TaskStatus.STATUS_INIT;
        this.mTaskId = str;
        this.mRunnable = runnable;
        this.mJSCallback = iJSCallback;
        this.mStartTime = System.currentTimeMillis();
        this.mTimeOut = j;
        this.mJSFrameworkId = str2;
    }

    public String getJSFrameworkId() {
        return this.mJSFrameworkId;
    }

    public boolean isTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "355f6dc918e29c47f6feeb20b22b4e28", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "355f6dc918e29c47f6feeb20b22b4e28")).booleanValue() : System.currentTimeMillis() - this.mStartTime > this.mTimeOut;
    }

    public IJSCallback getJSCallback() {
        return this.mJSCallback;
    }

    public String getTaskId() {
        return this.mTaskId;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2aeafb6390be39a422b49f5252736af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2aeafb6390be39a422b49f5252736af");
        } else if (this.mRunnable != null) {
            onRun();
            this.mRunnable.run();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public IJSCallback mJSCallback;
        private String mJSFrameworkId;
        public Runnable mRunnable;
        public String mTaskId;
        public long mTimeOut;

        public Builder setTaskId(String str) {
            this.mTaskId = str;
            return this;
        }

        public Builder setTimeOut(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc5585ec72c89b8187fb150884de9510", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc5585ec72c89b8187fb150884de9510");
            }
            this.mTimeOut = j;
            return this;
        }

        public Builder setIJSCallback(IJSCallback iJSCallback) {
            this.mJSCallback = iJSCallback;
            return this;
        }

        public Builder setTask(Runnable runnable) {
            this.mRunnable = runnable;
            return this;
        }

        public Builder setJSFrameworkId(String str) {
            this.mJSFrameworkId = str;
            return this;
        }

        public JSTaskItem build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d795c13630f9ad953b72a6371b06f0e", RobustBitConfig.DEFAULT_VALUE) ? (JSTaskItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d795c13630f9ad953b72a6371b06f0e") : new JSTaskItem(this.mTaskId, this.mRunnable, this.mJSCallback, this.mTimeOut, this.mJSFrameworkId);
        }
    }

    public TaskStatus getStatus() {
        return this.mStatus;
    }

    public void onWaiting() {
        this.mStatus = TaskStatus.STATUS_WAITING;
    }

    public void onPrepare() {
        this.mStatus = TaskStatus.STATUS_PREPARE;
    }

    public void onRun() {
        this.mStatus = TaskStatus.STATUS_RUNNING;
    }

    public void onResult(String str) {
        this.mStatus = TaskStatus.STATUS_RESULT;
    }

    public void onEnd(String str) {
        this.mStatus = TaskStatus.STATUS_END;
    }
}
