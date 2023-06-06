package com.unionpay.mobile.android.upwidget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public class UPScrollView extends ScrollView {
    private WeakReference<a> a;
    private int b;
    private ViewTreeObserver.OnGlobalLayoutListener c;
    private Handler d;

    /* loaded from: classes6.dex */
    public interface a {
        void e(int i);
    }

    public UPScrollView(Context context) {
        this(context, null);
    }

    public UPScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UPScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new v(this);
        this.c = new u(this);
    }

    public final void a(a aVar) {
        this.a = new WeakReference<>(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this.c);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a != null && this.a.get() != null) {
            int scrollY = getScrollY();
            this.b = scrollY;
            this.a.get().e(scrollY);
        }
        if (motionEvent.getAction() == 1) {
            this.d.sendMessageDelayed(this.d.obtainMessage(), 5L);
        }
        return super.onTouchEvent(motionEvent);
    }
}
