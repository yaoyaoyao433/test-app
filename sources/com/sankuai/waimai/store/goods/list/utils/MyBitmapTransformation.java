package com.sankuai.waimai.store.goods.list.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MyBitmapTransformation implements BitmapTransformation {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6361ca149e0840c969c1bebf8bca2e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6361ca149e0840c969c1bebf8bca2e9");
        }
        int a2 = h.a(com.sankuai.waimai.store.util.b.a(), 36.0f);
        int a3 = h.a(com.sankuai.waimai.store.util.b.a(), 0.0f);
        Object[] objArr2 = {bitmap, Integer.valueOf(a2), Integer.valueOf(a3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7d0a02467ec442930a5f8a5136c6794", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7d0a02467ec442930a5f8a5136c6794");
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap.getHeight() != a2) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, a2, a2, false);
            if (createBitmap != bitmap) {
                createBitmap.recycle();
            }
            createBitmap = createScaledBitmap;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || config != Bitmap.Config.ARGB_8888) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(a2, a2 - a3, config);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = a2 / 2.0f;
        canvas.drawCircle(f, f - a3, f, paint);
        createBitmap.recycle();
        return createBitmap2;
    }
}
