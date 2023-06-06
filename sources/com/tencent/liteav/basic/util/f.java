package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends Handler {
    public f(Looper looper) {
        super(looper);
    }

    public boolean a(final Runnable runnable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean post = post(new Runnable() { // from class: com.tencent.liteav.basic.util.f.1
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                countDownLatch.countDown();
            }
        });
        if (post) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return post;
    }
}
