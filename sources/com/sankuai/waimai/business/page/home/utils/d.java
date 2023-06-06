package com.sankuai.waimai.business.page.home.utils;

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
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public volatile LayoutInflater b;
    public Handler c;
    public b d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public d a;
        public ViewGroup b;
        public int c;
        public View d;
        public WeakReference<c> e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea2dec81d269c7c6be82cf3d60e36eb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea2dec81d269c7c6be82cf3d60e36eb6");
            return;
        }
        this.b = null;
        this.d = null;
        if (this.c != null) {
            this.c.removeCallbacksAndMessages(null);
            this.c = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b extends Thread {
        public static ChangeQuickRedirect a;
        private static final b c;
        public ArrayBlockingQueue<a> b;
        private Pools.SynchronizedPool<a> d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83eae6e203cf8a178e16dbc3ae26b64", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83eae6e203cf8a178e16dbc3ae26b64");
                return;
            }
            this.b = new ArrayBlockingQueue<>(10);
            this.d = new Pools.SynchronizedPool<>(10);
        }

        static {
            b bVar = new b();
            c = bVar;
            bVar.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862d77a2f42643c6a4ef5a3a9827bcf8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862d77a2f42643c6a4ef5a3a9827bcf8");
                return;
            }
            while (true) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29c9446aed121b5c5756b2f29af88a85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29c9446aed121b5c5756b2f29af88a85");
                } else {
                    try {
                        a take = this.b.take();
                        LayoutInflater layoutInflater = take.a.b;
                        Handler handler = take.a.c;
                        if (layoutInflater == null || handler == null) {
                            Object[] objArr3 = {take};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f78673742cb7a883f29dc71f5824615e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f78673742cb7a883f29dc71f5824615e");
                            } else {
                                take.e = null;
                                take.a = null;
                                take.b = null;
                                take.c = 0;
                                take.d = null;
                                this.d.release(take);
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
