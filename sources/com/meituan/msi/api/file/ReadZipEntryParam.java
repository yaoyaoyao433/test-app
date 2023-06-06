package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ReadZipEntryParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(in = {"ascii", "base64", "binary", "hex", "ucs2", "ucs-2", "utf16le", "utf-16le", "utf-8", "utf8", "latin1"})
    public String encoding;
    @MsiParamChecker(required = true)
    public Object entries;
    @MsiParamChecker(required = true)
    public String filePath;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Entry {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String encoding;
        public int length;
        public String path;
        public int position;
    }
}
