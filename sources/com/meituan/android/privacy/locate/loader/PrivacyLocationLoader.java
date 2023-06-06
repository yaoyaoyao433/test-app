package com.meituan.android.privacy.locate.loader;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LocationLoader;
import com.meituan.android.common.locate.loader.MtLocationLoader;
import com.meituan.android.privacy.impl.a;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.locate.b;
import com.meituan.android.privacy.locate.c;
import com.meituan.android.privacy.locate.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PrivacyLocationLoader<T> extends Loader<T> implements Loader.OnLoadCompleteListener<T> {
    public static ChangeQuickRedirect a;
    public boolean b;
    private Loader<T> c;
    private Handler d;
    private boolean e;
    private boolean f;
    private LoadConfig g;
    private String h;
    private boolean i;
    private boolean j;
    private a.InterfaceC0349a k;
    private c.a l;

    public static /* synthetic */ void a(PrivacyLocationLoader privacyLocationLoader) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyLocationLoader, changeQuickRedirect, false, "44d5b4cdd0c24a5d8e2ad96358d703fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyLocationLoader, changeQuickRedirect, false, "44d5b4cdd0c24a5d8e2ad96358d703fd");
        } else if (privacyLocationLoader.j) {
            privacyLocationLoader.j = false;
            privacyLocationLoader.c.startLoading();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, privacyLocationLoader, changeQuickRedirect2, false, "6efb06b819de52740463f05f3bd7eee6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, privacyLocationLoader, changeQuickRedirect2, false, "6efb06b819de52740463f05f3bd7eee6");
                return;
            }
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.b = privacyLocationLoader.h;
            aVar.c = privacyLocationLoader.f ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
            aVar.l = "recover locating, enter foreground";
            e.a(aVar);
        }
    }

    public static /* synthetic */ void b(PrivacyLocationLoader privacyLocationLoader) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyLocationLoader, changeQuickRedirect, false, "de54ce939fcaffe6b61f5a0201485687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyLocationLoader, changeQuickRedirect, false, "de54ce939fcaffe6b61f5a0201485687");
        } else if (privacyLocationLoader.i || !privacyLocationLoader.e) {
        } else {
            privacyLocationLoader.c.stopLoading();
            privacyLocationLoader.b();
            privacyLocationLoader.j = true;
        }
    }

    public PrivacyLocationLoader(String str, Context context, Loader<T> loader, boolean z, LoadConfig loadConfig, c.a aVar) {
        super(context);
        Object[] objArr = {str, context, loader, Byte.valueOf(z ? (byte) 1 : (byte) 0), loadConfig, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e724e8d2bd529386f72a7830fd6a51cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e724e8d2bd529386f72a7830fd6a51cd");
            return;
        }
        this.b = false;
        this.h = str;
        this.c = loader;
        this.f = z;
        this.g = loadConfig;
        this.l = aVar;
        this.d = new Handler(Looper.getMainLooper());
        try {
            this.i = Boolean.parseBoolean(loadConfig.get("privacy_allow_background"));
        } catch (Throwable unused) {
        }
        this.k = new a.InterfaceC0349a() { // from class: com.meituan.android.privacy.locate.loader.PrivacyLocationLoader.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.impl.a.InterfaceC0349a
            public final void a(final boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a10dd9039d0cdd0612ca9420460a7d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a10dd9039d0cdd0612ca9420460a7d6");
                } else {
                    PrivacyLocationLoader.this.a(new Runnable() { // from class: com.meituan.android.privacy.locate.loader.PrivacyLocationLoader.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "377dbe6f536f244bb0922d7a36d37550", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "377dbe6f536f244bb0922d7a36d37550");
                            } else if (z2) {
                                PrivacyLocationLoader.a(PrivacyLocationLoader.this);
                            } else {
                                PrivacyLocationLoader.b(PrivacyLocationLoader.this);
                            }
                        }
                    });
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6fcb5fe1203a228c84f35e13cd9d17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6fcb5fe1203a228c84f35e13cd9d17");
        } else if (a.c() || this.i) {
            this.c.startLoading();
        } else {
            b();
            this.j = true;
        }
    }

    @Override // android.support.v4.content.Loader
    public void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762ae0239be180b3e919489acafd2953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762ae0239be180b3e919489acafd2953");
        } else if (this.b) {
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.b = this.h;
            aVar.c = this.f ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
            aVar.l = "loader has been destroyed, because lifecycle is destroyed";
            e.a(aVar);
            reset();
        } else if (this.e) {
        } else {
            a.a(this.k);
            this.e = true;
            try {
                this.c.registerListener(0, this);
            } catch (Throwable unused) {
            }
            if (this.f) {
                Class cls = null;
                if (this.c instanceof MtLocationLoader) {
                    cls = MtLocation.class;
                } else if (this.c instanceof LocationLoader) {
                    cls = Location.class;
                }
                b.a(this.h, getContext(), this.g, cls, this, new Runnable() { // from class: com.meituan.android.privacy.locate.loader.PrivacyLocationLoader.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9e09de21fb5eb4222f66523058f20be", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9e09de21fb5eb4222f66523058f20be");
                        } else {
                            PrivacyLocationLoader.this.a(new Runnable() { // from class: com.meituan.android.privacy.locate.loader.PrivacyLocationLoader.2.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18dc8a68e17c6ad04cd2494d053408ab", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18dc8a68e17c6ad04cd2494d053408ab");
                                    } else if (PrivacyLocationLoader.this.e) {
                                        PrivacyLocationLoader.this.a();
                                    }
                                }
                            });
                        }
                    }
                });
                return;
            }
            e.a aVar2 = new e.a();
            aVar2.b = this.h;
            aVar2.d = 0L;
            aVar2.c = this.f ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
            aVar2.i = true;
            aVar2.f = true ^ a.c();
            aVar2.k = "0";
            aVar2.l = "start loading";
            e.a(aVar2);
            a();
        }
    }

    @Override // android.support.v4.content.Loader
    public void onStopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdbbf600a763d7dd5af02db05adcb6e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdbbf600a763d7dd5af02db05adcb6e2");
        } else if (this.e) {
            a.b(this.k);
            this.j = false;
            try {
                this.c.unregisterListener(this);
            } catch (Throwable unused) {
            }
            this.c.stopLoading();
            this.e = false;
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.b = this.h;
            aVar.d = 0L;
            aVar.c = this.f ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
            aVar.l = "stop loading";
            e.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12c573527cede400fe6512de12ef966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12c573527cede400fe6512de12ef966");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.d.post(runnable);
        }
    }

    @Override // android.support.v4.content.Loader.OnLoadCompleteListener
    public void onLoadComplete(@NonNull Loader<T> loader, @Nullable final T t) {
        Object[] objArr = {loader, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355e05641f8d0466d338060f449d6d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355e05641f8d0466d338060f449d6d2f");
            return;
        }
        if (this.l != null && (t instanceof MtLocation)) {
            t = (T) this.l.a((MtLocation) t);
        }
        a(new Runnable() { // from class: com.meituan.android.privacy.locate.loader.PrivacyLocationLoader.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.privacy.locate.loader.PrivacyLocationLoader.AnonymousClass3.run():void");
            }
        });
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121aa5a827be1ea7e401b9715416d3f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121aa5a827be1ea7e401b9715416d3f0");
            return;
        }
        e.a aVar = new e.a();
        aVar.j = false;
        aVar.b = this.h;
        aVar.c = this.f ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
        aVar.l = "stop locating, enter background";
        e.a(aVar);
    }
}
