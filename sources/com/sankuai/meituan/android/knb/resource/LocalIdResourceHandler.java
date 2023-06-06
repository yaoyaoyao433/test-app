package com.sankuai.meituan.android.knb.resource;

import android.content.Context;
import com.dianping.titans.cache.ICachedResourceHandler;
import com.dianping.titans.cache.MimeTypeInputStream;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class LocalIdResourceHandler implements ICachedResourceHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context context;

    @Override // com.dianping.titans.cache.ICachedResourceHandler
    public final void init(Context context) {
        this.context = context;
    }

    @Override // com.dianping.titans.cache.ICachedResourceHandler
    public final MimeTypeInputStream match(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9bdcf27f9d4c070852fc2928635e3ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (MimeTypeInputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9bdcf27f9d4c070852fc2928635e3ec");
        }
        InputStream inputStream = LocalIdUtils.getInputStream(context, str2);
        if (inputStream != null) {
            return new MimeTypeInputStream("image/*", inputStream, MimeTypeInputStream.Type.LOCAL_ID);
        }
        return null;
    }
}
