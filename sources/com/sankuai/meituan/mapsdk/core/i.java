package com.sankuai.meituan.mapsdk.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.MTMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public a a;
    public CameraUpdate b;
    public long c;
    public MTMap.CancelableCallback d;
    public double e;

    public i(a aVar, CameraUpdate cameraUpdate, long j, MTMap.CancelableCallback cancelableCallback) {
        this.a = aVar;
        this.b = cameraUpdate;
        this.c = j;
        this.d = cancelableCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        MOVE_CAMERA,
        ANIMATE_CAMERA,
        STOP_ANIMATION,
        CHANGE_TILT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18d72266bc0280ae7d5a6a2e6a0e686", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18d72266bc0280ae7d5a6a2e6a0e686");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce27d91066a967589ef0b43a5fb39a22", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce27d91066a967589ef0b43a5fb39a22") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8925da59ea2ac37c21cfdebb749bf750", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8925da59ea2ac37c21cfdebb749bf750") : (a[]) values().clone();
        }
    }
}
