package com.sankuai.waimai.bussiness.order.detailnew.widget.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GeometricScaleTransform implements BitmapTransformation {
    public static ChangeQuickRedirect a;
    private Context b;
    private int c;

    public GeometricScaleTransform(Context context, int i) {
        Object[] objArr = {context, 48};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3bf4278cdd7bc0f0c42f51b8f20c0f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3bf4278cdd7bc0f0c42f51b8f20c0f3");
            return;
        }
        this.b = context;
        this.c = 48;
    }

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7983f7215dea4aa3b11d2d0919f50e25", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7983f7215dea4aa3b11d2d0919f50e25");
        }
        if (this.c <= 0) {
            return bitmap;
        }
        int a2 = g.a(this.b, this.c);
        int i3 = (i2 * a2) / i;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Bitmap createBitmap = Bitmap.createBitmap(a2, i3, Bitmap.Config.ARGB_8888);
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        rect2.set(0, 0, a2, i3);
        new Canvas(createBitmap).drawBitmap(bitmap, rect, rect2, (Paint) null);
        return createBitmap;
    }
}
