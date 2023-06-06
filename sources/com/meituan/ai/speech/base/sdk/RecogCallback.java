package com.meituan.ai.speech.base.sdk;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.ai.speech.base.net.data.RecogResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0012"}, d2 = {"Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "", "failed", "", "audioId", "", "code", "", "message", "onOvertimeClose", "onVoiceDBSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "", "start", "success", "result", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "tempResult", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface RecogCallback {
    @Keep
    void failed(@NotNull String str, int i, @NotNull String str2);

    void onOvertimeClose(@NotNull String str);

    void onVoiceDBSize(double d);

    void start(@NotNull String str);

    @Keep
    void success(@NotNull String str, @NotNull RecogResult recogResult);

    @Keep
    void tempResult(@NotNull String str, @NotNull RecogResult recogResult);
}
