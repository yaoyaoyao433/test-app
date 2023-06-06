package com.meituan.android.legwork.ui.jump;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.legwork.ui.abactivity.LegworkMainActivity;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.utils.t;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.legwork.ui.base.b {
    public static ChangeQuickRedirect c;
    private k d;
    private String e;
    private Intent f;

    @Override // com.meituan.android.legwork.ui.base.b
    public final boolean d() {
        return false;
    }

    public a(ToSendOneMoreActivity toSendOneMoreActivity) {
        super(toSendOneMoreActivity);
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083cdcd15b9532347f980c3435a7bf46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083cdcd15b9532347f980c3435a7bf46");
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(Bundle bundle) {
        boolean b;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a54c909e530a2497d887600dbe3759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a54c909e530a2497d887600dbe3759");
            return;
        }
        super.a(bundle);
        Intent intent = this.b.getIntent();
        if (intent == null || intent.getData() == null) {
            x.e("LegworkSchemeDelegate.onCreate()", "intent 为空");
            this.b.finish();
            return;
        }
        x.b("LegworkSchemeDelegate.onCreate()", "中转跳转!");
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68da5e693c3b176c90a5692ef78ab162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68da5e693c3b176c90a5692ef78ab162");
            return;
        }
        Object[] objArr3 = {intent};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da48835321a974b6fdf601f21aee6d57", RobustBitConfig.DEFAULT_VALUE)) {
            intent = (Intent) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da48835321a974b6fdf601f21aee6d57");
        } else if (intent == null || intent.getData() == null) {
            x.e("LegworkSchemeDelegate.changeTargetActivity()", "intent 为空");
        } else {
            this.e = com.meituan.android.legwork.ui.base.c.a(intent.getData());
            if (TextUtils.isEmpty(this.e)) {
                x.e("LegworkSchemeDelegate.changeTargetActivity()", "跳转路径为空");
            } else {
                Intent a = com.meituan.android.legwork.utils.c.a(this.b);
                if (a != null) {
                    intent = a;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(this.b.getString(R.string.legwork_scheme_path_homepage), LegworkMainActivity.class);
                    hashMap.put(this.b.getString(R.string.legwork_scheme_path_homepage_two), LegworkMainActivity.class);
                    Intent a2 = com.meituan.android.legwork.utils.d.a(this.b);
                    if (a2 != null || (a2 = t.a(this.b)) != null) {
                        intent = a2;
                    } else if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_send_preview), this.e)) {
                        if (a(intent) > 0) {
                            intent.setClass(this.b, LegworkMainActivity.class);
                            intent.putExtra("one_more_order_id", a(intent));
                        } else {
                            intent.setClass(this.b, LegworkMainActivity.class);
                            intent.putExtra("key_bottom_bar_position", 0);
                            intent.putExtra("business_type", 1);
                        }
                    } else if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_order_list), this.e) || TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_order_list_two), this.e)) {
                        intent.setClass(this.b, LegworkMainActivity.class);
                        intent.putExtra("key_bottom_bar_position", 1);
                    } else {
                        Class<?> cls = (Class) hashMap.get(this.e);
                        if (cls == null) {
                            x.e("LegworkSchemeDelegate.changeTargetActivity()", "跳转到的页面为空");
                            this.b.finish();
                        } else {
                            intent.setClass(this.b, cls);
                        }
                    }
                }
            }
        }
        this.f = intent;
        if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_order_list), this.e) || TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_preview), this.e) || TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_preview_two), this.e)) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "be8f00868c69895ceae339f7fcab2a2d", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "be8f00868c69895ceae339f7fcab2a2d")).booleanValue();
            } else {
                b = com.meituan.android.legwork.common.user.a.a().b();
                if (!b) {
                    rx.d<Integer> c2 = com.meituan.android.legwork.common.user.a.a().c();
                    Object[] objArr5 = {this};
                    ChangeQuickRedirect changeQuickRedirect5 = b.a;
                    this.d = c2.c(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4de07989dfe0dfa3155e186907785d03", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4de07989dfe0dfa3155e186907785d03") : new b(this));
                    com.meituan.android.legwork.common.user.a.a().a(this.b);
                }
            }
            if (!b) {
                return;
            }
        }
        b(intent);
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55872760cd5eaed69a73f36d3afdc00e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55872760cd5eaed69a73f36d3afdc00e");
            return;
        }
        super.b();
        if (this.d == null || this.d.isUnsubscribed()) {
            return;
        }
        this.d.unsubscribe();
    }

    private long a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba7496c4e002a1d981702a0aecdb007", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba7496c4e002a1d981702a0aecdb007")).longValue();
        }
        if (intent == null) {
            return 0L;
        }
        long a = intent.hasExtra("one_more_order_id") ? com.sankuai.waimai.platform.utils.f.a(intent, "one_more_order_id", 0L) : 0L;
        if (a == 0 && intent.getData() != null) {
            String queryParameter = intent.getData().getQueryParameter("one_more_order_id");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    return Long.parseLong(queryParameter);
                } catch (Exception e) {
                    x.e("LegworkSchemeDelegate.parseIntentsGetSendOneMoreOrderId()", "mrn one more order id error, exception msg:", e);
                    x.a(e);
                }
            }
            return a;
        }
        return a;
    }

    private void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be43098b7158effceffb4dda167725e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be43098b7158effceffb4dda167725e");
            return;
        }
        this.b.startActivity(intent);
        this.b.overridePendingTransition(0, 0);
        this.b.finish();
    }

    public static /* synthetic */ void a(a aVar, Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9ff42258bf5daa203cb3fb8ddfaedf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9ff42258bf5daa203cb3fb8ddfaedf5");
        } else if (num.intValue() == 1) {
            aVar.b(aVar.f);
        } else if (num.intValue() == 2) {
            aVar.b.finish();
        }
    }
}
