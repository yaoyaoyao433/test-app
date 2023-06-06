package com.sankuai.waimai.ad.view.mach.dydialog;

import android.app.Activity;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.platform.mach.dialog.DialogModuleView;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.f;
import com.sankuai.waimai.platform.mach.dialog.h;
import com.sankuai.waimai.platform.mach.dialog.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.ad.view.mach.a implements DialogModuleView.a, h {
    public static ChangeQuickRedirect c;
    private boolean G;
    private final e H;
    boolean d;
    @NonNull
    DynamicDialog.d e;
    i f;
    private Rect g;

    public a(Activity activity, com.sankuai.waimai.pouch.model.c cVar, com.sankuai.waimai.pouch.a aVar) {
        super(activity, cVar, aVar);
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa0377333705487abc66da86d1b3ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa0377333705487abc66da86d1b3ec7");
            return;
        }
        this.g = new Rect();
        this.e = DynamicDialog.d.d;
        this.H = new e() { // from class: com.sankuai.waimai.ad.view.mach.dydialog.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6de4eab532c7d4fe6413685ddf72f8ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6de4eab532c7d4fe6413685ddf72f8ae");
                } else if (a.this.f != null) {
                    a.this.f.a(0, new f("mach render failed"));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5320f09772aff196cb8fa802c14e5de5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5320f09772aff196cb8fa802c14e5de5");
                } else if (a.this.f != null) {
                    a.this.f.a(1, new f("mach bundle load failed"));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6a32eb1d58342395ac2d3ccf43972f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6a32eb1d58342395ac2d3ccf43972f1");
                } else if (a.this.f != null) {
                    a.this.f.a(2, new f("mach input params error"));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void d() {
                /*
                    r11 = this;
                    r0 = 0
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.ad.view.mach.dydialog.a.AnonymousClass1.a
                    java.lang.String r10 = "acb41227807334d7d558e79d98fc8889"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r11
                    r3 = r9
                    r5 = r10
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L18
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                    return
                L18:
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.mach.node.a r0 = r0.n()
                    r1 = 1
                    if (r0 == 0) goto L3d
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.mach.node.a r0 = r0.n()
                    java.util.Map r0 = r0.h()
                    java.lang.String r2 = "should-show"
                    java.lang.Object r0 = r0.get(r2)
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L3d
                    boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Exception -> L3d
                    goto L3e
                L3d:
                    r0 = 1
                L3e:
                    if (r0 == 0) goto L54
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = r0.f
                    if (r0 == 0) goto L75
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = r0.f
                    com.sankuai.waimai.ad.view.mach.dydialog.a r2 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.mach.node.a r2 = r2.n()
                    r0.a(r2)
                    goto L75
                L54:
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    android.view.ViewGroup r0 = r0.r()
                    r2 = 8
                    r0.setVisibility(r2)
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = r0.f
                    if (r0 == 0) goto L75
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = r0.f
                    r2 = 3
                    com.sankuai.waimai.platform.mach.dialog.f r3 = new com.sankuai.waimai.platform.mach.dialog.f
                    java.lang.String r4 = "mach template business failed"
                    r3.<init>(r4)
                    r0.a(r2, r3)
                L75:
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    r0.d = r1
                    com.sankuai.waimai.ad.view.mach.dydialog.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.this
                    com.sankuai.waimai.pouch.a r0 = com.sankuai.waimai.ad.view.mach.dydialog.a.a(r0)
                    r0.d()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ad.view.mach.dydialog.a.AnonymousClass1.d():void");
            }
        };
        a(this.H);
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b83374625e92808cfb29af648ccbee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b83374625e92808cfb29af648ccbee8");
            return;
        }
        o();
        this.d = false;
        this.A.e();
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.h
    public void a(@NonNull DynamicDialog.d dVar) {
        this.e = dVar;
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.h
    public final void a(i iVar) {
        this.f = iVar;
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView.a
    public final void k() {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a003f4d8948a1a61a276387e1ebea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a003f4d8948a1a61a276387e1ebea3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc62341ae936b43879d8d8d0a7e02817", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc62341ae936b43879d8d8d0a7e02817")).booleanValue();
        } else if (this.d && !this.G) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03120f1adfae763e2e8893f1ffd5bf1a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03120f1adfae763e2e8893f1ffd5bf1a")).booleanValue();
            } else {
                z = r().getLocalVisibleRect(this.g) && r().isShown();
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            d();
        }
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final void l() {
        this.G = true;
    }

    @Override // com.sankuai.waimai.ad.view.mach.a, com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d5c7836c31d0fd9cd4017a9b5494ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d5c7836c31d0fd9cd4017a9b5494ba");
            return;
        }
        super.a(str, map);
        if (TextUtils.equals(str, "close")) {
            this.e.a();
        } else if (TextUtils.equals(str, "close_with_type_event")) {
            this.e.b();
        } else if (this.e.c() != null) {
            this.e.c().a(str, map);
        }
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final d m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8029eaa175c04919c16c61a36bc5b584", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8029eaa175c04919c16c61a36bc5b584");
        }
        if (this.e.f() != null) {
            return this.e.f();
        }
        if (this.A != null) {
            return this.A.j;
        }
        return null;
    }

    public final com.sankuai.waimai.mach.node.a n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed99603b18551dc0fe124f779c4ad68", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed99603b18551dc0fe124f779c4ad68");
        }
        if (this.k == null) {
            return null;
        }
        return this.k.getRootNode();
    }

    @Override // com.sankuai.waimai.ad.view.mach.a
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef92c4d864c78aaa7fb97ec61bc9741", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef92c4d864c78aaa7fb97ec61bc9741")).booleanValue();
        }
        if (!super.g()) {
            try {
                JSONObject jSONObject = new JSONObject();
                HashMap hashMap = new HashMap();
                if (this.A != null && this.A.b() != null) {
                    jSONObject.put("templateId", this.A.b().getTemplateId());
                    hashMap.put("templateId", this.A.b().getTemplateId());
                }
                if (this.B != null) {
                    jSONObject.put("module_id", this.B.e);
                    hashMap.put("module_id", this.B.e);
                }
                jSONObject.put("mach", this.k != null);
                jSONObject.put(RemoteMessageConst.Notification.VISIBILITY, this.l.getVisibility() == 0);
                jSONObject.put("mParentVisibleRectInWindow", this.u == null ? StringUtil.NULL : this.u.toString());
                hashMap.put("mach", String.valueOf(this.k != null));
                hashMap.put(RemoteMessageConst.Notification.VISIBILITY, String.valueOf(this.l.getVisibility() == 0));
                hashMap.put("mParentVisibleRectInWindow", String.valueOf(this.u == null ? StringUtil.NULL : this.u.toString()));
                int[] iArr = new int[2];
                r().getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                jSONObject.put("left", i);
                jSONObject.put("top", i2);
                hashMap.put("left", String.valueOf(i));
                hashMap.put("top", String.valueOf(i2));
                com.sankuai.waimai.pouch.monitor.e.a(new com.sankuai.waimai.pouch.monitor.d().a("pouch_container_expose").b("expose_condition_error").d(jSONObject.toString()).a(true).b(), hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("expose_condition_error", 1);
                HashMap hashMap3 = new HashMap();
                if (this.B != null) {
                    hashMap3.put("module_id", this.B.e);
                } else {
                    hashMap3.put("module_id", StringUtil.NULL);
                }
                if (this.A != null && this.A.b() != null) {
                    hashMap3.put("templateId", this.A.b().getTemplateId());
                } else {
                    hashMap3.put("templateId", "default");
                }
                com.sankuai.waimai.pouch.monitor.c.a(hashMap2, hashMap3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
