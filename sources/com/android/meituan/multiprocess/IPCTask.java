package com.android.meituan.multiprocess;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import com.android.meituan.multiprocess.IIPCBrigeCallBack;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class IPCTask {
    String a;

    private IPCTask() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IPCTask a(String str) {
        IPCTask iPCTask = new IPCTask();
        iPCTask.a = str;
        return iPCTask;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class Async<InputType, ResultType> {
        InputType a;
        Class<com.android.meituan.multiprocess.invoker.a<InputType, ResultType>> b;
        com.android.meituan.multiprocess.invoker.b<ResultType> c;
        IPCTask d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Async(IPCTask iPCTask, Class<com.android.meituan.multiprocess.invoker.a<InputType, ResultType>> cls) {
            this.d = iPCTask;
            this.b = cls;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        static class CallbackWrapper<ResultType> extends IIPCBrigeCallBack.Stub {
            com.android.meituan.multiprocess.invoker.b callback;

            @Override // com.android.meituan.multiprocess.IIPCBrigeCallBack.Stub, android.os.IInterface
            public IBinder asBinder() {
                return this;
            }

            private CallbackWrapper(com.android.meituan.multiprocess.invoker.b bVar) {
                this.callback = bVar;
            }

            @Override // com.android.meituan.multiprocess.IIPCBrigeCallBack
            public void callBack(int i, Bundle bundle) throws RemoteException {
                WrapperParcelable wrapperParcelable;
                bundle.setClassLoader(e.class.getClassLoader());
                Object obj = (bundle == null || (wrapperParcelable = (WrapperParcelable) bundle.getParcelable(IPCBaseContentProvider.CALLBACK_DATA_KEY_BUNDLE)) == null) ? null : wrapperParcelable.a;
                if (this.callback != null) {
                    try {
                        this.callback.a(obj);
                    } catch (com.android.meituan.multiprocess.exception.a e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a<InputType, ResultType> {
        InputType a;
        private Class<com.android.meituan.multiprocess.invoker.c<InputType, ResultType>> b;
        private IPCTask c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(IPCTask iPCTask, Class<com.android.meituan.multiprocess.invoker.c<InputType, ResultType>> cls) {
            this.c = iPCTask;
            this.b = cls;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final ResultType a() throws com.android.meituan.multiprocess.exception.a {
            /*
                r6 = this;
                com.android.meituan.multiprocess.IPCTask r0 = r6.c
                r1 = 0
                if (r0 == 0) goto La9
                java.lang.Class<com.android.meituan.multiprocess.invoker.c<InputType, ResultType>> r0 = r6.b
                if (r0 != 0) goto Lb
                goto La9
            Lb:
                com.android.meituan.multiprocess.IPCTask r0 = r6.c
                java.lang.String r0 = r0.a
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 == 0) goto L1d
                android.content.Context r0 = com.android.meituan.multiprocess.e.a()
                java.lang.String r0 = com.sankuai.common.utils.ProcessUtils.getCurrentProcessName(r0)
            L1d:
                boolean r2 = com.android.meituan.multiprocess.i.a(r0)
                if (r2 == 0) goto L38
                java.lang.Class<com.android.meituan.multiprocess.invoker.c<InputType, ResultType>> r2 = r6.b
                java.lang.String r2 = r2.getName()
                java.lang.Object r2 = com.android.meituan.multiprocess.g.a(r2)
                com.android.meituan.multiprocess.invoker.c r2 = (com.android.meituan.multiprocess.invoker.c) r2
                if (r2 == 0) goto L38
                InputType r0 = r6.a
                java.lang.Object r0 = r2.invoke(r0)
                return r0
            L38:
                com.android.meituan.multiprocess.b r2 = com.android.meituan.multiprocess.b.a()
                com.android.meituan.multiprocess.IIPCBrige r0 = r2.a(r0)
                if (r0 == 0) goto L89
                com.android.meituan.multiprocess.WrapperParcelable r2 = new com.android.meituan.multiprocess.WrapperParcelable     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                InputType r3 = r6.a     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                android.os.Bundle r2 = com.android.meituan.multiprocess.IPCTask.a(r2)     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                java.lang.Class<com.android.meituan.multiprocess.invoker.c<InputType, ResultType>> r3 = r6.b     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                java.lang.String r3 = r3.getName()     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                android.os.Bundle r0 = r0.invokeSync(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L58 android.os.RemoteException -> L63
                goto L8a
            L58:
                r0 = move-exception
                com.android.meituan.multiprocess.exception.a r1 = new com.android.meituan.multiprocess.exception.a
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            L63:
                r0 = move-exception
                r0.printStackTrace()
                java.lang.String r2 = r0.getMessage()
                boolean r2 = com.android.meituan.multiprocess.exception.a.c(r2)
                if (r2 != 0) goto L7f
                java.lang.String r2 = "invoker_sync"
                java.lang.Class<com.android.meituan.multiprocess.invoker.c<InputType, ResultType>> r3 = r6.b
                java.lang.String r0 = r0.getMessage()
                r4 = -1
                com.android.meituan.multiprocess.d.a(r2, r3, r0, r4)
                goto L89
            L7f:
                com.android.meituan.multiprocess.exception.a r1 = new com.android.meituan.multiprocess.exception.a
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            L89:
                r0 = r1
            L8a:
                if (r0 != 0) goto L8d
                return r1
            L8d:
                java.lang.Class<com.android.meituan.multiprocess.e> r2 = com.android.meituan.multiprocess.e.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setClassLoader(r2)
                java.lang.String r2 = "result_data_key"
                android.os.Parcelable r0 = r0.getParcelable(r2)
                com.android.meituan.multiprocess.WrapperParcelable r0 = (com.android.meituan.multiprocess.WrapperParcelable) r0
                if (r0 != 0) goto La6
                java.lang.String r0 = "sync invoke error, wrapper parcelable data is null!"
                com.android.meituan.multiprocess.d.a(r0)
                goto La8
            La6:
                java.lang.Object r1 = r0.a
            La8:
                return r1
            La9:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.meituan.multiprocess.IPCTask.a.a():java.lang.Object");
        }
    }

    static /* synthetic */ Bundle a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(IPCBaseContentProvider.PARAM_DATA_KEY_BUNDLE, parcelable);
        return bundle;
    }
}
