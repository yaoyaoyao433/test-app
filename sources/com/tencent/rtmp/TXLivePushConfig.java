package com.tencent.rtmp;

import android.graphics.Bitmap;
import com.tencent.liteav.basic.b.c;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXLivePushConfig {
    public static final int DEFAULT_MAX_VIDEO_BITRATE = 1200;
    public static final int DEFAULT_MIN_VIDEO_BITRATE = 800;
    int mAudioBitrate;
    String mAudioPreProcessFuncName;
    String mAudioPreProcessLibrary;
    HashMap<String, String> mMetaData;
    String mVideoPreProcessFuncName;
    String mVideoPreProcessLibrary;
    Bitmap mWatermark;
    int mCustomModeType = 0;
    int mAudioSample = 48000;
    int mAudioChannels = 1;
    int mVideoFPS = 20;
    c mVideoResolution = c.RESOLUTION_TYPE_540_960;
    int mVideoBitrate = 1200;
    int mMaxVideoBitrate = 1500;
    int mMinVideoBitrate = 800;
    int mBeautyLevel = 0;
    int mWhiteningLevel = 0;
    int mRuddyLevel = 0;
    int mEyeScaleLevel = 0;
    int mFaceSlimLevel = 0;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    int mWatermarkX = 0;
    int mWatermarkY = 0;
    float mWatermarkXF = 0.0f;
    float mWatermarkYF = 0.0f;
    float mWatermarkWidth = -1.0f;
    int mVideoEncodeGop = 3;
    boolean mVideoEncoderXMirror = false;
    boolean mEnableHighResolutionCapture = true;
    boolean mEnableVideoHardEncoderMainProfile = true;
    boolean mFrontCamera = true;
    boolean mAutoAdjustBitrate = false;
    int mAutoAdjustStrategy = 0;
    int mHardwareAccel = 2;
    boolean mTouchFocus = true;
    boolean mEnableZoom = false;
    int mHomeOrientation = 1;
    Bitmap mPauseImg = null;
    int mPauseTime = 300;
    int mPauseFps = 5;
    int mPauseFlag = 1;
    boolean mEnableAec = false;
    boolean mEnableAgc = false;
    boolean mEnableAns = false;
    boolean mEnableAudioPreview = false;
    boolean mEnableScreenCaptureAutoRotate = false;
    boolean mEnablePureAudioPush = false;
    boolean mEnableNearestIP = true;
    int mVolumeType = 0;
    int mLocalVideoMirrorType = 0;
    int mRtmpChannelType = 0;

    public void setHomeOrientation(int i) {
        this.mHomeOrientation = i;
    }

    public void setTouchFocus(boolean z) {
        this.mTouchFocus = z;
    }

    public void setEnableZoom(boolean z) {
        this.mEnableZoom = z;
    }

    public void setWatermark(Bitmap bitmap, int i, int i2) {
        this.mWatermark = bitmap;
        this.mWatermarkX = i;
        this.mWatermarkY = i2;
    }

    public void setWatermark(Bitmap bitmap, float f, float f2, float f3) {
        this.mWatermark = bitmap;
        this.mWatermarkXF = f;
        this.mWatermarkYF = f2;
        this.mWatermarkWidth = f3;
    }

    public void setLocalVideoMirrorType(int i) {
        this.mLocalVideoMirrorType = i;
    }

    public void setPauseImg(Bitmap bitmap) {
        this.mPauseImg = bitmap;
    }

    public void setPauseImg(int i, int i2) {
        this.mPauseTime = i;
        this.mPauseFps = i2;
    }

    public void setPauseFlag(int i) {
        this.mPauseFlag = i;
    }

    public void setVideoResolution(int i) {
        switch (i) {
            case 0:
                this.mVideoResolution = c.RESOLUTION_TYPE_360_640;
                return;
            case 1:
                this.mVideoResolution = c.RESOLUTION_TYPE_540_960;
                return;
            case 2:
                this.mVideoResolution = c.RESOLUTION_TYPE_720_1280;
                return;
            case 3:
                this.mVideoResolution = c.RESOLUTION_TYPE_640_360;
                return;
            case 4:
                this.mVideoResolution = c.RESOLUTION_TYPE_960_540;
                return;
            case 5:
                this.mVideoResolution = c.RESOLUTION_TYPE_1280_720;
                return;
            case 6:
                this.mVideoResolution = c.RESOLUTION_TYPE_320_480;
                return;
            case 7:
                this.mVideoResolution = c.RESOLUTION_TYPE_180_320;
                return;
            case 8:
                this.mVideoResolution = c.RESOLUTION_TYPE_270_480;
                return;
            case 9:
                this.mVideoResolution = c.RESOLUTION_TYPE_320_180;
                return;
            case 10:
                this.mVideoResolution = c.RESOLUTION_TYPE_480_270;
                return;
            case 11:
                this.mVideoResolution = c.RESOLUTION_TYPE_240_320;
                return;
            case 12:
                this.mVideoResolution = c.RESOLUTION_TYPE_360_480;
                return;
            case 13:
                this.mVideoResolution = c.RESOLUTION_TYPE_480_640;
                return;
            case 14:
                this.mVideoResolution = c.RESOLUTION_TYPE_320_240;
                return;
            case 15:
                this.mVideoResolution = c.RESOLUTION_TYPE_480_360;
                return;
            case 16:
                this.mVideoResolution = c.RESOLUTION_TYPE_640_480;
                return;
            case 17:
                this.mVideoResolution = c.RESOLUTION_TYPE_480_480;
                return;
            case 18:
                this.mVideoResolution = c.RESOLUTION_TYPE_270_270;
                return;
            case 19:
                this.mVideoResolution = c.RESOLUTION_TYPE_160_160;
                return;
            default:
                switch (i) {
                    case 30:
                        this.mVideoResolution = c.RESOLUTION_TYPE_1080_1920;
                        return;
                    case 31:
                        this.mVideoResolution = c.RESOLUTION_TYPE_1920_1080;
                        return;
                    default:
                        return;
                }
        }
    }

    public void setVideoFPS(int i) {
        this.mVideoFPS = i;
    }

    public void setVideoEncodeGop(int i) {
        this.mVideoEncodeGop = i;
    }

    public void setVideoBitrate(int i) {
        this.mVideoBitrate = i;
    }

    public void setMaxVideoBitrate(int i) {
        this.mMaxVideoBitrate = i;
    }

    public void setMinVideoBitrate(int i) {
        this.mMinVideoBitrate = i;
    }

    public void setAutoAdjustBitrate(boolean z) {
        this.mAutoAdjustBitrate = z;
    }

    public void setAutoAdjustStrategy(int i) {
        this.mAutoAdjustStrategy = i;
    }

    public void setAudioSampleRate(int i) {
        this.mAudioSample = i;
    }

    public void setAudioChannels(int i) {
        this.mAudioChannels = i;
    }

    public void enablePureAudioPush(boolean z) {
        this.mEnablePureAudioPush = z;
    }

    public void enableScreenCaptureAutoRotate(boolean z) {
        this.mEnableScreenCaptureAutoRotate = z;
    }

    public void enableHighResolutionCaptureMode(boolean z) {
        this.mEnableHighResolutionCapture = z;
    }

    public void setVideoEncoderXMirror(boolean z) {
        this.mVideoEncoderXMirror = z;
    }

    public void enableAudioEarMonitoring(boolean z) {
        this.mEnableAudioPreview = z;
    }

    public void setConnectRetryCount(int i) {
        this.mConnectRetryCount = i;
    }

    public void setConnectRetryInterval(int i) {
        this.mConnectRetryInterval = i;
    }

    public void setCustomModeType(int i) {
        this.mCustomModeType = i;
    }

    public void enableAEC(boolean z) {
        this.mEnableAec = z;
    }

    public void enableAGC(boolean z) {
        this.mEnableAgc = z;
    }

    public void enableANS(boolean z) {
        this.mEnableAns = z;
    }

    public void setVolumeType(int i) {
        this.mVolumeType = i;
    }

    public void setHardwareAcceleration(int i) {
        if (i < 0) {
            i = 2;
        }
        if (i > 2) {
            i = 2;
        }
        this.mHardwareAccel = i;
    }

    public void enableVideoHardEncoderMainProfile(boolean z) {
        this.mEnableVideoHardEncoderMainProfile = z;
    }

    public void setMetaData(HashMap<String, String> hashMap) {
        this.mMetaData = hashMap;
    }

    @Deprecated
    public void setFrontCamera(boolean z) {
        this.mFrontCamera = z;
    }

    @Deprecated
    public void setBeautyFilter(int i, int i2, int i3) {
        this.mBeautyLevel = i;
        this.mWhiteningLevel = i2;
        this.mRuddyLevel = i3;
    }

    @Deprecated
    public void setEyeScaleLevel(int i) {
        this.mEyeScaleLevel = i;
    }

    @Deprecated
    public void setFaceSlimLevel(int i) {
        this.mFaceSlimLevel = i;
    }

    @Deprecated
    public void setRtmpChannelType(int i) {
        this.mRtmpChannelType = i;
    }

    @Deprecated
    public void enableNearestIP(boolean z) {
        this.mEnableNearestIP = z;
    }

    public void setCustomVideoPreProcessLibrary(String str, String str2) {
        this.mVideoPreProcessLibrary = str;
        this.mVideoPreProcessFuncName = str2;
    }

    public void setCustomAudioPreProcessLibrary(String str, String str2) {
        this.mAudioPreProcessLibrary = str;
        this.mAudioPreProcessFuncName = str2;
    }
}
