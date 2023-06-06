package com.meituan.mmp.lib.msi.tabbar;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class TabBarApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String backgroundColor;
    public String borderStyle;
    public String color;
    public String iconPath;
    @MsiParamChecker(min = 0)
    public int index;
    public boolean isShow;
    public String selectedColor;
    public String selectedIconPath;
    public String text;
}
