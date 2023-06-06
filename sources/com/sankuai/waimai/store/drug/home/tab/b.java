package com.sankuai.waimai.store.drug.home.tab;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect g;
    LottieAnimationView h;
    Bitmap i;
    Bitmap j;
    private TextView k;
    private TextView l;
    private i m;
    private com.sankuai.waimai.store.expose.v2.entity.b n;

    @Override // com.sankuai.waimai.store.drug.home.tab.e
    public final /* bridge */ /* synthetic */ void a(@NonNull g gVar) {
        this.d = gVar;
    }

    public b(@NonNull SCBaseActivity sCBaseActivity, @NonNull g gVar, com.sankuai.waimai.store.drug.widgets.lottie.a aVar) {
        super(sCBaseActivity, gVar, aVar);
        Object[] objArr = {sCBaseActivity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d691a8fde1bb434169de44f6dfc60de1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d691a8fde1bb434169de44f6dfc60de1");
            return;
        }
        this.m = i.INITIALED;
        this.i = null;
        this.j = null;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.a
    @NonNull
    public final ViewGroup a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87098d234498605a40beb2ddd11345d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87098d234498605a40beb2ddd11345d1");
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.wm_drug_home_common_tab_item_layout, (ViewGroup) null, false);
        viewGroup.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.h = (LottieAnimationView) viewGroup.findViewById(R.id.icon_tab_selected);
        this.k = (TextView) viewGroup.findViewById(R.id.tv_text);
        this.l = (TextView) viewGroup.findViewById(R.id.tv_count);
        this.l.setVisibility(8);
        if (this.n == null) {
            this.n = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_9lohi5jg_mv", viewGroup);
        }
        this.n.a("source_id", Integer.valueOf(this.d.a));
        this.n.a("tab_index", Integer.valueOf(this.f));
        this.n.a("tab_name", this.d.b);
        com.sankuai.waimai.store.expose.v2.b.a().a(this.b, this.n);
        return viewGroup;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.e
    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8373bcac6fe2861347118559806b455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8373bcac6fe2861347118559806b455");
            return;
        }
        if (i.SHOWING.equals(iVar) && !this.m.equals(iVar)) {
            this.k.setText(this.d.b);
            com.airbnb.lottie.e a = this.e != null ? this.e.a(this.d.e) : null;
            if (a == null) {
                a(this.d.c, true);
            } else {
                this.h.setComposition(a);
                this.h.a();
            }
        } else if (i.HIDDEN.equals(iVar) && !this.m.equals(iVar)) {
            this.k.setText(this.d.b);
            a(this.d.d, false);
        }
        this.m = iVar;
    }

    private void a(String str, final boolean z) {
        boolean z2 = false;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be93518df4aa183c66947d91dc291e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be93518df4aa183c66947d91dc291e2");
            return;
        }
        if (z) {
            if (this.j != null) {
                this.h.setImageBitmap(this.j);
            }
            z2 = true;
        } else {
            if (this.i != null) {
                this.h.setImageBitmap(this.i);
            }
            z2 = true;
        }
        if (z2) {
            b.C0608b a = com.sankuai.waimai.store.imageloader.a.a(str);
            a.k = 4;
            a.c = str;
            b.C0608b b = a.b(this.h.getWidth());
            b.f = ImageQualityUtil.c();
            b.a(new b.a() { // from class: com.sankuai.waimai.store.drug.home.tab.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f56cd07e862e4494101b58f65bdbb06a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f56cd07e862e4494101b58f65bdbb06a");
                    } else if (z) {
                        b.this.j = bitmap;
                        b.this.h.setImageBitmap(b.this.j);
                    } else {
                        b.this.i = bitmap;
                        b.this.h.setImageBitmap(b.this.i);
                    }
                }
            });
        }
    }
}
