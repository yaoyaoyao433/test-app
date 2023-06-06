package com.meituan.mmp.lib.api.update;

import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.interfaces.c;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public volatile f.c d;
    public MMPAppProp e;
    public c f;
    public h g;
    private boolean h;

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "660da2e7f880cccc264e7b9fc3532480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "660da2e7f880cccc264e7b9fc3532480");
        } else {
            this.d = f.c.INITIAL;
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        Object[] objArr = {mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974c47608d0c9715d8b299da1dbfeca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974c47608d0c9715d8b299da1dbfeca8");
        } else if (this.h) {
            this.b = true;
            this.c = false;
            if (this.f != null) {
                if (this.g != null) {
                    this.g.b("mmp.api.updatemanager.update.ready", (Map<String, Object>) null);
                }
                this.f.a("onUpdateReady", (String) null, 0);
                com.meituan.mmp.lib.trace.b.b("backgroundUpdateManager", "onUpdateReady");
                return;
            }
            this.d = f.c.ALL_PACKAGE_PREPARED;
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, String str, Exception exc) {
        Object[] objArr = {mMPAppProp, str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfbe1f3f19533af8bfa37068bda0028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfbe1f3f19533af8bfa37068bda0028");
        } else if (this.h) {
            this.c = true;
            if (this.f != null) {
                this.f.a("onUpdateFailed", (String) null, 0);
                com.meituan.mmp.lib.trace.b.b("backgroundUpdateManager", "onUpdateFailed");
                return;
            }
            this.d = f.c.FAILED;
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999bc0d4a504b61725213b36ae700cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999bc0d4a504b61725213b36ae700cd6");
            return;
        }
        this.e = mMPAppProp;
        if (mMPAppProp.loadType == 2) {
            this.h = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hasUpdate", this.h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f != null) {
            this.f.a("onCheckForUpdate", jSONObject.toString(), 0);
            com.meituan.mmp.lib.trace.b.b("backgroundUpdateManager", "onCheckForUpdate:" + jSONObject.toString());
            return;
        }
        this.d = f.c.APP_PROP_UPDATED;
    }
}
