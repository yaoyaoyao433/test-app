package com.meituan.android.privacy.proxy;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m implements com.meituan.android.privacy.interfaces.s {
    public static ChangeQuickRedirect a;
    ClipboardManager b;
    private k c;
    private com.meituan.android.privacy.interfaces.b d;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9dede307afbe2d48cb928afc93dfa8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9dede307afbe2d48cb928afc93dfa8c");
        }
    }

    void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ddc61505cc49c29d77b16d02ecc253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ddc61505cc49c29d77b16d02ecc253");
        }
    }

    @MainThread
    public m(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e8f26138bbe062d767cb8570c173a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e8f26138bbe062d767cb8570c173a1");
        }
    }

    @MainThread
    public m(Context context, com.meituan.android.privacy.interfaces.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c484c95a51e8e2bee5ec115369ec3c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c484c95a51e8e2bee5ec115369ec3c8");
            return;
        }
        this.c = k.a();
        this.c.f = bVar;
        this.d = bVar;
        if (context != null) {
            try {
                this.b = (ClipboardManager) context.getSystemService("clipboard");
            } catch (Throwable th) {
                a(-1, "constructor", th);
                com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 constructor:" + th.getMessage());
                th.printStackTrace();
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final void a(String str, @NonNull ClipData clipData) {
        Object[] objArr = {str, clipData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f85afc4e27de970019010632898a503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f85afc4e27de970019010632898a503");
        } else if (this.b != null && a(str, "clpb.setPrimClip")) {
            this.c.a(clipData);
            try {
                this.b.setPrimaryClip(clipData);
                f("clpb.setPrimClip");
            } catch (Exception e) {
                a(-5, "clpb.setPrimClip", e);
                com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 setPrimaryClip:" + e.getMessage());
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.s
    @RequiresApi(api = 28)
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cce81afb6934f6af082a9993d0d4101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cce81afb6934f6af082a9993d0d4101");
        } else if (this.b != null && a(str, "clpb.clearPrimClip")) {
            k kVar = this.c;
            kVar.b = null;
            kVar.c = null;
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.b.clearPrimaryClip();
                } else {
                    this.b.setPrimaryClip(ClipData.newPlainText(null, ""));
                }
                f("clpb.clearPrimClip");
            } catch (Exception e) {
                a(-5, "clpb.clearPrimClip", e);
                com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 clearPrimaryClip:" + e.getMessage());
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.s
    @Nullable
    public final ClipData b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1e0d294451d4229e86a389ba5dfdf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClipData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1e0d294451d4229e86a389ba5dfdf3");
        }
        if (this.b == null || !a(str, "clpb.getPrimClip")) {
            return null;
        }
        k kVar = this.c;
        k.a aVar = new k.a() { // from class: com.meituan.android.privacy.proxy.m.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.k.a
            public final ClipData a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bc247c2a2d92c5c2a208bd6c5da27b8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ClipData) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bc247c2a2d92c5c2a208bd6c5da27b8");
                }
                try {
                    ClipData primaryClip = m.this.b.getPrimaryClip();
                    m.this.f("clpb.getPrimClip");
                    return primaryClip;
                } catch (Exception e) {
                    m.this.a(-5, "clpb.getPrimClip", e);
                    com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 getPrimaryClip:" + e.getMessage());
                    return null;
                }
            }
        };
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "ae1245f633578edb7656099801dcf36d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClipData) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "ae1245f633578edb7656099801dcf36d");
        }
        if (kVar.d) {
            ClipData a2 = aVar.a();
            kVar.a(a2);
            return a2;
        }
        kVar.a("clpb.getPrimClip");
        return kVar.b;
    }

    @Override // com.meituan.android.privacy.interfaces.s
    @Nullable
    public final ClipDescription c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e4f99f92097aeb4603d0259e1c3cc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClipDescription) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e4f99f92097aeb4603d0259e1c3cc0");
        }
        if (this.b != null && a(str, "clpb.getPrimClipDescrip")) {
            k kVar = this.c;
            k.b bVar = new k.b() { // from class: com.meituan.android.privacy.proxy.m.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.k.b
                public final ClipDescription a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a09c588eb2244d223653a6ab0053df9", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ClipDescription) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a09c588eb2244d223653a6ab0053df9");
                    }
                    try {
                        ClipDescription primaryClipDescription = m.this.b.getPrimaryClipDescription();
                        m.this.f("clpb.getPrimClipDescrip");
                        return primaryClipDescription;
                    } catch (Exception e) {
                        m.this.a(-5, "clpb.getPrimClipDescrip", e);
                        com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 getPrimaryClipDescription:" + e.getMessage());
                        return null;
                    }
                }
            };
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "06d8a4f376c8368f0be0c8a9348295e0", RobustBitConfig.DEFAULT_VALUE)) {
                return (ClipDescription) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "06d8a4f376c8368f0be0c8a9348295e0");
            }
            if (kVar.e) {
                ClipDescription a2 = bVar.a();
                kVar.c = a2;
                kVar.e = false;
                return a2;
            }
            kVar.a("clpb.getPrimClipDescrip");
            return kVar.c;
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e759ed1bd50760cba57ad33945245e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e759ed1bd50760cba57ad33945245e")).booleanValue();
        }
        if (this.b != null && a(str, "clpb.hasPrimClip")) {
            try {
                boolean hasPrimaryClip = this.b.hasPrimaryClip();
                f("clpb.hasPrimClip");
                return hasPrimaryClip;
            } catch (Exception e) {
                a(-5, "clpb.hasPrimClip", e);
                com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 hasPrimaryClip:" + e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final CharSequence e(String str) {
        ClipData a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7eeba4fa30ff86a5e9b28c9b00518e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7eeba4fa30ff86a5e9b28c9b00518e");
        }
        if (this.b == null || !a(str, "clpb.getTxt")) {
            return "";
        }
        k kVar = this.c;
        k.a aVar = new k.a() { // from class: com.meituan.android.privacy.proxy.m.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.k.a
            public final ClipData a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2459fbd883aa28ae095b3d6bd0091b5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ClipData) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2459fbd883aa28ae095b3d6bd0091b5");
                }
                try {
                    ClipData primaryClip = m.this.b.getPrimaryClip();
                    m.this.f("clpb.getTxt");
                    return primaryClip;
                } catch (Exception e) {
                    m.this.a(-5, "clpb.getTxt", e);
                    com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 getText:" + e.getMessage());
                    return null;
                }
            }
        };
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "7fe0c0afc2b95188dc2178f197d0343e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "7fe0c0afc2b95188dc2178f197d0343e");
        }
        if (kVar.d && (a2 = aVar.a()) != null && a2.getItemCount() > 0) {
            kVar.a(a2);
            return a2.getItemAt(0).getText();
        } else if (kVar.b == null || kVar.b.getItemCount() <= 0) {
            return "";
        } else {
            CharSequence text = kVar.b.getItemAt(0).getText();
            kVar.a("clpb.getTxt");
            return text;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final void a(String str, CharSequence charSequence) {
        Object[] objArr = {str, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1376cb000e81d1f77a56ad8419363ab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1376cb000e81d1f77a56ad8419363ab0");
        } else if (this.b != null && a(str, "clpb.setTxt")) {
            k kVar = this.c;
            Object[] objArr2 = {charSequence};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "138000d6fa58a26601889f0e68d31d9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "138000d6fa58a26601889f0e68d31d9c");
            } else {
                kVar.b = ClipData.newPlainText("", charSequence);
                kVar.d = false;
            }
            try {
                this.b.setText(charSequence);
                f("clpb.setTxt");
            } catch (Exception e) {
                a(-5, "clpb.setTxt", e);
                com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 setText:" + e.getMessage());
            }
        }
    }

    private boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74fc33a71edcacef2215eb59ce5048d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74fc33a71edcacef2215eb59ce5048d")).booleanValue();
        }
        if (!com.meituan.android.privacy.impl.a.c()) {
            a(-2, str2, null);
            com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 " + str2 + " fail, because of operate in background");
            return false;
        } else if (!z.a(PermissionGuard.PERMISSION_CLIPBOARD, str, str2)) {
            a(-3, str2, null);
            com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 " + str2 + " fail, because of no permission");
            return false;
        } else if (com.meituan.android.privacy.interfaces.config.d.a(str, PermissionGuard.PERMISSION_CLIPBOARD, str2).b) {
            return true;
        } else {
            a(-4, str2, null);
            com.meituan.android.privacy.impl.b.a("MtClipboardManagerImpl2 " + str2 + " fail, because of api policy not enable");
            return false;
        }
    }
}
