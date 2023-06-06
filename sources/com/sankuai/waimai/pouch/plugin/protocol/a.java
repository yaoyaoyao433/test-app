package com.sankuai.waimai.pouch.plugin.protocol;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.plugin.params.b;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T extends AbsWMPouchPlugin, K extends b> {
    public static ChangeQuickRedirect b;
    protected Map<String, T> c;
    protected K d;
    public int e;

    public abstract T a(String str, K k);

    public String a() {
        return null;
    }

    public a(List<String> list, K k) {
        Object[] objArr = {list, k};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad2cb2fd20855f24ad1dad64cc87202", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad2cb2fd20855f24ad1dad64cc87202");
            return;
        }
        this.e = 0;
        if (list == null || list.isEmpty()) {
            String a = a();
            if (!TextUtils.isEmpty(a)) {
                list = list == null ? new ArrayList<>() : list;
                list.add(a);
            }
        }
        if (list != null && !list.isEmpty()) {
            this.e = list.size();
            this.c = new HashMap();
            for (String str : list) {
                try {
                    T a2 = a(str, (String) k);
                    if (a2 != null) {
                        this.c.put(str, a2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.d = k;
    }

    public a(K k, List<Map<String, Object>> list) {
        Object[] objArr = {k, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b166fdc950852c81bf82115b65ea4cb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b166fdc950852c81bf82115b65ea4cb8");
            return;
        }
        this.e = 0;
        if (list == null || list.isEmpty()) {
            String a = a();
            if (!TextUtils.isEmpty(a)) {
                this.e = 1;
                this.c = new HashMap();
                try {
                    T a2 = a(a, (String) k);
                    if (a2 != null) {
                        this.c.put(a, a2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            this.e = list.size();
            this.c = new HashMap();
            for (Map<String, Object> map : list) {
                try {
                    String str = (String) map.get("plugin_name");
                    Map<String, Object> map2 = (Map) map.get("params");
                    T a3 = a(str, (String) k);
                    if (a3 != null) {
                        a3.setExtraParams(map2);
                        this.c.put(str, a3);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.d = k;
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4077ddf3146563fbfcf2b2e2e9efa509", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4077ddf3146563fbfcf2b2e2e9efa509")).booleanValue() : (this.c == null || this.c.isEmpty()) ? false : true;
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a661ae87ade8bed83098b7ef69215581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a661ae87ade8bed83098b7ef69215581");
        } else if (g()) {
            for (Map.Entry<String, T> entry : this.c.entrySet()) {
                entry.getValue().reset();
            }
        }
    }

    public final void a(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc66b06cb9ce11299ed6adae2450dd0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc66b06cb9ce11299ed6adae2450dd0a");
        } else if (g()) {
            for (Map.Entry<String, T> entry : this.c.entrySet()) {
                entry.getValue().onViewAttached(view, aVar);
            }
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e0eb9070a8e0089d3e4e09a029f668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e0eb9070a8e0089d3e4e09a029f668");
        } else if (g()) {
            for (Map.Entry<String, T> entry : this.c.entrySet()) {
                entry.getValue().onRenderFailed();
            }
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54ac4d5d8b81d624f481e02118d77cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54ac4d5d8b81d624f481e02118d77cf");
        } else if (g()) {
            for (Map.Entry<String, T> entry : this.c.entrySet()) {
                entry.getValue().onReceiveJSEvent(str, map);
            }
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a4b058fc5953cc3c9ea10c813663e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a4b058fc5953cc3c9ea10c813663e1");
        } else if (g()) {
            for (Map.Entry<String, T> entry : this.c.entrySet()) {
                entry.getValue().onDetachedFromContainer();
            }
        }
    }
}
