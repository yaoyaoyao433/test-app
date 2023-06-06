package com.dianping.agentsdk.framework;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ar {
    public static ChangeQuickRedirect a;
    protected as b;
    protected HashMap<String, rx.subjects.e> c;
    protected at d;
    public boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        Object handleMessage(Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        Object a(String str, Object obj);
    }

    public ar() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8d181ee8ee7289613d728180ec25b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8d181ee8ee7289613d728180ec25b0");
        }
    }

    private ar(Bundle bundle) {
        this(null, true);
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e92ff20173d3e13dc5b79c3ab06ff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e92ff20173d3e13dc5b79c3ab06ff8");
        }
    }

    private ar(Bundle bundle, boolean z) {
        Object[] objArr = {bundle, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564b54d29325f76aecd6450bafbf3a97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564b54d29325f76aecd6450bafbf3a97");
            return;
        }
        this.e = false;
        this.b = new as(bundle, true);
        this.c = new HashMap<>();
        this.d = new at();
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98761bb4298a5e0ccd5d447e7295bfeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98761bb4298a5e0ccd5d447e7295bfeb");
            return;
        }
        if (this.b == null) {
            this.b = new as();
        }
        this.b.a(bundle);
        if (this.d == null) {
            this.d = new at();
        }
        at atVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = at.a;
        if (PatchProxy.isSupport(objArr2, atVar, changeQuickRedirect2, false, "ec05cdd48528a163a702ea06234c4cbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, atVar, changeQuickRedirect2, false, "ec05cdd48528a163a702ea06234c4cbd");
        }
    }

    public final void b(Bundle bundle) {
        Bundle a2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359eb22c82352e7af976416597902312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359eb22c82352e7af976416597902312");
        } else if (bundle != null) {
            as asVar = this.b;
            Object[] objArr2 = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = as.a;
            if (PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "e575a2b5b568a92afa0493befc20828f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "e575a2b5b568a92afa0493befc20828f");
            } else if (bundle == null || (a2 = asVar.a()) == null || a2.size() <= 0) {
            } else {
                bundle.putBundle("White_Board_Persist_Data", a2);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9789e55d0f3572120b03da55b973d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9789e55d0f3572120b03da55b973d13");
            return;
        }
        this.c.clear();
        as asVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = as.a;
        if (PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "2160b79e80203f2f2db0dbb03f1698d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "2160b79e80203f2f2db0dbb03f1698d1");
        } else {
            asVar.c();
        }
        this.d.a();
    }

    public final as b() {
        return this.b;
    }

    public final ArrayList<Object> a(@NonNull String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a42049ec66a3b3b6b619cfd639e0cfe", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a42049ec66a3b3b6b619cfd639e0cfe") : this.d.a(str, obj);
    }

    public final String a(@NonNull String str, @NonNull a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380b4dc141d75ca2feb64e23bc5b8889", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380b4dc141d75ca2feb64e23bc5b8889") : this.d.a(str, aVar);
    }

    public final void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e460c4f4ecd01d687b626b9579d167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e460c4f4ecd01d687b626b9579d167");
        } else {
            this.d.a(str);
        }
    }

    public final void b(@NonNull String str, @NonNull a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb3a2f34d5bc24a922ab68e4c6c89f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb3a2f34d5bc24a922ab68e4c6c89f8");
        } else {
            this.d.b(str, aVar);
        }
    }

    public final void a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9665d116ad33a0f4961c524a70399f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9665d116ad33a0f4961c524a70399f9");
        } else {
            this.d.a(aVar);
        }
    }

    public final rx.d b(String str) {
        rx.subjects.e g;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85b29742de60080d61fc7900b0476d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85b29742de60080d61fc7900b0476d1");
        }
        if (this.c.containsKey(str)) {
            g = this.c.get(str);
        } else {
            g = rx.subjects.b.g();
            this.c.put(str, g);
        }
        return c(str) != null ? rx.d.a(rx.d.a(c(str)), g) : g;
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e03a564bdf8fd4524bc2f5df15c8c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e03a564bdf8fd4524bc2f5df15c8c53");
        } else if (this.c.containsKey(str)) {
            this.c.get(str).onNext(this.b.a(str));
        }
    }

    public final Object c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c81edbb360adf1aa1f121737f57aedb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c81edbb360adf1aa1f121737f57aedb") : this.b.a(str);
    }

    public final void a(@Nullable String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1fc47c374c0a052c12d8594a30a91d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1fc47c374c0a052c12d8594a30a91d");
            return;
        }
        boolean z2 = this.e;
        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7eb6e86d19e33d598052c2b3652281a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7eb6e86d19e33d598052c2b3652281a9");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "22e74856c7682b6ad76c1df3b9d33f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "22e74856c7682b6ad76c1df3b9d33f54");
        } else {
            asVar.a(str, Boolean.valueOf(z), z2);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable boolean[] zArr) {
        Object[] objArr = {str, zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c41adbad88f1696fd5521bac0420271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c41adbad88f1696fd5521bac0420271");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, zArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83363927ff2b22dcde5a9788ceb3dbf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83363927ff2b22dcde5a9788ceb3dbf4");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, zArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "1334e7407cde6b7b4535e51f2fe04010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "1334e7407cde6b7b4535e51f2fe04010");
        } else {
            asVar.a(str, zArr, z);
        }
        f(str);
    }

    public final void a(@Nullable String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2628c55180f1fe8b5d3913abf4326e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2628c55180f1fe8b5d3913abf4326e2");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7427d5cd36b8882640cf36b2ed73f771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7427d5cd36b8882640cf36b2ed73f771");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "07eebc2ab25cdc83178d3b426b2d5e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "07eebc2ab25cdc83178d3b426b2d5e9d");
        } else {
            asVar.a(str, Integer.valueOf(i), z);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable int[] iArr) {
        Object[] objArr = {str, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76001273d7d51b1e71b339fa3f80239e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76001273d7d51b1e71b339fa3f80239e");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3ced40a5069e843b12aa19035fc0343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3ced40a5069e843b12aa19035fc0343");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "07e1afd149cd7ec1c35f7173aaf5361f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "07e1afd149cd7ec1c35f7173aaf5361f");
        } else {
            asVar.a(str, iArr, z);
        }
        f(str);
    }

    public final void a(@Nullable String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5255d6837ae9221402085343867b5458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5255d6837ae9221402085343867b5458");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78778e1453725cc6bd758a8c06798172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78778e1453725cc6bd758a8c06798172");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "6d3d35f1a7c9a22c55d7b34caba58362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "6d3d35f1a7c9a22c55d7b34caba58362");
        } else {
            asVar.a(str, Float.valueOf(f), z);
        }
        f(str);
    }

    public final void a(@Nullable String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79c11b744163c1b3c2b32d4cf488acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79c11b744163c1b3c2b32d4cf488acc");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f862cf1e545889f4ba53f4edd021f08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f862cf1e545889f4ba53f4edd021f08");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "cdf0499deed941d9bf5b15c7fe45b690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "cdf0499deed941d9bf5b15c7fe45b690");
        } else {
            asVar.a(str, Double.valueOf(d), z);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable double[] dArr) {
        Object[] objArr = {str, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab68039f21ef18cd7c0fe083491fee94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab68039f21ef18cd7c0fe083491fee94");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, dArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03d72c38a4091ccb1d45b77db1e9e63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03d72c38a4091ccb1d45b77db1e9e63f");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, dArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "f2914cd481ef2941b830a2ac92b9d6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "f2914cd481ef2941b830a2ac92b9d6ed");
        } else {
            asVar.a(str, dArr, z);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048e200ae47c014baaebc276b0ec791b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048e200ae47c014baaebc276b0ec791b");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03bdf15a57378e1c3a1d59661d2d151b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03bdf15a57378e1c3a1d59661d2d151b");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "70aa1ee630929f906e5bbee73c9aa2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "70aa1ee630929f906e5bbee73c9aa2c5");
        } else {
            asVar.a(str, str2, z);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751092007cc6539f19f90e7e48b0a824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751092007cc6539f19f90e7e48b0a824");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "345c5406d23c2d73b5e6079e1812dd97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "345c5406d23c2d73b5e6079e1812dd97");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "da2986511a22bc28811404c3e22d0e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "da2986511a22bc28811404c3e22d0e74");
        } else {
            asVar.a(str, strArr, z);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable ArrayList<? extends Parcelable> arrayList) {
        Object[] objArr = {str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371c040272436c959958732142b6292b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371c040272436c959958732142b6292b");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c95fceb7ad212bf1c15cd6bc42edbfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c95fceb7ad212bf1c15cd6bc42edbfe");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "a79a4b1f432502c9921b0146fc034b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "a79a4b1f432502c9921b0146fc034b3e");
        } else {
            asVar.a(str, arrayList, z);
        }
        f(str);
    }

    public final void a(@Nullable String str, @Nullable Serializable serializable) {
        Object[] objArr = {str, serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c133b1742f97d00a288d3c78588213d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c133b1742f97d00a288d3c78588213d2");
            return;
        }
        boolean z = this.e;
        Object[] objArr2 = {str, serializable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cf19b5a89cf3401783d6b49109843dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cf19b5a89cf3401783d6b49109843dc");
            return;
        }
        as asVar = this.b;
        Object[] objArr3 = {str, serializable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = as.a;
        if (PatchProxy.isSupport(objArr3, asVar, changeQuickRedirect3, false, "e030295121136cf395409cd2c6462b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, asVar, changeQuickRedirect3, false, "e030295121136cf395409cd2c6462b47");
        } else {
            asVar.a(str, serializable, z);
        }
        f(str);
    }

    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43604a98bfc95147362c63dc3ba55ede", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43604a98bfc95147362c63dc3ba55ede")).booleanValue() : this.b.a(str, false);
    }

    public final boolean b(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b80ab8adc8e2d47cc14afa88561d99b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b80ab8adc8e2d47cc14afa88561d99b")).booleanValue() : this.b.a(str, true);
    }

    public final Serializable e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c61f8b0485ca03f454c281ba3afa5e88", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c61f8b0485ca03f454c281ba3afa5e88");
        }
        as asVar = this.b;
        Object[] objArr2 = {str, null};
        ChangeQuickRedirect changeQuickRedirect2 = as.a;
        return PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "32d206198ad5a9cf5c7cf9e616743a05", RobustBitConfig.DEFAULT_VALUE) ? (Serializable) PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "32d206198ad5a9cf5c7cf9e616743a05") : (Serializable) asVar.a(str, (String) null);
    }
}
