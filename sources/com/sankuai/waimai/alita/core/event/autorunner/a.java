package com.sankuai.waimai.alita.core.event.autorunner;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.d;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d.a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.alita.bundle.model.a b;
    public String c;
    d d;

    public a(com.sankuai.waimai.alita.bundle.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f328ea69cd504efcd6ab913dc3bae20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f328ea69cd504efcd6ab913dc3bae20");
            return;
        }
        this.b = aVar;
        if (this.b != null) {
            this.d = new d(this.b.c, this.b.h);
            this.d.c = this;
        }
    }

    @Override // com.sankuai.waimai.alita.core.event.autorunner.d.a
    public final void a(@Nullable final com.sankuai.waimai.alita.core.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81595953147645e001cb7bb9851a3f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81595953147645e001cb7bb9851a3f2c");
        } else if (this.b == null || !this.b.a()) {
        } else {
            synchronized (this) {
                this.c = com.sankuai.waimai.alita.core.engine.c.a(this.b.c);
                com.sankuai.waimai.alita.core.engine.b.a().a(this.b, new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.event.autorunner.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.engine.h
                    public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                        Object[] objArr2 = {str, alitaJSValue};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55bf1232c55c1d078c791f61da8cecbd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55bf1232c55c1d078c791f61da8cecbd");
                            return;
                        }
                        synchronized (a.this) {
                            if (!TextUtils.isEmpty(str)) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaAutoRunJSStateMachine.shouldStart(): loadScript.onSuccess():  loadScript success, bundle = " + a.this.b.c + ", taskKey = " + str);
                                a.this.c = str;
                                if (hVar != null) {
                                    hVar.a(a.this.c, alitaJSValue);
                                }
                            } else {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaAutoRunJSStateMachine.shouldStart(): loadScript.onSuccess(): loadScript failed, bundle = " + a.this.b.c + ", taskKey = empty");
                                a.this.d.b();
                                if (hVar != null) {
                                    hVar.a(new Exception("taskKey is empty"));
                                }
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.alita.core.engine.h
                    public final void a(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b59c3e79ab722cb0ac3d0a62c5eafc0a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b59c3e79ab722cb0ac3d0a62c5eafc0a");
                            return;
                        }
                        synchronized (a.this) {
                            StringBuilder sb = new StringBuilder("AlitaAutoRunJSStateMachine.shouldStart(): loadScript.onFailed(): loadScript failed, bundle = ");
                            sb.append(a.this.b.c);
                            sb.append(", e = ");
                            sb.append(exc != null ? exc.toString() : StringUtil.NULL);
                            com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                            a.this.d.b();
                            if (hVar != null) {
                                hVar.a(exc);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.event.autorunner.d.a
    public final synchronized void a(com.sankuai.waimai.alita.core.event.a aVar, @Nullable Map<String, ?> map, @Nullable final com.sankuai.waimai.alita.core.engine.h hVar) {
        Object[] objArr = {aVar, map, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a8ea9db527664972a04a7e2fefd36ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a8ea9db527664972a04a7e2fefd36ce");
        } else if (!TextUtils.isEmpty(this.c)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar.l());
            if (map != null) {
                try {
                    arrayList.add(new JSONObject(map));
                } catch (Exception unused) {
                }
            }
            StringBuilder sb = new StringBuilder("AlitaAutoRunJSStateMachine.shouldRun(): runTask : bundle = ");
            sb.append(this.b.c);
            sb.append(", taskKey = ");
            sb.append(this.c);
            sb.append(", arg[0] = ");
            sb.append(((JSONObject) arrayList.get(0)).toString());
            sb.append(", arg[1] = ");
            sb.append(arrayList.size() > 1 ? ((JSONObject) arrayList.get(1)).toString() : StringUtil.NULL);
            com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
            com.sankuai.waimai.alita.core.engine.b.a().a(this.c, arrayList, new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.event.autorunner.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                    Object[] objArr2 = {str, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56918eb1691bee3d8d70e292aebd84d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56918eb1691bee3d8d70e292aebd84d8");
                        return;
                    }
                    synchronized (a.this) {
                        StringBuilder sb2 = new StringBuilder("AlitaAutoRunJSStateMachine.shouldRun(): runTask.onSuccess(): runTask success, bundle = ");
                        sb2.append(a.this.b.c);
                        sb2.append(", taskKey = ");
                        sb2.append(str);
                        sb2.append(", result = ");
                        sb2.append(alitaJSValue != null ? alitaJSValue.stringValue() : StringUtil.NULL);
                        com.sankuai.waimai.alita.core.utils.c.a(sb2.toString());
                        if (hVar != null) {
                            hVar.a(str, alitaJSValue);
                        }
                    }
                }

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34d602550649d8fbb1ff5c208be6ddd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34d602550649d8fbb1ff5c208be6ddd5");
                        return;
                    }
                    synchronized (a.this) {
                        StringBuilder sb2 = new StringBuilder("AlitaAutoRunJSStateMachine.shouldRun(): runTask.onFailed(): runTask failed, bundle = ");
                        sb2.append(a.this.b.c);
                        sb2.append(", taskKey = ");
                        sb2.append(a.this.c);
                        sb2.append(", e = ");
                        sb2.append(exc != null ? exc.toString() : StringUtil.NULL);
                        com.sankuai.waimai.alita.core.utils.c.a(sb2.toString());
                        if (hVar != null) {
                            hVar.a(exc);
                        }
                    }
                }
            });
        } else {
            hVar.a(new Exception("taskKey is empty"));
        }
    }

    @Override // com.sankuai.waimai.alita.core.event.autorunner.d.a
    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c0f5842213e20093fcb37c7986a39b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c0f5842213e20093fcb37c7986a39b");
            return;
        }
        if (!TextUtils.isEmpty(this.c)) {
            this.d.c = null;
            this.b = null;
            com.sankuai.waimai.alita.core.engine.b a2 = com.sankuai.waimai.alita.core.engine.b.a();
            String str = this.c;
            com.sankuai.waimai.alita.core.engine.h hVar = new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.event.autorunner.a.3
                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable Exception exc) {
                }

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                }
            };
            Object[] objArr2 = {str, hVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.engine.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "50afc4c07435ddfc995a6c3362acea7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "50afc4c07435ddfc995a6c3362acea7d");
            } else {
                com.sankuai.waimai.alita.core.engine.a a3 = com.sankuai.waimai.alita.core.engine.d.a().a(str);
                if (a3 != null) {
                    a3.a(hVar);
                    Object[] objArr3 = {str, a3};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.engine.b.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e0c86c26aa29bbdee2cf7f619fc8d1e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e0c86c26aa29bbdee2cf7f619fc8d1e7");
                    } else {
                        String str2 = "";
                        String str3 = "";
                        if (a3.d != null) {
                            str2 = a3.d.b;
                            str3 = a3.d.c;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("bundle_id", str2);
                        hashMap.put("task_key", str);
                        hashMap.put("version", str3);
                        com.sankuai.waimai.alita.core.utils.c.a("alita_js", (String) null, "unload", (HashMap<String, Object>) hashMap);
                    }
                } else {
                    com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("getJSEngine() = null"));
                }
            }
            this.c = "";
        }
    }
}
