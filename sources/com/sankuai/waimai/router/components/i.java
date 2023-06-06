package com.sankuai.waimai.router.components;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static void a(boolean z) {
        b = true;
    }

    public static boolean a(com.sankuai.waimai.router.core.j jVar, boolean z) {
        int intValue;
        Object[] objArr = {jVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5df7e654fb821afedb36ffba14b5a9c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5df7e654fb821afedb36ffba14b5a9c0")).booleanValue();
        }
        if (!b) {
            Object[] objArr2 = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7e114f6d6688c6c3471f859b44f650e3", RobustBitConfig.DEFAULT_VALUE)) {
                intValue = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7e114f6d6688c6c3471f859b44f650e3")).intValue();
            } else {
                Object[] objArr3 = {jVar, 2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                intValue = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "457100c8742270a7bacc561d1f6298c1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "457100c8742270a7bacc561d1f6298c1")).intValue() : jVar.b("com.sankuai.waimai.router.from", 2);
            }
            if (intValue == 1) {
                return false;
            }
        }
        return true;
    }

    public static void a(Intent intent, com.sankuai.waimai.router.core.j jVar) {
        Integer num;
        Object[] objArr = {intent, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3d6cde82d107212c10fc92536f17b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3d6cde82d107212c10fc92536f17b80");
        } else if (intent == null || jVar == null || (num = (Integer) jVar.a(Integer.class, "com.sankuai.waimai.router.from")) == null) {
        } else {
            int intValue = num.intValue();
            Object[] objArr2 = {intent, Integer.valueOf(intValue)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "897ce20cc586d22c4eb0b6d6abbd2f61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "897ce20cc586d22c4eb0b6d6abbd2f61");
            } else if (intent != null) {
                intent.putExtra("com.sankuai.waimai.router.from", intValue);
            }
        }
    }

    public static int a(Intent intent, int i) {
        Object[] objArr = {intent, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ae3019cca49a4ac4eac95d757bd67fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ae3019cca49a4ac4eac95d757bd67fa")).intValue() : a(intent, "com.sankuai.waimai.router.from", 2);
    }

    private static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66ca8546c1e317926b1cd3580569f4b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66ca8546c1e317926b1cd3580569f4b5")).intValue();
        }
        if (intent == null) {
            return i;
        }
        try {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, i);
        } catch (Exception e) {
            com.sankuai.waimai.router.core.d.b(e);
            return i;
        }
    }
}
