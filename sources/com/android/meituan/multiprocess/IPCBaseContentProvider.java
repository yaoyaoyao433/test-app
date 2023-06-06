package com.android.meituan.multiprocess;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.meituan.multiprocess.IIPCBrige;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class IPCBaseContentProvider extends ContentProvider {
    public static final String BUNDLE_BINDER_TYPE = "binder";
    public static final String CALLBACK_DATA_KEY_BUNDLE = "callback_data_key";
    public static final int CALLBACK_SUCCESS = 1;
    public static final int CODE_WAIT_INIT_NORMAL = 0;
    public static final int CODE_WAIT_INIT_TIMEOUT = -1;
    private static final int DEFAULT_WAIT_INIT_TIMEOUT = 30;
    public static final String EVENT_RESULT = "result";
    public static final int EVENT_RESULT_OK = 1;
    public static final String IPC_DEFAULT_CHANNEL = "ipc_channel";
    public static final String METHOD_BINDER_INVOKER = "binder_invoker";
    public static final String METHOD_BINDER_SERVICE = "binder_service";
    public static final String METHOD_EVENT = "event";
    public static final String PARAM_DATA_KEY_BUNDLE = "param_data_key";
    public static final String RESULT_DATA_KEY_BUNDLE = "result_data_key";

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    public String getChannel() {
        return IPC_DEFAULT_CHANNEL;
    }

    public abstract String getProcessName();

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    public int getWaitInitTimeOut() {
        return 30;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public void prepareForCall() {
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    public boolean startAfterInit() {
        return false;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        HashMap hashMap = new HashMap();
        hashMap.put("cp_name", getClass().getName());
        hashMap.put("process", getProcessName());
        d.a("contentprovider_create", hashMap);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int waitInit() {
        if (startAfterInit()) {
            int a2 = e.a(getChannel(), getWaitInitTimeOut());
            if (a2 == -1) {
                HashMap hashMap = new HashMap();
                hashMap.put("process", getProcessName());
                d.a("wait_timeout", hashMap);
            }
            return a2;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable final String str2, @Nullable final Bundle bundle) {
        prepareForCall();
        d.a("ContentProvider call " + str);
        if (METHOD_BINDER_INVOKER.equals(str)) {
            Bundle bundle2 = new Bundle();
            if (Build.VERSION.SDK_INT >= 18) {
                bundle2.putBinder(BUNDLE_BINDER_TYPE, new IPCInvokerImp());
            } else {
                bundle2.putParcelable(BUNDLE_BINDER_TYPE, new BinderParcelable(new IPCInvokerImp()));
            }
            return bundle2;
        } else if (METHOD_BINDER_SERVICE.equals(str)) {
            waitInit();
            Bundle bundle3 = new Bundle();
            IBinder a2 = j.a(getProcessName(), str2);
            if (a2 != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    bundle3.putBinder(BUNDLE_BINDER_TYPE, a2);
                    return bundle3;
                }
                bundle3.putParcelable(BUNDLE_BINDER_TYPE, new BinderParcelable(a2));
                return bundle3;
            }
            return bundle3;
        } else if ("event".equals(str)) {
            waitInit();
            if (bundle != null) {
                bundle.setClassLoader(IPCBaseContentProvider.class.getClassLoader());
            }
            final h a3 = h.a();
            if (a3.b != null) {
                a3.b.execute(new Runnable() { // from class: com.android.meituan.multiprocess.h.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a(a3, str2, bundle);
                    }
                });
            }
            Bundle bundle4 = new Bundle();
            bundle4.putInt("result", 1);
            return bundle4;
        } else {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class IPCInvokerImp extends IIPCBrige.Stub {
        private IPCInvokerImp() {
        }

        @Override // com.android.meituan.multiprocess.IIPCBrige
        public Bundle invokeSync(Bundle bundle, String str) throws RemoteException {
            WrapperParcelable wrapperParcelable;
            String message;
            Object obj;
            d.a("call invokeSync " + str);
            IPCBaseContentProvider.this.waitInit();
            if (str == null || str.length() == 0) {
                d.a("proxy SyncInvoke failed, class is null or nil.");
                return null;
            }
            com.android.meituan.multiprocess.invoker.c cVar = (com.android.meituan.multiprocess.invoker.c) g.a(str);
            if (cVar == null) {
                d.a(String.format("proxy SyncInvoke failed, newInstance(%s) return null.", str));
                return null;
            }
            if (bundle != null) {
                bundle.setClassLoader(IPCBaseContentProvider.class.getClassLoader());
                wrapperParcelable = (WrapperParcelable) bundle.getParcelable(IPCBaseContentProvider.PARAM_DATA_KEY_BUNDLE);
            } else {
                wrapperParcelable = null;
            }
            Object obj2 = wrapperParcelable != null ? wrapperParcelable.a : null;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                obj = cVar.invoke(obj2);
                message = null;
            } catch (Throwable th) {
                message = th.getMessage();
                obj = null;
            }
            d.a("invoker_sync_impl", null, message, System.currentTimeMillis() - currentTimeMillis);
            WrapperParcelable wrapperParcelable2 = new WrapperParcelable(obj);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(IPCBaseContentProvider.RESULT_DATA_KEY_BUNDLE, wrapperParcelable2);
            return bundle2;
        }

        @Override // com.android.meituan.multiprocess.IIPCBrige
        public void invokeAsync(Bundle bundle, String str, IIPCBrigeCallBack iIPCBrigeCallBack) throws RemoteException {
            WrapperParcelable wrapperParcelable;
            String message;
            d.a("call invokeAsync " + str + "  process:" + ProcessUtils.getCurrentProcessName(e.a()));
            IPCBaseContentProvider.this.waitInit();
            if (str == null || str.length() == 0) {
                d.a("proxy SyncInvoke failed, class is null or nil.");
                return;
            }
            com.android.meituan.multiprocess.invoker.a aVar = (com.android.meituan.multiprocess.invoker.a) g.a(str);
            if (aVar == null) {
                d.a(String.format("proxy SyncInvoke failed, newInstance(%s) return null.", str));
                return;
            }
            if (bundle != null) {
                bundle.setClassLoader(IPCBaseContentProvider.class.getClassLoader());
                wrapperParcelable = (WrapperParcelable) bundle.getParcelable(IPCBaseContentProvider.PARAM_DATA_KEY_BUNDLE);
            } else {
                wrapperParcelable = null;
            }
            Object obj = wrapperParcelable != null ? wrapperParcelable.a : null;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                aVar.a(obj, new a(iIPCBrigeCallBack));
                message = null;
            } catch (Throwable th) {
                message = th.getMessage();
            }
            d.a("invoker_async_impl", null, message, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a<T> implements com.android.meituan.multiprocess.invoker.b<T> {
        IIPCBrigeCallBack a;

        public a(IIPCBrigeCallBack iIPCBrigeCallBack) {
            this.a = iIPCBrigeCallBack;
        }

        @Override // com.android.meituan.multiprocess.invoker.b
        public final void a(T t) throws com.android.meituan.multiprocess.exception.a {
            if (this.a == null) {
                d.a("function Callback is null");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(IPCBaseContentProvider.CALLBACK_DATA_KEY_BUNDLE, new WrapperParcelable(t));
            try {
                this.a.callBack(1, bundle);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                throw new com.android.meituan.multiprocess.exception.a(e2.getMessage());
            }
        }
    }
}
