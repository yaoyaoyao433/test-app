package com.meituan.ai.speech.base.sdk;

import android.content.Context;
import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.ai.speech.base.processor.IVadProcessor;
import com.meituan.uuid.GetUUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH'J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0005H'J#\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H'¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH&J4\u0010\u001a\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH'¨\u0006 "}, d2 = {"Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "", "addVADProcessor", "", "processor", "Lcom/meituan/ai/speech/base/processor/IVadProcessor;", "appendAuthParams", "appKey", "", "secretKey", "cancelAllRecognize", "end", "context", "Landroid/content/Context;", "getTransferAudioSize", "", "getVADProcessor", "recognize", "data", "", "", "(Landroid/content/Context;[Ljava/lang/Short;)V", GetUUID.REGISTER, "uuid", "setTransferAudioSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "start", "sessionId", "asrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "callback", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface ISpeechRecognizer {
    @Keep
    void addVADProcessor(@NotNull IVadProcessor iVadProcessor);

    @Keep
    void appendAuthParams(@NotNull String str, @NotNull String str2);

    void cancelAllRecognize();

    @Keep
    void end(@NotNull Context context);

    int getTransferAudioSize();

    @Keep
    @Nullable
    IVadProcessor getVADProcessor();

    @Keep
    void recognize(@NotNull Context context, @NotNull Short[] shArr);

    @Keep
    void register(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void setTransferAudioSize(int i);

    @Keep
    void start(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull AsrConfig asrConfig, @Nullable RecogCallback recogCallback);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Keep
        public static /* synthetic */ void start$default(ISpeechRecognizer iSpeechRecognizer, Context context, String str, String str2, AsrConfig asrConfig, RecogCallback recogCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 16) != 0) {
                recogCallback = null;
            }
            iSpeechRecognizer.start(context, str, str2, asrConfig, recogCallback);
        }
    }
}
