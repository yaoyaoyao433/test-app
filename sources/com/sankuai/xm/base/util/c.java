package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.UUID;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0be4d85787f76d287133ad371ec06177", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0be4d85787f76d287133ad371ec06177");
        }
        if (bArr == null) {
            return Long.toHexString(0L);
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return Long.toHexString(crc32.getValue());
    }

    public static int b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e50cebbd8950b747931bac6c4862c35", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e50cebbd8950b747931bac6c4862c35")).intValue();
        }
        if (bArr == null) {
            return 0;
        }
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            return (int) crc32.getValue();
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e);
            return 0;
        }
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3eeff72d6670f579d4ac62f7ccae578", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3eeff72d6670f579d4ac62f7ccae578")).longValue();
        }
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.getMostSignificantBits() ^ randomUUID.getLeastSignificantBits();
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5de2b2c14071bdd31556cb52a36017f2", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5de2b2c14071bdd31556cb52a36017f2")).longValue();
        }
        long a2 = a();
        if (Long.MIN_VALUE == a2) {
            a2 = -9223372036854775807L;
        }
        return Math.abs(a2);
    }
}
