package com.sankuai.waimai.store.platform.capacity.imageloader.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FixedSizeTransform implements BitmapTransformation {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public FixedSizeTransform(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c574f5543681cf3de0311b52ca0735", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c574f5543681cf3de0311b52ca0735");
            return;
        }
        this.b = i;
        this.c = i2;
    }

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03c27f6f7da0f2fe5a5a101e86f7102", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03c27f6f7da0f2fe5a5a101e86f7102");
        }
        if (i == this.b && i2 == this.c) {
            return bitmap;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Bitmap createBitmap = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        rect2.set(0, 0, this.b, this.c);
        new Canvas(createBitmap).drawBitmap(bitmap, rect, rect2, (Paint) null);
        return createBitmap;
    }
}
