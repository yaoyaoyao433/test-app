package com.sankuai.meituan.kernel.net.nvnetwork;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.t;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements r {
    public static ChangeQuickRedirect a;
    private final com.sankuai.meituan.kernel.net.base.b b;
    private final boolean c;
    private final com.sankuai.meituan.kernel.net.singleton.b d;

    public a(com.sankuai.meituan.kernel.net.singleton.b bVar, com.sankuai.meituan.kernel.net.base.b bVar2, boolean z) {
        Object[] objArr = {bVar, bVar2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8663e5f2f5934ca3c4ce983cad06cfa6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8663e5f2f5934ca3c4ce983cad06cfa6");
            return;
        }
        this.d = bVar;
        this.b = bVar2;
        this.c = false;
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        String builder;
        Map<String, String> b;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a24a2ee0751cfc0aad02c02dbac7d6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a24a2ee0751cfc0aad02c02dbac7d6e");
        }
        Request a2 = aVar.a();
        t e = t.e(a2.d);
        Request.Builder a3 = a2.a();
        String aSCIIString = e.a().toASCIIString();
        boolean c = e.c();
        Object[] objArr2 = {aSCIIString, Byte.valueOf(c ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41a1a1f4ed853f2c4ad9eae655e4212a", RobustBitConfig.DEFAULT_VALUE)) {
            builder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41a1a1f4ed853f2c4ad9eae655e4212a");
        } else {
            Uri parse = Uri.parse(aSCIIString);
            Uri.Builder a4 = this.d.a(parse, c);
            if (TextUtils.isEmpty(parse.getQueryParameter("__reqTraceID"))) {
                a4.appendQueryParameter("__reqTraceID", UUID.randomUUID().toString());
            }
            builder = a4.toString();
        }
        Request.Builder url = a3.url(builder);
        if (this.b != null && this.b.a() != 0 && (a2.g == null || (a2.g != null && TextUtils.isEmpty(a2.g.get("userid"))))) {
            a2.a("userid", String.valueOf(this.b.a()));
        }
        if (this.c) {
            url.isFailOver(false);
        }
        Map<String, String> map = a2.y;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.b != null && !TextUtils.isEmpty(this.b.f())) {
            map.put("METPageName", this.b.f());
        }
        HashMap<String, String> hashMap = a2.g;
        if (hashMap != null) {
            String str = hashMap.get("Cat_Extra");
            if (!TextUtils.isEmpty(str) && (b = com.sankuai.meituan.kernel.net.utils.b.b(str)) != null && b.size() > 0) {
                map.putAll(b);
            }
            hashMap.remove("Cat_Extra");
        }
        url.headers(hashMap);
        url.catExtendMap(map);
        return aVar.a(url.build());
    }
}
