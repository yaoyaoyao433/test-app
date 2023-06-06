package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGNewUserLandPoisResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pois")
    public List<BaseModuleDesc> pois;
    @SerializedName("title")
    public BaseModuleDesc title;
}
