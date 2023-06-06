package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HotRankEntity extends StatisticsEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("hot_label_rank_exlpain")
    public String hotLabelRankExlpain;
    @SerializedName("hot_label_rank_exlpain_type")
    public int hotLabelRankExlpainType;
    @SerializedName("hot_num")
    public int hotNum;
    @SerializedName("index_info")
    public IndexInfo indexInfo;
    public boolean isExposed = false;
    @SerializedName("picture")
    public String picture;
    @SerializedName("position_type")
    public int positionType;
    @SerializedName("title")
    public String title;
}
