package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e extends b {
    public static ChangeQuickRedirect a;
    private static final String[] o = {"hybrid_cashier", "sign_pay", "pay_defer_sign"};
    private final Map<String, NeoBridgeCustomizeInterface> n;

    public e(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3, Map<String, NeoBridgeCustomizeInterface> map) {
        Object[] objArr = {aVar, str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227b2ce901e4bea43b87af1d68b82a81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227b2ce901e4bea43b87af1d68b82a81");
            return;
        }
        a(aVar, str, str2, str3);
        for (NeoBridgeCustomizeInterface neoBridgeCustomizeInterface : map.values()) {
            neoBridgeCustomizeInterface.a(this);
        }
        this.n = map;
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088e0467539f2c974418ad974dd5c321", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088e0467539f2c974418ad974dd5c321");
        }
        String scene = e().f().getScene();
        if (!Arrays.asList(o).contains(scene)) {
            return a("illegal scene, scene is " + scene);
        } else if (this.n == null || this.n.isEmpty()) {
            return a("handlers is null");
        } else {
            Iterator<Map.Entry<String, NeoBridgeCustomizeInterface>> it = this.n.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, NeoBridgeCustomizeInterface> next = it.next();
                if (this.c.equals(next.getKey())) {
                    NeoBridgeCustomizeInterface value = next.getValue();
                    if (value != null) {
                        value.b(this.g, this.d);
                        a(f.a(this, value));
                        String c = value.c(this.g, this.d);
                        if (TextUtils.isEmpty(c)) {
                            return i();
                        }
                        try {
                            return a(new JSONObject(c));
                        } catch (Exception unused) {
                            return a(c);
                        }
                    }
                }
            }
            String str = "unknow action, the action is " + this.c;
            com.meituan.android.neohybrid.util.f.a(str);
            return a(str);
        }
    }

    public static /* synthetic */ void a(e eVar, NeoBridgeCustomizeInterface neoBridgeCustomizeInterface) {
        Object[] objArr = {eVar, neoBridgeCustomizeInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "095472dd1d78e3d5151478c3c97a27e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "095472dd1d78e3d5151478c3c97a27e1");
        } else {
            neoBridgeCustomizeInterface.a(eVar.g, eVar.d);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c10b57291604a3f1083486a27ff9686", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c10b57291604a3f1083486a27ff9686") : e.class.getSimpleName();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b, com.meituan.android.neohybrid.neo.bridge.b.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84008779b07ea0e924c9bacf8d663758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84008779b07ea0e924c9bacf8d663758");
            return;
        }
        super.a(i, i2, intent);
        for (Map.Entry<String, NeoBridgeCustomizeInterface> entry : this.n.entrySet()) {
            if (this.c.equals(entry.getKey())) {
                NeoBridgeCustomizeInterface value = entry.getValue();
                if (value == null) {
                    return;
                }
                value.a(i, i2, intent);
            }
        }
    }
}
