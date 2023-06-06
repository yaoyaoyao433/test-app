package com.meituan.android.neohybrid.neo.nsr;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.neohybrid.neo.nsr.d;
import com.meituan.android.neohybrid.util.n;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final LinkedHashMap<String, List<d>> b = new LinkedHashMap<>();

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00a7198ac4182709de20ccf7d7fea60a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00a7198ac4182709de20ccf7d7fea60a")).booleanValue() : (TextUtils.isEmpty(str) || i.a((Collection) b.get(str))) ? false : true;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7310132bb4880dfc7b112dcdaa95d138", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7310132bb4880dfc7b112dcdaa95d138")).booleanValue() : (TextUtils.isEmpty(str) || a(b.get(str), false) == null) ? false : true;
    }

    public static String a(NeoConfig neoConfig, long j, boolean z) {
        Object[] objArr = {neoConfig, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "caee9e7dc6de50a52c77d103c9070249", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "caee9e7dc6de50a52c77d103c9070249");
        }
        Object[] objArr2 = {neoConfig, null, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "378584bd62358923ed010847c2f020d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "378584bd62358923ed010847c2f020d3");
        }
        if (neoConfig == null) {
            return null;
        }
        String url = neoConfig.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        List<d> list = b.get(url);
        if (list == null) {
            list = new LinkedList<>();
            b.put(url, list);
        }
        List<d> list2 = list;
        if (list2.size() > 0) {
            return null;
        }
        d dVar = new d(neoConfig, null, j, z);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "32609e8b99facc3c18496981f752ccd5", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (d) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "32609e8b99facc3c18496981f752ccd5");
        } else if (dVar.d == d.a.FAIL) {
            dVar.b.b(dVar.c, 1000, "请求参数错误");
        } else {
            dVar.d = d.a.READY;
            if (dVar.f && Looper.myLooper() == Looper.getMainLooper()) {
                dVar.a();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(e.a(dVar), dVar.e);
            }
        }
        if (dVar == null) {
            return null;
        }
        list2.add(dVar);
        return dVar.c;
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea311b02d4bc84d2839f6546c425cde8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea311b02d4bc84d2839f6546c425cde8");
        } else if (aVar != null) {
            Iterator<Map.Entry<String, List<d>>> it = b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<d>> next = it.next();
                if (next != null && next.getValue() != null && !next.getValue().isEmpty()) {
                    Iterator<d> it2 = next.getValue().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        d next2 = it2.next();
                        if (next2 == null || next2.b != aVar) {
                            i = 1;
                        } else {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = d.a;
                            if (PatchProxy.isSupport(objArr2, next2, changeQuickRedirect2, false, "35c1ac94c955ab450a3d7b6b6d475617", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, next2, changeQuickRedirect2, false, "35c1ac94c955ab450a3d7b6b6d475617");
                            } else if (next2.b != null) {
                                com.meituan.android.neohybrid.core.a aVar2 = next2.b;
                                String str = next2.c;
                                Object[] objArr3 = new Object[i];
                                objArr3[0] = str;
                                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.core.a.a;
                                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "fcbd397310c881e215c9a3695ddedfc7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "fcbd397310c881e215c9a3695ddedfc7");
                                } else {
                                    for (c.b bVar : aVar2.i) {
                                        bVar.e(str);
                                    }
                                }
                                next2.b = null;
                            }
                            it2.remove();
                        }
                    }
                    if (next.getValue().isEmpty()) {
                        it.remove();
                    }
                    i = 1;
                }
            }
        }
    }

    public static com.meituan.android.neohybrid.core.a a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3400a2f1fe17f0e1be0f502edc1c1a89", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3400a2f1fe17f0e1be0f502edc1c1a89");
        }
        List<d> list = b.get(str);
        com.meituan.android.neohybrid.core.a a2 = a(list, z);
        if (a2 == null || list == null) {
            return null;
        }
        list.clear();
        a2.d(str);
        return a2;
    }

    private static com.meituan.android.neohybrid.core.a a(List<d> list, boolean z) {
        com.meituan.android.neohybrid.core.a a2;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4174ce6324f332c38574d75ca98f4b11", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4174ce6324f332c38574d75ca98f4b11");
        }
        if (i.a((Collection) list)) {
            return null;
        }
        ListIterator<d> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            d previous = listIterator.previous();
            if (previous != null && (a2 = previous.a(z)) != null) {
                return a2;
            }
        }
        return null;
    }

    @NonNull
    public static List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9db8313b180ee2e392f04c37bf712e13", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9db8313b180ee2e392f04c37bf712e13");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<d>> entry : b.entrySet()) {
            if (entry != null) {
                List<d> value = entry.getValue();
                if (!TextUtils.isEmpty(entry.getKey()) && !i.a((Collection) value) && a(value, false) != null) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        return arrayList;
    }

    public static com.meituan.android.neohybrid.core.a a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f7fbf387eb92da474781732f7642b11", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f7fbf387eb92da474781732f7642b11");
        }
        if (aVar == null) {
            return null;
        }
        String str = aVar.a;
        if (aVar.b) {
            str = n.a(str);
        }
        return a(str, aVar.c);
    }
}
