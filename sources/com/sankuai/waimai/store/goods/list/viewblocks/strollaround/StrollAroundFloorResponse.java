package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class StrollAroundFloorResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2619625472321010559L;
    @SerializedName("common_info")
    public CommonInfo commonInfo;
    public WaterFallMachResponse mAroundAllFoodResponse;
    @SerializedName("module_list")
    public List<BaseModuleDesc> moduleList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CommonInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
