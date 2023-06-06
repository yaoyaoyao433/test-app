package com.meituan.android.upgrade;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c {
    void a(long j);

    void a(long j, long j2);

    void a(a aVar);

    void a(String str, long j);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends RuntimeException {
        public static ChangeQuickRedirect a = null;
        public static int b = 0;
        public static int c = 1;
        public static int d = 2;
        public static int e = 3;
        public static int f = 4;
        private int g;

        public a(String str, Throwable th, int i) {
            super(str, th);
            Object[] objArr = {str, th, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8caca7b713ab0c5cc2dfca644061026", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8caca7b713ab0c5cc2dfca644061026");
            } else {
                this.g = i;
            }
        }
    }
}
