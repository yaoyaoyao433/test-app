package com.sankuai.waimai.store.poi.list.newp.block;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.CardScenes;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final b b;
    final int c;
    public final float d;
    CardScenes e;
    com.sankuai.waimai.store.param.a f;
    private final int g;
    private final int h;
    private ViewGroup.MarginLayoutParams i;
    private ViewGroup.MarginLayoutParams j;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236e8c4ef90b366a34eef3a9fc1e97de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236e8c4ef90b366a34eef3a9fc1e97de");
            return;
        }
        this.b = new b(null);
        this.g = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_8);
        this.h = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
        int a2 = h.a(getContext());
        this.d = (a2 - getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_41)) / 4.0f;
        this.c = (int) (this.d * 0.75f * 0.48f);
        this.j = new ViewGroup.MarginLayoutParams(-1, -2);
        ViewGroup.MarginLayoutParams marginLayoutParams = this.j;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = this.j;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
        marginLayoutParams2.rightMargin = dimensionPixelSize;
        marginLayoutParams.leftMargin = dimensionPixelSize;
        this.j.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_20);
        this.j.bottomMargin = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_11);
        this.i = new ViewGroup.MarginLayoutParams(a2 - getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_24), -1);
        this.i.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f7d63a13f072d9ed66a20d312bd310", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f7d63a13f072d9ed66a20d312bd310") : new FrameLayout(viewGroup.getContext());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417f9990a851c7cc4f02e1b66186eeb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417f9990a851c7cc4f02e1b66186eeb6");
        } else {
            super.onViewCreated();
        }
    }

    public final void a(CardScenes cardScenes, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {cardScenes, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207dc5467285548a4f726b144346ac2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207dc5467285548a4f726b144346ac2e");
            return;
        }
        this.e = cardScenes;
        this.f = aVar;
        if (cardScenes == null || cardScenes.scenes == null || cardScenes.scenes.size() < 4) {
            hide();
            return;
        }
        show();
        ((ViewGroup) this.mView).removeAllViews();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b.a(cardScenes.scenes);
        for (int i = 0; i < 4; i++) {
            View view = this.b.getView(i, null, (ViewGroup) this.mView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            if (i != 0) {
                layoutParams.leftMargin = this.h;
            } else {
                layoutParams.leftMargin = 0;
            }
            layoutParams.width = (int) this.d;
            layoutParams.height = (int) (this.d * 0.75d);
            view.setPadding(this.g, this.g, 0, 0);
            linearLayout.addView(view, layoutParams);
        }
        ((ViewGroup) this.mView).addView(linearLayout, this.j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends com.sankuai.waimai.store.newwidgets.list.a<CardScenes.CardScene, com.sankuai.waimai.store.newwidgets.list.b> {
        public static ChangeQuickRedirect c;

        public b(@NonNull com.sankuai.waimai.store.newwidgets.list.b bVar) {
            super(null);
            Object[] objArr = {a.this, null};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def9aec178bef9391cebe64df7a2ef5a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def9aec178bef9391cebe64df7a2ef5a");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.a
        @NonNull
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57fea40ee0982d73feddad9fe56fff9f", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57fea40ee0982d73feddad9fe56fff9f") : new C1270a(a.this.getContext());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.block.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1270a extends g<CardScenes.CardScene, com.sankuai.waimai.store.newwidgets.list.b> {
        public static ChangeQuickRedirect a;
        private ImageView c;
        private TextView d;
        private TextView e;
        private com.sankuai.waimai.store.expose.v2.entity.b f;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_spu_recommend_item;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(CardScenes.CardScene cardScene, final int i) {
            final CardScenes.CardScene cardScene2 = cardScene;
            Object[] objArr = {cardScene2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c3c32e8d847e57ebaaef9a4c6223526", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c3c32e8d847e57ebaaef9a4c6223526");
            } else if (cardScene2 == null) {
            } else {
                float a2 = h.a(a.this.getContext(), 12.0f);
                float a3 = h.a(a.this.getContext(), 4.0f);
                e.a c = new e.a().b(1).a(a.this.getContext().getResources().getColor(R.color.wm_sc_color_F0F0F0)).c(com.sankuai.waimai.store.util.b.b(a.this.getContext(), R.color.white));
                if (i == 0) {
                    c.a(a2, a3, a3, a2);
                } else if (i == a.this.b.getCount()) {
                    c.a(a3, a2, a2, a3);
                } else {
                    c.a(a3);
                }
                this.p.setBackground(c.a());
                this.d.setText(cardScene2.sceneTitle);
                this.e.setText(cardScene2.sceneSubTitle);
                this.c.getLayoutParams().width = ((int) a.this.d) / 2;
                this.c.getLayoutParams().height = a.this.c;
                b.C0608b b = m.b(cardScene2.sceneIcon, a.this.c, ImageQualityUtil.a());
                b.l = true;
                b.g = false;
                b.a(this.c);
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.block.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0895e8a10da1270da6b1cd375ee5466f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0895e8a10da1270da6b1cd375ee5466f");
                            return;
                        }
                        a aVar = a.this;
                        CardScenes.CardScene cardScene3 = cardScene2;
                        int i2 = i;
                        Object[] objArr3 = {cardScene3, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7f04ac389fa7926bc1daf26a54b9eebf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7f04ac389fa7926bc1daf26a54b9eebf");
                        } else if (aVar.e == null || t.a(aVar.e.sceneScheme)) {
                        } else {
                            String str = aVar.e.sceneScheme;
                            Bundle bundle = new Bundle();
                            bundle.putString("card_code", cardScene3.sceneCode);
                            d.a().a(bundle).a(aVar.getContext(), str);
                            if (aVar.e != null) {
                                com.sankuai.waimai.store.manager.judas.b.a(aVar.f.G, "b_waimai_cxi87xix_mc").a("scene_code", cardScene3.sceneCode).a(DataConstants.INDEX, Integer.valueOf(i2)).a();
                            }
                        }
                    }
                });
                this.f.a("scene_code", cardScene2.sceneCode).a(DataConstants.INDEX, Integer.valueOf(i));
            }
        }

        public C1270a(Context context) {
            Object[] objArr = {a.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65628460023d0f4034c1b6c54d36d8ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65628460023d0f4034c1b6c54d36d8ae");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cc622d6a439a6b943aa6cf793bea2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cc622d6a439a6b943aa6cf793bea2d");
                return;
            }
            this.c = (ImageView) view.findViewById(R.id.icon);
            this.d = (TextView) view.findViewById(R.id.title);
            this.e = (TextView) view.findViewById(R.id.content);
            this.f = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_cxi87xix_mv", view);
            if (view.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) view.getContext(), this.f);
            }
        }
    }
}
