package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends CanvasView.a<TagCanvasView.b> {
    public static ChangeQuickRedirect a;
    protected Context b;
    private List<T> c;
    private List<j> d;

    public abstract List<j> a(List<T> list, TagCanvasView.b bVar);

    public void a() {
    }

    public void a(List<j> list) {
    }

    public a(Context context, List<T> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c75f3a9e0a127f1c2f8902592ab977b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c75f3a9e0a127f1c2f8902592ab977b");
            return;
        }
        this.b = context;
        b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a
    public List<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> a(TagCanvasView.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7e1b522291722c9562b40e1e2dce9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7e1b522291722c9562b40e1e2dce9c");
        }
        List<j> a2 = a(new ArrayList(this.c), bVar);
        if (this.d == null) {
            this.d = new ArrayList();
        } else {
            for (j jVar : this.d) {
                jVar.c();
            }
            this.d.clear();
        }
        if (a2 != null && !a2.isEmpty()) {
            this.d.addAll(a2);
        }
        a(a2);
        return c(a2);
    }

    private List<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> c(List<j> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e84cee075219ffd19dea0edd442957", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e84cee075219ffd19dea0edd442957");
        }
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        com.sankuai.waimai.report.c.a(com.sankuai.waimai.report.b.g);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = false;
        for (j jVar : list) {
            int i3 = jVar.e;
            int i4 = jVar.f;
            int i5 = i2 + i3;
            boolean z2 = z;
            int i6 = 0;
            for (d dVar : jVar.d()) {
                int i7 = i6 + dVar.l;
                arrayList.add(a(dVar, i7, ((jVar.g - dVar.i.f) / 2) + i5));
                i6 = i7 + dVar.i.e + dVar.m;
                z2 = true;
            }
            i2 = i5 + jVar.g + i4;
            z = z2;
        }
        if (!arrayList.isEmpty() || !z) {
            com.sankuai.waimai.report.c.a(com.sankuai.waimai.report.b.h);
        } else {
            for (j jVar2 : list) {
                i = (i * 10) + jVar2.d().size();
            }
            com.sankuai.waimai.report.c.a("dynamic_tags", "dynamic_tags_pre_render_failed", "dynamic_tags_pre_render_failed", String.valueOf(i));
        }
        return arrayList;
    }

    private com.sankuai.waimai.platform.widget.tag.virtualview.render.d a(d dVar, int i, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        int i5 = 3;
        int i6 = 1;
        int i7 = 2;
        Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89922af91c9bd962d8215df3441ce50e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.tag.virtualview.render.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89922af91c9bd962d8215df3441ce50e");
        }
        List<i> list = (List) dVar.k;
        List emptyList = Collections.emptyList();
        if (list == null || list.isEmpty()) {
            arrayList = emptyList;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i8 = 0;
            for (i iVar : list) {
                if (iVar != null) {
                    int i9 = i8 + iVar.l;
                    if (iVar.j.g == i6) {
                        i4 = 0;
                    } else {
                        if (iVar.j.g == i7) {
                            i3 = dVar.i.f - iVar.i.f;
                        } else {
                            i3 = (int) ((dVar.i.f - iVar.i.f) * 0.5f);
                        }
                        i4 = i3;
                    }
                    Object[] objArr2 = new Object[i5];
                    objArr2[0] = iVar;
                    objArr2[i6] = Integer.valueOf(i9);
                    objArr2[i7] = Integer.valueOf(i4);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    int i10 = i4;
                    Object obj = null;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf95d156decce81989b1e04183041bc2", RobustBitConfig.DEFAULT_VALUE)) {
                        obj = (com.sankuai.waimai.platform.widget.tag.virtualview.render.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf95d156decce81989b1e04183041bc2");
                    } else if (iVar != null) {
                        com.sankuai.waimai.platform.widget.tag.virtualview.render.b a2 = com.sankuai.waimai.platform.widget.tag.virtualview.render.b.a(i9, i10);
                        if (iVar instanceof b) {
                            b bVar = (b) iVar;
                            if (bVar.k != null) {
                                obj = ((com.sankuai.waimai.platform.widget.tag.virtualview.render.a) bVar.k).d();
                            }
                        } else if (iVar instanceof h) {
                            h hVar = (h) iVar;
                            if (hVar.k != null) {
                                obj = ((com.sankuai.waimai.platform.widget.tag.virtualview.render.h) hVar.k).d();
                            }
                        } else if (iVar instanceof e) {
                            e eVar = (e) iVar;
                            if (eVar.k != null) {
                                obj = ((com.sankuai.waimai.platform.widget.tag.virtualview.render.e) eVar.k).d();
                            }
                        }
                        obj = com.sankuai.waimai.platform.widget.tag.virtualview.render.c.a(a2, iVar.i.d(), iVar.j.d(), obj);
                    }
                    arrayList2.add(obj);
                    i8 = iVar.i.e + iVar.m + i9;
                    i5 = 3;
                    i6 = 1;
                    i7 = 2;
                }
            }
            arrayList = arrayList2;
        }
        return com.sankuai.waimai.platform.widget.tag.virtualview.render.d.a(com.sankuai.waimai.platform.widget.tag.virtualview.render.b.a(i, i2), dVar.i.d(), dVar.j.d(), arrayList, dVar.d, dVar.e);
    }

    public final List<j> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bddb056ba5a7f8efb4e63914e8b81afa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bddb056ba5a7f8efb4e63914e8b81afa");
        }
        if (this.d == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public void b(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ef03c449d4eec7167466e259045e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ef03c449d4eec7167466e259045e2a");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        } else {
            for (T t : this.c) {
                if (list == null || !list.contains(t)) {
                    if (t instanceof com.sankuai.waimai.platform.widget.tag.b) {
                        ((com.sankuai.waimai.platform.widget.tag.b) t).c();
                    }
                }
            }
            this.c.clear();
        }
        if (list != null) {
            this.c.addAll(list);
        }
        if (this.d != null) {
            this.d.clear();
        }
    }
}
