package com.sankuai.waimai.store.search.template.waterfallspu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<f, b> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ b a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb4e5a86f06ca83ab08e1dbeca3428a2", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb4e5a86f06ca83ab08e1dbeca3428a2") : new b(layoutInflater.inflate(R.layout.wm_sc_nox_search_feed_spu_waterfall, viewGroup, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0307  */
    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(@android.support.annotation.NonNull com.sankuai.waimai.store.search.model.f r19, @android.support.annotation.NonNull com.sankuai.waimai.store.search.template.waterfallspu.b r20, int r21) {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.template.waterfallspu.a.a(java.lang.Object, android.support.v7.widget.RecyclerView$s, int):void");
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull f fVar, @NonNull com.sankuai.waimai.store.search.statistics.f fVar2) {
        f fVar3 = fVar;
        Object[] objArr = {fVar3, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ba24f6903248ff3c067c988ba514dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ba24f6903248ff3c067c988ba514dc");
            return;
        }
        super.a((a) fVar3, fVar2);
        if (fVar3.productInfoItem == null || fVar3.productInfoItem.Q == null) {
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) fVar3.productInfoItem.Q.recommendSpus);
        for (int i = 0; i < a2; i++) {
            BaseProductPoi.RecommendSpu recommendSpu = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) fVar3.productInfoItem.Q.recommendSpus, i);
            if (recommendSpu != null) {
                com.sankuai.waimai.store.search.statistics.f a3 = recommendSpu.nodeForRcmdSpu.a();
                a3.b = fVar2;
                a3.c = "b_waimai_ah5gjqtz_mv";
                a3.d = "b_waimai_ah5gjqtz_mc";
                a3.a("search_log_id", this.l.b(fVar3)).a("index", Integer.valueOf(fVar3.getStatisticsIndex())).a("spu_id", Long.valueOf(fVar3.productInfoItem.c)).a("item_spu_id", Long.valueOf(recommendSpu.spuId)).a(DataConstants.INDEX, Integer.valueOf(i)).a("spu_recommend_type", Integer.valueOf(fVar3.productInfoItem.Q.recommendSpuTitle == null ? -999 : fVar3.productInfoItem.Q.recommendSpuTitle.type));
            }
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab511798fa23eb2f1ba3e3f0f871cde0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab511798fa23eb2f1ba3e3f0f871cde0");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557020476b037833e5191ad33f60d714", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557020476b037833e5191ad33f60d714")).booleanValue() : str.equals("sg_search_cascade_product_template");
    }
}
