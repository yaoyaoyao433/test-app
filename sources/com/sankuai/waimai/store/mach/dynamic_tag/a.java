package com.sankuai.waimai.store.mach.dynamic_tag;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @Nullable
    public static List<c> a(Context context, List<PoiVerticality.NewCategoryLabel> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4998054a20d08f14b59294bee93b6c78", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4998054a20d08f14b59294bee93b6c78");
        }
        if (com.sankuai.shangou.stone.util.a.b(list) || context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            PoiVerticality.NewCategoryLabel newCategoryLabel = list.get(i);
            if (newCategoryLabel != null && com.sankuai.shangou.stone.util.a.a((List) newCategoryLabel.labelInfoList) > 0) {
                c d = c.d();
                d.n = true;
                d.h = i;
                d.i = 0L;
                d.g = 1;
                g.a e = g.a.e();
                int a2 = com.sankuai.shangou.stone.util.d.a(newCategoryLabel.labelBackgroundColor, -1);
                e.i = Integer.valueOf(a2);
                g.b e2 = g.b.e();
                e2.d = Integer.valueOf(com.sankuai.shangou.stone.util.d.a(newCategoryLabel.labelFrameColor, -16777216));
                e2.e = 1.0f;
                int a3 = h.a(context, 4.0f);
                float f = a3;
                e2.f = new float[]{f, f, f, f};
                d.e = g.a(e, e2, 0);
                d.k = new ArrayList();
                com.sankuai.waimai.platform.widget.tag.virtualview.render.h e3 = com.sankuai.waimai.platform.widget.tag.virtualview.render.h.e();
                e3.e = false;
                e3.f = newCategoryLabel.content;
                e3.d = h.a(context, 11.0f);
                e3.i = a3;
                e3.h = com.sankuai.shangou.stone.util.d.a(newCategoryLabel.contentColor, -16777216);
                com.sankuai.waimai.platform.widget.tag.model.g a4 = com.sankuai.waimai.platform.widget.tag.model.g.a(e3);
                a4.e = 0;
                a4.d = newCategoryLabel.categoryLabelType;
                g.a e4 = g.a.e();
                e4.i = Integer.valueOf(a2);
                e4.f();
                a4.n = g.a(e4, g.b.e(), 0);
                d.k.add(a4);
                arrayList.add(d);
                if (!com.sankuai.shangou.stone.util.a.b(newCategoryLabel.labelInfoList)) {
                    Iterator<Poi.NewLabelInfoListItem> it = newCategoryLabel.labelInfoList.iterator();
                    while (it.hasNext()) {
                        Poi.NewLabelInfoListItem next = it.next();
                        if (next != null) {
                            a(context, arrayList, next, d.h);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, List<c> list, Poi.NewLabelInfoListItem newLabelInfoListItem, int i) {
        com.sankuai.waimai.platform.widget.tag.api.e eVar;
        Object[] objArr = {context, list, newLabelInfoListItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "334246b55125b54540f0005028b60c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "334246b55125b54540f0005028b60c68");
            return;
        }
        c d = c.d();
        d.n = false;
        d.h = i;
        d.i = 0L;
        d.g = newLabelInfoListItem.priority;
        g.a e = g.a.e();
        if (com.sankuai.shangou.stone.util.a.c(newLabelInfoListItem.subTagBaseInfoList) <= 0 || (eVar = newLabelInfoListItem.subTagBaseInfoList.get(0)) == null) {
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.d.a(newLabelInfoListItem.backgroundColor, -1);
        e.i = Integer.valueOf(a2);
        g.b e2 = g.b.e();
        e2.d = Integer.valueOf(com.sankuai.shangou.stone.util.d.a(newLabelInfoListItem.borderColor, -16777216));
        e2.e = 1.0f;
        int a3 = h.a(context, 4.0f);
        if (!com.sankuai.shangou.stone.util.a.b(newLabelInfoListItem.cornerRadiusArray) && newLabelInfoListItem.cornerRadiusArray.length >= 4) {
            a3 = h.a(context, Integer.parseInt(newLabelInfoListItem.cornerRadiusArray[0]));
        }
        float f = a3;
        e2.f = new float[]{f, f, f, f};
        d.e = g.a(e, e2, 0);
        d.k = new ArrayList();
        com.sankuai.waimai.platform.widget.tag.virtualview.render.h e3 = com.sankuai.waimai.platform.widget.tag.virtualview.render.h.e();
        e3.e = false;
        e3.f = eVar.h;
        e3.d = h.a(context, 11.0f);
        if (!t.a(eVar.m)) {
            e3.i = h.a(context, Integer.parseInt(eVar.m));
        } else {
            e3.i = a3;
        }
        e3.h = com.sankuai.shangou.stone.util.d.a(eVar.j, -16777216);
        com.sankuai.waimai.platform.widget.tag.model.g a4 = com.sankuai.waimai.platform.widget.tag.model.g.a(e3);
        a4.e = 0;
        a4.d = eVar.b;
        g.a e4 = g.a.e();
        e4.i = Integer.valueOf(a2);
        e4.f();
        a4.n = g.a(e4, g.b.e(), 0);
        d.k.add(a4);
        list.add(d);
    }
}
