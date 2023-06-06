package com.sankuai.waimai.alita.core.jsexecutor.task;

import android.text.TextUtils;
import com.dianping.jscore.Value;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends a {
    public static ChangeQuickRedirect h;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final String f() {
        return "加载";
    }

    public f(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bf0b08c3a75322ceb0a0a337bef4e81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bf0b08c3a75322ceb0a0a337bef4e81");
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final Runnable g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fe44533e3d6319c8576d49beb220d7", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fe44533e3d6319c8576d49beb220d7") : new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.task.f.1
            public static ChangeQuickRedirect a;
            public final g b;

            {
                this.b = f.this.b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7174194d12bb4e032ed8315093c4cfb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7174194d12bb4e032ed8315093c4cfb");
                    return;
                }
                com.sankuai.waimai.alita.core.engine.e.a().b(this.b.b, f.this.d());
                f fVar = f.this;
                fVar.a("this.customConfig={name:'" + this.b.b + "'};");
                f.this.a(this.b.c);
                b.a(f.this, this.b.b, "AlitaNative", new Value(new com.sankuai.waimai.alita.core.jsexecutor.e(this.b.b, this.b.g)));
                b.a(f.this, this.b.b, "alitaGlobalEnv", new Value(this.b.f));
                String b = f.this.b();
                if (TextUtils.isEmpty(b)) {
                    b = "unknown";
                }
                String c = f.this.c();
                if (TextUtils.isEmpty(c)) {
                    c = "unknown";
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt(Constants.JSBundleConstants.KEY_BUNDLE_ID, b);
                    jSONObject.putOpt("bundleVersion", c);
                } catch (Exception unused) {
                }
                b.a(f.this, this.b.b, "env", new Value(jSONObject));
                f fVar2 = f.this;
                fVar2.a("this." + this.b.b + ".onCreated();");
            }
        };
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c50e040171c0beeec00b525e1b395d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c50e040171c0beeec00b525e1b395d");
            return;
        }
        super.c(str);
        com.sankuai.waimai.alita.core.engine.e.a().a(this.b.b, d(), true);
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "720c9b27cfe17052ace4054158439ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "720c9b27cfe17052ace4054158439ba6");
            return;
        }
        super.a(exc);
        com.sankuai.waimai.alita.core.engine.e.a().a(this.b.b, d(), false);
    }
}
