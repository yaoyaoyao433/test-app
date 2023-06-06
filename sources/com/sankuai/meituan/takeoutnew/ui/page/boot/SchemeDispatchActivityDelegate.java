package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.platform.capacity.deeplink.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.tencent.mapsdk.internal.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SchemeDispatchActivityDelegate extends BaseActivityDelegate implements DeviceLocateCallback {
    public static ChangeQuickRedirect a;
    public static final List<String> b = new ArrayList(10);
    public static final List<String> c = new ArrayList(20);
    private static boolean i = true;
    public g d;
    public d e;
    public Uri f;

    static {
        b.add("/welcome");
        b.add("/smshopcardmrn");
        b.add("/drugshopcardmrn");
        c.add("about-app");
        c.add("networkdiagnose");
        c.add("boxfee");
        c.add("wm-mine-page");
        c.add("mine-finish-comment");
        c.add("setting-page");
        c.add("foot-activity");
        c.add("WMFavorite");
        c.add("wm-recently-often-eat");
        c.add("help-feedback");
        c.add("edit-phone");
        c.add("coupon-record");
        c.add("coupon-refund-detail");
        c.add("goods-comment");
        c.add("poialbum");
        c.add("order-invoice");
        c.add("expired-redpacket");
        c.add("expired-coupon");
    }

    @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
    public final void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c1ef5ec2699d51922d690121a72218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c1ef5ec2699d51922d690121a72218");
        } else if (wMLocation != null && wMLocation.getLocationResultCode() != null && 1200 == wMLocation.getLocationResultCode().a) {
            if (this.h.isFinishing()) {
                return;
            }
            a(true);
        } else {
            a(false);
        }
    }

    public static Intent a(Context context, @NonNull Uri uri, int i2) {
        Object[] objArr = {context, uri, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b39cbccfdb7bcca74f3c0e70fcedc92", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b39cbccfdb7bcca74f3c0e70fcedc92");
        }
        Intent intent = new Intent(context, TransferActivity.class);
        intent.setData(uri);
        intent.putExtra("com.sankuai.waimai.router.from", i2);
        intent.putExtra("is_scheme_dispatch_delegate", true);
        return intent;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(final TransferActivity transferActivity, @Nullable Bundle bundle) {
        int i2;
        boolean z;
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b82751efacf68676a41cf2bd08fb8b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b82751efacf68676a41cf2bd08fb8b7");
            return;
        }
        Intent intent = transferActivity.getIntent();
        if (com.sankuai.meituan.takeoutnew.a.f) {
            Object[] objArr2 = new Object[3];
            objArr2[0] = "SchemeDispatchActivityDelegate";
            objArr2[1] = intent;
            objArr2[2] = aa.a(intent == null ? null : intent.getExtras());
            com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", "%s, onCreate, intent = %s, extra = %s", objArr2);
        }
        if (intent == null) {
            transferActivity.finish();
            return;
        }
        Uri data = intent.getData();
        if (data == null || !com.sankuai.waimai.foundation.router.a.a(data)) {
            transferActivity.finish();
            return;
        }
        int a2 = f.a(intent, "com.sankuai.waimai.router.from", 1);
        if (a2 == 5) {
            Object[] objArr3 = {data};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "ef5c70c3f45c37336477bbf0bfaf1ebd", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "ef5c70c3f45c37336477bbf0bfaf1ebd")).booleanValue();
            } else {
                z = af.a(data) || com.sankuai.waimai.foundation.router.a.a(data);
            }
            if (!z) {
                com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", "%s, invalid channel jump", "SchemeDispatchActivityDelegate");
                transferActivity.startActivity(new Intent(this.h, MainActivity.class));
                transferActivity.finish();
                return;
            }
        }
        transferActivity.setContentView(R.layout.wm_page_activity_scheme_proxy);
        this.e = new d(transferActivity);
        this.e.d();
        boolean equals = this.h.getString(R.string.scheme_path_pois).equals(data.getPath());
        Bundle extras = intent.getExtras();
        if (!i || b.b()) {
            i2 = 1;
        } else {
            i2 = 1;
            extras.putBoolean("_dl_target_", true);
        }
        com.sankuai.waimai.router.common.b bVar = new com.sankuai.waimai.router.common.b(transferActivity, data);
        Object[] objArr4 = new Object[i2];
        objArr4[0] = Integer.valueOf(a2);
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.router.common.b.a;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect3, false, "4933ae51bae22d76ce534cf9c87b0380", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.waimai.router.common.b) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect3, false, "4933ae51bae22d76ce534cf9c87b0380");
        } else {
            bVar.a("com.sankuai.waimai.router.from", (String) Integer.valueOf(a2));
        }
        com.sankuai.waimai.router.common.b b2 = bVar.a(y.a).a(extras).a(R.anim.wm_common_stay_still, R.anim.wm_common_stay_still).b(new e() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeDispatchActivityDelegate.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.core.e
            public final void a(@NonNull j jVar) {
                Object[] objArr5 = {jVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "0d9b03f270051b943dd5412816fcaed5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "0d9b03f270051b943dd5412816fcaed5");
                } else {
                    transferActivity.finish();
                }
            }

            @Override // com.sankuai.waimai.router.core.e
            public final void a(@NonNull j jVar, int i3) {
                Object[] objArr5 = {jVar, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "a28e90e91b5e41322f2a6522496ff4ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "a28e90e91b5e41322f2a6522496ff4ad");
                } else {
                    transferActivity.finish();
                }
            }
        });
        if (equals) {
            b2.a(com.sankuai.waimai.popup.e.b, true);
        }
        if (i) {
            i = false;
            b.b("t1");
        } else {
            Serializable a3 = f.a(extras, "_dl_task_ext_");
            if (a3 instanceof com.sankuai.waimai.platform.capacity.deeplink.e) {
                ((com.sankuai.waimai.platform.capacity.deeplink.e) a3).a("t1");
            }
        }
        b2.g();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a478872bf4cb221a5c77d7bc400a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a478872bf4cb221a5c77d7bc400a75");
            return;
        }
        this.d = null;
        a(this.h.getString(R.string.wm_main_jump_canceled));
        com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", "%s dispatch canceled", "SchemeDispatchActivityDelegate");
        super.a();
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4185aefcfb856a29a5f5adfa1137a8db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4185aefcfb856a29a5f5adfa1137a8db");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", "%s locationComplete", "SchemeDispatchActivityDelegate");
        if (this.d != null && this.f != null) {
            this.e.c(d.e);
            if (!z) {
                a(this.h.getString(R.string.wm_main_getting_location_failed));
            }
            this.d.a();
            return;
        }
        this.h.finish();
    }
}
