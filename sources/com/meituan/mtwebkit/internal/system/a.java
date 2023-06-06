package com.meituan.mtwebkit.internal.system;

import android.webkit.ClientCertRequest;
import com.meituan.mtwebkit.MTClientCertRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends MTClientCertRequest {
    public static ChangeQuickRedirect a;
    private ClientCertRequest b;

    public a(ClientCertRequest clientCertRequest) {
        Object[] objArr = {clientCertRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7d7db6397100c39b3df91bd1a4a8c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7d7db6397100c39b3df91bd1a4a8c1");
        } else {
            this.b = clientCertRequest;
        }
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final String[] getKeyTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4f5819bf4455c6f13557ad997f52c6", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4f5819bf4455c6f13557ad997f52c6") : this.b.getKeyTypes();
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final Principal[] getPrincipals() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b638f188d5d28bd15ce4b3fec72cbae2", RobustBitConfig.DEFAULT_VALUE) ? (Principal[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b638f188d5d28bd15ce4b3fec72cbae2") : this.b.getPrincipals();
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final String getHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f251e4a491610e19a5c5d1ef61faaf6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f251e4a491610e19a5c5d1ef61faaf6") : this.b.getHost();
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final int getPort() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344bb956711285e9fc95942575e8170f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344bb956711285e9fc95942575e8170f")).intValue() : this.b.getPort();
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        Object[] objArr = {privateKey, x509CertificateArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69d928e6302be794e1fb575897b73bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69d928e6302be794e1fb575897b73bd");
        } else {
            this.b.proceed(privateKey, x509CertificateArr);
        }
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final void ignore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3299ab98d15d6cdfce9e01ff2ef9ec32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3299ab98d15d6cdfce9e01ff2ef9ec32");
        } else {
            this.b.ignore();
        }
    }

    @Override // com.meituan.mtwebkit.MTClientCertRequest
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e2a8bcd537ab0cbcbc69b0b9107eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e2a8bcd537ab0cbcbc69b0b9107eaa");
        } else {
            this.b.cancel();
        }
    }
}
