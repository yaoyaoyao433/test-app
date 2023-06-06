package com.sankuai.waimai.mach.manager.download.update;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachUpdateRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app;
    public String app_version;
    public List<BundleInfo> bundles;
    public String channel;
    public String mach_version;
    public String platform;
    public String[] tags;
    public String uuid;
}
