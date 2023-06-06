package com.meituan.ai.speech.sdk.record;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/meituan/ai/speech/sdk/record/AudioDataConfig;", "", "()V", "audioChannel", "", "getAudioChannel", "()I", "setAudioChannel", "(I)V", "audioData", "", "getAudioData", "()[B", "setAudioData", "([B)V", "audioFormat", "", "getAudioFormat", "()Ljava/lang/String;", "setAudioFormat", "(Ljava/lang/String;)V", "audioSampleRate", "getAudioSampleRate", "setAudioSampleRate", "isInit", "", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AudioDataConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int audioChannel;
    @NotNull
    public byte[] audioData;
    @NotNull
    private String audioFormat;
    private int audioSampleRate;

    public AudioDataConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6675abbd3b9eb06ceb0dff591663c0cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6675abbd3b9eb06ceb0dff591663c0cc");
            return;
        }
        this.audioFormat = "pcm";
        this.audioChannel = 16;
        this.audioSampleRate = 16000;
    }

    @NotNull
    public final String getAudioFormat() {
        return this.audioFormat;
    }

    public final void setAudioFormat(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07cc4f9922335b9b100fddb84800078b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07cc4f9922335b9b100fddb84800078b");
            return;
        }
        h.b(str, "<set-?>");
        this.audioFormat = str;
    }

    public final int getAudioChannel() {
        return this.audioChannel;
    }

    public final void setAudioChannel(int i) {
        this.audioChannel = i;
    }

    public final int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    public final void setAudioSampleRate(int i) {
        this.audioSampleRate = i;
    }

    @NotNull
    public final byte[] getAudioData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be2e6359ee1e84ff7393ee438f49e60", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be2e6359ee1e84ff7393ee438f49e60");
        }
        byte[] bArr = this.audioData;
        if (bArr == null) {
            h.a("audioData");
        }
        return bArr;
    }

    public final void setAudioData(@NotNull byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fac7a83722f75508204d91ffa4d807a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fac7a83722f75508204d91ffa4d807a2");
            return;
        }
        h.b(bArr, "<set-?>");
        this.audioData = bArr;
    }

    public final boolean isInit() {
        return this.audioData != null;
    }
}
