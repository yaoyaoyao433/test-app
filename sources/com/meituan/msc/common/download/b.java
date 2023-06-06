package com.meituan.msc.common.download;

import com.meituan.msc.common.utils.al;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.common.utils.v;
import com.meituan.msc.extern.Downloader;
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
public final class b implements Downloader {
    public static ChangeQuickRedirect a;
    private final AtomicInteger b;

    @Override // com.meituan.msc.extern.Downloader
    public final void cancel(String str) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41c5d3d0ad00bde48caf27a4b91deb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41c5d3d0ad00bde48caf27a4b91deb4");
        } else {
            this.b = new AtomicInteger();
        }
    }

    @Override // com.meituan.msc.extern.Downloader
    public final void download(String str, final String str2, final Downloader.Callback callback) {
        Object[] objArr = {str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7e19e8b5916596c82eb0437733b3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7e19e8b5916596c82eb0437733b3c3");
        } else {
            al.a().c().newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: com.meituan.msc.common.download.b.1
                public static ChangeQuickRedirect a;

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    Object[] objArr2 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8aad65717c284672002d4f635e4613b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8aad65717c284672002d4f635e4613b");
                    } else {
                        callback.onFail(iOException == null ? null : iOException.toString());
                    }
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) throws IOException {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8018880a9c70beb47871dabbffae0a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8018880a9c70beb47871dabbffae0a6");
                        return;
                    }
                    if (response.isSuccessful()) {
                        String encodedPath = response.request().url().encodedPath();
                        String str3 = str2;
                        File file = new File(str3, "tmp_" + System.currentTimeMillis() + CommonConstant.Symbol.UNDERLINE + b.this.b.getAndAdd(1) + r.b(encodedPath));
                        if (response.body() != null && v.a(response.body().byteStream(), file)) {
                            callback.onSuccess(file.getAbsolutePath());
                            return;
                        }
                    }
                    callback.onFail("download fail");
                }
            });
        }
    }
}
