package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessTagResponse;
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    final e b;
    boolean c;
    int d;
    boolean e;
    private com.sankuai.waimai.store.goods.list.viewblocks.content.model.a f;

    public f(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2cd23653af0d183aa5d8c472780c74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2cd23653af0d183aa5d8c472780c74");
            return;
        }
        this.b = eVar;
        this.f = new com.sankuai.waimai.store.goods.list.viewblocks.content.model.a(eVar.d());
        this.f.b = eVar.j();
    }

    public final void a(PoiGuessULikeSpuTag poiGuessULikeSpuTag) {
        Object[] objArr = {poiGuessULikeSpuTag};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6b4c244abb9e46a28f1405d3e488897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6b4c244abb9e46a28f1405d3e488897");
        } else if (poiGuessULikeSpuTag == null) {
        } else {
            if (TextUtils.equals(poiGuessULikeSpuTag.tagName, "猜你喜欢")) {
                a();
            } else {
                a(poiGuessULikeSpuTag, new k<MarketGuessTagResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Object obj) {
                        MarketGuessTagResponse marketGuessTagResponse = (MarketGuessTagResponse) obj;
                        Object[] objArr2 = {marketGuessTagResponse};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e46907195759f1f13350ade89d2d287e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e46907195759f1f13350ade89d2d287e");
                            return;
                        }
                        f.this.b.bi_();
                        f.this.b.a(marketGuessTagResponse);
                        f.this.b.bj_();
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "305ff84e7db114120acacb93ec176ae2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "305ff84e7db114120acacb93ec176ae2");
                        } else {
                            f.this.b.bi_();
                        }
                    }
                });
            }
        }
    }

    private void a(PoiGuessULikeSpuTag poiGuessULikeSpuTag, k<MarketGuessTagResponse> kVar) {
        Object[] objArr = {poiGuessULikeSpuTag, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51dd67423406a49f8fb6046e36b11d10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51dd67423406a49f8fb6046e36b11d10");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.d().l()).a(poiGuessULikeSpuTag.tagId, poiGuessULikeSpuTag.extra, poiGuessULikeSpuTag.tagType, this.b.d().d().f(), this.b.d().d().h(), this.b.j(), kVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15308d3c21393e680c360ee41e30a7fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15308d3c21393e680c360ee41e30a7fe");
        } else if (this.c) {
        } else {
            this.c = true;
            this.f.a(this.d, new k<MarketGuessResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    MarketGuessResponse marketGuessResponse = (MarketGuessResponse) obj;
                    Object[] objArr2 = {marketGuessResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2759f5f7a78096817843029194ca5690", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2759f5f7a78096817843029194ca5690");
                        return;
                    }
                    f.this.e = marketGuessResponse.f;
                    f.this.d = marketGuessResponse.e + 1;
                    if (!marketGuessResponse.f) {
                        f.this.b.bj_();
                    }
                    f.this.b.bi_();
                    f.this.b.a(marketGuessResponse);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e8f2341d16486a7ecef72d0b824dd25", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e8f2341d16486a7ecef72d0b824dd25");
                    } else {
                        f.this.b.bi_();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "400facdf50e55a208a143e5c1f1d4b7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "400facdf50e55a208a143e5c1f1d4b7c");
                    } else {
                        f.this.c = false;
                    }
                }
            });
        }
    }
}
