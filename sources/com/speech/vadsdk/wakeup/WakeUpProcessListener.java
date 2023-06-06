package com.speech.vadsdk.wakeup;

import android.support.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpProcessListener;", "", "onProcessFailed", "", "code", "", "message", "", "onProcessWakeUp", "result", "Lcom/speech/vadsdk/wakeup/WakeUpResult;", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public interface WakeUpProcessListener {
    void onProcessFailed(int i, @NotNull String str);

    void onProcessWakeUp(@NotNull WakeUpResult wakeUpResult);
}
