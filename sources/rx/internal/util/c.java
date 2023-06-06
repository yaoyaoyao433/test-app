package rx.internal.util;

import java.util.concurrent.CountDownLatch;
import rx.annotations.Experimental;
/* compiled from: ProGuard */
@Experimental
/* loaded from: classes7.dex */
public final class c {
    @Experimental
    public static void a(CountDownLatch countDownLatch, rx.k kVar) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            kVar.unsubscribe();
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while waiting for subscription to complete.", e);
        }
    }
}
