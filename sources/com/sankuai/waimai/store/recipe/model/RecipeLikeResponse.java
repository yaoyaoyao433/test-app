package com.sankuai.waimai.store.recipe.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RecipeLikeResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("like_count")
    public String likeCount;
    @SerializedName("like_status")
    public int likeStatus;
}
