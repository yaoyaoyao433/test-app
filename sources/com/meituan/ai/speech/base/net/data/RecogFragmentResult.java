package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", "result", "", "Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$SentenceInfo;", "getResult", "()[Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$SentenceInfo;", "setResult", "([Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$SentenceInfo;)V", "[Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$SentenceInfo;", "speech_time", "", "getSpeech_time", "()I", "setSpeech_time", "(I)V", "SentenceInfo", "Word", "WordInfo", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public class RecogFragmentResult implements IResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @Nullable
    private SentenceInfo[] result;
    @Keep
    private int speech_time;

    public final int getSpeech_time() {
        return this.speech_time;
    }

    public final void setSpeech_time(int i) {
        this.speech_time = i;
    }

    @Nullable
    public final SentenceInfo[] getResult() {
        return this.result;
    }

    public final void setResult(@Nullable SentenceInfo[] sentenceInfoArr) {
        this.result = sentenceInfoArr;
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$SentenceInfo;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", "channel", "", "getChannel", "()I", "setChannel", "(I)V", Constants.GestureData.KEY_END_TIME, "getEnd_time", "setEnd_time", "sentences", "", "Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$WordInfo;", "getSentences", "()[Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$WordInfo;", "setSentences", "([Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$WordInfo;)V", "[Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$WordInfo;", Constants.GestureData.KEY_START_TIME, "getStart_time", "setStart_time", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class SentenceInfo implements IResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Keep
        private int channel;
        @Keep
        private int end_time;
        @Keep
        @Nullable
        private WordInfo[] sentences;
        @Keep
        private int start_time;

        public final int getChannel() {
            return this.channel;
        }

        public final void setChannel(int i) {
            this.channel = i;
        }

        public final int getStart_time() {
            return this.start_time;
        }

        public final void setStart_time(int i) {
            this.start_time = i;
        }

        public final int getEnd_time() {
            return this.end_time;
        }

        public final void setEnd_time(int i) {
            this.end_time = i;
        }

        @Nullable
        public final WordInfo[] getSentences() {
            return this.sentences;
        }

        public final void setSentences(@Nullable WordInfo[] wordInfoArr) {
            this.sentences = wordInfoArr;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$WordInfo;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", "confidence", "", "getConfidence", "()F", "setConfidence", "(F)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "words", "", "Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$Word;", "getWords", "()[Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$Word;", "setWords", "([Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$Word;)V", "[Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$Word;", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class WordInfo implements IResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Keep
        private float confidence;
        @Keep
        @Nullable
        private String content;
        @Keep
        @Nullable
        private Word[] words;

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final float getConfidence() {
            return this.confidence;
        }

        public final void setConfidence(float f) {
            this.confidence = f;
        }

        @Nullable
        public final Word[] getWords() {
            return this.words;
        }

        public final void setWords(@Nullable Word[] wordArr) {
            this.words = wordArr;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult$Word;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", "confidence", "", "getConfidence", "()F", "setConfidence", "(F)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", Constants.GestureData.KEY_END_TIME, "", "getEnd_time", "()I", "setEnd_time", "(I)V", Constants.GestureData.KEY_START_TIME, "getStart_time", "setStart_time", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Word implements IResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Keep
        private float confidence;
        @Keep
        @Nullable
        private String content;
        @Keep
        private int end_time;
        @Keep
        private int start_time;

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final float getConfidence() {
            return this.confidence;
        }

        public final void setConfidence(float f) {
            this.confidence = f;
        }

        public final int getStart_time() {
            return this.start_time;
        }

        public final void setStart_time(int i) {
            this.start_time = i;
        }

        public final int getEnd_time() {
            return this.end_time;
        }

        public final void setEnd_time(int i) {
            this.end_time = i;
        }
    }
}
