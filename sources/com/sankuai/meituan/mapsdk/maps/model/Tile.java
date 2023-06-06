package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Tile {
    public static Tile EMPTY_TILE;
    public static ChangeQuickRedirect changeQuickRedirect;
    public final byte[] mData;
    public final int mHeight;
    public final int mWidth;

    static {
        byte[] byteArray;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a056e35a4cdca0e7544bc083893664a", RobustBitConfig.DEFAULT_VALUE)) {
            byteArray = (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a056e35a4cdca0e7544bc083893664a");
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawARGB(0, 255, 255, 255);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        EMPTY_TILE = new Tile(-1, -1, byteArray);
    }

    public Tile(int i, int i2, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa27ccbb09539dbc8ad6dd6d7bed598a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa27ccbb09539dbc8ad6dd6d7bed598a");
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
        this.mData = bArr;
    }

    public final byte[] getData() {
        return this.mData;
    }
}
