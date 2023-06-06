package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.poi.block.e;
import com.sankuai.waimai.store.im.poi.model.SGIMGoodsListData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.im.base.b<SGIMGoodsListData> {
    public static ChangeQuickRedirect g;
    public String h;

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sc_common_im_good_list;
    }

    @Override // com.sankuai.waimai.store.im.base.b
    public final /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable SGIMGoodsListData sGIMGoodsListData) {
        a2(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, sGIMGoodsListData);
    }

    @Override // com.sankuai.waimai.store.im.base.b, com.sankuai.waimai.store.im.base.c
    public final /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable Object obj) {
        a2(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, (SGIMGoodsListData) obj);
    }

    public f(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, long j, String str) {
        super(aVar, bundle, j);
        int i = 0;
        Object[] objArr = {aVar, bundle, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3913967d9786628fee8f1fdf8e8bd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3913967d9786628fee8f1fdf8e8bd7");
            return;
        }
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.util.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7ce8edbed2ac2df773efba9d2f8b0147", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7ce8edbed2ac2df773efba9d2f8b0147")).intValue();
        } else if (bundle != null) {
            i = bundle.getInt("buz_type", 0);
        }
        this.f = i;
        this.h = str;
    }

    @Override // com.sankuai.waimai.store.im.base.c, com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50fea7c17d7bbb1dc2d4f77f9d1081f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50fea7c17d7bbb1dc2d4f77f9d1081f");
        }
        View a = super.a(context, bVar, viewGroup);
        com.sankuai.waimai.store.im.poi.block.a aVar = new com.sankuai.waimai.store.im.poi.block.a(context, this.h, this.d);
        aVar.bindView(a.findViewById(R.id.ll_common_im_good_list));
        aVar.a(this.f);
        a.setTag(aVar);
        return a;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(View view, @NonNull final com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable final SGIMGoodsListData sGIMGoodsListData) {
        Object[] objArr = {view, bVar, sGIMGoodsListData};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1414114f386769ede80b748e3c02860e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1414114f386769ede80b748e3c02860e");
            return;
        }
        super.a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGIMGoodsListData);
        if (!(view.getTag() instanceof com.sankuai.waimai.store.im.poi.block.a) || sGIMGoodsListData == null) {
            return;
        }
        final com.sankuai.waimai.store.im.poi.block.a aVar = (com.sankuai.waimai.store.im.poi.block.a) view.getTag();
        GeneralMessage generalMessage = bVar.b;
        sGIMGoodsListData.msgId = String.valueOf(generalMessage.getMsgId());
        sGIMGoodsListData.mPoiId = this.b;
        if (aVar == null || sGIMGoodsListData.mProductInfo == null) {
            return;
        }
        u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.provider.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83f33e9dac8847297546cd6c461ad33e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83f33e9dac8847297546cd6c461ad33e");
                    return;
                }
                sGIMGoodsListData.isShowMore = true;
                f.this.a(bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGIMGoodsListData);
                aVar.a(sGIMGoodsListData);
            }
        }, aVar.j);
        aVar.a(new e.a() { // from class: com.sankuai.waimai.store.im.poi.provider.f.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.poi.block.e.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d133569fac2e764cc2cb26df070bdc6a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d133569fac2e764cc2cb26df070bdc6a");
                } else if (sGIMGoodsListData != null) {
                    sGIMGoodsListData.robotPraiseOperation = i;
                    f.this.a(bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGIMGoodsListData);
                    aVar.a(sGIMGoodsListData);
                }
            }
        });
        aVar.a(sGIMGoodsListData, com.sankuai.waimai.store.im.util.b.a(generalMessage.getExtension()));
    }
}
