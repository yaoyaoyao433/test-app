package com.meituan.msc.common.process.ipc;

import android.support.annotation.Keep;
import com.meituan.msc.common.process.b;
import com.meituan.msc.common.utils.ao;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface IPCInvokeControl {
    public static final Method REGISTER_PROCESS_DIE_LISTENER_METHOD = ao.a(IPCInvokeControl.class, "registerProcessDieListener", b.a.class);
    public static final Method GET_TARGET_PROCESS_METHOD = ao.a(IPCInvokeControl.class, "getTargetProcess", new Class[0]);
    public static final Method SET_IPC_EXCEPTION_LISTENER = ao.a(IPCInvokeControl.class, "setIPCExceptionListener", d.class);

    com.meituan.msc.common.process.a getTargetProcess();

    void registerProcessDieListener(b.a aVar);

    void setIPCExceptionListener(d dVar);
}
