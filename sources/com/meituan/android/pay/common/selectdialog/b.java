package com.meituan.android.pay.common.selectdialog;

import com.meituan.android.paybase.widgets.label.Label;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b extends Serializable {
    List<Label> getGlobalLabels();

    String getGlobalLabelsPrefix();

    List<a> getInsertPaymentsList();

    List<com.meituan.android.pay.common.payment.data.a> getMtPaymentList();

    String getPageTitle();
}
