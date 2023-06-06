package com.sankuai.android.spawn.locate;

import android.location.Location;
import android.support.v4.content.ConcurrentTaskLoader;
import com.meituan.android.common.locate.AddressResult;
import com.meituan.android.common.locate.GeoCoder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AddressLoader extends ConcurrentTaskLoader<AddressResult> {
    public static ChangeQuickRedirect a;
    private static final a e = new a();
    private final GeoCoder b;
    private final Location c;
    private AddressResult d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private Location b;
        private AddressResult c;

        public a() {
        }

        public final void a(Location location, AddressResult addressResult) {
            Object[] objArr = {location, addressResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefaaaa75df5d0d30e9957f92a60d090", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefaaaa75df5d0d30e9957f92a60d090");
            } else if (location == null || addressResult == null || addressResult.getErrorCode() != 0) {
            } else {
                this.b = location;
                this.c = addressResult;
            }
        }

        public final AddressResult a(Location location) {
            Object[] objArr = {location};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ae65ac53349827f6b563a04187e6a0", 6917529027641081856L)) {
                return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ae65ac53349827f6b563a04187e6a0");
            }
            if (this.b == null || location == null || this.b.distanceTo(location) >= 0.5f) {
                return null;
            }
            return this.c;
        }
    }

    @Override // android.support.v4.content.Loader
    public void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504fb70875f4cdf531ae5d0e0b23443c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504fb70875f4cdf531ae5d0e0b23443c");
        } else if (this.d != null) {
            deliverResult(this.d);
        } else if (e.a(this.c) != null) {
            deliverResult(e.a(this.c));
        } else {
            forceLoad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.content.AsyncTaskLoader
    /* renamed from: a */
    public AddressResult loadInBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721b28df295cb4d0d798efae2bf7c1fa", 6917529027641081856L)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721b28df295cb4d0d798efae2bf7c1fa");
        }
        try {
            return this.b.getAddress(this.c);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.content.Loader
    /* renamed from: a */
    public void deliverResult(AddressResult addressResult) {
        Object[] objArr = {addressResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b0e3c191e9df45c1213f1d544974db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b0e3c191e9df45c1213f1d544974db");
        } else if (isReset()) {
        } else {
            this.d = addressResult;
            e.a(this.c, addressResult);
            super.deliverResult(addressResult);
        }
    }
}
