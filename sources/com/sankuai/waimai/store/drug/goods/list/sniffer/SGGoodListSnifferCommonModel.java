package com.sankuai.waimai.store.drug.goods.list.sniffer;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGoodListSnifferCommonModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("buz_type")
    public int buzType;
    @SerializedName("x_env")
    public String env;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
}
