package com.sankuai.android.spawn.task;

import android.support.v4.content.ConcurrentTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbstractModelAsyncTask<T> extends ConcurrentTask<Void, Integer, T> {
    public static ChangeQuickRedirect c;
    private T a;
    protected Exception d;

    public abstract T a() throws Exception;

    public void a(Exception exc) {
    }

    public void a(T t) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.content.ModernAsyncTask
    /* renamed from: a */
    public T doInBackground(Void... voidArr) {
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97aea90edbe8b0df38cf22f0f3e708fa", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97aea90edbe8b0df38cf22f0f3e708fa");
        }
        try {
            this.a = a();
            this.d = null;
        } catch (Exception e) {
            this.a = null;
            this.d = e;
        }
        return this.a;
    }

    @Override // android.support.v4.content.ModernAsyncTask
    public void onPostExecute(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6cac9272634db2270abad00cb0851f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6cac9272634db2270abad00cb0851f");
            return;
        }
        try {
            if (this.d == null) {
                a((AbstractModelAsyncTask<T>) t);
            } else {
                a(this.d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
