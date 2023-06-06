package com.sankuai.waimai.business.page.kingkong.future.ai;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.business.page.common.list.ai.common.d;
import com.sankuai.waimai.business.page.common.list.ai.common.e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    int b;
    public b c;
    c d;
    public com.sankuai.waimai.rocks.view.recyclerview.b e;
    C0798a f;
    int g;
    private com.sankuai.waimai.business.page.common.list.ai.common.a h;
    private e i;
    private boolean j;
    private boolean k;
    private com.sankuai.waimai.business.page.common.list.ai.common.b<JSONObject> l;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
    }

    public static /* synthetic */ boolean a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "47cae14aee6957125f51ccc3be32fa90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "47cae14aee6957125f51ccc3be32fa90")).booleanValue();
        }
        Map<String, String> map = aVar.h.e;
        if (map != null) {
            return "1".equals(map.get("is_exposure"));
        }
        return false;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683001a37eba138cb87c03bbcc01a265", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683001a37eba138cb87c03bbcc01a265");
            return;
        }
        this.h = new d("mix_dynamicPaging_exp");
        this.j = false;
        this.k = false;
        this.g = 0;
        this.l = new com.sankuai.waimai.business.page.common.list.ai.common.b<JSONObject>() { // from class: com.sankuai.waimai.business.page.kingkong.future.ai.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.list.ai.common.b
            public final /* synthetic */ void a(JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eecff6efcf43a9e8ca040c811712b449", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eecff6efcf43a9e8ca040c811712b449");
                    return;
                }
                C0798a a2 = C0798a.a(jSONObject2);
                a.this.f = a2;
                a.this.g = a2.d;
                if (a.this.d == null || !a.a(a.this) || a.this.b >= a.this.a() || a2.d <= 0) {
                    return;
                }
                a.this.b++;
            }

            @Override // com.sankuai.waimai.business.page.common.list.ai.common.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3fe028a2a42886b01292556da12a43c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3fe028a2a42886b01292556da12a43c");
                } else if (a.this.d != null) {
                    a.a(a.this);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.sankuai.waimai.business.page.common.list.ai.common.b
            /* renamed from: b */
            public JSONObject a(AlitaJSValue alitaJSValue) {
                Object[] objArr2 = {alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b67259e732fd3a2baa57375051525d35", RobustBitConfig.DEFAULT_VALUE)) {
                    return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b67259e732fd3a2baa57375051525d35");
                }
                try {
                    return new JSONObject(alitaJSValue.stringValue());
                } catch (JSONException unused) {
                    return null;
                }
            }
        };
        this.c = new b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f57eac59e39b8366634f537f9d3897dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f57eac59e39b8366634f537f9d3897dd");
            return;
        }
        e eVar = new e();
        eVar.b = this.h;
        eVar.c = this.l;
        this.i = eVar;
        this.b = 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b {
        public static ChangeQuickRedirect a;
        private int f = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;

        public b() {
        }

        public final void a(int i) {
            if (i > this.c) {
                this.c = i;
            }
        }

        public final void b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adabaeeb45fd324e45daba5e22336d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adabaeeb45fd324e45daba5e22336d7");
                return;
            }
            this.f = i;
            if (this.f > this.b) {
                this.b = this.f;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.ai.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0798a {
        public static ChangeQuickRedirect a;
        public int b;
        public JSONObject c;
        public int d;
        public int e;

        public C0798a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd24dee515c9f913c983dd7b8b5604d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd24dee515c9f913c983dd7b8b5604d3");
                return;
            }
            this.b = 0;
            this.d = 0;
            this.e = 2;
        }

        public static C0798a a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            int i;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eee628fde6b105c5565aab350562be3b", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0798a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eee628fde6b105c5565aab350562be3b");
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
                C0798a c0798a = new C0798a();
                c0798a.c = jSONObject2;
                c0798a.d = i;
                c0798a.e = 1;
                return c0798a;
            }
            C0798a c0798a2 = new C0798a();
            c0798a2.c = jSONObject2;
            c0798a2.d = i;
            c0798a2.e = 1;
            return c0798a2;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e72db8589c07f46aa17639ed6c5efd5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e72db8589c07f46aa17639ed6c5efd5");
            }
            return "PoiDynamicRecord{mSilentRefreshStartPoiIndex=" + this.b + ", mCacheAIData=" + this.c + ", mIntentType=" + this.d + ", mRequestType=" + this.e + '}';
        }
    }

    int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aada840c4cc3361bbf3536ef5a72aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aada840c4cc3361bbf3536ef5a72aa6")).intValue();
        }
        Map<String, String> map = this.h.e;
        if (map != null) {
            try {
                return Integer.parseInt(map.get("n_max"));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }
}
