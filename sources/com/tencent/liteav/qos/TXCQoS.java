package com.tencent.liteav.qos;

import android.os.Bundle;
import android.os.Handler;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.b.c;
import com.tencent.liteav.basic.c.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCQoS {
    public static final int AUTO_ADJUST_LIVEPUSH_RESOLUTION_STRATEGY = 1;
    public static final int AUTO_ADJUST_REALTIME_VIDEOCHAT_STRATEGY = 5;
    private static final Map<Integer, c> RESOLUTION_MAP;
    static final String TAG = "TXCQos";
    private long mInstance;
    private a mListener;
    private b mNotifyListener;
    private long mInterval = 1000;
    private String mUserID = "";
    private boolean mIsEnableDrop = false;
    private int mBitrate = 0;
    private int mWidth = 0;
    private int mHeight = 0;
    private int mAutoStrategy = -1;
    private Handler mHandler = new Handler();
    private Runnable mRunnable = new Runnable() { // from class: com.tencent.liteav.qos.TXCQoS.1
        @Override // java.lang.Runnable
        public void run() {
            if (TXCQoS.this.mListener != null) {
                int onGetEncoderRealBitrate = TXCQoS.this.mListener.onGetEncoderRealBitrate();
                int onGetQueueInputSize = TXCQoS.this.mListener.onGetQueueInputSize();
                int onGetQueueOutputSize = TXCQoS.this.mListener.onGetQueueOutputSize();
                int onGetVideoQueueMaxCount = TXCQoS.this.mListener.onGetVideoQueueMaxCount();
                int onGetVideoQueueCurrentCount = TXCQoS.this.mListener.onGetVideoQueueCurrentCount();
                int onGetVideoDropCount = TXCQoS.this.mListener.onGetVideoDropCount();
                int onGetBandwidthEst = TXCQoS.this.mListener.onGetBandwidthEst();
                TXCQoS.this.nativeSetVideoRealBitrate(TXCQoS.this.mInstance, onGetEncoderRealBitrate);
                TXCQoS.this.nativeAdjustBitrate(TXCQoS.this.mInstance, onGetVideoQueueMaxCount, onGetVideoQueueCurrentCount, onGetVideoDropCount, onGetQueueOutputSize, onGetQueueInputSize, onGetBandwidthEst);
                boolean nativeIsEnableDrop = TXCQoS.this.nativeIsEnableDrop(TXCQoS.this.mInstance);
                if (TXCQoS.this.mIsEnableDrop != nativeIsEnableDrop) {
                    TXCQoS.this.mIsEnableDrop = nativeIsEnableDrop;
                    TXCQoS.this.mListener.onEnableDropStatusChanged(nativeIsEnableDrop);
                }
                int nativeGetBitrate = TXCQoS.this.nativeGetBitrate(TXCQoS.this.mInstance);
                int nativeGetWidth = TXCQoS.this.nativeGetWidth(TXCQoS.this.mInstance);
                int nativeGetHeight = TXCQoS.this.nativeGetHeight(TXCQoS.this.mInstance);
                if (nativeGetWidth != TXCQoS.this.mWidth || nativeGetHeight != TXCQoS.this.mHeight) {
                    if (TXCQoS.this.mAutoStrategy == 1 || TXCQoS.this.mAutoStrategy == 5) {
                        TXCQoS.this.mListener.onEncoderParamsChanged(nativeGetBitrate, nativeGetWidth, nativeGetHeight);
                        if (TXCQoS.this.mNotifyListener != null) {
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("EVT_MSG", "Adjust resolution:new bitrate:" + nativeGetBitrate + " new resolution:" + nativeGetWidth + "*" + nativeGetHeight);
                            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                            TXCQoS.this.mNotifyListener.onNotifyEvent(1005, bundle);
                        }
                    }
                } else if (nativeGetBitrate != TXCQoS.this.mBitrate) {
                    TXCQoS.this.mListener.onEncoderParamsChanged(nativeGetBitrate, 0, 0);
                    if (TXCQoS.this.mNotifyListener != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putCharSequence("EVT_MSG", "Adjust encoding bitrate:new bitrate:" + nativeGetBitrate);
                        bundle2.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                        bundle2.putString(TXCAVRoomConstants.EVT_USERID, TXCQoS.this.mUserID);
                        TXCQoS.this.mNotifyListener.onNotifyEvent(1006, bundle2);
                    }
                }
                TXCQoS.this.mBitrate = nativeGetBitrate;
                TXCQoS.this.mWidth = nativeGetWidth;
                TXCQoS.this.mHeight = nativeGetHeight;
            }
            TXCQoS.this.mHandler.postDelayed(this, TXCQoS.this.mInterval);
        }
    };

    private native void nativeAddQueueInputSize(long j, int i);

    private native void nativeAddQueueOutputSize(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAdjustBitrate(long j, int i, int i2, int i3, int i4, int i5, int i6);

    private native void nativeDeinit(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetBitrate(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetHeight(long j);

    private static native int nativeGetProperResolutionByVideoBitrate(boolean z, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetWidth(long j);

    private native long nativeInit(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeIsEnableDrop(long j);

    private native void nativeReset(long j, boolean z);

    private native void nativeSetAutoAdjustBitrate(long j, boolean z);

    private native void nativeSetAutoAdjustStrategy(long j, int i);

    private native void nativeSetHasVideo(long j, boolean z);

    private native void nativeSetVideoDefaultResolution(long j, int i);

    private native void nativeSetVideoEncBitrate(long j, int i, int i2, int i3);

    private native void nativeSetVideoExpectBitrate(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVideoRealBitrate(long j, int i);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(0, c.RESOLUTION_TYPE_360_640);
        hashMap.put(1, c.RESOLUTION_TYPE_540_960);
        hashMap.put(2, c.RESOLUTION_TYPE_720_1280);
        hashMap.put(3, c.RESOLUTION_TYPE_640_360);
        hashMap.put(4, c.RESOLUTION_TYPE_960_540);
        hashMap.put(5, c.RESOLUTION_TYPE_1280_720);
        hashMap.put(6, c.RESOLUTION_TYPE_320_480);
        hashMap.put(7, c.RESOLUTION_TYPE_180_320);
        hashMap.put(8, c.RESOLUTION_TYPE_270_480);
        hashMap.put(9, c.RESOLUTION_TYPE_320_180);
        hashMap.put(10, c.RESOLUTION_TYPE_480_270);
        hashMap.put(11, c.RESOLUTION_TYPE_240_320);
        hashMap.put(12, c.RESOLUTION_TYPE_360_480);
        hashMap.put(13, c.RESOLUTION_TYPE_480_640);
        hashMap.put(14, c.RESOLUTION_TYPE_320_240);
        hashMap.put(15, c.RESOLUTION_TYPE_480_360);
        hashMap.put(16, c.RESOLUTION_TYPE_640_480);
        hashMap.put(17, c.RESOLUTION_TYPE_480_480);
        hashMap.put(18, c.RESOLUTION_TYPE_270_270);
        hashMap.put(19, c.RESOLUTION_TYPE_160_160);
        RESOLUTION_MAP = Collections.unmodifiableMap(hashMap);
        g.f();
    }

    public TXCQoS(boolean z) {
        this.mInstance = nativeInit(z);
    }

    protected void finalize() throws Throwable {
        try {
            nativeDeinit(this.mInstance);
        } finally {
            super.finalize();
        }
    }

    public void start(long j) {
        this.mInterval = j;
        this.mHandler.postDelayed(this.mRunnable, this.mInterval);
    }

    public void stop() {
        this.mHandler.removeCallbacks(this.mRunnable);
        this.mAutoStrategy = -1;
    }

    public String getUserID() {
        return this.mUserID;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public void setNotifyListener(b bVar) {
        this.mNotifyListener = bVar;
    }

    public void setListener(a aVar) {
        this.mListener = aVar;
    }

    public void reset(boolean z) {
        nativeReset(this.mInstance, z);
    }

    public boolean isEnableDrop() {
        return nativeIsEnableDrop(this.mInstance);
    }

    public void setHasVideo(boolean z) {
        nativeSetHasVideo(this.mInstance, z);
    }

    public void setAutoAdjustBitrate(boolean z) {
        StringBuilder sb = new StringBuilder("autoAdjustBitrate is ");
        sb.append(z ? "yes" : "no");
        TXCLog.i(TAG, sb.toString());
        nativeSetAutoAdjustBitrate(this.mInstance, z);
    }

    public void setAutoAdjustStrategy(int i) {
        TXCLog.i(TAG, "autoAdjustStrategy is " + i);
        nativeSetAutoAdjustStrategy(this.mInstance, i);
        this.mAutoStrategy = i;
    }

    public void setDefaultVideoResolution(c cVar) {
        TXCLog.i(TAG, "DefaultVideoResolution is " + cVar);
        int i = 0;
        this.mWidth = 0;
        this.mHeight = 0;
        for (Map.Entry<Integer, c> entry : RESOLUTION_MAP.entrySet()) {
            if (entry.getValue() == cVar) {
                i = entry.getKey().intValue();
            }
        }
        nativeSetVideoDefaultResolution(this.mInstance, i);
    }

    public void setVideoEncBitrate(int i, int i2, int i3) {
        this.mBitrate = 0;
        nativeSetVideoEncBitrate(this.mInstance, i, i2, i3);
    }

    public void setVideoExpectBitrate(int i) {
        nativeSetVideoExpectBitrate(this.mInstance, i);
    }

    public static c getProperResolutionByVideoBitrate(boolean z, int i, int i2) {
        return RESOLUTION_MAP.get(Integer.valueOf(nativeGetProperResolutionByVideoBitrate(z, i, i2)));
    }
}
