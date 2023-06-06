package com.meituan.msi.horn.base;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RegisterHornConfigParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object params;
    @MsiParamChecker(required = true)
    public String type;
}
