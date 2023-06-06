package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", "end", "", "getEnd", "()I", "setEnd", "(I)V", "start", "getStart", "setStart", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class ServerVadInfo implements IResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    private int end;
    @Keep
    private int start;

    public final int getStart() {
        return this.start;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public final int getEnd() {
        return this.end;
    }

    public final void setEnd(int i) {
        this.end = i;
    }
}
