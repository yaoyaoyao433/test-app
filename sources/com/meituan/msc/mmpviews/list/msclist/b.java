package com.meituan.msc.mmpviews.list.msclist;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    private HashMap<String, HashMap<String, String>> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3d2c7562d3397b51a365ccb2acb0d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3d2c7562d3397b51a365ccb2acb0d4");
        } else {
            this.c = new HashMap<>();
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4485b0ebf7a80db4dcc391d5f64ab85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4485b0ebf7a80db4dcc391d5f64ab85")).booleanValue() : this.c.containsKey(str);
    }

    public final HashMap<String, String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b8305db2b207fb3e09151f6c3aa3bb5", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b8305db2b207fb3e09151f6c3aa3bb5") : this.c.get(str);
    }

    public final void a(String str, HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93652d345c3909928e5277ac2de0e356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93652d345c3909928e5277ac2de0e356");
        } else {
            this.c.put(str, hashMap);
        }
    }
}
