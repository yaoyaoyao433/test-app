package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview;

import android.os.Handler;
import android.os.Message;
import android.support.v4.util.Pools;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public volatile LayoutInflater b;
    public Handler c;
    public b d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0841a {
        public a a;
        public ViewGroup b;
        public int c;
        public View d;
        public c e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b extends Thread {
        public static ChangeQuickRedirect a;
        private static final b d;
        public ArrayBlockingQueue<C0841a> b;
        Pools.SynchronizedPool<C0841a> c;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b301031b399ca76d73baeb43541398", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b301031b399ca76d73baeb43541398");
                return;
            }
            this.b = new ArrayBlockingQueue<>(10);
            this.c = new Pools.SynchronizedPool<>(10);
        }

        static {
            b bVar = new b();
            d = bVar;
            bVar.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f14772c341a6348129a6b7be6e674f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f14772c341a6348129a6b7be6e674f0");
                return;
            }
            while (true) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1c279480134cc442565c78f7deab0d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1c279480134cc442565c78f7deab0d9");
                } else {
                    try {
                        C0841a take = this.b.take();
                        LayoutInflater layoutInflater = take.a.b;
                        Handler handler = take.a.c;
                        if (layoutInflater == null || handler == null) {
                            Object[] objArr3 = {take};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a47d7104b252b950be3c9118af424e8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a47d7104b252b950be3c9118af424e8");
                            } else {
                                take.e = null;
                                take.a = null;
                                take.b = null;
                                take.c = 0;
                                take.d = null;
                                this.c.release(take);
                            }
                        } else {
                            try {
                                take.d = layoutInflater.inflate(take.c, take.b, false);
                            } catch (RuntimeException e) {
                                Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                            }
                            Message.obtain(handler, 0, take).sendToTarget();
                        }
                    } catch (InterruptedException e2) {
                        Log.w("AsyncLayoutInflater", e2);
                    }
                }
            }
        }
    }
}
