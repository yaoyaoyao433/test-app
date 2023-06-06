package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.sdk.comps.offlinemap.OfflineCity;
import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.sdk.comps.offlinemap.OfflineItemController;
import com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent;
import com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener;
import com.tencent.map.sdk.comps.offlinemap.OfflineNation;
import com.tencent.map.sdk.comps.offlinemap.OfflineProvince;
import com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.internal.by;
import com.tencent.mapsdk.internal.ds;
import com.tencent.mapsdk.internal.dt;
import com.tencent.mapsdk.internal.du;
import com.tencent.mapsdk.internal.jy;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ca extends bm implements OfflineMapComponent, by.a {
    public static final String a = "key_offline_map_opened_cities";
    public static final String b = "key_offline_map_config_version";
    public static final String c = "key_offline_map_config_md5";
    public static final String d = "key_offline_map_config_url";
    public static final String e = "sdk_offline_city_ver.json";
    public static final String f = "offline_city_list.json";
    private static final String g = "key_offline_map_items_state";
    private me h;
    private boolean i;
    private List<OfflineItem> j = new ArrayList();
    private List<OfflineItem> k = new ArrayList();
    private Map<String, a> l = new HashMap();
    private File m;
    private File n;
    private String o;
    private cb p;
    private Map<bz, by> q;
    private volatile Callback<List<OfflineItem>> r;
    private OfflineMapSyncedListener s;
    private volatile boolean t;
    private boolean u;

    static /* synthetic */ Callback b(ca caVar) {
        caVar.r = null;
        return null;
    }

    static /* synthetic */ boolean c(ca caVar) {
        caVar.t = false;
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(Context context) {
        super.a(context);
        mi a2 = mi.a(context, (TencentMapOptions) null);
        kd.a(a2.e);
        this.o = a2.e;
        this.m = new File(this.o, e);
        this.n = new File(this.o, f);
        this.q = new HashMap();
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(bn bnVar) {
        super.a(bnVar);
        this.i = bnVar.a.isOfflineMapEnable();
        this.h = mg.a(b(), bnVar.u().c);
        String b2 = this.h.b(g, "");
        kj.c(ki.u, "获取持久化状态, json：".concat(String.valueOf(b2)));
        if (!TextUtils.isEmpty(b2)) {
            try {
                for (a aVar : JsonUtils.parseToList(new JSONArray(b2), a.class, new Object[0])) {
                    this.l.put(aVar.a, aVar);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        c(bnVar);
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void b(bn bnVar) {
        super.b(bnVar);
        if (this.t) {
            this.r = null;
            this.t = false;
        }
        if (this.l.isEmpty()) {
            return;
        }
        String collectionToJson = JsonUtils.collectionToJson(this.l.values());
        kj.c(ki.u, "保存持久化状态, json：".concat(String.valueOf(collectionToJson)));
        this.h.a(g, collectionToJson);
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void b_() {
        super.b_();
        for (Map.Entry<bz, by> entry : this.q.entrySet()) {
            by value = entry.getValue();
            if (value != null) {
                value.b = null;
                value.a = null;
            }
            entry.setValue(null);
        }
        this.q.clear();
        this.r = null;
        this.s = null;
    }

    private void c(final bn bnVar) {
        String b2 = this.h.b(a, "");
        if (this.i || !TextUtils.isEmpty(b2)) {
            gs gsVar = bnVar.d;
            if (gsVar != null) {
                gsVar.o().a();
            }
            if (this.t) {
                return;
            }
            this.t = true;
            jy.a((jy.g) new jy.g<Object>() { // from class: com.tencent.mapsdk.internal.ca.2
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    ca.this.u = false;
                    if (!ca.this.i) {
                        ca.a(ca.this, bnVar);
                        return null;
                    }
                    ca.this.u = ca.this.e();
                    ca.this.u = ca.h(ca.this);
                    return null;
                }
            }).a((jy.b.a) null, (jy.a<jy.b.a>) new jy.a<Object>() { // from class: com.tencent.mapsdk.internal.ca.1
                @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
                public final void callback(Object obj) {
                    if (ca.this.r != null) {
                        ca.this.r.callback(ca.this.getOfflineItemList());
                        ca.b(ca.this);
                    }
                    ca.c(ca.this);
                    if (ca.this.s != null) {
                        ca.this.s.onSynced(ca.this.u);
                    }
                }
            });
        }
    }

    private List<OfflineItem> d() {
        ArrayList arrayList = new ArrayList();
        String[] split = this.h.b(a, "").split(CommonConstant.Symbol.COMMA);
        if (split.length != 0 && this.j != null) {
            for (OfflineItem offlineItem : this.j) {
                if (Arrays.binarySearch(split, offlineItem.getPinyin()) >= 0) {
                    arrayList.add(offlineItem);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() throws FileNotFoundException {
        bn c_ = c_();
        if (c_ == null) {
            return false;
        }
        int b2 = this.h.b(b);
        String a2 = this.h.a(c);
        kj.c(ki.u, "检查离线配置更新, 当前v:" + b2 + "|md5:" + a2 + "obj:" + this);
        ArrayList<FileUpdateReq> arrayList = new ArrayList<>();
        FileUpdateReq fileUpdateReq = new FileUpdateReq(e, b2, a2);
        arrayList.add(fileUpdateReq);
        dt.a<SCFileUpdateRsp> checkUpdate = ((cw) ((dk) ck.a(dk.class)).h()).checkUpdate(gy.i(), gy.d(), gy.l(), gy.g(), c_.u().b(), arrayList, c_.u().b(), c_.x(), "", c_.w(), "");
        kj.c(ki.u, "离线配置请求更新结束：" + checkUpdate.toHumanString());
        if (checkUpdate.available()) {
            FileUpdateRsp fileUpdateRsp = checkUpdate.a.vItems.get(0);
            String a3 = this.m.exists() ? ks.a(this.m) : null;
            if (this.m.exists() && (fileUpdateRsp == null || !e.equals(fileUpdateRsp.sName) || fileUpdateRsp.iVersion == fileUpdateReq.iVersion || TextUtils.isEmpty(fileUpdateRsp.sUpdateUrl) || fileUpdateRsp.iFileSize == 0 || fileUpdateRsp.iFileUpdated == 0 || TextUtils.isEmpty(fileUpdateRsp.sMd5) || fileUpdateRsp.sMd5.equals(a3))) {
                kj.c(ki.u, "跳过更新");
            } else {
                String str = fileUpdateRsp.sUpdateUrl;
                String str2 = fileUpdateRsp.sMd5;
                int i = fileUpdateRsp.iVersion;
                if (fileUpdateRsp.iFileUpdated == 0 && !this.m.exists()) {
                    str = this.h.b(d, "");
                    str2 = this.h.b(c, "");
                    i = this.h.b(b, 0);
                }
                if (TextUtils.isEmpty(str)) {
                    kj.d(ki.u, "离线配置文件的请求链接为空！");
                    return false;
                } else if (NetManager.getInstance().builder().url(str).downloadTo(this.m).available()) {
                    if (ks.a(this.m).equals(str2)) {
                        kj.c(ki.u, "离线配置文件下载成功");
                        this.h.a(b, i);
                        this.h.a(c, str2);
                        this.h.a(d, str);
                    } else {
                        kj.c(ki.u, "离线配置文件MD5校验失败");
                        kc.b(this.m);
                    }
                }
            }
        } else {
            kj.c(ki.u, "离线地图配置请求错误：" + checkUpdate.toHumanString());
        }
        if (this.m.exists()) {
            try {
                Object nextValue = new JSONTokener(new String(kc.c(this.m))).nextValue();
                if (nextValue instanceof JSONObject) {
                    this.p = (cb) JsonUtils.parseToModel((JSONObject) nextValue, cb.class, new Object[0]);
                    kj.c(ki.u, "创建离线配置文件对象数据：" + this.p);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            kj.d(ki.u, "离线配置文件不存在！");
        }
        if (this.p != null) {
            kj.c(ki.u, "获得离线配置成功！");
            return true;
        }
        return false;
    }

    private boolean f() throws JSONException {
        if (!this.n.exists()) {
            kj.c(ki.u, "请求离线城市列表...");
            ds.a downloadOfflineMapCityList = ((cw) ((dk) ck.a(dk.class)).h()).downloadOfflineMapCityList(this.o);
            downloadOfflineMapCityList.charset = "utf-8";
            if (downloadOfflineMapCityList.available()) {
                kj.c(ki.u, "离线城市列表下载成功");
                du.a aVar = new du.a(downloadOfflineMapCityList);
                if (aVar.available()) {
                    a(aVar.a);
                    kj.c(ki.u, "离线城市列表解析成功");
                }
            }
        } else {
            a(new String(kc.c(this.n)));
            kj.c(ki.u, "离线城市列表使用缓存");
        }
        if (this.j != null) {
            kj.c(ki.u, "获得离线城市列表成功！");
            return true;
        }
        return false;
    }

    private synchronized void a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Object nextValue = new JSONTokener(str).nextValue();
        if (nextValue instanceof JSONArray) {
            List<bx> parseToList = JsonUtils.parseToList((JSONArray) nextValue, bx.class, new Object[0]);
            if (!parseToList.isEmpty()) {
                this.j = new ArrayList();
                this.k = new ArrayList();
                for (bx bxVar : parseToList) {
                    if (!bxVar.b.startsWith(rj.f)) {
                        if (bxVar.c != null && !bxVar.c.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            OfflineProvince offlineProvince = new OfflineProvince();
                            offlineProvince.setName(bxVar.a);
                            offlineProvince.setPinyin(bxVar.b);
                            offlineProvince.setCities(arrayList);
                            this.k.add(offlineProvince);
                            for (bx bxVar2 : bxVar.c) {
                                OfflineCity a2 = bxVar2.a(offlineProvince);
                                this.j.add(a2);
                                arrayList.add(a2);
                            }
                        } else {
                            OfflineCity a3 = bxVar.a((OfflineProvince) null);
                            this.k.add(a3);
                            this.j.add(a3);
                        }
                    } else {
                        OfflineNation offlineNation = new OfflineNation();
                        offlineNation.setName(bxVar.a);
                        offlineNation.setPinyin(bxVar.b);
                        this.k.add(offlineNation);
                        this.j.add(offlineNation);
                    }
                }
                g();
            }
        }
    }

    private void g() {
        if (this.p == null || this.p.e == null || this.j.isEmpty()) {
            return;
        }
        kj.c(ki.u, "添加item的数据状态");
        Set<String> keySet = this.l.keySet();
        for (OfflineItem offlineItem : this.j) {
            Iterator<bz> it = this.p.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    bz next = it.next();
                    if (offlineItem.getPinyin().equals(next.c)) {
                        offlineItem.setSize(next.d);
                        Iterator<String> it2 = keySet.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (offlineItem.getPinyin().equals(it2.next())) {
                                    by a2 = a(offlineItem, (OfflineStatusChangedListener) null);
                                    if (a2 != null) {
                                        offlineItem.setUpgrade(a2.checkInvalidate());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        kj.c(ki.u, "添加item的数据状态完成！！");
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public boolean isOfflineMapEnable() {
        return this.i;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public void syncLatestData(OfflineMapSyncedListener offlineMapSyncedListener) {
        this.s = offlineMapSyncedListener;
        if (this.t) {
            return;
        }
        c(c_());
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public OfflineItemController getOfflineItemController(OfflineItem offlineItem, OfflineStatusChangedListener offlineStatusChangedListener) {
        if (this.i) {
            return a(offlineItem, offlineStatusChangedListener);
        }
        return null;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public synchronized List<OfflineItem> getOfflineItemList() {
        for (OfflineItem offlineItem : this.j) {
            a aVar = this.l.get(offlineItem.getPinyin());
            if (aVar != null) {
                offlineItem.setPercentage(aVar.b);
                offlineItem.setUpgrade(aVar.c);
            }
        }
        return this.k;
    }

    private by a(OfflineItem offlineItem, OfflineStatusChangedListener offlineStatusChangedListener) {
        bn c_ = c_();
        if (offlineItem == null || this.j == null || this.p == null || c_ == null) {
            kj.d(ki.u, "无效配置 config:" + this.p + "|item:" + offlineItem);
            return null;
        }
        boolean z = false;
        Iterator<OfflineItem> it = this.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() == offlineItem) {
                z = true;
                break;
            }
        }
        if (z) {
            bz a2 = this.p.a(offlineItem);
            if (a2 != null) {
                by byVar = this.q.get(a2);
                if (byVar == null) {
                    by byVar2 = new by(c_, this.o, offlineItem, a2, this.h, offlineStatusChangedListener);
                    this.q.put(a2, byVar2);
                    byVar = byVar2;
                }
                byVar.a = offlineStatusChangedListener;
                byVar.b = this;
                kj.c(ki.u, "获得离线城市[" + offlineItem.getName() + "]的配置成功！");
                return byVar;
            }
        } else {
            kj.d(ki.u, "无效城市：".concat(String.valueOf(offlineItem)));
        }
        return null;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public void getOfflineItemList(Callback<List<OfflineItem>> callback) {
        this.r = callback;
        if (this.t) {
            return;
        }
        c(c_());
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void a(OfflineItem offlineItem, boolean z) {
        String b2 = this.h.b(a, "");
        kj.c(ki.u, "当前开启城市IDS：".concat(String.valueOf(b2)));
        String[] split = b2.split(CommonConstant.Symbol.COMMA);
        int binarySearch = Arrays.binarySearch(split, offlineItem.getPinyin());
        if (z) {
            if (binarySearch < 0) {
                String str = b2 + offlineItem.getPinyin() + CommonConstant.Symbol.COMMA;
                kj.c(ki.u, "新增开启城市IDS：".concat(String.valueOf(str)));
                this.h.a(a, str);
            }
        } else if (binarySearch >= 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                if (!str2.equals(offlineItem.getPinyin())) {
                    sb.append(str2);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            String sb2 = sb.toString();
            kj.c(ki.u, "剩余开启城市IDS：".concat(String.valueOf(sb2)));
            this.h.a(a, sb2);
        }
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void a(OfflineItem offlineItem, int i) {
        if (offlineItem == null) {
            return;
        }
        String pinyin = offlineItem.getPinyin();
        a aVar = this.l.get(pinyin);
        if (aVar == null) {
            aVar = new a();
            this.l.put(pinyin, aVar);
        }
        aVar.a = pinyin;
        aVar.b = i;
        offlineItem.setPercentage(i);
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void b(OfflineItem offlineItem, boolean z) {
        if (offlineItem == null) {
            return;
        }
        String pinyin = offlineItem.getPinyin();
        a aVar = this.l.get(pinyin);
        if (aVar == null) {
            aVar = new a();
            this.l.put(pinyin, aVar);
        }
        aVar.a = pinyin;
        aVar.c = z;
        offlineItem.setUpgrade(z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends JsonComposer {
        String a;
        int b;
        boolean c;

        private a() {
        }
    }

    private void d(bn bnVar) {
        ArrayList<OfflineItem> arrayList = new ArrayList();
        String[] split = this.h.b(a, "").split(CommonConstant.Symbol.COMMA);
        if (split.length != 0 && this.j != null) {
            for (OfflineItem offlineItem : this.j) {
                if (Arrays.binarySearch(split, offlineItem.getPinyin()) >= 0) {
                    arrayList.add(offlineItem);
                }
            }
        }
        for (OfflineItem offlineItem2 : arrayList) {
            by a2 = a(offlineItem2, (OfflineStatusChangedListener) null);
            if (a2 != null) {
                a2.b(bnVar);
            }
        }
    }

    static /* synthetic */ void a(ca caVar, bn bnVar) {
        ArrayList<OfflineItem> arrayList = new ArrayList();
        String[] split = caVar.h.b(a, "").split(CommonConstant.Symbol.COMMA);
        if (split.length != 0 && caVar.j != null) {
            for (OfflineItem offlineItem : caVar.j) {
                if (Arrays.binarySearch(split, offlineItem.getPinyin()) >= 0) {
                    arrayList.add(offlineItem);
                }
            }
        }
        for (OfflineItem offlineItem2 : arrayList) {
            by a2 = caVar.a(offlineItem2, (OfflineStatusChangedListener) null);
            if (a2 != null) {
                a2.b(bnVar);
            }
        }
    }

    static /* synthetic */ boolean h(ca caVar) throws JSONException {
        if (!caVar.n.exists()) {
            kj.c(ki.u, "请求离线城市列表...");
            ds.a downloadOfflineMapCityList = ((cw) ((dk) ck.a(dk.class)).h()).downloadOfflineMapCityList(caVar.o);
            downloadOfflineMapCityList.charset = "utf-8";
            if (downloadOfflineMapCityList.available()) {
                kj.c(ki.u, "离线城市列表下载成功");
                du.a aVar = new du.a(downloadOfflineMapCityList);
                if (aVar.available()) {
                    caVar.a(aVar.a);
                    kj.c(ki.u, "离线城市列表解析成功");
                }
            }
        } else {
            caVar.a(new String(kc.c(caVar.n)));
            kj.c(ki.u, "离线城市列表使用缓存");
        }
        if (caVar.j != null) {
            kj.c(ki.u, "获得离线城市列表成功！");
            return true;
        }
        return false;
    }
}
