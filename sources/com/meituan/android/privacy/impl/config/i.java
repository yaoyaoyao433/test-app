package com.meituan.android.privacy.impl.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dc0102f02f7e7f7d572e8ab8a0a9cc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dc0102f02f7e7f7d572e8ab8a0a9cc4");
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String a(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.privacy.impl.config.i.a
            java.lang.String r10 = "97a59357e45234efced6fd3bdf864bf0"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2a
            return r2
        L2a:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L87
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L87
            java.security.DigestInputStream r11 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L6d
            r11.<init>(r0, r1)     // Catch: java.lang.Throwable -> L6d
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L68
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L68
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L68
        L43:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> L68
            if (r4 > 0) goto L43
            java.security.MessageDigest r1 = r11.getMessageDigest()     // Catch: java.lang.Throwable -> L68
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L68
            r0.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r0 = move-exception
            r0.printStackTrace()
        L5d:
            r11.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r11 = move-exception
            r11.printStackTrace()
        L65:
            return r1
        L66:
            r1 = move-exception
            goto L72
        L68:
            goto L89
        L6a:
            r1 = move-exception
            r11 = r2
            goto L72
        L6d:
            r11 = r2
            goto L89
        L6f:
            r1 = move-exception
            r11 = r2
            r0 = r11
        L72:
            if (r0 == 0) goto L7c
            r0.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r0 = move-exception
            r0.printStackTrace()
        L7c:
            if (r11 == 0) goto L86
            r11.close()     // Catch: java.io.IOException -> L82
            goto L86
        L82:
            r11 = move-exception
            r11.printStackTrace()
        L86:
            throw r1
        L87:
            r11 = r2
            r0 = r11
        L89:
            if (r0 == 0) goto L93
            r0.close()     // Catch: java.io.IOException -> L8f
            goto L93
        L8f:
            r0 = move-exception
            r0.printStackTrace()
        L93:
            if (r11 == 0) goto L9d
            r11.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r11 = move-exception
            r11.printStackTrace()
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.privacy.impl.config.i.a(java.lang.String):java.lang.String");
    }
}
