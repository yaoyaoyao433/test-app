package com.sankuai.waimai.store.poi.subscribe;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.poi.subscribe.b b;
    private final InterfaceC1283a c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.subscribe.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1283a {
        void a(long j, String str, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b {
        private static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4887ba6a05b26dad662ad6b2993900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4887ba6a05b26dad662ad6b2993900");
            return;
        }
        this.b = new com.sankuai.waimai.store.poi.subscribe.b();
        this.c = new InterfaceC1283a() { // from class: com.sankuai.waimai.store.poi.subscribe.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.subscribe.a.InterfaceC1283a
            public final void a(long j, String str, int i) {
                Object[] objArr2 = {new Long(j), str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c610570237a3539ba26db13ca1b3f4b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c610570237a3539ba26db13ca1b3f4b");
                    return;
                }
                a.this.b.a(j, i);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("action", "WMSMPoiSubscribeNotification");
                    jSONObject.put("poiID", j);
                    jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                    jSONObject.put("subscribe", i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JsHandlerFactory.publish(jSONObject);
                com.meituan.android.bus.a.a().c(new f(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, j), i));
            }
        };
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d1b014bea80b66467bd4917c85f32ef", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d1b014bea80b66467bd4917c85f32ef") : b.a;
    }

    public final void a(Activity activity, c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11fc598ec312b0fc1de91561aeba085b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11fc598ec312b0fc1de91561aeba085b");
            return;
        }
        cVar.g = this.c;
        com.sankuai.waimai.store.manager.user.a.a(activity, new d(cVar));
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d50c6b929a14a23784f3bc13add99f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d50c6b929a14a23784f3bc13add99f4");
            return;
        }
        try {
            this.b.registerObserver(eVar);
        } catch (Exception e) {
            if (k.a()) {
                throw e;
            }
        }
    }

    public final void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efe854d23f8335ae7242b1b1fd31013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efe854d23f8335ae7242b1b1fd31013");
            return;
        }
        try {
            this.b.unregisterObserver(eVar);
        } catch (Exception e) {
            if (k.a()) {
                throw e;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class c extends com.sankuai.waimai.store.base.net.k<PoiSubscribeResponse> {
        public static ChangeQuickRedirect e;
        private final long a;
        private String b;
        SCBaseActivity f;
        InterfaceC1283a g;

        public void a(int i) {
        }

        public abstract void c();

        public abstract String d();

        public c(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949c91b373604eaaf97f5d128f24a303", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949c91b373604eaaf97f5d128f24a303");
                return;
            }
            this.b = "";
            this.a = j;
        }

        public c(long j, String str) {
            Object[] objArr = {new Long(j), str};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4f793d0b4806c0ac418e6a695cf6227", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4f793d0b4806c0ac418e6a695cf6227");
                return;
            }
            this.b = "";
            this.a = j;
            this.b = str;
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3c60cbe557ec3b19894b1510b5b347", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3c60cbe557ec3b19894b1510b5b347");
            } else if (g()) {
            } else {
                e();
            }
        }

        public void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd233ba93f679aaa4d341d7bd9dff29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd233ba93f679aaa4d341d7bd9dff29");
            } else if (this.f != null) {
                this.f.u();
            }
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public void a(PoiSubscribeResponse poiSubscribeResponse) {
            Object[] objArr = {poiSubscribeResponse};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0074f5cd850b6575c4f4f30cecf466e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0074f5cd850b6575c4f4f30cecf466e6");
                return;
            }
            a(poiSubscribeResponse.subscribe);
            if (this.g != null) {
                this.g.a(this.a, this.b, poiSubscribeResponse.subscribe);
            }
            a(poiSubscribeResponse.msg);
        }

        public void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a84a13fa968255d850dd9f5aa08ccea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a84a13fa968255d850dd9f5aa08ccea");
            } else if (g() || TextUtils.isEmpty(str) || this.f == null) {
            } else {
                this.f.b_(str);
            }
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810d9ba2cf6f4949a709cd3b9f93e31b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810d9ba2cf6f4949a709cd3b9f93e31b");
                return;
            }
            String message = bVar.getMessage();
            if (TextUtils.isEmpty(message) && !g()) {
                message = d();
            }
            a(message);
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53e4a018a798f4add7ec0ceb791128c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53e4a018a798f4add7ec0ceb791128c");
            } else if (g()) {
            } else {
                f();
            }
        }

        public void f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6241565aef0ef9528196b1bc142c3f12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6241565aef0ef9528196b1bc142c3f12");
            } else if (this.f != null) {
                this.f.v();
            }
        }

        public boolean g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fa047b19d20df9015d18392cb14ad1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fa047b19d20df9015d18392cb14ad1")).booleanValue() : this.f == null || com.sankuai.waimai.store.util.b.a(this.f);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d implements Runnable {
        public static ChangeQuickRedirect a;
        @NonNull
        private final c b;

        private d(@NonNull c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01e1ab4e671636dbbd8bf597ebfa568", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01e1ab4e671636dbbd8bf597ebfa568");
            } else {
                this.b = cVar;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3d4feb1ce07288126fa705484072a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3d4feb1ce07288126fa705484072a4");
            } else {
                this.b.c();
            }
        }
    }

    public final void a(SCBaseActivity sCBaseActivity, c cVar) {
        Object[] objArr = {sCBaseActivity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7bfea8030c437e537fcbeb368b10ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7bfea8030c437e537fcbeb368b10ff2");
            return;
        }
        cVar.f = sCBaseActivity;
        cVar.g = this.c;
        com.sankuai.waimai.store.manager.user.a.a(sCBaseActivity, new d(cVar));
    }
}
