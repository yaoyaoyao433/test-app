package com.sankuai.waimai.store.search.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h implements Serializable {
    private static final long serialVersionUID = -3402355177573251377L;
    @SerializedName("wm_poi_id")
    private Long a;
    @SerializedName("poi_trace_info")
    private a b;
    @SerializedName("shangou_activity_tags")
    private List<Object> c;
    @SerializedName("sg_poi_activity_service_tags")
    private List<Object> d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        private static final long serialVersionUID = 2832318481431741689L;
        @SerializedName("ad_type")
        private Integer a;
        @SerializedName("activity_type")
        private Integer b;
        @SerializedName("showType")
        private Integer c;
        @SerializedName("template_id")
        private Integer d;
        @SerializedName("charge_info")
        private String e;
        @SerializedName("drug_description")
        private String f;
        @SerializedName("id")
        private Integer g;
        @SerializedName("entry_item_id")
        private Integer h;
        @SerializedName("rank_label_info")
        private String i;
        @SerializedName("tags")
        private List<?> j;
    }
}
