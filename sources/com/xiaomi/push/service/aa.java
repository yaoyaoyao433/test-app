package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.hh;
import com.xiaomi.push.hi;
import com.xiaomi.push.hk;
import com.xiaomi.push.hm;
import com.xiaomi.push.hz;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class aa {
    public static int a(z zVar, hh hhVar) {
        int i = 0;
        switch (hhVar) {
            case MISC_CONFIG:
                i = 1;
                break;
        }
        return zVar.a(hhVar, i);
    }

    public static void a(z zVar, hz hzVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (hk hkVar : hzVar.a) {
            arrayList.add(new Pair<>(hkVar.c, Integer.valueOf(hkVar.a)));
            List<Pair<Integer, Object>> a = a(hkVar.b, false);
            if (!com.xiaomi.push.g.a(a)) {
                arrayList2.addAll(a);
            }
        }
        zVar.a(arrayList, arrayList2);
        zVar.b();
    }

    public static List<Pair<Integer, Object>> a(List<hm> list, boolean z) {
        Pair pair;
        if (com.xiaomi.push.g.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (hm hmVar : list) {
            int i = hmVar.a;
            hi a = hi.a(hmVar.b);
            if (a != null) {
                if (z && hmVar.c) {
                    arrayList.add(new Pair(Integer.valueOf(i), null));
                } else {
                    switch (a) {
                        case INT:
                            pair = new Pair(Integer.valueOf(i), Integer.valueOf(hmVar.d));
                            break;
                        case LONG:
                            pair = new Pair(Integer.valueOf(i), Long.valueOf(hmVar.e));
                            break;
                        case STRING:
                            pair = new Pair(Integer.valueOf(i), hmVar.f);
                            break;
                        case BOOLEAN:
                            pair = new Pair(Integer.valueOf(i), Boolean.valueOf(hmVar.g));
                            break;
                        default:
                            pair = null;
                            break;
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }
}
