package com.meituan.android.walle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final int b;
    private final ByteBuffer c;

    public b(int i, ByteBuffer byteBuffer) {
        Object[] objArr = {Integer.valueOf(i), byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fcd1998ef824a472513249bbf50daea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fcd1998ef824a472513249bbf50daea");
            return;
        }
        this.b = i;
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        this.c = byteBuffer;
    }

    public final byte[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02736f607247657aadb6d03154fbf6fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02736f607247657aadb6d03154fbf6fc");
        }
        byte[] array = this.c.array();
        int arrayOffset = this.c.arrayOffset();
        return Arrays.copyOfRange(array, this.c.position() + arrayOffset, arrayOffset + this.c.limit());
    }
}
