package com.xiaomi.mipush.sdk;

import android.content.Context;
/* loaded from: classes6.dex */
public final class bm implements Runnable {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bm(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageHandleService.a(this.a);
    }
}
