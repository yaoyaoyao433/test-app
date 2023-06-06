package com.meituan.android.common.aidata.jsengine.jsexecutor;

import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSTaskQueue {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile JSTaskQueue sInstance = null;
    private static long taskId = 1;
    private LinkedHashMap<String, JSTaskItem> mTaskQueue;
    private volatile ScheduledExecutorService mTimer;

    public JSTaskQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6bc8ed4a3772c4b2237e8c79ca89f74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6bc8ed4a3772c4b2237e8c79ca89f74");
        } else {
            this.mTaskQueue = new LinkedHashMap<>();
        }
    }

    public static JSTaskQueue getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4c6d07a541f02ae56dab1bf24537687", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSTaskQueue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4c6d07a541f02ae56dab1bf24537687");
        }
        if (sInstance == null) {
            synchronized (JSTaskQueue.class) {
                if (sInstance == null) {
                    sInstance = new JSTaskQueue();
                }
            }
        }
        return sInstance;
    }

    public synchronized String enqueueTask(String str, JSTaskItem jSTaskItem) {
        Object[] objArr = {str, jSTaskItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cd20f3f0102e4ca96464678aa2872b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cd20f3f0102e4ca96464678aa2872b2");
        }
        this.mTaskQueue.put(str, jSTaskItem);
        startTimeTaskScheduler();
        return str;
    }

    public synchronized JSTaskItem dequeueTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6de9823e0172d8ded14e71c9fa812e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSTaskItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6de9823e0172d8ded14e71c9fa812e9");
        } else if (this.mTaskQueue.containsKey(str)) {
            return this.mTaskQueue.remove(str);
        } else {
            return null;
        }
    }

    private void startTimeTaskScheduler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dae362027ccadf857cbc8e0ff654d786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dae362027ccadf857cbc8e0ff654d786");
        } else if (this.mTimer == null) {
            this.mTimer = c.c("JSTaskQueue");
            this.mTimer.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.JSTaskQueue.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56dfdd35d72d795c401415eb5a3ec455", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56dfdd35d72d795c401415eb5a3ec455");
                    } else {
                        JSTaskQueue.this.scheduleTaskTimeout();
                    }
                }
            }, 1000L, MetricsAnrManager.ANR_THRESHOLD, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleTaskTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cebb2622cfbd9bec48ff43513910f305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cebb2622cfbd9bec48ff43513910f305");
        } else if (this.mTaskQueue != null && this.mTaskQueue.size() > 0) {
            for (String str : this.mTaskQueue.keySet()) {
                checkTaskTimeOut(this.mTaskQueue.get(str));
            }
        }
    }

    private void checkTaskTimeOut(JSTaskItem jSTaskItem) {
        Object[] objArr = {jSTaskItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d3fe5b36a126d6252250025d6674369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d3fe5b36a126d6252250025d6674369");
        } else if (jSTaskItem == null || !jSTaskItem.isTimeout()) {
        } else {
            dequeueTask(jSTaskItem.getTaskId());
            try {
                if (jSTaskItem.getJSCallback() != null) {
                    jSTaskItem.getJSCallback().onFailed(jSTaskItem.getJSFrameworkId(), new BlueException("execute timeout.", BaseRaptorUploader.ERROR_EXECUTE_SCRIPT_TIMEOUT));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized String generateTaskId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0e242c86f3a15abde33c44c31e993cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0e242c86f3a15abde33c44c31e993cd");
        }
        long j = taskId;
        taskId = 1 + j;
        return String.valueOf(j);
    }

    public boolean containsTask(String str) {
        boolean containsKey;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3066064dd769d4b1bdb5f915e37f8bf3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3066064dd769d4b1bdb5f915e37f8bf3")).booleanValue();
        }
        synchronized (this) {
            containsKey = this.mTaskQueue.containsKey(str);
        }
        return containsKey;
    }
}
