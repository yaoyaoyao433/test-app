package com.tencent.liteav.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit;
import com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCAudioEngine implements com.tencent.liteav.audio.impl.b, com.tencent.liteav.audio.impl.earmonitor.a {
    private static final int EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE = 10056;
    private static final int EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE = 10055;
    private static final String TAG = "AudioEngine :TXCAudioEngine_java";
    private TXSystemAudioKit mAudioKit;
    private static final long SYSTEM_AUDIO_KIT_RESTART_INTERVAL = TimeUnit.SECONDS.toMillis(2);
    static TXCAudioEngine sInstance = new TXCAudioEngine();
    protected static Context mContext = null;
    private static boolean has_trae = false;
    private static WeakReference<f> mAudioCoreDataListener = null;
    protected static final HashMap<String, WeakReference<f>> mJitterDataListenerMap = new HashMap<>();
    private static final Object mJitterDataListenerMapLock = new Object();
    protected static final HashMap<String, WeakReference<d>> mJitterEventListenerMap = new HashMap<>();
    private static final Object mJitterEventListenerMapLock = new Object();
    private static volatile boolean has_init = false;
    private final ArrayList<WeakReference<com.tencent.liteav.basic.c.a>> mCallbackList = new ArrayList<>();
    protected boolean mDeviceIsRecording = false;
    protected boolean mIsCustomRecord = false;
    protected boolean mIsCallComed = false;

    public int getAECType() {
        return 2;
    }

    public int getPlayChannels() {
        return 2;
    }

    public int getPlaySampleRate() {
        return 48000;
    }

    public static TXCAudioEngine getInstance() {
        return sInstance;
    }

    private TXCAudioEngine() {
    }

    public static synchronized void CreateInstance(Context context, String str) {
        synchronized (TXCAudioEngine.class) {
            CreateInstanceWithoutInitDevice(context, str);
            TXCAudioEngineJNI.nativeInitAudioDevice();
        }
    }

    public static synchronized void CreateInstanceWithoutInitDevice(Context context, String str) {
        synchronized (TXCAudioEngine.class) {
            TXCLog.i(TAG, "CreateInstance: ");
            mContext = context.getApplicationContext();
            if (has_init) {
                TXCLog.i(TAG, "CreateInstance already created~ ");
                return;
            }
            if (TXCAudioEngineJNI.nativeCheckTraeEngine(context)) {
                has_trae = true;
            }
            TXCAudioEngineJNI.nativeUseSysAudioDevice(!has_trae);
            if (has_trae) {
                TXCAudioEngineJNI.InitTraeEngineLibrary(context);
                TXCAudioEngineJNI.nativeSetTRAEConfig(str);
                TXCAudioEngineJNI.nativeInitBeforeEngineCreate(context);
                com.tencent.liteav.audio.impl.a.a().a(context.getApplicationContext());
                com.tencent.liteav.audio.impl.a.a().a(sInstance);
                TXCAudioEngineJNI.nativeNewAudioSessionDuplicate(mContext);
            } else {
                TXCMultAudioTrackPlayer.getInstance();
                TXCAudioSysRecord.getInstance();
            }
            has_init = true;
        }
    }

    public static boolean hasTrae() {
        return has_trae;
    }

    public static boolean enableAudioVolumeEvaluation(boolean z, int i) {
        TXCLog.i(TAG, "enableAudioVolumeEvaluation : " + z + "interval:" + i);
        TXCAudioEngineJNI.nativeEnableAudioVolumeEvaluation(z, i);
        return true;
    }

    public Context getAppContext() {
        return mContext;
    }

    public void setAudioQuality(int i, int i2) {
        TXCAudioEngineJNI.nativeSetAudioQuality(i, i2);
    }

    public void setEncoderSampleRate(int i) {
        TXCAudioEngineJNI.nativeSetEncoderSampleRate(i);
    }

    public void setEncoderChannels(int i) {
        TXCAudioEngineJNI.nativeSetEncoderChannels(i);
    }

    public int getEncoderSampleRate() {
        return TXCAudioEngineJNI.nativeGetEncoderSampleRate();
    }

    public int getEncoderChannels() {
        return TXCAudioEngineJNI.nativeGetEncoderChannels();
    }

    public TXCAudioEncoderConfig getAudioEncoderConfig() {
        return TXCAudioEngineJNI.nativeGetEncoderConfig();
    }

    public int startLocalAudio(int i, boolean z) {
        TXCLog.i(TAG, "startLocalAudio audioFormat:" + i);
        if (mContext == null) {
            TXCLog.i(TAG, "Please call CreateInstance fisrt!!!");
            return TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
        }
        TXCAudioEngineJNI.InitTraeEngineLibrary(mContext);
        TXCAudioEngineJNI.nativeStartLocalAudio(i, z);
        this.mDeviceIsRecording = true;
        return 0;
    }

    public int stopLocalAudio() {
        TXCLog.i(TAG, "stopLocalAudio");
        TXCAudioEngineJNI.nativeStopLocalAudio();
        this.mDeviceIsRecording = false;
        return 0;
    }

    public void pauseLocalAudio() {
        TXCAudioEngineJNI.nativePauseLocalAudio();
    }

    public void resumeLocalAudio() {
        TXCAudioEngineJNI.nativeResumeLocalAudio();
    }

    public void EnableMixMode(boolean z) {
        TXCAudioEngineJNI.nativeEnableMixMode(z);
    }

    public void enableEncodedDataPackWithTRAEHeaderCallback(boolean z) {
        TXCAudioEngineJNI.nativeEnableEncodedDataPackWithTRAEHeaderCallback(z);
    }

    public void enableEncodedDataCallback(boolean z) {
        TXCAudioEngineJNI.nativeEnableEncodedDataCallback(z);
    }

    public int pauseAudioCapture(boolean z) {
        TXCLog.i(TAG, "pauseAudioCapture: " + z);
        TXCAudioEngineJNI.pauseAudioCapture(z);
        return 0;
    }

    public int resumeAudioCapture() {
        TXCLog.i(TAG, "resumeRecord");
        TXCAudioEngineJNI.resumeAudioCapture();
        return 0;
    }

    public void sendCustomPCMData(byte[] bArr, int i, int i2) {
        TXCAudioEngineJNI.sendCustomPCMData(bArr, i, i2);
    }

    public void sendCustomPCMData(com.tencent.liteav.basic.structs.a aVar) {
        TXCAudioEngineJNI.sendCustomPCMData(aVar);
    }

    public boolean setAudioCaptureDataListener(g gVar) {
        TXCLog.i(TAG, "setRecordListener ");
        if (gVar == null) {
            TXCAudioEngineJNI.setAudioCaptureDataListener(null);
            return true;
        }
        TXCAudioEngineJNI.setAudioCaptureDataListener(new WeakReference(gVar));
        return true;
    }

    public boolean muteLocalAudio(boolean z) {
        TXCLog.i(TAG, "setRecordMute: " + z);
        TXCAudioEngineJNI.nativeMuteLocalAudio(z);
        return true;
    }

    public boolean setReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        TXCLog.i(TAG, "setReverbType: " + tXVoiceReverbType.getNativeValue());
        TXCAudioEngineJNI.nativeSetRecordReverb(tXVoiceReverbType.getNativeValue());
        return true;
    }

    public boolean setSoftwareCaptureVolume(float f) {
        TXCLog.i(TAG, "setRecordVolume: " + f);
        TXCAudioEngineJNI.nativeSetSoftwareCaptureVolume(f);
        return true;
    }

    public boolean setMixingPlayoutVolume(float f) {
        TXCLog.i(TAG, "setPlayoutVolume: " + f);
        TXCAudioEngineJNI.nativeSetMixingPlayoutVolume(f);
        return true;
    }

    public void enableSoftAEC(boolean z, int i) {
        TXCLog.i(TAG, "enableSoftAEC: enable = " + z + " level = " + i);
        if (!z) {
            i = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAEC(i);
    }

    public void enableSoftANS(boolean z, int i) {
        TXCLog.i(TAG, "enableSoftANS: enable = " + z + " level = " + i);
        if (!z) {
            i = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftANS(i);
    }

    public void enableSoftAGC(boolean z, int i) {
        TXCLog.i(TAG, "enableSoftAGC: enable = " + z + " level = " + i);
        if (!z) {
            i = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAGC(i);
    }

    public boolean setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCLog.i(TAG, "setVoiceChangerType " + tXVoiceChangerType.getNativeValue());
        TXCAudioEngineJNI.nativeSetCaptureVoiceChanger(tXVoiceChangerType.getNativeValue());
        return true;
    }

    public boolean setEncoderFECPercent(float f) {
        TXCAudioEngineJNI.nativeSetEncoderFECPercent(f);
        return true;
    }

    public boolean setAudioEncoderParam(int i, int i2) {
        TXCAudioEngineJNI.nativeSetAudioEncoderParam(i, i2);
        return true;
    }

    public boolean enableCaptureEOSMode(boolean z) {
        TXCLog.i(TAG, "enableEosMode " + z);
        TXCAudioEngineJNI.nativeEnableCaptureEOSMode(z);
        return true;
    }

    public boolean isAudioDeviceCapturing() {
        boolean nativeIsAudioDeviceCapturing = TXCAudioEngineJNI.nativeIsAudioDeviceCapturing();
        TXCLog.i(TAG, "isRecording: " + nativeIsAudioDeviceCapturing);
        return nativeIsAudioDeviceCapturing;
    }

    public int getSoftwareCaptureVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetSoftwareCaptureVolumeLevel();
    }

    public void startRemoteAudio(String str, boolean z) {
        TXCAudioEngineJNI.nativeStartRemoteAudio(sInstance, z, str);
        TXCAudioEngineJNI.nativeSetRemoteAudioJitterCycle(str, com.tencent.liteav.basic.d.c.a().a("Audio", "LIVE_JitterCycle"));
        TXCAudioEngineJNI.nativeSetRemoteAudioBlockThreshold(str, com.tencent.liteav.basic.d.c.a().a("Audio", "LoadingThreshold"));
    }

    public void stopRemoteAudio(String str) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeStopRemoteAudio(str);
    }

    public void setSetAudioEngineRemoteStreamDataListener(String str, f fVar) {
        if (str == null) {
            return;
        }
        synchronized (mJitterDataListenerMapLock) {
            mJitterDataListenerMap.put(str, new WeakReference<>(fVar));
        }
        TXCAudioEngineJNI.nativeSetAudioEngineRemoteStreamDataListener(str, fVar != null);
    }

    public static void onAudioPlayPcmData(String str, byte[] bArr, long j, int i, int i2) {
        f fVar;
        synchronized (mJitterDataListenerMapLock) {
            fVar = mJitterDataListenerMap.get(str) != null ? mJitterDataListenerMap.get(str).get() : null;
        }
        if (fVar != null) {
            fVar.onAudioPlayPcmData(str, bArr, j, i, i2);
        }
    }

    public void setRemoteAudioStreamEventListener(String str, d dVar) {
        if (str == null) {
            return;
        }
        synchronized (mJitterEventListenerMapLock) {
            mJitterEventListenerMap.put(str, new WeakReference<>(dVar));
        }
    }

    public static void onAudioJitterBufferNotify(String str, int i, String str2) {
        d dVar;
        synchronized (mJitterEventListenerMapLock) {
            dVar = mJitterEventListenerMap.get(str) != null ? mJitterEventListenerMap.get(str).get() : null;
        }
        if (dVar != null) {
            TXCLog.i(TAG, "onAudioJitterBufferNotify  cur state " + i);
            dVar.onAudioJitterBufferNotify(str, i, str2);
        }
    }

    public void setRemoteAudioCacheParams(String str, boolean z, int i, int i2, int i3) {
        TXCAudioEngineJNI.nativeSetRemoteAudioCacheParams(str, z, i, i2, i3);
    }

    public void muteRemoteAudio(String str, boolean z) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudio(str, z);
    }

    public void muteRemoteAudioInSpeaker(String str, boolean z) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudioInSpeaker(str, z);
    }

    public void setRemotePlayoutVolume(String str, int i) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeSetRemotePlayoutVolume(str, i);
    }

    public boolean isRemoteAudioPlaying(String str) {
        if (str == null) {
            return false;
        }
        return TXCAudioEngineJNI.nativeIsRemoteAudioPlaying(str);
    }

    public int getRemotePlayoutVolumeLevel(String str) {
        if (str == null) {
            return 0;
        }
        return TXCAudioEngineJNI.nativeGetRemotePlayoutVolumeLevel(str);
    }

    public int getPlayAECType() {
        return has_trae ? 2 : 0;
    }

    public void addEventCallback(WeakReference<com.tencent.liteav.basic.c.a> weakReference) {
        if (weakReference == null) {
            return;
        }
        synchronized (this.mCallbackList) {
            this.mCallbackList.add(weakReference);
            TXCAudioEngineJNI.nativeSetEventCallbackEnabled(true);
        }
    }

    public void onEvent(String str, int i, String str2, String str3) {
        handleAudioEvent(str, i, str2, str3);
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            if (this.mCallbackList.size() <= 0) {
                return;
            }
            Iterator<WeakReference<com.tencent.liteav.basic.c.a>> it = this.mCallbackList.iterator();
            while (it.hasNext()) {
                com.tencent.liteav.basic.c.a aVar = it.next().get();
                if (aVar != null) {
                    arrayList.add(aVar);
                } else {
                    it.remove();
                }
            }
            if (this.mCallbackList.size() <= 0) {
                TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((com.tencent.liteav.basic.c.a) it2.next()).onEvent(str, i, str2, str3);
            }
        }
    }

    public void onWarning(String str, int i, String str2, String str3) {
        handleAudioEvent(str, i, str2, str3);
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            if (this.mCallbackList.size() <= 0) {
                return;
            }
            Iterator<WeakReference<com.tencent.liteav.basic.c.a>> it = this.mCallbackList.iterator();
            while (it.hasNext()) {
                com.tencent.liteav.basic.c.a aVar = it.next().get();
                if (aVar != null) {
                    arrayList.add(aVar);
                } else {
                    it.remove();
                }
            }
            if (this.mCallbackList.size() <= 0) {
                TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((com.tencent.liteav.basic.c.a) it2.next()).onWarning(str, i, str2, str3);
            }
        }
    }

    private void handleAudioEvent(String str, int i, String str2, String str3) {
        if (i == EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE) {
            b.a().a("timestamp_rollback_to_stable_samplerate", System.currentTimeMillis());
        } else if (i == EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE) {
            b.a().a("timestamp_rollback_to_stable_samplerate", 0L);
            TXCLog.i(TAG, "audio device restart when using stable samplerate");
        }
    }

    public void onError(String str, int i, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            if (this.mCallbackList.size() <= 0) {
                return;
            }
            Iterator<WeakReference<com.tencent.liteav.basic.c.a>> it = this.mCallbackList.iterator();
            while (it.hasNext()) {
                com.tencent.liteav.basic.c.a aVar = it.next().get();
                if (aVar != null) {
                    arrayList.add(aVar);
                } else {
                    it.remove();
                }
            }
            if (this.mCallbackList.size() <= 0) {
                TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((com.tencent.liteav.basic.c.a) it2.next()).onError(str, i, str2, str3);
            }
        }
    }

    public static void setPlayoutDataListener(f fVar) {
        mAudioCoreDataListener = new WeakReference<>(fVar);
        TXCAudioEngineJNI.nativeSetPlayoutDataListener(fVar != null);
    }

    public static void onCorePlayPcmData(byte[] bArr, long j, int i, int i2) {
        f fVar;
        if (mAudioCoreDataListener == null || (fVar = mAudioCoreDataListener.get()) == null) {
            return;
        }
        fVar.onAudioPlayPcmData(null, bArr, j, i, i2);
    }

    public static int getMixingPlayoutVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetMixingPlayoutVolumeLevel();
    }

    public StatusBucket getStatus(int i) {
        return TXCAudioEngineJNI.getStatus(i);
    }

    public static void setAudioRoute(int i) {
        TXCLog.i(TAG, "setAudioRoute: " + i);
        TXCAudioEngineJNI.nativeSetAudioRoute(i);
    }

    public static void setSystemVolumeType(int i) {
        TXCLog.i(TAG, "setSystemVolumeType: " + i);
        TXCAudioEngineJNI.nativeSetSystemVolumeType(i);
    }

    public static void enableAudioEarMonitoring(boolean z) {
        TXCLog.i(TAG, "enableAudioEarMonitoring: " + z);
        TXCAudioEngineJNI.nativeEnableAudioEarMonitoring(z);
    }

    public static void setAudioEarMonitoringVolume(int i) {
        TXCLog.i(TAG, "setAudioEarMonitoringVolume: " + i);
        TXCAudioEngineJNI.nativeSetAudioEarMonitoringVolume(i);
    }

    public int startLocalAudioDumping(int i, int i2, String str) {
        return TXCAudioEngineJNI.nativeStartLocalAudioDumping(i, i2, str);
    }

    public void stopLocalAudioDumping() {
        TXCAudioEngineJNI.nativeStopLocalAudioDumping();
    }

    public void setAudioDumpingListener(TXCAudioEngineJNI.a aVar) {
        TXCAudioEngineJNI.SetAudioDumpingListener(aVar);
    }

    public void setCaptureDataCallbackFormat(int i, int i2, int i3) {
        TXCLog.i(TAG, "setCaptureDataCallbackFormat: sampleRate-" + i + " channels-" + i2 + " length-" + i3);
        TXCAudioEngineJNI.nativeSetCaptureDataCallbackFormat(i, i2, i3);
    }

    public void setPlayoutDataCallbackFormat(int i, int i2, int i3) {
        TXCLog.i(TAG, "setPlayoutDataCallbackFormat: sampleRate-" + i + " channels-" + i2 + " length-" + i3);
        TXCAudioEngineJNI.nativeSetPlayoutDataCallbackFormat(i, i2, i3);
    }

    public void setRemoteStreamDataCallbackFormat(String str, int i, int i2, int i3) {
        TXCLog.i(TAG, "setRemoteStreamDataCallbackFormat: id-" + str + " sampleRate-" + i + " channels-" + i2 + " length-" + i3);
        TXCAudioEngineJNI.nativeSetRemoteStreamDataCallbackFormat(str, i, i2, i3);
    }

    public void clean() {
        TXCAudioEngineJNI.nativeClean();
    }

    public void forceCallbackMixedPlayAudioFrame(boolean z) {
        TXCAudioEngineJNI.nativeForceCallbackMixedPlayAudioFrame(z);
    }

    @Override // com.tencent.liteav.audio.impl.b
    public void onCallStateChanged(int i) {
        switch (i) {
            case 0:
                TXCLog.i(TAG, "TelephonyManager.CALL_STATE_IDLE!");
                if (this.mIsCallComed) {
                    this.mIsCallComed = false;
                    TXCAudioEngineJNI.resumeAudioCapture();
                    TXAudioEffectManagerImpl.getInstance().recoverAllMusics();
                    TXAudioEffectManagerImpl.getCacheInstance().recoverAllMusics();
                    TXAudioEffectManagerImpl.getAutoCacheHolder().recoverAllMusics();
                    return;
                }
                return;
            case 1:
                TXCLog.i(TAG, "TelephonyManager.CALL_STATE_RINGING!");
                return;
            case 2:
                TXCLog.i(TAG, "TelephonyManager.CALL_STATE_OFFHOOK!");
                TXCAudioEngineJNI.pauseAudioCapture(true);
                TXAudioEffectManagerImpl.getInstance().interruptAllMusics();
                TXAudioEffectManagerImpl.getCacheInstance().interruptAllMusics();
                TXAudioEffectManagerImpl.getAutoCacheHolder().interruptAllMusics();
                this.mIsCallComed = true;
                return;
            default:
                return;
        }
    }

    public void enableAutoRestartDevice(boolean z) {
        TXCAudioEngineJNI.nativeEnableAutoRestartDevice(z);
    }

    public void setMaxSelectedPlayStreams(int i) {
        TXCAudioEngineJNI.nativeSetMaxSelectedPlayStreams(i);
    }

    public void setMixedAllDataListener(e eVar) {
        TXCAudioEngineJNI.setMixedAllDataListener(eVar);
    }

    public static String buildTRAEConfig(Context context, Boolean bool, boolean z, long j) {
        String str = ((("sharp {\n") + "  os android\n") + "  trae {\n") + "    dev {\n";
        if (bool != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  closeOpensl ");
            sb.append(bool.booleanValue() ? "n" : Constants.GestureMoveEvent.KEY_Y);
            sb.append("\n");
            str = sb.toString();
        }
        boolean z2 = System.currentTimeMillis() - b.a().b("timestamp_rollback_to_stable_samplerate", 0L) < j;
        TXCLog.i(TAG, "low latency samplerate, enable: %b, isBlocked: %b, blockTime: %d", Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j));
        if (!z2 && z && getLowLatencySampleRate(context) == 48000) {
            str = ((((((str + "  component 1\n") + "  cap {\n") + "    hw_sr 48000\n") + "  }\n") + "  play {\n") + "    hw_sr 48000\n") + "  }";
        }
        return ((str + "    }\n") + "  }\n") + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    private static int getLowLatencySampleRate(Context context) {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT < 17 || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return -1;
        }
        try {
            return Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (NumberFormatException e) {
            TXCLog.e(TAG, "can't parse low latency samplerate", e);
            return -1;
        }
    }

    public void setSystemAudioKitEnabled() {
        startSystemAudioKit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSystemAudioKit() {
        if (this.mAudioKit != null || mContext == null) {
            return;
        }
        this.mAudioKit = createManufacturerAudioKit(mContext);
        if (this.mAudioKit != null) {
            TXCAudioEngineJNI.nativeNotifySystemEarMonitoringInitializing();
            this.mAudioKit.initialize(mContext, this);
            return;
        }
        TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.a
    public void onAudioKitInitFinished(TXSystemAudioKit tXSystemAudioKit, boolean z) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.i(TAG, "system audio kit init finished, ret: %b.", Boolean.valueOf(z));
        if (z) {
            return;
        }
        TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.a
    public void onEarMonitoringInitialized(TXSystemAudioKit tXSystemAudioKit, boolean z) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.i(TAG, "onEarMonitoringInitialized result: %b", Boolean.valueOf(z));
        if (z) {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(this.mAudioKit);
        } else {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
        }
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.a
    public void onAudioKitError(TXSystemAudioKit tXSystemAudioKit) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.i(TAG, "onAudioKitError");
        if (this.mAudioKit != null) {
            this.mAudioKit.stopSystemEarMonitoring();
            this.mAudioKit.uninitialize();
            this.mAudioKit = null;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.liteav.audio.TXCAudioEngine.1
            @Override // java.lang.Runnable
            public void run() {
                TXCAudioEngine.this.startSystemAudioKit();
            }
        }, SYSTEM_AUDIO_KIT_RESTART_INTERVAL);
    }

    private TXSystemAudioKit createManufacturerAudioKit(Context context) {
        if (Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
            return new HuaweiAudioKit();
        }
        return null;
    }
}
