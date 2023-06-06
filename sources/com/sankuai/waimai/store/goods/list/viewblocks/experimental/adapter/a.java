package com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.newwidgets.list.c<RestMenuResponse.NavigateItem, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> {
    public static ChangeQuickRedirect a;
    private int b;
    private int e;
    private int f;
    private int g;

    public a(com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar, List<RestMenuResponse.NavigateItem> list, int i, int i2, int i3) {
        super(aVar);
        Object[] objArr = {aVar, list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86857e1b6e2b04e24430993b2976f3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86857e1b6e2b04e24430993b2976f3d");
            return;
        }
        a(list);
        this.b = i;
        this.e = i2;
        this.f = i3;
        this.g = h.a((Context) aVar.j());
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e159139c536029d53e2e909d326df7", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e159139c536029d53e2e909d326df7") : new C1193a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1193a extends g<RestMenuResponse.NavigateItem, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> {
        public static ChangeQuickRedirect a;
        private com.sankuai.waimai.store.expose.v2.entity.b c;
        private ImageView d;
        private TextView e;
        private RelativeLayout f;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_head_extensible_category_item;
        }

        private C1193a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5a0e0d3ce399302b70d52f36b70ebe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5a0e0d3ce399302b70d52f36b70ebe");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(RestMenuResponse.NavigateItem navigateItem, final int i) {
            final RestMenuResponse.NavigateItem navigateItem2 = navigateItem;
            Object[] objArr = {navigateItem2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30482e65523fc879844ad45b7040138f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30482e65523fc879844ad45b7040138f");
            } else if (p.a(navigateItem2)) {
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = this.c;
                bVar.e = navigateItem2.id + "Kong";
                bVar.a("poi_id", ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).i().d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf((a.this.e * a.this.b) + i)).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem2.id)).a("category_name", navigateItem2.name);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5090c69ded72118f805764174d04b453", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5090c69ded72118f805764174d04b453");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) C1193a.this.o).k(), "b_kkcpfwk6").a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) C1193a.this.o).j()).a("poi_id", ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) C1193a.this.o).i().d()).a("index", Integer.valueOf((a.this.e * a.this.b) + i)).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("category_name", navigateItem2.name).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem2.id)).a();
                        ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) C1193a.this.o).a(navigateItem2);
                    }
                });
                this.e.setText(navigateItem2.name);
                b.C0608b b = m.b(navigateItem2.icon, ImageQualityUtil.a());
                b.b = ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j();
                b.a(this.d);
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0327bd5f28ea39e31a0c6f70f64b63ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0327bd5f28ea39e31a0c6f70f64b63ff");
                    return;
                }
                int dimensionPixelSize = this.f.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                int dimensionPixelSize2 = this.f.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50);
                int i2 = ((a.this.g - (a.this.f * dimensionPixelSize2)) - (dimensionPixelSize * 2)) / (a.this.f - 1);
                int i3 = ((a.this.g / a.this.f) - dimensionPixelSize) - dimensionPixelSize2;
                int i4 = i2 - i3;
                int i5 = i2 / 2;
                if (a.this.f != 4) {
                    if (a.this.f == 5) {
                        switch (i % 5) {
                            case 0:
                                this.f.setPadding(dimensionPixelSize, 0, i3, 0);
                                return;
                            case 1:
                                this.f.setPadding(i4, 0, i5, 0);
                                return;
                            case 2:
                                this.f.setPadding(0, 0, 0, 0);
                                break;
                            case 3:
                                this.f.setPadding(i5, 0, i4, 0);
                                return;
                            case 4:
                                this.f.setPadding(i3, 0, dimensionPixelSize, 0);
                                return;
                            default:
                                this.f.setPadding(0, 0, 0, 0);
                                return;
                        }
                    }
                    this.f.setGravity(1);
                    return;
                }
                switch (i % 4) {
                    case 0:
                        this.f.setPadding(dimensionPixelSize, 0, i3, 0);
                        return;
                    case 1:
                        this.f.setPadding(i4, 0, i5, 0);
                        return;
                    case 2:
                        this.f.setPadding(i5, 0, i4, 0);
                        return;
                    case 3:
                        this.f.setPadding(i3, 0, dimensionPixelSize, 0);
                        return;
                    default:
                        this.f.setPadding(0, 0, 0, 0);
                        return;
                }
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4c654604124d4eb9aeca0692eb2378", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4c654604124d4eb9aeca0692eb2378");
                return;
            }
            this.d = (ImageView) view.findViewById(R.id.img_item);
            this.e = (TextView) view.findViewById(R.id.txt_item);
            this.f = (RelativeLayout) view.findViewById(R.id.layout_item);
            this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_9eiu2q6p", view);
            com.sankuai.waimai.store.expose.v2.b.a().a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), this.c);
        }
    }
}
