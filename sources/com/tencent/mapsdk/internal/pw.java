package com.tencent.mapsdk.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.em;
import com.tencent.mapsdk.internal.px;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pw extends ek implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, px.a {
    private static final String l = "VIEW_TAG_HEADER";
    private static final String m = "VIEW_TAG_FOOTER";
    private static final float n = 2.7f;
    private static final float o = 44.0f;
    private static final float p = 13.0f;
    private static final float q = 26.0f;
    private static final float r = 9.5f;
    private static final float s = 37.0f;
    private static final float t = 4.0f;
    private static final float u = 45.0f;
    private static final float v = 15.0f;
    private static final int x = -1;
    private static final int z = -1;
    private a B;
    private Context C;
    private IndoorBuilding F;
    private String G;
    private boolean I;
    private ps J;
    private ps K;
    public pu a;
    public ViewGroup b;
    public boolean c;
    public ab e;
    public so f;
    public int g;
    public int h;
    private px i;
    private pt j;
    private static final int y = Color.parseColor("#333333");
    private static final int A = Color.parseColor("#979797");
    private float k = 1.0f;
    private int w = 0;
    private int D = -1;
    private int E = 0;
    public boolean d = false;
    private boolean H = false;
    private a.C1483a L = null;

    @Override // com.tencent.mapsdk.internal.em
    public final void a(em.b bVar) {
    }

    @Override // com.tencent.mapsdk.internal.em
    public final void c() {
    }

    @Override // com.tencent.mapsdk.internal.em
    public final em.b d() {
        return null;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public pw(be beVar) {
        this.c = false;
        this.f = (so) beVar.b();
        this.b = this.f.d;
        this.I = beVar.l();
        this.C = this.b.getContext().getApplicationContext();
        this.c = true;
    }

    public final void e() {
        if (this.a == null) {
            this.B = new a(this.C, new ArrayList());
            a(this.C);
            this.g = (int) (this.k * u);
            a(this.C, this.B);
            if (this.f != null) {
                this.e = this.f.o;
            }
        }
    }

    private void a(Context context) {
        this.k = context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    private boolean j() {
        return this.c;
    }

    private void a(boolean z2) {
        if (this.b == null || this.f == null) {
            return;
        }
        if (z2) {
            this.c = true;
        } else {
            this.c = false;
        }
        boolean z3 = this.c;
        if (this.b == null || this.f == null) {
            return;
        }
        if (this.a == null) {
            if (!z3) {
                return;
            }
            e();
        }
        VectorMap vectorMap = (VectorMap) this.f.e_;
        if (this.c && z3 && this.e != null && this.e.f) {
            a(vectorMap.q.u());
            return;
        }
        a((IndoorBuilding) null);
        if (this.a.getVisibility() != 8) {
            this.a.setVisibility(8);
        }
    }

    public final void a(IndoorBuilding indoorBuilding) {
        if (indoorBuilding == null) {
            this.F = indoorBuilding;
            this.E = 0;
            f();
            return;
        }
        if (this.a == null) {
            e();
        }
        if (this.F != null && this.F.getBuidlingId().equals(indoorBuilding.getBuidlingId()) && this.F.getActiveLevelIndex() == indoorBuilding.getActiveLevelIndex()) {
            return;
        }
        this.F = indoorBuilding;
        this.E = this.F.getLevels().size();
        a(indoorBuilding.getLevels());
    }

    @TargetApi(9)
    private void a(Context context, a aVar) {
        b(context);
        c(context);
        b(context, aVar);
        d(context);
        a(this.b, (Bundle) null);
        this.a.setVisibility(8);
    }

    private void b(Context context) {
        this.a = new pu(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = (int) (this.k * v);
        layoutParams.bottomMargin = this.g;
        this.a.setDarkStyle(this.I);
        this.a.setLayoutParams(layoutParams);
        this.a.setWillNotDraw(false);
        this.a.setOrientation(1);
        this.a.setGravity(1);
        this.a.setVisibility(8);
    }

    private void c(Context context) {
        this.J = new ps(context);
        this.J.setDarkStyle(this.I);
        this.J.setTag(l);
        int i = (int) (this.k * 5.900000095367432d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, (int) (this.k * 3.200000047683716d));
        layoutParams.setMargins(0, i, 0, i);
        this.J.setLayoutParams(layoutParams);
        this.a.addView(this.J);
    }

    private void b(Context context, a aVar) {
        this.i = new px(context);
        this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.i.setChoiceMode(1);
        this.i.setAdapter((ListAdapter) aVar);
        this.i.setOnItemClickListener(this);
        this.i.setVerticalScrollBarEnabled(false);
        this.i.setHorizontalScrollBarEnabled(false);
        this.i.setOverScrollMode(2);
        this.i.setDivider(null);
        this.i.setDividerHeight(0);
        this.i.setOnDataChangedListener(this);
        this.a.addView(this.i);
        this.i.setOnScrollListener(this);
    }

    private void d(Context context) {
        this.K = new ps(context);
        this.K.setDarkStyle(this.I);
        this.K.setTag(m);
        this.K.setRotation(180.0f);
        int i = (int) (this.k * 5.900000095367432d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, (int) (this.k * 3.200000047683716d));
        layoutParams.setMargins(0, i, 0, i);
        this.K.setLayoutParams(layoutParams);
        this.a.addView(this.K);
    }

    @Override // com.tencent.mapsdk.internal.ff
    public final void b(int i, int i2) {
        if (this.a == null || this.i == null) {
            return;
        }
        f();
    }

    @Override // com.tencent.mapsdk.internal.em
    public final boolean a(ViewGroup viewGroup, Bundle bundle) {
        if (this.a == null) {
            return false;
        }
        if (viewGroup.indexOfChild(this.a) < 0) {
            viewGroup.addView(this.a);
        }
        k();
        m();
        return true;
    }

    private void k() {
        boolean l2 = this.f.aB.l();
        kj.b(ki.f, "updateIndoorStyle isDark: cur[" + l2 + "]|old[" + this.I + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (l2 != this.I) {
            this.a.setDarkStyle(l2);
            this.J.setDarkStyle(l2);
            this.K.setDarkStyle(l2);
            this.B.notifyDataSetChanged();
            this.I = l2;
        }
    }

    @Override // com.tencent.mapsdk.internal.ek
    public final View[] b() {
        return new View[]{this.a};
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        M m2 = this.f.e_;
        if (m2 == 0) {
            return;
        }
        if (this.L != null) {
            this.L.a.setTextColor(-16777216);
            this.L.b.setVisibility(4);
        }
        a.C1483a c1483a = (a.C1483a) view.getTag();
        c1483a.a.setTextColor(-1);
        c1483a.b.setVisibility(0);
        this.L = c1483a;
        this.D = i;
        this.d = true;
        m2.setIndoorFloor(i);
    }

    private void b(boolean z2) {
        if (this.b == null || this.f == null) {
            return;
        }
        if (this.a == null) {
            if (!z2) {
                return;
            }
            e();
        }
        VectorMap vectorMap = (VectorMap) this.f.e_;
        if (this.c && z2 && this.e != null && this.e.f) {
            a(vectorMap.q.u());
            return;
        }
        a((IndoorBuilding) null);
        if (this.a.getVisibility() != 8) {
            this.a.setVisibility(8);
        }
    }

    private void a(int i) {
        this.g = i;
        if (this.a != null) {
            this.a.post(new AnonymousClass1());
        }
        if (this.b != null) {
            this.h = this.b.getMeasuredHeight();
        }
        if (this.f == null || this.f.e_ == 0 || ((VectorMap) this.f.e_).o.t == null || ((VectorMap) this.f.e_).o.t.q == null) {
            return;
        }
        this.h = (((int) ((VectorMap) this.f.e_).o.t.q.b) - i) * 2;
        f();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.pw$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pw.this.a.getLayoutParams();
            marginLayoutParams.bottomMargin = pw.this.g;
            pw.this.a.setLayoutParams(marginLayoutParams);
        }
    }

    private void a(List<IndoorLevel> list) {
        if (this.b == null) {
            return;
        }
        f();
        if (this.B != null) {
            this.B.a(list);
        }
    }

    private void l() {
        if (this.F == null) {
            return;
        }
        int activeLevelIndex = this.F.getActiveLevelIndex();
        List<IndoorLevel> levels = this.F.getLevels();
        if (levels == null || activeLevelIndex >= levels.size() || activeLevelIndex == -1 || levels.get(activeLevelIndex) == null) {
            return;
        }
        if (this.G != null && this.d && this.G.equals(this.F.getBuidlingId())) {
            this.i.setItemChecked(activeLevelIndex, true);
            this.d = false;
        } else {
            this.i.setSelectionFromTop(activeLevelIndex, ((int) ((this.k * s) + 0.5d)) * 2);
        }
        this.D = activeLevelIndex;
        this.G = this.F.getBuidlingId();
    }

    private void m() {
        if (this.i != null) {
            this.i.getLayoutParams().width = a(this.B);
            this.i.requestLayout();
        }
    }

    public final void f() {
        n();
        if (this.a == null || this.i == null) {
            return;
        }
        if (!this.c || this.H || this.E <= 0) {
            this.a.post(new Runnable() { // from class: com.tencent.mapsdk.internal.pw.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (pw.this.a == null || pw.this.a.getVisibility() != 0) {
                        return;
                    }
                    pw.this.a.setVisibility(8);
                }
            });
        } else {
            this.a.post(new Runnable() { // from class: com.tencent.mapsdk.internal.pw.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (pw.this.a == null || pw.this.i == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = pw.this.i.getLayoutParams();
                    if (layoutParams.height != pw.this.w) {
                        layoutParams.height = pw.this.w;
                        pw.this.i.setLayoutParams(layoutParams);
                    }
                    if (pw.this.a.getVisibility() != 0) {
                        pw.this.a.setVisibility(0);
                    }
                }
            });
        }
    }

    private void n() {
        if (this.b == null || this.a == null) {
            return;
        }
        int i = (this.g * 2) + ((int) (this.k * 16.700000762939453d));
        if (sd.c.equals(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE) && this.b.getMeasuredHeight() > this.h) {
            i = ((int) (this.k * 16.700000762939453d)) + this.g + ((this.b.getMeasuredHeight() - this.h) - this.g);
        }
        if (this.E >= 4.0f) {
            this.w = (int) (this.k * 148.5d);
            if (this.b.getMeasuredHeight() > this.w + i) {
                this.H = false;
                return;
            }
            this.w = (int) (this.k * 111.5d);
            if (this.b.getMeasuredHeight() > i + this.w) {
                this.H = false;
                return;
            }
        } else {
            this.w = (int) (((this.E * s) + 0.5d) * this.k);
            if (this.b.getMeasuredHeight() > i + this.w) {
                this.H = false;
                return;
            }
        }
        this.H = true;
    }

    private int a(Adapter adapter) {
        int count = adapter.getCount();
        View view = null;
        int i = (int) (this.k * 44.5d);
        for (int i2 = 0; i2 < count; i2++) {
            view = adapter.getView(i2, view, this.i);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth > i) {
                i = measuredWidth;
            }
        }
        return i;
    }

    @Override // com.tencent.mapsdk.internal.px.a
    public final void g() {
        m();
        if (this.F != null) {
            int activeLevelIndex = this.F.getActiveLevelIndex();
            List<IndoorLevel> levels = this.F.getLevels();
            if (levels == null || activeLevelIndex >= levels.size() || activeLevelIndex == -1 || levels.get(activeLevelIndex) == null) {
                return;
            }
            if (this.G != null && this.d && this.G.equals(this.F.getBuidlingId())) {
                this.i.setItemChecked(activeLevelIndex, true);
                this.d = false;
            } else {
                this.i.setSelectionFromTop(activeLevelIndex, ((int) ((this.k * s) + 0.5d)) * 2);
            }
            this.D = activeLevelIndex;
            this.G = this.F.getBuidlingId();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.a == null) {
            return;
        }
        ps psVar = (ps) this.a.findViewWithTag(l);
        ps psVar2 = (ps) this.a.findViewWithTag(m);
        if (psVar == null || psVar2 == null) {
            return;
        }
        if (i2 == i3) {
            psVar.setActivate(false);
        } else {
            if (i == 0) {
                psVar.setActivate(false);
            } else {
                psVar.setActivate(true);
            }
            if (i + i2 < i3) {
                psVar2.setActivate(true);
                return;
            }
        }
        psVar2.setActivate(false);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a extends BaseAdapter {
        private Context b;
        private List<IndoorLevel> c;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public a(Context context, List<IndoorLevel> list) {
            this.b = context;
            this.c = list;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            if (this.c == null) {
                return 0;
            }
            return this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            if (this.c == null) {
                return null;
            }
            return this.c.get(i);
        }

        @Override // android.widget.Adapter
        @NonNull
        public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            View view2;
            TextView textView;
            FrameLayout frameLayout;
            if (this.c == null || this.c.size() == 0) {
                return null;
            }
            if (view != null) {
                C1483a c1483a = (C1483a) view.getTag();
                textView = c1483a.a;
                view2 = c1483a.b;
                frameLayout = view;
            } else {
                FrameLayout frameLayout2 = new FrameLayout(this.b);
                view2 = new View(this.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (pw.this.k * 26.5d), (int) (pw.this.k * 26.5d));
                if (pw.this.j == null) {
                    pw.this.j = new pt();
                    pw.this.j.setBounds(0, 0, layoutParams.width, layoutParams.height);
                }
                if (Build.VERSION.SDK_INT < 16) {
                    view2.setBackgroundDrawable(pw.this.j);
                } else {
                    view2.setBackground(pw.this.j);
                }
                layoutParams.gravity = 17;
                frameLayout2.addView(view2, layoutParams);
                textView = new TextView(this.b);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine();
                textView.setGravity(17);
                textView.setTextSize(2, pw.p);
                int i2 = (int) (pw.this.k * 10.0d);
                textView.setPadding(0, i2, 0, i2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) (pw.this.k * 37.5f));
                layoutParams2.gravity = 17;
                frameLayout2.addView(textView, layoutParams2);
                frameLayout2.setTag(new C1483a(textView, view2));
                frameLayout = frameLayout2;
            }
            textView.setText(this.c.get(i).getName());
            if (i != pw.this.D) {
                textView.setTextColor(pw.this.I ? pw.A : pw.y);
                view2.setVisibility(4);
            } else {
                boolean unused = pw.this.I;
                textView.setTextColor(-1);
                view2.setVisibility(0);
            }
            return frameLayout;
        }

        public final void a(List<IndoorLevel> list) {
            this.c = list;
            notifyDataSetChanged();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.pw$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public final class C1483a {
            public TextView a;
            public View b;

            public C1483a(TextView textView, View view) {
                this.a = textView;
                this.b = view;
            }
        }
    }
}
