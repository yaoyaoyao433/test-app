package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends RecyclerView.k {
    public static ChangeQuickRedirect a;
    MPViewPager.c b;
    int c;
    boolean d;
    @NonNull
    private final MPViewPager e;
    @NonNull
    private final RecyclerView f;
    @NonNull
    private final LinearLayoutManager g;
    private int h;
    private a i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;

    public g(@NonNull MPViewPager mPViewPager) {
        Object[] objArr = {mPViewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a3f3d5d2beee89ee1893cce1afdcc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a3f3d5d2beee89ee1893cce1afdcc4");
            return;
        }
        this.e = mPViewPager;
        this.f = this.e.getRecyclerView();
        this.g = (LinearLayoutManager) this.f.getLayoutManager();
        this.i = new a();
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ea4c4acd6f7dd75d3fd33333a64859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ea4c4acd6f7dd75d3fd33333a64859");
            return;
        }
        this.h = 0;
        this.c = 0;
        this.i.a();
        this.j = -1;
        this.k = -1;
        this.l = false;
        this.m = false;
        this.n = false;
        this.d = false;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        boolean z = true;
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d3939bf318ec04e8fc796868189a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d3939bf318ec04e8fc796868189a7a");
        } else if (!(this.h == 1 && this.c == 1) && i == 1) {
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7e98d1290d40148bc23d8b4295bc5e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7e98d1290d40148bc23d8b4295bc5e7");
                return;
            }
            this.n = false;
            this.h = 1;
            if (this.k != -1) {
                this.j = this.k;
                this.k = -1;
            } else if (this.j == -1) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                this.j = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4af54afe3615eaed1c5e352ae18d6788", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4af54afe3615eaed1c5e352ae18d6788")).intValue() : this.g.findFirstVisibleItemPosition();
            }
            a(1);
        } else if (e() && i == 2) {
            if (this.m) {
                a(2);
                this.l = true;
            }
        } else {
            if (e() && i == 0) {
                d();
                if (!this.m) {
                    if (this.i.a != -1) {
                        a(this.i.a, 0.0f, 0);
                    }
                } else if (this.i.c != 0) {
                    z = false;
                } else if (this.j != this.i.a) {
                    b(this.i.a);
                }
                if (z) {
                    a(0);
                    c();
                }
            }
            if (this.h == 2 && i == 0 && this.d) {
                d();
                if (this.i.c == 0) {
                    if (this.k != this.i.a) {
                        b(this.i.a == -1 ? 0 : this.i.a);
                    }
                    a(0);
                    c();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if ((r13 < 0) == r11.e.b()) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // android.support.v7.widget.RecyclerView.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView r12, int r13, int r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r9 = 1
            r0[r9] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r1 = 2
            r0[r1] = r12
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.machpro.component.swiper_v2.g.a
            java.lang.String r10 = "d4bfada5dea22f08f780741f1f8524bd"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r12
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r12, r8, r10)
            return
        L29:
            r11.m = r9
            r11.d()
            boolean r12 = r11.l
            r0 = -1
            if (r12 == 0) goto L6a
            r11.l = r8
            if (r14 > 0) goto L49
            if (r14 != 0) goto L47
            if (r13 >= 0) goto L3d
            r12 = 1
            goto L3e
        L3d:
            r12 = 0
        L3e:
            com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager r13 = r11.e
            boolean r13 = r13.b()
            if (r12 != r13) goto L47
            goto L49
        L47:
            r12 = 0
            goto L4a
        L49:
            r12 = 1
        L4a:
            if (r12 == 0) goto L58
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.c
            if (r12 == 0) goto L58
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.a
            int r12 = r12 + r9
            goto L5c
        L58:
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.a
        L5c:
            r11.k = r12
            int r12 = r11.j
            int r13 = r11.k
            if (r12 == r13) goto L78
            int r12 = r11.k
            r11.b(r12)
            goto L78
        L6a:
            int r12 = r11.h
            if (r12 != 0) goto L78
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.a
            if (r12 != r0) goto L75
            r12 = 0
        L75:
            r11.b(r12)
        L78:
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.a
            if (r12 != r0) goto L80
            r12 = 0
            goto L84
        L80:
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.a
        L84:
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r13 = r11.i
            float r13 = r13.b
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r14 = r11.i
            int r14 = r14.c
            r11.a(r12, r13, r14)
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.a
            int r13 = r11.k
            if (r12 == r13) goto L9b
            int r12 = r11.k
            if (r12 != r0) goto Lab
        L9b:
            com.sankuai.waimai.machpro.component.swiper_v2.g$a r12 = r11.i
            int r12 = r12.c
            if (r12 != 0) goto Lab
            int r12 = r11.c
            if (r12 == r9) goto Lab
            r11.a(r8)
            r11.c()
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.swiper_v2.g.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
    }

    private void d() {
        int top;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28af0857d411a22b3c1400171ec246ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28af0857d411a22b3c1400171ec246ba");
            return;
        }
        a aVar = this.i;
        aVar.a = this.g.findFirstVisibleItemPosition();
        if (aVar.a == -1) {
            aVar.a();
            return;
        }
        View findViewByPosition = this.g.findViewByPosition(aVar.a);
        if (findViewByPosition == null) {
            aVar.a();
            return;
        }
        int height = findViewByPosition.getHeight();
        int width = findViewByPosition.getWidth();
        if (this.g.getOrientation() == 0) {
            top = this.e.g - findViewByPosition.getLeft();
            height = width;
        } else {
            top = this.e.g - findViewByPosition.getTop();
        }
        aVar.c = top;
        if (aVar.c < 0) {
            aVar.c = 0;
        }
        aVar.b = height == 0 ? 0.0f : aVar.c / height;
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a69bedc75c665a6bd8b2955567f4af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a69bedc75c665a6bd8b2955567f4af6");
            return;
        }
        this.h = z ? 2 : 3;
        this.n = false;
        boolean z2 = this.k != i;
        this.k = i;
        a(2);
        if (z2) {
            b(i);
        }
    }

    public final boolean a() {
        return this.c == 0;
    }

    private boolean e() {
        return this.h == 1 || this.h == 4;
    }

    public final double b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82932b66409c18bd13853f24687bf78c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82932b66409c18bd13853f24687bf78c")).doubleValue();
        }
        d();
        return this.i.a + this.i.b;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef78add9c27d94ab4ddd0e7b93fcab6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef78add9c27d94ab4ddd0e7b93fcab6a");
        } else if ((this.h == 3 && this.c == 0) || this.c == i) {
        } else {
            this.c = i;
            if (this.b != null) {
                this.b.b(i);
            }
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c051672e9c198881bd18dc2c888839a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c051672e9c198881bd18dc2c888839a1");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }

    private void a(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5308c5de8245e2b927b7910e3ce2de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5308c5de8245e2b927b7910e3ce2de9");
        } else if (this.b != null) {
            this.b.a(i, f, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        public int a;
        public float b;
        public int c;

        public final void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }
}
