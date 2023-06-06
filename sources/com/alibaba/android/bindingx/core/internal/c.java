package com.alibaba.android.bindingx.core.internal;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.Choreographer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface a {
        void d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(@NonNull a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c();

    c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a() {
        if (Build.VERSION.SDK_INT >= 16) {
            return new b();
        }
        return new C0019c();
    }

    /* compiled from: ProGuard */
    @TargetApi(16)
    /* loaded from: classes.dex */
    static class b extends c implements Choreographer.FrameCallback {
        private Choreographer a = Choreographer.getInstance();
        private a b;
        private boolean c;

        @TargetApi(16)
        b() {
        }

        @Override // com.alibaba.android.bindingx.core.internal.c
        final void b() {
            if (this.a != null) {
                this.a.removeFrameCallback(this);
            }
            this.c = false;
        }

        @Override // com.alibaba.android.bindingx.core.internal.c
        final void c() {
            b();
            this.a = null;
        }

        @Override // com.alibaba.android.bindingx.core.internal.c
        final void a(@NonNull a aVar) {
            this.b = aVar;
            this.c = true;
            if (this.a != null) {
                this.a.postFrameCallback(this);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            if (this.b != null) {
                this.b.d();
            }
            if (this.a == null || !this.c) {
                return;
            }
            this.a.postFrameCallback(this);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.alibaba.android.bindingx.core.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0019c extends c implements Handler.Callback {
        private HandlerThread a;
        private Handler b;
        private a c;
        private boolean d;

        C0019c() {
            if (this.a != null) {
                c();
            }
            this.a = new HandlerThread("expression-timing-thread");
            this.a.start();
            this.b = new Handler(this.a.getLooper(), this);
        }

        @Override // com.alibaba.android.bindingx.core.internal.c
        final void b() {
            if (this.b != null) {
                this.b.removeCallbacksAndMessages(null);
            }
            this.d = false;
        }

        @Override // com.alibaba.android.bindingx.core.internal.c
        final void c() {
            b();
            if (Build.VERSION.SDK_INT >= 18) {
                this.a.quitSafely();
            } else {
                this.a.quit();
            }
            this.b = null;
            this.a = null;
        }

        @Override // com.alibaba.android.bindingx.core.internal.c
        final void a(@NonNull a aVar) {
            this.c = aVar;
            this.d = true;
            if (this.b != null) {
                this.b.sendEmptyMessage(100);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message == null || message.what != 100 || this.b == null) {
                return false;
            }
            if (this.c != null) {
                this.c.d();
            }
            if (this.d) {
                this.b.sendEmptyMessageDelayed(100, 16L);
                return true;
            }
            return true;
        }
    }
}
