package com.dianping.base.push.pushservice;

import android.content.BroadcastReceiver;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PushStartReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:11:0x002b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r14
            r9 = 1
            r0[r9] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.base.push.pushservice.PushStartReceiver.a
            java.lang.String r11 = "71debcdb7a4bb751ac818460d91f4b9a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r13
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r13, r10, r8, r11)
            return
        L1e:
            java.lang.String r0 = ""
            java.lang.String r1 = "pushTag"
            java.lang.String r15 = com.sankuai.waimai.platform.utils.f.a(r15, r1)     // Catch: java.lang.Exception -> L30
            if (r15 != 0) goto L3b
            java.lang.String r0 = ""
            goto L3a
        L2b:
            r0 = move-exception
            r12 = r0
            r0 = r15
            r15 = r12
            goto L31
        L30:
            r15 = move-exception
        L31:
            java.lang.String r1 = "PushStartReceiver"
            java.lang.String r15 = r15.toString()
            com.dianping.base.push.pushservice.c.d(r1, r15)
        L3a:
            r15 = r0
        L3b:
            com.dianping.base.push.pushservice.d r0 = com.dianping.base.push.pushservice.d.a(r14)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "pushTag"
            r0.b(r1, r15)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r14.getSystemService(r0)     // Catch: java.lang.Throwable -> L63
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L63
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L59
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L59
            r8 = 1
        L59:
            if (r8 == 0) goto L5f
            com.dianping.base.push.pushservice.f.a(r14, r15)     // Catch: java.lang.Throwable -> L63
            goto L6d
        L5f:
            com.dianping.base.push.pushservice.f.c(r14)     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r14 = move-exception
            java.lang.String r15 = "PushStartReceiver"
            java.lang.String r14 = r14.toString()
            com.dianping.base.push.pushservice.c.d(r15, r14)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.PushStartReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
