package com.meituan.android.cube.pga.dynamic;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a c;
    private Map<String, List<d>> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a70af7d2498c16bfdec104f2021041b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a70af7d2498c16bfdec104f2021041b");
        } else {
            this.b = new HashMap();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6cbbc2080158fe71036f0c56734fcda", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6cbbc2080158fe71036f0c56734fcda");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final void a(String str, d dVar) {
        ArrayList arrayList;
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec53c2b02898049d6c8e736d316858e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec53c2b02898049d6c8e736d316858e");
            return;
        }
        if (this.b.containsKey(str)) {
            arrayList = (ArrayList) this.b.get(str);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(dVar);
        this.b.put(str, arrayList);
    }

    @Nullable
    public final d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ceee74b470612cf9bc041b3ff97a099", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ceee74b470612cf9bc041b3ff97a099");
        }
        List<d> list = this.b.get(str);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
