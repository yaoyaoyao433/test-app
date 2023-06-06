package com.sankuai.waimai.business.page.common.util;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CircleBitmapTransformation implements BitmapTransformation {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public CircleBitmapTransformation(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "299f7c0f6933a48e0a327dc8a0304dce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "299f7c0f6933a48e0a327dc8a0304dce");
            return;
        }
        this.b = i;
        this.c = 0;
    }

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc7e2e242bda4e2420b58983598484c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc7e2e242bda4e2420b58983598484c");
        }
        int i3 = this.b;
        int i4 = this.c;
        Object[] objArr2 = {bitmap, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25352b7185a0f32a592a6b9ac8f291f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25352b7185a0f32a592a6b9ac8f291f2");
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap.getHeight() != i3) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i3, i3, false);
            if (createBitmap != bitmap) {
                createBitmap.recycle();
            }
            createBitmap = createScaledBitmap;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || config != Bitmap.Config.ARGB_8888) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i3, i3 - i4, config);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = i3 / 2.0f;
        canvas.drawCircle(f, f - i4, f, paint);
        createBitmap.recycle();
        return createBitmap2;
    }
}
