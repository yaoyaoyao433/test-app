package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    final Object b;
    final Object c;
    a d;
    LinkedList<com.meituan.android.mtplayer.video.player.d> e;
    LinkedList<com.meituan.android.mtplayer.video.player.d> f;
    b g;
    private ExecutorService h;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dda8fd3350b63d2627be09b4fba038e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dda8fd3350b63d2627be09b4fba038e");
            return;
        }
        this.b = new Object();
        this.c = new Object();
        this.d = new a();
        this.h = com.sankuai.android.jarvis.c.a("mtplayer_video-resetPlayer");
        this.e = new LinkedList<>();
        this.f = new LinkedList<>();
        this.g = new b();
        this.h.execute(this.d);
    }

    public final com.meituan.android.mtplayer.video.player.d a(Context context, l lVar) {
        com.meituan.android.mtplayer.video.player.d remove;
        Object[] objArr = {context, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170093318de62b55fa62f223ac3f5ee8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mtplayer.video.player.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170093318de62b55fa62f223ac3f5ee8");
        }
        synchronized (this.b) {
            remove = this.f.isEmpty() ? null : this.f.remove();
        }
        return remove == null ? com.meituan.android.mtplayer.video.player.f.a(context, lVar) : remove;
    }

    public final void a(com.meituan.android.mtplayer.video.player.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a426251980a0d95e9481d2c3b3c60d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a426251980a0d95e9481d2c3b3c60d0d");
            return;
        }
        b(dVar);
        synchronized (this.c) {
            this.e.add(dVar);
        }
        a.a(this.d, this.g);
    }

    private void b(com.meituan.android.mtplayer.video.player.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d788dc9031aeb9419d1c172007f419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d788dc9031aeb9419d1c172007f419");
        } else if (dVar != null) {
            dVar.setOnPreparedListener(null);
            dVar.setOnVideoSizeChangedListener(null);
            dVar.setOnCompletionListener(null);
            dVar.setOnErrorListener(null);
            dVar.setOnInfoListener(null);
            dVar.setOnBufferingUpdateListener(null);
            dVar.setOnSeekCompleteListener(null);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84425e19b204f962bfdff91d746f9bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84425e19b204f962bfdff91d746f9bf");
            return;
        }
        a.a(this.d, this.g);
        a.a(this.d, new Runnable() { // from class: com.meituan.android.mtplayer.video.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02ed625194a9b9efd916a1a55486c91c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02ed625194a9b9efd916a1a55486c91c");
                    return;
                }
                h.this.d.b.removeCallbacks(h.this.g);
                synchronized (h.this.b) {
                    while (!h.this.f.isEmpty()) {
                        com.meituan.android.mtplayer.video.player.d remove = h.this.f.remove();
                        if (remove != null) {
                            remove.setSurface(null);
                            remove.release();
                        }
                    }
                }
            }
        });
        a.a(this.d, new Runnable() { // from class: com.meituan.android.mtplayer.video.h.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67aac257e959ca059188f2ea5d2e4175", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67aac257e959ca059188f2ea5d2e4175");
                    return;
                }
                a aVar = h.this.d;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "79ae2ea49746630e3908aa507e4d8f56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "79ae2ea49746630e3908aa507e4d8f56");
                    return;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a implements Runnable {
        public static ChangeQuickRedirect a;
        Handler b;

        public a() {
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "27064fb2cf50006078cc7dc3a4e2cd39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "27064fb2cf50006078cc7dc3a4e2cd39");
            } else if (aVar.b != null) {
                aVar.b.removeCallbacks(runnable);
                aVar.b.post(runnable);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9586e6d8e7722cf082c21c645fd109", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9586e6d8e7722cf082c21c645fd109");
                return;
            }
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            this.b = new Handler(Looper.myLooper());
            Looper.loop();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {h.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ff03b8e06cd6c1d42fcbb520dd35ba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ff03b8e06cd6c1d42fcbb520dd35ba");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.meituan.android.mtplayer.video.player.d remove;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690ff7b02935602ce1c084ded1499a7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690ff7b02935602ce1c084ded1499a7f");
                return;
            }
            h.this.d.b.removeCallbacks(this);
            while (!h.this.e.isEmpty()) {
                synchronized (h.this.c) {
                    remove = h.this.e.isEmpty() ? null : h.this.e.remove();
                }
                if (remove != null) {
                    try {
                        remove.reset();
                        synchronized (h.this.b) {
                            h.this.f.add(remove);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
