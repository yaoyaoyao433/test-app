package com.dianping.agentsdk.manager;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected ArrayList<com.dianping.agentsdk.adapter.b> b;
    protected HashMap<com.dianping.agentsdk.adapter.b, String> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1868ec5c41eb2b36f09eb6571bfe290b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1868ec5c41eb2b36f09eb6571bfe290b");
            return;
        }
        this.b = new ArrayList<>();
        this.c = new HashMap<>();
    }

    public final boolean a(com.dianping.agentsdk.adapter.b bVar) {
        com.dianping.agentsdk.adapter.b bVar2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e650b48b4a07575c55e71a2776fa27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e650b48b4a07575c55e71a2776fa27")).booleanValue();
        }
        if (this.c.containsKey(bVar)) {
            int indexOf = this.b.indexOf(bVar) - 1;
            while (true) {
                bVar2 = null;
                if (indexOf < 0) {
                    break;
                }
                bVar2 = this.b.get(indexOf);
                int i = 0;
                for (int i2 = 0; i2 < bVar2.getSectionCount(); i2++) {
                    i += bVar2.getRowCount(i2);
                }
                if (i > 0) {
                    break;
                }
                indexOf--;
            }
            return (bVar2 != null && this.c.containsKey(bVar2) && TextUtils.equals(this.c.get(bVar2), this.c.get(bVar))) ? false : true;
        }
        return false;
    }

    public final boolean b(com.dianping.agentsdk.adapter.b bVar) {
        com.dianping.agentsdk.adapter.b bVar2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3063288ebc1d9a2e29975da074a5ccd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3063288ebc1d9a2e29975da074a5ccd2")).booleanValue();
        }
        if (this.c.containsKey(bVar)) {
            int indexOf = this.b.indexOf(bVar) + 1;
            while (true) {
                bVar2 = null;
                if (indexOf >= this.b.size()) {
                    break;
                }
                bVar2 = this.b.get(indexOf);
                int i = 0;
                for (int i2 = 0; i2 < bVar2.getSectionCount(); i2++) {
                    i += bVar2.getRowCount(i2);
                }
                if (i > 0) {
                    break;
                }
                indexOf++;
            }
            return (bVar2 != null && this.c.containsKey(bVar2) && TextUtils.equals(this.c.get(bVar2), this.c.get(bVar))) ? false : true;
        }
        return false;
    }

    public final void a(com.dianping.agentsdk.adapter.b bVar, int i, String str) {
        Object[] objArr = {bVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c3e9804f4c9fcbbaa039e4d8153dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c3e9804f4c9fcbbaa039e4d8153dc9");
        } else if (bVar == null) {
        } else {
            if (i < 0 || i > this.b.size()) {
                this.b.add(bVar);
            } else {
                this.b.add(i, bVar);
            }
            this.c.put(bVar, str);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee20eea01a2621fc045a7eaa7cf6d11e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee20eea01a2621fc045a7eaa7cf6d11e");
            return;
        }
        this.b.clear();
        this.c.clear();
    }
}
