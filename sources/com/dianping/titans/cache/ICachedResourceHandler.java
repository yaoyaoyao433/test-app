package com.dianping.titans.cache;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ICachedResourceHandler {
    void init(Context context);

    MimeTypeInputStream match(Context context, String str, String str2);
}
