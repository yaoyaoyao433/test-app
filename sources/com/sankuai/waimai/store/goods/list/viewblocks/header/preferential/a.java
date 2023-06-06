package com.sankuai.waimai.store.goods.list.viewblocks.header.preferential;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextPaint;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.labelview.LabelView;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.newwidgets.flowlayout.a<Poi.LabelInfoListItem, d> {
    public static ChangeQuickRedirect a;

    public a(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e733aef73e114b926f453b8a7adfb33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e733aef73e114b926f453b8a7adfb33");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5a2026df65b5a0a543f931b614dcdf", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5a2026df65b5a0a543f931b614dcdf") : new C1195a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1195a extends g<Poi.LabelInfoListItem, d> {
        public static ChangeQuickRedirect a;
        private LabelView b;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_shop_header_preferential_activity;
        }

        public C1195a() {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(Poi.LabelInfoListItem labelInfoListItem, int i) {
            Poi.LabelInfoListItem labelInfoListItem2 = labelInfoListItem;
            Object[] objArr = {labelInfoListItem2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0dc3e7e5cc13f2b0ed92b831918cac9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0dc3e7e5cc13f2b0ed92b831918cac9");
            } else if (labelInfoListItem2 == null) {
            } else {
                try {
                    String str = labelInfoListItem2.content;
                    int a2 = com.sankuai.shangou.stone.util.d.a(labelInfoListItem2.contentColor, -307644);
                    int a3 = com.sankuai.shangou.stone.util.d.a(labelInfoListItem2.labelFrameColor, 1526419012);
                    int a4 = com.sankuai.shangou.stone.util.d.a(labelInfoListItem2.labelBackgroundColor, 0);
                    this.b.setText(str);
                    this.b.a(a2, null, null, null);
                    this.b.getBorderColors().a(a3, null, null, null);
                    this.b.getSolidColors().a(a4, null, null, null);
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c386435909409291ca3106888a5ab1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c386435909409291ca3106888a5ab1");
                return;
            }
            this.b = (LabelView) view;
            TextPaint paint = this.b.getPaint();
            if (this.o != 0) {
                paint.setFakeBoldText(false);
            }
        }
    }
}
