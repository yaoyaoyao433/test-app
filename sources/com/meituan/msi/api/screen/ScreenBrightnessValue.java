package com.meituan.msi.api.screen;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ScreenBrightnessValue {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(max = 1, min = 0, required = true)
    public float value;
}
