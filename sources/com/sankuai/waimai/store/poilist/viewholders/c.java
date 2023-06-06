package com.sankuai.waimai.store.poilist.viewholders;

import android.support.constraint.R;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.CardScenes;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.widgets.recycler.e {
    public static ChangeQuickRedirect a;
    LinearLayout b;
    com.sankuai.waimai.store.param.a c;
    private TextView d;
    private SparseArray<a> e;
    private com.sankuai.waimai.store.expose.v2.entity.b f;
    private StringBuilder g;

    public c(View view, com.sankuai.waimai.store.param.a aVar) {
        super(view);
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01fd9dcdb149c371080ecc98790a29f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01fd9dcdb149c371080ecc98790a29f3");
            return;
        }
        this.e = new SparseArray<>(4);
        this.g = new StringBuilder();
        this.c = aVar;
        this.d = (TextView) view.findViewById(R.id.spu_flower_cell_scene_title);
        this.b = (LinearLayout) view.findViewById(R.id.spu_flower_cell_scene_container);
        this.f = new com.sankuai.waimai.store.expose.v2.entity.b(aVar.G, "b_waimai_i8p6c45q_mv", view);
        if (view.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) view.getContext(), this.f);
        }
    }

    public final void a(final com.sankuai.waimai.store.repository.model.f fVar, final int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d00d267a85eebaf8122b1604332edb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d00d267a85eebaf8122b1604332edb7");
            return;
        }
        this.b.removeAllViews();
        if (fVar.h == null) {
            return;
        }
        this.d.setText(fVar.f);
        this.g.delete(0, this.g.length());
        for (int i2 = 0; i2 < 4; i2++) {
            final CardScenes.CardScene cardScene = fVar.h.get(i2);
            if (cardScene != null) {
                StringBuilder sb = this.g;
                sb.append(cardScene.sceneCode);
                sb.append(CommonConstant.Symbol.COMMA);
                a aVar = this.e.get(i2);
                if (aVar == null) {
                    aVar = new a(this.b);
                    this.e.put(i2, aVar);
                }
                aVar.b.setText(cardScene.sceneTitle);
                m.b(cardScene.sceneIcon).a(aVar.c);
                this.b.addView(aVar.a);
                final int i3 = i2;
                aVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poilist.viewholders.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9617f39bcf904b0fb9448415b98630d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9617f39bcf904b0fb9448415b98630d");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(c.this.c.G, "b_waimai_c3gegzya_mc").a("scene_code", cardScene.sceneCode).a(DataConstants.INDEX, Integer.valueOf(i)).a("index", Integer.valueOf(i3)).a();
                        com.sankuai.waimai.store.router.d.a(c.this.b.getContext(), fVar.g + "&card_code=" + cardScene.sceneCode);
                    }
                });
            }
        }
        this.g.deleteCharAt(this.g.length() - 1);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = this.f;
        bVar.e = "b_waimai_i8p6c45q_mv_" + i + CommonConstant.Symbol.UNDERLINE + fVar.hashCode();
        bVar.a("scene_codes", this.g.toString()).a(DataConstants.INDEX, Integer.valueOf(i));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public View a;
        public TextView b;
        public ImageView c;

        public a(ViewGroup viewGroup) {
            this.a = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_st_view_flower_scene, viewGroup, false);
            this.b = (TextView) this.a.findViewById(R.id.scene_title);
            this.c = (ImageView) this.a.findViewById(R.id.scene_img_right);
        }
    }
}
