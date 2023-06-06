package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class V732PaotuiEntranceData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("paotui_context")
    public String paotuiContext;
    @SerializedName("paotui_entrance")
    public PaotuiEntrance paotuiEntrance;
    @SerializedName("paotui_entranceV2")
    public PaotuiEntranceV2 paotuiEntranceV2;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Paotui implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("paotui_scheme_context")
        public String button;
        @SerializedName("distance")
        public String distance;
        @SerializedName("id")
        public long id;
        @SerializedName("month_sales_tip")
        public String monthSale;
        @SerializedName("name")
        public String name;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName("poi_type_icon")
        public String poiTypeIcon;
        @SerializedName("poi_type_icon_text")
        public String poiTypeIconText;
        @SerializedName("poi_type_icon_type")
        public int poiTypeIconType;
        @SerializedName("paotui_scheme")
        public String scheme;
        @SerializedName("wm_poi_score")
        public double score;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PaotuiEntrance implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("scheme_context")
        public String btnContext;
        @SerializedName("desc_context")
        public String descContext;
        public boolean isExposed;
        @SerializedName("paotui_picture")
        public String paotuiPic;
        @SerializedName("paotui_template")
        public int paotuiTemplate;
        @SerializedName("remind_context")
        public String remindContext;
        @SerializedName("remind_sub_context")
        public String remindSubContext;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("show_address")
        public boolean showAddress;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PaotuiEntranceV2 implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("more_title")
        public String moreTitle;
        @SerializedName("paotui_poi_list")
        public List<Paotui> paotuiPoiList;
        @SerializedName("paotui_scheme")
        public String paotuiScheme;
        @SerializedName("paotui_scheme_context")
        public String paotuiSchemeContext;
        @SerializedName("show_address")
        public boolean showAddress;
        @SerializedName("sub_title")
        public String subTitle;
        @SerializedName("title")
        public String title;
    }
}
