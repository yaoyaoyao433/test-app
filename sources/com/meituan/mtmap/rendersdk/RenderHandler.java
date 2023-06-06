package com.meituan.mtmap.rendersdk;

import android.view.Choreographer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RenderHandler implements Choreographer.FrameCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long delayMillis;
    private long mNativePtr;
    public boolean mStop;

    private native void nativeHandleMessage();

    public RenderHandler(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66e027d5b2eac630b31c3d8a43010d20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66e027d5b2eac630b31c3d8a43010d20");
            return;
        }
        this.mNativePtr = 0L;
        this.mStop = false;
        this.delayMillis = 0L;
        this.mNativePtr = j;
    }

    public void start(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f1b89e119982c025843a519a556b99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f1b89e119982c025843a519a556b99e");
            return;
        }
        this.mStop = false;
        this.delayMillis = Math.max(j - 16, 0L);
        try {
            Choreographer.getInstance().postFrameCallbackDelayed(this, this.delayMillis);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "554557634f068add0a5e61b09f800564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "554557634f068add0a5e61b09f800564");
            return;
        }
        this.mStop = true;
        try {
            Choreographer.getInstance().removeFrameCallback(this);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d180b6ad1375339cfb0aa66686a996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d180b6ad1375339cfb0aa66686a996");
            return;
        }
        try {
            if (this.mStop) {
                return;
            }
            if (InnerInitializer.canNativeBeUsed("RenderHandler.doFrame") && this.mNativePtr != 0) {
                nativeHandleMessage();
            }
            Choreographer.getInstance().postFrameCallbackDelayed(this, this.delayMillis);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }
}
