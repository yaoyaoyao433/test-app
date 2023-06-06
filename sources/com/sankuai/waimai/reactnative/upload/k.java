package com.sankuai.waimai.reactnative.upload;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.upload.k.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class k<Task extends a, Result> {
    public static ChangeQuickRedirect b;
    private int a;
    boolean c;
    boolean d;
    b<Result> e;
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
        void a(int i, int i2);

        @MainThread
        void a(int i, int i2, int i3);

        @MainThread
        void a(int i, Result result, int i2);

        @MainThread
        boolean a();

        @MainThread
        void b(int i, int i2);

        @MainThread
        void c(int i, int i2);
    }

    @WorkerThread
    public abstract Result a(Task task, int i) throws Throwable;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a85a7258e7e26d7420ffe30c0a8df4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a85a7258e7e26d7420ffe30c0a8df4e");
            return;
        }
        this.c = false;
        this.d = false;
        this.a = 0;
        this.h = 0;
        this.i = new LinkedList();
        this.g = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.reactnative.upload.k.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00d2b3e5328f3b1c1ff146196e4d3e2f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00d2b3e5328f3b1c1ff146196e4d3e2f")).booleanValue();
                }
                if (k.this.e == null) {
                    return false;
                }
                if (k.this.c || k.this.e.a()) {
                    return true;
                }
                switch (message.what) {
                    case 1:
                        k.this.e.a(message.arg1, message.arg2);
                        break;
                    case 2:
                        k.this.e.b(message.arg1, message.arg2);
                        break;
                    case 3:
                        k.this.e.a(message.arg1, (int) message.obj, message.arg2);
                        break;
                    case 4:
                        k.this.e.c(message.arg1, message.arg2);
                        break;
                    case 5:
                        k.this.e.a(message.arg1, ((Integer) message.obj).intValue(), message.arg2);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1123a8a414bb742c36a47b1234522b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1123a8a414bb742c36a47b1234522b0")).booleanValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea09fb53e328925be2f4fa2207aac839", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea09fb53e328925be2f4fa2207aac839")).booleanValue() : !this.d && b(arrayList);
    }

    @MainThread
    private boolean b(@NonNull ArrayList<Task> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826b12b0cd4c33a506333c89f565dd38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826b12b0cd4c33a506333c89f565dd38")).booleanValue();
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
        this.f = new AsyncTask<Void, Void, Void>() { // from class: com.sankuai.waimai.reactnative.upload.k.2
            public static ChangeQuickRedirect a;

            @Override // android.os.AsyncTask
            public final /* synthetic */ Void doInBackground(Void[] voidArr) {
                Object[] objArr2 = {voidArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6725a6c5cd4af9265671dc80c197d1de", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6725a6c5cd4af9265671dc80c197d1de");
                }
                k.this.a();
                return null;
            }

            @Override // android.os.AsyncTask
            public final /* synthetic */ void onPostExecute(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb48c6b3eae1962faf073d40bcf64d9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb48c6b3eae1962faf073d40bcf64d9e");
                    return;
                }
                k.this.f = null;
                k.this.d = false;
            }
        };
        com.sankuai.waimai.launcher.util.aop.b.a(this.f, new Void[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void a() {
        while (true) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431755af8aa4ee6f03444127181885a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431755af8aa4ee6f03444127181885a6");
                return;
            } else if (this.c) {
                return;
            } else {
                if (this.i.isEmpty()) {
                    int i = this.a;
                    int i2 = this.h;
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8381cdf035fbf905855db8b37d94c51a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8381cdf035fbf905855db8b37d94c51a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23620e2a5e46f3d51baf82cfbd03d363", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23620e2a5e46f3d51baf82cfbd03d363")).booleanValue();
        }
        if (this.c) {
            return false;
        }
        Result result = null;
        Object[] objArr2 = {task, 2};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70cd080f03662e8294fa3078a485cb70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70cd080f03662e8294fa3078a485cb70");
        } else {
            this.g.obtainMessage(1, task.b(), 2).sendToTarget();
        }
        try {
            result = a(task, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (result == null) {
            Object[] objArr3 = {task, 2};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4d9ee58097a480acb020ca53ffff25b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4d9ee58097a480acb020ca53ffff25b");
            } else {
                this.g.obtainMessage(2, task.b(), 2).sendToTarget();
            }
            return false;
        }
        Object[] objArr4 = {task, result, 2};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "87b92e613158e1e98935702075dcdfd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "87b92e613158e1e98935702075dcdfd2");
            return true;
        }
        this.g.obtainMessage(3, task.b(), 2, result).sendToTarget();
        return true;
    }

    public final void a(Task task, int i, int i2) {
        Object[] objArr = {task, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf81e6eca957af5ccc5b51ae0f6e218d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf81e6eca957af5ccc5b51ae0f6e218d");
        } else {
            this.g.obtainMessage(5, task.b(), i2, Integer.valueOf(i)).sendToTarget();
        }
    }
}
