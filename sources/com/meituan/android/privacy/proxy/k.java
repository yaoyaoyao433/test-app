package com.meituan.android.privacy.proxy;

import android.content.ClipData;
import android.content.ClipDescription;
import com.meituan.android.privacy.impl.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class k {
    public static ChangeQuickRedirect a;
    private static volatile k g;
    ClipData b;
    ClipDescription c;
    boolean d;
    boolean e;
    com.meituan.android.privacy.interfaces.b f;
    private a.InterfaceC0349a h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        ClipData a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        ClipDescription a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1de169dfd26c5d27aa2ab4760d0da5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1de169dfd26c5d27aa2ab4760d0da5");
        }
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae3872fade7c0fe5a02cfa72c6e2d5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae3872fade7c0fe5a02cfa72c6e2d5d");
            return;
        }
        this.d = true;
        this.e = true;
        this.h = new a.InterfaceC0349a() { // from class: com.meituan.android.privacy.proxy.k.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.impl.a.InterfaceC0349a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "641dc7672092417b34d80b59aefba7e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "641dc7672092417b34d80b59aefba7e8");
                } else if (z) {
                    k kVar = k.this;
                    kVar.d = true;
                    kVar.e = true;
                }
            }
        };
        com.meituan.android.privacy.impl.a.a(this.h);
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1726f9524e7897900d76af9873f7b6b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1726f9524e7897900d76af9873f7b6b1");
        }
        if (g == null) {
            synchronized (k.class) {
                if (g == null) {
                    g = new k();
                }
            }
        }
        return g;
    }

    public final void a(ClipData clipData) {
        this.b = clipData;
        this.d = false;
    }
}
