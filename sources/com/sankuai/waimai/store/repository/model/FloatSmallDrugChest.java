package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FloatSmallDrugChest implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("act_uuid")
    public String actUUid;
    @SerializedName("extend_field")
    public Map<String, Object> expData;
    @SerializedName("float_icon")
    public String floatIconUrl;
    @SerializedName("inner_url")
    public String innerUrl;
    @SerializedName("stid")
    public String stidInfo;
}
