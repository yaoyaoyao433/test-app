package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetResponse;
import java.io.UnsupportedEncodingException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class du<OUT extends JsonComposer> extends dr {
    private Class<OUT> a;

    public du(Class<OUT> cls) {
        this.a = cls;
    }

    private a<OUT> b(NetResponse netResponse) {
        return new a<>(netResponse, this.a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<OUT extends JsonComposer> extends NetResponse {
        public String a;
        public OUT b;

        public a(NetResponse netResponse) {
            clone(netResponse);
            if (netResponse.available()) {
                try {
                    this.a = new String(netResponse.data, netResponse.charset);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }

        public a(NetResponse netResponse, Class<OUT> cls) {
            clone(netResponse);
            if (netResponse.available()) {
                try {
                    this.a = new String(netResponse.data, netResponse.charset);
                    this.b = (OUT) JsonUtils.parseToModel(this.a, cls, new Object[0]);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.tencent.map.tools.net.NetResponse
        public final boolean available() {
            return (!super.available() || this.a == null || TextUtils.isEmpty(this.a)) ? false : true;
        }

        private String a() {
            return this.a;
        }

        private OUT b() {
            return this.b;
        }
    }

    @Override // com.tencent.mapsdk.internal.dr, com.tencent.mapsdk.internal.dv
    public final /* synthetic */ NetResponse a(NetResponse netResponse) {
        return new a(netResponse, this.a);
    }
}
