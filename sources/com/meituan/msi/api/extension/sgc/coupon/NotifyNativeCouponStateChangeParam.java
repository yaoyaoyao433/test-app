package com.meituan.msi.api.extension.sgc.coupon;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class NotifyNativeCouponStateChangeParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public Object data;
    @MsiParamChecker(required = true)
    public String poi_id;
    @MsiParamChecker(required = true)
    public String state;
}
