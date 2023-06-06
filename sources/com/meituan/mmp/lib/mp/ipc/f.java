package com.meituan.mmp.lib.mp.ipc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends RuntimeException {
    public static ChangeQuickRedirect a;
    public final com.meituan.mmp.lib.mp.a b;
    public final Class<?> c;
    public final String d;

    public f(com.meituan.mmp.lib.mp.a aVar, Class<?> cls, Method method, String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        Object[] objArr = {aVar, cls, method, str, stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14dcf091939d6f3a65ca8efa948197ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14dcf091939d6f3a65ca8efa948197ee");
            return;
        }
        this.b = aVar;
        this.c = cls;
        this.d = method.getName();
        setStackTrace(stackTraceElementArr);
    }

    public f(com.meituan.mmp.lib.mp.a aVar, Class<?> cls, Method method, String str, Throwable th) {
        super(str, th);
        Object[] objArr = {aVar, cls, method, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e481f5cb4e3ef2968d4aeb63ea18a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e481f5cb4e3ef2968d4aeb63ea18a0");
            return;
        }
        this.b = aVar;
        this.c = cls;
        this.d = method.getName();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6367b2727371450a7f4667c6b44bb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6367b2727371450a7f4667c6b44bb0");
        }
        return "IPCRemoteException{remoteProcess=" + this.b + ", targetClass=" + this.c + ", method=" + this.d + ", message=" + getMessage() + '}';
    }
}
