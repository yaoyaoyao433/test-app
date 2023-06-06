package com.sankuai.waimai.store.search.ui.actionbar;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.router.c;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.RecommendedSearchKeyword;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSortFilterFragment;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.RoundedCornerLinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.ocr.b {
    public static ChangeQuickRedirect a;
    private InputMethodManager A;
    private LinearLayout B;
    private View C;
    private TextView D;
    private View.OnClickListener E;
    private RoundedCornerLinearLayout F;
    private ImageView G;
    private ImageView H;
    private ImageView I;
    private String J;
    private int K;
    Context b;
    ViewGroup c;
    public EditText d;
    ImageView e;
    TextView f;
    public TextView g;
    RecommendedSearchKeyword h;
    public a i;
    SearchShareData j;
    public LinearLayout k;
    HorizontalScrollView l;
    public int m;
    public String n;
    public List<GuidedItem> o;
    public View p;
    public View q;
    public View r;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    private View w;
    private FrameLayout x;
    private TextView y;
    private View z;

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "90a824938a8295db2316297ad94d1ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "90a824938a8295db2316297ad94d1ce3");
        } else if (bVar.j.bb != null) {
            SearchCarouselText searchCarouselText = bVar.j.bb;
            if (!aa.a(searchCarouselText.url)) {
                if (!aa.a(bVar.J)) {
                    if (bVar.a(bVar.d).equals("") || bVar.a(bVar.d).equals(bVar.J)) {
                        d.a(bVar.b, bVar.j.bb.url);
                        bVar.a(i, false);
                        return;
                    }
                    bVar.a(i, true);
                    return;
                }
                d.a(bVar.b, bVar.j.bb.url);
                bVar.a(i, false);
                return;
            }
            if (!aa.a(searchCarouselText.query)) {
                if (bVar.a(bVar.d).equals("")) {
                    bVar.j.h = bVar.J;
                } else {
                    bVar.j.h = bVar.a(bVar.d);
                }
            }
            bVar.a(i, true);
        } else {
            bVar.a(i, true, !TextUtils.isEmpty(bVar.j.h));
        }
    }

    public b(Context context, View view, View.OnClickListener onClickListener, a aVar) {
        Object[] objArr = {context, view, onClickListener, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b1efd213729a1939ec405b75cf3c3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b1efd213729a1939ec405b75cf3c3a");
            return;
        }
        this.n = "";
        this.o = new ArrayList();
        this.K = -1;
        this.t = true;
        this.u = false;
        this.v = false;
        this.b = context;
        this.C = view;
        this.E = onClickListener;
        this.i = aVar;
        this.j = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(context, SearchShareData.class);
    }

    public final void a(RecommendedSearchKeyword recommendedSearchKeyword, String str) {
        Object[] objArr = {recommendedSearchKeyword, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0481d94096415131f5e296cc48c9728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0481d94096415131f5e296cc48c9728");
            return;
        }
        this.h = recommendedSearchKeyword;
        this.w = this.C.findViewById(R.id.wm_search_global_action_bar);
        this.p = this.C.findViewById(R.id.wm_search_global_action_bar_bg);
        this.q = this.C.findViewById(R.id.wm_search_global_hot_rank_layer);
        this.r = this.w.findViewById(R.id.search_back_btn_white);
        this.H = (ImageView) this.C.findViewById(R.id.wm_drug_bg_image);
        this.D = (TextView) this.w.findViewById(R.id.search_back_btn);
        this.B = (LinearLayout) this.w.findViewById(R.id.drug_search_button);
        this.D.setOnClickListener(this.E);
        this.r.setOnClickListener(this.E);
        this.F = (RoundedCornerLinearLayout) this.w.findViewById(R.id.search_action_bar_container);
        this.c = (ViewGroup) this.w.findViewById(R.id.txt_search_keyword_container);
        this.d = (EditText) this.w.findViewById(R.id.txt_search_keyword);
        this.G = (ImageView) this.C.findViewById(R.id.ocr_camera);
        this.I = (ImageView) this.w.findViewById(R.id.search_icon);
        this.G.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fc3d1c4e20fe40fffb962447f930d49", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fc3d1c4e20fe40fffb962447f930d49");
                    return;
                }
                if (view.getContext() instanceof Activity) {
                    com.sankuai.waimai.store.ocr.a.a().a((Activity) view.getContext(), b.this);
                }
                int f = b.this.i != null ? b.this.i.f() : -999;
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", aa.a(String.valueOf(b.this.j.z)) ? "-999" : String.valueOf(b.this.j.z));
                hashMap.put("stid", aa.a(g.f(b.this.j)) ? "-999" : g.f(b.this.j));
                hashMap.put("page_type", Integer.valueOf(f));
                hashMap.put("sec_cat_id", Integer.valueOf(b.this.j.B));
                if (b.this.j.bg) {
                    hashMap.put("if_med_poi", Integer.valueOf(1 ^ (b.this.j.bg ? 1 : 0)));
                    if (b.this.j.C > 0) {
                        i = b.this.j.C;
                    } else {
                        i = b.this.j.B;
                    }
                    hashMap.put("sec_cat_id", Integer.valueOf(i));
                }
                com.sankuai.waimai.store.manager.judas.b.a(b.this.b, "b_waimai_sg_rj3ioc4p_mc").b(hashMap).a();
            }
        });
        if (!TextUtils.isEmpty(str)) {
            this.J = str;
            this.d.setHint(this.J);
        } else {
            this.d.setHint(this.b.getString(R.string.wm_sc_nox_search_global_hint));
        }
        this.d.requestFocus();
        this.e = (ImageView) this.w.findViewById(R.id.img_clear);
        this.k = (LinearLayout) this.w.findViewById(R.id.ll_filter_container);
        this.l = (HorizontalScrollView) this.w.findViewById(R.id.horizontal_scroll_view);
        this.A = (InputMethodManager) this.b.getSystemService("input_method");
        this.x = (FrameLayout) this.w.findViewById(R.id.address_layout);
        this.y = (TextView) this.w.findViewById(R.id.search_location_address);
        this.z = this.w.findViewById(R.id.mask_layer);
        this.g = (TextView) this.w.findViewById(R.id.search_location_address_white);
        this.z.setBackground(e.a(this.b, new int[]{R.color.wm_st_common_transparent, R.color.wm_sg_color_F5F5F6}, (int) R.dimen.wm_sc_common_dimen_0));
        this.f = (TextView) this.w.findViewById(R.id.search_tv);
        this.f.setBackground(e.a(this.b, new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_15));
        this.f.setSelected(false);
        o();
        if (a()) {
            this.d.setHint(this.h.viewKeyword);
            this.f.setSelected(true);
        }
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e589eb9ac8a47736c1e68aa9c39535ba", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e589eb9ac8a47736c1e68aa9c39535ba");
                } else {
                    b.a(b.this, 2);
                }
            }
        });
        this.B.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "727875c0c940c585196cb853f9133546", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "727875c0c940c585196cb853f9133546");
                } else {
                    b.a(b.this, 2);
                }
            }
        });
        this.x.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee6d9fa201f780bd90d494aede3035f1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee6d9fa201f780bd90d494aede3035f1");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(b.this.b, "b_waimai_f6mznhgc_mc").a("cat_id", Integer.valueOf(b.this.j.z)).a("search_log_id", b.this.j.q).a("stid", g.f(b.this.j)).a("keyword", b.this.j.h).a("media_type", 2).a("search_source", Integer.valueOf(b.this.j.aw)).a();
                d.a(view.getContext(), c.j);
            }
        });
        this.d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.10
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fff48beaad363296049e09a4ea727c4", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fff48beaad363296049e09a4ea727c4")).booleanValue();
                }
                if (i == 3) {
                    b.a(b.this, 1);
                    return true;
                }
                return false;
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.11
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5cf6392118c380865956900e51a0772", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5cf6392118c380865956900e51a0772");
                } else {
                    b.this.l();
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.12
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c8b0f64d0395aef5b27bf652505e907", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c8b0f64d0395aef5b27bf652505e907");
                    return;
                }
                if (b.this.i.f() == 3) {
                    b.this.c();
                }
                b.this.i.a();
                b.this.d.setText("");
                b.this.l();
                if (b.this.a()) {
                    b.this.d.setHint(b.this.h.viewKeyword);
                    b.this.f.setSelected(true);
                }
                b.this.b(true);
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "8ebe919c703234e069f70b0366b997fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "8ebe919c703234e069f70b0366b997fb");
                } else if (bVar.b instanceof FragmentActivity) {
                    FragmentManager supportFragmentManager = ((FragmentActivity) bVar.b).getSupportFragmentManager();
                    List<Fragment> fragments = supportFragmentManager.getFragments();
                    if (com.sankuai.shangou.stone.util.a.c(fragments) > 0) {
                        for (Fragment fragment : fragments) {
                            if (fragment instanceof SGBaseSortFilterFragment) {
                                supportFragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                            }
                        }
                    }
                }
            }
        });
        this.d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.13
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                boolean z2 = false;
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af65ad6bdec2c609ae2ee94d4cbde9d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af65ad6bdec2c609ae2ee94d4cbde9d5");
                    return;
                }
                b.this.e.setVisibility((!b.this.d.hasFocus() || TextUtils.isEmpty(b.this.d.getText().toString())) ? 8 : 0);
                if (!z || TextUtils.isEmpty(b.this.d.getText().toString()) || b.this.i.f() != 3) {
                    if (z && !TextUtils.isEmpty(b.this.d.getText().toString())) {
                        b.this.a(8);
                        b.this.a(true);
                        return;
                    }
                    b.this.a(0);
                    if (z) {
                        b.this.a(true);
                        return;
                    } else if (b.this.i.f() == 1) {
                        b.this.a(true);
                        return;
                    } else {
                        b.this.a(false);
                        return;
                    }
                }
                b.this.g();
                b.this.a(8);
                b.this.a(true);
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "93b563b0b28f1ab3d9002edb5ea56896", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "93b563b0b28f1ab3d9002edb5ea56896")).booleanValue();
                } else if (!TextUtils.isEmpty(bVar.j.ap) || !TextUtils.isEmpty(bVar.j.ad) || com.sankuai.shangou.stone.util.a.a((Collection<?>) bVar.j.ac) || !TextUtils.isEmpty(bVar.j.af) || !TextUtils.isEmpty(bVar.j.ag)) {
                    z2 = true;
                }
                if (!z2) {
                    b.this.c();
                    b.this.i.d();
                    return;
                }
                b.this.c();
                String str2 = b.this.s + StringUtil.SPACE + b.this.n;
                b.this.d.setText(str2);
                b.this.d.setSelection(str2.length());
                b.this.b(true);
            }
        });
        a(0);
        a(true);
        this.i.a();
        this.d.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.14
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfce10dc293d476fc1b09614f347d842", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfce10dc293d476fc1b09614f347d842");
                    return;
                }
                b bVar = b.this;
                String obj = editable.toString();
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e72f45b4a3f98ca45708ec6f4543ea63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e72f45b4a3f98ca45708ec6f4543ea63");
                    return;
                }
                bVar.b();
                bVar.e.setVisibility((!bVar.d.hasFocus() || TextUtils.isEmpty(obj)) ? 8 : 0);
                if (!TextUtils.isEmpty(obj)) {
                    bVar.f.setSelected(true);
                    bVar.i.b();
                    if (bVar.d.hasFocus()) {
                        bVar.a(true);
                        bVar.a(8);
                    } else {
                        bVar.a(false);
                        bVar.a(0);
                    }
                    if (!bVar.i.c()) {
                        bVar.i.d();
                    }
                    bVar.i.a(false);
                } else {
                    bVar.i.a();
                    bVar.f.setSelected(false);
                    bVar.a(0);
                    bVar.a(true);
                    bVar.i.e();
                    if (bVar.a()) {
                        bVar.d.setHint(bVar.h.viewKeyword);
                        bVar.f.setSelected(true);
                    }
                }
                Object[] objArr4 = {obj};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "c5c10d747e877a11476f0bf93fac0720", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "c5c10d747e877a11476f0bf93fac0720");
                } else if (TextUtils.isEmpty(obj)) {
                    ViewGroup.LayoutParams layoutParams = bVar.d.getLayoutParams();
                    layoutParams.width = bVar.c.getLayoutParams().width;
                    bVar.d.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = bVar.d.getLayoutParams();
                    layoutParams2.width = (int) bVar.d.getPaint().measureText(bVar.d.getText().toString());
                    bVar.d.setLayoutParams(layoutParams2);
                }
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd52dbf4fae219ab21b426c60fdfd39d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd52dbf4fae219ab21b426c60fdfd39d");
                    return;
                }
                b.this.l();
                b.this.d.setSelection(b.this.d.getText().toString().length());
            }
        });
        b();
    }

    private void a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28889c3ab97a745619b9571186490c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28889c3ab97a745619b9571186490c69");
        } else if (linearLayout == null) {
        } else {
            linearLayout.setBackground(e.a(this.b, new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_15));
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47dfd273ff3494e1b36b53041da0bd1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47dfd273ff3494e1b36b53041da0bd1a");
        } else if (z && n()) {
            u.a(this.B);
            u.c(this.I);
            this.c.setPadding(com.sankuai.waimai.foundation.utils.g.a(this.b, 13.0f), 0, 0, 0);
        } else {
            u.c(this.B);
            u.a(this.I);
            this.c.setPadding(0, 0, 0, 0);
        }
    }

    private boolean n() {
        return this.j.bg && com.sankuai.waimai.store.config.d.h;
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df568fa381ef0ade411d53a22a43ccf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df568fa381ef0ade411d53a22a43ccf5");
            return;
        }
        a(this.B);
        if (n()) {
            this.f.setVisibility(8);
            c(com.sankuai.waimai.foundation.utils.g.a(this.b, 10.0f));
            this.G.setImageDrawable(ContextCompat.getDrawable(this.b, R.drawable.wm_drug_home_camera));
            return;
        }
        this.f.setVisibility(0);
        this.G.setImageDrawable(ContextCompat.getDrawable(this.b, R.drawable.wm_sc_ocr_camera));
        c(com.sankuai.waimai.foundation.utils.g.a(this.b, 0.0f));
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547a054a6c094fb448a4b454e1c0f2a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547a054a6c094fb448a4b454e1c0f2a7");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.F.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
            this.F.setLayoutParams(layoutParams);
        }
    }

    private String a(@NonNull EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32dcbaefe78afb815a6ed9b8aeb46b4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32dcbaefe78afb815a6ed9b8aeb46b4b");
        }
        try {
            return editText.getText().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95bc2915a676dd39bae51155dce86622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95bc2915a676dd39bae51155dce86622");
        } else {
            a(i, z, true);
        }
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83841af326860d627abe6a658e11737a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83841af326860d627abe6a658e11737a")).booleanValue() : (this.j.bb != null && aa.a(this.j.bb.url) && aa.a(this.j.bb.query) && aa.a(this.j.h)) ? false : true;
    }

    private void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f2d8c30610bccbcd49e97e0ca130f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f2d8c30610bccbcd49e97e0ca130f2");
            return;
        }
        this.i.a("11002");
        if (this.j.bg) {
            if (z) {
                a(i, 0);
            } else {
                a(i, 1);
            }
        }
        if (z2) {
            b(i, true);
        }
        if (z) {
            if (!TextUtils.isEmpty(this.n) && com.sankuai.shangou.stone.util.a.a((Collection<?>) this.o)) {
                q();
            } else {
                this.i.a(false, "_search_button", 0);
            }
        }
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b733c5977c22f0b33d25f59527b0ab0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b733c5977c22f0b33d25f59527b0ab0d");
            return;
        }
        String str = "";
        if (this.s != null) {
            str = this.s + StringUtil.SPACE + this.n;
        }
        GuidedItem guidedItem = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.o, this.o.size() - 1);
        if (TextUtils.equals(r(), str)) {
            d();
            if (this.i == null || guidedItem == null) {
                return;
            }
            this.i.a(true, guidedItem.filterFrom, 0);
            return;
        }
        this.j.d();
        this.j.e();
        if (this.i == null || guidedItem == null) {
            return;
        }
        this.i.a(true, "_search_button", 0);
    }

    private void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5bda143af917b352727c46ab0b39be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5bda143af917b352727c46ab0b39be");
            return;
        }
        Map<String, Object> d = d(i);
        if (this.j.bg) {
            d.put("if_med_poi", 0);
        }
        if (z) {
            com.sankuai.waimai.store.manager.judas.b.a(this.b, "b_G73OZ").b(d).a();
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.b, "b_waimai_ocn7sgla_mv").b(d).a();
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6302293ce85d18b825cec7e131f02e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6302293ce85d18b825cec7e131f02e4");
        } else if (p()) {
            Map<String, Object> d = d(i);
            d.put("if_jump", Integer.valueOf(i2));
            d.put("if_med_poi", 0);
            d.put("sec_cat_id", Integer.valueOf(this.j.C > 0 ? this.j.C : this.j.B));
            com.sankuai.waimai.store.manager.judas.b.a(this.b, "b_waimai_med_brjqdz7c_mc").b(d).a();
        }
    }

    private Map<String, Object> d(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef020510fc88a165d854cb9b9dea188", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef020510fc88a165d854cb9b9dea188");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Integer.valueOf(this.j.z));
        hashMap.put("qw_type_id", TextUtils.isEmpty(this.j.g) ? "11002" : this.j.g);
        String str2 = this.j.h;
        hashMap.put("keyword", str2);
        hashMap.put("label_word", this.j.l);
        hashMap.put("click_type", Integer.valueOf(i));
        hashMap.put("search_source", Integer.valueOf(this.j.aw));
        String f = g.f(this.j);
        if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(this.j.bi)) {
            if (f.endsWith(";")) {
                f = f + this.j.bi;
            } else {
                f = f + ";" + this.j.bi;
            }
        } else if (TextUtils.isEmpty(f)) {
            f = this.j.bi;
        }
        if (this.j.bg) {
            if (TextUtils.isEmpty(f)) {
                str = com.sankuai.waimai.store.config.d.f;
            } else {
                str = f + com.sankuai.waimai.store.config.d.f;
            }
            hashMap.put("stid", str);
        } else {
            hashMap.put("stid", f);
        }
        hashMap.put("suggest_global_id", this.j.v);
        hashMap.put("suggest_log_id", this.j.w);
        if (this.h == null) {
            hashMap.put("is_travel", "");
            hashMap.put("default_stid", "");
        } else {
            hashMap.put("is_travel", TextUtils.isEmpty(this.h.sceneType) ? "" : this.h.sceneType);
            hashMap.put("default_stid", TextUtils.isEmpty(this.h.tgt_stids) ? "" : this.h.tgt_stids);
        }
        if (b(this.j.d)) {
            hashMap.put("label_type", Integer.valueOf(this.h.type));
        } else if (d(this.j.d)) {
            hashMap.put("label_type", "0");
        } else if (!TextUtils.isEmpty(str2)) {
            hashMap.put("label_type", "-999");
        } else {
            hashMap.put("label_type", "0");
        }
        if (this.j.bb != null) {
            if (!TextUtils.isEmpty(this.j.bb.query) || !TextUtils.isEmpty(this.j.bb.url)) {
                hashMap.put("word_type", Integer.valueOf(this.j.bb.type));
                hashMap.put("has_word", "1");
            } else {
                hashMap.put("word_type", "0");
                hashMap.put("has_word", "0");
            }
            hashMap.put("index", Integer.valueOf(this.j.bb.index));
        } else {
            hashMap.put("word_type", "0");
            hashMap.put("index", "0");
            hashMap.put("has_word", "0");
        }
        return hashMap;
    }

    boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e82d4ade66a39f468cc8807996d1fc40", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e82d4ade66a39f468cc8807996d1fc40")).booleanValue() : (this.j.bs || this.h == null || aa.a(this.h.viewKeyword)) ? false : true;
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7807d5152eddab1c5a5fdf1bc5117d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7807d5152eddab1c5a5fdf1bc5117d");
            return;
        }
        String str = "";
        String r = r();
        int childCount = this.k.getChildCount();
        if (childCount > 0) {
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = this.k.getChildAt(i);
                if (childAt != null && (childAt.getTag() instanceof GuidedItem)) {
                    GuidedItem guidedItem = (GuidedItem) childAt.getTag();
                    if (TextUtils.equals(guidedItem.filterFrom, "_search_over_page_search_group")) {
                        str = guidedItem.searchText;
                        break;
                    } else if (TextUtils.equals(guidedItem.filterFrom, "_search_second_search")) {
                        str = guidedItem.secondGuidedQuery;
                        break;
                    }
                }
            }
            str = r;
        } else if (!TextUtils.isEmpty(this.j.af)) {
            str = this.j.af;
        } else {
            if (TextUtils.isEmpty(r)) {
                if (this.h != null) {
                    str = this.h.searchKeyword;
                } else if (this.j.bb != null) {
                    str = this.j.bb.query;
                }
            }
            str = r;
        }
        this.j.h = str;
        boolean b = b(r);
        boolean d = d(r);
        if (b) {
            str = this.h.viewKeyword;
        } else if (d) {
            str = this.j.bb.text;
        }
        this.j.l = str;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bfd7f36e0fe007f3764f508fc8532d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bfd7f36e0fe007f3764f508fc8532d0")).booleanValue() : (this.h == null || TextUtils.isEmpty(this.h.searchKeyword) || !this.h.searchKeyword.equals(str)) ? false : true;
    }

    private boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93bc46c5844a3c27a5b842d60559b93c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93bc46c5844a3c27a5b842d60559b93c")).booleanValue() : !(this.j.bb == null || TextUtils.isEmpty(this.j.bb.query) || !this.j.bb.query.equals(str)) || (this.j.bb != null && TextUtils.isEmpty(str));
    }

    private String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200fcaf8384fcad65f57943ae8b483b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200fcaf8384fcad65f57943ae8b483b9");
        }
        this.j.d = this.d.getText().toString().trim();
        return this.j.d;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b37e66490b5ec77743fbdb811b36a73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b37e66490b5ec77743fbdb811b36a73a");
            return;
        }
        this.o.clear();
        this.n = m();
        this.s = r();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29111c961a0c0c445397f95f85d8e0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29111c961a0c0c445397f95f85d8e0e6");
            return;
        }
        this.d.setText(this.s);
        if (!TextUtils.isEmpty(this.n) && com.sankuai.shangou.stone.util.a.a((Collection<?>) this.o)) {
            for (GuidedItem guidedItem : this.o) {
                if (guidedItem != null) {
                    if (TextUtils.equals(guidedItem.filterFrom, "_search_over_page_search_group") || TextUtils.equals(guidedItem.filterFrom, "_search_second_search")) {
                        b(guidedItem, guidedItem.filterFrom, true);
                    } else {
                        a(guidedItem, guidedItem.filterFrom, true);
                    }
                }
            }
            this.k.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d72eebb9d3a1f12a452035d541b3148", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d72eebb9d3a1f12a452035d541b3148");
                    } else {
                        b.this.l.fullScroll(66);
                    }
                }
            });
        }
        this.s = "";
        this.n = "";
        this.o.clear();
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee2fdeb3759fd9e3c2b89bab97bafa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee2fdeb3759fd9e3c2b89bab97bafa3");
            return;
        }
        int childCount = this.k.getChildCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.k.getChildAt(i3);
            if (childAt != null && (childAt.getTag() instanceof GuidedItem)) {
                GuidedItem guidedItem = (GuidedItem) childAt.getTag();
                if (TextUtils.equals(guidedItem.filterFrom, "_search_over_page_search_group") && !z) {
                    this.j.c(guidedItem.searchText);
                    i = i3;
                } else if (TextUtils.equals(guidedItem.filterFrom, "_search_second_search") && !z) {
                    this.j.c(guidedItem.secondGuidedQuery);
                    i2 = i3;
                } else {
                    this.j.a(guidedItem.code);
                }
            }
        }
        if (i < 0 && i2 < 0) {
            if (i >= 0) {
                u.a(this.k);
                View childAt2 = this.k.getChildAt(i);
                this.k.removeAllViews();
                this.k.addView(childAt2);
            } else {
                this.k.removeAllViews();
                u.c(this.k);
                this.j.d();
                this.j.e();
            }
        }
        this.m = 0;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc688c7aaf515fbe24bb38f1a64f05d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc688c7aaf515fbe24bb38f1a64f05d6");
            return;
        }
        this.s = "";
        this.n = "";
        this.o.clear();
        b(true);
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd8818153eed204b3b4c3cb49c75619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd8818153eed204b3b4c3cb49c75619");
            return;
        }
        this.t = false;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams.rightMargin = com.sankuai.waimai.foundation.utils.g.a(this.b, -56.0f);
        this.f.setLayoutParams(layoutParams);
        this.p.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.F.getContext(), R.color.wm_sc_search_global_f5f5f6_bg));
        if (this.u) {
            t();
        }
        h();
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1473a474b0b141f8adfdef94793aa7df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1473a474b0b141f8adfdef94793aa7df");
            return;
        }
        this.t = true;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
        int f = this.i.f();
        if (layoutParams.rightMargin >= 0) {
            if (this.K != f) {
                b(2, false);
                this.K = f;
                return;
            }
            return;
        }
        this.K = f;
        if (!this.j.bg) {
            b(2, false);
        }
        u();
        layoutParams.rightMargin = com.sankuai.waimai.foundation.utils.g.a(this.b, 10.0f);
        this.f.setLayoutParams(layoutParams);
        this.p.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.F.getContext(), R.color.wm_sc_search_global_white_bg));
        s();
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55541c12e33e60fa7b164b6db2eb83fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55541c12e33e60fa7b164b6db2eb83fa");
            return;
        }
        u.a(this.p);
        u.c(this.H);
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbb7876b8462c71f3afb682863152a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbb7876b8462c71f3afb682863152a2");
        } else if (TextUtils.isEmpty(this.j.bo)) {
            u.a(this.p);
            u.c(this.H);
        } else {
            u.c(this.p);
            u.a(this.H);
            m.a(this.j.bo, this.H, com.sankuai.waimai.foundation.utils.g.a(this.b, 89.0f), ImageQualityUtil.b());
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26a30ca8db469905e92929a5caf34e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26a30ca8db469905e92929a5caf34e0");
        } else if (this.x.getVisibility() == 0 || this.j.be == null || !TextUtils.equals(this.j.be.get("search_result_page_layout_optimization"), "A")) {
        } else {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.removeRule(0);
            this.x.setVisibility(0);
            String d = com.sankuai.waimai.store.locate.a.d();
            if (!TextUtils.isEmpty(d)) {
                this.y.setText(d);
                this.g.setText(d);
                if (d.length() > 6) {
                    this.z.setVisibility(0);
                } else {
                    this.z.setVisibility(8);
                }
            }
            layoutParams.addRule(0, R.id.address_layout);
            this.F.setLayoutParams(layoutParams);
            if (this.k != null && this.k.getChildCount() > 0) {
                this.k.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8b65f2ac8a9a7c81b714b797136a18c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8b65f2ac8a9a7c81b714b797136a18c");
                        } else {
                            b.this.l.fullScroll(66);
                        }
                    }
                });
            }
            if (this.v) {
                return;
            }
            this.v = true;
            com.sankuai.waimai.store.manager.judas.b.b(this.b, "b_waimai_f6mznhgc_mv").a("cat_id", Integer.valueOf(this.j.z)).a("search_log_id", this.j.q).a("stid", g.f(this.j)).a("keyword", this.j.h).a("media_type", 2).a("search_source", Integer.valueOf(this.j.aw)).a();
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b99e2e30b5caae54a76840ac92b2ef17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b99e2e30b5caae54a76840ac92b2ef17");
        } else if (this.x.getVisibility() == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.removeRule(0);
            this.x.setVisibility(8);
            layoutParams.addRule(0, R.id.search_tv);
            this.F.setLayoutParams(layoutParams);
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7411c09f0a83373f9f9f3c3975a1bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7411c09f0a83373f9f9f3c3975a1bff");
            return;
        }
        this.u = false;
        this.v = false;
        u();
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a1ca365dacd401938f34f4ed01a3da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a1ca365dacd401938f34f4ed01a3da");
            return;
        }
        this.u = true;
        if (this.t) {
            return;
        }
        t();
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cccfaaacb21e46db4d40ecf31082d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cccfaaacb21e46db4d40ecf31082d3");
        } else if (this.A == null || this.d == null) {
        } else {
            this.d.setFocusable(false);
            this.d.setFocusableInTouchMode(false);
            this.d.setCursorVisible(false);
            this.d.clearFocus();
            if (this.A.isActive()) {
                this.A.hideSoftInputFromWindow(this.d.getWindowToken(), 0);
            }
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bb7448c661377408d8ff9a3c123647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bb7448c661377408d8ff9a3c123647");
            return;
        }
        this.d.setFocusable(true);
        this.d.setFocusableInTouchMode(true);
        this.d.setCursorVisible(true);
        this.d.requestFocus();
        this.A.showSoftInput(this.d, 0);
    }

    public final void a(GuidedItem guidedItem, String str, boolean z) {
        Object[] objArr = {guidedItem, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9c3e510a68d2dbbc2e1afbb91d0035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9c3e510a68d2dbbc2e1afbb91d0035");
            return;
        }
        if (!TextUtils.equals(str, "_search_over_page_filer")) {
            this.m = guidedItem.filterItemStatus;
        }
        if (!TextUtils.isEmpty(this.j.ad)) {
            this.j.a(this.j.ad);
        }
        this.j.a(guidedItem.code, str);
        if (z) {
            a(a(this.k, str, guidedItem));
        }
    }

    public final void b(@NonNull GuidedItem guidedItem, @NonNull String str, boolean z) {
        Object[] objArr = {guidedItem, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe16e9620f6f50003769196d5f934558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe16e9620f6f50003769196d5f934558");
            return;
        }
        if (TextUtils.equals(str, "_search_over_page_search_group")) {
            this.j.c(guidedItem.searchText);
        }
        if (TextUtils.equals(str, "_search_second_search")) {
            this.j.ah = this.j.h;
            this.j.ai = guidedItem.showText;
            this.j.c(guidedItem.secondGuidedQuery);
        }
        this.j.b(guidedItem.searchText, str);
        if (z) {
            a(a(this.k, str, guidedItem));
        }
    }

    private View a(@NonNull ViewGroup viewGroup, final String str, @NonNull final GuidedItem guidedItem) {
        Object[] objArr = {viewGroup, str, guidedItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24b3dbfca6920199f386f22a8546e59", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24b3dbfca6920199f386f22a8546e59");
        }
        final com.sankuai.waimai.store.search.common.view.e eVar = new com.sankuai.waimai.store.search.common.view.e(this.b, true);
        if (TextUtils.equals(str, "_search_second_search")) {
            eVar.a(guidedItem.showText);
        } else {
            eVar.a(guidedItem.searchText);
        }
        guidedItem.filterFrom = str;
        eVar.setTag(guidedItem);
        eVar.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.actionbar.b.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e319758603e167810f45f9bcf625832", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e319758603e167810f45f9bcf625832");
                    return;
                }
                if (b.this.j.bg && (TextUtils.equals(str, "_search_over_page_search_group") || TextUtils.equals(str, "_search_second_search"))) {
                    b bVar = b.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "83bc8b6b9a9e9683303eee4ac87549e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "83bc8b6b9a9e9683303eee4ac87549e5");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("cat_id", Integer.valueOf(bVar.j.z));
                        hashMap.put("if_med_poi", Integer.valueOf(!bVar.j.bg ? 1 : 0));
                        hashMap.put("keyword", bVar.j.h);
                        hashMap.put("label_word", bVar.m());
                        com.sankuai.waimai.store.manager.judas.b.a(bVar.b, "b_waimai_med_bhi95z8o_mc").b(hashMap).a();
                    }
                }
                if (!b.this.j.m() || TextUtils.equals(str, "_search_over_page_filer") || b.this.i == null) {
                    b.this.a(eVar, guidedItem);
                    if (b.this.i != null) {
                        b.this.j.av = -1;
                        b.this.i.a(true, "_search_button", 0);
                        return;
                    }
                    return;
                }
                b.this.i.g();
            }
        });
        return eVar;
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b07f7d8ce017febd0aaed5dc7667a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b07f7d8ce017febd0aaed5dc7667a6");
        } else if (this.k == null || view == null) {
        } else {
            if (this.k.getChildCount() <= 0) {
                com.sankuai.waimai.store.search.common.view.e eVar = new com.sankuai.waimai.store.search.common.view.e(this.b, true);
                eVar.a(r());
                eVar.a();
                GuidedItem guidedItem = new GuidedItem();
                guidedItem.searchText = r();
                eVar.setTag(guidedItem);
                this.k.addView(eVar);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
                layoutParams.removeRule(1);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            } else if (this.k.getChildCount() >= 2) {
                com.sankuai.waimai.store.search.common.view.e eVar2 = (com.sankuai.waimai.store.search.common.view.e) this.k.getChildAt(this.k.getChildCount() - 1);
                eVar2.a();
                eVar2.setClickable(false);
                this.k.removeAllViews();
                this.k.addView(eVar2);
                this.j.d = eVar2.getText();
            }
            u.a(this.k);
            this.k.addView(view);
        }
    }

    public final String m() {
        int childCount;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e69e6d4b9edf3977eadfd0736a1cb02", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e69e6d4b9edf3977eadfd0736a1cb02");
        }
        if (this.k.getVisibility() != 0 || (childCount = this.k.getChildCount()) <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.k.getChildAt(i);
            if (childAt != null && (childAt.getTag() instanceof GuidedItem)) {
                GuidedItem guidedItem = (GuidedItem) childAt.getTag();
                if (i != 0) {
                    sb.append(guidedItem.searchText);
                    if (i < childCount - 1) {
                        sb.append(StringUtil.SPACE);
                    }
                }
                this.o.add(guidedItem);
            }
        }
        return sb.toString();
    }

    public void a(View view, GuidedItem guidedItem) {
        Object[] objArr = {view, guidedItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884f17bac3b80f23c9a0f4ec4a713cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884f17bac3b80f23c9a0f4ec4a713cef");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8fa8fab343e937720cdac3ae2bcf170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8fa8fab343e937720cdac3ae2bcf170");
        } else if (this.k != null && view != null) {
            this.k.removeView(view);
            if (this.k.getChildCount() <= 0) {
                u.c(this.k);
            } else if (this.k.getChildCount() <= 1) {
                this.k.removeAllViews();
                u.c(this.k);
            }
        }
        if (guidedItem != null) {
            if (TextUtils.equals(guidedItem.filterFrom, "_search_over_page_search_group")) {
                this.j.d();
            }
            if (TextUtils.equals(guidedItem.filterFrom, "_search_second_search")) {
                this.j.e();
            }
            this.j.a(guidedItem.code);
            if (this.m == 0 || this.m != guidedItem.filterItemStatus) {
                return;
            }
            this.m = 0;
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef61c270ef3b796f76b3e53c8d4baee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef61c270ef3b796f76b3e53c8d4baee");
        } else if (z) {
            u.a(this.r);
        } else {
            u.c(this.r);
        }
    }

    void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496fe2f6546cf35485edc5b3ada673fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496fe2f6546cf35485edc5b3ada673fd");
        } else if (this.j == null) {
        } else {
            if (this.j.k()) {
                this.G.setVisibility(i);
                v();
                return;
            }
            this.G.setVisibility(8);
        }
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65469b7645b303540e696b305a8bf805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65469b7645b303540e696b305a8bf805");
        } else if (z) {
            u.a(this.g);
            u.c(this.z);
        } else {
            u.c(this.g);
            u.a(this.z);
        }
    }

    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8591b1d9812845831a6567b0f26551c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8591b1d9812845831a6567b0f26551c9");
        } else if (z) {
            u.a(this.z);
        } else {
            u.c(this.z);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14250c49e3deddfc086b4d5de08dde1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14250c49e3deddfc086b4d5de08dde1c");
            return;
        }
        com.sankuai.waimai.store.view.d delegate = this.F.getDelegate();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.view.d.a;
        if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect2, false, "155dda524d8d31bf27b7717df25a43e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect2, false, "155dda524d8d31bf27b7717df25a43e1");
            return;
        }
        delegate.d = i;
        delegate.e.setColor(delegate.d);
        if (com.sankuai.waimai.store.view.d.b) {
            delegate.c.invalidateOutline();
        }
        delegate.c.invalidate();
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a057351892da8089786b8e594a3008d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a057351892da8089786b8e594a3008d6");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_rj3ioc4p_mv", this.G);
        bVar.a("cat_id", aa.a(String.valueOf(this.j.z)) ? "-999" : String.valueOf(this.j.z));
        bVar.a("stid", aa.a(g.f(this.j)) ? "-999" : g.f(this.j));
        if (this.j.bg) {
            bVar.a("if_med_poi", 0);
            bVar.a("sec_cat_id", Integer.valueOf(this.j.C > 0 ? this.j.C : this.j.B));
        }
        if (this.i == null) {
            bVar.a("page_type", -999);
        } else {
            bVar.a("page_type", Integer.valueOf(this.i.f()));
        }
        if (this.b instanceof SCBaseActivity) {
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.b, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.ocr.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88571656a0338b2b02219de6d55eff93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88571656a0338b2b02219de6d55eff93");
            return;
        }
        if (this.j.s == null) {
            RecommendedSearchKeyword recommendedSearchKeyword = new RecommendedSearchKeyword();
            recommendedSearchKeyword.searchKeyword = str;
            this.j.s = recommendedSearchKeyword;
        } else {
            this.j.s.searchKeyword = str;
        }
        this.j.h = str;
        this.i.a(false, "_search_ocr", 0);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef974928987320dd6a8cf3eb0824b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef974928987320dd6a8cf3eb0824b53");
        } else if (this.d != null) {
            this.d.setText(str);
        }
    }
}
