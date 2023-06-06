package com.sankuai.waimai.store.drug.home.adapter.subcategory.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.drug.home.adapter.subcategory.core.a<a> {
    public static ChangeQuickRedirect a;
    int b;
    Context c;
    com.sankuai.waimai.store.drug.home.adapter.subcategory.a d;
    final com.sankuai.waimai.store.param.a e;
    boolean f;
    private List<CategoryInfo> g;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(e eVar, final int i) {
        char c;
        int i2;
        final a aVar = (a) eVar;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dee511f0c6b7d829c1b0ba014e99d25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dee511f0c6b7d829c1b0ba014e99d25");
            return;
        }
        final CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g, i);
        if (categoryInfo == null) {
            return;
        }
        Object[] objArr2 = {categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d5dce4ab2c719635c000e448c388069a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d5dce4ab2c719635c000e448c388069a");
            return;
        }
        View view = aVar.itemView;
        Object[] objArr3 = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1101f985a6ed48948c76ab0c4b178f46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1101f985a6ed48948c76ab0c4b178f46");
        } else {
            int a2 = h.a(b.this.c, 3.0f);
            RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
            if (i == 0) {
                gVar.leftMargin = a2;
                gVar.rightMargin = 0;
            } else if (i == b.this.a() - 1) {
                gVar.leftMargin = 0;
                gVar.rightMargin = a2;
            } else {
                gVar.leftMargin = 0;
                gVar.rightMargin = 0;
            }
            view.setLayoutParams(gVar);
        }
        Object[] objArr4 = {categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "3d3404ed70957cbaf547d9bbc9b4e20f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "3d3404ed70957cbaf547d9bbc9b4e20f");
        } else if (b.this.d != null) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.adapter.subcategory.core.b.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr5 = {view2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e0569fb4a2372275ee62b1e73cc64981", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e0569fb4a2372275ee62b1e73cc64981");
                    } else if (b.this.d != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("stid", b.this.e.c());
                        hashMap.put("template_type", Integer.valueOf(b.this.e.k() ? categoryInfo.template_code : b.this.e.K));
                        hashMap.put("index", Integer.valueOf(i));
                        b.this.d.a(a.this.itemView, i, hashMap);
                    }
                }
            });
        }
        View view2 = aVar.itemView;
        Object[] objArr5 = {view2, categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect5 = a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "d722b37ce0f2b6ebf0f78881450708c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "d722b37ce0f2b6ebf0f78881450708c2");
        } else if (view2 != null && categoryInfo != null && (b.this.c instanceof com.sankuai.waimai.store.expose.v2.a)) {
            com.sankuai.waimai.store.expose.v2.entity.b a3 = com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) b.this.c, view2);
            if (a3 == null) {
                a3 = new c("b_waimai_fkdcg6e7_mv", view2);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) b.this.c, a3);
            } else {
                a3.g();
            }
            a3.e = "TabGrid" + b.this.e.c + String.valueOf(categoryInfo.code);
            a3.a("cat_id", Long.valueOf(b.this.e.c));
            a3.a("sec_cat_id", String.valueOf(categoryInfo.code));
            a3.a("stid", b.this.e.c());
            a3.a("index", Integer.valueOf(i));
            a3.a("sec_cat_name", t.a(categoryInfo.icon) ? categoryInfo.name : categoryInfo.icon);
            a3.a("trace_id", TextUtils.isEmpty(b.this.e.aF) ? "" : b.this.e.aF);
        }
        if (!TextUtils.isEmpty(categoryInfo.icon)) {
            aVar.d.getLayoutParams().height = h.a(b.this.c, i == b.this.b ? 22.0f : 20.0f);
            u.a(aVar.d);
            u.c(aVar.b);
            b.C0608b b = m.b(categoryInfo.icon, ImageQualityUtil.a());
            b.g = false;
            b.a(aVar.d);
        } else {
            aVar.b.setTextSize(2, i == b.this.b ? 19.0f : 17.0f);
            u.a(aVar.b);
            u.c(aVar.d);
            TextView textView = aVar.b;
            String str = categoryInfo.name;
            Object[] objArr6 = {str};
            ChangeQuickRedirect changeQuickRedirect6 = a.a;
            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "df6f97cf6a6c17a2077c698eb86f958a", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "df6f97cf6a6c17a2077c698eb86f958a");
            } else if (!TextUtils.isEmpty(str) && str.length() > 5) {
                str = str.substring(0, 4) + "...";
            }
            textView.setText(str);
        }
        Object[] objArr7 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect7 = a.a;
        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "97530ea7cfc4f334bf4744d32127a6a5", RobustBitConfig.DEFAULT_VALUE)) {
            c = 0;
            PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "97530ea7cfc4f334bf4744d32127a6a5");
            i2 = 1;
        } else {
            c = 0;
            if (i == b.this.b) {
                i2 = 1;
                u.a(aVar.c);
            } else {
                i2 = 1;
                u.c(aVar.c);
            }
        }
        if (!b.this.f) {
            u.c(aVar.e);
        } else if (categoryInfo.bubble == null) {
            u.b(aVar.e);
        } else {
            PrimaryFilterCondList.Bubble bubble = categoryInfo.bubble;
            Object[] objArr8 = new Object[i2];
            objArr8[c] = bubble;
            ChangeQuickRedirect changeQuickRedirect8 = a.a;
            if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "1541c1ee231e0342818825d791e3f14f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "1541c1ee231e0342818825d791e3f14f");
                return;
            }
            u.a(aVar.e);
            final int a4 = h.a(b.this.c, 7.0f);
            int a5 = h.a(b.this.c, 2.0f);
            int a6 = h.a(b.this.c, 3.0f);
            if (bubble.type == 0) {
                e.a aVar2 = new e.a();
                float f = a4;
                aVar2.a(f, f, f, a5);
                aVar2.c(d.a(bubble.bgColor, -46554));
                aVar.e.setBackground(aVar2.a());
                aVar.e.setTextColor(d.a(bubble.color, -1));
                aVar.e.setText(bubble.content);
                aVar.e.setPadding(a6, 0, a6, 0);
            } else if (bubble.type == 1) {
                aVar.e.setText("");
                aVar.e.setPadding(0, 0, 0, 0);
                m.d(bubble.content, a4 * 2).a(new b.a() { // from class: com.sankuai.waimai.store.drug.home.adapter.subcategory.core.b.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr9 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect9 = a;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a92dcedbac6143fd407743b26e407e77", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a92dcedbac6143fd407743b26e407e77");
                        } else if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            if (width > 0 && height > 0) {
                                try {
                                    a.this.e.setBackground(new BitmapDrawable(b.this.c.getResources(), com.sankuai.shangou.stone.util.b.a(bitmap, (int) Math.floor(((width * 2.0d) * a4) / height), a4 * 2, false)));
                                    return;
                                } catch (Exception unused) {
                                }
                            }
                            a();
                        } else {
                            a();
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = a;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "28e8dfb2a28e7180cf98a558f0e29cd5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "28e8dfb2a28e7180cf98a558f0e29cd5");
                        } else {
                            a.this.e.setBackground(null);
                        }
                    }
                }, 1);
            }
        }
    }

    public b(com.sankuai.waimai.store.param.a aVar, @NonNull c.a aVar2, Context context, int i) {
        Object[] objArr = {aVar, aVar2, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6261a5807b197f2e52877456676c90ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6261a5807b197f2e52877456676c90ca");
            return;
        }
        this.c = context;
        this.b = i;
        this.g = aVar2.a;
        this.e = aVar;
    }

    @Override // com.sankuai.waimai.store.drug.home.adapter.subcategory.core.a
    public final void a(com.sankuai.waimai.store.drug.home.adapter.subcategory.a aVar) {
        this.d = aVar;
    }

    @Override // com.sankuai.waimai.store.drug.home.adapter.subcategory.core.a
    public final void a(List<CategoryInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fae91ec79544b9f82f72f4ecabeebde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fae91ec79544b9f82f72f4ecabeebde");
            return;
        }
        this.b = i;
        this.g = list;
        this.f = false;
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            Iterator<CategoryInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CategoryInfo next = it.next();
                if (next != null && next.bubble != null) {
                    this.f = true;
                    break;
                }
            }
        }
        m();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc30459b9de57d856e3f98f6fcc9c5c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc30459b9de57d856e3f98f6fcc9c5c")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.g);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18128ba8597e57d4ec023e099d48461e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18128ba8597e57d4ec023e099d48461e") : new a(LayoutInflater.from(this.c).inflate(R.layout.wm_drug_home_tab_item, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.widgets.recycler.e {
        public static ChangeQuickRedirect a;
        public TextView b;
        public ImageView c;
        public ImageView d;
        public TextView e;
        public ConstraintLayout f;

        public a(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a3f258a7906768d636357056faaf9c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a3f258a7906768d636357056faaf9c");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.tv_drug_tab_name);
            this.d = (ImageView) view.findViewById(R.id.img_icon);
            this.c = (ImageView) view.findViewById(R.id.img_indicate);
            this.e = (TextView) view.findViewById(R.id.tv_new_drug_home_cat_bubble);
            this.f = (ConstraintLayout) view.findViewById(R.id.cons_title_container);
        }
    }
}
