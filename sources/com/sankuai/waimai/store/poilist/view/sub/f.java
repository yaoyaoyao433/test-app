package com.sankuai.waimai.store.poilist.view.sub;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.repository.model.PoiRecommend;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    protected d b;
    protected c c;
    protected com.sankuai.waimai.store.base.statistic.a d;
    private ViewGroup e;
    private ViewGroup f;
    private int g;

    public f(com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3732fd85369eb5bef66e3284ed207c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3732fd85369eb5bef66e3284ed207c7");
            return;
        }
        this.g = -1;
        this.d = aVar;
    }

    public final void a(PoiRecommend poiRecommend, View view, Context context) {
        ViewGroup viewGroup;
        a aVar;
        Object[] objArr = {poiRecommend, view, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66be6a1584fd75d086db250554cc5196", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66be6a1584fd75d086db250554cc5196");
        } else if (poiRecommend == null) {
            if (this.e != null) {
                this.e.setVisibility(8);
            }
            if (this.f != null) {
                this.f.setVisibility(8);
            }
        } else {
            if (poiRecommend.type == 4) {
                if (this.e != null) {
                    this.e.setVisibility(8);
                }
                if (this.f == null) {
                    this.f = (ViewGroup) view.findViewById(R.id.fl_poi_recommend_vertical_container);
                }
                viewGroup = this.f;
                if (this.b == null) {
                    this.b = new d(context);
                    this.b.a(this.d);
                }
                aVar = this.b;
            } else {
                if (this.f != null) {
                    this.f.setVisibility(8);
                }
                if (this.e == null) {
                    this.e = (ViewGroup) view.findViewById(R.id.fl_poi_recommend_container);
                }
                viewGroup = this.e;
                if (this.c == null) {
                    this.c = new c(context);
                    this.c.a(this.d);
                }
                aVar = this.c;
            }
            if (aVar == null || viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
            if (this.g != poiRecommend.type) {
                aVar.createAndReplaceView(viewGroup);
                this.g = poiRecommend.type;
            }
            this.g = poiRecommend.type;
            Object[] objArr2 = {poiRecommend};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "17a4c8e782024e2f9f436346e52bd792", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "17a4c8e782024e2f9f436346e52bd792");
            } else if (poiRecommend == null || com.sankuai.shangou.stone.util.a.b(poiRecommend.poiList)) {
                u.c(aVar.getView());
            } else {
                u.a(aVar.getView());
                if (TextUtils.isEmpty(poiRecommend.title)) {
                    u.c(aVar.b);
                } else {
                    u.a(aVar.b);
                    aVar.b.setText(poiRecommend.title);
                }
                aVar.a(poiRecommend);
            }
        }
    }
}
