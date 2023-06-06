package com.meituan.mmp.lib.msi;

import android.app.Activity;
import android.content.SharedPreferences;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.mmp.lib.utils.ad;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements com.meituan.msi.provider.e {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.api.h b;
    private com.meituan.mmp.lib.a c;

    public i(com.meituan.mmp.lib.api.h hVar, com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {hVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4245e59d3d9d543cef1b5170784eca26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4245e59d3d9d543cef1b5170784eca26");
            return;
        }
        this.b = hVar;
        this.c = aVar;
    }

    @Override // com.meituan.msi.provider.e
    public final boolean a(String[] strArr, String str, StringBuilder sb) {
        int i;
        boolean z;
        String str2;
        Object[] objArr = {strArr, str, sb};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6faf0ad1a4ca53dd424d3f678a74c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6faf0ad1a4ca53dd424d3f678a74c0")).booleanValue();
        }
        if (strArr != null && strArr.length > 0 && this.b != null) {
            com.meituan.mmp.lib.api.h hVar = this.b;
            Object[] objArr2 = {strArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "02a2d1acc4f4f396f0a2fbd7625fe5ae", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "02a2d1acc4f4f396f0a2fbd7625fe5ae")).intValue();
            } else {
                if (ad.a(strArr)) {
                    int i2 = hVar.j + 1;
                    hVar.j = i2;
                    if (i2 > hVar.i) {
                        i = 1;
                    } else if (hVar.b != null) {
                        String str3 = hVar.b.b;
                        Object[] objArr3 = {str3};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.m.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "62d3f41400f62b23f48323b086787a37", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "62d3f41400f62b23f48323b086787a37")).booleanValue();
                        } else {
                            if (com.meituan.mmp.lib.api.m.b && str3 != null) {
                                Object[] objArr4 = {str3};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.api.m.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "51072c66e9aa11c27b4a628e040bfc79", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "51072c66e9aa11c27b4a628e040bfc79")).booleanValue();
                                } else {
                                    SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences("mmp_location_interval");
                                    String str4 = "last_request_time" + str3;
                                    long j = sharedPreferences.getLong(str4, 0L);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (j == 0 || currentTimeMillis - j > DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION) {
                                        sharedPreferences.edit().putLong(str4, currentTimeMillis).apply();
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
                com.meituan.mmp.lib.api.h hVar2 = this.b;
                Object[] objArr5 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.api.h.a;
                if (PatchProxy.isSupport(objArr5, hVar2, changeQuickRedirect5, false, "7d598438a512b165d416118af493280f", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr5, hVar2, changeQuickRedirect5, false, "7d598438a512b165d416118af493280f");
                } else if (i == 1) {
                    str2 = "auth denied system permission has been denied more than " + hVar2.i + " times";
                } else if (i == 2) {
                    str2 = "auth denied checkPermissionPer48h";
                } else {
                    str2 = "auth denied ";
                }
                sb.append(str2);
                return true;
            } else if (this.c != null) {
                com.meituan.mmp.lib.api.h hVar3 = this.b;
                Activity activity = this.c.f;
                Object[] objArr6 = {activity, strArr, str};
                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.mmp.lib.api.h.a;
                if (PatchProxy.isSupport(objArr6, hVar3, changeQuickRedirect6, false, "0b52d1ed6235d0d87cfbd44dc4cad5f2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr6, hVar3, changeQuickRedirect6, false, "0b52d1ed6235d0d87cfbd44dc4cad5f2")).booleanValue();
                }
                if (com.meituan.mmp.lib.api.h.l != null) {
                    return com.meituan.mmp.lib.api.h.l.a(activity, strArr, str);
                }
                return false;
            }
        }
        return false;
    }
}
