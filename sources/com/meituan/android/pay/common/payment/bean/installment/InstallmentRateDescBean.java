package com.meituan.android.pay.common.payment.bean.installment;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class InstallmentRateDescBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6978814847893075356L;
    private String content;
    @SerializedName("table_list")
    private List<InstallmentDescTable> tableList;
    @SerializedName("table_title")
    private List<String> tableTitle;
    private String title;

    public void setTableTitle(List<String> list) {
        this.tableTitle = list;
    }

    public void setTableList(List<InstallmentDescTable> list) {
        this.tableList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getContent() {
        return this.content;
    }

    public List<String> getTableTitle() {
        return this.tableTitle;
    }

    public List<InstallmentDescTable> getTableList() {
        return this.tableList;
    }
}
