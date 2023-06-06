package com.meituan.msc.jse.bridge.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MessageQueueThreadHandler extends Handler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final QueueThreadExceptionHandler mExceptionHandler;

    public MessageQueueThreadHandler(Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        super(looper);
        Object[] objArr = {looper, queueThreadExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "699a5423e8c1676247d110fab0d894ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "699a5423e8c1676247d110fab0d894ef");
        } else {
            this.mExceptionHandler = queueThreadExceptionHandler;
        }
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6774b1ed3ce4cd85085c60606611975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6774b1ed3ce4cd85085c60606611975");
            return;
        }
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            this.mExceptionHandler.handleException(e);
        }
    }
}
