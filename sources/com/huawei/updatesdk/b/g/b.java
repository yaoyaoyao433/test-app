package com.huawei.updatesdk.b.g;

import android.os.AsyncTask;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private static List<AsyncTask> a = new CopyOnWriteArrayList();

    public static com.huawei.updatesdk.a.b.c.b a(com.huawei.updatesdk.b.b.c cVar, com.huawei.updatesdk.a.b.c.c.a aVar) {
        com.huawei.updatesdk.a.b.c.b bVar = new com.huawei.updatesdk.a.b.c.b(cVar, aVar);
        a(bVar, cVar);
        return bVar;
    }

    public static List<AsyncTask> a() {
        return a;
    }

    public static void a(AsyncTask asyncTask) {
        if (asyncTask == null) {
            return;
        }
        for (AsyncTask asyncTask2 : a) {
            if (asyncTask2 != null && (asyncTask2.getStatus() == AsyncTask.Status.FINISHED || asyncTask2.isCancelled())) {
                a.remove(asyncTask);
            }
        }
        a.add(asyncTask);
    }

    private static void a(com.huawei.updatesdk.a.b.c.b bVar, com.huawei.updatesdk.b.b.c cVar) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreAgent", "executeTask, ActiveCount:" + c.a.getActiveCount() + ", TaskCount:" + c.a.getTaskCount());
        bVar.a(c.a);
    }
}
