package com.meituan.android.legwork.mvp.contract;

import android.support.annotation.NonNull;
import com.meituan.android.legwork.bean.address.DeliveryPlaceBean;
import com.meituan.android.legwork.bean.address.MtRevGeoBean;
import com.meituan.android.legwork.bean.address.PoiBean;
import com.meituan.android.legwork.bean.address.SmallGrainRegeoBean;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.android.legwork.net.response.MapBaseEntity;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.mvp.contract.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0268a {
        Map<String, Object> a();

        d<BaseEntity<MapBaseEntity<MtRevGeoBean>>> a(String str);

        d<BaseEntity<DeliveryPlaceBean>> a(Map<String, Object> map);

        d<BaseEntity<SmallGrainRegeoBean>> b(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i, String str);

        void a(DeliveryPlaceBean deliveryPlaceBean);

        void a(@NonNull PoiBean poiBean, boolean z);

        void a(String str, boolean z);

        void a(boolean z, String str, int i, String str2);
    }
}
