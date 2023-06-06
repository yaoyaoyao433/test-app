package com.sankuai.waimai.mach.component.scroller.recyclerview;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends RecyclerView.i {
    public static ChangeQuickRedirect a;
    int b;
    boolean c;
    private RecyclerView d;
    private final RecyclerView.k e;

    @Override // android.support.v7.widget.RecyclerView.i
    public final boolean onFling(int i, int i2) {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57602c1160d3739ff463dfc38a507fe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57602c1160d3739ff463dfc38a507fe5");
            return;
        }
        this.c = true;
        this.e = new RecyclerView.k() { // from class: com.sankuai.waimai.mach.component.scroller.recyclerview.c.1
            public static ChangeQuickRedirect a;
            public ScrollerLayoutManager b;
            public boolean c = false;
            public boolean d = true;
            public int e = 0;
            public int f = 0;
            public RecyclerView.LayoutManager g;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7af6ebcb83e3e20eaf4cd5205dc156b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7af6ebcb83e3e20eaf4cd5205dc156b9");
                } else if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                    com.sankuai.waimai.mach.log.b.b("ScrollerSnapHelper", "recyclerview is null or layoutmanager is null", new Object[0]);
                } else {
                    super.onScrollStateChanged(recyclerView, i);
                    if (this.b != null) {
                        if (this.b.b != null) {
                            this.b.b.b(i);
                            if (this.f == 0 && i != 0) {
                                this.b.b.c(c.this.b);
                            }
                            if (this.f != 0 && i == 0) {
                                this.b.b.d(c.this.b);
                            }
                            this.b.b.e(this.b.a(this.d));
                            this.b.b.a(this.b.a(this.d));
                        }
                        this.f = i;
                    }
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cad60bc839232fed28cd3117eba6484", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cad60bc839232fed28cd3117eba6484");
                } else if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                    com.sankuai.waimai.mach.log.b.b("ScrollerSnapHelper", "recyclerview is null or layoutmanager is null", new Object[0]);
                } else {
                    if (c.this.c) {
                        c.this.c = false;
                        this.g = recyclerView.getLayoutManager();
                        if (this.g instanceof ScrollerLayoutManager) {
                            this.b = (ScrollerLayoutManager) this.g;
                            this.e = this.b.getOrientation();
                            int findFirstVisibleItemPosition = this.b.findFirstVisibleItemPosition();
                            int findLastVisibleItemPosition = this.b.findLastVisibleItemPosition();
                            if (this.b.b != null) {
                                this.b.b.a();
                                for (int i3 = 0; i3 <= findLastVisibleItemPosition - findFirstVisibleItemPosition; i3++) {
                                    this.b.b.e(i3);
                                    this.b.b.a(i3);
                                }
                            }
                        }
                    }
                    if (i == 0 && i2 == 0) {
                        return;
                    }
                    this.c = true;
                    if (this.e == 0) {
                        c.this.b += i;
                        this.d = i > 0;
                        return;
                    }
                    c.this.b += i2;
                    this.d = i2 > 0;
                }
            }
        };
    }

    public final void a(@Nullable RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561d12bc1ad1b55e6bdba8dc8b03e21d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561d12bc1ad1b55e6bdba8dc8b03e21d");
        } else if (this.d == recyclerView) {
            com.sankuai.waimai.mach.log.b.b("ScrollerSnapHelper", "recyclerview is null", new Object[0]);
        } else {
            if (this.d != null) {
                b();
            }
            this.d = recyclerView;
            if (this.d != null) {
                a();
            }
        }
    }

    private void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b419cdf1f9539a99edfccb8384f8eb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b419cdf1f9539a99edfccb8384f8eb72");
        } else if (this.d != null) {
            this.d.addOnScrollListener(this.e);
            this.d.setOnFlingListener(this);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da273a39eb4aba1b74d0c681a2467f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da273a39eb4aba1b74d0c681a2467f45");
        } else if (this.d != null) {
            this.c = true;
            this.d.removeOnScrollListener(this.e);
            this.d.setOnFlingListener(null);
        }
    }
}
