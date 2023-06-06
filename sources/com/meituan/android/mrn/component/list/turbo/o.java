package com.meituan.android.mrn.component.list.turbo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private final HashMap<String, Integer> b;
    private final HashSet<Integer> c;
    private final HashMap<String, p> d;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159b035cca1ff3ab5d818e37595f5608", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159b035cca1ff3ab5d818e37595f5608");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashSet<>();
        this.d = new HashMap<>();
        this.c.add(0);
        this.c.add(1);
        this.c.add(2);
    }

    public final int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75afd5de5e946beb4f4fa2b72fd9504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75afd5de5e946beb4f4fa2b72fd9504")).intValue();
        }
        if (str2 == null || str == null) {
            return 0;
        }
        String str3 = str + str2;
        Integer num = this.b.get(str3);
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(str3.hashCode());
        StringBuilder sb = new StringBuilder(str3);
        while (this.c.contains(valueOf)) {
            sb.insert(0, valueOf);
            valueOf = Integer.valueOf(sb.toString().hashCode());
        }
        this.c.add(valueOf);
        this.b.put(str3, valueOf);
        return valueOf.intValue();
    }

    public final int a(a aVar, TurboNode turboNode) {
        Object[] objArr = {aVar, turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8136f390f2f403306ecfd565444bd9f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8136f390f2f403306ecfd565444bd9f7")).intValue();
        }
        p pVar = this.d.get(turboNode.mTemplateId);
        if (pVar == null) {
            pVar = new p();
            this.d.put(turboNode.mTemplateId, pVar);
        }
        return a(turboNode.mTemplateId, pVar.a(aVar, turboNode));
    }
}
