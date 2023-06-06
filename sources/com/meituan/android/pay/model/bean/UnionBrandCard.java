package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class UnionBrandCard implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4025322602314930590L;
    @SerializedName("cobranded_name")
    private String cobrandedName;
    private List<Label> labels;

    public String getCobrandedName() {
        return this.cobrandedName;
    }

    public void setCobrandedName(String str) {
        this.cobrandedName = str;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public void setLabels(List<Label> list) {
        this.labels = list;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de58df1625e771e020e523266bd49bc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de58df1625e771e020e523266bd49bc9");
        }
        return "UnionBrandCard{cobrandedName='" + this.cobrandedName + "', labels=" + this.labels + '}';
    }
}
