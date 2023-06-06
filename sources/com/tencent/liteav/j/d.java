package com.tencent.liteav.j;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.j;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static FileOutputStream a;
    public static FileOutputStream b;
    public static FileOutputStream c;

    public static Bitmap a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        ByteBuffer order = ByteBuffer.allocate(i2 * i3 * 4).order(ByteOrder.nativeOrder());
        order.position(0);
        j jVar = new j();
        jVar.c();
        GLES20.glViewport(0, 0, i2, i3);
        jVar.b(i);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, order);
        createBitmap.copyPixelsFromBuffer(order);
        jVar.e();
        return createBitmap;
    }
}
