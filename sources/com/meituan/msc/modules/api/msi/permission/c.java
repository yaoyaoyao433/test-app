package com.meituan.msc.modules.api.msi.permission;

import android.app.Activity;
import android.content.SharedPreferences;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.msc.common.utils.ac;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.provider.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements e {
    public static ChangeQuickRedirect a;
    private d b;
    private h c;

    public c(h hVar, d dVar) {
        Object[] objArr = {hVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64137fe2d468018add8f8377de3eebb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64137fe2d468018add8f8377de3eebb4");
            return;
        }
        this.c = hVar;
        this.b = dVar;
    }

    @Override // com.meituan.msi.provider.e
    public final boolean a(String[] strArr, String str, StringBuilder sb) {
        int i;
        boolean z;
        String str2;
        Object[] objArr = {strArr, str, sb};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53f9ac9d6d66f3753cfcd832b19ec7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53f9ac9d6d66f3753cfcd832b19ec7f")).booleanValue();
        }
        if (strArr != null && strArr.length > 0 && this.b != null) {
            d dVar = this.b;
            Object[] objArr2 = {strArr};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8e01638d00401856ef58bd3d91496ba0", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8e01638d00401856ef58bd3d91496ba0")).intValue();
            } else {
                if (ac.a(strArr)) {
                    int i2 = dVar.e + 1;
                    dVar.e = i2;
                    if (i2 > dVar.d) {
                        i = 1;
                    } else if (dVar.U_().d != null) {
                        String a2 = dVar.U_().a();
                        Object[] objArr3 = {a2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.api.e.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "341f64c17e6abd0209601944d3e4b0cb", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "341f64c17e6abd0209601944d3e4b0cb")).booleanValue();
                        } else {
                            if (com.meituan.msc.modules.api.e.b && a2 != null) {
                                Object[] objArr4 = {a2};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.api.e.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3f1bf38ccd3cf73f2d45288cf775afd9", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3f1bf38ccd3cf73f2d45288cf775afd9")).booleanValue();
                                } else {
                                    SharedPreferences sharedPreferences = MSCEnvHelper.getSharedPreferences("mmp_location_interval");
                                    String str3 = "last_request_time" + a2;
                                    long j = sharedPreferences.getLong(str3, 0L);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (j == 0 || currentTimeMillis - j > DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION) {
                                        sharedPreferences.edit().putLong(str3, currentTimeMillis).apply();
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                            z = true;
                        }
                        if (!z) {
                            i = 2;
                        }
                    }
                }
                i = 0;
            }
            if (i == 1 || i == 2) {
                d dVar2 = this.b;
                Object[] objArr5 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = d.a;
                if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "207e6b82464f409a173d7eda57c32646", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "207e6b82464f409a173d7eda57c32646");
                } else if (i == 1) {
                    str2 = "auth denied system permission has been denied more than " + dVar2.d + " times";
                } else if (i == 2) {
                    str2 = "auth denied checkPermissionPer48h";
                } else {
                    str2 = "auth denied ";
                }
                sb.append(str2);
                return true;
            }
            p e = this.c.b().e();
            if (e != null) {
                d dVar3 = this.b;
                Activity C = e.C();
                Object[] objArr6 = {C, strArr, str};
                ChangeQuickRedirect changeQuickRedirect6 = d.a;
                if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "f01c5a02c66ee6f364abf15c0892b3b8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "f01c5a02c66ee6f364abf15c0892b3b8")).booleanValue();
                }
                if (d.f != null) {
                    return d.f.a(C, strArr, str);
                }
                return false;
            }
        }
        return false;
    }
}
