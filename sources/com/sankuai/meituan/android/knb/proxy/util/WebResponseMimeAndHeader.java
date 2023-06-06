package com.sankuai.meituan.android.knb.proxy.util;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class WebResponseMimeAndHeader {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, String> mHeadersMap;
    private String mMime;

    public final String getMime() {
        return this.mMime;
    }

    public final void setMime(String str) {
        this.mMime = str;
    }

    public final Map<String, String> getHeadersMap() {
        return this.mHeadersMap;
    }

    public final void setHeadersMap(Map<String, String> map) {
        this.mHeadersMap = map;
    }
}
