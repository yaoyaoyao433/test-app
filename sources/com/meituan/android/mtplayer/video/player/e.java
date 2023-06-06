package com.meituan.android.mtplayer.video.player;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.mtplayer.video.entity.MtPlayerAsyncConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private volatile MtPlayerAsyncConfig c;

    public /* synthetic */ e(AnonymousClass1 anonymousClass1) {
        this();
    }

    public e() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final e a = new e(null);
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3133267ec162803eb31ec7fe4db17f6", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3133267ec162803eb31ec7fe4db17f6") : a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mtplayer.video.player.e$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements HornCallback {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ e b;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a78a6f4927e8e0cd1f2285f994ece2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a78a6f4927e8e0cd1f2285f994ece2");
                return;
            }
            synchronized (e.class) {
                if (z) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                Object[] objArr2 = {"mtplayer_async_mode_config", str};
                                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mtplayer.video.utils.a.a;
                                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aaa73a5b2788e4ea2bc327cc505d63f1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aaa73a5b2788e4ea2bc327cc505d63f1");
                                } else {
                                    try {
                                        com.dianping.networklog.c.a("mtplayer_async_mode_config: " + str, 3);
                                    } catch (Exception unused) {
                                    }
                                }
                                this.b.c = (MtPlayerAsyncConfig) new Gson().fromJson(str, (Class<Object>) MtPlayerAsyncConfig.class);
                                this.b.c.init();
                            } catch (Exception unused2) {
                                this.b.c = null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b.c = null;
            }
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc49b0fb8d3b976881bbabcfd61201d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc49b0fb8d3b976881bbabcfd61201d9")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (e.class) {
            if (this.c != null && !this.c.businessSet.isEmpty()) {
                return this.c.asyncModeEnabled && this.c.businessSet.contains(str);
            }
            return false;
        }
    }
}
