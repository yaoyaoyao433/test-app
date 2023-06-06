package com.facebook.react.uimanager;

import com.meituan.robust.common.CommonConstant;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ay {
    public static Comparator<ay> a = new Comparator<ay>() { // from class: com.facebook.react.uimanager.ay.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(ay ayVar, ay ayVar2) {
            return ayVar.c - ayVar2.c;
        }
    };
    public final int b;
    public final int c;

    public ay(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ay ayVar = (ay) obj;
        return this.c == ayVar.c && this.b == ayVar.b;
    }

    public String toString() {
        return "[" + this.b + ", " + this.c + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
