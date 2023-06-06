package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends PoiChannelActionBar {
    public static ChangeQuickRedirect ae;
    private View ad;
    private boolean af;

    public c(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2, boolean z) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b696a4bc156d98c3bcd86f2229550f19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b696a4bc156d98c3bcd86f2229550f19");
        } else {
            this.af = z;
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "662c4675bff7675efd160321a6cef6e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "662c4675bff7675efd160321a6cef6e0");
            return;
        }
        super.o();
        this.ad = this.y.findViewById(R.id.v_space_channel_location);
        this.K = a().getResources().getDrawable(R.drawable.wm_st_ic_dropdown_arrow);
        if (this.b.f()) {
            this.J.setVisibility(0);
            this.O.setVisibility(8);
            d(true);
        } else if (this.af) {
            this.J.setVisibility(0);
            this.O.setVisibility(8);
            d(false);
        } else {
            this.J.setVisibility(8);
            this.O.setVisibility(0);
        }
        this.J.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c0129a4b7c0029f4aa7089b88cad810", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c0129a4b7c0029f4aa7089b88cad810");
                } else if (c.this.c != null) {
                    c.this.c.bG_();
                }
            }
        });
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d52538d914f8eace7d2c566e36740fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d52538d914f8eace7d2c566e36740fc");
            return;
        }
        this.J.findViewById(R.id.ll_new_change_location).setVisibility(0);
        com.sankuai.waimai.store.manager.judas.b.b(this.b.G, "b_waimai_a90lzwad_mv").a("cat_id", Long.valueOf(this.b.c)).a("media_type", z ? "1" : "0").a();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb0a15d7f65445ce75ec40690cb4e86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb0a15d7f65445ce75ec40690cb4e86");
            return;
        }
        super.g(i);
        f.a().a(this.ad);
        f.a().b(this.L);
        f.a();
        getContext();
        f.a();
        this.T.setTextColor(f.a(getContext(), i, this.b.Y));
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ba5e08795be9fa2a48189a56095b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ba5e08795be9fa2a48189a56095b0d");
            return;
        }
        super.p();
        f.a().a(getContext(), this.U, this.b.Y);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84071fc835eef0e2f2f669e03fb08607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84071fc835eef0e2f2f669e03fb08607");
            return;
        }
        this.q = str;
        this.T.setText(str);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c704db0a03db1aa149ed625d7f8942a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c704db0a03db1aa149ed625d7f8942a6");
        } else {
            this.J.setAlpha(f);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = ae;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3c26bdedde4335967710d498368e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3c26bdedde4335967710d498368e1c");
        } else {
            super.d(i);
        }
    }
}
