package com.meituan.android.screenshot.share;

import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.badge.data.Data;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", c.a, "d", "e", "f", g.n, "h", "i", "j", Data.TB_DATA_COL_KEY, "l", "m", "n", "o", "p", "q", r.o, "s", "t", "u", "v", "w", Constants.GestureMoveEvent.KEY_X, Constants.GestureMoveEvent.KEY_Y, "z"};

    private static String a(int i) {
        Object[] objArr = {4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c8049be62f51df7998beeade25fe13d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c8049be62f51df7998beeade25fe13d");
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < 4; i2++) {
            stringBuffer.append(b[(int) ((Math.random() * 36.0d) + 0.0d)]);
        }
        String stringBuffer2 = stringBuffer.toString();
        return TextUtils.isEmpty(stringBuffer2) ? "" : stringBuffer2;
    }

    public static String a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38c45bcebc20257783db0835bea10724", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38c45bcebc20257783db0835bea10724");
        }
        long b2 = com.meituan.android.time.c.b();
        Object[] objArr2 = {new Long(b2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c907fb21c1ed25b62ed215668180a1e", RobustBitConfig.DEFAULT_VALUE)) {
            str = "";
            while (b2 != 0) {
                str = b[(int) (b2 % 36)] + str;
                b2 = Math.round(Math.floor(b2 / 36));
            }
            switch (str.length() % 8) {
                case 0:
                    break;
                case 1:
                    str = "0000000" + str;
                    break;
                case 2:
                    str = "000000" + str;
                    break;
                case 3:
                    str = "00000" + str;
                    break;
                case 4:
                    str = "0000" + str;
                    break;
                case 5:
                    str = Constant.DEFAULT_CVN2 + str;
                    break;
                case 6:
                    str = "00" + str;
                    break;
                case 7:
                    str = "0" + str;
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c907fb21c1ed25b62ed215668180a1e");
        }
        return str + a(4);
    }
}
