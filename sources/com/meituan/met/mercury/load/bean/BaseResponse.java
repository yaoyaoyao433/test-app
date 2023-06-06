package com.meituan.met.mercury.load.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseResponse<D> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    @SerializedName("body")
    public D data;
}
