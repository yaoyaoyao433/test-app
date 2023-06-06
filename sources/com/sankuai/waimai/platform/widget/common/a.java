package com.sankuai.waimai.platform.widget.common;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect f;
    private f<T> a;
    private LinearLayout b;
    public RecyclerView g;
    protected int h;
    protected int i;
    public boolean j;
    public com.sankuai.waimai.platform.widget.emptylayout.d k;
    public C1081a l;
    public b m;
    public FrameLayout n;
    g o;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, int i2);

        void a(boolean z);
    }

    public abstract f<T> a();

    public void a(boolean z) {
    }

    public abstract C1081a b();

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b811cb90806297c01541baaa4b30d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b811cb90806297c01541baaa4b30d8");
            return;
        }
        this.h = 0;
        this.i = 0;
        this.o = new g() { // from class: com.sankuai.waimai.platform.widget.common.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.common.g
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7866285407aeb5f3b3ae504bd8cd0827", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7866285407aeb5f3b3ae504bd8cd0827");
                    return;
                }
                a.this.i++;
                if (!a.this.j || a.this.m == null) {
                    return;
                }
                a.this.m.a(a.this.h, a.this.l.a);
            }
        };
    }

    @Override // com.sankuai.waimai.platform.base.b
    public View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a05243ea1172ad2e21935ad7387ba0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a05243ea1172ad2e21935ad7387ba0");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_common_recycler_view_container, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dccd4114d3e48fcc1bfa7781d3ce8cad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dccd4114d3e48fcc1bfa7781d3ce8cad");
        } else {
            this.l = b();
            this.b = (LinearLayout) inflate.findViewById(R.id.recyclerView_container);
            this.g = a(this.b);
            this.b.addView(this.g, new LinearLayout.LayoutParams(-1, -1));
            this.n = (FrameLayout) inflate.findViewById(R.id.ceiling_view_container);
            this.a = a();
            this.g.setAdapter(this.a);
            this.g.setLayoutManager(this.l.h);
            if (this.l.g != null) {
                this.g.addItemDecoration(this.l.g);
            }
            if (this.l.i) {
                this.g.addOnScrollListener(this.o);
            }
            this.k = new com.sankuai.waimai.platform.widget.emptylayout.d(inflate);
            this.k.a(3, 7);
            this.k.b(this.l.b, this.l.e);
            this.k.c(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.common.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18e9624a14150bab1ee56f1f116b87aa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18e9624a14150bab1ee56f1f116b87aa");
                        return;
                    }
                    if (a.this.o != null) {
                        g gVar = a.this.o;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = g.c;
                        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "1620cf6e9736f28c67614faa6c3db627", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "1620cf6e9736f28c67614faa6c3db627");
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.e("LoadMore", "reset", new Object[0]);
                            gVar.e = 0;
                            gVar.j = 1;
                            gVar.g = 0;
                            gVar.h = 0;
                            gVar.i = 0;
                            gVar.f = false;
                        }
                    }
                    if (a.this.m != null) {
                        a.this.m.a(true);
                    }
                }
            });
            this.k.d();
        }
        return inflate;
    }

    public RecyclerView a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6192de0059e5246c028497d89d7e4b", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6192de0059e5246c028497d89d7e4b") : new RecyclerView(linearLayout.getContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r16.size() >= r15.l.a) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        if (r15.h < 0) goto L35;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List<T> r16, boolean r17, boolean r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r0 = 3
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r10 = 0
            r9[r10] = r8
            java.lang.Byte r0 = java.lang.Byte.valueOf(r17)
            r11 = 1
            r9[r11] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r18)
            r12 = 2
            r9[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.waimai.platform.widget.common.a.f
            java.lang.String r14 = "d970e528c238c0fa3a4cf2f870f63ae0"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r9
            r1 = r15
            r2 = r13
            r4 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            com.meituan.robust.PatchProxy.accessDispatch(r9, r15, r13, r10, r14)
            return
        L2c:
            boolean r0 = com.sankuai.waimai.foundation.utils.b.b(r16)
            if (r0 == 0) goto L4c
            int r0 = r7.i
            if (r0 != 0) goto L4c
            com.sankuai.waimai.platform.widget.common.a$a r0 = r7.l
            boolean r0 = r0.l
            if (r0 == 0) goto L46
            android.view.View r0 = r15.h()
            r1 = 8
            r0.setVisibility(r1)
            return
        L46:
            com.sankuai.waimai.platform.widget.emptylayout.d r0 = r7.k
            r0.f()
            return
        L4c:
            android.view.View r0 = r15.h()
            r0.setVisibility(r10)
            com.sankuai.waimai.platform.widget.emptylayout.d r0 = r7.k
            r0.h()
            if (r17 != 0) goto L5e
            int r0 = r7.i
            if (r0 != 0) goto L65
        L5e:
            com.sankuai.waimai.platform.widget.common.f<T> r0 = r7.a
            r0.b()
            r7.i = r11
        L65:
            com.sankuai.waimai.platform.widget.common.f<T> r0 = r7.a
            int r0 = r0.a(r8)
            r7.h = r0
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r9[r10] = r8
            java.lang.Byte r0 = java.lang.Byte.valueOf(r18)
            r9[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.platform.widget.common.a.f
            java.lang.String r13 = "8df2a8f8a7ba44b48b48d8444b89e8dc"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r9
            r1 = r15
            r2 = r12
            r4 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L93
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r15, r12, r10, r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto Lb7
        L93:
            com.sankuai.waimai.platform.widget.common.a$a r0 = r7.l
            int r0 = r0.m
            switch(r0) {
                case 2: goto Lb1;
                case 3: goto Lae;
                default: goto L9a;
            }
        L9a:
            if (r8 == 0) goto Lb6
            int r0 = r16.size()
            if (r0 == 0) goto Lb6
            int r0 = r16.size()
            com.sankuai.waimai.platform.widget.common.a$a r1 = r7.l
            int r1 = r1.a
            if (r0 < r1) goto Lb6
        Lac:
            r10 = 1
            goto Lb6
        Lae:
            r10 = r18
            goto Lb6
        Lb1:
            int r0 = r7.h
            if (r0 >= 0) goto Lb6
            goto Lac
        Lb6:
            r0 = r10
        Lb7:
            r7.j = r0
            com.sankuai.waimai.platform.widget.common.a$a r0 = r7.l
            boolean r0 = r0.i
            if (r0 == 0) goto Lc4
            boolean r0 = r7.j
            r15.a(r0)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.common.a.a(java.util.List, boolean, boolean):void");
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8746d8f5d65ce3d2982d3aec987b42b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8746d8f5d65ce3d2982d3aec987b42b");
        } else {
            this.o.e = 0;
        }
    }

    public final void a(@Nullable Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d9b74859de384459cf80d882db1ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d9b74859de384459cf80d882db1ace");
        } else if (this.n.getVisibility() != 0) {
            this.n.setVisibility(0);
            if (animation != null) {
                this.n.startAnimation(animation);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1081a {
        public int a;
        public int b;
        public int c;
        public String d;
        public int e;
        public String f;
        public RecyclerView.f g;
        public RecyclerView.LayoutManager h;
        public boolean i;
        public int j;
        public String k;
        public boolean l;
        public int m;

        public C1081a(C1082a c1082a) {
            this.a = c1082a.b;
            this.b = c1082a.c;
            this.c = c1082a.d;
            this.d = c1082a.e;
            this.f = c1082a.f;
            this.e = c1082a.g;
            this.g = c1082a.h;
            this.h = c1082a.i;
            this.i = c1082a.j;
            this.j = c1082a.m;
            this.k = c1082a.n;
            this.l = c1082a.k;
            this.m = c1082a.l;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.platform.widget.common.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C1082a {
            public static ChangeQuickRedirect a;
            public int b;
            public int c;
            int d;
            String e;
            String f;
            public int g;
            RecyclerView.f h;
            public RecyclerView.LayoutManager i;
            public boolean j;
            boolean k;
            public int l;
            int m;
            String n;

            public C1082a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2f3944730715d62f457fe64bd4ff1f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2f3944730715d62f457fe64bd4ff1f");
                    return;
                }
                this.k = false;
                this.l = 0;
            }
        }
    }
}
