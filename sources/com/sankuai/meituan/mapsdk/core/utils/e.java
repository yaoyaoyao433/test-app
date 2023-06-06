package com.sankuai.meituan.mapsdk.core.utils;

import com.meituan.mtmap.rendersdk.IZoomUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements IZoomUtil {
    public static ChangeQuickRedirect a;
    public ac b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a77f4d5e2bc85dcf9dee4f5dd521f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a77f4d5e2bc85dcf9dee4f5dd521f3");
        } else {
            this.b = ac.MEITUAN;
        }
    }

    @Override // com.meituan.mtmap.rendersdk.IZoomUtil
    public final double fromRenderZoom(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab45c65c7b9387083d719b7e63b6cb9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab45c65c7b9387083d719b7e63b6cb9b")).doubleValue();
        }
        switch (this.b) {
            case TENCENT:
                return d + 0.9999325295624536d;
            case AMAP:
                return d + 1.5849625007211563d;
            default:
                return d;
        }
    }

    @Override // com.meituan.mtmap.rendersdk.IZoomUtil
    public final double toRenderZoom(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d6fd1342ac84c990f38a5bcda8f99b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d6fd1342ac84c990f38a5bcda8f99b6")).doubleValue();
        }
        switch (this.b) {
            case TENCENT:
                return Math.max(3.0d, Math.min(20.0d, d)) - 0.9999325295624536d;
            case AMAP:
                return Math.max(3.0d, Math.min(20.0d, d)) - 1.5849625007211563d;
            case MEITUAN:
                return Math.max(2.0d, Math.min(19.0d, d));
            default:
                return d;
        }
    }
}
