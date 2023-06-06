package com.sankuai.waimai.business.page.kingkong.view.actionbar;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.foundation.utils.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    public static final int b = g.a(com.meituan.android.singleton.b.a, 48.0f);
    View c;
    public ImageView d;
    ViewGroup e;
    TextView f;
    ImageView g;
    TextView h;
    ViewGroup i;
    KingKongActivity j;
    KingKongViewModel k;
    LinearLayout l;
    int m;
    boolean n;
    private int o;
    private TextView p;
    private TextView q;
    private TextView r;
    private View.OnClickListener s;

    public static /* synthetic */ void a(b bVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1c5fba2f03f045262119d277ec4ca22f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1c5fba2f03f045262119d277ec4ca22f");
        } else {
            bVar.p.setText(str);
        }
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.n = true;
        return true;
    }

    public b(KingKongActivity kingKongActivity) {
        super(kingKongActivity);
        Object[] objArr = {kingKongActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750bc80954416b68402584aa3b590699", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750bc80954416b68402584aa3b590699");
            return;
        }
        this.s = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12cc6500200dabfa33ab69ffd818b347", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12cc6500200dabfa33ab69ffd818b347");
                } else {
                    b.this.a((List<RecommendedSearchKeyword>) null);
                }
            }
        };
        this.j = kingKongActivity;
        this.m = g.a((Context) this.j.bB_());
        this.o = g.a(this.j, 89.0f);
        this.k = (KingKongViewModel) q.a((FragmentActivity) this.j).a(KingKongViewModel.class);
        this.k.p.a(this.j, new l<Float>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v3, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r4v5 */
            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Float f) {
                Float f2 = f;
                Object[] objArr2 = {f2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b3e232b69a17da0bbe2fb2988bbefb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b3e232b69a17da0bbe2fb2988bbefb1");
                } else if (f2 != null) {
                    b bVar = b.this;
                    float floatValue = f2.floatValue();
                    Object[] objArr3 = {Float.valueOf(floatValue)};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "39fb8c1f587d7552dc873e69196251bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "39fb8c1f587d7552dc873e69196251bc");
                        return;
                    }
                    bVar.f.setAlpha(floatValue);
                    bVar.g.setAlpha(floatValue);
                    bVar.l.setAlpha(floatValue);
                    int i = (int) ((1.0f - floatValue) * 255.0f);
                    if (bVar.c.getBackground() != null) {
                        bVar.c.getBackground().mutate().setAlpha(i);
                    }
                    KingKongViewModel kingKongViewModel = bVar.k;
                    ?? r4 = i >= 127 ? 1 : 0;
                    Object[] objArr4 = {Byte.valueOf((byte) r4)};
                    ChangeQuickRedirect changeQuickRedirect4 = KingKongViewModel.a;
                    if (PatchProxy.isSupport(objArr4, kingKongViewModel, changeQuickRedirect4, false, "cc978be437b93ccb26096d1d73497950", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, kingKongViewModel, changeQuickRedirect4, false, "cc978be437b93ccb26096d1d73497950");
                    } else {
                        kingKongViewModel.n.b((k<Boolean>) Boolean.valueOf((boolean) r4));
                    }
                    if (bVar.n) {
                        bVar.h.setTextColor(bVar.j.getResources().getColor(i <= 127 ? R.color.roo_default_color_background : R.color.roo_default_color_gray_darker));
                    }
                }
            }
        });
        this.k.j.a(this.j, new l<Pair<String, Boolean>>() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<String, Boolean> pair) {
                Pair<String, Boolean> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0231a406f7aeddbdb864d595fda55b74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0231a406f7aeddbdb864d595fda55b74");
                } else if (pair2 != null) {
                    b.a(b.this, pair2.first, pair2.second.booleanValue());
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8714f0ceb7680168cf5f3532447c28d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8714f0ceb7680168cf5f3532447c28d2");
        }
        this.c = layoutInflater.inflate(R.layout.wm_page_kingkong_action_bar, viewGroup, false);
        if (this.j != null && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this.j)) {
            int e = g.e(com.meituan.android.singleton.b.a);
            this.c.setPadding(0, e, 0, 0);
            this.o += e;
        }
        this.e = (ViewGroup) this.c.findViewById(R.id.ll_title);
        this.f = (TextView) this.e.findViewById(R.id.txt_title);
        this.g = (ImageView) this.e.findViewById(R.id.img_title);
        this.h = (TextView) this.c.findViewById(R.id.back);
        this.l = (LinearLayout) this.c.findViewById(R.id.layout_location_box);
        this.p = (TextView) this.c.findViewById(R.id.actionbar_txt);
        this.q = (TextView) this.c.findViewById(R.id.position_icon);
        this.r = (TextView) this.c.findViewById(R.id.actionbar_location_arrow);
        this.i = (ViewGroup) this.c.findViewById(R.id.action_bar_title_search_box);
        this.i.setOnClickListener(this.s);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5945ab9fd7e06af6c180fc5b9dd49f8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5945ab9fd7e06af6c180fc5b9dd49f8");
                } else {
                    b.this.j.onBackPressed();
                }
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.actionbar.b.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c26b7bb4f2f9dd54bf4cd6e15156ceb4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c26b7bb4f2f9dd54bf4cd6e15156ceb4");
                    return;
                }
                KingKongViewModel kingKongViewModel = b.this.k;
                Object[] objArr3 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = KingKongViewModel.a;
                if (PatchProxy.isSupport(objArr3, kingKongViewModel, changeQuickRedirect3, false, "a346cf220a19ae4cab0ee2cc4cadd959", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, kingKongViewModel, changeQuickRedirect3, false, "a346cf220a19ae4cab0ee2cc4cadd959");
                } else {
                    kingKongViewModel.h.b((k<Boolean>) Boolean.TRUE);
                }
                com.sankuai.waimai.foundation.router.a.a(b.this.j, com.sankuai.waimai.foundation.router.interfaces.c.D);
            }
        });
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de42d599be3b63ab026b0b7e5c55d36f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de42d599be3b63ab026b0b7e5c55d36f");
            return;
        }
        this.p.setTextColor(z ? -1 : Color.parseColor("#33312D"));
        TextView textView = this.q;
        int i = R.color.roo_default_color_gray_dim;
        com.meituan.roodesign.widgets.iconfont.b.a(textView, R.string.wm_c_iconfont_14dingwei, z ? R.color.roo_default_color_background : R.color.roo_default_color_gray_dim);
        TextView textView2 = this.r;
        if (z) {
            i = R.color.roo_default_color_background;
        }
        com.meituan.roodesign.widgets.iconfont.b.a(textView2, R.string.wm_c_iconfont_arrow_right_small, i);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed91e7dd51d2f59612d452dcea44ee8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed91e7dd51d2f59612d452dcea44ee8b");
            return;
        }
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.f.setTypeface(Typeface.DEFAULT_BOLD);
        if (!TextUtils.isEmpty(str)) {
            this.f.setText(str);
        } else {
            this.f.setText(R.string.app_name);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181a8ca3e1a50e3f94ba3f0e11dca331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181a8ca3e1a50e3f94ba3f0e11dca331");
            return;
        }
        this.k.c(z);
        if (z) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
    }

    public final void a(List<RecommendedSearchKeyword> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0849c6e5e6158193652a01690a0759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0849c6e5e6158193652a01690a0759");
            return;
        }
        KingkongInfo a2 = this.k.d.a();
        if (a2 == null) {
            a2 = new KingkongInfo();
        }
        com.sankuai.waimai.business.page.kingkong.utils.a.a(this.j, list, a2.b, a2.g, a2.d);
    }
}
