package com.sankuai.waimai.alita.core.event;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.init.e;
import com.sankuai.waimai.alita.platform.init.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private HashMap<String, g> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(List<String> list, com.sankuai.waimai.alita.core.event.a aVar);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285e5b37097bd1f8255fffa30b8ccc83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285e5b37097bd1f8255fffa30b8ccc83");
        } else {
            this.b = new HashMap<>();
        }
    }

    private boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4dd9cb516d55d12f3d52bb2bc13357b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4dd9cb516d55d12f3d52bb2bc13357b")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str2.split("[, ]");
        for (int i = 0; i <= split.length - 1; i++) {
            if (str.equals(split[i])) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void a(com.sankuai.waimai.alita.core.event.a aVar, a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2e5f80d61c8756ab9adeb4e22ae7c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2e5f80d61c8756ab9adeb4e22ae7c4");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, g> entry : this.b.entrySet()) {
            if (entry != null) {
                g value = entry.getValue();
                if (value == null) {
                    arrayList.add(String.valueOf(entry.getKey()));
                } else {
                    e b = value.b();
                    if (b == null || !a(aVar.b(), b.a) || !a(aVar.a(), b.b) || !a(aVar.d(), b.d) || !a(aVar.c(), b.c)) {
                        e a2 = value.a();
                        if (a2 != null) {
                            if (a(aVar.b(), a2.a) && a(aVar.a(), a2.b) && a(aVar.d(), a2.d) && a(aVar.c(), a2.c)) {
                                arrayList.add(String.valueOf(entry.getKey()));
                            }
                        } else {
                            arrayList.add(String.valueOf(entry.getKey()));
                        }
                    }
                }
            }
        }
        aVar2.a(arrayList, aVar);
    }

    public final synchronized void a(String str, g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b25bc3a8f97313435a2df5bb669e3f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b25bc3a8f97313435a2df5bb669e3f3");
        } else {
            this.b.put(str, gVar);
        }
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa123359152b230f9f1c79fb17b45c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa123359152b230f9f1c79fb17b45c1");
        } else {
            this.b.remove(str);
        }
    }
}
