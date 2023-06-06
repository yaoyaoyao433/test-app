package com.meituan.android.mrn.update;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MRNCheckUpdateRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app;
    public String app_version;
    public List<RequestBundleInfo> bundles;
    public String channel;
    public String mrn_version;
    public String platform;
    public String rnVersion;
    public String uuid;

    public MRNCheckUpdateRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<RequestBundleInfo> list) {
        this.platform = str;
        this.app = str2;
        this.app_version = str3;
        this.channel = str4;
        this.uuid = str7;
        this.mrn_version = str5;
        this.rnVersion = str6;
        this.bundles = list;
    }
}
