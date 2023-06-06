package com.meituan.android.common.horn.extra.uuid;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IUUIDService {
    String getUUID(Context context);

    void getUUID(Context context, IUUIDListener iUUIDListener);

    String loadUUIDFromSelfCache(Context context);
}
