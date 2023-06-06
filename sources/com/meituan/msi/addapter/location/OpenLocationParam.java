package com.meituan.msi.addapter.location;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class OpenLocationParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String address;
    @MsiParamChecker(required = true)
    public double latitude;
    @MsiParamChecker(required = true)
    public double longitude;
    public String name;
    public int scale;
}
