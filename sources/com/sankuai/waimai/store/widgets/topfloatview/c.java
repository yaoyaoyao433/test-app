package com.sankuai.waimai.store.widgets.topfloatview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    Context b;
    InterfaceC1346c c;
    int d;
    public List<PrimaryFilterCondList> e;
    public List<CategoryInfo> f;
    LinearLayoutManager g;
    LinearLayoutManager h;
    public String i;
    public PoiChannelBackgroundConfig j;
    public com.sankuai.waimai.store.param.a k;
    public Map<Long, Boolean> l;
    private int m;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.widgets.topfloatview.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1346c {
        void a(View view, int i, long j);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final long getItemId(int i) {
        return i;
    }

    public static /* synthetic */ void a(c cVar, ImageView imageView, String str, int i, int i2) {
        Object[] objArr = {imageView, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "0021ad696f6affb04860e610fe04da35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "0021ad696f6affb04860e610fe04da35");
            return;
        }
        imageView.getLayoutParams().width = i;
        b.C0608b a2 = m.a(str, i, i2, ImageQualityUtil.a());
        a2.g = false;
        a2.a(imageView);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends RecyclerView.s {
        public LinearLayout a;
        public ImageView b;
        public TextView c;
        public TextView d;
        public ImageView e;

        public b(View view) {
            super(view);
            this.a = (LinearLayout) view.findViewById(R.id.top_float_kingkong_layout);
            this.b = (ImageView) view.findViewById(R.id.top_float_kingkong_img);
            this.c = (TextView) view.findViewById(R.id.top_float_kingkong_name);
            this.d = (TextView) view.findViewById(R.id.top_float_kingkong_bubble_text);
            this.e = (ImageView) view.findViewById(R.id.top_float_kingkong_bubble_img);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public LinearLayout a;
        public RelativeLayout b;
        public ImageView c;
        public TextView d;

        public a(View view) {
            super(view);
            this.a = (LinearLayout) view.findViewById(R.id.top_float_category_root);
            this.b = (RelativeLayout) view.findViewById(R.id.top_float_category_layout);
            this.c = (ImageView) view.findViewById(R.id.top_float_category_img);
            this.d = (TextView) view.findViewById(R.id.top_float_category_name);
        }
    }

    public c(Context context, int i, List<PrimaryFilterCondList> list, List<CategoryInfo> list2, LinearLayoutManager linearLayoutManager, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {context, Integer.valueOf(i), list, list2, linearLayoutManager, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f89e1253f8ec5d8e84eab459b57cf17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f89e1253f8ec5d8e84eab459b57cf17");
            return;
        }
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.l = new HashMap();
        this.b = context;
        this.m = i;
        this.d = 0;
        this.k = aVar;
        switch (this.m) {
            case 1:
                this.e = list;
                this.g = linearLayoutManager;
                return;
            case 2:
                this.f = list2;
                this.h = linearLayoutManager;
                return;
            default:
                return;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d07b7dd167ddb943af13884530692d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d07b7dd167ddb943af13884530692d7");
        }
        switch (this.m) {
            case 1:
                return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_top_float_kingkong_item, viewGroup, false));
            case 2:
                return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_top_float_category_item, viewGroup, false));
            default:
                return null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, int i) {
        e.a c;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa5f94e234ccd3c5110751590657dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa5f94e234ccd3c5110751590657dbe");
            return;
        }
        final int adapterPosition = sVar.getAdapterPosition();
        switch (this.m) {
            case 1:
                if (com.sankuai.shangou.stone.util.a.b(this.e) || com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, adapterPosition) == null) {
                    return;
                }
                final b bVar = (b) sVar;
                final PrimaryFilterCondList primaryFilterCondList = (PrimaryFilterCondList) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, adapterPosition);
                u.a(bVar.c, primaryFilterCondList.name);
                if (!t.a(primaryFilterCondList.iconUrl)) {
                    int a2 = h.a(this.b, 50.0f);
                    b.C0608b a3 = m.a(primaryFilterCondList.iconUrl, a2, a2, ImageQualityUtil.a());
                    a3.g = false;
                    a3.i = R.drawable.wm_sc_kingkong_category_loading;
                    a3.j = R.drawable.wm_sc_kingkong_category_loading;
                    a3.a(bVar.b);
                }
                if (primaryFilterCondList.bubble != null && this.l != null && this.l.containsKey(Long.valueOf(primaryFilterCondList.code)) && this.l.get(Long.valueOf(primaryFilterCondList.code)).booleanValue()) {
                    switch (primaryFilterCondList.bubble.type) {
                        case 0:
                            u.c(bVar.e);
                            if (bVar.d != null) {
                                u.a(bVar.d, primaryFilterCondList.bubble.content);
                                bVar.d.setTextColor(com.sankuai.shangou.stone.util.d.a(primaryFilterCondList.bubble.color, -1));
                                Drawable drawable = this.b.getDrawable(R.drawable.wm_sc_top_float_kingkong_bg);
                                DrawableCompat.setTint(drawable, com.sankuai.shangou.stone.util.d.a(primaryFilterCondList.bubble.bgColor, (int) SupportMenu.CATEGORY_MASK));
                                bVar.d.setBackground(drawable);
                                if (adapterPosition == com.sankuai.shangou.stone.util.a.c(this.e) - 1) {
                                    u.c(bVar.d, 0, 0, h.a(this.b, 6.0f), 0);
                                }
                                u.a(bVar.d);
                                break;
                            }
                            break;
                        case 1:
                            u.c(bVar.d);
                            if (bVar.e != null && primaryFilterCondList.bubble.content != null) {
                                b.C0608b a4 = m.a(primaryFilterCondList.bubble.content);
                                a4.g = false;
                                a4.a(new b.a() { // from class: com.sankuai.waimai.store.widgets.topfloatview.c.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                    public final void a(Bitmap bitmap) {
                                        Object[] objArr2 = {bitmap};
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a61b657a1df52210e31504f3785ea45", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a61b657a1df52210e31504f3785ea45");
                                        } else if (bitmap == null || bitmap.isRecycled()) {
                                        } else {
                                            int width = bitmap.getWidth();
                                            int height = bitmap.getHeight();
                                            c.a(c.this, bVar.e, primaryFilterCondList.bubble.content, (int) ((height != 0 ? width / height : 1.5d) * h.a(c.this.b, 20.0f)), h.a(c.this.b, 20.0f));
                                        }
                                    }

                                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                    public final void a() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a081dd43535eac9b7f6d095692dc443", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a081dd43535eac9b7f6d095692dc443");
                                        } else {
                                            c.a(c.this, bVar.e, primaryFilterCondList.bubble.content, h.a(c.this.b, 30.0f), h.a(c.this.b, 20.0f));
                                        }
                                    }
                                });
                                if (adapterPosition == com.sankuai.shangou.stone.util.a.c(this.e) - 1) {
                                    u.c(bVar.e, 0, 0, h.a(this.b, 6.0f), 0);
                                }
                                u.a(bVar.e);
                                break;
                            }
                            break;
                        default:
                            u.c(bVar.d);
                            u.c(bVar.e);
                            break;
                    }
                } else {
                    u.c(bVar.d);
                    u.c(bVar.e);
                }
                if (this.d == adapterPosition) {
                    bVar.c.setTextColor(com.sankuai.shangou.stone.util.d.a("#FFFFFF", -1));
                    float a5 = h.a(this.b, 12.0f);
                    e.a c2 = new e.a().c(com.sankuai.shangou.stone.util.d.a(this.i, com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_38C617)));
                    c2.a(a5, a5, a5, a5);
                    bVar.c.setBackground(c2.a());
                } else {
                    bVar.c.setTextColor(com.sankuai.shangou.stone.util.d.a("#222426", -16777216));
                    bVar.c.setBackground(null);
                }
                a(1, i, primaryFilterCondList, bVar.a);
                bVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.topfloatview.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bb95c945d797f97c6469e5f641252be", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bb95c945d797f97c6469e5f641252be");
                        } else if (c.this.e.get(adapterPosition).graySwitch == 1) {
                            am.a(c.this.b, "暂无商品，敬请期待");
                            c.this.a(2, adapterPosition, primaryFilterCondList, bVar.a);
                        } else if (c.this.d != adapterPosition) {
                            c.this.d = adapterPosition;
                            c.this.g.scrollToPositionWithOffset(adapterPosition, c.this.a());
                            c.this.notifyDataSetChanged();
                            c.this.a(2, adapterPosition, primaryFilterCondList, bVar.a);
                            c.this.c.a(bVar.a, adapterPosition, c.this.e.get(adapterPosition).code);
                            if (c.this.l == null || !c.this.l.containsKey(Long.valueOf(primaryFilterCondList.code))) {
                                return;
                            }
                            c.this.l.put(Long.valueOf(primaryFilterCondList.code), Boolean.FALSE);
                        }
                    }
                });
                return;
            case 2:
                if (com.sankuai.shangou.stone.util.a.b(this.f) || com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, adapterPosition) == null) {
                    return;
                }
                final a aVar = (a) sVar;
                final CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, adapterPosition);
                aVar.b.getLayoutParams().width = ((h.a(this.b) - (h.a(this.b, 20.0f) * 2)) - (h.a(this.b, 8.0f) * 3)) / 4;
                if (!t.a(categoryInfo.icon)) {
                    int a6 = h.a(this.b, 17.5f);
                    b.C0608b a7 = m.a(categoryInfo.icon, a6, a6, ImageQualityUtil.a());
                    a7.g = false;
                    a7.i = R.drawable.wm_sc_kingkong_category_loading;
                    a7.j = R.drawable.wm_sc_kingkong_category_loading;
                    a7.a(aVar.c);
                }
                String str = categoryInfo.name;
                if (!t.a(str)) {
                    if (str.length() > 4) {
                        str = str.substring(0, 4);
                    }
                    u.a(aVar.d, str);
                }
                float a8 = h.a(this.b, 14.0f);
                if (this.d == adapterPosition) {
                    u.a(aVar.d, true);
                    String str2 = "#20AB00";
                    if (this.j != null && this.j.iconSelectedFontColor != null) {
                        str2 = this.j.iconSelectedFontColor;
                    }
                    aVar.d.setTextColor(com.sankuai.shangou.stone.util.d.a(str2, com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_20AB00)));
                    String str3 = "#56BC40";
                    if (this.j != null && this.j.iconSelectedFontColor != null) {
                        str3 = this.j.subCateTextSelectedBgColorFrm;
                    }
                    c = new e.a().c(com.sankuai.shangou.stone.util.d.a(str3, com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_20AB00)));
                } else {
                    u.a(aVar.d, false);
                    aVar.d.setTextColor(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_575859));
                    c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_FAFAFA));
                }
                c.a(a8, a8, a8, a8);
                aVar.b.setBackground(c.a());
                aVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.topfloatview.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ca65d7b2cae8e40f2342ea70afc270f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ca65d7b2cae8e40f2342ea70afc270f");
                        } else if (c.this.d != adapterPosition) {
                            c.this.d = adapterPosition;
                            c.this.h.scrollToPositionWithOffset(adapterPosition, c.this.a());
                            c.this.notifyDataSetChanged();
                            c.this.c.a(aVar.b, adapterPosition, Long.parseLong(categoryInfo.code));
                            c cVar = c.this;
                            int i2 = adapterPosition;
                            CategoryInfo categoryInfo2 = categoryInfo;
                            Object[] objArr3 = {2, Integer.valueOf(i2), categoryInfo2, aVar.b};
                            ChangeQuickRedirect changeQuickRedirect3 = c.a;
                            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "1928f3e56f4c096b9885b3c635a25946", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "1928f3e56f4c096b9885b3c635a25946");
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("template_type", Integer.valueOf(categoryInfo2.template_code));
                            hashMap.put("notice_type", Integer.valueOf(categoryInfo2.tagIconType));
                            hashMap.put("cat_id", Long.valueOf(cVar.k.c));
                            hashMap.put("index", Integer.valueOf(i2));
                            hashMap.put("sec_cate_id", categoryInfo2.code);
                            hashMap.put("click_status", 1);
                            hashMap.put("label_type", 2);
                            hashMap.put("media_type", 3);
                            hashMap.put("stid", cVar.k.T);
                            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_mosdf5bw", "b_LQk7g").b(hashMap).a();
                        }
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "554b931ad6552a11f3b75bac927e0bd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "554b931ad6552a11f3b75bac927e0bd0")).intValue();
        }
        switch (this.m) {
            case 1:
                return this.e.size();
            case 2:
                return this.f.size();
            default:
                return 0;
        }
    }

    public final void a(int i, long j) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78dbb32ba8e25e035f8cc4011fc1dc83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78dbb32ba8e25e035f8cc4011fc1dc83");
            return;
        }
        switch (i) {
            case 1:
                if (this.l != null && this.l.containsKey(Long.valueOf(j))) {
                    this.l.put(Long.valueOf(j), Boolean.FALSE);
                }
                while (true) {
                    if (i2 < this.e.size()) {
                        if (this.e.get(i2).code == j) {
                            this.d = i2;
                            this.g.scrollToPositionWithOffset(i2, a());
                        } else {
                            i2++;
                        }
                    }
                }
                notifyDataSetChanged();
                return;
            case 2:
                break;
            default:
                return;
        }
        while (true) {
            if (i2 < this.f.size()) {
                if (this.f.get(i2).code.equals(String.valueOf(j))) {
                    this.d = i2;
                    this.h.scrollToPositionWithOffset(i2, a());
                } else {
                    i2++;
                }
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, PrimaryFilterCondList primaryFilterCondList, View view) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), primaryFilterCondList, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "517a3227b04a1c67ad29bce3ee2f6cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "517a3227b04a1c67ad29bce3ee2f6cb3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(primaryFilterCondList.code));
        hashMap.put("index", Integer.valueOf(i2));
        hashMap.put("cat_name", primaryFilterCondList.name == null ? "" : primaryFilterCondList.name);
        hashMap.put("is_gray", Integer.valueOf(primaryFilterCondList.graySwitch));
        hashMap.put("stid", this.k.T);
        hashMap.put("is_float", 1);
        if (this.l != null && this.l.containsKey(Long.valueOf(primaryFilterCondList.code)) && this.l.get(Long.valueOf(primaryFilterCondList.code)).booleanValue()) {
            i3 = 1;
        }
        hashMap.put("is_guide_bubbles", Integer.valueOf(i3));
        if (i == 1) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_jf5uqfph_mv", view);
            bVar.b(hashMap);
            bVar.e = primaryFilterCondList.name + CommonConstant.Symbol.UNDERLINE + primaryFilterCondList.code;
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, bVar);
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a("c_waimai_mosdf5bw", "b_waimai_jf5uqfph_mc").b(hashMap).a();
    }

    int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c537e9a72b9dd6709d742d01e968be35", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c537e9a72b9dd6709d742d01e968be35")).intValue() : (h.a(this.b) - 300) / 2;
    }
}
