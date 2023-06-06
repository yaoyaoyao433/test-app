package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends PoiChannelActionBar2 {
    public static ChangeQuickRedirect aa;
    private View ab;
    private boolean ac;
    private final View.OnClickListener ad;

    public d(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2, boolean z) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d574ea0236d489690c8dbf3efba847", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d574ea0236d489690c8dbf3efba847");
            return;
        }
        this.ad = new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d92308dba494bb5162321892a41138e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d92308dba494bb5162321892a41138e");
                } else if (d.this.c != null) {
                    d.this.c.bG_();
                }
            }
        };
        this.ac = z;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86002a527b7955c295eb07603b5599f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86002a527b7955c295eb07603b5599f");
            return;
        }
        super.n();
        this.ab = this.y.findViewById(R.id.v_space_channel_location);
        this.L = a().getResources().getDrawable(R.drawable.wm_st_ic_dropdown_arrow);
        if (this.b.f()) {
            this.K.setVisibility(0);
            this.P.setVisibility(8);
            d(true);
        } else if (this.ac) {
            this.K.setVisibility(0);
            this.P.setVisibility(8);
            d(false);
        } else {
            this.K.setVisibility(8);
            this.P.setVisibility(0);
        }
        if (this.U != null) {
            this.U.setOnClickListener(this.ad);
        }
        if (this.V != null) {
            this.V.setOnClickListener(this.ad);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb0107ac8984ed59efccda515c33687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb0107ac8984ed59efccda515c33687");
            return;
        }
        this.K.findViewById(R.id.ll_new_change_location).setVisibility(0);
        if (this.f) {
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.b(this.b.G, "b_waimai_a90lzwad_mv").a("cat_id", Long.valueOf(this.b.c)).a("media_type", z ? "1" : "0").a();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a2f8e888aa5e7bc03ca3b3612102ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a2f8e888aa5e7bc03ca3b3612102ef");
            return;
        }
        super.g();
        if (this.K != null) {
            this.K.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55031384ef97ebf8314220fda0999c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55031384ef97ebf8314220fda0999c6");
            return;
        }
        super.h();
        if (this.b.f()) {
            this.K.setVisibility(0);
            this.P.setVisibility(8);
            d(true);
        } else if (this.ac) {
            this.K.setVisibility(0);
            this.P.setVisibility(8);
            d(false);
        } else {
            this.K.setVisibility(8);
            this.P.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2
    public final void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9e9e4d083689897d8eec662285bcc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9e9e4d083689897d8eec662285bcc4");
            return;
        }
        super.f(i);
        f.a().a(this.ab);
        f.a().b(this.M);
        f.a();
        getContext();
        f.a();
        this.U.setTextColor(f.a(getContext(), i, this.b.Y));
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd07e997ce33f139d7ec926547c8317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd07e997ce33f139d7ec926547c8317");
            return;
        }
        super.o();
        f.a().a(getContext(), this.V, this.b.Y);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8027638580da9ef663ede2f34959457f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8027638580da9ef663ede2f34959457f");
            return;
        }
        this.q = str;
        this.U.setText(str);
        if (this.l != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(GearsLocator.ADDRESS, str);
            this.l.a("home_nav_change_location", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final HashMap<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54cf8a74822c31b008e84089fd4630a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54cf8a74822c31b008e84089fd4630a9");
        }
        HashMap<String, Object> k = super.k();
        k.put(GearsLocator.ADDRESS, this.q);
        return k;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e3321e11c42f42ebfd55e6885c863a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e3321e11c42f42ebfd55e6885c863a");
            return;
        }
        this.K.setAlpha(f);
        if (this.g != null) {
            this.g.setAlpha(f);
            if (this.b.bb) {
                if (f == 0.0f) {
                    u.b(this.g);
                } else {
                    u.a(this.g);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = aa;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39772cd6cd27bd06c57060ff32936616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39772cd6cd27bd06c57060ff32936616");
        } else {
            super.d(i);
        }
    }
}
