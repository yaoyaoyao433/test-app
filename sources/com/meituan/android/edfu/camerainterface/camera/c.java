package com.meituan.android.edfu.camerainterface.camera;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final HashMap<AspectRatio, SortedSet<b>> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d281d440a694ca396bb7cbebf490aaa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d281d440a694ca396bb7cbebf490aaa7");
        } else {
            this.b = new HashMap<>();
        }
    }

    public final boolean a(b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37744ad9ce182172f164f41574f75cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37744ad9ce182172f164f41574f75cc7")).booleanValue();
        }
        for (AspectRatio aspectRatio : this.b.keySet()) {
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = AspectRatio.a;
            if (PatchProxy.isSupport(objArr2, aspectRatio, changeQuickRedirect2, false, "8ec38aebc6ba88bf23e49e4c38689858", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aspectRatio, changeQuickRedirect2, false, "8ec38aebc6ba88bf23e49e4c38689858")).booleanValue();
                continue;
            } else {
                int b = AspectRatio.b(bVar.b, bVar.c);
                int i = bVar.b / b;
                int i2 = bVar.c / b;
                if (aspectRatio.c == i && aspectRatio.d == i2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            }
            if (z) {
                SortedSet<b> sortedSet = this.b.get(aspectRatio);
                if (sortedSet.contains(bVar)) {
                    return false;
                }
                sortedSet.add(bVar);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(bVar);
        this.b.put(AspectRatio.a(bVar.b, bVar.c), treeSet);
        return true;
    }

    public final SortedSet<b> a(AspectRatio aspectRatio) {
        Object[] objArr = {aspectRatio};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293f3ffd55280862ca6a48abb54a52c9", RobustBitConfig.DEFAULT_VALUE) ? (SortedSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293f3ffd55280862ca6a48abb54a52c9") : this.b.get(aspectRatio);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c00eb06b64cef65226173b723023e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c00eb06b64cef65226173b723023e0");
        } else {
            this.b.clear();
        }
    }
}
