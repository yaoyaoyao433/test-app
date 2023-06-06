package com.dianping.nvtunnelkit.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62bcfad2f471f2e667dba2e448e8d6b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62bcfad2f471f2e667dba2e448e8d6b8");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException e) {
                com.dianping.nvtunnelkit.logger.b.a(e);
            }
        }
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        Object[] objArr = {byteBuffer, byteBuffer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7e68db68adb690ab0e5f65d68542d17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7e68db68adb690ab0e5f65d68542d17");
        } else if (byteBuffer == null || byteBuffer2 == null) {
        } else {
            int remaining = byteBuffer.remaining();
            int remaining2 = byteBuffer2.remaining();
            if (remaining2 >= remaining) {
                byteBuffer2.put(byteBuffer);
                return;
            }
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + remaining2);
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(limit);
        }
    }
}
