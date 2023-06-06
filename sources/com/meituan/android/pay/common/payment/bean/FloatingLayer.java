package com.meituan.android.pay.common.payment.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class FloatingLayer implements Serializable {
    public static final int FLOATING_LAYER_TEMPLATE_B = 2;
    public static final String FLOATING_TYPE_DISCOUNT = "${discount}";
    public static final String FLOATING_TYPE_REWARD = "${reward}";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1483213970960610029L;
    @SerializedName("first_content")
    private String firstContent;
    @SerializedName("float_id")
    private String floatId;
    @SerializedName("float_template")
    private int floatTemplate;
    @SerializedName("float_type")
    private int floatType;
    @SerializedName("float_url")
    private String floatUrl;
    @SerializedName("priority")
    private int priority;
    @SerializedName("second_content")
    private String secondContent;

    public boolean isGuideType() {
        return this.floatType == 1;
    }

    public boolean isDiscountType() {
        return this.floatType == 2;
    }

    public boolean hasDiscountData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1bc60506833c69c3877f0a67d15ee87", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1bc60506833c69c3877f0a67d15ee87")).booleanValue() : !TextUtils.isEmpty(this.firstContent) && this.firstContent.contains(FLOATING_TYPE_DISCOUNT);
    }

    public boolean hasRewardData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4c68b0a551f84b01700460e3d23e5a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4c68b0a551f84b01700460e3d23e5a1")).booleanValue() : !TextUtils.isEmpty(this.firstContent) && this.firstContent.contains(FLOATING_TYPE_REWARD);
    }

    public String getFloatId() {
        return this.floatId;
    }

    public void setFloatId(String str) {
        this.floatId = str;
    }

    public int getFloatType() {
        return this.floatType;
    }

    public void setFloatType(int i) {
        this.floatType = i;
    }

    public String getFirstContent() {
        return this.firstContent;
    }

    public void setFirstContent(String str) {
        this.firstContent = str;
    }

    public String getSecondContent() {
        return this.secondContent;
    }

    public void setSecondContent(String str) {
        this.secondContent = str;
    }

    public String getFloatUrl() {
        return this.floatUrl;
    }

    public void setFloatUrl(String str) {
        this.floatUrl = str;
    }

    public int getFloatTemplate() {
        return this.floatTemplate;
    }

    public void setFloatTemplate(int i) {
        this.floatTemplate = i;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int i) {
        this.priority = i;
    }
}
