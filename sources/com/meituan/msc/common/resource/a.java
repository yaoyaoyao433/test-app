package com.meituan.msc.common.resource;

import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.common.resource.b
    public final Object a(String str, Map<String, String> map, InputStream inputStream) {
        Object[] objArr = {str, map, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a3fd42d3d472b9cebe237396cf346a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a3fd42d3d472b9cebe237396cf346a");
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, "UTF-8", inputStream);
        if (map != null && !map.isEmpty()) {
            Map<String, String> responseHeaders = webResourceResponse.getResponseHeaders();
            if (responseHeaders == null) {
                responseHeaders = new HashMap<>();
            }
            responseHeaders.putAll(map);
            webResourceResponse.setResponseHeaders(map);
        }
        return webResourceResponse;
    }
}
