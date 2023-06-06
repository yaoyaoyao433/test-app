package com.sankuai.waimai.store.drug.home.new_home.presenter;

import android.support.annotation.NonNull;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.new_home.presenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1151a {
        void a();

        void a(@NonNull CategoryInfo categoryInfo);

        void a(@NonNull CategoryInfo categoryInfo, long j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(@NonNull CategoryInfo categoryInfo);

        void a(@NonNull CategoryInfo categoryInfo, long j);

        void a(@NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse);

        void a(@NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, long j);

        void b(@NonNull CategoryInfo categoryInfo);

        String c();

        void c(@NonNull CategoryInfo categoryInfo);

        SCBaseActivity f();
    }
}
