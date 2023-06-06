package com.meituan.robust.resource.service;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.MessageQueue;
import com.meituan.robust.resource.util.ProcessUtil;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustRecoverHelper {
    private static RobustRecoverHelper instance;
    private final Handler handler;
    private final HandlerThread mTaskThread = new HandlerThread(RobustRecoverHelper.class.getSimpleName(), -1);

    static synchronized RobustRecoverHelper getInstance() {
        RobustRecoverHelper robustRecoverHelper;
        synchronized (RobustRecoverHelper.class) {
            if (instance == null) {
                instance = new RobustRecoverHelper();
            }
            robustRecoverHelper = instance;
        }
        return robustRecoverHelper;
    }

    private RobustRecoverHelper() {
        this.mTaskThread.start();
        this.handler = new Handler(this.mTaskThread.getLooper());
    }

    public void postRunnable(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void postRunnableDelay(Runnable runnable, long j) {
        this.handler.postDelayed(runnable, j);
    }

    public void killRobustProcessWhenEmpty(final Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mTaskThread.getLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.meituan.robust.resource.service.RobustRecoverHelper.1
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    if (ProcessUtil.isRobustProcess(context)) {
                        ProcessUtil.killSelf();
                        return false;
                    }
                    return false;
                }
            });
        }
    }
}
