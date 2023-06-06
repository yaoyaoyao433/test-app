package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GetFileInfoParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String digestAlgorithm;
    @MsiParamChecker(required = true)
    public String filePath;
}
