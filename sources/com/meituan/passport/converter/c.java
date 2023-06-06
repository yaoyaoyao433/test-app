package com.meituan.passport.converter;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements com.sankuai.meituan.retrofit2.i<ap, Bitmap> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.meituan.retrofit2.i
    public Bitmap a(ap apVar) throws IOException {
        InputStream source;
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b66330b13ce6e0642ee8902728265f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b66330b13ce6e0642ee8902728265f3");
        }
        InputStream inputStream = null;
        try {
            source = apVar.source();
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(source);
            com.meituan.passport.utils.i.a(source);
            return a2;
        } catch (Throwable th2) {
            inputStream = source;
            th = th2;
            com.meituan.passport.utils.i.a(inputStream);
            throw th;
        }
    }
}
