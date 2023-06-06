package com.meituan.msc.modules.preload.executor;

import android.support.annotation.NonNull;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c implements Comparable<c> {
    public static ChangeQuickRedirect c;
    private int a;
    final String d;
    f e;
    long f;

    public abstract void a(d dVar);

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3fe5e50070f7329bf9f8882b719827", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3fe5e50070f7329bf9f8882b719827")).intValue();
        }
        int i = cVar2.a - this.a;
        return i != 0 ? i : (int) (this.f - cVar2.f);
    }

    public c(@NonNull String str) {
        this(str, 0);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8460f23c66c4d3136fc174f44fd5cd2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8460f23c66c4d3136fc174f44fd5cd2b");
        }
    }

    private c(@NonNull String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dddecc895eb8db8d0b7e7fe55c81007", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dddecc895eb8db8d0b7e7fe55c81007");
            return;
        }
        this.d = str;
        this.a = 0;
    }

    public void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6c19f1dc214f6d86fada0268e8bac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6c19f1dc214f6d86fada0268e8bac9");
            return;
        }
        if (!(exc instanceof RuntimeException)) {
            exc = new RuntimeException(exc);
        }
        g.b(DiagnoseLog.ROW_TASK, exc, "Task throwException");
        throw ((RuntimeException) exc);
    }

    public String toString() {
        return this.d;
    }
}
