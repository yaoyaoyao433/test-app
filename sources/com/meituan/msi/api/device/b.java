package com.meituan.msi.api.device;

import android.arch.lifecycle.d;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.api.device.a;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b<T extends a> implements com.meituan.msi.lifecycle.a {
    public static ChangeQuickRedirect c;
    private Map<String, T> a;
    private boolean b;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb3b8e064e17d8ea11ed1bb3f7ecd671", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb3b8e064e17d8ea11ed1bb3f7ecd671")).intValue();
        }
        switch (i) {
            case 1:
                return 20;
            case 2:
                return 60;
            case 3:
                return 200;
            default:
                return 200;
        }
    }

    public abstract T a(@NonNull MtSensorManager mtSensorManager, String str);

    public abstract String a(String str);

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b09f71307644d7d4ed09e61036ca07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b09f71307644d7d4ed09e61036ca07");
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74041dce1eafc19fa9d22198227dffff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74041dce1eafc19fa9d22198227dffff");
            return;
        }
        this.a = new HashMap();
        this.b = false;
    }

    public final synchronized T a(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3568b6a18aa30a6974210f20833840", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3568b6a18aa30a6974210f20833840");
        }
        if (msiContext.getActivity() != null && msiContext.getLifecycleState() != null && msiContext.getLifecycleState().equals(d.b.RESUMED)) {
            a(true);
            this.b = true;
        }
        T b = b(str);
        if (b != null) {
            return b;
        }
        MtSensorManager createSensorManager = Privacy.createSensorManager(com.meituan.msi.a.f(), str);
        if (createSensorManager != null) {
            b = a(createSensorManager, str);
            b.a(this.b);
            this.a.put(a(str), b);
        }
        return b;
    }

    public final synchronized T b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c5913f2c60b1837870d03ef026062a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c5913f2c60b1837870d03ef026062a");
        }
        String a = a(str);
        if (this.a.containsKey(a)) {
            return this.a.get(a);
        }
        return null;
    }

    private synchronized void a(MsiContext msiContext) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c35c6354e5b777efabbac7b96bdbbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c35c6354e5b777efabbac7b96bdbbf");
            return;
        }
        for (Map.Entry<String, T> entry : this.a.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().a(null);
            }
        }
        this.a.clear();
    }

    private synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc9795c03559d1d8dd4519e7a120b5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc9795c03559d1d8dd4519e7a120b5e");
            return;
        }
        for (Map.Entry<String, T> entry : this.a.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().a(z);
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02565f28b066e7fb0a37f14f385d94f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02565f28b066e7fb0a37f14f385d94f1");
            return;
        }
        a(true);
        this.b = true;
    }

    @Override // com.meituan.msi.lifecycle.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae34231c1f1e6b2831afa779d9f11ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae34231c1f1e6b2831afa779d9f11ca");
            return;
        }
        a(false);
        this.b = false;
    }

    @Override // com.meituan.msi.lifecycle.a
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a3402e9f491186623dbecd9d7be119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a3402e9f491186623dbecd9d7be119");
        } else {
            a((MsiContext) null);
        }
    }
}
