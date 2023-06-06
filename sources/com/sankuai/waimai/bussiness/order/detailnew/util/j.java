package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static List<String> b = new ArrayList();

    public static /* synthetic */ void a(final String str, long j, String str2, String str3, WMLocation wMLocation) {
        Object[] objArr = {str, new Long(j), str2, str3, wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "216b0ffa629cf046a07619c263c66c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "216b0ffa629cf046a07619c263c66c41");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).reportCustomerLocation(Long.parseLong(str), j, str2, System.currentTimeMillis() / 1000, (long) (wMLocation.getLongitude() * 1000.0d * 1000.0d), (long) (wMLocation.getLatitude() * 1000.0d * 1000.0d)), new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.util.j.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    Object[] objArr2 = {(BaseResponse) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5efd7acfdfcd77e8041d11db082552b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5efd7acfdfcd77e8041d11db082552b");
                    } else {
                        j.b.add(str);
                    }
                }
            }, str3);
        }
    }

    public static void a(FragmentActivity fragmentActivity, final String str, final long j, final String str2, final String str3) {
        Object[] objArr = {fragmentActivity, str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d2735cd0378c0df8a509a5b9931fc08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d2735cd0378c0df8a509a5b9931fc08");
        } else if (TextUtils.isEmpty(str) || b.contains(str)) {
        } else {
            com.sankuai.waimai.foundation.location.v2.g.a().a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.util.j.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
                public final void a(@Nullable WMLocation wMLocation) {
                    Object[] objArr2 = {wMLocation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f46df1a3ea768462b190d38bb98336c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f46df1a3ea768462b190d38bb98336c");
                    } else if (wMLocation == null || wMLocation.getLocationResultCode() == null || wMLocation.getLocationResultCode().a != 1200) {
                    } else {
                        j.a(str, j, str2, str3, wMLocation);
                    }
                }
            }, false, "order_detail_customer_location", false, new com.sankuai.waimai.foundation.location.v2.k(fragmentActivity, "dj-b490da523971aa47"));
        }
    }
}
