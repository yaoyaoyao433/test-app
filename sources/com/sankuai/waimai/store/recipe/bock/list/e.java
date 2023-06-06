package com.sankuai.waimai.store.recipe.bock.list;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.newwidgets.NestFullListView;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.recipe.model.RecipeLikeResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends g<com.sankuai.waimai.store.recipe.bock.list.b, com.sankuai.waimai.store.recipe.g> {
    public static ChangeQuickRedirect a;
    private a b;
    private b c;
    private RelativeLayout d;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_common_recipe_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.recipe.bock.list.b bVar, int i) {
        com.sankuai.waimai.store.recipe.bock.list.b bVar2 = bVar;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c9390e74e25aab40ca1f3d516ce470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c9390e74e25aab40ca1f3d516ce470");
        } else if (bVar2 == null || bVar2.b == null) {
        } else {
            Object[] objArr2 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32e1b0e12cf430fbb1ad6e6a9e3a5ba3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32e1b0e12cf430fbb1ad6e6a9e3a5ba3")).booleanValue() : ((com.sankuai.waimai.store.recipe.g) this.o).e(bVar2.b)) {
                RelativeLayout relativeLayout = this.d;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                relativeLayout.setMinimumHeight(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ae88eb50e942c98fbe17557127c61f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ae88eb50e942c98fbe17557127c61f1")).intValue() : ((com.sankuai.waimai.store.recipe.g) this.o).j());
            } else {
                this.d.setMinimumHeight(0);
            }
            this.b.a(bVar2.c);
            this.c.a(bVar2, i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        View a2;
        View view2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692303b0032477b4555018c6a3b9cd04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692303b0032477b4555018c6a3b9cd04");
            return;
        }
        this.d = (RelativeLayout) view.findViewById(R.id.root_view);
        NestFullListView nestFullListView = (NestFullListView) view.findViewById(R.id.list);
        nestFullListView.setFocusable(false);
        nestFullListView.setEnabled(false);
        this.c = new b((com.sankuai.waimai.store.recipe.g) this.o);
        b bVar = this.c;
        Object[] objArr2 = {nestFullListView};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fd4b84317223f2f54f9e23a9f5b5806e", RobustBitConfig.DEFAULT_VALUE)) {
            view2 = (View) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fd4b84317223f2f54f9e23a9f5b5806e");
        } else {
            if (bVar.p.a()) {
                a2 = z.a(nestFullListView.getContext(), R.layout.wm_sc_common_recipe_item_details_header_new, nestFullListView, false);
                bVar.g = (UniversalImageView) a2.findViewById(R.id.img_recipe);
                bVar.h = a2.findViewById(R.id.prise_layout);
                bVar.i = (TextView) a2.findViewById(R.id.tv_prise);
                bVar.j = (ImageView) a2.findViewById(R.id.img_prise);
                bVar.k = (TextView) a2.findViewById(R.id.number_count);
                bVar.l = a2.findViewById(R.id.line);
                bVar.m = (TextView) a2.findViewById(R.id.hard_level);
                bVar.n = (SCSingleLineFlowLayout) a2.findViewById(R.id.label_flow_layout);
                bVar.o = (TextView) a2.findViewById(R.id.tv_resume);
            } else {
                a2 = z.a(nestFullListView.getContext(), R.layout.wm_sc_common_recipe_item_details_header, nestFullListView, false);
            }
            bVar.c = (TextView) a2.findViewById(R.id.recipe_title);
            bVar.d = (TextView) a2.findViewById(R.id.describe);
            bVar.e = (ImageView) a2.findViewById(R.id.spread);
            bVar.f = a2.findViewById(R.id.describe_layout);
            bVar.b = a2;
            view2 = a2;
        }
        nestFullListView.a(view2);
        this.b = new a((com.sankuai.waimai.store.recipe.g) this.o);
        nestFullListView.setAdapter(this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.c<com.sankuai.waimai.store.recipe.bock.list.a, com.sankuai.waimai.store.recipe.g> {
        public static ChangeQuickRedirect a;
        private final com.sankuai.waimai.store.recipe.g b;

        public a(com.sankuai.waimai.store.recipe.g gVar) {
            super(gVar);
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45e8a72de4a854e85f4c57a73875be7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45e8a72de4a854e85f4c57a73875be7");
            } else {
                this.b = gVar;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.c
        public final g a(int i) {
            boolean z = true;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96b3e0793dfef7c1f6505731d389532", RobustBitConfig.DEFAULT_VALUE)) {
                return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96b3e0793dfef7c1f6505731d389532");
            }
            return new c((this.b == null || !this.b.a()) ? false : false);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b {
        public static ChangeQuickRedirect a;
        View b;
        TextView c;
        TextView d;
        ImageView e;
        View f;
        UniversalImageView g;
        View h;
        TextView i;
        ImageView j;
        TextView k;
        View l;
        TextView m;
        SCSingleLineFlowLayout n;
        TextView o;
        @NonNull
        final com.sankuai.waimai.store.recipe.g p;

        private b(@NonNull com.sankuai.waimai.store.recipe.g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670c95baf6cbde7d87568c6f9de9db80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670c95baf6cbde7d87568c6f9de9db80");
            } else {
                this.p = gVar;
            }
        }

        void a(@NonNull final com.sankuai.waimai.store.recipe.bock.list.b bVar, int i) {
            Recipe.Ingredient ingredient;
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c0982b8c9f97509ae617abdd314b15d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c0982b8c9f97509ae617abdd314b15d");
            } else if (bVar.b != null) {
                if (this.p.a()) {
                    if (this.g != null) {
                        if (!TextUtils.isEmpty(bVar.b.picture)) {
                            b.C0608b a2 = m.a(bVar.b.picture, ImageQualityUtil.a());
                            a2.i = R.drawable.wm_sc_common_loading_large;
                            a2.a((ImageView) this.g);
                        } else {
                            this.g.setImageResource(R.drawable.wm_sc_common_loading_large);
                        }
                    }
                    a(bVar);
                    this.h.setOnClickListener(new AnonymousClass1(bVar));
                    if (!TextUtils.isEmpty(bVar.b.hardLevel)) {
                        this.m.setVisibility(0);
                        this.m.setText(bVar.b.hardLevel);
                    } else {
                        this.m.setVisibility(8);
                    }
                    if (!com.sankuai.shangou.stone.util.a.b(bVar.b.ingredientList) && (ingredient = (Recipe.Ingredient) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.b.ingredientList, 0)) != null) {
                        String str = ingredient.cartText;
                        if (TextUtils.isEmpty(str)) {
                            this.k.setVisibility(8);
                        } else {
                            this.k.setVisibility(0);
                            this.k.setText(str);
                            if (!TextUtils.isEmpty(bVar.b.hardLevel)) {
                                this.l.setVisibility(0);
                            }
                        }
                        this.l.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(bVar.b.resume)) {
                        int dimensionPixelSize = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_14);
                        Drawable drawable = this.b.getContext().getResources().getDrawable(R.drawable.wm_sc_recipe_yinyong);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        ImageSpan imageSpan = new ImageSpan(drawable);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i" + bVar.b.resume);
                        spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
                        this.o.setText(spannableStringBuilder);
                        this.o.setVisibility(0);
                        this.n.setVisibility(8);
                    } else {
                        this.o.setVisibility(8);
                        if (!com.sankuai.shangou.stone.util.a.b(bVar.b.labels)) {
                            this.n.removeAllViews();
                            int dimensionPixelSize2 = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2);
                            for (int i2 = 0; i2 < com.sankuai.shangou.stone.util.a.a((List) bVar.b.labels); i2++) {
                                String str2 = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.b.labels, i2);
                                if (!TextUtils.isEmpty(str2)) {
                                    TextView textView = new TextView(this.b.getContext());
                                    textView.setMaxLines(1);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    textView.setTextSize(0, this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_11));
                                    textView.setIncludeFontPadding(false);
                                    textView.setGravity(17);
                                    int i3 = dimensionPixelSize2 * 2;
                                    textView.setPadding(i3, dimensionPixelSize2, i3, dimensionPixelSize2);
                                    textView.setText(str2);
                                    textView.setTextColor(this.b.getContext().getResources().getColor(R.color.wm_sc_nox_search_color_575859));
                                    textView.setBackground(new e.a().a(this.b.getContext().getResources().getColor(R.color.wm_sg_color_D3D3D3)).b(1).a(this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).a());
                                    this.n.addView(textView);
                                }
                            }
                            if (this.n.getChildCount() > 0) {
                                this.n.setVisibility(0);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(bVar.b.desc)) {
                        this.d.setText(bVar.b.desc.replace("\n", "\n\n"));
                    }
                } else {
                    this.d.setText(bVar.b.desc);
                }
                this.c.setText(bVar.b.name);
                this.d.setSingleLine(bVar.d);
                this.e.setSelected(bVar.d);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.bock.list.e.b.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f5574345beb3eaf07276b72ce5b2f54", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f5574345beb3eaf07276b72ce5b2f54");
                            return;
                        }
                        bVar.d = !bVar.d;
                        b.this.p.f();
                        com.sankuai.waimai.store.recipe.d i4 = b.this.p.i();
                        String str3 = bVar.b.id;
                        int h = b.this.p.h();
                        String str4 = bVar.b.name;
                        Object[] objArr3 = {str3, Integer.valueOf(h), str4};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                        if (PatchProxy.isSupport(objArr3, i4, changeQuickRedirect3, false, "469d2732530b983993697d04e999d57a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, i4, changeQuickRedirect3, false, "469d2732530b983993697d04e999d57a");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("spu_id", Long.valueOf(i4.d));
                        hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i4.c, i4.b));
                        hashMap.put("menu_id", str3);
                        hashMap.put("menu_name", str4);
                        hashMap.put(DataConstants.INDEX, Integer.valueOf(h));
                        hashMap.put("stid", i4.e);
                        i4.g.a("b_waimai_sg_93yzf8ld_mc", hashMap);
                    }
                });
                com.sankuai.waimai.store.recipe.d i4 = this.p.i();
                View view = this.b;
                String str3 = bVar.b.id;
                int h = this.p.h();
                String str4 = bVar.b.name;
                Object[] objArr2 = {view, str3, Integer.valueOf(h), str4};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.d.a;
                if (PatchProxy.isSupport(objArr2, i4, changeQuickRedirect2, false, "b5faa200f286bf09c1b214623fbf5c0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, i4, changeQuickRedirect2, false, "b5faa200f286bf09c1b214623fbf5c0e");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("spu_id", Long.valueOf(i4.d));
                hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i4.c, i4.b));
                hashMap.put("menu_id", str3);
                hashMap.put("menu_name", str4);
                hashMap.put(DataConstants.INDEX, Integer.valueOf(h));
                hashMap.put("stid", i4.e);
                com.sankuai.waimai.store.recipe.c cVar = i4.g;
                cVar.a("b_waimai_sg_93yzf8ld_mv", hashMap, view, "b_waimai_sg_93yzf8ld_mv" + str3);
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.recipe.bock.list.e$b$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ com.sankuai.waimai.store.recipe.bock.list.b b;

            public AnonymousClass1(com.sankuai.waimai.store.recipe.bock.list.b bVar) {
                this.b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab6deaf19e29f333586a9c3f5de1c1d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab6deaf19e29f333586a9c3f5de1c1d");
                } else {
                    com.sankuai.waimai.store.manager.user.a.a(view.getContext(), new Runnable() { // from class: com.sankuai.waimai.store.recipe.bock.list.e.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = 0;
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ded03a947297b4c1b27b2c684fc54c2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ded03a947297b4c1b27b2c684fc54c2");
                                return;
                            }
                            try {
                                long parseLong = Long.parseLong(AnonymousClass1.this.b.b.id);
                                com.sankuai.waimai.store.base.net.sg.a a2 = com.sankuai.waimai.store.base.net.sg.a.a((Object) "sc_recipe_like_tag");
                                if (AnonymousClass1.this.b.b.likeStatus != 1) {
                                    i = 1;
                                }
                                a2.a(i, parseLong, new j<RecipeLikeResponse>() { // from class: com.sankuai.waimai.store.recipe.bock.list.e.b.1.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.base.net.j
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7dbef348c30a57f07b7b56b86f9ae85a", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7dbef348c30a57f07b7b56b86f9ae85a");
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.j
                                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.j
                                    public final void b() {
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.j
                                    public final /* synthetic */ void a(RecipeLikeResponse recipeLikeResponse) {
                                        RecipeLikeResponse recipeLikeResponse2 = recipeLikeResponse;
                                        Object[] objArr3 = {recipeLikeResponse2};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5525fb9b26a6b2c3101f7c3e0a051aaf", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5525fb9b26a6b2c3101f7c3e0a051aaf");
                                            return;
                                        }
                                        AnonymousClass1.this.b.b.likeStatus = recipeLikeResponse2.likeStatus;
                                        AnonymousClass1.this.b.b.likeCount = recipeLikeResponse2.likeCount;
                                        b.this.a(AnonymousClass1.this.b);
                                    }
                                });
                            } catch (NumberFormatException unused) {
                            }
                        }
                    });
                }
            }
        }

        void a(@NonNull com.sankuai.waimai.store.recipe.bock.list.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8bf98c1cade6889d312e2c1f0df693", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8bf98c1cade6889d312e2c1f0df693");
            } else if (bVar == null || bVar.b == null) {
            } else {
                if (bVar.b.likeStatus == 1) {
                    if (this.i != null) {
                        this.i.setTextColor(this.b.getContext().getResources().getColor(R.color.wm_sg_color_FF8000));
                    }
                    if (this.j != null) {
                        this.j.setImageResource(R.drawable.wm_sc_recipe_ic_prise_orange);
                    }
                } else {
                    if (this.i != null) {
                        this.i.setTextColor(this.b.getContext().getResources().getColor(R.color.wm_sg_color_BCBCBD));
                    }
                    if (this.j != null) {
                        this.j.setImageResource(R.drawable.wm_sc_recipe_ic_prise_gray);
                    }
                }
                if (!TextUtils.isEmpty(bVar.b.likeCount)) {
                    if (this.i != null) {
                        TextView textView = this.i;
                        textView.setText(bVar.b.likeCount);
                    }
                } else if (this.i != null) {
                    this.i.setText("");
                }
            }
        }
    }
}
