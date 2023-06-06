package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b f;
    public com.sankuai.waimai.platform.mach.a b;
    Rect c;
    private Map<String, List<com.sankuai.waimai.mach.container.b>> d;
    private Map<String, List<com.sankuai.waimai.mach.recycler.c>> e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a453aed89cbbbe0712ec01868d40f0fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a453aed89cbbbe0712ec01868d40f0fc");
            return;
        }
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5432105ca6d9959199a1ab844cc108a2", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5432105ca6d9959199a1ab844cc108a2");
            }
            if (f == null) {
                f = new b();
            }
            return f;
        }
    }

    public final synchronized void a(com.sankuai.waimai.mach.recycler.c cVar, @NonNull String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab7465a542a15a93a40352daea086ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab7465a542a15a93a40352daea086ea");
            return;
        }
        List<com.sankuai.waimai.mach.recycler.c> list = this.e.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            this.e.put(str, arrayList);
            return;
        }
        if (!a(list, cVar)) {
            list.add(cVar);
        }
    }

    private boolean a(List<com.sankuai.waimai.mach.recycler.c> list, com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20685928bc2679d8825da207506ceded", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20685928bc2679d8825da207506ceded")).booleanValue();
        }
        for (com.sankuai.waimai.mach.recycler.c cVar2 : list) {
            if (TextUtils.equals(cVar2.j, cVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d76e7278062e69b0fedd9d3dcd319b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d76e7278062e69b0fedd9d3dcd319b");
        } else if (this.e.isEmpty()) {
        } else {
            b(str, map);
        }
    }

    private synchronized void b(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd8bcb5d6d9fb5730a6ff5ab78132a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd8bcb5d6d9fb5730a6ff5ab78132a0");
            return;
        }
        List<com.sankuai.waimai.mach.recycler.c> list = this.e.get(str);
        if (list != null && !list.isEmpty()) {
            for (com.sankuai.waimai.mach.recycler.c cVar : list) {
                if (cVar.l() != null) {
                    cVar.l().sendJsEvent(str, map);
                }
            }
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b1ac7951d8990e8c07ea9beca8e846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b1ac7951d8990e8c07ea9beca8e846");
            return;
        }
        this.d.clear();
        this.e.clear();
    }
}
