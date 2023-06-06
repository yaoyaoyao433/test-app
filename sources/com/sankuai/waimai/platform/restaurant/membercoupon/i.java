package com.sankuai.waimai.platform.restaurant.membercoupon;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.restaurant.membercoupon.FloatingMemberCouponListClient;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private FloatingMemberCouponListClient b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(k kVar);
    }

    public i(@Nonnull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57a2139ffc54e154f9b958ef224191b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57a2139ffc54e154f9b958ef224191b");
        } else {
            this.b = new FloatingMemberCouponListClient(com.meituan.android.singleton.b.a, dVar.c);
        }
    }

    public final void a(String str, String str2, String str3, final a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e157d182288312e730c12491ddd205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e157d182288312e730c12491ddd205");
        } else {
            this.b.a(str, str2, str3, "order_page", new FloatingMemberCouponListClient.a<k>() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.i.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.FloatingMemberCouponListClient.a
                public final /* synthetic */ void a(k kVar) {
                    k kVar2 = kVar;
                    Object[] objArr2 = {kVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4a49f30877190319ee4a82a3a77aad7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4a49f30877190319ee4a82a3a77aad7");
                    } else {
                        aVar.a(kVar2);
                    }
                }

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.FloatingMemberCouponListClient.a
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2174f92e252400e9554d7b004ee55b45", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2174f92e252400e9554d7b004ee55b45");
                    } else {
                        aVar.a();
                    }
                }
            });
        }
    }
}
