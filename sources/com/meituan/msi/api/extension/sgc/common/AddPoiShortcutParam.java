package com.meituan.msi.api.extension.sgc.common;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AddPoiShortcutParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public String name;
    @MsiParamChecker(required = true)
    public String picUrl;
    @MsiParamChecker(required = true)
    public String scheme;
}
