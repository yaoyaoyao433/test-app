package android.arch.lifecycle;

import android.arch.lifecycle.d;
import android.os.Handler;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    final g a;
    private final Handler b = new Handler();
    private a c;

    public n(@NonNull f fVar) {
        this.a = new g(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d.a aVar) {
        if (this.c != null) {
            this.c.run();
        }
        this.c = new a(this.a, aVar);
        this.b.postAtFrontOfQueue(this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a implements Runnable {
        final d.a a;
        private final g b;
        private boolean c = false;

        a(@NonNull g gVar, d.a aVar) {
            this.b = gVar;
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c) {
                return;
            }
            this.b.a(this.a);
            this.c = true;
        }
    }
}
