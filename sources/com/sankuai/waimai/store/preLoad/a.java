package com.sankuai.waimai.store.preLoad;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public volatile LayoutInflater b;
    public Handler c;
    public c d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public a a;
        public ViewGroup b;
        public int c;
        public View d;
        public e e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface e {
        void a(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14664fc1cea0c86604f3ed79b8fc186e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14664fc1cea0c86604f3ed79b8fc186e");
            return;
        }
        this.b = new C1288a(context);
        this.d = c.a();
        this.c = new Handler(new d(this.b, this.d));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d implements Handler.Callback {
        public static ChangeQuickRedirect a;
        private final WeakReference<LayoutInflater> b;
        private final WeakReference<c> c;

        public d(LayoutInflater layoutInflater, c cVar) {
            Object[] objArr = {layoutInflater, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2053c7cd1c63c69b518508b073d8dab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2053c7cd1c63c69b518508b073d8dab");
                return;
            }
            this.b = new WeakReference<>(layoutInflater);
            this.c = new WeakReference<>(cVar);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9a318842bf93deeecba162297c6bebc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9a318842bf93deeecba162297c6bebc")).booleanValue();
            }
            LayoutInflater layoutInflater = this.b.get();
            c cVar = this.c.get();
            if (layoutInflater == null || cVar == null) {
                return true;
            }
            b bVar = (b) message.obj;
            if (bVar.d == null) {
                bVar.d = layoutInflater.inflate(bVar.c, bVar.b, false);
            }
            bVar.e.a(bVar.d, bVar.c, bVar.b);
            cVar.a(bVar);
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.preLoad.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1288a extends LayoutInflater {
        public static ChangeQuickRedirect a;
        private static final String[] b = {"android.widget.", "android.webkit.", "android.app."};

        public C1288a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c077df8876000e5d0fc1f7a35c1dcf8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c077df8876000e5d0fc1f7a35c1dcf8");
            }
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ea7dcd2c231ca56a7272c2300a5b24", RobustBitConfig.DEFAULT_VALUE) ? (LayoutInflater) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ea7dcd2c231ca56a7272c2300a5b24") : new C1288a(context);
        }

        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            Object[] objArr = {str, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b9f4cc92e88a4584c27007406ee082", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b9f4cc92e88a4584c27007406ee082");
            }
            for (String str2 : b) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends Thread {
        public static ChangeQuickRedirect a;
        private static final c d;
        ArrayBlockingQueue<b> b;
        Pools.SynchronizedPool<b> c;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2269fd6b1c47685f2abccb9ca49fb4c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2269fd6b1c47685f2abccb9ca49fb4c");
                return;
            }
            this.b = new ArrayBlockingQueue<>(10);
            this.c = new Pools.SynchronizedPool<>(10);
        }

        static {
            c cVar = new c();
            d = cVar;
            cVar.start();
        }

        public static c a() {
            return d;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "452168e347773aa12c1866997e1ac6ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "452168e347773aa12c1866997e1ac6ff");
                return;
            }
            while (true) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cb3f11a555874cce576f81ed2a0ed04", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cb3f11a555874cce576f81ed2a0ed04");
                } else {
                    try {
                        b take = this.b.take();
                        LayoutInflater layoutInflater = take.a.b;
                        Handler handler = take.a.c;
                        if (layoutInflater == null || handler == null) {
                            a(take);
                        } else {
                            try {
                                take.d = layoutInflater.inflate(take.c, take.b, false);
                            } catch (RuntimeException e) {
                                Log.w("SGAsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                            }
                            Message.obtain(handler, 0, take).sendToTarget();
                        }
                    } catch (InterruptedException e2) {
                        Log.w("SGAsyncLayoutInflater", e2);
                    }
                }
            }
        }

        public final void a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482a26648631284c53a1cb3614c4a4d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482a26648631284c53a1cb3614c4a4d0");
                return;
            }
            bVar.e = null;
            bVar.a = null;
            bVar.b = null;
            bVar.c = 0;
            bVar.d = null;
            this.c.release(bVar);
        }
    }
}
