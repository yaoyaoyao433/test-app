package com.tencent.liteav.qos;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface a {
    void onEnableDropStatusChanged(boolean z);

    void onEncoderParamsChanged(int i, int i2, int i3);

    int onGetBandwidthEst();

    int onGetEncoderRealBitrate();

    int onGetQueueInputSize();

    int onGetQueueOutputSize();

    int onGetVideoDropCount();

    int onGetVideoQueueCurrentCount();

    int onGetVideoQueueMaxCount();
}
