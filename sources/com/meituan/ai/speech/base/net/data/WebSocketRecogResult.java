package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/WebSocketRecogResult;", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "()V", Constants.GestureData.KEY_END_TIME, "", "getEnd_time", "()I", "setEnd_time", "(I)V", Constants.GestureData.KEY_START_TIME, "getStart_time", "setStart_time", "status", "getStatus", "setStatus", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class WebSocketRecogResult extends RecogResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    private int end_time;
    @Keep
    private int start_time;
    @Keep
    private int status;

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
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
