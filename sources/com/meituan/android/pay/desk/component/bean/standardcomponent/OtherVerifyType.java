package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OtherVerifyType implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8504793330664528481L;
    @SerializedName("change_verify_type_dialog")
    private ChangeVerifyTypeDialog changeVerifyTypeDialog;
    @SerializedName("change_verify_type_tip")
    private String changeVerifyTypeTip;
    @SerializedName("verify_type_list")
    private List<VerifyTypeDetail> verifyTypeList;

    public String getChangeVerifyTypeTip() {
        return this.changeVerifyTypeTip;
    }

    public void setChangeVerifyTypeTip(String str) {
        this.changeVerifyTypeTip = str;
    }

    public ChangeVerifyTypeDialog getChangeVerifyTypeDialog() {
        return this.changeVerifyTypeDialog;
    }

    public void setChangeVerifyTypeDialog(ChangeVerifyTypeDialog changeVerifyTypeDialog) {
        this.changeVerifyTypeDialog = changeVerifyTypeDialog;
    }

    public List<VerifyTypeDetail> getVerifyTypeList() {
        return this.verifyTypeList;
    }

    public void setVerifyTypeList(List<VerifyTypeDetail> list) {
        this.verifyTypeList = list;
    }
}
