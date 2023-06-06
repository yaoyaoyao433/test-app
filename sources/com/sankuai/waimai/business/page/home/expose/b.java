package com.sankuai.waimai.business.page.home.expose;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.dynamic.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.business.page.home.expose.a {
    public static ChangeQuickRedirect c;
    public NestedScrollRecyclerView d;
    public a e;
    protected int f;
    protected Rect g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, Rect rect);

        void b(int i, Rect rect);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ffc60b0d29da2874a95808d18130ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ffc60b0d29da2874a95808d18130ca");
        } else {
            this.f = 0;
        }
    }

    public final void a(View view, int i) {
        int i2;
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9380a6e79f326283930aaa5c50bc4d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9380a6e79f326283930aaa5c50bc4d7f");
        } else if (this.d == null || this.e == null) {
        } else {
            RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
            int i3 = -1;
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i3 = linearLayoutManager.findFirstVisibleItemPosition();
                i2 = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                i2 = -1;
            }
            if (!this.o) {
                c(i3);
                d(i2);
                b();
                this.o = true;
                return;
            }
            a(Math.min(i3, this.m), Math.max(i2, this.n));
            c(i3);
            d(i2);
        }
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69ef5b0e6d28a4e7be22b8487f837bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69ef5b0e6d28a4e7be22b8487f837bc");
            return;
        }
        super.a(view);
        if (view instanceof RecyclerView) {
            this.d = (NestedScrollRecyclerView) this.p;
            this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.expose.b.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
    }

    public final void b(int i) {
        this.f = i;
    }

    public Rect ap_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9bfa2e5308b97d17d431777b677dac", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9bfa2e5308b97d17d431777b677dac");
        }
        if (this.g != null) {
            return this.g;
        }
        this.g = new Rect(this.d.getLeft(), this.d.getTop() + this.f, this.d.getRight(), this.d.getBottom());
        return this.g;
    }

    @Override // com.sankuai.waimai.business.page.home.expose.a
    public final boolean a(int i) {
        View findViewByPosition;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d395b4aa0fadce8074b0611462efbff2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d395b4aa0fadce8074b0611462efbff2")).booleanValue() : this.d != null && (findViewByPosition = this.d.getLayoutManager().findViewByPosition(i)) != null && findViewByPosition.getVisibility() == 0 && ah.b(findViewByPosition);
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c7c946ee9b05f0ab11a912cf64d5c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c7c946ee9b05f0ab11a912cf64d5c7");
            return;
        }
        while (i >= 0 && i <= i2) {
            if (this.e != null) {
                this.e.b(i, ap_());
            }
            i++;
        }
    }

    @Override // com.sankuai.waimai.business.page.home.expose.a, com.sankuai.waimai.rocks.expose.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17b76c0ba6a5300c9fc6995f338cb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17b76c0ba6a5300c9fc6995f338cb00");
        } else if (this.m >= 0 && this.m <= this.n) {
            for (int i = this.m; i <= this.n; i++) {
                if (!a((b) Integer.valueOf(i)) && this.e != null && a(i)) {
                    this.e.a(i, ap_());
                }
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf8d62ec35cb83f9e77e27f58e31e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf8d62ec35cb83f9e77e27f58e31e27");
        } else if (this.i != null && this.i.size() != 0) {
            for (int i = 0; i < this.i.size(); i++) {
                if (this.i.get(i) != null) {
                    this.i.get(i).d();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26caae991dd29ddcc21672e58b24e2c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26caae991dd29ddcc21672e58b24e2c6");
            return;
        }
        if (this.d != null && (this.d.getAdapter() instanceof com.sankuai.waimai.business.page.home.basal.a)) {
            List<com.meituan.android.cube.pga.block.a> list = ((com.sankuai.waimai.business.page.home.basal.a) this.d.getAdapter()).c;
            for (int i = 0; i < list.size(); i++) {
                com.meituan.android.cube.pga.block.a aVar = list.get(i);
                if (aVar instanceof com.sankuai.waimai.business.page.common.arch.a) {
                    ((com.sankuai.waimai.business.page.common.arch.a) aVar).N();
                } else if (aVar instanceof g) {
                    g gVar = (g) aVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = g.r;
                    if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "5688fd292f15939afb1502ff806818c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "5688fd292f15939afb1502ff806818c0");
                    } else if (gVar.s != null) {
                        gVar.s.f();
                    }
                }
            }
        }
        super.d();
    }
}
