package com.sankuai.waimai.pouch.unionanim;

import android.support.annotation.NonNull;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.unionanim.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Map<String, c> f;
    public Map<String, View> g;
    public List<c> h;
    public d i;
    public ArrayList<d.a> j;
    public ArrayList<a> k;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1074ff712c4b77d46ff7f916daa31f3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1074ff712c4b77d46ff7f916daa31f3e");
            return;
        }
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayList();
        this.j = null;
        this.k = new ArrayList<>();
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992b3b1edfaad8d5997cd9a5f25feb75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992b3b1edfaad8d5997cd9a5f25feb75");
        } else {
            this.h.add(cVar);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae30bdbaa65480e3c55a711b02ea636", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae30bdbaa65480e3c55a711b02ea636")).booleanValue();
        }
        if (this.k == null || this.k.size() <= 0) {
            return true;
        }
        ArrayList arrayList = (ArrayList) this.k.clone();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            if (aVar != null && !aVar.a()) {
                return false;
            }
        }
        return true;
    }

    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c8d75dce3c112b61590e77bab23690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c8d75dce3c112b61590e77bab23690");
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(aVar);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7662c6fdfc07acee0f2aff3391515e40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7662c6fdfc07acee0f2aff3391515e40");
        } else {
            this.h.clear();
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0234cf5d45589e4679449bf53a1807cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0234cf5d45589e4679449bf53a1807cf")).booleanValue();
        }
        if (this.i == null || !this.i.b()) {
            this.i = new d();
            if (this.h != null && this.h.size() > 0) {
                for (c cVar : this.h) {
                    f fVar = new f();
                    if (cVar.b != 0) {
                        fVar.a(cVar.b);
                    }
                    if (cVar.c != 0) {
                        fVar.b(cVar.c);
                    }
                    if (!Float.isNaN(cVar.f)) {
                        fVar.b = cVar.f;
                    }
                    if (!Float.isNaN(cVar.e)) {
                        fVar.c = cVar.e;
                    }
                    if (!Float.isNaN(cVar.d)) {
                        fVar.l = cVar.d;
                    }
                    if (cVar.a != null) {
                        this.i.a(cVar.a, fVar);
                    }
                }
            }
            for (String str : this.f.keySet()) {
                c cVar2 = this.f.get(str);
                if (cVar2 != null) {
                    f fVar2 = new f();
                    if (cVar2.b != 0) {
                        fVar2.a(cVar2.b);
                    }
                    if (cVar2.c != 0) {
                        fVar2.b(cVar2.c);
                    }
                    if (!Float.isNaN(cVar2.f)) {
                        fVar2.b = cVar2.f;
                    }
                    if (!Float.isNaN(cVar2.e)) {
                        fVar2.c = cVar2.e;
                    }
                    if (!Float.isNaN(cVar2.d)) {
                        fVar2.l = cVar2.d;
                    }
                    if (cVar2.a != null) {
                        ViewGroup.LayoutParams layoutParams = cVar2.a.getLayoutParams();
                        if (layoutParams instanceof com.sankuai.waimai.mach.widget.d) {
                            float[] b = ((com.sankuai.waimai.mach.widget.d) layoutParams).b();
                            fVar2.f = Arrays.copyOf(b, b.length);
                        }
                    }
                    View view = this.g.get(str);
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 instanceof com.sankuai.waimai.mach.widget.d) {
                            float[] b2 = ((com.sankuai.waimai.mach.widget.d) layoutParams2).b();
                            fVar2.g = Arrays.copyOf(b2, b2.length);
                        }
                        int width = view.getWidth();
                        if (width >= 0) {
                            fVar2.e = width;
                        }
                        int height = view.getHeight();
                        if (height >= 0) {
                            fVar2.d = height;
                        }
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        fVar2.h = iArr[0];
                        fVar2.i = iArr[1];
                        if (Float.isNaN(cVar2.e)) {
                            fVar2.c = view.getAlpha();
                        }
                    }
                    this.i.a(cVar2.a, fVar2);
                }
            }
            if (this.i.c()) {
                this.i.a(new d.a() { // from class: com.sankuai.waimai.pouch.unionanim.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.pouch.unionanim.d.a
                    public final void a(@NonNull d dVar) {
                        Object[] objArr2 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26807c5abbd1a75eff8d33188cb9389e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26807c5abbd1a75eff8d33188cb9389e");
                        } else if (e.this.j != null) {
                            ArrayList arrayList = (ArrayList) e.this.j.clone();
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((d.a) arrayList.get(i)).a(dVar);
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.pouch.unionanim.d.a
                    public final void b(@NonNull d dVar) {
                        Object[] objArr2 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f310f104df9b3337b5d28315fe66ae82", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f310f104df9b3337b5d28315fe66ae82");
                        } else if (e.this.j != null) {
                            ArrayList arrayList = (ArrayList) e.this.j.clone();
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((d.a) arrayList.get(i)).b(dVar);
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.pouch.unionanim.d.a
                    public final void c(@NonNull d dVar) {
                        Object[] objArr2 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e645d0930871e957bb67b34317e85d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e645d0930871e957bb67b34317e85d4");
                        } else if (e.this.j != null) {
                            ArrayList arrayList = (ArrayList) e.this.j.clone();
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((d.a) arrayList.get(i)).c(dVar);
                            }
                        }
                    }
                });
                this.i.a();
                return true;
            }
            return false;
        }
        return true;
    }
}
