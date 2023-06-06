package com.sankuai.meituan.location.collector.provider;

import android.text.TextUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public final String b;
    public h c;
    public MtLocation d;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb4b2f6437f82db698cfa29cce212f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb4b2f6437f82db698cfa29cce212f8");
            return;
        }
        this.b = "CollectorGpsReportInfoCache ";
        this.c = new h();
    }

    private double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28662e47bb1f14f6a3a7a3331e00d8a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28662e47bb1f14f6a3a7a3331e00d8a9")).doubleValue();
        }
        if (d > 99.9d) {
            return 99.9d;
        }
        if (d < 0.5d) {
            return 0.5d;
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8f6b3aa1be9113ebd42c9eefaf3819", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8f6b3aa1be9113ebd42c9eefaf3819")).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            LogUtils.a("str after trim is empty");
            return 0.0d;
        }
        String[] split = trim.split("\\*");
        if (split.length > 1) {
            try {
                r2 = split[0].length() != 0 ? 1.0d * Double.parseDouble(split[0]) : 1.0d;
                r2 *= Integer.parseInt(split[1], 16);
            } catch (Throwable unused) {
            }
            return a(r2);
        }
        return a(Double.parseDouble(trim));
    }
}
