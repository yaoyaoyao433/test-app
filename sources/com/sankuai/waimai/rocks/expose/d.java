package com.sankuai.waimai.rocks.expose;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect a;
    AbsListView.OnScrollListener b;
    public AdapterView.OnItemClickListener c;
    ListView d;
    private RecyclerView e;

    public d(c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da4f820f848675e4a6102a581c4906a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da4f820f848675e4a6102a581c4906a");
        }
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f881e2e769a459acbe2f95a9993566b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f881e2e769a459acbe2f95a9993566b");
            return;
        }
        super.a(view);
        if (view instanceof RecyclerView) {
            this.e = (RecyclerView) this.p;
            this.e.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.expose.d.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a617a037d0f50ac0c4f3bc96d434e7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a617a037d0f50ac0c4f3bc96d434e7d");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    switch (i) {
                        case 0:
                            d.this.b();
                            return;
                        case 1:
                            return;
                        case 2:
                            return;
                        default:
                            return;
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bd16bcd51e83d56b64bd7faae798e72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bd16bcd51e83d56b64bd7faae798e72");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    d.this.e();
                    if (d.this.o) {
                        return;
                    }
                    d.this.b();
                    d.this.o = true;
                }
            });
        } else if (view instanceof ListView) {
            this.d = (ListView) this.p;
            this.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.rocks.expose.d.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view2, int i, long j) {
                    Object[] objArr2 = {adapterView, view2, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbe7adf6192087ab770512c23dd4a4d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbe7adf6192087ab770512c23dd4a4d9");
                        return;
                    }
                    int headerViewsCount = i - d.this.d.getHeaderViewsCount();
                    if (d.this.j != null) {
                        d.this.j.b(headerViewsCount);
                    }
                    if (d.this.c != null) {
                        d.this.c.onItemClick(adapterView, view2, i, j);
                    }
                }
            });
            this.d.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.rocks.expose.d.3
                public static ChangeQuickRedirect a;

                @Override // android.widget.AbsListView.OnScrollListener
                public final void onScrollStateChanged(AbsListView absListView, int i) {
                    Object[] objArr2 = {absListView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1198ba86853ad7ccd14f8c2906c0a50", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1198ba86853ad7ccd14f8c2906c0a50");
                        return;
                    }
                    switch (i) {
                        case 0:
                            d.this.b();
                            break;
                    }
                    if (d.this.b != null) {
                        d.this.b.onScrollStateChanged(absListView, i);
                    }
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                    Object[] objArr2 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19186fab8a2146ef81583882263a5e66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19186fab8a2146ef81583882263a5e66");
                        return;
                    }
                    if (d.this.d != null) {
                        int firstVisiblePosition = d.this.d.getFirstVisiblePosition();
                        int headerViewsCount = d.this.d.getHeaderViewsCount();
                        int lastVisiblePosition = d.this.d.getLastVisiblePosition();
                        d.this.c(firstVisiblePosition >= headerViewsCount ? firstVisiblePosition - headerViewsCount : 0);
                        d.this.d(lastVisiblePosition - headerViewsCount);
                        if (!d.this.o) {
                            d.this.b();
                            d.this.o = true;
                        }
                    }
                    if (d.this.b != null) {
                        d.this.b.onScroll(absListView, i, i2, i3);
                    }
                }
            });
        }
    }

    void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93f2de68322b76600e055be1bd94e3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93f2de68322b76600e055be1bd94e3a");
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            c(linearLayoutManager.findFirstVisibleItemPosition());
            d(findLastVisibleItemPosition);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (com.sankuai.waimai.foundation.utils.ah.b(r3) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (com.sankuai.waimai.foundation.utils.ah.b(r3) != false) goto L23;
     */
    @Override // com.sankuai.waimai.rocks.expose.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.rocks.expose.d.a
            java.lang.String r10 = "c53c1cff2be7afbe6eb36962813e2809"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r9, r0, r10)
            return
        L18:
            android.view.View r1 = r13.p
            boolean r1 = r1 instanceof android.support.v7.widget.RecyclerView
            if (r1 == 0) goto L21
            r13.e()
        L21:
            int r1 = r13.m
            if (r1 < 0) goto Lbd
            int r1 = r13.m
            int r2 = r13.n
            if (r1 > r2) goto Lbd
            int r1 = r13.m
        L2d:
            int r2 = r13.n
            if (r1 > r2) goto Lbd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r13.a(r2)
            if (r2 != 0) goto Lb9
            com.sankuai.waimai.rocks.expose.c r2 = r13.j
            if (r2 == 0) goto Lb9
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r10[r0] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.rocks.expose.d.a
            java.lang.String r12 = "eeb03cfab4069ba898359fd7eb3704ef"
            r6 = 0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r4 = r13
            r5 = r11
            r7 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L64
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r13, r11, r0, r12)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto Lab
        L64:
            android.widget.ListView r3 = r13.d
            if (r3 == 0) goto L8d
            android.widget.ListView r3 = r13.d
            int r3 = r3.getHeaderViewsCount()
            int r3 = r3 + r1
            android.widget.ListView r4 = r13.d
            int r4 = r4.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.widget.ListView r4 = r13.d
            android.view.View r3 = r4.getChildAt(r3)
            if (r3 == 0) goto L8b
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L8b
            boolean r3 = com.sankuai.waimai.foundation.utils.ah.b(r3)
            if (r3 == 0) goto L8b
            goto Lab
        L8b:
            r2 = 0
            goto Lab
        L8d:
            android.support.v7.widget.RecyclerView r3 = r13.e
            if (r3 == 0) goto L8b
            android.support.v7.widget.RecyclerView r3 = r13.e
            android.support.v7.widget.RecyclerView$s r3 = r3.findViewHolderForLayoutPosition(r1)
            if (r3 != 0) goto L9b
            r3 = 0
            goto L9d
        L9b:
            android.view.View r3 = r3.itemView
        L9d:
            if (r3 == 0) goto L8b
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L8b
            boolean r3 = com.sankuai.waimai.foundation.utils.ah.b(r3)
            if (r3 == 0) goto L8b
        Lab:
            if (r2 == 0) goto Lb9
            com.sankuai.waimai.rocks.expose.c r2 = r13.j
            r2.a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r13.b(r2)
        Lb9:
            int r1 = r1 + 1
            goto L2d
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.expose.d.b():void");
    }
}
