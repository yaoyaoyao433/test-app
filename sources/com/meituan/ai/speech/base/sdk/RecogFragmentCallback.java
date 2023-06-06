package com.meituan.ai.speech.base.sdk;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.net.data.RecogFragmentResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H'J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u000e"}, d2 = {"Lcom/meituan/ai/speech/base/sdk/RecogFragmentCallback;", "", "recogFailed", "", "sessionId", "", "code", "", "message", "recogSuccess", "resultText", "recogResult", "Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult;", "start", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface RecogFragmentCallback {
    @Keep
    void recogFailed(@NotNull String str, int i, @NotNull String str2);

    @Keep
    void recogSuccess(@NotNull String str, @NotNull String str2, @NotNull RecogFragmentResult recogFragmentResult);

    @Keep
    void start(@NotNull String str);
}
