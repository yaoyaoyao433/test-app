package com.sankuai.waimai.store.platform.capacity.imageloader.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.shangou.stone.util.b;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.waimai.store.util.f;
import com.sankuai.waimai.store.util.x;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BlurTransformation implements BitmapTransformation {
    public static ChangeQuickRedirect a = null;
    private static int b = 25;
    private static int c = 1;
    private final Context d;
    private final int e;
    private final int f;
    private final float g;
    private final float h;
    private final float i;

    public static BlurTransformation a(Context context, float f, float f2, float f3) {
        Object[] objArr = {context, Float.valueOf(0.1f), Float.valueOf(0.3f), Float.valueOf(0.33f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c3eb713887a620becae2623e56af26e", RobustBitConfig.DEFAULT_VALUE) ? (BlurTransformation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c3eb713887a620becae2623e56af26e") : new BlurTransformation(context, c, -1, 0.1f, 0.3f, 0.33f);
    }

    private BlurTransformation(Context context, int i, int i2, float f, float f2, float f3) {
        Object[] objArr = {context, Integer.valueOf(i), -1, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a975ff974d1a33e20ff6c1bc504991", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a975ff974d1a33e20ff6c1bc504991");
            return;
        }
        this.d = context.getApplicationContext();
        this.e = i;
        this.f = -1;
        this.g = f;
        this.h = f2;
        this.i = f3;
    }

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Bitmap a2;
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216d47336bbd26da12c1aebb60b7f236", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216d47336bbd26da12c1aebb60b7f236");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f;
        if (this.g > 0.0f) {
            i3 = (int) (width * this.g);
        }
        if (i3 <= 0 || i3 > b) {
            i3 = b;
        }
        int b2 = n.b((int) (this.h * width), 0, width / 2);
        int b3 = n.b((int) (this.i * height), 0, height / 2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, b2, b3, width - (b2 * 2), height - (b3 * 2));
        if (Build.VERSION.SDK_INT == 22 && (RouteSelector.ROM_OPPO.equalsIgnoreCase(Build.MANUFACTURER) || RouteSelector.ROM_VIVO.equalsIgnoreCase(Build.MANUFACTURER))) {
            a2 = f.a(createBitmap, i3, true);
        } else {
            try {
                a2 = x.a(this.d, createBitmap, i3);
            } catch (RSRuntimeException e) {
                a2 = f.a(createBitmap, i3, true);
                a.a(e);
            }
        }
        Bitmap a3 = b.a(a2, i, i2);
        if (a2 != null) {
            a2.recycle();
        }
        return a3;
    }
}
