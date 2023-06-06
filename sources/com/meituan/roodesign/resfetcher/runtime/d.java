package com.meituan.roodesign.resfetcher.runtime;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.jw;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final int[] b = {120, 160, 240, jw.e, jw.g, jw.h};

    public static com.meituan.roodesign.resfetcher.plugin.a a(Context context, Map<String, List<com.meituan.roodesign.resfetcher.plugin.a>> map, String str) {
        int i;
        Object[] objArr = {context, map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        com.meituan.roodesign.resfetcher.plugin.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1099ccb7674acab83e0c64176ce7076e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.roodesign.resfetcher.plugin.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1099ccb7674acab83e0c64176ce7076e");
        }
        int i2 = context.getResources().getDisplayMetrics().densityDpi;
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d186b1a0ccfe56d51c1d457ef9de7f3f", RobustBitConfig.DEFAULT_VALUE)) {
            int length = b.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i2 - b[length] >= 0) {
                        i = b[length];
                        break;
                    }
                    length--;
                } else {
                    int[] iArr = b;
                    i = iArr[iArr.length - 1];
                    break;
                }
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d186b1a0ccfe56d51c1d457ef9de7f3f")).intValue();
        }
        if (map.containsKey(str)) {
            com.meituan.roodesign.resfetcher.plugin.a aVar2 = null;
            for (com.meituan.roodesign.resfetcher.plugin.a aVar3 : map.get(str)) {
                if (i == aVar3.e) {
                    return aVar3;
                }
                if (i < aVar3.e && (aVar == null || aVar.e > aVar3.e)) {
                    aVar = aVar3;
                }
                if (i > aVar3.e && (aVar2 == null || aVar2.e < aVar3.e)) {
                    aVar2 = aVar3;
                }
            }
            return aVar != null ? aVar : aVar2;
        }
        return null;
    }

    public static int a(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "673f0d0f521713c36324746c16c1ca6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "673f0d0f521713c36324746c16c1ca6d")).intValue();
        }
        if (i < 0 || i2 <= 0) {
            return 0;
        }
        return (int) ((i * (context.getResources().getDisplayMetrics().densityDpi / i2)) + 0.5f);
    }
}
