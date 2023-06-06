package com.xiaomi.push;

import com.xiaomi.push.bm;
import com.xiaomi.push.m;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class bn extends m.a {
    final /* synthetic */ bm a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bn(bm bmVar) {
        this.a = bmVar;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "100957";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        bk bkVar;
        ArrayList arrayList5;
        ArrayList<bm.a> arrayList6;
        arrayList = this.a.f;
        synchronized (arrayList) {
            arrayList2 = this.a.f;
            if (arrayList2.size() > 0) {
                arrayList3 = this.a.f;
                if (arrayList3.size() > 1) {
                    bm bmVar = this.a;
                    arrayList6 = this.a.f;
                    bmVar.a(arrayList6);
                } else {
                    bm bmVar2 = this.a;
                    arrayList4 = this.a.f;
                    bm.a aVar = (bm.a) arrayList4.get(0);
                    if (aVar != null) {
                        if (bmVar2.b == null) {
                            throw new IllegalStateException("should exec init method first!");
                        }
                        String str = aVar.d;
                        synchronized (bmVar2.c) {
                            bkVar = bmVar2.c.get(str);
                            if (bkVar == null) {
                                bkVar = bmVar2.b.a(bmVar2.a, str);
                                bmVar2.c.put(str, bkVar);
                            }
                        }
                        if (!bmVar2.d.isShutdown()) {
                            aVar.a(bkVar, bmVar2.a);
                            bmVar2.a((Runnable) aVar);
                        }
                    }
                }
                arrayList5 = this.a.f;
                arrayList5.clear();
                System.gc();
            }
        }
    }
}
