package com.sankuai.waimai.alita.core.intention;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<a>> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@Nullable AlitaIntention alitaIntention, @Nullable AlitaIntention alitaIntention2);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf35e9aa5253bdd9934c6003976846b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf35e9aa5253bdd9934c6003976846b");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    public final void a(String str, AlitaIntention alitaIntention, AlitaIntention alitaIntention2) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList;
        Object[] objArr = {str, alitaIntention, alitaIntention2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7c6d5ea84f9b1619b05356e769be3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7c6d5ea84f9b1619b05356e769be3e");
        } else if (!com.sankuai.waimai.alita.platform.utils.b.a() && (copyOnWriteArrayList = this.b.get(str)) != null) {
            for (a aVar : copyOnWriteArrayList) {
                aVar.a(alitaIntention, alitaIntention2);
            }
        }
    }

    public final d a(String str, final a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d7945272630ca6e3221a46e95ddc95", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d7945272630ca6e3221a46e95ddc95");
        }
        if (TextUtils.isEmpty(str)) {
            return d.e;
        }
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.b.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        final CopyOnWriteArrayList<a> putIfAbsent = this.b.putIfAbsent(str, copyOnWriteArrayList);
        if (putIfAbsent == null) {
            putIfAbsent = copyOnWriteArrayList;
        }
        putIfAbsent.addIfAbsent(aVar);
        return new d() { // from class: com.sankuai.waimai.alita.core.intention.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.intention.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b82e23471abee36986aeada6da652d0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b82e23471abee36986aeada6da652d0c");
                } else {
                    putIfAbsent.remove(aVar);
                }
            }
        };
    }
}
