package com.meituan.msc.common.process.ipc;

import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c<Params, Result> implements IPCInvoke.a {
    public static ChangeQuickRedirect a;
    boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(IPCInvoke.IPCMethodCall iPCMethodCall);

        void a(Exception exc);

        void a(Object obj);
    }

    public abstract Result a(Params... paramsArr) throws Exception;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.common.process.ipc.IPCInvoke.a
    public final void a(Class<?> cls, Object[] objArr, final a aVar) {
        Object[] objArr2 = {cls, objArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "31b625deb5b339632230323ba41d526c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "31b625deb5b339632230323ba41d526c");
            return;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(cls, objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof IPCInvoke.RemoteCallbackProxyData) {
                objArr3[i] = IPCInvoke.a(new com.android.meituan.multiprocess.invoker.b<IPCInvoke.IPCMethodCall>() { // from class: com.meituan.msc.common.process.ipc.c.3
                    public static ChangeQuickRedirect a;

                    @Override // com.android.meituan.multiprocess.invoker.b
                    public final /* synthetic */ void a(IPCInvoke.IPCMethodCall iPCMethodCall) throws com.android.meituan.multiprocess.exception.a {
                        IPCInvoke.IPCMethodCall iPCMethodCall2 = iPCMethodCall;
                        Object[] objArr4 = {iPCMethodCall2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "2b9de4cca612b853d8382b136362e5fd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "2b9de4cca612b853d8382b136362e5fd");
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
            com.meituan.msc.modules.reporter.g.b("IPCAsyncTask", e, "exception on remote");
            aVar.a(e);
        }
    }
}
