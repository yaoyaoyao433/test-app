package com.meituan.ai.speech.base.processor.config;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.uuid.GetUUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\tH'J\b\u0010\u000b\u001a\u00020\tH'J\b\u0010\f\u001a\u00020\tH'J\b\u0010\r\u001a\u00020\tH'J\b\u0010\u000e\u001a\u00020\tH'J\b\u0010\u000f\u001a\u00020\tH'J\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\tH'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\tH'J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\tH'J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\tH'J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\tH'J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH'¨\u0006#"}, d2 = {"Lcom/meituan/ai/speech/base/processor/config/IVadConfig;", "", "destroy", "", "appKey", "", "recognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "getEndTipTime", "", "getLeastSilenceSize", "getLeastSoundSize", "getStartTipTime", "getVadModel", "getWakeUpDrawlTime", "getWakeUpOffsetTime", GetUUID.REGISTER, "context", "Landroid/content/Context;", "setCallback", "callback", "Lcom/meituan/ai/speech/base/processor/callback/IVadCallback;", "setEndTipTime", "endTipTime", "setLeastSilenceSize", "leastSilenceSize", "setLeastSoundSize", "leastSoundSize", "setStartTipTime", "startTipTime", "setVadModel", "vadModel", "setWakeUpOffsetTime", "wakeUpOffsetTime", "Companion", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface IVadConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    void destroy(@NotNull String str, @Nullable ISpeechRecognizer iSpeechRecognizer);

    @Keep
    int getEndTipTime();

    @Keep
    int getLeastSilenceSize();

    @Keep
    int getLeastSoundSize();

    @Keep
    int getStartTipTime();

    @Keep
    int getVadModel();

    @Keep
    int getWakeUpDrawlTime();

    @Keep
    int getWakeUpOffsetTime();

    @Keep
    void register(@NotNull Context context, @NotNull String str, @Nullable ISpeechRecognizer iSpeechRecognizer);

    @Keep
    void setCallback(@NotNull IVadCallback iVadCallback);

    @Keep
    void setEndTipTime(int i);

    @Keep
    void setLeastSilenceSize(int i);

    @Keep
    void setLeastSoundSize(int i);

    @Keep
    void setStartTipTime(int i);

    @Keep
    void setVadModel(int i);

    @Keep
    void setWakeUpOffsetTime(int i);

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/meituan/ai/speech/base/processor/config/IVadConfig$Companion;", "", "()V", "defaultLeastSilenceSize", "", "getDefaultLeastSilenceSize", "()I", "setDefaultLeastSilenceSize", "(I)V", "defaultLeastSoundSize", "getDefaultLeastSoundSize", "setDefaultLeastSoundSize", "defaultVadModel", "getDefaultVadModel", "setDefaultVadModel", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static int defaultLeastSilenceSize;
        private static int defaultLeastSoundSize;
        private static int defaultVadModel;

        public final int getDefaultVadModel() {
            return defaultVadModel;
        }

        public final void setDefaultVadModel(int i) {
            defaultVadModel = i;
        }

        public final int getDefaultLeastSoundSize() {
            return defaultLeastSoundSize;
        }

        public final void setDefaultLeastSoundSize(int i) {
            defaultLeastSoundSize = i;
        }

        public final int getDefaultLeastSilenceSize() {
            return defaultLeastSilenceSize;
        }

        public final void setDefaultLeastSilenceSize(int i) {
            defaultLeastSilenceSize = i;
        }
    }
}
