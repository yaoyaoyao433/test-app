package com.sankuai.waimai.bussiness.order.confirm.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.bussiness.order.base.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GrayBitmapTransformation implements BitmapTransformation {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ac8ac996c43dc43046cf25b481dc6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ac8ac996c43dc43046cf25b481dc6a");
        }
        Object[] objArr2 = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ce47068b4f529d47f7b28e2080609b99", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ce47068b4f529d47f7b28e2080609b99");
        }
        if (bitmap != null) {
            Paint paint = new Paint();
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        }
        return bitmap;
    }
}
