package com.meituan.android.common.locate.controller;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.locate.locator.trigger.b;
import com.meituan.android.common.locate.model.b;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.t;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.sniffer.util.GsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e implements f.a {
    public static int a = 10;
    public static double b = 50.0d;
    public static int c = 20;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean d = false;
    public static boolean e = false;
    private static e f;
    private final SharedPreferences g;
    private b.a h;
    private final LinkedList<com.meituan.android.common.locate.model.b> i;
    private final LinkedList<com.meituan.android.common.locate.model.b> j;
    private final LinkedList<com.meituan.android.common.locate.model.b> k;
    private String l;
    private int m;
    private com.meituan.android.common.locate.util.a n;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e51f1f75beb8c18eef4b6ebc3e78049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e51f1f75beb8c18eef4b6ebc3e78049");
            return;
        }
        this.i = new LinkedList<>();
        this.j = new LinkedList<>();
        this.k = new LinkedList<>();
        this.m = 2;
        this.g = com.meituan.android.common.locate.reporter.f.b();
        if (this.g != null) {
            com.meituan.android.common.locate.reporter.f.a(this);
            a(this.g.getString("upload_location", ""));
        }
        d = true;
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f8a95913bdf80e05df864e70511eb86", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f8a95913bdf80e05df864e70511eb86");
        }
        if (f == null) {
            synchronized (e.class) {
                if (f == null) {
                    f = new e();
                }
            }
        }
        return f;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9732410c032553f219127f288bd260d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9732410c032553f219127f288bd260d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.m = jSONObject.optInt("lastpoint_storeCapacity", 5);
                a = jSONObject.optInt("lastpoint_filter_interval_second", 10);
                c = jSONObject.optInt("trackpoint_storeCapacity", 20);
                b = jSONObject.optDouble("trackpoint_filterDist", 50.0d);
            } catch (JSONException e2) {
                LogUtils.a(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LinkedList<com.meituan.android.common.locate.model.b> linkedList, b.c cVar) {
        Object[] objArr = {linkedList, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a597575757682004b7d64629c9db1ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a597575757682004b7d64629c9db1ef");
        } else if (!b(linkedList, cVar) || linkedList.size() < c || this.h == null) {
        } else {
            this.h.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(LinkedList<com.meituan.android.common.locate.model.b> linkedList, com.meituan.android.common.locate.model.b bVar) {
        Object[] objArr = {linkedList, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56bd6f62e448cee00def22e1a5d6698c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56bd6f62e448cee00def22e1a5d6698c");
            return;
        }
        if (b(linkedList, bVar)) {
            while (linkedList.size() > this.m) {
                linkedList.removeFirst();
            }
        }
    }

    private synchronized void a(LinkedList<com.meituan.android.common.locate.model.b> linkedList, String str, Type type) {
        Object[] objArr = {linkedList, str, type};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca81aad4cf981be8a205c9a0cd42d07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca81aad4cf981be8a205c9a0cd42d07a");
            return;
        }
        if (linkedList.size() < this.m) {
            String b2 = this.n.a().b(str, (String) null, "cache_sp_name");
            if (!TextUtils.isEmpty(b2)) {
                List list = (List) GsonUtil.getGson().fromJson(b2, type);
                long c2 = t.a(g.a()).c();
                if (list != null && list.size() > 0) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        com.meituan.android.common.locate.model.b bVar = (com.meituan.android.common.locate.model.b) list.get(size);
                        if (bVar != null && System.currentTimeMillis() - bVar.a <= c2) {
                            if (linkedList.size() >= this.m) {
                                break;
                            }
                            linkedList.add(0, bVar);
                        }
                    }
                }
            }
        }
    }

    private void a(List<com.meituan.android.common.locate.model.b> list, List<com.meituan.android.common.locate.model.b> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8de84a72b1eb2660850798c8a797e12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8de84a72b1eb2660850798c8a797e12e");
        } else if (list2 != null && list2.size() != 0) {
            long c2 = t.a(g.a()).c();
            for (com.meituan.android.common.locate.model.b bVar : list2) {
                if (System.currentTimeMillis() - bVar.a <= c2) {
                    list.add(bVar);
                }
            }
        }
    }

    private boolean b(LinkedList<com.meituan.android.common.locate.model.b> linkedList, com.meituan.android.common.locate.model.b bVar) {
        Object[] objArr = {linkedList, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd9106b614c0d3ea5409ad6202b50b6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd9106b614c0d3ea5409ad6202b50b6e")).booleanValue();
        }
        if (linkedList.size() == 0) {
            linkedList.add(bVar);
            return false;
        } else if (bVar.a(linkedList.get(linkedList.size() - 1))) {
            linkedList.add(bVar);
            LogUtils.a("TrackPointManager store point ok : " + bVar.f);
            return true;
        } else {
            return false;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "555c1a312858c3bbddd3920f28a61a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "555c1a312858c3bbddd3920f28a61a8f");
        } else if (!f.a().d() || e) {
        } else {
            e = true;
            this.n = com.meituan.android.common.locate.util.a.a(g.a());
            a(this.i, "gps_point_list", new TypeToken<List<b.C0216b>>() { // from class: com.meituan.android.common.locate.controller.e.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
            a(this.j, "gears_point_list", new TypeToken<List<b.a>>() { // from class: com.meituan.android.common.locate.controller.e.2
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        }
    }

    public void a(b.a aVar) {
        this.h = aVar;
    }

    public synchronized void a(final com.meituan.android.common.locate.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb12139a791164d0193b22a11c2190e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb12139a791164d0193b22a11c2190e4");
        } else {
            com.meituan.android.common.locate.util.f.a().a(new Runnable() { // from class: com.meituan.android.common.locate.controller.e.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bd7cf4761fd3eae8dff662abe4be596c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bd7cf4761fd3eae8dff662abe4be596c");
                    } else if (bVar == null || e.this.m <= 0) {
                        LogUtils.a("TrackPointManager track point is null return");
                    } else {
                        if (bVar instanceof b.a) {
                            e.this.a(e.this.j, bVar);
                            if (f.a().d() && e.this.n != null) {
                                e.this.n.a().a("gears_point_list", GsonUtil.getCommandGson().toJson(e.this.j), "cache_sp_name");
                            }
                        }
                        if (bVar instanceof b.C0216b) {
                            e.this.a(e.this.i, bVar);
                            if (f.a().d() && e.this.n != null) {
                                e.this.n.a().a("gps_point_list", GsonUtil.getCommandGson().toJson(e.this.i), "cache_sp_name");
                            }
                        }
                        if (bVar instanceof b.c) {
                            e.this.a((LinkedList<com.meituan.android.common.locate.model.b>) e.this.k, (b.c) bVar);
                        }
                    }
                }
            });
        }
    }

    public synchronized void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f95173c329824c108b59c727fd9feb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f95173c329824c108b59c727fd9feb5");
            return;
        }
        try {
            JSONArray b2 = b();
            if (b2 != null && b2.length() > 0) {
                jSONObject.put("last_points", b2);
            }
        } catch (Exception e2) {
            LogUtils.a(e2);
        }
    }

    public synchronized JSONArray b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9cf8511c3cf0258fb41bf3e852d96c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9cf8511c3cf0258fb41bf3e852d96c6");
        } else if (this.m <= 0) {
            LogUtils.a("last point capacity illegality");
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            c();
            if (f.a().d()) {
                a(arrayList, this.i);
            } else {
                arrayList.addAll(this.i);
            }
            if (t.a(g.a()).d()) {
                a(arrayList, this.j);
            } else {
                arrayList.addAll(this.j);
            }
            if (arrayList.size() <= 0) {
                LogUtils.a("TrackPointManager no last points");
                return null;
            }
            LogUtils.a("TrackPointManager " + GsonUtil.getGson().toJson(arrayList));
            com.meituan.android.common.locate.util.e.a(arrayList);
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.meituan.android.common.locate.model.b bVar = (com.meituan.android.common.locate.model.b) it.next();
                if (bVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        com.meituan.android.common.locate.util.e.a(bVar, jSONObject);
                        jSONArray.put(jSONObject);
                    } catch (Exception e2) {
                        LogUtils.a(e2);
                    }
                }
            }
            return jSONArray;
        }
    }

    public synchronized void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7174ed956a1be6984cbae75449aa7ed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7174ed956a1be6984cbae75449aa7ed1");
            return;
        }
        if (c > 0 && this.k.size() != 0) {
            ArrayList arrayList = new ArrayList(this.k);
            com.meituan.android.common.locate.util.e.a(arrayList);
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.meituan.android.common.locate.model.b bVar = (com.meituan.android.common.locate.model.b) it.next();
                if (bVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        com.meituan.android.common.locate.util.e.a(bVar, jSONObject2);
                        jSONArray.put(jSONObject2);
                    } catch (Exception e2) {
                        LogUtils.a(e2);
                    }
                }
            }
            try {
                if (jSONArray.length() > 0) {
                    jSONObject.put("track_points", jSONArray);
                }
                this.k.clear();
                return;
            } catch (Exception e3) {
                LogUtils.a(e3);
                return;
            }
        }
        LogUtils.a("track point capacity illegality");
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0738548e36dc5f71283fe19c3791040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0738548e36dc5f71283fe19c3791040");
        } else if (this.g != null) {
            String string = this.g.getString("upload_location", "");
            if (string.equals(this.l)) {
                return;
            }
            LogUtils.a("new config info is : " + string);
            this.l = string;
            a(string);
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }
}
