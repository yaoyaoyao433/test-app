package com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserAnimatorModel;
import com.sankuai.waimai.store.manager.marketing.parser.inner.SGBaseTemplateData;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGNewUserOutLinkDialogTemplateData extends SGBaseTemplateData<TemplateData, LogInfo> {
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
        @SerializedName("page_sourse_type")
        public String page_sourse_type;
        @SerializedName("second_category_type")
        public String secondCategoryType;
        @SerializedName("source_id")
        public String source_id;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TemplateData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("redPackage")
        public SGNewUserAnimatorModel redPackage;
        @SerializedName("turnTable")
        public SGNewUserAnimatorModel turnTable;
    }
}
