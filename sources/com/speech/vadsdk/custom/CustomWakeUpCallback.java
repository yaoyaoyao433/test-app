package com.speech.vadsdk.custom;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.speech.vadsdk.log.b;
import com.speech.vadsdk.wakeup.WakeUpAndAsrListener;
import com.speech.vadsdk.wakeup.WakeUpManager;
import com.speech.vadsdk.wakeup.WakeUpResult;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public final class CustomWakeUpCallback implements WakeUpAndAsrListener {
    private WakeUpAndAsrListener mWakeUpAudioListener;
    private WakeUpAndAsrListener mWakeUpRecordListener;

    public final void setWakeUpRecordListener(@Nullable WakeUpAndAsrListener wakeUpAndAsrListener) {
        this.mWakeUpRecordListener = wakeUpAndAsrListener;
    }

    public final void setWakeUpAudioListener(@Nullable WakeUpAndAsrListener wakeUpAndAsrListener) {
        this.mWakeUpAudioListener = wakeUpAndAsrListener;
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onStart() {
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onStart();
        }
        if (this.mWakeUpAudioListener != null) {
            this.mWakeUpAudioListener.onStart();
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onWakeUpResult(WakeUpResult wakeUpResult) {
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onWakeUpResult(wakeUpResult);
        }
        if (this.mWakeUpAudioListener != null) {
            this.mWakeUpAudioListener.onWakeUpResult(wakeUpResult);
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onAudioData(short[] sArr) {
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onAudioData(sArr);
        }
        if (this.mWakeUpAudioListener != null) {
            this.mWakeUpAudioListener.onAudioData(sArr);
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onVoiceDB(float f) {
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onVoiceDB(f);
        }
        if (this.mWakeUpAudioListener != null) {
            this.mWakeUpAudioListener.onVoiceDB(f);
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onComplete() {
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onComplete();
        }
        if (this.mWakeUpAudioListener != null) {
            this.mWakeUpAudioListener.onComplete();
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onFailed(String str, int i, String str2) {
        b.b(WakeUpManager.getInstance().getWakeUpEnvironment() != null ? WakeUpManager.getInstance().getWakeUpEnvironment().getAppKey() : "", str, i, str2);
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onFailed(str, i, str2);
        }
        if (this.mWakeUpAudioListener != null) {
            this.mWakeUpAudioListener.onFailed(str, i, str2);
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onTempAsr(String str, WakeUpResult wakeUpResult, RecogResult recogResult) {
        if (recogResult.getRes_index() == 0) {
            b.a(WakeUpManager.getInstance().getWakeUpEnvironment() != null ? WakeUpManager.getInstance().getWakeUpEnvironment().getAppKey() : "", str, wakeUpResult, recogResult);
        }
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onTempAsr(str, wakeUpResult, recogResult);
        }
    }

    @Override // com.speech.vadsdk.wakeup.WakeUpAndAsrListener
    public final void onAsr(String str, WakeUpResult wakeUpResult, RecogResult recogResult) {
        b.b(WakeUpManager.getInstance().getWakeUpEnvironment() != null ? WakeUpManager.getInstance().getWakeUpEnvironment().getAppKey() : "", str, wakeUpResult, recogResult);
        if (this.mWakeUpRecordListener != null) {
            this.mWakeUpRecordListener.onAsr(str, wakeUpResult, recogResult);
        }
    }
}
