package com.meituan.android.privacy.locate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a f;
    public volatile MtLocation b;
    public long c;
    public MtLocation d;
    public boolean e;
    private q g;
    private boolean h;
    private long i;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.privacy.locate.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0353a {
        void a(@Nullable MtLocation mtLocation, boolean z);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e84c73ad1d79dfbe4859f5c2b84c6cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e84c73ad1d79dfbe4859f5c2b84c6cd");
            return;
        }
        this.e = true;
        this.i = new Random().nextInt(300000);
    }

    @NonNull
    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25247517b5c2e8baef34522f33a67344", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25247517b5c2e8baef34522f33a67344");
        }
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a();
                }
            }
        }
        return f;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c540fe4c71c095d37a374c14f0f0d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c540fe4c71c095d37a374c14f0f0d6e");
        } else if (this.h) {
        } else {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.g = q.a(context, "privacy_location_channel", 2);
                this.h = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(long j, long j2) {
        long j3;
        boolean z;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2193c76b69ee02b74b0f1cf8d43f4f66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2193c76b69ee02b74b0f1cf8d43f4f66")).booleanValue();
        }
        if (j2 == 900000) {
            j3 = this.i + j2;
            z = true;
        } else {
            j3 = j2;
            z = false;
        }
        boolean z2 = System.currentTimeMillis() - j > j3;
        if (z && z2) {
            this.i = new Random().nextInt(300000);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final Context context, boolean z, final long j, final InterfaceC0353a interfaceC0353a) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), interfaceC0353a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c95a405cfd9b3abdb31a60e84924d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c95a405cfd9b3abdb31a60e84924d6");
        } else {
            com.sankuai.android.jarvis.c.a("privacy-location-read", new Runnable() { // from class: com.meituan.android.privacy.locate.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc416ca30baf046f63708590daf394b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc416ca30baf046f63708590daf394b0");
                        return;
                    }
                    try {
                        a.this.a(context.getApplicationContext());
                        MtLocation a2 = a.this.a(a.this.g);
                        if (a2 != null) {
                            a.this.b = a2;
                        }
                    } catch (Exception unused) {
                    }
                    MtLocation mtLocation = a.this.b;
                    interfaceC0353a.a(mtLocation, (mtLocation == null || a.this.a(mtLocation.getTime(), j)) ? true : true);
                }
            }).start();
        }
    }

    public final MtLocation a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd885c8e57dc0e46665e3b15bd3e899", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd885c8e57dc0e46665e3b15bd3e899");
        }
        try {
            LocationEntity locationEntity = (LocationEntity) new Gson().fromJson(qVar.b("privacy_location_cache_v2_gson", (String) null), (Class<Object>) LocationEntity.class);
            MtLocation mtLocation = locationEntity != null ? locationEntity.toMtLocation() : null;
            if (mtLocation == null || mtLocation.getExtras() == null) {
                return mtLocation;
            }
            mtLocation.getExtras().setClassLoader(MtLocation.class.getClassLoader());
            mtLocation.getExtras().isEmpty();
            return mtLocation;
        } catch (Throwable unused) {
            return null;
        }
    }
}
