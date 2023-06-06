package com.sankuai.waimai.store.orderlist.presenter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.order.detail.model.OrderDetailRecommendResponse;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;
    public boolean c;
    public String d;
    private final int e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236ab1221c72b33927b24f6830ba9053", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236ab1221c72b33927b24f6830ba9053");
            return;
        }
        this.e = 50;
        this.b = 0;
        this.c = true;
        this.d = "";
    }

    public final void a(@NonNull String str, @NonNull String str2, @Nonnull final a<OrderDetailRecommendResponse> aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4caff768d256a1d4785684982342ccba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4caff768d256a1d4785684982342ccba");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a("", str2, 50, this.b, this.d, new k<OrderDetailRecommendResponse>() { // from class: com.sankuai.waimai.store.orderlist.presenter.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    OrderDetailRecommendResponse orderDetailRecommendResponse = (OrderDetailRecommendResponse) obj;
                    Object[] objArr2 = {orderDetailRecommendResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34225be9c1e64b9acfdba61548d4e4db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34225be9c1e64b9acfdba61548d4e4db");
                        return;
                    }
                    super.a((AnonymousClass1) orderDetailRecommendResponse);
                    boolean z = b.this.b > 0;
                    b.this.c = orderDetailRecommendResponse.hasNextPageCard;
                    if (!p.a(orderDetailRecommendResponse.extendInfo) && !TextUtils.isEmpty(orderDetailRecommendResponse.extendInfo.rankTraceId)) {
                        b.this.d = orderDetailRecommendResponse.extendInfo.rankTraceId;
                    }
                    if (orderDetailRecommendResponse.isValid()) {
                        aVar.a(orderDetailRecommendResponse, !z);
                    }
                    aVar.b();
                    b.this.b++;
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93899e49ea966ea33b2336639616c8ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93899e49ea966ea33b2336639616c8ae");
                    } else {
                        aVar.a();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f417b6a8926f3c944712b4fb9f6f438a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f417b6a8926f3c944712b4fb9f6f438a");
                        return;
                    }
                    super.a(bVar);
                    aVar.c();
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7df63dedad3f8867d3cf97610807a227", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7df63dedad3f8867d3cf97610807a227");
                        return;
                    }
                    super.b();
                    aVar.d();
                }
            });
        }
    }

    public final void a() {
        this.b = 0;
        this.d = "";
    }
}
