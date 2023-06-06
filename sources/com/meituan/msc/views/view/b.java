package com.meituan.msc.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ac;
import com.meituan.msc.uimanager.ar;
import com.meituan.msc.uimanager.l;
import com.meituan.msc.uimanager.t;
import com.meituan.msc.uimanager.v;
import com.meituan.msc.uimanager.w;
import com.meituan.msc.uimanager.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b extends ViewGroup implements com.meituan.msc.touch.c, com.meituan.msc.touch.d, ac, v, z {
    public static ChangeQuickRedirect b;
    static final ViewGroup.LayoutParams c = new ViewGroup.LayoutParams(0, 0);
    @Nullable
    private Rect a;
    boolean d;
    @Nullable
    View[] e;
    int f;
    @Nullable
    a g;
    @Nullable
    private Rect h;
    @Nullable
    private String i;
    private t j;
    @Nullable
    private d k;
    @Nullable
    private com.meituan.msc.touch.b l;
    private boolean m;
    private final ar n;
    @Nullable
    private Path o;
    private int p;
    private float q;
    private String r;

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public static /* synthetic */ void a(b bVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "483c5f6497fc7d3316db9827f9ffe69d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "483c5f6497fc7d3316db9827f9ffe69d");
        } else if (bVar.d && bVar.getParent() != null) {
            com.facebook.infer.annotation.a.a(bVar.a);
            com.facebook.infer.annotation.a.a(bVar.e);
            Rect rect = new Rect();
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (bVar.a.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < bVar.f; i2++) {
                    if (bVar.e[i2] == view) {
                        bVar.a(bVar.a, i2, i);
                        return;
                    }
                    if (bVar.e[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class a implements View.OnLayoutChangeListener {
        public static ChangeQuickRedirect a;
        private final b b;

        private a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b16d1be6d8e6daaec3b9d5265a64a4c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b16d1be6d8e6daaec3b9d5265a64a4c");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc147b4dd89a76a17eb0b94f52f18824", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc147b4dd89a76a17eb0b94f52f18824");
            } else if (this.b.getRemoveClippedSubviews()) {
                b.a(this.b, view);
            }
        }
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d768431241450316d89b59ceb0254d0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d768431241450316d89b59ceb0254d0f");
            return;
        }
        this.d = false;
        this.e = null;
        this.j = t.AUTO;
        this.m = false;
        this.q = 1.0f;
        this.r = "visible";
        setClipChildren(false);
        this.n = new ar(this);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c01dbf3bcef8a4f974696204116de01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c01dbf3bcef8a4f974696204116de01");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4fcefedc45e46f52b08a40c009333c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4fcefedc45e46f52b08a40c009333c9");
        } else if (Build.VERSION.SDK_INT < 17 || this.k == null) {
        } else {
            this.k.b(this.p);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1823ee80c1230749e9838ffcdcd9cb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1823ee80c1230749e9838ffcdcd9cb28");
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a129a2b51e613009f2bc7cbecaac833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a129a2b51e613009f2bc7cbecaac833");
        } else if (i == 0 && this.k == null) {
        } else {
            getOrCreateReactViewBackground().a(i);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e45f2da3688008a2227d448a698325c", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e45f2da3688008a2227d448a698325c");
    }

    public void setTranslucentBackgroundDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc21a06e167d3b43671c1ab144e9c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc21a06e167d3b43671c1ab144e9c06");
            return;
        }
        a((Drawable) null);
        if (this.k != null && drawable != null) {
            a(new LayerDrawable(new Drawable[]{this.k, drawable}));
        } else if (drawable != null) {
            a(drawable);
        }
    }

    @Override // com.meituan.msc.touch.d
    public void setOnInterceptTouchEventListener(com.meituan.msc.touch.b bVar) {
        this.l = bVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fa77ba694cf9377960fec642e42316", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fa77ba694cf9377960fec642e42316")).booleanValue();
        }
        if ((this.l != null && this.l.a(this, motionEvent)) || this.j == t.NONE || this.j == t.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.j == t.NONE || this.j == t.BOX_NONE) ? false : true;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.m;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.m = z;
    }

    public void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b6ef299c14f9f4c037224607b6ba029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b6ef299c14f9f4c037224607b6ba029");
            return;
        }
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f);
        if (Build.VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.a() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231aacf2118694e5d0be90f53919da86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231aacf2118694e5d0be90f53919da86");
        } else {
            getOrCreateReactViewBackground().a(str);
        }
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ea76221839174ca4ce01574be49aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ea76221839174ca4ce01574be49aaf");
        } else if (z != this.d) {
            this.d = z;
            if (z) {
                this.a = new Rect();
                w.a(this, this.a);
                this.f = getChildCount();
                this.e = new View[Math.max(12, this.f)];
                this.g = new a();
                for (int i = 0; i < this.f; i++) {
                    View childAt = getChildAt(i);
                    this.e[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.g);
                }
                a();
                return;
            }
            com.facebook.infer.annotation.a.a(this.a);
            com.facebook.infer.annotation.a.a(this.e);
            com.facebook.infer.annotation.a.a(this.g);
            for (int i2 = 0; i2 < this.f; i2++) {
                this.e[i2].removeOnLayoutChangeListener(this.g);
            }
            getDrawingRect(this.a);
            b(this.a);
            this.e = null;
            this.a = null;
            this.f = 0;
            this.g = null;
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public boolean getRemoveClippedSubviews() {
        return this.d;
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77299b0f2780bd04fbc1c70bfc9f71b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77299b0f2780bd04fbc1c70bfc9f71b9");
        } else {
            rect.set(this.a);
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18ad674e0ed3707488ba98acb65921e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18ad674e0ed3707488ba98acb65921e");
        } else if (this.d) {
            com.facebook.infer.annotation.a.a(this.a);
            com.facebook.infer.annotation.a.a(this.e);
            w.a(this, this.a);
            b(this.a);
        }
    }

    private void b(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c18e50bbe7f1f20f7739e8737683ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c18e50bbe7f1f20f7739e8737683ea0");
            return;
        }
        com.facebook.infer.annotation.a.a(this.e);
        int i = 0;
        for (int i2 = 0; i2 < this.f; i2++) {
            a(rect, i2, i);
            if (this.e[i2].getParent() == null) {
                i++;
            }
        }
    }

    private void a(Rect rect, int i, int i2) {
        boolean z = true;
        Object[] objArr = {rect, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff75e38926a161bfd1d5fab5935e6b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff75e38926a161bfd1d5fab5935e6b03");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = ((View[]) com.facebook.infer.annotation.a.a(this.e))[i];
        Rect rect2 = new Rect();
        rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z2 = (animation == null || animation.hasEnded()) ? false : true;
        if (!intersects && view.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, c, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (z && (view instanceof v)) {
            v vVar = (v) view;
            if (vVar.getRemoveClippedSubviews()) {
                vVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92994c6f5ff3e4d966e93306b32e079d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92994c6f5ff3e4d966e93306b32e079d")).booleanValue();
        }
        if (com.meituan.msc.jse.config.a.g) {
            return w.a(view, rect, point, this, this.i);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a2dc179a7170ec712ba3a278a83793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a2dc179a7170ec712ba3a278a83793");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.d) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a992d8bc6a961241d9db35cbbe7026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a992d8bc6a961241d9db35cbbe7026");
            return;
        }
        super.onAttachedToWindow();
        if (this.d) {
            a();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7776ded8103013db6e3b4b47b8e79254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7776ded8103013db6e3b4b47b8e79254");
            return;
        }
        this.n.a(view);
        setChildrenDrawingOrderEnabled(this.n.a());
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c704885386a53aa0b8cd06da937ff2b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c704885386a53aa0b8cd06da937ff2b0");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.n.b(view);
        setChildrenDrawingOrderEnabled(this.n.a());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3949dec9937c957bae6ac4adef87865e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3949dec9937c957bae6ac4adef87865e");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.n.b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.n.a());
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168abaf47968aa3e055bd2b044fad2d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168abaf47968aa3e055bd2b044fad2d4")).intValue();
        }
        int a2 = this.n.a(i, i2);
        if (a2 >= i) {
            g.e("[ReactViewGroup@getChildDrawingOrder]", "getChildDrawingOrder:" + i + StringUtil.SPACE + i2);
            return super.getChildDrawingOrder(i, i2);
        }
        return a2;
    }

    @Override // com.meituan.msc.uimanager.ac
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d5cbf5083a799cfad81e92fecd6447", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d5cbf5083a799cfad81e92fecd6447")).intValue() : this.n.a() ? this.n.a(getChildCount(), i) : i;
    }

    @Override // com.meituan.msc.uimanager.ac
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b9c0569bbec8eddd6fc527c6bd0143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b9c0569bbec8eddd6fc527c6bd0143");
            return;
        }
        this.n.b();
        setChildrenDrawingOrderEnabled(this.n.a());
        invalidate();
    }

    @Override // com.meituan.msc.uimanager.z
    public t getPointerEvents() {
        return this.j;
    }

    public void setPointerEvents(t tVar) {
        this.j = tVar;
    }

    public int getAllChildrenCount() {
        return this.f;
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc68db330a7ae1030edfd6e8e7d2ed09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc68db330a7ae1030edfd6e8e7d2ed09");
            return;
        }
        com.facebook.infer.annotation.a.a(this.d);
        com.facebook.infer.annotation.a.a(this.a);
        com.facebook.infer.annotation.a.a(this.e);
        if (i < 0) {
            i = this.f;
        }
        Object[] objArr2 = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9bc8904aba8e0c1aa6df566d251bb7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9bc8904aba8e0c1aa6df566d251bb7d");
        } else {
            View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.e);
            int i2 = this.f;
            int length = viewArr.length;
            if (i == i2) {
                if (length == i2) {
                    this.e = new View[length + 12];
                    System.arraycopy(viewArr, 0, this.e, 0, length);
                    viewArr = this.e;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                viewArr[i3] = view;
            } else if (i < i2) {
                if (length == i2) {
                    this.e = new View[length + 12];
                    System.arraycopy(viewArr, 0, this.e, 0, i);
                    System.arraycopy(viewArr, i, this.e, i + 1, i2 - i);
                    viewArr = this.e;
                } else {
                    System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
                }
                viewArr[i] = view;
                this.f++;
            } else {
                throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.e[i5].getParent() == null) {
                i4++;
            }
        }
        a(this.a, i, i4);
        view.addOnLayoutChangeListener(this.g);
    }

    public final void a(View view) {
        int i;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baee31d96d6c7e2f8fdc28fe4b918be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baee31d96d6c7e2f8fdc28fe4b918be6");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        com.facebook.infer.annotation.a.a(this.d);
        com.facebook.infer.annotation.a.a(this.a);
        com.facebook.infer.annotation.a.a(this.e);
        view.removeOnLayoutChangeListener(this.g);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62cfd3fafef48981c8d6b4bd7a4fc231", RobustBitConfig.DEFAULT_VALUE)) {
            int i2 = this.f;
            View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.e);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    i = -1;
                    break;
                } else if (viewArr[i3] == view) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62cfd3fafef48981c8d6b4bd7a4fc231")).intValue();
        }
        if (this.e[i].getParent() != null) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (this.e[i5].getParent() == null) {
                    i4++;
                }
            }
            super.removeViewsInLayout(i - i4, 1);
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2cd5c32612ee3e7d59b1234e29960adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2cd5c32612ee3e7d59b1234e29960adf");
            return;
        }
        View[] viewArr2 = (View[]) com.facebook.infer.annotation.a.a(this.e);
        int i6 = this.f;
        if (i == i6 - 1) {
            int i7 = this.f - 1;
            this.f = i7;
            viewArr2[i7] = null;
        } else if (i >= 0 && i < i6) {
            System.arraycopy(viewArr2, i + 1, viewArr2, i, (i6 - i) - 1);
            int i8 = this.f - 1;
            this.f = i8;
            viewArr2[i8] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @VisibleForTesting
    public int getBackgroundColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0b9252c1ca86db3cd5fa9acab65eca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0b9252c1ca86db3cd5fa9acab65eca")).intValue();
        }
        if (getBackground() != null) {
            return ((d) getBackground()).b;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d getOrCreateReactViewBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "739b773c216d9cc194b8f56f6badef5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "739b773c216d9cc194b8f56f6badef5a");
        }
        if (this.k == null) {
            this.k = new d(getContext());
            Drawable background = getBackground();
            a((Drawable) null);
            if (background == null) {
                a(this.k);
            } else {
                a(new LayerDrawable(new Drawable[]{this.k, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                com.meituan.msc.jse.modules.i18nmanager.a.a();
                getContext();
                this.p = 0;
                this.k.b(this.p);
            }
        }
        return this.k;
    }

    @Override // com.meituan.msc.touch.c
    @Nullable
    public Rect getHitSlopRect() {
        return this.h;
    }

    public void setHitSlopRect(@Nullable Rect rect) {
        this.h = rect;
    }

    public void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0324a589e34f4aedce5e4794737bd566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0324a589e34f4aedce5e4794737bd566");
            return;
        }
        this.i = str;
        invalidate();
    }

    @Nullable
    public String getOverflow() {
        return this.i;
    }

    private void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d69117d3f834f1c4b836e043662f457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d69117d3f834f1c4b836e043662f457");
        } else {
            super.setBackground(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: StackOverflowError -> 0x01e8, TryCatch #0 {StackOverflowError -> 0x01e8, blocks: (B:6:0x0020, B:8:0x0036, B:89:0x01e4, B:9:0x003b, B:11:0x003f, B:22:0x0066, B:24:0x006b, B:26:0x007a, B:28:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a8, B:39:0x00d4, B:43:0x00db, B:46:0x010a, B:49:0x0111, B:52:0x0118, B:85:0x01d2, B:78:0x014d, B:80:0x0151, B:81:0x0158, B:36:0x009c, B:86:0x01db, B:88:0x01df, B:16:0x0051, B:19:0x005c), top: B:101:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151 A[Catch: StackOverflowError -> 0x01e8, TryCatch #0 {StackOverflowError -> 0x01e8, blocks: (B:6:0x0020, B:8:0x0036, B:89:0x01e4, B:9:0x003b, B:11:0x003f, B:22:0x0066, B:24:0x006b, B:26:0x007a, B:28:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a8, B:39:0x00d4, B:43:0x00db, B:46:0x010a, B:49:0x0111, B:52:0x0118, B:85:0x01d2, B:78:0x014d, B:80:0x0151, B:81:0x0158, B:36:0x009c, B:86:0x01db, B:88:0x01df, B:16:0x0051, B:19:0x005c), top: B:101:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2 A[Catch: StackOverflowError -> 0x01e8, TryCatch #0 {StackOverflowError -> 0x01e8, blocks: (B:6:0x0020, B:8:0x0036, B:89:0x01e4, B:9:0x003b, B:11:0x003f, B:22:0x0066, B:24:0x006b, B:26:0x007a, B:28:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a8, B:39:0x00d4, B:43:0x00db, B:46:0x010a, B:49:0x0111, B:52:0x0118, B:85:0x01d2, B:78:0x014d, B:80:0x0151, B:81:0x0158, B:36:0x009c, B:86:0x01db, B:88:0x01df, B:16:0x0051, B:19:0x005c), top: B:101:0x0020 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.view.b.dispatchDraw(android.graphics.Canvas):void");
    }

    public void setOpacityIfPossible(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980c01bba6bb1d71bc6a28d9b4a62238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980c01bba6bb1d71bc6a28d9b4a62238");
            return;
        }
        this.q = f;
        c();
    }

    public void setBackfaceVisibility(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445e2b506384e8d452239c9b8ec1eba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445e2b506384e8d452239c9b8ec1eba9");
            return;
        }
        this.r = str;
        c();
    }

    public final void c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee9d9de1262c40941009eef89a6bea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee9d9de1262c40941009eef89a6bea6");
        } else if (this.r.equals("visible")) {
            setAlpha(this.q);
        } else {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
                z = true;
            }
            if (z) {
                setAlpha(this.q);
            } else {
                setAlpha(0.0f);
            }
        }
    }
}
