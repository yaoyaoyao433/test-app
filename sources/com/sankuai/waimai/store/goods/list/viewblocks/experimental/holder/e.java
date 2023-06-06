package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> implements com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.viewblocks.header.basic.c b;
    private com.sankuai.waimai.store.goods.list.delegate.d c;
    private View d;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_goods_list_layout_experimental_coupon;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c6cd7a273c332cb169df5aa209fd58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c6cd7a273c332cb169df5aa209fd58");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void c() {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5688d8f18af33a856654e0bf13b9aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5688d8f18af33a856654e0bf13b9aa");
        } else if (gVar2 != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) gVar2.m)) {
            for (BaseModuleDesc baseModuleDesc : gVar2.m) {
                if (baseModuleDesc != null && TextUtils.equals(baseModuleDesc.moduleId, "food_discount") && TextUtils.equals(baseModuleDesc.nativeId, "mach") && TextUtils.equals(baseModuleDesc.templateId, "supermarket-poi-header-coupon-info")) {
                    u.a(this.d);
                    if (this.b != null) {
                        com.sankuai.waimai.store.goods.list.viewblocks.header.basic.c cVar = this.b;
                        Object[] objArr2 = {gVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.header.basic.c.a;
                        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "ce7700ff26ca35097d7f627d770f7df2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "ce7700ff26ca35097d7f627d770f7df2");
                            return;
                        } else if (cVar.c == null || gVar2 == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) gVar2.m)) {
                            return;
                        } else {
                            if (cVar.b.j() != null) {
                                cVar.b.j().recordStep("union_feeds_render_start");
                            }
                            cVar.c.a(gVar2.m);
                            if (cVar.b.j() != null) {
                                cVar.b.j().recordStep("union_feeds_render_end");
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public e(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d681f1bab4c2fdefcae2f9d2816cde4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d681f1bab4c2fdefcae2f9d2816cde4");
        } else {
            this.c = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78da7f84bf742800deee610015896964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78da7f84bf742800deee610015896964");
            return;
        }
        ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).a(this);
        this.b = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.c(view.getContext(), this.c);
        this.b.createAndReplaceView(view, R.id.coupon_mach_layout);
        this.d = view.findViewById(R.id.coupon_mach_layout);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63907355bc167bf794e1d85da8d6377e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63907355bc167bf794e1d85da8d6377e");
        } else if (this.b != null) {
            this.b.onDestroy();
        }
    }
}
