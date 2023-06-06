package com.meituan.android.neohybrid.core.hook;

import android.os.Handler;
import android.os.Looper;
import com.meituan.android.neohybrid.core.horn.a;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.util.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class WebViewCreateHooker {
    public static ChangeQuickRedirect a;
    public volatile int b;
    boolean c;
    public List<Runnable> d;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface WebViewCreateState {
        public static final int STATE_DISABLE = -1;
        public static final int STATE_INITIALIZED = 0;
        public static final int STATE_NOT_CREATED = 1;
        public static final int STATE_ONCE_CREATED = 2;
    }

    public /* synthetic */ WebViewCreateHooker(AnonymousClass1 anonymousClass1) {
        this();
    }

    public WebViewCreateHooker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e22bb14b548baccbc12479b5569463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e22bb14b548baccbc12479b5569463");
            return;
        }
        this.b = 0;
        this.c = false;
    }

    public static WebViewCreateHooker a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "025810dbcbc31d627d51c5aef4d99091", RobustBitConfig.DEFAULT_VALUE) ? (WebViewCreateHooker) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "025810dbcbc31d627d51c5aef4d99091") : a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.core.hook.WebViewCreateHooker$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements a.b<NeoHornConfig> {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.meituan.android.neohybrid.core.horn.a.b
        public final /* synthetic */ void a(Class cls, NeoHornConfig neoHornConfig) {
            Handler handler;
            NeoHornConfig neoHornConfig2 = neoHornConfig;
            Object[] objArr = {cls, neoHornConfig2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a828dddd88aa3bfd784dabb9c704d58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a828dddd88aa3bfd784dabb9c704d58");
                return;
            }
            if (neoHornConfig2.isEnableWebViewCreateHook()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cd1733241e0e4f69ad596e6828dfb667", RobustBitConfig.DEFAULT_VALUE)) {
                    handler = (Handler) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cd1733241e0e4f69ad596e6828dfb667");
                } else {
                    if (b.b == null) {
                        b.b = new Handler(Looper.getMainLooper());
                    }
                    handler = b.b;
                }
                handler.post(com.meituan.android.neohybrid.core.hook.a.a(this));
            } else {
                WebViewCreateHooker.this.b = -1;
                if (WebViewCreateHooker.this.d != null) {
                    WebViewCreateHooker.this.d.clear();
                }
            }
            com.meituan.android.neohybrid.core.horn.a a2 = com.meituan.android.neohybrid.core.horn.a.a();
            Object[] objArr3 = {NeoHornConfig.class, this};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.core.horn.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "a5a0c9bb637718f2808599036254c74b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "a5a0c9bb637718f2808599036254c74b");
                return;
            }
            List<a.b> list = a2.c.get(NeoHornConfig.class);
            if (list != null) {
                list.remove(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final WebViewCreateHooker a = new WebViewCreateHooker(null);
    }
}
