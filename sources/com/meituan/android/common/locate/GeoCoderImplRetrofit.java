package com.meituan.android.common.locate;

import android.location.Location;
import com.meituan.android.common.locate.geo.GeoRequestImpl;
import com.meituan.android.common.locate.remote.IGeocoderApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.io.IOException;
/* loaded from: classes2.dex */
public class GeoCoderImplRetrofit implements GeoCoder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GeoRequestImpl geoRequest;
    public IGeocoderApi mGeoCoderApi;

    /* renamed from: retrofit  reason: collision with root package name */
    private ar f24retrofit;

    public GeoCoderImplRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16031a7c2636869fd7285a7b1b0d77cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16031a7c2636869fd7285a7b1b0d77cd");
            return;
        }
        this.f24retrofit = com.meituan.android.common.locate.remote.b.a();
        if (this.f24retrofit != null) {
            this.mGeoCoderApi = (IGeocoderApi) this.f24retrofit.a(IGeocoderApi.class);
        }
        this.geoRequest = new GeoRequestImpl(this.mGeoCoderApi, null);
    }

    @Override // com.meituan.android.common.locate.GeoCoder
    @Deprecated
    public AddressResult getAddress(Location location) throws IOException {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71fda832bad92db78d4d1ea445ef4f4", RobustBitConfig.DEFAULT_VALUE) ? (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71fda832bad92db78d4d1ea445ef4f4") : this.geoRequest.getAddress(location);
    }

    @Override // com.meituan.android.common.locate.GeoCoder
    public AddressResult getAddress(MtLocation mtLocation) throws IOException {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e80de6d2189ff7f7e3c8f637985dd3f", RobustBitConfig.DEFAULT_VALUE) ? (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e80de6d2189ff7f7e3c8f637985dd3f") : this.geoRequest.getAddress(mtLocation);
    }
}
