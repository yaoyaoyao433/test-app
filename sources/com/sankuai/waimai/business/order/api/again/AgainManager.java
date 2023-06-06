package com.sankuai.waimai.business.order.api.again;

import android.content.Context;
import android.net.Uri;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.order.IAgainOrderService;
import com.sankuai.waimai.foundation.router.interfaces.d;
import com.sankuai.waimai.router.annotation.RouterProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AgainManager implements IAgainOrderService {
    public static final String CHANNEL_CODE = "code";
    public static final String EXTRA_ORDER_ID = "order_id";
    public static final String EXTRA_POI_ID = "poi_id";
    public static final String EXTRA_POI_NAME = "poi_name";
    public static final String EXTRA_USER_ID = "user_id";
    public static final String EXTRA_USE_API_ADDRESS = "use_api_address";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AgainManager sInstance;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public Context a;
        public String b;
        public long d;
        public String f;
        public String c = "0";
        public String e = "";
        public boolean g = false;
        public boolean h = true;
    }

    @RouterProvider
    public static AgainManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53dd73e8d7b9c1aca1a0ae6c2296eed7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgainManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53dd73e8d7b9c1aca1a0ae6c2296eed7");
        }
        if (sInstance == null) {
            synchronized (AgainManager.class) {
                if (sInstance == null) {
                    sInstance = new AgainManager();
                }
            }
        }
        return sInstance;
    }

    public void orderAgain(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58c0726c23275cc775d3b5ba1a84da47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58c0726c23275cc775d3b5ba1a84da47");
            return;
        }
        Context context = aVar.a;
        if (context != null) {
            Uri.Builder appendQueryParameter = Uri.parse(d.f(context)).buildUpon().path(context.getString(R.string.wm_order_again_scheme_path)).appendQueryParameter(context.getString(R.string.wm_order_again_order_id), aVar.b).appendQueryParameter(context.getString(R.string.wm_order_again_user_id), aVar.c);
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.d);
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("poiId", sb.toString());
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("poiName", aVar.f);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.g);
            Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("is_multi_person", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(aVar.h);
            com.sankuai.waimai.foundation.router.a.a(context, appendQueryParameter4.appendQueryParameter(EXTRA_USE_API_ADDRESS, sb3.toString()).appendQueryParameter("code", "5").build().toString());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.order.IAgainOrderService
    public void orderAgain(com.sankuai.waimai.foundation.core.service.order.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d2a4f7c58e31e8893f79e26c85b2556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d2a4f7c58e31e8893f79e26c85b2556");
        } else {
            orderAgain(new b().a(bVar.a).a(bVar.b).a(bVar.d).c(bVar.e).b(bVar.c).d(bVar.f).b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public a b;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782758788fa2f7474464bb48b7bea88e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782758788fa2f7474464bb48b7bea88e");
            } else {
                this.b = new a();
            }
        }

        public final b a(Context context) {
            this.b.a = context;
            return this;
        }

        public final b a(String str) {
            this.b.b = str;
            return this;
        }

        public final b b(String str) {
            this.b.c = str;
            return this;
        }

        public final b a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae050e9d292de11afe8e84c2bdde561", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae050e9d292de11afe8e84c2bdde561");
            }
            this.b.d = j;
            return this;
        }

        public final b c(String str) {
            this.b.e = str;
            return this;
        }

        public final b d(String str) {
            this.b.f = str;
            return this;
        }
    }
}
