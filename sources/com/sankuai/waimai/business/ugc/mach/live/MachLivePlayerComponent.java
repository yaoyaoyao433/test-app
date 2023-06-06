package com.sankuai.waimai.business.ugc.mach.live;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import com.sankuai.waimai.business.ugc.live.c;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.base.a;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MachLivePlayerComponent extends a<c> implements c.a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "MachLivePlayerComponent";
    private final long c;
    private c d;
    private final c.b e;
    private d f;
    private d g;
    private d h;
    private d i;
    private d j;
    private d k;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(c cVar) {
        boolean z;
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1415174019e927983da4745f8f391a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1415174019e927983da4745f8f391a68");
            return;
        }
        super.a((MachLivePlayerComponent) cVar2);
        if (this.k != null) {
            List<Object> linkedList = new LinkedList<>();
            HashMap hashMap = new HashMap();
            hashMap.put("componentId", Long.valueOf(this.c));
            linkedList.add(hashMap);
            a(this.k.b, linkedList);
        }
        this.d = cVar2;
        if (this.d != null) {
            z = this.d.a();
            c cVar3 = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar3, changeQuickRedirect2, false, "f827dedb6aecc88207c51d28fa590847", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar3, changeQuickRedirect2, false, "f827dedb6aecc88207c51d28fa590847");
            } else {
                cVar3.b++;
            }
        } else {
            z = false;
        }
        if (!this.e.g || z) {
            return;
        }
        f();
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ c b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1fa9e04738dff7d8fae321f4d3a2abb", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1fa9e04738dff7d8fae321f4d3a2abb");
        }
        this.d = new c(context);
        return this.d;
    }

    public MachLivePlayerComponent(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fe5c44be1fa137b96255a43fd6d57de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fe5c44be1fa137b96255a43fd6d57de");
            return;
        }
        this.c = j;
        this.e = new c.b();
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce325e5a7137b05081440ed4060525a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce325e5a7137b05081440ed4060525a9");
            return;
        }
        this.e.b = a("biz");
        this.e.c = a(ShowLogJsHandler.PARAM_NAME_MODULE);
        this.e.d = a(IWMLivePreloadManager.PARAM_LIVE_ID);
        this.e.e = a("source");
        this.e.f = a("jump-url");
        this.e.j = a("object-fit");
        Map<String, Object> k = k();
        if (k != null) {
            if (k.containsKey("autoplay")) {
                try {
                    Object obj = k.get("autoplay");
                    if (obj instanceof Boolean) {
                        this.e.g = ((Boolean) obj).booleanValue();
                    } else {
                        this.e.g = Boolean.parseBoolean((String) obj);
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.e(b, e.toString(), new Object[0]);
                }
            }
            if (k.containsKey("muted")) {
                try {
                    Object obj2 = k.get("muted");
                    if (obj2 instanceof Boolean) {
                        this.e.i = ((Boolean) obj2).booleanValue();
                    } else {
                        this.e.i = Boolean.parseBoolean((String) obj2);
                    }
                } catch (Exception e2) {
                    com.sankuai.waimai.foundation.utils.log.a.e(b, e2.toString(), new Object[0]);
                }
            }
            if (k.get("@play-success") instanceof d) {
                this.f = (d) k().get("@play-success");
            }
            if (k.get("@play-fail") instanceof d) {
                this.g = (d) k().get("@play-fail");
            }
            if (k.get("@play-end") instanceof d) {
                this.h = (d) k().get("@play-end");
            }
            if (k.get("@clicked") instanceof d) {
                this.i = (d) k().get("@clicked");
            }
            if (k.get("@goods-changed") instanceof d) {
                this.j = (d) k().get("@goods-changed");
            }
            if (k.get("@create") instanceof d) {
                this.k = (d) k().get("@create");
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f8ace8f2b2ad7fd178ee973261afab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f8ace8f2b2ad7fd178ee973261afab");
            return;
        }
        super.b();
        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerComponent.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfb2f339a5546e6ab9bb5680e9fc33f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfb2f339a5546e6ab9bb5680e9fc33f3");
                } else if (MachLivePlayerComponent.this.d != null) {
                    c cVar = MachLivePlayerComponent.this.d;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d74f2c9ec47ab815747c60a6544ae573", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d74f2c9ec47ab815747c60a6544ae573");
                    } else {
                        cVar.b--;
                    }
                    if (MachLivePlayerComponent.this.d.a()) {
                        return;
                    }
                    MachLivePlayerComponent.this.g();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49e0d8c992714cccad9d829784868e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49e0d8c992714cccad9d829784868e4");
            return;
        }
        super.onActivityDestroyed();
        h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r14.equals("resume") != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r14v23 */
    @android.support.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendLiveEvent(@android.support.annotation.NonNull java.lang.String r14, @android.support.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerComponent.sendLiveEvent(java.lang.String, java.util.Map):void");
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5dfe4213f39ce7d3d07fdaeee3b28b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5dfe4213f39ce7d3d07fdaeee3b28b");
        } else {
            Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerComponent.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97dc22efaeb47780df59a2eda77eb3ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97dc22efaeb47780df59a2eda77eb3ac");
                    } else if (MachLivePlayerComponent.this.d != null) {
                        MachLivePlayerComponent.this.d.a(MachLivePlayerComponent.this.e, MachLivePlayerComponent.this);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796efee2eeb020516bdfdb57a51c4667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796efee2eeb020516bdfdb57a51c4667");
        } else {
            Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerComponent.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a8089f1fb521bd9afd3b9a5e6213a7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a8089f1fb521bd9afd3b9a5e6213a7d");
                    } else if (MachLivePlayerComponent.this.d != null) {
                        MachLivePlayerComponent.this.d.a(MachLivePlayerComponent.this.e);
                    }
                }
            });
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810638e6eac256ca29928ff92b53f4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810638e6eac256ca29928ff92b53f4b0");
        } else if (this.d != null) {
            this.d.b = 0;
            g();
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61929189d7a411b3d0e47a8bb2774085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61929189d7a411b3d0e47a8bb2774085");
        } else if (this.f != null) {
            a(this.f.b, (List<Object>) null);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eaf8c3b41c51a4f920d8c667d6130a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eaf8c3b41c51a4f920d8c667d6130a9");
        } else if (this.g != null) {
            List<Object> linkedList = new LinkedList<>();
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(i));
            linkedList.add(hashMap);
            a(this.g.b, linkedList);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b359d22374bcd993194afff22e481fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b359d22374bcd993194afff22e481fc");
        } else if (this.h != null) {
            a(this.h.b, (List<Object>) null);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d431f41e3d8c91676ddf90db565da71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d431f41e3d8c91676ddf90db565da71c");
        } else if (this.i != null) {
            a(this.i.b, (List<Object>) null);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3196338a9fc5a7975faa9f034472f11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3196338a9fc5a7975faa9f034472f11");
        } else if (this.j != null) {
            List<Object> linkedList = new LinkedList<>();
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(i));
            hashMap.put("goodsId", Long.valueOf(j));
            linkedList.add(hashMap);
            a(this.j.b, linkedList);
        }
    }

    private void a(@NonNull String str, @Nullable List<Object> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3544f648a0043308354ffe68b2e8b377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3544f648a0043308354ffe68b2e8b377");
            return;
        }
        String str2 = b;
        com.sankuai.waimai.foundation.utils.log.a.b(str2, "notifyJsMethod=====eventKey:" + str + "\t\tparams:" + list, new Object[0]);
        if (this.m != null) {
            this.m.asyncCallJSMethod(str, list);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.e(b, "getMach()==null", new Object[0]);
        }
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03afbce6def5b3a802bc4db1e5aa54a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03afbce6def5b3a802bc4db1e5aa54a6");
            return;
        }
        super.finalize();
        h();
    }
}
