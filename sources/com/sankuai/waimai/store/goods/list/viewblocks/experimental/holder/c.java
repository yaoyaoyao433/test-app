package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.viewblocks.header.GoodsListScrollViewPagerAdapter;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.view.banner.AutoScrollPagerView;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> implements com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a {
    public static ChangeQuickRedirect a;
    private AutoScrollPagerView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_goods_list_layout_main_banner;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccdc2036b55a2c94386cb469b4f5e1ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccdc2036b55a2c94386cb469b4f5e1ac");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8321af29734c2d69f5dc47c754f1c37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8321af29734c2d69f5dc47c754f1c37");
        } else if (gVar2 != null) {
            List<PoiOperationItem> list = gVar2.j;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "730c0a81f6b773b6ee9d5deaeb75b273", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "730c0a81f6b773b6ee9d5deaeb75b273");
            } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                if (this.b.d()) {
                    a(true);
                }
                this.b.a(list, new GoodsListScrollViewPagerAdapter(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), list, ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).i(), new BannerPagerAdapter.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    public final int a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cf56db2c3cd036a6bededc25a55c693", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cf56db2c3cd036a6bededc25a55c693")).intValue() : com.sankuai.shangou.stone.util.h.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) c.this.o).j(), 6.0f);
                    }

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    @NonNull
                    public final ImageView.ScaleType b() {
                        return ImageView.ScaleType.FIT_XY;
                    }
                }));
                if (list.size() > 1) {
                    this.b.b();
                }
            } else {
                this.b.c();
                if (this.b.d()) {
                    a(false);
                }
            }
        } else {
            this.b.setVisibility(8);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b5f632d0e1ab7f69591f0cd8cda8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b5f632d0e1ab7f69591f0cd8cda8f7");
        } else if (this.b.d()) {
            if (z) {
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbf126081f2042a6404a8340c448b64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbf126081f2042a6404a8340c448b64");
            return;
        }
        this.b = (AutoScrollPagerView) view.findViewById(R.id.rl_ad);
        ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).a(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b0fcefd618ed8df5e138eac9e22173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b0fcefd618ed8df5e138eac9e22173");
        } else {
            this.b.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9820b0108669bc8e24a8731199dd7155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9820b0108669bc8e24a8731199dd7155");
        } else {
            this.b.c();
        }
    }
}
