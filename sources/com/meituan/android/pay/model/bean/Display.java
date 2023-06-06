package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Display implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7949562530466746379L;
    @SerializedName("factor_display_name")
    private String displayNameInDialog;
    @SerializedName("factor_foottip")
    private String factorFootTip;
    @SerializedName("factor_name")
    private String factorName;
    @SerializedName("factor_tip")
    private String factorTip;
    @SerializedName("factor_value_sug")
    private ArrayList<FactorValueSug> factorValueSug;
    @SerializedName("factor_help")
    private Help help;

    public String getFactorName() {
        return this.factorName;
    }

    public void setFactorName(String str) {
        this.factorName = str;
    }

    public String getFactorTip() {
        return this.factorTip;
    }

    public void setFactorTip(String str) {
        this.factorTip = str;
    }

    public Help getHelp() {
        return this.help;
    }

    public void setHelp(Help help) {
        this.help = help;
    }

    public String getFactorFootTip() {
        return this.factorFootTip;
    }

    public void setFactorFootTip(String str) {
        this.factorFootTip = str;
    }

    public ArrayList<FactorValueSug> getFactorValueSug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6ca6a95100adeba0075a01553b77fcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6ca6a95100adeba0075a01553b77fcf");
        }
        i.a((List) this.factorValueSug);
        return this.factorValueSug;
    }

    public void setFactorValueSug(ArrayList<FactorValueSug> arrayList) {
        this.factorValueSug = arrayList;
    }

    public String getDisplayNameInDialog() {
        return this.displayNameInDialog;
    }

    public void setDisplayNameInDialog(String str) {
        this.displayNameInDialog = str;
    }
}
