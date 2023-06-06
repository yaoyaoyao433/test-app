package com.sankuai.waimai.platform.net.interceptor.nvnetwork;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.t;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements r {
    public static ChangeQuickRedirect a;
    final JsonParser b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccdb5e95dc8f4484ed6b386fa7658505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccdb5e95dc8f4484ed6b386fa7658505");
        } else {
            this.b = new JsonParser();
        }
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347ca28e3e5f1a5330e89fc3e2d4db6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347ca28e3e5f1a5330e89fc3e2d4db6b");
        }
        Request a2 = aVar.a();
        t e = t.e(a2.d);
        if (e == null) {
            return aVar.a(a2);
        }
        String f = e.f();
        if (f == null || (!f.endsWith(com.sankuai.waimai.platform.net.c.c) && !f.endsWith(com.sankuai.waimai.platform.net.c.e) && !f.endsWith(com.sankuai.waimai.platform.net.c.f) && !f.endsWith("maf.meituan.com"))) {
            return aVar.a(a2);
        }
        return aVar.a(a2).d(new g<q, q>() { // from class: com.sankuai.waimai.platform.net.interceptor.nvnetwork.b.1
            public static ChangeQuickRedirect a;

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
                	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
                	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                */
            /* JADX INFO: Access modifiers changed from: private */
            @Override // rx.functions.g
            /* renamed from: a */
            public com.dianping.nvnetwork.q call(com.dianping.nvnetwork.q r13) {
                /*
                    Method dump skipped, instructions count: 231
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.nvnetwork.b.AnonymousClass1.call(com.dianping.nvnetwork.q):com.dianping.nvnetwork.q");
            }
        });
    }
}
