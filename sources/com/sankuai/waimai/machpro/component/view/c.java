package com.sankuai.waimai.machpro.component.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaMeasureFunction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends ViewGroup implements com.sankuai.waimai.machpro.view.a {
    public static ChangeQuickRedirect c;
    private WeakReference<b> a;
    private String b;
    protected com.facebook.yoga.d d;
    boolean e;
    private com.sankuai.waimai.machpro.view.decoration.d f;
    private boolean g;
    private Map<View, com.facebook.yoga.d> h;
    private HashMap<View, WeakReference<MPComponent>> i;

    public void a() {
    }

    public void b() {
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a04cc0665d60a325d230e178cdfa5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a04cc0665d60a325d230e178cdfa5b");
            return;
        }
        this.i = new HashMap<>();
        this.h = new HashMap();
    }

    public c(Context context, com.facebook.yoga.d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eecb8ebb96c0d82f3087bf1983cc7c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eecb8ebb96c0d82f3087bf1983cc7c6");
            return;
        }
        this.i = new HashMap<>();
        this.d = dVar;
        this.h = new HashMap();
    }

    public void setYogaNode(com.facebook.yoga.d dVar) {
        this.d = dVar;
    }

    public final void a(View view, com.facebook.yoga.d dVar, MPComponent mPComponent, View view2) {
        Object[] objArr = {view, dVar, mPComponent, view2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e109c722e4f1eb917e115ffe8fd77867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e109c722e4f1eb917e115ffe8fd77867");
            return;
        }
        this.d.a((YogaMeasureFunction) null);
        if (view == null) {
            return;
        }
        int childCount = getChildCount();
        if (view2 != null) {
            childCount = indexOfChild(view2);
        }
        if (childCount < 0) {
            childCount = getChildCount();
        }
        this.d.a(dVar, childCount);
        this.h.put(view, dVar);
        if (mPComponent != null) {
            this.i.put(view, new WeakReference<>(mPComponent));
        }
        super.addView(view, childCount);
    }

    public final void a(View view, com.facebook.yoga.d dVar, MPComponent mPComponent, int i) {
        Object[] objArr = {view, dVar, mPComponent, 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980b9d3d19bf396704a7026f16a2c413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980b9d3d19bf396704a7026f16a2c413");
            return;
        }
        this.d.a((YogaMeasureFunction) null);
        this.h.put(view, dVar);
        this.d.a(dVar, 0);
        if (mPComponent != null) {
            this.i.put(view, new WeakReference<>(mPComponent));
        }
        super.addView(view, 0);
    }

    public final void a(View view, com.facebook.yoga.d dVar) {
        Object[] objArr = {view, dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac4fbb2fa3efa1b6244d065dfb410e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac4fbb2fa3efa1b6244d065dfb410e8");
            return;
        }
        super.removeView(view);
        this.h.remove(view);
        this.i.remove(view);
        for (int i = 0; i < this.d.c(); i++) {
            if (this.d.a(i) == dVar) {
                this.d.b(i);
                if (this.d.c() > 0 || this.d.v()) {
                    return;
                }
                this.d.a((YogaMeasureFunction) new com.sankuai.waimai.machpro.view.c());
                return;
            }
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1723a9751b4b92ebc96d16c49ff7d0f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1723a9751b4b92ebc96d16c49ff7d0f7");
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c676117e5e6c80ca9ab2b2c9504297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c676117e5e6c80ca9ab2b2c9504297");
            return;
        }
        if (!(getParent() instanceof c)) {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acc36beb316c27dbd9917629711e770a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acc36beb316c27dbd9917629711e770a");
            } else {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int mode = View.MeasureSpec.getMode(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                if (mode2 == 1073741824) {
                    this.d.h(size2);
                } else if (mode2 == Integer.MIN_VALUE) {
                    this.d.p(size2);
                } else if (mode2 == 0 && getComponent() != null && "mach_pro_waimai_select_redpacket_style_0".equals(getComponent().c().getBundleName())) {
                    this.d.p(Float.NaN);
                }
                if (mode == 1073741824) {
                    this.d.f(size);
                } else if (mode == Integer.MIN_VALUE) {
                    this.d.n(size);
                } else if (mode == 0 && getComponent() != null && "mach_pro_waimai_select_redpacket_style_0".equals(getComponent().c().getBundleName())) {
                    this.d.n(Float.NaN);
                }
                a();
                this.d.a(Float.NaN, Float.NaN);
                b();
            }
        }
        setMeasuredDimension(Math.round(this.d.s()), Math.round(this.d.t()));
    }

    private void a(com.facebook.yoga.d dVar, float f, float f2) {
        int i;
        boolean z;
        WeakReference<MPComponent> weakReference;
        Object[] objArr = {dVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27148df3acf3b00be49c0b3b64b0fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27148df3acf3b00be49c0b3b64b0fb8");
            return;
        }
        View view = (View) dVar.w();
        if (view == null || view == this) {
            i = 0;
        } else if (view.getVisibility() == 8) {
            return;
        } else {
            int round = Math.round(dVar.q() + f);
            int round2 = Math.round(dVar.r() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(dVar.s()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(dVar.t()), 1073741824));
            int measuredWidth = round + view.getMeasuredWidth();
            int measuredHeight = round2 + view.getMeasuredHeight();
            Object[] objArr2 = {view, Integer.valueOf(round), Integer.valueOf(round2), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d806fb1737dede557e62a23b86e0d09", RobustBitConfig.DEFAULT_VALUE)) {
                i = 0;
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d806fb1737dede557e62a23b86e0d09")).booleanValue();
            } else {
                i = 0;
                z = (view == null || (view.getLeft() == round && view.getTop() == round2 && view.getRight() == measuredWidth && view.getBottom() == measuredHeight)) ? false : true;
            }
            view.layout(round, round2, measuredWidth, measuredHeight);
            if (z && !(view instanceof c) && (weakReference = this.i.get(view)) != null && weakReference.get() != null) {
                weakReference.get().onFrameChanged(round, round2, measuredWidth - round, measuredHeight - round2);
            }
        }
        int c2 = dVar.c();
        while (i < c2) {
            if (equals(view)) {
                a(dVar.a(i), f, f2);
            } else if (!(view instanceof c)) {
                a(dVar.a(i), dVar.q() + f, dVar.r() + f2);
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b component;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9f97b2f8498965a0a9e383b21b0d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9f97b2f8498965a0a9e383b21b0d00");
            return;
        }
        try {
            a(this.d, 0.0f, 0.0f);
            if (!z || (component = getComponent()) == null) {
                return;
            }
            component.onFrameChanged(i, i2, i3 - i, i4 - i2);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("MPContainerLayout layout exception! " + e.getMessage() + " | " + e.getClass().getName());
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f11b84631cfc90daffd1e474b1bf211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f11b84631cfc90daffd1e474b1bf211");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c20a2778fe7a7ffe0a3d1c02026b7e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c20a2778fe7a7ffe0a3d1c02026b7e0a");
        } else {
            this.g = false;
            b component = getComponent();
            if (component != null) {
                String boxShadow = component.getBoxShadow();
                if (TextUtils.isEmpty(boxShadow)) {
                    this.b = "";
                } else {
                    if (!boxShadow.equals(this.b)) {
                        this.b = boxShadow;
                        String[] split = this.b.split("\\s+");
                        if (split.length == 4) {
                            this.f = new com.sankuai.waimai.machpro.view.decoration.d(split);
                        }
                    }
                    if (this.f != null && getWidth() > 0 && getHeight() > 0) {
                        this.f.a(getWidth(), getHeight());
                        this.f.a(component.getBorderRadii());
                        this.f.a(canvas);
                        this.g = true;
                    }
                }
            }
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417eff08816a6832f515e275ef80a76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417eff08816a6832f515e275ef80a76d");
            return;
        }
        canvas.save();
        if (getClipChildren()) {
            com.sankuai.waimai.machpro.util.b.a(this, canvas, this.g);
        }
        super.dispatchDraw(canvas);
        b component = getComponent();
        if (component != null) {
            component.getBackgroundDrawable().a(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8375287652f3bce54567a4c9f22eaea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8375287652f3bce54567a4c9f22eaea9");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2808450a01f96afca6ba531ce2fe49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2808450a01f96afca6ba531ce2fe49");
        } else {
            super.onDetachedFromWindow();
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b60e98b131cb8c65c615cf85733e0eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b60e98b131cb8c65c615cf85733e0eef");
        } else {
            this.a = new WeakReference<>(bVar);
        }
    }

    public b getComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4b26050866e5373cb798b75e832a1d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4b26050866e5373cb798b75e832a1d7");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.get();
    }
}
