package com.dianping.video.template.process;

import com.dianping.video.template.decoder.d;
import com.dianping.video.template.decoder.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c implements d.a {
    public static ChangeQuickRedirect a;
    public HashMap<String, d> b;
    public HashMap<String, e> c;
    public List<com.dianping.video.template.render.model.c> d;
    public b e;
    public com.dianping.video.template.render.model.a f;
    public long g;
    private List<com.dianping.video.template.model.tracksegment.c> h;
    private List<com.dianping.video.template.model.tracksegment.b> i;
    private int j;
    private int k;
    private int l;

    public c(List<com.dianping.video.template.model.tracksegment.c> list, List<com.dianping.video.template.model.tracksegment.b> list2, int i, int i2) {
        Object[] objArr = {list, list2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7354fd930950bb1368be0159369efb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7354fd930950bb1368be0159369efb3");
            return;
        }
        this.l = -1;
        this.h = list;
        this.i = list2;
        this.j = i;
        this.k = i2;
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new ArrayList();
        this.e = new b(i, i2);
    }

    public final void a(long j) {
        e eVar;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de846ab575c6275dc91fb3ffd6ca691b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de846ab575c6275dc91fb3ffd6ca691b");
            return;
        }
        this.g = j;
        for (com.dianping.video.template.model.tracksegment.c cVar : this.h) {
            if (cVar.c * 1000 <= j && (cVar.c + cVar.d) * 1000 > j) {
                this.l = this.h.indexOf(cVar);
                if (!this.b.containsKey(cVar.a)) {
                    com.dianping.video.template.render.model.c cVar2 = new com.dianping.video.template.render.model.c(cVar);
                    this.d.add(cVar2);
                    if (cVar.a()) {
                        com.dianping.codelog.b.a(c.class, "updatePts", "add photo " + cVar.a + " : now pts = " + j);
                        com.dianping.video.template.decoder.c cVar3 = new com.dianping.video.template.decoder.c(cVar.b(), cVar.a);
                        cVar3.a(this.j, this.k);
                        cVar3.a(this);
                        cVar3.a();
                        this.b.put(cVar.a, cVar3);
                    } else {
                        com.dianping.codelog.b.a(c.class, "updatePts", "add video " + cVar.a + " : now pts = " + j);
                        e eVar2 = new e(cVar.b(), cVar.a);
                        eVar2.a(this);
                        eVar2.a();
                        eVar2.a((long) cVar.c, false);
                        this.b.put(cVar.a, eVar2);
                    }
                    this.e.a(cVar2);
                }
            } else {
                d dVar = this.b.get(cVar.a);
                if (dVar != null) {
                    com.dianping.codelog.b.a(c.class, "updatePts", "remove Segment " + cVar.a + " : now pts = " + j);
                    dVar.c();
                    this.b.remove(cVar.a);
                    a(cVar);
                }
            }
        }
        for (com.dianping.video.template.model.tracksegment.b bVar : this.i) {
            if (bVar.c * 1000 <= j && (bVar.c + bVar.d) * 1000 >= j) {
                if (!this.c.containsKey(bVar.a)) {
                    com.dianping.codelog.b.a(c.class, "updatePts", "add effect " + bVar.a + " : now pts = " + j);
                    this.f = new com.dianping.video.template.render.model.a(bVar);
                    e eVar3 = new e(bVar.a(), bVar.a);
                    eVar3.a(this);
                    eVar3.a();
                    this.c.put(bVar.a, eVar3);
                    this.e.a(this.f);
                }
            } else if ((bVar.c + bVar.d) * 1000 < j && (eVar = this.c.get(bVar.a)) != null) {
                com.dianping.codelog.b.a(c.class, "updatePts", "remove effect " + bVar.a + " : now pts = " + j);
                eVar.c();
                this.c.remove(bVar.a);
                this.e.a(bVar.a);
            }
        }
    }

    private void a(com.dianping.video.template.model.tracksegment.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6539b49125d91b11ee58f8603ef2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6539b49125d91b11ee58f8603ef2b4");
            return;
        }
        for (int i = 0; i < this.d.size(); i++) {
            com.dianping.video.template.render.model.c cVar2 = this.d.get(i);
            if (cVar2.e().equals(cVar.a)) {
                this.d.remove(cVar2);
                b bVar = this.e;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2cad20400dca933d011303f17bb381f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2cad20400dca933d011303f17bb381f4");
                    return;
                }
                com.dianping.video.template.render.d remove = bVar.b.remove(cVar2.e());
                if (remove != null) {
                    remove.a();
                    return;
                }
                return;
            }
        }
    }

    private void b(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b02fbdf2d0469094b7c720aa500466a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b02fbdf2d0469094b7c720aa500466a");
        } else if (str != null && this.f != null && str.equals(this.f.e())) {
            this.f.a(i);
            this.f.c(j);
        } else {
            for (com.dianping.video.template.render.model.c cVar : this.d) {
                if (cVar.e().equals(str)) {
                    cVar.a(i);
                    if (cVar.a()) {
                        j = this.g;
                    }
                    cVar.c(j);
                    return;
                }
            }
        }
    }

    @Override // com.dianping.video.template.decoder.d.a
    public final void a(String str, int i, int i2, int i3, int i4, long j) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e57d22b3ca22a0377777e0baa9da4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e57d22b3ca22a0377777e0baa9da4c9");
            return;
        }
        StringBuilder sb = new StringBuilder("size = ");
        sb.append(i);
        sb.append(" - ");
        sb.append(i2);
        sb.append(" - ");
        sb.append(i4);
        com.dianping.codelog.b.a(c.class, "onRenderInfo", "init Segment :" + str + " : frame size = " + i + " - " + i2 + " : direction = " + i3 + " : frameRate = " + i4 + " : offsetPts = " + j);
        if (str != null && this.f != null && str.equals(this.f.e())) {
            this.f.a(i, i2, i3, i4);
            this.f.b(j);
            return;
        }
        for (com.dianping.video.template.render.model.c cVar : this.d) {
            if (cVar.e().equals(str)) {
                cVar.a(i, i2, i3, i4);
                cVar.b(j);
                return;
            }
        }
    }

    @Override // com.dianping.video.template.decoder.d.a
    public final void a(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf576d9f1f2580a9db97e9640f42348a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf576d9f1f2580a9db97e9640f42348a");
        } else {
            b(str, i, j);
        }
    }

    @Override // com.dianping.video.template.decoder.d.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8cdd0be9e681abb6b2316b766adadbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8cdd0be9e681abb6b2316b766adadbb");
            return;
        }
        com.dianping.codelog.b.a(c.class, "onParseEnd : " + str);
        if (str != null && this.f != null && str.equals(this.f.e())) {
            this.f.c();
            return;
        }
        for (com.dianping.video.template.render.model.c cVar : this.d) {
            if (cVar.e().equals(str)) {
                cVar.c();
                return;
            }
        }
    }
}
