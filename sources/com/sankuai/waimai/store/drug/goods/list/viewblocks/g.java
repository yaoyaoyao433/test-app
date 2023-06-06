package com.sankuai.waimai.store.drug.goods.list.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.adapter.DrugComposeShopPageAdapter;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends DrugComposeShopPageBlock {
    public static ChangeQuickRedirect b;

    public g(com.sankuai.waimai.store.drug.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1f7afcaf9c061ca209ad4f5ca73ca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1f7afcaf9c061ca209ad4f5ca73ca4");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final DrugComposeShopPageAdapter a(Context context, com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, FragmentManager fragmentManager) {
        Object[] objArr = {context, dVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33beb5deb99f8a9c41a9dc76453496e", RobustBitConfig.DEFAULT_VALUE) ? (DrugComposeShopPageAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33beb5deb99f8a9c41a9dc76453496e") : new a(context, dVar, fragmentManager);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends DrugComposeShopPageAdapter {
        public static ChangeQuickRedirect e;

        public a(Context context, com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, FragmentManager fragmentManager) {
            super(context, dVar, fragmentManager);
            Object[] objArr = {context, dVar, fragmentManager};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3162b75d9fd591bc7eddbfdb46ebd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3162b75d9fd591bc7eddbfdb46ebd4");
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.adapter.DrugComposeShopPageAdapter
        public final com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a a(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, b.a aVar, boolean z) {
            Object[] objArr = {dVar, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = e;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89e0da003a36f6e96b9eb90e62a3a98", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89e0da003a36f6e96b9eb90e62a3a98") : new b(dVar, null, z);
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.adapter.DrugComposeShopPageAdapter, com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.SGCachePagerAdapter
        public final com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = e;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341b860d5d334cbb1b84d26301d338aa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341b860d5d334cbb1b84d26301d338aa") : super.a(viewGroup, i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a {
        public static ChangeQuickRedirect a;
        private boolean l;
        private long m;

        public b(@NonNull @NotNull com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, b.a aVar, boolean z) {
            super(dVar, aVar, z);
            Object[] objArr = {dVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae29c7bedd2c3ed765b5eaf42c41e2d6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae29c7bedd2c3ed765b5eaf42c41e2d6");
            } else {
                this.m = -1L;
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.b
        public final void b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadbb06fdc9b299cd73af004cdeaed0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadbb06fdc9b299cd73af004cdeaed0b");
            } else {
                this.m = j;
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.b
        public final void a(RestMenuResponse restMenuResponse) {
            Object[] objArr = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e3fcc2f013c6342c08cc05be098c75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e3fcc2f013c6342c08cc05be098c75");
                return;
            }
            this.f = restMenuResponse;
            if (this.c) {
                if (this.f == null || com.sankuai.shangou.stone.util.a.b(this.f.mGoodPoiCategoryList)) {
                    a(-1L);
                    b(this.f);
                    if (restMenuResponse != null && DrugShopStatusViewModel.a(restMenuResponse)) {
                        j();
                    }
                } else {
                    a((IMarketResponse) this.f);
                    if (DrugShopStatusViewModel.a(restMenuResponse)) {
                        j();
                    } else {
                        i();
                    }
                }
                this.l = true;
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fb74e18d8b00fda6d29062a0ff35c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fb74e18d8b00fda6d29062a0ff35c2");
                return;
            }
            super.a(z);
            if (this.l) {
                return;
            }
            a(this.m);
            b(this.f);
            this.l = true;
        }
    }
}
