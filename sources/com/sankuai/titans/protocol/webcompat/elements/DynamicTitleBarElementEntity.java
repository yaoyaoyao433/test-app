package com.sankuai.titans.protocol.webcompat.elements;

import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DynamicTitleBarElementEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("backgroundColor")
    @Expose
    private String backgroundColor;
    @SerializedName(DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE)
    @Expose
    private String backgroundImage;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName(DynamicTitleParser.PARSER_KEY_FONT_COLOR)
    @Expose
    private String fontColor;
    @SerializedName("fontSize")
    @Expose
    private int fontSize;
    @SerializedName("fontStyle")
    @Expose
    private String[] fontStyle;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("opacity")
    @Expose
    private float opacity;
    @SerializedName("paddingBottom")
    @Expose
    private int paddingBottom;
    @SerializedName("paddingLeft")
    @Expose
    private int paddingLeft;
    @SerializedName("paddingRight")
    @Expose
    private int paddingRight;
    @SerializedName("paddingTop")
    @Expose
    private int paddingTop;
    @SerializedName(DynamicTitleParser.PARSER_KEY_ELEMENT_PRIMARY)
    @Expose
    private boolean primary;
    @SerializedName(DynamicTitleParser.PARSER_KEY_STRETCH)
    @Expose
    private String stretch;
    @SerializedName("sup")
    @Expose
    private DynamicTitleBarElementEntity sup;
    @SerializedName(TextAlign.LOWER_CASE_NAME)
    @Expose
    private String textAlign;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("width")
    @Expose
    private double width;

    public DynamicTitleBarElementEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f21f2fdb131ffeed09cc00ab066166ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f21f2fdb131ffeed09cc00ab066166ab");
            return;
        }
        this.primary = false;
        this.width = 0.0d;
        this.paddingTop = 0;
        this.paddingBottom = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.fontSize = -1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public void setPrimary(boolean z) {
        this.primary = z;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "519c457032b0b30486e0ab2f0b7c80b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "519c457032b0b30486e0ab2f0b7c80b5");
        } else {
            this.width = d;
        }
    }

    public int getPaddingTop() {
        return this.paddingTop;
    }

    public void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public int getPaddingBottom() {
        return this.paddingBottom;
    }

    public void setPaddingBottom(int i) {
        this.paddingBottom = i;
    }

    public int getPaddingLeft() {
        return this.paddingLeft;
    }

    public void setPaddingLeft(int i) {
        this.paddingLeft = i;
    }

    public int getPaddingRight() {
        return this.paddingRight;
    }

    public void setPaddingRight(int i) {
        this.paddingRight = i;
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

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public float getOpacity() {
        return this.opacity;
    }

    public void setOpacity(float f) {
        this.opacity = f;
    }

    public String getTextAlign() {
        return this.textAlign;
    }

    public void setTextAlign(String str) {
        this.textAlign = str;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public void setFontSize(int i) {
        this.fontSize = i;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public String[] getFontStyle() {
        return this.fontStyle;
    }

    public void setFontStyle(String[] strArr) {
        this.fontStyle = strArr;
    }

    public String getStretch() {
        return this.stretch;
    }

    public void setStretch(String str) {
        this.stretch = str;
    }

    public DynamicTitleBarElementEntity getSup() {
        return this.sup;
    }

    public void setSup(DynamicTitleBarElementEntity dynamicTitleBarElementEntity) {
        this.sup = dynamicTitleBarElementEntity;
    }
}
