package com.meituan.msi.api.component.textaera;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.gson.JsonObject;
import com.meituan.android.recce.props.gens.AutoFocus;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MaxLength;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class TextAreaParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean adjustPosition;
    public Boolean autoFocus;
    public Boolean autoHeight;
    public Boolean autoSize;
    public String backgroundColor;
    public String color;
    public Boolean confirm;
    public Boolean confirmHold;
    public String confirmType;
    public Integer cursor;
    public Boolean disabled;
    public Boolean fixed;
    public Double fontSize;
    public String fontStyle;
    public String fontWeight;
    public Integer lineSpace;
    public Integer marginBottom;
    public Integer maxHeight;
    public Integer maxLength;
    public Integer minHeight;
    public String placeholder;
    public PlaceholderStyle placeholderStyle;
    public String textAlign;
    public String type;
    public Boolean unitPx;
    public String value;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class PlaceholderStyle {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String backgroundColor;
        public String color;
        public Double fontSize;
        public String fontWeight;
    }

    public void updateProperty(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c6de6d8044bf03b46048b959a945340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c6de6d8044bf03b46048b959a945340");
        } else if (jsonObject == null) {
        } else {
            try {
                if (jsonObject.has("value")) {
                    this.value = jsonObject.get("value").getAsString();
                }
                if (jsonObject.has("type")) {
                    this.type = jsonObject.get("type").getAsString();
                }
                if (jsonObject.has(MaxLength.LOWER_CASE_NAME)) {
                    this.maxLength = Integer.valueOf(jsonObject.get(MaxLength.LOWER_CASE_NAME).getAsInt());
                }
                if (jsonObject.has("cursor")) {
                    this.cursor = Integer.valueOf(jsonObject.get("cursor").getAsInt());
                }
                if (jsonObject.has(MinHeight.LOWER_CASE_NAME)) {
                    this.minHeight = Integer.valueOf(jsonObject.get(MinHeight.LOWER_CASE_NAME).getAsInt());
                }
                if (jsonObject.has("maxHeight")) {
                    this.maxHeight = Integer.valueOf(jsonObject.get("maxHeight").getAsInt());
                }
                if (jsonObject.has("lineSpace")) {
                    this.lineSpace = Integer.valueOf(jsonObject.get("lineSpace").getAsInt());
                }
                if (jsonObject.has(MarginBottom.LOWER_CASE_NAME)) {
                    this.marginBottom = Integer.valueOf(jsonObject.get(MarginBottom.LOWER_CASE_NAME).getAsInt());
                }
                if (jsonObject.has(FontWeight.LOWER_CASE_NAME)) {
                    this.fontWeight = jsonObject.get(FontWeight.LOWER_CASE_NAME).getAsString();
                }
                if (jsonObject.has(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                    this.placeholder = jsonObject.get(ReactTextInputShadowNode.PROP_PLACEHOLDER).getAsString();
                }
                if (jsonObject.has("fontSize")) {
                    this.fontSize = Double.valueOf(jsonObject.get("fontSize").getAsDouble());
                }
                if (jsonObject.has("autoSize")) {
                    this.autoSize = Boolean.valueOf(jsonObject.get("autoSize").getAsBoolean());
                }
                if (jsonObject.has("fixed")) {
                    this.fixed = Boolean.valueOf(jsonObject.get("fixed").getAsBoolean());
                }
                if (jsonObject.has("adjustPosition")) {
                    this.adjustPosition = Boolean.valueOf(jsonObject.get("adjustPosition").getAsBoolean());
                }
                if (jsonObject.has("color")) {
                    this.color = jsonObject.get("color").getAsString();
                }
                if (jsonObject.has("backgroundColor")) {
                    this.backgroundColor = jsonObject.get("backgroundColor").getAsString();
                }
                if (jsonObject.has("fontStyle")) {
                    this.fontStyle = jsonObject.get("fontStyle").getAsString();
                }
                if (jsonObject.has(TextAlign.LOWER_CASE_NAME)) {
                    this.textAlign = jsonObject.get(TextAlign.LOWER_CASE_NAME).getAsString();
                }
                if (jsonObject.has("disabled")) {
                    this.disabled = Boolean.valueOf(jsonObject.get("disabled").getAsBoolean());
                }
                if (jsonObject.has("confirmType")) {
                    this.confirmType = jsonObject.get("confirmType").getAsString();
                }
                if (jsonObject.has("confirmHold")) {
                    this.confirmHold = Boolean.valueOf(jsonObject.get("confirmHold").getAsBoolean());
                }
                if (jsonObject.has("unitPx")) {
                    this.unitPx = Boolean.valueOf(jsonObject.get("unitPx").getAsBoolean());
                }
                if (jsonObject.has("autoHeight")) {
                    this.autoHeight = Boolean.valueOf(jsonObject.get("autoHeight").getAsBoolean());
                }
                if (jsonObject.has(AutoFocus.LOWER_CASE_NAME)) {
                    this.autoFocus = Boolean.valueOf(jsonObject.get(AutoFocus.LOWER_CASE_NAME).getAsBoolean());
                }
                if (jsonObject.has("confirm")) {
                    this.confirm = Boolean.valueOf(jsonObject.get("confirm").getAsBoolean());
                }
                if (jsonObject.has(MarginBottom.LOWER_CASE_NAME)) {
                    this.marginBottom = Integer.valueOf(jsonObject.get(MarginBottom.LOWER_CASE_NAME).getAsInt());
                }
                if (jsonObject.has("placeholderStyle")) {
                    JsonObject asJsonObject = jsonObject.get("placeholderStyle").getAsJsonObject();
                    this.placeholderStyle = new PlaceholderStyle();
                    if (asJsonObject.has("color")) {
                        this.placeholderStyle.color = asJsonObject.get("color").getAsString();
                    }
                    if (asJsonObject.has("backgroundColor")) {
                        this.placeholderStyle.backgroundColor = asJsonObject.get("backgroundColor").getAsString();
                    }
                    if (asJsonObject.has("fontSize")) {
                        this.placeholderStyle.fontSize = Double.valueOf(asJsonObject.get("fontSize").getAsDouble());
                    }
                    if (asJsonObject.has(FontWeight.LOWER_CASE_NAME)) {
                        this.placeholderStyle.fontWeight = asJsonObject.get(FontWeight.LOWER_CASE_NAME).getAsString();
                    }
                }
            } catch (Exception e) {
                com.meituan.msi.log.a.a("param type error: " + e.toString());
            }
        }
    }
}
