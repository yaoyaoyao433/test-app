package com.vivo.push.d;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class aa extends z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.t tVar = (com.vivo.push.b.t) oVar;
        ArrayList<String> d = tVar.d();
        List<String> e = tVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int h = tVar.h();
        String g = tVar.g();
        if (d != null) {
            for (String str : d) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (e != null) {
            for (String str2 : e) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                com.vivo.push.e.a().a(arrayList);
            }
            com.vivo.push.e.a().a(tVar.g(), arrayList3.size() > 0 ? 10000 : h);
            com.vivo.push.m.b(new ab(this, h, arrayList, arrayList3, g));
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                com.vivo.push.e.a().b((String) arrayList2.get(0));
            }
            com.vivo.push.e.a().a(tVar.g(), h);
            com.vivo.push.m.b(new ac(this, h, arrayList2, arrayList4, g));
        }
    }
}
