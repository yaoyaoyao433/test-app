package com.sankuai.waimai.bussiness.order.confirm.model.ap;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ApDataWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("native_bottom_tip")
    public List<b> bottomPayTipList;
    @SerializedName("mach_patient_info_wx")
    public List<b> patientInfoPayWayList;
    @SerializedName("wm-submit-order-poi-coupon-guide")
    public List<b> poiCouponGuideList;
    @SerializedName("wm-submit-order-poi-coupon-package-detail")
    public List<b> poiCouponPkgDetailList;

    public b getBottomPayTipData(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c606885ff0cb5817df537323e709e32a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c606885ff0cb5817df537323e709e32a") : getInternal(str, this.bottomPayTipList);
    }

    public b getPoiCouponGuideData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d7aa8b5db3b2ce3d597eaa4de041e07", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d7aa8b5db3b2ce3d597eaa4de041e07") : getInternal(null, this.poiCouponGuideList);
    }

    public b getPoiCouponPkgDetailData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d998bffdac4a6f35fa8a7cb272d36b4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d998bffdac4a6f35fa8a7cb272d36b4") : getInternal(null, this.poiCouponPkgDetailList);
    }

    public b getBottomPayTipData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b773ddbd67a66a0831676fa7b8833fd8", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b773ddbd67a66a0831676fa7b8833fd8") : getInternal(null, this.bottomPayTipList);
    }

    public b getPatientInfoPayWayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad10779d613502b8d71ea50f5ac47c43", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad10779d613502b8d71ea50f5ac47c43") : getInternal(null, this.patientInfoPayWayList);
    }

    private b getInternal(@Nullable String str, @Nullable List<b> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6e8c854a92675d12cb68285ae758cd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6e8c854a92675d12cb68285ae758cd1");
        }
        if (d.a(list)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return list.get(0);
        }
        return matchType(str, list);
    }

    private b matchType(@NonNull String str, @NonNull List<b> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cddef0c005ea73f0c4123a47815e36c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cddef0c005ea73f0c4123a47815e36c6");
        }
        for (b bVar : list) {
            if (bVar != null && str.equals(bVar.d)) {
                return bVar;
            }
        }
        return null;
    }
}
