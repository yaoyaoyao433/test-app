package com.sankuai.waimai.store.util;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGLocationUtils {
    public static ChangeQuickRedirect a;

    private static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0233c8b95b7950c00cf97b19399d188", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0233c8b95b7950c00cf97b19399d188")).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean a(WMLocation wMLocation, WMLocation wMLocation2) {
        Object[] objArr = {wMLocation, wMLocation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3b804251901baaad50cf2b1f13b0975", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3b804251901baaad50cf2b1f13b0975")).booleanValue() : wMLocation != null && wMLocation2 != null && Double.compare(wMLocation.getLatitude(), wMLocation2.getLatitude()) == 0 && Double.compare(wMLocation.getLongitude(), wMLocation2.getLongitude()) == 0;
    }

    public static boolean a(WMLocation wMLocation, String str) {
        Object[] objArr = {wMLocation, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b83d431af6b915b038af729f0a224852", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b83d431af6b915b038af729f0a224852")).booleanValue() : (a(str, com.sankuai.waimai.store.locate.a.d()) || a(wMLocation, com.sankuai.waimai.store.locate.a.b())) ? false : true;
    }

    public static TransformData a(double d, double d2) {
        String sb;
        String sb2;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa5d6500390b36b5683d347fee26a574", RobustBitConfig.DEFAULT_VALUE)) {
            return (TransformData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa5d6500390b36b5683d347fee26a574");
        }
        LocationUtils.TransformData a2 = LocationUtils.a(d, d2);
        if (a2 != null) {
            TransformData transformData = new TransformData();
            if (a2.ji == 0) {
                sb = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2.ji);
                sb = sb3.toString();
            }
            transformData.ji = sb;
            transformData.jf = a2.jf.equals("0") ? "" : a2.jf;
            if (a2.wi == 0) {
                sb2 = "";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(a2.wi);
                sb2 = sb4.toString();
            }
            transformData.wi = sb2;
            transformData.wf = a2.wf.equals("0") ? "" : a2.wf;
            return transformData;
        }
        return null;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TransformData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String jf;
        public String ji;
        public String wf;
        public String wi;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c5e861d4b8b0bd4bae578b1ab6b335d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c5e861d4b8b0bd4bae578b1ab6b335d");
            }
            return "TransformData{ji=" + this.ji + ", jf='" + this.jf + ", wi=" + this.wi + ", wf='" + this.wf + '}';
        }
    }
}
