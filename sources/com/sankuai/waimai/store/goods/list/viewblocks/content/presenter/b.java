package com.sankuai.waimai.store.goods.list.viewblocks.content.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.viewblocks.content.view.a b;
    public com.sankuai.waimai.store.goods.list.viewblocks.content.model.a c;
    boolean d;
    int e;
    public boolean f;

    public b(com.sankuai.waimai.store.goods.list.viewblocks.content.view.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6b66e75d4439d96ff915ef82436cef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6b66e75d4439d96ff915ef82436cef");
            return;
        }
        this.b = aVar;
        this.c = new com.sankuai.waimai.store.goods.list.viewblocks.content.model.a(aVar.d());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfedefd0e9669bc3f2328a5965797c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfedefd0e9669bc3f2328a5965797c4f");
        } else if (this.d) {
        } else {
            this.d = true;
            this.c.a(this.e, new k<MarketGuessResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    MarketGuessResponse marketGuessResponse = (MarketGuessResponse) obj;
                    Object[] objArr2 = {marketGuessResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c153f8d641f595094e316f762646286", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c153f8d641f595094e316f762646286");
                        return;
                    }
                    b.this.f = marketGuessResponse.f;
                    b.this.e = marketGuessResponse.e + 1;
                    if (!marketGuessResponse.f) {
                        b.this.b.bj_();
                    }
                    b.this.b.bi_();
                    b.this.b.a(marketGuessResponse);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39dbe8ebb1fe4e200a3e701d5d8a5e68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39dbe8ebb1fe4e200a3e701d5d8a5e68");
                    } else {
                        b.this.b.bi_();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18e0f18ffb57ab38b40002f89bb2442e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18e0f18ffb57ab38b40002f89bb2442e");
                    } else {
                        b.this.d = false;
                    }
                }
            });
        }
    }
}
