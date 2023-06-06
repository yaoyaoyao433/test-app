package com.meituan.crashreporter.container;

import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private LinkedList<a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66655320959b6525526062fd0f20ea04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66655320959b6525526062fd0f20ea04");
        } else {
            this.b = new LinkedList<>();
        }
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae4cca80fa757a6d072ae7e138fb790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae4cca80fa757a6d072ae7e138fb790");
            return;
        }
        if (this.b.size() > 20) {
            this.b.removeLast();
        }
        this.b.push(new a("[PUSH]", str));
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "804ad7c44fa064560bdd5ecd82d7f785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "804ad7c44fa064560bdd5ecd82d7f785");
        } else if (d()) {
        } else {
            if (this.b.size() > 20) {
                this.b.removeLast();
            }
            this.b.push(new a("[POP]", this.b.getFirst().a));
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fafcb69e82a9b20f1260028de27b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fafcb69e82a9b20f1260028de27b41");
            return;
        }
        if (this.b.size() > 20) {
            this.b.removeLast();
        }
        this.b.push(new a("[POP_ALL]", ""));
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0871a8f1f49f694290d37f6c087fb851", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0871a8f1f49f694290d37f6c087fb851")).booleanValue() : this.b.size() <= 0;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea6959bc49e30ca411cac5ad31571011", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea6959bc49e30ca411cac5ad31571011");
        }
        StringBuilder sb = new StringBuilder();
        while (!d()) {
            a pop = this.b.pop();
            sb.append(pop.b);
            sb.append(StringUtil.SPACE);
            sb.append(pop.c);
            sb.append(pop.a);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public String b = TimeUtil.formatTimeStamp(TimeUtil.currentTimeMillis());
        public String c;

        public a(String str, String str2) {
            this.c = str;
            this.a = str2;
        }
    }
}
