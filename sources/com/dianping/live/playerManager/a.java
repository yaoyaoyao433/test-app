package com.dianping.live.playerManager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.dianping.live.live.mrn.b;
import com.dianping.live.live.mrn.d;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a c;
    HashMap<String, d> b;
    private Handler d;
    private Context e;
    private Runnable f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fac0a749f0c8b81a9e5f7ffbef0c2be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fac0a749f0c8b81a9e5f7ffbef0c2be");
            return;
        }
        this.d = new Handler(Looper.getMainLooper());
        this.b = new HashMap<>();
        this.f = new Runnable() { // from class: com.dianping.live.playerManager.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95ea103d7f1c5a3c7ec697af3971d94e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95ea103d7f1c5a3c7ec697af3971d94e");
                    return;
                }
                a.this.b.get("idle_player").a();
                a.this.b.remove("idle_player");
            }
        };
    }

    public static synchronized a a(@NonNull Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "325f91b176477e40ce6849dc16ae521f", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "325f91b176477e40ce6849dc16ae521f");
            }
            if (c == null) {
                a aVar = new a();
                c = aVar;
                aVar.e = context.getApplicationContext();
            }
            return c;
        }
    }

    private void b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1731b5d696023489f51d4f1cd9b9e92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1731b5d696023489f51d4f1cd9b9e92");
            return;
        }
        this.b.put("idle_player", new d(context.getApplicationContext()));
        this.d.postDelayed(this.f, LocationStrategy.LOCATION_TIMEOUT);
    }

    public final d a(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caaccba5b6df4ba0387a60c62e7a2d41", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caaccba5b6df4ba0387a60c62e7a2d41");
        }
        if (b.a().a(context.getApplicationContext())) {
            if (this.b.containsKey(str)) {
                d dVar = this.b.get(str);
                if (dVar != null && !dVar.d) {
                    return this.b.get(str);
                }
                this.b.remove(str);
            }
            if (this.b.containsKey("idle_player")) {
                d dVar2 = this.b.get("idle_player");
                this.b.remove("idle_player");
                this.d.removeCallbacks(this.f);
                this.b.put(str, dVar2);
                return dVar2;
            }
            return b(context, str);
        }
        return null;
    }

    private d b(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7f8656a1e5fa003c50e4e8c24ce8c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7f8656a1e5fa003c50e4e8c24ce8c5");
        }
        d dVar = new d(context.getApplicationContext());
        this.b.put(str, dVar);
        return dVar;
    }

    public final void a(@NonNull Context context, @NonNull d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2887fb4e4534154ef9714f18a927e585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2887fb4e4534154ef9714f18a927e585");
            return;
        }
        dVar.a();
        this.b.remove(dVar.c);
        if (this.b.containsKey("idle_player")) {
            return;
        }
        b(context);
    }
}
