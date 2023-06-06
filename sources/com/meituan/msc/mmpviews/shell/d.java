package com.meituan.msc.mmpviews.shell;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.uimanager.ac;
import com.meituan.msc.uimanager.l;
import com.meituan.msc.uimanager.t;
import com.meituan.msc.uimanager.v;
import com.meituan.msc.uimanager.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d extends ViewGroup implements b, c, com.meituan.msc.touch.c, com.meituan.msc.touch.d, ac, v, z {
    public static ChangeQuickRedirect c;
    private final f a;

    @Override // com.meituan.msc.uimanager.ac
    public final int a(int i) {
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3915347bf113d78714e6be61f750983", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3915347bf113d78714e6be61f750983");
        } else {
            this.a = new f(this);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07021fed1f33f6f7f53b0c634d50f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07021fed1f33f6f7f53b0c634d50f17");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65727c32b6625fc8422eb62e7b89b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65727c32b6625fc8422eb62e7b89b4b");
            return;
        }
        f fVar = this.a;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "4c98327772c4daa493739c0f40b27767", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "4c98327772c4daa493739c0f40b27767");
        } else if (fVar.B != null) {
            fVar.B.layout(0, 0, fVar.D.getWidth(), fVar.D.getHeight());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933e922796cabe8928075763a1d763ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933e922796cabe8928075763a1d763ee");
        } else {
            this.a.b(i);
        }
    }

    @Override // com.meituan.msc.touch.d
    public void setOnInterceptTouchEventListener(com.meituan.msc.touch.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157d6fa45a91aea87eab7044e4844036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157d6fa45a91aea87eab7044e4844036");
        } else {
            this.a.v = bVar;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1437361a1322f8b8a074295b851cbfb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1437361a1322f8b8a074295b851cbfb8")).booleanValue();
        }
        f fVar = this.a;
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "9d392376be00f16498392bc54992e2b5", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "9d392376be00f16498392bc54992e2b5")).booleanValue();
        } else {
            z = (fVar.v != null && fVar.v.a(fVar.D, motionEvent)) || fVar.t == t.NONE || fVar.t == t.BOX_ONLY;
        }
        if (z) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1456944120f4406c944609e5ae8dfa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1456944120f4406c944609e5ae8dfa")).booleanValue();
        }
        f fVar = this.a;
        return (fVar.t == t.NONE || fVar.t == t.BOX_NONE) ? false : true;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a84df8750c96667f237ebb5ecf7e07", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a84df8750c96667f237ebb5ecf7e07")).booleanValue() : this.a.w;
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a549141033e1cf3541caee95434061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a549141033e1cf3541caee95434061");
        } else {
            this.a.a(z);
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public boolean getRemoveClippedSubviews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1677a4d214051ed0e76ddf86437f3a44", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1677a4d214051ed0e76ddf86437f3a44")).booleanValue() : this.a.o;
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36869e9a74d2fba1a5462924491f361b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36869e9a74d2fba1a5462924491f361b");
            return;
        }
        f fVar = this.a;
        Object[] objArr2 = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "41d070d519cc7a7f5b37b57a2f504464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "41d070d519cc7a7f5b37b57a2f504464");
        } else {
            rect.set(fVar.r);
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639ae4bff74a776f89eed1d095d9ece2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639ae4bff74a776f89eed1d095d9ece2");
        } else {
            this.a.o();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc3d30c29830ba4c60576f6ac882be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc3d30c29830ba4c60576f6ac882be1");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        f fVar = this.a;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "d2611189f3364b68bc5dffd270184ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "d2611189f3364b68bc5dffd270184ae5");
        } else if (fVar.o) {
            fVar.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91748792a9e70bda4e8dfc1f822f6200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91748792a9e70bda4e8dfc1f822f6200");
            return;
        }
        super.onAttachedToWindow();
        f fVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "765e90787121cd202b6cffc86d99ab7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "765e90787121cd202b6cffc86d99ab7d");
        } else if (fVar.o) {
            fVar.o();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672b9899812402e40275289128757ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672b9899812402e40275289128757ac3");
            return;
        }
        f fVar = this.a;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "179630917167570347440ba324ce45d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "179630917167570347440ba324ce45d7");
        } else {
            fVar.x.a(view);
            ((c) fVar.D).setChildrenDrawingOrderEnabled(fVar.x.a());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5430daebc97c96e75c7613ac47311723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5430daebc97c96e75c7613ac47311723");
            return;
        }
        this.a.a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67e14e3228cec2444955ef38d846840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67e14e3228cec2444955ef38d846840");
            return;
        }
        this.a.a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // com.meituan.msc.uimanager.ac
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed486469b9ba76cb1285c50ba6764586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed486469b9ba76cb1285c50ba6764586");
            return;
        }
        f fVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "042de12990c046136e77a76cbd1e9cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "042de12990c046136e77a76cbd1e9cde");
            return;
        }
        fVar.x.b();
        ((c) fVar.D).setChildrenDrawingOrderEnabled(fVar.x.a());
        fVar.D.invalidate();
    }

    @Override // com.meituan.msc.uimanager.z
    public t getPointerEvents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e2a2f150684404a9b1611a3598886c", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e2a2f150684404a9b1611a3598886c") : this.a.t;
    }

    @Override // com.meituan.msc.touch.c
    @Nullable
    public Rect getHitSlopRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e6249d94c2ef7e6cd7d90139518cc7", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e6249d94c2ef7e6cd7d90139518cc7") : this.a.s;
    }

    public void setHitSlopRect(@Nullable Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77341acae5b252b239ef8acf215d68fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77341acae5b252b239ef8acf215d68fc");
        } else {
            this.a.s = rect;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0116 A[Catch: StackOverflowError -> 0x01a6, TryCatch #0 {StackOverflowError -> 0x01a6, blocks: (B:9:0x003f, B:11:0x0057, B:12:0x005c, B:14:0x0060, B:16:0x0064, B:18:0x006a, B:20:0x0070, B:22:0x0074, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x009c, B:31:0x00aa, B:33:0x00b0, B:35:0x00b6, B:40:0x00cc, B:56:0x019d, B:50:0x0112, B:52:0x0116, B:53:0x011d, B:39:0x00c0), top: B:68:0x003f }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.shell.d.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, com.meituan.msc.mmpviews.shell.c
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d1c2fd4680da03dd688ba7cedd2472", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d1c2fd4680da03dd688ba7cedd2472")).booleanValue() : super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup, com.meituan.msc.mmpviews.shell.c
    public void setChildrenDrawingOrderEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bfb02ebd1ff60cc99f83d2bf75e4f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bfb02ebd1ff60cc99f83d2bf75e4f42");
        } else {
            super.setChildrenDrawingOrderEnabled(z);
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.b
    public f getDelegate() {
        return this.a;
    }
}
