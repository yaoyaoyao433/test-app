package com.sankuai.waimai.foundation.utils;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class LocationUtils {
    public static ChangeQuickRedirect a;

    public static TransformData a(double d, double d2) {
        String[] split;
        String[] split2;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f72093a61470bf31d9312d9b5ceebfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (TransformData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f72093a61470bf31d9312d9b5ceebfb");
        }
        TransformData transformData = new TransformData();
        try {
            String valueOf = String.valueOf(d);
            String valueOf2 = String.valueOf(d2);
            split = valueOf.split("\\.");
            split2 = valueOf2.split("\\.");
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        if (split != null && split.length > 0 && split2 != null && split2.length > 0) {
            transformData.ji = Long.parseLong(split[0]) * 777;
            transformData.wi = Long.parseLong(split2[0]) * 999;
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                String replace = split[1].replace("2", "b").replace("4", "d").replace("6", "f");
                if (replace != null && replace.length() > 6) {
                    replace = replace.substring(0, 6);
                }
                transformData.jf = replace;
            }
            if (split2.length > 1 && !TextUtils.isEmpty(split2[1])) {
                String replace2 = split2[1].replace("3", com.huawei.hms.opendevice.c.a).replace("7", com.meituan.android.neohybrid.neo.bridge.presenter.g.n).replace("9", "i");
                if (replace2 != null && replace2.length() > 6) {
                    replace2 = replace2.substring(0, 6);
                }
                transformData.wf = replace2;
            }
            return transformData;
        }
        return transformData;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TransformData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String jf;
        public long ji;
        public String wf;
        public long wi;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e2d40a9ae6caa3cfce88fde1483525f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e2d40a9ae6caa3cfce88fde1483525f");
            }
            return "TransformData{ji=" + this.ji + ", jf='" + this.jf + "', wi=" + this.wi + ", wf='" + this.wf + "'}";
        }
    }
}
