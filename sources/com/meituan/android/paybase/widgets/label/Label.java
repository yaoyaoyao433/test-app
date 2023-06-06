package com.meituan.android.paybase.widgets.label;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Label implements Serializable {
    public static final int STYLE_BUBBLE = 3;
    public static final int STYLE_COMMON = 1;
    public static final int STYLE_GIF = 4;
    public static final int STYLE_RECOMMENDING = 0;
    public static final int STYLE_WITH_HEAD_INFO = 2;
    public static final int TYPE_COMMON_CAMPAIGN = 1;
    public static final int TYPE_COMMON_COUPON = 3;
    public static final int TYPE_SPECIAL_CAMPAIGN = 2;
    public static final int TYPE_SPECIAL_COUPON = 4;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6492254824014017617L;
    @SerializedName("background_color")
    private String background;
    private String color;
    private String content;
    @SerializedName("label_head")
    private String labelHead;
    @SerializedName(PersonaTable.LABEL_ID)
    private String labelId;
    private int style;
    @SerializedName("content_color")
    private String textColor;
    private boolean top;
    private int type;
    @SerializedName("use_customization")
    private boolean useCustomization;
    @SerializedName("use_white_praise")
    private boolean useWhitePraiseIcon;

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getLabelHead() {
        return this.labelHead;
    }

    public void setLabelHead(String str) {
        this.labelHead = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d688a3f2b10c1f1f763a9decbcdc47d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d688a3f2b10c1f1f763a9decbcdc47d2");
        }
        if (this.useCustomization) {
            if (!TextUtils.isEmpty(this.color)) {
                return this.color.replaceAll(StringUtil.SPACE, "");
            }
            return this.color;
        }
        return null;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public int getStyle() {
        return this.style;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public String getTextColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "936d56454417653e25d9a8df6d97f5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "936d56454417653e25d9a8df6d97f5c3");
        }
        if (this.useCustomization) {
            if (!TextUtils.isEmpty(this.textColor)) {
                return this.textColor.replaceAll(StringUtil.SPACE, "");
            }
            return this.textColor;
        }
        return null;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public String getBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bdb39b0ff288d5322eb0e8c02975a44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bdb39b0ff288d5322eb0e8c02975a44");
        }
        if (this.useCustomization) {
            if (!TextUtils.isEmpty(this.background)) {
                return this.background.replaceAll(StringUtil.SPACE, "");
            }
            return this.background;
        }
        return null;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public boolean isTop() {
        return this.top;
    }

    public void setTop(boolean z) {
        this.top = z;
    }

    public boolean isUseWhitePraiseIcon() {
        return this.useCustomization && this.useWhitePraiseIcon;
    }

    public void setUseWhitePraiseIcon(boolean z) {
        this.useWhitePraiseIcon = z;
    }

    public boolean isUseCustomization() {
        return this.useCustomization;
    }

    public void setUseCustomization(boolean z) {
        this.useCustomization = z;
    }

    public String getLabelId() {
        return this.labelId;
    }

    public void setLabelId(String str) {
        this.labelId = str;
    }
}
