package com.sankuai.waimai.mach.parser;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.o;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    Map<String, Object> b;
    final g c;

    public a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9dc897199d741596cf9e13460d6ef1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9dc897199d741596cf9e13460d6ef1e");
            return;
        }
        this.b = new HashMap();
        this.c = gVar;
    }

    @Override // com.sankuai.waimai.mach.parser.b
    public final Object a(String str, @Nonnull String str2, @Nullable Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e104cee31f8036d66672b859627d92", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e104cee31f8036d66672b859627d92");
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        try {
            return a(map, map2).c;
        } catch (Exception e) {
            a(str, str2, e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.mach.parser.b
    public final Boolean b(String str, @Nonnull String str2, @Nullable Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b44019e708ec0f99eb4459b0a27e8da", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b44019e708ec0f99eb4459b0a27e8da");
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        try {
            return a(map, map2).c();
        } catch (Exception e) {
            a(str, str2, e);
            return null;
        }
    }

    private com.sankuai.waimai.mach.expressionv3.c a(Map<String, Object> map, Map<String, Object> map2) throws com.sankuai.waimai.mach.expressionv3.b {
        Map map3;
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6d95dbc73e61365418ab46b7ae8141", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.expressionv3.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6d95dbc73e61365418ab46b7ae8141");
        }
        if (map2 != null && map2.size() > 0) {
            map3 = new HashMap(this.b);
            map3.putAll(map2);
        } else {
            map3 = this.b;
        }
        return com.sankuai.waimai.mach.expressionv3.a.a(map, (Map<String, Object>) map3, true);
    }

    @Override // com.sankuai.waimai.mach.parser.b
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff0f8107dd0ee0aa0b5eedfc0186b64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff0f8107dd0ee0aa0b5eedfc0186b64");
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            this.b.put(str, obj);
        }
    }

    @Override // com.sankuai.waimai.mach.parser.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29fe671840ebcd54591d1795e4ba3f49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29fe671840ebcd54591d1795e4ba3f49");
        } else {
            this.b.remove(str);
        }
    }

    private void a(final String str, final String str2, final Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8954ef94320be909b64fdafc999764ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8954ef94320be909b64fdafc999764ae");
        } else {
            com.sankuai.waimai.mach.utils.e.a(new Runnable() { // from class: com.sankuai.waimai.mach.parser.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dabb81954bec4b19f8a512fbfa9bb809", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dabb81954bec4b19f8a512fbfa9bb809");
                    } else if (a.this.c != null) {
                        if (a.this.c instanceof o) {
                            o oVar = (o) a.this.c;
                            String str3 = str;
                            String str4 = str2;
                            Object[] objArr3 = {str3, str4, th};
                            ChangeQuickRedirect changeQuickRedirect3 = o.a;
                            if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "59e9d652ab1049c1c726a495e6818fcf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "59e9d652ab1049c1c726a495e6818fcf");
                                return;
                            } else {
                                oVar.a(str3, str4);
                                return;
                            }
                        }
                        a.this.c.a(str, str2);
                    }
                }
            });
        }
    }
}
