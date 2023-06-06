package com.meituan.android.common.sniffer;

import android.content.Context;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ContextHolder {
    private static ContextHolder self;
    private Context context;

    private ContextHolder() {
    }

    public static ContextHolder getInstance() {
        if (self == null) {
            synchronized (ContextHolder.class) {
                if (self == null) {
                    self = new ContextHolder();
                }
            }
        }
        return self;
    }

    public void updateContext(@NonNull Context context) {
        this.context = context;
    }

    public Context getContext() {
        return this.context;
    }
}
