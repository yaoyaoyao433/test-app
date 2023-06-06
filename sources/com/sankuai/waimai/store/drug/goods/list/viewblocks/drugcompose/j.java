package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.util.e;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j implements android.arch.lifecycle.l<com.sankuai.waimai.store.drug.goods.list.model.a> {
    public static ChangeQuickRedirect a;
    SCBaseActivity b;
    int c;
    long d;
    String e;
    private LinearLayout f;
    private View g;
    private TextView h;
    private TextView i;
    private CountDownTimer j;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.goods.list.model.a aVar) {
        com.sankuai.waimai.store.drug.goods.list.model.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a644e02578e7dfab3f813407958e85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a644e02578e7dfab3f813407958e85");
        } else if (aVar2 != null) {
            b();
            this.c = aVar2.g == 0 ? 1 : aVar2.g;
            this.d = aVar2.h;
            this.e = aVar2.i;
            if (aVar2.f == 3 || aVar2.e == 1) {
                if (aVar2.f == 3) {
                    a(this.f);
                    if (t.a(aVar2.c)) {
                        a();
                        this.h.setText(R.string.drug_shop_close_up_tip_text);
                        return;
                    }
                    this.h.setText(aVar2.c);
                } else if (!t.a(aVar2.d)) {
                    a(this.f);
                    this.h.setText(aVar2.d);
                } else {
                    g();
                }
            } else if (aVar2.e == 0) {
                if (aVar2.a > 0) {
                    long j = aVar2.a * 1000;
                    if (j <= 0 || t.a(aVar2.b)) {
                        g();
                        return;
                    }
                    a(this.f);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50280ce07af07f32da3c6b7206055e96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50280ce07af07f32da3c6b7206055e96");
                    } else {
                        u.a(this.g);
                    }
                    a(aVar2.b, j);
                    this.j = new CountDownTimer(j, 1000L, aVar2) { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.j.1
                        public static ChangeQuickRedirect a;
                        public final /* synthetic */ com.sankuai.waimai.store.drug.goods.list.model.a b;

                        {
                            this.b = aVar2;
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j2) {
                            Object[] objArr3 = {new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1aa7002b4e0a449e05370435ac9e9b9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1aa7002b4e0a449e05370435ac9e9b9");
                            } else {
                                j.this.a(this.b.b, j2);
                            }
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8eeafdd6f16a77ebfc8a3193641e8af7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8eeafdd6f16a77ebfc8a3193641e8af7");
                                return;
                            }
                            j.this.a(this.b.b, 0L);
                            if (com.sankuai.waimai.store.util.b.a(j.this.b)) {
                                return;
                            }
                            ((DrugShopStatusViewModel) q.a((FragmentActivity) j.this.b).a(DrugShopStatusViewModel.class)).c.b((android.arch.lifecycle.k<com.sankuai.waimai.store.drug.goods.list.model.b>) new com.sankuai.waimai.store.drug.goods.list.model.b());
                        }
                    };
                    this.j.start();
                } else if (!t.a(aVar2.d)) {
                    a(this.f);
                    this.h.setText(aVar2.d);
                } else if (!t.a(aVar2.c)) {
                    a(this.f);
                    this.h.setText(aVar2.c);
                } else {
                    g();
                }
            }
        }
    }

    public j(@NonNull LinearLayout linearLayout, @NonNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {linearLayout, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6902cc55a844c512f4c35f4a6df20605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6902cc55a844c512f4c35f4a6df20605");
            return;
        }
        this.f = linearLayout;
        this.b = sCBaseActivity;
        ((DrugShopStatusViewModel) q.a((FragmentActivity) this.b).a(DrugShopStatusViewModel.class)).b.a(this.b, this);
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9507d389b48bfbbaff42fb54c13412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9507d389b48bfbbaff42fb54c13412");
            return;
        }
        u.a(this.i);
        if (this.c == 1) {
            this.i.setText("上线提醒我");
            this.i.setBackground(e());
        } else if (this.c == 2) {
            this.i.setText("已设置提醒");
            this.i.setBackground(f());
        }
    }

    void a(@NonNull String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca5ac837138ca296aedfd58a2d38eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca5ac837138ca296aedfd58a2d38eca");
            return;
        }
        try {
            this.h.setText(String.format(Locale.ENGLISH, str, a(j)));
        } catch (Exception unused) {
        }
    }

    private String a(long j) {
        String str;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a190c790e2d04991d5fccd8551915e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a190c790e2d04991d5fccd8551915e0");
        }
        long j2 = j / LocationStrategy.LOCATION_TIMEOUT;
        long j3 = (j - ((j2 * 1000) * 60)) / 1000;
        if (j3 == 0 && j2 > 0) {
            j2--;
            j3 = 60;
        }
        try {
            str = String.format(Locale.ENGLISH, "%02d:%02d", Long.valueOf(j2), Long.valueOf(j3));
        } catch (Exception unused) {
            str = null;
        }
        return t.a(str) ? "" : str;
    }

    private Drawable d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87faaa271b1f7f36105a90ec6ce1923", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87faaa271b1f7f36105a90ec6ce1923") : com.sankuai.waimai.store.util.e.b(this.b, (int) R.color.wm_sg_color_FFF8E1, (int) R.dimen.wm_sc_common_dimen_4);
    }

    private Drawable e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f99d0a965ed5fefd2482fa2ceefbeb3", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f99d0a965ed5fefd2482fa2ceefbeb3") : com.sankuai.waimai.store.util.e.a(this.b, new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_10);
    }

    private Drawable f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f359bbc788e199d00e9d086f3019c88d", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f359bbc788e199d00e9d086f3019c88d") : new e.a().a(-3881788).b(1).a(com.sankuai.shangou.stone.util.h.a(this.b, 10.0f)).a();
    }

    private void a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbc3abefc902d02f0b73ba06ffabbeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbc3abefc902d02f0b73ba06ffabbeb");
            return;
        }
        if (this.g == null) {
            this.g = LayoutInflater.from(this.b).inflate(R.layout.drug_shop_header_status_tip_view, (ViewGroup) linearLayout, false);
            com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(this.g, String.valueOf(System.identityHashCode(this.i)));
            aVar.a(k.a(this));
            com.sankuai.waimai.store.expose.v2.b.a().a(this.b, aVar);
            int a2 = com.sankuai.shangou.stone.util.h.a(this.b, 12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.sankuai.shangou.stone.util.h.a((Context) this.b) - (a2 * 2), com.sankuai.shangou.stone.util.h.a(this.b, 32.0f));
            layoutParams.leftMargin = a2;
            linearLayout.addView(this.g, 0, layoutParams);
            this.g.setBackground(d());
            this.h = (TextView) this.g.findViewById(R.id.tv_header_status_tip_text);
            this.i = (TextView) this.g.findViewById(R.id.tv_header_status_subscribe_button);
            this.i.setOnClickListener(l.a(this));
        }
        u.c(this.i);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a1874cd480a6ae6a90b75293461dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a1874cd480a6ae6a90b75293461dd9");
        } else {
            u.c(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69c7ab450b2f57bdc8a3cbbaf091935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69c7ab450b2f57bdc8a3cbbaf091935");
        } else if (this.j != null) {
            this.j.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Map<String, Object> c() {
        com.sankuai.waimai.store.drug.goods.list.model.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e53522249e00596b0edd68841556ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e53522249e00596b0edd68841556ba");
        }
        if (com.sankuai.waimai.store.util.b.a(this.b) || (a2 = ((DrugShopStatusViewModel) q.a((FragmentActivity) this.b).a(DrugShopStatusViewModel.class)).b.a()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", a2.i);
        int i = 1;
        if (a2.f == 3 || a2.a <= 0) {
            if (a2.f != 3 && !t.a(a2.c)) {
                i = 2;
            } else if (a2.f == 3 || t.a(a2.d) || a2.e != 0) {
                i = (a2.f == 3 || a2.e != 1) ? 5 : 4;
            } else {
                i = 3;
            }
        }
        hashMap.put("reason_type", Integer.valueOf(i));
        return hashMap;
    }
}
