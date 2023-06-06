package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends RecyclerView.i {
    public static ChangeQuickRedirect a;
    protected RecyclerView b;
    protected Scroller c;
    boolean d;
    private final RecyclerView.k e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b6f58a3b86f4bad2099edce0bd86b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b6f58a3b86f4bad2099edce0bd86b2");
            return;
        }
        this.d = false;
        this.e = new RecyclerView.k() { // from class: com.sankuai.waimai.mach.component.swiper.recyclerview.a.1
            public static ChangeQuickRedirect a;
            public boolean b = false;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "457ccb3ca2612ad7d1ca755d4cf24f20", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "457ccb3ca2612ad7d1ca755d4cf24f20");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (recyclerView.getLayoutManager() instanceof ViewPagerLayoutManager) {
                    ViewPagerLayoutManager viewPagerLayoutManager = (ViewPagerLayoutManager) recyclerView.getLayoutManager();
                    ViewPagerLayoutManager.a aVar = viewPagerLayoutManager.m;
                    if (i == 0 && this.b) {
                        this.b = false;
                        if (!a.this.d) {
                            a.this.d = true;
                            a.this.a(viewPagerLayoutManager, aVar);
                            return;
                        }
                        a.this.d = false;
                    }
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i == 0 && i2 == 0) {
                    return;
                }
                this.b = true;
            }
        };
    }

    @Override // android.support.v7.widget.RecyclerView.i
    public boolean onFling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d6d2efb88e6d70fb82712f6a98d887", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d6d2efb88e6d70fb82712f6a98d887")).booleanValue();
        }
        ViewPagerLayoutManager viewPagerLayoutManager = (ViewPagerLayoutManager) this.b.getLayoutManager();
        if (viewPagerLayoutManager == null || this.b.getAdapter() == null) {
            return false;
        }
        if (viewPagerLayoutManager.n || !(viewPagerLayoutManager.i == viewPagerLayoutManager.d() || viewPagerLayoutManager.i == viewPagerLayoutManager.e())) {
            int minFlingVelocity = this.b.getMinFlingVelocity();
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (viewPagerLayoutManager.e == 1 && Math.abs(i2) > minFlingVelocity) {
                int g = viewPagerLayoutManager.g();
                int finalY = (int) ((this.c.getFinalY() / viewPagerLayoutManager.l) / viewPagerLayoutManager.b());
                e.a(this.b, viewPagerLayoutManager, viewPagerLayoutManager.getReverseLayout() ? (-g) - finalY : g + finalY);
                return true;
            } else if (viewPagerLayoutManager.e != 0 || Math.abs(i) <= minFlingVelocity) {
                return true;
            } else {
                int g2 = viewPagerLayoutManager.g();
                int finalX = (int) ((this.c.getFinalX() / viewPagerLayoutManager.l) / viewPagerLayoutManager.b());
                e.a(this.b, viewPagerLayoutManager, viewPagerLayoutManager.getReverseLayout() ? (-g2) - finalX : g2 + finalX);
                return true;
            }
        }
        return false;
    }

    public void a(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae4b8f956e6d034e35ac53c8630701e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae4b8f956e6d034e35ac53c8630701e");
        } else if (this.b == recyclerView) {
        } else {
            if (this.b != null) {
                b();
            }
            this.b = recyclerView;
            if (this.b == null || !(this.b.getLayoutManager() instanceof ViewPagerLayoutManager)) {
                return;
            }
            a();
            this.c = new Scroller(this.b.getContext(), new DecelerateInterpolator());
        }
    }

    public final void a(ViewPagerLayoutManager viewPagerLayoutManager, ViewPagerLayoutManager.a aVar) {
        Object[] objArr = {viewPagerLayoutManager, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef26be09b5c02910879532922b85510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef26be09b5c02910879532922b85510");
            return;
        }
        int i = viewPagerLayoutManager.i();
        if (i != 0) {
            if (viewPagerLayoutManager.getOrientation() == 1) {
                this.b.smoothScrollBy(0, i);
            } else {
                this.b.smoothScrollBy(i, 0);
            }
        } else {
            this.d = false;
        }
        if (viewPagerLayoutManager.h() >= viewPagerLayoutManager.d()) {
            this.d = false;
        }
        if (aVar != null) {
            aVar.a(viewPagerLayoutManager.f());
        }
    }

    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6648d22cd8a90d1cfa87fb0891c0af6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6648d22cd8a90d1cfa87fb0891c0af6a");
        } else if (this.b != null) {
            this.b.addOnScrollListener(this.e);
            this.b.setOnFlingListener(this);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebaeb9269744a7e928a0596a68e20ef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebaeb9269744a7e928a0596a68e20ef8");
        } else if (this.b != null) {
            this.b.removeOnScrollListener(this.e);
            this.b.setOnFlingListener(null);
        }
    }
}
