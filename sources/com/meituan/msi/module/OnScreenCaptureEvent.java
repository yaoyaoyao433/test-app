package com.meituan.msi.module;

import android.arch.lifecycle.d;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OnScreenCaptureEvent implements ApiModule {
    public static ChangeQuickRedirect a;
    private a b;
    private t c;
    private Context d;
    private e e;
    private com.meituan.msi.context.a f;

    public static /* synthetic */ boolean a(OnScreenCaptureEvent onScreenCaptureEvent) {
        d.b c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, onScreenCaptureEvent, changeQuickRedirect, false, "ec52f531d3aa3dfed508543d23e49ab9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, onScreenCaptureEvent, changeQuickRedirect, false, "ec52f531d3aa3dfed508543d23e49ab9")).booleanValue();
        }
        if (onScreenCaptureEvent.f == null || (c = onScreenCaptureEvent.f.c()) == null) {
            return false;
        }
        if (c.a(d.b.STARTED)) {
            return true;
        }
        com.meituan.msi.log.a.a("screen captured but mini program is not in foreground");
        return false;
    }

    public static /* synthetic */ void b(OnScreenCaptureEvent onScreenCaptureEvent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, onScreenCaptureEvent, changeQuickRedirect, false, "d8b8cc6626d6944a384deab2d15acce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, onScreenCaptureEvent, changeQuickRedirect, false, "d8b8cc6626d6944a384deab2d15acce1");
        } else {
            onScreenCaptureEvent.e.a("onUserCaptureScreen", (Object) "");
        }
    }

    public OnScreenCaptureEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab8957eb637346887f627b5221cc30a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab8957eb637346887f627b5221cc30a");
        } else {
            this.b = null;
        }
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4480474489bf791194e885fc0fe576a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4480474489bf791194e885fc0fe576a");
        } else {
            this.f = msiContext.getActivityContext();
        }
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81505d57a853c0df9b41eec97b06adaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81505d57a853c0df9b41eec97b06adaf");
            return;
        }
        this.e = eVar;
        this.d = context;
        this.c = Privacy.createContentResolver(this.d, "msi_default_buzId");
        a(context);
        this.b = new a(null, this);
        this.c.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, (ContentObserver) this.b);
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83dcb4881a8f38c674546300ea04601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83dcb4881a8f38c674546300ea04601");
            return;
        }
        if (this.b != null && this.c != null) {
            this.c.a(this.b);
        }
        this.b = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends ContentObserver {
        public static ChangeQuickRedirect a;
        public final WeakReference<OnScreenCaptureEvent> b;
        private final String[] c;
        private volatile long d;

        public a(Handler handler, OnScreenCaptureEvent onScreenCaptureEvent) {
            super(null);
            Object[] objArr = {null, onScreenCaptureEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be7ea5f52ef46e239ea059257c0e521", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be7ea5f52ef46e239ea059257c0e521");
                return;
            }
            this.c = new String[]{"screenshot", "截屏", "截图", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
            this.b = new WeakReference<>(onScreenCaptureEvent);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58ccc93b70852cb077fcd6aba4db947", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58ccc93b70852cb077fcd6aba4db947");
                return;
            }
            super.onChange(z, uri);
            OnScreenCaptureEvent onScreenCaptureEvent = this.b.get();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (onScreenCaptureEvent == null || uri == null || !OnScreenCaptureEvent.a(onScreenCaptureEvent) || currentTimeMillis - this.d <= 1) {
                return;
            }
            this.d = currentTimeMillis;
            if (uri.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI) || onScreenCaptureEvent == null) {
                return;
            }
            OnScreenCaptureEvent.b(onScreenCaptureEvent);
        }
    }
}
