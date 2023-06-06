package com.meituan.msi.api.extension.wm.common;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RecordWMDeepLinkBizInfoParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public Object bizInfo;
    @MsiParamChecker(required = true)
    public String bizKey;
}
