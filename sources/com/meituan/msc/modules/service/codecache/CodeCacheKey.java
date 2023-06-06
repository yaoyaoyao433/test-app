package com.meituan.msc.modules.service.codecache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CodeCacheKey {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String appId;
    private final String appVersion;
    private final String jsFileRelativePath;
    private final String packageName;

    public CodeCacheKey(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aff60047e1dfe70f4ac72f135bf7323", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aff60047e1dfe70f4ac72f135bf7323");
            return;
        }
        this.appId = str;
        this.appVersion = str2;
        this.packageName = str3;
        this.jsFileRelativePath = str4;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getJsFileRelativePath() {
        return this.jsFileRelativePath;
    }
}
