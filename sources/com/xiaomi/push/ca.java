package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class ca extends bu {
    bu m;
    final /* synthetic */ bu n;
    final /* synthetic */ by o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(by byVar, String str, bu buVar) {
        super(str);
        this.o = byVar;
        this.n = buVar;
        this.m = this.n;
        this.c = this.c;
        if (this.n != null) {
            this.g = this.n.g;
        }
    }

    @Override // com.xiaomi.push.bu
    public final synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        if (this.m != null) {
            arrayList.addAll(this.m.a(true));
        }
        synchronized (by.b) {
            bu buVar = by.b.get(this.c);
            if (buVar != null) {
                Iterator<String> it = buVar.a(true).iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (arrayList.indexOf(next) == -1) {
                        arrayList.add(next);
                    }
                }
                arrayList.remove(this.c);
                arrayList.add(this.c);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.bu
    public final synchronized void a(String str, bt btVar) {
        if (this.m != null) {
            this.m.a(str, btVar);
        }
    }

    @Override // com.xiaomi.push.bu
    public final boolean a() {
        return false;
    }
}
