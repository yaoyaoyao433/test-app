package com.sankuai.waimai.store.goods.list.viewblocks.content.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.viewblocks.content.view.a b;
    boolean c;
    int d;
    public boolean e;
    private com.sankuai.waimai.store.goods.list.viewblocks.content.model.a f;

    public a(com.sankuai.waimai.store.goods.list.viewblocks.content.view.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d0194e078ce629c309bd377ba20d25f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d0194e078ce629c309bd377ba20d25f");
            return;
        }
        this.b = aVar;
        this.f = new com.sankuai.waimai.store.goods.list.viewblocks.content.model.a(aVar.d());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ddad990a9ce6800e44d478994865c2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ddad990a9ce6800e44d478994865c2a");
        } else if (this.c) {
        } else {
            this.c = true;
            this.f.b(this.d, new k<MarketGuessResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    MarketGuessResponse marketGuessResponse = (MarketGuessResponse) obj;
                    Object[] objArr2 = {marketGuessResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adb574b9259bb84c7bc604e5467d087a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adb574b9259bb84c7bc604e5467d087a");
                    } else if (a.this.b != null) {
                        a.this.e = marketGuessResponse.f;
                        a.this.d = marketGuessResponse.e + 1;
                        if (!marketGuessResponse.f) {
                            a.this.b.bj_();
                        }
                        a.this.b.bi_();
                        a.this.b.a(marketGuessResponse);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bda7344480472b2fff3f58402b045f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bda7344480472b2fff3f58402b045f1");
                    } else if (a.this.b == null) {
                    } else {
                        a.this.b.bi_();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14915ca46856dc9dd99cadf30ad2d239", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14915ca46856dc9dd99cadf30ad2d239");
                    } else {
                        a.this.c = false;
                    }
                }
            });
        }
    }
}
