package com.meituan.android.common.metricx.fileuploader;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FileUpLoadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean is_traffic_whitelist;
    public boolean reset_file_id_limit;
    public long upload_size;
    public Map<String, String> internal_files = new HashMap();
    public Map<String, String> external_files = new HashMap();
    public Map<String, String> custom_files = new HashMap();
}
