package com.meituan.mmp.lib.api.invoice;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsInvoiceApi {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsChooseInvoiceTitle extends ApiFunction<InvoiceParams, InvoiceResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class InvoiceParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String env;
        public String type;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class InvoiceResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bankAccount;
        public String bankName;
        public String companyAddress;
        public String errMsg;
        public String taxNumber;
        public String telephone;
        public String title;
        public String type;
    }
}
