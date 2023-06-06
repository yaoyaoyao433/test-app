package com.meituan.msi.api.extension.wm.temp;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RequestWMApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String body;
    public String dataType;
    public String headers;
    public String method = "GET";
    public String params;
    @MsiParamChecker(required = true)
    public String url;
}
