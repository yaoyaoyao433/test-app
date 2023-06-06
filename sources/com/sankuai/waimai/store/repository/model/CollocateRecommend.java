package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CollocateRecommend implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -668074076976127437L;
    @SerializedName("main_title")
    public String mainTitle;
    @SerializedName("scene_id")
    public String sceneId;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("scheme_text")
    public String schemeText;
    @SerializedName("spus")
    public List<GoodsSpu> spus;
    @SerializedName("sub_title")
    public String subTitle;
}
