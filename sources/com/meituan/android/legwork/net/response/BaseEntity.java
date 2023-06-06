package com.meituan.android.legwork.net.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class BaseEntity<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public T data;
    @SerializedName("message")
    public String message;
}
