package com.sankuai.waimai.store.drug.home.newp.contract;

import android.support.annotation.UiThread;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.newp.contract.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1155a {
        void a(int i);

        boolean a();

        boolean b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.store.param.a aVar, boolean z);

        void a(PoiVerticalityDataResponse poiVerticalityDataResponse);

        void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.param.a aVar, boolean z, boolean z2);

        @UiThread
        void a(String str, com.sankuai.waimai.store.repository.net.b bVar, boolean z, boolean z2);

        SCBaseActivity b();

        String bb_();

        long c();

        String d();

        String e();
    }
}
