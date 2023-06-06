package com.speech.vadsdk.wakeup;

import android.support.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpResult;", "", "()V", "endOffset", "", "getEndOffset", "()I", "setEndOffset", "(I)V", "endTime", "getEndTime", "setEndTime", "keyword", "", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "keywordId", "getKeywordId", "setKeywordId", "keywordPinyin", "getKeywordPinyin", "setKeywordPinyin", "score", "", "getScore", "()F", "setScore", "(F)V", "startOffset", "getStartOffset", "setStartOffset", "startTime", "getStartTime", "setStartTime", "type", "getType", "setType", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class WakeUpResult {
    private int endOffset;
    private int endTime;
    @Nullable
    private String keyword;
    private int keywordId = -1;
    @Nullable
    private String keywordPinyin;
    private float score;
    private int startOffset;
    private int startTime;
    private int type;

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final int getKeywordId() {
        return this.keywordId;
    }

    public final void setKeywordId(int i) {
        this.keywordId = i;
    }

    public final float getScore() {
        return this.score;
    }

    public final void setScore(float f) {
        this.score = f;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final void setStartOffset(int i) {
        this.startOffset = i;
    }

    public final int getEndOffset() {
        return this.endOffset;
    }

    public final void setEndOffset(int i) {
        this.endOffset = i;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    @Nullable
    public final String getKeywordPinyin() {
        return this.keywordPinyin;
    }

    public final void setKeywordPinyin(@Nullable String str) {
        this.keywordPinyin = str;
    }
}
