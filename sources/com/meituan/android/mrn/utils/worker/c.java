package com.meituan.android.mrn.utils.worker;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c implements Comparable<c> {
    public static ChangeQuickRedirect b;
    private int a;
    final String c;
    d d;
    long e;

    public abstract void a();

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfb7be3ad5f270a8a1fc867deec4cdb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfb7be3ad5f270a8a1fc867deec4cdb")).intValue();
        }
        int i = cVar2.a - this.a;
        return i != 0 ? i : (int) (this.e - cVar2.e);
    }

    public c(@NonNull String str) {
        this(str, 0);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5446e83a6996edbf7dff0a4bfb596fe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5446e83a6996edbf7dff0a4bfb596fe3");
        }
    }

    private c(@NonNull String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2372046d9f9f0d71bf656564231dde0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2372046d9f9f0d71bf656564231dde0c");
            return;
        }
        this.c = str;
        this.a = 0;
    }

    public String toString() {
        return this.c;
    }
}
