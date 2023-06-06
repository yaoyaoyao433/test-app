package com.sankuai.waimai.rocks.view.block;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.view.recyclerview.a;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f extends a<com.meituan.android.cube.pga.view.a, c> {
    public static ChangeQuickRedirect s;
    private com.meituan.android.cube.pga.block.a t;

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final /* synthetic */ void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        com.sankuai.waimai.rocks.view.viewmodel.b bVar;
        List<com.sankuai.waimai.rocks.view.viewmodel.e> list;
        com.sankuai.waimai.rocks.view.viewmodel.e eVar = (com.sankuai.waimai.rocks.view.viewmodel.e) aVar;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095c8533efb2d908e8341ba097b32639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095c8533efb2d908e8341ba097b32639");
            return;
        }
        super.a((f) eVar);
        if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.c) {
            eVar.o();
            com.sankuai.waimai.rocks.view.viewmodel.c cVar = (com.sankuai.waimai.rocks.view.viewmodel.c) eVar;
            if (cVar.q != null) {
                com.meituan.android.cube.pga.common.c cVar2 = new com.meituan.android.cube.pga.common.c();
                cVar2.b = eVar.s.q.d;
                cVar2.a = eVar.s.q.c;
                cVar.q.a(cVar2);
            }
            this.t.a((com.meituan.android.cube.pga.block.a) cVar.q);
            int a = com.sankuai.waimai.foundation.utils.g.a(this.t.m(), eVar.s.q.g);
            int a2 = com.sankuai.waimai.foundation.utils.g.a(this.t.m(), eVar.s.q.f);
            if (eVar.s instanceof com.sankuai.waimai.rocks.page.model.a) {
                a = 0;
                a2 = 0;
            }
            this.t.i().setPadding(0, a, a2, 0);
            Object tag = this.t.i().getTag();
            a(eVar, (tag instanceof String) && TextUtils.equals((String) tag, "ignore_rocks_margin"));
        }
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc63ba729c93c3cbf0d1102748643308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc63ba729c93c3cbf0d1102748643308");
        } else if (!q().isEmpty() && (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.b) && (list = (bVar = (com.sankuai.waimai.rocks.view.viewmodel.b) eVar).o) != null && !list.isEmpty()) {
            for (int i = 0; i < q().size(); i++) {
                com.meituan.android.cube.pga.block.a aVar2 = q().get(i);
                if (i < list.size()) {
                    aVar2.a((com.meituan.android.cube.pga.block.a) bVar.o.get(i));
                }
            }
        }
    }

    public f(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5344010bd656a45675af0c961a5ac523", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5344010bd656a45675af0c961a5ac523");
            return;
        }
        this.t = aVar;
        if (aVar.i() != null) {
            aVar.i().setMinimumHeight(1);
        }
    }

    public final void a(List<com.meituan.android.cube.pga.block.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a46cc351df945096564790e721529dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a46cc351df945096564790e721529dc");
        } else if (list != null && !list.isEmpty() && !(this.t instanceof a.C1135a)) {
            w();
            ViewGroup M = this.t instanceof h ? ((h) this.t).M() : null;
            for (com.meituan.android.cube.pga.block.a aVar : list) {
                if (!(aVar instanceof g) || !(((f) ((g) aVar)).t instanceof a.C1135a)) {
                    a(aVar, M);
                }
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e7da790bd1d86cf78245e0928df622", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e7da790bd1d86cf78245e0928df622") : this.t.r();
    }

    public void a(final com.sankuai.waimai.rocks.view.viewmodel.e eVar, final boolean z) {
        final View i;
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68897390f4a6c02a93212f31f46f159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68897390f4a6c02a93212f31f46f159");
        } else if ((this.t instanceof a.C1135a) || (i = i()) == null) {
        } else {
            i.post(new Runnable() { // from class: com.sankuai.waimai.rocks.view.block.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "564da13fdb80bf8058555968571106e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "564da13fdb80bf8058555968571106e3");
                        return;
                    }
                    int a2 = com.sankuai.waimai.foundation.utils.g.a(f.this.t.m(), eVar.s.q.a);
                    int a3 = com.sankuai.waimai.foundation.utils.g.a(f.this.t.m(), eVar.s.q.c);
                    int a4 = com.sankuai.waimai.foundation.utils.g.a(f.this.t.m(), eVar.s.q.b);
                    int a5 = com.sankuai.waimai.foundation.utils.g.a(f.this.t.m(), eVar.s.q.d);
                    if (!i.isShown()) {
                        f.this.a(0, 0, 0, 0);
                    } else {
                        f.this.a(a2, a3, a4, a5, z);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.core.f
    public final View i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e054dd0854fb068d8fcfa172c79712e7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e054dd0854fb068d8fcfa172c79712e7") : this.t.i();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abcb181483cb8a6d46cbb921e4ab0eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abcb181483cb8a6d46cbb921e4ab0eaf");
        } else {
            a(i, i2, i3, i4, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r7 = r14
            r8 = r16
            r9 = r18
            r0 = 5
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r11 = 0
            r10[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1 = 1
            r10[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r1 = 2
            r10[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1 = 3
            r10[r1] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r1 = 4
            r10[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.rocks.view.block.f.s
            java.lang.String r13 = "6065d4bbcdeb2f12dd2264debf6c66e7"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r10
            r1 = r14
            r2 = r12
            r4 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L40
            com.meituan.robust.PatchProxy.accessDispatch(r10, r14, r12, r11, r13)
            return
        L40:
            com.meituan.android.cube.pga.block.a r0 = r7.t
            android.view.View r0 = r0.i()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L55
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
        L53:
            r1 = r0
            goto L61
        L55:
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L5c
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L53
        L5c:
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r1.<init>(r0)
        L61:
            if (r19 == 0) goto L85
            com.meituan.android.cube.pga.block.a r0 = r7.t
            android.view.View r0 = r0.i()
            int r0 = r0.getHeight()
            com.meituan.android.cube.pga.block.a r2 = r7.t
            android.content.Context r2 = r2.m()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.sankuai.waimai.foundation.utils.g.a(r2, r3)
            if (r0 > r2) goto L80
            r1.topMargin = r11
            r1.bottomMargin = r11
            goto L8b
        L80:
            r1.topMargin = r8
            r1.bottomMargin = r9
            goto L8b
        L85:
            r0 = r15
            r2 = r17
            r1.setMargins(r15, r8, r2, r9)
        L8b:
            com.meituan.android.cube.pga.block.a r0 = r7.t
            android.view.View r0 = r0.i()
            r0.setLayoutParams(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.view.block.f.a(int, int, int, int, boolean):void");
    }

    @Override // com.sankuai.waimai.rocks.view.block.a, com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711df7b71913690ea65ef2676b882636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711df7b71913690ea65ef2676b882636");
            return;
        }
        super.y();
        if (this.t != null) {
            this.t.y();
        }
        Iterator<com.meituan.android.cube.pga.block.a> it = q().iterator();
        while (it.hasNext()) {
            it.next().y();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ecb2cbaa9e5c25a40a8783419e2a3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ecb2cbaa9e5c25a40a8783419e2a3c4");
            return;
        }
        super.a(rect);
        if (this.t != null) {
            this.t.a(rect);
        }
    }
}
