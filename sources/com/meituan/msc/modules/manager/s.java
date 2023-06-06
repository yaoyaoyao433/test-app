package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "UpdateManager")
/* loaded from: classes3.dex */
public class s extends k {
    public static ChangeQuickRedirect a;
    public volatile a b;

    public s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06d7c754c2a35abc7b079b3d8a61a3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06d7c754c2a35abc7b079b3d8a61a3f");
        } else {
            this.b = a.STATUS_INIT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        STATUS_INIT,
        STATUS_APP_HAS_UPDATE,
        STATUS_APP_NOT_HAS_UPDATE,
        STATUS_APP_DOWNLOAD_SUCCESS,
        STATUS_APP_DOWNLOAD_FAIL;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e2679c998398e15556897b5735e6eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e2679c998398e15556897b5735e6eb");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9221df55bec386db120d6ecbd70c3f99", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9221df55bec386db120d6ecbd70c3f99") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab462f09e8a6647defbd10592c93e0a6", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab462f09e8a6647defbd10592c93e0a6") : (a[]) values().clone();
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9a934ec914a14266fed0c2d40ac2f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9a934ec914a14266fed0c2d40ac2f4");
            return;
        }
        this.b = aVar;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ace9d01d4b22a0772ee384f5d3255ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ace9d01d4b22a0772ee384f5d3255ee7");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("UpdateManager", "dispatchEvent, stauts = ", aVar);
        com.meituan.msc.modules.engine.h U_ = U_();
        if (aVar == a.STATUS_APP_HAS_UPDATE || aVar == a.STATUS_APP_NOT_HAS_UPDATE) {
            boolean z = aVar == a.STATUS_APP_HAS_UPDATE;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("hasUpdate", z);
                U_.m.a("onCheckForUpdate", jSONObject);
            } catch (JSONException unused) {
                com.meituan.msc.modules.reporter.g.a("UpdateManager", "dispatchEvent, JSON exception");
            }
        } else if (aVar == a.STATUS_APP_DOWNLOAD_SUCCESS) {
            U_.m.a("onUpdateReady", (Object) null);
        } else if (aVar == a.STATUS_APP_DOWNLOAD_FAIL) {
            U_.m.a("onUpdateFailed", (Object) null);
        }
    }
}
