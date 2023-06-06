package com.sankuai.waimai.store.poi.list.newp.home.view;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.AnimatableImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RefreshLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private View b;
    private View c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private MotionEvent r;
    private boolean s;
    private a t;
    private c u;
    private b v;
    private boolean w;
    private AnimatableImageView x;
    private Runnable y;
    private Runnable z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ boolean a(RefreshLayout refreshLayout, boolean z) {
        refreshLayout.w = true;
        return true;
    }

    public static /* synthetic */ void b(RefreshLayout refreshLayout, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshLayout, changeQuickRedirect, false, "22ea07e9f6a4eaa23619ff3d6e2f00b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshLayout, changeQuickRedirect, false, "22ea07e9f6a4eaa23619ff3d6e2f00b7");
        } else if (!refreshLayout.w || z) {
        } else {
            refreshLayout.w = false;
            refreshLayout.a(c.LOADING);
            if (refreshLayout.v != null) {
                refreshLayout.v.a();
            }
            refreshLayout.c();
        }
    }

    public RefreshLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50e30be81876ebc6f300c2a583f86c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50e30be81876ebc6f300c2a583f86c9");
        }
    }

    public RefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ceb85a7a1df14c50995f22245ea8338", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ceb85a7a1df14c50995f22245ea8338");
            return;
        }
        this.u = c.RESET;
        this.y = new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.home.view.RefreshLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "370767f7fc8f6cd8c08324bac26a3db7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "370767f7fc8f6cd8c08324bac26a3db7");
                } else {
                    RefreshLayout.this.t.a(0, 800);
                }
            }
        };
        this.z = new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.home.view.RefreshLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "263072d0a74a479e6c832644710bc007", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "263072d0a74a479e6c832644710bc007");
                    return;
                }
                RefreshLayout.a(RefreshLayout.this, true);
                RefreshLayout.this.a(c.PULL);
                RefreshLayout.this.t.a(RefreshLayout.this.i, CustomizedScrollView.ANIMATED_SCROLL_GAP);
            }
        };
        this.g = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.t = new a();
        u.b(this, 0, 0, 0, 0);
        this.x = (AnimatableImageView) LayoutInflater.from(context).inflate(R.layout.wm_sg_common_ptr_layout_header, (ViewGroup) null).findViewById(R.id.refresh_img);
        this.x.setImageResource(R.drawable.wm_sc_refreshing_header_animation);
        setRefreshHeader(this.x);
        com.sankuai.waimai.imbase.log.a.a(true);
    }

    public void setRefreshHeader(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0371ec672ba8a121ca259644605fab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0371ec672ba8a121ca259644605fab5");
        } else if (view == null || view == this.b) {
        } else {
            removeView(this.b);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, h.a(getContext(), 80.0f)));
            }
            this.b = view;
            addView(this.b);
        }
    }

    public void setRefreshListener(b bVar) {
        this.v = bVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854d6c12972b9962264ebdd733c4fcbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854d6c12972b9962264ebdd733c4fcbe");
            return;
        }
        a(c.COMPLETE);
        if (this.d == 0) {
            a(c.RESET);
        } else if (this.l) {
        } else {
            postDelayed(this.y, 500L);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6899340e9b65ff2f84fb54815fae51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6899340e9b65ff2f84fb54815fae51");
            return;
        }
        super.onMeasure(i, i2);
        if (this.c == null) {
            b();
        }
        if (this.c == null) {
            return;
        }
        this.c.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        measureChild(this.b, i, i2);
        if (this.f) {
            return;
        }
        this.f = true;
        this.h = this.b.getMeasuredHeight();
        this.i = this.h;
        if (this.j == 0) {
            this.j = (this.i * 4) / 5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a883b2badaa71d65b6cb311f004c80e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a883b2badaa71d65b6cb311f004c80e");
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.c == null) {
            b();
        }
        if (this.c == null) {
            return;
        }
        View view = this.c;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop() + this.d;
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int i5 = measuredWidth / 2;
        int measuredWidth2 = this.b.getMeasuredWidth() / 2;
        this.b.layout(i5 - measuredWidth2, (-this.h) + this.d, i5 + measuredWidth2, this.d);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8375ed7b0ea29a92b4f6a3c17028e04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8375ed7b0ea29a92b4f6a3c17028e04a");
        } else if (this.c == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.b)) {
                    this.c = childAt;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a9, code lost:
        if (r0.getChildAt(0).getTop() < r0.getPaddingTop()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bc, code lost:
        if (r18.c.getScrollY() <= 0) goto L66;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.newp.home.view.RefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d2e4c9f8b8f696c9619514600d737b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d2e4c9f8b8f696c9619514600d737b")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74493d1f6fec508cd53061fc8fcd9b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74493d1f6fec508cd53061fc8fcd9b5")).booleanValue();
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        float max;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "612c81454930d0f0cdda46d5698a2e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "612c81454930d0f0cdda46d5698a2e09");
            return;
        }
        int round = Math.round(f);
        if (round == 0) {
            return;
        }
        if (!this.m && this.l && this.d > 0) {
            d();
            this.m = true;
        }
        int max2 = Math.max(0, this.d + round);
        float f2 = this.i;
        float max3 = (float) (Math.max(0.0f, Math.min(max2 - this.i, f2 * 2.0f) / f2) - Math.pow(max / 2.0f, 2.0d));
        if (round > 0) {
            round = (int) (round * (1.0f - max3));
            max2 = Math.max(0, this.d + round);
        }
        if (this.u == c.RESET && this.d == 0 && max2 > 0) {
            a(c.PULL);
        }
        if (this.d > 0 && max2 <= 0 && (this.u == c.PULL || this.u == c.COMPLETE)) {
            a(c.RESET);
        }
        if (this.u == c.PULL && !this.l && this.d > this.i && max2 <= this.i) {
            this.t.a();
            a(c.LOADING);
            if (this.v != null) {
                this.v.a();
            }
            round += this.i - max2;
        }
        setTargetOffsetTopAndBottom(round);
        a(round, this.h);
        if (this.b instanceof com.sankuai.waimai.store.poi.list.newp.home.view.a) {
            a(round, this.h);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47bf08412d87bbd031bec34d5dfba2fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47bf08412d87bbd031bec34d5dfba2fa");
        } else if (this.u == c.LOADING) {
            if (this.d > this.i) {
                this.t.a(this.i, CustomizedScrollView.ANIMATED_SCROLL_GAP);
            }
        } else {
            this.t.a(0, 800);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9c5b2b79b5db8689c0d2da76060eb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9c5b2b79b5db8689c0d2da76060eb6");
            return;
        }
        this.u = cVar;
        if ((this.b instanceof com.sankuai.waimai.store.poi.list.newp.home.view.a ? (com.sankuai.waimai.store.poi.list.newp.home.view.a) this.b : null) != null) {
            int[] iArr = AnonymousClass3.a;
            cVar.ordinal();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.home.view.RefreshLayout$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a = new int[c.valuesCustom().length];

        static {
            try {
                a[c.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f718da52087c94e309190b90625242c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f718da52087c94e309190b90625242c3");
            return;
        }
        float a2 = (this.u == c.PULL || this.u == c.LOADING) ? n.a(this.c.getTop(), 0, i2) / 2.0f : 0.5f;
        this.x.setPivotX(this.x.getWidth() / 2);
        this.x.setPivotY(this.x.getHeight() / 2);
        this.x.setScaleX(a2);
        this.x.setScaleY(a2);
    }

    private void setTargetOffsetTopAndBottom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca29336c5645d93480de8f0e2b02fead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca29336c5645d93480de8f0e2b02fead");
        } else if (i == 0) {
        } else {
            this.c.offsetTopAndBottom(i);
            this.b.offsetTopAndBottom(i);
            this.e = this.d;
            this.d = this.c.getTop();
            invalidate();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deda5a58d1ae5a039c5e359fbc895e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deda5a58d1ae5a039c5e359fbc895e7a");
        } else if (this.r == null) {
        } else {
            MotionEvent obtain = MotionEvent.obtain(this.r);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private Scroller c;
        private int d;

        public a() {
            Object[] objArr = {RefreshLayout.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d447b4de62c81fa20838d139eaff44ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d447b4de62c81fa20838d139eaff44ad");
            } else {
                this.c = new Scroller(RefreshLayout.this.getContext());
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05db909c70a54789da2573814581f018", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05db909c70a54789da2573814581f018");
                return;
            }
            if (!(!this.c.computeScrollOffset() || this.c.isFinished())) {
                int currY = this.c.getCurrY();
                int i = currY - this.d;
                this.d = currY;
                RefreshLayout.this.a(i);
                RefreshLayout.this.post(this);
                RefreshLayout.b(RefreshLayout.this, false);
                return;
            }
            a();
            RefreshLayout.b(RefreshLayout.this, true);
        }

        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7aecfcd4221c40d2ea011b04c95dd10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7aecfcd4221c40d2ea011b04c95dd10");
                return;
            }
            int i3 = i - RefreshLayout.this.d;
            a();
            if (i3 == 0) {
                return;
            }
            this.c.startScroll(0, 0, 0, i3, i2);
            RefreshLayout.this.post(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af84caaf2d604a574df2e1c22bcace18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af84caaf2d604a574df2e1c22bcace18");
                return;
            }
            RefreshLayout.this.removeCallbacks(this);
            if (!this.c.isFinished()) {
                this.c.forceFinished(true);
            }
            this.d = 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum c {
        RESET,
        PULL,
        LOADING,
        COMPLETE;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534d7867a5bafcc582df248bd0f9e8bb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534d7867a5bafcc582df248bd0f9e8bb");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dde6666c0d16732f560d687e8cd950b", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dde6666c0d16732f560d687e8cd950b") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fb970e5d200a4062743dcde7e72ba0e", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fb970e5d200a4062743dcde7e72ba0e") : (c[]) values().clone();
        }
    }
}
