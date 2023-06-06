package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bf {
    private final be d;
    final CopyOnWriteArrayList<er> a = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<er> c = new CopyOnWriteArrayList<>();
    final CopyOnWriteArrayList<er> b = new CopyOnWriteArrayList<>();

    public bf(be beVar) {
        this.d = beVar;
    }

    private void a(er erVar) {
        synchronized (this.a) {
            if (this.a.contains(erVar)) {
                return;
            }
            this.a.add(erVar);
        }
    }

    private void b(er erVar) {
        if (erVar == null) {
            return;
        }
        synchronized (this.a) {
            this.a.remove(erVar);
            this.b.add(erVar);
        }
    }

    private void a() {
        int f;
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList();
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                er erVar = this.b.get(i);
                if ((erVar instanceof qa) && (f = ((qa) erVar).f()) >= 0) {
                    arrayList.add(Integer.valueOf(f));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            this.d.f().a(iArr, size2);
            this.b.clear();
        }
    }

    public final boolean a(float f, float f2) {
        synchronized (this.a) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                er erVar = this.a.get(size);
                if (erVar != null && erVar.onTap(f, f2)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Deprecated
    public final boolean a(GL10 gl10) {
        int f;
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList();
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                er erVar = this.b.get(i);
                if ((erVar instanceof qa) && (f = ((qa) erVar).f()) >= 0) {
                    arrayList.add(Integer.valueOf(f));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            this.d.f().a(iArr, size2);
            this.b.clear();
        }
        this.c.clear();
        synchronized (this.a) {
            this.c.addAll(this.a);
        }
        Iterator<er> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(gl10);
        }
        return true;
    }
}
