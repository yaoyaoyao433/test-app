package com.sankuai.xm.integration.emotion.service;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.l;
import com.sankuai.xm.d;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.transfer.download.DownloadManager;
import com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin;
import com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter;
import com.sankuai.xm.integration.emotion.CustomEmotionAdapter;
import com.sankuai.xm.integration.emotion.entity.c;
import com.sankuai.xm.network.httpurlconnection.e;
import com.sankuai.xm.network.httpurlconnection.g;
import com.sankuai.xm.ui.service.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.service.a implements com.sankuai.xm.ui.service.b {
    public static ChangeQuickRedirect a;
    private volatile AtomicLong b;
    private Set<b.C1420b> c;
    private final Map<String, List<Callback<b.a>>> d;
    private Map<String, Pair<c, Integer>> e;
    private LruCache<String, com.sankuai.xm.integration.emotion.entity.b> f;
    private LruCache<String, c> j;
    private com.sankuai.xm.im.transfer.download.c k;
    private IMClient.d l;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5dca393862b1cba909c3c8a8587b86c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5dca393862b1cba909c3c8a8587b86c");
            return;
        }
        this.b = new AtomicLong(-1L);
        this.c = Collections.synchronizedSet(new HashSet());
        this.d = Collections.synchronizedMap(new HashMap());
        this.e = Collections.synchronizedMap(new HashMap());
        this.f = new LruCache<>(20);
        this.j = new LruCache<>(200);
    }

    public static /* synthetic */ void a(b bVar, final c cVar, final int i, String str, boolean z) {
        String a2;
        String str2;
        String str3;
        Object[] objArr = {cVar, Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c4b472b0b371455373ba76977b066cfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c4b472b0b371455373ba76977b066cfe");
            return;
        }
        String str4 = null;
        if (i == 4) {
            str4 = cVar.i;
            if (ac.a(str)) {
                a2 = bVar.a(cVar.d, cVar.e, 4);
                str3 = str4;
                str2 = a2;
            }
            str2 = str;
            str3 = str4;
        } else {
            if (i == 5) {
                str4 = cVar.j;
                if (ac.a(str)) {
                    a2 = bVar.a(cVar.d, cVar.e, 5);
                    str3 = str4;
                    str2 = a2;
                }
            }
            str2 = str;
            str3 = str4;
        }
        String b = bVar.b(cVar.d, cVar.e, i);
        if (ac.a(str3)) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "doDownloadStickerImage:: url is null, infoType = %s", Integer.valueOf(i));
            com.sankuai.xm.base.util.b.a(bVar.d.remove(b), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(Callback<b.a> callback) {
                    Callback<b.a> callback2 = callback;
                    Object[] objArr2 = {callback2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27996bd6ee3eb170ca209b4d5a9c5e56", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27996bd6ee3eb170ca209b4d5a9c5e56")).booleanValue();
                    }
                    com.sankuai.xm.base.callback.a.a(callback2, -1, "cannot resolve url for type " + i);
                    return false;
                }
            });
        } else if (!z && k.f(str2)) {
            switch (i) {
                case 4:
                    cVar.k = str2;
                    break;
                case 5:
                    cVar.l = str2;
                    break;
            }
            com.sankuai.xm.base.util.b.a(bVar.d.remove(b), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(Callback<b.a> callback) {
                    Callback<b.a> callback2 = callback;
                    Object[] objArr2 = {callback2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18857a52795035bf1c907aee24a386f1", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18857a52795035bf1c907aee24a386f1")).booleanValue();
                    }
                    com.sankuai.xm.base.callback.a.a(callback2, cVar);
                    return false;
                }
            });
        } else {
            bVar.e.put(str3, new Pair<>(cVar, Integer.valueOf(i)));
            IMClient.a().a(str3, str2, 2, false, (String) null);
        }
    }

    public static /* synthetic */ void a(b bVar, final b.C1420b c1420b) {
        Object[] objArr = {c1420b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a0632517ccb4daf09f6e76ae14d20b85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a0632517ccb4daf09f6e76ae14d20b85");
            return;
        }
        com.sankuai.xm.log.c.b("EmotionServiceImpl", "doFetchPackages::params: %s, auth: %s", c1420b, Boolean.valueOf(d.d().a()));
        if (d.d().a()) {
            Collection<String> collection = c1420b.b;
            Object[] objArr2 = {collection};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            Map map = null;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d8a466dab54a05599e2ae3b99892e3ae", 6917529027641081856L)) {
                map = (Map) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d8a466dab54a05599e2ae3b99892e3ae");
            } else if (!com.sankuai.xm.base.util.b.a(collection)) {
                ArrayList arrayList = new ArrayList(collection);
                List<com.sankuai.xm.integration.emotion.entity.b> a2 = bVar.a(collection, false);
                HashMap hashMap = new HashMap();
                if (!com.sankuai.xm.base.util.b.a(a2)) {
                    for (com.sankuai.xm.integration.emotion.entity.b bVar2 : a2) {
                        hashMap.put(bVar2.b, bVar2.c);
                        arrayList.remove(bVar2.b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashMap.put((String) it.next(), null);
                }
                map = hashMap;
            }
            com.sankuai.xm.integration.emotion.a aVar = new com.sankuai.xm.integration.emotion.a(com.sankuai.xm.im.http.a.a("/uinfo/api/v1/stickerConf/getPackages"), map);
            aVar.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.integration.emotion.service.b.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(JSONObject jSONObject) {
                    Object[] objArr3 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6fab42b4a3cd826b7337c3aff8cb73f6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6fab42b4a3cd826b7337c3aff8cb73f6");
                        return;
                    }
                    b.this.c.remove(c1420b);
                    b.a(b.this, jSONObject);
                }

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f055df0f84d5399a46a2ad0448d4bcd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f055df0f84d5399a46a2ad0448d4bcd");
                    } else {
                        com.sankuai.xm.log.c.d("EmotionServiceImpl", "doFetchPackages::onFailure:: code: %s, message: %s", Integer.valueOf(i), str);
                    }
                }
            });
            g.a().a((e) aVar, 0L);
        }
    }

    public static /* synthetic */ void a(b bVar, final String str, final String str2, final String str3, final Callback callback) {
        Object[] objArr = {str, str2, str3, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "292f66309da54e83c531d6a82f52c4ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "292f66309da54e83c531d6a82f52c4ab");
            return;
        }
        com.sankuai.xm.log.c.b("EmotionServiceImpl", "doFetchStickerInfo::  packageId: %s, stickerId: %s, path: %s", str, str2, str3);
        com.sankuai.xm.integration.emotion.b bVar2 = new com.sankuai.xm.integration.emotion.b(com.sankuai.xm.im.http.a.a("/uinfo/api/v1/stickerConf/getOneSticker"), str, str2);
        bVar2.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.integration.emotion.service.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40e89a4621da75edd179ce2eb2b7e588", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40e89a4621da75edd179ce2eb2b7e588");
                    return;
                }
                com.sankuai.xm.log.c.a("EmotionServiceImpl", "doFetchSticker::onSuccess result: %s", jSONObject);
                c a2 = b.this.a(jSONObject, str, str3 != null ? str3 : b.this.a(str, str2, 3));
                if (a2 == null) {
                    Callback callback2 = callback;
                    com.sankuai.xm.base.callback.a.a(callback2, -1, "parse result failed: " + jSONObject);
                    return;
                }
                com.sankuai.xm.base.callback.a.a(callback, a2.clone());
            }

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(int i, String str4) {
                Object[] objArr2 = {Integer.valueOf(i), str4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2006e561b04b27fc8267f6731327455c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2006e561b04b27fc8267f6731327455c");
                    return;
                }
                com.sankuai.xm.log.c.d("EmotionServiceImpl", "doFetchSticker::onFailure: code: %s, message: %s", Integer.valueOf(i), str4);
                com.sankuai.xm.base.callback.a.a(callback, i, str4);
            }
        });
        g.a().a((e) bVar2, 0L);
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject) {
        boolean z;
        int i = 1;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b814b4c63766525c66e4d337edd6b5fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b814b4c63766525c66e4d337edd6b5fe");
        } else if (jSONObject == null) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveEmotionPackages:: result is null", new Object[0]);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveEmotionPackages:: result data is null", new Object[0]);
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("packages");
            if (optJSONObject2 == null) {
                com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveEmotionPackages:: result.packages is null", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            bVar.b.set(currentTimeMillis);
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                if (optJSONObject3 != null && optJSONObject3.length() > i) {
                    com.sankuai.xm.integration.emotion.entity.b bVar2 = new com.sankuai.xm.integration.emotion.entity.b(next);
                    bVar2.a(optJSONObject3);
                    bVar2.k = currentTimeMillis;
                    bVar.f.put(next, bVar2);
                    try {
                        optJSONObject3.put("lastQueryTime", currentTimeMillis);
                    } catch (JSONException e) {
                        com.sankuai.xm.log.c.a("EmotionServiceImpl", e);
                    }
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = next;
                    objArr2[i] = optJSONObject3;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "71b6416b6bae3ae392779a8da1d13eb5", 6917529027641081856L)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "71b6416b6bae3ae392779a8da1d13eb5")).booleanValue();
                    } else {
                        File file = new File(bVar.a(next, (String) null, 1));
                        boolean a2 = k.a(file, Base64.encodeToString(optJSONObject3.toString().getBytes(), 2), false);
                        if (a2) {
                            k.a(file.getParentFile(), file.getName());
                        }
                        z = a2;
                    }
                    if (!z) {
                        com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveEmotionPackages::writeFile failed.", new Object[0]);
                    }
                }
                i = 1;
            }
            m.b().a("emotion_last_fetch_time", currentTimeMillis);
        }
    }

    public static /* synthetic */ boolean a(b bVar, c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b7a3bd3026c6fdc34743caaefbf13eab", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b7a3bd3026c6fdc34743caaefbf13eab")).booleanValue() : cVar != null && System.currentTimeMillis() - cVar.c.k > 86400000;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d9f4896b7a423f76a0cf41c07be0b0c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d9f4896b7a423f76a0cf41c07be0b0c")).intValue();
        }
        if (this.k != null) {
            DownloadManager.getInstance().unregisterListener(this.k);
        }
        this.k = new com.sankuai.xm.im.transfer.download.c() { // from class: com.sankuai.xm.integration.emotion.service.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.transfer.download.c
            public final void a(String str, String str2, int i) {
            }

            @Override // com.sankuai.xm.im.transfer.download.c
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62aea8b641da92bdef691f4ca6a47b0a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62aea8b641da92bdef691f4ca6a47b0a");
                    return;
                }
                Pair pair = (Pair) b.this.e.remove(str);
                if (pair == null) {
                    return;
                }
                final b.a aVar = (b.a) pair.first;
                if (((Integer) pair.second).intValue() == 4) {
                    aVar.k = str2;
                } else if (((Integer) pair.second).intValue() == 5) {
                    aVar.l = str2;
                }
                com.sankuai.xm.base.util.b.a((List) b.this.d.remove(b.this.b(aVar.d, aVar.e, ((Integer) pair.second).intValue())), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(Callback<b.a> callback) {
                        Callback<b.a> callback2 = callback;
                        Object[] objArr3 = {callback2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4c46e7beaa7914b0af0b93d375e061ad", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4c46e7beaa7914b0af0b93d375e061ad")).booleanValue();
                        }
                        com.sankuai.xm.base.callback.a.a(callback2, aVar);
                        return false;
                    }
                });
            }

            @Override // com.sankuai.xm.im.transfer.download.c
            public final void a(String str, String str2, final int i, final String str3) {
                Object[] objArr2 = {str, str2, Integer.valueOf(i), str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4a748ee5baa5ee267db4b076c0b5d64", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4a748ee5baa5ee267db4b076c0b5d64");
                    return;
                }
                Pair pair = (Pair) b.this.e.remove(str);
                if (pair == null || pair.first == null) {
                    return;
                }
                com.sankuai.xm.base.util.b.a((List) b.this.d.remove(b.this.b(((c) pair.first).d, ((c) pair.first).e, ((Integer) pair.second).intValue())), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.1.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(Callback<b.a> callback) {
                        Callback<b.a> callback2 = callback;
                        Object[] objArr3 = {callback2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "29b3d8e83ee82dd5157476b4b45cec4f", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "29b3d8e83ee82dd5157476b4b45cec4f")).booleanValue();
                        }
                        com.sankuai.xm.base.callback.a.a(callback2, i, str3);
                        return false;
                    }
                });
            }
        };
        DownloadManager.getInstance().registerListener(this.k);
        if (this.l != null) {
            IMClient.a().b(this.l);
        }
        this.l = new IMClient.d() { // from class: com.sankuai.xm.integration.emotion.service.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(int i) {
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(long j, int i) {
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(com.sankuai.xm.im.connection.b bVar) {
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(boolean z) {
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(long j, String str, String str2, String str3) {
                Object[] objArr2 = {new Long(j), str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6012adaca561d0b374cda44b24eb5b1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6012adaca561d0b374cda44b24eb5b1");
                } else {
                    b.this.c();
                }
            }
        };
        IMClient.a().a(this.l);
        return super.a();
    }

    @Override // com.sankuai.xm.ui.service.b
    public final IExtraViewAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63923a54be03cc6ce695ae011e49ce24", 6917529027641081856L) ? (IExtraViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63923a54be03cc6ce695ae011e49ce24") : new CustomEmotionAdapter(this);
    }

    @Override // com.sankuai.xm.ui.service.b
    public final View a(@NonNull Context context, ViewGroup viewGroup, final EmotionPlugin emotionPlugin) {
        Object[] objArr = {context, viewGroup, emotionPlugin};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf65e46a87a29be5c2f1936c916911c", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf65e46a87a29be5c2f1936c916911c");
        }
        final EmotionOptionView emotionOptionView = new EmotionOptionView(context);
        emotionOptionView.a(emotionPlugin);
        final SessionParams sessionParams = com.sankuai.xm.imui.session.b.b(context).c;
        if (sessionParams.o != null) {
            List<com.sankuai.xm.integration.emotion.entity.b> a2 = a((Collection<String>) com.sankuai.xm.base.util.b.a(sessionParams.o), true);
            a(emotionOptionView, emotionPlugin, a2);
            if (com.sankuai.xm.base.util.b.b(a2) < com.sankuai.xm.base.util.b.c(sessionParams.o)) {
                com.sankuai.xm.log.c.b("EmotionServiceImpl", "createPanelView::cache size = " + com.sankuai.xm.base.util.b.b(a2), new Object[0]);
                com.sankuai.xm.threadpool.scheduler.a.b().a(24, 3, new Runnable() { // from class: com.sankuai.xm.integration.emotion.service.b.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d538fd3f94e82c94fc10e8affdbce0f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d538fd3f94e82c94fc10e8affdbce0f");
                            return;
                        }
                        b.this.a(emotionOptionView, emotionPlugin, b.this.a((Collection<String>) com.sankuai.xm.base.util.b.a(sessionParams.o), false));
                    }
                });
            }
        }
        return emotionOptionView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EmotionOptionView emotionOptionView, EmotionPlugin emotionPlugin, List<com.sankuai.xm.integration.emotion.entity.b> list) {
        Object[] objArr = {emotionOptionView, emotionPlugin, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3012d5405b99ef6ae1433698c37ea1e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3012d5405b99ef6ae1433698c37ea1e9");
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            List<com.sankuai.xm.imui.common.entity.a> emotionsForPanel = emotionPlugin == null ? null : emotionPlugin.getEmotionsForPanel();
            if (emotionsForPanel != null) {
                arrayList.addAll(emotionsForPanel);
            }
            for (com.sankuai.xm.integration.emotion.entity.b bVar : list) {
                arrayList.add(bVar.a());
            }
            com.sankuai.xm.log.c.b("EmotionServiceImpl", "createPanelView:: newEmotions size : %s", Integer.valueOf(arrayList.size()));
            if (com.sankuai.xm.base.util.b.a(list)) {
                return;
            }
            emotionOptionView.a(arrayList);
        }
    }

    @Override // com.sankuai.xm.ui.service.b
    public final int a(final b.C1420b c1420b) {
        boolean z;
        List arrayList;
        Object[] objArr = {c1420b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1118925f4ff5ce0d1195b92943d64d03", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1118925f4ff5ce0d1195b92943d64d03")).intValue();
        }
        if (c1420b == null || com.sankuai.xm.base.util.b.a(c1420b.b)) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "fetchPackages:: invalid params", new Object[0]);
            return 10011;
        }
        Object[] objArr2 = {c1420b};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        b.C1420b c1420b2 = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66e5069b786c3429687d8f47451d1134", 6917529027641081856L)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66e5069b786c3429687d8f47451d1134")).booleanValue();
        } else {
            Iterator<String> it = c1420b.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!k.f(a(it.next(), (String) null, 1))) {
                        break;
                    }
                } else {
                    if (this.b.get() <= 0) {
                        this.b.set(m.b().getLong("emotion_last_fetch_time", 0L));
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.b.get();
                    if (currentTimeMillis <= c1420b.c || currentTimeMillis <= 600000) {
                        z = false;
                    }
                }
            }
            z = true;
        }
        if (z) {
            Object[] objArr3 = {c1420b};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5fa7fc035f5a72ca0bb11e4c5c53b5aa", 6917529027641081856L)) {
                arrayList = (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5fa7fc035f5a72ca0bb11e4c5c53b5aa");
            } else {
                arrayList = new ArrayList(1);
                if (com.sankuai.xm.base.util.b.b(c1420b.b) <= com.sankuai.xm.integration.emotion.a.c) {
                    arrayList.add(c1420b);
                } else {
                    int i = 0;
                    for (String str : c1420b.b) {
                        if (i % com.sankuai.xm.integration.emotion.a.c == 0) {
                            b.C1420b c1420b3 = new b.C1420b();
                            c1420b3.c = c1420b.c;
                            c1420b3.b = new HashSet(com.sankuai.xm.integration.emotion.a.c);
                            arrayList.add(c1420b3);
                            c1420b2 = c1420b3;
                        }
                        c1420b2.b.add(str);
                        i++;
                    }
                }
            }
            if (!this.c.containsAll(arrayList)) {
                this.c.addAll(arrayList);
                c();
            }
        } else {
            com.sankuai.xm.log.c.b("EmotionServiceImpl", "fetchPackages:: not need to query, params: %s", c1420b);
            Object[] objArr4 = {c1420b};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1492bd8b8d63a5b762b946794886b6fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1492bd8b8d63a5b762b946794886b6fd");
            } else if (c1420b != null && c1420b.d) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    com.sankuai.xm.threadpool.scheduler.a.b().a(24, 3, new Runnable() { // from class: com.sankuai.xm.integration.emotion.service.b.9
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "706c7174e130b2655969558700a4f749", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "706c7174e130b2655969558700a4f749");
                            } else {
                                b.this.a(c1420b.b, false);
                            }
                        }
                    });
                } else {
                    a(c1420b.b, false);
                }
            }
        }
        return 0;
    }

    @Override // com.sankuai.xm.ui.service.b
    public final int a(@NonNull final String str, @NonNull final String str2, int i, final String str3, Callback<b.a> callback) {
        boolean z;
        Object[] objArr = {str, str2, 4, str3, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0703cc1fe7d816582d9d4aeeecc2b4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0703cc1fe7d816582d9d4aeeecc2b4")).intValue();
        }
        if (ac.a(str) || ac.a(str2)) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "fetchSticker:: invalid params, packageId: %s, stickerId: %s", str, str2);
            return 10011;
        }
        final String b = b(str, str2, 4);
        synchronized (this.d) {
            List<Callback<b.a>> list = this.d.get(b);
            if (list == null) {
                list = new ArrayList<>();
                this.d.put(b, list);
                z = false;
            } else {
                z = true;
            }
            list.add(callback);
        }
        if (z) {
            com.sankuai.xm.log.c.a("EmotionServiceImpl", "fetchSticker:: request is exist, packageId: %s, stickerId: %s", str, str2);
            return 0;
        }
        m.e().a(24, 3, new Runnable() { // from class: com.sankuai.xm.integration.emotion.service.b.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91f8a4e4bb9a00c7fe2b560cc0010b9e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91f8a4e4bb9a00c7fe2b560cc0010b9e");
                    return;
                }
                final c a2 = b.this.a(str, str2, false);
                if (a2 != null) {
                    a2 = a2.clone();
                }
                if (a2 != null && !b.a(b.this, a2)) {
                    switch (r4) {
                        case 3:
                            com.sankuai.xm.base.util.b.a((List) b.this.d.remove(b), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.5.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.base.util.b.a
                                public final /* synthetic */ boolean a(Callback<b.a> callback2) {
                                    Callback<b.a> callback3 = callback2;
                                    Object[] objArr3 = {callback3};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48b3aa8609e66d65ad677553c93742eb", 6917529027641081856L)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48b3aa8609e66d65ad677553c93742eb")).booleanValue();
                                    }
                                    com.sankuai.xm.base.callback.a.a(callback3, a2);
                                    return false;
                                }
                            });
                            return;
                        case 4:
                        case 5:
                            b.a(b.this, a2, r4, str3, false);
                            return;
                        default:
                            return;
                    }
                }
                b.a(b.this, str, str2, r4 == 3 ? str3 : null, new Callback<c>() { // from class: com.sankuai.xm.integration.emotion.service.b.5.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(c cVar) {
                        final c cVar2 = cVar;
                        Object[] objArr3 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "192c0fa7d0e2d8661950594accb0668d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "192c0fa7d0e2d8661950594accb0668d");
                        } else if (r4 == 4 || r4 == 5) {
                            b.a(b.this, cVar2, r4, str3, true);
                        } else {
                            com.sankuai.xm.base.util.b.a((List) b.this.d.remove(b), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.5.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.base.util.b.a
                                public final /* synthetic */ boolean a(Callback<b.a> callback2) {
                                    Callback<b.a> callback3 = callback2;
                                    Object[] objArr4 = {callback3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02cd6bfdad2eac5d28d0dee505637b63", 6917529027641081856L)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02cd6bfdad2eac5d28d0dee505637b63")).booleanValue();
                                    }
                                    com.sankuai.xm.base.callback.a.a(callback3, cVar2);
                                    return false;
                                }
                            });
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(final int i2, final String str4) {
                        Object[] objArr3 = {Integer.valueOf(i2), str4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42e4ba69d734100618310f6c1e174052", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42e4ba69d734100618310f6c1e174052");
                        } else {
                            com.sankuai.xm.base.util.b.a((List) b.this.d.remove(b), new b.a<Callback<b.a>>() { // from class: com.sankuai.xm.integration.emotion.service.b.5.2.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.base.util.b.a
                                public final /* synthetic */ boolean a(Callback<b.a> callback2) {
                                    Callback<b.a> callback3 = callback2;
                                    Object[] objArr4 = {callback3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fda4172f7965022cbbb0d5c773792e4b", 6917529027641081856L)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fda4172f7965022cbbb0d5c773792e4b")).booleanValue();
                                    }
                                    com.sankuai.xm.base.callback.a.a(callback3, i2, str4);
                                    return false;
                                }
                            });
                        }
                    }
                });
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778f3ae0ae97ccf377c83fa148b1ee8f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778f3ae0ae97ccf377c83fa148b1ee8f");
        }
        return str + CommonConstant.Symbol.UNDERLINE + str2 + CommonConstant.Symbol.UNDERLINE + i;
    }

    @Override // com.sankuai.xm.ui.service.b
    public final String a(@NonNull String str, @Nullable String str2, int i) {
        StringBuilder sb;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799a13f3573aa0db0d86376d87bae90f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799a13f3573aa0db0d86376d87bae90f");
        }
        String a2 = l.a(str2);
        switch (i) {
            case 1:
                a2 = "info";
                break;
            case 2:
                a2 = RemoteMessageConst.Notification.ICON;
                break;
            case 3:
                sb = new StringBuilder(CommonConstant.Symbol.DOT);
                sb.append(a2);
                a2 = sb.toString();
                break;
            case 4:
                break;
            case 5:
                sb = new StringBuilder(".thumb");
                sb.append(File.separator);
                sb.append(a2);
                a2 = sb.toString();
                break;
            default:
                StringBuilder sb2 = new StringBuilder(CommonConstant.Symbol.UNDERLINE);
                sb2.append(i);
                if (a2 == null) {
                    a2 = "";
                } else {
                    a2 = CommonConstant.Symbol.UNDERLINE + a2;
                }
                sb = sb2;
                sb.append(a2);
                a2 = sb.toString();
                break;
        }
        return k.f(IMClient.a().b(19), str + File.separator + a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0430764b9bbed2f4f9ded4cb2d358061", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0430764b9bbed2f4f9ded4cb2d358061");
            return;
        }
        com.sankuai.xm.log.c.b("EmotionServiceImpl", "triggerPackageInfoFetch:: pending size = %s", Integer.valueOf(com.sankuai.xm.base.util.b.b(this.c)));
        if (!d.d().a() || com.sankuai.xm.base.util.b.a(this.c)) {
            return;
        }
        com.sankuai.xm.threadpool.scheduler.a.b().a(24, 3, new Runnable() { // from class: com.sankuai.xm.integration.emotion.service.b.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57316cab17133d260677fe7c80bddf15", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57316cab17133d260677fe7c80bddf15");
                    return;
                }
                Iterator it = new ArrayList(b.this.c).iterator();
                while (it.hasNext()) {
                    b.a(b.this, (b.C1420b) it.next());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c a(JSONObject jSONObject, String str, String str2) {
        Object[] objArr = {jSONObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b642618ebc01fe42810ebe9a34ce36", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b642618ebc01fe42810ebe9a34ce36");
        }
        if (jSONObject == null) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveSticker:: result is null", new Object[0]);
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveSticker:: result data is null", new Object[0]);
            return null;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("package");
        if (optJSONObject2 == null) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveSticker:: result.package is null", new Object[0]);
            return null;
        }
        com.sankuai.xm.integration.emotion.entity.b bVar = new com.sankuai.xm.integration.emotion.entity.b(str);
        bVar.a(optJSONObject2);
        bVar.k = System.currentTimeMillis();
        c cVar = bVar.j;
        try {
            jSONObject.put("lastQueryTime", bVar.k);
        } catch (JSONException e) {
            com.sankuai.xm.log.c.a("EmotionServiceImpl", e);
        }
        LruCache<String, c> lruCache = this.j;
        lruCache.put(str + CommonConstant.Symbol.UNDERLINE + cVar.e, cVar);
        if (!k.a(new File(ac.a(str2) ? a(str, bVar.j.e, 3) : str2), Base64.encodeToString(jSONObject.toString().getBytes(), 2), false)) {
            com.sankuai.xm.log.c.d("EmotionServiceImpl", "parseAndSaveSticker::writeFile failed.", new Object[0]);
        }
        return bVar.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.sankuai.xm.integration.emotion.entity.b> a(Collection<String> collection, boolean z) {
        Object[] objArr = {collection, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2bbca7cec5c032958758ed4470c2df", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2bbca7cec5c032958758ed4470c2df");
        }
        if (com.sankuai.xm.base.util.b.a(collection)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            com.sankuai.xm.integration.emotion.entity.b bVar = this.f.get(str);
            if (bVar == null && !z) {
                String a2 = k.a(new File(a(str, (String) null, 1)));
                if (a2 != null) {
                    bVar = new com.sankuai.xm.integration.emotion.entity.b(str);
                    try {
                        bVar.a(new JSONObject(new String(Base64.decode(a2, 2))));
                    } catch (JSONException e) {
                        com.sankuai.xm.log.c.a("EmotionServiceImpl", e);
                        bVar = null;
                    }
                }
                if (bVar != null) {
                    this.f.put(str, bVar);
                }
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c a(String str, String str2, boolean z) {
        List<com.sankuai.xm.integration.emotion.entity.b> a2;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe524c65a1517382fe320afc7c439508", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe524c65a1517382fe320afc7c439508");
        }
        String str3 = str + CommonConstant.Symbol.UNDERLINE + str2;
        c cVar = this.j.get(str3);
        if (cVar == null) {
            File file = new File(a(str, str2, 3));
            if (file.exists()) {
                String a3 = k.a(file);
                if (!ac.a(a3)) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(a3, 2)));
                        com.sankuai.xm.integration.emotion.entity.b bVar = new com.sankuai.xm.integration.emotion.entity.b(str);
                        bVar.a(jSONObject);
                        cVar = bVar.j;
                    } catch (JSONException e) {
                        com.sankuai.xm.log.c.a("EmotionServiceImpl", e);
                        cVar = null;
                    }
                }
            }
            if (cVar == null && (a2 = a(com.sankuai.xm.base.util.b.a(str), z)) != null && a2.size() == 1) {
                cVar = a2.get(0).a(str2);
            }
            if (cVar != null) {
                this.j.put(str3, cVar);
            }
        }
        return cVar;
    }
}
