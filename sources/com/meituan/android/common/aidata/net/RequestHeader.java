package com.meituan.android.common.aidata.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestHeader {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean headChange;
    private Map<String, String> map;
    private final RequestBuilder requestBuilder;

    public RequestHeader(RequestBuilder requestBuilder) {
        Object[] objArr = {requestBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4979ee706b09ee4b39256dfada4033d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4979ee706b09ee4b39256dfada4033d3");
            return;
        }
        this.requestBuilder = requestBuilder;
        this.map = new HashMap();
    }

    public RequestBuilder endHeader() {
        return this.requestBuilder;
    }

    public RequestHeader addHeader(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d85d5335ccd98b148bd4443664b6a20", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestHeader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d85d5335ccd98b148bd4443664b6a20");
        }
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.headChange = true;
        this.map.put(str, str2);
        return this;
    }

    public boolean isHeadChange() {
        return this.headChange;
    }

    public Headers getHeaders() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dea84b1d6d5602d00cb473641b162b80", RobustBitConfig.DEFAULT_VALUE)) {
            return (Headers) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dea84b1d6d5602d00cb473641b162b80");
        }
        this.headChange = false;
        return Headers.of(this.map);
    }
}
