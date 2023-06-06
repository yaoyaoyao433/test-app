package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CardLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.p.b, g {
    public static ChangeQuickRedirect a;
    public float b;
    public int c;
    int d;
    int e;
    int f;
    e g;
    public i h;
    public boolean i;
    public a j;
    private int k;
    private float l;
    private boolean m;
    private SparseArray<View> n;
    private boolean o;
    private RecyclerView.m p;
    private int q;
    private int r;
    private int s;
    private boolean t;

    @Override // android.support.v7.widget.RecyclerView.p.b
    public PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public CardLayoutManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b606ed990dda39adf98c6ddbc6118bb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b606ed990dda39adf98c6ddbc6118bb1");
            return;
        }
        this.k = 3;
        this.l = 0.9f;
        this.b = 0.0f;
        this.c = 0;
        this.d = -1;
        this.e = 0;
        this.f = 0;
        this.n = new SparseArray<>();
        this.o = true;
        this.r = 0;
        this.s = 1;
        this.i = true;
        this.j = a.SINGLE_LEFT;
        this.g = new b(0);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a253e5eb324d63276af1ebdc13abf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a253e5eb324d63276af1ebdc13abf8");
            return;
        }
        this.k = i;
        if (getChildCount() > 0) {
            requestLayout();
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf2c08d5766c20f4a797c9f9ddddef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf2c08d5766c20f4a797c9f9ddddef5");
            return;
        }
        this.l = f;
        if (getChildCount() > 0) {
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(final RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5435a397fbfbee26b94b00a81fc430c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5435a397fbfbee26b94b00a81fc430c");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.CardLayoutManager.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e07d57f387858cc40873d5c0169900d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e07d57f387858cc40873d5c0169900d");
                } else if (CardLayoutManager.this.getWidth() <= 0 || CardLayoutManager.this.getHeight() <= 0) {
                } else {
                    CardLayoutManager.this.g.a(CardLayoutManager.this.getWidth(), CardLayoutManager.this.getHeight());
                    if (CardLayoutManager.this.g.b() == 0) {
                        CardLayoutManager.this.g.b(ViewConfiguration.get(recyclerView.getContext()).getScaledMinimumFlingVelocity() * 3);
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        recyclerView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "726a96d6f95183d44bd725b7a363ca48", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "726a96d6f95183d44bd725b7a363ca48") : new RecyclerView.g(-1, getHeight());
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d260675195c9041f174f1b036271881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d260675195c9041f174f1b036271881");
            return;
        }
        this.p = mVar;
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(mVar);
        } else if (getChildCount() == 0 && state.g) {
            detachAndScrapAttachedViews(mVar);
        } else {
            a(mVar);
        }
    }

    private void a(RecyclerView.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08e80cd1664461f13f3259e961e36f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08e80cd1664461f13f3259e961e36f4");
            return;
        }
        c();
        for (int i = 0; i < this.n.size(); i++) {
            detachView(this.n.valueAt(i));
        }
        if (this.d == -1 || this.d > this.c) {
            d();
        }
        b(mVar);
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            removeAndRecycleView(this.n.valueAt(i2), mVar);
        }
        this.n.clear();
    }

    private void b(RecyclerView.m mVar) {
        int i;
        int i2;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951e5ce0109863bbb7b26d59ada26174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951e5ce0109863bbb7b26d59ada26174");
            return;
        }
        try {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int height = getHeight();
            int width = this.b == 0.0f ? getWidth() : (int) (height * this.b);
            int width2 = ((getWidth() - width) - paddingLeft) - paddingRight;
            int i3 = this.e > 0 ? this.c - 1 : this.c;
            if (i3 < 0) {
                return;
            }
            int i4 = i3;
            float f = 1.0f;
            float f2 = 1.0f;
            while (i4 <= this.k + i3 && i4 < getItemCount()) {
                int i5 = i4 - i3;
                View view = this.n.get(i4);
                if (view == null) {
                    View b = mVar.b(i4);
                    b.setTranslationX(0.0f);
                    b.setTranslationY(0.0f);
                    addView(b, 0);
                    measureChildWithMargins(b, 0, 0);
                    i = i5;
                    i2 = i4;
                    layoutDecoratedWithMargins(b, 0, 0, width + 0, height + 0);
                    view = b;
                } else {
                    i = i5;
                    i2 = i4;
                    attachView(view, 0);
                    this.n.remove(i2);
                }
                if (i2 == i3) {
                    float f3 = this.e > 0 ? (-width) + this.e : this.e;
                    if (f3 > 0.0f) {
                        f3 = 0.0f;
                    }
                    view.setTranslationX(f3);
                    view.setTranslationY(this.f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    this.q = a(view);
                    f2 = this.e > 0 ? 1.0f - b(view) : b(view);
                } else {
                    float f4 = this.l * f;
                    float f5 = f4 + ((f - f4) * f2);
                    view.setScaleX(f5);
                    view.setScaleY(f5);
                    int i6 = this.k - 1;
                    if (i6 > 0) {
                        view.setTranslationX(((i - f2) * ((width2 * 1.0f) / i6)) + ((view.getWidth() / 2.0f) * (1.0f - f5)));
                    }
                    f = f4;
                }
                i4 = i2 + 1;
            }
        } catch (Exception e) {
            Log.wtf("CardLayoutManager", e);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379ea3f7d6ec402be570468ee5ed7460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379ea3f7d6ec402be570468ee5ed7460");
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            this.n.put(getPosition(childAt), childAt);
        }
    }

    private int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aaf6b2f1e42d0e1ae78ed55724f6514", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aaf6b2f1e42d0e1ae78ed55724f6514")).intValue() : (view.getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private float b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c11f761adbdd2e50cec28f4b6b1c8c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c11f761adbdd2e50cec28f4b6b1c8c1")).floatValue();
        }
        int width = view.getWidth();
        if (width == 0) {
            return 0.0f;
        }
        return Math.min(Math.abs(this.e) / (width / 2.0f), 1.0f);
    }

    private void d() {
        View c;
        View c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b106f744d3b90a946b89cca1d4cf90cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b106f744d3b90a946b89cca1d4cf90cf");
        } else if (Math.abs(this.e) >= this.q) {
            if (this.r == 2) {
                if (this.h != null && (c2 = c(this.c)) != null) {
                    this.h.b(c2, this.c);
                }
            } else if (this.r == 1 && this.h != null && (c = c(this.c)) != null) {
                this.h.b(c, this.c, this.s);
            }
            this.r = 0;
            if (this.e < 0) {
                this.c++;
            } else {
                this.c--;
            }
            this.e = 0;
            this.f = 0;
            this.o = false;
            this.m = false;
        }
    }

    private View c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a614665885108295fe1cfdee5d219eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a614665885108295fe1cfdee5d219eb");
        }
        View findViewByPosition = findViewByPosition(i);
        return findViewByPosition != null ? findViewByPosition : this.n.get(i);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.i;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "582e8fb21cb60c5b71ade46c6e038806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "582e8fb21cb60c5b71ade46c6e038806");
            return;
        }
        super.onScrollStateChanged(i);
        if (i == 0) {
            if (this.d != -1) {
                if (this.d > this.c) {
                    d(this.d);
                } else if (this.d < this.c) {
                    e(this.d);
                } else {
                    if (this.t) {
                        this.t = false;
                        if (this.h != null) {
                            this.h.b(c(this.c), this.c);
                        }
                    }
                    this.d = -1;
                }
            }
            this.o = true;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051a339f7f3b6c0040464c31e0399ded", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051a339f7f3b6c0040464c31e0399ded")).intValue();
        }
        if (this.o) {
            this.e -= i;
            if (this.j == a.SINGLE_LEFT && this.e > 0) {
                this.e = 0;
            }
            a(mVar);
            return i;
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbc2ee9980adc9298f81989c5c59d090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbc2ee9980adc9298f81989c5c59d090");
            return;
        }
        new StringBuilder("smoothScrollToPosition: ").append(i);
        if (i != this.c && i >= 0) {
            if (i > this.c) {
                d(i);
                return;
            } else if (this.t) {
                this.d = i;
                return;
            } else {
                e(i);
                return;
            }
        }
        this.d = -1;
        this.t = false;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee42cba0b73c5f35c2f0371c07e6e05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee42cba0b73c5f35c2f0371c07e6e05f");
        } else if (i == this.c || i < 0 || !this.i) {
        } else {
            this.c = i;
            this.f = 0;
            this.e = 0;
            this.r = 0;
            this.o = false;
            this.m = false;
            requestLayout();
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f9d7f84622c2890a5f832370fb3c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f9d7f84622c2890a5f832370fb3c2d");
            return;
        }
        try {
            View findViewByPosition = findViewByPosition(this.c);
            this.m = true;
            int[] a2 = this.g.a();
            if (a2 != null && a2.length == 2 && a2[0] != -1 && a2[1] != -1) {
                a(findViewByPosition, a2[0], a2[1]);
            } else {
                a(findViewByPosition, 0, 0);
            }
            this.d = i;
            c cVar = new c(this.g, this);
            cVar.a(this.c, this);
            startSmoothScroll(cVar);
            this.t = false;
        } catch (Exception e) {
            Log.wtf("CardLayoutManager", e);
        }
    }

    private void e(int i) {
        View c;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497a29b2f8ebb4d87fc9620bf2e1bc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497a29b2f8ebb4d87fc9620bf2e1bc53");
            return;
        }
        try {
            View findViewByPosition = findViewByPosition(this.c);
            if (this.h != null && this.t && (c = c(this.c)) != null) {
                this.h.b(c, this.c);
            }
            this.m = true;
            int[] a2 = this.g.a();
            if (a2 != null && a2.length == 2 && a2[0] != -1 && a2[1] != -1) {
                a(findViewByPosition, a2[0], a2[1]);
            } else {
                a(findViewByPosition, 0, 0);
            }
            this.d = i;
            c cVar = new c(this.g, this);
            f a3 = this.g.a(this.c);
            a3.a(0, 0);
            this.e = a3.e;
            this.f = a3.f;
            this.c--;
            cVar.a(this.c, a3, this);
            startSmoothScroll(cVar);
            this.t = true;
        } catch (Exception e) {
            Log.wtf("CardLayoutManager", e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c5cb171695f2439d5c43ec770115686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c5cb171695f2439d5c43ec770115686");
            return;
        }
        super.onItemsChanged(recyclerView);
        if (this.p != null) {
            removeAllViews();
            a(this.p);
        }
    }

    public final void a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7130a948f6e32f548e55bdcd47925d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7130a948f6e32f548e55bdcd47925d");
            return;
        }
        if (view != null) {
            Rect rect = new Rect();
            view.getLocalVisibleRect(rect);
            this.o = rect.contains(i, i2);
        } else {
            this.o = true;
        }
        if (this.o) {
            this.m = true;
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.g
    public final void b(int i) {
        View c;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6085c4c17e6e469cf9d0106f18e79125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6085c4c17e6e469cf9d0106f18e79125");
            return;
        }
        this.r = 1;
        this.s = i;
        if (this.h == null || (c = c(this.c)) == null) {
            return;
        }
        this.h.a(c, this.c, this.s);
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.g
    public final void a() {
        View c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400da15759580f99ede5e9ea2b518191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400da15759580f99ede5e9ea2b518191");
            return;
        }
        this.r = 2;
        if (this.h == null || (c = c(this.c)) == null) {
            return;
        }
        this.h.a(c, this.c);
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.g
    public final void b() {
        View c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67b38a5096f36dd054cdca658d4814e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67b38a5096f36dd054cdca658d4814e");
        } else if (this.h == null || (c = c(this.c)) == null) {
        } else {
            this.h.b(c, this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        HORIZONTAL("horizontal"),
        SINGLE_LEFT("singleLeft");
        
        public static ChangeQuickRedirect a;
        public String d;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25b6d528ae7d7f14ee04ade88a628c85", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25b6d528ae7d7f14ee04ade88a628c85") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "471b5b5ee748a165b65515069a2c9fda", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "471b5b5ee748a165b65515069a2c9fda") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b4d6b831c81a583e586db1589137f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b4d6b831c81a583e586db1589137f9");
            } else {
                this.d = str;
            }
        }
    }
}
