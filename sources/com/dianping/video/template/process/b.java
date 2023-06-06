package com.dianping.video.template.process;

import com.dianping.video.template.render.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String e = "b";
    LinkedHashMap<String, d> b;
    public com.dianping.video.template.render.c c;
    public LinkedHashMap<String, com.dianping.video.template.render.a> d;
    private int f;
    private int g;

    public b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887cf5c6241e1db65da9a9d869b14f53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887cf5c6241e1db65da9a9d869b14f53");
            return;
        }
        this.f = i;
        this.g = i2;
        this.b = new LinkedHashMap<>();
        this.d = new LinkedHashMap<>();
        this.c = new com.dianping.video.template.render.c(i, i2);
    }

    public final void a(com.dianping.video.template.render.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "546f90384bafa032e5cbea90d6098505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "546f90384bafa032e5cbea90d6098505");
        } else {
            this.b.put(cVar.e(), new d(cVar, this.f, this.g));
        }
    }

    public final void a(com.dianping.video.template.render.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1265b6496ca0de5322282201fa86adc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1265b6496ca0de5322282201fa86adc");
        } else {
            this.d.put(aVar.e(), new com.dianping.video.template.render.a(aVar, this.f, this.g));
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173941006c50d979d5399e683e8ca344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173941006c50d979d5399e683e8ca344");
            return;
        }
        com.dianping.video.template.render.a remove = this.d.remove(str);
        if (remove != null) {
            remove.a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6bbffebce1ec92472e7a42801dbe2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6bbffebce1ec92472e7a42801dbe2b");
            return;
        }
        for (d dVar : this.b.values()) {
            dVar.a();
        }
        this.b.clear();
    }

    public final int a(long j) {
        char c = 1;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35f56884f198b2b1c1c26f7fe460f19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35f56884f198b2b1c1c26f7fe460f19")).intValue();
        }
        new StringBuilder("render pts ").append(j);
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        for (d dVar : this.b.values()) {
            if (i != 0) {
                i3 = dVar.a(j);
            } else {
                if (dVar.c != null) {
                    com.dianping.video.template.render.c cVar = this.c;
                    com.dianping.video.videofilter.template.b bVar = dVar.c;
                    com.dianping.video.template.model.material.extra.c cVar2 = dVar.d;
                    com.dianping.video.template.render.model.c cVar3 = dVar.b;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = bVar;
                    objArr2[c] = cVar2;
                    objArr2[2] = cVar3;
                    ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.template.render.c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "0f82dc0d0cc844b7f83f188110e63081", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "0f82dc0d0cc844b7f83f188110e63081");
                    } else if (cVar.d == null) {
                        cVar.d = bVar;
                        cVar.e = cVar2;
                        cVar.f = cVar3;
                        cVar.d.b();
                        com.dianping.video.template.utils.c.a(cVar.h, cVar.g, cVar.e.g, cVar.e.h);
                        com.dianping.video.template.utils.c.a(cVar.d, cVar.h);
                        cVar.d.a(true);
                        cVar.d.a(cVar.b, cVar.c);
                    }
                }
                i2 = dVar.a(j);
            }
            i++;
            c = 1;
        }
        StringBuilder sb = new StringBuilder("render textureID0 =  ");
        sb.append(i2);
        sb.append(", textureID1 = ");
        sb.append(i3);
        int a2 = this.c.a(j, i2, i3);
        com.dianping.video.template.render.c cVar4 = this.c;
        Object[] objArr3 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.video.template.render.c.a;
        if (PatchProxy.isSupport(objArr3, cVar4, changeQuickRedirect3, false, "8f850a0fa1afd4e48a68c9448dca085e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar4, changeQuickRedirect3, false, "8f850a0fa1afd4e48a68c9448dca085e");
        } else if (cVar4.f != null && j > (cVar4.f.l.c + cVar4.f.l.d) * 1000) {
            com.dianping.codelog.b.a(com.dianping.video.template.render.c.class, "destroy", "now pts = " + j);
            cVar4.a();
        }
        if (this.d != null && this.d.size() > 0) {
            for (com.dianping.video.template.render.a aVar : this.d.values()) {
                Object[] objArr4 = {Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect4 = com.dianping.video.template.render.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "2b1fe9aefac07656da220a97685dc7cd", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = ((Integer) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "2b1fe9aefac07656da220a97685dc7cd")).intValue();
                } else {
                    aVar.e.t = aVar.b.d();
                    aVar.e.a(a2, aVar.c, aVar.d);
                    a2 = aVar.e.i();
                }
            }
        }
        return a2;
    }
}
