package com.dianping.sdk.pike.knb;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.nvtunnelkit.utils.f;
import com.dianping.sdk.pike.agg.g;
import com.dianping.sdk.pike.c;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.j;
import com.dianping.sdk.pike.packet.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a e;
    Map<String, d> b;
    Map<String, com.dianping.sdk.pike.agg.a> c;
    Map<String, j> d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833a5c02568fc73aca5b384cf50c7e03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833a5c02568fc73aca5b384cf50c7e03");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17f7f96ab9bb9c36c523073b4da441a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17f7f96ab9bb9c36c523073b4da441a7");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    public final void a(String str, String str2, @NonNull final BaseJsHandler baseJsHandler) {
        Object[] objArr = {str, str2, baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8045ea9510f3c528b46b84e6ee221f11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8045ea9510f3c528b46b84e6ee221f11");
        } else if (TextUtils.isEmpty(str)) {
            baseJsHandler.jsCallbackErrorMsg("bzId is null or empty");
        } else {
            d dVar = this.b.get(str);
            if (dVar != null) {
                com.dianping.sdk.pike.a aVar = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.8
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.a
                    public final void a(String str3) {
                        Object[] objArr2 = {str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f1080442b54ee5f6b73b77994b3a832", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f1080442b54ee5f6b73b77994b3a832");
                        } else {
                            baseJsHandler.jsCallback();
                        }
                    }

                    @Override // com.dianping.sdk.pike.a
                    public final void a(int i, String str3) {
                        Object[] objArr2 = {Integer.valueOf(i), str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf27a304f528870afa3acbfdafd61e9d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf27a304f528870afa3acbfdafd61e9d");
                        } else {
                            baseJsHandler.jsCallbackError(i, str3);
                        }
                    }
                };
                Object[] objArr2 = {str2, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "40ec665594e3591e34d01701b30ca845", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "40ec665594e3591e34d01701b30ca845");
                    return;
                } else if (dVar.a(aVar)) {
                    if (f.a(str2)) {
                        dVar.a(aVar, -14, "remove alias is null.");
                        return;
                    } else {
                        dVar.a(str2, false, aVar);
                        return;
                    }
                } else {
                    return;
                }
            }
            baseJsHandler.jsCallbackErrorMsg("start client first");
        }
    }

    public final void b(String str, String str2, @NonNull final BaseJsHandler baseJsHandler) {
        Object[] objArr = {str, str2, baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3de93a06bfa59342206c32ac130d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3de93a06bfa59342206c32ac130d23");
        } else if (TextUtils.isEmpty(str)) {
            baseJsHandler.jsCallbackErrorMsg("bzId is null or empty");
        } else {
            d dVar = this.b.get(str);
            if (dVar != null) {
                com.dianping.sdk.pike.a aVar = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.10
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.a
                    public final void a(String str3) {
                        Object[] objArr2 = {str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33a9f82d0b6e0aaca4a0e3ac6548a38b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33a9f82d0b6e0aaca4a0e3ac6548a38b");
                        } else {
                            baseJsHandler.jsCallback();
                        }
                    }

                    @Override // com.dianping.sdk.pike.a
                    public final void a(int i, String str3) {
                        Object[] objArr2 = {Integer.valueOf(i), str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b8d985dba2ba53da3b9d82637776999", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b8d985dba2ba53da3b9d82637776999");
                        } else {
                            baseJsHandler.jsCallbackError(i, str3);
                        }
                    }
                };
                Object[] objArr2 = {str2, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "88c7a1f0b1cc25f241e6b688a5fe6f38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "88c7a1f0b1cc25f241e6b688a5fe6f38");
                    return;
                } else if (dVar.a(aVar)) {
                    if (f.a(str2)) {
                        dVar.a(aVar, -22, "unbind tag is null.");
                        return;
                    } else {
                        dVar.b(str2, false, aVar);
                        return;
                    }
                } else {
                    return;
                }
            }
            baseJsHandler.jsCallbackErrorMsg("start client first");
        }
    }

    public final void a(String str, String str2, int i, String str3, @NonNull final BaseJsHandler baseJsHandler) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff46c2a201514df722021518565de1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff46c2a201514df722021518565de1f");
        } else if (TextUtils.isEmpty(str)) {
            baseJsHandler.jsCallbackErrorMsg("bzId is null or empty");
        } else {
            final com.dianping.sdk.pike.agg.a aVar = this.c.get(str);
            if (aVar != null) {
                final g gVar = new g();
                gVar.b = str2;
                gVar.c = str3;
                gVar.d = i > 1 ? g.a.IMPORTENT : g.a.ORDINARY;
                final com.dianping.sdk.pike.a aVar2 = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.a
                    public final void a(String str4) {
                        Object[] objArr2 = {str4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bd8865a7d6fcefff5823fe16f174de1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bd8865a7d6fcefff5823fe16f174de1");
                        } else {
                            baseJsHandler.jsCallback();
                        }
                    }

                    @Override // com.dianping.sdk.pike.a
                    public final void a(int i2, String str4) {
                        Object[] objArr2 = {Integer.valueOf(i2), str4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df3556f48fc7bc9def272bcc791fb378", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df3556f48fc7bc9def272bcc791fb378");
                        } else {
                            baseJsHandler.jsCallbackError(i2, str4);
                        }
                    }
                };
                Object[] objArr2 = {gVar, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = com.dianping.sdk.pike.agg.a.q;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d6b5df5ef4776523a86be41349124c27", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d6b5df5ef4776523a86be41349124c27");
                    return;
                } else if (aVar.a(aVar2)) {
                    if (f.a(gVar.b)) {
                        aVar.a(aVar2, -76, "you should set an alias to send");
                        return;
                    } else if (!aVar.g()) {
                        aVar.a(aVar2, -77, "you should join agg first");
                        return;
                    } else {
                        Object[] objArr3 = {gVar, aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.sdk.pike.agg.a.q;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "75c85d339823c037b73db70b909c4a03", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "75c85d339823c037b73db70b909c4a03");
                            return;
                        } else {
                            aVar.a(new Runnable() { // from class: com.dianping.sdk.pike.agg.a.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "db6b2df885c5f95356cba234832e42f9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "db6b2df885c5f95356cba234832e42f9");
                                        return;
                                    }
                                    i iVar = new i();
                                    iVar.e = aVar.r.b;
                                    iVar.b = aVar.u;
                                    iVar.g = gVar.b;
                                    iVar.f = gVar.h;
                                    iVar.c = gVar.c;
                                    iVar.d = (byte) gVar.d.d;
                                    aVar.a(iVar, gVar.e, gVar.f, aVar2);
                                }
                            }, aVar2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            baseJsHandler.jsCallbackErrorMsg("init agg client first");
        }
    }
}
