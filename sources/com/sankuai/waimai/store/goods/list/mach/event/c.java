package com.sankuai.waimai.store.goods.list.mach.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect d;
    private Mach.d a;
    private c b;

    public void a(String str, Map<String, Object> map) {
    }

    public final c a(c cVar) {
        this.b = cVar;
        return this.b;
    }

    final c a(String str) {
        c cVar = this;
        while (true) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e1bc77d27a77eabe394f62eace50f94b", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e1bc77d27a77eabe394f62eace50f94b");
            }
            List a = cVar.a();
            if (a != null && a.contains(str)) {
                return cVar;
            }
            if (cVar.b == null) {
                return null;
            }
            cVar = cVar.b;
        }
    }

    public List a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893334ecb72447efb3ab72385cacc89c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893334ecb72447efb3ab72385cacc89c") : Arrays.asList(new Object[0]);
    }

    public final Mach.d b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "955a152c95ff91ebae396bb695f20e08", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "955a152c95ff91ebae396bb695f20e08");
        }
        if (this.a == null) {
            this.a = new Mach.d() { // from class: com.sankuai.waimai.store.goods.list.mach.event.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.Mach.d
                public final void a(String str, Map<String, Object> map) {
                    Object[] objArr2 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eeaa4ca3d365f32ddefa7459a9f1c8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eeaa4ca3d365f32ddefa7459a9f1c8f");
                        return;
                    }
                    c a2 = c.this.a(str);
                    if (a2 != null) {
                        a2.a(str, map);
                    } else {
                        com.sankuai.shangou.stone.util.log.a.d("PoiEvent", String.format("No %s handler", str), new Object[0]);
                    }
                }
            };
        }
        return this.a;
    }
}
