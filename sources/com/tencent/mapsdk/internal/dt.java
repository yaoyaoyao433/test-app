package com.tencent.mapsdk.internal;

import com.qq.taf.jce.a;
import com.tencent.map.tools.net.NetResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class dt<IN extends com.qq.taf.jce.a, OUT extends com.qq.taf.jce.a> extends dr {
    private Class<IN> a;
    private Class<OUT> b;
    private com.qq.taf.jce.a c;

    public dt(Class<IN> cls, Class<OUT> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // com.tencent.mapsdk.internal.dr, com.tencent.mapsdk.internal.dv
    public final Object[] a(int[] iArr, Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length > 0 && objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            int i = iArr[0];
            int i2 = iArr.length == 1 ? iArr[0] : iArr[1];
            if (objArr.length - 1 >= i2 && i >= 0) {
                this.c = (com.qq.taf.jce.a) ha.a(this.a, Arrays.copyOfRange(objArr, i, i2 + 1));
                byte[] bArr = new byte[0];
                if (this.c != null) {
                    bArr = this.c.toByteArray();
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < asList.size(); i3++) {
                    if (i3 < i || i3 > i2) {
                        arrayList.add(asList.get(i3));
                    } else if (i3 == i2) {
                        arrayList.add(bArr);
                    }
                }
                return arrayList.toArray();
            }
        }
        return super.a(iArr, objArr);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("JceResolver{");
        stringBuffer.append("inJce=");
        stringBuffer.append(this.c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private a<OUT> b(NetResponse netResponse) {
        return new a<>(netResponse, this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<OUT extends com.qq.taf.jce.a> extends NetResponse {
        public OUT a;

        public a(NetResponse netResponse, Class<OUT> cls) {
            clone(netResponse);
            if (netResponse.data != null) {
                m mVar = new m(netResponse.data);
                this.a = (OUT) ha.a(cls, new Object[0]);
                if (this.a != null) {
                    this.a.readFrom(mVar);
                }
            }
            kj.c(ki.g, "[JCE-RESP]:" + this.a);
        }

        private OUT a() {
            return this.a;
        }

        @Override // com.tencent.map.tools.net.NetResponse
        public final boolean available() {
            return super.available() && this.a != null;
        }
    }

    @Override // com.tencent.mapsdk.internal.dr, com.tencent.mapsdk.internal.dv
    public final /* synthetic */ NetResponse a(NetResponse netResponse) {
        return new a(netResponse, this.b);
    }
}
