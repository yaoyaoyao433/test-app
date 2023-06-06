package com.sankuai.waimai.platform.widget.filterbar.implement.converter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.BubbleInfoBean;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.FilterConditionBean;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.b;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public final h a(b bVar) {
        h.a aVar;
        int i = 1;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093a2d4ed3ef9d1d758d8926db6c5101", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093a2d4ed3ef9d1d758d8926db6c5101");
        }
        if (bVar == null) {
            return null;
        }
        h hVar = new h();
        hVar.a = new ArrayList<>();
        hVar.b = new ArrayList<>();
        if (bVar.b != null) {
            Iterator<b.a> it = bVar.b.iterator();
            while (it.hasNext()) {
                b.a next = it.next();
                Object[] objArr2 = new Object[i];
                objArr2[0] = next;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f21e202b15a7c41bdcc10d1ae9e90169", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (h.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f21e202b15a7c41bdcc10d1ae9e90169");
                } else if (next == null) {
                    aVar = null;
                } else {
                    aVar = new h.a();
                    aVar.a = next.b;
                    aVar.b = next.c;
                    aVar.c = next.d;
                    aVar.g = next.h;
                    aVar.d = next.e;
                    aVar.e = next.f;
                    aVar.f = next.g;
                    aVar.h = a(next.i);
                    aVar.i = next.j;
                    aVar.k = next.k;
                    aVar.l = next.l;
                }
                if (aVar != null) {
                    switch (aVar.g) {
                        case 0:
                            hVar.a.add(aVar);
                            continue;
                        case 1:
                            hVar.b.add(aVar);
                            continue;
                    }
                }
                i = 1;
            }
        }
        return hVar;
    }

    private b.a.C1086a a(FilterConditionBean.FilterGroup.FilterItem filterItem) {
        Object[] objArr = {filterItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f07e78e0da037acfd9abf8646b58094", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a.C1086a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f07e78e0da037acfd9abf8646b58094");
        }
        if (filterItem == null) {
            return null;
        }
        b.a.C1086a c1086a = new b.a.C1086a();
        c1086a.a = filterItem.code == null ? "" : filterItem.code;
        c1086a.b = filterItem.name == null ? "" : filterItem.name;
        c1086a.c = filterItem.url;
        c1086a.d = filterItem.remarks;
        c1086a.e = filterItem.backgroundUrl;
        c1086a.h = filterItem.extra;
        if (filterItem.extraMap != null) {
            c1086a.i = new b.a.C1086a.C1087a();
            c1086a.i.a = filterItem.extraMap.activated;
        }
        c1086a.f = new b.a.C1086a.C1088b();
        if (filterItem.sliderConfigInfo != null) {
            c1086a.f.a = filterItem.sliderConfigInfo.startIndex;
            c1086a.f.b = filterItem.sliderConfigInfo.endIndex;
            c1086a.f.c = filterItem.sliderConfigInfo.minUnit;
            c1086a.f.e = new ArrayList<>();
            if (filterItem.sliderConfigInfo.pointList != null) {
                Iterator<FilterConditionBean.FilterGroup.FilterItem.SliderConfigInfo.Point> it = filterItem.sliderConfigInfo.pointList.iterator();
                while (it.hasNext()) {
                    FilterConditionBean.FilterGroup.FilterItem.SliderConfigInfo.Point next = it.next();
                    if (next != null) {
                        b.a.C1086a.C1088b.C1089a c1089a = new b.a.C1086a.C1088b.C1089a();
                        c1089a.a = next.x;
                        c1089a.b = next.y;
                        c1086a.f.e.add(c1089a);
                    }
                }
            }
            c1086a.f.d = new b.a.C1086a.C1088b.C1090b();
            if (filterItem.sliderConfigInfo.unitInfo != null) {
                c1086a.f.d.a = filterItem.sliderConfigInfo.unitInfo.name;
                c1086a.f.d.b = filterItem.sliderConfigInfo.unitInfo.pos;
            }
        }
        if (filterItem.bubbleInfo != null) {
            c1086a.g = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(filterItem.bubbleInfo.isShow, filterItem.bubbleInfo.version);
        } else {
            c1086a.g = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a();
        }
        return c1086a;
    }

    public final b.a a(FilterConditionBean.FilterGroup filterGroup) {
        Object[] objArr = {filterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2438a9d16eac24379aaf16eb1b7cee90", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2438a9d16eac24379aaf16eb1b7cee90");
        }
        if (filterGroup == null) {
            return null;
        }
        b.a aVar = new b.a();
        aVar.a = filterGroup.groupTitle;
        aVar.d = filterGroup.displayStyle;
        aVar.b = filterGroup.supportMultiChoice == 1;
        aVar.c = new ArrayList();
        if (filterGroup.favourItems != null) {
            Iterator<FilterConditionBean.FilterGroup.FilterItem> it = filterGroup.favourItems.iterator();
            while (it.hasNext()) {
                b.a.C1086a a2 = a(it.next());
                if (a2 != null) {
                    aVar.c.add(a2);
                }
            }
        }
        return aVar;
    }

    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.b a(FilterConditionBean filterConditionBean) {
        Object[] objArr = {filterConditionBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26ce0122b38f1ec63cf8cfa84df5c968", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26ce0122b38f1ec63cf8cfa84df5c968");
        }
        if (filterConditionBean == null) {
            return null;
        }
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.b();
        bVar.b = new ArrayList<>();
        if (filterConditionBean.filterList != null) {
            Iterator<FilterConditionBean.FilterGroup> it = filterConditionBean.filterList.iterator();
            while (it.hasNext()) {
                b.a a2 = a(it.next());
                if (a2 != null) {
                    bVar.b.add(a2);
                }
            }
        }
        bVar.c = new ArrayList<>();
        if (filterConditionBean.secondFilterList != null) {
            Iterator<FilterConditionBean.FilterGroup> it2 = filterConditionBean.secondFilterList.iterator();
            while (it2.hasNext()) {
                b.a a3 = a(it2.next());
                if (a3 != null) {
                    bVar.c.add(a3);
                }
            }
        }
        if (filterConditionBean.labelExtraInfo != null && !TextUtils.isEmpty(filterConditionBean.labelExtraInfo.wmHomeV717LabelExp)) {
            bVar.d = new b.C1091b();
            bVar.d.a = filterConditionBean.labelExtraInfo.wmHomeV717LabelExp;
        }
        return bVar;
    }

    private com.sankuai.waimai.platform.widget.filterbar.domain.model.a a(BubbleInfoBean bubbleInfoBean) {
        Object[] objArr = {bubbleInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff0ab8a28755e36e6846faef42e421d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff0ab8a28755e36e6846faef42e421d");
        }
        if (bubbleInfoBean == null) {
            return null;
        }
        return new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(bubbleInfoBean.isShow, bubbleInfoBean.version);
    }

    public final BubbleHistory a(com.sankuai.waimai.platform.widget.filterbar.implement.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f653f445f1b2e2babe712938189ce56", RobustBitConfig.DEFAULT_VALUE)) {
            return (BubbleHistory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f653f445f1b2e2babe712938189ce56");
        }
        if (aVar == null) {
            return null;
        }
        BubbleHistory bubbleHistory = new BubbleHistory();
        bubbleHistory.b = aVar.b;
        bubbleHistory.c = aVar.c;
        bubbleHistory.d = a(aVar.d);
        bubbleHistory.e = aVar.e;
        return bubbleHistory;
    }
}
