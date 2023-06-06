package com.meituan.msc.common.process.ipc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends RuntimeException {
    public static ChangeQuickRedirect a;
    public final com.meituan.msc.common.process.a b;
    public final Class<?> c;
    public final String d;

    public e(com.meituan.msc.common.process.a aVar, Class<?> cls, Method method, String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        Object[] objArr = {aVar, cls, method, str, stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4deb4c1db0a487032b4c2708a148747e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4deb4c1db0a487032b4c2708a148747e");
            return;
        }
        this.b = aVar;
        this.c = cls;
        this.d = method.getName();
        setStackTrace(stackTraceElementArr);
    }

    public e(com.meituan.msc.common.process.a aVar, Class<?> cls, Method method, String str, Throwable th) {
        super(str, th);
        Object[] objArr = {aVar, cls, method, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4442504212db85037b2366aeb6f7a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4442504212db85037b2366aeb6f7a3");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2a07b88a9ff931c0c9aa6e89a61b3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2a07b88a9ff931c0c9aa6e89a61b3f");
        }
        return "IPCRemoteException{remoteProcess=" + this.b + ", targetClass=" + this.c + ", method=" + this.d + ", message=" + getMessage() + '}';
    }
}
