package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.search.model.NoResultNonDeliveryEntity;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NoResultRemindInfoData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("explain_text")
    public String explainText;
    @SerializedName("no_result_remind_additional_context")
    public String noResultRemindAdditionalContext;
    @SerializedName("no_result_remind_context")
    public String noResultRemindContext;
    @SerializedName("no_result_remind_icon")
    public String noResultRemindIcon;
    @SerializedName("search_button")
    public NoResultNonDeliveryEntity.SearchButton searchButton;
}
