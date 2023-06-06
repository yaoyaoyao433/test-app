package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ScanProductResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("scan_product_info")
    public List<GoodsSpu> productSpuList;
    @SerializedName("upc_code")
    public String upcCode;
}
