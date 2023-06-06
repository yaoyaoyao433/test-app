package com.meituan.mmp.lib.msi;

import android.text.TextUtils;
import com.meituan.mmp.main.MMPEnvHelper;
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
public final class a {
    public static ChangeQuickRedirect a;
    public ApiPortal b;
    public com.meituan.mmp.lib.engine.m c;
    public com.meituan.mmp.lib.api.auth.f d;
    public String e;

    public a(ApiPortal apiPortal, com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {apiPortal, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d282db77d9d96c14761750491fbb38e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d282db77d9d96c14761750491fbb38e1");
            return;
        }
        this.d = com.meituan.mmp.lib.api.auth.d.a();
        this.b = apiPortal;
        this.c = mVar;
    }

    public final boolean a(String str, String str2, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c02fb482880cf37a0484fe700167268", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c02fb482880cf37a0484fe700167268")).booleanValue();
        }
        com.meituan.mmp.lib.a aVar2 = this.c != null ? this.c.r : null;
        if (!TextUtils.equals(str, "onLocationChange")) {
            if (TextUtils.equals(str, EventHandler.EVENT_REQUEST_PERFORMANCE_INNER) || TextUtils.equals(str, EventHandler.EVENT_DOWNLOAD_OR_UPLOAD_PERFORMANCE_INNER)) {
                return true;
            }
            if (TextUtils.equals(str, EventHandler.EVENT_OPEN_LINK_INNER)) {
                if (aVar2 != null) {
                    aVar2.e(str2);
                    return true;
                }
            } else if (TextUtils.equals(str, EventHandler.EVENT_JUMP_LINK_INNER)) {
                return a(aVar2, str2);
            }
            return false;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eca6ef7b8003671168fdb791b9df6062", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eca6ef7b8003671168fdb791b9df6062")).booleanValue();
        }
        if (!aVar.a() && this.d != null) {
            Map<String, Boolean> a2 = this.d.a(MMPEnvHelper.getContext(), aVar.c());
            Boolean bool = a2.get("scope.userLocationBackground");
            Boolean bool2 = a2.get("scope.userLocation");
            LocationUpdateEvent locationUpdateEvent = new LocationUpdateEvent();
            if (bool2 != null && !bool2.booleanValue()) {
                locationUpdateEvent.updateEnable = false;
                locationUpdateEvent.updateBackgroundEnable = false;
                this.b.a("locationUpdateEvent", w.a(locationUpdateEvent));
                return true;
            } else if (bool != null && !bool.booleanValue()) {
                locationUpdateEvent.updateEnable = true;
                locationUpdateEvent.updateBackgroundEnable = false;
                this.b.a("locationUpdateEvent", w.a(locationUpdateEvent));
                return true;
            }
        }
        return false;
    }

    private boolean a(com.meituan.mmp.lib.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54db89aac79f7c704d6b29ff306fd9fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54db89aac79f7c704d6b29ff306fd9fb")).booleanValue();
        }
        if (aVar == null || aVar.y() == null || aVar.y().e() == null) {
            return false;
        }
        String pagePath = aVar.y().e().getPagePath();
        if (TextUtils.equals(str, "record_page_path")) {
            this.e = pagePath;
            return true;
        } else if (TextUtils.equals(this.e, pagePath)) {
            if (aVar != null && aVar.y() != null) {
                try {
                    aVar.y().c(1);
                    return true;
                } catch (com.meituan.mmp.lib.api.d e) {
                    e.printStackTrace();
                }
            }
            return false;
        } else {
            return true;
        }
    }
}
