package com.sankuai.waimai.store.manager.marketing.parser.inner.anim;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.manager.marketing.parser.inner.SGBaseTemplateData;
import com.sankuai.waimai.store.manager.preload.ResourcePreloadItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGAnimMarketingDialogTemplateData extends SGBaseTemplateData<TemplateData, LogInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LogInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("category_type")
        public String categoryType;
        @SerializedName("page_type")
        public String pageType;
        @SerializedName("second_category_type")
        public String secondCategoryType;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ResourceItem extends ResourcePreloadItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("loop")
        public int loop;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TemplateData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("resource")
        public List<ResourceItem> resource;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
    }
}
