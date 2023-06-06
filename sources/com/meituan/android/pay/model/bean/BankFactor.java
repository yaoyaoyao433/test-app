package com.meituan.android.pay.model.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BankFactor implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5403234468456940459L;
    @SerializedName("cardbin_url")
    private String cardbinUrl;
    private Option currentOption;
    @SerializedName("factor_value")
    private String defaultValue;
    @SerializedName("disable_split")
    private boolean disableSplit;
    @SerializedName("factor_display")
    private Display display;
    @SerializedName("factor_key")
    private String factorKey;
    @SerializedName("factor_type")
    private int factorType;
    @SerializedName("is_sent")
    private boolean isSent;
    @SerializedName("option_key")
    private String optionKey;
    private List<Option> options;
    @SerializedName("factor_readonly")
    private boolean readOnly;
    @SerializedName("smscode_url")
    private String smscodeUrl;

    public static String getKeyOfUserPhone() {
        return "user_cellphone";
    }

    public int getFactorType() {
        return this.factorType;
    }

    public void setFactorType(int i) {
        this.factorType = i;
    }

    public String getFactorKey() {
        return this.factorKey;
    }

    public void setFactorKey(String str) {
        this.factorKey = str;
    }

    public Display getDisplay() {
        return this.display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getOptionKey() {
        return this.optionKey;
    }

    public void setOptionKey(String str) {
        this.optionKey = str;
    }

    public List<Option> getOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec9539b95e81b9d8f5b59c7f164f9866", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec9539b95e81b9d8f5b59c7f164f9866");
        }
        i.a((List) this.options);
        return this.options;
    }

    public void setOptions(List<Option> list) {
        this.options = list;
    }

    public boolean isBankCardNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee0c47c8bba7b3262ac224207a08db59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee0c47c8bba7b3262ac224207a08db59")).booleanValue() : TextUtils.equals(this.factorKey, "bankcard_no") || TextUtils.equals(this.factorKey, "bankcardNo");
    }

    public boolean isUserPhone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3ae9805e4bf3d2c4406d0f6ec1f6fab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3ae9805e4bf3d2c4406d0f6ec1f6fab")).booleanValue() : isUserPhone(this.factorKey);
    }

    public boolean isIdentityNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba26de53f96c5bda2328c129762a7b64", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba26de53f96c5bda2328c129762a7b64")).booleanValue() : TextUtils.equals(this.factorKey, "identity_no") || TextUtils.equals(this.factorKey, "identityNo");
    }

    public boolean isBankCardExpire() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "396bdf4c45608129283be7e5046fbf45", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "396bdf4c45608129283be7e5046fbf45")).booleanValue() : TextUtils.equals(this.factorKey, "bankcard_expire") || TextUtils.equals(this.factorKey, "bankcardExpire");
    }

    public boolean isBankcardCVV2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97d1160ece489693b60027588f6d2176", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97d1160ece489693b60027588f6d2176")).booleanValue() : TextUtils.equals(this.factorKey, "bankcard_cvv2") || TextUtils.equals(this.factorKey, "bankcardCvv2");
    }

    public static boolean isUserPhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2337804d3da4512a93016e3e52026c94", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2337804d3da4512a93016e3e52026c94")).booleanValue() : "user_cellphone".equals(str);
    }

    public boolean isNeedBind() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d996bf09fdadd8b2a057bcafb0834dec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d996bf09fdadd8b2a057bcafb0834dec")).booleanValue() : TextUtils.equals(this.factorKey, "need_bind");
    }

    public String getSmscodeUrl() {
        return this.smscodeUrl;
    }

    public void setSmscodeUrl(String str) {
        this.smscodeUrl = str;
    }

    public boolean isSent() {
        return this.isSent;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public void setSent(boolean z) {
        this.isSent = z;
    }

    public boolean isNormalType() {
        return this.factorType == 1;
    }

    public boolean isOptionsType() {
        return this.factorType == 2;
    }

    public boolean isSMSType() {
        return this.factorType == 3;
    }

    public boolean isVoiceType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0dc063f95dfb3f04875f8b1068bf409", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0dc063f95dfb3f04875f8b1068bf409")).booleanValue() : this.factorType == 3 && TextUtils.equals(this.factorKey, "voicecode");
    }

    public boolean isDisableSplit() {
        return this.disableSplit;
    }

    public String getCardbinUrl() {
        return this.cardbinUrl;
    }

    public void setCardbinUrl(String str) {
        this.cardbinUrl = str;
    }

    public void setDisableSplit(boolean z) {
        this.disableSplit = z;
    }

    public String getFactorFootTip() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feb6532dc9e766c4928fe69919e0f000", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feb6532dc9e766c4928fe69919e0f000");
        }
        if (getDisplay() != null) {
            return getDisplay().getFactorFootTip();
        }
        return null;
    }

    public boolean canBeShownInReadOnlyContainer() {
        return this.readOnly && !this.disableSplit;
    }

    public void setCurrentOption(Option option) {
        this.currentOption = option;
    }

    public Option getCurrentOption() {
        return this.currentOption;
    }
}
