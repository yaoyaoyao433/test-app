package com.sankuai.waimai.store.v2.detail.component.mach;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.store.goods.detail.components.subroot.mach.b;
import com.sankuai.waimai.store.v2.detail.component.SGDetailRoundCornerBlock;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@Cube(events = {b.class})
/* loaded from: classes5.dex */
public class SGSyncRenderMachBlock extends SGDetailRoundCornerBlock {
    public static ChangeQuickRedirect m;
    @NonNull
    private com.sankuai.waimai.store.platform.domain.manager.poi.a n;
    private a o;
    private com.sankuai.waimai.store.mach.event.b p;

    public SGSyncRenderMachBlock(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d0a9657698c81cc79f8c46c9315d17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d0a9657698c81cc79f8c46c9315d17");
            return;
        }
        this.p = new com.sankuai.waimai.store.mach.event.b() { // from class: com.sankuai.waimai.store.v2.detail.component.mach.SGSyncRenderMachBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.event.b
            public final void a(com.sankuai.waimai.store.mach.event.a aVar2, String str, Map<String, Object> map) {
                Object[] objArr2 = {aVar2, str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "273f8890d30a4ad439e5743226a1613c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "273f8890d30a4ad439e5743226a1613c");
                } else {
                    SGSyncRenderMachBlock.this.a(new b(aVar2, str, map));
                }
            }
        };
        this.n = aVar;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7948a557eb7ce5e7827401c7aabf0c87", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7948a557eb7ce5e7827401c7aabf0c87");
        }
        FrameLayout frameLayout = new FrameLayout(m());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb60290e2ddac6327b2daa5227e5a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb60290e2ddac6327b2daa5227e5a8b");
            return;
        }
        this.o = aVar;
        if (aVar == null) {
            i().setVisibility(8);
            return;
        }
        try {
            com.sankuai.waimai.store.mach.event.b bVar = this.p;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "24c740c2cc68a04565220ee4360580f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "24c740c2cc68a04565220ee4360580f4");
            } else {
                aVar.b.g = bVar;
            }
            ViewGroup viewGroup = (ViewGroup) i();
            Object[] objArr3 = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0a6b84f9a2986cc94dab98aff29fdd2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0a6b84f9a2986cc94dab98aff29fdd2e");
                return;
            }
            if (aVar.b != null && viewGroup != null && aVar.c != null) {
                viewGroup.removeAllViews();
                if (aVar.c.getParent() != null) {
                    ((ViewGroup) aVar.c.getParent()).removeView(aVar.c);
                }
                viewGroup.addView(aVar.c);
                if (aVar.d) {
                    return;
                }
                Mach f = aVar.b.f();
                if (f != null && f.getRootNode() != null) {
                    f.attachPreRenderNode(f.getRootNode(), null, aVar.c, null);
                    Iterator<com.sankuai.waimai.mach.component.interf.b> it = f.getViewTreeObservers().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    for (g gVar : f.getRenderListeners()) {
                        gVar.b();
                        gVar.a(0);
                    }
                    viewGroup.setVisibility(0);
                    aVar.d = true;
                    return;
                }
                viewGroup.setVisibility(8);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.SGDetailRoundCornerBlock
    public final int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6c22c233f88da6e88c9a27cff38f6b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6c22c233f88da6e88c9a27cff38f6b")).intValue() : b(super.r());
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.SGDetailRoundCornerBlock
    public final int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70199c91c329c905e3691ae9a65bf30e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70199c91c329c905e3691ae9a65bf30e")).intValue() : b(super.s());
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201d90be3628cdb00de62b84e3fddfc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201d90be3628cdb00de62b84e3fddfc6")).intValue();
        }
        int i2 = this.o != null ? this.o.e : -1;
        if (this.n.t()) {
            return 0;
        }
        if (i2 == 10002 || i2 == 10003 || i2 == 10004 || i2 == 10005 || i2 == 10006 || i2 == 10016) {
            return i;
        }
        return 0;
    }
}
