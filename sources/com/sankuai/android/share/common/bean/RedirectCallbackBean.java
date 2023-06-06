package com.sankuai.android.share.common.bean;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.meituan.retrofit2.Response;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RedirectCallbackBean<T> extends CallbackBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public b.a channelType;
    public Context context;
    public ShareBaseBean data;
    public c listener;
    public Map<Object, Object> map;

    public RedirectCallbackBean(Response<T> response, Throwable th) {
        this.response = response;
        this.t = th;
    }
}
