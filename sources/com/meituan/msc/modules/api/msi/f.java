package com.meituan.msc.modules.api.msi;

import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.LocationUpdateEvent;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public ApiPortal b;
    public h c;

    public f(ApiPortal apiPortal, h hVar) {
        Object[] objArr = {apiPortal, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e591762af9aff77c50913b9acbc79a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e591762af9aff77c50913b9acbc79a");
            return;
        }
        this.b = apiPortal;
        this.c = hVar;
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556d483fa87c2a25e45160dfe918c71a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556d483fa87c2a25e45160dfe918c71a")).booleanValue();
        }
        if (TextUtils.equals(str, "onLocationChange")) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e665876b3557b7296079f7d79d6c7b4b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e665876b3557b7296079f7d79d6c7b4b")).booleanValue();
            }
            if (!this.c.r.i()) {
                Map<String, Boolean> a2 = com.meituan.msc.modules.api.auth.a.a(MSCEnvHelper.getContext(), this.c.r.j());
                Boolean bool = a2.get("scope.userLocationBackground");
                Boolean bool2 = a2.get("scope.userLocation");
                LocationUpdateEvent locationUpdateEvent = new LocationUpdateEvent();
                if (bool2 != null && !bool2.booleanValue()) {
                    locationUpdateEvent.updateEnable = false;
                    locationUpdateEvent.updateBackgroundEnable = false;
                    this.b.a("locationUpdateEvent", w.a(locationUpdateEvent));
                    return true;
                } else if (bool != null && bool.booleanValue()) {
                    locationUpdateEvent.updateEnable = true;
                    locationUpdateEvent.updateBackgroundEnable = false;
                    this.b.a("locationUpdateEvent", w.a(locationUpdateEvent));
                    return true;
                }
            }
            return false;
        } else if (TextUtils.equals(str, "onUserCaptureScreen")) {
            com.meituan.msc.modules.reporter.g.b("captureScreen");
            d.a(str2, this.c);
            return false;
        } else {
            return false;
        }
    }

    public final boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f0f9a9c6d6421c5e6cf9f895ff2336", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f0f9a9c6d6421c5e6cf9f895ff2336")).booleanValue();
        }
        if (TextUtils.equals(str, EventHandler.EVENT_JUMP_LINK_INNER)) {
            com.meituan.msc.modules.navigation.a aVar = (com.meituan.msc.modules.navigation.a) this.c.c(com.meituan.msc.modules.navigation.a.class);
            if (aVar != null) {
                try {
                    aVar.a(1);
                } catch (com.meituan.msc.modules.api.b e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
        return false;
    }
}
