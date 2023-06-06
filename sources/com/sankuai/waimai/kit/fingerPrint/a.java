package com.sankuai.waimai.kit.fingerPrint;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.constraint.R;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.common.fingerprint.info.AccelerometerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static List<AccelerometerInfo> c = new ArrayList();
    public static b d = null;
    @SuppressLint({"StaticFieldLeak"})
    private static a e;
    public FingerprintManager b;
    private Context f;

    public static synchronized a a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0602915aea8cb5a6c99c2c46d1dc9f2e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0602915aea8cb5a6c99c2c46d1dc9f2e");
            }
            if (e == null) {
                e = new a();
            }
            return e;
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2bfa60a973780f7215ae2058136393", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2bfa60a973780f7215ae2058136393");
            return;
        }
        this.f = com.meituan.android.singleton.b.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35c5f1ea38b212db1485408395b7930d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35c5f1ea38b212db1485408395b7930d");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c15a770b87eabe28223ec32914219205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c15a770b87eabe28223ec32914219205");
        } else if (d == null) {
            throw new RuntimeException(this.f.getString(R.string.wm_kit_main_must_implement_interface));
        } else {
            this.b = new FingerprintManager(this.f, d.a());
        }
    }

    public final FingerprintManager b() {
        return this.b;
    }

    public static void a(b bVar) {
        d = bVar;
    }
}
