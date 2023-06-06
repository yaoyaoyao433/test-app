package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class WriteParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public String data;
    public String encoding;
    @MsiParamChecker(required = true)
    public String fd;
    public int length;
    public int offset;
    public int position;
}
