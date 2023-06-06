package com.sankuai.waimai.store.goods.detail.mach;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.poilist.mach.b;
import java.util.List;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class GuessLikeMachItemBlock extends j implements a.InterfaceC1221a {
    public static ChangeQuickRedirect g;
    public ViewGroup h;
    public ViewGroup i;
    public b j;
    public c k;
    private View l;

    @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
    public final void d_(int i) {
    }

    public static /* synthetic */ void a(GuessLikeMachItemBlock guessLikeMachItemBlock, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, guessLikeMachItemBlock, changeQuickRedirect, false, "937b9a88528dba66a9e1594101f11f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, guessLikeMachItemBlock, changeQuickRedirect, false, "937b9a88528dba66a9e1594101f11f64");
        } else if (aVar.f != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = aVar.f.searchNodeWithViewReport();
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                return;
            }
            for (final com.sankuai.waimai.mach.node.a aVar2 : searchNodeWithViewReport) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = g;
                if (PatchProxy.isSupport(objArr2, guessLikeMachItemBlock, changeQuickRedirect2, false, "a7aff76e106b6cde7d05675d2ca78578", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, guessLikeMachItemBlock, changeQuickRedirect2, false, "a7aff76e106b6cde7d05675d2ca78578");
                } else if (aVar2 != null) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = g;
                    if (PatchProxy.isSupport(objArr3, guessLikeMachItemBlock, changeQuickRedirect3, false, "6bb19d1a54fd9af3df4a488cb75835e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, guessLikeMachItemBlock, changeQuickRedirect3, false, "6bb19d1a54fd9af3df4a488cb75835e5");
                    } else if (aVar2 != null && aVar2.g() != null) {
                        String str = null;
                        if (aVar2.h() != null && aVar2.h().containsKey("sg-detail-expose-unique-key")) {
                            str = String.valueOf(aVar2.h().get("sg-detail-expose-unique-key"));
                        }
                        if (t.a(str)) {
                            str = String.valueOf(System.identityHashCode(aVar2));
                        }
                        com.sankuai.waimai.store.expose.v2.entity.a aVar3 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar2.g(), str);
                        aVar3.a(new c.a() { // from class: com.sankuai.waimai.store.goods.detail.mach.GuessLikeMachItemBlock.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e1bf78f1212218036555f6c4d5e77637", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e1bf78f1212218036555f6c4d5e77637");
                                } else {
                                    aVar2.f.triggerViewReport(aVar2);
                                }
                            }
                        });
                        com.sankuai.waimai.store.expose.v2.b.a().a(guessLikeMachItemBlock.l(), aVar3);
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View i() {
        return this.l;
    }

    public GuessLikeMachItemBlock(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079414952c0acdfb803cacb0e57ba428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079414952c0acdfb803cacb0e57ba428");
        } else {
            this.j = bVar;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ed646c8aea4bf1855927c6925cde3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ed646c8aea4bf1855927c6925cde3b");
        } else {
            super.a_(view);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96d12219772654c552ee18c84c0fc19b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96d12219772654c552ee18c84c0fc19b");
        }
        View inflate = LayoutInflater.from(m()).inflate(R.layout.wm_sc_nox_search_layout_store_mach_block, viewGroup, false);
        this.h = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
        this.i = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
        this.l = inflate;
        return inflate;
    }
}
