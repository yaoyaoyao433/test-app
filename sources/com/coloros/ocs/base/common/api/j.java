package com.coloros.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.coloros.ocs.base.common.api.a;
import com.coloros.ocs.base.common.api.a.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class j<O extends a.c> implements Handler.Callback {
    private static volatile j d;
    private static Map<a.f, d> e = new ConcurrentHashMap();
    private static Map<a.f, d> f = new ConcurrentHashMap();
    com.coloros.ocs.base.common.b a;
    private Context b;
    private Looper c;

    public static j a(Context context) {
        if (d == null) {
            synchronized (j.class) {
                if (d == null) {
                    HandlerThread handlerThread = new HandlerThread("ColorApiManager", 9);
                    handlerThread.start();
                    d = new j(context, handlerThread.getLooper());
                }
            }
        }
        return d;
    }

    private j(Context context, Looper looper) {
        this.b = context.getApplicationContext();
        this.c = looper;
        this.a = new com.coloros.ocs.base.common.b(this.c, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final c cVar, com.coloros.ocs.base.internal.a aVar) {
        com.coloros.ocs.base.a.b.a(cVar, "colorApi not be null");
        com.coloros.ocs.base.a.b.a(aVar, "clientsettings not be null");
        if (e.containsKey(cVar.a.a())) {
            return;
        }
        com.coloros.ocs.base.a.a.b("ColorApiManager", "addColorClient");
        final k kVar = new k(this.b, cVar.a, cVar.b, aVar);
        kVar.a(new l() { // from class: com.coloros.ocs.base.common.api.j.1
            @Override // com.coloros.ocs.base.common.api.l
            public final void a() {
                j.a(cVar.a.a());
                j.f.put(cVar.a.a(), kVar);
            }
        });
        com.coloros.ocs.base.a.a.a("TAG", "getClientKey " + cVar.a.a());
        e.put(cVar.a.a(), kVar);
        com.coloros.ocs.base.a.a.b("ColorApiManager", "handlerConnect");
        Message obtainMessage = this.a.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = cVar;
        this.a.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(c cVar, final f fVar, @Nullable Handler handler) {
        d dVar;
        d dVar2;
        com.coloros.ocs.base.a.b.a(cVar, "colorApi not be null");
        if (!e.containsKey(cVar.a.a()) || (dVar = e.get(cVar.a.a())) == null) {
            return;
        }
        com.coloros.ocs.base.a.b.a(cVar, "colorApi not be null");
        if ((!e.containsKey(cVar.a.a()) || (dVar2 = e.get(cVar.a.a())) == null) ? false : dVar2.c()) {
            new Handler(handler == null ? Looper.getMainLooper() : handler.getLooper()) { // from class: com.coloros.ocs.base.common.api.j.2
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    fVar.onConnectionSucceed();
                }
            }.sendEmptyMessage(0);
        } else {
            dVar.a(fVar, handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(c cVar, g<T> gVar) {
        d dVar;
        com.coloros.ocs.base.a.a.b("ColorApiManager", "addQueue " + cVar.getClass().getSimpleName());
        com.coloros.ocs.base.a.b.a(cVar, "colorApi not be null");
        if (e.containsKey(cVar.a.a())) {
            d dVar2 = e.get(cVar.a.a());
            if (dVar2 != null) {
                dVar2.a(gVar);
            }
        } else if (!f.containsKey(cVar.a.a()) || (dVar = f.get(cVar.a.a())) == null || gVar.b == null) {
        } else {
            int i = dVar.d() != null ? dVar.d().a : -1;
            gVar.b.a(gVar.a, i, com.coloros.ocs.base.common.constant.a.a(i));
        }
    }

    static void a(a.f fVar) {
        e.remove(fVar);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        d dVar;
        d dVar2;
        com.coloros.ocs.base.a.a.b("ColorApiManager", "handle message " + message.what);
        switch (message.what) {
            case 0:
                com.coloros.ocs.base.a.a.b("ColorApiManager", "handle connect");
                c cVar = (c) message.obj;
                if (cVar == null || cVar.a.a() == null || (dVar = e.get(cVar.a.a())) == null) {
                    return false;
                }
                com.coloros.ocs.base.a.a.a("ColorApiManager", "colorApiClient is not null,will connect");
                dVar.a();
                return false;
            case 1:
                c cVar2 = (c) message.obj;
                if (cVar2 == null || cVar2.a.a() == null || (dVar2 = e.get(cVar2.a.a())) == null) {
                    return false;
                }
                com.coloros.ocs.base.a.a.a("ColorApiManager", "colorApiClient is not null,will disconnect");
                dVar2.b();
                a(cVar2.a.a());
                f.remove(cVar2.a.a());
                return false;
            default:
                return false;
        }
    }
}
