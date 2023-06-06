package com.sankuai.waimai.store.drug.search.common.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.drug.search.common.model.NoResultNonDeliveryEntity;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NoResultRemindInfoData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("no_result_change_tag_context")
    public String buttonText;
    @SerializedName("explain_text")
    public String explainText;
    @SerializedName("fullpage")
    public int fullPage;
    @SerializedName("no_result_remind_additional_context")
    public String noResultRemindAdditionalContext;
    @SerializedName("no_result_remind_context")
    public String noResultRemindContext;
    @SerializedName("no_result_remind_icon")
    public String noResultRemindIcon;
    @SerializedName("no_result_recommend_type")
    public String noResultType;
    @SerializedName("search_button")
    public NoResultNonDeliveryEntity.SearchButton searchButton;
    @SerializedName("no_result_change_tag_code")
    public String tabCode;
}
