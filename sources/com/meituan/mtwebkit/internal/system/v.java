package com.meituan.mtwebkit.internal.system;

import android.webkit.WebResourceResponse;
import com.meituan.mtwebkit.MTWebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v extends WebResourceResponse {
    public static ChangeQuickRedirect a;

    public v(MTWebResourceResponse mTWebResourceResponse) {
        super(mTWebResourceResponse.getMimeType(), mTWebResourceResponse.getEncoding(), mTWebResourceResponse.getData());
        boolean z = true;
        Object[] objArr = {mTWebResourceResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f53a6bf83ca668ac0cf8a1bf8c828a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f53a6bf83ca668ac0cf8a1bf8c828a");
            return;
        }
        int statusCode = mTWebResourceResponse.getStatusCode();
        String reasonPhrase = mTWebResourceResponse.getReasonPhrase();
        Object[] objArr2 = {Integer.valueOf(statusCode), reasonPhrase};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ec7cebd950fa3b687376beaad09c687b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ec7cebd950fa3b687376beaad09c687b")).booleanValue();
        } else if (statusCode < 100 || statusCode > 599 || ((statusCode > 299 && statusCode < 400) || reasonPhrase == null || reasonPhrase.trim().isEmpty())) {
            z = false;
        }
        if (z) {
            setStatusCodeAndReasonPhrase(statusCode, reasonPhrase);
        }
        setResponseHeaders(mTWebResourceResponse.getResponseHeaders());
    }
}
