package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.s;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BaseTileNew<T extends Serializable, V> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("apply_type")
    public String applyType;
    @SerializedName("data")
    public T data;
    @SerializedName("general_info")
    public GeneralInfo generalInfo;
    public transient String jsonStr;
    @SerializedName("layout_info")
    public LayoutInfo layoutInfo;
    @SerializedName("props_data")
    public V propsData;
    @SerializedName("s_type")
    public String sType;
    @SerializedName("source_id")
    public String sourceId;
    @SerializedName("statistics_info")
    public Map<String, StatisticInfo> statisticsInfo;
    @SerializedName("unique_s_type")
    public String uniqueSType;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class KingKongProps implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("kingkongSelectedBgColorFrm")
        public String kingkongSelectedBgColorFrm;
        @SerializedName("kingkongSelectedBgColorTo")
        public String kingkongSelectedBgColorTo;
        @SerializedName("kingkongSlot")
        public String kingkongSlot;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static class NoPropsData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static final class StatisticInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bid")
        public String bid;
        @SerializedName("cid")
        public String cid;
        @SerializedName("lab")
        public Map<String, String> lab;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LayoutInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background_color")
        public String backgroundColor;
        @SerializedName("border_bottom_left_radius")
        public int borderBottomLeftRadius;
        @SerializedName("border_bottom_right_radius")
        public int borderBottomRightRadius;
        @SerializedName("border_top_left_radius")
        public int borderTopLeftRadius;
        @SerializedName("border_top_right_radius")
        public int borderTopRightRadius;
        @SerializedName("margin_bottom")
        public int bottom;
        @SerializedName("margin_left")
        public int left;
        @SerializedName("padding_bottom")
        public int paddingBottom;
        @SerializedName("padding_left")
        public int paddingLeft;
        @SerializedName("padding_right")
        public int paddingRight;
        @SerializedName("padding_top")
        public int paddingTop;
        @SerializedName("margin_right")
        public int right;
        @SerializedName("margin_top")
        public int top;

        /* renamed from: clone */
        public LayoutInfo m24clone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8d1328b1956141e3bb66bd2aed3689d", RobustBitConfig.DEFAULT_VALUE) ? (LayoutInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8d1328b1956141e3bb66bd2aed3689d") : (LayoutInfo) s.a(this);
        }
    }
}
