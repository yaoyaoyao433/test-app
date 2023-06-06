package com.meituan.android.common.horn.extra.sharkpush;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ISharkPushService {
    void init(Context context);

    int registerPush(String str, ISharkPushListener iSharkPushListener);
}
