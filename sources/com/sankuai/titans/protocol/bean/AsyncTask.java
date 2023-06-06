package com.sankuai.titans.protocol.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.IThreadPoolService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AsyncTask<Result> implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IThreadPoolService threadPoolService;

    public abstract Result doInBackground();

    public abstract void onPostExecute(Result result);

    public AsyncTask(IThreadPoolService iThreadPoolService) {
        Object[] objArr = {iThreadPoolService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0f6ebebe1f03aef873ee00ec9021279", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0f6ebebe1f03aef873ee00ec9021279");
        } else {
            this.threadPoolService = iThreadPoolService;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e87bfff0531f973e7161b7c9626e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e87bfff0531f973e7161b7c9626e91");
            return;
        }
        final Result doInBackground = doInBackground();
        this.threadPoolService.executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.protocol.bean.AsyncTask.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd01cde67c9eb58ee14825a42f482f0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd01cde67c9eb58ee14825a42f482f0e");
                } else {
                    AsyncTask.this.onPostExecute(doInBackground);
                }
            }
        });
    }
}
