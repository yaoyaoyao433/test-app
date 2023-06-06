package com.sankuai.waimai.alita.platform.horn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private e b;
    private Boolean c;
    private Boolean d;

    public a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934446048282b71fafe3a9f4e8be409b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934446048282b71fafe3a9f4e8be409b");
        } else {
            this.b = eVar;
        }
    }

    public final synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b4ca3b1a0aca616fa48df3c20515b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b4ca3b1a0aca616fa48df3c20515b2")).booleanValue();
        }
        Boolean bool = this.c;
        Object[] objArr2 = {bool, "enable_alita", (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3363d8783193410b850f6009e674c4bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3363d8783193410b850f6009e674c4bb")).booleanValue();
        }
        if (bool == null) {
            bool = Boolean.valueOf(this.b.a("enable_alita", true));
        }
        return bool.booleanValue();
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77e4c34d1a03c1bcb29f2cf03370c0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77e4c34d1a03c1bcb29f2cf03370c0d");
            return;
        }
        this.c = Boolean.valueOf(z);
        this.b.b("enable_alita", z);
    }

    public final synchronized void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6347c66ef445ebc6aa319dcdd227f611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6347c66ef445ebc6aa319dcdd227f611");
            return;
        }
        this.d = Boolean.valueOf(z);
        this.b.b("enable_model_predict", this.c.booleanValue());
    }
}
