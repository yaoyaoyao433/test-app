package com.sankuai.waimai.business.search.ui.actionbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.business.search.common.util.e;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.model.CommonPageStyleConfig;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.i;
import com.sankuai.waimai.platform.utils.p;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public boolean A;
    DragTopLayout.b B;
    FrameLayout C;
    final ImageView D;
    View E;
    boolean F;
    boolean G;
    CommonPageStyleConfig H;
    public String I;
    public String J;
    private int K;
    private View L;
    private TextView M;
    private TextView N;
    private InputMethodManager O;
    private View P;
    private RooIconFont Q;
    private View R;
    private View S;
    private TextView T;
    private TextView U;
    private ViewGroup V;
    private TextView W;
    private View X;
    private View.OnClickListener Y;
    private ResultFragment.c Z;
    private String aa;
    private String ab;
    final GlobalSearchActivity b;
    public Context c;
    ViewGroup d;
    public View e;
    public EditText f;
    RooIconFont g;
    public TextView h;
    public com.sankuai.waimai.business.search.common.view.b i;
    public com.sankuai.waimai.business.search.common.view.b j;
    public String k;
    public String l;
    public boolean m;
    public String n;
    public String o;
    public a p;
    public SearchShareData q;
    final RecommendedSearchKeyword r;
    public ViewGroup s;
    TextView t;
    TextView u;
    public c v;
    public Runnable w;
    public String x;
    String y;
    String z;

    public static /* synthetic */ void a(b bVar, int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e407a7592b3ff4178dcb0b0691cbba9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e407a7592b3ff4178dcb0b0691cbba9e");
            return;
        }
        bVar.w();
        bVar.p.a("11002");
        bVar.p.a(true);
        if (bVar.i != null && !TextUtils.isEmpty(bVar.J) && !TextUtils.isEmpty(bVar.f.getText())) {
            if (bVar.I != null) {
                str = bVar.I + StringUtil.SPACE + bVar.J;
            } else {
                str = bVar.J;
            }
            if (bVar.c().equals(str) || bVar.i.getVisibility() == 0) {
                bVar.e();
                bVar.p.a(false, bVar.y, 0);
            } else {
                bVar.g();
                bVar.p.a(false, "_search_positivesearch", 0);
            }
        } else {
            bVar.p.a(false, "_search_positivesearch", 0);
        }
        bVar.a(i, true);
    }

    public b(GlobalSearchActivity globalSearchActivity, View view, a aVar, int i, String str, final boolean z) {
        Object[] objArr = {globalSearchActivity, view, aVar, Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb0d140b876bdb1db2e4ccb5ba3a15f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb0d140b876bdb1db2e4ccb5ba3a15f");
            return;
        }
        this.K = 0;
        this.m = false;
        this.B = DragTopLayout.b.COLLAPSED;
        this.Y = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3276d51d92efbbe8b6e2a38854dbca87", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3276d51d92efbbe8b6e2a38854dbca87");
                } else {
                    b.a(b.this, 2);
                }
            }
        };
        this.Z = new ResultFragment.c() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.ui.result.ResultFragment.c
            public final void a(DragTopLayout.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e7223bd913ac6c53be1214503b3fa1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e7223bd913ac6c53be1214503b3fa1e");
                } else if (b.this.B != bVar) {
                    b.this.B = bVar;
                }
            }
        };
        this.G = true;
        this.b = globalSearchActivity;
        this.c = view.getContext();
        this.P = view;
        this.p = aVar;
        this.x = str;
        this.A = z;
        this.q = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(this.c, SearchShareData.class);
        this.r = this.q.o;
        this.C = (FrameLayout) this.P.findViewById(R.id.search_global_bg_container);
        this.D = (ImageView) this.P.findViewById(R.id.search_global_bg);
        this.E = this.P.findViewById(R.id.search_global_bg_layer);
        this.e = this.P.findViewById(R.id.wm_search_global_action_bar);
        this.R = this.P.findViewById(R.id.status_bar_bg_view);
        if (i > 0) {
            this.R.getLayoutParams().height = i;
            this.R.setBackgroundColor(-657930);
        } else {
            this.R.getLayoutParams().height = 0;
            this.R.setBackgroundColor(0);
        }
        this.Q = (RooIconFont) this.e.findViewById(R.id.search_back_btn);
        this.Q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e96375072adb06059bf6bcd66863a63", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e96375072adb06059bf6bcd66863a63");
                } else {
                    b.this.p.j();
                }
            }
        });
        this.S = this.e.findViewById(R.id.search_action_bar_container);
        this.d = (ViewGroup) this.e.findViewById(R.id.txt_search_keyword_container);
        this.f = (EditText) this.e.findViewById(R.id.txt_search_keyword);
        this.f.setHint(z ? R.string.wm_nox_search_global_hint_elderly : R.string.wm_nox_search_global_hint);
        this.f.requestFocus();
        this.g = (RooIconFont) this.e.findViewById(R.id.img_clear);
        this.O = (InputMethodManager) this.c.getSystemService("input_method");
        this.h = (TextView) this.e.findViewById(R.id.search_tv);
        this.L = this.e.findViewById(R.id.search_tv_divider);
        this.h.setSelected(false);
        this.M = (TextView) this.e.findViewById(R.id.elderly_search_tv);
        this.s = (ViewGroup) this.e.findViewById(R.id.search_change_location);
        this.T = (TextView) this.e.findViewById(R.id.switch_address_change);
        this.U = (TextView) this.e.findViewById(R.id.switch_address_tv);
        this.V = (ViewGroup) this.e.findViewById(R.id.switch_mode_container);
        this.W = (TextView) this.e.findViewById(R.id.switch_mode_tv);
        this.t = (TextView) this.e.findViewById(R.id.switch_mode_poi);
        this.u = (TextView) this.e.findViewById(R.id.switch_mode_spu);
        this.X = this.e.findViewById(R.id.switch_mode_divider);
        if (a() && !TextUtils.isEmpty(this.r.viewKeyword)) {
            this.f.setHint(this.r.viewKeyword);
        }
        this.h.setOnClickListener(this.Y);
        this.M.setOnClickListener(this.Y);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.10
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8686fa0043f9c52d3f82830073405cc9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8686fa0043f9c52d3f82830073405cc9");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", Integer.valueOf(b.this.q.w));
                hashMap.put("search_log_id", b.this.q.l);
                hashMap.put("stid", b.this.q.d);
                hashMap.put("keyword", b.this.q.g);
                hashMap.put("media_type", 1);
                h.a(b.this.c, 1, "c_nfqbfvw", "b_waimai_f6mznhgc_mc", AppUtil.generatePageInfoKey(b.this.c), hashMap);
                com.sankuai.waimai.foundation.router.a.a(b.this.c, com.sankuai.waimai.foundation.router.interfaces.c.D);
            }
        });
        this.f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.11
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                Object[] objArr2 = {textView, Integer.valueOf(i2), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cb6796d855ff8af6f582e69fa8e41ac", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cb6796d855ff8af6f582e69fa8e41ac")).booleanValue();
                }
                if (i2 == 3) {
                    b.a(b.this, 1);
                    return true;
                }
                return false;
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.12
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45e557bad59dd090d6708aff927fb090", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45e557bad59dd090d6708aff927fb090");
                } else {
                    b.this.n();
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.13
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e09a45474a6660171338d24f655b124", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e09a45474a6660171338d24f655b124");
                    return;
                }
                if (b.this.p.i() == 3) {
                    b.this.d();
                }
                b.this.p.a();
                b.this.f.setText("");
                b.this.n();
                if (b.this.i != null) {
                    b.this.o();
                    b.this.i.a("");
                    if (b.this.j != null) {
                        b.this.j.a("");
                    }
                    b.this.k = "";
                    b.this.l = "";
                }
                if (b.this.a()) {
                    b.this.f.setHint(b.this.r.viewKeyword);
                }
            }
        });
        this.f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.14
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z2) {
                Object[] objArr2 = {view2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9e9a11cc1c33cf1202f802e36b33dff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9e9a11cc1c33cf1202f802e36b33dff");
                    return;
                }
                if (!z && b.this.f.getText().length() > 0) {
                    b.this.g.setVisibility(0);
                } else {
                    b.this.g.setVisibility(8);
                }
                if (z2 && !TextUtils.isEmpty(b.this.f.getText().toString()) && b.this.p.i() == 3) {
                    b.this.d();
                    if (b.this.i != null && !TextUtils.isEmpty(b.this.J)) {
                        String str2 = b.this.I + StringUtil.SPACE + b.this.J;
                        b.this.f.setText(str2);
                        b.this.f.setSelection(str2.length());
                        return;
                    }
                    b.this.p.f();
                }
            }
        });
        this.p.a();
        this.f.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.15
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04f77362191243b19f5ef67e4b4e979e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04f77362191243b19f5ef67e4b4e979e");
                    return;
                }
                b bVar = b.this;
                String obj = editable.toString();
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "ddd545d5b22cdb3f0de67fa0377d89b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "ddd545d5b22cdb3f0de67fa0377d89b6");
                    return;
                }
                bVar.b();
                if (!TextUtils.isEmpty(obj)) {
                    if (!bVar.A) {
                        bVar.g.setVisibility(0);
                    }
                    bVar.p.d();
                    if (!bVar.p.e()) {
                        bVar.p.f();
                    }
                    bVar.p.a(false);
                    return;
                }
                bVar.p.a();
                bVar.g.setVisibility(8);
                bVar.p.g();
                if (bVar.a()) {
                    bVar.f.setHint(bVar.r.viewKeyword);
                }
            }
        });
        b();
        a(2, false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "967726e852d37519c564e777d74ab83a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "967726e852d37519c564e777d74ab83a");
        } else if (this.A) {
            ((LinearLayout.LayoutParams) this.e.getLayoutParams()).height = g.a(this.c, 69.0f);
            this.e.setPadding(this.e.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), g.a(this.c, 7.0f));
            ((LinearLayout.LayoutParams) this.S.getLayoutParams()).height = g.a(this.c, 60.0f);
            ((FrameLayout.LayoutParams) this.f.getLayoutParams()).height = g.a(this.c, 28.0f);
            this.f.setTextSize(1, 20.0f);
            this.f.setTextColor(Color.parseColor("#222426"));
            ((LinearLayout.LayoutParams) this.Q.getLayoutParams()).width = g.a(this.c, 26.0f);
            this.Q.setTextColor(this.c.getResources().getColor(R.color.wm_nox_search_gray));
            this.Q.setTextSize(1, 32.0f);
            this.M.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams.width = g.a(this.c, 84.0f);
            layoutParams.height = g.a(this.c, 52.0f);
            this.s.setVisibility(8);
            this.h.setVisibility(8);
            this.L.setVisibility(8);
            this.V.setVisibility(8);
            this.R.setBackgroundColor(-1);
            this.e.setBackgroundColor(-1);
        }
        r();
        ResultFragment resultFragment = globalSearchActivity.f;
        ResultFragment.c cVar = this.Z;
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = ResultFragment.d;
        if (PatchProxy.isSupport(objArr3, resultFragment, changeQuickRedirect3, false, "2071df1b2da87f779ce3870000ad2d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, resultFragment, changeQuickRedirect3, false, "2071df1b2da87f779ce3870000ad2d48");
        } else {
            resultFragment.t.add(cVar);
        }
    }

    public final void a(int i, int i2, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d699141850dd0a0be23b450d4d22172f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d699141850dd0a0be23b450d4d22172f");
            return;
        }
        if (f == 1.0f) {
            x();
        } else {
            y();
        }
        a(1.0f);
        int i3 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, i3 >= 0 || this.G);
        if (i3 >= 0) {
            C();
        } else {
            D();
        }
        c(i2);
        float a2 = g.a(this.c, 20.0f) * (1.0f - f);
        Object[] objArr2 = {Float.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec6a7de9af94f1b267cb134d4b0dfaa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec6a7de9af94f1b267cb134d4b0dfaa3");
        } else if (this.c instanceof GlobalSearchActivity) {
            Drawable background = ((GlobalSearchActivity) this.c).f.l.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadii(new float[]{a2, a2, a2, a2, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        }
        this.e.setBackgroundColor(i);
        this.R.setBackgroundColor(i);
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ad70a86015d4c1db29a0cecfa319fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ad70a86015d4c1db29a0cecfa319fb");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qw_type_id", TextUtils.isEmpty(this.q.e) ? "11002" : this.q.e);
        String str = this.q.g;
        hashMap.put("keyword", str);
        hashMap.put("label_word", this.q.h);
        if (z) {
            hashMap.put("click_type", Integer.valueOf(i));
        }
        hashMap.put("cat_id", Long.valueOf(this.q.v));
        hashMap.put("suggest_global_id", this.p.b());
        hashMap.put("suggest_log_id", this.p.c());
        hashMap.put("rcmd_s_log_id", this.q.c);
        if (this.r == null) {
            hashMap.put("is_travel", "");
            hashMap.put("default_stid", "");
        } else {
            hashMap.put("is_travel", TextUtils.isEmpty(this.r.sceneType) ? "" : this.r.sceneType);
            hashMap.put("default_stid", TextUtils.isEmpty(this.r.tgt_stids) ? "" : this.r.tgt_stids);
        }
        if (b(this.q.b)) {
            hashMap.put("label_type", Integer.valueOf(this.r.type));
            hashMap.put("word_type", Integer.valueOf(this.r.wordType));
        } else {
            hashMap.put("word_type", 0);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("label_type", "-999");
            } else {
                hashMap.put("label_type", "");
            }
        }
        if (z) {
            if (this.q.o != null && !TextUtils.isEmpty(str) && ((str.equals(this.q.o.viewKeyword) || str.equals(this.q.o.searchKeyword)) && !TextUtils.isEmpty(this.q.o.scheme))) {
                hashMap.put("word_page_type", 1);
            } else if (e.a(str, e.b.SEARCH)) {
                hashMap.put("word_page_type", 1);
            } else {
                hashMap.put("word_page_type", 0);
            }
        }
        hashMap.put("location_page", 2);
        hashMap.put("stid", this.q.d);
        if (this.q.o != null) {
            hashMap.put("is_fresh_request", Integer.valueOf(this.q.o.isRefreshRequest ? 1 : 0));
        }
        try {
            hashMap.putAll(com.sankuai.waimai.mach.utils.b.a(this.q.o.logData));
        } catch (Exception unused) {
        }
        if (z) {
            if (this.q.o != null && this.q.o.isRefreshRequest && !TextUtils.isEmpty(this.q.o.triggerPoiIdStr)) {
                hashMap.put(RollSearchKeyword.TRIGGER_POI_ID, this.q.o.triggerPoiIdStr);
            }
            h.a(this.c, 1, "c_nfqbfvw", "b_G73OZ", AppUtil.generatePageInfoKey(this.c), hashMap);
            return;
        }
        h.a(this.c, 2, "c_nfqbfvw", "b_waimai_ocn7sgla_mv", AppUtil.generatePageInfoKey(this.c), hashMap);
    }

    boolean a() {
        return this.r != null;
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c12967921418aa083986c93ee9ab7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c12967921418aa083986c93ee9ab7c");
            return;
        }
        String str = "";
        String c = c();
        if (!TextUtils.isEmpty(c)) {
            str = c;
        } else if (this.r != null) {
            str = this.r.searchKeyword;
        }
        this.q.g = str;
        if (b(c)) {
            str = this.r.viewKeyword;
        }
        this.q.h = str;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d00d01825c8f8b67ac496d3a7eff30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d00d01825c8f8b67ac496d3a7eff30")).booleanValue() : !(this.r == null || TextUtils.isEmpty(this.r.searchKeyword) || !this.r.searchKeyword.equals(str)) || (this.r != null && TextUtils.isEmpty(str));
    }

    String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d768560df53e72c2dfb197ce955b9cb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d768560df53e72c2dfb197ce955b9cb0");
        }
        this.q.b = this.f.getText().toString().trim();
        return this.q.b;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29c61c08a19d62fa180703c3d77581f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29c61c08a19d62fa180703c3d77581f");
            return;
        }
        this.I = c();
        if (this.i != null && !TextUtils.isEmpty(this.i.getText())) {
            this.J = this.l;
            this.aa = this.k;
            this.i.a("");
            this.i.setVisibility(8);
            this.k = "";
            this.l = "";
            if (this.j != null) {
                this.j.a("");
                this.j.setVisibility(8);
            }
            this.f.setAlpha(1.0f);
        }
        if (this.N == null || TextUtils.isEmpty(this.N.getText())) {
            return;
        }
        this.ab = this.N.getText().toString();
        this.N.setText("");
        this.N.setVisibility(8);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18fd2f733054473db8f73baa9f51be2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18fd2f733054473db8f73baa9f51be2a");
            return;
        }
        this.f.setText(this.I);
        if (this.i != null && !TextUtils.isEmpty(this.J)) {
            this.l = this.J;
            this.k = this.aa;
            this.i.setVisibility(0);
            this.i.a(this.l);
            if (this.j != null) {
                this.j.setVisibility(0);
                this.j.a(c());
            }
            this.f.setAlpha(0.0f);
        } else {
            this.f.setAlpha(1.0f);
        }
        if ((this.i == null || this.i.getVisibility() == 8) && this.N != null && !TextUtils.isEmpty(this.ab)) {
            this.N.setVisibility(0);
            this.N.setText(this.ab);
        }
        this.I = "";
        this.J = "";
        this.ab = "";
        this.aa = "";
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a4bdc199b433b8b60a2c778c5da1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a4bdc199b433b8b60a2c778c5da1be");
            return;
        }
        if (this.N != null) {
            this.N.setText("");
            this.N.setVisibility(8);
        }
        this.ab = "";
    }

    private void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9b5a3c077ff027f49a81f7ace59382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9b5a3c077ff027f49a81f7ace59382");
            return;
        }
        if (this.i != null) {
            this.i.a("");
            this.k = "";
            this.l = "";
            this.i.setVisibility(8);
        }
        if (this.j != null) {
            this.j.a("");
            this.j.setVisibility(8);
        }
        this.f.setAlpha(1.0f);
        this.I = "";
        this.J = "";
        this.aa = "";
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a07e5f003e977f5c285678c3cb45c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a07e5f003e977f5c285678c3cb45c7");
            return;
        }
        z();
        f();
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3e03a36ca8c1ad7280b0e58bd77db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3e03a36ca8c1ad7280b0e58bd77db7");
            return;
        }
        if (this.A) {
            this.M.setVisibility(8);
        } else {
            this.h.setVisibility(8);
            this.L.setVisibility(8);
        }
        r();
        B();
        if ((u() || !this.b.f.i) && this.b.b == 3) {
            a(this.e, -657930, true);
        } else {
            a(this.e, -657930, false);
        }
    }

    private void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61946a8f0f469c6c59fc9459893a10d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61946a8f0f469c6c59fc9459893a10d9");
            return;
        }
        if (this.A) {
            this.M.setVisibility(0);
        } else {
            this.h.setVisibility(0);
            this.L.setVisibility(0);
        }
        s();
        a(this.e, -657930, false);
        a(2, false);
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548796836e54c10031f8e60417c47662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548796836e54c10031f8e60417c47662");
        } else if (this.h.getVisibility() == 0 || this.M.getVisibility() == 0) {
        } else {
            A();
        }
    }

    private void a(View view, int i, boolean z) {
        Object[] objArr = {view, -657930, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "869254838da05f6f46fe96822ebbe592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "869254838da05f6f46fe96822ebbe592");
        } else if (this.A) {
        } else {
            if (z && (u() || !this.b.f.i)) {
                this.R.setBackgroundColor(-657930);
                view.setBackgroundColor(-657930);
                a(0.0f);
                com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, this.G);
                return;
            }
            a(1.0f);
            com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, true);
            view.setBackgroundColor(-657930);
            this.R.setBackgroundColor(-657930);
        }
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976341aad58e3c76f103f536dd57ef07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976341aad58e3c76f103f536dd57ef07");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba0164162d24958812fba154a113537e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba0164162d24958812fba154a113537e");
        } else {
            this.K = i;
            B();
        }
        this.V.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38be13559e1437baddc0d53efeb2e997", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "38be13559e1437baddc0d53efeb2e997");
                    return;
                }
                b.this.s();
                b.this.x();
                b.this.a(1.0f);
                b bVar = b.this;
                int i2 = i;
                Object[] objArr4 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "7e31675b9e1f4d4539b7981d55518826", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "7e31675b9e1f4d4539b7981d55518826");
                } else if (i2 == 100) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.t, "alpha", 1.0f, 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.u, "alpha", 0.0f, 1.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar.u, RecceAnimUtils.TRANSLATION_Y, bVar.u.getHeight(), 0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                    animatorSet.setDuration(500L);
                    animatorSet.start();
                } else if (i2 == 200) {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar.u, "alpha", 1.0f, 0.0f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(bVar.t, "alpha", 0.0f, 1.0f);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(bVar.t, RecceAnimUtils.TRANSLATION_Y, bVar.t.getHeight(), 0.0f);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat5, ofFloat4, ofFloat6);
                    animatorSet2.setDuration(500L);
                    animatorSet2.start();
                }
                b.this.p.a(i);
            }
        });
    }

    private void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d118c1bc7bc01da8f53c13e481e10919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d118c1bc7bc01da8f53c13e481e10919");
        } else if (this.A) {
        } else {
            if (this.p.i() != 3) {
                this.V.setVisibility(8);
                return;
            }
            int i = this.K;
            if (i == 100) {
                this.u.setAlpha(0.0f);
                this.t.setAlpha(1.0f);
                this.V.setVisibility(0);
            } else if (i == 200) {
                this.u.setAlpha(1.0f);
                this.t.setAlpha(0.0f);
                this.V.setVisibility(0);
            } else {
                this.V.setVisibility(8);
            }
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f23b402b87cf05a83ea3272fb221c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f23b402b87cf05a83ea3272fb221c6");
        } else if (this.A) {
        } else {
            this.s.setVisibility(8);
            p.b(this.v);
            k();
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c569bc07ba1532cf273178899166a8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c569bc07ba1532cf273178899166a8aa");
        } else {
            this.V.setVisibility(8);
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6111faf14bb47cc071eab1be7d3d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6111faf14bb47cc071eab1be7d3d8b");
        } else if (this.A) {
        } else {
            if (this.h.getVisibility() == 8) {
                this.s.setVisibility(0);
            } else {
                this.s.setVisibility(8);
            }
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0da6cd3853f4f2b792d75d5489e7223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0da6cd3853f4f2b792d75d5489e7223");
        } else if (this.O == null || this.f == null) {
        } else {
            this.f.setFocusable(false);
            this.f.setFocusableInTouchMode(false);
            this.f.setCursorVisible(false);
            this.f.clearFocus();
            if (this.O.isActive()) {
                this.O.hideSoftInputFromWindow(this.f.getWindowToken(), 0);
            }
        }
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6987e6fd0c9cadde2c8a5db4a0cb6f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6987e6fd0c9cadde2c8a5db4a0cb6f4");
            return;
        }
        this.f.setFocusable(true);
        this.f.setFocusableInTouchMode(true);
        this.f.setCursorVisible(true);
        this.f.requestFocus();
        this.O.showSoftInput(this.f, 0);
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb0b6a82474630f2d25c20d0136735d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb0b6a82474630f2d25c20d0136735d");
            return;
        }
        if (this.i != null) {
            this.i.setVisibility(8);
        }
        if (this.N != null) {
            this.N.setVisibility(8);
        }
        if (this.j != null) {
            this.j.setVisibility(8);
        }
        this.f.setAlpha(1.0f);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3843bdda8e2671e9ab86f0dc102eb35a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3843bdda8e2671e9ab86f0dc102eb35a");
            return;
        }
        if (this.N == null) {
            this.N = new TextView(this.c);
            this.N.setTextSize(1, 14.0f);
            this.N.setEllipsize(TextUtils.TruncateAt.END);
            this.N.setLines(1);
            this.N.setTextColor(this.c.getResources().getColor(R.color.wm_nox_search_999999));
            this.d.addView(this.N, new ViewGroup.LayoutParams(-2, -2));
        }
        this.N.setVisibility(0);
        this.N.setText(str);
        String c = c();
        if (c != null) {
            float measureText = this.f.getPaint().measureText(c);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            layoutParams.leftMargin = (int) (g.a(this.c, 6.0f) + measureText);
            layoutParams.gravity = 16;
            this.N.setMaxWidth((int) ((this.d.getWidth() - g.a(this.c, 8.0f)) - measureText));
            this.N.setLayoutParams(layoutParams);
        }
    }

    public final void a(final String str, final String str2, final com.sankuai.waimai.business.search.model.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4b22628252402476571f97a3b23f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4b22628252402476571f97a3b23f22");
            return;
        }
        if (this.N != null && this.N.getVisibility() == 0) {
            this.N.setText("");
            this.N.setVisibility(8);
        }
        this.y = "_search_guided";
        this.z = "_search_guided_del";
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.j == null) {
            this.j = new com.sankuai.waimai.business.search.common.view.b(this.c);
            this.d.addView(this.j, new LinearLayout.LayoutParams(-2, -2));
        }
        final String c = c();
        this.j.b(null);
        this.j.a(c);
        this.j.setCloseVisibility(8);
        this.j.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.gravity = 16;
        this.j.setLayoutParams(layoutParams);
        this.j.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2e473937b7e94089a70b4575f3e3d81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2e473937b7e94089a70b4575f3e3d81");
                    return;
                }
                if (b.this.i == null) {
                    b.this.i = new com.sankuai.waimai.business.search.common.view.b(b.this.c);
                    b.this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.5.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3db92043fc8aeb6c4f99420cfae92dc4", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3db92043fc8aeb6c4f99420cfae92dc4");
                                return;
                            }
                            b.this.o();
                            b.this.b();
                            b.this.i.a("");
                            b.this.j.a("");
                            b.this.k = "";
                            b.this.l = "";
                            b.this.p.a(false, b.this.z, 0);
                            if (b.this.p == null || b.this.p.h() == null || b.this.p.h() == aVar) {
                                return;
                            }
                            b.this.m = true;
                            b.this.n = str2;
                            b bVar = b.this;
                            bVar.o = b.this.c() + StringUtil.SPACE + str2;
                        }
                    });
                    b.this.d.addView(b.this.i, new LinearLayout.LayoutParams(-2, -2));
                }
                b.this.i.b(null);
                b.this.i.a(str);
                b.this.k = str2;
                b.this.l = str;
                SearchShareData searchShareData = b.this.q;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = SearchShareData.a;
                if (PatchProxy.isSupport(objArr3, searchShareData, changeQuickRedirect3, false, "741d52096c86aea00184f5f798aa4965", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, searchShareData, changeQuickRedirect3, false, "741d52096c86aea00184f5f798aa4965");
                } else if (!TextUtils.isEmpty(searchShareData.g)) {
                    searchShareData.f = searchShareData.g;
                }
                b.this.i.setVisibility(0);
                if (c != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b.this.i.getLayoutParams();
                    layoutParams2.leftMargin = (int) (b.this.j.getWidth() + g.a(b.this.c, 3.0f));
                    layoutParams2.gravity = 16;
                    b.this.i.setLayoutParams(layoutParams2);
                }
                b.this.p.a(false, b.this.y, 0);
                b.this.f.setAlpha(0.0f);
            }
        });
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c9c3582d25a86c90cab81c21341763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c9c3582d25a86c90cab81c21341763");
        } else if (this.A) {
        } else {
            if (u() || !this.b.f.i) {
                a(0.0f);
                com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, this.G);
                return;
            }
            a(1.0f);
            com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, true);
        }
    }

    public final void a(CommonPageStyleConfig commonPageStyleConfig, View view) {
        Object[] objArr = {commonPageStyleConfig, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ee6d1c72bab0d931b157394d2ae3dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ee6d1c72bab0d931b157394d2ae3dc");
        } else if (!TextUtils.isEmpty(commonPageStyleConfig.backgroundImage)) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.c;
            a2.c = commonPageStyleConfig.backgroundImage;
            a2.a(new AnonymousClass6(commonPageStyleConfig, view));
        } else {
            this.F = false;
            this.G = true;
            p();
            this.H = null;
            a(1.0f);
            com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, this.G);
            if (view != null) {
                view.getBackground().mutate().setAlpha(255);
            }
            r();
            q();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.actionbar.b$6  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass6 implements b.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ CommonPageStyleConfig b;
        public final /* synthetic */ View c;

        public AnonymousClass6(CommonPageStyleConfig commonPageStyleConfig, View view) {
            this.b = commonPageStyleConfig;
            this.c = view;
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.a
        public final void a(Bitmap bitmap) {
            GradientDrawable.Orientation orientation;
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c23be85c4142b723cbfd7de84e1ab3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c23be85c4142b723cbfd7de84e1ab3");
                return;
            }
            b.this.F = true;
            b.this.C.setVisibility(0);
            b.this.D.setVisibility(0);
            b.this.C.setTranslationY(0.0f);
            Bitmap a2 = this.b.bgBlurRadius > 0 ? i.a(bitmap, this.b.bgBlurRadius, true) : bitmap;
            if (this.b.bgGradientOrientation > 0) {
                b.this.E.setVisibility(0);
                int a3 = ColorUtils.a(this.b.bgGradientStartColor, b.this.b(R.color.wm_nox_search_transparent));
                int a4 = ColorUtils.a(this.b.bgGradientEndColor, b.this.b(R.color.wm_nox_search_transparent));
                b bVar = b.this;
                int i = this.b.bgGradientOrientation;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (!PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ae33a378b9d99a0baf2183dd392191d8", RobustBitConfig.DEFAULT_VALUE)) {
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    switch (i) {
                        case 1:
                            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                            break;
                        case 2:
                            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                            break;
                        case 3:
                            orientation = GradientDrawable.Orientation.TL_BR;
                            break;
                        case 4:
                            orientation = GradientDrawable.Orientation.BL_TR;
                            break;
                    }
                } else {
                    orientation = (GradientDrawable.Orientation) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ae33a378b9d99a0baf2183dd392191d8");
                }
                b.this.E.setBackground(new GradientDrawable(orientation, new int[]{a3, a4}));
            }
            b.this.D.setImageBitmap(a2);
            b.this.G = this.b.inputBoxTheme == 0;
            b.this.H = this.b;
            b.this.q();
            if (this.c != null) {
                this.c.getBackground().mutate().setAlpha(0);
                this.c.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.6.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5cb07f922cb65c06f418689513aad9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5cb07f922cb65c06f418689513aad9e");
                            return;
                        }
                        int[] iArr = new int[2];
                        AnonymousClass6.this.c.getLocationOnScreen(iArr);
                        final int height = iArr[1] + AnonymousClass6.this.c.getHeight();
                        b.this.C.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.6.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "54143c3e40c4730fe0bafe74a811fb3f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "54143c3e40c4730fe0bafe74a811fb3f");
                                } else {
                                    b.this.C.setTranslationY((height - b.this.D.getHeight()) + g.a(b.this.b, 20.0f));
                                }
                            }
                        });
                    }
                });
                if (b.this.p.k() && b.this.b.b == 3) {
                    b.this.y();
                    b.this.a(0.0f);
                    com.sankuai.waimai.platform.capacity.immersed.a.b(b.this.b, b.this.G);
                    b.this.t();
                    return;
                }
                b.this.x();
                b.this.a(1.0f);
                com.sankuai.waimai.platform.capacity.immersed.a.b(b.this.b, true);
                b.this.s();
            } else if (b.this.b.b == 3) {
                b.this.y();
                b.this.a(0.0f);
                com.sankuai.waimai.platform.capacity.immersed.a.b(b.this.b, b.this.G);
                b.this.t();
            } else {
                b.this.x();
                b.this.a(1.0f);
                com.sankuai.waimai.platform.capacity.immersed.a.b(b.this.b, true);
                b.this.s();
            }
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496cb5e66eaba404a56a6d10e1cfb2e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496cb5e66eaba404a56a6d10e1cfb2e6");
                return;
            }
            b.this.p();
            b.this.F = false;
            b.this.G = true;
            b.this.H = null;
            if (this.c != null) {
                this.c.getBackground().mutate().setAlpha(255);
            }
            b.this.a(1.0f);
            com.sankuai.waimai.platform.capacity.immersed.a.b(b.this.b, b.this.G);
            b.this.r();
            b.this.q();
        }
    }

    void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a20c43e8dc79da0875636edec69984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a20c43e8dc79da0875636edec69984");
            return;
        }
        this.D.setImageDrawable(null);
        this.D.setVisibility(8);
        this.C.setVisibility(8);
        this.E.setVisibility(8);
    }

    void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2719ac05e5e33885c0ba8c6b5f11332c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2719ac05e5e33885c0ba8c6b5f11332c");
        } else if (this.b.isDestroyed()) {
        } else {
            CoordinatorLayout coordinatorLayout = this.b.f.l;
            if (!this.F) {
                coordinatorLayout.setBackgroundResource(R.drawable.wm_nox_search_shape_bg_poi_list);
            } else if (!this.b.f.i) {
                coordinatorLayout.setBackground(null);
            } else {
                coordinatorLayout.setBackgroundResource(R.drawable.wm_nox_search_shape_bg_poi_list);
            }
        }
    }

    void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2cc1b3650b9311fd817a62744d27035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2cc1b3650b9311fd817a62744d27035");
        } else if (this.A) {
        } else {
            if (u() || !this.b.f.i) {
                t();
            } else {
                s();
            }
        }
    }

    int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28d80dfb4509fd87afab806096fb6b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28d80dfb4509fd87afab806096fb6b4")).intValue() : this.c.getResources().getColor(i);
    }

    void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b44b1ee09ccbb3495ae488b520d5ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b44b1ee09ccbb3495ae488b520d5ed8");
        } else if (this.A) {
        } else {
            C();
            c(-1);
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0385a5878a09d14499f9c383689ce2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0385a5878a09d14499f9c383689ce2e");
            return;
        }
        Drawable background = this.S.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        }
    }

    private void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0509ea080e3a7a4c5bd744d3b22f9c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0509ea080e3a7a4c5bd744d3b22f9c5");
            return;
        }
        this.Q.setTextColor(b(R.color.wm_nox_search_222426));
        this.f.setTextColor(b(R.color.wm_nox_search_222426));
        this.g.setTextColor(b(R.color.wm_nox_search_222426));
        if (this.N != null) {
            this.N.setTextColor(b(R.color.wm_nox_search_999999));
        }
        this.W.setTextColor(b(R.color.wm_nox_search_222426));
        this.t.setTextColor(b(R.color.wm_nox_search_222426));
        this.u.setTextColor(b(R.color.wm_nox_search_222426));
        this.T.setTextColor(b(R.color.wm_nox_search_222426));
        this.U.setTextColor(b(R.color.wm_nox_search_222426));
        this.X.setBackgroundColor(b(R.color.wm_nox_search_222426));
    }

    void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f143cac95ad866f889452f32a3669107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f143cac95ad866f889452f32a3669107");
        } else if (this.A) {
        } else {
            if (this.H == null) {
                s();
                return;
            }
            D();
            c(this.H.searchBoxBlur == 1 ? 872415231 : -1);
        }
    }

    private void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f6e78e8677a7fc24fffc4c27ed9907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f6e78e8677a7fc24fffc4c27ed9907");
        } else if (this.H == null) {
            C();
        } else {
            this.Q.setTextColor(ColorUtils.a(this.H.returnButtonColor, b(R.color.wm_nox_search_222426)));
            this.g.setTextColor(ColorUtils.a(this.H.returnButtonColor, b(R.color.wm_nox_search_222426)));
            this.f.setTextColor(ColorUtils.a(this.H.searchTermColor, b(R.color.wm_nox_search_222426)));
            if (this.N != null) {
                this.N.setTextColor(ColorUtils.a(ColorUtils.a(this.H.searchTermColor, b(R.color.wm_nox_search_999999)), 0.8f));
            }
            this.W.setTextColor(ColorUtils.a(this.H.poiSpuSwitchColor, b(R.color.wm_nox_search_222426)));
            this.t.setTextColor(ColorUtils.a(this.H.poiSpuSwitchColor, b(R.color.wm_nox_search_222426)));
            this.u.setTextColor(ColorUtils.a(this.H.poiSpuSwitchColor, b(R.color.wm_nox_search_222426)));
            this.T.setTextColor(ColorUtils.a(this.H.addressSwitchColor, b(R.color.wm_nox_search_222426)));
            this.U.setTextColor(ColorUtils.a(this.H.addressSwitchColor, b(R.color.wm_nox_search_222426)));
            this.X.setBackgroundColor(ColorUtils.a(this.H.dividerColor, b(R.color.wm_nox_search_222426)));
        }
    }

    void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2815cacddf3e98bcfd0b0b434bc7f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2815cacddf3e98bcfd0b0b434bc7f2");
        } else if (this.A) {
        } else {
            this.R.setAlpha(f);
            if (this.e.getBackground() != null) {
                this.e.getBackground().mutate().setAlpha((int) (f * 255.0f));
            }
        }
    }

    public final boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a8a778b44e2edb989788d9757af1a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a8a778b44e2edb989788d9757af1a5")).booleanValue();
        }
        if (this.F) {
            return this.p.k() || (!this.b.f.i && this.b.f.k());
        }
        return false;
    }

    public final boolean v() {
        return this.H != null && this.H.searchBoxBlur == 1;
    }

    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83749bf5e81433e0111778d206910350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83749bf5e81433e0111778d206910350");
            return;
        }
        this.F = false;
        this.G = true;
        p();
        this.H = null;
        s();
        a(1.0f);
        com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, this.G);
    }

    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896b6be6adc8a8c821f4a49b7ea01461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896b6be6adc8a8c821f4a49b7ea01461");
        } else if (this.F) {
            this.C.setVisibility(8);
            com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, true);
        }
    }

    public final void y() {
        final ViewGroup viewGroup;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8c5ee1946c0f653cbd5fde58ee2fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8c5ee1946c0f653cbd5fde58ee2fcb");
        } else if (u() || !this.b.f.i) {
            this.C.setVisibility(0);
            com.sankuai.waimai.platform.capacity.immersed.a.b(this.b, this.G);
            if (!this.b.f.i || (viewGroup = this.b.f.k) == null) {
                return;
            }
            viewGroup.getBackground().mutate().setAlpha(0);
            viewGroup.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2981dd14a12ac1c78a4d446d522e672", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2981dd14a12ac1c78a4d446d522e672");
                        return;
                    }
                    int[] iArr = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    final int height = iArr[1] + viewGroup.getHeight();
                    b.this.C.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.7.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b53cf2db8a9a52a04e35f813f8da605a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b53cf2db8a9a52a04e35f813f8da605a");
                            } else {
                                b.this.C.setTranslationY((height - b.this.D.getHeight()) + g.a(b.this.b, 20.0f));
                            }
                        }
                    });
                }
            });
        }
    }
}
