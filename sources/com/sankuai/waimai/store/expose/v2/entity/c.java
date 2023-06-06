package com.sankuai.waimai.store.expose.v2.entity;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends b {
    public static ChangeQuickRedirect h;
    protected a i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public c(String str, View view) {
        super(str, view);
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b469c3d0b3bace6e4f6e9c61f742212", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b469c3d0b3bace6e4f6e9c61f742212");
        }
    }

    public c(String str, View view, String str2) {
        super((String) null, view, str2);
        Object[] objArr = {null, view, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f529f23e8f71054b91957701d84e5a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f529f23e8f71054b91957701d84e5a1");
        }
    }

    public c(String str, String str2, View view) {
        super(str, str2, view);
        Object[] objArr = {str, str2, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0956502df92f17bfec4a1099848406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0956502df92f17bfec4a1099848406");
        }
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.b
    public void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c298fa98d1fec91ea13ffea22e2b22fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c298fa98d1fec91ea13ffea22e2b22fe");
            return;
        }
        super.a(map);
        if (this.i != null) {
            this.i.a();
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6c01da775e70df9d8274836254ce0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6c01da775e70df9d8274836254ce0d");
            return;
        }
        super.g();
        this.i = null;
    }
}
