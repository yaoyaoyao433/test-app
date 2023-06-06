package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GetSavedFileListResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<FileItem> fileList;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class FileItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long createTime;
        public String filePath;
        public long size;
    }
}
