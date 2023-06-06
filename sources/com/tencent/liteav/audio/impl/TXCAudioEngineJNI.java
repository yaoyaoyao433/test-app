package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import com.tencent.liteav.audio.TXCAudioEncoderConfig;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.audio.e;
import com.tencent.liteav.audio.g;
import com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCAudioEngineJNI {
    private static final String TAG = "TXCAudioEngineJNI";
    private static WeakReference<g> mAudioCaptureDataListener;
    private static a mAudioDumpingListener;
    private static WeakReference<e> mMixedAllDataListener;
    private static AudioManager sAudioManager;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void onLocalAudioWriteFailed();
    }

    public static native void nativeAppendLibraryPath(String str);

    public static native void nativeCacheClassForNative();

    public static native void nativeClean();

    public static native void nativeDeleteAudioSessionDuplicate();

    public static native void nativeEnableAudioEarMonitoring(boolean z);

    public static native void nativeEnableAudioVolumeEvaluation(boolean z, int i);

    public static native void nativeEnableAutoRestartDevice(boolean z);

    public static native void nativeEnableCaptureEOSMode(boolean z);

    public static native void nativeEnableEncodedDataCallback(boolean z);

    public static native void nativeEnableEncodedDataPackWithTRAEHeaderCallback(boolean z);

    public static native void nativeEnableMixMode(boolean z);

    public static native void nativeForceCallbackMixedPlayAudioFrame(boolean z);

    public static native int nativeGetEncoderChannels();

    public static native TXCAudioEncoderConfig nativeGetEncoderConfig();

    public static native int nativeGetEncoderSampleRate();

    public static native int nativeGetMixingPlayoutVolumeLevel();

    public static native int nativeGetRemotePlayoutVolumeLevel(String str);

    public static native int nativeGetSoftwareCaptureVolumeLevel();

    public static native StatusBucket nativeGetStatus(int i);

    public static native void nativeInitAudioDevice();

    public static native void nativeInitBeforeEngineCreate(Context context);

    public static native boolean nativeIsAudioDeviceCapturing();

    public static native boolean nativeIsAudioDevicePlaying();

    public static native boolean nativeIsRemoteAudioPlaying(String str);

    public static native void nativeMuteLocalAudio(boolean z);

    public static native void nativeMuteRemoteAudio(String str, boolean z);

    public static native void nativeMuteRemoteAudioInSpeaker(String str, boolean z);

    public static native void nativeNewAudioSessionDuplicate(Context context);

    public static native void nativeNotifySystemEarMonitoringInitializing();

    public static native void nativePauseAudioCapture(boolean z);

    public static native void nativePauseLocalAudio();

    public static native void nativeResumeAudioCapture();

    public static native void nativeResumeLocalAudio();

    public static native void nativeSendCustomPCMData(byte[] bArr, int i, long j, int i2, int i3);

    public static native void nativeSetAudioEarMonitoringVolume(int i);

    public static native void nativeSetAudioEncoderParam(int i, int i2);

    public static native void nativeSetAudioEngineCaptureDataCallback(boolean z);

    public static native void nativeSetAudioEngineCaptureRawDataCallback(boolean z);

    public static native void nativeSetAudioEngineEncodedDataCallback(boolean z);

    public static native void nativeSetAudioEngineMixedAllDataCallback(boolean z);

    public static native void nativeSetAudioEngineRemoteStreamDataListener(String str, boolean z);

    public static native void nativeSetAudioPlayoutTunnelEnabled(boolean z);

    public static native void nativeSetAudioQuality(int i, int i2);

    public static native void nativeSetAudioRoute(int i);

    public static native void nativeSetCaptureDataCallbackFormat(int i, int i2, int i3);

    public static native void nativeSetCaptureVoiceChanger(int i);

    public static native void nativeSetEncoderChannels(int i);

    public static native void nativeSetEncoderFECPercent(float f);

    public static native void nativeSetEncoderSampleRate(int i);

    public static native void nativeSetEventCallbackEnabled(boolean z);

    public static native void nativeSetMaxSelectedPlayStreams(int i);

    public static native void nativeSetMixingPlayoutVolume(float f);

    public static native void nativeSetPlayoutDataCallbackFormat(int i, int i2, int i3);

    public static native void nativeSetPlayoutDataListener(boolean z);

    public static native void nativeSetPlayoutDevice(int i);

    public static native void nativeSetRecordReverb(int i);

    public static native void nativeSetRemoteAudioBlockThreshold(String str, long j);

    public static native void nativeSetRemoteAudioCacheParams(String str, boolean z, int i, int i2, int i3);

    public static native void nativeSetRemoteAudioJitterCycle(String str, long j);

    public static native void nativeSetRemotePlayoutVolume(String str, int i);

    public static native void nativeSetRemoteStreamDataCallbackFormat(String str, int i, int i2, int i3);

    public static native void nativeSetSoftAEC(int i);

    public static native void nativeSetSoftAGC(int i);

    public static native void nativeSetSoftANS(int i);

    public static native void nativeSetSoftwareCaptureVolume(float f);

    public static native void nativeSetSystemEarMonitoring(TXSystemAudioKit tXSystemAudioKit);

    public static native void nativeSetSystemVolumeType(int i);

    public static native void nativeSetTRAEConfig(String str);

    public static native void nativeStartLocalAudio(int i, boolean z);

    public static native int nativeStartLocalAudioDumping(int i, int i2, String str);

    public static native String nativeStartRemoteAudio(TXCAudioEngine tXCAudioEngine, boolean z, String str);

    public static native void nativeStopLocalAudio();

    public static native void nativeStopLocalAudioDumping();

    public static native void nativeStopRemoteAudio(String str);

    public static native void nativeUseSysAudioDevice(boolean z);

    static {
        com.tencent.liteav.basic.util.g.f();
        nativeCacheClassForNative();
        mAudioDumpingListener = null;
        mAudioCaptureDataListener = null;
        mMixedAllDataListener = new WeakReference<>(null);
    }

    public static void setAudioCaptureDataListener(WeakReference<g> weakReference) {
        mAudioCaptureDataListener = weakReference;
        nativeSetAudioEngineCaptureDataCallback(mAudioCaptureDataListener != null);
        nativeSetAudioEngineCaptureRawDataCallback(mAudioCaptureDataListener != null);
        nativeSetAudioEngineEncodedDataCallback(mAudioCaptureDataListener != null);
    }

    public static void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        if (mAudioCaptureDataListener == null || mAudioCaptureDataListener.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordRawPcmData(bArr, j, i, i2, i3, false);
    }

    public static void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        if (mAudioCaptureDataListener == null || mAudioCaptureDataListener.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordPcmData(bArr, j, i, i2, i3);
    }

    public static void onRecordEncData(byte[] bArr, long j, int i, int i2) {
        if (mAudioCaptureDataListener == null || mAudioCaptureDataListener.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordEncData(bArr, j, i, i2, 16);
    }

    public static void onRecordError(int i, String str) {
        TXCLog.e(TAG, "onRecordError: " + i + ", " + str);
        if (mAudioCaptureDataListener == null || mAudioCaptureDataListener.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordError(i, str);
    }

    public static void onEvent(String str, int i, String str2, String str3) {
        TXCAudioEngine.getInstance().onEvent(str, i, str2, str3);
    }

    public static void onWarning(String str, int i, String str2, String str3) {
        TXCAudioEngine.getInstance().onWarning(str, i, str2, str3);
    }

    public static void onError(String str, int i, String str2, String str3) {
        TXCAudioEngine.getInstance().onError(str, i, str2, str3);
    }

    public static void setMixedAllDataListener(e eVar) {
        mMixedAllDataListener = new WeakReference<>(eVar);
        nativeSetAudioEngineMixedAllDataCallback(eVar != null);
    }

    public static void onMixedAllData(byte[] bArr, int i, int i2) {
        e eVar = mMixedAllDataListener.get();
        if (eVar != null) {
            eVar.onMixedAllData(bArr, i, i2);
        }
    }

    public static void onLocalAudioWriteFail() {
        if (mAudioDumpingListener != null) {
            mAudioDumpingListener.onLocalAudioWriteFailed();
        }
    }

    public static void SetAudioDumpingListener(a aVar) {
        mAudioDumpingListener = aVar;
    }

    public static void InitTraeEngineLibrary(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            TXCLog.e(TAG, "InitTraeEngineLibrary failed, context is null!");
            return;
        }
        try {
            String str = context.getApplicationInfo().nativeLibraryDir;
            String str2 = applicationInfo.dataDir + "/lib";
            String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
            String g = com.tencent.liteav.basic.util.g.g();
            if (g == null) {
                g = "";
            }
            nativeAppendLibraryPath("add_libpath:" + str);
            nativeAppendLibraryPath("add_libpath:" + str2);
            nativeAppendLibraryPath("add_libpath:" + str3);
            nativeAppendLibraryPath("add_libpath:" + g);
        } catch (UnsatisfiedLinkError e) {
            TXCLog.e(TAG, "init trae engine library failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean nativeCheckTraeEngine(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.impl.TXCAudioEngineJNI.nativeCheckTraeEngine(android.content.Context):boolean");
    }

    public static void pauseAudioCapture(boolean z) {
        nativePauseAudioCapture(z);
    }

    public static void resumeAudioCapture() {
        nativeResumeAudioCapture();
    }

    public static void sendCustomPCMData(byte[] bArr, int i, int i2) {
        nativeSendCustomPCMData(bArr, bArr.length, 0L, i, i2);
    }

    public static void sendCustomPCMData(com.tencent.liteav.basic.structs.a aVar) {
        nativeSendCustomPCMData(aVar.audioData, aVar.audioData.length, aVar.timestamp, aVar.sampleRate, aVar.channelsPerSample);
    }

    public static StatusBucket getStatus(int i) {
        return nativeGetStatus(i);
    }

    public static boolean isAppInBackground() {
        return com.tencent.liteav.basic.util.g.a(TXCAudioEngine.getInstance().getAppContext());
    }

    public static int getAudioMode() {
        try {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                return audioManager.getMode();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int getSystemVolume() {
        try {
            int i = getAudioMode() == 0 ? 3 : 0;
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                return audioManager.getStreamVolume(i);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static AudioManager getAudioManager() {
        if (sAudioManager == null) {
            sAudioManager = (AudioManager) TXCAudioEngine.getInstance().getAppContext().getSystemService("audio");
        }
        return sAudioManager;
    }
}
