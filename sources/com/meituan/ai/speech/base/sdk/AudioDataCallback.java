package com.meituan.ai.speech.base.sdk;

import android.support.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/meituan/ai/speech/base/sdk/AudioDataCallback;", "", "onReceiveAudioData", "", "audioData", "", "audioSize", "", "isLast", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface AudioDataCallback {
    void onReceiveAudioData(@Nullable short[] sArr, int i, boolean z);
}
