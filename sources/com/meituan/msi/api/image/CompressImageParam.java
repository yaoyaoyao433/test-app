package com.meituan.msi.api.image;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class CompressImageParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int quality = 80;
    @MsiParamChecker(required = true)
    public String src;
}
