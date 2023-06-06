package com.meituan.msc.mmpviews.list.msclist;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Object b;
    public Deque<Integer> c;
    Deque<Set<String>> d;
    public final boolean e;
    public i f;
    b g;
    private Map<String, Object> h;

    public a(Object obj, i iVar, b bVar) {
        Object[] objArr = {obj, iVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f4d8aa8b50a017c8fcf181eee2502d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f4d8aa8b50a017c8fcf181eee2502d");
            return;
        }
        this.e = obj != null;
        this.b = obj;
        this.f = iVar;
        this.g = bVar;
        this.h = new HashMap();
        this.c = new LinkedList();
        this.d = new LinkedList();
        this.d.add(new HashSet());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc9a281e2d8a0ff71d41e6ff64ee3f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc9a281e2d8a0ff71d41e6ff64ee3f8");
            return;
        }
        this.c.pollLast();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58e711ef748b1e5ecf46489dbc654f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58e711ef748b1e5ecf46489dbc654f03");
            return;
        }
        for (String str : this.d.pollLast()) {
            this.h.remove(str);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "333af1c2ce9ada7517c2302ca23770d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "333af1c2ce9ada7517c2302ca23770d1")).booleanValue() : this.c.size() > 0;
    }
}
