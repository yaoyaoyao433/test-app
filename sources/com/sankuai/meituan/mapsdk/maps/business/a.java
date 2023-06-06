package com.sankuai.meituan.mapsdk.maps.business;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";

    public static Bitmap a(int i, int i2) {
        Object[] objArr = {Integer.valueOf((int) PolylineOptions.DEFAULT_BORDER_COLOR), 8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd867f377f610b1d5a6fdc8e6f81dba0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd867f377f610b1d5a6fdc8e6f81dba0");
        }
        Paint paint = new Paint(1);
        paint.setColor(PolylineOptions.DEFAULT_BORDER_COLOR);
        Bitmap createBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawCircle(8.0f, 8.0f, 8.0f, paint);
        return createBitmap;
    }
}
