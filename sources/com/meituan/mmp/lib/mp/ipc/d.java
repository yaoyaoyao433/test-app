package com.meituan.mmp.lib.mp.ipc;

import android.support.annotation.NonNull;
import com.android.meituan.multiprocess.transfer.j;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d<Params, Result> implements IPCInvoke.a {
    public static ChangeQuickRedirect d;
    boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(IPCInvoke.IPCMethodCall iPCMethodCall);

        void a(Exception exc);

        void a(Object obj);
    }

    public abstract Result a(Params... paramsArr) throws Exception;

    public void a(Exception exc) {
    }

    public d<Params, Result> a(@NonNull com.meituan.mmp.lib.mp.a aVar, final Params... paramsArr) {
        Object[] objArr = {aVar, paramsArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7eabda59ed3e2d4d1256783b45e37c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7eabda59ed3e2d4d1256783b45e37c");
        }
        Class<?> componentType = paramsArr.getClass().getComponentType();
        Object[] objArr2 = (Object[]) Array.newInstance(Object.class, paramsArr.length);
        System.arraycopy(paramsArr, 0, objArr2, 0, paramsArr.length);
        for (int i = 0; i < paramsArr.length; i++) {
            if (j.a(paramsArr[i]) == null) {
                IPCInvoke.RemoteCallbackProxyData remoteCallbackProxyData = new IPCInvoke.RemoteCallbackProxyData();
                remoteCallbackProxyData.b = paramsArr[i].getClass();
                remoteCallbackProxyData.c = i;
                objArr2[i] = remoteCallbackProxyData;
            }
        }
        IPCInvoke.a aVar2 = (IPCInvoke.a) IPCInvoke.a(getClass(), aVar);
        ((IPCInvokeControl) aVar2).setIPCExceptionListener(new e() { // from class: com.meituan.mmp.lib.mp.ipc.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.mp.ipc.e
            public final void a(f fVar) {
                Object[] objArr3 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "c275a5efbc9dc53f9fa789429d615d3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "c275a5efbc9dc53f9fa789429d615d3a");
                } else if (d.this.e) {
                } else {
                    d.this.e = true;
                    d.this.a(fVar);
                }
            }
        });
        aVar2.a(componentType, objArr2, new a() { // from class: com.meituan.mmp.lib.mp.ipc.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.mp.ipc.d.a
            public final void a(Object obj) {
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "01b917bc35334c123783d923c15bba22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "01b917bc35334c123783d923c15bba22");
                } else {
                    d.this.e = true;
                }
            }

            @Override // com.meituan.mmp.lib.mp.ipc.d.a
            public final void a(IPCInvoke.IPCMethodCall iPCMethodCall) {
                Object[] objArr3 = {iPCMethodCall};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "3e86153ff8020865e87e165a12a5ad79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "3e86153ff8020865e87e165a12a5ad79");
                    return;
                }
                d.this.e = true;
                try {
                    iPCMethodCall.d.invoke(paramsArr[iPCMethodCall.b], iPCMethodCall.e);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    com.meituan.mmp.lib.trace.b.a(e);
                }
            }

            @Override // com.meituan.mmp.lib.mp.ipc.d.a
            public final void a(Exception exc) {
                Object[] objArr3 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "ffbc54b41c7080c079812b84da7de88c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "ffbc54b41c7080c079812b84da7de88c");
                    return;
                }
                d.this.e = true;
                d.this.a(exc);
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.mmp.lib.mp.ipc.IPCInvoke.a
    public final void a(Class<?> cls, Object[] objArr, final a aVar) {
        Object[] objArr2 = {cls, objArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "611d8979b45579877f630645a743983f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "611d8979b45579877f630645a743983f");
            return;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(cls, objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof IPCInvoke.RemoteCallbackProxyData) {
                objArr3[i] = IPCInvoke.a(new com.android.meituan.multiprocess.invoker.b<IPCInvoke.IPCMethodCall>() { // from class: com.meituan.mmp.lib.mp.ipc.d.3
                    public static ChangeQuickRedirect a;

                    @Override // com.android.meituan.multiprocess.invoker.b
                    public final /* synthetic */ void a(IPCInvoke.IPCMethodCall iPCMethodCall) throws com.android.meituan.multiprocess.exception.a {
                        IPCInvoke.IPCMethodCall iPCMethodCall2 = iPCMethodCall;
                        Object[] objArr4 = {iPCMethodCall2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "a11ddbee17adec57f893c6e71d155789", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "a11ddbee17adec57f893c6e71d155789");
                        } else {
                            aVar.a(iPCMethodCall2);
                        }
                    }
                }, (IPCInvoke.RemoteCallbackProxyData) objArr[i]);
            } else {
                objArr3[i] = objArr[i];
            }
        }
        try {
            aVar.a(a(objArr3));
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("IPCAsyncTask", e, "exception on remote");
            aVar.a(e);
        }
    }
}
