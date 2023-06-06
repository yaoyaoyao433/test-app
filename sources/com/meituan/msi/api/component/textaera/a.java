package com.meituan.msi.api.component.textaera;

import com.meituan.msi.page.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public int b;
    public HashMap<String, Integer> c;
    public HashMap<String, Integer> d;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66928dc69b2bcf073bd0e49a4dca52af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66928dc69b2bcf073bd0e49a4dca52af");
            return;
        }
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.b = i;
    }

    @Override // com.meituan.msi.page.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b129fde725461cfbc3ee5e065bfd06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b129fde725461cfbc3ee5e065bfd06");
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = this.d.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> it2 = this.c.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            Map.Entry<String, Integer> next2 = it2.next();
            if (next.getValue().intValue() > i) {
                next.setValue(Integer.valueOf(next.getValue().intValue() + i2));
                next2.setValue(Integer.valueOf(next2.getValue().intValue() + i2));
            } else {
                next.getValue().intValue();
            }
        }
    }
}
