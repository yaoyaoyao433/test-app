package com.sankuai.meituan.mapsdk.core.annotations;

import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class g implements OnMapChangedListener {
    public static ChangeQuickRedirect a;
    final com.sankuai.meituan.mapsdk.core.d b;
    final com.sankuai.meituan.mapsdk.core.render.a c;
    final com.sankuai.meituan.mapsdk.core.c d;
    final l e;
    final u f;
    public final Map<String, com.sankuai.meituan.mapsdk.core.interfaces.d> g;
    public final Map<String, com.sankuai.meituan.mapsdk.core.interfaces.g> h;
    final CopyOnWriteArraySet<f> i;
    public volatile List<x> j;
    public volatile List<t> k;
    public volatile Map<String, x> l;
    public BitmapDescriptor m;
    private final Map<String, com.sankuai.meituan.mapsdk.core.interfaces.f> n;
    private final Map<String, com.sankuai.meituan.mapsdk.core.interfaces.i> o;

    public g(com.sankuai.meituan.mapsdk.core.d dVar, l lVar, u uVar, com.sankuai.meituan.mapsdk.core.c cVar) {
        Object[] objArr = {dVar, lVar, uVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357bda7652d9919ab4d68a48a59a8727", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357bda7652d9919ab4d68a48a59a8727");
            return;
        }
        this.n = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.i = new CopyOnWriteArraySet<>();
        this.j = Collections.synchronizedList(new ArrayList());
        this.k = Collections.synchronizedList(new ArrayList());
        this.l = new ConcurrentHashMap();
        this.b = dVar;
        this.c = dVar.d;
        this.d = cVar;
        this.e = lVar;
        this.f = uVar;
        this.m = BitmapDescriptorFactory.defaultMarker();
    }

    @UiThread
    public final void a(String str, com.sankuai.meituan.mapsdk.core.interfaces.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f17ab40fe12911923860afd29f44d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f17ab40fe12911923860afd29f44d63");
        } else if (aVar instanceof com.sankuai.meituan.mapsdk.core.interfaces.f) {
            this.n.put(str, (com.sankuai.meituan.mapsdk.core.interfaces.f) aVar);
        } else if (aVar instanceof com.sankuai.meituan.mapsdk.core.interfaces.d) {
            this.g.put(str, (com.sankuai.meituan.mapsdk.core.interfaces.d) aVar);
        } else if (aVar instanceof com.sankuai.meituan.mapsdk.core.interfaces.g) {
            this.h.put(str, (com.sankuai.meituan.mapsdk.core.interfaces.g) aVar);
        } else if (aVar instanceof com.sankuai.meituan.mapsdk.core.interfaces.i) {
            this.o.put(str, (com.sankuai.meituan.mapsdk.core.interfaces.i) aVar);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ab00e402b99416d63a68aaa94176b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ab00e402b99416d63a68aaa94176b3");
            return;
        }
        this.n.remove(str);
        this.g.remove(str);
        this.h.remove(str);
        this.o.remove(str);
    }

    @UiThread
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c292d01c503cb0e90adcebcd2ddeb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c292d01c503cb0e90adcebcd2ddeb8");
            return;
        }
        a(this.n);
        a(this.g);
        a(this.h);
        a(this.o);
    }

    private void a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431dff757898f93d5ca43bd0e07531bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431dff757898f93d5ca43bd0e07531bb");
        } else if (!map.isEmpty()) {
            Set keySet = map.keySet();
            ArrayList<String> arrayList = new ArrayList();
            arrayList.addAll(keySet);
            for (String str : arrayList) {
                com.sankuai.meituan.mapsdk.core.interfaces.a aVar = (com.sankuai.meituan.mapsdk.core.interfaces.a) map.get(str);
                if (aVar != null) {
                    if (aVar instanceof com.sankuai.meituan.mapsdk.maps.interfaces.n) {
                        for (x xVar : new ArrayList(this.j)) {
                            if (xVar.e) {
                                xVar.l();
                            } else {
                                xVar.remove();
                            }
                        }
                        if (this.d.c != null) {
                            this.d.a(this.d.c);
                            this.d.c = null;
                        }
                        if (this.d.b != null) {
                            a(this.d.b.d);
                            this.d.a(this.d.b);
                            this.d.b = null;
                        }
                        if (this.d.e != null) {
                            this.d.a(this.d.e);
                            this.d.e = null;
                        }
                        if (this.d.d != null) {
                            a(this.d.d.d);
                            this.d.a(this.d.d);
                            this.d.d = null;
                        }
                    } else {
                        aVar.remove();
                    }
                }
            }
        }
    }

    public final x b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "350e42af619c2effb8a0e3fdcecf4c5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (x) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "350e42af619c2effb8a0e3fdcecf4c5d");
        }
        for (x xVar : this.j) {
            if (TextUtils.equals(xVar.getId(), str)) {
                return xVar;
            }
        }
        return null;
    }

    public final t c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c406922d70738b8e9e8aeabead1fecbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c406922d70738b8e9e8aeabead1fecbb");
        }
        for (t tVar : this.k) {
            if (TextUtils.equals(tVar.getId(), str)) {
                return tVar;
            }
        }
        return null;
    }

    public final p d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd49f6965c55aa3ccbaf5764da5ec8a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd49f6965c55aa3ccbaf5764da5ec8a3");
        }
        for (String str2 : this.h.keySet()) {
            com.sankuai.meituan.mapsdk.core.interfaces.g gVar = this.h.get(str2);
            if (gVar instanceof p) {
                p pVar = (p) gVar;
                if (pVar.t != null && str.contains(pVar.t.f)) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final Collection<k> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74b8feab563b37f2480ab9cc5039602", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74b8feab563b37f2480ab9cc5039602");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.h.keySet()) {
            com.sankuai.meituan.mapsdk.core.interfaces.g gVar = this.h.get(str);
            if (gVar instanceof k) {
                arrayList.add((k) gVar);
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener
    public final void a(int i, CameraPosition cameraPosition) {
        Object[] objArr = {Integer.valueOf(i), cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8dc03fa7884e90915a2c05b25fb4944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8dc03fa7884e90915a2c05b25fb4944");
        } else if (i != 11 || this.i.size() <= 0) {
        } else {
            Iterator<f> it = this.i.iterator();
            while (it.hasNext()) {
                f next = it.next();
                next.e();
                this.i.remove(next);
            }
        }
    }
}
