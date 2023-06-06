package com.meituan.met.mercury.load.report;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements Comparable<a>, Runnable {
    public static ChangeQuickRedirect a;
    public int b;
    protected String c;
    protected String d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367aaf4ed71ada3d800c22bf38394342", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367aaf4ed71ada3d800c22bf38394342");
        } else {
            this.b = 5;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull a aVar) {
        return this.b - aVar.b;
    }
}
