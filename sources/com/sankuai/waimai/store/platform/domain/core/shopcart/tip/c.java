package com.sankuai.waimai.store.platform.domain.core.shopcart.tip;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a;
    public double b;
    public boolean c;
    public boolean d;
    @SerializedName("top_tip_info")
    public d e;
    @SerializedName("exchange_info")
    public a f;
    @SerializedName("toast")
    private String g;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4b994f15af15924d328c80137787ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4b994f15af15924d328c80137787ac");
            return;
        }
        this.b = 0.0d;
        this.c = false;
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a407ea1fe7953e153002425777185a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a407ea1fe7953e153002425777185a76");
        } else if (map == null) {
        } else {
            Activity c = com.sankuai.waimai.store.manager.appinfo.a.c();
            if (com.sankuai.waimai.store.util.b.a(c)) {
                return;
            }
            try {
                FragmentManager supportFragmentManager = ((FragmentActivity) c).getSupportFragmentManager();
                SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
                aVar.d = "flashbuy-drug-buy-control-tip";
                aVar.b = "supermarket";
                aVar.c = "flashbuy-drug-info";
                aVar.a("popUpInfo", i.a(map)).a().show(supportFragmentManager, c.getClass().getSimpleName());
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public final void a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "539c13f688762e94f15d69d4c1aa9bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "539c13f688762e94f15d69d4c1aa9bd0");
            return;
        }
        this.g = str;
        if (TextUtils.isEmpty(str) || this.c) {
            return;
        }
        Dialog j = SCBaseDialog.j();
        if (j != null && j.getWindow() != null && j.isShowing()) {
            if (am.a()) {
                if (com.sankuai.waimai.store.manager.appinfo.a.c() instanceof SCBaseActivity) {
                    str2 = ((SCBaseActivity) com.sankuai.waimai.store.manager.appinfo.a.c()).w();
                } else {
                    str2 = getClass().getName() + System.currentTimeMillis();
                }
                am.a(j.getContext(), j.getWindow(), str2, str);
            } else {
                am.a(j, str, com.sankuai.waimai.store.manager.appinfo.a.c());
            }
        } else {
            am.a(com.sankuai.waimai.store.util.b.a(), str);
        }
        this.c = true;
    }

    public final d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178e0b5820528910a343d1cf6597098a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178e0b5820528910a343d1cf6597098a");
        }
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210507599ae477395fe47b00bc492a1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210507599ae477395fe47b00bc492a1b");
        }
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9703dc35679818e28c19fae149e3abba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9703dc35679818e28c19fae149e3abba");
        } else {
            this.b = d;
        }
    }
}
