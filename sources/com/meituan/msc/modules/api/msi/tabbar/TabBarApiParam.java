package com.meituan.msc.modules.api.msi.tabbar;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class TabBarApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String iconPath;
    @MsiParamChecker(min = 0, required = true)
    public Integer index;
    public String selectedIconPath;
    public String text;
}
