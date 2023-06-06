package com.sankuai.waimai.platform.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private Set<b> b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20eaf90ed5cc1ea7b8cfe6ec4bd01215", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20eaf90ed5cc1ea7b8cfe6ec4bd01215") : C1063a.a;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c31ba48fba384334eacf5c892e8fe0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c31ba48fba384334eacf5c892e8fe0e");
            return;
        }
        if (this.b == null) {
            this.b = new HashSet();
        }
        this.b.add(bVar);
    }

    public final void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580ddbb20c5ae304b0913de5b1090d56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580ddbb20c5ae304b0913de5b1090d56");
        } else if (this.b != null) {
            this.b.remove(bVar);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914f3fae13d719980aa7945ba96f65e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914f3fae13d719980aa7945ba96f65e1");
        } else if (this.b != null && this.b.size() > 0) {
            for (b bVar : new ArrayList(this.b)) {
                if (bVar != null) {
                    bVar.a(i);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1063a {
        private static final a a = new a();
    }
}
