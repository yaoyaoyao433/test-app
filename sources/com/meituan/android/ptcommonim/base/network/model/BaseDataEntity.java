package com.meituan.android.ptcommonim.base.network.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class BaseDataEntity<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public T data;
    public String msg;
}
