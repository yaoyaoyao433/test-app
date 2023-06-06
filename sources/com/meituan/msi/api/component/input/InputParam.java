package com.meituan.msi.api.component.input;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.gson.JsonObject;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class InputParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean adjustPosition;
    public String backgroundColor;
    public String color;
    public Boolean confirmHold;
    public String confirmType;
    public Integer cursor;
    public Integer cursorSpacing;
    public Boolean disabled;
    public Boolean focus;
    public Double fontSize;
    public String fontStyle;
    public Integer maxlength;
    public Boolean password;
    public String placeholder;
    public PlaceholderStyle placeholderStyle;
    public Integer selectionEnd;
    public Integer selectionStart;
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

    public InputParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1312965b7218d89a30acc7d2e7f28f72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1312965b7218d89a30acc7d2e7f28f72");
            return;
        }
        this.selectionStart = 0;
        this.selectionEnd = 0;
    }

    public void updateProperty(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01f6ecbe05c40caaf0cc47076a9b0431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01f6ecbe05c40caaf0cc47076a9b0431");
        } else if (jsonObject == null) {
        } else {
            try {
                if (jsonObject.has("value")) {
                    this.value = jsonObject.get("value").getAsString();
                }
                if (jsonObject.has("type")) {
                    this.type = jsonObject.get("type").getAsString();
                }
                if (jsonObject.has("maxlength")) {
                    this.maxlength = Integer.valueOf(jsonObject.get("maxlength").getAsInt());
                }
                if (jsonObject.has(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                    this.placeholder = jsonObject.get(ReactTextInputShadowNode.PROP_PLACEHOLDER).getAsString();
                }
                if (jsonObject.has("fontSize")) {
                    this.fontSize = Double.valueOf(jsonObject.get("fontSize").getAsDouble());
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
                if (jsonObject.has("password")) {
                    this.password = Boolean.valueOf(jsonObject.get("password").getAsBoolean());
                }
                if (jsonObject.has("adjustPosition")) {
                    this.adjustPosition = Boolean.valueOf(jsonObject.get("adjustPosition").getAsBoolean());
                }
                if (jsonObject.has("cursor")) {
                    this.cursor = Integer.valueOf(jsonObject.get("cursor").getAsInt());
                }
                if (jsonObject.has("cursorSpacing")) {
                    this.cursorSpacing = Integer.valueOf(jsonObject.get("cursorSpacing").getAsInt());
                }
                if (jsonObject.has("selectionStart")) {
                    this.selectionStart = Integer.valueOf(jsonObject.get("selectionStart").getAsInt());
                }
                if (jsonObject.has("selectionEnd")) {
                    this.selectionEnd = Integer.valueOf(jsonObject.get("selectionEnd").getAsInt());
                }
                if (jsonObject.has("focus")) {
                    this.focus = Boolean.valueOf(jsonObject.get("focus").getAsBoolean());
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
