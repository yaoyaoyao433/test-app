package com.meituan.mmp.lib.mp.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.android.meituan.multiprocess.transfer.j;
import com.meituan.mmp.lib.mp.ipc.d;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class IPCInvoke {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    public static boolean c = false;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface a {
        void a(Class<?> cls, Object[] objArr, d.a aVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.mp.ipc.IPCInvoke$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends com.meituan.mmp.lib.mp.ipc.a {
        public static ChangeQuickRedirect b;
        public e c;
        public final /* synthetic */ com.meituan.mmp.lib.mp.a d;
        public final /* synthetic */ Class e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Class cls, com.meituan.mmp.lib.mp.a aVar, Class cls2) {
            super(cls);
            this.d = aVar;
            this.e = cls2;
        }

        @Override // com.meituan.mmp.lib.mp.ipc.a, java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "7bfbe3c5520c5a2182cc4269669b9a29", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "7bfbe3c5520c5a2182cc4269669b9a29");
            }
            if (a(method)) {
                return super.invoke(obj, method, objArr);
            }
            if (method.equals(IPCInvokeControl.GET_TARGET_PROCESS_METHOD)) {
                return this.d;
            }
            if (method.equals(IPCInvokeControl.SET_IPC_EXCEPTION_LISTENER)) {
                this.c = (e) objArr[0];
                return null;
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            ab.a("IPCInvoke internal process: " + method.getName(), IPCInvoke.c);
            if (IPCInvoke.b) {
                com.meituan.mmp.lib.trace.b.a("IPCInvoke", "ipc invoke send: " + this.e.getSimpleName() + CommonConstant.Symbol.DOT + method.getName());
            }
            g.a();
            IPCMethodCall iPCMethodCall = new IPCMethodCall();
            iPCMethodCall.c = this.e;
            iPCMethodCall.d = method;
            iPCMethodCall.e = Arrays.copyOf(objArr, objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                if (j.a(objArr[i]) == null) {
                    RemoteCallbackProxyData remoteCallbackProxyData = new RemoteCallbackProxyData();
                    remoteCallbackProxyData.b = objArr[i].getClass();
                    remoteCallbackProxyData.c = i;
                    iPCMethodCall.e[i] = remoteCallbackProxyData;
                }
            }
            final i iVar = method.getReturnType() != Void.TYPE ? new i() : null;
            ab.a(IPCInvoke.c);
            ab.a("IPCManager invoking: " + method.getName(), IPCInvoke.c);
            com.android.meituan.multiprocess.e.a("mmp_" + this.d.a(), iPCMethodCall, b.class, new com.android.meituan.multiprocess.invoker.b<IPCMethodCall>() { // from class: com.meituan.mmp.lib.mp.ipc.IPCInvoke.1.1
                public static ChangeQuickRedirect a;
                private boolean f;

                @Override // com.android.meituan.multiprocess.invoker.b
                public final /* synthetic */ void a(IPCMethodCall iPCMethodCall2) throws com.android.meituan.multiprocess.exception.a {
                    IPCMethodCall iPCMethodCall3 = iPCMethodCall2;
                    Object[] objArr3 = {iPCMethodCall3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "03cf3cf4b637a6fb7ae21a26f97d86e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "03cf3cf4b637a6fb7ae21a26f97d86e6");
                        return;
                    }
                    if (!this.f) {
                        g.b();
                        this.f = true;
                    }
                    if (iPCMethodCall3.b == -2) {
                        if (IPCInvoke.b) {
                            com.meituan.mmp.lib.trace.b.a("IPCInvoke", "ipc invoke return result: " + AnonymousClass1.this.e.getSimpleName() + CommonConstant.Symbol.DOT + method.getName());
                        }
                        if (iVar != null) {
                            iVar.set(iPCMethodCall3.e[0]);
                        }
                    } else if (iPCMethodCall3.b == -3) {
                        f fVar = new f(AnonymousClass1.this.d, AnonymousClass1.this.e, method, "remote exception", (Exception) iPCMethodCall3.e[0]);
                        if (iVar != null) {
                            iVar.setException(fVar);
                        }
                        if (AnonymousClass1.this.c != null) {
                            AnonymousClass1.this.c.a(fVar);
                        }
                    } else {
                        if (IPCInvoke.b) {
                            com.meituan.mmp.lib.trace.b.a("IPCInvoke", "ipc invoke callback: " + objArr[iPCMethodCall3.b].getClass().getName() + CommonConstant.Symbol.DOT + iPCMethodCall3.d.getName());
                        }
                        try {
                            iPCMethodCall3.d.invoke(objArr[iPCMethodCall3.b], iPCMethodCall3.e);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            com.meituan.mmp.lib.trace.b.a("IPCInvoke", e);
                        }
                    }
                }
            });
            ab.a(IPCInvoke.c);
            if (iVar == null) {
                return null;
            }
            try {
                ab.a("ipc sync invoke, waiting result: " + this.e.getSimpleName() + CommonConstant.Symbol.DOT + method.getName());
                return iVar.get();
            } finally {
                ab.a();
            }
        }
    }

    @OnLocalProcess
    public static <T> T a(@NonNull Class<?> cls, @NonNull com.meituan.mmp.lib.mp.a aVar) {
        Object[] objArr = {cls, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f2fc8156c047e3e0caf3d25ea41ba29", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f2fc8156c047e3e0caf3d25ea41ba29") : (T) Proxy.newProxyInstance(cls.getClassLoader(), a(cls), new AnonymousClass1(cls, aVar, cls));
    }

    /* compiled from: ProGuard */
    @OnRemoteProcess
    /* loaded from: classes3.dex */
    static class b implements com.android.meituan.multiprocess.invoker.a<IPCMethodCall, IPCMethodCall> {
        public static ChangeQuickRedirect a;

        @Override // com.android.meituan.multiprocess.invoker.a
        public final /* synthetic */ void a(IPCMethodCall iPCMethodCall, com.android.meituan.multiprocess.invoker.b<IPCMethodCall> bVar) {
            IPCMethodCall iPCMethodCall2 = iPCMethodCall;
            Object[] objArr = {iPCMethodCall2, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081faccd65a89e03cbb0cfbfd99494dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081faccd65a89e03cbb0cfbfd99494dd");
                return;
            }
            if (IPCInvoke.b) {
                com.meituan.mmp.lib.trace.b.a("IPCInvoke", "ipc invoke received: " + iPCMethodCall2.c.getSimpleName() + CommonConstant.Symbol.DOT + iPCMethodCall2.d.getName());
            }
            MMPEnvHelper.ensureFullInited();
            Object[] copyOf = Arrays.copyOf(iPCMethodCall2.e, iPCMethodCall2.e.length);
            for (int i = 0; i < copyOf.length; i++) {
                if (copyOf[i] instanceof RemoteCallbackProxyData) {
                    copyOf[i] = IPCInvoke.a(bVar, (RemoteCallbackProxyData) copyOf[i]);
                }
            }
            try {
                Constructor<?> declaredConstructor = iPCMethodCall2.c.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                Object invoke = iPCMethodCall2.d.invoke(declaredConstructor.newInstance(new Object[0]), copyOf);
                IPCMethodCall iPCMethodCall3 = new IPCMethodCall();
                iPCMethodCall3.b = -2;
                iPCMethodCall3.e = new Object[]{invoke};
                bVar.a(iPCMethodCall3);
            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                    com.meituan.mmp.lib.trace.b.d("IPCInvoke", "check invoke arguments, must use a interface as callback");
                }
                com.meituan.mmp.lib.trace.b.a("IPCInvoke", e, "exception in ipc invoke");
                g.b(e.toString(), null);
                f fVar = new f(com.meituan.mmp.lib.mp.a.e(), iPCMethodCall2.c, iPCMethodCall2.d, e.toString(), e.getStackTrace());
                IPCMethodCall iPCMethodCall4 = new IPCMethodCall();
                iPCMethodCall4.b = -3;
                iPCMethodCall4.e = new Object[]{fVar};
                try {
                    bVar.a(iPCMethodCall4);
                } catch (Exception e2) {
                    com.meituan.mmp.lib.trace.b.a("IPCInvoke", e2, "exception when send remote exception, caused by " + e.toString());
                }
            }
        }
    }

    @OnRemoteProcess
    public static <T> T a(final com.android.meituan.multiprocess.invoker.b<IPCMethodCall> bVar, final RemoteCallbackProxyData remoteCallbackProxyData) {
        Object[] objArr = {bVar, remoteCallbackProxyData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42663fadf14e16fa052757ca367b8f1f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42663fadf14e16fa052757ca367b8f1f") : (T) Proxy.newProxyInstance(bVar.getClass().getClassLoader(), a(remoteCallbackProxyData.b), new com.meituan.mmp.lib.mp.ipc.a(remoteCallbackProxyData.b) { // from class: com.meituan.mmp.lib.mp.ipc.IPCInvoke.2
            public static ChangeQuickRedirect b;

            @Override // com.meituan.mmp.lib.mp.ipc.a, java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr2) throws Throwable {
                Object[] objArr3 = {obj, method, objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "ede3214d93183ad4aa1ff9066ea693cd", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "ede3214d93183ad4aa1ff9066ea693cd");
                }
                if (a(method)) {
                    return super.invoke(obj, method, objArr2);
                }
                if (objArr2 == null) {
                    objArr2 = new Object[0];
                }
                IPCMethodCall iPCMethodCall = new IPCMethodCall();
                iPCMethodCall.c = Object.class;
                iPCMethodCall.d = method;
                iPCMethodCall.e = objArr2;
                iPCMethodCall.b = remoteCallbackProxyData.c;
                bVar.a(iPCMethodCall);
                return null;
            }
        });
    }

    private static Class<?>[] a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df323ded0be8d4341f733a5d04a31948", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df323ded0be8d4341f733a5d04a31948");
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }
        arrayList.add(IPCInvokeControl.class);
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class IPCMethodCall implements Parcelable {
        public static final Parcelable.Creator<IPCMethodCall> CREATOR = new Parcelable.Creator<IPCMethodCall>() { // from class: com.meituan.mmp.lib.mp.ipc.IPCInvoke.IPCMethodCall.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ IPCMethodCall createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f747cf21dcd5a26ae3533e769e7149", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IPCMethodCall) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f747cf21dcd5a26ae3533e769e7149");
                }
                MMPEnvHelper.ensureFullInited();
                return new IPCMethodCall(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ IPCMethodCall[] newArray(int i) {
                return new IPCMethodCall[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;
        public Class<?> c;
        public Method d;
        public Object[] e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public IPCMethodCall() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda13ff72708bd7e7b1715b27f81705b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda13ff72708bd7e7b1715b27f81705b");
            } else {
                this.b = -1;
            }
        }

        public IPCMethodCall(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f386c41c1ba489d16fbc9f3dc5bb1ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f386c41c1ba489d16fbc9f3dc5bb1ff");
                return;
            }
            this.b = -1;
            this.c = (Class) IPCInvoke.a(parcel);
            this.d = (Method) IPCInvoke.a(parcel);
            this.e = (Object[]) IPCInvoke.a(parcel);
            this.b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b6da20625c331836d32ff3df1905ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b6da20625c331836d32ff3df1905ba");
                return;
            }
            try {
                IPCInvoke.a(this.c, parcel);
                IPCInvoke.a(this.d, parcel);
                IPCInvoke.a(this.e, parcel);
                parcel.writeInt(this.b);
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a(e);
                g.b(e.toString(), null);
                throw e;
            }
        }
    }

    public static void a(Object obj, Parcel parcel) {
        Object[] objArr = {obj, parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b950b619048b0023d7d3429c2d0876d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b950b619048b0023d7d3429c2d0876d");
            return;
        }
        com.android.meituan.multiprocess.transfer.e a2 = j.a(obj);
        if (a2 != null) {
            parcel.writeString(a2.getClass().getName());
            a2.a(obj, parcel);
            return;
        }
        throw new IllegalArgumentException("TypeTransfer not found for " + obj.getClass().getName());
    }

    public static <T> T a(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5cb57e34c32a86c941c1798003783b8", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5cb57e34c32a86c941c1798003783b8") : (T) j.a(parcel.readString(), parcel);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class RemoteCallbackProxyData implements Parcelable {
        public static final Parcelable.Creator<RemoteCallbackProxyData> CREATOR = new Parcelable.Creator<RemoteCallbackProxyData>() { // from class: com.meituan.mmp.lib.mp.ipc.IPCInvoke.RemoteCallbackProxyData.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RemoteCallbackProxyData createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d008a82c025448a505700cf62cecfea2", RobustBitConfig.DEFAULT_VALUE) ? (RemoteCallbackProxyData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d008a82c025448a505700cf62cecfea2") : new RemoteCallbackProxyData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RemoteCallbackProxyData[] newArray(int i) {
                return new RemoteCallbackProxyData[i];
            }
        };
        public static ChangeQuickRedirect a;
        public Class<?> b;
        public int c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RemoteCallbackProxyData() {
        }

        public RemoteCallbackProxyData(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47d365abd57bf80c162547e3e09e2a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47d365abd57bf80c162547e3e09e2a5");
                return;
            }
            try {
                this.b = Class.forName(parcel.readString());
                this.c = parcel.readInt();
            } catch (ClassNotFoundException e) {
                com.meituan.mmp.lib.trace.b.a(e);
                g.b(e.toString(), null);
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32b6c6406749ac111cc185ca93d76be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32b6c6406749ac111cc185ca93d76be");
                return;
            }
            parcel.writeString(this.b.getName());
            parcel.writeInt(this.c);
        }
    }

    public static RuntimeException a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f23197fb9412bcd2866a5d0fac6fac7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (RuntimeException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f23197fb9412bcd2866a5d0fac6fac7b");
        }
        RuntimeException runtimeException = new RuntimeException(th.toString());
        runtimeException.setStackTrace(th.getStackTrace());
        return runtimeException;
    }
}
