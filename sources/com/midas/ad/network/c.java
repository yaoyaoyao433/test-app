package com.midas.ad.network;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.dataservice.mapi.impl.DefaultMApiService;
import com.dianping.dataservice.mapi.j;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c implements a {
    private Context a;
    private DefaultMApiService b;
    private Request c;

    public c(Context context) {
        this.a = context;
        this.b = new DefaultMApiService(this.a);
    }

    @Override // com.midas.ad.network.a
    public final com.midas.ad.network.model.c a(b bVar, String str) {
        if (TextUtils.equals(bVar.e(), "GET")) {
            this.c = new Request.Builder().url(bVar.a()).method("GET").build();
        } else {
            if (TextUtils.isEmpty(bVar.c())) {
                com.dianping.codelog.b.b(c.class, "AdDataException", "postData is null");
            }
            this.c = new Request.Builder().url(bVar.a()).method("POST").addHeaders("Content-Encoding", "gzip").addHeaders("Content-Type", "application/mapi").input((InputStream) new j(bVar.c())).build();
        }
        q execSync = this.b.execSync(this.c);
        if (execSync != null) {
            com.midas.ad.network.model.a aVar = new com.midas.ad.network.model.a();
            aVar.a = execSync.error();
            aVar.a(execSync);
            return aVar;
        }
        return null;
    }
}
