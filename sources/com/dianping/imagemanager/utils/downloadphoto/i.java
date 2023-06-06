package com.dianping.imagemanager.utils.downloadphoto;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.dianping.imagemanager.image.loader.e;
import com.dianping.imagemanager.utils.downloadphoto.b;
import com.dianping.imagemanager.utils.downloadphoto.c;
import com.dianping.imagemanager.utils.downloadphoto.f;
import com.dianping.imagemanager.utils.downloadphoto.h;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public static ChangeQuickRedirect a;
    public static final ThreadPoolExecutor d;
    private static final BlockingQueue<Runnable> i = new LinkedBlockingQueue(128);
    public boolean b;
    public boolean c;
    public ArrayList<String> e;
    public ArrayList<String> f;
    public ArrayList<String> g;
    private boolean h;
    private ArrayList<d> j;
    private g k;
    private c l;
    private final Handler m;

    static {
        ThreadPoolExecutor a2 = com.sankuai.android.jarvis.c.a("dpimage-preload", 1, 1, 30L, TimeUnit.SECONDS, i, new com.dianping.imagemanager.utils.f("dpimage-preload"), new ThreadPoolExecutor.DiscardOldestPolicy());
        d = a2;
        a2.allowCoreThreadTimeOut(true);
    }

    public i(ArrayList<String> arrayList, g gVar) {
        Object[] objArr = {arrayList, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9797299bdfd0c8096595ae1f9f5b631", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9797299bdfd0c8096595ae1f9f5b631");
            return;
        }
        this.h = false;
        this.b = false;
        this.c = false;
        this.l = c.a.a;
        this.m = new Handler(Looper.getMainLooper()) { // from class: com.dianping.imagemanager.utils.downloadphoto.i.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e80f6d53a4f85aef18f730603dfbfcf7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e80f6d53a4f85aef18f730603dfbfcf7");
                } else if (i.this.k == null || i.this.h) {
                } else {
                    switch (message.what) {
                        case 1:
                            g unused = i.this.k;
                            i.this.f.get(message.arg1);
                            i.this.j.get(message.arg1);
                            return;
                        case 2:
                            i.this.k.a(i.this.g.get(message.arg1));
                            return;
                        case 3:
                            g unused2 = i.this.k;
                            ArrayList unused3 = i.this.j;
                            return;
                        case 4:
                            g unused4 = i.this.k;
                            ArrayList unused5 = i.this.j;
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        this.e = new ArrayList<>(arrayList);
        this.k = gVar;
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9ce3a8bb9947b3258b5a456eca88e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9ce3a8bb9947b3258b5a456eca88e8");
            return;
        }
        this.h = true;
        d.remove(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        a aVar;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8886cc0ccd612f8f7e476dccfc19c0d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8886cc0ccd612f8f7e476dccfc19c0d5");
            return;
        }
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.j = new ArrayList<>();
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (this.h) {
                return;
            }
            d dVar = null;
            if (!TextUtils.isEmpty(next)) {
                int i2 = (!this.b || next.endsWith(".gif") || next.endsWith(".mp4")) ? 4 : 0;
                com.dianping.imagemanager.image.loader.e eVar = e.a.a;
                Object[] objArr2 = new Object[2];
                objArr2[c] = next;
                objArr2[1] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect2 = com.dianping.imagemanager.image.loader.e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "39ab55c1fc649685c3fd17fde28fc94b", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "39ab55c1fc649685c3fd17fde28fc94b");
                } else {
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = next;
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.imagemanager.utils.g.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e669a80a238c584244679a0c4ae61a57", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e669a80a238c584244679a0c4ae61a57")).booleanValue();
                    } else {
                        z = next != null && (next.startsWith(AbsApiFactory.HTTP) || next.startsWith(AbsApiFactory.HTTPS));
                    }
                    if (!z) {
                        if (next != null && next.startsWith("content")) {
                            aVar = new b.a(next).d(i2).b;
                        } else {
                            aVar = new f.a(next).d(i2).b;
                        }
                    } else {
                        aVar = new h.a(next).c(i2).b;
                    }
                }
                dVar = this.l.a(aVar);
            }
            if (dVar != null && dVar.h) {
                this.j.add(dVar);
                this.f.add(next);
                Message obtainMessage = this.m.obtainMessage(1);
                obtainMessage.arg1 = this.f.size() - 1;
                obtainMessage.sendToTarget();
            } else {
                this.g.add(next);
                Message obtainMessage2 = this.m.obtainMessage(2);
                obtainMessage2.arg1 = this.g.size() - 1;
                obtainMessage2.sendToTarget();
                if (this.c) {
                    break;
                }
            }
            c = 0;
        }
        if (this.h) {
            return;
        }
        if (this.f.size() == this.e.size()) {
            this.m.obtainMessage(3).sendToTarget();
        } else if (this.f.size() + this.g.size() == this.e.size()) {
            this.m.obtainMessage(4).sendToTarget();
        }
    }
}
