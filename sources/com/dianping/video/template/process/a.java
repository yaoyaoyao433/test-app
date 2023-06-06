package com.dianping.video.template.process;

import com.dianping.video.template.decoder.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ShortBuffer;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements b.a {
    public static ChangeQuickRedirect a;
    public com.dianping.video.template.decoder.b b;
    public com.dianping.video.template.decoder.a c;
    public boolean d;
    private List<com.dianping.video.template.model.tracksegment.c> e;
    private List<com.dianping.video.template.model.tracksegment.a> f;

    public a(List<com.dianping.video.template.model.tracksegment.c> list, List<com.dianping.video.template.model.tracksegment.a> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e9ba7f9d35a95887274d75e9f6745fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e9ba7f9d35a95887274d75e9f6745fd");
            return;
        }
        this.e = list;
        this.f = list2;
        com.dianping.video.template.model.tracksegment.a aVar = list2.get(0);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.template.model.tracksegment.a.e;
        this.b = new com.dianping.video.template.decoder.b(PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2c5e6d16905474c55fa4d590add11f87", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2c5e6d16905474c55fa4d590add11f87") : ((com.dianping.video.template.model.material.core.a) aVar.b).a, list2.get(0).a);
        this.b.e = this;
        this.b.a();
    }

    @Override // com.dianping.video.template.decoder.b.a
    public final void a(String str, com.dianping.video.template.decoder.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d875c9d5f573da3d15bb9437b35957a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d875c9d5f573da3d15bb9437b35957a3");
            return;
        }
        ShortBuffer allocate = ShortBuffer.allocate(aVar.b.capacity());
        allocate.put(aVar.b);
        allocate.flip();
        if (this.c == null) {
            this.c = new com.dianping.video.template.decoder.a();
        }
        this.c.b = allocate;
        this.c.c = aVar.b.position();
        this.c.a = aVar.a;
        aVar.b.clear();
    }

    @Override // com.dianping.video.template.decoder.b.a
    public final void a(String str) {
        this.d = true;
    }
}
