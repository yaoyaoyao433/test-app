package com.sankuai.waimai.rocks.view.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private Map<String, a> b;
    private a c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        Mach.a a();
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e603e963a3509590a1e857a9c583c81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e603e963a3509590a1e857a9c583c81");
        } else {
            this.b = new HashMap();
        }
    }

    public d(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5086f0d834dea32d7a221228d8a13d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5086f0d834dea32d7a221228d8a13d9");
            return;
        }
        this.b = new HashMap();
        this.c = aVar;
    }

    public final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f9087334d8ac0811d5e4bb8babec1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f9087334d8ac0811d5e4bb8babec1e");
        }
        a aVar = this.b.get(str);
        return aVar != null ? aVar : this.c;
    }
}
