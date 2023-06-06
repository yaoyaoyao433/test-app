package com.meituan.msi.api.download;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class DownloadApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String filePath;
    public Map<String, String> header;
    public String taskId;
    public int timeout;
    @MsiParamChecker(required = true)
    public String url;
}
