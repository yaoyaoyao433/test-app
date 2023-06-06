package com.sankuai.meituan.mtlive.player.library;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static c a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "441aa885303fbee7b77f240c2c6dc130", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "441aa885303fbee7b77f240c2c6dc130");
        }
        if (a(i)) {
            String a2 = e.e().a(i);
            Object a3 = e.e().a(context, i, a2);
            if (a3 instanceof a) {
                return new c((a) a3, e.e().b(a2));
            }
        }
        return null;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34f8402dcacc14c75f3c5bcaab166d8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34f8402dcacc14c75f3c5bcaab166d8e")).booleanValue() : e.e().b(i);
    }

    public static void a(int i, k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20dd33896c8fcce7e313b52f147d9f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20dd33896c8fcce7e313b52f147d9f30");
        } else {
            e.e().a(i, aVar);
        }
    }
}
