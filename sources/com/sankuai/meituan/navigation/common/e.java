package com.sankuai.meituan.navigation.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.common.Navigator;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: ProGuard */
@Navigator.Name("navigation")
/* loaded from: classes4.dex */
public final class e extends Navigator<d> {
    public static ChangeQuickRedirect a;
    private Context d;
    private ArrayDeque<Integer> e;

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final /* synthetic */ void a(@NonNull d dVar, @Nullable Bundle bundle, @Nullable f fVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2, bundle, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f55ded59dc4ab88271207f5b6d0b4a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f55ded59dc4ab88271207f5b6d0b4a4");
            return;
        }
        int i = dVar2.g;
        if (i != 0) {
            c a2 = dVar2.a(i, false);
            if (a2 == null) {
                String a3 = c.a(this.d, i);
                throw new IllegalArgumentException("navigation destination " + a3 + " is not a direct child of this NavGraph");
            }
            if (fVar != null && fVar.a() && a(dVar2)) {
                a(dVar2.d, 0);
            } else {
                this.e.add(Integer.valueOf(dVar2.d));
                a(dVar2.d, 1);
            }
            a2.a(bundle, fVar);
            return;
        }
        StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
        sb.append(dVar2.d != 0 ? c.a(this.d, dVar2.d) : "the root navigation");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    @NonNull
    public final /* synthetic */ d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f58b3f52e51198357db2db062baa09", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f58b3f52e51198357db2db062baa09") : new d(this);
    }

    public e(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97ea8523a2c013e73a9e407233002d8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97ea8523a2c013e73a9e407233002d8f");
            return;
        }
        this.e = new ArrayDeque<>();
        this.d = context;
    }

    private boolean a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470a66538d71c414632985baa8c79ae1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470a66538d71c414632985baa8c79ae1")).booleanValue();
        }
        if (this.e.isEmpty()) {
            return false;
        }
        int intValue = this.e.peekLast().intValue();
        while (dVar.d != intValue) {
            c b = dVar.b(dVar.g);
            if (!(b instanceof d)) {
                return false;
            }
            dVar = (d) b;
        }
        return true;
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c374966677db45dd67edf6b93bba680b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c374966677db45dd67edf6b93bba680b")).booleanValue();
        }
        if (this.e.isEmpty()) {
            return false;
        }
        this.e.removeLast();
        a(this.e.isEmpty() ? 0 : this.e.peekLast().intValue(), 2);
        return true;
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    @Nullable
    public final Bundle b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10c87af284c16860a46d1a818b60cd41", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10c87af284c16860a46d1a818b60cd41");
        }
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.e.size()];
        Iterator<Integer> it = this.e.iterator();
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-graph:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final void a(@Nullable Bundle bundle) {
        int[] intArray;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719e9ac0802d4b99920a90d5dd62aba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719e9ac0802d4b99920a90d5dd62aba9");
        } else if (bundle != null && (intArray = bundle.getIntArray("androidx-nav-graph:navigator:backStackIds")) != null) {
            this.e.clear();
            for (int i : intArray) {
                this.e.add(Integer.valueOf(i));
            }
        }
    }
}
