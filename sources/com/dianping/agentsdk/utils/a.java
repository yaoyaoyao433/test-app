package com.dianping.agentsdk.utils;

import com.dianping.agentsdk.framework.AgentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static com.dianping.agentsdk.framework.b a(Class cls, int i, int i2, int i3, int i4) {
        Object[] objArr = {cls, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf103f3f4f5cc02ba5229ad1cc43c46f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.framework.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf103f3f4f5cc02ba5229ad1cc43c46f");
        }
        if (AgentInterface.class.isAssignableFrom(cls)) {
            return new com.dianping.agentsdk.framework.b(cls, a(i, a(i3)) + CommonConstant.Symbol.DOT + a(i2, a(i4)));
        }
        com.dianping.agentsdk.framework.b bVar = new com.dianping.agentsdk.framework.b(null, a(i, a(i3)) + CommonConstant.Symbol.DOT + a(i2, a(i4)));
        bVar.e = cls;
        return bVar;
    }

    public static String a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f5d5c53df61bf04e91e84cddc1f4e00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f5d5c53df61bf04e91e84cddc1f4e00");
        }
        String str = "";
        for (int i3 = 0; i3 < i2 - a(i); i3++) {
            str = str + "0";
        }
        return str + i;
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4c6de4911954d0b53a305d14c201b97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4c6de4911954d0b53a305d14c201b97")).intValue();
        }
        if (i == 0) {
            return 1;
        }
        return ((int) Math.log10(i)) + 1;
    }
}
