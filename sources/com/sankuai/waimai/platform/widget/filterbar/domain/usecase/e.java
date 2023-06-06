package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a, b> {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.a {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9378cc63e02c3899d8258d2c577de89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9378cc63e02c3899d8258d2c577de89");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else {
            this.e.b(new b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.h>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.e.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x00c7 A[EDGE_INSN: B:94:0x00c7->B:45:0x00c7 ?: BREAK  , SYNTHETIC] */
                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.h r13) {
                    /*
                        Method dump skipped, instructions count: 434
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.e.AnonymousClass1.a(java.lang.Object):void");
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d2e5199cdb74fab1e830ff6c871859e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d2e5199cdb74fab1e830ff6c871859e");
                    } else {
                        e.this.c.a(new Error(exc.getMessage()));
                    }
                }
            });
        }
    }

    public e(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a137730086ba022f435b09bd194245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a137730086ba022f435b09bd194245");
        } else {
            this.e = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c.b {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.h b;
        public h.a c;
        public int d;
        public boolean e;
        public boolean f;

        public b(com.sankuai.waimai.platform.widget.filterbar.domain.model.h hVar, h.a aVar, int i, boolean z, boolean z2) {
            Object[] objArr = {hVar, aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e11c9b27bbbeeb8ba749caa78326b2a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e11c9b27bbbeeb8ba749caa78326b2a");
                return;
            }
            this.b = hVar;
            this.c = aVar;
            this.d = i;
            this.e = z;
            this.f = false;
        }
    }
}
