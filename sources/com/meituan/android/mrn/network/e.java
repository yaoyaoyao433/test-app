package com.meituan.android.mrn.network;

import android.text.TextUtils;
import com.meituan.android.mrn.utils.collection.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static final e b = new e();
    protected com.meituan.android.mrn.utils.collection.f<String, i> c;
    protected CopyOnWriteArrayList<i> d;
    private boolean e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067fa13812581bbba0fa2ea2321b8df9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067fa13812581bbba0fa2ea2321b8df9");
            return;
        }
        this.e = false;
        this.c = new com.meituan.android.mrn.utils.collection.f<>(new f.a<String, i>() { // from class: com.meituan.android.mrn.network.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.collection.f.a
            public final boolean a() {
                return true;
            }

            @Override // com.meituan.android.mrn.utils.collection.f.a
            public final Collection<i> b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96bb68b91da07c5bde4ef04f6ea2cd4b", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96bb68b91da07c5bde4ef04f6ea2cd4b") : new CopyOnWriteArrayList();
            }

            @Override // com.meituan.android.mrn.utils.collection.f.a
            public final Map<String, Collection<i>> c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "702a9e8ec0d69a4d28b25f985bd8e0ec", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "702a9e8ec0d69a4d28b25f985bd8e0ec") : new ConcurrentHashMap();
            }
        });
        this.d = new CopyOnWriteArrayList<>();
    }

    public final void a(String str, i iVar) {
        Object[] objArr = {str, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464ab35520aef7a4f2ca1be5889ebade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464ab35520aef7a4f2ca1be5889ebade");
        } else if (iVar == null || TextUtils.isEmpty(str)) {
        } else {
            this.c.a(str, iVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    public final List<i> a(List<String> list) {
        int i = 1;
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbe7a19945f07e2f88e058b14d81238", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbe7a19945f07e2f88e058b14d81238");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53e13fded3b2e271653437d63260729b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53e13fded3b2e271653437d63260729b");
        } else if (!this.e && com.sankuai.meituan.serviceloader.b.a()) {
            synchronized (this) {
                if (!this.e) {
                    List<a> a2 = com.sankuai.meituan.serviceloader.b.a(a.class, (String) null);
                    if (a2 != null && !a2.isEmpty()) {
                        for (a aVar : a2) {
                            Object[] objArr3 = new Object[i];
                            objArr3[z ? 1 : 0] = aVar;
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d527093c939ae3ca5574b4687e62a9b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, z, "8d527093c939ae3ca5574b4687e62a9b");
                            } else {
                                if (aVar != null) {
                                    Collection<i> a3 = aVar.a();
                                    if (a3 != null) {
                                        ?? r11 = z;
                                        for (i iVar : a3) {
                                            Object[] objArr4 = new Object[i];
                                            objArr4[r11] = iVar;
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d1347ab7fc5b4639fbfd84bf6f6a2e6f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d1347ab7fc5b4639fbfd84bf6f6a2e6f");
                                            } else if (iVar != null) {
                                                this.d.add(iVar);
                                            }
                                            i = 1;
                                            r11 = 0;
                                        }
                                    }
                                    Map<String, i> b2 = aVar.b();
                                    if (b2 != null) {
                                        for (Map.Entry<String, i> entry : b2.entrySet()) {
                                            a(entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                i = 1;
                                z = false;
                            }
                        }
                    }
                    this.e = true;
                }
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (list == null || list.size() <= 0) {
            return copyOnWriteArrayList;
        }
        for (String str : list) {
            Collection<i> a4 = this.c.a(str);
            if (a4 != null) {
                copyOnWriteArrayList.addAll(a4);
            }
        }
        return copyOnWriteArrayList;
    }

    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23d407c9f8b119c9ea36cb21d30531c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23d407c9f8b119c9ea36cb21d30531c") : Collections.unmodifiableList(this.d);
    }
}
