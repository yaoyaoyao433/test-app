package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PromoInfoBankLabel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2518487989597303837L;
    private String content;
    @SerializedName(PersonaTable.LABEL_ID)
    private String labelId;

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getLabelId() {
        return this.labelId;
    }

    public void setLabelId(String str) {
        this.labelId = str;
    }
}
