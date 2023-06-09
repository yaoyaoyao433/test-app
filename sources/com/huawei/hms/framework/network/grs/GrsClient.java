package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GrsClient {
    private d grsClientGlobal;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
        }
        this.grsClientGlobal = e.a(grsBaseInfo, context);
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        this.grsClientGlobal.a(str, str2, iQueryUrlCallBack);
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        this.grsClientGlobal.a(str, iQueryUrlsCallBack);
    }

    public void clearSp() {
        this.grsClientGlobal.b();
    }

    public boolean forceExpire() {
        return this.grsClientGlobal.c();
    }

    public String synGetGrsUrl(String str, String str2) {
        return this.grsClientGlobal.a(str, str2);
    }

    public Map<String, String> synGetGrsUrls(String str) {
        return this.grsClientGlobal.a(str);
    }
}
