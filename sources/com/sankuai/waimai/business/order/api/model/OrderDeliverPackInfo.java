package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderDeliverPackInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("last_pack_track_content")
    public String lastPackTrackContent;
    @SerializedName("last_pack_track_time")
    public long lastPackTrackTime;
    @SerializedName("logistics_schema_url")
    public String logisticsSchemaUrl;
    @SerializedName("number_valid")
    public int numberValid;
    @SerializedName("pack_schema_url")
    public String packSchemaUrl;
    @SerializedName("sp_code")
    public String spCode;
    @SerializedName("sp_name")
    public String spName;
    @SerializedName("sp_name_desc")
    public String spNameDesc;
    @SerializedName("sp_pkg_num")
    public String spPkgNum;
    @SerializedName("sp_pkg_num_desc")
    public String spPkgNumDesc;
    @SerializedName("track_view_time")
    public String trackViewTime;
}
