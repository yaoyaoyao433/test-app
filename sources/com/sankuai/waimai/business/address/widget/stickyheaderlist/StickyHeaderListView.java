package com.sankuai.waimai.business.address.widget.stickyheaderlist;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.dianping.widget.view.NovaListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.address.widget.stickyheaderlist.a;
import com.sankuai.waimai.business.address.widget.stickyheaderlist.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StickyHeaderListView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.address.widget.stickyheaderlist.d b;
    private View c;
    private Long d;
    private Integer e;
    private Integer f;
    private AbsListView.OnScrollListener g;
    private com.sankuai.waimai.business.address.widget.stickyheaderlist.a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private c q;
    private e r;
    private d s;
    private a t;
    private Drawable u;
    private int v;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface e {
    }

    public StickyHeaderListView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9b24ad10cdd73dddb00137a430e45e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9b24ad10cdd73dddb00137a430e45e");
        }
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6241aa236a4f2964b6123144e1e7bd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6241aa236a4f2964b6123144e1e7bd5");
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @TargetApi(11)
    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de023b087fa848ae824cc61fe9bc9c32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de023b087fa848ae824cc61fe9bc9c32");
            return;
        }
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.b = new com.sankuai.waimai.business.address.widget.stickyheaderlist.d(context);
        this.b.setExposeBlockId("GoodItemsLV");
        this.u = this.b.getDivider();
        this.v = this.b.getDividerHeight();
        this.b.setDivider(null);
        this.b.setDividerHeight(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842879, 16842965, 16842966, 16842967, 16842968, 16842969, 16842974, 16842976, 16842987, 16843003, 16843004, 16843006, 16843008, 16843009, 16843049, 16843050, 16843051, 16843302, 16843457, 16843573, 16843685, R.attr.hasStickyHeaders, R.attr.isDrawingListUnderStickyHeader}, 0, 0);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                this.m = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
                this.n = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                this.o = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                this.p = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
                setPadding(this.m, this.n, this.o, this.p);
                this.j = obtainStyledAttributes.getBoolean(8, true);
                super.setClipToPadding(true);
                this.b.setClipToPadding(this.j);
                int i2 = obtainStyledAttributes.getInt(6, 512);
                this.b.setVerticalScrollBarEnabled((i2 & 512) != 0);
                this.b.setHorizontalScrollBarEnabled((i2 & 256) != 0);
                if (Build.VERSION.SDK_INT >= 9) {
                    this.b.setOverScrollMode(obtainStyledAttributes.getInt(18, 0));
                }
                this.b.setFadingEdgeLength(obtainStyledAttributes.getDimensionPixelSize(7, this.b.getVerticalFadingEdgeLength()));
                int i3 = obtainStyledAttributes.getInt(20, 0);
                if (i3 == 4096) {
                    this.b.setVerticalFadingEdgeEnabled(false);
                    this.b.setHorizontalFadingEdgeEnabled(true);
                } else if (i3 == 8192) {
                    this.b.setVerticalFadingEdgeEnabled(true);
                    this.b.setHorizontalFadingEdgeEnabled(false);
                } else {
                    this.b.setVerticalFadingEdgeEnabled(false);
                    this.b.setHorizontalFadingEdgeEnabled(false);
                }
                this.b.setCacheColorHint(obtainStyledAttributes.getColor(13, this.b.getCacheColorHint()));
                if (Build.VERSION.SDK_INT >= 11) {
                    this.b.setChoiceMode(obtainStyledAttributes.getInt(16, this.b.getChoiceMode()));
                }
                this.b.setDrawSelectorOnTop(obtainStyledAttributes.getBoolean(10, false));
                this.b.setFastScrollEnabled(obtainStyledAttributes.getBoolean(17, this.b.isFastScrollEnabled()));
                if (Build.VERSION.SDK_INT >= 11) {
                    this.b.setFastScrollAlwaysVisible(obtainStyledAttributes.getBoolean(19, this.b.isFastScrollAlwaysVisible()));
                }
                this.b.setScrollBarStyle(obtainStyledAttributes.getInt(0, 0));
                if (obtainStyledAttributes.hasValue(9)) {
                    this.b.setSelector(obtainStyledAttributes.getDrawable(9));
                }
                this.b.setScrollingCacheEnabled(obtainStyledAttributes.getBoolean(11, this.b.isScrollingCacheEnabled()));
                if (obtainStyledAttributes.hasValue(14)) {
                    this.u = obtainStyledAttributes.getDrawable(14);
                }
                this.v = obtainStyledAttributes.getDimensionPixelSize(15, this.v);
                this.b.setTranscriptMode(obtainStyledAttributes.getInt(12, 0));
                this.i = obtainStyledAttributes.getBoolean(21, true);
                this.k = obtainStyledAttributes.getBoolean(22, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.b.setLifeCycleListener(new g());
        this.b.setOnScrollListener(new f());
        addView(this.b);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8867bab116e94cd3a945cccf9ce991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8867bab116e94cd3a945cccf9ce991");
            return;
        }
        super.onMeasure(i, i2);
        b(this.c);
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1495cae9b201cde79bea795fc3fa07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1495cae9b201cde79bea795fc3fa07");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        } else if (layoutParams.height == -1 || layoutParams.width == -2) {
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe14a5878bb398639307a11c234791c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe14a5878bb398639307a11c234791c");
        } else if (view != null) {
            measureChild(view, View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - this.m) - this.o, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728f1cf656af3f46473b039b026d3185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728f1cf656af3f46473b039b026d3185");
            return;
        }
        this.b.layout(0, 0, this.b.getMeasuredWidth(), getHeight());
        if (this.c != null) {
            int c2 = ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin + c();
            this.c.layout(this.m, c2, this.c.getMeasuredWidth() + this.m, this.c.getMeasuredHeight() + c2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0459696e604ba3f4cfa1a7e3783ffa2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0459696e604ba3f4cfa1a7e3783ffa2a");
        } else if (this.b.getVisibility() == 0 || this.b.getAnimation() != null) {
            drawChild(canvas, this.b, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d6cd231592bd966f7ae3c2ca8872a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d6cd231592bd966f7ae3c2ca8872a9");
        } else if (this.c != null) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.b.setTopClippingLength(0);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a7d1c773096fc6847dd772a73eabb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a7d1c773096fc6847dd772a73eabb5");
            return;
        }
        int count = this.h == null ? 0 : this.h.getCount();
        if (count == 0 || !this.i) {
            return;
        }
        int headerViewsCount = i - this.b.getHeaderViewsCount();
        if (this.b.getChildCount() > 0 && this.b.getChildAt(0).getBottom() < c()) {
            headerViewsCount++;
        }
        boolean z2 = this.b.getChildCount() != 0;
        boolean z3 = z2 && this.b.getFirstVisiblePosition() == 0 && this.b.getChildAt(0).getTop() >= c();
        if (headerViewsCount <= count - 1 && headerViewsCount >= 0) {
            z = false;
        }
        if (!z2 || z || z3) {
            a();
        } else {
            b(headerViewsCount);
        }
    }

    private void b(int i) {
        boolean contains;
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae36d82ac0dad1c37cc4034b124b69b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae36d82ac0dad1c37cc4034b124b69b8");
            return;
        }
        if (this.e == null || this.e.intValue() != i) {
            this.e = Integer.valueOf(i);
            long a2 = this.h.a(i);
            if (this.d == null || this.d.longValue() != a2) {
                this.d = Long.valueOf(a2);
                View a3 = this.h.a(this.e.intValue(), this.c, this);
                if (this.c != a3) {
                    if (a3 == null) {
                        throw new NullPointerException("header may not be null");
                    }
                    Object[] objArr2 = {a3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a715b1795e8a11dcdd7a2593d7486ac6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a715b1795e8a11dcdd7a2593d7486ac6");
                    } else {
                        if (this.c != null) {
                            removeView(this.c);
                        }
                        this.c = a3;
                        addView(this.c);
                        if (this.q != null) {
                            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.widget.stickyheaderlist.StickyHeaderListView.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68c048f119ac108f771b12cdb21ec7cb", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68c048f119ac108f771b12cdb21ec7cb");
                                        return;
                                    }
                                    c unused = StickyHeaderListView.this.q;
                                    View unused2 = StickyHeaderListView.this.c;
                                    StickyHeaderListView.this.e.intValue();
                                    StickyHeaderListView.this.d.longValue();
                                }
                            });
                        }
                        this.c.setClickable(true);
                    }
                }
                a(this.c);
                b(this.c);
                if (this.s != null) {
                    this.d.longValue();
                }
                this.f = null;
            }
        }
        int measuredHeight = this.c.getMeasuredHeight() + c();
        for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
            View childAt = this.b.getChildAt(i3);
            boolean z = (childAt instanceof com.sankuai.waimai.business.address.widget.stickyheaderlist.c) && ((com.sankuai.waimai.business.address.widget.stickyheaderlist.c) childAt).a();
            com.sankuai.waimai.business.address.widget.stickyheaderlist.d dVar = this.b;
            Object[] objArr3 = {childAt};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.address.widget.stickyheaderlist.d.c;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "7554b98afc6e44b74f43c6abd36fcbb7", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "7554b98afc6e44b74f43c6abd36fcbb7")).booleanValue();
            } else {
                contains = dVar.d == null ? false : dVar.d.contains(childAt);
            }
            if (childAt.getTop() >= c() && (z || contains)) {
                i2 = Math.min(childAt.getTop() - measuredHeight, 0);
                break;
            }
        }
        setHeaderOffet(i2);
        if (!this.k) {
            this.b.setTopClippingLength(this.c.getMeasuredHeight() + this.f.intValue());
        }
        b();
    }

    private void b() {
        int c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987e0188d65e361f8c85053ca4404098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987e0188d65e361f8c85053ca4404098");
            return;
        }
        if (this.c != null) {
            c2 = this.c.getMeasuredHeight() + (this.f != null ? this.f.intValue() : 0) + this.l;
        } else {
            c2 = c();
        }
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof com.sankuai.waimai.business.address.widget.stickyheaderlist.c) {
                com.sankuai.waimai.business.address.widget.stickyheaderlist.c cVar = (com.sankuai.waimai.business.address.widget.stickyheaderlist.c) childAt;
                if (cVar.a()) {
                    View view = cVar.e;
                    if (cVar.getTop() < c2) {
                        if (view.getVisibility() != 4) {
                            view.setVisibility(4);
                        }
                    } else if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        }
    }

    @SuppressLint({"NewApi", "ObsoleteSdkInt"})
    private void setHeaderOffet(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fdbbbcb4f47cda1372f04a83fd4d549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fdbbbcb4f47cda1372f04a83fd4d549");
        } else if (this.f == null || this.f.intValue() != i) {
            this.f = Integer.valueOf(i);
            if (Build.VERSION.SDK_INT >= 11) {
                this.c.setTranslationY(this.f.intValue());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
                marginLayoutParams.topMargin = this.f.intValue();
                this.c.setLayoutParams(marginLayoutParams);
            }
            if (this.r != null) {
                this.f.intValue();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends DataSetObserver {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {StickyHeaderListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f0dc5fb3036e03448d489637c6736f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f0dc5fb3036e03448d489637c6736f");
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e295511536d677d84e194784a65d0e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e295511536d677d84e194784a65d0e8");
            } else {
                StickyHeaderListView.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c413060ec15015772e90726317667f6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c413060ec15015772e90726317667f6e");
            } else {
                StickyHeaderListView.this.a();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class f implements AbsListView.OnScrollListener {
        public static ChangeQuickRedirect a;

        private f() {
            Object[] objArr = {StickyHeaderListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae45bbd24cacc9a268391fcf2c64f2bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae45bbd24cacc9a268391fcf2c64f2bd");
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            Object[] objArr = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fdee3cb21aad32ce528a8c63fc529a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fdee3cb21aad32ce528a8c63fc529a0");
                return;
            }
            if (StickyHeaderListView.this.g != null) {
                StickyHeaderListView.this.g.onScroll(absListView, i, i2, i3);
            }
            StickyHeaderListView.this.a(StickyHeaderListView.this.b.getFixedFirstVisibleItem());
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            Object[] objArr = {absListView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf6cdabf1d072474840c0fa3c98072e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf6cdabf1d072474840c0fa3c98072e");
            } else if (StickyHeaderListView.this.g != null) {
                StickyHeaderListView.this.g.onScrollStateChanged(absListView, i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class g implements d.a {
        public static ChangeQuickRedirect a;

        private g() {
            Object[] objArr = {StickyHeaderListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0aaab7ccf2896c7181e18eeb4f166e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0aaab7ccf2896c7181e18eeb4f166e");
            }
        }

        @Override // com.sankuai.waimai.business.address.widget.stickyheaderlist.d.a
        @SuppressLint({"ObsoleteSdkInt"})
        public final void a(Canvas canvas) {
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf525f740a0fd00a2be1dc98c440e78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf525f740a0fd00a2be1dc98c440e78");
                return;
            }
            if (Build.VERSION.SDK_INT < 8) {
                StickyHeaderListView.this.a(StickyHeaderListView.this.b.getFixedFirstVisibleItem());
            }
            if (StickyHeaderListView.this.c != null) {
                if (!StickyHeaderListView.this.j) {
                    StickyHeaderListView.this.drawChild(canvas, StickyHeaderListView.this.c, 0L);
                    return;
                }
                canvas.save();
                canvas.clipRect(0, StickyHeaderListView.this.n, StickyHeaderListView.this.getRight(), StickyHeaderListView.this.getBottom());
                StickyHeaderListView.this.drawChild(canvas, StickyHeaderListView.this.c, 0L);
                canvas.restore();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b implements a.InterfaceC0727a {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {StickyHeaderListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10742e0cf977247fde7f4606089f2931", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10742e0cf977247fde7f4606089f2931");
            }
        }

        @Override // com.sankuai.waimai.business.address.widget.stickyheaderlist.a.InterfaceC0727a
        public final void a(View view, int i, long j) {
            Object[] objArr = {view, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e28e52a02caac7b46cdc64b998aaef26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e28e52a02caac7b46cdc64b998aaef26");
            } else {
                c unused = StickyHeaderListView.this.q;
            }
        }
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d3a4e6f76986475433222f61c5219b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d3a4e6f76986475433222f61c5219b")).intValue();
        }
        return this.l + (this.j ? this.n : 0);
    }

    public void setAreHeadersSticky(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2938290fd8aa0fd47284a7c9fc5ac361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2938290fd8aa0fd47284a7c9fc5ac361");
            return;
        }
        this.i = z;
        if (!z) {
            a();
        } else {
            a(this.b.getFixedFirstVisibleItem());
        }
        this.b.invalidate();
    }

    public void setStickyHeaderTopOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c17e9c21f8698114441e0172eee9cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c17e9c21f8698114441e0172eee9cd0");
            return;
        }
        this.l = i;
        a(this.b.getFixedFirstVisibleItem());
    }

    public int getStickyHeaderTopOffset() {
        return this.l;
    }

    public void setDrawingListUnderStickyHeader(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39393729a707e2e3641d47fffc654b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39393729a707e2e3641d47fffc654b61");
            return;
        }
        this.k = z;
        this.b.setTopClippingLength(0);
    }

    public void setOnHeaderClickListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6efe0693aef4146129393d62ff4ece5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6efe0693aef4146129393d62ff4ece5");
            return;
        }
        this.q = cVar;
        if (this.h != null) {
            if (this.q != null) {
                this.h.c = new b();
                if (this.c != null) {
                    this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.widget.stickyheaderlist.StickyHeaderListView.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "192549d725939aa4ab99de4e2632f966", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "192549d725939aa4ab99de4e2632f966");
                                return;
                            }
                            c unused = StickyHeaderListView.this.q;
                            View unused2 = StickyHeaderListView.this.c;
                            StickyHeaderListView.this.e.intValue();
                            StickyHeaderListView.this.d.longValue();
                        }
                    });
                    return;
                }
                return;
            }
            this.h.c = null;
        }
    }

    public void setOnStickyHeaderOffsetChangedListener(e eVar) {
        this.r = eVar;
    }

    public void setOnStickyHeaderChangedListener(d dVar) {
        this.s = dVar;
    }

    public int getListChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb204a773694d3badcff34a1f8b2dd9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb204a773694d3badcff34a1f8b2dd9")).intValue() : this.b.getChildCount();
    }

    public ListView getWrappedList() {
        return this.b;
    }

    private static boolean c(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public void setAdapter(com.sankuai.waimai.business.address.widget.stickyheaderlist.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3486063af341ad25a9c097096a62856d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3486063af341ad25a9c097096a62856d");
        } else if (bVar == null) {
            this.b.setAdapter((ListAdapter) null);
            a();
        } else {
            if (this.h != null) {
                this.h.unregisterDataSetObserver(this.t);
            }
            this.h = new com.sankuai.waimai.business.address.widget.stickyheaderlist.a(getContext(), bVar);
            this.t = new a();
            this.h.registerDataSetObserver(this.t);
            if (this.q != null) {
                this.h.c = new b();
            } else {
                this.h.c = null;
            }
            this.h.a(this.u, this.v);
            this.b.setAdapter((ListAdapter) this.h);
            a();
        }
    }

    public com.sankuai.waimai.business.address.widget.stickyheaderlist.b getAdapter() {
        if (this.h == null) {
            return null;
        }
        return this.h.b;
    }

    public void setDivider(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7601d22a5ea45e4f394770a67a339d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7601d22a5ea45e4f394770a67a339d2");
            return;
        }
        this.u = drawable;
        if (this.h != null) {
            this.h.a(this.u, this.v);
        }
    }

    public void setDividerHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be75acb59f30c48930df6619ee45ca16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be75acb59f30c48930df6619ee45ca16");
            return;
        }
        this.v = i;
        if (this.h != null) {
            this.h.a(this.u, this.v);
        }
    }

    public Drawable getDivider() {
        return this.u;
    }

    public int getDividerHeight() {
        return this.v;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.g = onScrollListener;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final View.OnTouchListener onTouchListener) {
        Object[] objArr = {onTouchListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1222eef682ab110ec626a3956d7c4515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1222eef682ab110ec626a3956d7c4515");
        } else if (onTouchListener != null) {
            this.b.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.address.widget.stickyheaderlist.StickyHeaderListView.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                @SuppressLint({"ClickableViewAccessibility"})
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr2 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2460cd48e59e37d63cd35797ed51e2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2460cd48e59e37d63cd35797ed51e2a")).booleanValue() : onTouchListener.onTouch(StickyHeaderListView.this, motionEvent);
                }
            });
        } else {
            this.b.setOnTouchListener(null);
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        Object[] objArr = {onItemClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a2ee964beee823c3bb12d477e9167a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a2ee964beee823c3bb12d477e9167a");
        } else {
            this.b.setOnItemClickListener(onItemClickListener);
        }
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        Object[] objArr = {onItemLongClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d71b0d8010649a3168b3175456c8b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d71b0d8010649a3168b3175456c8b6");
        } else {
            this.b.setOnItemLongClickListener(onItemLongClickListener);
        }
    }

    public int getHeaderViewsCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a770b0cad045632fa52955d6069917", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a770b0cad045632fa52955d6069917")).intValue() : this.b.getHeaderViewsCount();
    }

    public int getFooterViewsCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a06338d7ec40b07e8c0ba6f7f36204", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a06338d7ec40b07e8c0ba6f7f36204")).intValue() : this.b.getFooterViewsCount();
    }

    public void setEmptyView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b28042546a7c3808638133ccdcb44f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b28042546a7c3808638133ccdcb44f");
        } else {
            this.b.setEmptyView(view);
        }
    }

    public View getEmptyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755393727270e5b638abb24e6a34e395", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755393727270e5b638abb24e6a34e395") : this.b.getEmptyView();
    }

    @Override // android.view.View
    public boolean isVerticalScrollBarEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17bf4754227c54f72b63bdc392e1f6d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17bf4754227c54f72b63bdc392e1f6d3")).booleanValue() : this.b.isVerticalScrollBarEnabled();
    }

    @Override // android.view.View
    public boolean isHorizontalScrollBarEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbae0f29e02fa0e9015e33f583cea645", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbae0f29e02fa0e9015e33f583cea645")).booleanValue() : this.b.isHorizontalScrollBarEnabled();
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9949c4d293fb03589366dc31f3aff12f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9949c4d293fb03589366dc31f3aff12f");
        } else {
            this.b.setVerticalScrollBarEnabled(z);
        }
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995700ff234e37c7b0f0c67fff955349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995700ff234e37c7b0f0c67fff955349");
        } else {
            this.b.setHorizontalScrollBarEnabled(z);
        }
    }

    @Override // android.view.View
    @TargetApi(9)
    public int getOverScrollMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff46471f6895d348c4c4a052e9add12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff46471f6895d348c4c4a052e9add12")).intValue();
        }
        if (c(9)) {
            return this.b.getOverScrollMode();
        }
        return 0;
    }

    @Override // android.view.View
    @TargetApi(9)
    public void setOverScrollMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc4b063af1ae274595b22e189ae9fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc4b063af1ae274595b22e189ae9fd5");
        } else if (!c(9) || this.b == null) {
        } else {
            this.b.setOverScrollMode(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelection(int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.address.widget.stickyheaderlist.StickyHeaderListView.setSelection(int):void");
    }

    public void setSelector(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095708da34ed1e8bb55aa20fac06e7b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095708da34ed1e8bb55aa20fac06e7b1");
        } else {
            this.b.setSelector(drawable);
        }
    }

    public void setSelector(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3b3e8bf5136eebf7d109d5851ad58a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3b3e8bf5136eebf7d109d5851ad58a");
        } else {
            this.b.setSelector(i);
        }
    }

    public int getFirstVisiblePosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e700b5606c7b10d116f5d3cbbfe29d3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e700b5606c7b10d116f5d3cbbfe29d3")).intValue() : this.b.getFirstVisiblePosition();
    }

    public int getLastVisiblePosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109d1d9e0210f0889c3edddff9daccdd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109d1d9e0210f0889c3edddff9daccdd")).intValue() : this.b.getLastVisiblePosition();
    }

    @TargetApi(11)
    public void setChoiceMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5086152cab1558e6412c0aa10d777f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5086152cab1558e6412c0aa10d777f13");
        } else {
            this.b.setChoiceMode(i);
        }
    }

    @TargetApi(11)
    public int getCheckedItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9172b798acbe7975348705e89c8056", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9172b798acbe7975348705e89c8056")).intValue();
        }
        if (c(11)) {
            return this.b.getCheckedItemCount();
        }
        return 0;
    }

    @TargetApi(8)
    public long[] getCheckedItemIds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c374bead62c63b376e559574bbb539e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c374bead62c63b376e559574bbb539e2");
        }
        if (c(8)) {
            return this.b.getCheckedItemIds();
        }
        return null;
    }

    @TargetApi(11)
    public int getCheckedItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acd0a4336e404d124a7ea0e83a6a1bde", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acd0a4336e404d124a7ea0e83a6a1bde")).intValue() : this.b.getCheckedItemPosition();
    }

    @TargetApi(11)
    public SparseBooleanArray getCheckedItemPositions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11aa5c00e7335bfebd4eaf4728711c6", RobustBitConfig.DEFAULT_VALUE) ? (SparseBooleanArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11aa5c00e7335bfebd4eaf4728711c6") : this.b.getCheckedItemPositions();
    }

    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c9657a08fe50d4a7d65d0265047f47", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c9657a08fe50d4a7d65d0265047f47")).intValue() : this.b.getCount();
    }

    @Override // android.view.View
    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        Object[] objArr = {onCreateContextMenuListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d4c134ed4b2a5ea96c3ca513c716be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d4c134ed4b2a5ea96c3ca513c716be");
        } else {
            this.b.setOnCreateContextMenuListener(onCreateContextMenuListener);
        }
    }

    @Override // android.view.View
    public boolean showContextMenu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbcc29a6a31feea4eaea9c6df322c6c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbcc29a6a31feea4eaea9c6df322c6c0")).booleanValue() : this.b.showContextMenu();
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47283500d01e9e02e9da3e8ab6a760e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47283500d01e9e02e9da3e8ab6a760e8");
            return;
        }
        if (this.b != null) {
            this.b.setClipToPadding(z);
        }
        this.j = z;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4171be9c409a2447ce3d9f393eeba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4171be9c409a2447ce3d9f393eeba4");
            return;
        }
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        if (this.b != null) {
            this.b.setPadding(i, i2, i3, i4);
        }
        super.setPadding(0, 0, 0, 0);
        requestLayout();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.m;
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return this.n;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.o;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return this.p;
    }

    public void setFastScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0841aaadbf899b74e8eae5ff974c2008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0841aaadbf899b74e8eae5ff974c2008");
        } else {
            this.b.setFastScrollEnabled(z);
        }
    }

    @TargetApi(11)
    public void setFastScrollAlwaysVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc23bb7de518a69878b32f12c6e46ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc23bb7de518a69878b32f12c6e46ed3");
        } else if (c(11)) {
            this.b.setFastScrollAlwaysVisible(z);
        }
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d7ed97f579d7485ba5b03f9601882d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d7ed97f579d7485ba5b03f9601882d");
        } else {
            this.b.setScrollBarStyle(i);
        }
    }

    @Override // android.view.View
    public int getScrollBarStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8c4dfceb20bb29c725d423391ecf7e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8c4dfceb20bb29c725d423391ecf7e")).intValue() : this.b.getScrollBarStyle();
    }

    @TargetApi(11)
    public void setMultiChoiceModeListener(AbsListView.MultiChoiceModeListener multiChoiceModeListener) {
        Object[] objArr = {multiChoiceModeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "decd1a70463d60d77b069d0e4e902fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "decd1a70463d60d77b069d0e4e902fad");
        } else if (c(11)) {
            this.b.setMultiChoiceModeListener(multiChoiceModeListener);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7736386ee5c9f06b614b461f08149b31", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7736386ee5c9f06b614b461f08149b31");
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        return onSaveInstanceState != View.BaseSavedState.EMPTY_STATE ? onSaveInstanceState : this.b.onSaveInstanceState();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b37179909ddcf776d5386178a48d0de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b37179909ddcf776d5386178a48d0de");
            return;
        }
        super.onRestoreInstanceState(View.BaseSavedState.EMPTY_STATE);
        try {
            this.b.onRestoreInstanceState(parcelable);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    @TargetApi(14)
    public boolean canScrollVertically(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbde942723e769ec11e3b4253fe5230", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbde942723e769ec11e3b4253fe5230")).booleanValue() : this.b.canScrollVertically(i);
    }

    public void setTranscriptMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200338d17534b21804651fa06c99cfd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200338d17534b21804651fa06c99cfd1");
        } else {
            this.b.setTranscriptMode(i);
        }
    }

    public void setBlockLayoutChildren(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df65ef368f58cb57cd508fc74218754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df65ef368f58cb57cd508fc74218754");
        } else {
            this.b.setBlockLayoutChildren(z);
        }
    }

    public NovaListView getListview() {
        if (this.b != null) {
            return this.b;
        }
        return null;
    }

    @Deprecated
    public boolean getAreHeadersSticky() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e72edb467001548d26e57c0a4b1eec6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e72edb467001548d26e57c0a4b1eec6")).booleanValue() : this.i;
    }
}
