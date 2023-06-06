package com.meituan.android.paybase.widgets.wheelview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.meituan.android.paybase.widgets.wheelview.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WheelView extends View {
    public static ChangeQuickRedirect a;
    private static final int[] e = {-1, -1543503873, 1291845631};
    public boolean b;
    List<com.meituan.android.paybase.widgets.wheelview.listener.b> c;
    public c.a d;
    private int f;
    private int g;
    private int h;
    private Drawable i;
    private GradientDrawable j;
    private GradientDrawable k;
    private c l;
    private boolean m;
    private int n;
    private LinearLayout o;
    private int p;
    private com.meituan.android.paybase.widgets.wheelview.adapter.c q;
    private b r;
    private List<com.meituan.android.paybase.widgets.wheelview.listener.a> s;
    private List<Object> t;
    private DataSetObserver u;

    public static /* synthetic */ void a(WheelView wheelView, int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wheelView, changeQuickRedirect, false, "6fa06d80430bfb804de9926d431f4b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wheelView, changeQuickRedirect, false, "6fa06d80430bfb804de9926d431f4b5d");
            return;
        }
        wheelView.n += i;
        int itemHeight = wheelView.getItemHeight();
        int i3 = wheelView.n / itemHeight;
        int i4 = wheelView.f - i3;
        int a2 = wheelView.q.a();
        int i5 = wheelView.n % itemHeight;
        if (Math.abs(i5) <= itemHeight / 2) {
            i5 = 0;
        }
        if (wheelView.b && a2 > 0) {
            if (i5 > 0) {
                i4--;
                i3++;
            } else if (i5 < 0) {
                i4++;
                i3--;
            }
            while (i4 < 0) {
                i4 += a2;
            }
            i2 = i4 % a2;
        } else if (i4 < 0) {
            i3 = wheelView.f;
            i2 = 0;
        } else if (i4 >= a2) {
            i3 = (wheelView.f - a2) + 1;
            i2 = a2 - 1;
        } else if (i4 > 0 && i5 > 0) {
            i2 = i4 - 1;
            i3++;
        } else if (i4 >= a2 - 1 || i5 >= 0) {
            i2 = i4;
        } else {
            i2 = i4 + 1;
            i3--;
        }
        int i6 = wheelView.n;
        if (i2 != wheelView.f) {
            wheelView.a(i2, false);
        } else {
            wheelView.invalidate();
        }
        wheelView.n = i6 - (i3 * itemHeight);
        if (wheelView.n > wheelView.getHeight()) {
            wheelView.n = (wheelView.n % wheelView.getHeight()) + wheelView.getHeight();
        }
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b197e2bfcd08effd614ac5855424139b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b197e2bfcd08effd614ac5855424139b");
            return;
        }
        this.f = 0;
        this.g = 5;
        this.h = 0;
        this.b = false;
        this.r = new b(this);
        this.s = new LinkedList();
        this.c = new LinkedList();
        this.t = new LinkedList();
        this.d = new c.a() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57f1abe07f750b827ffc99cf59b91746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57f1abe07f750b827ffc99cf59b91746");
                    return;
                }
                WheelView.this.m = true;
                WheelView wheelView = WheelView.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = WheelView.a;
                if (PatchProxy.isSupport(objArr3, wheelView, changeQuickRedirect3, false, "f18e269cee1b5e4501b08a96a287f2c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, wheelView, changeQuickRedirect3, false, "f18e269cee1b5e4501b08a96a287f2c5");
                    return;
                }
                Iterator<com.meituan.android.paybase.widgets.wheelview.listener.b> it = wheelView.c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e813570f5b9770477013553d2a7f291", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e813570f5b9770477013553d2a7f291");
                    return;
                }
                WheelView.a(WheelView.this, i2);
                int height = WheelView.this.getHeight();
                if (WheelView.this.n > height) {
                    WheelView.this.n = height;
                    WheelView.this.l.a();
                    return;
                }
                int i3 = -height;
                if (WheelView.this.n < i3) {
                    WheelView.this.n = i3;
                    WheelView.this.l.a();
                }
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "249ad1fa6097ada72a97db5a903beb3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "249ad1fa6097ada72a97db5a903beb3d");
                    return;
                }
                if (WheelView.this.m) {
                    WheelView wheelView = WheelView.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = WheelView.a;
                    if (PatchProxy.isSupport(objArr3, wheelView, changeQuickRedirect3, false, "5bb366698abbaba1feaa9c321cf22e81", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wheelView, changeQuickRedirect3, false, "5bb366698abbaba1feaa9c321cf22e81");
                    } else {
                        for (com.meituan.android.paybase.widgets.wheelview.listener.b bVar : wheelView.c) {
                            bVar.a(wheelView);
                        }
                    }
                    WheelView.this.m = false;
                }
                WheelView.this.n = 0;
                WheelView.this.invalidate();
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daad5513641263f2a4ae70161b8c6954", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daad5513641263f2a4ae70161b8c6954");
                } else if (Math.abs(WheelView.this.n) > 1) {
                    WheelView.this.l.a(WheelView.this.n, 0);
                }
            }
        };
        this.u = new DataSetObserver() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelView.2
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6f8ae5200fd9da311f6aef28dc23a75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6f8ae5200fd9da311f6aef28dc23a75");
                } else {
                    WheelView.this.a(false);
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abfd03d003ef8d3dc3e5ff6acde74c7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abfd03d003ef8d3dc3e5ff6acde74c7c");
                } else {
                    WheelView.this.a(true);
                }
            }
        };
        a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac9c2836096a47763278cd60b8f9b53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac9c2836096a47763278cd60b8f9b53");
            return;
        }
        this.f = 0;
        this.g = 5;
        this.h = 0;
        this.b = false;
        this.r = new b(this);
        this.s = new LinkedList();
        this.c = new LinkedList();
        this.t = new LinkedList();
        this.d = new c.a() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57f1abe07f750b827ffc99cf59b91746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57f1abe07f750b827ffc99cf59b91746");
                    return;
                }
                WheelView.this.m = true;
                WheelView wheelView = WheelView.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = WheelView.a;
                if (PatchProxy.isSupport(objArr3, wheelView, changeQuickRedirect3, false, "f18e269cee1b5e4501b08a96a287f2c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, wheelView, changeQuickRedirect3, false, "f18e269cee1b5e4501b08a96a287f2c5");
                    return;
                }
                Iterator<com.meituan.android.paybase.widgets.wheelview.listener.b> it = wheelView.c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e813570f5b9770477013553d2a7f291", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e813570f5b9770477013553d2a7f291");
                    return;
                }
                WheelView.a(WheelView.this, i2);
                int height = WheelView.this.getHeight();
                if (WheelView.this.n > height) {
                    WheelView.this.n = height;
                    WheelView.this.l.a();
                    return;
                }
                int i3 = -height;
                if (WheelView.this.n < i3) {
                    WheelView.this.n = i3;
                    WheelView.this.l.a();
                }
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "249ad1fa6097ada72a97db5a903beb3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "249ad1fa6097ada72a97db5a903beb3d");
                    return;
                }
                if (WheelView.this.m) {
                    WheelView wheelView = WheelView.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = WheelView.a;
                    if (PatchProxy.isSupport(objArr3, wheelView, changeQuickRedirect3, false, "5bb366698abbaba1feaa9c321cf22e81", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wheelView, changeQuickRedirect3, false, "5bb366698abbaba1feaa9c321cf22e81");
                    } else {
                        for (com.meituan.android.paybase.widgets.wheelview.listener.b bVar : wheelView.c) {
                            bVar.a(wheelView);
                        }
                    }
                    WheelView.this.m = false;
                }
                WheelView.this.n = 0;
                WheelView.this.invalidate();
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daad5513641263f2a4ae70161b8c6954", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daad5513641263f2a4ae70161b8c6954");
                } else if (Math.abs(WheelView.this.n) > 1) {
                    WheelView.this.l.a(WheelView.this.n, 0);
                }
            }
        };
        this.u = new DataSetObserver() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelView.2
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6f8ae5200fd9da311f6aef28dc23a75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6f8ae5200fd9da311f6aef28dc23a75");
                } else {
                    WheelView.this.a(false);
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abfd03d003ef8d3dc3e5ff6acde74c7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abfd03d003ef8d3dc3e5ff6acde74c7c");
                } else {
                    WheelView.this.a(true);
                }
            }
        };
        a(context);
    }

    public WheelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e46fa3e065d31355dc3915b8b3da41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e46fa3e065d31355dc3915b8b3da41");
            return;
        }
        this.f = 0;
        this.g = 5;
        this.h = 0;
        this.b = false;
        this.r = new b(this);
        this.s = new LinkedList();
        this.c = new LinkedList();
        this.t = new LinkedList();
        this.d = new c.a() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57f1abe07f750b827ffc99cf59b91746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57f1abe07f750b827ffc99cf59b91746");
                    return;
                }
                WheelView.this.m = true;
                WheelView wheelView = WheelView.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = WheelView.a;
                if (PatchProxy.isSupport(objArr3, wheelView, changeQuickRedirect3, false, "f18e269cee1b5e4501b08a96a287f2c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, wheelView, changeQuickRedirect3, false, "f18e269cee1b5e4501b08a96a287f2c5");
                    return;
                }
                Iterator<com.meituan.android.paybase.widgets.wheelview.listener.b> it = wheelView.c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e813570f5b9770477013553d2a7f291", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e813570f5b9770477013553d2a7f291");
                    return;
                }
                WheelView.a(WheelView.this, i2);
                int height = WheelView.this.getHeight();
                if (WheelView.this.n > height) {
                    WheelView.this.n = height;
                    WheelView.this.l.a();
                    return;
                }
                int i3 = -height;
                if (WheelView.this.n < i3) {
                    WheelView.this.n = i3;
                    WheelView.this.l.a();
                }
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "249ad1fa6097ada72a97db5a903beb3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "249ad1fa6097ada72a97db5a903beb3d");
                    return;
                }
                if (WheelView.this.m) {
                    WheelView wheelView = WheelView.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = WheelView.a;
                    if (PatchProxy.isSupport(objArr3, wheelView, changeQuickRedirect3, false, "5bb366698abbaba1feaa9c321cf22e81", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wheelView, changeQuickRedirect3, false, "5bb366698abbaba1feaa9c321cf22e81");
                    } else {
                        for (com.meituan.android.paybase.widgets.wheelview.listener.b bVar : wheelView.c) {
                            bVar.a(wheelView);
                        }
                    }
                    WheelView.this.m = false;
                }
                WheelView.this.n = 0;
                WheelView.this.invalidate();
            }

            @Override // com.meituan.android.paybase.widgets.wheelview.c.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daad5513641263f2a4ae70161b8c6954", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daad5513641263f2a4ae70161b8c6954");
                } else if (Math.abs(WheelView.this.n) > 1) {
                    WheelView.this.l.a(WheelView.this.n, 0);
                }
            }
        };
        this.u = new DataSetObserver() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelView.2
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6f8ae5200fd9da311f6aef28dc23a75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6f8ae5200fd9da311f6aef28dc23a75");
                } else {
                    WheelView.this.a(false);
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abfd03d003ef8d3dc3e5ff6acde74c7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abfd03d003ef8d3dc3e5ff6acde74c7c");
                } else {
                    WheelView.this.a(true);
                }
            }
        };
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201c492974d39024805c385056bf9b8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201c492974d39024805c385056bf9b8d");
        } else {
            this.l = new c(context, this.d);
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        Object[] objArr = {interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6a901f5fbce139e89efdc474e0203d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6a901f5fbce139e89efdc474e0203d");
            return;
        }
        c cVar = this.l;
        Object[] objArr2 = {interpolator};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9a9714060b61a45934860244ce57b3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9a9714060b61a45934860244ce57b3ed");
            return;
        }
        cVar.e.forceFinished(true);
        cVar.e = new Scroller(cVar.c, interpolator);
    }

    public int getVisibleItems() {
        return this.g;
    }

    public void setVisibleItems(int i) {
        this.g = i;
    }

    public com.meituan.android.paybase.widgets.wheelview.adapter.c getViewAdapter() {
        return this.q;
    }

    public void setViewAdapter(com.meituan.android.paybase.widgets.wheelview.adapter.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e603e3d1a63e360b35aeb6a5c47e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e603e3d1a63e360b35aeb6a5c47e6c");
            return;
        }
        if (this.q != null) {
            this.q.b(this.u);
        }
        this.q = cVar;
        if (this.q != null) {
            this.q.a(this.u);
        }
        a(true);
    }

    public final void a(com.meituan.android.paybase.widgets.wheelview.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a08ace3f4c314ae0da478ee78a468f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a08ace3f4c314ae0da478ee78a468f8b");
        } else {
            this.s.add(aVar);
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abdf4b5293a64f3d78bab89224f4ce55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abdf4b5293a64f3d78bab89224f4ce55");
            return;
        }
        for (com.meituan.android.paybase.widgets.wheelview.listener.a aVar : this.s) {
            aVar.a(this, i, i2);
        }
    }

    public final void a(com.meituan.android.paybase.widgets.wheelview.listener.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efd167da9081ec291c85f4ee20e8fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efd167da9081ec291c85f4ee20e8fae");
        } else {
            this.c.add(bVar);
        }
    }

    public int getCurrentItem() {
        return this.f;
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9252777194de6447c92950b0be11eb82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9252777194de6447c92950b0be11eb82");
        } else if (this.q == null || this.q.a() == 0) {
        } else {
            int a2 = this.q.a();
            if (i < 0 || i >= a2) {
                if (!this.b) {
                    return;
                }
                while (i < 0) {
                    i += a2;
                }
                i %= a2;
            }
            if (i != this.f) {
                this.n = 0;
                int i2 = this.f;
                this.f = i;
                a(i2, this.f);
                this.q.b(getCurrentItem());
                invalidate();
            }
        }
    }

    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876de8a52085568bd70a78ebe556da97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876de8a52085568bd70a78ebe556da97");
        } else {
            a(i, false);
        }
    }

    public void setCyclic(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04abac47a58a674dc653a74ad5ddb799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04abac47a58a674dc653a74ad5ddb799");
            return;
        }
        this.b = z;
        a(false);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "323e313ad3b717ecd681be7f8dd8782a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "323e313ad3b717ecd681be7f8dd8782a");
            return;
        }
        if (z) {
            this.r.a();
            if (this.o != null) {
                this.o.removeAllViews();
            }
            this.n = 0;
        } else if (this.o != null) {
            this.r.a(this.o, this.p, new a());
        }
        invalidate();
    }

    private int getItemHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc09766f7d7e59b88fbdd9a3d60ea0ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc09766f7d7e59b88fbdd9a3d60ea0ce")).intValue();
        }
        if (this.h != 0) {
            return this.h;
        }
        if (this.o != null && this.o.getChildAt(0) != null) {
            this.h = this.o.getChildAt(0).getHeight();
            return this.h;
        }
        return getHeight() / this.g;
    }

    private int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1033a520bbe10fa3f8ae9824514e7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1033a520bbe10fa3f8ae9824514e7b")).intValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f00a2da45bb37fdf361c4a168b5edfc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f00a2da45bb37fdf361c4a168b5edfc5");
        } else {
            if (this.i == null) {
                this.i = getContext().getResources().getDrawable(R.drawable.paybase__wheel_center_drawable);
            }
            if (this.j == null) {
                this.j = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, e);
            }
            if (this.k == null) {
                this.k = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, e);
            }
        }
        this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(i, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.o.getMeasuredWidth();
        if (i2 != 1073741824) {
            int max = Math.max(measuredWidth + 20, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= max) {
                i = max;
            }
        }
        this.o.measure(View.MeasureSpec.makeMeasureSpec(i - 20, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e9f4a9f0f0e4cf71477de2ec591d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e9f4a9f0f0e4cf71477de2ec591d61");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        b();
        int b = b(size, mode);
        if (mode2 != 1073741824) {
            LinearLayout linearLayout = this.o;
            Object[] objArr2 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac86ff5a318f94a4da24eac40cbb6b4d", RobustBitConfig.DEFAULT_VALUE)) {
                max = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac86ff5a318f94a4da24eac40cbb6b4d")).intValue();
            } else {
                if (linearLayout != null && linearLayout.getChildAt(0) != null) {
                    this.h = linearLayout.getChildAt(0).getMeasuredHeight();
                }
                max = Math.max((this.h * this.g) - ((this.h * 0) / 50), getSuggestedMinimumHeight());
            }
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(max, size2) : max;
        }
        setMeasuredDimension(b, size2);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5112d32eec995072857cd016bb0ad56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5112d32eec995072857cd016bb0ad56");
        } else {
            c(i3 - i, i4 - i2);
        }
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1471155b77d4486dfeaf8332d271b8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1471155b77d4486dfeaf8332d271b8aa");
        } else {
            this.o.layout(0, 0, i - 20, i2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eacfc3f1d15c2852b1930680cf48c110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eacfc3f1d15c2852b1930680cf48c110");
            return;
        }
        super.onDraw(canvas);
        if (this.q != null && this.q.a() > 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3c69b6710df6e9fcd855f35d14c05d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3c69b6710df6e9fcd855f35d14c05d0");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "23c8b5c27656a1d4037ec7d30e5eb352", RobustBitConfig.DEFAULT_VALUE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "23c8b5c27656a1d4037ec7d30e5eb352")).booleanValue();
                } else {
                    a itemsRange = getItemsRange();
                    if (this.o != null) {
                        int a2 = this.r.a(this.o, this.p, itemsRange);
                        z = this.p != a2;
                        this.p = a2;
                    } else {
                        a();
                        z = true;
                    }
                    if (z) {
                        z2 = z;
                    } else {
                        z2 = (this.p == itemsRange.b && this.o.getChildCount() == itemsRange.c) ? false : true;
                    }
                    if (this.p > itemsRange.b && this.p <= itemsRange.a()) {
                        for (int i = this.p - 1; i >= itemsRange.b && b(i, true); i--) {
                            this.p = i;
                        }
                    } else {
                        this.p = itemsRange.b;
                    }
                    int i2 = this.p;
                    for (int childCount = this.o.getChildCount(); childCount < itemsRange.c; childCount++) {
                        if (!b(this.p + childCount, false) && this.o.getChildCount() == 0) {
                            i2++;
                        }
                    }
                    this.p = i2;
                    z3 = z2;
                }
                if (z3) {
                    b(getWidth(), 1073741824);
                    c(getWidth(), getHeight());
                }
            }
            Object[] objArr4 = {canvas};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92eb7dd7772da5030f0598fda83ede1a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92eb7dd7772da5030f0598fda83ede1a");
            } else {
                canvas.save();
                canvas.translate(10.0f, (-(((this.f - this.p) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.n);
                this.o.draw(canvas);
                canvas.restore();
            }
        }
        Object[] objArr5 = {canvas};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ced8fb50b2c17d48684fd2e6975f2161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ced8fb50b2c17d48684fd2e6975f2161");
            return;
        }
        int itemHeight = getItemHeight() * 2;
        this.j.setBounds(0, 0, getWidth(), itemHeight);
        this.j.draw(canvas);
        this.k.setBounds(0, getHeight() - itemHeight, getWidth(), getHeight());
        this.k.draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int y;
        int itemHeight;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a332321f7e56269d7d2ba5b337920ba4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a332321f7e56269d7d2ba5b337920ba4")).booleanValue();
        }
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 1:
                if (!this.m) {
                    int y2 = ((int) motionEvent.getY()) - (getHeight() / 2);
                    if (y2 > 0) {
                        itemHeight = y2 + (getItemHeight() / 2);
                    } else {
                        itemHeight = y2 - (getItemHeight() / 2);
                    }
                    int itemHeight2 = itemHeight / getItemHeight();
                    if (itemHeight2 != 0 && a(this.f + itemHeight2)) {
                        Object[] objArr2 = {Integer.valueOf(this.f + itemHeight2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91934a98a66bb492e3269f95b5e977e9", RobustBitConfig.DEFAULT_VALUE)) {
                            Iterator<Object> it = this.t.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91934a98a66bb492e3269f95b5e977e9");
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
        c cVar = this.l;
        Object[] objArr3 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "9d54e639bd4b86ed04a8f9dd6f019e05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "9d54e639bd4b86ed04a8f9dd6f019e05")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            cVar.g = motionEvent.getY();
            cVar.e.forceFinished(true);
            cVar.b();
        } else if (action == 2 && (y = (int) (motionEvent.getY() - cVar.g)) != 0) {
            cVar.d();
            cVar.b.a(y);
            cVar.g = motionEvent.getY();
        }
        if (!cVar.d.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            cVar.c();
        }
        return true;
    }

    private a getItemsRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c05cedaf1fb1436e96920cc590ee09", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c05cedaf1fb1436e96920cc590ee09");
        }
        if (getItemHeight() == 0) {
            return null;
        }
        int i = this.f;
        int i2 = 1;
        while (getItemHeight() * i2 < getHeight()) {
            i--;
            i2 += 2;
        }
        if (this.n != 0) {
            if (this.n > 0) {
                i--;
            }
            int itemHeight = this.n / getItemHeight();
            i -= itemHeight;
            i2 = (int) (i2 + 1 + Math.asin(itemHeight));
        }
        return new a(i, i2);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ae0ffd787ccec0b5d318254bffb2a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ae0ffd787ccec0b5d318254bffb2a0");
        } else if (this.o == null) {
            this.o = new LinearLayout(getContext());
            this.o.setOrientation(1);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f90a4a637ca65608fe1a6b9256e076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f90a4a637ca65608fe1a6b9256e076");
            return;
        }
        if (this.o != null) {
            this.r.a(this.o, this.p, new a());
        } else {
            a();
        }
        int i = this.g / 2;
        for (int i2 = this.f + i; i2 >= this.f - i; i2--) {
            if (b(i2, true)) {
                this.p = i2;
            }
        }
    }

    private boolean b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df7f0039e45e5136e05f3adea9eb3f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df7f0039e45e5136e05f3adea9eb3f8c")).booleanValue();
        }
        View b = b(i);
        if (b != null) {
            if (z) {
                this.o.addView(b, 0);
            } else {
                this.o.addView(b);
            }
            return true;
        }
        return false;
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc873cd35c942164205ba7ea78a5f47", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc873cd35c942164205ba7ea78a5f47")).booleanValue() : this.q != null && this.q.a() > 0 && (this.b || (i >= 0 && i < this.q.a()));
    }

    private View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75de38f546810b4a03d133bf16487c92", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75de38f546810b4a03d133bf16487c92");
        }
        if (this.q == null || this.q.a() == 0) {
            return null;
        }
        int a2 = this.q.a();
        if (!a(i)) {
            com.meituan.android.paybase.widgets.wheelview.adapter.c cVar = this.q;
            b bVar = this.r;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            return cVar.a(PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "87501503bef755f9106f0102cd2be47b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "87501503bef755f9106f0102cd2be47b") : bVar.a(bVar.c), this.o);
        }
        while (i < 0) {
            i += a2;
        }
        int i2 = i % a2;
        com.meituan.android.paybase.widgets.wheelview.adapter.c cVar2 = this.q;
        b bVar2 = this.r;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        return cVar2.a(i2, PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "f4a1e645d5f1ad3b49049481c01fd9e7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "f4a1e645d5f1ad3b49049481c01fd9e7") : bVar2.a(bVar2.b), this.o);
    }
}
