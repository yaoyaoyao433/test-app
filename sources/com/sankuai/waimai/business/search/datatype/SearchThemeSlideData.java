package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.search.statistics.StatisticsEntity;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SearchThemeSlideData extends StatisticsEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isExposed = false;
    @SerializedName("template_data")
    public Map<String, Object> templateData;
    @SerializedName("template_id")
    public String templateId;
}
