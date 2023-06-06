package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.NoScrollGridView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j implements View.OnClickListener, AdapterView.OnItemClickListener, g {
    public static ChangeQuickRedirect a;
    private Context b;
    private final com.sankuai.waimai.sa.ui.assistant.a c;
    private ViewGroup d;
    private ViewGroup e;
    private ImageView f;
    private TextView g;
    private ViewGroup h;
    private TextView i;
    private TextView j;
    private TextView k;
    private ViewGroup l;
    private ImageView m;
    private TextView n;
    private NoScrollGridView o;
    private a p;
    private Button q;
    private com.sankuai.waimai.sa.model.b r;

    public static /* synthetic */ void a(j jVar, ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "7b029eb9f45fc21e093fb21f11a30f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "7b029eb9f45fc21e093fb21f11a30f33");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = jVar.b;
        a2.c = str;
        a2.i = R.drawable.wm_common_poi_circle_default_img;
        a2.j = R.drawable.wm_common_good_img_default;
        a2.e = 1;
        a2.a(imageView);
    }

    public j(Context context, com.sankuai.waimai.sa.ui.assistant.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3302ac7f61eec9ec46c1559c968cea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3302ac7f61eec9ec46c1559c968cea8");
            return;
        }
        this.b = context;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2dc0a071ea2679e709b52b56359fb89", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2dc0a071ea2679e709b52b56359fb89");
        }
        if (this.d == null) {
            this.d = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.wm_smart_assistant_tmpl_poi_and_food_item, viewGroup, false);
            this.e = (ViewGroup) this.d.findViewById(R.id.poi_header);
            this.f = (ImageView) this.d.findViewById(R.id.poi_pic);
            this.g = (TextView) this.d.findViewById(R.id.poi_name);
            this.h = (ViewGroup) this.d.findViewById(R.id.ll_tip_container);
            this.i = (TextView) this.d.findViewById(R.id.min_price_tip);
            this.j = (TextView) this.d.findViewById(R.id.shipping_fee_tip);
            this.k = (TextView) this.d.findViewById(R.id.shipping_distance_tip);
            this.l = (ViewGroup) this.d.findViewById(R.id.poi_discount_container);
            this.m = (ImageView) this.d.findViewById(R.id.poi_discount_label);
            this.n = (TextView) this.d.findViewById(R.id.poi_discount_desc);
            this.o = (NoScrollGridView) this.d.findViewById(R.id.poi_and_food_grid_view);
            this.q = (Button) this.d.findViewById(R.id.btn_enter_poi);
            this.e.setOnClickListener(this);
            this.p = new a();
            this.o.setAdapter((ListAdapter) this.p);
            this.o.setOnItemClickListener(this);
            this.q.setOnClickListener(this);
        }
        return this.d;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.sa.model.b r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.sa.ui.assistant.chat.j.a(com.sankuai.waimai.sa.model.b):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f8152b344ccec317dc546c6e8a9e03", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f8152b344ccec317dc546c6e8a9e03");
            return;
        }
        int id = view.getId();
        if (this.r == null || this.r.h == null) {
            return;
        }
        if (id == R.id.poi_header) {
            JudasManualManager.a("b_k3tagb6t").a("result_id", this.r.c).a("poi_id", this.r.h.a).a("index", 0).a("c_6tg6wz4r").a();
        } else if (id == R.id.btn_enter_poi) {
            JudasManualManager.a("b_i3js460h").a("result_id", this.r.c).a("poi_id", this.r.h.a).a("index", 0).a("c_6tg6wz4r").a();
        }
        this.c.a(this.r.h.a, this.r.h.b);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d0e067d2c6be05e4c447b0f424e4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d0e067d2c6be05e4c447b0f424e4c9");
        } else if (this.r == null || this.r.h == null || this.r.h.j == null || this.r.h.j.size() <= i) {
        } else {
            JudasManualManager.a("b_s3soe6d4").a("result_id", this.r.c).a("poi_id", this.r.h.a).a("index", 0).a("c_6tg6wz4r").a();
            this.c.a(this.r.h.a, this.r.h.b, this.r.h.j.get(i).a);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends BaseAdapter {
        public static ChangeQuickRedirect a;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public a() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87b31d4bbd7367524b1cb3d9764e489", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87b31d4bbd7367524b1cb3d9764e489")).intValue();
            }
            if (j.this.r == null || j.this.r.h == null || j.this.r.h.j == null) {
                return 0;
            }
            if (j.this.r.h.j.size() > 4) {
                return 4;
            }
            return j.this.r.h.j.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4522f043fd17a1d79174ad513493f846", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4522f043fd17a1d79174ad513493f846") : j.this.r.h.j.get(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255addfe47fe17e1432bfb447ff82f1c", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255addfe47fe17e1432bfb447ff82f1c");
            }
            if (view == null) {
                view = LayoutInflater.from(j.this.b).inflate(R.layout.wm_smart_assistant_tmpl_poi_and_food_sub_item, viewGroup, false);
            }
            com.sankuai.waimai.sa.model.inner.d dVar = j.this.r.h.j.get(i);
            j.a(j.this, (ImageView) view.findViewById(R.id.img_spu), dVar.e);
            ((TextView) view.findViewById(R.id.txt_spu_price)).setText(j.this.b.getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(dVar.c.doubleValue())));
            ((TextView) view.findViewById(R.id.txt_spu_name)).setText(dVar.b);
            return view;
        }
    }
}
