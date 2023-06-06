package com.midas.ad.feedback;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.midas.ad.feedback.a;
import com.midas.ad.network.e;
import com.midas.ad.network.model.c;
import java.util.HashMap;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public final class b extends a {
    private com.dianping.mainboard.a i;

    public b(Context context) {
        super(context, null);
        this.i = com.dianping.mainboard.a.b();
        if (this.i.i == 1) {
            this.a = "http://m.api.dianping.com";
            this.b = "/mlog/mtmidas.bin?";
            this.c = "/mlog/mtzmidas.bin?";
        } else {
            this.a = "https://m.api.dianping.com";
            this.b = "/mlog/applog.bin?";
            this.c = "/mlog/zlog.bin?";
        }
        this.d = "data=";
        HashMap hashMap = new HashMap();
        com.dianping.mainboard.a b = com.dianping.mainboard.a.b();
        if (b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(b.b);
            hashMap.put("lat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.c);
            hashMap.put("lng", sb2.toString());
            hashMap.put("user_id", b.f);
        }
        if (!TextUtils.isEmpty(Statistics.getRequestId())) {
            hashMap.put("dpreqid", Statistics.getRequestId());
        }
        this.h = hashMap;
    }

    @Override // com.midas.ad.feedback.a
    protected final void a(final int i, final com.midas.ad.network.b bVar, final String str) {
        d.a(new j<c>() { // from class: com.midas.ad.feedback.b.2
            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                c cVar = (c) obj;
            }
        }, d.a((d.a) new d.a<c>() { // from class: com.midas.ad.feedback.b.1
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                c a;
                j jVar = (j) obj;
                if (i == 1) {
                    e.a();
                    a = e.b().a(bVar, str);
                } else {
                    e.a();
                    a = e.a(b.this.e).a(bVar, str);
                }
                if (a == null) {
                    jVar.onError(new Exception("request failed"));
                } else if (a.a() != null) {
                    jVar.onError(new Exception(a.a().toString()));
                } else {
                    jVar.onNext(a);
                    jVar.onCompleted();
                }
            }
        }).g(new a.c(3, 1)).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }
}
