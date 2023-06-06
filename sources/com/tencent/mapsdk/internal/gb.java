package com.tencent.mapsdk.internal;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gb {
    private ArrayList<ga> a = new ArrayList<>();

    private ga a(int i) {
        return this.a.get(i);
    }

    public final void a(ga gaVar) {
        this.a.add(gaVar);
    }

    private void a(gb gbVar) {
        this.a.addAll(gbVar.a);
    }

    private int b() {
        return this.a.size();
    }

    public final float[] a() {
        float[] fArr = new float[this.a.size() * 3];
        for (int i = 0; i < this.a.size(); i++) {
            int i2 = i * 3;
            fArr[i2 + 0] = this.a.get(i).a;
            fArr[i2 + 1] = this.a.get(i).b;
            fArr[i2 + 2] = this.a.get(i).c;
        }
        return fArr;
    }
}
