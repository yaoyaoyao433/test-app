package com.meituan.android.pay.common.selectdialog.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.selectdialog.a;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class InsertMTPayments implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6742359447825802732L;
    @SerializedName("insert_index")
    private int insertIndex;
    @SerializedName("label")
    private String label;
    @SerializedName(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)
    private List<MTPayment> mtMorePaymentList;

    @Override // com.meituan.android.pay.common.selectdialog.a
    public int getInsertIndex() {
        return this.insertIndex;
    }

    public void setInsertIndex(int i) {
        this.insertIndex = i;
    }

    @Override // com.meituan.android.pay.common.selectdialog.a
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setMtMorePaymentList(List<MTPayment> list) {
        this.mtMorePaymentList = list;
    }

    @Override // com.meituan.android.pay.common.selectdialog.a
    public List<com.meituan.android.pay.common.payment.data.a> getMtMorePaymentList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecc403f9160dd29c8b574cd372ff1e84", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecc403f9160dd29c8b574cd372ff1e84");
        }
        i.a((List) this.mtMorePaymentList);
        ArrayList arrayList = new ArrayList();
        if (!i.a((Collection) this.mtMorePaymentList)) {
            arrayList.addAll(this.mtMorePaymentList);
        }
        return arrayList;
    }
}
