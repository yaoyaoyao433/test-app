package com.sankuai.waimai.pouch.plugin;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.pouch.plugin.protocol.a<AbsWMPouchInteractPlugin, com.sankuai.waimai.pouch.plugin.params.a> {
    public static ChangeQuickRedirect a;
    private List<String> f;

    public a(List<String> list, com.sankuai.waimai.pouch.plugin.params.a aVar) {
        super(list, aVar);
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f7a277a84efac291bce2f5d3bea634", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f7a277a84efac291bce2f5d3bea634");
        } else {
            this.f = list;
        }
    }

    public a(com.sankuai.waimai.pouch.plugin.params.a aVar, List<Map<String, Object>> list) {
        super(aVar, list);
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23902c7ec065a6e4e3328779c38847d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23902c7ec065a6e4e3328779c38847d");
        } else if (this.c != null) {
            this.f = new ArrayList(this.c.keySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.pouch.plugin.protocol.a
    public AbsWMPouchInteractPlugin a(String str, com.sankuai.waimai.pouch.plugin.params.a aVar) {
        List a2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5261007620775137a761224a0edaaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsWMPouchInteractPlugin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5261007620775137a761224a0edaaa");
        }
        try {
            a2 = com.sankuai.meituan.serviceloader.b.a(AbsWMPouchInteractPlugin.class, str);
        } catch (Exception e) {
            com.sankuai.waimai.pouch.monitor.c.a(str, "interaction", this.f, aVar != null ? aVar.d : null, e.getMessage());
        }
        if (a2 != null && a2.size() > 0) {
            com.sankuai.waimai.pouch.monitor.c.a(str, "interaction", this.f, aVar != null ? aVar.d : null);
            ((AbsWMPouchInteractPlugin) a2.get(0)).setPluginParams(aVar);
            return (AbsWMPouchInteractPlugin) a2.get(0);
        }
        com.sankuai.waimai.pouch.monitor.c.a(str, "interaction", this.f, aVar != null ? aVar.d : null, "plugin not found");
        return null;
    }

    public final void aV_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a54e6d176d611f0950b60929f13704e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a54e6d176d611f0950b60929f13704e6");
        } else if (g()) {
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).d();
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04d17e449f65509e736b43066e04803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04d17e449f65509e736b43066e04803");
        } else if (g()) {
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).e();
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fcb07940c570c32ed70e89717e8488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fcb07940c570c32ed70e89717e8488");
        } else if (g()) {
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).a();
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f1d1e2933b133243091d046a1dcfdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f1d1e2933b133243091d046a1dcfdc");
        } else if (g()) {
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).b();
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f98ea356997e4f59c8a375fea0c06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f98ea356997e4f59c8a375fea0c06b");
        } else if (g()) {
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).c();
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c5eedcdfb0902ae054a42295bc4c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c5eedcdfb0902ae054a42295bc4c41");
        } else if (g()) {
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).f();
            }
        }
    }

    public final Map<String, Object> a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0018b93bae2cd8fcde141ac1328c81", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0018b93bae2cd8fcde141ac1328c81");
        }
        if (g()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.c.entrySet()) {
                ((AbsWMPouchInteractPlugin) entry.getValue()).a(str, i, hashMap);
            }
            return hashMap;
        }
        return null;
    }
}
