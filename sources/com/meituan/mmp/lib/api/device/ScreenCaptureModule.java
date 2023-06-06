package com.meituan.mmp.lib.api.device;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.mmp.lib.LifecycleActivity;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenCaptureModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private b h;
    private final t i;

    public ScreenCaptureModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bb545a7bae317815c2c84efa7f71b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bb545a7bae317815c2c84efa7f71b9");
            return;
        }
        this.h = null;
        this.i = Privacy.createContentResolver(getContext(), "mmp_default_buzId");
    }

    public static /* synthetic */ boolean a(ScreenCaptureModule screenCaptureModule) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, screenCaptureModule, changeQuickRedirect, false, "e34264ec51d059876210cb733987c8f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, screenCaptureModule, changeQuickRedirect, false, "e34264ec51d059876210cb733987c8f0")).booleanValue();
        }
        Activity a2 = screenCaptureModule.a();
        if (a2 != null && (a2 instanceof LifecycleActivity)) {
            if (((LifecycleActivity) a2).getLifecycle().a().a(d.b.STARTED)) {
                return true;
            }
            com.meituan.mmp.lib.trace.b.b("ScreenCaptureModule", "screen captured but mini program is not in foreground");
            return false;
        }
        return false;
    }

    public static /* synthetic */ void b(ScreenCaptureModule screenCaptureModule) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, screenCaptureModule, changeQuickRedirect, false, "5476ef1cbde1e36b2277c6758b67dfce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, screenCaptureModule, changeQuickRedirect, false, "5476ef1cbde1e36b2277c6758b67dfce");
        } else {
            screenCaptureModule.a("onUserCaptureScreen", null, 0);
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return new String[0];
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d349deffd0f5519dce205e4c751f37", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d349deffd0f5519dce205e4c751f37") : new String[]{"onUserCaptureScreen"};
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faac568fdfcb7d4a5836fa5f40619456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faac568fdfcb7d4a5836fa5f40619456");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eaf06abf469c356d00b47dbc70e933a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eaf06abf469c356d00b47dbc70e933a");
            return;
        }
        j();
        try {
            this.h = new b(null, this);
            this.i.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, (ContentObserver) this.h);
        } catch (Throwable th) {
            this.h = null;
            com.meituan.mmp.lib.trace.b.a("ScreenCaptureModule", th);
        }
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c626c3b9f6d1755f162af48d989708ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c626c3b9f6d1755f162af48d989708ac");
        } else {
            j();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300e6163064f1cd8e5a4dc76d0da5bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300e6163064f1cd8e5a4dc76d0da5bc1");
            return;
        }
        if (this.h != null) {
            this.i.a(this.h);
        }
        this.h = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends ContentObserver {
        public static ChangeQuickRedirect a;
        public final WeakReference<ScreenCaptureModule> b;
        private final String[] c;
        private volatile long d;
        private volatile String e;

        public b(Handler handler, ScreenCaptureModule screenCaptureModule) {
            super(null);
            Object[] objArr = {null, screenCaptureModule};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ef29b6b1620c65e4f0f5c0afe3a76c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ef29b6b1620c65e4f0f5c0afe3a76c9");
                return;
            }
            this.c = new String[]{"screenshot", "截屏", "截图", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
            this.b = new WeakReference<>(screenCaptureModule);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            boolean z2 = false;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e758ee37132151c8c66928653b7ad869", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e758ee37132151c8c66928653b7ad869");
                return;
            }
            super.onChange(z, uri);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ScreenCaptureModule screenCaptureModule = this.b.get();
            if (screenCaptureModule == null || uri == null || !ScreenCaptureModule.a(screenCaptureModule) || currentTimeMillis - this.d <= 1) {
                return;
            }
            this.d = currentTimeMillis;
            if (uri.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) {
                Object[] objArr2 = {uri};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f00a8e72846b08f6cdf785a4f82a7861", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f00a8e72846b08f6cdf785a4f82a7861")).booleanValue();
                } else {
                    a a2 = a(uri);
                    if (a2 != null && !TextUtils.isEmpty(a2.b) && a(a2.b) && !a2.b.equals(this.e)) {
                        this.e = a2.b;
                        z2 = true;
                    }
                }
                if (!z2) {
                    return;
                }
            }
            ScreenCaptureModule.b(screenCaptureModule);
        }

        private boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014c06a3cd39f100fbb8340223ff5778", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014c06a3cd39f100fbb8340223ff5778")).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            for (String str2 : this.c) {
                if (lowerCase.contains(str2)) {
                    return true;
                }
            }
            return false;
        }

        private a a(Uri uri) {
            Cursor cursor;
            Object[] objArr = {uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3408bbd20adc196255bd9b350d365f43", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3408bbd20adc196255bd9b350d365f43");
            }
            t createContentResolver = Privacy.createContentResolver(MMPEnvHelper.getContext(), "mmp_default_buzId");
            if (createContentResolver == null) {
                return null;
            }
            a aVar = new a();
            try {
                cursor = createContentResolver.a(uri, null, null, null, "date_modified DESC LIMIT 1");
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th) {
                            com.meituan.mmp.lib.trace.b.a("ScreenCaptureModule", th, "cursor close error");
                        }
                    }
                    return null;
                }
                try {
                    cursor.moveToFirst();
                    String string = cursor.getString(cursor.getColumnIndex("_display_name"));
                    long j = cursor.getLong(cursor.getColumnIndex("date_modified"));
                    aVar.b = string;
                    aVar.c = j;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th2) {
                            com.meituan.mmp.lib.trace.b.a("ScreenCaptureModule", th2, "cursor close error");
                        }
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        com.meituan.mmp.lib.trace.b.a("ScreenCaptureModule", th, "resolver query error");
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Throwable th4) {
                                com.meituan.mmp.lib.trace.b.a("ScreenCaptureModule", th4, "cursor close error");
                            }
                        }
                        return null;
                    } catch (Throwable th5) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Throwable th6) {
                                com.meituan.mmp.lib.trace.b.a("ScreenCaptureModule", th6, "cursor close error");
                            }
                        }
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                cursor = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;

        public a() {
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a489ed199aa67450b18ac4a6ddddea4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a489ed199aa67450b18ac4a6ddddea4");
            }
            return "ScreenInfo{name='" + this.b + "', time=" + this.c + '}';
        }
    }
}
