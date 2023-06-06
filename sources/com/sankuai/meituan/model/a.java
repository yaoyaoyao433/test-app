package com.sankuai.meituan.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.Deal;
import com.sankuai.meituan.model.dao.Order;
import com.sankuai.meituan.model.dao.Poi;
import com.sankuai.meituan.model.datarequest.deal.DealDeserializer;
import com.sankuai.meituan.model.datarequest.dealfilter.Filter;
import com.sankuai.meituan.model.datarequest.dealfilter.FilterDeserializer;
import com.sankuai.meituan.model.datarequest.order.OrderDeserializer;
import com.sankuai.meituan.model.datarequest.poi.PoiDeserializer;
import com.sankuai.meituan.model.datarequest.topic.Topic;
import com.sankuai.meituan.model.datarequest.topic.TopicDeserializer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private Gson c;
    private final GsonBuilder d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d294d75d320e9e1ed53d108cceaaee0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d294d75d320e9e1ed53d108cceaaee0e");
            return;
        }
        this.d = new GsonBuilder();
        this.d.registerTypeAdapter(Deal.class, new DealDeserializer());
        this.d.registerTypeAdapter(Order.class, new OrderDeserializer());
        this.d.registerTypeAdapter(Filter.class, new FilterDeserializer());
        this.d.registerTypeAdapter(Topic.class, new TopicDeserializer());
        this.d.registerTypeAdapter(Poi.class, new PoiDeserializer());
    }

    public static synchronized a a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2deefdf57d79981a716b1feddbbb842e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2deefdf57d79981a716b1feddbbb842e");
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public final Gson b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce195a735c39b6749a355de7f4fb496c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce195a735c39b6749a355de7f4fb496c");
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.d.create();
                }
            }
        }
        return this.c;
    }
}
