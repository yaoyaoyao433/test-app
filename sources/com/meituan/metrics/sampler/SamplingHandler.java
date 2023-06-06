package com.meituan.metrics.sampler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SamplingHandler extends Handler {
    public static final int SAMPLING_CUSTOM_SCROLL_START = 5;
    public static final int SAMPLING_CUSTOM_SCROLL_STOP = 6;
    public static final int SAMPLING_FPS = 2;
    public static final int SAMPLING_PAGE_ENTER = 3;
    public static final int SAMPLING_PAGE_EXIT = 4;
    public static final int SAMPLING_PERIODIC = 1;
    private static final int SAMPLING_PERIODIC_PROCESS_INTERVAL = 60;
    public static final int SAMPLING_PERIODIC_PROCESS_STORE = 9;
    public static final int SAMPLING_SET_CUSTOM_SCROLL = 7;
    public static final int SAMPLING_SET_FRAGMENT = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private SamplingCallback samplingCallback;
    private long samplingTimeInterval;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface SamplingCallback {
        void onSamplingEvent(int i, Object... objArr);
    }

    public SamplingHandler(Looper looper, SamplingCallback samplingCallback, long j) {
        super(looper);
        Object[] objArr = {looper, samplingCallback, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae52c868fcd3c4f77e8f63e9474b5e6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae52c868fcd3c4f77e8f63e9474b5e6a");
            return;
        }
        this.samplingCallback = samplingCallback;
        this.samplingTimeInterval = j;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c516b1c4577bd49ded02755c9f9d8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c516b1c4577bd49ded02755c9f9d8c0");
            return;
        }
        try {
            switch (message.what) {
                case 1:
                    if (this.samplingCallback != null) {
                        this.samplingCallback.onSamplingEvent(1, new Object[0]);
                    }
                    removeMessages(1);
                    sendEmptyMessageDelayed(1, this.samplingTimeInterval * 1000);
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (this.samplingCallback == null || !(message.obj instanceof WeakReference)) {
                        return;
                    }
                    Object obj = ((WeakReference) message.obj).get();
                    this.samplingCallback.onSamplingEvent(message.what, obj instanceof Object[] ? (Object[]) obj : null);
                    return;
                case 9:
                    if (this.samplingCallback != null) {
                        this.samplingCallback.onSamplingEvent(9, new Object[0]);
                    }
                    removeMessages(9);
                    sendEmptyMessageDelayed(9, LocationStrategy.LOCATION_TIMEOUT);
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            ILogger metricsLogger = Logger.getMetricsLogger();
            metricsLogger.e("SamplingHandler", "exception when handling message " + message, e);
        }
    }

    public void startSampleTimer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33b1d879724bc6fc15d785ef2b0453f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33b1d879724bc6fc15d785ef2b0453f3");
            return;
        }
        removeMessages(1);
        sendEmptyMessage(1);
    }

    public void startSampleTimerDelayed(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b901efb0541e91e4ac444be7c0313e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b901efb0541e91e4ac444be7c0313e6");
            return;
        }
        removeMessages(1);
        sendEmptyMessageDelayed(1, j);
    }

    public void sendMessage(int i, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17bd4a54b0a735f3a09a0d00841a9819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17bd4a54b0a735f3a09a0d00841a9819");
        } else {
            obtainMessage(i, new WeakReference(objArr)).sendToTarget();
        }
    }

    public void stopSampleTimer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cade3f9a48f1cbe9485a3861151c2739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cade3f9a48f1cbe9485a3861151c2739");
        } else {
            removeMessages(1);
        }
    }

    public void startProcessTimer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d56944d2795904e4dd9f2aa54713925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d56944d2795904e4dd9f2aa54713925");
            return;
        }
        removeMessages(9);
        sendEmptyMessageDelayed(9, LocationStrategy.LOCATION_TIMEOUT);
    }

    public void stopProcessTimer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b910b6f461e3a7a98cd218afa2f1013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b910b6f461e3a7a98cd218afa2f1013");
        } else {
            removeMessages(9);
        }
    }
}
