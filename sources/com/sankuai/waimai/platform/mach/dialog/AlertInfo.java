package com.sankuai.waimai.platform.mach.dialog;

import android.support.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AlertInfo {
    public static final int ALERT_TYPE_FULL_DYNAMIC = 0;
    public static final int ALERT_TYPE_PART_DYNAMIC = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alert_name")
    public String alertName;
    @SerializedName("alert_type")
    public int alertType;
    @SerializedName("extra_data")
    public Map<String, Object> extraData;
    @SerializedName("footer_info")
    public FooterInfo footerInfo;
    @SerializedName("header_info")
    public HeaderInfo headerInfo;
    @SerializedName("log_data")
    public LogData logData;
    @SerializedName("alert_module_list")
    public List<Module> modules;
    @SerializedName("style")
    public Style style;
    @SerializedName("trace_info")
    public Map<String, Object> traceInfo;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HeaderInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public String activityId;
        @SerializedName("activity_type")
        public String activityType;
        @SerializedName("background")
        public String background;
        @SerializedName("click_url")
        public String clickUrl;
        @SerializedName("entry_item_id")
        public String entryItemId;
        @SerializedName("header_id")
        public int headerId;
        @SerializedName("module_id")
        public String moduleId;
        @SerializedName("template_id")
        public String templateId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LogData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public int activityId;
        @SerializedName("activity_type")
        public int activityType;
        @SerializedName("entry_item_id")
        public int entryItemId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Module {
        public static final String BUSINESS_TYPE_AD = "ad";
        public static final String BUSINESS_TYPE_MARKETING = "marketing";
        public static final int DATA_TYPE_JSON = 0;
        public static final int DATA_TYPE_STRING = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("business_type")
        public String businessType;
        @SerializedName(KernelConfig.KEY_CONTAINER_TYPE)
        public int containerType;
        @SerializedName("data_type")
        public int dataType;
        @SerializedName("default_template_id")
        public String defaultTemplateId;
        @SerializedName("extra_data")
        public Map<String, Object> extraData;
        @SerializedName("json_data")
        public JsonObject jsonData;
        @SerializedName("layout_info")
        public LayoutInfo layoutInfo;
        @SerializedName("module_id")
        public String moduleId;
        @SerializedName("string_data")
        public String stringData;
        @SerializedName("template_id")
        public String templateId;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class LayoutInfo implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("margin_bottom")
            public int marginBottom;
            @SerializedName("margin_top")
            public int marginTop;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Style implements Serializable {
        public static final int CLOSE_STYLE_BOTTOM_CENTER = 1;
        public static final int CLOSE_STYLE_NONE = 0;
        public static final int CLOSE_STYLE_TOP_RIGHT = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("animation_style")
        public int animation_style;
        @SerializedName("background")
        public Background background;
        @SerializedName("close_style")
        public int closeStyle;
        @SerializedName("content_max_height")
        public float contentMaxHeight;
        @SerializedName("duration")
        public int duration;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class Background implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("background_color")
            public String backgroundColor;
            @SerializedName("background_image_url")
            public String backgroundUrl;
        }
    }

    public int getEntryItemId() {
        if (this.logData != null) {
            return this.logData.entryItemId;
        }
        return 0;
    }

    public int getActivityId() {
        if (this.logData != null) {
            return this.logData.activityId;
        }
        return 0;
    }

    public int getActivityType() {
        if (this.logData != null) {
            return this.logData.activityType;
        }
        return 0;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FooterInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("button_list")
        public List<Button> buttonList;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public class Button implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("button_background_color")
            public String buttonBackgroundColor;
            @SerializedName("button_border_color")
            public String buttonBorderColor;
            @SerializedName("button_id")
            public int buttonId;
            @SerializedName("button_text")
            public String buttonText;
            @SerializedName("button_text_color")
            public String buttonTextColor;
            @SerializedName("click_url")
            public String clickUrl;

            public Button() {
            }
        }
    }
}
