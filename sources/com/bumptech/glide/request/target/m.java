package com.bumptech.glide.request.target;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build;
import android.support.constraint.R;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class m<T extends View, Z> extends b<Z> {
    private static boolean b = false;
    private static Integer c;
    protected final T a;
    private final a d;

    public static void a(int i) {
        if (c != null || b) {
            return;
        }
        c = Integer.valueOf((int) R.id.mtpicasso_view_target);
    }

    public m(T t) {
        if (t == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.a = t;
        this.d = new a(t);
    }

    public final T o_() {
        return this.a;
    }

    @Override // com.bumptech.glide.request.target.l
    public final void a(j jVar) {
        a aVar = this.d;
        int b2 = aVar.b();
        int a2 = aVar.a();
        if (a.a(b2) && a.a(a2)) {
            jVar.a(b2, a2);
            return;
        }
        if (!aVar.b.contains(jVar)) {
            aVar.b.add(jVar);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
            aVar.c = new a.ViewTreeObserver$OnPreDrawListenerC0047a(aVar);
            viewTreeObserver.addOnPreDrawListener(aVar.c);
        }
    }

    public String toString() {
        return "Target for: " + this.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        final View a;
        final List<j> b = new ArrayList();
        ViewTreeObserver$OnPreDrawListenerC0047a c;
        private Point d;

        static boolean a(int i) {
            return i > 0 || i == -2;
        }

        public a(View view) {
            this.a = view;
        }

        int a() {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (a(this.a.getHeight())) {
                return this.a.getHeight();
            }
            if (layoutParams != null) {
                return a(layoutParams.height, true);
            }
            return 0;
        }

        int b() {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (a(this.a.getWidth())) {
                return this.a.getWidth();
            }
            if (layoutParams != null) {
                return a(layoutParams.width, false);
            }
            return 0;
        }

        private int a(int i, boolean z) {
            if (i == -2) {
                Point c = c();
                return z ? c.y : c.x;
            }
            return i;
        }

        @TargetApi(13)
        private Point c() {
            if (this.d != null) {
                return this.d;
            }
            Display defaultDisplay = ((WindowManager) this.a.getContext().getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 13) {
                this.d = new Point();
                defaultDisplay.getSize(this.d);
            } else {
                this.d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            return this.d;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.bumptech.glide.request.target.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class ViewTreeObserver$OnPreDrawListenerC0047a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> a;

            public ViewTreeObserver$OnPreDrawListenerC0047a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    new StringBuilder("OnGlobalLayoutListener called listener=").append(this);
                }
                a aVar = this.a.get();
                if (aVar != null) {
                    a.a(aVar);
                    return true;
                }
                return true;
            }
        }

        static /* synthetic */ void a(a aVar) {
            if (aVar.b.isEmpty()) {
                return;
            }
            int b = aVar.b();
            int a = aVar.a();
            if (a(b) && a(a)) {
                for (j jVar : aVar.b) {
                    jVar.a(b, a);
                }
                aVar.b.clear();
                ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.c);
                }
                aVar.c = null;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
    public void a(com.bumptech.glide.request.c cVar) {
        if (c == null) {
            b = true;
            this.a.setTag(cVar);
            return;
        }
        this.a.setTag(c.intValue(), cVar);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
    public com.bumptech.glide.request.c a() {
        Object tag;
        if (c == null) {
            tag = this.a.getTag();
        } else {
            tag = this.a.getTag(c.intValue());
        }
        if (tag != null) {
            if (tag instanceof com.bumptech.glide.request.c) {
                return (com.bumptech.glide.request.c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }
}
