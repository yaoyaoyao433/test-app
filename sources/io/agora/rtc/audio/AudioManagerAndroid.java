package io.agora.rtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioManagerAndroid {
    private static final int DEFAULT_FRAMES_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLING_RATE = 44100;
    private AudioManager audioManager;
    private int mAudioLowLatencyOutputFrameSize;
    private boolean mAudioLowLatencySupported;
    private int mNativeOutputSampleRate;
    private Context mcontext;

    private AudioManagerAndroid(Context context) {
        this.mcontext = context;
        this.audioManager = (AudioManager) context.getSystemService("audio");
        this.mNativeOutputSampleRate = 44100;
        this.mAudioLowLatencyOutputFrameSize = 256;
        if (Build.VERSION.SDK_INT >= 17) {
            String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property != null) {
                this.mNativeOutputSampleRate = Integer.parseInt(property);
            }
            String property2 = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            if (property2 != null) {
                this.mAudioLowLatencyOutputFrameSize = Integer.parseInt(property2);
            }
        }
        this.mAudioLowLatencySupported = context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private int getNativeOutputSampleRate() {
        return this.mNativeOutputSampleRate;
    }

    private boolean isAudioLowLatencySupported() {
        return this.mAudioLowLatencySupported;
    }

    private int getAudioLowLatencyOutputFrameSize() {
        return this.mAudioLowLatencyOutputFrameSize;
    }

    private int QuerySpeakerStatus() {
        if (this.audioManager.isBluetoothScoOn()) {
            return 5;
        }
        if (this.audioManager.isWiredHeadsetOn()) {
            return 0;
        }
        return this.audioManager.isSpeakerphoneOn() ? 3 : 1;
    }

    private int SetPlayoutSpeaker(boolean z) {
        this.audioManager.setSpeakerphoneOn(z);
        return 0;
    }

    private int SetAudioMode(int i) {
        switch (i) {
            case 0:
                this.audioManager.setMode(0);
                break;
            case 1:
                this.audioManager.setMode(1);
                break;
            case 2:
                this.audioManager.setMode(2);
                break;
            case 3:
                this.audioManager.setMode(3);
                break;
            default:
                this.audioManager.setMode(0);
                break;
        }
        return 0;
    }

    private int GetAudioMode(int i) {
        return this.audioManager.getMode();
    }

    private boolean isHardwareEarbackSupported() {
        if (this.mcontext != null) {
            return HardwareEarbackController.getInstance(this.mcontext).isHardwareEarbackSupported();
        }
        return false;
    }

    private int enableHardwareEarback(boolean z) {
        if (this.mcontext != null) {
            return HardwareEarbackController.getInstance(this.mcontext).enableHardwareEarback(z);
        }
        return -1;
    }

    private int setHardwareEarbackVolume(int i) {
        if (this.mcontext != null) {
            return HardwareEarbackController.getInstance(this.mcontext).setHardwareEarbackVolume(i);
        }
        return -1;
    }
}
