package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    private static k d;
    b b;
    b c;
    final Object a = new Object();
    private final Handler e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: android.support.design.widget.k.1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            k kVar = k.this;
            b bVar = (b) message.obj;
            synchronized (kVar.a) {
                if (kVar.b == bVar || kVar.c == bVar) {
                    kVar.a(bVar, 2);
                }
            }
            return true;
        }
    });

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a() {
        if (d == null) {
            d = new k();
        }
        return d;
    }

    private k() {
    }

    public final void a(a aVar) {
        synchronized (this.a) {
            if (e(aVar)) {
                a(this.b);
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this.a) {
            if (e(aVar) && !this.b.c) {
                this.b.c = true;
                this.e.removeCallbacksAndMessages(this.b);
            }
        }
    }

    public final void c(a aVar) {
        synchronized (this.a) {
            if (e(aVar) && this.b.c) {
                this.b.c = false;
                a(this.b);
            }
        }
    }

    public final boolean d(a aVar) {
        boolean z;
        synchronized (this.a) {
            z = e(aVar) || f(aVar);
        }
        return z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        final WeakReference<a> a;
        int b;
        boolean c;

        final boolean a(a aVar) {
            return aVar != null && this.a.get() == aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(b bVar, int i) {
        if (bVar.a.get() != null) {
            this.e.removeCallbacksAndMessages(bVar);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(a aVar) {
        return this.b != null && this.b.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(a aVar) {
        return this.c != null && this.c.a(aVar);
    }

    private void a(b bVar) {
        if (bVar.b == -2) {
            return;
        }
        int i = 2750;
        if (bVar.b > 0) {
            i = bVar.b;
        } else if (bVar.b == -1) {
            i = 1500;
        }
        this.e.removeCallbacksAndMessages(bVar);
        this.e.sendMessageDelayed(Message.obtain(this.e, 0, bVar), i);
    }
}
