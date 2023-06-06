package com.sankuai.waimai.platform.machpro.scrollerpull;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.scroll.MPScrollComponent;
import com.sankuai.waimai.machpro.component.view.c;
import com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    protected final a b;
    c f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private MPScrollComponent k;
    private int l;
    private boolean m;

    public b(@NonNull Context context, d dVar) {
        super(context, dVar);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d61393fcf428c0420d0bf2b16e5274e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d61393fcf428c0420d0bf2b16e5274e");
            return;
        }
        this.b = new a();
        this.g = 0;
        this.h = true;
        this.i = false;
        this.m = true;
        this.j = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final void setScrollEnable(boolean z) {
        this.h = z;
    }

    public final void setScrollComponent(MPScrollComponent mPScrollComponent) {
        this.k = mPScrollComponent;
    }

    public final void setHeaderPullRefreshEnable(boolean z) {
        this.i = z;
    }

    public final void setRefreshListener(com.sankuai.waimai.platform.widget.pullrefresh.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59cbf7b813ecb8b2629fe4125e996402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59cbf7b813ecb8b2629fe4125e996402");
        } else if (cVar != null) {
            this.b.c.a(cVar);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd8509fbbd2b02b3fd1181d724fff37f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd8509fbbd2b02b3fd1181d724fff37f");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "55f0d987b63f419db8d90f6ad30a8e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "55f0d987b63f419db8d90f6ad30a8e3c");
        } else {
            aVar.c.a();
        }
    }

    public final void setPullTarget(int i) {
        this.g = i;
    }

    private boolean d() {
        return this.g == 1;
    }

    @Override // com.sankuai.waimai.machpro.component.view.c, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c179f656dd2a1a0ae83f26b7a11c39ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c179f656dd2a1a0ae83f26b7a11c39ad");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.view.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99df89f4c503a359ab96241ed1d0f0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99df89f4c503a359ab96241ed1d0f0e5");
            return;
        }
        if (this.f != null) {
            this.f.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.b.b, 1073741824));
            this.f.layout(i, 0, i3, this.f.getMeasuredHeight());
            i5 = this.f.getMeasuredHeight();
            if (this.m) {
                this.m = false;
                scrollTo(0, this.f.getMeasuredHeight());
                this.b.b = this.f.getMeasuredHeight();
            }
            i6 = 1;
        } else {
            i5 = 0;
        }
        while (i6 < getChildCount()) {
            View childAt = getChildAt(i6);
            d a2 = this.d.a(i6);
            int round = Math.round(a2.q());
            childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.round(a2.s()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(a2.t()), 1073741824));
            childAt.layout(i, i5, round + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i5);
            i5 += childAt.getMeasuredHeight();
            i6++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b54c5b0008bc01d90bc4a09ef03e5ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b54c5b0008bc01d90bc4a09ef03e5ec")).booleanValue();
        }
        try {
            if (this.h) {
                if (super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224079eac455d6e058a5d1c8bb1eb64d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224079eac455d6e058a5d1c8bb1eb64d")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.l = rawY;
        } else if (action == 2) {
            int i = rawY - this.l;
            if (this.i && i >= this.j) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60cc0ac9a68a6b8db9c026a9a8e244c0", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60cc0ac9a68a6b8db9c026a9a8e244c0")).booleanValue();
                } else {
                    MPScrollComponent mPScrollComponent = this.k;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = MPScrollComponent.a;
                    if (PatchProxy.isSupport(objArr3, mPScrollComponent, changeQuickRedirect3, false, "32b5961076021b47d7afa8a7c857a605", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, mPScrollComponent, changeQuickRedirect3, false, "32b5961076021b47d7afa8a7c857a605")).booleanValue();
                    } else {
                        z = mPScrollComponent.b != null && mPScrollComponent.b.getScrollY() == 0;
                    }
                }
                if (z) {
                    setPullTarget(1);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb864d01c3e060f09d93c012cde13a82", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb864d01c3e060f09d93c012cde13a82")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (d()) {
                    a aVar = this.b;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3766c48c5630fdba0c784a61989d9ee1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3766c48c5630fdba0c784a61989d9ee1");
                    } else {
                        aVar.c.b();
                    }
                }
                setPullTarget(0);
                break;
            case 2:
                int i = rawY - this.l;
                if (d()) {
                    a aVar2 = this.b;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (!PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "1afafcfab75e5a8c9ccc5444a1c3ed5f", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2.c.a(i);
                        break;
                    } else {
                        ((Integer) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "1afafcfab75e5a8c9ccc5444a1c3ed5f")).intValue();
                        break;
                    }
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements com.sankuai.waimai.platform.widget.pullrefresh.b {
        public static ChangeQuickRedirect a;
        int b;
        final PullRefreshLogic c;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "452981d5b366f943f8765c93a3bfcf0b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "452981d5b366f943f8765c93a3bfcf0b");
                return;
            }
            this.b = 0;
            this.c = new PullRefreshLogic(b.this.getContext(), this);
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09bc48aadd69b2c6248392384345597c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09bc48aadd69b2c6248392384345597c");
            } else {
                b.this.setScrollEnable(z);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int a() {
            return this.b;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int b() {
            return this.b;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dba663975a6315ae99dc83807bcca51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dba663975a6315ae99dc83807bcca51");
            } else {
                b.this.scrollTo(0, this.b - i);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a278fb492e4d010494fe7582dadf6ec", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a278fb492e4d010494fe7582dadf6ec")).intValue() : this.b - b.this.getScrollY();
        }
    }
}
