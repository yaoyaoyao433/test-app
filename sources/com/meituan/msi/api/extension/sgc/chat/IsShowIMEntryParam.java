package com.meituan.msi.api.extension.sgc.chat;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class IsShowIMEntryParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object extraInfo;
    @MsiParamChecker(required = true)
    public String poiID;
    @MsiParamChecker(required = true)
    public String poiIDStr;
    public String spuID;
}
