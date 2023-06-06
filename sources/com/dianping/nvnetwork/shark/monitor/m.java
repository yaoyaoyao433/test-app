package com.dianping.nvnetwork.shark.monitor;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    public static ChangeQuickRedirect a;
    a b;
    i c;

    public m(@NonNull i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4fde8c1a02d966e2c799db6db2bb9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4fde8c1a02d966e2c799db6db2bb9c");
            return;
        }
        this.b = new a(8);
        this.c = iVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends LinkedList<Integer> {
        public static ChangeQuickRedirect a;
        final int b;
        volatile int c;
        volatile int d;
        volatile int e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean a(int i) {
            if (i == -172 || i == -153 || i == -151) {
                return true;
            }
            switch (i) {
                case -104:
                case -103:
                    return true;
                default:
                    return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean b(int i) {
            return i < 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean c(int i) {
            return i == -102;
        }

        public a(int i) {
            Object[] objArr = {8};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e07271c2f1c6bc4d7b201f5df759b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e07271c2f1c6bc4d7b201f5df759b8");
            } else {
                this.b = 8;
            }
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8307a423828ea64938ac50d072604c6f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8307a423828ea64938ac50d072604c6f");
                return;
            }
            super.clear();
            this.c = 0;
            this.d = 0;
            this.e = 0;
        }
    }
}
