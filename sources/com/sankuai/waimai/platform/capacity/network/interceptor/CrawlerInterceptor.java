package com.sankuai.waimai.platform.capacity.network.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.waimai.platform.domain.manager.crawler.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CrawlerInterceptor implements Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.AbstractC1046a mCrawlerObserver;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    @Override // com.sankuai.meituan.retrofit2.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.sankuai.meituan.retrofit2.raw.b intercept(com.sankuai.meituan.retrofit2.Interceptor.a r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.capacity.network.interceptor.CrawlerInterceptor.intercept(com.sankuai.meituan.retrofit2.Interceptor$a):com.sankuai.meituan.retrofit2.raw.b");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private byte[] readBytes(com.sankuai.meituan.retrofit2.ap r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.capacity.network.interceptor.CrawlerInterceptor.changeQuickRedirect
            java.lang.String r10 = "41ca848c7db5fc04eb7cca63b6f77634"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r9, r8, r10)
            byte[] r13 = (byte[]) r13
            return r13
        L1e:
            r0 = 0
            if (r13 == 0) goto L4a
            java.io.InputStream r13 = r13.source()     // Catch: java.lang.Throwable -> L44
            okio.c r1 = new okio.c     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            r1.a(r13)     // Catch: java.lang.Throwable -> L45
            byte[] r1 = r1.r()     // Catch: java.lang.Throwable -> L45
            if (r13 == 0) goto L36
            r13.close()     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = r1
            goto L4a
        L38:
            r0 = move-exception
            goto L3e
        L3a:
            r13 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L3e:
            if (r13 == 0) goto L43
            r13.close()     // Catch: java.lang.Throwable -> L43
        L43:
            throw r0
        L44:
            r13 = r0
        L45:
            if (r13 == 0) goto L4a
            r13.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.capacity.network.interceptor.CrawlerInterceptor.readBytes(com.sankuai.meituan.retrofit2.ap):byte[]");
    }
}
