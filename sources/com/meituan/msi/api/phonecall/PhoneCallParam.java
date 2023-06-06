package com.meituan.msi.api.phonecall;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PhoneCallParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public String phoneNumber;
}
