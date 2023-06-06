package com.meituan.android.screenshot.manager;

import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.android.screenshot.task.ScreenShotProcessorTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b i;
    public boolean b;
    public a c;
    boolean d;
    public Application e;
    long f;
    public com.meituan.android.screenshot.manager.a g;
    public boolean h;
    private ScreenShotProcessorTask j;

    public static /* synthetic */ void a(b bVar, Context context, Uri uri) {
        com.meituan.android.screenshot.observer.a aVar;
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "cac60838c007e341aecacc3d76f03c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "cac60838c007e341aecacc3d76f03c88");
        } else if (bVar.h) {
        } else {
            bVar.h = true;
            bVar.j = new ScreenShotProcessorTask(context, uri, bVar.f);
            bVar.j.execute(new Void[0]);
            if (bVar.g != null && bVar.g.c != null) {
                bVar.g.c.a(bVar.b());
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.screenshot.observer.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51fc7d89cd4591d9ae806c00c9a4c56f", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.meituan.android.screenshot.observer.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51fc7d89cd4591d9ae806c00c9a4c56f");
            } else {
                if (com.meituan.android.screenshot.observer.a.b == null) {
                    com.meituan.android.screenshot.observer.a.b = new com.meituan.android.screenshot.observer.a();
                }
                aVar = com.meituan.android.screenshot.observer.a.b;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.screenshot.observer.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e4fb4e3fcba1688592111dc675507c91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e4fb4e3fcba1688592111dc675507c91");
                return;
            }
            Iterator<Object> it = aVar.c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58ce6425a62ac19bb97e56cd396c7814", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58ce6425a62ac19bb97e56cd396c7814");
        }
        if (i == null) {
            i = new b();
        }
        return i;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225fc26feb4d84380b7ef688bfc2ce12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225fc26feb4d84380b7ef688bfc2ce12");
            return;
        }
        this.b = true;
        this.d = false;
        this.h = false;
    }

    public void a(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ae58bb849d9e4bca2930bfdddd2ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ae58bb849d9e4bca2930bfdddd2ba2");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(c.a(), new Runnable() { // from class: com.meituan.android.screenshot.manager.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    t createContentResolver;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c00e9b4973a280688d1976ed770acc0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c00e9b4973a280688d1976ed770acc0");
                        return;
                    }
                    try {
                        if (com.meituan.android.screenshot.utils.b.a() && (createContentResolver = Privacy.createContentResolver(application, "pt-79f2490e9f1e7840")) != null) {
                            createContentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, (ContentObserver) b.this.c);
                            b.this.d = true;
                        }
                    } catch (Exception e) {
                        com.meituan.android.screenshot.utils.a.a(e);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends ContentObserver {
        public static ChangeQuickRedirect a;
        private Application c;

        public a(Application application, Handler handler) {
            super(handler);
            Object[] objArr = {b.this, application, handler};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cdb99e7447c307ccb46a9f72a684ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cdb99e7447c307ccb46a9f72a684ae");
            } else {
                this.c = application;
            }
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            boolean z2 = false;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267341ec4798c7ae5ad0f2f00fa7043b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267341ec4798c7ae5ad0f2f00fa7043b");
            } else if (b.this.b && com.meituan.android.screenshot.utils.b.a() && !com.meituan.android.screenshot.utils.b.b().contains(b.this.b())) {
                b.this.f = System.currentTimeMillis() / 1000;
                if (uri == null || !uri.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) {
                    return;
                }
                b bVar = b.this;
                Application application = this.c;
                Object[] objArr2 = {application};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f5773dbff40daeab56bc522438a9533a", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f5773dbff40daeab56bc522438a9533a")).booleanValue();
                } else if (ActivityCompat.checkSelfPermission(application, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    z2 = true;
                }
                if (z2) {
                    b.a(b.this, this.c, uri);
                }
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f427feb951e29a4779a2db973382484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f427feb951e29a4779a2db973382484");
            return;
        }
        this.b = z;
        if (this.b && !this.d) {
            a(this.e);
        } else if (this.b || !this.d) {
        } else {
            Application application = this.e;
            Object[] objArr2 = {application};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b926e8caf1712a11e48b0c938df9f75a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b926e8caf1712a11e48b0c938df9f75a");
                return;
            }
            try {
                t createContentResolver = Privacy.createContentResolver(application, "pt-79f2490e9f1e7840");
                if (createContentResolver != null) {
                    createContentResolver.a(this.c);
                    this.d = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af744e24f78e95cfecc41b6476aa6bf5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af744e24f78e95cfecc41b6476aa6bf5") : com.meituan.android.base.share.b.a();
    }
}
