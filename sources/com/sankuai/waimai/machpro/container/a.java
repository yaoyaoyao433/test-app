package com.sankuai.waimai.machpro.container;

import android.content.Intent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.module.MPModule;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.machpro.instance.a b;
    protected String c;

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995fbb17779047454401ba2d27925eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995fbb17779047454401ba2d27925eea");
        }
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(FFPReportListener.IReportEvent iReportEvent) {
    }

    public void b() {
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f157254904da6a434eae5dfb7910bf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f157254904da6a434eae5dfb7910bf2");
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca08ae3360fc13cf3d1c1f86ac6b9312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca08ae3360fc13cf3d1c1f86ac6b9312");
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf30c3e8dc1737b85de3bba8b2ce36c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf30c3e8dc1737b85de3bba8b2ce36c");
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a152b2ea2d60b0bc81e59a5afe845e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a152b2ea2d60b0bc81e59a5afe845e9");
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b351e7f13a45ed55c0d6dee36a8c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b351e7f13a45ed55c0d6dee36a8c69");
        }
    }

    public final void a(String str) {
        this.c = str;
    }

    public final MPModule b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9e7358a5b6159ab585b7e3a540c413", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9e7358a5b6159ab585b7e3a540c413");
        }
        if (this.b != null) {
            com.sankuai.waimai.machpro.instance.a aVar = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "63813d1dc81213c0ecff89c5bfc3fed4", RobustBitConfig.DEFAULT_VALUE)) {
                return (MPModule) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "63813d1dc81213c0ecff89c5bfc3fed4");
            }
            if (aVar.h != null) {
                return aVar.h.getModule(str);
            }
            return null;
        }
        return null;
    }

    public final void a(com.sankuai.waimai.machpro.component.list.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbacdeab6c34927690f337be58901392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbacdeab6c34927690f337be58901392");
        } else if (this.b != null) {
            this.b.w = dVar;
        }
    }

    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68da003b590a5753e06d67bfc6232283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68da003b590a5753e06d67bfc6232283");
        } else {
            this.b.a(hVar);
        }
    }

    public final void b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "760c3b63630cc461e9763b3e18154114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "760c3b63630cc461e9763b3e18154114");
        } else {
            this.b.b(hVar);
        }
    }

    public final void a(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee531988f57a0f2417038512b0ae24c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee531988f57a0f2417038512b0ae24c7");
        } else {
            this.b.a(machMap);
        }
    }

    public final void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f20c676aa0ab1a2e08d34c8e2d56618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f20c676aa0ab1a2e08d34c8e2d56618");
        } else {
            this.b.a(str, machMap);
        }
    }

    public final void a(com.sankuai.waimai.machpro.adapter.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aad5ce83efeb803eae23c7a6d64ae06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aad5ce83efeb803eae23c7a6d64ae06");
        } else {
            this.b.z = bVar;
        }
    }

    public final void b(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9df7ccfe625fd4ec13cee3c13a9461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9df7ccfe625fd4ec13cee3c13a9461");
            return;
        }
        com.sankuai.waimai.machpro.instance.a aVar = this.b;
        Object[] objArr2 = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a370157a37cdf7cee7932da799754f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a370157a37cdf7cee7932da799754f97");
            return;
        }
        aVar.n = machMap;
        if (aVar.f != null) {
            aVar.f.b(machMap);
            aVar.f.a("dataChanged", (MachMap) null);
        }
    }

    public final void c(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301521e68904320b9612fa978b6ed280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301521e68904320b9612fa978b6ed280");
            return;
        }
        com.sankuai.waimai.machpro.instance.a aVar = this.b;
        Object[] objArr2 = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0d1b6d728dae0c4765797451b3fb9328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0d1b6d728dae0c4765797451b3fb9328");
        } else if (machMap == null || machMap.size() <= 0) {
        } else {
            aVar.j = machMap;
            if (aVar.f != null) {
                aVar.f.a(aVar.j);
            }
        }
    }

    public final Object a(String str, String str2, MachArray machArray) {
        Object[] objArr = {str, str2, machArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d1715d8a0d5095d62b8aa048c5102f8", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d1715d8a0d5095d62b8aa048c5102f8");
        }
        com.sankuai.waimai.machpro.instance.a aVar = this.b;
        Object[] objArr2 = {str, str2, machArray};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fbaa32d60473af24ad887f88714f013e", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fbaa32d60473af24ad887f88714f013e");
        }
        if (aVar.f != null) {
            return aVar.f.a(str, str2, machArray);
        }
        return null;
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b351bfb7ca62fba309f245d6f94ab67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b351bfb7ca62fba309f245d6f94ab67");
        } else if (this.b != null) {
            com.sankuai.waimai.machpro.instance.a aVar = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "835e7462befa2aa517a7a544a87b5b3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "835e7462befa2aa517a7a544a87b5b3c");
                return;
            }
            aVar.B = str;
            MachMap machMap = new MachMap();
            machMap.put("diTingPageId", aVar.B);
            aVar.a(machMap);
        }
    }
}
