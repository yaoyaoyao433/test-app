package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ix extends iw {
    private ArrayList<iw> a;

    private ix(ArrayList<iw> arrayList) {
        this.a = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final boolean a(iz izVar) {
        if (this.a.isEmpty()) {
            return true;
        }
        Iterator<iw> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(izVar);
        }
        return true;
    }
}
