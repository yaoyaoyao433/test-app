package com.meituan.android.legwork.net.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MapBaseEntity<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("msg")
    public String msg;
    @SerializedName("result")
    public T result;
    @SerializedName("source")
    public String source;
    @SerializedName("status")
    public int status;
    @SerializedName("wmCityId")
    public int wmCityId;
}
