package com.airbnb.lottie;

import android.support.v4.util.ArraySet;
import android.support.v4.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    boolean a = false;
    private final Set<Object> b = new ArraySet();
    private final Map<String, com.airbnb.lottie.utils.d> c = new HashMap();
    private final Comparator<Pair<String, Float>> d = new Comparator<Pair<String, Float>>() { // from class: com.airbnb.lottie.m.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    public final void a(String str, float f) {
        if (this.a) {
            com.airbnb.lottie.utils.d dVar = this.c.get(str);
            if (dVar == null) {
                dVar = new com.airbnb.lottie.utils.d();
                this.c.put(str, dVar);
            }
            dVar.a += f;
            dVar.b++;
            if (dVar.b == Integer.MAX_VALUE) {
                dVar.a /= 2.0f;
                dVar.b /= 2;
            }
            if (str.equals("__container")) {
                Iterator<Object> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
