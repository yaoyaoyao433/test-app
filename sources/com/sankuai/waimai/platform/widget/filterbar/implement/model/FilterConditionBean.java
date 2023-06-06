package com.sankuai.waimai.platform.widget.filterbar.implement.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FilterConditionBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_filter_list")
    public ArrayList<FilterGroup> filterList;
    @SerializedName("exp_ab_info")
    public LabelExtraInfo labelExtraInfo;
    @SerializedName("second_activity_filter_list")
    public ArrayList<FilterGroup> secondFilterList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LabelExtraInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("wm_home_v717")
        public String wmHomeV717LabelExp;
    }

    public static FilterConditionBean fromJson(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94a0640d367a82623461c953a9a1ca4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (FilterConditionBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94a0640d367a82623461c953a9a1ca4f");
        }
        if (jSONArray == null) {
            return null;
        }
        FilterConditionBean filterConditionBean = new FilterConditionBean();
        filterConditionBean.filterList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                filterConditionBean.filterList.add(FilterGroup.fromJson(optJSONObject));
            }
        }
        return filterConditionBean;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FilterGroup {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("display_style")
        public int displayStyle;
        @SerializedName("extra")
        public String extra;
        @SerializedName("items")
        public ArrayList<FilterItem> favourItems;
        @SerializedName("group_title")
        public String groupTitle;
        @SerializedName("support_multi_choice")
        public int supportMultiChoice;

        public FilterGroup() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a614fa6dcd1d30031063bb536eecb6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a614fa6dcd1d30031063bb536eecb6");
            } else {
                this.favourItems = new ArrayList<>();
            }
        }

        public static FilterGroup fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92e5199bff5f3818080a9261b258869d", RobustBitConfig.DEFAULT_VALUE)) {
                return (FilterGroup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92e5199bff5f3818080a9261b258869d");
            }
            if (jSONObject == null) {
                return null;
            }
            FilterGroup filterGroup = new FilterGroup();
            filterGroup.groupTitle = jSONObject.optString("group_title");
            filterGroup.supportMultiChoice = jSONObject.optInt("support_multi_choice");
            filterGroup.displayStyle = jSONObject.optInt("display_style");
            filterGroup.extra = jSONObject.optString("extra");
            filterGroup.favourItems = new ArrayList<>();
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    FilterItem fromJson = FilterItem.fromJson(optJSONArray.optJSONObject(i));
                    if (fromJson != null) {
                        filterGroup.favourItems.add(fromJson);
                    }
                }
            }
            return filterGroup;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class FilterItem {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("bg_url")
            public String backgroundUrl;
            @SerializedName("bubble_info")
            public BubbleInfoBean bubbleInfo;
            @SerializedName("code")
            public String code;
            @SerializedName("extra")
            public String extra;
            @SerializedName("extra_map")
            public ExtraMap extraMap;
            @SerializedName("name")
            public String name;
            @SerializedName("remarks")
            public String remarks;
            @SerializedName("slider_config_info")
            public SliderConfigInfo sliderConfigInfo;
            @SerializedName(RemoteMessageConst.Notification.ICON)
            public String url;

            public static FilterItem fromJson(JSONObject jSONObject) {
                Object[] objArr = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "583578511c4e7ba65eff67aa612647b9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (FilterItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "583578511c4e7ba65eff67aa612647b9");
                }
                if (jSONObject == null) {
                    return null;
                }
                FilterItem filterItem = new FilterItem();
                filterItem.code = jSONObject.optString("code");
                filterItem.name = jSONObject.optString("name");
                filterItem.url = jSONObject.optString(RemoteMessageConst.Notification.ICON);
                filterItem.remarks = jSONObject.optString("remarks");
                filterItem.backgroundUrl = jSONObject.optString("bg_url");
                filterItem.extra = jSONObject.optString("extra");
                filterItem.extraMap = ExtraMap.fromJson(jSONObject.optJSONObject("extra_map"));
                filterItem.sliderConfigInfo = SliderConfigInfo.fromJson(jSONObject.optJSONObject("slider_config_info"));
                filterItem.bubbleInfo = BubbleInfoBean.fromJson(jSONObject.optJSONObject("bubble_info"));
                return filterItem;
            }

            /* compiled from: ProGuard */
            @Keep
            /* loaded from: classes5.dex */
            public static class ExtraMap {
                public static ChangeQuickRedirect changeQuickRedirect;
                @SerializedName("activated")
                public String activated;

                public static ExtraMap fromJson(JSONObject jSONObject) {
                    Object[] objArr = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57ccb3e5e62b012490ab5bf420a5d5b0", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ExtraMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57ccb3e5e62b012490ab5bf420a5d5b0");
                    }
                    if (jSONObject == null) {
                        return null;
                    }
                    ExtraMap extraMap = new ExtraMap();
                    extraMap.activated = jSONObject.optString("activated");
                    return extraMap;
                }
            }

            /* compiled from: ProGuard */
            @Keep
            /* loaded from: classes5.dex */
            public static class SliderConfigInfo {
                public static ChangeQuickRedirect changeQuickRedirect;
                @SerializedName("slider_end_index")
                public int endIndex;
                @SerializedName("slider_min_unit")
                public int minUnit;
                @SerializedName("slider_coords")
                public ArrayList<Point> pointList;
                @SerializedName("slider_start_index")
                public int startIndex;
                @SerializedName("slider_unit_info")
                public Unit unitInfo;

                public static SliderConfigInfo fromJson(JSONObject jSONObject) {
                    Object[] objArr = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "397c016cd133fce7dabc2955dbe5d43a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (SliderConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "397c016cd133fce7dabc2955dbe5d43a");
                    }
                    if (jSONObject == null) {
                        return null;
                    }
                    SliderConfigInfo sliderConfigInfo = new SliderConfigInfo();
                    sliderConfigInfo.startIndex = jSONObject.optInt("slider_start_index", 0);
                    sliderConfigInfo.endIndex = jSONObject.optInt("slider_end_index", 0);
                    sliderConfigInfo.minUnit = jSONObject.optInt("slider_min_unit", 0);
                    sliderConfigInfo.unitInfo = Unit.fromJson(jSONObject.optJSONObject("slider_unit_info"));
                    sliderConfigInfo.pointList = new ArrayList<>();
                    JSONArray optJSONArray = jSONObject.optJSONArray("slider_coords");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            Point fromJson = Point.fromJson(optJSONArray.optJSONObject(i));
                            if (fromJson != null) {
                                sliderConfigInfo.pointList.add(fromJson);
                            }
                        }
                    }
                    return sliderConfigInfo;
                }

                /* compiled from: ProGuard */
                @Keep
                /* loaded from: classes5.dex */
                public static class Unit {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    @SerializedName("unit_name")
                    public String name;
                    @SerializedName("unit_pos")
                    public int pos;

                    public static Unit fromJson(JSONObject jSONObject) {
                        Object[] objArr = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd71f519d859c7265eb32ab4fffd1a9a", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Unit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd71f519d859c7265eb32ab4fffd1a9a");
                        }
                        if (jSONObject == null) {
                            return null;
                        }
                        Unit unit = new Unit();
                        unit.name = jSONObject.optString("unit_name");
                        unit.pos = jSONObject.optInt("unit_pos", 0);
                        return unit;
                    }
                }

                /* compiled from: ProGuard */
                @Keep
                /* loaded from: classes5.dex */
                public static class Point {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    @SerializedName("x_axis")
                    public int x;
                    @SerializedName("y_axis")
                    public int y;

                    public static Point fromJson(JSONObject jSONObject) {
                        Object[] objArr = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a887c3376d8c3261d518758f70301959", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a887c3376d8c3261d518758f70301959");
                        }
                        if (jSONObject == null) {
                            return null;
                        }
                        Point point = new Point();
                        point.x = jSONObject.optInt("x_axis", 0);
                        point.y = jSONObject.optInt("y_axis", 0);
                        return point;
                    }
                }
            }
        }
    }
}
