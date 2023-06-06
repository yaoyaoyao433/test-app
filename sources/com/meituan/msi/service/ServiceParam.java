package com.meituan.msi.service;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ServiceParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(in = {"payment", "voip"})
    public String name;
}
