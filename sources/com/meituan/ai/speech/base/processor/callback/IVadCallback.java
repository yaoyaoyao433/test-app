package com.meituan.ai.speech.base.processor.callback;

import android.support.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'¨\u0006\f"}, d2 = {"Lcom/meituan/ai/speech/base/processor/callback/IVadCallback;", "", "failed", "", "code", "", "message", "", "onEnd", "isLocal", "", "onStart", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface IVadCallback {
    @Keep
    void failed(int i, @NotNull String str);

    @Keep
    void onEnd(boolean z);

    @Keep
    void onStart(boolean z);
}
