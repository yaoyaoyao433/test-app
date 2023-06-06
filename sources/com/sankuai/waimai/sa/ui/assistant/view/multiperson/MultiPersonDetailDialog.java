package com.sankuai.waimai.sa.ui.assistant.view.multiperson;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.sa.model.Product;
import com.sankuai.waimai.sa.model.SAFoodCategory;
import com.sankuai.waimai.sa.model.l;
import com.sankuai.waimai.sa.ui.assistant.chat.multiperson.MultiPersonFooterController;
import com.sankuai.waimai.sa.ui.assistant.view.MultiPersonMealFooterRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MultiPersonDetailDialog extends BottomSheetDialog implements View.OnClickListener {
    public static ChangeQuickRedirect d;
    private l e;
    private TextView f;
    private View g;
    private TextView h;
    private ImageView i;
    private StatisticsRecyclerView j;
    private com.sankuai.waimai.sa.ui.assistant.a k;
    private String l;
    private MultiPersonMealFooterRelativeLayout m;
    private Activity n;
    private long o;
    private int p;

    public MultiPersonDetailDialog(Activity activity, com.sankuai.waimai.sa.ui.assistant.a aVar, l lVar, long j, int i, String str) {
        super(activity);
        Object[] objArr = {activity, aVar, lVar, new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ddc4c50048e8f0fbfdec0fc7674a5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ddc4c50048e8f0fbfdec0fc7674a5f");
            return;
        }
        this.n = activity;
        this.k = aVar;
        this.e = lVar;
        this.o = j;
        this.p = i;
        this.l = str;
    }

    public final MultiPersonDetailDialog a() {
        final List list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382f39844c1955e44f3cf1e3628df1b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MultiPersonDetailDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382f39844c1955e44f3cf1e3628df1b0");
        }
        setContentView(R.layout.wm_smart_assistant_multi_person_detail);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "613e00feee67efc2bc136de5089071b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "613e00feee67efc2bc136de5089071b7");
        } else {
            this.f = (TextView) findViewById(R.id.wm_smart_assistant_multi_person_more_header_txt);
            this.h = (TextView) findViewById(R.id.wm_smart_assistant_multi_person_more_header_txt_detail);
            this.i = (ImageView) findViewById(R.id.wm_smart_assistant_multi_person_more_header_close);
            this.j = (StatisticsRecyclerView) findViewById(R.id.wm_smart_assistant_multi_person_more_list);
            this.g = findViewById(R.id.wm_smart_assistant_multi_person_merchant_divider);
            this.m = (MultiPersonMealFooterRelativeLayout) findViewById(R.id.multi_person_bottom_layout);
            findViewById(R.id.wm_smart_assistant_multi_person_footer_divider_line).setVisibility(8);
            this.m.setBackgroundColor(Color.parseColor("#FCFCFC"));
            this.m.setPadding(g.a(getContext(), 14.0f), 0, g.a(getContext(), 14.0f), 0);
        }
        l lVar = this.e;
        Object[] objArr3 = {lVar};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d731506c8edac37926cd62b14450cf99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d731506c8edac37926cd62b14450cf99");
        } else if (lVar != null && !com.sankuai.waimai.foundation.utils.d.a(lVar.n)) {
            if (!TextUtils.isEmpty(lVar.l)) {
                this.f.setText(lVar.l);
            } else {
                this.f.setText(R.string.wm_sa_package_details);
            }
            if (!TextUtils.isEmpty(lVar.w)) {
                this.h.setText(lVar.w);
                this.g.setVisibility(0);
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
                this.g.setVisibility(8);
            }
            this.i.setOnClickListener(this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
            Object[] objArr4 = {lVar};
            ChangeQuickRedirect changeQuickRedirect4 = d;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b39c1a1205bfa061ab871eedf4ff52bf", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b39c1a1205bfa061ab871eedf4ff52bf");
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Product product : lVar.n) {
                    List list2 = (List) linkedHashMap.get(product.foodCategory);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        linkedHashMap.put(product.foodCategory, list2);
                    }
                    list2.add(product);
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (SAFoodCategory sAFoodCategory : linkedHashMap.keySet()) {
                    arrayList.add(new e(sAFoodCategory));
                    List<Product> list3 = (List) linkedHashMap.get(sAFoodCategory);
                    if (!com.sankuai.waimai.foundation.utils.d.a(list3)) {
                        for (Product product2 : list3) {
                            arrayList.add(new e(product2, sAFoodCategory, i));
                            i++;
                        }
                    }
                }
                if (lVar.k > 0.0d) {
                    arrayList.add(new e(lVar.k));
                } else {
                    arrayList.add(new e(0.0d));
                }
                if (!com.sankuai.waimai.foundation.utils.d.a(lVar.t)) {
                    for (l.a aVar : lVar.t) {
                        arrayList.add(new e(aVar));
                    }
                }
                list = arrayList;
            }
            this.j.setLayoutManager(linearLayoutManager);
            c cVar = new c(list);
            com.sankuai.waimai.sa.ui.assistant.view.multiperson.b bVar = new com.sankuai.waimai.sa.ui.assistant.view.multiperson.b(this.j.getContext(), 1, ContextCompat.getDrawable(getContext(), R.drawable.wm_smart_assistant_detail_divider));
            bVar.b = 1;
            this.j.addItemDecoration(bVar);
            this.j.setAdapter(cVar);
            new MultiPersonFooterController(this.m).a(this.e, this.o, this.k, this.p, this.l, 1, 0);
            this.j.a();
            this.j.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonDetailDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void b(int i2) {
                }

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void a(int i2) {
                    Object[] objArr5 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "547162c68fd28975bca5e5764ad6a9b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "547162c68fd28975bca5e5764ad6a9b6");
                        return;
                    }
                    e eVar = (e) list.get(i2);
                    if (eVar == null || eVar.g != 1) {
                        return;
                    }
                    JudasManualManager.b("b_kvyaunu1").a("package_key_sku", MultiPersonDetailDialog.this.e.p).a("poi_id", MultiPersonDetailDialog.this.e.c).a("result_id", MultiPersonDetailDialog.this.o).a("index", MultiPersonDetailDialog.this.p).a("intelligent_mj_group_sku_index", eVar.f).a("tag_sku", eVar.b == null ? "" : eVar.b.name).a("c_6tg6wz4r").a();
                }
            });
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.wm_smart_assistant_multi_person_more).getParent().getParent();
        NotDragBottomSheetBehavior notDragBottomSheetBehavior = new NotDragBottomSheetBehavior();
        ((CoordinatorLayout.c) viewGroup.getLayoutParams()).a(notDragBottomSheetBehavior);
        notDragBottomSheetBehavior.b(3);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            viewGroup.setBackground(new ColorDrawable(0));
        } catch (Exception unused) {
        }
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d084a311ff3c3e25e386fd7e36c48f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d084a311ff3c3e25e386fd7e36c48f4");
            return;
        }
        super.show();
        JudasManualManager.b("b_5dkn0ljq").a("c_6tg6wz4r").a("result_id", this.o).a("package_key_sku", this.e.p).a("poi_id", this.e.c).a("index", this.p).a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a465778e57f42ad7d12009aabba27fe4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a465778e57f42ad7d12009aabba27fe4");
        } else if (view.getId() == R.id.wm_smart_assistant_multi_person_more_header_close) {
            dismiss();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public static ChangeQuickRedirect a;
        SAFoodCategory b;
        Product c;
        double d;
        l.a e;
        int f;
        public int g;

        public e(SAFoodCategory sAFoodCategory) {
            Object[] objArr = {sAFoodCategory};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3987f79f1f3272fe8f28619b73b0e566", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3987f79f1f3272fe8f28619b73b0e566");
                return;
            }
            this.b = sAFoodCategory;
            this.g = 2;
        }

        public e(Product product, SAFoodCategory sAFoodCategory, int i) {
            Object[] objArr = {product, sAFoodCategory, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5144ae8f3aa7e8374e79a81adc072c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5144ae8f3aa7e8374e79a81adc072c");
                return;
            }
            this.c = product;
            this.b = sAFoodCategory;
            this.f = i;
            this.g = 1;
        }

        public e(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d79b57cfd6e354ebdf9ec241f035e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d79b57cfd6e354ebdf9ec241f035e9");
                return;
            }
            this.d = d;
            this.g = 3;
        }

        public e(l.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555c128d971968701e0764aab8341e81", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555c128d971968701e0764aab8341e81");
                return;
            }
            this.e = aVar;
            this.g = 4;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public ImageView a;
        public TextView b;

        public a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_title_icon);
            this.b = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_title_name);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d extends RecyclerView.s {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public RelativeLayout h;

        public d(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_pic);
            this.b = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_name);
            this.g = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_description);
            this.c = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_size);
            this.d = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_price);
            this.e = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_origin_price);
            this.f = (TextView) view.findViewById(R.id.wm_smart_assistant_multi_person_more_item_count);
            this.h = (RelativeLayout) view.findViewById(R.id.wm_smart_assistant_multi_person_detail_item_product_container);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends RecyclerView.s {
        public TextView a;
        public TextView b;
        public View c;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.discount_item_name);
            this.b = (TextView) view.findViewById(R.id.discount_item_price);
            this.c = view;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends RecyclerView.a {
        public static ChangeQuickRedirect a;
        public List<e> b;

        public c(List<e> list) {
            Object[] objArr = {MultiPersonDetailDialog.this, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd55c6d51d6ce2540e5d396ec9214b39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd55c6d51d6ce2540e5d396ec9214b39");
            } else {
                this.b = list;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45571c347a5657d8c9fe53865d420d9e", RobustBitConfig.DEFAULT_VALUE)) {
                return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45571c347a5657d8c9fe53865d420d9e");
            }
            switch (i) {
                case 1:
                    return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_multi_person_detail_item, (ViewGroup) null));
                case 2:
                    return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_multi_person_detail_item_title, (ViewGroup) null));
                default:
                    return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_multi_person_discount_detail_item, viewGroup, false));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.s sVar, int i) {
            int a2;
            Object[] objArr = {sVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba52f6c8af3531184968c1f9db310c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba52f6c8af3531184968c1f9db310c4");
                return;
            }
            final e eVar = this.b.get(i);
            if (eVar.g == 2 && eVar.b != null) {
                a aVar = (a) sVar;
                if (!TextUtils.isEmpty(eVar.b.name)) {
                    aVar.b.setText(eVar.b.name);
                } else {
                    aVar.b.setText(R.string.wm_sa_dishes);
                }
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = aVar.itemView.getContext();
                a3.c = eVar.b.icon;
                a3.e = 1;
                a3.a(aVar.a);
            }
            if (eVar.g == 1 && eVar.c != null) {
                final d dVar = (d) sVar;
                dVar.b.setText(eVar.c.name);
                if (!TextUtils.isEmpty(eVar.c.description)) {
                    dVar.g.setText(eVar.c.description);
                    dVar.g.setVisibility(0);
                } else {
                    dVar.g.setVisibility(8);
                }
                if (eVar.c.sku != null) {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(eVar.c.sku.spec)) {
                        sb.append(eVar.c.sku.spec);
                        sb.append(';');
                    }
                    if (!com.sankuai.waimai.foundation.utils.d.a(eVar.c.sku.spuAttrs)) {
                        for (GoodsAttrList goodsAttrList : eVar.c.sku.spuAttrs) {
                            if (!com.sankuai.waimai.foundation.utils.d.a(goodsAttrList.values)) {
                                Iterator<GoodsAttr> it = goodsAttrList.values.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    GoodsAttr next = it.next();
                                    if (next != null && !TextUtils.isEmpty(next.getValue())) {
                                        sb.append(next.getValue());
                                        sb.append(';');
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(sb2)) {
                        dVar.c.setText(sb2.substring(0, sb2.length() - 1));
                        dVar.c.setVisibility(0);
                        dVar.g.setMaxLines(1);
                    } else {
                        dVar.c.setVisibility(8);
                        dVar.g.setMaxLines(2);
                    }
                    if (eVar.c.sku.totalPrice < 0.01d) {
                        dVar.d.setVisibility(4);
                    } else {
                        dVar.d.setVisibility(0);
                        dVar.d.setText(dVar.d.getContext().getString(R.string.wm_sa_price_string, h.a(eVar.c.sku.totalPrice)));
                    }
                    if (eVar.c.sku.totalOriginPrice < 0.01d || h.c(Double.valueOf(eVar.c.sku.totalOriginPrice), Double.valueOf(eVar.c.sku.totalPrice))) {
                        dVar.e.setVisibility(4);
                    } else {
                        dVar.e.setVisibility(0);
                        dVar.e.setPaintFlags(dVar.e.getPaintFlags() | 16);
                        dVar.e.setText(dVar.e.getContext().getString(R.string.wm_sa_price_string, h.a(eVar.c.sku.totalOriginPrice)));
                    }
                    if (eVar.c.sku.count < 0) {
                        dVar.f.setVisibility(4);
                    } else {
                        dVar.f.setVisibility(0);
                        dVar.f.setText(dVar.f.getContext().getString(R.string.wm_sa_sku_count, Integer.valueOf(eVar.c.sku.count)));
                    }
                    if (eVar.c.sku.count > 1) {
                        dVar.f.setTextColor(Color.parseColor("#FB4E44"));
                    } else {
                        dVar.f.setTextColor(Color.parseColor("#666666"));
                    }
                    if (h.d(Double.valueOf(eVar.c.sku.totalOriginPrice), Double.valueOf(eVar.c.sku.totalPrice)) && !TextUtils.isEmpty(eVar.c.sku.activityIcon)) {
                        final SpannableString spannableString = new SpannableString("  " + eVar.c.name);
                        b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                        a4.b = MultiPersonDetailDialog.this.n;
                        a4.c = eVar.c.sku.activityIcon;
                        a4.a(new b.a() { // from class: com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonDetailDialog.c.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap) {
                                Object[] objArr2 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ab94d03abe5b97e9e1c835f241c4cc0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ab94d03abe5b97e9e1c835f241c4cc0");
                                    return;
                                }
                                float a5 = g.a(MultiPersonDetailDialog.this.n, 14.0f) / bitmap.getWidth();
                                Matrix matrix = new Matrix();
                                matrix.postScale(a5, a5);
                                spannableString.setSpan(new com.sankuai.waimai.sa.ui.assistant.view.multiperson.a(MultiPersonDetailDialog.this.n, Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true)), 0, 1, 1);
                                dVar.b.setText(spannableString);
                            }
                        });
                    }
                } else {
                    dVar.g.setMaxLines(2);
                    dVar.e.setVisibility(4);
                    dVar.c.setVisibility(4);
                    dVar.f.setVisibility(4);
                    dVar.d.setVisibility(4);
                }
                b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a5.b = dVar.itemView.getContext();
                a5.c = eVar.c.picture;
                a5.e = 1;
                a5.a(dVar.a);
                sVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonDetailDialog.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b86213dc407b2146329ac0ad43e4e97", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b86213dc407b2146329ac0ad43e4e97");
                            return;
                        }
                        Product product = eVar.c;
                        if (MultiPersonDetailDialog.this.e == null || product == null) {
                            return;
                        }
                        JudasManualManager.a("b_4xlcdm3o").a("package_key_sku", MultiPersonDetailDialog.this.e.p == null ? "" : MultiPersonDetailDialog.this.e.p).a("poi_id", MultiPersonDetailDialog.this.e.c).a("result_id", MultiPersonDetailDialog.this.o).a("index", MultiPersonDetailDialog.this.p).a("intelligent_mj_group_sku_index", eVar.f).a("tag_sku", eVar.b == null ? "" : eVar.b.name).a("c_6tg6wz4r").a();
                        MultiPersonDetailDialog.this.k.a(MultiPersonDetailDialog.this.e.c, product);
                    }
                });
                int a6 = g.a(MultiPersonDetailDialog.this.getContext(), 10.0f);
                int i2 = i + 1;
                if (i2 < getItemCount() && getItemViewType(i2) == 2) {
                    a2 = g.a(MultiPersonDetailDialog.this.getContext(), 16.0f);
                } else {
                    a2 = g.a(MultiPersonDetailDialog.this.getContext(), 11.0f);
                }
                dVar.h.setPadding(0, a6, 0, a2);
            }
            if (eVar.g == 3 && eVar.d > 0.0d) {
                b bVar = (b) sVar;
                bVar.c.setPadding(0, g.a(MultiPersonDetailDialog.this.getContext(), 15.0f), 0, g.a(MultiPersonDetailDialog.this.getContext(), 15.0f));
                bVar.a.setText(R.string.wm_sa_packaging_fee);
                bVar.b.setText(bVar.b.getContext().getString(R.string.wm_sa_price_string, h.a(eVar.d)));
                bVar.b.setTextColor(MultiPersonDetailDialog.this.getContext().getResources().getColor(R.color.wm_common_text_main));
            }
            if (eVar.g != 4 || eVar.e == null) {
                return;
            }
            b bVar2 = (b) sVar;
            bVar2.c.setPadding(0, 0, 0, g.a(MultiPersonDetailDialog.this.getContext(), 15.0f));
            if (TextUtils.isEmpty(eVar.e.a) || TextUtils.isEmpty(eVar.e.a)) {
                return;
            }
            bVar2.a.setText(eVar.e.a);
            bVar2.b.setText(eVar.e.b);
            bVar2.b.setTextColor(MultiPersonDetailDialog.this.getContext().getResources().getColor(R.color.wm_smart_assistant_discount_text_red));
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632d9fb2bc25dab145efb3572c307c01", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632d9fb2bc25dab145efb3572c307c01")).intValue() : this.b.get(i).g;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23932445843c8003db8ef402cc43817a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23932445843c8003db8ef402cc43817a")).intValue() : this.b.size();
        }
    }
}
