package com.sankuai.android.share.common.bean;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PasswordCallbackBean<T> extends CallbackBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context context;
    public String title;
    public String url;

    public PasswordCallbackBean(Response<T> response, Throwable th) {
        this.response = response;
        this.t = th;
    }
}
