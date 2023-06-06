package com.sankuai.waimai.restaurant.shopcart.widget.draglist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DragSortListView extends ListView {
    public static ChangeQuickRedirect a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private View[] F;
    private e G;
    private float H;
    private float I;
    private int J;
    private int K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private b Q;
    private d R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int aa;
    private boolean ab;
    private MotionEvent ac;
    private int ad;
    private float ae;
    private float af;
    private a ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private j ak;
    private l al;
    private k am;
    private g an;
    private float ao;
    private boolean ap;
    boolean b;
    boolean c;
    i d;
    boolean e;
    boolean f;
    private View g;
    private Point h;
    private Point i;
    private int j;
    private boolean k;
    private DataSetObserver l;
    private float m;
    private float n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private c x;
    private h y;
    private m z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        float a(float f, long j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface f extends c, h, m {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface h {
        void a_(int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface i {
        View a(int i);

        void a(View view);

        void a(View view, Point point, Point point2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface m {
    }

    public static /* synthetic */ void q(DragSortListView dragSortListView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dragSortListView, changeQuickRedirect, false, "b1f47a8df998ae710211f10688d48412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dragSortListView, changeQuickRedirect, false, "b1f47a8df998ae710211f10688d48412");
        } else {
            dragSortListView.b(dragSortListView.s - dragSortListView.getHeaderViewsCount());
        }
    }

    public DragSortListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        float f2;
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79196db8c7c9581f449de2c1c107191f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79196db8c7c9581f449de2c1c107191f");
            return;
        }
        this.h = new Point();
        this.i = new Point();
        this.k = false;
        this.m = 1.0f;
        this.n = 1.0f;
        this.r = false;
        this.b = true;
        this.A = 0;
        this.B = 1;
        this.E = 0;
        this.F = new View[1];
        this.H = 0.33333334f;
        this.I = 0.33333334f;
        this.P = 0.5f;
        this.R = new d() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.d
            public final float a(float f3, long j2) {
                Object[] objArr2 = {Float.valueOf(f3), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47606f1347cc85268b829495a1dfae7e", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47606f1347cc85268b829495a1dfae7e")).floatValue() : DragSortListView.this.P * f3;
            }
        };
        this.aa = 0;
        this.ab = false;
        this.c = false;
        this.d = null;
        this.ad = 0;
        this.ae = 0.25f;
        this.af = 0.0f;
        this.ah = false;
        this.ai = false;
        this.aj = 0;
        this.ak = new j(3);
        this.ao = 0.0f;
        this.f = false;
        this.ap = false;
        int i3 = MapConstant.ANIMATION_DURATION_SHORT;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.collapsed_height, R.attr.drag_scroll_start, R.attr.max_drag_scroll_speed, R.attr.float_background_color, R.attr.remove_mode, R.attr.track_drag_sort, R.attr.float_alpha, R.attr.slide_shuffle_speed, R.attr.remove_animation_duration, R.attr.drop_animation_duration, R.attr.drag_enabled, R.attr.sort_enabled, R.attr.remove_enabled, R.attr.drag_start_mode, R.attr.drag_handle_id, R.attr.fling_handle_id, R.attr.click_remove_id, R.attr.use_default_controller}, 0, 0);
            this.B = Math.max(1, obtainStyledAttributes.getDimensionPixelSize(0, 1));
            this.m = obtainStyledAttributes.getFloat(6, this.m);
            this.n = this.m;
            this.b = obtainStyledAttributes.getBoolean(10, this.b);
            this.ae = Math.max(0.0f, Math.min(1.0f, 1.0f - obtainStyledAttributes.getFloat(7, 0.75f)));
            this.r = this.ae > 0.0f;
            setDragScrollStart(obtainStyledAttributes.getFloat(1, this.H));
            this.P = obtainStyledAttributes.getFloat(2, this.P);
            int i4 = obtainStyledAttributes.getInt(8, MapConstant.ANIMATION_DURATION_SHORT);
            i2 = obtainStyledAttributes.getInt(9, MapConstant.ANIMATION_DURATION_SHORT);
            if (obtainStyledAttributes.getBoolean(17, true)) {
                boolean z = obtainStyledAttributes.getBoolean(12, false);
                int i5 = obtainStyledAttributes.getInt(4, 1);
                boolean z2 = obtainStyledAttributes.getBoolean(11, true);
                int i6 = obtainStyledAttributes.getInt(13, 0);
                int resourceId = obtainStyledAttributes.getResourceId(14, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(15, 0);
                int resourceId3 = obtainStyledAttributes.getResourceId(16, 0);
                int color = obtainStyledAttributes.getColor(3, 0);
                com.sankuai.waimai.restaurant.shopcart.widget.draglist.a aVar = new com.sankuai.waimai.restaurant.shopcart.widget.draglist.a(this, resourceId, i6, i5, resourceId3, resourceId2);
                aVar.e = z;
                aVar.d = z2;
                aVar.i = color;
                this.d = aVar;
                setOnTouchListener(aVar);
            }
            obtainStyledAttributes.recycle();
            i3 = i4;
        } else {
            i2 = MapConstant.ANIMATION_DURATION_SHORT;
        }
        this.G = new e();
        if (i3 > 0) {
            f2 = 0.5f;
            this.al = new l(0.5f, i3);
        } else {
            f2 = 0.5f;
        }
        if (i2 > 0) {
            this.an = new g(f2, i2);
        }
        this.ac = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        this.l = new DataSetObserver() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.2
            public static ChangeQuickRedirect a;

            private void cancel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7c290ea6aca19ea8341b24ffd48d942", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7c290ea6aca19ea8341b24ffd48d942");
                } else if (DragSortListView.this.A == 4) {
                    DragSortListView.this.a();
                }
            }

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce685fe6c9f0128cab00c8be18aab493", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce685fe6c9f0128cab00c8be18aab493");
                } else {
                    cancel();
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fa159bc0af8d366d658cc42fed97f5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fa159bc0af8d366d658cc42fed97f5a");
                } else {
                    cancel();
                }
            }
        };
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89390ae37090a60cf7e4df7df9ab9ecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89390ae37090a60cf7e4df7df9ab9ecc");
            return;
        }
        super.onScrollChanged(i2, i3, i4, i5);
        if (this.Q != null) {
            this.Q.a();
        }
    }

    public void setCustomOnScrollListener(b bVar) {
        this.Q = bVar;
    }

    public void setFloatAlpha(float f2) {
        this.n = f2;
    }

    public float getFloatAlpha() {
        return this.n;
    }

    public void setMaxScrollSpeed(float f2) {
        this.P = f2;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        Object[] objArr = {listAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f46385caed87a78233feed94971ce90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f46385caed87a78233feed94971ce90");
            return;
        }
        if (listAdapter != null) {
            this.ag = new a(listAdapter);
            listAdapter.registerDataSetObserver(this.l);
            if (listAdapter instanceof h) {
                setDropListener((h) listAdapter);
            }
            if (listAdapter instanceof c) {
                setDragListener((c) listAdapter);
            }
            if (listAdapter instanceof m) {
                setRemoveListener((m) listAdapter);
            }
        } else {
            this.ag = null;
        }
        super.setAdapter((ListAdapter) this.ag);
    }

    public ListAdapter getInputAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789a4371c7638558106a80a1809bca0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ListAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789a4371c7638558106a80a1809bca0f");
        }
        if (this.ag == null) {
            return null;
        }
        return this.ag.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        ListAdapter b;

        public a(ListAdapter listAdapter) {
            Object[] objArr = {DragSortListView.this, listAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7da0af89f83d51624583617fe40f3ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7da0af89f83d51624583617fe40f3ef");
                return;
            }
            this.b = listAdapter;
            this.b.registerDataSetObserver(new DataSetObserver() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.a.1
                public static ChangeQuickRedirect a;

                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53ed61773cbcb89c01e4acd31b26d949", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53ed61773cbcb89c01e4acd31b26d949");
                    } else {
                        a.this.notifyDataSetChanged();
                    }
                }

                @Override // android.database.DataSetObserver
                public final void onInvalidated() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc51e1051d0a42f6074de5122dcc79f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc51e1051d0a42f6074de5122dcc79f3");
                    } else {
                        a.this.notifyDataSetInvalidated();
                    }
                }
            });
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25007ce359b1484e647404c4f154c17", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25007ce359b1484e647404c4f154c17")).longValue() : this.b.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c95df1e5497b4cc88d52b6c5390058de", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c95df1e5497b4cc88d52b6c5390058de") : this.b.getItem(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5753afa210424595958860e5b50674e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5753afa210424595958860e5b50674e1")).intValue() : this.b.getCount();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53dbcb6eace3b4d078d4cc271697027", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53dbcb6eace3b4d078d4cc271697027")).booleanValue() : this.b.areAllItemsEnabled();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56345d5cf88bcbe87cfdfb170dbd7dd7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56345d5cf88bcbe87cfdfb170dbd7dd7")).booleanValue() : this.b.isEnabled(i);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f109684ac17046f413c999d6e16379bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f109684ac17046f413c999d6e16379bf")).intValue() : this.b.getItemViewType(i);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef837c42af7abe64a4099a4081e4234", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef837c42af7abe64a4099a4081e4234")).intValue() : this.b.getViewTypeCount();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9edd8b83ed070cb8cf7097ad398c8f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9edd8b83ed070cb8cf7097ad398c8f8")).booleanValue() : this.b.hasStableIds();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean isEmpty() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a56b5f144b433fc48f4424e895bb073", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a56b5f144b433fc48f4424e895bb073")).booleanValue() : this.b.isEmpty();
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            com.sankuai.waimai.restaurant.shopcart.widget.draglist.b bVar;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b166033984e06c297aab2818f14cf40", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b166033984e06c297aab2818f14cf40");
            }
            if (view != null) {
                bVar = (com.sankuai.waimai.restaurant.shopcart.widget.draglist.b) view;
                View childAt = bVar.getChildAt(0);
                View view2 = this.b.getView(i, childAt, DragSortListView.this);
                if (view2 != childAt) {
                    if (childAt != null) {
                        bVar.removeViewAt(0);
                    }
                    bVar.addView(view2);
                }
            } else {
                View view3 = this.b.getView(i, null, DragSortListView.this);
                com.sankuai.waimai.restaurant.shopcart.widget.draglist.b bVar2 = new com.sankuai.waimai.restaurant.shopcart.widget.draglist.b(DragSortListView.this.getContext());
                bVar2.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                bVar2.addView(view3);
                bVar = bVar2;
            }
            DragSortListView dragSortListView = DragSortListView.this;
            dragSortListView.a(i + dragSortListView.getHeaderViewsCount(), bVar, true);
            return bVar;
        }
    }

    private void a(int i2, Canvas canvas) {
        ViewGroup viewGroup;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i2), canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cc551b31ac6cae48b21d4dc312cbeea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cc551b31ac6cae48b21d4dc312cbeea");
            return;
        }
        Drawable divider = getDivider();
        int dividerHeight = getDividerHeight();
        if (divider == null || dividerHeight == 0 || (viewGroup = (ViewGroup) getChildAt(i2 - getFirstVisiblePosition())) == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = viewGroup.getChildAt(0).getHeight();
        if (i2 > this.s) {
            i4 = viewGroup.getTop() + height;
            i3 = dividerHeight + i4;
        } else {
            int bottom = viewGroup.getBottom() - height;
            int i5 = bottom - dividerHeight;
            i3 = bottom;
            i4 = i5;
        }
        canvas.save();
        canvas.clipRect(paddingLeft, i4, width, i3);
        divider.setBounds(paddingLeft, i4, width, i3);
        divider.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f2;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691970aed0ce2745918ab688dec6c277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691970aed0ce2745918ab688dec6c277");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.A != 0) {
            if (this.p != this.s) {
                a(this.p, canvas);
            }
            if (this.q != this.p && this.q != this.s) {
                a(this.q, canvas);
            }
        }
        if (this.g != null) {
            int width = this.g.getWidth();
            int height = this.g.getHeight();
            int i2 = this.h.x;
            int width2 = getWidth();
            if (i2 < 0) {
                i2 = -i2;
            }
            if (i2 < width2) {
                float f3 = (width2 - i2) / width2;
                f2 = f3 * f3;
            } else {
                f2 = 0.0f;
            }
            int i3 = (int) (this.n * 255.0f * f2);
            canvas.save();
            canvas.translate(this.h.x, this.h.y);
            canvas.clipRect(0, 0, width, height);
            canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i3, 31);
            this.g.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    private int a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b934cf691105f5bdd9ab098ddf31f92c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b934cf691105f5bdd9ab098ddf31f92c")).intValue();
        }
        View childAt = getChildAt(i2 - getFirstVisiblePosition());
        if (childAt != null) {
            return childAt.getHeight();
        }
        return b(i2, c(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class j {
        public static ChangeQuickRedirect a;
        private SparseIntArray c;
        private ArrayList<Integer> d;
        private int e;

        public j(int i) {
            Object[] objArr = {DragSortListView.this, 3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1324a388a0eb443a21b2e90122db1703", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1324a388a0eb443a21b2e90122db1703");
                return;
            }
            this.c = new SparseIntArray(3);
            this.d = new ArrayList<>(3);
            this.e = 3;
        }

        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d6ee5b37801ffc787bf0cd5f7c8307", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d6ee5b37801ffc787bf0cd5f7c8307");
                return;
            }
            int i3 = this.c.get(i, -1);
            if (i3 != i2) {
                if (i3 == -1) {
                    if (this.c.size() == this.e) {
                        this.c.delete(this.d.remove(0).intValue());
                    }
                } else {
                    this.d.remove(Integer.valueOf(i));
                }
                this.c.put(i, i2);
                this.d.add(Integer.valueOf(i));
            }
        }

        public final int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28526ba26d31987cf55237a41a72a8ab", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28526ba26d31987cf55237a41a72a8ab")).intValue() : this.c.get(i, -1);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc1ac2a32e2e72bcbcfc4ad42a02e0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc1ac2a32e2e72bcbcfc4ad42a02e0b");
                return;
            }
            this.c.clear();
            this.d.clear();
        }
    }

    private int a(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513589541bced09d90d96f8c7a8a7fd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513589541bced09d90d96f8c7a8a7fd5")).intValue();
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        if (i2 <= headerViewsCount || i2 >= getCount() - footerViewsCount) {
            return i3;
        }
        int dividerHeight = getDividerHeight();
        int i4 = this.C - this.B;
        int c2 = c(i2);
        int a2 = a(i2);
        if (this.q <= this.s) {
            if (i2 == this.q && this.p != this.q) {
                i3 = i2 == this.s ? (i3 + a2) - this.C : (i3 + (a2 - c2)) - i4;
            } else if (i2 > this.q && i2 <= this.s) {
                i3 -= i4;
            }
        } else if (i2 > this.s && i2 <= this.p) {
            i3 += i4;
        } else if (i2 == this.q && this.p != this.q) {
            i3 += a2 - c2;
        }
        if (i2 <= this.s) {
            return i3 + (((this.C - dividerHeight) - c(i2 - 1)) / 2);
        }
        return i3 + (((c2 - dividerHeight) - this.C) / 2);
    }

    private boolean b() {
        int i2;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccdbf737d6337f6b1963e975d2230f55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccdbf737d6337f6b1963e975d2230f55")).booleanValue();
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        int i3 = this.p;
        View childAt = getChildAt(i3 - firstVisiblePosition);
        if (childAt == null) {
            i3 = (getChildCount() / 2) + firstVisiblePosition;
            childAt = getChildAt(i3 - firstVisiblePosition);
        }
        int top = childAt.getTop();
        int height = childAt.getHeight();
        int a2 = a(i3, top);
        int dividerHeight = getDividerHeight();
        if (this.j < a2) {
            while (i3 >= 0) {
                i3--;
                int a3 = a(i3);
                if (i3 != 0) {
                    top -= a3 + dividerHeight;
                    int a4 = a(i3, top);
                    if (this.j >= a4) {
                        i2 = a4;
                        break;
                    }
                    a2 = a4;
                } else {
                    i2 = (top - dividerHeight) - a3;
                    break;
                }
            }
            i2 = a2;
        } else {
            int count = getCount();
            while (i3 < count) {
                if (i3 != count - 1) {
                    top += height + dividerHeight;
                    int i4 = i3 + 1;
                    int a5 = a(i4);
                    int a6 = a(i4, top);
                    if (this.j < a6) {
                        i2 = a6;
                        break;
                    }
                    i3 = i4;
                    height = a5;
                    a2 = a6;
                } else {
                    i2 = top + dividerHeight + height;
                    break;
                }
            }
            i2 = a2;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int i5 = this.p;
        int i6 = this.q;
        float f2 = this.af;
        if (this.r) {
            int abs = Math.abs(i2 - a2);
            if (this.j < i2) {
                int i7 = a2;
                a2 = i2;
                i2 = i7;
            }
            int i8 = (int) (this.ae * 0.5f * abs);
            float f3 = i8;
            int i9 = i2 + i8;
            int i10 = a2 - i8;
            if (this.aj > 1 && this.s == i3) {
                if (this.j < i9) {
                    this.p = i3;
                    this.q = i3 + 1;
                    this.af = ((i9 - this.j) * 0.5f) / f3;
                } else if (this.j < i10) {
                    int i11 = i3 + 1;
                    this.p = i11;
                    this.q = i11;
                } else {
                    this.p = i3 + 1;
                    this.q = i3 + 2;
                    this.af = (((a2 - this.j) / f3) + 1.0f) * 0.5f;
                }
            } else if (this.j < i9) {
                this.p = i3 - 1;
                this.q = i3;
                this.af = ((i9 - this.j) * 0.5f) / f3;
            } else if (this.j < i10) {
                this.p = i3;
                this.q = i3;
            } else {
                this.p = i3;
                this.q = i3 + 1;
                this.af = (((a2 - this.j) / f3) + 1.0f) * 0.5f;
            }
        } else {
            this.p = i3;
            this.q = i3;
        }
        if (this.p < headerViewsCount) {
            this.p = headerViewsCount;
            this.q = headerViewsCount;
            i3 = headerViewsCount;
        } else if (this.q >= getCount() - footerViewsCount) {
            i3 = (getCount() - footerViewsCount) - 1;
            this.p = i3;
            this.q = i3;
        }
        z = (this.p == i5 && this.q == i6 && this.af == f2) ? true : true;
        if (i3 != this.o) {
            if (this.x != null) {
                this.x.a(this.o - headerViewsCount, i3 - headerViewsCount);
            }
            this.o = i3;
            return true;
        }
        return z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e520bddb013f85fe0791ed7dc6e168fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e520bddb013f85fe0791ed7dc6e168fb");
        } else {
            super.onDraw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class n implements Runnable {
        public static ChangeQuickRedirect c;
        private float a;
        private float b;
        protected long d;
        private float f;
        private float g;
        private float h;
        private float i;
        private boolean j;

        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ecee4a5884e880cf0964ce7340118f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ecee4a5884e880cf0964ce7340118f");
            }
        }

        public void a(float f, float f2) {
        }

        public void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82925f57e3a80c5ffbbc671f4f5f0358", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82925f57e3a80c5ffbbc671f4f5f0358");
            }
        }

        public n(float f, int i) {
            Object[] objArr = {DragSortListView.this, Float.valueOf(f), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198276acb9bfeb2ad49800d85f677324", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198276acb9bfeb2ad49800d85f677324");
                return;
            }
            this.b = f;
            this.a = i;
            float f2 = 1.0f / ((this.b * 2.0f) * (1.0f - this.b));
            this.i = f2;
            this.f = f2;
            this.g = this.b / ((this.b - 1.0f) * 2.0f);
            this.h = 1.0f / (1.0f - this.b);
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b1bd784d594c834f4a6092941c17d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b1bd784d594c834f4a6092941c17d1");
                return;
            }
            this.d = SystemClock.uptimeMillis();
            this.j = false;
            a();
            DragSortListView.this.post(this);
        }

        public void cancel() {
            this.j = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            float f;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93b9e474016f455860ad92c222e50b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93b9e474016f455860ad92c222e50b3");
            } else if (this.j) {
            } else {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.d)) / this.a;
                if (uptimeMillis >= 1.0f) {
                    a(1.0f, 1.0f);
                    b();
                    return;
                }
                Object[] objArr2 = {Float.valueOf(uptimeMillis)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a9a207f08c2b5fd317a7ee074956cbb", RobustBitConfig.DEFAULT_VALUE)) {
                    f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a9a207f08c2b5fd317a7ee074956cbb")).floatValue();
                } else if (uptimeMillis < this.b) {
                    f = this.f * uptimeMillis * uptimeMillis;
                } else if (uptimeMillis < 1.0f - this.b) {
                    f = this.g + (this.h * uptimeMillis);
                } else {
                    float f2 = uptimeMillis - 1.0f;
                    f = 1.0f - ((this.i * f2) * f2);
                }
                a(uptimeMillis, f);
                DragSortListView.this.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class k extends n {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ DragSortListView b;
        private float f;
        private float g;

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60309a4d386f4fe65ea5ec0a21f46666", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60309a4d386f4fe65ea5ec0a21f46666");
                return;
            }
            this.f = this.b.u;
            this.g = this.b.D;
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void a(float f, float f2) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aaf930f667c2ba6eee6793eb114b78d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aaf930f667c2ba6eee6793eb114b78d");
            } else if (this.b.A == 4) {
                this.b.u = (int) ((this.g * f2) + ((1.0f - f2) * this.f));
                this.b.h.y = this.b.T - this.b.u;
                this.b.a(true);
            } else {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class g extends n {
        public static ChangeQuickRedirect a;
        private int f;
        private int g;
        private float h;
        private float i;

        public g(float f, int i) {
            super(0.5f, i);
            Object[] objArr = {DragSortListView.this, Float.valueOf(0.5f), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd7fe2b2214b141702a2330a4b0621e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd7fe2b2214b141702a2330a4b0621e");
            }
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ed3bc7fd3045694f4d0ff647f384d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ed3bc7fd3045694f4d0ff647f384d6");
                return;
            }
            this.f = DragSortListView.this.o;
            this.g = DragSortListView.this.s;
            DragSortListView.this.A = 2;
            this.h = DragSortListView.this.h.y - d();
            this.i = DragSortListView.this.h.x - DragSortListView.this.getPaddingLeft();
        }

        private int d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5fa5b37ce924dffaa15369c8bf0716", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5fa5b37ce924dffaa15369c8bf0716")).intValue();
            }
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            int dividerHeight = (DragSortListView.this.B + DragSortListView.this.getDividerHeight()) / 2;
            View childAt = DragSortListView.this.getChildAt(this.f - firstVisiblePosition);
            if (childAt != null) {
                if (this.f == this.g) {
                    return childAt.getTop();
                }
                if (this.f >= this.g) {
                    return (childAt.getBottom() + dividerHeight) - DragSortListView.this.C;
                }
                return childAt.getTop() - dividerHeight;
            }
            cancel();
            return -1;
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void a(float f, float f2) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf92a44de6b129090078e2f008366019", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf92a44de6b129090078e2f008366019");
                return;
            }
            int d = d();
            float paddingLeft = DragSortListView.this.h.x - DragSortListView.this.getPaddingLeft();
            float f3 = 1.0f - f2;
            if (f3 < Math.abs((DragSortListView.this.h.y - d) / this.h) || f3 < Math.abs(paddingLeft / this.i)) {
                DragSortListView.this.h.y = d + ((int) (this.h * f3));
                DragSortListView.this.h.x = DragSortListView.this.getPaddingLeft() + ((int) (this.i * f3));
                DragSortListView.this.a(true);
            }
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2160f47395e6e37a49118b26f0042d8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2160f47395e6e37a49118b26f0042d8a");
            } else {
                DragSortListView.this.d();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class l extends n {
        public static ChangeQuickRedirect a;
        private float f;
        private float g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        public l(float f, int i) {
            super(0.5f, i);
            Object[] objArr = {DragSortListView.this, Float.valueOf(0.5f), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58716406cfe1c652ef3c73695967c4e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58716406cfe1c652ef3c73695967c4e");
                return;
            }
            this.i = -1;
            this.j = -1;
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6542dfbf9b922b8ac03e4d7db7b805d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6542dfbf9b922b8ac03e4d7db7b805d8");
                return;
            }
            this.i = -1;
            this.j = -1;
            this.k = DragSortListView.this.p;
            this.l = DragSortListView.this.q;
            this.m = DragSortListView.this.s;
            DragSortListView.this.A = 1;
            this.f = DragSortListView.this.h.x;
            if (!DragSortListView.this.e) {
                DragSortListView.this.k();
                return;
            }
            float width = DragSortListView.this.getWidth() * 2.0f;
            if (DragSortListView.this.ao == 0.0f) {
                DragSortListView.this.ao = (this.f >= 0.0f ? 1 : -1) * width;
                return;
            }
            float f = width * 2.0f;
            if (DragSortListView.this.ao < 0.0f) {
                float f2 = -f;
                if (DragSortListView.this.ao > f2) {
                    DragSortListView.this.ao = f2;
                    return;
                }
            }
            if (DragSortListView.this.ao <= 0.0f || DragSortListView.this.ao >= f) {
                return;
            }
            DragSortListView.this.ao = f;
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void a(float f, float f2) {
            View childAt;
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e37db762615968f62e48b0bce820b06e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e37db762615968f62e48b0bce820b06e");
                return;
            }
            float f3 = 1.0f - f2;
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            View childAt2 = DragSortListView.this.getChildAt(this.k - firstVisiblePosition);
            if (DragSortListView.this.e) {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.d)) / 1000.0f;
                if (uptimeMillis == 0.0f) {
                    return;
                }
                float f4 = DragSortListView.this.ao * uptimeMillis;
                int width = DragSortListView.this.getWidth();
                float f5 = (DragSortListView.this.ao > 0.0f ? 1 : -1) * uptimeMillis;
                float f6 = width;
                DragSortListView.this.ao = DragSortListView.this.ao + (f5 * f6);
                this.f += f4;
                DragSortListView.this.h.x = (int) this.f;
                if (this.f < f6 && this.f > (-width)) {
                    this.d = SystemClock.uptimeMillis();
                    DragSortListView.this.a(true);
                    return;
                }
            }
            if (childAt2 != null) {
                if (this.i == -1) {
                    this.i = DragSortListView.this.b(this.k, childAt2, false);
                    this.g = childAt2.getHeight() - this.i;
                }
                int max = Math.max((int) (this.g * f3), 1);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                layoutParams.height = this.i + max;
                childAt2.setLayoutParams(layoutParams);
            }
            if (this.l == this.k || (childAt = DragSortListView.this.getChildAt(this.l - firstVisiblePosition)) == null) {
                return;
            }
            if (this.j == -1) {
                this.j = DragSortListView.this.b(this.l, childAt, false);
                this.h = childAt.getHeight() - this.j;
            }
            int max2 = Math.max((int) (f3 * this.h), 1);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            layoutParams2.height = this.j + max2;
            childAt.setLayoutParams(layoutParams2);
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.n
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217cf6e311339660faf1f85f11b6d51f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217cf6e311339660faf1f85f11b6d51f");
            } else {
                DragSortListView.q(DragSortListView.this);
            }
        }
    }

    public final void a(int i2, float f2) {
        Object[] objArr = {Integer.valueOf(i2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb02b12f45e0f9697b82ce3af759c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb02b12f45e0f9697b82ce3af759c90");
        } else if (this.A == 0 || this.A == 4) {
            if (this.A == 0) {
                this.s = getHeaderViewsCount() + i2;
                this.p = this.s;
                this.q = this.s;
                this.o = this.s;
                View childAt = getChildAt(this.s - getFirstVisiblePosition());
                if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
            this.A = 1;
            this.ao = f2;
            if (this.c) {
                switch (this.ad) {
                    case 1:
                        super.onTouchEvent(this.ac);
                        break;
                    case 2:
                        super.onInterceptTouchEvent(this.ac);
                        break;
                }
            }
            if (this.al != null) {
                this.al.c();
            } else {
                b(i2);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7468e2b5b2e3c5b75bb36a0498b0148a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7468e2b5b2e3c5b75bb36a0498b0148a");
        } else if (this.A == 4) {
            this.G.a(true);
            c();
            h();
            k();
            if (this.c) {
                this.A = 3;
            } else {
                this.A = 0;
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47037bc08e635e826e1a1dbdb98cb854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47037bc08e635e826e1a1dbdb98cb854");
            return;
        }
        this.s = -1;
        this.p = -1;
        this.q = -1;
        this.o = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf352ce35a8092302def4207e9f80e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf352ce35a8092302def4207e9f80e7");
            return;
        }
        this.A = 2;
        if (this.y != null && this.o >= 0 && this.o < getCount()) {
            int headerViewsCount = getHeaderViewsCount();
            this.y.a_(this.s - headerViewsCount, this.o - headerViewsCount);
        }
        e();
        c();
        h();
        k();
        if (this.c) {
            this.A = 3;
        } else {
            this.A = 0;
        }
    }

    private void b(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63a4a0a987b36df0976672e5721fb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63a4a0a987b36df0976672e5721fb7c");
            return;
        }
        this.A = 1;
        e();
        c();
        k();
        if (this.c) {
            this.A = 3;
        } else {
            this.A = 0;
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8707b4e35469cadadcb6ad823feaeea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8707b4e35469cadadcb6ad823feaeea");
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.s < firstVisiblePosition) {
            View childAt = getChildAt(0);
            setSelectionFromTop(firstVisiblePosition - 1, (childAt != null ? childAt.getTop() : 0) - getPaddingTop());
        }
    }

    public final boolean a(boolean z, float f2) {
        Object[] objArr = {(byte) 1, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f2dc082efd04e0857b6ab3056be10b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f2dc082efd04e0857b6ab3056be10b")).booleanValue();
        }
        this.e = true;
        return b(true, f2);
    }

    private boolean b(boolean z, float f2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3007168573b110e4a75e98cbb43f7788", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3007168573b110e4a75e98cbb43f7788")).booleanValue();
        }
        if (this.g != null) {
            this.G.a(true);
            if (z) {
                a(this.s - getHeaderViewsCount(), f2);
            } else if (this.an != null) {
                this.an.c();
            } else {
                d();
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.AbsListView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353ff47cda9867fa996a9279386fc95d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353ff47cda9867fa996a9279386fc95d")).booleanValue();
        }
        if (this.ai) {
            this.ai = false;
            return false;
        } else if (!this.b) {
            return super.onTouchEvent(motionEvent);
        } else {
            boolean z2 = this.ab;
            this.ab = false;
            if (!z2) {
                a(motionEvent);
            }
            if (this.A != 4) {
                if (this.A == 0 && super.onTouchEvent(motionEvent)) {
                    z = true;
                }
                int action = motionEvent.getAction() & 255;
                if (action == 1 || action == 3) {
                    f();
                } else if (z) {
                    this.ad = 1;
                }
                return z;
            }
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff6683c26404c1d032bba25860c69425", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff6683c26404c1d032bba25860c69425")).booleanValue();
                return true;
            }
            switch (motionEvent.getAction() & 255) {
                case 1:
                    if (this.A == 4) {
                        Object[] objArr3 = {(byte) 0};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e9fc66d54ec67fa0f82604306f06849", RobustBitConfig.DEFAULT_VALUE)) {
                            ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e9fc66d54ec67fa0f82604306f06849")).booleanValue();
                        } else {
                            this.e = false;
                            b(false, 0.0f);
                        }
                    }
                    f();
                    return true;
                case 2:
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    Object[] objArr4 = {Integer.valueOf(x), Integer.valueOf(y)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d068269be9a7d63b4006e50c6387c3c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d068269be9a7d63b4006e50c6387c3c8");
                        return true;
                    }
                    this.h.x = x - this.t;
                    this.h.y = y - this.u;
                    a(true);
                    int min = Math.min(y, this.j + this.D);
                    int max = Math.max(y, this.j - this.D);
                    e eVar = this.G;
                    int i2 = eVar.c ? eVar.b : -1;
                    if (min > this.V && min > this.K && i2 != 1) {
                        if (i2 != -1) {
                            this.G.a(true);
                        }
                        this.G.a(1);
                        return true;
                    } else if (max < this.V && max < this.J && i2 != 0) {
                        if (i2 != -1) {
                            this.G.a(true);
                        }
                        this.G.a(0);
                        return true;
                    } else if (max < this.J || min > this.K || !this.G.c) {
                        return true;
                    } else {
                        this.G.a(true);
                        return true;
                    }
                case 3:
                    if (this.A == 4) {
                        a();
                    }
                    f();
                    return true;
                default:
                    return true;
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "665e51f7cf30402e03e1074438b24277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "665e51f7cf30402e03e1074438b24277");
            return;
        }
        this.ad = 0;
        this.c = false;
        if (this.A == 3) {
            this.A = 0;
        }
        this.n = this.m;
        this.f = false;
        this.ak.a();
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d140d498998badc123d7423b149974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d140d498998badc123d7423b149974");
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.U = this.S;
            this.V = this.T;
        }
        this.S = (int) motionEvent.getX();
        this.T = (int) motionEvent.getY();
        if (action == 0) {
            this.U = this.S;
            this.V = this.T;
        }
        this.v = ((int) motionEvent.getRawX()) - this.S;
        this.w = ((int) motionEvent.getRawY()) - this.T;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eceaa3de4ae9f9855405378d7bd1cc30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eceaa3de4ae9f9855405378d7bd1cc30")).booleanValue();
        }
        if (!this.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        a(motionEvent);
        this.ab = true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.A != 0) {
                this.ai = true;
                return true;
            }
            this.c = true;
        }
        if (this.g != null) {
            z = true;
        } else {
            if (super.onInterceptTouchEvent(motionEvent)) {
                this.f = true;
                z = true;
            } else {
                z = false;
            }
            if (action == 1 || action == 3) {
                f();
            } else if (z) {
                this.ad = 1;
            } else {
                this.ad = 2;
            }
        }
        if (action == 1 || action == 3) {
            this.c = false;
        }
        return z;
    }

    public void setDragScrollStart(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b63a4ae400a0d3c86d10425d1696b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b63a4ae400a0d3c86d10425d1696b9f");
            return;
        }
        Object[] objArr2 = {Float.valueOf(f2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6c5ad4069f71a6d2f5f1d8e122c98c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6c5ad4069f71a6d2f5f1d8e122c98c2");
            return;
        }
        int i2 = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
        if (i2 > 0) {
            this.I = 0.5f;
        } else {
            this.I = f2;
        }
        if (i2 > 0) {
            this.H = 0.5f;
        } else {
            this.H = f2;
        }
        if (getHeight() != 0) {
            g();
        }
    }

    private void g() {
        int height;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49201fbdb6b3c82e0c79d49dd72036f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49201fbdb6b3c82e0c79d49dd72036f5");
            return;
        }
        int paddingTop = getPaddingTop();
        float height2 = (getHeight() - paddingTop) - getPaddingBottom();
        float f2 = paddingTop;
        this.M = (this.H * height2) + f2;
        this.L = ((1.0f - this.I) * height2) + f2;
        this.J = (int) this.M;
        this.K = (int) this.L;
        this.N = this.M - f2;
        this.O = (paddingTop + height) - this.L;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d49bab764edfe9d248f7124db34e435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d49bab764edfe9d248f7124db34e435");
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        g();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47e4f1dfd88f2f33034c236bfc22f70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47e4f1dfd88f2f33034c236bfc22f70");
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int min = Math.min(lastVisiblePosition - firstVisiblePosition, ((getCount() - 1) - getFooterViewsCount()) - firstVisiblePosition);
        for (int max = Math.max(0, getHeaderViewsCount() - firstVisiblePosition); max <= min; max++) {
            View childAt = getChildAt(max);
            if (childAt != null) {
                a(firstVisiblePosition + max, childAt, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, View view, boolean z) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i2), view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983efd750884dcb47d29c636a8e7204d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983efd750884dcb47d29c636a8e7204d");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a2 = r.a(((TextView) view.findViewById(R.id.txt_foodCount_number)).getText().toString(), 0);
        int i4 = -2;
        if ((i2 == this.s || i2 == this.p || i2 == this.q) && (i2 != this.s || a2 <= 1)) {
            i4 = c(i2, view, z);
        }
        if (i4 != layoutParams.height) {
            layoutParams.height = i4;
            view.setLayoutParams(layoutParams);
        }
        if (i2 == this.p || i2 == this.q) {
            if (i2 < this.s) {
                ((com.sankuai.waimai.restaurant.shopcart.widget.draglist.b) view).setGravity(80);
            } else if (i2 > this.s) {
                ((com.sankuai.waimai.restaurant.shopcart.widget.draglist.b) view).setGravity(48);
            }
        }
        int visibility = view.getVisibility();
        if (i2 == this.s && this.g != null && a2 == 1) {
            i3 = 4;
        }
        if (i3 != visibility) {
            view.setVisibility(i3);
        }
    }

    private int c(int i2) {
        View view;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7390481dfc5b194242a7080ba8116eb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7390481dfc5b194242a7080ba8116eb1")).intValue();
        }
        View childAt = getChildAt(i2 - getFirstVisiblePosition());
        if (childAt != null) {
            int a2 = r.a(((TextView) childAt.findViewById(R.id.txt_foodCount_number)).getText().toString(), 0);
            if (i2 != this.s || a2 > 1) {
                return b(i2, childAt, false);
            }
            return 0;
        }
        int a3 = this.ak.a(i2);
        if (a3 != -1) {
            return a3;
        }
        ListAdapter adapter = getAdapter();
        int itemViewType = adapter.getItemViewType(i2);
        int viewTypeCount = adapter.getViewTypeCount();
        if (viewTypeCount != this.F.length) {
            this.F = new View[viewTypeCount];
        }
        if (itemViewType >= 0) {
            if (this.F[itemViewType] == null) {
                view = adapter.getView(i2, null, this);
                this.F[itemViewType] = view;
            } else {
                view = adapter.getView(i2, this.F[itemViewType], this);
            }
        } else {
            view = adapter.getView(i2, null, this);
        }
        int b2 = b(i2, view, true);
        this.ak.a(i2, b2);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i2, View view, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa4e53e7029c040c52f6e1cdca8d86e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa4e53e7029c040c52f6e1cdca8d86e")).intValue();
        }
        int a2 = r.a(((TextView) view.findViewById(R.id.txt_foodCount_number)).getText().toString(), 0);
        if (i2 != this.s || a2 > 1) {
            if (i2 >= getHeaderViewsCount() && i2 < getCount() - getFooterViewsCount()) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height > 0) {
                return layoutParams.height;
            }
            int height = view.getHeight();
            if (height == 0 || z) {
                a(view);
                return view.getMeasuredHeight();
            }
            return height;
        }
        return 0;
    }

    private int c(int i2, View view, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146f8ed26df4cdb204783d5be7166139", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146f8ed26df4cdb204783d5be7166139")).intValue() : b(i2, b(i2, view, z));
    }

    private int b(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d74d0707f1e7b3904d56589af45a98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d74d0707f1e7b3904d56589af45a98")).intValue();
        }
        boolean z = this.r && this.p != this.q;
        int i4 = this.C - this.B;
        int i5 = (int) (this.af * i4);
        if (i2 == this.s && this.aj <= 1) {
            com.sankuai.waimai.foundation.utils.log.a.b("calc", "1", new Object[0]);
            if (this.s == this.p) {
                com.sankuai.waimai.foundation.utils.log.a.b("calc", "11", new Object[0]);
                if (z) {
                    com.sankuai.waimai.foundation.utils.log.a.b("calc", "111", new Object[0]);
                    i3 = i5 + this.B;
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("calc", "112", new Object[0]);
                    i3 = this.C;
                }
            } else if (this.s == this.q) {
                com.sankuai.waimai.foundation.utils.log.a.b("calc", "12", new Object[0]);
                i3 = this.C - i5;
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("calc", "13", new Object[0]);
                i3 = this.B;
            }
        } else if (i2 == this.p) {
            com.sankuai.waimai.foundation.utils.log.a.b("calc", "3", new Object[0]);
            if (z) {
                com.sankuai.waimai.foundation.utils.log.a.b("calc", "31", new Object[0]);
                i3 += i5;
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("calc", "32", new Object[0]);
                i3 += i4;
            }
        } else if (i2 == this.q) {
            com.sankuai.waimai.foundation.utils.log.a.b("calc", "4", new Object[0]);
            i3 = (i3 + i4) - i5;
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("calc", "5", new Object[0]);
        }
        com.sankuai.waimai.foundation.utils.log.a.b("drag", "child height: " + i3, new Object[0]);
        return i3;
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8056f494d23053401441049ff7e892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8056f494d23053401441049ff7e892");
        } else if (this.ah) {
        } else {
            super.requestLayout();
        }
    }

    private int a(int i2, View view, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Object[] objArr = {Integer.valueOf(i2), view, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8bb66c0460636f9a897614d574bca4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8bb66c0460636f9a897614d574bca4")).intValue();
        }
        int c2 = c(i2);
        int height = view.getHeight();
        int b2 = b(i2, c2);
        com.sankuai.waimai.foundation.utils.log.a.b("drag", "height before: " + height + "   after: " + b2, new Object[0]);
        if (i2 != this.s) {
            i5 = height - c2;
            i6 = b2 - c2;
        } else {
            i5 = height;
            i6 = b2;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("drag", "mSrcPos: " + this.s + "  mFirstExpPos: " + this.p + "  mSecondExpPos: " + this.q + "  movePos: " + i2, new Object[0]);
        int i8 = this.C;
        if (this.s != this.p && this.s != this.q) {
            i8 -= this.B;
        }
        if (i2 <= i3) {
            if (i2 > this.p) {
                i7 = (i8 - i6) + 0;
            }
            i7 = 0;
        } else if (i2 == i4) {
            if (i2 <= this.p) {
                i7 = (i5 - i8) + 0;
            } else {
                i7 = i2 == this.q ? (height - b2) + 0 : i5 + 0;
            }
        } else if (i2 <= this.p) {
            i7 = 0 - i8;
        } else {
            if (i2 == this.q) {
                i7 = 0 - i6;
            }
            i7 = 0;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("drag", "scroll: " + i7, new Object[0]);
        return i7;
    }

    private void a(View view) {
        int makeMeasureSpec;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fac0e540fb4b5d868164798a8c282df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fac0e540fb4b5d868164798a8c282df");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(layoutParams);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.E, getListPaddingLeft() + getListPaddingRight(), layoutParams.width);
        if (layoutParams.height > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac5640c280c6a47d2d528b1e65ce5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac5640c280c6a47d2d528b1e65ce5c5");
        } else if (this.g != null) {
            a(this.g);
            this.C = this.g.getMeasuredHeight();
            this.D = this.C / 2;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e7219ed3dbf1fe788c6909eec216c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e7219ed3dbf1fe788c6909eec216c2");
            return;
        }
        super.onMeasure(i2, i3);
        if (this.g != null) {
            if (this.g.isLayoutRequested()) {
                i();
            }
            this.k = true;
        }
        this.E = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(this.E, Math.min(getMeasuredHeight(), (int) (getResources().getDisplayMetrics().heightPixels * 0.65d)) | Integer.MIN_VALUE);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8742b53a7dffc7febd86b3b3d666f69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8742b53a7dffc7febd86b3b3d666f69c");
            return;
        }
        try {
            super.layoutChildren();
            if (this.g != null) {
                if (this.g.isLayoutRequested() && !this.k) {
                    i();
                }
                this.g.layout(0, 0, this.g.getMeasuredWidth(), this.g.getMeasuredHeight());
                this.k = false;
            }
        } catch (Exception unused) {
        }
    }

    public final boolean a(int i2, View view, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), view, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b1da6fb11617eb2c9ba87f885f8320", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b1da6fb11617eb2c9ba87f885f8320")).booleanValue();
        }
        if (this.A == 0 && this.c && this.g == null && view != null && this.b) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            int headerViewsCount = i2 + getHeaderViewsCount();
            this.p = headerViewsCount;
            this.q = headerViewsCount;
            this.s = headerViewsCount;
            this.o = headerViewsCount;
            View childAt = getChildAt(i2 - getFirstVisiblePosition());
            if (childAt != null) {
                this.aj = r.a(((TextView) childAt.findViewById(R.id.txt_foodCount_number)).getText().toString(), 0);
            }
            this.A = 4;
            this.aa = 0;
            this.aa |= i3;
            this.g = view;
            i();
            this.t = i4;
            this.u = i5;
            this.W = this.T;
            this.h.x = this.S - this.t;
            this.h.y = this.T - this.u;
            switch (this.ad) {
                case 1:
                    super.onTouchEvent(this.ac);
                    break;
                case 2:
                    super.onInterceptTouchEvent(this.ac);
                    break;
            }
            requestLayout();
            if (this.am != null) {
                this.am.c();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b57fa90287502cfddb87528a9357690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b57fa90287502cfddb87528a9357690");
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition() + (getChildCount() / 2);
        View childAt = getChildAt(getChildCount() / 2);
        if (childAt == null) {
            return;
        }
        d(firstVisiblePosition, childAt, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2, View view, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67db9dddcf092a4fd12dc88dd5a25d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67db9dddcf092a4fd12dc88dd5a25d76");
            return;
        }
        this.ah = true;
        j();
        int i3 = this.p;
        int i4 = this.q;
        boolean b2 = b();
        if (b2) {
            h();
            a(i2, view, i3, i4);
            layoutChildren();
        }
        if (b2 || z) {
            invalidate();
        }
        this.ah = false;
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c579545c43612aa81750ae86b05c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c579545c43612aa81750ae86b05c34");
            return;
        }
        if (this.d != null) {
            this.i.set(this.S, this.T);
            this.d.a(this.g, this.h, this.i);
        }
        int i2 = this.h.x;
        int i3 = this.h.y;
        int paddingLeft = getPaddingLeft();
        if ((this.aa & 1) == 0 && i2 > paddingLeft) {
            this.h.x = paddingLeft;
        } else if ((this.aa & 2) == 0 && i2 < paddingLeft) {
            this.h.x = paddingLeft;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int paddingTop = getPaddingTop();
        if (firstVisiblePosition < headerViewsCount) {
            paddingTop = getChildAt((headerViewsCount - firstVisiblePosition) - 1).getBottom();
        }
        if ((this.aa & 8) == 0 && firstVisiblePosition <= this.s) {
            paddingTop = Math.max(getChildAt(this.s - firstVisiblePosition).getTop(), paddingTop);
        }
        int height = getHeight() - getPaddingBottom();
        if (lastVisiblePosition >= (getCount() - footerViewsCount) - 1 && getChildAt(((getCount() - footerViewsCount) - 1) - firstVisiblePosition) != null) {
            height = getChildAt(((getCount() - footerViewsCount) - 1) - firstVisiblePosition).getBottom();
        }
        if ((this.aa & 4) == 0 && lastVisiblePosition >= this.s) {
            height = Math.min(getChildAt(this.s - firstVisiblePosition).getBottom(), height);
        }
        if (i3 < paddingTop) {
            this.h.y = paddingTop;
        } else if (i3 + this.C > height) {
            this.h.y = height - this.C;
        }
        this.j = this.h.y + this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb41ff02d992464f87716f3fe7e69968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb41ff02d992464f87716f3fe7e69968");
        } else if (this.g != null) {
            this.g.setVisibility(8);
            if (this.d != null) {
                this.d.a(this.g);
            }
            this.g = null;
            invalidate();
        }
    }

    public void setFloatViewManager(i iVar) {
        this.d = iVar;
    }

    public void setDragListener(c cVar) {
        this.x = cVar;
    }

    public void setDragEnabled(boolean z) {
        this.b = z;
    }

    public void setDropListener(h hVar) {
        this.y = hVar;
    }

    public void setRemoveListener(m mVar) {
        this.z = mVar;
    }

    public void setDragSortListener(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c578b96c164e8254419356d114b3081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c578b96c164e8254419356d114b3081");
            return;
        }
        setDropListener(fVar);
        setDragListener(fVar);
        setRemoveListener(fVar);
    }

    public void setDragScrollProfile(d dVar) {
        if (dVar != null) {
            this.R = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class e implements Runnable {
        public static ChangeQuickRedirect a;
        int b;
        boolean c;
        private boolean e;
        private long f;
        private long g;
        private int h;
        private float i;
        private long j;
        private float k;

        public e() {
            Object[] objArr = {DragSortListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "518dbf9e881ddd8f43e5953d9d441eef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "518dbf9e881ddd8f43e5953d9d441eef");
            } else {
                this.c = false;
            }
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233ea39520afe99ae68e95fb9eab24d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233ea39520afe99ae68e95fb9eab24d4");
            } else if (this.c) {
            } else {
                this.e = false;
                this.c = true;
                this.j = SystemClock.uptimeMillis();
                this.f = this.j;
                this.b = i;
                DragSortListView.this.post(this);
            }
        }

        public final void a(boolean z) {
            Object[] objArr = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2156d3112b216e53fb5bc9b376fd9a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2156d3112b216e53fb5bc9b376fd9a4");
                return;
            }
            DragSortListView.this.removeCallbacks(this);
            this.c = false;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f40c12954b482be22b28c52f44350d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f40c12954b482be22b28c52f44350d9");
            } else if (this.e) {
                this.c = false;
            } else {
                int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
                int lastVisiblePosition = DragSortListView.this.getLastVisiblePosition();
                int count = DragSortListView.this.getCount();
                int paddingTop = DragSortListView.this.getPaddingTop();
                int height = (DragSortListView.this.getHeight() - paddingTop) - DragSortListView.this.getPaddingBottom();
                int min = Math.min(DragSortListView.this.T, DragSortListView.this.j + DragSortListView.this.D);
                int max = Math.max(DragSortListView.this.T, DragSortListView.this.j - DragSortListView.this.D);
                if (this.b == 0) {
                    View childAt = DragSortListView.this.getChildAt(0);
                    if (childAt == null) {
                        this.c = false;
                        return;
                    } else if (firstVisiblePosition == 0 && childAt.getTop() == paddingTop) {
                        this.c = false;
                        return;
                    } else {
                        this.k = DragSortListView.this.R.a((DragSortListView.this.M - max) / DragSortListView.this.N, this.f);
                    }
                } else {
                    View childAt2 = DragSortListView.this.getChildAt(lastVisiblePosition - firstVisiblePosition);
                    if (childAt2 == null) {
                        this.c = false;
                        return;
                    } else if (lastVisiblePosition == count - 1 && childAt2.getBottom() <= height + paddingTop) {
                        this.c = false;
                        return;
                    } else {
                        this.k = -DragSortListView.this.R.a((min - DragSortListView.this.L) / DragSortListView.this.O, this.f);
                    }
                }
                this.g = SystemClock.uptimeMillis();
                this.i = (float) (this.g - this.f);
                this.h = Math.round(this.k * this.i);
                if (this.h >= 0) {
                    this.h = Math.min(height, this.h);
                    lastVisiblePosition = firstVisiblePosition;
                } else {
                    this.h = Math.max(-height, this.h);
                }
                View childAt3 = DragSortListView.this.getChildAt(lastVisiblePosition - firstVisiblePosition);
                int top = childAt3.getTop() + this.h;
                if (lastVisiblePosition == 0 && top > paddingTop) {
                    top = paddingTop;
                }
                DragSortListView.this.ah = true;
                DragSortListView.this.setSelectionFromTop(lastVisiblePosition, top - paddingTop);
                DragSortListView.this.layoutChildren();
                DragSortListView.this.invalidate();
                DragSortListView.this.ah = false;
                DragSortListView.this.d(lastVisiblePosition, childAt3, false);
                this.f = this.g;
                DragSortListView.this.post(this);
            }
        }
    }
}
