package com.meituan.android.common.locate;

import android.location.Location;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.geo.GeoRequestImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.OkHttpClient;
import org.apache.http.client.HttpClient;
/* loaded from: classes2.dex */
public class GeoCoderImpl implements GeoCoder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GeoRequestImpl geoRequest;
    private HttpClient httpClient;
    private OkHttpClient okHttpClient;

    public GeoCoderImpl(@NonNull OkHttpClient okHttpClient) {
        Object[] objArr = {okHttpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15f5c8bf5ee9f6bc4aadac6ff77a49a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15f5c8bf5ee9f6bc4aadac6ff77a49a1");
            return;
        }
        this.okHttpClient = okHttpClient;
        this.geoRequest = new GeoRequestImpl(null, okHttpClient);
    }

    @Deprecated
    public GeoCoderImpl(HttpClient httpClient) {
        Object[] objArr = {httpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd798e92c3545065a0c95c4538c3a7c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd798e92c3545065a0c95c4538c3a7c9");
        } else {
            this.httpClient = httpClient;
        }
    }

    @Override // com.meituan.android.common.locate.GeoCoder
    @Deprecated
    public AddressResult getAddress(Location location) throws IOException {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47aebb1bc61728a524fb1da2e0c0593d", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47aebb1bc61728a524fb1da2e0c0593d");
        }
        if (this.geoRequest != null) {
            return this.geoRequest.getAddress(location);
        }
        throw new IOException("httpclient is Deprecated");
    }

    @Override // com.meituan.android.common.locate.GeoCoder
    public AddressResult getAddress(MtLocation mtLocation) throws IOException {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d82f2f8aed681c95642b93dc4f464a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d82f2f8aed681c95642b93dc4f464a0");
        }
        if (this.geoRequest != null) {
            return this.geoRequest.getAddress(mtLocation);
        }
        throw new IOException("httpclient is Deprecated");
    }
}
