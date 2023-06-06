package com.meituan.msi.wmad.base;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AdChargeReportParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String adId;
    @MsiParamChecker(required = true)
    public String bid;
    @MsiParamChecker(required = true)
    public String chargeInfo;
    public Object extraParams;
    public int immediately = 1;
    @MsiParamChecker(required = true)
    public boolean isClickReport;
}
