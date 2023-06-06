package com.meituan.msi.api.location;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GetLocationApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public LocationMtParam _mt;
    @MsiParamChecker(in = {"wgs84", "gcj02"})
    public String type = "wgs84";
}
