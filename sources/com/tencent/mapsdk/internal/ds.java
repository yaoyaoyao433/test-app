package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetResponse;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ds extends dr {
    private String a;
    private String b;

    public ds(String str) {
        this.a = str;
    }

    @Override // com.tencent.mapsdk.internal.dr, com.tencent.mapsdk.internal.dv
    public final Object[] a(int[] iArr, Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length == 1 && objArr.length > 0) {
            Object obj = objArr[iArr[0]];
            if (obj instanceof String) {
                this.b = String.valueOf(obj);
            }
        }
        return super.a(iArr, objArr);
    }

    private a b(NetResponse netResponse) {
        return new a(netResponse, this.b, this.a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends NetResponse {
        private File a;

        public a(NetResponse netResponse, String str, String str2) {
            clone(netResponse);
            if (netResponse.available()) {
                this.a = new File(str, str2);
                File file = new File(str, str2 + ".tmp");
                kc.b(file);
                if (kc.a(file) && kc.a(file, netResponse.data) && kc.a(file, this.a)) {
                    kc.b(file);
                }
            }
        }

        @Override // com.tencent.map.tools.net.NetResponse
        public final boolean available() {
            return super.available() && this.a != null && this.a.exists();
        }

        private File a() {
            return this.a;
        }
    }

    @Override // com.tencent.mapsdk.internal.dr, com.tencent.mapsdk.internal.dv
    public final /* synthetic */ NetResponse a(NetResponse netResponse) {
        return new a(netResponse, this.b, this.a);
    }
}
