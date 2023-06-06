package com.meituan.android.mrn.containerplugin;

import com.meituan.android.mrn.config.horn.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private List<com.meituan.android.mrn.containerplugin.plugincore.a> b;
    private Map<String, List<com.meituan.android.mrn.containerplugin.plugincore.a>> c;
    private String d;
    private volatile boolean e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbf6d9e0867e9e1c347060fcc14640bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbf6d9e0867e9e1c347060fcc14640bb");
            return;
        }
        this.b = null;
        this.c = new HashMap();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5927b3bcac2d3a1490d91c0c923234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5927b3bcac2d3a1490d91c0c923234");
            return;
        }
        this.d = str;
        this.e = d.b.a();
    }

    public final <S, P> void a(com.meituan.android.mrn.containerplugin.event.a<S, P> aVar, P p) {
        Object[] objArr = {aVar, p};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b629d49fd9fd16c5b0e19b9e54f7734b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b629d49fd9fd16c5b0e19b9e54f7734b");
        } else if (this.e) {
            a();
            b(aVar, p);
        }
    }

    private <S, P> void b(com.meituan.android.mrn.containerplugin.event.a<S, P> aVar, P p) {
        List<com.meituan.android.mrn.containerplugin.plugincore.a> list;
        Object[] objArr = {aVar, p};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8fa2849bd9215b39fbdc35972d6d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8fa2849bd9215b39fbdc35972d6d4a");
        } else if (aVar != null && (p instanceof com.meituan.android.mrn.containerplugin.plugincore.b) && (list = this.c.get(aVar.a())) != null && list.size() > 0) {
            try {
                for (com.meituan.android.mrn.containerplugin.plugincore.a aVar2 : list) {
                    if (aVar2 != null) {
                        aVar.a(aVar.a(), aVar2, p);
                    }
                }
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("mrnContainerPlugin", th.getMessage(), th);
                th.printStackTrace();
            }
        }
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9a702380c74468852b6825c522b934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9a702380c74468852b6825c522b934");
            return;
        }
        if (this.b == null) {
            this.b = b.a(this.d);
        }
        if (this.b != null && this.b.size() > 0) {
            Iterator<com.meituan.android.mrn.containerplugin.plugincore.a> it = this.b.iterator();
            while (it.hasNext()) {
                com.facebook.common.logging.a.b("mrnContainerPlugin", it.next().a() + StringUtil.SPACE);
            }
            if (this.c == null || this.c.size() <= 0) {
                try {
                    for (com.meituan.android.mrn.containerplugin.plugincore.a aVar : this.b) {
                        for (Class<?> cls : aVar.getClass().getInterfaces()) {
                            String str = (String) cls.getDeclaredField("NAME").get(aVar);
                            List<com.meituan.android.mrn.containerplugin.plugincore.a> list = this.c.get(str);
                            if (list == null) {
                                list = new ArrayList<>();
                                this.c.put(str, list);
                            }
                            if (!list.contains(aVar)) {
                                list.add(aVar);
                            } else {
                                throw new RuntimeException("重复添加！！");
                            }
                        }
                    }
                } catch (IllegalAccessException e) {
                    com.facebook.common.logging.a.d("mrnContainerPlugin", e.getMessage(), e);
                    e.printStackTrace();
                } catch (NoSuchFieldException e2) {
                    com.facebook.common.logging.a.d("mrnContainerPlugin", e2.getMessage(), e2);
                    e2.printStackTrace();
                }
            }
        }
    }
}
