package com.tencent.mapsdk.internal;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class iy extends iw {
    private ArrayList<iw> a;

    private iy(ArrayList<iw> arrayList) {
        this.a = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final boolean a(iz izVar) {
        if (this.a.isEmpty()) {
            return true;
        }
        iw iwVar = this.a.get(0);
        if (iwVar.a(izVar)) {
            this.a.remove(iwVar);
        }
        return this.a.isEmpty();
    }
}
