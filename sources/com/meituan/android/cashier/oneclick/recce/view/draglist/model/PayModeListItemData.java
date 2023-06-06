package com.meituan.android.cashier.oneclick.recce.view.draglist.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.cashier.oneclick.recce.view.draglist.c;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
@JsonBean
/* loaded from: classes2.dex */
public class PayModeListItemData implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bizId;
    private int payMode;
    private String payModeText;
    private String promoLabel;

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public int getPayMode() {
        return this.payMode;
    }

    public void setPayMode(int i) {
        this.payMode = i;
    }

    public String getPayModeText() {
        return this.payModeText;
    }

    public void setPayModeText(String str) {
        this.payModeText = str;
    }

    public String getPromoLabel() {
        return this.promoLabel;
    }

    public void setPromoLabel(String str) {
        this.promoLabel = str;
    }

    @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.c
    public String getItemContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bc8423b32e23736c75f1f58ff5328db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bc8423b32e23736c75f1f58ff5328db") : getPayModeText();
    }

    @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.c
    public List<Label> getLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae20288401851ca240f76cfa0e8011a", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae20288401851ca240f76cfa0e8011a") : transfer(getPromoLabel());
    }

    private List<Label> transfer(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b12736bd4437bf564e185443901d0cbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b12736bd4437bf564e185443901d0cbd");
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(CommonConstant.Symbol.COMMA)) {
                Label label = new Label();
                label.setContent(str2);
                label.setStyle(1);
                arrayList.add(label);
            }
        }
        return arrayList;
    }
}
