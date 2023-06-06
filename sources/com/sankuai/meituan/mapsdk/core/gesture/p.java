package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class p extends com.sankuai.meituan.mapsdk.core.gesture.a<a> {
    public static ChangeQuickRedirect h = null;
    public static boolean i = false;
    public final a j;
    private MotionEvent k;
    private MotionEvent l;
    private long m;
    private boolean n;
    private long o;
    private boolean p;
    private final GestureDetectorCompat q;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a extends GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {
    }

    public static /* synthetic */ boolean c(p pVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, pVar, changeQuickRedirect, false, "e6d63bbd7dea8623069a10f873cf73cb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, pVar, changeQuickRedirect, false, "e6d63bbd7dea8623069a10f873cf73cb")).booleanValue() : (pVar.k == null || pVar.l == null || (Math.abs(pVar.l.getX() - pVar.k.getX()) < 10.0f && Math.abs(pVar.l.getY() - pVar.k.getY()) < 10.0f)) ? false : true;
    }

    public p(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3167a6abc2a187c26fdf083614cf0075", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3167a6abc2a187c26fdf083614cf0075");
            return;
        }
        this.n = true;
        this.p = true;
        this.j = new a() { // from class: com.sankuai.meituan.mapsdk.core.gesture.p.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d9f7c4795478ee46bf444dc3291d802", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d9f7c4795478ee46bf444dc3291d802")).booleanValue() : p.this.a(5) && ((a) p.this.g).onSingleTapUp(motionEvent);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0557feb9fe2680340c67b50df53189d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0557feb9fe2680340c67b50df53189d0");
                } else if (!p.this.n || p.this.a().k || motionEvent.findPointerIndex(0) == -1 || !p.this.a(6)) {
                } else {
                    ((a) p.this.g).onLongPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e23f987e7bb5bd28a0bb51de7bd5640f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e23f987e7bb5bd28a0bb51de7bd5640f")).booleanValue();
                }
                if (p.this.k == null) {
                    p.this.k = motionEvent;
                }
                p.this.l = motionEvent2;
                return !p.i && p.c(p.this) && p.this.a(0) && ((a) p.this.g).onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0c9466e402cdbfc8e7212ec45704eee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0c9466e402cdbfc8e7212ec45704eee")).booleanValue() : !p.this.a().k && p.this.a(7) && ((a) p.this.g).onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fb727ea722f319ea7863f11a2d47c6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fb727ea722f319ea7863f11a2d47c6b");
                } else if (p.this.a(8)) {
                    ((a) p.this.g).onShowPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a549c730824a917f2c745f9ff719f23a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a549c730824a917f2c745f9ff719f23a")).booleanValue() : p.this.a(9) && ((a) p.this.g).onDown(motionEvent);
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "544db828aa6cb91958f8fce6435017f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "544db828aa6cb91958f8fce6435017f6")).booleanValue() : p.this.a(10) && ((a) p.this.g).onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66f001374511297dd5d0ca60f50b4f4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66f001374511297dd5d0ca60f50b4f4f")).booleanValue() : p.this.p && p.this.a(11) && ((a) p.this.g).onDoubleTapEvent(motionEvent);
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebb66bd151bdc844c6415332fa37dc03", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebb66bd151bdc844c6415332fa37dc03")).booleanValue() : p.this.a(12) && ((a) p.this.g).onSingleTapConfirmed(motionEvent);
            }
        };
        this.q = new GestureDetectorCompat(context, this.j);
        this.q.setIsLongpressEnabled(true);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(MotionEvent motionEvent) {
        boolean z = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c814658feca37d05b19d5d7ce4e6e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c814658feca37d05b19d5d7ce4e6e3")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.n = System.currentTimeMillis() - this.m > 500;
            this.m = System.currentTimeMillis();
        }
        if (motionEvent.getActionMasked() == 5) {
            i = true;
        }
        motionEvent.getAction();
        if (motionEvent.getAction() == 1) {
            this.k = null;
            this.l = null;
            this.p = (i || System.currentTimeMillis() - this.o >= 500) ? false : false;
            this.o = System.currentTimeMillis();
            i = false;
        }
        return this.q.onTouchEvent(motionEvent);
    }
}
