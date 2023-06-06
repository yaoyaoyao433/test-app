package com.meituan.mmp.main;

import com.meituan.mmp.lib.utils.an;
import com.meituan.mmp.main.Downloader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac implements Downloader {
    public static ChangeQuickRedirect a;
    private final AtomicInteger b;

    @Override // com.meituan.mmp.main.Downloader
    public final void cancel(String str) {
    }

    public ac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea45117c71e8caf23a38068e3e720dee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea45117c71e8caf23a38068e3e720dee");
        } else {
            this.b = new AtomicInteger();
        }
    }

    @Override // com.meituan.mmp.main.Downloader
    public final void download(String str, final String str2, final Downloader.Callback callback) {
        Object[] objArr = {str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e220e7befe28b761db98e59d5628d020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e220e7befe28b761db98e59d5628d020");
        } else {
            an.a().e().newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: com.meituan.mmp.main.ac.1
                public static ChangeQuickRedirect a;

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    Object[] objArr2 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08f7bd94763a1fbd8f8e7a1777b8270d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08f7bd94763a1fbd8f8e7a1777b8270d");
                    } else {
                        callback.onFail(iOException == null ? null : iOException.toString());
                    }
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) throws IOException {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8834bfd1f346a079db515d9bc822f428", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8834bfd1f346a079db515d9bc822f428");
                        return;
                    }
                    if (response.isSuccessful()) {
                        String encodedPath = response.request().url().encodedPath();
                        String str3 = str2;
                        File file = new File(str3, "tmp_" + System.currentTimeMillis() + CommonConstant.Symbol.UNDERLINE + ac.this.b.getAndAdd(1) + com.meituan.mmp.lib.utils.s.c(encodedPath));
                        if (response.body() != null && com.meituan.mmp.lib.utils.x.a(response.body().byteStream(), file)) {
                            callback.onSuccess(file.getAbsolutePath(), response.body().contentLength());
                            return;
                        }
                    }
                    callback.onFail("download fail");
                }
            });
        }
    }
}
