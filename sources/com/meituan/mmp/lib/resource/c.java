package com.meituan.mmp.lib.resource;

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

    @Override // com.meituan.mmp.lib.resource.b
    public final Object a(String str, Map<String, String> map, InputStream inputStream) {
        Object[] objArr = {str, map, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e213c05da6ee38aae007161e215e77b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e213c05da6ee38aae007161e215e77b");
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
