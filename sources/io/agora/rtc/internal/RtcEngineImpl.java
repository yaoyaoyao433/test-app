package io.agora.rtc.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.agora.rtc.Constants;
import io.agora.rtc.IAudioEffectManager;
import io.agora.rtc.IAudioFrameObserver;
import io.agora.rtc.IMetadataObserver;
import io.agora.rtc.IRtcChannelEventHandler;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.IRtcEngineEventHandlerEx;
import io.agora.rtc.RtcChannel;
import io.agora.rtc.RtcEngineConfig;
import io.agora.rtc.RtcEngineEx;
import io.agora.rtc.audio.HardwareEarbackController;
import io.agora.rtc.internal.RtcEngineEvent;
import io.agora.rtc.internal.RtcEngineMessage;
import io.agora.rtc.live.LiveInjectStreamConfig;
import io.agora.rtc.live.LiveTranscoding;
import io.agora.rtc.mediaio.AgoraDefaultRender;
import io.agora.rtc.mediaio.AgoraDefaultSource;
import io.agora.rtc.mediaio.IVideoSink;
import io.agora.rtc.mediaio.IVideoSource;
import io.agora.rtc.models.UserInfo;
import io.agora.rtc.video.AgoraImage;
import io.agora.rtc.video.AgoraVideoFrame;
import io.agora.rtc.video.BeautyOptions;
import io.agora.rtc.video.CameraCapturerConfiguration;
import io.agora.rtc.video.VideoCanvas;
import io.agora.rtc.video.VideoEncoderConfiguration;
import io.agora.rtc.video.WatermarkOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class RtcEngineImpl extends RtcEngineEx implements IAudioEffectManager {
    private static final String TAG = "RtcEngine";
    public static final int VIDEO_SOURCE_TYPE_CUSTOMIZED = 2;
    public static final int VIDEO_SOURCE_TYPE_DEFAULT = 1;
    private static final int VIDEO_SOURCE_TYPE_EXTERNAL_DEPRECATED = 3;
    public static final int VIDEO_SOURCE_TYPE_NULL = 0;
    private static boolean sLibLoaded = false;
    static float[] sMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    IRtcEngineEventHandler.AgoraFacePositionInfo[] faceRectArr;
    private WeakReference<Context> mContext;
    private long mNativeHandle;
    private int mVideoSourceType = 1;
    private boolean mLocalVideoEnabled = false;
    private boolean mUseLocalView = false;
    private int mExAudioSampleRate = 0;
    private int mExAudioChannels = 0;
    private long lastOrientationTs = 0;
    private int mTotalRotation = 1000;
    private final ConcurrentHashMap<IRtcEngineEventHandler, Integer> mRtcHandlers = new ConcurrentHashMap<>();
    private RtcChannelImpl mDefaultRtcChannel = null;
    private final LinkedList<RtcChannelImpl> mRtcChannels = new LinkedList<>();
    private IRtcEngineEventHandler.RtcStats mRtcStats = null;
    private WifiManager.WifiLock mWifiLock = null;
    private int mChannelProfile = 1;
    private int mClientRole = 2;

    private native int deliverFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8);

    private native int nativeAddInjectStreamUrl(long j, String str, byte[] bArr);

    private native int nativeAddLocalVideoRender(long j, IVideoSink iVideoSink, int i);

    private native int nativeAddPublishStreamUrl(long j, String str, boolean z);

    private native int nativeAddRemoteVideoRender(long j, int i, IVideoSink iVideoSink, int i2);

    private native int nativeAddVideoCapturer(long j, IVideoSource iVideoSource, int i);

    private native int nativeAddVideoWatermark(long j, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native int nativeClassInit();

    private native int nativeClearVideoWatermarks(long j);

    private native int nativeComplain(long j, String str, String str2);

    private native int nativeCreateDataStream(long j, boolean z, boolean z2);

    private native long nativeCreateRtcChannel(long j, String str);

    private native int nativeDestroy(long j);

    private native int nativeDisableVideo(long j);

    private native int nativeEnableEncryption(long j, boolean z, int i, String str);

    private native int nativeEnableLocalAudio(long j, boolean z);

    private native int nativeEnableVideo(long j);

    private native String nativeGetCallId(long j);

    public static native String nativeGetChatEngineVersion();

    private native int nativeGetConncetionState(long j);

    private native long nativeGetDefaultRtcChannel(long j);

    public static native String nativeGetErrorDescription(int i);

    private native long nativeGetHandle(long j);

    private native int nativeGetIntParameter(long j, String str, String str2);

    private static native byte[] nativeGetOptionsByVideoProfile(long j, int i);

    private native String nativeGetParameter(long j, String str, String str2);

    private native String nativeGetParameters(long j, String str);

    private native String nativeGetProfile(long j);

    public static native String nativeGetSdkVersion();

    private native int nativeGetUserInfoByUid(long j, int i, Object obj);

    private native int nativeGetUserInfoByUserAccount(long j, String str, Object obj);

    private native boolean nativeIsSpeakerphoneEnabled(long j);

    private native int nativeJoinChannel(long j, byte[] bArr, String str, String str2, String str3, int i);

    private native int nativeJoinChannelWithUserAccount(long j, String str, String str2, String str3);

    private native int nativeLeaveChannel(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int nativeLog(int i, String str);

    private native String nativeMakeQualityReportUrl(long j, String str, int i, int i2, int i3);

    private native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeMuteLocalVideoStream(long j, boolean z);

    private native long nativeObjectInit(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native long nativeObjectInitWithConfig(Object obj);

    private native int nativePullAudioFrame(long j, byte[] bArr, int i);

    private native int nativePushExternalAudioFrameRawData(long j, byte[] bArr, long j2, int i, int i2);

    private native int nativeRate(long j, String str, int i, String str2);

    private native int nativeRegisterAudioFrameObserver(long j, Object obj);

    private native int nativeRegisterLocalUserAccount(long j, String str, String str2);

    private native int nativeRegisterMediaMetadataObserver(long j, Object obj, int i);

    private native int nativeRemoveInjectStreamUrl(long j, String str);

    private native int nativeRemovePublishStreamUrl(long j, String str);

    private native int nativeRemoveVideoReceiveTrack(long j, int i);

    private native int nativeRenewChannelKey(long j, String str);

    private native int nativeRenewToken(long j, String str);

    private native int nativeRtcChannelRelease(long j);

    private native int nativeSendCustomReportMessage(long j, String str, String str2, String str3, String str4, int i);

    private native int nativeSendStreamMessage(long j, int i, byte[] bArr);

    private native int nativeSetApiCallMode(long j, int i);

    private native int nativeSetAppType(long j, int i);

    private native int nativeSetAudioProfile(long j, int i, int i2);

    private native int nativeSetBeautyEffectOptions(long j, boolean z, int i, float f, float f2, float f3);

    private native int nativeSetChannelProfile(long j, int i);

    private native int nativeSetClientRole(long j, int i);

    private native int nativeSetDefaultAudioRoutetoSpeakerphone(long j, boolean z);

    private native int nativeSetEGL10Context(long j, EGLContext eGLContext);

    private native int nativeSetEGL10TextureId(long j, int i, EGLContext eGLContext, int i2, int i3, int i4, long j2, float[] fArr);

    private native int nativeSetEGL14Context(long j, android.opengl.EGLContext eGLContext);

    private native int nativeSetEGL14TextureId(long j, int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j2, float[] fArr);

    private native int nativeSetEnableSpeakerphone(long j, boolean z);

    private native int nativeSetEncryptionSecret(long j, String str);

    private native int nativeSetLiveTranscoding(long j, byte[] bArr);

    private native int nativeSetLocalVideoMirrorMode(long j, int i);

    private native int nativeSetParameters(long j, String str);

    private native int nativeSetProfile(long j, String str, boolean z);

    private native int nativeSetRemoteRenderMode(long j, int i, int i2);

    private native int nativeSetRemoteRenderModeWithMirrorMode(long j, int i, int i2, int i3);

    private native int nativeSetRemoteUserPriority(long j, int i, int i2);

    private native int nativeSetScreenCaptureContentHint(long j, int i);

    private native int nativeSetVideoEncoderConfiguration(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    private native int nativeSetVideoProfileEx(long j, int i, int i2, int i3, int i4);

    private native int nativeSetupVideoLocal(long j, View view, int i, int i2);

    private native int nativeSetupVideoRemote(long j, View view, int i, String str, int i2, int i3);

    private native int nativeStartChannelMediaRelay(long j, byte[] bArr);

    private native int nativeStartDumpVideoReceiveTrack(long j, int i, String str);

    private native int nativeStartEchoTest(long j, byte[] bArr);

    private native int nativeStartEchoTestWithInterval(long j, byte[] bArr, int i);

    private native int nativeStartLastmileProbeTest(long j, byte[] bArr, boolean z, boolean z2, int i, int i2);

    private native int nativeStartPreview(long j);

    private native int nativeStopChannelMediaRelay(long j);

    private native int nativeStopDumpVideoReceiveTrack(long j);

    private native int nativeStopEchoTest(long j);

    private native int nativeStopLastmileProbeTest(long j);

    private native int nativeSwitchCamera(long j);

    private native int nativeSwitchCameraByDirection(long j, int i);

    private native int nativeSwitchChannel(long j, String str, String str2);

    private native int nativeUpdateChannelMediaRelay(long j, byte[] bArr);

    private void onLogEvent(int i, String str) {
    }

    private native int setExtVideoSource(long j, int i, int i2);

    @Override // io.agora.rtc.RtcEngine
    public IAudioEffectManager getAudioEffectManager() {
        return this;
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public void setPreferHeadset(boolean z) {
    }

    private void checkVoipPermissions(Context context, String str) throws SecurityException {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            throw new SecurityException(str + " is not granted");
        }
    }

    private void checkVoipPermissions(Context context) throws SecurityException {
        checkVoipPermissions(context, "android.permission.INTERNET");
        checkVoipPermissions(context, "android.permission.RECORD_AUDIO");
        checkVoipPermissions(context, "android.permission.MODIFY_AUDIO_SETTINGS");
        if (this.mVideoSourceType == 1 && this.mLocalVideoEnabled) {
            checkVoipPermissions(context, "android.permission.CAMERA");
        }
    }

    private int checkVoipPermissions(Context context, int i) {
        switch (i) {
            case 1:
                try {
                    checkVoipPermissions(context);
                    return 0;
                } catch (SecurityException e) {
                    Logging.e(TAG, "Do not have enough permission! ", e);
                    return -9;
                }
            case 2:
                try {
                    checkVoipPermissions(context, "android.permission.INTERNET");
                    return 0;
                } catch (SecurityException unused) {
                    Logging.e(TAG, "Do not have Internet permission!");
                    return -9;
                }
            default:
                return -2;
        }
    }

    public static synchronized void loadNativeLibrary() {
        synchronized (RtcEngineImpl.class) {
            System.loadLibrary("agora-rtc-sdk");
        }
    }

    public static synchronized boolean initializeNativeLibs() {
        boolean z;
        synchronized (RtcEngineImpl.class) {
            if (!sLibLoaded) {
                loadNativeLibrary();
                sLibLoaded = nativeClassInit() == 0;
            }
            z = sLibLoaded;
        }
        return z;
    }

    public static boolean checkIfInUIThread(String str) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Logging.i(TAG, str + " in UI Thread");
            return true;
        }
        Logging.i(TAG, str + " not in UI Thread");
        return false;
    }

    public RtcEngineImpl(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) throws Exception {
        this.mNativeHandle = 0L;
        this.mContext = new WeakReference<>(context);
        addHandler(iRtcEngineEventHandler);
        HardwareEarbackController.getInstance(context).isHardwareEarbackSupported();
        this.mNativeHandle = nativeObjectInit(context, str, "", "", "", "", "", "");
    }

    public Context getContext() {
        return this.mContext.get();
    }

    public RtcEngineImpl(RtcEngineConfig rtcEngineConfig) throws Exception {
        this.mNativeHandle = 0L;
        this.mContext = new WeakReference<>(rtcEngineConfig.mContext);
        addHandler(rtcEngineConfig.mEventHandler);
        this.mNativeHandle = nativeObjectInitWithConfig(rtcEngineConfig);
    }

    public void doDestroy() {
        setExternalVideoSource(false, false, true);
        doStopMonitorSystemEvent();
        nativeDestroy(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    public void reinitialize(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) {
        addHandler(iRtcEngineEventHandler);
    }

    @Override // io.agora.rtc.RtcEngine
    public void addHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        this.mRtcHandlers.put(iRtcEngineEventHandler, 0);
    }

    @Override // io.agora.rtc.RtcEngine
    public void removeHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (this.mRtcHandlers.containsKey(iRtcEngineEventHandler)) {
            this.mRtcHandlers.remove(iRtcEngineEventHandler);
        }
    }

    private void setDeviceOrientation(int i) {
        char c;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastOrientationTs < 100) {
            return;
        }
        int round = ((int) (Math.round(i / 90.0d) * 90)) % 360;
        int i2 = round - i;
        if (Math.abs(i2) < 20) {
            c = 1;
        } else {
            c = Math.abs(i2) < 40 ? (char) 2 : (char) 0;
        }
        if (round == 0 && i > 180) {
            int i3 = 360 - i;
            if (i3 < 20) {
                c = 1;
            } else if (i3 < 40) {
                c = 2;
            }
        }
        if (c > 0) {
            try {
                int i4 = new Camera.CameraInfo().orientation;
                if (c != 1) {
                    round += 5;
                }
                if (this.mTotalRotation != 0) {
                    setVideoRotateCapturedFrames(0, round);
                }
                this.mTotalRotation = 0;
            } catch (Exception e) {
                Logging.e(TAG, "Unable to get camera info, ", e);
            }
        }
        this.lastOrientationTs = currentTimeMillis;
    }

    private int setVideoRotateCapturedFrames(int i, int i2) {
        return setParameterObject("che.video.local.rotate_video", formatString("{\"degree\":%d,\"rotation\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setupRemoteVideo(VideoCanvas videoCanvas) {
        checkIfInUIThread("setupRemoteVideo");
        if (videoCanvas != null) {
            if (videoCanvas.channelId != null) {
                return nativeSetupVideoRemote(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, videoCanvas.channelId, videoCanvas.uid, videoCanvas.mirrorMode);
            }
            return nativeSetupVideoRemote(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, "", videoCanvas.uid, videoCanvas.mirrorMode);
        }
        return -1;
    }

    @Override // io.agora.rtc.RtcEngine
    public int sendCustomReportMessage(String str, String str2, String str3, String str4, int i) {
        return nativeSendCustomReportMessage(this.mNativeHandle, str, str2, str3, str4, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setupLocalVideo(VideoCanvas videoCanvas) {
        checkIfInUIThread("setupLocalVideo");
        if (this.mVideoSourceType == 3) {
            return -1;
        }
        if (videoCanvas != null) {
            this.mUseLocalView = true;
            nativeSetupVideoLocal(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, videoCanvas.mirrorMode);
        } else {
            this.mUseLocalView = false;
            nativeSetupVideoLocal(this.mNativeHandle, null, 1, 0);
        }
        return 0;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalRenderMode(int i) {
        return setRemoteRenderMode(0, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalRenderMode(int i, int i2) {
        return setRemoteRenderMode(0, i, i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteRenderMode(int i, int i2) {
        return nativeSetRemoteRenderMode(this.mNativeHandle, (int) (i & 4294967295L), i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteRenderMode(int i, int i2, int i3) {
        return nativeSetRemoteRenderModeWithMirrorMode(this.mNativeHandle, (int) (i & 4294967295L), i2, i3);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVideoMirrorMode(int i) {
        return nativeSetLocalVideoMirrorMode(this.mNativeHandle, i);
    }

    private String getAssetsCacheFile(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), "wm_" + str.replace(File.separator, CommonConstant.Symbol.UNDERLINE));
            if (file.exists()) {
                file.delete();
            }
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        open.close();
                        return file.getAbsolutePath();
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int addVideoWatermark(AgoraImage agoraImage) {
        WatermarkOptions watermarkOptions;
        String str = null;
        if (agoraImage != null) {
            str = agoraImage.url;
            watermarkOptions = new WatermarkOptions();
            watermarkOptions.visibleInPreview = false;
            watermarkOptions.positionInLandscapeMode = new WatermarkOptions.Rectangle(agoraImage.x, agoraImage.y, agoraImage.width, agoraImage.height);
            watermarkOptions.positionInPortraitMode = watermarkOptions.positionInLandscapeMode;
        } else {
            watermarkOptions = null;
        }
        return addVideoWatermark(str, watermarkOptions);
    }

    @Override // io.agora.rtc.RtcEngine
    public int addVideoWatermark(String str, WatermarkOptions watermarkOptions) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        RtcEngineImpl rtcEngineImpl;
        if (str == null || TextUtils.isEmpty(str) || watermarkOptions == null) {
            return -2;
        }
        if (watermarkOptions.positionInLandscapeMode != null) {
            int i9 = watermarkOptions.positionInLandscapeMode.x;
            int i10 = watermarkOptions.positionInLandscapeMode.y;
            i3 = watermarkOptions.positionInLandscapeMode.width;
            i4 = watermarkOptions.positionInLandscapeMode.height;
            i = i9;
            i2 = i10;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (watermarkOptions.positionInPortraitMode != null) {
            int i11 = watermarkOptions.positionInPortraitMode.x;
            int i12 = watermarkOptions.positionInPortraitMode.y;
            rtcEngineImpl = this;
            i6 = i12;
            i7 = watermarkOptions.positionInPortraitMode.width;
            i8 = watermarkOptions.positionInPortraitMode.height;
            i5 = i11;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            rtcEngineImpl = this;
        }
        return nativeAddVideoWatermark(rtcEngineImpl.mNativeHandle, str, watermarkOptions.visibleInPreview, i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // io.agora.rtc.RtcEngine
    public int clearVideoWatermarks() {
        return nativeClearVideoWatermarks(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableDualStreamMode(boolean z) {
        return setParameters(String.format("{\"rtc.dual_stream_mode\":%b,\"che.video.enableLowBitRateStream\":%d}", Boolean.valueOf(z), Integer.valueOf(z ? 1 : 0)));
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public void monitorHeadsetEvent(boolean z) {
        Logging.i(TAG, "enter monitorHeadsetEvent:" + z);
    }

    @Override // io.agora.rtc.RtcEngine
    @TargetApi(11)
    @Deprecated
    public void monitorBluetoothHeadsetEvent(boolean z) {
        Logging.i(TAG, "enter monitorBluetoothHeadsetEvent:" + z);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean enableHighPerfWifiMode(boolean z) {
        Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (z) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") != 0) {
                this.mWifiLock = null;
                return false;
            } else if (this.mWifiLock == null) {
                this.mWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock(3, "agora.voip.lock");
                return true;
            } else {
                return true;
            }
        }
        this.mWifiLock = null;
        return true;
    }

    public IRtcEngineEventHandler.RtcStats getRtcStats() {
        if (this.mRtcStats == null) {
            this.mRtcStats = new IRtcEngineEventHandler.RtcStats();
        }
        return this.mRtcStats;
    }

    public synchronized void updateRtcStats(RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats) {
        IRtcEngineEventHandler.RtcStats rtcStats = getRtcStats();
        if (rtcStats == null) {
            return;
        }
        rtcStats.totalDuration = pMediaResRtcStats.totalDuration;
        rtcStats.txBytes = pMediaResRtcStats.totalTxBytes;
        rtcStats.rxBytes = pMediaResRtcStats.totalRxBytes;
        rtcStats.txAudioBytes = pMediaResRtcStats.txAudioBytes;
        rtcStats.txVideoBytes = pMediaResRtcStats.txVideoBytes;
        rtcStats.rxAudioBytes = pMediaResRtcStats.rxAudioBytes;
        rtcStats.rxVideoBytes = pMediaResRtcStats.rxVideoBytes;
        rtcStats.txKBitRate = pMediaResRtcStats.txKBitRate;
        rtcStats.rxKBitRate = pMediaResRtcStats.rxKBitRate;
        rtcStats.txAudioKBitRate = pMediaResRtcStats.txAudioKBitRate;
        rtcStats.rxAudioKBitRate = pMediaResRtcStats.rxAudioKBitRate;
        rtcStats.txVideoKBitRate = pMediaResRtcStats.txVideoKBitRate;
        rtcStats.rxVideoKBitRate = pMediaResRtcStats.rxVideoKBitRate;
        rtcStats.lastmileDelay = pMediaResRtcStats.lastmileDelay;
        rtcStats.txPacketLossRate = pMediaResRtcStats.txPacketLossRate;
        rtcStats.rxPacketLossRate = pMediaResRtcStats.rxPacketLossRate;
        rtcStats.users = pMediaResRtcStats.users;
        rtcStats.cpuTotalUsage = pMediaResRtcStats.cpuTotalUsage / 100.0d;
        rtcStats.cpuAppUsage = pMediaResRtcStats.cpuAppUsage / 100.0d;
        rtcStats.gatewayRtt = pMediaResRtcStats.gatewayRtt;
        rtcStats.memoryAppUsageRatio = pMediaResRtcStats.memoryAppUsageRatio;
        rtcStats.memoryTotalUsageRatio = pMediaResRtcStats.memoryTotalUsageRatio;
        rtcStats.memoryAppUsageInKbytes = pMediaResRtcStats.memoryAppUsageInKbytes;
    }

    private void doMonitorSystemEvent(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && Connectivity.getNetworkType(context) == 2 && context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0 && this.mWifiLock != null) {
            this.mWifiLock.acquire();
            Logging.i(TAG, "hp connection mode detected");
        }
    }

    private int doCheckPermission(Context context) {
        if (checkVoipPermissions(context, this.mChannelProfile == 1 ? this.mClientRole : 1) != 0) {
            Logging.e(TAG, "can't join channel because no permission");
            return -9;
        }
        return 0;
    }

    private void doJoinChannelCheck(Context context) {
        if (joinChannelFirstTimeOrAllChannelLeft()) {
            doMonitorSystemEvent(context);
            doCheckPermission(context);
        }
    }

    private void doLeaveChannelCheck() {
        if (joinChannelFirstTimeOrAllChannelLeft()) {
            doStopMonitorSystemEvent();
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int joinChannel(String str, String str2, String str3, int i) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doJoinChannelCheck(context);
        int nativeJoinChannel = nativeJoinChannel(this.mNativeHandle, null, str, str2, str3, i);
        synchronized (this) {
            if (this.mDefaultRtcChannel == null) {
                this.mDefaultRtcChannel = new RtcChannelImpl();
            }
            if (nativeJoinChannel == 0) {
                this.mDefaultRtcChannel.initialize(this, nativeGetDefaultRtcChannel(this.mNativeHandle));
            }
        }
        return nativeJoinChannel;
    }

    @Override // io.agora.rtc.RtcEngine
    public int switchChannel(String str, String str2) {
        return nativeSwitchChannel(this.mNativeHandle, str, str2);
    }

    private void doStopMonitorSystemEvent() {
        if (this.mWifiLock == null || !this.mWifiLock.isHeld()) {
            return;
        }
        this.mWifiLock.release();
        Logging.i(TAG, "hp connection mode ended");
    }

    @Override // io.agora.rtc.RtcEngine
    public int leaveChannel() {
        synchronized (this) {
            if (this.mDefaultRtcChannel != null) {
                this.mDefaultRtcChannel = null;
            }
        }
        doLeaveChannelCheck();
        return nativeLeaveChannel(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startEchoTest() {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doMonitorSystemEvent(context);
        return nativeStartEchoTest(this.mNativeHandle, null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startEchoTest(int i) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doMonitorSystemEvent(context);
        return nativeStartEchoTestWithInterval(this.mNativeHandle, null, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopEchoTest() {
        return nativeStopEchoTest(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableLastmileTest() {
        return setParameter("rtc.lastmile_test", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int disableLastmileTest() {
        return setParameter("rtc.lastmile_test", false);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startLastmileProbeTest(LastmileProbeConfig lastmileProbeConfig) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doMonitorSystemEvent(context);
        return nativeStartLastmileProbeTest(this.mNativeHandle, null, lastmileProbeConfig.probeUplink, lastmileProbeConfig.probeDownlink, lastmileProbeConfig.expectedUplinkBitrate, lastmileProbeConfig.expectedDownlinkBitrate);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopLastmileProbeTest() {
        return nativeStopLastmileProbeTest(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableVideo() {
        this.mLocalVideoEnabled = true;
        return nativeEnableVideo(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int disableVideo() {
        this.mLocalVideoEnabled = false;
        return nativeDisableVideo(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableLocalVideo(boolean z) {
        this.mLocalVideoEnabled = z;
        return setParameters(String.format("{\"rtc.video.capture\":%b,\"che.video.local.capture\":%b,\"che.video.local.render\":%b,\"che.video.local.send\":%b}", Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int startPreview() {
        if (this.mVideoSourceType == 3) {
            return -4;
        }
        return nativeStartPreview(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopPreview() {
        return setParameter("rtc.video.preview", false);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableAudio() {
        return setParameters(formatString("{\"rtc.audio.enabled\":%b, \"che.audio.enable.recording.device\":%b}", Boolean.TRUE, Boolean.TRUE));
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableLocalAudio(boolean z) {
        return nativeEnableLocalAudio(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int disableAudio() {
        return setParameters(formatString("{\"rtc.audio.enabled\":%b, \"che.audio.enable.recording.device\":%b}", Boolean.FALSE, Boolean.FALSE));
    }

    @Override // io.agora.rtc.RtcEngine
    public int pauseAudio() {
        return setParameter("rtc.audio.paused", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int resumeAudio() {
        return setParameter("rtc.audio.paused", false);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteLocalAudioStream(boolean z) {
        return setParameters(formatString("{\"rtc.audio.mute_me\":%b, \"che.audio.mute_me\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteLocalVideoStream(boolean z) {
        return nativeMuteLocalVideoStream(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteAllRemoteAudioStreams(boolean z) {
        return setParameter("rtc.audio.mute_peers", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        return setParameter("rtc.audio.set_default_mute_peers", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteAllRemoteVideoStreams(boolean z) {
        return nativeMuteAllRemoteVideoStreams(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        return setParameter("rtc.video.set_default_mute_peers", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setBeautyEffectOptions(boolean z, BeautyOptions beautyOptions) {
        if (Build.VERSION.SDK_INT < 21) {
            return -4;
        }
        if (beautyOptions == null) {
            if (z) {
                return -2;
            }
            beautyOptions = new BeautyOptions();
        }
        return nativeSetBeautyEffectOptions(this.mNativeHandle, z, beautyOptions.lighteningContrastLevel, beautyOptions.lighteningLevel, beautyOptions.smoothnessLevel, beautyOptions.rednessLevel);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteRemoteAudioStream(int i, boolean z) {
        return setParameters(formatString("{\"rtc.audio.mute_peer\":{\"uid\":%d,\"mute\":%b}}", Long.valueOf(i & 4294967295L), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustUserPlaybackSignalVolume(int i, int i2) {
        return setParameters(formatString("{\"che.audio.playout.uid.volume\":{\"uid\":%d,\"volume\":%d}}", Long.valueOf(i & 4294967295L), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteRemoteVideoStream(int i, boolean z) {
        return setParameters(formatString("{\"rtc.video.mute_peer\":{\"uid\":%d,\"mute\":%b}}", Long.valueOf(i & 4294967295L), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int renewToken(String str) {
        if (str == null) {
            return -2;
        }
        return setParameter("rtc.renew_token", str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerLocalUserAccount(String str, String str2) {
        if (str == null || str2 == null) {
            return -2;
        }
        return nativeRegisterLocalUserAccount(this.mNativeHandle, str, str2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int joinChannelWithUserAccount(String str, String str2, String str3) {
        int nativeJoinChannelWithUserAccount = nativeJoinChannelWithUserAccount(this.mNativeHandle, str, str2, str3);
        synchronized (this) {
            if (this.mDefaultRtcChannel == null) {
                this.mDefaultRtcChannel = new RtcChannelImpl();
            }
            if (nativeJoinChannelWithUserAccount == 0) {
                this.mDefaultRtcChannel.initialize(this, nativeGetDefaultRtcChannel(this.mNativeHandle));
            }
        }
        return nativeJoinChannelWithUserAccount;
    }

    @Override // io.agora.rtc.RtcEngine
    public int getUserInfoByUserAccount(String str, UserInfo userInfo) {
        return nativeGetUserInfoByUserAccount(this.mNativeHandle, str, userInfo);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getUserInfoByUid(int i, UserInfo userInfo) {
        return nativeGetUserInfoByUid(this.mNativeHandle, i, userInfo);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setDefaultAudioRoutetoSpeakerphone(boolean z) {
        Logging.i(String.format("API call to setDefaultAudioRoutetoSpeakerphone :%b", Boolean.valueOf(z)));
        return nativeSetDefaultAudioRoutetoSpeakerphone(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setEnableSpeakerphone(boolean z) {
        Logging.i(String.format("API call to setEnableSpeakerphone to %b", Boolean.valueOf(z)));
        return nativeSetEnableSpeakerphone(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isSpeakerphoneEnabled() {
        return nativeIsSpeakerphoneEnabled(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustRecordingSignalVolume(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 400) {
            i = 400;
        }
        return setParameter("che.audio.record.signal.volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustPlaybackSignalVolume(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 400) {
            i = 400;
        }
        return setParameter("che.audio.playout.signal.volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4) {
        return setParameterObject("che.audio.set_capture_raw_audio_format", formatString("{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4) {
        return setParameterObject("che.audio.set_render_raw_audio_format", formatString("{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setMixedAudioFrameParameters(int i, int i2) {
        return setParameterObject("che.audio.set_mixed_raw_audio_format", formatString("{\"sampleRate\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3) {
        return setParameterObject("che.audio.codec.hq", formatString("{\"fullband\":%b,\"stereo\":%b,\"fullBitrate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableInEarMonitoring(boolean z) {
        return setParameter("che.audio.headset.monitoring", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableWebSdkInteroperability(boolean z) {
        return setParameters(String.format("{\"rtc.video.web_h264_interop_enable\":%b,\"che.video.web_h264_interop_enable\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoQualityParameters(boolean z) {
        return setParameters(String.format("{\"rtc.video.prefer_frame_rate\":%b,\"che.video.prefer_frame_rate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableAudioVolumeIndication(int i, int i2, boolean z) {
        if (i < 0) {
            i = 0;
        }
        return z ? setParameterObject("che.audio.volume_indication", formatString("{\"interval\":%d,\"smooth\":%d,\"vad\":%d}", Integer.valueOf(i), Integer.valueOf(i2), 1)) : setParameterObject("che.audio.volume_indication", formatString("{\"interval\":%d,\"smooth\":%d,\"vad\":%d}", Integer.valueOf(i), Integer.valueOf(i2), 0));
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int enableAudioQualityIndication(boolean z) {
        return setParameter("rtc.audio_quality_indication", z);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int enableTransportQualityIndication(boolean z) {
        return setParameter("rtc.transport_quality_indication", z);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int playRecap() {
        return setParameter("che.audio.recap.start_play", true);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int enableRecap(int i) {
        if (i < 0) {
            i = 0;
        }
        return setParameter("che.audio.recap.interval", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoProfile(int i, boolean z) {
        if (i < 0) {
            return -2;
        }
        return setParameters(formatString("{\"rtc.video.profile\":[%d,%b]}", Integer.valueOf(i), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoProfile(int i, int i2, int i3, int i4) {
        return nativeSetVideoProfileEx(this.mNativeHandle, i, i2, i3, i4);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        return nativeSetVideoEncoderConfiguration(this.mNativeHandle, videoEncoderConfiguration.dimensions.width, videoEncoderConfiguration.dimensions.height, videoEncoderConfiguration.frameRate, videoEncoderConfiguration.minFrameRate, videoEncoderConfiguration.bitrate, videoEncoderConfiguration.minBitrate, videoEncoderConfiguration.orientationMode.getValue(), videoEncoderConfiguration.degradationPrefer.getValue(), videoEncoderConfiguration.mirrorMode);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioProfile(int i, int i2) {
        return nativeSetAudioProfile(this.mNativeHandle, i, i2);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int monitorAudioRouteChange(boolean z) {
        Logging.i("API call monitorAudioRouteChange:" + z);
        return 0;
    }

    @Override // io.agora.rtc.RtcEngine
    public int switchCamera() {
        if (this.mVideoSourceType != 1) {
            return -1;
        }
        return nativeSwitchCamera(this.mNativeHandle);
    }

    private int switchCamera(CameraCapturerConfiguration.CAMERA_DIRECTION camera_direction) {
        if (this.mVideoSourceType != 1) {
            return -1;
        }
        return nativeSwitchCameraByDirection(this.mNativeHandle, camera_direction.getValue());
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraZoomSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.zoom_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraTorchSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.torch_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraFocusSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.focus_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraExposurePositionSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.exposure_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraAutoFocusFaceModeSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.face_focus_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraZoomFactor(float f) {
        return setParameter("che.video.camera.zoom", f);
    }

    @Override // io.agora.rtc.RtcEngine
    public float getCameraMaxZoomFactor() {
        String nativeGetParameter = nativeGetParameter(this.mNativeHandle, "che.video.camera.get_max_zoom", null);
        if (nativeGetParameter == null) {
            return 1.0f;
        }
        return Double.valueOf(nativeGetParameter).floatValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraFocusPositionInPreview(float f, float f2) {
        return setParameterObject("che.video.camera.focus", formatString("{\"x\":%f,\"y\":%f,\"preview\":%b}", Float.valueOf(f), Float.valueOf(f2), Boolean.TRUE));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraExposurePosition(float f, float f2) {
        return setParameterObject("che.video.camera.exposure", formatString("{\"x\":%f,\"y\":%f,\"preview\":%b}", Float.valueOf(f), Float.valueOf(f2), Boolean.TRUE));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraTorchOn(boolean z) {
        return setParameter("che.video.camera.flash", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraAutoFocusFaceModeEnabled(boolean z) {
        return setParameter("che.video.camera.face_detection", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableFaceDetection(boolean z) {
        return setParameter("che.video.faceDistance", z);
    }

    public int enableRemoteVideo(boolean z, int i) {
        return setParameterObject("che.video.peer.receive", formatString("{\"enable\":%b, \"uid\":%d}", Boolean.valueOf(z), Long.valueOf(i & 4294967295L)));
    }

    public int stopRemoteVideo(int i) {
        return setParameter("che.video.peer.stop_video", i & 4294967295L);
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public int stopAllRemoteVideo() {
        return setParameter("che.video.peer.stop_all_renders", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioRecording(String str, int i) {
        return startAudioRecording(str, 32000, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioRecording(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        return setParameterObject("che.audio.start_recording", formatString("{\"filePath\":\"%s\", \"sampleRate\":%d, \"quality\":%d}", str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopAudioRecording() {
        return setParameter("che.audio.stop_recording", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        return setParameterObject("che.audio.start_file_as_playout", formatString("{\"filePath\":\"%s\", \"loopback\":%b, \"replace\":%b, \"cycle\":%d}", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopAudioMixing() {
        return setParameter("che.audio.stop_file_as_playout", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int pauseAudioMixing() {
        return setParameter("che.audio.pause_file_as_playout", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int resumeAudioMixing() {
        return setParameter("che.audio.pause_file_as_playout", false);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustAudioMixingVolume(int i) {
        int adjustAudioMixingPlayoutVolume = adjustAudioMixingPlayoutVolume(i);
        if (adjustAudioMixingPlayoutVolume == 0) {
            adjustAudioMixingPublishVolume(i);
        }
        return adjustAudioMixingPlayoutVolume;
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustAudioMixingPlayoutVolume(int i) {
        return setParameter("che.audio.set_file_as_playout_volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustAudioMixingPublishVolume(int i) {
        return setParameter("che.audio.set_file_as_playout_publish_volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingPlayoutVolume() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_file_as_playout_volume", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingPublishVolume() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_file_as_playout_publish_volume", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingDuration() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_mixing_file_length_ms", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingCurrentPosition() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_mixing_file_played_ms", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioMixingPosition(int i) {
        return setParameter("che.audio.mixing.file.position", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioMixingPitch(int i) {
        if (i > 12 || i < -12) {
            return -2;
        }
        return setParameter("che.audio.set_playout_file_pitch_semitones", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int useExternalAudioDevice() {
        return setParameters("{\"che.audio.audioSampleRate\":32000, \"che.audio.external_device\":true}");
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        return nativeRegisterAudioFrameObserver(this.mNativeHandle, iAudioFrameObserver);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setExternalAudioSink(boolean z, int i, int i2) {
        return z ? setParameters(formatString("{\"che.audio.external_render\":%b,\"che.audio.external_render.pull\":%b,\"che.audio.set_render_raw_audio_format\":{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d}}", Boolean.valueOf(z), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), 0)) : setParameters(formatString("{\"che.audio.external_render\":%b,\"che.audio.external_render\":%b,\"che.audio.external_render.pull\":%b}", Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int pullPlaybackAudioFrame(byte[] bArr, int i) {
        return nativePullAudioFrame(this.mNativeHandle, bArr, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setExternalAudioSource(boolean z, int i, int i2) {
        this.mExAudioSampleRate = i;
        this.mExAudioChannels = i2;
        return z ? setParameters(formatString("{\"che.audio.external_capture\":%b,\"che.audio.external_capture.push\":%b,\"che.audio.set_capture_raw_audio_format\":{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d}}", Boolean.valueOf(z), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), 2)) : setParameters(formatString("{\"che.audio.external_capture\":%b,\"che.audio.external_capture\":%b,\"che.audio.external_capture.push\":%b}", Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int pushExternalAudioFrame(byte[] bArr, long j) {
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, bArr, j, this.mExAudioSampleRate, this.mExAudioChannels);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogFile(String str) {
        return setParameter("rtc.log_file", str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogFilter(int i) {
        return setParameter("rtc.log_filter", i & Constants.LOG_FILTER_DEBUG);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogFileSize(int i) {
        return setParameter("rtc.log_size", i);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setProfile(String str, boolean z) {
        return nativeSetProfile(this.mNativeHandle, str, z);
    }

    public String getProfile() {
        return nativeGetProfile(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setAppType(int i) {
        return nativeSetAppType(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setParameters(String str) {
        return nativeSetParameters(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public String getParameters(String str) {
        return nativeGetParameters(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public String getParameter(String str, String str2) {
        return nativeGetParameter(this.mNativeHandle, str, str2);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public String makeQualityReportUrl(String str, int i, int i2, int i3) {
        return nativeMakeQualityReportUrl(this.mNativeHandle, str, i, i2, i3);
    }

    @Override // io.agora.rtc.RtcEngine
    public String getCallId() {
        return nativeGetCallId(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int rate(String str, int i, String str2) {
        return nativeRate(this.mNativeHandle, str, i, str2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int complain(String str, String str2) {
        return nativeComplain(this.mNativeHandle, str, str2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setChannelProfile(int i) {
        if (i == 0) {
            setClientRole(1);
        }
        return nativeSetChannelProfile(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setClientRole(int i) {
        return nativeSetClientRole(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraCapturerConfiguration(CameraCapturerConfiguration cameraCapturerConfiguration) {
        int parameter = setParameter("che.video.camera_capture_mode", cameraCapturerConfiguration.preference.getValue());
        return parameter == 0 ? switchCamera(cameraCapturerConfiguration.cameraDirection) : parameter;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteVideoStreamType(int i, int i2) {
        long j = i & 4294967295L;
        return setParameters(formatString("{\"rtc.video.set_remote_video_stream\":{\"uid\":%d,\"stream\":%d},\"che.video.setstream\":{\"uid\":%d,\"stream\":%d}}", Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteUserPriority(int i, int i2) {
        return nativeSetRemoteUserPriority(this.mNativeHandle, i, i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteDefaultVideoStreamType(int i) {
        return setParameter("rtc.video.set_remote_default_video_stream_type", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalPublishFallbackOption(int i) {
        return setParameter("rtc.local_publish_fallback_option", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteSubscribeFallbackOption(int i) {
        return setParameter("rtc.remote_subscribe_fallback_option", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setEncryptionMode(String str) {
        return setParameter("rtc.encryption.mode", str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setEncryptionSecret(String str) {
        return nativeSetEncryptionSecret(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableEncryption(boolean z, EncryptionConfig encryptionConfig) {
        return nativeEnableEncryption(this.mNativeHandle, z, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey);
    }

    protected void onEvent(int i, byte[] bArr) {
        try {
            Iterator<IRtcEngineEventHandler> it = this.mRtcHandlers.keySet().iterator();
            while (it.hasNext()) {
                IRtcEngineEventHandler next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    handleEvent(i, bArr, next);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "onEvent: " + e.toString());
        }
    }

    protected void onChannelEvent(String str, int i, byte[] bArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        RtcChannelImpl rtcChannelImpl = null;
        synchronized (this) {
            Iterator<RtcChannelImpl> it = this.mRtcChannels.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RtcChannelImpl next = it.next();
                if (next.channelId() != null && next.channelId().equals(str)) {
                    rtcChannelImpl = next;
                    break;
                }
            }
        }
        if (rtcChannelImpl == null || !rtcChannelImpl.isInitialized() || rtcChannelImpl.getEventHandler() == null) {
            return;
        }
        handleChannelEvent(i, bArr, rtcChannelImpl.getEventHandler(), rtcChannelImpl);
    }

    protected void handleEvent(int i, byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (iRtcEngineEventHandler == null) {
            return;
        }
        switch (i) {
            case 100:
                sendLogEvent(bArr);
                return;
            case 101:
                RtcEngineMessage.PError pError = new RtcEngineMessage.PError();
                pError.unmarshall(bArr);
                if ((pError.err >= 1151 && pError.err <= 1164) || (pError.err >= 1001 && pError.err < 1033 && getParameters("[\"che.audio.adm.active\"]").equals("2"))) {
                    Logging.e(TAG, "ADM Error code " + pError.err + " restart ADM");
                    setParameter("che.audio.opensl", false);
                    setParameters("che.audio.restart");
                }
                iRtcEngineEventHandler.onError(pError.err);
                return;
            case 102:
                RtcEngineMessage.PError pError2 = new RtcEngineMessage.PError();
                pError2.unmarshall(bArr);
                if ((pError2.err == 1019 || pError2.err == 1052) && getParameters("[\"che.audio.adm.active\"]").equals("2")) {
                    Logging.e(TAG, "ADM Error code " + pError2.err + " restart ADM");
                    setParameter("che.audio.opensl", false);
                    setParameters("che.audio.restart");
                }
                iRtcEngineEventHandler.onWarning(pError2.err);
                return;
            default:
                switch (i) {
                    case 1005:
                        iRtcEngineEventHandler.onCameraReady();
                        return;
                    case 1006:
                        iRtcEngineEventHandler.onMediaEngineStartCallSuccess();
                        return;
                    case 1007:
                        iRtcEngineEventHandler.onVideoStopped();
                        return;
                    default:
                        switch (i) {
                            case 1101:
                                RtcEngineMessage.PMediaResTransportQuality pMediaResTransportQuality = new RtcEngineMessage.PMediaResTransportQuality();
                                pMediaResTransportQuality.unmarshall(bArr);
                                if (pMediaResTransportQuality.isAudio) {
                                    ((IRtcEngineEventHandlerEx) iRtcEngineEventHandler).onAudioTransportQuality(pMediaResTransportQuality.peer_uid, pMediaResTransportQuality.bitrate, pMediaResTransportQuality.delay, pMediaResTransportQuality.lost);
                                    return;
                                } else {
                                    ((IRtcEngineEventHandlerEx) iRtcEngineEventHandler).onVideoTransportQuality(pMediaResTransportQuality.peer_uid, pMediaResTransportQuality.bitrate, pMediaResTransportQuality.delay, pMediaResTransportQuality.lost);
                                    return;
                                }
                            case 1102:
                                RtcEngineMessage.PMediaResAudioQuality pMediaResAudioQuality = new RtcEngineMessage.PMediaResAudioQuality();
                                pMediaResAudioQuality.unmarshall(bArr);
                                iRtcEngineEventHandler.onAudioQuality(pMediaResAudioQuality.peer_uid, pMediaResAudioQuality.quality, pMediaResAudioQuality.delay, pMediaResAudioQuality.lost);
                                return;
                            default:
                                switch (i) {
                                    case 1108:
                                        iRtcEngineEventHandler.onRequestToken();
                                        return;
                                    case 1109:
                                        RtcEngineMessage.PClientRoleChanged pClientRoleChanged = new RtcEngineMessage.PClientRoleChanged();
                                        pClientRoleChanged.unmarshall(bArr);
                                        iRtcEngineEventHandler.onClientRoleChanged(pClientRoleChanged.oldRole, pClientRoleChanged.newRole);
                                        return;
                                    case 1110:
                                        RtcEngineMessage.PStreamPublished pStreamPublished = new RtcEngineMessage.PStreamPublished();
                                        pStreamPublished.unmarshall(bArr);
                                        iRtcEngineEventHandler.onStreamPublished(pStreamPublished.url, pStreamPublished.error);
                                        return;
                                    case 1111:
                                        RtcEngineMessage.PStreamUnPublished pStreamUnPublished = new RtcEngineMessage.PStreamUnPublished();
                                        pStreamUnPublished.unmarshall(bArr);
                                        iRtcEngineEventHandler.onStreamUnpublished(pStreamUnPublished.url);
                                        return;
                                    case RtcEngineEvent.EvtType.EVT_LIVE_TRANSCODING /* 1112 */:
                                        iRtcEngineEventHandler.onTranscodingUpdated();
                                        return;
                                    default:
                                        switch (i) {
                                            case RtcEngineEvent.EvtType.EVT_STREAM_INJECTED_STATUS /* 1116 */:
                                                RtcEngineMessage.PStreamInjectedStatus pStreamInjectedStatus = new RtcEngineMessage.PStreamInjectedStatus();
                                                pStreamInjectedStatus.unmarshall(bArr);
                                                iRtcEngineEventHandler.onStreamInjectedStatus(pStreamInjectedStatus.url, pStreamInjectedStatus.uid, pStreamInjectedStatus.status);
                                                return;
                                            case RtcEngineEvent.EvtType.EVT_PRIVILEGE_WILL_EXPIRE /* 1117 */:
                                                RtcEngineMessage.PPrivilegeWillExpire pPrivilegeWillExpire = new RtcEngineMessage.PPrivilegeWillExpire();
                                                pPrivilegeWillExpire.unmarshall(bArr);
                                                iRtcEngineEventHandler.onTokenPrivilegeWillExpire(pPrivilegeWillExpire.token);
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STATE_CHANGED /* 1118 */:
                                                RtcEngineMessage.PMediaResLocalVideoStateChanged pMediaResLocalVideoStateChanged = new RtcEngineMessage.PMediaResLocalVideoStateChanged();
                                                pMediaResLocalVideoStateChanged.unmarshall(bArr);
                                                iRtcEngineEventHandler.onLocalVideoStateChanged(pMediaResLocalVideoStateChanged.localVideoState, pMediaResLocalVideoStateChanged.error);
                                                return;
                                            case RtcEngineEvent.EvtType.EVT_RTMP_STREAMING_STATE /* 1119 */:
                                                RtcEngineMessage.PRtmpStreamingState pRtmpStreamingState = new RtcEngineMessage.PRtmpStreamingState();
                                                pRtmpStreamingState.unmarshall(bArr);
                                                iRtcEngineEventHandler.onRtmpStreamingStateChanged(pRtmpStreamingState.url, pRtmpStreamingState.state, pRtmpStreamingState.error);
                                                return;
                                            case RtcEngineEvent.EvtType.EVT_STREAM_EVENT /* 1120 */:
                                                RtcEngineMessage.PStreamEvent pStreamEvent = new RtcEngineMessage.PStreamEvent();
                                                pStreamEvent.unmarshall(bArr);
                                                iRtcEngineEventHandler.onRtmpStreamingEvent(pStreamEvent.url, pStreamEvent.error);
                                                return;
                                            default:
                                                switch (i) {
                                                    case RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL /* 13006 */:
                                                        Context context = this.mContext.get();
                                                        if (context != null) {
                                                            getAudioManager(context).setMode(0);
                                                        }
                                                        RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats = new RtcEngineMessage.PMediaResRtcStats();
                                                        pMediaResRtcStats.unmarshall(bArr);
                                                        updateRtcStats(pMediaResRtcStats);
                                                        iRtcEngineEventHandler.onLeaveChannel(getRtcStats());
                                                        return;
                                                    case RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY /* 13007 */:
                                                        RtcEngineMessage.PMediaResNetworkQuality pMediaResNetworkQuality = new RtcEngineMessage.PMediaResNetworkQuality();
                                                        pMediaResNetworkQuality.unmarshall(bArr);
                                                        iRtcEngineEventHandler.onNetworkQuality(pMediaResNetworkQuality.uid, pMediaResNetworkQuality.txQuality, pMediaResNetworkQuality.rxQuality);
                                                        return;
                                                    case RtcEngineEvent.EvtType.EVT_USER_OFFLINE /* 13008 */:
                                                        RtcEngineMessage.PMediaResUserOfflineEvent pMediaResUserOfflineEvent = new RtcEngineMessage.PMediaResUserOfflineEvent();
                                                        pMediaResUserOfflineEvent.unmarshall(bArr);
                                                        iRtcEngineEventHandler.onUserOffline(pMediaResUserOfflineEvent.uid, pMediaResUserOfflineEvent.reason);
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case RtcEngineEvent.EvtType.EVT_USER_JOINED /* 13013 */:
                                                                RtcEngineMessage.PMediaResUserJoinedEvent pMediaResUserJoinedEvent = new RtcEngineMessage.PMediaResUserJoinedEvent();
                                                                pMediaResUserJoinedEvent.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserJoined(pMediaResUserJoinedEvent.uid, pMediaResUserJoinedEvent.elapsed);
                                                                return;
                                                            case RtcEngineEvent.EvtType.EVT_USER_MUTE_AUDIO /* 13014 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserMuteAudio(pMediaResUserState.uid, pMediaResUserState.state);
                                                                return;
                                                            case RtcEngineEvent.EvtType.EVT_USER_MUTE_VIDEO /* 13015 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState2 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState2.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserMuteVideo(pMediaResUserState2.uid, pMediaResUserState2.state);
                                                                return;
                                                            case RtcEngineEvent.EvtType.EVT_USER_ENABLE_VIDEO /* 13016 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState3 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState3.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserEnableVideo(pMediaResUserState3.uid, pMediaResUserState3.state);
                                                                return;
                                                            case RtcEngineEvent.EvtType.EVT_LASTMILE_QUALITY /* 13017 */:
                                                                RtcEngineMessage.PMediaResLastmileQuality pMediaResLastmileQuality = new RtcEngineMessage.PMediaResLastmileQuality();
                                                                pMediaResLastmileQuality.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onLastmileQuality(pMediaResLastmileQuality.quality);
                                                                return;
                                                            case RtcEngineEvent.EvtType.AUDIO_EFFECT_FINISHED /* 13018 */:
                                                                RtcEngineMessage.PMediaResAudioEffectFinished pMediaResAudioEffectFinished = new RtcEngineMessage.PMediaResAudioEffectFinished();
                                                                pMediaResAudioEffectFinished.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onAudioEffectFinished(pMediaResAudioEffectFinished.soundId);
                                                                return;
                                                            case RtcEngineEvent.EvtType.EVT_USER_ENABLE_LOCAL_VIDEO /* 13019 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState4 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState4.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserEnableLocalVideo(pMediaResUserState4.uid, pMediaResUserState4.state);
                                                                return;
                                                            case RtcEngineEvent.EvtType.EVT_LASTMILE_PROBE_RESULT /* 13020 */:
                                                                RtcEngineMessage.PMediaResLastmileProbeResult pMediaResLastmileProbeResult = new RtcEngineMessage.PMediaResLastmileProbeResult();
                                                                pMediaResLastmileProbeResult.unmarshall(bArr);
                                                                IRtcEngineEventHandler.LastmileProbeResult lastmileProbeResult = new IRtcEngineEventHandler.LastmileProbeResult();
                                                                lastmileProbeResult.state = pMediaResLastmileProbeResult.state;
                                                                lastmileProbeResult.rtt = pMediaResLastmileProbeResult.rtt;
                                                                lastmileProbeResult.uplinkReport.packetLossRate = pMediaResLastmileProbeResult.uplinkReport.packetLossRate;
                                                                lastmileProbeResult.uplinkReport.jitter = pMediaResLastmileProbeResult.uplinkReport.jitter;
                                                                lastmileProbeResult.uplinkReport.availableBandwidth = pMediaResLastmileProbeResult.uplinkReport.availableBandwidth;
                                                                lastmileProbeResult.downlinkReport.packetLossRate = pMediaResLastmileProbeResult.downlinkReport.packetLossRate;
                                                                lastmileProbeResult.downlinkReport.jitter = pMediaResLastmileProbeResult.downlinkReport.jitter;
                                                                lastmileProbeResult.downlinkReport.availableBandwidth = pMediaResLastmileProbeResult.downlinkReport.availableBandwidth;
                                                                iRtcEngineEventHandler.onLastmileProbeResult(lastmileProbeResult);
                                                                return;
                                                            default:
                                                                switch (i) {
                                                                    case RtcEngineEvent.EvtType.EVT_RECAP_INDICATION /* 14000 */:
                                                                        ((IRtcEngineEventHandlerEx) iRtcEngineEventHandler).onRecap(bArr);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION /* 14001 */:
                                                                        onSpeakersReport(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME /* 14002 */:
                                                                        onFirstRemoteVideoFrame(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT /* 14003 */:
                                                                        onLocalVideoStat(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STAT /* 14004 */:
                                                                        onRemoteVideoStat(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME /* 14005 */:
                                                                        onFirstLocalVideoFrame(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME_PUBLISH /* 14006 */:
                                                                        onFirstLocalVideoFramePublished(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_DECODED /* 14007 */:
                                                                        onFirstRemoteVideoDecoded(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_CONNECTION_LOST /* 14008 */:
                                                                        iRtcEngineEventHandler.onConnectionLost();
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE /* 14009 */:
                                                                        onStreamMessage(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_CONNECTION_INTERRUPTED /* 14010 */:
                                                                        iRtcEngineEventHandler.onConnectionInterrupted();
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.QUERY_RECORDING_SERVICE_STATUS /* 14011 */:
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR /* 14012 */:
                                                                        onStreamMessageError(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED /* 14013 */:
                                                                        onVideoSizeChanged(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.FIRST_LOCAL_AUDIO_FRAME /* 14014 */:
                                                                        onFirstLocalAudioFrame(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.FIRST_REMOTE_AUDIO_FRAME /* 14015 */:
                                                                        onFirstRemoteAudioFrame(bArr, iRtcEngineEventHandler);
                                                                        return;
                                                                    case RtcEngineEvent.EvtType.EVT_ACTIVE_SPEAKER /* 14016 */:
                                                                        RtcEngineMessage.PActiveSpeaker pActiveSpeaker = new RtcEngineMessage.PActiveSpeaker();
                                                                        pActiveSpeaker.unmarshall(bArr);
                                                                        iRtcEngineEventHandler.onActiveSpeaker(pActiveSpeaker.uid);
                                                                        return;
                                                                    default:
                                                                        switch (i) {
                                                                            case RtcEngineEvent.EvtType.EVT_CONNECTION_BANNED /* 14019 */:
                                                                                iRtcEngineEventHandler.onConnectionBanned();
                                                                                return;
                                                                            case RtcEngineEvent.EvtType.EVT_CAMERA_FOCUS_AREA_CHANGED /* 14020 */:
                                                                                onCameraFocusAreaChanged(bArr, iRtcEngineEventHandler);
                                                                                return;
                                                                            default:
                                                                                switch (i) {
                                                                                    case RtcEngineEvent.EvtType.EVT_LOCAL_PUBLISH_FALLBACK_TO_AUDIO_ONLY /* 14022 */:
                                                                                        RtcEngineMessage.PLocalFallbackStatus pLocalFallbackStatus = new RtcEngineMessage.PLocalFallbackStatus();
                                                                                        pLocalFallbackStatus.unmarshall(bArr);
                                                                                        iRtcEngineEventHandler.onLocalPublishFallbackToAudioOnly(pLocalFallbackStatus.state);
                                                                                        return;
                                                                                    case RtcEngineEvent.EvtType.EVT_REMOTE_SUBSCRIBE_FALLBACK_TO_AUDIO_ONLY /* 14023 */:
                                                                                        RtcEngineMessage.PMediaResUserState pMediaResUserState5 = new RtcEngineMessage.PMediaResUserState();
                                                                                        pMediaResUserState5.unmarshall(bArr);
                                                                                        iRtcEngineEventHandler.onRemoteSubscribeFallbackToAudioOnly(pMediaResUserState5.uid, pMediaResUserState5.state);
                                                                                        return;
                                                                                    case RtcEngineEvent.EvtType.EVT_USER_TRANSPORT_STAT /* 14024 */:
                                                                                        RtcEngineMessage.PUserTransportStat pUserTransportStat = new RtcEngineMessage.PUserTransportStat();
                                                                                        pUserTransportStat.unmarshall(bArr);
                                                                                        if (pUserTransportStat.isAudio) {
                                                                                            iRtcEngineEventHandler.onRemoteAudioTransportStats(pUserTransportStat.peer_uid, pUserTransportStat.delay, pUserTransportStat.lost, pUserTransportStat.rxKBitRate);
                                                                                            return;
                                                                                        } else {
                                                                                            iRtcEngineEventHandler.onRemoteVideoTransportStats(pUserTransportStat.peer_uid, pUserTransportStat.delay, pUserTransportStat.lost, pUserTransportStat.rxKBitRate);
                                                                                            return;
                                                                                        }
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case RtcEngineEvent.EvtType.EVT_CONNECTION_STATE_CHANGED /* 14028 */:
                                                                                                RtcEngineMessage.PConnectionState pConnectionState = new RtcEngineMessage.PConnectionState();
                                                                                                pConnectionState.unmarshall(bArr);
                                                                                                iRtcEngineEventHandler.onConnectionStateChanged(pConnectionState.state, pConnectionState.reason);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_CAMERA_EXPOSURE_AREA_CHANGED /* 14029 */:
                                                                                                onCameraExposureAreaChanged(bArr, iRtcEngineEventHandler);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STAT /* 14030 */:
                                                                                                onRemoteAudioStat(bArr, iRtcEngineEventHandler);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_NETWORK_TYPE_CHANGED /* 14031 */:
                                                                                                RtcEngineMessage.PNetworkTypeChanged pNetworkTypeChanged = new RtcEngineMessage.PNetworkTypeChanged();
                                                                                                pNetworkTypeChanged.unmarshall(bArr);
                                                                                                iRtcEngineEventHandler.onNetworkTypeChanged(pNetworkTypeChanged.type);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_AUDIO_ROUTING_CHANGED /* 14032 */:
                                                                                                RtcEngineMessage.PAudioRoutingChanged pAudioRoutingChanged = new RtcEngineMessage.PAudioRoutingChanged();
                                                                                                pAudioRoutingChanged.unmarshall(bArr);
                                                                                                iRtcEngineEventHandler.onAudioRouteChanged(pAudioRoutingChanged.routing);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_AUDIO_DECODED /* 14033 */:
                                                                                                RtcEngineMessage.PMediaResFirstRemoteAudioDecoded pMediaResFirstRemoteAudioDecoded = new RtcEngineMessage.PMediaResFirstRemoteAudioDecoded();
                                                                                                pMediaResFirstRemoteAudioDecoded.unmarshall(bArr);
                                                                                                iRtcEngineEventHandler.onFirstRemoteAudioDecoded(pMediaResFirstRemoteAudioDecoded.uid, pMediaResFirstRemoteAudioDecoded.elapsed);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_LOCAL_USER_REGISTERED /* 14034 */:
                                                                                                RtcEngineMessage.PUserAccountInfo pUserAccountInfo = new RtcEngineMessage.PUserAccountInfo();
                                                                                                pUserAccountInfo.unmarshall(bArr);
                                                                                                iRtcEngineEventHandler.onLocalUserRegistered(pUserAccountInfo.uid, pUserAccountInfo.userAccount);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_USER_INFO_UPDATED /* 14035 */:
                                                                                                RtcEngineMessage.PUserAccountInfo pUserAccountInfo2 = new RtcEngineMessage.PUserAccountInfo();
                                                                                                pUserAccountInfo2.unmarshall(bArr);
                                                                                                UserInfo userInfo = new UserInfo();
                                                                                                userInfo.uid = pUserAccountInfo2.uid;
                                                                                                userInfo.userAccount = pUserAccountInfo2.userAccount;
                                                                                                iRtcEngineEventHandler.onUserInfoUpdated(pUserAccountInfo2.uid, userInfo);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STATE_CHANGED_EXT /* 14036 */:
                                                                                                onRemoteVideoStateChangedExt(bArr, iRtcEngineEventHandler);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_STATE /* 14037 */:
                                                                                                onChannelMediaRelayStateChanged(bArr, iRtcEngineEventHandler);
                                                                                                return;
                                                                                            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_EVENT /* 14038 */:
                                                                                                onChannelMediaRelayEvent(bArr, iRtcEngineEventHandler);
                                                                                                return;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STATE_CHANGED /* 14040 */:
                                                                                                        onRemoteAudioStateChanged(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_LOCAL_AUDIO_STAT /* 14041 */:
                                                                                                        onLocalAudioStat(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_LOCAL_AUDIO_STATE_CHANGED /* 14042 */:
                                                                                                        RtcEngineMessage.PMediaResLocalAudioStateChanged pMediaResLocalAudioStateChanged = new RtcEngineMessage.PMediaResLocalAudioStateChanged();
                                                                                                        pMediaResLocalAudioStateChanged.unmarshall(bArr);
                                                                                                        iRtcEngineEventHandler.onLocalAudioStateChanged(pMediaResLocalAudioStateChanged.state, pMediaResLocalAudioStateChanged.error);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_FACE_DETECT_VALUE /* 14043 */:
                                                                                                        onFacePositionChanged(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.FIRST_LOCAL_AUDIO_FRAME_PUBLISHED /* 14044 */:
                                                                                                        onFirstLocalAudioFramePublished(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_PUBLISH_AUDIO_STATE_CHANGED /* 14045 */:
                                                                                                        onAudioPublishStateChanged(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_PUBLISH_VIDEO_STATE_CHANGED /* 14046 */:
                                                                                                        onVideoPublishStateChanged(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_AUDIO_STATE_CHANGED /* 14047 */:
                                                                                                        onAudioSubscribeStateChanged(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_VIDEO_STATE_CHANGED /* 14048 */:
                                                                                                        onVideoSubscribeStateChanged(bArr, iRtcEngineEventHandler);
                                                                                                        return;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 1002:
                                                                                                                break;
                                                                                                            case 1104:
                                                                                                                RtcEngineMessage.PMediaEngineEvent pMediaEngineEvent = new RtcEngineMessage.PMediaEngineEvent();
                                                                                                                pMediaEngineEvent.unmarshall(bArr);
                                                                                                                int i2 = pMediaEngineEvent.code;
                                                                                                                if (i2 == 10) {
                                                                                                                    iRtcEngineEventHandler.onAudioMixingFinished();
                                                                                                                    return;
                                                                                                                }
                                                                                                                switch (i2) {
                                                                                                                    case 14:
                                                                                                                        iRtcEngineEventHandler.onMicrophoneEnabled(true);
                                                                                                                        return;
                                                                                                                    case 15:
                                                                                                                        iRtcEngineEventHandler.onMicrophoneEnabled(false);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        switch (i2) {
                                                                                                                            case 20:
                                                                                                                            case 21:
                                                                                                                            case 22:
                                                                                                                            case 23:
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                if (pMediaEngineEvent.code < 701 || pMediaEngineEvent.code > 713) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                if (pMediaEngineEvent.code >= 701 && pMediaEngineEvent.code <= 703) {
                                                                                                                                    iRtcEngineEventHandler.onAudioMixingStateChanged(Constants.MEDIA_ENGINE_AUDIO_EVENT_MIXING_ERROR, pMediaEngineEvent.code);
                                                                                                                                    return;
                                                                                                                                } else if (pMediaEngineEvent.code != 712) {
                                                                                                                                    iRtcEngineEventHandler.onAudioMixingStateChanged(pMediaEngineEvent.code, 0);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    Logging.d(TAG, "AudioMixing restart");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                            case 1106:
                                                                                                                onApiCallExecuted(bArr, iRtcEngineEventHandler);
                                                                                                                return;
                                                                                                            case 10001:
                                                                                                                new RtcEngineMessage.MediaResSetupTime().unmarshall(bArr);
                                                                                                                return;
                                                                                                            case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
                                                                                                                RtcEngineMessage.PMediaResJoinMedia pMediaResJoinMedia = new RtcEngineMessage.PMediaResJoinMedia();
                                                                                                                pMediaResJoinMedia.unmarshall(bArr);
                                                                                                                if (pMediaResJoinMedia.firstSuccess) {
                                                                                                                    iRtcEngineEventHandler.onJoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                                                                                                                    return;
                                                                                                                } else {
                                                                                                                    iRtcEngineEventHandler.onRejoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                                                                                                                    return;
                                                                                                                }
                                                                                                            case RtcEngineEvent.EvtType.EVT_RTC_STATS /* 13010 */:
                                                                                                                RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats2 = new RtcEngineMessage.PMediaResRtcStats();
                                                                                                                pMediaResRtcStats2.unmarshall(bArr);
                                                                                                                updateRtcStats(pMediaResRtcStats2);
                                                                                                                iRtcEngineEventHandler.onRtcStats(getRtcStats());
                                                                                                                return;
                                                                                                            default:
                                                                                                                return;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                        iRtcEngineEventHandler.onMediaEngineLoadSuccess();
                                        return;
                                }
                        }
                }
        }
    }

    protected void handleChannelEvent(int i, byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        if (iRtcChannelEventHandler == null || rtcChannelImpl == null) {
            return;
        }
        switch (i) {
            case 101:
                RtcEngineMessage.PError pError = new RtcEngineMessage.PError();
                pError.unmarshall(bArr);
                if ((pError.err >= 1151 && pError.err <= 1164) || (pError.err >= 1001 && pError.err < 1033 && getParameters("[\"che.audio.adm.active\"]").equals("2"))) {
                    Logging.e(TAG, "ADM Error code " + pError.err + " restart ADM");
                    setParameter("che.audio.opensl", false);
                    setParameters("che.audio.restart");
                }
                iRtcChannelEventHandler.onChannelError(rtcChannelImpl, pError.err);
                return;
            case 102:
                RtcEngineMessage.PError pError2 = new RtcEngineMessage.PError();
                pError2.unmarshall(bArr);
                if ((pError2.err == 1019 || pError2.err == 1052) && getParameters("[\"che.audio.adm.active\"]").equals("2")) {
                    Logging.e(TAG, "ADM Error code " + pError2.err + " restart ADM");
                    setParameter("che.audio.opensl", false);
                    setParameters("che.audio.restart");
                }
                iRtcChannelEventHandler.onChannelWarning(rtcChannelImpl, pError2.err);
                return;
            case 1108:
                iRtcChannelEventHandler.onRequestToken(rtcChannelImpl);
                return;
            case 1109:
                RtcEngineMessage.PClientRoleChanged pClientRoleChanged = new RtcEngineMessage.PClientRoleChanged();
                pClientRoleChanged.unmarshall(bArr);
                iRtcChannelEventHandler.onClientRoleChanged(rtcChannelImpl, pClientRoleChanged.oldRole, pClientRoleChanged.newRole);
                return;
            case 1110:
                return;
            case 1111:
                return;
            case RtcEngineEvent.EvtType.EVT_LIVE_TRANSCODING /* 1112 */:
                iRtcChannelEventHandler.onTranscodingUpdated(rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_STREAM_INJECTED_STATUS /* 1116 */:
                RtcEngineMessage.PStreamInjectedStatus pStreamInjectedStatus = new RtcEngineMessage.PStreamInjectedStatus();
                pStreamInjectedStatus.unmarshall(bArr);
                iRtcChannelEventHandler.onStreamInjectedStatus(rtcChannelImpl, pStreamInjectedStatus.url, pStreamInjectedStatus.uid, pStreamInjectedStatus.status);
                return;
            case RtcEngineEvent.EvtType.EVT_PRIVILEGE_WILL_EXPIRE /* 1117 */:
                RtcEngineMessage.PPrivilegeWillExpire pPrivilegeWillExpire = new RtcEngineMessage.PPrivilegeWillExpire();
                pPrivilegeWillExpire.unmarshall(bArr);
                iRtcChannelEventHandler.onTokenPrivilegeWillExpire(rtcChannelImpl, pPrivilegeWillExpire.token);
                return;
            case RtcEngineEvent.EvtType.EVT_RTMP_STREAMING_STATE /* 1119 */:
                RtcEngineMessage.PRtmpStreamingState pRtmpStreamingState = new RtcEngineMessage.PRtmpStreamingState();
                pRtmpStreamingState.unmarshall(bArr);
                iRtcChannelEventHandler.onRtmpStreamingStateChanged(rtcChannelImpl, pRtmpStreamingState.url, pRtmpStreamingState.state, pRtmpStreamingState.error);
                return;
            case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
                RtcEngineMessage.PMediaResJoinMedia pMediaResJoinMedia = new RtcEngineMessage.PMediaResJoinMedia();
                pMediaResJoinMedia.unmarshall(bArr);
                if (pMediaResJoinMedia.firstSuccess) {
                    iRtcChannelEventHandler.onJoinChannelSuccess(rtcChannelImpl, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                    return;
                } else {
                    iRtcChannelEventHandler.onRejoinChannelSuccess(rtcChannelImpl, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                    return;
                }
            case RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL /* 13006 */:
                Context context = this.mContext.get();
                if (context != null) {
                    getAudioManager(context).setMode(0);
                }
                RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats = new RtcEngineMessage.PMediaResRtcStats();
                pMediaResRtcStats.unmarshall(bArr);
                updateRtcStats(pMediaResRtcStats);
                iRtcChannelEventHandler.onLeaveChannel(rtcChannelImpl, getRtcStats());
                return;
            case RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY /* 13007 */:
                RtcEngineMessage.PMediaResNetworkQuality pMediaResNetworkQuality = new RtcEngineMessage.PMediaResNetworkQuality();
                pMediaResNetworkQuality.unmarshall(bArr);
                iRtcChannelEventHandler.onNetworkQuality(rtcChannelImpl, pMediaResNetworkQuality.uid, pMediaResNetworkQuality.txQuality, pMediaResNetworkQuality.rxQuality);
                return;
            case RtcEngineEvent.EvtType.EVT_USER_OFFLINE /* 13008 */:
                RtcEngineMessage.PMediaResUserOfflineEvent pMediaResUserOfflineEvent = new RtcEngineMessage.PMediaResUserOfflineEvent();
                pMediaResUserOfflineEvent.unmarshall(bArr);
                iRtcChannelEventHandler.onUserOffline(rtcChannelImpl, pMediaResUserOfflineEvent.uid, pMediaResUserOfflineEvent.reason);
                return;
            case RtcEngineEvent.EvtType.EVT_RTC_STATS /* 13010 */:
                RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats2 = new RtcEngineMessage.PMediaResRtcStats();
                pMediaResRtcStats2.unmarshall(bArr);
                updateRtcStats(pMediaResRtcStats2);
                iRtcChannelEventHandler.onRtcStats(rtcChannelImpl, getRtcStats());
                return;
            case RtcEngineEvent.EvtType.EVT_USER_JOINED /* 13013 */:
                RtcEngineMessage.PMediaResUserJoinedEvent pMediaResUserJoinedEvent = new RtcEngineMessage.PMediaResUserJoinedEvent();
                pMediaResUserJoinedEvent.unmarshall(bArr);
                iRtcChannelEventHandler.onUserJoined(rtcChannelImpl, pMediaResUserJoinedEvent.uid, pMediaResUserJoinedEvent.elapsed);
                return;
            case RtcEngineEvent.EvtType.EVT_USER_MUTE_AUDIO /* 13014 */:
                return;
            case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME /* 14002 */:
                return;
            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STAT /* 14004 */:
                onRtcChannelRemoteVideoStat(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_CONNECTION_LOST /* 14008 */:
                iRtcChannelEventHandler.onConnectionLost(rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE /* 14009 */:
                onRtcChannelStreamMessage(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR /* 14012 */:
                onRtcChannelStreamMessageError(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED /* 14013 */:
                onRtcChannelVideoSizeChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.FIRST_REMOTE_AUDIO_FRAME /* 14015 */:
                return;
            case RtcEngineEvent.EvtType.EVT_ACTIVE_SPEAKER /* 14016 */:
                RtcEngineMessage.PActiveSpeaker pActiveSpeaker = new RtcEngineMessage.PActiveSpeaker();
                pActiveSpeaker.unmarshall(bArr);
                iRtcChannelEventHandler.onActiveSpeaker(rtcChannelImpl, pActiveSpeaker.uid);
                return;
            case RtcEngineEvent.EvtType.EVT_LOCAL_PUBLISH_FALLBACK_TO_AUDIO_ONLY /* 14022 */:
                RtcEngineMessage.PLocalFallbackStatus pLocalFallbackStatus = new RtcEngineMessage.PLocalFallbackStatus();
                pLocalFallbackStatus.unmarshall(bArr);
                iRtcChannelEventHandler.onLocalPublishFallbackToAudioOnly(rtcChannelImpl, pLocalFallbackStatus.state);
                return;
            case RtcEngineEvent.EvtType.EVT_REMOTE_SUBSCRIBE_FALLBACK_TO_AUDIO_ONLY /* 14023 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState.unmarshall(bArr);
                iRtcChannelEventHandler.onRemoteSubscribeFallbackToAudioOnly(rtcChannelImpl, pMediaResUserState.uid, pMediaResUserState.state);
                return;
            case RtcEngineEvent.EvtType.EVT_CONNECTION_STATE_CHANGED /* 14028 */:
                RtcEngineMessage.PConnectionState pConnectionState = new RtcEngineMessage.PConnectionState();
                pConnectionState.unmarshall(bArr);
                iRtcChannelEventHandler.onConnectionStateChanged(rtcChannelImpl, pConnectionState.state, pConnectionState.reason);
                return;
            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STAT /* 14030 */:
                onRtcChannelRemoteAudioStat(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STATE_CHANGED_EXT /* 14036 */:
                onRtcChannelRemoteVideoStateChangedExt(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_STATE /* 14037 */:
                onRtcChannelChannelMediaRelayStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_EVENT /* 14038 */:
                onRtcChannelChannelMediaRelayEvent(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STATE_CHANGED /* 14040 */:
                onRtcChannelRemoteAudioStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_PUBLISH_AUDIO_STATE_CHANGED /* 14045 */:
                onRtcChannelAudioPublishStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_PUBLISH_VIDEO_STATE_CHANGED /* 14046 */:
                onRtcChannelVideoPublishStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_AUDIO_STATE_CHANGED /* 14047 */:
                onRtcChannelAudioSubscribeStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_VIDEO_STATE_CHANGED /* 14048 */:
                onRtcChannelVideoSubscribeStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                return;
            default:
                return;
        }
    }

    private void onApiCallExecuted(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PApiCallExecuted pApiCallExecuted = new RtcEngineMessage.PApiCallExecuted();
        pApiCallExecuted.unmarshall(bArr);
        iRtcEngineEventHandler.onApiCallExecuted(pApiCallExecuted.error, pApiCallExecuted.api, pApiCallExecuted.result);
    }

    private void onFirstRemoteVideoDecoded(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstRemoteVideoDecoded pFirstRemoteVideoDecoded = new RtcEngineMessage.PFirstRemoteVideoDecoded();
        pFirstRemoteVideoDecoded.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstRemoteVideoDecoded(pFirstRemoteVideoDecoded.uid, pFirstRemoteVideoDecoded.width, pFirstRemoteVideoDecoded.height, pFirstRemoteVideoDecoded.elapsed);
    }

    private void onCameraFocusAreaChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCameraFocusAreaChanged pCameraFocusAreaChanged = new RtcEngineMessage.PCameraFocusAreaChanged();
        pCameraFocusAreaChanged.unmarshall(bArr);
        iRtcEngineEventHandler.onCameraFocusAreaChanged(new Rect(pCameraFocusAreaChanged.x, pCameraFocusAreaChanged.y, pCameraFocusAreaChanged.x + pCameraFocusAreaChanged.width, pCameraFocusAreaChanged.y + pCameraFocusAreaChanged.height));
    }

    private void onCameraExposureAreaChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCameraExposureAreaChanged pCameraExposureAreaChanged = new RtcEngineMessage.PCameraExposureAreaChanged();
        pCameraExposureAreaChanged.unmarshall(bArr);
        iRtcEngineEventHandler.onCameraExposureAreaChanged(new Rect(pCameraExposureAreaChanged.x, pCameraExposureAreaChanged.y, pCameraExposureAreaChanged.x + pCameraExposureAreaChanged.width, pCameraExposureAreaChanged.y + pCameraExposureAreaChanged.height));
    }

    private void onFacePositionChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (bArr == null) {
            return;
        }
        RtcEngineMessage.PFaceDetectValue pFaceDetectValue = new RtcEngineMessage.PFaceDetectValue();
        pFaceDetectValue.unmarshall(bArr);
        this.faceRectArr = null;
        if (pFaceDetectValue.rectArr != null && pFaceDetectValue.rectArr.length > 0) {
            this.faceRectArr = new IRtcEngineEventHandler.AgoraFacePositionInfo[pFaceDetectValue.rectArr.length];
            for (int i = 0; i < pFaceDetectValue.rectArr.length; i++) {
                RtcEngineMessage.PFaceDetectValue.FaceRect faceRect = pFaceDetectValue.rectArr[i];
                IRtcEngineEventHandler.AgoraFacePositionInfo agoraFacePositionInfo = new IRtcEngineEventHandler.AgoraFacePositionInfo();
                agoraFacePositionInfo.x = faceRect.x;
                agoraFacePositionInfo.y = faceRect.y;
                agoraFacePositionInfo.width = faceRect.width;
                agoraFacePositionInfo.height = faceRect.height;
                agoraFacePositionInfo.distance = pFaceDetectValue.disArr[i];
                this.faceRectArr[i] = agoraFacePositionInfo;
            }
        } else {
            this.faceRectArr = new IRtcEngineEventHandler.AgoraFacePositionInfo[0];
        }
        iRtcEngineEventHandler.onFacePositionChanged(pFaceDetectValue.imageWidth, pFaceDetectValue.imageHeight, this.faceRectArr);
    }

    private void onVideoSizeChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PVideoSizeChanged pVideoSizeChanged = new RtcEngineMessage.PVideoSizeChanged();
        pVideoSizeChanged.unmarshall(bArr);
        iRtcEngineEventHandler.onVideoSizeChanged(pVideoSizeChanged.uid, pVideoSizeChanged.width, pVideoSizeChanged.height, pVideoSizeChanged.rotation);
    }

    private void onRtcChannelVideoSizeChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PVideoSizeChanged pVideoSizeChanged = new RtcEngineMessage.PVideoSizeChanged();
        pVideoSizeChanged.unmarshall(bArr);
        iRtcChannelEventHandler.onVideoSizeChanged(rtcChannelImpl, pVideoSizeChanged.uid, pVideoSizeChanged.width, pVideoSizeChanged.height, pVideoSizeChanged.rotation);
    }

    private void onRemoteAudioStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteAudioState pRemoteAudioState = new RtcEngineMessage.PRemoteAudioState();
        pRemoteAudioState.unmarshall(bArr);
        iRtcEngineEventHandler.onRemoteAudioStateChanged(pRemoteAudioState.uid, pRemoteAudioState.state, pRemoteAudioState.reason, pRemoteAudioState.elapsed);
    }

    private void onRtcChannelRemoteAudioStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteAudioState pRemoteAudioState = new RtcEngineMessage.PRemoteAudioState();
        pRemoteAudioState.unmarshall(bArr);
        iRtcChannelEventHandler.onRemoteAudioStateChanged(rtcChannelImpl, pRemoteAudioState.uid, pRemoteAudioState.state, pRemoteAudioState.reason, pRemoteAudioState.elapsed);
    }

    private void onRtcChannelAudioPublishStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PPublishAudioState pPublishAudioState = new RtcEngineMessage.PPublishAudioState();
        pPublishAudioState.unmarshall(bArr);
        iRtcChannelEventHandler.onAudioPublishStateChanged(rtcChannelImpl, pPublishAudioState.oldstate, pPublishAudioState.newstate, pPublishAudioState.elapsed);
    }

    private void onRtcChannelVideoPublishStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PPublishVideoState pPublishVideoState = new RtcEngineMessage.PPublishVideoState();
        pPublishVideoState.unmarshall(bArr);
        iRtcChannelEventHandler.onVideoPublishStateChanged(rtcChannelImpl, pPublishVideoState.oldstate, pPublishVideoState.newstate, pPublishVideoState.elapsed);
    }

    private void onRtcChannelAudioSubscribeStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PSubscribeAudioState pSubscribeAudioState = new RtcEngineMessage.PSubscribeAudioState();
        pSubscribeAudioState.unmarshall(bArr);
        iRtcChannelEventHandler.onAudioSubscribeStateChanged(rtcChannelImpl, pSubscribeAudioState.uid, pSubscribeAudioState.oldstate, pSubscribeAudioState.newstate, pSubscribeAudioState.elapsed);
    }

    private void onRtcChannelVideoSubscribeStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PSubscribeVideoState pSubscribeVideoState = new RtcEngineMessage.PSubscribeVideoState();
        pSubscribeVideoState.unmarshall(bArr);
        iRtcChannelEventHandler.onVideoSubscribeStateChanged(rtcChannelImpl, pSubscribeVideoState.uid, pSubscribeVideoState.oldstate, pSubscribeVideoState.newstate, pSubscribeVideoState.elapsed);
    }

    private void onAudioPublishStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PPublishAudioState pPublishAudioState = new RtcEngineMessage.PPublishAudioState();
        pPublishAudioState.unmarshall(bArr);
        iRtcEngineEventHandler.onAudioPublishStateChanged(pPublishAudioState.channel, pPublishAudioState.oldstate, pPublishAudioState.newstate, pPublishAudioState.elapsed);
    }

    private void onVideoPublishStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PPublishVideoState pPublishVideoState = new RtcEngineMessage.PPublishVideoState();
        pPublishVideoState.unmarshall(bArr);
        iRtcEngineEventHandler.onVideoPublishStateChanged(pPublishVideoState.channel, pPublishVideoState.oldstate, pPublishVideoState.newstate, pPublishVideoState.elapsed);
    }

    private void onAudioSubscribeStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PSubscribeAudioState pSubscribeAudioState = new RtcEngineMessage.PSubscribeAudioState();
        pSubscribeAudioState.unmarshall(bArr);
        iRtcEngineEventHandler.onAudioSubscribeStateChanged(pSubscribeAudioState.channel, pSubscribeAudioState.uid, pSubscribeAudioState.oldstate, pSubscribeAudioState.newstate, pSubscribeAudioState.elapsed);
    }

    private void onVideoSubscribeStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PSubscribeVideoState pSubscribeVideoState = new RtcEngineMessage.PSubscribeVideoState();
        pSubscribeVideoState.unmarshall(bArr);
        iRtcEngineEventHandler.onVideoSubscribeStateChanged(pSubscribeVideoState.channel, pSubscribeVideoState.uid, pSubscribeVideoState.oldstate, pSubscribeVideoState.newstate, pSubscribeVideoState.elapsed);
    }

    private void onRemoteVideoStateChangedExt(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteVideoStateExt pRemoteVideoStateExt = new RtcEngineMessage.PRemoteVideoStateExt();
        pRemoteVideoStateExt.unmarshall(bArr);
        iRtcEngineEventHandler.onRemoteVideoStateChanged(pRemoteVideoStateExt.uid, pRemoteVideoStateExt.state, pRemoteVideoStateExt.reason, pRemoteVideoStateExt.elapsed);
    }

    private void onRtcChannelRemoteVideoStateChangedExt(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteVideoStateExt pRemoteVideoStateExt = new RtcEngineMessage.PRemoteVideoStateExt();
        pRemoteVideoStateExt.unmarshall(bArr);
        iRtcChannelEventHandler.onRemoteVideoStateChanged(rtcChannelImpl, pRemoteVideoStateExt.uid, pRemoteVideoStateExt.state, pRemoteVideoStateExt.reason, pRemoteVideoStateExt.elapsed);
    }

    private void onStreamMessage(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PStreamMessage pStreamMessage = new RtcEngineMessage.PStreamMessage();
        pStreamMessage.unmarshall(bArr);
        iRtcEngineEventHandler.onStreamMessage(pStreamMessage.uid, pStreamMessage.streamId, pStreamMessage.payload);
    }

    private void onRtcChannelStreamMessage(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PStreamMessage pStreamMessage = new RtcEngineMessage.PStreamMessage();
        pStreamMessage.unmarshall(bArr);
        iRtcChannelEventHandler.onStreamMessage(rtcChannelImpl, pStreamMessage.uid, pStreamMessage.streamId, pStreamMessage.payload);
    }

    private void onStreamMessageError(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PStreamMessageError pStreamMessageError = new RtcEngineMessage.PStreamMessageError();
        pStreamMessageError.unmarshall(bArr);
        iRtcEngineEventHandler.onStreamMessageError(pStreamMessageError.uid, pStreamMessageError.streamId, pStreamMessageError.error, pStreamMessageError.missed, pStreamMessageError.cached);
    }

    private void onRtcChannelStreamMessageError(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PStreamMessageError pStreamMessageError = new RtcEngineMessage.PStreamMessageError();
        pStreamMessageError.unmarshall(bArr);
        iRtcChannelEventHandler.onStreamMessageError(rtcChannelImpl, pStreamMessageError.uid, pStreamMessageError.streamId, pStreamMessageError.error, pStreamMessageError.missed, pStreamMessageError.cached);
    }

    private void onFirstLocalVideoFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalVideoFrame pFirstLocalVideoFrame = new RtcEngineMessage.PFirstLocalVideoFrame();
        pFirstLocalVideoFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalVideoFrame(pFirstLocalVideoFrame.width, pFirstLocalVideoFrame.height, pFirstLocalVideoFrame.elapsed);
    }

    private void onFirstLocalVideoFramePublished(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalVideoFramePublished pFirstLocalVideoFramePublished = new RtcEngineMessage.PFirstLocalVideoFramePublished();
        pFirstLocalVideoFramePublished.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalVideoFramePublished(pFirstLocalVideoFramePublished.elapsed);
    }

    private void onRemoteVideoStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteVideoStat pRemoteVideoStat = new RtcEngineMessage.PRemoteVideoStat();
        pRemoteVideoStat.unmarshall(bArr);
        if (pRemoteVideoStat.stats.uid == 0) {
            return;
        }
        iRtcEngineEventHandler.onRemoteVideoStats(pRemoteVideoStat.stats);
    }

    private void onRtcChannelRemoteVideoStat(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteVideoStat pRemoteVideoStat = new RtcEngineMessage.PRemoteVideoStat();
        pRemoteVideoStat.unmarshall(bArr);
        if (pRemoteVideoStat.stats.uid == 0) {
            return;
        }
        iRtcChannelEventHandler.onRemoteVideoStats(rtcChannelImpl, pRemoteVideoStat.stats);
    }

    private void onRemoteAudioStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteAudioStat pRemoteAudioStat = new RtcEngineMessage.PRemoteAudioStat();
        pRemoteAudioStat.unmarshall(bArr);
        if (pRemoteAudioStat.stats.uid == 0) {
            return;
        }
        iRtcEngineEventHandler.onRemoteAudioStats(pRemoteAudioStat.stats);
    }

    private void onRtcChannelRemoteAudioStat(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteAudioStat pRemoteAudioStat = new RtcEngineMessage.PRemoteAudioStat();
        pRemoteAudioStat.unmarshall(bArr);
        if (pRemoteAudioStat.stats.uid == 0) {
            return;
        }
        iRtcChannelEventHandler.onRemoteAudioStats(rtcChannelImpl, pRemoteAudioStat.stats);
    }

    private void onLocalAudioStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PLocalAudioStat pLocalAudioStat = new RtcEngineMessage.PLocalAudioStat();
        pLocalAudioStat.unmarshall(bArr);
        iRtcEngineEventHandler.onLocalAudioStats(pLocalAudioStat.stats);
    }

    private void onLocalVideoStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PLocalVideoStat pLocalVideoStat = new RtcEngineMessage.PLocalVideoStat();
        pLocalVideoStat.unmarshall(bArr);
        iRtcEngineEventHandler.onLocalVideoStats(pLocalVideoStat.stats);
    }

    private void onFirstRemoteVideoFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstRemoteVideoFrame pFirstRemoteVideoFrame = new RtcEngineMessage.PFirstRemoteVideoFrame();
        pFirstRemoteVideoFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstRemoteVideoFrame(pFirstRemoteVideoFrame.uid, pFirstRemoteVideoFrame.width, pFirstRemoteVideoFrame.height, pFirstRemoteVideoFrame.elapsed);
    }

    private void onFirstLocalAudioFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalAudioFrame pFirstLocalAudioFrame = new RtcEngineMessage.PFirstLocalAudioFrame();
        pFirstLocalAudioFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalAudioFrame(pFirstLocalAudioFrame.elapsed);
    }

    private void onFirstLocalAudioFramePublished(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalAudioFramePublished pFirstLocalAudioFramePublished = new RtcEngineMessage.PFirstLocalAudioFramePublished();
        pFirstLocalAudioFramePublished.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalAudioFramePublished(pFirstLocalAudioFramePublished.elapsed);
    }

    private void onFirstRemoteAudioFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstRemoteAudioFrame pFirstRemoteAudioFrame = new RtcEngineMessage.PFirstRemoteAudioFrame();
        pFirstRemoteAudioFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstRemoteAudioFrame(pFirstRemoteAudioFrame.uid, pFirstRemoteAudioFrame.elapsed);
    }

    private void onChannelMediaRelayStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCrossChannelState pCrossChannelState = new RtcEngineMessage.PCrossChannelState();
        pCrossChannelState.unmarshall(bArr);
        iRtcEngineEventHandler.onChannelMediaRelayStateChanged(pCrossChannelState.state, pCrossChannelState.code);
    }

    private void onRtcChannelChannelMediaRelayStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PCrossChannelState pCrossChannelState = new RtcEngineMessage.PCrossChannelState();
        pCrossChannelState.unmarshall(bArr);
        iRtcChannelEventHandler.onChannelMediaRelayStateChanged(rtcChannelImpl, pCrossChannelState.state, pCrossChannelState.code);
    }

    private void onChannelMediaRelayEvent(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCrossChannelEvent pCrossChannelEvent = new RtcEngineMessage.PCrossChannelEvent();
        pCrossChannelEvent.unmarshall(bArr);
        iRtcEngineEventHandler.onChannelMediaRelayEvent(pCrossChannelEvent.code);
    }

    private void onRtcChannelChannelMediaRelayEvent(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PCrossChannelEvent pCrossChannelEvent = new RtcEngineMessage.PCrossChannelEvent();
        pCrossChannelEvent.unmarshall(bArr);
        iRtcChannelEventHandler.onChannelMediaRelayEvent(rtcChannelImpl, pCrossChannelEvent.code);
    }

    private void onSpeakersReport(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (bArr == null) {
            return;
        }
        RtcEngineMessage.PMediaResSpeakersReport pMediaResSpeakersReport = new RtcEngineMessage.PMediaResSpeakersReport();
        pMediaResSpeakersReport.unmarshall(bArr);
        if (pMediaResSpeakersReport.speakers != null && pMediaResSpeakersReport.speakers.length >= 0) {
            IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRtcEngineEventHandler.AudioVolumeInfo[pMediaResSpeakersReport.speakers.length];
            for (int i = 0; i < pMediaResSpeakersReport.speakers.length; i++) {
                audioVolumeInfoArr[i] = new IRtcEngineEventHandler.AudioVolumeInfo();
                audioVolumeInfoArr[i].uid = pMediaResSpeakersReport.speakers[i].uid;
                audioVolumeInfoArr[i].volume = pMediaResSpeakersReport.speakers[i].volume;
                audioVolumeInfoArr[i].vad = pMediaResSpeakersReport.speakers[i].vad;
                audioVolumeInfoArr[i].channelId = pMediaResSpeakersReport.speakers[i].channelId;
            }
            iRtcEngineEventHandler.onAudioVolumeIndication(audioVolumeInfoArr, pMediaResSpeakersReport.mixVolume);
            return;
        }
        iRtcEngineEventHandler.onAudioVolumeIndication(new IRtcEngineEventHandler.AudioVolumeInfo[0], 0);
    }

    private void sendLogEvent(byte[] bArr) {
        try {
            onLogEvent(0, new String(bArr, CommonConstant.Encoding.ISO88591));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    protected AudioManager getAudioManager(Context context) {
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    protected ActivityManager getActivityManager(Context context) {
        if (context == null) {
            return null;
        }
        return (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
    }

    private RtcEngineMessage.PVideoNetOptions getOptionsByVideoProfile(int i) {
        try {
            byte[] nativeGetOptionsByVideoProfile = nativeGetOptionsByVideoProfile(this.mNativeHandle, i);
            if (nativeGetOptionsByVideoProfile != null) {
                RtcEngineMessage.PVideoNetOptions pVideoNetOptions = new RtcEngineMessage.PVideoNetOptions();
                pVideoNetOptions.unmarshall(nativeGetOptionsByVideoProfile);
                return pVideoNetOptions;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int createDataStream(boolean z, boolean z2) {
        return nativeCreateDataStream(this.mNativeHandle, z, z2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int sendStreamMessage(int i, byte[] bArr) {
        return nativeSendStreamMessage(this.mNativeHandle, i, bArr);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int updateSharedContext(EGLContext eGLContext) {
        return nativeSetEGL10Context(this.mNativeHandle, eGLContext);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int updateSharedContext(android.opengl.EGLContext eGLContext) {
        return nativeSetEGL14Context(this.mNativeHandle, eGLContext);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j) {
        return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, 10, i2, i3, j, sMatrix);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setTextureId(int i, android.opengl.EGLContext eGLContext, int i2, int i3, long j) {
        return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, 11, i2, i3, j, sMatrix);
    }

    public int setTextureIdWithMatrix(int i, EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        if (fArr == null) {
            return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, sMatrix);
        }
        if (fArr.length < 16) {
            return -2;
        }
        return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, fArr);
    }

    public int setTextureIdWithMatrix(int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        if (fArr == null) {
            return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, sMatrix);
        }
        if (fArr.length < 16) {
            return -2;
        }
        return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, fArr);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isTextureEncodeSupported() {
        return DeviceUtils.getRecommendedEncoderType() == 0;
    }

    @Override // io.agora.rtc.RtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.mVideoSourceType = 3;
        } else {
            this.mVideoSourceType = 1;
        }
        if (z2) {
            if (z) {
                setParameter("che.video.enable_external_texture_input", true);
            } else {
                setParameter("che.video.enable_external_texture_input", false);
                Logging.w("setExternalVideoSource: on Android, texture mode cannot be disabled once enabled.");
            }
        }
        setExtVideoSource(this.mNativeHandle, z ? 1 : 0, z3 ? 1 : 0);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        if (agoraVideoFrame == null || agoraVideoFrame.format == 12) {
            Logging.e("pushExternalVideoFrame failed!! invalid video frame.");
            return false;
        } else if (this.mVideoSourceType != 3) {
            Logging.e("pushExternalVideoFrame failed!! Call setExternalVideoSource to enable enable external video source!!");
            return false;
        } else {
            if (agoraVideoFrame.format != 10 && agoraVideoFrame.format != 11) {
                return ((agoraVideoFrame.format > 0 && agoraVideoFrame.format <= 8) || agoraVideoFrame.format == 16) && deliverFrame(this.mNativeHandle, agoraVideoFrame.buf, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.cropLeft, agoraVideoFrame.cropTop, agoraVideoFrame.cropRight, agoraVideoFrame.cropBottom, agoraVideoFrame.rotation, agoraVideoFrame.timeStamp, agoraVideoFrame.format) == 0;
            } else if (agoraVideoFrame.textureID != 0) {
                return agoraVideoFrame.eglContext14 != null ? updateSharedContext(agoraVideoFrame.eglContext14) == 0 && setTextureIdWithMatrix(agoraVideoFrame.textureID, agoraVideoFrame.eglContext14, agoraVideoFrame.format, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.timeStamp, agoraVideoFrame.transform) == 0 : agoraVideoFrame.eglContext11 != null && updateSharedContext(agoraVideoFrame.eglContext11) == 0 && setTextureIdWithMatrix(agoraVideoFrame.textureID, agoraVideoFrame.eglContext11, agoraVideoFrame.format, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.timeStamp, agoraVideoFrame.transform) == 0;
            } else {
                Logging.e("pushExternalVideoFrame failed!! invalid texture ID.");
                return false;
            }
            return false;
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int addPublishStreamUrl(String str, boolean z) {
        return nativeAddPublishStreamUrl(this.mNativeHandle, str, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int removePublishStreamUrl(String str) {
        return nativeRemovePublishStreamUrl(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLiveTranscoding(LiveTranscoding liveTranscoding) {
        if (liveTranscoding == null) {
            return -2;
        }
        return nativeSetLiveTranscoding(this.mNativeHandle, new RtcEngineMessage.PLiveTranscoding().marshall(liveTranscoding));
    }

    @Override // io.agora.rtc.RtcEngine
    public int addInjectStreamUrl(String str, LiveInjectStreamConfig liveInjectStreamConfig) {
        if (str == null || liveInjectStreamConfig == null) {
            return -2;
        }
        return nativeAddInjectStreamUrl(this.mNativeHandle, str, new RtcEngineMessage.PInjectStreamConfig().marshall(liveInjectStreamConfig));
    }

    @Override // io.agora.rtc.RtcEngine
    public int removeInjectStreamUrl(String str) {
        if (str == null) {
            return -2;
        }
        return nativeRemoveInjectStreamUrl(this.mNativeHandle, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // io.agora.rtc.RtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int startChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration r5) {
        /*
            r4 = this;
            r0 = -2
            if (r5 == 0) goto L60
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            if (r1 == 0) goto L60
            io.agora.rtc.video.ChannelMediaInfo r1 = r5.getSrcChannelMediaInfo()
            if (r1 == 0) goto L60
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            r2 = 4
            if (r1 <= r2) goto L1f
            goto L60
        L1f:
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r3 = (io.agora.rtc.video.ChannelMediaInfo) r3
            java.lang.String r3 = r3.channelName
            if (r3 == 0) goto L4f
            java.lang.Object r2 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r2 = (io.agora.rtc.video.ChannelMediaInfo) r2
            java.lang.String r2 = r2.channelName
            int r2 = r2.length()
            if (r2 != 0) goto L2b
        L4f:
            return r0
        L50:
            io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration r0 = new io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration
            r0.<init>()
            byte[] r5 = r0.marshall(r5)
            long r0 = r4.mNativeHandle
            int r5 = r4.nativeStartChannelMediaRelay(r0, r5)
            return r5
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.RtcEngineImpl.startChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration):int");
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopChannelMediaRelay() {
        return nativeStopChannelMediaRelay(this.mNativeHandle);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // io.agora.rtc.RtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int updateChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration r5) {
        /*
            r4 = this;
            r0 = -2
            if (r5 == 0) goto L60
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            if (r1 == 0) goto L60
            io.agora.rtc.video.ChannelMediaInfo r1 = r5.getSrcChannelMediaInfo()
            if (r1 == 0) goto L60
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            r2 = 4
            if (r1 <= r2) goto L1f
            goto L60
        L1f:
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r3 = (io.agora.rtc.video.ChannelMediaInfo) r3
            java.lang.String r3 = r3.channelName
            if (r3 == 0) goto L4f
            java.lang.Object r2 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r2 = (io.agora.rtc.video.ChannelMediaInfo) r2
            java.lang.String r2 = r2.channelName
            int r2 = r2.length()
            if (r2 != 0) goto L2b
        L4f:
            return r0
        L50:
            io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration r0 = new io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration
            r0.<init>()
            byte[] r5 = r0.marshall(r5)
            long r0 = r4.mNativeHandle
            int r5 = r4.nativeUpdateChannelMediaRelay(r0, r5)
            return r5
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.RtcEngineImpl.updateChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration):int");
    }

    @Override // io.agora.rtc.RtcEngine
    public int startDumpVideoReceiveTrack(int i, String str) {
        return nativeStartDumpVideoReceiveTrack(this.mNativeHandle, i, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopDumpVideoReceiveTrack() {
        return nativeStopDumpVideoReceiveTrack(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public long getNativeHandle() {
        return nativeGetHandle(this.mNativeHandle);
    }

    private static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || !(inetAddress instanceof Inet4Address)) {
            return null;
        }
        return ((Inet4Address) inetAddress).getHostAddress();
    }

    protected static String getLocalHost() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.getName().startsWith("usb")) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        String inetAddressToIpAddress = inetAddressToIpAddress(inetAddress);
                        if (inetAddressToIpAddress != null && !inetAddressToIpAddress.isEmpty()) {
                            return inetAddressToIpAddress;
                        }
                    }
                    continue;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoSource(IVideoSource iVideoSource) {
        if (iVideoSource == null) {
            this.mVideoSourceType = 0;
        } else if (iVideoSource instanceof AgoraDefaultSource) {
            this.mVideoSourceType = 1;
        } else {
            this.mVideoSourceType = 2;
        }
        return nativeAddVideoCapturer(this.mNativeHandle, iVideoSource, this.mVideoSourceType);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVideoRenderer(IVideoSink iVideoSink) {
        int i;
        if (iVideoSink == null) {
            i = 0;
        } else {
            i = iVideoSink instanceof AgoraDefaultRender ? 1 : 2;
        }
        return nativeAddLocalVideoRender(this.mNativeHandle, iVideoSink, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteVideoRenderer(int i, IVideoSink iVideoSink) {
        int i2;
        if (iVideoSink == null) {
            i2 = 0;
        } else {
            i2 = iVideoSink instanceof AgoraDefaultRender ? 1 : 2;
        }
        return nativeAddRemoteVideoRender(this.mNativeHandle, i, iVideoSink, i2);
    }

    public int removeRemoteVideoTrack(int i) {
        return nativeRemoveVideoReceiveTrack(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableSoundPositionIndication(boolean z) {
        return setParameter("che.audio.enable_sound_position", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteVoicePosition(int i, double d, double d2) {
        return setParameterObject("che.audio.game_place_sound_position", formatString("{\"uid\":%d,\"pan\":%f,\"gain\":%f}", Long.valueOf(i & 4294967295L), Double.valueOf(d), Double.valueOf(d2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoicePitch(double d) {
        return setParameter("che.audio.morph.pitch_shift", (int) (d * 100.0d));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoiceEqualization(int i, int i2) {
        return setParameterObject("che.audio.morph.equalization", formatString("{\"index\":%d,\"gain\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoiceReverb(int i, int i2) {
        return setParameterObject("che.audio.morph.reverb", formatString("{\"key\":%d,\"value\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoiceChanger(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.voice_changer", i);
        }
        if (i <= 0 || i >= 1048576) {
            if (i <= 1048576 || i >= 2097152) {
                if (i <= 2097152 || i >= 3145728) {
                    return -7;
                }
                return setParameter("che.audio.morph.beauty_voice", i - 2097152);
            }
            return setParameter("che.audio.morph.voice_changer", (i - 1048576) + 6);
        }
        return setParameter("che.audio.morph.voice_changer", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoiceReverbPreset(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.reverb_preset", i);
        }
        if (i <= 0 || i >= 1048576) {
            if (i <= 1048576 || i >= 2097152) {
                if (i <= 2097152 || i >= 2097154) {
                    return -7;
                }
                return setParameter("che.audio.morph.virtual_stereo", i - 2097152);
            }
            return setParameter("che.audio.morph.reverb_preset", i - 1048576);
        }
        return setParameter("che.audio.morph.reverb_preset", i + 8);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setInEarMonitoringVolume(int i) {
        return setParameter("che.audio.headset.monitoring.parameter", i);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public double getEffectsVolume() {
        double nativeGetIntParameter = nativeGetIntParameter(this.mNativeHandle, "che.audio.game_get_effects_volume", null);
        if (nativeGetIntParameter < 0.0d) {
            return 0.0d;
        }
        return nativeGetIntParameter;
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int setEffectsVolume(double d) {
        return setParameter("che.audio.game_set_effects_volume", d);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int setVolumeOfEffect(int i, double d) {
        return setParameterObject("che.audio.game_adjust_effect_volume", formatString("{\"soundId\":%d,\"gain\":%f}", Integer.valueOf(i), Double.valueOf(d)));
    }

    @Override // io.agora.rtc.IAudioEffectManager
    @Deprecated
    public int playEffect(int i, String str, int i2, double d, double d2, double d3) {
        return playEffect(i, str, i2, d, d2, d3, false);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z) {
        return setParameterObject("che.audio.game_play_effect", formatString("{\"soundId\":%d,\"filePath\":\"%s\",\"loopCount\":%d, \"pitch\":%f,\"pan\":%f,\"gain\":%f, \"send2far\":%d}", Integer.valueOf(i), str, Integer.valueOf(i2), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(z ? 1 : 0)));
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int stopEffect(int i) {
        return setParameter("che.audio.game_stop_effect", i);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int stopAllEffects() {
        return setParameter("che.audio.game_stop_all_effects", true);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int preloadEffect(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        return setParameterObject("che.audio.game_preload_effect", formatString("{\"soundId\":%d,\"filePath\":\"%s\"}", Integer.valueOf(i), str));
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int unloadEffect(int i) {
        return setParameter("che.audio.game_unload_effect", i);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int pauseEffect(int i) {
        return setParameter("che.audio.game_pause_effect", i);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int pauseAllEffects() {
        return setParameter("che.audio.game_pause_all_effects", true);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int resumeEffect(int i) {
        return setParameter("che.audio.game_resume_effect", i);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int resumeAllEffects() {
        return setParameter("che.audio.game_resume_all_effects", true);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setApiCallMode(int i) {
        return nativeSetApiCallMode(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getConnectionState() {
        return nativeGetConncetionState(this.mNativeHandle);
    }

    public void finalize() {
        if (this.mNativeHandle != 0) {
            nativeDestroy(this.mNativeHandle);
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i) {
        return nativeRegisterMediaMetadataObserver(this.mNativeHandle, iMetadataObserver, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public RtcChannel createRtcChannel(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this) {
            if (this.mDefaultRtcChannel != null && this.mDefaultRtcChannel.channelId().equals(str) && this.mDefaultRtcChannel.isInitialized()) {
                return this.mDefaultRtcChannel;
            }
            Iterator<RtcChannelImpl> it = this.mRtcChannels.iterator();
            while (it.hasNext()) {
                RtcChannelImpl next = it.next();
                if (next.channelId() != null && next.channelId().equals(str) && next.isInitialized()) {
                    return next;
                }
            }
            long nativeCreateRtcChannel = nativeCreateRtcChannel(this.mNativeHandle, str);
            if (nativeCreateRtcChannel != 0) {
                RtcChannelImpl rtcChannelImpl = new RtcChannelImpl();
                rtcChannelImpl.initialize(this, nativeCreateRtcChannel);
                this.mRtcChannels.add(rtcChannelImpl);
                return rtcChannelImpl;
            }
            return null;
        }
    }

    public int destroyRtcChannel(String str) {
        if (str == null || str.length() <= 0) {
            return -102;
        }
        synchronized (this) {
            if (this.mDefaultRtcChannel == null || !this.mDefaultRtcChannel.channelId().equals(str)) {
                Iterator<RtcChannelImpl> it = this.mRtcChannels.iterator();
                while (it.hasNext()) {
                    RtcChannelImpl next = it.next();
                    if (next.channelId() != null && next.channelId().equals(str)) {
                        int nativeRtcChannelRelease = nativeRtcChannelRelease(next.getNativeHandle());
                        this.mRtcChannels.remove(next);
                        return nativeRtcChannelRelease;
                    }
                }
                return 0;
            }
            return -5;
        }
    }

    public void onRtcChannelJoinChannel() {
        doJoinChannelCheck(getContext());
    }

    public void onRtcChannelLeaveChannel() {
        doLeaveChannelCheck();
    }

    private boolean joinChannelFirstTimeOrAllChannelLeft() {
        synchronized (this) {
            if (this.mDefaultRtcChannel != null) {
                return false;
            }
            boolean z = true;
            Iterator<RtcChannelImpl> it = this.mRtcChannels.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().hasJoined()) {
                    z = false;
                    break;
                }
            }
            return z;
        }
    }

    private int setParameter(String str, boolean z) {
        return setParameters(formatString("{\"%s\":%b}", str, Boolean.valueOf(z)));
    }

    private int setParameter(String str, int i) {
        return setParameters(formatString("{\"%s\":%d}", str, Integer.valueOf(i)));
    }

    private int setParameter(String str, long j) {
        return setParameters(formatString("{\"%s\":%d}", str, Long.valueOf(j)));
    }

    private int setParameter(String str, double d) {
        return setParameters(formatString("{\"%s\":%f}", str, Double.valueOf(d)));
    }

    private int setParameter(String str, String str2) {
        return setParameters(formatString("{\"%s\":\"%s\"}", str, str2));
    }

    private int setParameterObject(String str, String str2) {
        return setParameters(formatString("{\"%s\":%s}", str, str2));
    }

    private synchronized boolean checkStatus() {
        if (this.mNativeHandle == 0) {
            throw new IllegalStateException("RtcEngine does not initialize or it may be destroyed");
        }
        return true;
    }
}
