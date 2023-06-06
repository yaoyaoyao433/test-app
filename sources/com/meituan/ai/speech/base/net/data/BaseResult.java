package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.ai.speech.base.net.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/BaseResult;", "T", "Lcom/meituan/ai/speech/base/net/data/IResult;", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class BaseResult<T> implements IResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("errcode")
    @Keep
    private int code;
    @Keep
    @Nullable
    private T data;
    @SerializedName("errmsg")
    @Keep
    @Nullable
    private String msg;

    public BaseResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b4fbd1335ef41aedf0e8146cef99bf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b4fbd1335ef41aedf0e8146cef99bf9");
        } else {
            this.code = a.SUCCESS.N;
        }
    }

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }
}
