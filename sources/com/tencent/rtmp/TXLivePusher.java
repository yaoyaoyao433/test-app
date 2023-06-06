package com.tencent.rtmp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXLivePusher {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private b mTXTxLivePusherImpl;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3);

        void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes6.dex */
    public interface OnBGMNotify {
        void onBGMComplete(int i);

        void onBGMProgress(long j, long j2);

        void onBGMStart();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i, int i2, int i3);

        void onTextureDestoryed();
    }

    public TXLivePusher(Context context) {
        this.mTXTxLivePusherImpl = new b(context);
    }

    public void setConfig(TXLivePushConfig tXLivePushConfig) {
        this.mTXTxLivePusherImpl.a(tXLivePushConfig);
    }

    public TXLivePushConfig getConfig() {
        return this.mTXTxLivePusherImpl.a();
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.mTXTxLivePusherImpl.a(iTXLivePushListener);
    }

    public void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        this.mTXTxLivePusherImpl.a(tXCloudVideoView);
    }

    public void stopCameraPreview(boolean z) {
        this.mTXTxLivePusherImpl.a(z);
    }

    public int startPusher(String str) {
        return this.mTXTxLivePusherImpl.a(str);
    }

    public void stopPusher() {
        this.mTXTxLivePusherImpl.b();
    }

    public void startScreenCapture() {
        this.mTXTxLivePusherImpl.f();
    }

    public void stopScreenCapture() {
        this.mTXTxLivePusherImpl.g();
    }

    public void pausePusher() {
        this.mTXTxLivePusherImpl.c();
    }

    public void resumePusher() {
        this.mTXTxLivePusherImpl.d();
    }

    public boolean isPushing() {
        return this.mTXTxLivePusherImpl.e();
    }

    public void setVideoQuality(int i, boolean z, boolean z2) {
        this.mTXTxLivePusherImpl.a(i, z, z2);
    }

    public void switchCamera() {
        this.mTXTxLivePusherImpl.h();
    }

    public boolean setMirror(boolean z) {
        return this.mTXTxLivePusherImpl.b(z);
    }

    public void setRenderRotation(int i) {
        this.mTXTxLivePusherImpl.a(i);
    }

    public boolean turnOnFlashLight(boolean z) {
        return this.mTXTxLivePusherImpl.c(z);
    }

    public int getMaxZoom() {
        return this.mTXTxLivePusherImpl.i();
    }

    public boolean setZoom(int i) {
        return this.mTXTxLivePusherImpl.b(i);
    }

    public void setExposureCompensation(float f) {
        this.mTXTxLivePusherImpl.a(f);
    }

    public TXBeautyManager getBeautyManager() {
        return this.mTXTxLivePusherImpl.j();
    }

    public boolean setBeautyFilter(int i, int i2, int i3, int i4) {
        return this.mTXTxLivePusherImpl.a(i, i2, i3, i4);
    }

    @Deprecated
    public void setFilter(Bitmap bitmap) {
        getBeautyManager().setFilter(bitmap);
    }

    @Deprecated
    public void setSpecialRatio(float f) {
        getBeautyManager().setFilterStrength(f);
    }

    @Deprecated
    public void setEyeScaleLevel(int i) {
        getBeautyManager().setEyeScaleLevel(i);
    }

    @Deprecated
    public void setFaceSlimLevel(int i) {
        getBeautyManager().setFaceSlimLevel(i);
    }

    @Deprecated
    public void setFaceVLevel(int i) {
        getBeautyManager().setFaceVLevel(i);
    }

    @Deprecated
    public void setChinLevel(int i) {
        getBeautyManager().setChinLevel(i);
    }

    @Deprecated
    public void setFaceShortLevel(int i) {
        getBeautyManager().setFaceShortLevel(i);
    }

    @Deprecated
    public void setNoseSlimLevel(int i) {
        getBeautyManager().setNoseSlimLevel(i);
    }

    @TargetApi(18)
    @Deprecated
    public boolean setGreenScreenFile(String str) {
        getBeautyManager().setGreenScreenFile(str);
        return true;
    }

    @Deprecated
    public void setMotionTmpl(String str) {
        getBeautyManager().setMotionTmpl(str);
    }

    @Deprecated
    public void setMotionMute(boolean z) {
        getBeautyManager().setMotionMute(z);
    }

    public void setMute(boolean z) {
        this.mTXTxLivePusherImpl.d(z);
    }

    public TXAudioEffectManager getAudioEffectManager() {
        return TXAudioEffectManagerImpl.getAutoCacheHolder();
    }

    public void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mTXTxLivePusherImpl.a(iTXAudioVolumeEvaluationListener);
    }

    public void enableAudioVolumeEvaluation(int i) {
        this.mTXTxLivePusherImpl.f(i);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mTXTxLivePusherImpl.a(iTXVideoRecordListener);
    }

    public int startRecord(String str) {
        return this.mTXTxLivePusherImpl.d(str);
    }

    public void stopRecord() {
        this.mTXTxLivePusherImpl.o();
    }

    public void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        this.mTXTxLivePusherImpl.a(iTXSnapshotListener);
    }

    public int sendCustomVideoTexture(int i, int i2, int i3) {
        return this.mTXTxLivePusherImpl.a(i, i2, i3);
    }

    public int sendCustomVideoData(byte[] bArr, int i, int i2, int i3) {
        return this.mTXTxLivePusherImpl.a(bArr, i, i2, i3);
    }

    public void sendCustomPCMData(byte[] bArr) {
        this.mTXTxLivePusherImpl.a(bArr);
    }

    public void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        this.mTXTxLivePusherImpl.a(videoCustomProcessListener);
    }

    public void setAudioProcessListener(AudioCustomProcessListener audioCustomProcessListener) {
        this.mTXTxLivePusherImpl.a(audioCustomProcessListener);
    }

    public void setSurface(Surface surface) {
        this.mTXTxLivePusherImpl.a(surface);
    }

    public void setSurfaceSize(int i, int i2) {
        this.mTXTxLivePusherImpl.a(i, i2);
    }

    public void setFocusPosition(float f, float f2) {
        this.mTXTxLivePusherImpl.a(f, f2);
    }

    public boolean sendMessageEx(byte[] bArr) {
        return this.mTXTxLivePusherImpl.b(bArr);
    }

    @Deprecated
    public void sendMessage(byte[] bArr) {
        this.mTXTxLivePusherImpl.c(bArr);
    }

    public void onLogRecord(String str) {
        this.mTXTxLivePusherImpl.e(str);
    }

    @Deprecated
    public void setBGMNofify(OnBGMNotify onBGMNotify) {
        this.mTXTxLivePusherImpl.a(onBGMNotify);
    }

    @Deprecated
    public boolean playBGM(String str) {
        return this.mTXTxLivePusherImpl.b(str);
    }

    @Deprecated
    public boolean stopBGM() {
        return this.mTXTxLivePusherImpl.k();
    }

    @Deprecated
    public boolean pauseBGM() {
        return this.mTXTxLivePusherImpl.m();
    }

    @Deprecated
    public boolean resumeBGM() {
        return this.mTXTxLivePusherImpl.n();
    }

    @Deprecated
    public int getMusicDuration(String str) {
        return this.mTXTxLivePusherImpl.c(str);
    }

    @Deprecated
    public boolean setBGMVolume(float f) {
        return this.mTXTxLivePusherImpl.b(f);
    }

    @Deprecated
    public boolean setMicVolume(float f) {
        return this.mTXTxLivePusherImpl.c(f);
    }

    @Deprecated
    public void setBGMPitch(float f) {
        this.mTXTxLivePusherImpl.d(f);
    }

    @Deprecated
    public void setReverb(int i) {
        this.mTXTxLivePusherImpl.d(i);
    }

    @Deprecated
    public void setVoiceChangerType(int i) {
        this.mTXTxLivePusherImpl.e(i);
    }

    @Deprecated
    public boolean setBGMPosition(int i) {
        return this.mTXTxLivePusherImpl.c(i);
    }
}
