package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.android.cube.pga.block.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.rocks.expose.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.business.page.home.expose.a {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    public Rect c;
    public a d;
    private c e;
    private boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, Rect rect);
    }

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97eb270ee9bb5c40313862c98a47b6e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97eb270ee9bb5c40313862c98a47b6e7");
            return;
        }
        this.f = false;
        this.e = cVar;
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7487b595990988f7c1701eb05f5824f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7487b595990988f7c1701eb05f5824f");
            return;
        }
        super.a(view);
        if (view instanceof RecyclerView) {
            this.b = (RecyclerView) this.p;
        }
    }

    @Override // com.sankuai.waimai.business.page.home.expose.a
    public final boolean a(int i) {
        View findViewByPosition;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f065deb05921c5ede35a2fcdd676d71", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f065deb05921c5ede35a2fcdd676d71")).booleanValue() : this.b != null && (findViewByPosition = this.b.getLayoutManager().findViewByPosition(i)) != null && findViewByPosition.getVisibility() == 0 && ah.b(findViewByPosition);
    }

    @Override // com.sankuai.waimai.business.page.home.expose.a, com.sankuai.waimai.rocks.expose.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87cd804762109551f6e256e8e2714cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87cd804762109551f6e256e8e2714cc");
        } else if (this.m >= 0 && this.m <= this.n) {
            for (int i = this.m; i <= this.n; i++) {
                com.meituan.android.cube.pga.block.a b = this.e.b(i);
                Rect rect = this.c;
                if (b != null && rect != null && b.G() != 0) {
                    int hashCode = b.G().hashCode();
                    if (!a((b) Integer.valueOf(hashCode)) && this.d != null) {
                        com.sankuai.waimai.foundation.utils.log.a.b("feedbackdddddd", "isViewOnScreen  " + a(i), new Object[0]);
                        if (a(i)) {
                            this.d.a(i, rect);
                            b(Integer.valueOf(hashCode));
                        }
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f80e56f4d19c172d9c8ca130ef912a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f80e56f4d19c172d9c8ca130ef912a");
            return;
        }
        this.f = false;
        super.d();
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892e19f95ed5a683062d1b3bf9e29644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892e19f95ed5a683062d1b3bf9e29644");
            return;
        }
        this.f = false;
        super.a();
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void aq_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74231da2171447f5bad528702f5e97da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74231da2171447f5bad528702f5e97da");
            return;
        }
        f.a aVar = new f.a(f.b.REFRESH);
        aVar.c = true;
        a(aVar.a());
    }
}
