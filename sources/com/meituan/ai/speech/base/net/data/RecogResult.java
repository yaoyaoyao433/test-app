package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R \u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR(\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/RecogResult;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", KnbConstants.PARAMS_BIZ_DATA, "", "getBiz_data", "()Ljava/lang/String;", "setBiz_data", "(Ljava/lang/String;)V", "file_url", "getFile_url", "setFile_url", KnbConstants.PARAMS_INDEX, "", "getRes_index", "()I", "setRes_index", "(I)V", "sentences", "", "Lcom/meituan/ai/speech/base/net/data/RecogResultPart;", "getSentences", "()Ljava/util/List;", "setSentences", "(Ljava/util/List;)V", "session_id", "getSession_id", "setSession_id", "speech_time", "getSpeech_time", "setSpeech_time", "text", "getText", "setText", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "getVad_info", "()[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "setVad_info", "([Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;)V", "[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public class RecogResult implements IResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @Nullable
    private String biz_data;
    @Keep
    @Nullable
    private String file_url;
    @Keep
    private int res_index;
    @Keep
    @Nullable
    private List<RecogResultPart> sentences;
    @Keep
    @Nullable
    private String session_id;
    @Keep
    private int speech_time;
    @Keep
    @Nullable
    private String text;
    @Keep
    @Nullable
    private ServerVadInfo[] vad_info;

    public final int getRes_index() {
        return this.res_index;
    }

    public final void setRes_index(int i) {
        this.res_index = i;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    @Nullable
    public final String getSession_id() {
        return this.session_id;
    }

    public final void setSession_id(@Nullable String str) {
        this.session_id = str;
    }

    @Nullable
    public final String getFile_url() {
        return this.file_url;
    }

    public final void setFile_url(@Nullable String str) {
        this.file_url = str;
    }

    public final int getSpeech_time() {
        return this.speech_time;
    }

    public final void setSpeech_time(int i) {
        this.speech_time = i;
    }

    @Nullable
    public final ServerVadInfo[] getVad_info() {
        return this.vad_info;
    }

    public final void setVad_info(@Nullable ServerVadInfo[] serverVadInfoArr) {
        this.vad_info = serverVadInfoArr;
    }

    @Nullable
    public final String getBiz_data() {
        return this.biz_data;
    }

    public final void setBiz_data(@Nullable String str) {
        this.biz_data = str;
    }

    @Nullable
    public final List<RecogResultPart> getSentences() {
        return this.sentences;
    }

    public final void setSentences(@Nullable List<RecogResultPart> list) {
        this.sentences = list;
    }
}
