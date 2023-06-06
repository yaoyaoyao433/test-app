package com.sankuai.titans.protocol.webcompat.elements;

import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DynamicTitleBarEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("backgroundColor")
    @Expose
    private String backgroundColor;
    @SerializedName(DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE)
    @Expose
    private String backgroundImage;
    @SerializedName("borderColor")
    @Expose
    private String borderColor;
    @SerializedName("borderWidth")
    @Expose
    private int borderWidth;
    @SerializedName(DynamicTitleParser.PARSER_KEY_ELEMENTS)
    @Expose
    private DynamicTitleBarElementEntity[] elements;
    @SerializedName("elevation")
    @Expose
    private int elevation;
    @SerializedName(DynamicTitleParser.PARSER_KEY_FONT_COLOR)
    @Expose
    private String fontColor;
    @SerializedName("fontSize")
    @Expose
    private int fontSize;
    @SerializedName("fontStyle")
    @Expose
    private String[] fontStyle;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("opacity")
    @Expose
    private float opacity;
    @SerializedName(DynamicTitleParser.PARSER_KEY_PRIMARY_GRAVITY)
    @Expose
    private String primaryGravity;
    @SerializedName(DynamicTitleParser.PARSER_KEY_STRETCH)
    @Expose
    private String stretch;
    @SerializedName("zIndex")
    @Expose
    private int zIndex;

    public DynamicTitleBarEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f58d763617ccea036fd52befc858f03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f58d763617ccea036fd52befc858f03");
            return;
        }
        this.height = 48;
        this.zIndex = 0;
        this.borderWidth = 0;
        this.elevation = 0;
        this.fontSize = -1;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public String getPrimaryGravity() {
        return this.primaryGravity;
    }

    public void setPrimaryGravity(String str) {
        this.primaryGravity = str;
    }

    public int getzIndex() {
        return this.zIndex;
    }

    public void setzIndex(int i) {
        this.zIndex = i;
    }

    public String getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(String str) {
        this.borderColor = str;
    }

    public int getBorderWidth() {
        return this.borderWidth;
    }

    public void setBorderWidth(int i) {
        this.borderWidth = i;
    }

    public float getOpacity() {
        return this.opacity;
    }

    public void setOpacity(float f) {
        this.opacity = f;
    }

    public int getElevation() {
        return this.elevation;
    }

    public void setElevation(int i) {
        this.elevation = i;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    public void setBackgroundImage(String str) {
        this.backgroundImage = str;
    }

    public String getStretch() {
        return this.stretch;
    }

    public void setStretch(String str) {
        this.stretch = str;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public void setFontSize(int i) {
        this.fontSize = i;
    }

    public String[] getFontStyle() {
        return this.fontStyle;
    }

    public void setFontStyle(String[] strArr) {
        this.fontStyle = strArr;
    }

    public DynamicTitleBarElementEntity[] getElements() {
        return this.elements;
    }

    public void setElements(DynamicTitleBarElementEntity[] dynamicTitleBarElementEntityArr) {
        this.elements = dynamicTitleBarElementEntityArr;
    }
}
