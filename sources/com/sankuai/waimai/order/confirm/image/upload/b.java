package com.sankuai.waimai.order.confirm.image.upload;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.order.confirm.image.upload.c;
import com.sankuai.waimai.platform.net.e;
import com.sankuai.waimai.store.base.net.upload.UploadInfo;
import com.sankuai.waimai.store.util.service.StreamService;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.entity.mime.content.ContentBody;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @WorkerThread
    public static String a(Context context, @NonNull String str, String str2, String str3, byte[] bArr, c.b bVar, HashMap<String, ContentBody> hashMap) {
        Object[] objArr = {context, str, str2, str3, bArr, bVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9187d7c210b902db9012fac20f38adda", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9187d7c210b902db9012fac20f38adda");
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        af.a(buildUpon, com.sankuai.waimai.router.set_id.b.a().b());
        af.a(buildUpon, e.b(str));
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        af.a(buildUpon, e.d(str));
        af.a(buildUpon, com.sankuai.waimai.platform.net.c.a().g());
        try {
            return ((StreamService) com.sankuai.waimai.store.util.service.a.a().b.a(StreamService.class)).uploadImage(buildUpon.toString(), UploadInfo.getMultiPart(str3, "picture.jpg", UploadInfo.getDefaultRequestBody(bArr))).a().e().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
