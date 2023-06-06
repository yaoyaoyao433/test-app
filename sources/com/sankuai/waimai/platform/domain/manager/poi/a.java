package com.sankuai.waimai.platform.domain.manager.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a d;
    public List<com.sankuai.waimai.foundation.core.service.poi.b> b;
    public boolean c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d2dcf65701f7f57d0f264ccb4a29953", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d2dcf65701f7f57d0f264ccb4a29953");
        }
        if (d == null) {
            d = new a();
        }
        return d;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "647d1d3242e70ab79a0a7e971041e367", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "647d1d3242e70ab79a0a7e971041e367");
        } else {
            this.c = false;
        }
    }

    public final void a(com.sankuai.waimai.foundation.core.service.poi.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2473d20ffcc3f99cb760ba2e8dbf6edf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2473d20ffcc3f99cb760ba2e8dbf6edf");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.b.contains(bVar)) {
            return;
        }
        this.b.add(bVar);
    }

    public final void b(com.sankuai.waimai.foundation.core.service.poi.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a751c18dc7f3d9b1ef3c62fb18604d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a751c18dc7f3d9b1ef3c62fb18604d7");
        } else if (this.b != null) {
            this.b.remove(bVar);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a2dc49c494d8e08f75557c521cd4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a2dc49c494d8e08f75557c521cd4da");
        } else if (this.b != null) {
            for (com.sankuai.waimai.foundation.core.service.poi.b bVar : (com.sankuai.waimai.foundation.core.service.poi.b[]) this.b.toArray(new com.sankuai.waimai.foundation.core.service.poi.b[this.b.size()])) {
                bVar.a(str);
            }
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe1baf6e4fc17045712aa3606cdf37b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe1baf6e4fc17045712aa3606cdf37b");
        } else if (this.b != null) {
            for (com.sankuai.waimai.foundation.core.service.poi.b bVar : (com.sankuai.waimai.foundation.core.service.poi.b[]) this.b.toArray(new com.sankuai.waimai.foundation.core.service.poi.b[this.b.size()])) {
                bVar.a(str, str2);
            }
        }
    }

    public final void a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d9bb0a973c3a9bb3629408c678df5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d9bb0a973c3a9bb3629408c678df5e");
        } else if (this.b != null) {
            for (com.sankuai.waimai.foundation.core.service.poi.b bVar : (com.sankuai.waimai.foundation.core.service.poi.b[]) this.b.toArray(new com.sankuai.waimai.foundation.core.service.poi.b[this.b.size()])) {
                bVar.a(str, str2, j);
            }
        }
    }
}
