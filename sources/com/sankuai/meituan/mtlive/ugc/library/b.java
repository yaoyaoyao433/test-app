package com.sankuai.meituan.mtlive.ugc.library;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static com.sankuai.meituan.mtlive.ugc.library.interfaces.d a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ffe764286d96d9cbbdfd55b1720c3e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtlive.ugc.library.interfaces.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ffe764286d96d9cbbdfd55b1720c3e5");
        }
        if (a(i)) {
            a e = a.e();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.h;
            Object a2 = a.e().a(context, PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "8dbd12dcd7b912cd2be88b3b4956e97d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "8dbd12dcd7b912cd2be88b3b4956e97d") : e.i.get(Integer.valueOf(e.c(i))));
            if (a2 instanceof com.sankuai.meituan.mtlive.ugc.library.interfaces.d) {
                return (com.sankuai.meituan.mtlive.ugc.library.interfaces.d) a2;
            }
        }
        return null;
    }

    public static com.sankuai.meituan.mtlive.ugc.library.interfaces.b b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23e04300276aef59c1cb19f931047b78", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtlive.ugc.library.interfaces.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23e04300276aef59c1cb19f931047b78");
        }
        if (a(i)) {
            a e = a.e();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.h;
            Object a2 = a.e().a(context, PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "7df38bfc9178289182cd311094c5a22d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "7df38bfc9178289182cd311094c5a22d") : e.j.get(Integer.valueOf(e.c(i))));
            if (a2 instanceof com.sankuai.meituan.mtlive.ugc.library.interfaces.b) {
                return (com.sankuai.meituan.mtlive.ugc.library.interfaces.b) a2;
            }
        }
        return null;
    }

    public static com.sankuai.meituan.mtlive.ugc.library.interfaces.c c(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a23b63570c4c0c11c4e8224cd3f04fc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtlive.ugc.library.interfaces.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a23b63570c4c0c11c4e8224cd3f04fc1");
        }
        if (a(i)) {
            a e = a.e();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.h;
            Object a2 = a.e().a(context, PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "dc0077413619b7735f62b6b664bc685c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "dc0077413619b7735f62b6b664bc685c") : e.k.get(Integer.valueOf(e.c(i))));
            if (a2 instanceof com.sankuai.meituan.mtlive.ugc.library.interfaces.c) {
                return (com.sankuai.meituan.mtlive.ugc.library.interfaces.c) a2;
            }
        }
        return null;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e3173b57e07ab1698009179614305cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e3173b57e07ab1698009179614305cf")).booleanValue() : a.e().b(i);
    }

    public static void a(int i, k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a986d1b8b29df83a3336cfe2e2fbdae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a986d1b8b29df83a3336cfe2e2fbdae0");
        } else {
            a.e().a(i, aVar);
        }
    }
}
