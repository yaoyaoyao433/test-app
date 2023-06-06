package com.meituan.msi.api.location;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RefreshLocationResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String addressName;
    public String cityName;
    public boolean isLocFail;
    public boolean isRegeoFail;
    public String latitude;
    public boolean locAuthEnable;
    public boolean locSevEnable;
    public String longitude;
}
