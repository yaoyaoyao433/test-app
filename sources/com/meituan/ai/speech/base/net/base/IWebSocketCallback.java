package com.meituan.ai.speech.base.net.base;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.net.data.ServerVadInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH'J-\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH'¢\u0006\u0002\u0010\u000fJ-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meituan/ai/speech/base/net/base/IWebSocketCallback;", "T", "", "onFailed", "", "code", "", "msg", "", "onSendServerVad", "appKey", "speechTime", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "(Ljava/lang/String;I[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;)V", "onSuccess", "startVadTime", "endVadTime", "result", "(Ljava/lang/String;IILjava/lang/Object;)V", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface IWebSocketCallback<T> {
    @Keep
    void onFailed(int i, @Nullable String str);

    @Keep
    void onSendServerVad(@NotNull String str, int i, @Nullable ServerVadInfo[] serverVadInfoArr);

    @Keep
    void onSuccess(@NotNull String str, int i, int i2, T t);
}
