package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/RecogResultPart;", "", "()V", "confidence", "", "getConfidence", "()F", "setConfidence", "(F)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class RecogResultPart {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float confidence;
    @Nullable
    private String content;

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
}
