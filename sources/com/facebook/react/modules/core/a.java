package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static a a;
    private Choreographer b = Choreographer.getInstance();

    public static a a() {
        UiThreadUtil.assertOnUiThread();
        if (a == null) {
            a = new a();
        }
        return a;
    }

    private a() {
    }

    public final void a(AbstractC0145a abstractC0145a) {
        this.b.postFrameCallback(abstractC0145a.getFrameCallback());
    }

    public final void a(AbstractC0145a abstractC0145a, long j) {
        this.b.postFrameCallbackDelayed(abstractC0145a.getFrameCallback(), j);
    }

    public final void b(AbstractC0145a abstractC0145a) {
        this.b.removeFrameCallback(abstractC0145a.getFrameCallback());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.modules.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0145a {
        private Choreographer.FrameCallback mFrameCallback;
        private Runnable mRunnable;

        public abstract void doFrame(long j);

        Choreographer.FrameCallback getFrameCallback() {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new Choreographer.FrameCallback() { // from class: com.facebook.react.modules.core.a.a.1
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        AbstractC0145a.this.doFrame(j);
                    }
                };
            }
            return this.mFrameCallback;
        }

        Runnable getRunnable() {
            if (this.mRunnable == null) {
                this.mRunnable = new Runnable() { // from class: com.facebook.react.modules.core.a.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0145a.this.doFrame(System.nanoTime());
                    }
                };
            }
            return this.mRunnable;
        }
    }
}
