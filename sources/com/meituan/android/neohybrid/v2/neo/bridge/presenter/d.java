package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d extends b {
    public static ChangeQuickRedirect a;
    private static final String[] p = {"hybrid_cashier", "sign_pay", "pay_defer_sign"};
    private static final String[] q = {"pay_hybridMtpCashierTransferProcess", "pay_verifyBiometricInfo", "pay_getBiometricsInfo", "signPay_signPayResult", "pay_notifyHybridProcessResult"};
    private final Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> o;

    public static /* synthetic */ void a(d dVar, com.meituan.android.neohybrid.v2.neo.bridge.handler.b bVar) {
        Object[] objArr = {dVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52758be45f816caa8255d54f1e39966f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52758be45f816caa8255d54f1e39966f");
        }
    }

    public d(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3, Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> map) {
        Object[] objArr = {aVar, str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66727ce1bcb64ce7a1aedecc843f436d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66727ce1bcb64ce7a1aedecc843f436d");
            return;
        }
        a(aVar, str, str2, str3);
        for (com.meituan.android.neohybrid.v2.neo.bridge.handler.b bVar : map.values()) {
            bVar.a(this);
        }
        this.o = map;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6309938c2f4db8f22627ca883832fe73", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6309938c2f4db8f22627ca883832fe73");
        }
        String scene = e().f().getScene();
        if (!Arrays.asList(p).contains(scene)) {
            return a("illegal scene, scene is " + scene);
        } else if (!Arrays.asList(q).contains(this.c)) {
            return a("illegal action, action is " + this.c);
        } else if (this.o == null || this.o.isEmpty()) {
            return a("handlers is null");
        } else {
            Iterator<Map.Entry<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b>> it = this.o.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> next = it.next();
                if (this.c.equals(next.getKey())) {
                    com.meituan.android.neohybrid.v2.neo.bridge.handler.b value = next.getValue();
                    if (value != null) {
                        value.a(this.h, this.d);
                        a(e.a(this, value));
                        String b = value.b(this.h, this.d);
                        if (TextUtils.isEmpty(b)) {
                            return i();
                        }
                        try {
                            return a(new JSONObject(b));
                        } catch (Exception unused) {
                            return a(b);
                        }
                    }
                }
            }
            String str = "unknow action, the action is " + this.c;
            com.meituan.android.neohybrid.util.f.a(str);
            return a(str);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560ef29efbbd73840fc259552f4bac90", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560ef29efbbd73840fc259552f4bac90") : d.class.getSimpleName();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b, com.meituan.android.neohybrid.v2.neo.bridge.a.InterfaceC0312a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a244662d18fd01f403404c956dcab66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a244662d18fd01f403404c956dcab66");
            return;
        }
        super.a(i, i2, intent);
        for (Map.Entry<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> entry : this.o.entrySet()) {
            if (this.c.equals(entry.getKey()) && entry.getValue() == null) {
                return;
            }
        }
    }
}
