package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    @SerializedName(PushConstants.INTENT_ACTIVITY_NAME)
    public List<a> a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("activity_tag")
        public String a;
        @SerializedName("count")
        public int b;
    }
}
