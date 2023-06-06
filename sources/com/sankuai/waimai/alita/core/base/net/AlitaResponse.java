package com.sankuai.waimai.alita.core.base.net;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public T data;
    public String msg;
}
