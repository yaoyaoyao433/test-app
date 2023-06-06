package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class f {
    public static ChangeQuickRedirect a = null;
    private static String d = "gaea";
    protected List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a> b;
    protected com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a c;
    private d e;
    private File f;

    public abstract String a();

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd57af08d5290da9938e9ca9f4d7c9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd57af08d5290da9938e9ca9f4d7c9f");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.e = new d();
        Context context = com.meituan.android.singleton.b.a;
        this.f = q.a(context, "waimai", File.separator + d + File.separator);
    }

    public final com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fd4f74f29f6b8109e468dbf53ef9fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fd4f74f29f6b8109e468dbf53ef9fc");
        }
        for (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a aVar : this.b) {
            if (aVar != null && !TextUtils.isEmpty(str) && aVar.b.equals(str)) {
                return aVar;
            }
        }
        return this.c;
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc501a0f5a20c1ffe01a5a307755d0a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc501a0f5a20c1ffe01a5a307755d0a5")).booleanValue();
        }
        for (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a aVar : this.b) {
            if (aVar != null && !TextUtils.isEmpty(str) && aVar.b.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8959e2cfea5808320519f1800adc4487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8959e2cfea5808320519f1800adc4487");
            return;
        }
        this.b.clear();
        List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a> list = bVar.c;
        List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a> d2 = d();
        if (!com.sankuai.waimai.modular.utils.a.a(list)) {
            Object[] objArr2 = {list, d2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "421e311fe95644ddd7cd5be6a1668773", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "421e311fe95644ddd7cd5be6a1668773");
            } else {
                Iterator<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a> it = d2.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a next = it.next();
                    if (list.contains(next)) {
                        list.remove(next);
                    } else if (next != null) {
                        it.remove();
                        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.a(new File(c(), next.a()));
                    }
                }
            }
            this.b.addAll(d2);
            for (final com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a aVar : list) {
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17d426bd94dc3a688446edcd548faecc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17d426bd94dc3a688446edcd548faecc");
                } else {
                    final d dVar = this.e;
                    String str = aVar.d;
                    final d.a aVar2 = new d.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.f.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.d.a
                        public final void a(String str2) {
                            Object[] objArr4 = {str2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ab00582ecacdd78547a41c4d986170ae", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ab00582ecacdd78547a41c4d986170ae");
                                return;
                            }
                            String a2 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.b.a(str2);
                            if (aVar.c.equals(a2)) {
                                File file = new File(f.this.c(), aVar.a());
                                try {
                                    file.getParentFile().mkdirs();
                                    file.createNewFile();
                                    com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.a(file, str2, false);
                                    com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a aVar3 = aVar;
                                    Object[] objArr5 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "eff2d4b071fa7e85af2dd3ada6139bf0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "eff2d4b071fa7e85af2dd3ada6139bf0");
                                    } else {
                                        aVar3.e = new JSONObject(str2);
                                    }
                                    f.this.b.add(aVar);
                                    String str3 = aVar.b;
                                    String str4 = aVar.d;
                                    String str5 = aVar.c;
                                    String a3 = f.this.a();
                                    Object[] objArr6 = {str3, str4, str5, a3};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a;
                                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "28678f1bc31e25033483641e7757763c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "28678f1bc31e25033483641e7757763c");
                                        return;
                                    }
                                    com.sankuai.waimai.platform.capacity.log.c.a().a(10000, "restaurant_dynamic_template_download", SystemClock.elapsedRealtime());
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("code", 10000);
                                        jSONObject.put("templateId", str3);
                                        jSONObject.put("url", str4);
                                        jSONObject.put("md5", str5);
                                        jSONObject.put("page_scene", a3);
                                        com.sankuai.waimai.platform.capacity.log.b.a(new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.a("restaurant_dynamic_template_download", "10000").d(jSONObject.toString()).b());
                                        return;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                } catch (Exception e2) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                                    com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(10004, aVar.b, aVar.d, aVar.c, a2, e2.getMessage(), f.this.a());
                                    return;
                                }
                            }
                            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(10005, aVar.b, aVar.d, aVar.c, a2, "MD5 check fail", f.this.a());
                        }

                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.d.a
                        public final void a(int i) {
                            Object[] objArr4 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a8692b7a4d53b59f798ff99bc14004e5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a8692b7a4d53b59f798ff99bc14004e5");
                            } else {
                                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(i, aVar.b, aVar.d, aVar.c, "", "NET Error", f.this.a());
                            }
                        }
                    };
                    Object[] objArr4 = {str, aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "fac757b6d6dcf5ee8dfe2845cb2a8877", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "fac757b6d6dcf5ee8dfe2845cb2a8877");
                    } else {
                        dVar.c.downloadFile(str).a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.d.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<ap> call, Response<ap> response) {
                                InputStream source;
                                Object[] objArr5 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7f03b58bde6f27b8c22c5c6124124627", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7f03b58bde6f27b8c22c5c6124124627");
                                } else if (response.f()) {
                                    InputStream inputStream = null;
                                    try {
                                        try {
                                            try {
                                                source = response.e().source();
                                            } catch (IOException unused) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            aVar2.a(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.a(source));
                                        } catch (IOException unused2) {
                                            inputStream = source;
                                            aVar2.a(10004);
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = source;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                            throw th;
                                        }
                                        if (source != null) {
                                            source.close();
                                        }
                                    } catch (IOException unused4) {
                                    }
                                } else {
                                    aVar2.a(10003);
                                }
                            }

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onFailure(Call<ap> call, Throwable th) {
                                Object[] objArr5 = {call, th};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "732a1e6bd396f8f4618dadc806b88b1d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "732a1e6bd396f8f4618dadc806b88b1d");
                                } else {
                                    aVar2.a(10003);
                                }
                            }
                        });
                    }
                }
            }
            return;
        }
        this.b.addAll(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747c3b149a8746772475e19420c3730c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747c3b149a8746772475e19420c3730c") : new File(this.f, a());
    }

    private List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a> d() {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4cfe35791528c5402008d1501f42c7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4cfe35791528c5402008d1501f42c7b");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c);
        File file = new File(this.f, a());
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.exists() && file2.canRead()) {
                    String[] split = file2.getName().split("--");
                    if (split == null || split.length < 2) {
                        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.a(file2);
                    } else {
                        String str = split[0];
                        String str2 = split[1];
                        String b = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.b(file2);
                        if (str2.equals(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.b.a(b))) {
                            try {
                                arrayList.add(new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a(str, str2, "", new JSONObject(b)));
                            } catch (JSONException unused) {
                            }
                        }
                        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.a(file2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String b() {
        List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97646c6deaaf0f91ab040668125f54f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97646c6deaaf0f91ab040668125f54f");
        }
        JSONArray jSONArray = new JSONArray();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae1f82da75d156f58232e4c5746e1f99", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae1f82da75d156f58232e4c5746e1f99");
        } else {
            if (CollectionUtils.isEmpty(this.b)) {
                this.b.add(this.c);
            }
            list = this.b;
        }
        for (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a aVar : list) {
            jSONArray.put(aVar.b);
        }
        return jSONArray.toString();
    }
}
