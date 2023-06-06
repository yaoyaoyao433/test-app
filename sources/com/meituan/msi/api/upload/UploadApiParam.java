package com.meituan.msi.api.upload;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class UploadApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public String filePath;
    public Map<String, String> formData;
    public Map<String, String> header;
    @MsiParamChecker(required = true)
    public String name;
    public String taskId = "";
    public int timeout;
    @MsiParamChecker(required = true)
    public String url;
}
