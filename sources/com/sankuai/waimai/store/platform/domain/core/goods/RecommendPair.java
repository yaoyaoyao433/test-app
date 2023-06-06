package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class RecommendPair extends BaseDataResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("legal_text")
    public String legalText;
    @SerializedName("main_title")
    public String mainTitle;
    @SerializedName("scene_id")
    public String sceneId;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("scheme_text")
    public String schemeText;
    public transient int scrollOffset;
    public transient int scrollPosition;
    @SerializedName("spus")
    public List<GoodsSpu> spus;
    @SerializedName("sub_title")
    public String subTitle;
    public transient boolean isRecommendPairAnimated = false;
    @SerializedName("collocate_frequency_num")
    public int collocateFrequencyNum = -1;
    @SerializedName("module_type")
    public int moduleType = 0;
}
