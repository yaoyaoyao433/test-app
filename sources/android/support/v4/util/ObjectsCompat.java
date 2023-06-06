package android.support.v4.util;

import android.os.Build;
import android.support.annotation.RequiresApi;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ObjectsCompat {
    private static final ImplBase IMPL;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new ImplApi19();
        } else {
            IMPL = new ImplBase();
        }
    }

    private ObjectsCompat() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return IMPL.equals(obj, obj2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ImplBase {
        private ImplBase() {
        }

        public boolean equals(Object obj, Object obj2) {
            if (obj != obj2) {
                return obj != null && obj.equals(obj2);
            }
            return true;
        }
    }

    /* compiled from: ProGuard */
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class ImplApi19 extends ImplBase {
        private ImplApi19() {
            super();
        }

        @Override // android.support.v4.util.ObjectsCompat.ImplBase
        public boolean equals(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }
}
