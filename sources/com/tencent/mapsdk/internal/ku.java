package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ku {
    public static final int a = 1;
    public static final int b = 0;
    public final Rect c = new Rect();
    public int[] d;
    public int[] e;
    public int[] f;

    private static void a(int[] iArr, ByteBuffer byteBuffer) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = byteBuffer.getInt();
        }
    }

    private static void a(int i) {
        if (i == 0 || (i & 1) != 0) {
            throw new RuntimeException("invalid nine-patch: ".concat(String.valueOf(i)));
        }
    }

    private static ku a(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        ku kuVar = new ku();
        kuVar.d = new int[order.get()];
        kuVar.e = new int[order.get()];
        kuVar.f = new int[order.get()];
        a(kuVar.d.length);
        a(kuVar.e.length);
        order.getInt();
        order.getInt();
        kuVar.c.left = order.getInt();
        kuVar.c.right = order.getInt();
        kuVar.c.top = order.getInt();
        kuVar.c.bottom = order.getInt();
        order.getInt();
        a(kuVar.d, order);
        a(kuVar.e, order);
        a(kuVar.f, order);
        return kuVar;
    }
}
