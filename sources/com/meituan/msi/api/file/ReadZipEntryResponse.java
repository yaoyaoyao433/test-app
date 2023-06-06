package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ReadZipEntryResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<String, FileItem> entries;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class FileItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Object data;
        public String errMsg;
    }
}
