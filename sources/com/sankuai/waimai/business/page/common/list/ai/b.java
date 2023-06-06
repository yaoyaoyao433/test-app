package com.sankuai.waimai.business.page.common.list.ai;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;
    public c c;
    public com.sankuai.waimai.business.page.common.list.ai.common.e d;
    public InterfaceC0760b e;
    public boolean f;
    public boolean g;
    public com.sankuai.waimai.rocks.view.recyclerview.b h;
    a i;
    private com.sankuai.waimai.business.page.common.list.ai.common.a j;
    private com.sankuai.waimai.business.page.common.list.ai.common.b<JSONObject> k;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.common.list.ai.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0760b {
        void a(@NonNull a aVar);
    }

    public static /* synthetic */ boolean a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4851ed515341ac7fd26ff86ad24a7bcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4851ed515341ac7fd26ff86ad24a7bcd")).booleanValue();
        }
        Map<String, String> map = bVar.j.e;
        if (map != null) {
            return "1".equals(map.get("is_exposure"));
        }
        return false;
    }

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d68c1284ed8c41efdc710af7ec9a7d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d68c1284ed8c41efdc710af7ec9a7d2");
            return;
        }
        this.j = new com.sankuai.waimai.business.page.common.list.ai.common.d("mix_dynamicPaging_exp");
        this.f = false;
        this.g = false;
        this.k = new com.sankuai.waimai.business.page.common.list.ai.common.b<JSONObject>() { // from class: com.sankuai.waimai.business.page.common.list.ai.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.list.ai.common.b
            public final /* synthetic */ void a(JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d79c3bd9e83785b42ce27d148d9a43c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d79c3bd9e83785b42ce27d148d9a43c");
                    return;
                }
                a a2 = a.a(jSONObject2);
                b.this.i = a2;
                if (b.this.e == null || !b.a(b.this) || b.this.b >= b.this.c() || a2.d <= 0) {
                    return;
                }
                b.this.b++;
                b.this.e.a(a2);
            }

            @Override // com.sankuai.waimai.business.page.common.list.ai.common.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2574fe3ea3398e92b5dc2a6c903766c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2574fe3ea3398e92b5dc2a6c903766c1");
                } else if (b.this.e != null) {
                    b.a(b.this);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.sankuai.waimai.business.page.common.list.ai.common.b
            /* renamed from: b */
            public JSONObject a(AlitaJSValue alitaJSValue) {
                Object[] objArr2 = {alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fa58ebd849a8ecbd5834db909d43cf", RobustBitConfig.DEFAULT_VALUE)) {
                    return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fa58ebd849a8ecbd5834db909d43cf");
                }
                try {
                    return new JSONObject(alitaJSValue.stringValue());
                } catch (JSONException unused) {
                    return null;
                }
            }
        };
        this.c = cVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45a1e5530e5034b2b19ccdc4c54eb10c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45a1e5530e5034b2b19ccdc4c54eb10c");
            return;
        }
        com.sankuai.waimai.business.page.common.list.ai.common.e eVar = new com.sankuai.waimai.business.page.common.list.ai.common.e();
        eVar.b = this.j;
        eVar.c = this.k;
        this.d = eVar;
        this.b = 0;
    }

    private void a(JSONObject jSONObject, boolean z) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32c641e23e6f6a316e3c488bead4eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32c641e23e6f6a316e3c488bead4eaf");
        } else if (jSONObject == null) {
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_type", z ? 1 : 2);
                jSONObject.put("module_action", jSONObject2);
            } catch (JSONException unused) {
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099b60cfd260b8b02c5ad54248b5af52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099b60cfd260b8b02c5ad54248b5af52");
            return;
        }
        if (this.d != null) {
            com.sankuai.waimai.business.page.common.list.ai.common.e eVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.common.list.ai.common.e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "72fb9b3abb31a7d00ef5547ba5d09b3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "72fb9b3abb31a7d00ef5547ba5d09b3e");
            } else {
                AlitaAutoRunManager a2 = com.sankuai.waimai.alita.core.event.autorunner.c.a().a(eVar.b.b());
                if (a2 != null) {
                    a2.b(eVar.b.a(), eVar.d);
                }
                eVar.c = null;
                eVar.b = null;
            }
            this.d = null;
        }
        this.h = null;
        this.b = 0;
        this.e = null;
        this.f = false;
        this.g = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public JSONObject c;
        public int d;
        public int e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0a34f7d08c4d82d70eb34a8f09c761", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0a34f7d08c4d82d70eb34a8f09c761");
                return;
            }
            this.b = 0;
            this.d = 0;
            this.e = 2;
        }

        public static a a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            int i;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df63076d4bba07888e19b3f502601812", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df63076d4bba07888e19b3f502601812");
            }
            try {
                jSONObject2 = jSONObject.getJSONObject("data");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            try {
                i = jSONObject2.getJSONObject("data").getJSONObject("trigger_info").getInt("intent_type");
            } catch (JSONException unused2) {
                i = 0;
                a aVar = new a();
                aVar.c = jSONObject2;
                aVar.d = i;
                aVar.e = 1;
                return aVar;
            }
            a aVar2 = new a();
            aVar2.c = jSONObject2;
            aVar2.d = i;
            aVar2.e = 1;
            return aVar2;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279a4cdc1b4321c70d2e2e1774325fd2", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279a4cdc1b4321c70d2e2e1774325fd2");
            }
            return "PoiDynamicRecord{mSilentRefreshStartPoiIndex=" + this.b + ", mCacheAIData=" + this.c + ", mIntentType=" + this.d + ", mRequestType=" + this.e + '}';
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758f1845f157b92aa955b6dd2fb55cc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758f1845f157b92aa955b6dd2fb55cc6")).intValue();
        }
        Map<String, String> map = this.j.e;
        if (map != null) {
            try {
                return Integer.parseInt(map.get("offset_x"));
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return 0;
    }

    int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf713cff502ea9deb2cc07c9e7d28852", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf713cff502ea9deb2cc07c9e7d28852")).intValue();
        }
        Map<String, String> map = this.j.e;
        if (map != null) {
            try {
                return Integer.parseInt(map.get("n_max"));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public final void a(RocksServerModel rocksServerModel, int i, int i2) {
        JSONObject jSONObject;
        Object[] objArr = {rocksServerModel, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa31e749b7d5f9cb095ee911c5a1334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa31e749b7d5f9cb095ee911c5a1334");
        } else if (rocksServerModel != null && rocksServerModel.moduleList != null && rocksServerModel.moduleList.size() != 0) {
            for (int i3 = 0; i3 < rocksServerModel.moduleList.size(); i3++) {
                try {
                    RocksServerModel rocksServerModel2 = rocksServerModel.moduleList.get(i3);
                    if (TextUtils.isEmpty(rocksServerModel2.stringData)) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(rocksServerModel2.stringData);
                    }
                    jSONObject.put("request_type", 1);
                    jSONObject.put("seqNumber", i);
                    jSONObject.put("intent_type", i2);
                    rocksServerModel2.stringData = jSONObject.toString();
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    public final String a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9688ffbd2d62161a3fe818a1f486091", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9688ffbd2d62161a3fe818a1f486091");
        }
        if (aVar != null) {
            a(aVar.c, true);
            return aVar.c.toString();
        } else if (this.i == null) {
            return "";
        } else {
            a(this.i.c, false);
            return this.i.c.toString();
        }
    }

    public static void a(RocksServerModel rocksServerModel, int i) {
        JSONObject jSONObject;
        Object[] objArr = {rocksServerModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d58e545c026ab5a9cd7a8f2f2e19269c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d58e545c026ab5a9cd7a8f2f2e19269c");
        } else if (rocksServerModel != null && rocksServerModel.moduleList != null && rocksServerModel.moduleList.size() != 0) {
            for (int i2 = 0; i2 < rocksServerModel.moduleList.size(); i2++) {
                try {
                    RocksServerModel rocksServerModel2 = rocksServerModel.moduleList.get(i2);
                    if (TextUtils.isEmpty(rocksServerModel2.stringData)) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(rocksServerModel2.stringData);
                    }
                    jSONObject.put("seqNumber", i);
                    rocksServerModel2.stringData = jSONObject.toString();
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
