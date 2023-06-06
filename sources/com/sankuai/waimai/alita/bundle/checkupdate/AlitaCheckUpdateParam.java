package com.sankuai.waimai.alita.bundle.checkupdate;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaCheckUpdateParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app;
    public String appVersion;
    public List<BundleInfo> bundles;
    public String channel;
    public String platform;
    public String sdkVersion;
    public String uuid;
}
