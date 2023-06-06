package com.meituan.msc.modules.page.render.rn.lag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final String b = System.lineSeparator();

    private static String a(StackTraceElement[] stackTraceElementArr, int i) {
        Object[] objArr = {stackTraceElementArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49b9aea9e74ac82b33ca2e7c27b99fc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49b9aea9e74ac82b33ca2e7c27b99fc0");
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (i2 < i) {
                i2++;
                sb.append(stackTraceElement.toString());
                sb.append(b);
            }
        }
        return sb.toString();
    }

    public static ArrayList<String> a(List<e> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "647247567e33019285ac2f1fe358753f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "647247567e33019285ac2f1fe358753f");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (e eVar : list) {
            arrayList.add(b + "unixTs:" + eVar.a + b + a(eVar.b, i));
        }
        return arrayList;
    }
}
