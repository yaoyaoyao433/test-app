package com.meituan.msc.common.process.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.android.meituan.multiprocess.transfer.j;
import com.meituan.msc.common.process.ipc.c;
import com.meituan.msc.extern.MSCEnvHelper;
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
    public interface a {
        void a(Class<?> cls, Object[] objArr, c.a aVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.common.process.ipc.IPCInvoke$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends com.meituan.msc.common.process.ipc.a {
        public static ChangeQuickRedirect b;
        public d c;
        public final /* synthetic */ com.meituan.msc.common.process.a d;
        public final /* synthetic */ Class e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Class cls, com.meituan.msc.common.process.a aVar, Class cls2) {
            super(cls);
            this.d = aVar;
            this.e = cls2;
        }

        @Override // com.meituan.msc.common.process.ipc.a, java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, final Method method, Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "3c33b6fafb03fcef3e8121780c5ce62d", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "3c33b6fafb03fcef3e8121780c5ce62d");
            }
            if (a(method)) {
                return super.invoke(obj, method, objArr);
            }
            if (method.equals(IPCInvokeControl.GET_TARGET_PROCESS_METHOD)) {
                return this.d;
            }
            if (method.equals(IPCInvokeControl.SET_IPC_EXCEPTION_LISTENER)) {
                this.c = (d) objArr[0];
                return null;
            }
            final Object[] objArr3 = objArr == null ? new Object[0] : objArr;
            if (IPCInvoke.b) {
                com.meituan.msc.modules.reporter.g.a("IPCInvoke", "ipc invoke send: ", this.e.getSimpleName(), CommonConstant.Symbol.DOT, method.getName());
            }
            f.a();
            IPCMethodCall iPCMethodCall = new IPCMethodCall();
            iPCMethodCall.c = this.e;
            iPCMethodCall.d = method;
            iPCMethodCall.e = Arrays.copyOf(objArr3, objArr3.length);
            for (int i = 0; i < objArr3.length; i++) {
                if (j.a(objArr3[i]) == null) {
                    RemoteCallbackProxyData remoteCallbackProxyData = new RemoteCallbackProxyData();
                    remoteCallbackProxyData.b = objArr3[i].getClass();
                    remoteCallbackProxyData.c = i;
                    iPCMethodCall.e[i] = remoteCallbackProxyData;
                }
            }
            final h hVar = method.getReturnType() != Void.TYPE ? new h() : null;
            com.android.meituan.multiprocess.e.a("msc_" + this.d.b(), iPCMethodCall, b.class, new com.android.meituan.multiprocess.invoker.b<IPCMethodCall>() { // from class: com.meituan.msc.common.process.ipc.IPCInvoke.1.1
                public static ChangeQuickRedirect a;
                private boolean f;

                @Override // com.android.meituan.multiprocess.invoker.b
                public final /* synthetic */ void a(IPCMethodCall iPCMethodCall2) throws com.android.meituan.multiprocess.exception.a {
                    IPCMethodCall iPCMethodCall3 = iPCMethodCall2;
                    Object[] objArr4 = {iPCMethodCall3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "f4496385f4e770d8d4681658de0529a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "f4496385f4e770d8d4681658de0529a5");
                        return;
                    }
                    if (!this.f) {
                        f.b();
                        this.f = true;
                    }
                    if (iPCMethodCall3.b == -2) {
                        if (IPCInvoke.b) {
                            com.meituan.msc.modules.reporter.g.a("IPCInvoke", "ipc invoke return result: " + AnonymousClass1.this.e.getSimpleName() + CommonConstant.Symbol.DOT + method.getName());
                        }
                        if (hVar != null) {
                            hVar.set(iPCMethodCall3.e[0]);
                        }
                    } else if (iPCMethodCall3.b == -3) {
                        e eVar = new e(AnonymousClass1.this.d, AnonymousClass1.this.e, method, "remote exception", (Exception) iPCMethodCall3.e[0]);
                        if (hVar != null) {
                            hVar.setException(eVar);
                        }
                        if (AnonymousClass1.this.c != null) {
                            AnonymousClass1.this.c.a(eVar);
                        }
                    } else {
                        if (IPCInvoke.b) {
                            com.meituan.msc.modules.reporter.g.a("IPCInvoke", "ipc invoke callback: " + objArr3[iPCMethodCall3.b].getClass().getName() + CommonConstant.Symbol.DOT + iPCMethodCall3.d.getName());
                        }
                        try {
                            iPCMethodCall3.d.invoke(objArr3[iPCMethodCall3.b], iPCMethodCall3.e);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            com.meituan.msc.modules.reporter.g.a("IPCInvoke", e);
                        }
                    }
                }
            });
            if (hVar == null) {
                return null;
            }
            return hVar.get();
        }
    }

    @OnLocalProcess
    public static <T> T a(@NonNull Class<?> cls, @NonNull com.meituan.msc.common.process.a aVar) {
        Object[] objArr = {cls, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5868a0a02ec7722b2a6f2d74eb259b38", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5868a0a02ec7722b2a6f2d74eb259b38") : (T) Proxy.newProxyInstance(cls.getClassLoader(), a(cls), new AnonymousClass1(cls, aVar, cls));
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58fd9fe0fca610787e311c284d3ca976", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58fd9fe0fca610787e311c284d3ca976");
                return;
            }
            if (IPCInvoke.b) {
                com.meituan.msc.modules.reporter.g.a("IPCInvoke", "ipc invoke received: ", iPCMethodCall2.c.getSimpleName(), CommonConstant.Symbol.DOT, iPCMethodCall2.d.getName());
            }
            MSCEnvHelper.ensureFullInited();
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
                    com.meituan.msc.modules.reporter.g.a("IPCInvoke", "check invoke arguments, must use a interface as callback");
                }
                com.meituan.msc.modules.reporter.g.b("IPCInvoke", e, "exception in ipc invoke");
                f.b(e.toString(), null);
                e eVar = new e(com.meituan.msc.common.process.a.e(), iPCMethodCall2.c, iPCMethodCall2.d, e.toString(), e.getStackTrace());
                IPCMethodCall iPCMethodCall4 = new IPCMethodCall();
                iPCMethodCall4.b = -3;
                iPCMethodCall4.e = new Object[]{eVar};
                try {
                    bVar.a(iPCMethodCall4);
                } catch (Exception e2) {
                    com.meituan.msc.modules.reporter.g.b("IPCInvoke", e2, "exception when send remote exception, caused by " + e.toString());
                }
            }
        }
    }

    @OnRemoteProcess
    public static <T> T a(final com.android.meituan.multiprocess.invoker.b<IPCMethodCall> bVar, final RemoteCallbackProxyData remoteCallbackProxyData) {
        Object[] objArr = {bVar, remoteCallbackProxyData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bda58c1f16f31825f59749e4a020f6f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bda58c1f16f31825f59749e4a020f6f") : (T) Proxy.newProxyInstance(bVar.getClass().getClassLoader(), a(remoteCallbackProxyData.b), new com.meituan.msc.common.process.ipc.a(remoteCallbackProxyData.b) { // from class: com.meituan.msc.common.process.ipc.IPCInvoke.2
            public static ChangeQuickRedirect b;

            @Override // com.meituan.msc.common.process.ipc.a, java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr2) throws Throwable {
                Object[] objArr3 = {obj, method, objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "d7667ddef7671e37de2ea6ddde2b4ea7", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "d7667ddef7671e37de2ea6ddde2b4ea7");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fccc594a92386e2fb332fe9ada4f086", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fccc594a92386e2fb332fe9ada4f086");
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
        public static final Parcelable.Creator<IPCMethodCall> CREATOR = new Parcelable.Creator<IPCMethodCall>() { // from class: com.meituan.msc.common.process.ipc.IPCInvoke.IPCMethodCall.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ IPCMethodCall createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "955e3e6dbe0ce71a01090bf0a1c68987", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IPCMethodCall) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "955e3e6dbe0ce71a01090bf0a1c68987");
                }
                MSCEnvHelper.ensureFullInited();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154253a84f2073069af1826fd5008c31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154253a84f2073069af1826fd5008c31");
            } else {
                this.b = -1;
            }
        }

        public IPCMethodCall(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db2f21ce3e87d272ec936889f04679b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db2f21ce3e87d272ec936889f04679b7");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb080f92ca59ef1885999d5146208e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb080f92ca59ef1885999d5146208e2");
                return;
            }
            try {
                IPCInvoke.a(this.c, parcel);
                IPCInvoke.a(this.d, parcel);
                IPCInvoke.a(this.e, parcel);
                parcel.writeInt(this.b);
            } catch (Exception e) {
                com.meituan.msc.modules.reporter.g.a(e);
                f.b(e.toString(), null);
                throw e;
            }
        }
    }

    public static void a(Object obj, Parcel parcel) {
        Object[] objArr = {obj, parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf3965d77346990983595051fd319158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf3965d77346990983595051fd319158");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5343454ff47f2429f5610fe2bef64d5b", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5343454ff47f2429f5610fe2bef64d5b") : (T) j.a(parcel.readString(), parcel);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class RemoteCallbackProxyData implements Parcelable {
        public static final Parcelable.Creator<RemoteCallbackProxyData> CREATOR = new Parcelable.Creator<RemoteCallbackProxyData>() { // from class: com.meituan.msc.common.process.ipc.IPCInvoke.RemoteCallbackProxyData.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RemoteCallbackProxyData createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900477abacaa8d7b24c5a0803260f6d3", RobustBitConfig.DEFAULT_VALUE) ? (RemoteCallbackProxyData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900477abacaa8d7b24c5a0803260f6d3") : new RemoteCallbackProxyData(parcel);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978e72174887e7ea62b6d67de8c549db", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978e72174887e7ea62b6d67de8c549db");
                return;
            }
            try {
                this.b = Class.forName(parcel.readString());
                this.c = parcel.readInt();
            } catch (ClassNotFoundException e) {
                com.meituan.msc.modules.reporter.g.a(e);
                f.b(e.toString(), null);
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f331a5d7d80ddb655ec2f180ae2856b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f331a5d7d80ddb655ec2f180ae2856b");
                return;
            }
            parcel.writeString(this.b.getName());
            parcel.writeInt(this.c);
        }
    }
}
