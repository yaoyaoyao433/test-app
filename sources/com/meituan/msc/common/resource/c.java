package com.meituan.msc.common.resource;

import com.meituan.mtwebkit.MTWebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.common.resource.b
    public final Object a(String str, Map<String, String> map, InputStream inputStream) {
        Object[] objArr = {str, map, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820d20cec756b5f1d79bcadf05972405", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820d20cec756b5f1d79bcadf05972405");
        }
        MTWebResourceResponse mTWebResourceResponse = new MTWebResourceResponse(str, "UTF-8", inputStream);
        if (map != null && !map.isEmpty()) {
            Map<String, String> responseHeaders = mTWebResourceResponse.getResponseHeaders();
            if (responseHeaders == null) {
                responseHeaders = new HashMap<>();
            }
            responseHeaders.putAll(map);
            mTWebResourceResponse.setResponseHeaders(map);
        }
        return mTWebResourceResponse;
    }
}
