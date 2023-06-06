package com.hhmedic.android.sdk.uikit;

import android.content.Context;
import android.os.Handler;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Handlers {
    public static final Handler newHandler(Context context) {
        return new Handler(context.getMainLooper());
    }

    private Handlers() {
    }
}
