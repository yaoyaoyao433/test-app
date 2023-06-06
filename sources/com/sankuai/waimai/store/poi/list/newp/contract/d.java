package com.sankuai.waimai.store.poi.list.newp.contract;

import android.app.Activity;
import android.support.annotation.UiThread;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends b {
        Activity a();

        void a(PoiVerticalityDataResponse poiVerticalityDataResponse);

        void a(com.sankuai.waimai.store.widgets.twolevel.c cVar, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.store.param.a aVar);

        void a(com.sankuai.waimai.store.param.a aVar, boolean z);

        void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.param.a aVar, boolean z);

        @UiThread
        void a(String str, boolean z, boolean z2, com.sankuai.waimai.store.repository.net.b bVar);

        String b();

        long c();

        String d();

        String f();

        String g();
    }
}
