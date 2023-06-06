package com.meituan.msc.mmpviews.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.scroll.nested.MSCNestedScrollView;
import com.meituan.msc.uimanager.l;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.uimanager.v;
import com.meituan.msc.uimanager.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPNestedScrollView extends MSCNestedScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, b, v {
    public static ChangeQuickRedirect a;
    private final h e;
    private final Rect f;
    @Nullable
    private Rect g;
    @Nullable
    private String h;
    private boolean i;
    private boolean j;
    private View k;
    private int l;
    private int m;
    private com.meituan.msc.mmpviews.shell.e n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollLeft(double d) {
    }

    public MPNestedScrollView(Context context, com.meituan.msc.mmpviews.shell.e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d90847414c9f931cefdd62e4f939685", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d90847414c9f931cefdd62e4f939685");
            return;
        }
        this.e = new h();
        this.f = new Rect();
        this.h = "hidden";
        this.j = true;
        this.p = -1;
        this.q = true;
        this.n = eVar;
        setOnHierarchyChangeListener(this);
        setScrollEnabled(true);
        setVerticalScrollBarEnabled(true);
        setScrollBarStyle(33554432);
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1ec484c520435801407decfdd74303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1ec484c520435801407decfdd74303");
            return;
        }
        this.j = z;
        setForbidScroll(!z ? 1 : 0);
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setUpperThreshold(int i) {
        this.l = i;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setLowerThreshold(int i) {
        this.m = i;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollTop(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3329e350f02cbbb1eecd662b91c297a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3329e350f02cbbb1eecd662b91c297a8");
            return;
        }
        int scrollX = getScrollX();
        int round = Math.round(s.a(d));
        if (this.o) {
            a(scrollX, round);
        } else {
            scrollTo(scrollX, round);
        }
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollWithAnimation(boolean z) {
        this.o = z;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setShowScrollbar(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368fa4d8c82597c06b851e24d956461d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368fa4d8c82597c06b851e24d956461d");
            return;
        }
        this.q = z;
        if (this.r && !z) {
            z2 = false;
        }
        setVerticalScrollBarEnabled(z2);
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setEnhanced(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f392823021476cebba416c415920e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f392823021476cebba416c415920e8");
            return;
        }
        this.r = z;
        if (z && !this.q) {
            z2 = false;
        }
        setVerticalScrollBarEnabled(z2);
    }

    public void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05688b8b002468869bbf19594c68a9ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05688b8b002468869bbf19594c68a9ff");
            return;
        }
        this.h = str;
        invalidate();
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24adb114e6f747e6dfc7a84b754d2a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24adb114e6f747e6dfc7a84b754d2a12");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4d3e9a10162422bcc03e538e5c479a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4d3e9a10162422bcc03e538e5c479a");
        } else {
            scrollTo(getScrollX(), getScrollY());
        }
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ae37d6d4326e2aaaebe12a6a85c087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ae37d6d4326e2aaaebe12a6a85c087");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.i) {
            a();
        }
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2427e983d379924a4a088bb0e12b1718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2427e983d379924a4a088bb0e12b1718");
            return;
        }
        super.onAttachedToWindow();
        if (this.i) {
            a();
        }
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b5cf9004901e3f88188043667583b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b5cf9004901e3f88188043667583b3");
            return;
        }
        if (view2 != null) {
            Object[] objArr2 = {view2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b1e0219849d9a0d69ec28fcfb7c986c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b1e0219849d9a0d69ec28fcfb7c986c");
            } else {
                Rect rect = new Rect();
                view2.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(view2, rect);
                int b = b(rect);
                if (b != 0) {
                    scrollBy(0, b);
                }
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4094b95e6ddbf80ad34db416fa0ca621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4094b95e6ddbf80ad34db416fa0ca621");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.e.a(i, i2)) {
            if (this.i) {
                a();
            }
            if (getScrollY() <= this.l && i4 - i2 > 1) {
                g.a(getViewTag(), this);
            }
            if (getChildAt(0) != null && getScrollY() >= (getChildAt(0).getBottom() - getHeight()) - this.m && i2 - i4 > 1) {
                g.b(getViewTag(), this);
            }
            if (this.p == -1) {
                this.p = i4;
            }
            g.a(getViewTag(), this, 0.0f, this.p - getScrollY());
            this.p = getScrollY();
        }
    }

    private int getViewTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b255a28d39851b93552ddfb8b29e55e6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b255a28d39851b93552ddfb8b29e55e6")).intValue() : this.n.l();
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.MSCNestedScrollView, com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1dc64c313ffdd7993b57b4cfddbff33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1dc64c313ffdd7993b57b4cfddbff33")).booleanValue();
        }
        if (this.j) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    return true;
                }
            } catch (IllegalArgumentException e) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Error intercepting touch event.", e);
            }
            return false;
        }
        return false;
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.MSCNestedScrollView, com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95db716795a3637efcb0782d647ec06c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95db716795a3637efcb0782d647ec06c")).booleanValue();
        }
        if (this.j) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView
    public final boolean a(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45a6fe569a1a9b731200feeb7c344d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45a6fe569a1a9b731200feeb7c344d6")).booleanValue();
        }
        int keyCode = keyEvent.getKeyCode();
        if (this.j || !(keyCode == 19 || keyCode == 20)) {
            return super.a(keyEvent);
        }
        return false;
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14687ae3743247b6e9dde50fd035974c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14687ae3743247b6e9dde50fd035974c");
            return;
        }
        if (z && this.g == null) {
            this.g = new Rect();
        }
        this.i = z;
        a();
    }

    @Override // com.meituan.msc.uimanager.v
    public boolean getRemoveClippedSubviews() {
        return this.i;
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6ee514535d377fae06274ad4661b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6ee514535d377fae06274ad4661b6d");
        } else if (this.i) {
            com.facebook.infer.annotation.a.a(this.g);
            w.a(this, this.g);
            View childAt = getChildAt(0);
            if (childAt instanceof v) {
                ((v) childAt).a();
            }
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21cc76bd39ac66934cd9397a82218b1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21cc76bd39ac66934cd9397a82218b1b");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.g));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23def40504c1c37baedcfb34b4cc5699", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23def40504c1c37baedcfb34b4cc5699")).booleanValue();
        }
        if (com.meituan.msc.jse.config.a.g) {
            return w.a(view, rect, point, this, this.h);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    private int getMaxScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a7bdb9fe835711373b2e5663b51343", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a7bdb9fe835711373b2e5663b51343")).intValue() : Math.max(0, this.k.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692d4232dfaaf57b3a4c4234619fbfbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692d4232dfaaf57b3a4c4234619fbfbd");
            return;
        }
        getDrawingRect(this.f);
        String str = this.h;
        char c = 65535;
        if (str.hashCode() == 466743410 && str.equals("visible")) {
            c = 0;
        }
        if (c != 0) {
            canvas.clipRect(this.f);
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286e5cf31be3065131558d529dc6a24a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286e5cf31be3065131558d529dc6a24a");
            return;
        }
        this.k = view2;
        this.k.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf47feeb90cb453c3f29f5d0ef9e388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf47feeb90cb453c3f29f5d0ef9e388");
            return;
        }
        this.k.removeOnLayoutChangeListener(this);
        this.k = null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0cc95b3f927d6c127de675ecaa91e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0cc95b3f927d6c127de675ecaa91e21");
        } else if (this.k == null) {
        } else {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }
}
