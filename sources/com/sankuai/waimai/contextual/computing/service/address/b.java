package com.sankuai.waimai.contextual.computing.service.address;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.contextual.computing.storage.model.c;
import com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP;
import com.sankuai.waimai.platform.capacity.log.h;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, int i, int i2, int i3, int i4, boolean z) {
        c cVar;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ba4aed68fc3c83f1949689c1aa63e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ba4aed68fc3c83f1949689c1aa63e24");
            return;
        }
        int charAt = TextUtils.isEmpty(str) ? 0 : str.charAt(0) - '`';
        int i5 = (charAt * BlankConfig.MAX_SAMPLE) + (i * 10000) + (i2 * 1000) + (i3 * 100) + (i4 * 10) + (z ? 1 : 0);
        a("wm_prelocation_address", i5);
        a("wm_prelocation_address", String.valueOf(i5));
        String d = ContextualComputingSP.d();
        if (TextUtils.isEmpty(d)) {
            d = com.sankuai.waimai.platform.b.A().i();
            ContextualComputingSP.a(d);
        }
        List<c> c = ContextualComputingSP.c();
        if (!com.sankuai.waimai.platform.b.A().i().equals(d)) {
            for (c cVar2 : c) {
                int i6 = (cVar2.b * 1000000) + (cVar2.e * BlankConfig.MAX_SAMPLE) + ((cVar2.c * 10000) / cVar2.d);
                a("wm_prelocation_address_total", i6);
                a("wm_prelocation_address_total", String.valueOf(i6));
            }
            ContextualComputingSP.a(com.sankuai.waimai.platform.b.A().i());
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c(charAt, z ? 1 : 0, 1, i));
            ContextualComputingSP.b(arrayList);
            return;
        }
        Iterator<c> it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (cVar.b == charAt && cVar.e == i) {
                break;
            }
        }
        if (cVar == null) {
            c.add(new c(charAt, z ? 1 : 0, 1, i));
        } else {
            cVar.d++;
            if (z) {
                cVar.c++;
            }
        }
        ContextualComputingSP.b(c);
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "316cc1294277abdbe4280e629bc6417a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "316cc1294277abdbe4280e629bc6417a");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, str, SystemClock.elapsedRealtime());
        }
    }

    private static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "816a51eaab423d657c434c53bddae6b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "816a51eaab423d657c434c53bddae6b6");
        } else {
            i.d(new h().a(str).b(str2).b(true).b());
        }
    }
}
