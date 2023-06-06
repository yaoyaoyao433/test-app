package com.sankuai.waimai.business.search.ui.result.guideQuery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.view.HorizontalSrollViewEx;
import com.sankuai.waimai.business.search.datatype.GuideQueryData;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import com.sankuai.waimai.business.search.ui.result.guideQuery.b;
import com.sankuai.waimai.business.search.ui.result.itemViewDelegate.g;
import com.sankuai.waimai.foundation.utils.ah;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements b.a {
    public static ChangeQuickRedirect a;
    private View.OnClickListener A;
    com.sankuai.waimai.business.search.ui.result.b b;
    int c;
    int d;
    int e;
    int f;
    int g;
    public com.sankuai.waimai.business.search.common.view.a h;
    int i;
    Context j;
    b k;
    ResultFragment l;
    ArrayMap<TextView, ArrayMap<String, String>> m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int s;
    private SearchShareData t;
    private List<GuideQueryData.GuidedQueryWordNew> u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private boolean y;
    private ViewGroup z;

    public static /* synthetic */ void a(c cVar, View view, GuideQueryData.WmFilterGroup wmFilterGroup) {
        Object[] objArr = {view, wmFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "daddcc89f1106fdae2d0a1211062e899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "daddcc89f1106fdae2d0a1211062e899");
            return;
        }
        ArrayMap<String, String> arrayMap = cVar.m.get(view);
        Object[] objArr2 = {view, wmFilterGroup, arrayMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f36a04e836278394f181782310857cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f36a04e836278394f181782310857cb3");
        } else {
            final b bVar = cVar.k;
            Object[] objArr3 = {view, wmFilterGroup, arrayMap};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "89f43328089a376e7aa460af26db0802", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "89f43328089a376e7aa460af26db0802");
            } else {
                bVar.l = view;
                if (bVar.c == null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "d07dbd0be65df4bf647303b1f8f0470f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "d07dbd0be65df4bf647303b1f8f0470f");
                    } else {
                        View inflate = ((ViewStub) bVar.d.findViewById(R.id.view_stub_guide_query)).inflate();
                        bVar.c = (ViewGroup) inflate.findViewById(R.id.guide_query_container);
                        bVar.e = (TextView) inflate.findViewById(R.id.guide_query_title);
                        bVar.f = (RecyclerView) inflate.findViewById(R.id.item_container);
                        inflate.findViewById(R.id.recommend_background).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.b.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr5 = {view2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "08956e7fa43191e08cab44d0d8f05e54", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "08956e7fa43191e08cab44d0d8f05e54");
                                } else {
                                    bVar.a();
                                }
                            }
                        });
                        bVar.h = (TextView) inflate.findViewById(R.id.guide_query_reset);
                        bVar.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.b.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr5 = {view2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3076e3122ee82099abaebd70b56c88a1", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3076e3122ee82099abaebd70b56c88a1");
                                    return;
                                }
                                bVar.k.clear();
                                bVar.g.notifyDataSetChanged();
                                b.a(bVar, bVar.k, true);
                            }
                        });
                        bVar.i = (TextView) inflate.findViewById(R.id.guide_query_complete);
                        bVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.b.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr5 = {view2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4d4ac53a0e00c2e17dced21e27ce3ef1", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4d4ac53a0e00c2e17dced21e27ce3ef1");
                                    return;
                                }
                                b.a(bVar, bVar.k, false);
                                bVar.a();
                            }
                        });
                        bVar.f.setLayoutManager(new GridLayoutManager(bVar.b, 4));
                        bVar.g = new a(bVar.b, null, bVar.k);
                        bVar.f.setAdapter(bVar.g);
                    }
                }
                bVar.k.clear();
                if (arrayMap != null) {
                    bVar.k.putAll((Map<? extends String, ? extends String>) arrayMap);
                }
                bVar.j = true;
                bVar.c();
                bVar.g.notifyDataSetChanged();
                if (!TextUtils.isEmpty(wmFilterGroup.title)) {
                    bVar.e.setText(wmFilterGroup.title);
                }
                bVar.c.setVisibility(0);
                a aVar = bVar.g;
                Object[] objArr5 = {wmFilterGroup};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "5b32baacd777deeb4a1ccda6fecf202d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "5b32baacd777deeb4a1ccda6fecf202d");
                } else if (wmFilterGroup == null) {
                    aVar.b = new ArrayList<>();
                    aVar.c = false;
                } else {
                    aVar.b.clear();
                    aVar.c = wmFilterGroup.multi == 1;
                    if (wmFilterGroup != null && wmFilterGroup.items != null) {
                        aVar.b.addAll(wmFilterGroup.items);
                    }
                }
                bVar.g.notifyDataSetChanged();
            }
        }
        cVar.a(wmFilterGroup);
    }

    public static /* synthetic */ void a(c cVar, g.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a0dbc6d695394ba98ac5d4d8f8c24ea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a0dbc6d695394ba98ac5d4d8f8c24ea3");
            return;
        }
        HorizontalSrollViewEx horizontalSrollViewEx = aVar.d;
        if (horizontalSrollViewEx == null || horizontalSrollViewEx.getChildAt(0) == null || aVar.b == null || !horizontalSrollViewEx.getChildAt(0).equals(aVar.b) || aVar.b.getChildCount() <= 0 || cVar.b == null) {
            return;
        }
        for (int i = 0; i < aVar.b.getChildCount(); i++) {
            View childAt = aVar.b.getChildAt(i);
            if (childAt != null && (((childAt instanceof TextView) || (childAt instanceof LinearLayout)) && cVar.c >= 0 && ah.b(childAt))) {
                cVar.c(childAt);
            }
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "5ed7475c234d0ca74641ac11e571b00f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "5ed7475c234d0ca74641ac11e571b00f")).booleanValue() : cVar.k.j;
    }

    public c(Context context, com.sankuai.waimai.business.search.ui.result.b bVar, com.sankuai.waimai.business.search.common.view.a aVar, SearchShareData searchShareData, ResultFragment resultFragment) {
        Object[] objArr = {context, bVar, aVar, searchShareData, resultFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4f5743b87a411f1828b084339c8b33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4f5743b87a411f1828b084339c8b33");
            return;
        }
        this.c = -1;
        this.m = new ArrayMap<>();
        this.u = new ArrayList();
        this.A = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.c.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
                if (r19.b.k.l != r20) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x019f, code lost:
                if (r19.b.k.l != r20) goto L57;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r20) {
                /*
                    Method dump skipped, instructions count: 459
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.ui.result.guideQuery.c.AnonymousClass1.onClick(android.view.View):void");
            }
        };
        this.b = bVar;
        this.j = context;
        this.l = resultFragment;
        this.h = aVar;
        this.t = searchShareData;
        this.k = this.l.g();
        this.k.m = this;
        this.d = com.sankuai.waimai.foundation.utils.g.a(this.j, 12.0f);
        this.e = com.sankuai.waimai.foundation.utils.g.a(this.j, 15.0f);
        this.n = com.sankuai.waimai.foundation.utils.g.a(this.j, 8.0f);
        this.p = com.sankuai.waimai.foundation.utils.g.a(this.j, 2.0f);
        this.f = com.sankuai.waimai.foundation.utils.g.a(this.j, 5.0f);
        this.o = com.sankuai.waimai.foundation.utils.g.a(this.j, 6.0f);
        this.g = com.sankuai.waimai.foundation.utils.g.a(this.j, 17.0f);
        this.s = com.sankuai.waimai.foundation.utils.g.a(this.j, 7.0f);
        this.r = com.sankuai.waimai.foundation.utils.g.a(this.j, 16.0f);
        this.q = com.sankuai.waimai.foundation.utils.g.a(this.j, 30.0f);
        this.w = this.j.getResources().getDrawable(R.drawable.wm_nox_search_guide_filter_arrow_down_select);
        this.x = this.j.getResources().getDrawable(R.drawable.wm_nox_search_guide_filter_arrow_up);
        this.v = this.j.getResources().getDrawable(R.drawable.wm_nox_search_guide_filter_arrow_down);
    }

    void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383befaddb0c20b897e9d25e7fce99a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383befaddb0c20b897e9d25e7fce99a8");
        } else if (view.getTag() instanceof Object[]) {
            Object[] objArr2 = (Object[]) view.getTag();
            if (objArr2[0] instanceof GuideQueryData.GuidedQueryWordNew) {
                GuideQueryData.GuidedQueryWordNew guidedQueryWordNew = (GuideQueryData.GuidedQueryWordNew) objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                String a2 = this.b.a();
                int i = this.t.b() ? this.t.P : this.t.k == 2 ? 1 : 0;
                HashMap hashMap = new HashMap();
                hashMap.put("index", Integer.valueOf(intValue));
                hashMap.put("search_log_id", this.b.b());
                hashMap.put("template_type", Integer.valueOf(i));
                hashMap.put("stid", this.t.d);
                if (a2 == null) {
                    a2 = StringUtil.SPACE;
                }
                hashMap.put("tag", a2);
                hashMap.put("spread", Integer.valueOf(this.h.getChildCount() == 0 ? 1 : 0));
                hashMap.put("slide_state", Integer.valueOf(this.i <= 0 ? 0 : 1));
                hashMap.put("filter_type", "0");
                hashMap.put("rank_type", Integer.valueOf(this.t.R));
                if (guidedQueryWordNew.isAmbiguousWord() || guidedQueryWordNew.isSecondGuide()) {
                    hashMap.put("keyword", guidedQueryWordNew.secondGuidedQuery.searchQuery);
                    hashMap.put("word_type", guidedQueryWordNew.isAmbiguousWord() ? "2" : "1");
                    hashMap.put("filter_mapping", guidedQueryWordNew.isAmbiguousWord() ? guidedQueryWordNew.secondGuidedQuery.filterMapping : this.t.T);
                } else {
                    hashMap.put("keyword", this.t.g);
                    if (guidedQueryWordNew.isFilterItem()) {
                        hashMap.put("filter_type", guidedQueryWordNew.wmFilterItem.code);
                        hashMap.put("word_type", "3");
                    }
                    if (guidedQueryWordNew.isFilterGroup()) {
                        String a3 = a(view, "");
                        if (TextUtils.isEmpty(a3)) {
                            a3 = "0";
                        }
                        hashMap.put("filter_type", a3);
                        hashMap.put("word_type", "4");
                        hashMap.put("filter_group", guidedQueryWordNew.wmFilterGroup.groupId);
                    }
                }
                h.a(this.j, 1, "c_nfqbfvw", "b_s8k3kd5g", AppUtil.generatePageInfoKey(this.j), hashMap);
            }
        }
    }

    void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1530d4f3703835e2c1cf0ea2e1fc49f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1530d4f3703835e2c1cf0ea2e1fc49f8");
            return;
        }
        textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_575859));
        textView.setTypeface(Typeface.DEFAULT);
        a((View) textView, false, false);
    }

    void b(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0d1a2a74d97218970399d618e070d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0d1a2a74d97218970399d618e070d5");
            return;
        }
        textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_ffa400));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        a((View) textView, true, true);
    }

    void c(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7169cea1ad3397fa556f6a5534296612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7169cea1ad3397fa556f6a5534296612");
            return;
        }
        textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_ffa400));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        a((View) textView, false, true);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4382071b172684e4588c8c2f15d69bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4382071b172684e4588c8c2f15d69bcc");
        } else {
            this.k.a();
        }
    }

    private View a(GuideQueryData.GuidedQueryWordNew guidedQueryWordNew, String str, int i) {
        boolean z;
        String str2;
        Object[] objArr = {guidedQueryWordNew, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef2ba79d57194509a3a9d30e8945d23", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef2ba79d57194509a3a9d30e8945d23");
        }
        Object[] objArr2 = {guidedQueryWordNew, str, Integer.valueOf(i), Integer.valueOf(this.g), Integer.valueOf(this.s)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1899425a403af31a81ee4071064da4f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1899425a403af31a81ee4071064da4f9");
        }
        Object[] objArr3 = {guidedQueryWordNew};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf9d86f32bdc4b3404512fa67e470333", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf9d86f32bdc4b3404512fa67e470333")).booleanValue();
        } else {
            z = (!guidedQueryWordNew.isFilterItem() || guidedQueryWordNew.wmFilterItem == null || TextUtils.isEmpty(guidedQueryWordNew.wmFilterItem.hitOnlyPicture) || TextUtils.isEmpty(guidedQueryWordNew.wmFilterItem.onlyPicture)) ? false : true;
        }
        if (z) {
            Object[] objArr4 = {guidedQueryWordNew, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "70fb806c4b7d87f85e559e30eb9f5ba6", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "70fb806c4b7d87f85e559e30eb9f5ba6");
            }
            LinearLayout linearLayout = new LinearLayout(this.j);
            linearLayout.setPadding(this.d, this.s, this.d, this.s);
            linearLayout.setBackgroundResource(R.drawable.wm_nox_search_shape_bg_guide_word_white);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            ImageView imageView = new ImageView(this.j);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, this.r));
            linearLayout.addView(imageView);
            if (guidedQueryWordNew.wmFilterItem.isHit) {
                a(imageView, guidedQueryWordNew.wmFilterItem.hitOnlyPicture);
            } else {
                a(imageView, guidedQueryWordNew.wmFilterItem.onlyPicture);
            }
            linearLayout.setOnClickListener(this.A);
            linearLayout.setTag(new Object[]{guidedQueryWordNew, Integer.valueOf(i)});
            return linearLayout;
        }
        final TextView textView = new TextView(this.j);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, this.q));
        if (guidedQueryWordNew.isAmbiguousWord() || guidedQueryWordNew.isSecondGuide()) {
            str2 = guidedQueryWordNew.secondGuidedQuery.showQuery;
        } else if (guidedQueryWordNew.isFilterGroup()) {
            str2 = a(guidedQueryWordNew.wmFilterGroup.title, 5);
        } else {
            str2 = guidedQueryWordNew.isFilterItem() ? guidedQueryWordNew.wmFilterItem.name : "";
        }
        textView.setText(str2);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (guidedQueryWordNew.isAmbiguousWord()) {
            textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_222426));
        } else {
            textView.setTextColor(this.j.getResources().getColorStateList(R.color.wm_nox_search_query_guide_word_color_selector));
        }
        textView.setBackgroundResource(R.drawable.wm_nox_search_shape_bg_guide_word_white);
        if (guidedQueryWordNew.isFilterGroup()) {
            this.m.put(textView, new ArrayMap<>());
            String a2 = a(textView, guidedQueryWordNew.wmFilterGroup.items);
            if (!TextUtils.isEmpty(a2) && guidedQueryWordNew.wmFilterGroup.isHit) {
                textView.setText(a2);
                c(textView);
            } else if (this.b.d()) {
                if (this.k.b().equals(guidedQueryWordNew.wmFilterGroup.title)) {
                    b(textView);
                } else {
                    a(textView);
                }
            } else {
                a(textView);
            }
        }
        if (guidedQueryWordNew.isFilterItem() && guidedQueryWordNew.wmFilterItem.isHit) {
            textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_ffa400));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (guidedQueryWordNew.isAmbiguousWord()) {
            if (!TextUtils.isEmpty(this.b.c()) && this.b.c().equals(guidedQueryWordNew.secondGuidedQuery.searchQuery)) {
                textView.setSelected(true);
                textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_ffa400));
            } else {
                textView.setSelected(false);
                textView.setTextColor(this.j.getResources().getColor(R.color.wm_nox_search_222426));
            }
        }
        textView.setPadding(this.g, textView.getPaddingTop(), this.g, textView.getPaddingBottom());
        textView.setTextSize(12.0f);
        textView.setOnClickListener(this.A);
        textView.setGravity(17);
        textView.setTag(new Object[]{guidedQueryWordNew, Integer.valueOf(i)});
        if (!guidedQueryWordNew.isAmbiguousWord() || TextUtils.isEmpty(str)) {
            return textView;
        }
        textView.setPadding(this.g + this.d + this.f, textView.getPaddingTop(), this.g, textView.getPaddingBottom());
        b.a aVar = new b.a() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr5 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a0b2616261d11f4461c2fca796250c8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a0b2616261d11f4461c2fca796250c8f");
                } else if (bitmap != null) {
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842910}, new BitmapDrawable(bitmap));
                    stateListDrawable.setBounds(0, 0, c.this.d, c.this.e);
                    textView.setCompoundDrawablePadding(c.this.f);
                    textView.setPadding(c.this.g, textView.getPaddingTop(), c.this.g, textView.getPaddingBottom());
                    textView.setCompoundDrawables(stateListDrawable, null, null, null);
                }
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dcfe56794ac27765580baac3e162dee3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dcfe56794ac27765580baac3e162dee3");
                } else {
                    textView.setPadding(c.this.g, textView.getPaddingTop(), c.this.g, textView.getPaddingBottom());
                }
            }
        };
        b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a3.b = this.j;
        a3.c = str;
        a3.a(aVar);
        return textView;
    }

    private void a(@NonNull final ImageView imageView, @NonNull String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0d1ae05d9fbdce390de45181fdda9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0d1ae05d9fbdce390de45181fdda9c");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.j;
        a2.c = str;
        a2.a(this.r).a(new b.a() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d1ae4dad2ca378693b171c8746c3992", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d1ae4dad2ca378693b171c8746c3992");
                    return;
                }
                imageView.setVisibility(0);
                imageView.setImageBitmap(bitmap);
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "062a19c0b1309b7a5edfe632dd066ad1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "062a19c0b1309b7a5edfe632dd066ad1");
                } else {
                    imageView.setVisibility(8);
                }
            }
        });
    }

    private void a(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d830e4a8a2a2fe7217e203073c055395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d830e4a8a2a2fe7217e203073c055395");
        } else if (z && z2 && this.x != null) {
            this.x.setBounds(0, 0, this.n, this.o);
            TextView textView = (TextView) view;
            textView.setCompoundDrawablePadding(this.p);
            textView.setCompoundDrawables(null, null, this.x, null);
        } else if (!z && z2 && this.w != null) {
            this.w.setBounds(0, 0, this.n, this.o);
            TextView textView2 = (TextView) view;
            textView2.setCompoundDrawablePadding(this.p);
            textView2.setCompoundDrawables(null, null, this.w, null);
        } else if (this.v != null) {
            this.v.setBounds(0, 0, this.n, this.o);
            TextView textView3 = (TextView) view;
            textView3.setCompoundDrawablePadding(this.p);
            textView3.setCompoundDrawables(null, null, this.v, null);
        }
    }

    public final void a(GuideQueryData guideQueryData, final g.a aVar, int i) {
        int i2;
        Object[] objArr = {guideQueryData, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53efd4a0fb6dbcae3e3d790597121cf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53efd4a0fb6dbcae3e3d790597121cf4");
            return;
        }
        this.c = i;
        aVar.c.removeAllViews();
        aVar.b.removeAllViews();
        this.m.clear();
        this.u.clear();
        this.u.addAll(guideQueryData.guidedQueryWordsNew);
        aVar.b.addView(new View(this.j), this.d, 1);
        final TextView textView = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            if (this.u.get(i5) != null && ((!this.u.get(i5).isAmbiguousWord() || this.u.get(i5).secondGuidedQuery != null) && ((!this.u.get(i5).isSecondGuide() || this.u.get(i5).secondGuidedQuery != null) && ((!this.u.get(i5).isFilterGroup() || this.u.get(i5).wmFilterGroup != null) && (!this.u.get(i5).isFilterItem() || this.u.get(i5).wmFilterItem != null))))) {
                switch (this.u.get(i5).type) {
                    case 0:
                        if (this.u.get(i5).isSecondGuide()) {
                            if (i4 == 0 && i3 != 0) {
                                View view = new View(this.j);
                                view.setBackgroundColor(this.j.getResources().getColor(R.color.wm_nox_search_divider_vertical));
                                aVar.b.addView(view, 1, this.r);
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                                layoutParams.rightMargin = this.n;
                                layoutParams.topMargin = (this.q - this.r) / 2;
                                layoutParams.bottomMargin = (this.q - this.r) / 2;
                                layoutParams.gravity = 16;
                            }
                            i4++;
                        }
                        View a2 = a(this.u.get(i5), this.u.get(i5).secondGuidedQuery.picture, i3);
                        ((LinearLayout.LayoutParams) a2.getLayoutParams()).rightMargin = this.n;
                        aVar.b.addView(a2);
                        i3++;
                        break;
                    case 1:
                        LinearLayout linearLayout = aVar.b;
                        i2 = i3 + 1;
                        View a3 = a(this.u.get(i5), (String) null, i3);
                        ((LinearLayout.LayoutParams) a3.getLayoutParams()).rightMargin = this.n;
                        linearLayout.addView(a3);
                        if (this.k.j && this.k.b() != null && this.k.b().equals(this.u.get(i5).wmFilterGroup.title)) {
                            textView = (TextView) a3;
                        }
                        i3 = i2;
                        break;
                    case 2:
                        LinearLayout linearLayout2 = aVar.b;
                        i2 = i3 + 1;
                        View a4 = a(this.u.get(i5), (String) null, i3);
                        ((LinearLayout.LayoutParams) a4.getLayoutParams()).rightMargin = this.n;
                        linearLayout2.addView(a4);
                        i3 = i2;
                        break;
                    case 3:
                        LinearLayout linearLayout3 = aVar.b;
                        int i6 = i3 + 1;
                        View a5 = a(this.u.get(i5), this.u.get(i5).wmFilterItem.picture, i3);
                        ((LinearLayout.LayoutParams) a5.getLayoutParams()).rightMargin = this.n;
                        linearLayout3.addView(a5);
                        i3 = i6;
                        break;
                }
            }
        }
        aVar.b.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.c.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9c4e29ac87e06bc37b681288a0348f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9c4e29ac87e06bc37b681288a0348f2");
                    return;
                }
                c.a(c.this, aVar);
                c cVar = c.this;
                LinearLayout linearLayout4 = aVar.c;
                Object[] objArr3 = {linearLayout4};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "e672af8226214edc8d3bf8b84e97aa1a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "e672af8226214edc8d3bf8b84e97aa1a");
                } else if (linearLayout4 != null) {
                    for (int i7 = 0; i7 < linearLayout4.getChildCount(); i7++) {
                        View childAt = linearLayout4.getChildAt(i7);
                        if (childAt != null && (childAt instanceof TextView) && ah.b(childAt)) {
                            cVar.c(childAt);
                        }
                    }
                }
                if (c.this.l != null && textView != null) {
                    ResultFragment resultFragment = c.this.l;
                    View view2 = textView;
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = ResultFragment.d;
                    if (PatchProxy.isSupport(objArr4, resultFragment, changeQuickRedirect4, false, "46020b21f1b389422c4872f2b99333ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, resultFragment, changeQuickRedirect4, false, "46020b21f1b389422c4872f2b99333ee");
                    } else if (resultFragment.g().j) {
                        b g = resultFragment.g();
                        Object[] objArr5 = {view2};
                        ChangeQuickRedirect changeQuickRedirect5 = b.a;
                        if (PatchProxy.isSupport(objArr5, g, changeQuickRedirect5, false, "2bd0a03fe26781af036a091d48e49b51", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, g, changeQuickRedirect5, false, "2bd0a03fe26781af036a091d48e49b51");
                            return;
                        }
                        g.l = view2;
                        g.c();
                    }
                } else if (c.this.k.j) {
                    c.this.a();
                }
            }
        });
        aVar.d.setScrollViewListener(new HorizontalSrollViewEx.a() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.common.view.HorizontalSrollViewEx.a
            public final void a(HorizontalScrollView horizontalScrollView, int i7, int i8, int i9, int i10) {
                Object[] objArr2 = {horizontalScrollView, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f75481ca6b0f45ef544e729a19e38573", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f75481ca6b0f45ef544e729a19e38573");
                    return;
                }
                c.this.i = horizontalScrollView.getScrollX();
                c.a(c.this, aVar);
                c.this.a();
            }
        });
        this.i = aVar.d.getScrollX();
        this.z = aVar.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95d4633e60020e3e5111871401f56d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95d4633e60020e3e5111871401f56d12");
            return;
        }
        this.y = SearchShareData.a(this.j).al;
        this.z.setVisibility(this.y ? 0 : 8);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.c.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51398d771f6bb90ea08a4bebb06b0ae8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51398d771f6bb90ea08a4bebb06b0ae8");
                } else if (c.this.b != null) {
                    c.this.b.g();
                }
            }
        });
        TextView textView2 = (TextView) this.z.findViewById(R.id.filter_count);
        com.sankuai.waimai.platform.widget.filterbar.view.model.a aVar2 = SearchShareData.a(this.j).ak;
        if (aVar2 != null && aVar2.c > 0) {
            textView2.setVisibility(0);
            textView2.setText(String.valueOf(aVar2.c));
            return;
        }
        textView2.setVisibility(8);
    }

    private void a(GuideQueryData.WmFilterGroup wmFilterGroup) {
        Object[] objArr = {wmFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0c199e596aca0855ab9d654705c233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0c199e596aca0855ab9d654705c233");
        } else if (wmFilterGroup != null && wmFilterGroup.items != null) {
            String str = "";
            for (GuideQueryData.WmFilterItem wmFilterItem : wmFilterGroup.items) {
                if (!TextUtils.isEmpty(wmFilterItem.code)) {
                    str = (str + wmFilterItem.code) + CommonConstant.Symbol.COMMA;
                }
            }
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
            }
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ad5224d847412297681f98544b5709c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ad5224d847412297681f98544b5709c");
                return;
            }
            String a2 = this.b.a();
            int i = this.t.b() ? this.t.P : this.t.k == 2 ? 1 : 0;
            HashMap hashMap = new HashMap();
            hashMap.put("search_log_id", this.b.b());
            hashMap.put("template_type", Integer.valueOf(i));
            hashMap.put("stid", this.t.d);
            if (a2 == null) {
                a2 = StringUtil.SPACE;
            }
            hashMap.put("tag", a2);
            hashMap.put("slide_state", Integer.valueOf(this.i <= 0 ? 0 : 1));
            hashMap.put("word_type", "4");
            hashMap.put("keyword", this.t.g);
            hashMap.put("rank_type", Integer.valueOf(this.t.R));
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            hashMap.put("filter_type", str);
            h.a(this.j, 2, "c_nfqbfvw", "b_v26s7lmu", AppUtil.generatePageInfoKey(this.j), hashMap);
        }
    }

    void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04666d27e7faaaeedfb3bb3de49d7d56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04666d27e7faaaeedfb3bb3de49d7d56");
        } else if (view.getTag() instanceof Object[]) {
            Object[] objArr2 = (Object[]) view.getTag();
            if (objArr2[0] instanceof GuideQueryData.GuidedQueryWordNew) {
                GuideQueryData.GuidedQueryWordNew guidedQueryWordNew = (GuideQueryData.GuidedQueryWordNew) objArr2[0];
                if (guidedQueryWordNew.isExposed) {
                    return;
                }
                guidedQueryWordNew.isExposed = true;
                HashMap hashMap = new HashMap();
                int intValue = ((Integer) objArr2[1]).intValue();
                String a2 = this.b.a();
                int i = this.t.b() ? this.t.P : this.t.k == 2 ? 1 : 0;
                hashMap.put("index", Integer.valueOf(intValue));
                hashMap.put("search_log_id", this.b.b());
                hashMap.put("template_type", Integer.valueOf(i));
                hashMap.put("stid", this.t.d);
                if (a2 == null) {
                    a2 = StringUtil.SPACE;
                }
                hashMap.put("tag", a2);
                hashMap.put("slide_state", Integer.valueOf(this.i <= 0 ? 0 : 1));
                hashMap.put("rank_type", Integer.valueOf(this.t.R));
                if (guidedQueryWordNew.isAmbiguousWord() || guidedQueryWordNew.isSecondGuide()) {
                    hashMap.put("keyword", guidedQueryWordNew.secondGuidedQuery.searchQuery);
                    hashMap.put("word_type", guidedQueryWordNew.isAmbiguousWord() ? "2" : "1");
                    hashMap.put("filter_mapping", guidedQueryWordNew.isAmbiguousWord() ? guidedQueryWordNew.secondGuidedQuery.filterMapping : this.t.T);
                } else {
                    hashMap.put("keyword", this.t.g);
                    hashMap.put("rank_type", Integer.valueOf(this.t.R));
                    if (guidedQueryWordNew.isFilterGroup()) {
                        hashMap.put("word_type", "4");
                        hashMap.put("filter_type", "0");
                        hashMap.put("filter_group", guidedQueryWordNew.wmFilterGroup.groupId);
                    } else {
                        hashMap.put("word_type", "3");
                        hashMap.put("filter_type", guidedQueryWordNew.wmFilterItem.code);
                    }
                }
                h.a(this.j, 2, "c_nfqbfvw", "b_v26s7lmu", AppUtil.generatePageInfoKey(this.j), hashMap);
            }
        }
    }

    private String a(View view, List<GuideQueryData.WmFilterItem> list) {
        Object[] objArr = {view, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ede754d4e3e1e175135e1162d01031a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ede754d4e3e1e175135e1162d01031a");
        }
        String str = "";
        if (list == null) {
            return "";
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && !TextUtils.isEmpty(list.get(i).name) && list.get(i).isHit) {
                this.m.get(view).put(list.get(i).code, list.get(i).name);
                str = str + list.get(i).name;
            }
        }
        return a(str, 5);
    }

    private String a(String str, int i) {
        Object[] objArr = {str, 5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a597ccdeeda5d427901556f5a9b8e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a597ccdeeda5d427901556f5a9b8e3");
        }
        if (!TextUtils.isEmpty(str) && str.length() > 5) {
            return str.substring(0, 4) + "...";
        }
        return str;
    }

    String a(View view, String str) {
        Iterator<String> it;
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e7d9f8aff83335ec54f41a335863d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e7d9f8aff83335ec54f41a335863d1");
        }
        String str2 = "";
        ArrayMap<String, String> arrayMap = view == null ? new ArrayMap<>() : this.m.get(view);
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
        }
        if (view == null) {
            for (ArrayMap<String, String> arrayMap2 : this.m.values()) {
                arrayMap.putAll((SimpleArrayMap<? extends String, ? extends String>) arrayMap2);
            }
        }
        while (arrayMap.keySet().iterator().hasNext()) {
            str2 = (str2 + it.next()) + CommonConstant.Symbol.COMMA;
        }
        for (GuideQueryData.GuidedQueryWordNew guidedQueryWordNew : this.u) {
            if (guidedQueryWordNew != null && guidedQueryWordNew.isFilterItem() && !TextUtils.isEmpty(guidedQueryWordNew.wmFilterItem.code) && ((guidedQueryWordNew.wmFilterItem.isHit && !TextUtils.equals(guidedQueryWordNew.wmFilterItem.code, str)) || (!guidedQueryWordNew.wmFilterItem.isHit && TextUtils.equals(guidedQueryWordNew.wmFilterItem.code, str)))) {
                str2 = (str2 + guidedQueryWordNew.wmFilterItem.code) + CommonConstant.Symbol.COMMA;
            }
        }
        return str2.length() > 0 ? str2.substring(0, str2.length() - 1) : str2;
    }

    @Override // com.sankuai.waimai.business.search.ui.result.guideQuery.b.a
    public final void a(View view, Map<String, String> map, boolean z) {
        Object[] objArr = {view, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edfc4055fcb3cb9b1141bcb407f0d439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edfc4055fcb3cb9b1141bcb407f0d439");
            return;
        }
        String str = "";
        ArrayMap<String, String> arrayMap = this.m.get(view);
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
        }
        if (map != null) {
            for (String str2 : arrayMap.keySet()) {
                if (!map.containsKey(str2)) {
                    str = (str + str2) + CommonConstant.Symbol.COMMA;
                }
            }
        }
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        arrayMap.clear();
        arrayMap.putAll(map);
        if (view != null) {
            this.b.a(a(view, ""), str, z);
            if (view != null && arrayMap.size() > 0) {
                this.l.g().a();
            }
            if (z) {
                return;
            }
            b(view);
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.result.guideQuery.b.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "669b978874cd3efa845f1cea20184ca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "669b978874cd3efa845f1cea20184ca0");
        } else if (view != null) {
            if (this.m.get(view) != null && this.m.get(view).size() > 0) {
                c((TextView) view);
            } else {
                a((TextView) view);
            }
            this.b.e();
        }
    }
}
