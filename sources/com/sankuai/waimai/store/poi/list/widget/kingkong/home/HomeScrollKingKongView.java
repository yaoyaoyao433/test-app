package com.sankuai.waimai.store.poi.list.widget.kingkong.home;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.newwidgets.NoScrollGridView;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HomeScrollKingKongView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    @NonNull
    private GridView f;
    @NonNull
    private a g;
    private int h;
    private int i;
    private int j;
    private com.sankuai.waimai.store.poi.list.widget.kingkong.home.a k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return -1;
    }

    public HomeScrollKingKongView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d4456fdbcf65e30e2ab65fcf843d92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d4456fdbcf65e30e2ab65fcf843d92");
        }
    }

    public HomeScrollKingKongView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407165a44dcae924f4b8466a99801f79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407165a44dcae924f4b8466a99801f79");
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec89bbd946db9bf330d836ec66554695", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec89bbd946db9bf330d836ec66554695");
        }
        this.h = h.a(getContext(), 44.0f);
        this.j = R.layout.wm_sg_poi_list_king_kong_item_view;
        this.f = new NoScrollGridView(getContext());
        this.f.setNumColumns(5);
        this.f.setVerticalSpacing(h.a(getContext(), 12.0f));
        this.g = new a();
        this.f.setAdapter((ListAdapter) this.g);
        addView(this.f);
        return this.f;
    }

    public void setVerticalSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd70cb3aa4dd80f122bb4ab7af02839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd70cb3aa4dd80f122bb4ab7af02839");
        } else {
            this.f.setVerticalSpacing(h.a(getContext(), i));
        }
    }

    public void setIconSize(int i) {
        this.h = i;
    }

    public void setItemLayoutId(int i) {
        this.j = i;
    }

    public void setItemWidth(int i) {
        this.i = i;
    }

    public void setKingKongColumns(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730101bf8fd1c82db1fe32766979b71e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730101bf8fd1c82db1fe32766979b71e");
        } else {
            this.f.setNumColumns(i);
        }
    }

    public void setData(@Nullable List<PrimaryFilterCondList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82fb8d082083e08342d62876bc772272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82fb8d082083e08342d62876bc772272");
        } else {
            a(list, 0);
        }
    }

    public final void a(@Nullable List<PrimaryFilterCondList> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91799171bfe7b8931d048d5423f14bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91799171bfe7b8931d048d5423f14bf");
            return;
        }
        this.l = i;
        u.a(this);
        this.g.a(list);
        this.f.forceLayout();
    }

    @NonNull
    public View getInnerDataView() {
        return this.f;
    }

    public void setKingKongEventListener(com.sankuai.waimai.store.poi.list.widget.kingkong.home.a aVar) {
        this.k = aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c {
        public static ChangeQuickRedirect a;
        public View b;
        public ImageView c;
        public TextView d;
        public ImageView e;
        public TextView f;
        public com.sankuai.waimai.store.expose.v2.entity.b g;
        int h;
        int i;
        b j;

        public c(@NonNull View view, b bVar, com.sankuai.waimai.store.poi.list.widget.kingkong.home.a aVar, int i, int i2) {
            Object[] objArr = {view, bVar, aVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27879ebd380b7f2761eca75645e3a34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27879ebd380b7f2761eca75645e3a34");
                return;
            }
            this.h = 0;
            this.j = bVar;
            this.c = (ImageView) view.findViewById(R.id.iv_icon);
            this.f = (TextView) view.findViewById(R.id.tv_name);
            this.d = (TextView) view.findViewById(R.id.bubble_txt);
            this.e = (ImageView) view.findViewById(R.id.bubble_img);
            this.b = view;
            this.h = i;
            this.i = i2;
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams != null && layoutParams.width != i) {
                layoutParams.width = i;
                layoutParams.height = i;
                this.c.setLayoutParams(layoutParams);
            }
            if (aVar != null) {
                this.g = aVar.a(view);
            }
        }

        void a(PrimaryFilterCondList primaryFilterCondList, boolean z) {
            Object[] objArr = {primaryFilterCondList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07087edce68d2e3922d2b9435c89f64e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07087edce68d2e3922d2b9435c89f64e");
            } else if (this.d == null || this.e == null) {
            } else {
                if (primaryFilterCondList == null || primaryFilterCondList.bubble == null || !z) {
                    this.d.setVisibility(8);
                    this.e.setVisibility(8);
                } else if (TextUtils.isEmpty(primaryFilterCondList.bubble.content)) {
                    this.d.setVisibility(8);
                    this.e.setVisibility(8);
                } else if (primaryFilterCondList.bubble.type == 1) {
                    this.d.setVisibility(8);
                    b.C0608b b = m.b(primaryFilterCondList.bubble.content, h.a(this.d.getContext(), 22.0f), ImageQualityUtil.a());
                    b.b = this.d.getContext();
                    b.a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.widget.kingkong.home.HomeScrollKingKongView.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb857092040f7552833f7632040dd334", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb857092040f7552833f7632040dd334");
                            } else {
                                c.this.e.setVisibility(0);
                            }
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a(int i, Exception exc) {
                            Object[] objArr2 = {Integer.valueOf(i), exc};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "614d763b95032d25993bb6e0ef574346", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "614d763b95032d25993bb6e0ef574346");
                            } else {
                                c.this.e.setVisibility(8);
                            }
                        }
                    }).a(this.e);
                } else {
                    this.e.setVisibility(8);
                    this.d.setText(primaryFilterCondList.bubble.content);
                    GradientDrawable gradientDrawable = (GradientDrawable) this.d.getBackground();
                    if (!TextUtils.isEmpty(primaryFilterCondList.bubble.color)) {
                        try {
                            this.d.setTextColor(ColorUtils.a(primaryFilterCondList.bubble.color, -16777216));
                        } catch (Exception e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                    if (!TextUtils.isEmpty(primaryFilterCondList.bubble.bgColor)) {
                        try {
                            gradientDrawable.setColor(ColorUtils.a(primaryFilterCondList.bubble.bgColor, 0));
                        } catch (Exception e2) {
                            com.sankuai.shangou.stone.util.log.a.a(e2);
                        }
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    this.d.measure(makeMeasureSpec, makeMeasureSpec);
                    this.d.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends BaseAdapter implements b {
        public static ChangeQuickRedirect a;
        private final List<PrimaryFilterCondList> c;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        private a() {
            Object[] objArr = {HomeScrollKingKongView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0994d0e6346524517c5fce12158e41fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0994d0e6346524517c5fce12158e41fe");
            } else {
                this.c = new ArrayList();
            }
        }

        public final void a(List<PrimaryFilterCondList> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7937cdb853d19ab12165314769593dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7937cdb853d19ab12165314769593dd");
                return;
            }
            this.c.clear();
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                this.c.addAll(list);
            }
            notifyDataSetChanged();
        }

        @Override // com.sankuai.waimai.store.poi.list.widget.kingkong.home.HomeScrollKingKongView.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569de7801900d8b4059843fbb775842f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569de7801900d8b4059843fbb775842f");
            } else {
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d6185dadabf1a04d5f773d1e2bb510", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d6185dadabf1a04d5f773d1e2bb510")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.c);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec5cc408ad2062c3fd9bb42311eff16", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec5cc408ad2062c3fd9bb42311eff16") : com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        }

        @Override // android.widget.Adapter
        public final View getView(final int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cd0071ba1e93969c647ecea7a816ee9", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cd0071ba1e93969c647ecea7a816ee9");
            }
            View a2 = z.a(HomeScrollKingKongView.this.getContext(), HomeScrollKingKongView.this.j, viewGroup, false);
            final c cVar = new c(a2, this, HomeScrollKingKongView.this.k, HomeScrollKingKongView.this.h, HomeScrollKingKongView.this.l);
            if (HomeScrollKingKongView.this.i > 0) {
                a2.setMinimumWidth(HomeScrollKingKongView.this.i);
            }
            List<PrimaryFilterCondList> list = this.c;
            final com.sankuai.waimai.store.poi.list.widget.kingkong.home.a aVar = HomeScrollKingKongView.this.k;
            Object[] objArr2 = {Integer.valueOf(i), list, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "7a7a7639722af48c8307e5e2addcdb0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "7a7a7639722af48c8307e5e2addcdb0b");
            } else {
                final PrimaryFilterCondList primaryFilterCondList = (PrimaryFilterCondList) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (primaryFilterCondList != null) {
                    b.C0608b c = m.c(primaryFilterCondList.getIconUrl(), cVar.h);
                    c.g = false;
                    c.l = true;
                    c.f = ImageQualityUtil.a();
                    c.j = R.drawable.wm_st_common_kingkong_default_icon;
                    c.i = R.drawable.wm_st_common_kingkong_default_icon;
                    c.a(cVar.c);
                    cVar.f.setText(primaryFilterCondList.name);
                    cVar.a(primaryFilterCondList, com.sankuai.waimai.store.poi.list.newp.bubble.a.a(list, i));
                    cVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.widget.kingkong.home.HomeScrollKingKongView.c.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object[] objArr3 = {view2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56b01ea5963f3de0b794a73dbee0c224", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56b01ea5963f3de0b794a73dbee0c224");
                                return;
                            }
                            if (aVar != null) {
                                aVar.a(primaryFilterCondList.code, i + c.this.i, primaryFilterCondList.graySwitch);
                            }
                            com.sankuai.waimai.store.poi.list.newp.bubble.a.a(primaryFilterCondList.bubble);
                            if (primaryFilterCondList.graySwitch == 1) {
                                if (System.currentTimeMillis() - primaryFilterCondList.lastClicked > 1000) {
                                    am.a(c.this.b.getContext(), !TextUtils.isEmpty(primaryFilterCondList.kingkongToast) ? primaryFilterCondList.kingkongToast : c.this.b.getContext().getResources().getString(R.string.wm_sg_empty_products));
                                    primaryFilterCondList.lastClicked = System.currentTimeMillis();
                                }
                            } else if (!TextUtils.isEmpty(primaryFilterCondList.skipProtocol)) {
                                Bundle bundle = new Bundle();
                                bundle.putString("pageSource", "sg_homepage");
                                d.a().a(bundle).a(view2.getContext(), primaryFilterCondList.skipProtocol);
                            }
                            if (c.this.j != null) {
                                c.this.j.a();
                            }
                        }
                    });
                    if (aVar != null) {
                        aVar.a(cVar.g, primaryFilterCondList.code, i + cVar.i, primaryFilterCondList.graySwitch);
                    }
                }
            }
            return a2;
        }
    }
}
