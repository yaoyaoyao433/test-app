package com.sankuai.waimai.store.drug.home.refactor.card.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.util.d;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.util.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends a implements com.sankuai.waimai.store.ocr.b {
    public static ChangeQuickRedirect d;
    final List<SearchCarouselText> A;
    protected int B;
    protected String C;
    protected String D;
    public boolean E;
    public boolean F;
    private String G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private Drawable Q;
    private int R;
    private int S;
    private String T;
    protected View e;
    protected ImageView f;
    protected View g;
    protected View h;
    protected View i;
    protected TextView j;
    protected View k;
    protected ImageView l;
    protected ImageView m;
    protected ImageView n;
    protected View o;
    protected View p;
    protected View q;
    protected int r;
    protected TextView s;
    protected ImageView t;
    protected TextView u;
    protected ViewFlipper v;
    protected TextView w;
    protected ImageView x;
    protected ImageView y;
    protected Drawable z;

    public b(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.drug.home.callback.a aVar2) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a3a413069c258c616ff6a5f18a201a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a3a413069c258c616ff6a5f18a201a");
            return;
        }
        this.r = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = -1;
        this.R = -1;
        this.A = new ArrayList();
        this.E = false;
        this.F = false;
        this.G = aVar.d();
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ecbd92b28a3ab0079299f70f356bc69", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ecbd92b28a3ab0079299f70f356bc69") : super.onCreateView(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924a8ee3b986d58e3c6092e765d08b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924a8ee3b986d58e3c6092e765d08b47");
            return;
        }
        super.onViewCreated();
        this.S = h.a(getContext(), 14.0f);
        this.z = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_drug_home_arrow);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ddf5c98f4b187890761f0b2df73163e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ddf5c98f4b187890761f0b2df73163e");
        } else {
            this.n = (ImageView) findView(R.id.ocr_camera);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6979c9fcee0e9abc7e82f463b2c24c84", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6979c9fcee0e9abc7e82f463b2c24c84");
                    } else if (view.getContext() instanceof Activity) {
                        if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                            com.sankuai.waimai.store.ocr.a.a().a((Activity) view.getContext(), b.this);
                        } else {
                            com.sankuai.waimai.store.manager.user.a.a(view.getContext());
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(b.this.mContext, "b_waimai_sg_rj3ioc4p_mc").a("cat_id", t.a(String.valueOf(b.this.b.c)) ? "-999" : String.valueOf(b.this.b.c)).a("stid", "-999").a("if_med_poi", 0).a("page_type", 0).a();
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62ff177f3cf74297a492e77c2a7b7b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62ff177f3cf74297a492e77c2a7b7b02");
        } else {
            this.r = u.a();
            this.H = h.a((Context) a());
            this.I = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
            this.J = h.a(a(), 48.0f) + this.r;
            this.K = this.H - (this.I * 2);
            this.L = h.a(a(), 35.0f);
            this.M = h.a(a(), 32.0f);
            this.N = h.a(a(), 56.0f);
            this.O = h.a(a(), 52.0f);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = d;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d8e84897901d1305929f5a94fc89e8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d8e84897901d1305929f5a94fc89e8ef");
        } else {
            this.e = ((ViewStub) a(R.id.new_style_channel_location)).inflate();
            this.e.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + (this.b.y ? this.r : 0);
            this.e.requestLayout();
        }
        b();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = d;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7d1bd12ef8a3b1461d1b3d3df59408fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7d1bd12ef8a3b1461d1b3d3df59408fc");
        } else {
            this.q = a(R.id.search_empty_view);
            int i = this.r;
            this.q.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + i;
            if (this.o != null) {
                ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).topMargin = i;
            }
            this.g = a(R.id.animate_action_search_outer);
            this.h = a(R.id.animte_action_search);
            this.u = (TextView) a(R.id.tv_header_search_view);
            this.v = (ViewFlipper) a(R.id.vf_search_carousel_text);
            this.w = (TextView) a(R.id.tv_header_search_button);
            this.y = (ImageView) a(R.id.iv_header_search_icon_left);
            this.i = a(R.id.layout_search_main);
            this.p = a(R.id.layout_title_container);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bf73b8a07e48ee92d0c719614069e4b9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bf73b8a07e48ee92d0c719614069e4b9");
                        return;
                    }
                    SearchCarouselText searchCarouselText = null;
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) b.this.A) && b.this.v != null) {
                        searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) b.this.A, b.this.v.getDisplayedChild());
                    }
                    if (b.this.c != null) {
                        b.this.c.a(searchCarouselText);
                    }
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = d;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a559a9b34245db282442961e85f9c68f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a559a9b34245db282442961e85f9c68f");
        } else {
            this.f = (ImageView) this.e.findViewById(R.id.iv_back);
            e(-14539738);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b4624d84c3671575e94114407976a629", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b4624d84c3671575e94114407976a629");
                    } else if (b.this.c != null) {
                        b.this.c.bd_();
                    }
                }
            });
        }
        b(-14539738);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "314b2576a3a11ed0573aa5b3473fa9c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "314b2576a3a11ed0573aa5b3473fa9c5");
            return;
        }
        this.o = this.e.findViewById(R.id.layout_actionbar_content);
        this.j = (TextView) this.e.findViewById(R.id.txt_title);
        this.l = (ImageView) this.e.findViewById(R.id.iv_title);
        this.k = this.e.findViewById(R.id.title_root_view);
        this.s = (TextView) this.e.findViewById(R.id.location_address);
        this.t = (ImageView) this.e.findViewById(R.id.location_address_icon);
        this.m = (ImageView) this.e.findViewById(R.id.location_address_icon_left);
        u.a(this.j, this.G);
    }

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c13f0f8caeb4a2eb1f94a77420129c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c13f0f8caeb4a2eb1f94a77420129c3");
            return;
        }
        b(this.b.Y);
        if (this.j != null) {
            this.j.setTextColor(i);
        }
        e(i);
        d(i);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a
    public void a(int i, View view, View view2) {
        int i2;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        int i3;
        Object[] objArr2 = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ad56793280be7d039e20d1fe0074465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ad56793280be7d039e20d1fe0074465");
            return;
        }
        int abs = Math.abs(i);
        int height = (this.e.getHeight() - (this.b.y ? this.r : 0)) - h.a(this.mContext, 7.0f);
        if (height <= 0) {
            return;
        }
        int i4 = this.I;
        this.P = ((Integer) view.getTag()).intValue();
        if (abs >= 0) {
            float f = height;
            float min = Math.min((abs * 1.0f) / f, 1.0f);
            int i5 = (int) (f * min);
            int i6 = (min > 0.5f ? 1 : (min == 0.5f ? 0 : -1));
            b(i6 > 0);
            this.E = i6 > 0;
            this.q.getLayoutParams().height = this.J - i5;
            a(view, min);
            a(min);
            b(1.0f - min);
            int intValue = this.K - ((int) ((i2 - (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, this, d, false, "edb8d1514b09bd1c5349b5076adf1573", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb8d1514b09bd1c5349b5076adf1573")).intValue() : (this.H - c()) - c(i4))) * min));
            int i7 = this.L - ((int) ((i3 - this.M) * min));
            int c = (int) ((c() - i4) * min);
            this.w.getLayoutParams().width = this.N - ((int) ((this.N - this.O) * min));
            Object[] objArr3 = {Integer.valueOf(intValue), Integer.valueOf(i7), Integer.valueOf(c)};
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "742796926178bcb85c23f6163d4134fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "742796926178bcb85c23f6163d4134fb");
            } else {
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                layoutParams.width = intValue;
                layoutParams.height = i7;
                this.h.setTranslationX(c);
            }
            this.h.requestLayout();
            if (abs == 0) {
                b(1.0f);
                a(0.0f);
                a(view, 0.0f);
            }
        }
    }

    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416ec4aedda74bb7312da77db4d488f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416ec4aedda74bb7312da77db4d488f3");
        } else if (this.b.Y) {
        } else {
            int argb = Color.argb(255, 34, 36, 38);
            if (this.z != null) {
                if (this.Q == null) {
                    this.Q = e.a(this.z, argb);
                } else {
                    DrawableCompat.setTintList(this.Q, ColorStateList.valueOf(argb));
                }
                this.f.setBackground(this.Q);
            }
        }
    }

    private void a(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb76c1484d720ab325220f801e2dc9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb76c1484d720ab325220f801e2dc9c1");
            return;
        }
        if (!this.b.aa) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) ((this.P * 0.5d) + (this.P * (1.0f - f) * 0.5d));
            view.setLayoutParams(layoutParams);
        }
        this.p.setBackgroundColor(Color.argb((int) (f * 255.0f), 255, 255, 255));
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0f9d32367e68a49f689b4ec9b1dc1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0f9d32367e68a49f689b4ec9b1dc1e")).intValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (this.f.getWidth() - this.S) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16);
        }
        return 0;
    }

    public int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c31fead616c0bdb187213ac38097fe0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c31fead616c0bdb187213ac38097fe0")).intValue() : getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
    }

    public void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f26a4a08b070d50f4892ede91e4e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f26a4a08b070d50f4892ede91e4e0b");
        } else if (this.j.getVisibility() == 0) {
            this.j.setAlpha(f);
        }
    }

    private void b(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa1389f84993b3a10a38c8e39b67ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa1389f84993b3a10a38c8e39b67ce0");
        } else if (a() != null) {
            k.c(a(), (z || this.B != 1) ? false : false);
        }
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc8b5287f60e53d82bcca93b770bf85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc8b5287f60e53d82bcca93b770bf85");
        } else if (this.f == null || this.z == null) {
        } else {
            if (this.Q == null) {
                this.Q = e.a(this.z, i);
            } else {
                DrawableCompat.setTintList(this.Q, ColorStateList.valueOf(i));
            }
            this.f.setBackground(this.Q);
        }
    }

    public void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb23d45e0a8548c46372963e180ac374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb23d45e0a8548c46372963e180ac374");
            return;
        }
        if (this.s != null) {
            this.s.setTextColor(i);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd583d5dcd8eba3e4c5442bc54259e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd583d5dcd8eba3e4c5442bc54259e21");
        } else if (this.t != null) {
            this.t.setBackground(ContextCompat.getDrawable(a(), R.drawable.wm_sc_poi_channel_arrow_right_black));
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a
    public void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b99ebe0d3dc783dc1c4894513d78a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b99ebe0d3dc783dc1c4894513d78a3");
            return;
        }
        super.a(poiVerticalityDataResponse);
        if (poiVerticalityDataResponse == null) {
            return;
        }
        Object[] objArr2 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99f7f04b4927979986d75d0cab77c8c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99f7f04b4927979986d75d0cab77c8c6");
        } else {
            d();
            if (this.v != null && poiVerticalityDataResponse.searchCarouselTextInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) poiVerticalityDataResponse.searchCarouselTextInfo.searchCarouselTextList) && poiVerticalityDataResponse.searchCarouselTextInfo.carouselTime > 0) {
                u.a(this.v);
                u.c(this.u);
                List<SearchCarouselText> list = poiVerticalityDataResponse.searchCarouselTextInfo.searchCarouselTextList;
                int i = poiVerticalityDataResponse.searchCarouselTextInfo.carouselTime;
                Object[] objArr3 = {list, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = d;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f681d221839eed9dc8d4e281d055193a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f681d221839eed9dc8d4e281d055193a");
                } else {
                    this.A.addAll(list);
                    if (this.v != null && !com.sankuai.shangou.stone.util.a.b(this.A)) {
                        for (int i2 = 0; i2 < this.A.size(); i2++) {
                            SearchCarouselText searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.A, i2);
                            if (searchCarouselText != null) {
                                View inflate = getLayoutInflater().inflate(R.layout.wm_sc_drug_search_carousel_text_item, (ViewGroup) null);
                                TextView textView = (TextView) inflate.findViewById(R.id.tv_search_carousel_text_item_text);
                                textView.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
                                textView.setTextSize(2, 13.0f);
                                if (!t.a(searchCarouselText.text)) {
                                    u.a(textView, searchCarouselText.text);
                                    this.v.addView(inflate);
                                }
                            }
                        }
                        this.v.setInAnimation(this.mContext, R.anim.search_carousel_text_in);
                        this.v.setOutAnimation(this.mContext, R.anim.search_carousel_text_out);
                        if (this.A.size() == 1) {
                            f(0);
                        } else if (this.A.size() > 1) {
                            this.v.setFlipInterval(i);
                            this.v.startFlipping();
                            this.v.getInAnimation().setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b.4
                                public static ChangeQuickRedirect a;

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationEnd(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationStart(Animation animation) {
                                    Object[] objArr4 = {animation};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0edf9cb2db3227dd9bdf3039c0a1a89d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0edf9cb2db3227dd9bdf3039c0a1a89d");
                                    } else {
                                        b.this.f(b.this.v.getDisplayedChild());
                                    }
                                }
                            });
                        }
                    }
                }
            } else if (!TextUtils.isEmpty(poiVerticalityDataResponse.searchText)) {
                u.a(this.u);
                u.c(this.v);
                u.a(this.u, poiVerticalityDataResponse.searchText);
            }
            this.w.setVisibility(0);
            Integer num = -7859;
            Integer num2 = -15539;
            Integer num3 = -14539738;
            this.w.setBackground(e.a(getContext(), new int[]{num.intValue(), num2.intValue()}, R.dimen.wm_sc_common_dimen_16, GradientDrawable.Orientation.TL_BR));
            this.w.setTextColor(num3.intValue());
            e.a c = new e.a().a(getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_17)).c(-1);
            c.b(3).a(-15539);
            this.h.setBackground(c.a());
            this.u.setTextColor(-6711404);
        }
        this.T = poiVerticalityDataResponse.schemaForSearch;
        if ("1".equals(this.b.ah)) {
            this.n.setVisibility(0);
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_rj3ioc4p_mv", this.n);
            bVar.a("cat_id", t.a(String.valueOf(this.b.c)) ? "-999" : String.valueOf(this.b.c));
            bVar.a("stid", "-999");
            bVar.a("if_med_poi", 0);
            bVar.a("page_type", 0);
            com.sankuai.waimai.store.expose.v2.b.a().a(a(), bVar);
            return;
        }
        this.n.setVisibility(8);
    }

    @Override // com.sankuai.waimai.store.ocr.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b9d7e1a81dd86a29a5c5b06b6740b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b9d7e1a81dd86a29a5c5b06b6740b0");
            return;
        }
        SearchCarouselText searchCarouselText = null;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.A) && this.v != null) {
            searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.A, this.v.getDisplayedChild());
        }
        d.a(this.mContext, this.b, str, searchCarouselText, true, this.T);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1c634d072fcf714cd936612f30959a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1c634d072fcf714cd936612f30959a");
            return;
        }
        this.A.clear();
        if (this.v != null) {
            this.v.stopFlipping();
            this.v.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e0c9bef9e63c2ca329094fb398d7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e0c9bef9e63c2ca329094fb398d7a1");
            return;
        }
        SearchCarouselText searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.A, i);
        if (searchCarouselText == null || this.c == null || searchCarouselText.isExposed) {
            return;
        }
        searchCarouselText.isExposed = true;
        searchCarouselText.index = i;
        this.c.b(searchCarouselText);
    }

    public final void a(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8acaf3744f2be4acd5762634f9c982f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8acaf3744f2be4acd5762634f9c982f");
        } else {
            k.c(a(), (z && !this.E && this.B == 1) ? false : false);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ef16804437a673f99ea647661e85ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ef16804437a673f99ea647661e85ef");
            return;
        }
        super.onDestroy();
        d();
        com.sankuai.waimai.store.ocr.a.a().a(this);
    }
}
