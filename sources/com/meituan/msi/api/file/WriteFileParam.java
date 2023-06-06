package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class WriteFileParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean append;
    @MsiParamChecker(required = true)
    public String data;
    public String encoding;
    @MsiParamChecker(required = true)
    public String filePath;
}
