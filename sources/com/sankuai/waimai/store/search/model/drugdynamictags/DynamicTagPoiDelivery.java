package com.sankuai.waimai.store.search.model.drugdynamictags;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DynamicTagPoiDelivery implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("kano_tag_extension")
    public DrugSearchDeliveryExtraInfo kanoTagExtension;
    @SerializedName("drug_poi_right_top")
    public List<SGSearchTagInfo> mDrugPoiImgRightTopIcon;
    @SerializedName("drug_search_xgc_left_up")
    public List<SGSearchTagInfo> mDrugPoiProductLeftTopIcon;
    @SerializedName("poi_delivery")
    public List<SGSearchTagInfo> mDrugSearchTagInfo;
    @SerializedName("delivery_info")
    public List<SGSearchTagInfo> productDeliveryInfo;
    @SerializedName("spu_delivery")
    public List<SGSearchTagInfo> productDeliveryType;
    @SerializedName("spu_left_up")
    public List<SGSearchTagInfo> productLeftTopTagInfo;
}
