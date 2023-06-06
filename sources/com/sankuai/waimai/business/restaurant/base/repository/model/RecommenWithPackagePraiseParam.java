package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommenWithPackagePraiseParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("sku_id")
    private long skuId;
    @SerializedName("spu_id")
    private long spuId;

    public long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b6c04c99412820df0baf3c142fdec5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b6c04c99412820df0baf3c142fdec5f");
        } else {
            this.skuId = j;
        }
    }

    public long getSpuId() {
        return this.spuId;
    }

    public void setSpuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72e8054e27e4e284b64d5cc13dcb8717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72e8054e27e4e284b64d5cc13dcb8717");
        } else {
            this.spuId = j;
        }
    }
}
