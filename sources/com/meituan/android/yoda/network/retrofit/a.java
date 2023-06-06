package com.meituan.android.yoda.network.retrofit;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements i<ap, Bitmap> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.meituan.retrofit2.i
    public Bitmap a(ap apVar) throws IOException {
        InputStream source;
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b0df1903226f37789a68958211cb4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b0df1903226f37789a68958211cb4b");
        }
        InputStream inputStream = null;
        try {
            source = apVar.source();
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(source);
            if (source != null) {
                try {
                    source.close();
                } catch (IOException unused) {
                }
            }
            return a2;
        } catch (Throwable th2) {
            inputStream = source;
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
