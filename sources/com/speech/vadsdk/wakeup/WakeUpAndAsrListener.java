package com.speech.vadsdk.wakeup;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.net.data.RecogResult;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public interface WakeUpAndAsrListener {
    void onAsr(String str, WakeUpResult wakeUpResult, RecogResult recogResult);

    void onAudioData(short[] sArr);

    void onComplete();

    void onFailed(String str, int i, String str2);

    void onStart();

    void onTempAsr(String str, WakeUpResult wakeUpResult, RecogResult recogResult);

    void onVoiceDB(float f);

    void onWakeUpResult(WakeUpResult wakeUpResult);
}
