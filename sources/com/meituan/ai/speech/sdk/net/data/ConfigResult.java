package com.meituan.ai.speech.sdk.net.data;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.net.data.IResult;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/meituan/ai/speech/sdk/net/data/ConfigResult;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", KnbConstants.PARAMS_ASR_MODEL, "", "getAsr_model", "()I", "setAsr_model", "(I)V", "asr_sound_model", "getAsr_sound_model", "setAsr_sound_model", "asr_vad_model", "getAsr_vad_model", "setAsr_vad_model", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "ignore_tmp_result", "getIgnore_tmp_result", "setIgnore_tmp_result", "language", "getLanguage", "setLanguage", "language_type", "getLanguage_type", "setLanguage_type", "need_punctuation", "getNeed_punctuation", "setNeed_punctuation", "normalize_text", "getNormalize_text", "setNormalize_text", KnbConstants.PARAMS_RECORD_SOUND_MAX_SIZE, "getRecord_sound_max_size", "setRecord_sound_max_size", "vad_least_silence_size", "getVad_least_silence_size", "setVad_least_silence_size", "vad_least_sound_size", "getVad_least_sound_size", "setVad_least_sound_size", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class ConfigResult implements IResult {
    public static ChangeQuickRedirect a;
    @Keep
    public int asr_model;
    @Keep
    public int asr_sound_model;
    @Keep
    public int asr_vad_model;
    @Keep
    public long duration;
    @Keep
    public int ignore_tmp_result;
    @Keep
    public int language;
    @Keep
    public int language_type;
    @Keep
    public int need_punctuation;
    @Keep
    public int normalize_text;
    @Keep
    public int record_sound_max_size;
    @Keep
    public int vad_least_silence_size;
    @Keep
    public int vad_least_sound_size;

    public ConfigResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2dc532b4be0e3990d3c567d2f0f76d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2dc532b4be0e3990d3c567d2f0f76d");
        } else {
            this.record_sound_max_size = 60000;
        }
    }
}
