package com.sankuai.waimai.store.platform.marketing;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.manager.preload.ResourcePreloadItem;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MarketingModel implements Serializable {
    public static final int DIALOG_SHOW_MODE = 2;
    public static final String DIALOG_SHOW_TYPE_DEFAULT = "default";
    public static final String DIALOG_SHOW_TYPE_FADE = "fade";
    public static final String DIALOG_SHOW_TYPE_SLIDE_BOTTOM = "slide_bottom";
    public static final String DIALOG_SHOW_TYPE_SLIDE_TOP = "slide_top";
    public static final int FLOAT_SHOW_MODE = 1;
    public static final String GRAVITY_BOTTOM = "bottom";
    public static final String GRAVITY_CENTER_HORIZONTAL = "center";
    public static final String GRAVITY_CENTER_VERTICAL = "center";
    public static final String GRAVITY_LEFT = "left";
    public static final String GRAVITY_RIGHT = "right";
    public static final String GRAVITY_TOP = "top";
    public static final String POPUP_ANIMATION_ALPHA = "alpha";
    public static final String POPUP_ANIMATION_BOTTOM_TO_TOP = "bottom_to_top";
    public static final String POPUP_ANIMATION_LEFT_TO_RIGHT = "left_to_right";
    public static final String POPUP_ANIMATION_RIGHT_TO_LEFT = "right_to_left";
    public static final String POPUP_ANIMATION_TOP_TO_BOTTOM = "top_to_bottom";
    public static final String RENDER_TYPE_MACH = "mach";
    public static final String RENDER_TYPE_NATIVE = "native";
    public static final String TYPE_ENTER_DIALOG = "open";
    public static final String TYPE_EXIT_DIALOG = "back";
    public static final String TYPE_RESIDENT_POPUP = "resident";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("module_data")
    public ModuleItem moduleData;
    @SerializedName("type")
    public String type;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Gravity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("horizontal")
        public String horizontal = "left";
        @SerializedName("vertical")
        public String vertical = "top";
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MarketingCommonModel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("max_show_times")
        public int maxShowTimes;
        @SerializedName("show_times_key")
        public String showTimesKey;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MarketingExitModel extends MarketingOpenModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("need_stay_time")
        public long needStayTime;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MarketingOpenModel extends MarketingCommonModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("extra")
        public String extra;
        @SerializedName("preload_url_list")
        public List<ResourcePreloadItem> preloadUrlList;
        @SerializedName("display_type")
        public int showFloatDialog;
        @SerializedName("show_type")
        public String showType;
        @SerializedName("cancelable")
        public boolean isCancelable = true;
        @SerializedName("cancelable_touch_outside")
        public boolean isCancelTouchOutside = false;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MarketingResidentModel extends MarketingCommonModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("auto_close_time")
        public long autoCloseTime;
        @SerializedName("display_delay_time")
        public long delayShowTime;
        @SerializedName("enter_animation_type")
        public String enterAnimType;
        @SerializedName("gravity")
        public Gravity gravity;
        @SerializedName("offset_x")
        public int offsetX;
        @SerializedName("offset_y")
        public int offsetY;
        @SerializedName("enter_animation_duration")
        public long enterAnimDuration = 300;
        @SerializedName("leave_page_close")
        public boolean isLeavePageClose = false;
        @SerializedName("ignore_super_msg")
        public boolean ignoreuperMsg = false;
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface MarketingType {
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ModuleItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("module_custom_rules")
        public List<ModuleRule> moduleCustomRules;
        @SerializedName("module_extra")
        public String moduleExtra;
        @SerializedName("preset_template_id")
        public String presetTemplateID;
        @SerializedName("render_type")
        public String renderType;
        @SerializedName("template_data")
        public String templateData;
        @SerializedName("template_id")
        public String templateID;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ModuleRule implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rule_data")
        public String ruleData;
        @SerializedName("rule_id")
        public String ruleID;
    }
}
