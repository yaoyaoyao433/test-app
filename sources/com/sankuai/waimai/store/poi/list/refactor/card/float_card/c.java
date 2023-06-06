package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static a a(SCBaseActivity sCBaseActivity, ViewGroup viewGroup, com.sankuai.waimai.store.param.a aVar, BaseTile<PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d> baseTile) {
        Object[] objArr = {sCBaseActivity, viewGroup, aVar, baseTile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d8a9b7a4c684f9bcc2089a3ecfc7f94", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d8a9b7a4c684f9bcc2089a3ecfc7f94");
        }
        if (aVar == null || baseTile.data == null || com.sankuai.shangou.stone.util.a.b(baseTile.data.floatingList)) {
            return null;
        }
        try {
            View inflate = LayoutInflater.from(sCBaseActivity).inflate(R.layout.wm_sc_home_marketing_float_entrance, viewGroup, false);
            a aVar2 = new a(sCBaseActivity, aVar);
            aVar2.bindView(inflate);
            viewGroup.addView(inflate, new ViewGroup.LayoutParams(-2, -2));
            aVar2.a((PoiVerticalityDataResponse.FloatMarketingEntrance) ((PoiVerticalityDataResponse.FloatingEntranceItem) com.sankuai.shangou.stone.util.a.a((List<Object>) baseTile.data.floatingList, 0)).data);
            if (baseTile.layoutInfo != null) {
                a(aVar2.getView(), baseTile.layoutInfo.top, baseTile.layoutInfo.right, baseTile.layoutInfo.bottom, baseTile.layoutInfo.left);
            }
            return aVar2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "750f89f63f67d74d3ae03ecbeea29d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "750f89f63f67d74d3ae03ecbeea29d9c");
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = h.a(view.getContext(), i2);
                marginLayoutParams.topMargin = h.a(view.getContext(), i);
                marginLayoutParams.leftMargin = h.a(view.getContext(), i4);
                marginLayoutParams.bottomMargin = h.a(view.getContext(), i3);
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
