package com.sankuai.android.share.common.bean;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortUrlCallbackBean<T> extends CallbackBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public b.a channelType;
    public Context context;
    public ShareBaseBean data;
    public c listener;

    public ShortUrlCallbackBean(Response<T> response, Throwable th) {
        this.response = response;
        this.t = th;
    }
}
