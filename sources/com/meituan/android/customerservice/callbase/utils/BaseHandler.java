package com.meituan.android.customerservice.callbase.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseHandler extends Handler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int TASK_TIME_LIMIT;
    private TaskCounter taskCounter;

    public BaseHandler(TaskCounter taskCounter, Looper looper) {
        super(looper);
        Object[] objArr = {taskCounter, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f82b23f96201e7b07b58d0b46272d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f82b23f96201e7b07b58d0b46272d6b");
            return;
        }
        this.TASK_TIME_LIMIT = 500;
        this.taskCounter = taskCounter;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e002517a1e2878dff0017a8166bd523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e002517a1e2878dff0017a8166bd523");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        super.dispatchMessage(message);
        if (message == null || message.getCallback() == null) {
            return;
        }
        this.taskCounter.sub();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 500) {
            CallLog.error("BaseHandler", "Thread name = " + this.taskCounter.getName() + ",task name :" + message.getCallback().getClass().getName() + ", time :" + currentTimeMillis2 + "ms,current count=" + this.taskCounter.getCount());
        }
    }
}
