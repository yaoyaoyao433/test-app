package com.sankuai.android.spawn.task;

import android.support.v4.content.ConcurrentTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.model.Request;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RequestLoader<D> extends AbstractModelLoader<D> {
    public static ChangeQuickRedirect d;
    protected final Request.Origin e;
    private final Request<D> f;

    @Override // android.support.v4.content.ConcurrentTaskLoader
    public Executor dispatchExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418114dd36c9faee2fd1bc039603cb88", 6917529027641081856L)) {
            return (Executor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418114dd36c9faee2fd1bc039603cb88");
        }
        switch (this.e) {
            case LOCAL:
                return ConcurrentTask.SERIAL_EXECUTOR;
            case NET:
                return ConcurrentTask.THREAD_POOL_EXECUTOR;
            default:
                return this.f.isLocalValid() ? ConcurrentTask.SERIAL_EXECUTOR : ConcurrentTask.THREAD_POOL_EXECUTOR;
        }
    }

    @Override // com.sankuai.android.spawn.task.AbstractModelLoader
    public final D a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa38db0096a3cf4c11f81f05e7958d6", 6917529027641081856L) ? (D) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa38db0096a3cf4c11f81f05e7958d6") : this.f.execute(this.e);
    }
}
