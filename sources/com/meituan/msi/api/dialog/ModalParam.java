package com.meituan.msi.api.dialog;

import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ModalParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String content;
    public boolean editable;
    public String placeholderText;
    public String title;
    public boolean showCancel = true;
    public String cancelText = IPaymentManager.NO_ACTION;
    public String cancelColor = DiagnoseLog.COLOR_ERROR;
    public String confirmText = "确定";
    public String confirmColor = "#596b93";
}
