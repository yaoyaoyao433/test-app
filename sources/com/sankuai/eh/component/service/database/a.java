package com.sankuai.eh.component.service.database;

import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String a(java.io.InputStream r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.eh.component.service.database.a.a
            java.lang.String r10 = "f8492c1cadf37b08b4c9425f05f1412b"
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
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L58
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L58
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L59
            r11.<init>()     // Catch: java.lang.Throwable -> L59
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L45
        L2c:
            r2 = -1
            if (r1 == r2) goto L38
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L45
            r11.write(r1)     // Catch: java.lang.Throwable -> L45
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L45
            goto L2c
        L38:
            java.lang.String r1 = r11.toString()     // Catch: java.lang.Throwable -> L45
            r0.close()     // Catch: java.lang.Exception -> L42
            r11.close()     // Catch: java.lang.Exception -> L42
        L42:
            return r1
        L43:
            r1 = move-exception
            goto L4d
        L45:
            r2 = r11
            goto L59
        L47:
            r1 = move-exception
            r11 = r2
            goto L4d
        L4a:
            r1 = move-exception
            r11 = r2
            r0 = r11
        L4d:
            if (r0 == 0) goto L52
            r0.close()     // Catch: java.lang.Exception -> L57
        L52:
            if (r11 == 0) goto L57
            r11.close()     // Catch: java.lang.Exception -> L57
        L57:
            throw r1
        L58:
            r0 = r2
        L59:
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.lang.Exception -> L63
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.lang.Exception -> L63
        L63:
            java.lang.String r11 = ""
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.service.database.a.a(java.io.InputStream):java.lang.String");
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
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.eh.component.service.database.a.a
            java.lang.String r10 = "970945c3867325240f9f2f0ddbc1f2ee"
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
            java.io.File r11 = c(r11)
            boolean r0 = r11.exists()
            if (r0 != 0) goto L2b
            java.lang.String r11 = ""
            return r11
        L2b:
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L51
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L51
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r11 = r0.readObject()     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L52
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L43
            java.lang.String r11 = ""
        L43:
            r0.close()     // Catch: java.lang.Exception -> L46
        L46:
            return r11
        L47:
            r11 = move-exception
            goto L4b
        L49:
            r11 = move-exception
            r0 = r2
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.lang.Exception -> L50
        L50:
            throw r11
        L51:
            r0 = r2
        L52:
            java.lang.String r11 = ""
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.lang.Exception -> L59
        L59:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.service.database.a.a(java.lang.String):java.lang.String");
    }

    public static String[] b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cded3d9a7fbdcb231a8a63eaeef354e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cded3d9a7fbdcb231a8a63eaeef354e2");
        }
        String[] list = c(str).list();
        return list == null ? new String[0] : list;
    }

    public static void a(Set<String> set, String str) {
        boolean z;
        Object[] objArr = {set, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2676cc6da992dc8b0ec86347015d2868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2676cc6da992dc8b0ec86347015d2868");
            return;
        }
        File[] listFiles = c(str).listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            Iterator<String> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (listFiles[i].getName().contains(it.next())) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                listFiles[i].delete();
            }
        }
    }

    public static q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad65ccfe636aa2bf8e4404340bf327e7", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad65ccfe636aa2bf8e4404340bf327e7") : q.a(com.sankuai.eh.component.service.a.b(), "jinrong_container", 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a07bc7fc6c1ac87adf78bf934097f13", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a07bc7fc6c1ac87adf78bf934097f13") : q.a(com.sankuai.eh.component.service.a.b(), "jinrong_container", str, u.e);
    }
}
