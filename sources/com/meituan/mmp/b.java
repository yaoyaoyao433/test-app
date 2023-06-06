package com.meituan.mmp;

import android.content.Context;
import android.os.Handler;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c;
    Map<Context, a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3faace5c93a1e8d60cbb8fa572dc69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3faace5c93a1e8d60cbb8fa572dc69");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public boolean c;
        public Handler d;
        public Runnable e;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21253517f50d34e6c94ddbbe5d3e9e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21253517f50d34e6c94ddbbe5d3e9e4");
                return;
            }
            this.d = new Handler();
            this.b = str;
            this.c = false;
            this.e = new Runnable() { // from class: com.meituan.mmp.b.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0000a61ae9585f20ba0c8221abfaa98b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0000a61ae9585f20ba0c8221abfaa98b");
                        return;
                    }
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "9ad0176b8dac9a9921168cb1c11283d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "9ad0176b8dac9a9921168cb1c11283d2");
                    } else if (aVar.c) {
                    } else {
                        try {
                            aa sniffer = MMPEnvHelper.getSniffer();
                            String str2 = aVar.b;
                            sniffer.a("MMPLaunchTimeout", str2, "default", "mmp launch timeout : " + aVar.b, "");
                        } catch (Error unused) {
                        }
                    }
                }
            };
        }
    }

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4678dbcd8ef3ac4f50fc8af36f61c534", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4678dbcd8ef3ac4f50fc8af36f61c534");
            }
            if (c == null) {
                c = new b();
            }
            return c;
        }
    }
}
