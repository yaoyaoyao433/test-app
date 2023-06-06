package com.sankuai.waimai.irmo.mach.vap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static Bitmap a(TextureView textureView) {
        Bitmap bitmap;
        Object[] objArr = {textureView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02d3ff2156e7fa2734ed95610394f583", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02d3ff2156e7fa2734ed95610394f583");
        }
        try {
            bitmap = textureView.getBitmap();
            try {
                textureView.draw(new Canvas(bitmap));
            } catch (Throwable th) {
                th = th;
                com.sankuai.waimai.foundation.utils.log.a.b(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
        return bitmap;
    }
}
