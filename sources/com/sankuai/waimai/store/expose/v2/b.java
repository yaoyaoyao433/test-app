package com.sankuai.waimai.store.expose.v2;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public Map<a, c> b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eabe7053b891177b74963065e98aaa71", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eabe7053b891177b74963065e98aaa71");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60df344ca67970be5b32af22c899d3b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60df344ca67970be5b32af22c899d3b2");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22dc15bdbfe86a93033d84a2ee748589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22dc15bdbfe86a93033d84a2ee748589");
        } else if (aVar == null || aVar.f() == null || this.b.get(aVar) != null) {
        } else {
            this.b.put(aVar, new c(aVar.f()));
        }
    }

    public final void b(a aVar) {
        c remove;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2befcdcee674822f518c779d4aab854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2befcdcee674822f518c779d4aab854");
        } else if (aVar == null || (remove = this.b.remove(aVar)) == null) {
        } else {
            remove.d();
        }
    }

    public final void a(a aVar, com.sankuai.waimai.store.expose.v2.entity.b bVar) {
        c cVar;
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc57f43abbe190e2fee3be3fec5d324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc57f43abbe190e2fee3be3fec5d324");
        } else if (aVar == null || (cVar = this.b.get(aVar)) == null) {
        } else {
            cVar.a(bVar);
        }
    }

    public final com.sankuai.waimai.store.expose.v2.entity.b a(a aVar, View view) {
        c cVar;
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a30ba8a6fde4eccb7323cf6b5de2712", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.expose.v2.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a30ba8a6fde4eccb7323cf6b5de2712");
        }
        if (aVar == null || (cVar = this.b.get(aVar)) == null || view == null) {
            return null;
        }
        return cVar.a(view);
    }

    public final void c(a aVar) {
        c cVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a22f4f93d206b2098ba47dfef41f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a22f4f93d206b2098ba47dfef41f7d");
        } else if (aVar == null || (cVar = this.b.get(aVar)) == null) {
        } else {
            cVar.b = true;
        }
    }

    public final void d(a aVar) {
        c cVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1b24d4edcac1f3fcf55d0841c2056a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1b24d4edcac1f3fcf55d0841c2056a");
        } else if (aVar == null || (cVar = this.b.get(aVar)) == null) {
        } else {
            cVar.a();
        }
    }

    public final void e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6294fc9e5bb1c4938799411605250a4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6294fc9e5bb1c4938799411605250a4e");
            return;
        }
        c cVar = this.b.get(aVar);
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    public final void f(a aVar) {
        c cVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d9400242ba5ad34edb6404ba48e926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d9400242ba5ad34edb6404ba48e926");
        } else if (aVar == null || (cVar = this.b.get(aVar)) == null) {
        } else {
            cVar.e();
        }
    }

    public final void a(a aVar, String... strArr) {
        c cVar;
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d06c133be73c912168c1e3f1add2b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d06c133be73c912168c1e3f1add2b5c");
        } else if (aVar == null || (cVar = this.b.get(aVar)) == null) {
        } else {
            cVar.a(strArr);
        }
    }

    public final void b(a aVar, String... strArr) {
        c cVar;
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c8f7c6cdb50d9f777ef744a0e13f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c8f7c6cdb50d9f777ef744a0e13f55");
        } else if (aVar != null && (cVar = this.b.get(aVar)) != null) {
            Object[] objArr2 = {strArr};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "8d2a8e3c1e69b4d0a0ae72bc1157e437", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "8d2a8e3c1e69b4d0a0ae72bc1157e437");
            } else if (strArr != null && strArr.length != 0) {
                for (int i = 0; i < cVar.f.size(); i++) {
                    com.sankuai.waimai.store.expose.v2.entity.b valueAt = cVar.f.valueAt(i);
                    String a2 = valueAt.a();
                    if (!TextUtils.isEmpty(a2) && !cVar.a(a2, strArr)) {
                        cVar.g.remove(valueAt.d());
                    }
                }
            }
        }
    }
}
