package com.sankuai.waimai.business.search.ui.result.food;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.ProductPoi;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.recycler.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public c b;
    private SearchShareData c;

    public a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef3e4df6390b26c1a770893df7bb42c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef3e4df6390b26c1a770893df7bb42c");
        } else {
            this.c = searchShareData;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    @Override // com.sankuai.waimai.mach.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r36, java.lang.String r37, int r38, java.util.Map<java.lang.String, java.lang.Object> r39, com.sankuai.waimai.mach.node.a r40) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.ui.result.food.a.a(java.lang.String, java.lang.String, int, java.util.Map, com.sankuai.waimai.mach.node.a):void");
    }

    private void a(SearchShareData searchShareData, ProductPoi productPoi, Map<String, Object> map) {
        String[] split;
        Object[] objArr = {searchShareData, productPoi, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b41402a5a1f00914fcad719dd09f5ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b41402a5a1f00914fcad719dd09f5ba");
            return;
        }
        map.put("cat_id", Integer.valueOf(searchShareData.w));
        if (productPoi.productPoiExtraInfo == null || TextUtils.isEmpty(productPoi.productPoiExtraInfo.f)) {
            return;
        }
        for (String str : productPoi.productPoiExtraInfo.f.split(";")) {
            if (!TextUtils.isEmpty(str) && str.contains(CommonConstant.Symbol.COLON)) {
                String[] split2 = str.split(CommonConstant.Symbol.COLON);
                if (split2.length >= 2 && !TextUtils.isEmpty(split2[0])) {
                    map.put(split2[0], split2[1]);
                }
            }
        }
    }
}
