package com.tencent.trtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.b.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.renderer.f;
import com.tencent.liteav.trtc.impl.TRTCCloudImpl;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TRTCSubCloud extends TRTCCloudImpl {
    private static final String TAG = "com.tencent.trtc.TRTCSubCloud";
    protected WeakReference<TRTCCloudImpl> mMainCloud;
    private a mVolumeLevelCalTask;

    protected void collectCustomCaptureFps() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        return null;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableAudioEarMonitoring(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return -1;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean enableTorch(boolean z) {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int getBGMDuration(String str) {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        return null;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void pauseAudioEffect(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void pauseBGM() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void resumeAudioEffect(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void resumeBGM() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void selectMotionTmpl(String str) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAllAudioEffectsVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioEffectVolume(int i, int i2) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBGMPlayoutVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setBGMPosition(int i) {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBGMPublishVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBGMVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBeautyStyle(int i, int i2, int i3, int i4) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setChinLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setEyeScaleLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFaceShortLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFaceSlimLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFaceVLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFilterConcentration(float f) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFocusPosition(int i, int i2) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setGSensorMode(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean setGreenScreenFile(String str) {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return -1;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setLocalViewFillMode(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setLocalViewMirror(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setLocalViewRotation(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setMicVolumeOnMixing(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setMotionMute(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setNoseSlimLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setReverbType(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setSystemVolumeType(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setVideoEncoderMirror(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setVideoEncoderRotation(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean setVoiceChangerType(int i) {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setWatermark(Bitmap bitmap, int i, float f, float f2, float f3) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setZoom(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return -1;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startLocalAudio() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startSpeedTest(int i, String str, String str2) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAllAudioEffects() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAudioEffect(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopBGM() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void switchCamera() {
    }

    public TRTCSubCloud(Context context, WeakReference<TRTCCloudImpl> weakReference, Handler handler) {
        super(context, handler);
        this.mMainCloud = null;
        this.mVolumeLevelCalTask = null;
        this.mRoomInfo.muteLocalAudio = true;
        this.mRoomInfo.muteLocalVideo = true;
        this.mMainCloud = weakReference;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void destroy() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (TRTCSubCloud.this.mNativeLock) {
                    if (TRTCSubCloud.this.mNativeRtcContext != 0) {
                        TRTCSubCloud.this.apiLog("destroy context");
                        TRTCSubCloud.this.nativeDestroyContext(TRTCSubCloud.this.mNativeRtcContext);
                    }
                    TRTCSubCloud.this.mNativeRtcContext = 0L;
                }
                TRTCSubCloud.this.mTRTCListener = null;
                TRTCSubCloud.this.mAudioFrameListener = null;
                TRTCSubCloud.this.mCurrentPublishClouds.clear();
                TRTCSubCloud.this.mSubClouds.clear();
                com.tencent.liteav.audio.a.a().a(TRTCSubCloud.this.hashCode());
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void finalize() throws Throwable {
        this.mSDKHandler = null;
        super.finalize();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setListener(TRTCCloudListener tRTCCloudListener) {
        super.setListener(tRTCCloudListener);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        super.setListenerHandler(handler);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, final int i) {
        final String str;
        final String str2;
        String str3;
        String str4;
        if (tRTCParams == null) {
            apiLog("enter room, param nil!");
            onEnterRoom(TXLiteAVCode.ERR_ENTER_ROOM_PARAM_NULL, "enter room param null");
            return;
        }
        final TRTCCloudDef.TRTCParams tRTCParams2 = new TRTCCloudDef.TRTCParams(tRTCParams);
        if (tRTCParams2.sdkAppId == 0 || TextUtils.isEmpty(tRTCParams2.userId) || TextUtils.isEmpty(tRTCParams2.userSig)) {
            apiLog("enterRoom param invalid:" + tRTCParams2);
            if (tRTCParams2.sdkAppId == 0) {
                onEnterRoom(TXLiteAVCode.ERR_SDK_APPID_INVALID, "enter room sdkAppId invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userSig)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_SIG_INVALID, "enter room userSig invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userId)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_ID_INVALID, "enter room userId invalid.");
                return;
            }
            return;
        }
        final long j = tRTCParams2.roomId & 4294967295L;
        if (j == 0) {
            apiLog("enter room, room id " + j + " error");
            onEnterRoom(TXLiteAVCode.ERR_ROOM_ID_INVALID, "room id invalid.");
            return;
        }
        String str5 = tRTCParams2.businessInfo;
        if (tRTCParams2.roomId != -1 || TextUtils.isEmpty(tRTCParams2.businessInfo)) {
            str = "";
            str2 = str5;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(tRTCParams2.businessInfo);
                str3 = jSONObject.optString("strGroupId");
                jSONObject.remove("strGroupId");
                jSONObject.remove("Role");
                str4 = "";
                if (jSONObject.length() != 0) {
                    str4 = jSONObject.toString();
                }
            } catch (Exception unused) {
                apiLog("enter room, room id error, busInfo " + tRTCParams2.businessInfo);
                str3 = "";
                str4 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                onEnterRoom(TXLiteAVCode.ERR_ROOM_ID_INVALID, "room id invalid.");
                return;
            } else {
                str2 = str4;
                str = str3;
            }
        }
        final int i2 = tRTCParams2.role;
        final long currentTimeMillis = System.currentTimeMillis();
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.2
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCSubCloud.this.mRoomState != 0) {
                    if ((TextUtils.isEmpty(str) || !str.equalsIgnoreCase(TRTCSubCloud.this.mRoomInfo.strRoomId)) && TRTCSubCloud.this.mRoomInfo.roomId != j) {
                        TRTCSubCloud.this.apiLog(String.format("enter another room[%d] when in room[%d], exit the old room!!!", Long.valueOf(j), Long.valueOf(TRTCSubCloud.this.mRoomInfo.roomId)));
                        TRTCSubCloud.this.mIsExitOldRoom = true;
                        TRTCSubCloud.this.exitRoom();
                    } else {
                        TRTCSubCloud.this.apiLog(String.format("enter the same room[%d] again, ignore!!!", Long.valueOf(j)));
                        return;
                    }
                }
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog(String.format("============= SDK Version:%s Device Name:%s System Version:%s =============", TXCCommonUtil.getSDKVersionStr(), g.c(), g.d()));
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog(String.format("enterRoom roomId:%d(%s)  userId:%s sdkAppId:%d scene:%d", Long.valueOf(j), str, tRTCParams2.userId, Integer.valueOf(tRTCParams2.sdkAppId), Integer.valueOf(i)));
                StringBuilder sb = new StringBuilder("enterRoom self:");
                sb.append(TRTCSubCloud.this.hashCode());
                sb.append(", roomId:");
                sb.append(tRTCParams2.roomId == -1 ? str : Integer.valueOf(tRTCParams2.roomId));
                String sb2 = sb.toString();
                int i3 = i;
                String str6 = "VideoCall";
                switch (i) {
                    case 0:
                        str6 = "VideoCall";
                        break;
                    case 1:
                        str6 = "Live";
                        break;
                    case 2:
                        str6 = "AudioCall";
                        i3 = 0;
                        break;
                    case 3:
                        str6 = "VoiceChatRoom";
                        i3 = 1;
                        break;
                    default:
                        String str7 = TRTCSubCloud.TAG;
                        TXCLog.w(str7, "enter room scene:%u error! default to VideoCall! " + i + " self:" + TRTCSubCloud.this.hashCode());
                        i3 = 0;
                        break;
                }
                Object[] objArr = new Object[4];
                objArr[0] = str2;
                objArr[1] = str6;
                objArr[2] = i2 == 20 ? "Anchor" : "Audience";
                objArr[3] = tRTCParams2.streamId;
                Monitor.a(1, sb2, String.format("bussInfo:%s, appScene:%s, role:%s, streamid:%s", objArr), 0);
                TXCEventRecorderProxy.a("18446744073709551615", 5001, j, -1L, "", 0);
                TRTCSubCloud.this.mRoomState = 1;
                if (TRTCSubCloud.this.mNativeRtcContext == 0) {
                    int[] sDKVersion = TXCCommonUtil.getSDKVersion();
                    TRTCSubCloud.this.mNativeRtcContext = TRTCSubCloud.this.nativeCreateContext(sDKVersion.length > 0 ? sDKVersion[0] : 0, sDKVersion.length >= 2 ? sDKVersion[1] : 0, sDKVersion.length >= 3 ? sDKVersion[2] : 0);
                }
                TRTCSubCloud.this.updateAppScene(i3);
                TRTCSubCloud.this.nativeSetPriorRemoteVideoStreamType(TRTCSubCloud.this.mNativeRtcContext, TRTCSubCloud.this.mPriorStreamType);
                TRTCSubCloud.this.nativeInit(TRTCSubCloud.this.mNativeRtcContext, tRTCParams2.sdkAppId, tRTCParams2.userId, tRTCParams2.userSig, TRTCSubCloud.this.mRoomInfo.getToken(TRTCSubCloud.this.mContext));
                String str8 = tRTCParams2.privateMapKey != null ? tRTCParams2.privateMapKey : "";
                String str9 = str != null ? str : "";
                TRTCSubCloud.this.nativeEnterRoom(TRTCSubCloud.this.mNativeRtcContext, j, str2 != null ? str2 : "", str8, str9, i2, 255, 0, i, TRTCSubCloud.this.mPerformanceMode, g.c(), g.d(), TRTCSubCloud.this.mRecvMode, tRTCParams2.userDefineRecordId != null ? tRTCParams2.userDefineRecordId : "", tRTCParams2.streamId != null ? tRTCParams2.streamId : "");
                TRTCSubCloud.this.mCurrentRole = i2;
                TRTCSubCloud.this.mTargetRole = i2;
                TRTCSubCloud.this.startCollectStatus();
                TRTCSubCloud.this.mLastStateTimeMs = 0L;
                TRTCSubCloud.this.mRoomInfo.init(j, tRTCParams2.userId);
                TRTCSubCloud.this.mRoomInfo.strRoomId = str9;
                TRTCSubCloud.this.mRoomInfo.sdkAppId = tRTCParams2.sdkAppId;
                TRTCSubCloud.this.mRoomInfo.userSig = tRTCParams2.userSig;
                TRTCSubCloud.this.mRoomInfo.privateMapKey = str8;
                TRTCSubCloud.this.mRoomInfo.enterTime = currentTimeMillis;
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.3
            @Override // java.lang.Runnable
            public void run() {
                String str = "exitRoom " + TRTCSubCloud.this.mRoomInfo.getRoomId() + ", " + TRTCSubCloud.this.hashCode();
                TRTCSubCloud.this.apiLog(str);
                Monitor.a(1, str, "", 0);
                TRTCSubCloud.this.exitRoomInternal(true, "call from api");
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void exitRoomInternal(boolean z, String str) {
        apiLog("exitRoomInternal reqExit: " + z + ", reason: " + str + ", mRoomState: " + this.mRoomState);
        if (this.mRoomState == 0) {
            clearRemoteMuteStates();
            apiLog("exitRoom ignore when no in room");
            return;
        }
        this.mRoomState = 0;
        stopCollectStatus();
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.trtc.TRTCSubCloud.4
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                TRTCSubCloud.this.stopRemoteRender(userInfo);
                com.tencent.liteav.audio.a.a().a(String.valueOf(userInfo.tinyID), TRTCSubCloud.this.hashCode());
                if (userInfo.mainRender.render != null) {
                    userInfo.mainRender.render.setVideoFrameListener(null, b.UNKNOWN);
                }
                if (userInfo.subRender.render != null) {
                    userInfo.subRender.render.setVideoFrameListener(null, b.UNKNOWN);
                }
            }
        });
        if (z) {
            nativeExitRoom(this.mNativeRtcContext);
        }
        this.mRoomInfo.clear();
        this.mRenderListenerMap.clear();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void switchRole(int i) {
        super.switchRole(i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(String str) {
        super.ConnectOtherRoom(str);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        super.DisconnectOtherRoom();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z, boolean z2) {
        super.setDefaultStreamRecvMode(z, z2);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        super.startRemoteView(str, tXCloudVideoView);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str) {
        super.stopRemoteView(str);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
        super.startRemoteSubStreamView(str, tXCloudVideoView);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopRemoteSubStreamView(String str) {
        super.stopRemoteSubStreamView(str);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewFillMode(String str, int i) {
        super.setRemoteSubStreamViewFillMode(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewRotation(String str, int i) {
        super.setRemoteSubStreamViewRotation(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        super.stopAllRemoteView();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.trtc.TRTCSubCloud$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ TRTCCloudListener.TRTCSnapshotListener c;

        AnonymousClass5(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
            this.a = str;
            this.b = i;
            this.c = tRTCSnapshotListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a != null) {
                TRTCRoomInfo.UserInfo user = TRTCSubCloud.this.mRoomInfo.getUser(this.a);
                f fVar = null;
                if (this.b == 2) {
                    if (user != null && user.mainRender != null && user.mainRender.render != null) {
                        TRTCSubCloud tRTCSubCloud = TRTCSubCloud.this;
                        tRTCSubCloud.apiLog("snapshotRemoteSubStreamView->userId: " + this.a);
                        fVar = user.subRender.render.getVideoRender();
                    }
                } else if (user != null && user.mainRender != null && user.mainRender.render != null) {
                    TRTCSubCloud tRTCSubCloud2 = TRTCSubCloud.this;
                    tRTCSubCloud2.apiLog("snapshotRemoteView->userId: " + this.a);
                    fVar = user.mainRender.render.getVideoRender();
                }
                if (fVar == null) {
                    TRTCSubCloud.this.runOnListenerThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (AnonymousClass5.this.c != null) {
                                AnonymousClass5.this.c.onSnapshotComplete(null);
                            }
                        }
                    });
                } else {
                    fVar.a(new p() { // from class: com.tencent.trtc.TRTCSubCloud.5.1
                        @Override // com.tencent.liteav.basic.opengl.p
                        public void onTakePhotoComplete(final Bitmap bitmap) {
                            TRTCSubCloud.this.runOnListenerThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.5.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (AnonymousClass5.this.c != null) {
                                        AnonymousClass5.this.c.onSnapshotComplete(bitmap);
                                    }
                                }
                            });
                        }
                    });
                }
            }
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        apiLog(String.format("snapshotVideo user:%s streamType:%d", str, Integer.valueOf(i)));
        runOnSDKThread(new AnonymousClass5(str, i, tRTCSnapshotListener));
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.6
            @Override // java.lang.Runnable
            public void run() {
                TRTCSubCloud tRTCSubCloud = TRTCSubCloud.this;
                tRTCSubCloud.apiLog("muteLocalVideo " + z + ", roomId=" + TRTCSubCloud.this.mRoomInfo.getRoomId());
                Monitor.a(1, String.format("muteLocalVideo mute:%b", Boolean.valueOf(z)) + " self:" + TRTCSubCloud.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCSubCloud.this.mMainCloud.get();
                if (tRTCCloudImpl != null) {
                    tRTCCloudImpl.muteLocalVideo(z, TRTCSubCloud.this);
                }
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, boolean z) {
        super.muteRemoteVideoStream(str, z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z) {
        super.muteAllRemoteVideoStreams(z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteViewFillMode(String str, int i) {
        super.setRemoteViewFillMode(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteViewRotation(String str, int i) {
        super.setRemoteViewRotation(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setPriorRemoteVideoStreamType(int i) {
        return super.setPriorRemoteVideoStreamType(i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(String str, int i) {
        return super.setRemoteVideoStreamType(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.7
            @Override // java.lang.Runnable
            public void run() {
                TRTCSubCloud tRTCSubCloud = TRTCSubCloud.this;
                tRTCSubCloud.apiLog("muteLocalAudio " + z + ", roomId=" + TRTCSubCloud.this.mRoomInfo.getRoomId());
                Monitor.a(1, String.format("muteLocalAudio mute:%b", Boolean.valueOf(z)) + " self:" + TRTCSubCloud.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCSubCloud.this.mMainCloud.get();
                if (tRTCCloudImpl != null) {
                    tRTCCloudImpl.muteLocalAudio(z, TRTCSubCloud.this);
                }
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(String str, boolean z) {
        super.muteRemoteAudio(str, z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(boolean z) {
        super.muteAllRemoteAudio(z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(String str, int i) {
        super.setRemoteAudioVolume(str, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        private WeakReference<TRTCSubCloud> a;

        a(TRTCSubCloud tRTCSubCloud) {
            this.a = new WeakReference<>(tRTCSubCloud);
        }

        @Override // java.lang.Runnable
        public void run() {
            TRTCSubCloud tRTCSubCloud = this.a != null ? this.a.get() : null;
            if (tRTCSubCloud != null) {
                final ArrayList arrayList = new ArrayList();
                tRTCSubCloud.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.trtc.TRTCSubCloud.a.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        int remotePlayoutVolumeLevel = TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(String.valueOf(userInfo.tinyID));
                        if (remotePlayoutVolumeLevel > 0) {
                            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
                            tRTCVolumeInfo.userId = userInfo.userID;
                            tRTCVolumeInfo.volume = remotePlayoutVolumeLevel;
                            arrayList.add(tRTCVolumeInfo);
                        }
                    }
                });
                final TRTCCloudListener tRTCCloudListener = tRTCSubCloud.mTRTCListener;
                tRTCSubCloud.runOnListenerThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tRTCCloudListener != null) {
                            tRTCCloudListener.onUserVoiceVolume(arrayList, 0);
                        }
                    }
                });
                if (tRTCSubCloud.mAudioVolumeEvalInterval > 0) {
                    tRTCSubCloud.mSDKHandler.postDelayed(tRTCSubCloud.mVolumeLevelCalTask, tRTCSubCloud.mAudioVolumeEvalInterval);
                }
            }
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void startVolumeLevelCal(boolean z) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, this.mAudioVolumeEvalInterval);
        if (z) {
            if (this.mVolumeLevelCalTask == null) {
                this.mVolumeLevelCalTask = new a(this);
                this.mSDKHandler.postDelayed(this.mVolumeLevelCalTask, this.mAudioVolumeEvalInterval);
                return;
            }
            return;
        }
        this.mVolumeLevelCalTask = null;
        this.mAudioVolumeEvalInterval = 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(int i) {
        super.enableAudioVolumeEvaluation(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void callExperimentalAPI(final java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "callExperimentalAPI  "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", roomid = "
            r0.append(r1)
            com.tencent.liteav.trtc.impl.TRTCRoomInfo r1 = r5.mRoomInfo
            long r1 = r1.roomId
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L24
            com.tencent.liteav.trtc.impl.TRTCRoomInfo r1 = r5.mRoomInfo
            long r1 = r1.roomId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L28
        L24:
            com.tencent.liteav.trtc.impl.TRTCRoomInfo r1 = r5.mRoomInfo
            java.lang.String r1 = r1.strRoomId
        L28:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.apiLog(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "callExperimentalAPI:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r6
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            java.lang.String r1 = " self:"
            r0.append(r1)
            int r1 = r5.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ""
            com.tencent.liteav.basic.module.Monitor.a(r2, r0, r1, r4)
        L5b:
            java.lang.String r0 = ""
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L93
            r2.<init>(r6)     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = "api"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L93
            if (r3 != 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = "callExperimentalAPI[lack api or illegal type]: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L93
            r2.append(r6)     // Catch: java.lang.Exception -> L93
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L93
            r5.apiLog(r2)     // Catch: java.lang.Exception -> L93
            return
        L7d:
            java.lang.String r3 = "api"
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = "params"
            boolean r0 = r2.has(r0)     // Catch: java.lang.Exception -> L94
            if (r0 != 0) goto L8c
            return
        L8c:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch: java.lang.Exception -> L94
            goto La6
        L93:
            r3 = r0
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "callExperimentalAPI[failed]: "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.apiLog(r0)
            r0 = r1
        La6:
            java.lang.String r1 = "setEncodedDataProcessingListener"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lb2
            r5.setEncodedDataProcessingListener(r0)
            return
        Lb2:
            com.tencent.trtc.TRTCSubCloud$8 r1 = new com.tencent.trtc.TRTCSubCloud$8
            r1.<init>()
            r5.runOnSDKThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.trtc.TRTCSubCloud.callExperimentalAPI(java.lang.String):void");
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(String str, int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return super.setRemoteVideoRenderListener(str, i, i2, tRTCVideoRenderListener);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void showDebugView(int i) {
        super.showDebugView(i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
        super.setDebugViewMargin(str, tRTCViewMargin);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        super.startPublishCDNStream(tRTCPublishCDNParam);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopPublishing() {
        super.stopPublishing();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopPublishCDNStream() {
        super.stopPublishCDNStream();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startPublishing(String str, int i) {
        super.startPublishing(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        super.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i, byte[] bArr, boolean z, boolean z2) {
        return super.sendCustomCmdMsg(i, bArr, z, z2);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i) {
        return super.sendSEIMsg(bArr, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onAudioQosChanged(int i, int i2, int i3) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onAudioQosChanged(this, i, i2, i3);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onVideoQosChanged(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onVideoQosChanged(this, i, i2, i3, i4, i5, i6, i7);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onIdrFpsChanged(int i) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onIdrFpsChanged(this, i);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onVideoConfigChanged(int i, boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onVideoConfigChanged(this, i, z);
        }
    }
}
