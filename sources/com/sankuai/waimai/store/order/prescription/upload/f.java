package com.sankuai.waimai.store.order.prescription.upload;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.upload.f.a;
import com.sankuai.waimai.store.util.ac;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f<Task extends a, Result> {
    public static ChangeQuickRedirect b;
    private int a;
    boolean c;
    boolean d;
    public b<Result> e;
    AsyncTask<Void, Void, Void> f;
    protected final Handler g;
    private int h;
    @NonNull
    private final Queue<Task> i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        boolean a();

        int b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b<Result> {
        @MainThread
        boolean isFinishing();

        @MainThread
        void onTaskFailed(int i, int i2);

        @MainThread
        void onTaskProgress(int i, int i2, int i3);

        @MainThread
        void onTaskStart(int i, int i2);

        @MainThread
        void onTaskSuccess(int i, Result result, int i2);

        @MainThread
        void onTasksComplete(int i, int i2);
    }

    @WorkerThread
    public abstract Result a(Task task, int i) throws Throwable;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211bc7aca81bfdbfd44079e151914a3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211bc7aca81bfdbfd44079e151914a3e");
            return;
        }
        this.c = false;
        this.d = false;
        this.a = 0;
        this.h = 0;
        this.i = new LinkedList();
        this.g = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.store.order.prescription.upload.f.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0fe9412056d348f8023fe1e5aeda985", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0fe9412056d348f8023fe1e5aeda985")).booleanValue();
                }
                if (f.this.e == null) {
                    return false;
                }
                if (f.this.c || f.this.e.isFinishing()) {
                    return true;
                }
                switch (message.what) {
                    case 1:
                        f.this.e.onTaskStart(message.arg1, message.arg2);
                        break;
                    case 2:
                        f.this.e.onTaskFailed(message.arg1, message.arg2);
                        break;
                    case 3:
                        f.this.e.onTaskSuccess(message.arg1, message.obj, message.arg2);
                        break;
                    case 4:
                        f.this.e.onTasksComplete(message.arg1, message.arg2);
                        break;
                    case 5:
                        f.this.e.onTaskProgress(message.arg1, ((Integer) message.obj).intValue(), message.arg2);
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }

    @MainThread
    public boolean cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a6817e4bdde38a4a734e379a4934fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a6817e4bdde38a4a734e379a4934fe")).booleanValue();
        }
        if (!this.d || this.c) {
            return false;
        }
        this.c = true;
        this.i.clear();
        if (this.f != null) {
            this.f.cancel(true);
        }
        return true;
    }

    @MainThread
    public final boolean a(@NonNull ArrayList<Task> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc26963fcfd9623e43872d330cfbb3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc26963fcfd9623e43872d330cfbb3c")).booleanValue() : !this.d && b(arrayList);
    }

    @RequiresApi(api = 11)
    @MainThread
    private boolean b(@NonNull ArrayList<Task> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccfa71f3fe79173098ad8cb63f9cd759", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccfa71f3fe79173098ad8cb63f9cd759")).booleanValue();
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        this.c = false;
        this.d = true;
        this.a = 0;
        this.h = 0;
        this.i.clear();
        this.i.addAll(arrayList);
        this.f = new AsyncTask<Void, Void, Void>() { // from class: com.sankuai.waimai.store.order.prescription.upload.f.2
            public static ChangeQuickRedirect a;

            @Override // android.os.AsyncTask
            public final /* synthetic */ Void doInBackground(Void[] voidArr) {
                Object[] objArr2 = {voidArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9124cfe7928a5f042588bbe45cd77e85", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9124cfe7928a5f042588bbe45cd77e85");
                }
                f.this.a();
                return null;
            }

            @Override // android.os.AsyncTask
            public final /* synthetic */ void onPostExecute(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9aa879dd9b65043e45e613bc43bb663", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9aa879dd9b65043e45e613bc43bb663");
                    return;
                }
                f.this.f = null;
                f.this.d = false;
            }
        };
        com.sankuai.waimai.launcher.util.aop.b.a(this.f, ac.a(), new Void[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void a() {
        while (true) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80c7327312759ddddfa9e71bf9a9be5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80c7327312759ddddfa9e71bf9a9be5");
                return;
            } else if (this.c) {
                return;
            } else {
                if (this.i.isEmpty()) {
                    int i = this.a;
                    int i2 = this.h;
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9687ed92755d4f0325a95c49aa41eb98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9687ed92755d4f0325a95c49aa41eb98");
                        return;
                    } else {
                        this.g.obtainMessage(4, i, i2).sendToTarget();
                        return;
                    }
                }
                Task poll = this.i.poll();
                if (!poll.a()) {
                    if (b(poll, 2)) {
                        this.a++;
                    } else {
                        this.h++;
                    }
                }
            }
        }
    }

    @WorkerThread
    private boolean b(Task task, int i) {
        Object[] objArr = {task, 2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb6d5768944a4ad3e249e7757e64753", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb6d5768944a4ad3e249e7757e64753")).booleanValue();
        }
        if (this.c) {
            return false;
        }
        Result result = null;
        Object[] objArr2 = {task, 2};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3fbdd20a5606c591574d4e14afa2f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3fbdd20a5606c591574d4e14afa2f73");
        } else {
            this.g.obtainMessage(1, task.b(), 2).sendToTarget();
        }
        try {
            result = a(task, 2);
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
        if (result == null) {
            Object[] objArr3 = {task, 2};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14817c70b1a5ba82e54794891e1abd3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14817c70b1a5ba82e54794891e1abd3a");
            } else {
                this.g.obtainMessage(2, task.b(), 2).sendToTarget();
            }
            return false;
        }
        Object[] objArr4 = {task, result, 2};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9e9d4f17c17af7865a0e5f9970031df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9e9d4f17c17af7865a0e5f9970031df0");
            return true;
        }
        this.g.obtainMessage(3, task.b(), 2, result).sendToTarget();
        return true;
    }

    public final void a(Task task, int i, int i2) {
        Object[] objArr = {task, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe3bc50ff85dc3d671fdec2c11267a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe3bc50ff85dc3d671fdec2c11267a5");
        } else {
            this.g.obtainMessage(5, task.b(), i2, Integer.valueOf(i)).sendToTarget();
        }
    }
}
