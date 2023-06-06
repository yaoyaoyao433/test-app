package com.sankuai.meituan.android.knb.localresource;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocalResourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final String KEY_LOCAL_RESOURCE = "key_local_resource";
    private static final List<ILocalResource> sResourceClass = b.a(ILocalResource.class, KEY_LOCAL_RESOURCE);

    public static WebResourceResponse getLocalResourceResponse(Context context, WebResourceRequest webResourceRequest) {
        Object[] objArr = {context, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df0fa7b3b978b8b1a928f592425010a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df0fa7b3b978b8b1a928f592425010a2");
        }
        if (sResourceClass == null || sResourceClass.size() == 0) {
            return null;
        }
        return sResourceClass.get(0).getLocalResourceResponse(context, webResourceRequest);
    }
}
