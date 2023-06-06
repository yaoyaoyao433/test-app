package com.sankuai.waimai.business.page.kingkong.future.ai;

import android.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.ai.e;
import com.sankuai.waimai.business.page.common.list.ai.f;
import com.sankuai.waimai.business.page.common.list.ai.g;
import com.sankuai.waimai.foundation.utils.ae;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static b f;
    public C0799b c;
    public e d;
    public com.sankuai.waimai.business.page.common.net.request.a e;
    private LongSparseArray<C0799b> g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c5861b3ca2c6da998a464c3d4241d848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c5861b3ca2c6da998a464c3d4241d848");
        } else if (bVar.c != null) {
            bVar.c.d = -1L;
        }
    }

    public static /* synthetic */ boolean a(b bVar, JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "112c3a1329817a5ef5dc07caa3f518d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "112c3a1329817a5ef5dc07caa3f518d6")).booleanValue();
        }
        if (jSONObject != null) {
            return jSONObject.optBoolean("trigger_dynamic_paging");
        }
        return false;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4c43e2e448e46aae1b6eca7f4aeb29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4c43e2e448e46aae1b6eca7f4aeb29");
            return;
        }
        this.g = new LongSparseArray<>();
        this.d = new e();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc45804b3281d48aa330942358869261", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc45804b3281d48aa330942358869261");
        }
        if (f == null) {
            f = new b();
        }
        return f;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39967d309420eed35a368ade8aa83d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39967d309420eed35a368ade8aa83d38");
        } else {
            this.g.clear();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2977b122149d388a0c481c266d235634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2977b122149d388a0c481c266d235634");
            return;
        }
        C0799b c0799b = this.g.get(j);
        if (c0799b == null) {
            c0799b = new C0799b();
            this.g.put(j, c0799b);
        }
        this.c = c0799b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.ai.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0799b {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;
        public long d;
        public int e;
        public int f;
        public int g;
        public int h;
        public JSONObject i;
        public int j;
        public int k;

        public C0799b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c905b8281c926c21179bb97f1cf8af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c905b8281c926c21179bb97f1cf8af");
                return;
            }
            this.b = "";
            this.c = 0L;
            this.d = -1L;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.j = 0;
            this.k = 2;
        }

        public static String a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a65ff8abaac4b49516a487891a1a1e68", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a65ff8abaac4b49516a487891a1a1e68");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("factlist_offset_after_dedup", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("extra_info", jSONObject2);
                jSONObject3.put("request_type", 2);
                jSONObject.put("module_action", jSONObject3);
                if (g.a().b()) {
                    if (g.a().d != null) {
                        jSONObject.put("exp_info", f.a().d);
                    }
                } else if (f.a().d != null) {
                    jSONObject.put("exp_info", f.a().d);
                }
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }

        String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9682e7254bf2392cb88c87b042649147", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9682e7254bf2392cb88c87b042649147");
            }
            if (b.b) {
                ae.b(com.meituan.android.singleton.b.a, this.i.toString());
                com.sankuai.waimai.foundation.utils.log.a.e("SilentRefreshHelper", "getAiData: " + this.i.toString(), new Object[0]);
            }
            JSONObject optJSONObject = this.i.optJSONObject("user_action_data");
            if (optJSONObject != null) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("module_action");
                if (optJSONObject2 == null) {
                    try {
                        optJSONObject2 = new JSONObject();
                        optJSONObject.put("module_action", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                optJSONObject2.put("request_type", 1);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("extra_info");
                if (optJSONObject3 == null) {
                    optJSONObject3 = new JSONObject();
                    optJSONObject2.put("extra_info", optJSONObject3);
                }
                optJSONObject3.put("factlist_offset_after_dedup", this.h);
                return optJSONObject.toString();
            }
            return "";
        }

        String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948eb3cc641c28c4bc46bfa84aaf48b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948eb3cc641c28c4bc46bfa84aaf48b4");
            }
            if (b.b) {
                ae.b(com.meituan.android.singleton.b.a, this.i.toString());
                com.sankuai.waimai.foundation.utils.log.a.e("SilentRefreshHelper", "getAiTryNewIntentData: " + this.i.toString(), new Object[0]);
            }
            JSONObject optJSONObject = this.i.optJSONObject("data");
            if (optJSONObject != null) {
                try {
                    if (optJSONObject.optJSONObject("current_action") == null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("current_action", jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("view_max", this.h);
                    jSONObject2.put("request_type", 1);
                    optJSONObject.put("module_action", jSONObject2);
                    if (optJSONObject.optJSONObject("global_action") == null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("global_action", jSONObject3);
                    }
                    if (optJSONObject.optJSONObject("exp_info") == null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("exp_info", jSONObject4);
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("trigger_info");
                    JSONObject jSONObject5 = optJSONObject2;
                    if (optJSONObject2 == null) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("trigger_info", jSONObject6);
                        jSONObject5 = jSONObject6;
                    }
                    jSONObject5.put("intent_type", jSONObject5.optInt("intent_type"));
                    jSONObject5.put("intent_value", jSONObject5.optInt("intent_value"));
                    this.j = jSONObject5.optInt("intent_type");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return optJSONObject.toString();
            }
            return "";
        }
    }

    public final String a(int i) {
        String a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e42df468824b444b133e386dd02501", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e42df468824b444b133e386dd02501");
        }
        C0799b c0799b = this.c;
        if (c0799b != null) {
            if (i == 3 || i == 6) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = C0799b.a;
                if (PatchProxy.isSupport(objArr2, c0799b, changeQuickRedirect2, false, "a134ca71ae1601b9af2d637e3a3472cd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, c0799b, changeQuickRedirect2, false, "a134ca71ae1601b9af2d637e3a3472cd");
                }
                if (c0799b.i != null) {
                    if (g.a().b()) {
                        a2 = c0799b.b();
                    } else {
                        a2 = c0799b.a();
                        c0799b.j = 0;
                    }
                    c0799b.k = 1;
                    c0799b.i = null;
                    return a2;
                }
                String a3 = C0799b.a(c0799b.h);
                c0799b.k = 2;
                c0799b.j = 0;
                return a3;
            }
            return C0799b.a(0);
        }
        return "";
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a100b62a8fde7fd0b95dbcbca7ed6964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a100b62a8fde7fd0b95dbcbca7ed6964");
            return;
        }
        C0799b c0799b = this.c;
        if (c0799b != null) {
            c0799b.h = i;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d095f85cf590f7a5a52f742679331a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d095f85cf590f7a5a52f742679331a2");
            return;
        }
        C0799b c0799b = this.c;
        if (c0799b != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = C0799b.a;
            if (PatchProxy.isSupport(objArr2, c0799b, changeQuickRedirect2, false, "76c89d86f4e0a50bc08b4eeed317da9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0799b, changeQuickRedirect2, false, "76c89d86f4e0a50bc08b4eeed317da9d");
                return;
            }
            c0799b.c = 0L;
            c0799b.b = "";
            c0799b.d = -1L;
            c0799b.e = 0;
            c0799b.f = 0;
            c0799b.g = 0;
        }
    }
}
