package com.meituan.msi.api.clipboard;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ClipboardData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ClipboardMtParam _mt;
    @MsiParamChecker(required = true)
    public String data;
}
