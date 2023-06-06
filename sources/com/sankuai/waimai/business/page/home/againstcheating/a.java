package com.sankuai.waimai.business.page.home.againstcheating;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.manager.againstcheat.AgainstCheatingApi;
import com.sankuai.waimai.platform.domain.manager.againstcheat.AgainstCheatingResponseData;
import com.sankuai.waimai.platform.utils.l;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static String b;

    public static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57aac9a3b3c87f0e6f88878b4db2db5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57aac9a3b3c87f0e6f88878b4db2db5e");
        } else {
            l.a(new l.a() { // from class: com.sankuai.waimai.business.page.home.againstcheating.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbdec3872a2a040d23129cc7fc327077", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbdec3872a2a040d23129cc7fc327077");
                        return;
                    }
                    String str2 = str;
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7337279970a725e7fccae4e6fb68610c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7337279970a725e7fccae4e6fb68610c");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("uuid", b.A().c());
                    hashMap.put("dpid", "");
                    hashMap.put("cx", b.A().E());
                    hashMap.put("accesstime", Long.valueOf(System.currentTimeMillis()));
                    hashMap.put("userid", b.A().B());
                    hashMap.put("activesource", b.A().d());
                    if (a.b != null) {
                        hashMap.put("gidcity", a.b);
                    }
                    hashMap.put("appversion", b.A().i());
                    hashMap.put("msg_type", str2);
                    try {
                        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, p.g(com.meituan.android.singleton.b.a));
                    } catch (Exception unused) {
                        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "");
                    }
                    hashMap.put("ACCESS_POINT", "30022");
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AgainstCheatingApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AgainstCheatingApi.class)).uploadData(new JSONObject(hashMap).toString()), new b.AbstractC1042b<AgainstCheatingResponseData>() { // from class: com.sankuai.waimai.business.page.home.againstcheating.a.2
                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        @Override // rx.e
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }
                    }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
                }
            }, (String) null);
        }
    }
}
