package com.sankuai.waimai.store.widgets.tag;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.widget.tag.api.e;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @Nullable
    public static List<c> a(Context context, List<Poi.LabelInfoListItem> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f90a3e6cbae4edd06a2cb1ba0c8f3e9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f90a3e6cbae4edd06a2cb1ba0c8f3e9e");
        }
        if (com.sankuai.shangou.stone.util.a.b(list) || context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Poi.LabelInfoListItem labelInfoListItem = list.get(i);
            if (labelInfoListItem != null) {
                a(context, arrayList, labelInfoListItem, i);
            }
        }
        return arrayList;
    }

    public static void a(Context context, List<c> list, Poi.LabelInfoListItem labelInfoListItem, int i) {
        Object[] objArr = {context, list, labelInfoListItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02592f8549bc760b9b9bacc50777dd39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02592f8549bc760b9b9bacc50777dd39");
            return;
        }
        c d = c.d();
        d.n = false;
        d.h = i;
        d.i = 0L;
        d.g = labelInfoListItem.priority;
        g.a e = g.a.e();
        int a2 = com.sankuai.shangou.stone.util.d.a(labelInfoListItem.labelBackgroundColor, -1);
        e.i = Integer.valueOf(a2);
        g.b e2 = g.b.e();
        e2.d = Integer.valueOf(com.sankuai.shangou.stone.util.d.a(labelInfoListItem.labelFrameColor, -16777216));
        e2.e = 1.0f;
        int a3 = h.a(context, 4.0f);
        float f = a3;
        e2.f = new float[]{f, f, f, f};
        d.e = g.a(e, e2, 0);
        d.k = new ArrayList();
        com.sankuai.waimai.platform.widget.tag.virtualview.render.h e3 = com.sankuai.waimai.platform.widget.tag.virtualview.render.h.e();
        e3.e = false;
        e3.f = labelInfoListItem.content;
        e3.d = h.a(context, 11.0f);
        e3.i = a3;
        e3.h = com.sankuai.shangou.stone.util.d.a(labelInfoListItem.contentColor, -16777216);
        com.sankuai.waimai.platform.widget.tag.model.g a4 = com.sankuai.waimai.platform.widget.tag.model.g.a(e3);
        a4.e = 0;
        a4.d = labelInfoListItem.poiServiceType;
        g.a e4 = g.a.e();
        e4.i = Integer.valueOf(a2);
        e4.f();
        a4.n = g.a(e4, g.b.e(), 0);
        d.k.add(a4);
        list.add(d);
    }

    @Nullable
    public static List<c> b(Context context, List<Poi.NewLabelInfoListItem> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1205e04d4adbb556027a959483275600", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1205e04d4adbb556027a959483275600");
        }
        if (com.sankuai.shangou.stone.util.a.b(list) || context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Poi.NewLabelInfoListItem newLabelInfoListItem = list.get(i);
            if (newLabelInfoListItem != null) {
                a(context, arrayList, newLabelInfoListItem, i);
            }
        }
        return arrayList;
    }

    public static void a(Context context, List<c> list, Poi.NewLabelInfoListItem newLabelInfoListItem, int i) {
        e eVar;
        Object[] objArr = {context, list, newLabelInfoListItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526826fb50dee40156bfa751cc809a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526826fb50dee40156bfa751cc809a79");
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
