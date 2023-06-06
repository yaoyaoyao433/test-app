package com.meituan.msc.views.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static NinePatchDrawable a(Resources resources, Bitmap bitmap, int i, int i2, int i3, int i4, String str) {
        Object[] objArr = {resources, bitmap, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6efd9f4b7671e7054de5aca5e45b6e2c", RobustBitConfig.DEFAULT_VALUE) ? (NinePatchDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6efd9f4b7671e7054de5aca5e45b6e2c") : new NinePatchDrawable(resources, bitmap, a(i, i2, i3, i4).array(), new Rect(), null);
    }

    private static ByteBuffer a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ea5a0eba8ca8b05b50277b649256ee0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ea5a0eba8ca8b05b50277b649256ee0");
        }
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i2);
        order.putInt(i4);
        order.putInt(i);
        order.putInt(i3);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
