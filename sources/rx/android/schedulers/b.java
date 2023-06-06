package rx.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import rx.exceptions.f;
import rx.g;
import rx.k;
import rx.subscriptions.e;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b extends g {
    private final Handler b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Looper looper) {
        this.b = new Handler(looper);
    }

    @Override // rx.g
    public final g.a a() {
        return new a(this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class a extends g.a {
        private final Handler a;
        private final rx.android.plugins.b b = rx.android.plugins.a.a().b();
        private volatile boolean c;

        a(Handler handler) {
            this.a = handler;
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.c;
        }

        @Override // rx.g.a
        public final k a(rx.functions.a aVar, long j, TimeUnit timeUnit) {
            if (this.c) {
                return e.b();
            }
            RunnableC1542b runnableC1542b = new RunnableC1542b(rx.android.plugins.b.a(aVar), this.a);
            Message obtain = Message.obtain(this.a, runnableC1542b);
            obtain.obj = this;
            this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (this.c) {
                this.a.removeCallbacks(runnableC1542b);
                return e.b();
            }
            return runnableC1542b;
        }

        @Override // rx.g.a
        public final k a(rx.functions.a aVar) {
            return a(aVar, 0L, TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.android.schedulers.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC1542b implements Runnable, k {
        private final rx.functions.a a;
        private final Handler b;
        private volatile boolean c;

        RunnableC1542b(rx.functions.a aVar, Handler handler) {
            this.a = aVar;
            this.b = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IllegalStateException illegalStateException;
            try {
                this.a.a();
            } catch (Throwable th) {
                if (th instanceof f) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                rx.plugins.e.a().b();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.c = true;
            this.b.removeCallbacks(this);
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.c;
        }
    }
}
