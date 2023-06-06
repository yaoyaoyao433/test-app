package com.meituan.msi.api.extension.sgc.common;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class CollectPoiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isCollected = true;
    @MsiParamChecker(required = true)
    public String poiId;
    public String poiIdStr;
}
