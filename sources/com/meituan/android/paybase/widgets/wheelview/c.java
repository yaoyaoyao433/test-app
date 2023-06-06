package com.meituan.android.paybase.widgets.wheelview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    a b;
    Context c;
    GestureDetector d;
    Scroller e;
    int f;
    float g;
    boolean h;
    Handler i;
    private GestureDetector.SimpleOnGestureListener j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i);

        void b();

        void c();
    }

    public c(Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c11b616744aea14373e1669e1059999", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c11b616744aea14373e1669e1059999");
            return;
        }
        this.j = new GestureDetector.SimpleOnGestureListener() { // from class: com.meituan.android.paybase.widgets.wheelview.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6364b614f07f0d8ccfe64760d822570", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6364b614f07f0d8ccfe64760d822570")).booleanValue();
                }
                c.this.f = 0;
                c.this.e.fling(0, c.this.f, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
                c.this.a(0);
                return true;
            }
        };
        this.i = new Handler() { // from class: com.meituan.android.paybase.widgets.wheelview.c.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de58dd68475c44a2d3651e104fd300ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de58dd68475c44a2d3651e104fd300ac");
                    return;
                }
                c.this.e.computeScrollOffset();
                int currY = c.this.e.getCurrY();
                int i = c.this.f - currY;
                c.this.f = currY;
                if (i != 0) {
                    c.this.b.a(i);
                }
                if (Math.abs(currY - c.this.e.getFinalY()) <= 0) {
                    c.this.e.forceFinished(true);
                }
                if (!c.this.e.isFinished()) {
                    c.this.i.sendEmptyMessage(message.what);
                } else if (message.what != 0) {
                    c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "e357d4c5eab5975fe1c8fc64fcd65c60", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "e357d4c5eab5975fe1c8fc64fcd65c60");
                    } else if (cVar.h) {
                        cVar.b.b();
                        cVar.h = false;
                    }
                } else {
                    c.this.c();
                }
            }
        };
        this.d = new GestureDetector(context, this.j);
        this.d.setIsLongpressEnabled(false);
        this.e = new Scroller(context);
        this.b = aVar;
        this.c = context;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680a6cfcfa4fd75455dd28a31b2188b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680a6cfcfa4fd75455dd28a31b2188b2");
            return;
        }
        this.e.forceFinished(true);
        this.f = 0;
        this.e.startScroll(0, 0, 0, i, i2 != 0 ? i2 : 400);
        a(0);
        d();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "500b78047ec4aa3dc3341bb9e3a3a012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "500b78047ec4aa3dc3341bb9e3a3a012");
        } else {
            this.e.forceFinished(true);
        }
    }

    void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0f348a7a4f018d08007d3dc2131908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0f348a7a4f018d08007d3dc2131908");
            return;
        }
        b();
        this.i.sendEmptyMessage(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9c373539874c4d614bfdd65dcdd86b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9c373539874c4d614bfdd65dcdd86b");
            return;
        }
        this.i.removeMessages(0);
        this.i.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f3f5fc54890645c78bb481cbead07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f3f5fc54890645c78bb481cbead07a");
            return;
        }
        this.b.c();
        a(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9b11caa00a5180bfcce0a97744d550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9b11caa00a5180bfcce0a97744d550");
        } else if (this.h) {
        } else {
            this.h = true;
            this.b.a();
        }
    }
}
