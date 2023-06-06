package com.sankuai.waimai.store.coupon;

import android.app.Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.coupon.a;
import com.sankuai.waimai.store.repository.model.MemberCouponStatusResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a.b {
    public static ChangeQuickRedirect c;

    public c(a.InterfaceC1143a interfaceC1143a) {
        super(interfaceC1143a);
        Object[] objArr = {interfaceC1143a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bbc9ba17ace5c722a04ba1292ee1d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bbc9ba17ace5c722a04ba1292ee1d51");
        }
    }

    @Override // com.sankuai.waimai.store.coupon.a.b
    public final void a(final long j, final String str, String str2, Dialog dialog) {
        Object[] objArr = {new Long(j), str, str2, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7879cb4f2c8ccff4b61fe5e50eff624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7879cb4f2c8ccff4b61fe5e50eff624");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str2).a(j, str, new j<MemberCouponStatusResponse>() { // from class: com.sankuai.waimai.store.coupon.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(MemberCouponStatusResponse memberCouponStatusResponse) {
                    MemberCouponStatusResponse memberCouponStatusResponse2 = memberCouponStatusResponse;
                    Object[] objArr2 = {memberCouponStatusResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b87828f8b11ac4b14f8dcac51060ed9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b87828f8b11ac4b14f8dcac51060ed9b");
                    } else if (memberCouponStatusResponse2.cardInfo != null) {
                        c.this.b.a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, j), memberCouponStatusResponse2.title, memberCouponStatusResponse2.subTitle, memberCouponStatusResponse2.cardInfo.logoUrl, memberCouponStatusResponse2.cardInfo.brandName, memberCouponStatusResponse2.scheme, null);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44800b8e8f117b97964b3510883514be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44800b8e8f117b97964b3510883514be");
                    } else {
                        c.this.b.a();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a53dd12fbde52619b4878768c4370e08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a53dd12fbde52619b4878768c4370e08");
                    } else {
                        c.this.b.a(bVar.b, r5);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd41c9f9337f2db4b06b22a55b40fde0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd41c9f9337f2db4b06b22a55b40fde0");
                    } else {
                        c.this.b.b();
                    }
                }
            });
        }
    }
}
