package com.meituan.ai.speech.base.processor;

import android.support.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/meituan/ai/speech/base/processor/ICodecProcessor;", "", "onDestroy", "", "onStart", "process", "", "t", "", "isLast", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface ICodecProcessor {
    @Keep
    void onDestroy();

    @Keep
    void onStart();

    @Keep
    @NotNull
    byte[] process(@NotNull short[] sArr, boolean z);
}
