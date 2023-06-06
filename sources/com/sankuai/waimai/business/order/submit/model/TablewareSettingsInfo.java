package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TablewareSettingsInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("confirm_title")
    public String confirmTitle;
    @SerializedName("setting_for_address")
    public int settingForAddress;
    @SerializedName("settings_id")
    public long settingsId;
    @SerializedName("settings_options")
    public ArrayList<SettingsOption> settingsOptions;
    @SerializedName("settings_tip")
    public String settingsTip;
    @SerializedName("settings_title")
    public String settingsTitle;
    @SerializedName("use_default_tableware_tip")
    public boolean useDefaultTablewareTip;
    @SerializedName("user_center_guide_pic")
    public String userCenterGuidePic;
    @SerializedName("user_center_guide_text")
    public String userCenterGuideText;
    @SerializedName("user_tableware_config_value")
    public int userTablewareConfigValue;

    public TablewareSettingsInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d62b2ed20f536f78ad34b5ecb23b4ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (TablewareSettingsInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d62b2ed20f536f78ad34b5ecb23b4ad");
        }
        if (jSONObject == null) {
            return null;
        }
        TablewareSettingsInfo tablewareSettingsInfo = new TablewareSettingsInfo();
        JSONArray optJSONArray = jSONObject.optJSONArray("settings_options");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            tablewareSettingsInfo.settingsOptions = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    tablewareSettingsInfo.settingsOptions.add(new SettingsOption().fromJson(optJSONObject));
                }
            }
        }
        tablewareSettingsInfo.settingsTitle = jSONObject.optString("settings_title");
        tablewareSettingsInfo.settingsTip = jSONObject.optString("settings_tip");
        tablewareSettingsInfo.confirmTitle = jSONObject.optString("confirm_title");
        tablewareSettingsInfo.settingsId = jSONObject.optLong("settings_id");
        tablewareSettingsInfo.userTablewareConfigValue = jSONObject.optInt("user_tableware_config_value");
        tablewareSettingsInfo.useDefaultTablewareTip = jSONObject.optBoolean("use_default_tableware_tip");
        return tablewareSettingsInfo;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class SettingsOption implements Serializable {
        public static final int NO_REQUIRE_TABLEWARE = 102;
        public static final int REQUIRE_TABLEWARE = 101;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public int code;
        @SerializedName("confirm_tip")
        public String confirm_tip;
        @SerializedName("description")
        public String description;
        @SerializedName("is_selected")
        public int isSelected;
        @SerializedName("select_sub_text")
        public String select_sub_text;
        @SerializedName("select_text")
        public String select_text;
        @SerializedName("selected_tip")
        public String selected_tip;
        @SerializedName("sub_desc")
        public String sub_description;

        public SettingsOption() {
        }

        public SettingsOption fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50e008877bcc34d9e4b6e6dca7c148c0", RobustBitConfig.DEFAULT_VALUE)) {
                return (SettingsOption) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50e008877bcc34d9e4b6e6dca7c148c0");
            }
            if (jSONObject == null) {
                return null;
            }
            SettingsOption settingsOption = new SettingsOption();
            settingsOption.code = jSONObject.optInt("code");
            settingsOption.description = jSONObject.optString("description");
            settingsOption.isSelected = jSONObject.optInt("is_selected");
            settingsOption.select_sub_text = jSONObject.optString("select_sub_text");
            settingsOption.sub_description = jSONObject.optString("sub_desc");
            settingsOption.select_text = jSONObject.optString("select_text");
            settingsOption.confirm_tip = jSONObject.optString("confirm_tip");
            settingsOption.selected_tip = jSONObject.optString("selected_tip");
            return settingsOption;
        }
    }
}
