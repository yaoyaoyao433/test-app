package com.sankuai.waimai.store.manager.marketing;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.GlobalSearchExtraInfo;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.al;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements d {
    public static ChangeQuickRedirect a;
    Activity b;
    public String c;
    final f d;
    public com.sankuai.waimai.store.manager.sequence.b e;
    View f;
    int g;
    public final GlobalPageResponse h;
    public final GlobalSearchExtraInfo.CardMsg i;
    private com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c j;
    private long k;
    private final Map<String, com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c> l;
    private String m;
    private final SearchShareData n;
    private boolean o;
    private int p;
    private int q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map);
    }

    @Override // com.sankuai.waimai.store.manager.marketing.action.b
    public final void a(String str, com.sankuai.waimai.store.manager.marketing.action.d dVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
        if (r0.cardMsg == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.app.Activity r19, android.view.View r20, int r21, com.sankuai.waimai.store.search.model.GlobalPageResponse r22) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.manager.marketing.e.<init>(android.app.Activity, android.view.View, int, com.sankuai.waimai.store.search.model.GlobalPageResponse):void");
    }

    public com.sankuai.waimai.store.manager.sequence.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287a16192fb0107babb1a224b0fd8765", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287a16192fb0107babb1a224b0fd8765");
        }
        if (this.e == null) {
            this.e = new com.sankuai.waimai.store.manager.sequence.b(false);
        }
        return this.e;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c406b7a1064627b8dad4ff34cbf8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c406b7a1064627b8dad4ff34cbf8ef");
        } else if (this.o) {
            this.o = false;
            this.c = str;
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1b4ff2f192242e529bdd468be6d9119", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1b4ff2f192242e529bdd468be6d9119");
            } else {
                a().a(false);
            }
            ae.a("SearchPopTemplateController", "page: " + this.g + " start request by enter page...");
            final GlobalPageResponse globalPageResponse = this.h;
            Object[] objArr3 = {globalPageResponse, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2109b487cfc3a9d0cec937c90904bf1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2109b487cfc3a9d0cec937c90904bf1");
                return;
            }
            ae.a("SearchPopTemplateController", "page: " + this.g + " resolve response...");
            final a aVar = new a() { // from class: com.sankuai.waimai.store.manager.marketing.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.marketing.e.a
                public final void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map) {
                    Object[] objArr4 = {map};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f7deaed8007f395375c01122acaf3a1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f7deaed8007f395375c01122acaf3a1e");
                    } else if (map != null && map.size() != 0) {
                        for (Map.Entry<String, List<com.sankuai.waimai.store.manager.sequence.d>> entry : map.entrySet()) {
                            List<com.sankuai.waimai.store.manager.sequence.d> value = entry.getValue();
                            if (!com.sankuai.shangou.stone.util.a.b(value)) {
                                String key = entry.getKey();
                                char c = 65535;
                                if (key.hashCode() == -347124400 && key.equals(MarketingModel.TYPE_RESIDENT_POPUP)) {
                                    c = 0;
                                }
                                com.sankuai.waimai.store.manager.sequence.b a2 = c == 0 ? e.this.a() : null;
                                if (a2 != null) {
                                    if (r2) {
                                        a2.b(value);
                                    } else {
                                        a2.a(value);
                                    }
                                }
                            }
                        }
                        e.this.a().a(true);
                    }
                }
            };
            Object[] objArr4 = {globalPageResponse, aVar};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "96e431e98aeb23eeb24ea29c9e6c7f62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "96e431e98aeb23eeb24ea29c9e6c7f62");
            } else {
                al.a(new al.b<Map<String, List<com.sankuai.waimai.store.manager.sequence.d>>>() { // from class: com.sankuai.waimai.store.manager.marketing.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.al.b
                    public final /* synthetic */ Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c0ee8db8ac5c7765e4a15a36b2ca310c", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Map) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c0ee8db8ac5c7765e4a15a36b2ca310c");
                        }
                        ae.a("SearchPopTemplateController", "page: " + e.this.g + " parse result: \n");
                        return e.this.d.a(e.this.b, e.this.f, globalPageResponse, e.this);
                    }

                    @Override // com.sankuai.waimai.store.util.al.b
                    public final /* synthetic */ void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map) {
                        Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map2 = map;
                        Object[] objArr5 = {map2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7e588b64c42d249e20831252bf07f3cf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7e588b64c42d249e20831252bf07f3cf");
                        } else if (aVar != null) {
                            aVar.a(map2);
                        }
                    }
                }, this.c);
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd4f23bd90689650577755a9260bd8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd4f23bd90689650577755a9260bd8b");
            return;
        }
        com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c cVar = this.l.get(str);
        if (cVar != null) {
            cVar.a(aVar, str, map);
        } else if (this.j != null) {
            this.j.a(aVar, str, map);
        } else if (!"jump_feed_back".equals(str) || this.i == null || t.a(this.i.scheme)) {
        } else {
            com.sankuai.waimai.store.router.d.a(this.b, b(this.i.scheme));
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.d
    public final long c() {
        return this.k;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.d
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940a5384cf48c236019afa7f2c38ec9d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940a5384cf48c236019afa7f2c38ec9d") : TextUtils.isEmpty(this.m) ? com.sankuai.waimai.store.manager.judas.b.b(this.b) : this.m;
    }

    public GlobalSearchExtraInfo.FloatingInfo a(GlobalSearchExtraInfo globalSearchExtraInfo) {
        Object[] objArr = {globalSearchExtraInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b441897191824b21c5b59053397d968b", RobustBitConfig.DEFAULT_VALUE)) {
            return (GlobalSearchExtraInfo.FloatingInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b441897191824b21c5b59053397d968b");
        }
        if (globalSearchExtraInfo == null) {
            return null;
        }
        List<GlobalSearchExtraInfo.FloatingInfo> list = globalSearchExtraInfo.floatingInfoList;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        return list.get(0);
    }

    private String b(@NonNull String str) {
        String sb;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec18c90d7416ab08f9f4242cecba57dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec18c90d7416ab08f9f4242cecba57dc");
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("inner_url");
            String encode = URLEncoder.encode(queryParameter, "utf-8");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fac4ca57ef1d7208aed98b50d28e0421", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fac4ca57ef1d7208aed98b50d28e0421");
            } else {
                StringBuilder sb2 = new StringBuilder();
                String f = g.f(this.n);
                sb2.append("stid=");
                sb2.append(f);
                sb2.append("&entry_type");
                sb2.append("=");
                sb2.append(this.p);
                sb2.append("&sceneId");
                sb2.append("=");
                sb2.append(this.q);
                sb = sb2.toString();
            }
            if (queryParameter.indexOf(CommonConstant.Symbol.QUESTION_MARK, queryParameter.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                str2 = queryParameter + "&" + sb;
            } else {
                str2 = queryParameter + CommonConstant.Symbol.QUESTION_MARK + sb;
            }
            return str.replace(encode, URLEncoder.encode(str2, "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public final void a(int i, int i2) {
        this.p = i;
        this.q = i2;
    }
}
