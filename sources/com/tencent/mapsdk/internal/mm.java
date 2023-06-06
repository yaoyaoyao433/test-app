package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mm {
    public be a;
    public sh b;
    public HashMap<Integer, om> c = new HashMap<>();
    public HashMap<Integer, om> d = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public mm(be beVar, sh shVar) {
        this.a = beVar;
        this.b = shVar;
    }

    private void a(om omVar) {
        if (omVar.f <= 0 || !this.c.containsKey(Integer.valueOf(omVar.f))) {
            sh shVar = this.b;
            omVar.f = ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass122>) new sh.AnonymousClass122(omVar), (sh.AnonymousClass122) 0)).intValue();
            if (omVar.f > 0) {
                gx.b.a(omVar.g, omVar.d());
                omVar.a(false);
                omVar.o = false;
                this.d.put(Integer.valueOf(omVar.f), omVar);
                return;
            }
            return;
        }
        if (omVar.o) {
            sh shVar2 = this.b;
            if (0 != shVar2.e) {
                shVar2.a(new sh.AnonymousClass123(omVar));
            }
            if (omVar.y) {
                gx.b.a(omVar.g, omVar.d());
                omVar.a(false);
            }
        }
        omVar.o = false;
        this.d.put(Integer.valueOf(omVar.f), omVar);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, om> entry : this.c.entrySet()) {
            Integer key = entry.getKey();
            entry.getValue();
            if (!this.d.containsKey(key)) {
                arrayList.add(Integer.valueOf(key.intValue()));
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        this.b.a(iArr, size);
    }

    private void c() {
        this.c.clear();
        this.c.putAll(this.d);
        this.d.clear();
    }

    private static Bitmap a(String str) {
        return gx.b.a(str);
    }

    private be d() {
        return this.a;
    }

    private float e() {
        return this.a.a().A.b.p;
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, om> entry : this.c.entrySet()) {
            Integer key = entry.getKey();
            entry.getValue();
            if (!this.d.containsKey(key)) {
                arrayList.add(Integer.valueOf(key.intValue()));
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            this.b.a(iArr, size);
        }
        this.c.clear();
        this.c.putAll(this.d);
        this.d.clear();
    }
}
