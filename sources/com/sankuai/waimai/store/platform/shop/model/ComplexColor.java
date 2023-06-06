package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ComplexColor implements Serializable {
    private static final int DEF_COLOR = -16777216;
    public static ChangeQuickRedirect changeQuickRedirect;
    public ColorInfo cardColorInfo;
    @SerializedName("left_color_value")
    public String leftColor;
    @SerializedName("right_color_value")
    public String rightColor;

    public int getLeftColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e55ae22b5e0a90ab436e9940fae0d72", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e55ae22b5e0a90ab436e9940fae0d72")).intValue() : convert(this.leftColor);
    }

    public int getRightColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a51c404c87dc32c9e8388539492fb86d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a51c404c87dc32c9e8388539492fb86d")).intValue() : convert(this.rightColor);
    }

    private int convert(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25f80a7e403b6a491eff2bdfb6a859ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25f80a7e403b6a491eff2bdfb6a859ba")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        return d.a(str, -16777216);
    }

    public static ComplexColor fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6321b259248524495d3e826575b4eff", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComplexColor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6321b259248524495d3e826575b4eff");
        }
        if (jSONObject == null) {
            return null;
        }
        ComplexColor complexColor = new ComplexColor();
        complexColor.cardColorInfo = (ColorInfo) i.a(jSONObject.optString("color_info"), new TypeToken<ColorInfo>() { // from class: com.sankuai.waimai.store.platform.shop.model.ComplexColor.1
        }.getType());
        complexColor.leftColor = jSONObject.optString("left_color_value");
        complexColor.rightColor = jSONObject.optString("right_color_value");
        return complexColor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ColorInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background_pic")
        private String backgroundPic;
        @SerializedName("frame_color")
        private String frameColor;
        @SerializedName("left_top_background_color")
        private String leftTopBackgroundColor;
        @SerializedName("more_button_left_color")
        private String moreButtonLeftColor;
        @SerializedName("more_button_right_color")
        private String moreButtonRightColor;
        @SerializedName("product_background_pic")
        private String productBackgroundPic;
        @SerializedName("right_bottom_background_color")
        private String rightBottomBackgroundColor;
        @SerializedName("title_color")
        private String titleColor;

        private int convert(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "643de6fe4b9aadff1ea6cb740e340805", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "643de6fe4b9aadff1ea6cb740e340805")).intValue();
            }
            if (TextUtils.isEmpty(str)) {
                return -16777216;
            }
            return d.a(str, -16777216);
        }

        public int getLeftTopBackgroundColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9118dcd6e3de107ea75f7250e17e15b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9118dcd6e3de107ea75f7250e17e15b")).intValue() : convert(this.leftTopBackgroundColor);
        }

        public void setLeftTopBackgroundColor(String str) {
            this.leftTopBackgroundColor = str;
        }

        public int getRightBottomBackgroundColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e15a2bfa59d93c7f89309a37e3a38335", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e15a2bfa59d93c7f89309a37e3a38335")).intValue() : convert(this.rightBottomBackgroundColor);
        }

        public void setRightBottomBackgroundColor(String str) {
            this.rightBottomBackgroundColor = str;
        }

        public int getTitleColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8936724e85b343569ced41b170c403a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8936724e85b343569ced41b170c403a0")).intValue() : convert(this.titleColor);
        }

        public void setTitleColor(String str) {
            this.titleColor = str;
        }

        public int getFrameColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cf9eecf0732be76c1dccf0f482f6d84", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cf9eecf0732be76c1dccf0f482f6d84")).intValue() : convert(this.frameColor);
        }

        public void setFrameColor(String str) {
            this.frameColor = str;
        }

        public int getMoreButtonLeftColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "256d0e6ed2aa3693c374f7d9248d47e4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "256d0e6ed2aa3693c374f7d9248d47e4")).intValue() : convert(this.moreButtonLeftColor);
        }

        public void setMoreButtonLeftColor(String str) {
            this.moreButtonLeftColor = str;
        }

        public int getMoreButtonRightColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0cd3b7cceaca75dcc41de9467931295", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0cd3b7cceaca75dcc41de9467931295")).intValue() : convert(this.moreButtonRightColor);
        }

        public void setMoreButtonRightColor(String str) {
            this.moreButtonRightColor = str;
        }

        public String getProductBackgroundPic() {
            return this.productBackgroundPic;
        }

        public void setProductBackgroundPic(String str) {
            this.productBackgroundPic = str;
        }

        public String getBackgroundPic() {
            return this.backgroundPic;
        }

        public void setBackgroundPic(String str) {
            this.backgroundPic = str;
        }
    }
}
