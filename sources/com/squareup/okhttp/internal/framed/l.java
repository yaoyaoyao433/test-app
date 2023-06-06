package com.squareup.okhttp.internal.framed;

import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l {
    final CountDownLatch a = new CountDownLatch(1);
    long b = -1;
    long c = -1;

    l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void cancel() {
        if (this.c != -1 || this.b == -1) {
            throw new IllegalStateException();
        }
        this.c = this.b - 1;
        this.a.countDown();
    }
}
