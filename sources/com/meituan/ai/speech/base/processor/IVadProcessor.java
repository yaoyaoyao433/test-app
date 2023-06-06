package com.meituan.ai.speech.base.processor;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.net.data.ServerVadInfo;
import com.meituan.ai.speech.base.processor.config.IVadConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH'¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H'J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH'¨\u0006\u0017"}, d2 = {"Lcom/meituan/ai/speech/base/processor/IVadProcessor;", "", "getVadConfig", "Lcom/meituan/ai/speech/base/processor/config/IVadConfig;", "appKey", "", "onEnd", "", "onServerVadResult", "isSpeechTimeLocal", "", "speechTime", "", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "(Ljava/lang/String;ZI[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;)V", "onStart", "sessionId", "process", "", "t", "isLast", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface IVadProcessor {
    @Keep
    @Nullable
    IVadConfig getVadConfig(@NotNull String str);

    @Keep
    void onEnd(@NotNull String str);

    @Keep
    void onServerVadResult(@NotNull String str, boolean z, int i, @Nullable ServerVadInfo[] serverVadInfoArr);

    @Keep
    void onStart(@NotNull String str, @NotNull String str2);

    @Keep
    @Nullable
    short[] process(@NotNull String str, @NotNull short[] sArr, boolean z);
}
