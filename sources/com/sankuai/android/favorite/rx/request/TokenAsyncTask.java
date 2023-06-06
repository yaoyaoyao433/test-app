package com.sankuai.android.favorite.rx.request;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.spawn.task.AbstractModelAsyncTask;
import com.sankuai.model.userlocked.UserLockedErrorException;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class TokenAsyncTask<T> extends AbstractModelAsyncTask<T> {
    public static ChangeQuickRedirect b;
    private WeakReference<Activity> a;

    @Override // com.sankuai.android.spawn.task.AbstractModelAsyncTask, android.support.v4.content.ModernAsyncTask
    public void onPostExecute(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d352ad979831e48d2d019a51255faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d352ad979831e48d2d019a51255faa");
        } else if (!(this.d instanceof UserLockedErrorException)) {
            super.onPostExecute(t);
        } else {
            Object[] objArr2 = {this.d};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6454de23d4f8dda57856abd97479b27d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6454de23d4f8dda57856abd97479b27d");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb7d258262be532dac81b70771f060d6", RobustBitConfig.DEFAULT_VALUE)) {
                Activity activity = (Activity) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb7d258262be532dac81b70771f060d6");
            } else if (this.a != null) {
                this.a.get();
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9df901544bde3a43caf4f2d267f096d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9df901544bde3a43caf4f2d267f096d3");
            }
        }
    }
}
