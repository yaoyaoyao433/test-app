package com.sankuai.waimai.store.mach.kingkongscroller;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends RecyclerView.i {
    public static ChangeQuickRedirect a;
    RecyclerView b;
    int c;
    boolean d;
    final RecyclerView.k e;

    @Override // android.support.v7.widget.RecyclerView.i
    public final boolean onFling(int i, int i2) {
        return false;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508817d1488d2974489f11fef0101727", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508817d1488d2974489f11fef0101727");
            return;
        }
        this.d = true;
        this.e = new RecyclerView.k() { // from class: com.sankuai.waimai.store.mach.kingkongscroller.f.1
            public static ChangeQuickRedirect a;
            public KingKongScrollerLayoutManager b;
            public boolean c = false;
            public boolean d = true;
            public int e = 0;
            public int f = 0;
            public RecyclerView.LayoutManager g;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32d7696c2ac90a19b74653705c4b38ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32d7696c2ac90a19b74653705c4b38ca");
                } else if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                    com.sankuai.waimai.mach.log.b.b("KingKongScrollerSnapHelper", "recyclerview is null or layoutmanager is null", new Object[0]);
                } else {
                    super.onScrollStateChanged(recyclerView, i);
                    if (this.b != null) {
                        if (this.b.b != null) {
                            this.b.b.b(i);
                            if (this.f == 0 && i != 0) {
                                this.b.b.c(f.this.c);
                            }
                            if (this.f != 0 && i == 0) {
                                this.b.b.d(f.this.c);
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0eff14c544e722a486714b1c3cb430dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0eff14c544e722a486714b1c3cb430dd");
                } else if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                    com.sankuai.waimai.mach.log.b.b("KingKongScrollerSnapHelper", "recyclerview is null or layoutmanager is null", new Object[0]);
                } else {
                    if (f.this.d) {
                        f.this.d = false;
                        this.g = recyclerView.getLayoutManager();
                        if (this.g instanceof KingKongScrollerLayoutManager) {
                            this.b = (KingKongScrollerLayoutManager) this.g;
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
                        f.this.c += i;
                        this.d = i > 0;
                        return;
                    }
                    f.this.c += i2;
                    this.d = i2 > 0;
                }
            }
        };
    }
}
