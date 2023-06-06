package com.tencent.rtmp;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXLivePlayConfig {
    String mCacheFolderPath;
    protected Map<String, String> mHeaders;
    int mMaxCacheItems;
    float mCacheTime = 5.0f;
    float mMaxAutoAdjustCacheTime = 5.0f;
    float mMinAutoAdjustCacheTime = 1.0f;
    int mVideoBlockThreshold = 800;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    boolean mAutoAdjustCacheTime = true;
    boolean mEnableAec = false;
    boolean mEnableNearestIP = true;
    boolean mEnableMessage = false;
    boolean mEnableMetaData = false;
    String mFlvSessionKey = "";
    int mRtmpChannelType = 0;
    boolean mAutoRotate = true;

    public void setAutoAdjustCacheTime(boolean z) {
        this.mAutoAdjustCacheTime = z;
    }

    public void setCacheTime(float f) {
        this.mCacheTime = f;
    }

    public void setMaxAutoAdjustCacheTime(float f) {
        this.mMaxAutoAdjustCacheTime = f;
    }

    public void setMinAutoAdjustCacheTime(float f) {
        this.mMinAutoAdjustCacheTime = f;
    }

    public void setVideoBlockThreshold(int i) {
        this.mVideoBlockThreshold = i;
    }

    public void setConnectRetryCount(int i) {
        this.mConnectRetryCount = i;
    }

    public void setConnectRetryInterval(int i) {
        this.mConnectRetryInterval = i;
    }

    public void setEnableMessage(boolean z) {
        this.mEnableMessage = z;
    }

    public void enableAEC(boolean z) {
        this.mEnableAec = z;
    }

    public void setEnableMetaData(boolean z) {
        this.mEnableMetaData = z;
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    @Deprecated
    public void setEnableNearestIP(boolean z) {
        this.mEnableNearestIP = z;
    }

    @Deprecated
    public void setRtmpChannelType(int i) {
        this.mRtmpChannelType = i;
    }

    @Deprecated
    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    @Deprecated
    public void setMaxCacheItems(int i) {
        this.mMaxCacheItems = i;
    }

    @Deprecated
    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }
}
