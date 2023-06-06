package com.meituan.mmp.lib.mp.ipc;

import android.support.annotation.Keep;
import com.meituan.mmp.lib.mp.b;
import com.meituan.mmp.lib.utils.ar;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface IPCInvokeControl {
    public static final Method REGISTER_PROCESS_DIE_LISTENER_METHOD = ar.a(IPCInvokeControl.class, "registerProcessDieListener", b.a.class);
    public static final Method GET_TARGET_PROCESS_METHOD = ar.a(IPCInvokeControl.class, "getTargetProcess", new Class[0]);
    public static final Method SET_IPC_EXCEPTION_LISTENER = ar.a(IPCInvokeControl.class, "setIPCExceptionListener", e.class);

    com.meituan.mmp.lib.mp.a getTargetProcess();

    void registerProcessDieListener(b.a aVar);

    void setIPCExceptionListener(e eVar);
}
