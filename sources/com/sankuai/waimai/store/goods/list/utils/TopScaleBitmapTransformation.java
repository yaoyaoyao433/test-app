package com.sankuai.waimai.store.goods.list.utils;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TopScaleBitmapTransformation implements BitmapTransformation {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Bitmap createScaledBitmap;
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa15cf1fcfe9da86c63177e1e6f0284", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa15cf1fcfe9da86c63177e1e6f0284");
        }
        Object[] objArr2 = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28788932c58165edce77891b11961b6a", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28788932c58165edce77891b11961b6a") : (bitmap == null || (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, (int) ((((float) i) / ((float) bitmap.getWidth())) * ((float) bitmap.getHeight())), false)) == null) ? bitmap : createScaledBitmap;
    }
}
