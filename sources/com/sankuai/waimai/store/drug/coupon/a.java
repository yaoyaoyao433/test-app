package com.sankuai.waimai.store.drug.coupon;

import android.app.Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.coupon.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1146a {
        void a();

        void a(long j, String str, DrugMemberCouponStatusResponse drugMemberCouponStatusResponse, List<com.sankuai.waimai.store.drug.coupon.model.a> list, int i, String str2);

        void a(String str, Dialog dialog);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b {
        public static ChangeQuickRedirect a;
        protected InterfaceC1146a b;

        public abstract void a(long j, String str, String str2, Dialog dialog, int i, Poi.PoiCouponItem poiCouponItem);

        public abstract void a(long j, String str, String str2, Dialog dialog, int i, String str3);

        public b(InterfaceC1146a interfaceC1146a) {
            Object[] objArr = {interfaceC1146a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fee1629a272a1dc084135aafd56247", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fee1629a272a1dc084135aafd56247");
            } else {
                this.b = interfaceC1146a;
            }
        }
    }
}
