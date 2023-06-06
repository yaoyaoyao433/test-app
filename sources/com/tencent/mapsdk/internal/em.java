package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface em extends ff {
    Rect a();

    void a(b bVar);

    boolean a(ViewGroup viewGroup, Bundle bundle);

    void c();

    b d();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        LEFT_BOTTOM(0),
        CENTER_BOTTOM(4),
        RIGHT_BOTTOM(1),
        LEFT_TOP(3),
        CENTER_TOP(5),
        RIGHT_TOP(2);
        
        public final int g;

        b(int i) {
            this.g = i;
        }

        public static b a(int i) {
            b[] values;
            i = (i < 0 || i >= values().length) ? 0 : 0;
            b bVar = LEFT_BOTTOM;
            for (b bVar2 : values()) {
                if (bVar2.g == i) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        LEFT(0),
        RIGHT(1),
        BOTTOM(2),
        TOP(3);
        
        public int e;

        a(int i) {
            this.e = i;
        }

        public static final a a(int i) {
            return values()[(i < 0 || i >= values().length) ? 0 : 0];
        }
    }
}
