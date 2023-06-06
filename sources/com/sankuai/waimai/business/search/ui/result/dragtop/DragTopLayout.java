package com.sankuai.waimai.business.search.ui.result.dragtop;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DragTopLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    public a b;
    public boolean c;
    private ViewDragHelper d;
    private int e;
    private View f;
    private View g;
    private int h;
    private int i;
    private float j;
    private boolean k;
    private float l;
    private boolean m;
    private int n;
    private int o;
    private boolean p;
    private Handler q;
    private b r;
    private ViewDragHelper.Callback s;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(float f);

        void a(int i);

        void a(b bVar);

        boolean b();

        boolean c();

        boolean d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements a {
        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public void a() {
        }

        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public void a(float f) {
        }

        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public void a(int i) {
        }

        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public void a(b bVar) {
        }

        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public boolean b() {
            return true;
        }

        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public boolean c() {
            return false;
        }

        @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
        public boolean d() {
            return false;
        }
    }

    public static /* synthetic */ void a(DragTopLayout dragTopLayout, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dragTopLayout, changeQuickRedirect, false, "93c86950638ae44b3b9c39ebdd82341e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dragTopLayout, changeQuickRedirect, false, "93c86950638ae44b3b9c39ebdd82341e");
            return;
        }
        dragTopLayout.j = f / dragTopLayout.i;
        if (dragTopLayout.b != null) {
            dragTopLayout.b.a(dragTopLayout.j);
            if (dragTopLayout.j <= dragTopLayout.l || dragTopLayout.k) {
                return;
            }
            dragTopLayout.k = true;
        }
    }

    public static /* synthetic */ boolean a(DragTopLayout dragTopLayout, boolean z) {
        dragTopLayout.c = true;
        return true;
    }

    public static /* synthetic */ void g(DragTopLayout dragTopLayout) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dragTopLayout, changeQuickRedirect, false, "268c95f54b16df3b3d008a24371d9dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dragTopLayout, changeQuickRedirect, false, "268c95f54b16df3b3d008a24371d9dbe");
            return;
        }
        if (dragTopLayout.h <= dragTopLayout.getPaddingTop()) {
            dragTopLayout.r = b.COLLAPSED;
        } else if (dragTopLayout.h >= dragTopLayout.g.getHeight()) {
            dragTopLayout.r = b.EXPANDED;
        } else {
            dragTopLayout.r = b.SLIDING;
        }
        if (dragTopLayout.b != null) {
            dragTopLayout.b.a(dragTopLayout.r);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82dff93324870dc53bf296132eb7662b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82dff93324870dc53bf296132eb7662b");
        } else if (this.r != b.COLLAPSED) {
            this.c = true;
            this.q.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d57ee9341b01748ea0511be1b2a827d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d57ee9341b01748ea0511be1b2a827d");
                    } else if (DragTopLayout.this.d == null || DragTopLayout.this.f == null) {
                    } else {
                        DragTopLayout.this.d.smoothSlideViewTo(DragTopLayout.this.f, DragTopLayout.this.getPaddingLeft(), DragTopLayout.this.getPaddingTop());
                        DragTopLayout.this.postInvalidate();
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        COLLAPSED(0),
        EXPANDED(1),
        SLIDING(2);
        
        public static ChangeQuickRedirect a;
        private int e;

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13738ea548787c8f554e6dd57ebb3529", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13738ea548787c8f554e6dd57ebb3529") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c9e11d6cf58ebbe013a2e89eaab61c2", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c9e11d6cf58ebbe013a2e89eaab61c2") : (b[]) values().clone();
        }

        b(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995e43e1dd1e06a103c2b4a59d2636e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995e43e1dd1e06a103c2b4a59d2636e1");
            } else {
                this.e = i;
            }
        }
    }

    public DragTopLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddaf0b3b17b766a311c2140eee3a2454", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddaf0b3b17b766a311c2140eee3a2454");
        }
    }

    public DragTopLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ffb4c44302519c5c65287c32b27c870", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ffb4c44302519c5c65287c32b27c870");
        }
    }

    public DragTopLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6400c473ce16f4f32775a717d13667fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6400c473ce16f4f32775a717d13667fa");
            return;
        }
        this.l = 1.5f;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = true;
        this.c = false;
        this.r = b.COLLAPSED;
        this.s = new ViewDragHelper.Callback() { // from class: com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                Object[] objArr2 = {view, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fbbda9818da97bf4dd8f089e26f25b9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fbbda9818da97bf4dd8f089e26f25b9")).booleanValue();
                }
                if (DragTopLayout.this.b == null || DragTopLayout.this.b.b()) {
                    if (view != DragTopLayout.this.g || !DragTopLayout.this.p) {
                        return view == DragTopLayout.this.f;
                    }
                    DragTopLayout.this.d.captureChildView(DragTopLayout.this.f, i2);
                    return false;
                }
                return false;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                Object[] objArr2 = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c297fdf21dce87c1c1ec646fe437eb88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c297fdf21dce87c1c1ec646fe437eb88");
                    return;
                }
                super.onViewPositionChanged(view, i2, i3, i4, i5);
                DragTopLayout.this.h = i3;
                DragTopLayout.this.requestLayout();
                DragTopLayout.a(DragTopLayout.this, DragTopLayout.this.h);
                DragTopLayout.g(DragTopLayout.this);
                if (DragTopLayout.this.b != null) {
                    DragTopLayout.this.b.a(i3);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eabb4d0f3c63f9703b60dcce035777a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eabb4d0f3c63f9703b60dcce035777a")).intValue() : DragTopLayout.this.e;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i3) {
                Object[] objArr2 = {view, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7d88ba4350c12fb36eb4a163f76ba5a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7d88ba4350c12fb36eb4a163f76ba5a")).intValue() : DragTopLayout.this.m ? Math.min(DragTopLayout.this.i + 1, Math.max(i2, DragTopLayout.this.getPaddingTop())) : Math.min(DragTopLayout.this.i, Math.max(i2, DragTopLayout.this.getPaddingTop()));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int paddingTop;
                Object[] objArr2 = {view, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cc261c61d8461f54dadaf05f62bd7ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cc261c61d8461f54dadaf05f62bd7ea");
                    return;
                }
                super.onViewReleased(view, f, f2);
                if (f2 > 0.0f || DragTopLayout.this.h > DragTopLayout.this.i) {
                    paddingTop = DragTopLayout.this.i + DragTopLayout.this.getPaddingTop();
                } else if (f2 < 0.0f) {
                    paddingTop = DragTopLayout.this.getPaddingTop();
                } else {
                    paddingTop = DragTopLayout.this.h < DragTopLayout.this.i / 2 ? DragTopLayout.this.getPaddingTop() : DragTopLayout.this.i + DragTopLayout.this.getPaddingTop();
                }
                DragTopLayout.a(DragTopLayout.this, true);
                DragTopLayout.this.d.settleCapturedViewAt(view.getLeft(), paddingTop);
                DragTopLayout.this.postInvalidate();
                if (DragTopLayout.this.b != null) {
                    DragTopLayout.this.b.a();
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5175f9f569adf672eacb9fa54f5564dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5175f9f569adf672eacb9fa54f5564dc");
                } else {
                    super.onViewDragStateChanged(i2);
                }
            }
        };
        Object[] objArr2 = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a18148d384532abd5eb1c958df55e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a18148d384532abd5eb1c958df55e76");
            return;
        }
        this.d = ViewDragHelper.create(this, 1.0f, this.s);
        this.q = new Handler(Looper.getMainLooper());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.dtlOverDrag, R.attr.dtlOpen, R.attr.dtlTopView, R.attr.dtlDragContentView, R.attr.dtlCaptureTop});
        this.m = obtainStyledAttributes.getBoolean(0, this.m);
        this.o = obtainStyledAttributes.getResourceId(3, -1);
        this.n = obtainStyledAttributes.getResourceId(2, -1);
        if (obtainStyledAttributes.getBoolean(1, true)) {
            this.r = b.EXPANDED;
        } else {
            this.r = b.COLLAPSED;
        }
        this.p = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400296070973d46e46f5555a74dd325b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400296070973d46e46f5555a74dd325b");
            return;
        }
        super.onFinishInflate();
        if (getChildCount() < 2) {
            throw new RuntimeException("Content view must contains two child views at least.");
        }
        if (this.n != -1 && this.o == -1) {
            throw new IllegalArgumentException("You have set \"dtlTopView\" but not \"dtlDragContentView\". Both are required!");
        }
        if (this.o != -1 && this.n == -1) {
            throw new IllegalArgumentException("You have set \"dtlDragContentView\" but not \"dtlTopView\". Both are required!");
        }
        if (this.o == -1 || this.n == -1) {
            this.g = getChildAt(0);
            this.f = getChildAt(1);
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1aa8ac58de484e2b7bd8d6dc4f3f7c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1aa8ac58de484e2b7bd8d6dc4f3f7c19");
            return;
        }
        this.g = findViewById(this.n);
        this.f = findViewById(this.o);
        if (this.g == null) {
            throw new IllegalArgumentException("\"dtlTopView\" with id = \"@id/" + getResources().getResourceEntryName(this.n) + "\" has NOT been found. Is a child with that id in this " + getClass().getSimpleName() + CommonConstant.Symbol.QUESTION_MARK);
        } else if (this.f != null) {
        } else {
            throw new IllegalArgumentException("\"dtlDragContentView\" with id = \"@id/" + getResources().getResourceEntryName(this.o) + "\" has NOT been found. Is a child with that id in this " + getClass().getSimpleName() + CommonConstant.Symbol.QUESTION_MARK);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c9b746439901886f70722be2870ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c9b746439901886f70722be2870ae3");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.e = getHeight();
        a(this.g.getHeight());
        this.f.layout(i, this.h, i3, this.h + this.f.getHeight());
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b65539fed6a513f82753aa91cecfae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b65539fed6a513f82753aa91cecfae");
        } else {
            a(i, false);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da716a257208f328ee17e653c8024d10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da716a257208f328ee17e653c8024d10");
        } else if (z) {
            setTopViewHeight(i);
        } else if (this.i != i) {
            setTopViewHeight(i);
        }
    }

    private void setTopViewHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48a6d41500d18292b5b1fe46064ac98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48a6d41500d18292b5b1fe46064ac98");
            return;
        }
        if (this.r == b.EXPANDED) {
            this.h = i;
        } else if (this.r == b.COLLAPSED) {
            this.h = 0;
        }
        this.i = i;
    }

    public void setPanelState(b bVar) {
        this.r = bVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f91ebb5f4da81de732181a7b852c901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f91ebb5f4da81de732181a7b852c901");
        } else if (this.c && this.d.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850861e70bd3b29185c4da7f8d39e16f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850861e70bd3b29185c4da7f8d39e16f")).booleanValue();
        }
        try {
            if (this.b != null) {
                if (this.b.b()) {
                    return ((this.b == null || !this.b.c()) ? true : this.b.d()) && this.d.shouldInterceptTouchEvent(motionEvent);
                }
                return false;
            }
            return this.d.shouldInterceptTouchEvent(motionEvent);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51ebdfd23369fe3ee36167efdd12ba5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51ebdfd23369fe3ee36167efdd12ba5")).booleanValue();
        }
        try {
            this.d.processTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.e("DragTopLayout", e.getMessage());
        }
        return true;
    }

    public b getState() {
        return this.r;
    }
}
