package com.sankuai.waimai.store.drug.home.tab;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect g;
    public int h;
    public int i;
    public int j;
    private LottieAnimationView k;
    private LottieAnimationView l;
    private TextView m;
    private TextView n;
    private i o;
    private com.sankuai.waimai.store.expose.v2.entity.b p;
    private String q;

    @Override // com.sankuai.waimai.store.drug.home.tab.e
    public final /* bridge */ /* synthetic */ void a(@NonNull g gVar) {
        this.d = gVar;
    }

    public c(@NonNull SCBaseActivity sCBaseActivity, @NonNull g gVar, com.sankuai.waimai.store.drug.widgets.lottie.a aVar) {
        super(sCBaseActivity, gVar, aVar);
        Object[] objArr = {sCBaseActivity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff24eff354a3ecffeeb35180e924d48d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff24eff354a3ecffeeb35180e924d48d");
            return;
        }
        this.o = i.INITIALED;
        this.q = "wm_sc_drug_up_drug.json";
        this.h = R.drawable.drug_home_poi_select;
        this.i = R.drawable.drug_home_poi_up;
        this.j = R.drawable.drug_home_poi_normal;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.a
    @NonNull
    public final ViewGroup a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d6152d6d4b1fcddaafa5d98b736b70", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d6152d6d4b1fcddaafa5d98b736b70");
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.wm_drug_home_poi_tab_item_layout, (ViewGroup) null, false);
        viewGroup.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.k = (LottieAnimationView) viewGroup.findViewById(R.id.icon_tab_selected);
        this.l = (LottieAnimationView) viewGroup.findViewById(R.id.icon_tab_big);
        this.m = (TextView) viewGroup.findViewById(R.id.tv_text);
        this.n = (TextView) viewGroup.findViewById(R.id.tv_count);
        this.n.setVisibility(8);
        if (this.p == null) {
            this.p = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_9lohi5jg_mv", viewGroup);
        }
        this.p.a("source_id", Integer.valueOf(this.d.a));
        this.p.a("tab_index", Integer.valueOf(this.f));
        this.p.a("tab_name", this.d.b);
        com.sankuai.waimai.store.expose.v2.b.a().a(this.b, this.p);
        return viewGroup;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.e
    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81716b27cdaa65014d4e48927107d622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81716b27cdaa65014d4e48927107d622");
            return;
        }
        if (i.SHOWING.equals(iVar)) {
            this.m.setVisibility(8);
            this.k.e();
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            if (this.o == i.SHOWING) {
                if (this.d.h) {
                    this.q = "wm_drug_drug_up.json";
                } else {
                    this.q = "wm_drug_up_drug.json";
                }
            } else if (this.d.h) {
                this.q = "wm_drug_home_up.json";
            } else {
                this.q = "wm_drug_home_drug.json";
            }
            com.airbnb.lottie.e a = this.e != null ? this.e.a(this.q) : null;
            if (a == null) {
                int i = this.d.h ? this.i : this.h;
                b.C0608b c = m.c(this.d.d, this.l.getWidth());
                c.j = i;
                c.i = i;
                c.a((ImageView) this.l);
            } else {
                this.l.setComposition(a);
                this.l.a();
            }
        } else if (i.HIDDEN.equals(iVar)) {
            this.l.e();
            this.l.setVisibility(8);
            this.m.setVisibility(0);
            this.k.setVisibility(0);
            this.m.setText(this.d.b);
            if (this.d.h) {
                this.q = "wm_drug_home_up.json";
            } else {
                this.q = "wm_drug_home_drug.json";
            }
            b.C0608b c2 = m.c(this.d.d, this.k.getWidth());
            c2.j = this.j;
            c2.i = this.j;
            c2.a((ImageView) this.k);
        }
        this.o = iVar;
    }
}
