package com.meituan.ai.speech.sdk.record;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meituan/ai/speech/sdk/record/RecordConfig;", "", "()V", "audioChannel", "", "getAudioChannel", "()I", "audioEncode", "getAudioEncode", "audioSource", "getAudioSource", "setAudioSource", "(I)V", "frequency", "getFrequency", "privacySceneToken", "", "getPrivacySceneToken", "()Ljava/lang/String;", "setPrivacySceneToken", "(Ljava/lang/String;)V", "Companion", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class RecordConfig {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final int defaultAudioChannel = 16;
    public static final int defaultAudioEncode = 2;
    public static final int defaultAudioSource = 1;
    public static final int defaultFrequency = 16000;
    private final int audioChannel;
    private final int audioEncode;
    private int audioSource;
    private final int frequency;
    @NotNull
    private String privacySceneToken;

    public RecordConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8264a870d629ab3b016f4bb1fc27fb1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8264a870d629ab3b016f4bb1fc27fb1a");
            return;
        }
        this.audioSource = 1;
        this.audioChannel = 16;
        this.audioEncode = 2;
        this.frequency = 16000;
        this.privacySceneToken = "";
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/meituan/ai/speech/sdk/record/RecordConfig$Companion;", "", "()V", "defaultAudioChannel", "", "defaultAudioEncode", "defaultAudioSource", "defaultFrequency", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public final int getAudioSource() {
        return this.audioSource;
    }

    public final void setAudioSource(int i) {
        this.audioSource = i;
    }

    public final int getAudioChannel() {
        return this.audioChannel;
    }

    public final int getAudioEncode() {
        return this.audioEncode;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getPrivacySceneToken() {
        return this.privacySceneToken;
    }

    public final void setPrivacySceneToken(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41d1a559c8e163804fde1fb3047930c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41d1a559c8e163804fde1fb3047930c2");
            return;
        }
        h.b(str, "<set-?>");
        this.privacySceneToken = str;
    }
}
