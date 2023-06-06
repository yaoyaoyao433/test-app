package com.dianping.dataservice.mapi.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.dianping.dataservice.mapi.h;
import com.dianping.model.SimpleMsg;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.ai.speech.sdk.knb.JsErrorCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IMediaPlayer;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d implements r {
    public static ChangeQuickRedirect c;
    private com.dianping.dataservice.http.d a;
    private final Handler b;
    g d;
    f e;
    private String f;

    public abstract Request a(Request request);

    public d(com.dianping.dataservice.http.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69bce4dddaff4094e6d014967324cdd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69bce4dddaff4094e6d014967324cdd7");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.f = "";
        this.a = dVar;
    }

    @Override // com.dianping.nvnetwork.r
    public rx.d<q> intercept(r.a aVar) {
        Request build;
        Request a;
        String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a8da7e3f5189a731c1f6112243e4b01", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a8da7e3f5189a731c1f6112243e4b01");
        }
        Request a2 = aVar.a();
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7b699193270f72606394960c713a585", RobustBitConfig.DEFAULT_VALUE)) {
            build = (Request) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7b699193270f72606394960c713a585");
        } else {
            Request a3 = a(a2);
            HashMap<String, String> hashMap = a3.g;
            if (hashMap == null) {
                hashMap = new HashMap<>(8);
            }
            List<com.dianping.apache.http.a> c2 = h.a().c();
            if (c2 != null) {
                for (com.dianping.apache.http.a aVar2 : c2) {
                    a(hashMap, aVar2.a(), aVar2.b());
                }
            }
            if (this.a != null) {
                com.dianping.dataservice.http.d dVar = this.a;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.dataservice.http.d.a;
                if (!PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "79ace474c7c6ce739d2fb713fc0aa001", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (dVar.a()) {
                        case 1:
                            str = "wifi";
                            break;
                        case 2:
                            str = "2g";
                            break;
                        case 3:
                            str = "3g";
                            break;
                        case 4:
                            str = "4g";
                            break;
                        default:
                            str = "unknown";
                            break;
                    }
                } else {
                    str = (String) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "79ace474c7c6ce739d2fb713fc0aa001");
                }
                a(hashMap, "network-type", str);
            }
            InputStream a4 = a3.i == null ? null : e.a(a3.i);
            Object obj = a3.q;
            build = a3.a().url(a(a3.d, "mapi.dianping.com")).input(a4).headers(hashMap).build();
            if (obj != null && (obj instanceof com.dianping.dataservice.mapi.b)) {
                com.dianping.dataservice.mapi.b bVar = (com.dianping.dataservice.mapi.b) obj;
                if (bVar.j != null && (a = bVar.j.a(build)) != null) {
                    build = a;
                }
            }
        }
        return aVar.a(build).d(new rx.functions.g<q, q>() { // from class: com.dianping.dataservice.mapi.impl.d.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ q call(q qVar) {
                q qVar2 = qVar;
                Object[] objArr4 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ff61e0a0bde7cc33b9272204c4885ae3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (q) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ff61e0a0bde7cc33b9272204c4885ae3");
                }
                d dVar2 = d.this;
                Object[] objArr5 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect5 = d.c;
                if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "a17957f69960a378338e5960f959e0d1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (q) PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "a17957f69960a378338e5960f959e0d1");
                }
                q a5 = qVar2.result() != null ? dVar2.a(qVar2) : null;
                if (a5 == null) {
                    q.a aVar3 = new q.a();
                    aVar3.c = qVar2.statusCode();
                    aVar3.j = qVar2.error();
                    return aVar3.build();
                }
                return a5;
            }
        });
    }

    private void a(HashMap<String, String> hashMap, String str, String str2) {
        Object[] objArr = {hashMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a404154b43016f7d39ff31b043b788a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a404154b43016f7d39ff31b043b788a5");
        } else if (hashMap.containsKey(str)) {
        } else {
            hashMap.put(str, str2);
        }
    }

    private String a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String nextToken;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b37a2cb487856caed3ee5e352ff4a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b37a2cb487856caed3ee5e352ff4a9");
        }
        try {
            int indexOf = str.indexOf("://");
            int i = indexOf + 3;
            int indexOf2 = str.indexOf(47, i);
            str3 = str.substring(0, indexOf);
            str4 = str.substring(i, indexOf2);
            str5 = str.substring(indexOf2 + 1);
        } catch (Exception unused) {
            str3 = "http";
            str4 = CommonConstant.Symbol.QUESTION_MARK;
            str5 = "";
        }
        if (str4.equals("mapi.dianping.com") && !str2.equals("mapi.dianping.com")) {
            return str3 + "://" + str2 + '/' + str5;
        }
        String str6 = str4 + ">";
        if (TextUtils.isEmpty("m.api.dianping.com>mapi|app.t.dianping.com>tuan|l.api.dianping.com>locate|waimai.api.dianping.com>waimai|mc.api.dianping.com>mc|rs.api.dianping.com>rs|hui.api.dianping.com>hui|menu.api.dianping.com>menu|beauty.api.dianping.com>beauty|app.movie.dianping.com>movie|api.p.dianping.com>pay")) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer("m.api.dianping.com>mapi|app.t.dianping.com>tuan|l.api.dianping.com>locate|waimai.api.dianping.com>waimai|mc.api.dianping.com>mc|rs.api.dianping.com>rs|hui.api.dianping.com>hui|menu.api.dianping.com>menu|beauty.api.dianping.com>beauty|app.movie.dianping.com>movie|api.p.dianping.com>pay", HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().startsWith(str6)) {
                return str3 + "://" + str2 + '/' + nextToken.substring(str6.length()) + '/' + str5;
            }
        }
        return str;
    }

    q a(q qVar) {
        q build;
        final SimpleMsg a;
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46bad809e30d91df6abe448d92494f17", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46bad809e30d91df6abe448d92494f17");
        }
        q qVar2 = null;
        if (qVar.statusCode() / 100 == 2 || qVar.statusCode() / 100 == 4 || qVar.f) {
            try {
                byte[] a2 = e.a(qVar.result());
                if (qVar.statusCode() / 100 != 2 && !qVar.f) {
                    q.a aVar = new q.a();
                    aVar.c = qVar.statusCode();
                    aVar.e = qVar.headers();
                    aVar.h = qVar.result();
                    aVar.j = (SimpleMsg) new com.dianping.archive.e(a2).a(SimpleMsg.b);
                    build = aVar.build();
                }
                q.a aVar2 = new q.a();
                aVar2.c = qVar.statusCode();
                aVar2.b = a2;
                aVar2.e = qVar.headers();
                aVar2.h = qVar.result();
                aVar2.f = qVar.f;
                q.a a3 = aVar2.a(qVar.g);
                a3.i = true;
                qVar2 = a3.build();
                build = null;
            } catch (Exception e) {
                e.printStackTrace();
                int statusCode = qVar.statusCode();
                if (qVar.statusCode() == 200) {
                    statusCode = c.a(qVar.result()) ? -109 : JsErrorCode.AUDIO_RECORD_STOP_FAILED;
                } else if (qVar.statusCode() == 400) {
                    statusCode = c.a(qVar.result()) ? -111 : IMediaPlayer.MEDIA_ERROR_TIMED_OUT;
                }
                q.a aVar3 = new q.a();
                aVar3.c = statusCode;
                aVar3.e = qVar.headers();
                aVar3.h = qVar.result();
                aVar3.j = a.g;
                build = aVar3.build();
            }
        } else {
            q.a aVar4 = new q.a();
            aVar4.c = qVar.statusCode();
            aVar4.e = qVar.headers();
            aVar4.h = qVar.result();
            aVar4.j = a.d;
            build = aVar4.build();
        }
        HashMap<String, String> headers = qVar.headers();
        if (headers != null && this.d != null) {
            final String str = headers.get("pragma-newtoken");
            if (!TextUtils.isEmpty(str)) {
                this.b.post(new Runnable() { // from class: com.dianping.dataservice.mapi.impl.d.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57c834171b7358ae9c8ce7e5aa8ccdb2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57c834171b7358ae9c8ce7e5aa8ccdb2");
                        }
                    }
                });
            }
        }
        if (qVar2 != null) {
            return qVar2;
        }
        if (build.statusCode() == 401) {
            String a4 = h.a().a();
            if (!TextUtils.isEmpty(a4) && !a4.equals(this.f)) {
                this.f = a4;
                if (build.error() instanceof SimpleMsg) {
                    a = (SimpleMsg) build.error();
                } else {
                    a = a.a(401, "unknown error.");
                }
                if (this.e != null) {
                    this.b.post(new Runnable() { // from class: com.dianping.dataservice.mapi.impl.d.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce034d116564fca1edeabb5f73ea43d5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce034d116564fca1edeabb5f73ea43d5");
                            }
                        }
                    });
                }
            }
        }
        return build;
    }
}
