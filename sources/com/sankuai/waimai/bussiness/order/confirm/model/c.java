package com.sankuai.waimai.bussiness.order.confirm.model;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.order.submit.model.BottomModelInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    @SerializedName("template_id")
    public String a;
    @SerializedName("template_data")
    public JSONObject b;
    @SerializedName("default_template_id")
    public String c;
    @SerializedName("member_package")
    @Nullable
    public b d;
    @SerializedName("bottom_module_info")
    @Nullable
    public BottomModelInfo e;
}
