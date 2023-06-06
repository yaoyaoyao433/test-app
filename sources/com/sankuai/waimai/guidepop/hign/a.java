package com.sankuai.waimai.guidepop.hign;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.guidepop.utils.e;
import com.sankuai.waimai.irmo.mach.vap.c;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.i;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.mach.node.a b;
    HashMap<String, View> c;
    View d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private DynamicDialog j;
    private String k;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984489c4c0f8450a5aaf9528b430616d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984489c4c0f8450a5aaf9528b430616d");
            return;
        }
        this.e = "guide_pop_high_WMGuidePopDialogHelper";
        this.f = "popup-layout";
        this.g = "effect-video-view";
        this.h = "guide-video-view";
        this.i = "black-view";
        this.c = new HashMap<>();
        this.k = str;
    }

    public final void a(@NonNull final Activity activity, @NonNull AlertInfo alertInfo, @NonNull View view, final DialogInterface.OnDismissListener onDismissListener, com.sankuai.waimai.platform.mach.dialog.b bVar) {
        Object[] objArr = {activity, alertInfo, view, onDismissListener, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f4e853ee84814644a12e5b980fad103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f4e853ee84814644a12e5b980fad103");
            return;
        }
        this.d = view;
        e.b("guide_pop_high_WMGuidePopDialogHelper", "[show]");
        if (this.j != null && this.j.isShowing()) {
            e.b("guide_pop_high_WMGuidePopDialogHelper", "[show] mDialog.isShowing() = true");
            return;
        }
        HashMap hashMap = new HashMap();
        DynamicDialog.a aVar = new DynamicDialog.a(activity);
        aVar.i = alertInfo;
        DynamicDialog.a a2 = aVar.a(this.k).a(hashMap);
        a2.o = bVar;
        a2.m = 1;
        a2.p = new i() { // from class: com.sankuai.waimai.guidepop.hign.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.dialog.i
            public final void a(int i, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "226549511f4e6d4ec1b0cc532461b62c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "226549511f4e6d4ec1b0cc532461b62c");
                    return;
                }
                e.a("guide_pop_high_WMGuidePopDialogHelper", "[show]  MachModulesRenderListener --> onFail,e:" + th.getMessage());
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.i
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7f3fa62dfa41d796a09883dba17a4d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7f3fa62dfa41d796a09883dba17a4d5");
                    return;
                }
                e.b("guide_pop_high_WMGuidePopDialogHelper", "[show] onSuccess");
                a.this.b = aVar2;
                final a aVar3 = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "914e243e147c546a37e51e7f983cb162", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "914e243e147c546a37e51e7f983cb162");
                } else if (aVar3.b != null) {
                    aVar3.c.clear();
                    com.sankuai.waimai.mach.node.a.a(aVar3.b, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.guidepop.hign.a.6
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                        public final void a(com.sankuai.waimai.mach.node.a aVar4) {
                            Object[] objArr4 = {aVar4};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e66641c4e76753e0edaacd239f391c33", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e66641c4e76753e0edaacd239f391c33");
                            } else if (aVar4 == null) {
                            } else {
                                Map<String, Object> h = aVar4.h();
                                if (h.containsKey("anim-view-tag")) {
                                    Object obj = h.get("anim-view-tag");
                                    if (obj instanceof String) {
                                        String str = (String) obj;
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        }
                                        a.this.c.put(str, aVar4.g());
                                    }
                                }
                            }
                        }
                    });
                    e.b("guide_pop_high_WMGuidePopDialogHelper", "[saveAnimTagView] mAnimTagViewMap:" + aVar3.c);
                }
            }
        };
        a2.c = new DynamicDialog.f() { // from class: com.sankuai.waimai.guidepop.hign.a.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0790  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x079e  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x028b  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x029a  */
            /* JADX WARN: Type inference failed for: r11v27, types: [android.animation.Animator] */
            /* JADX WARN: Type inference failed for: r11v34, types: [android.animation.Animator] */
            /* JADX WARN: Type inference failed for: r11v36 */
            /* JADX WARN: Type inference failed for: r11v37, types: [android.animation.Animator] */
            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.String r30, java.util.Map<java.lang.String, java.lang.Object> r31) {
                /*
                    Method dump skipped, instructions count: 2158
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.guidepop.hign.a.AnonymousClass2.a(java.lang.String, java.util.Map):void");
            }
        };
        a2.g = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.guidepop.hign.a.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78412f31b18775943e2aca9c034907ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78412f31b18775943e2aca9c034907ba");
                    return;
                }
                e.b("guide_pop_high_WMGuidePopDialogHelper", "[onDismiss]");
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                com.sankuai.waimai.guidepop.manager.b a3 = com.sankuai.waimai.guidepop.manager.b.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.guidepop.manager.b.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "8a56cf678f9d0a66db6a7f383490b781", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "8a56cf678f9d0a66db6a7f383490b781");
                } else if (a3.c != null) {
                    a3.c.cancel();
                }
            }
        };
        this.j = aVar.a();
        this.j.show();
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f239093abb77d99935854b1ff8b002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f239093abb77d99935854b1ff8b002");
            return;
        }
        View view = this.c.get("effect-video-view");
        if (view instanceof c) {
            e.b("guide_pop_high_WMGuidePopDialogHelper", "[pauseVideo] MachAnimVideoViewGroup pause()");
            ((c) view).a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3474394766a4ca75485876eee342ec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3474394766a4ca75485876eee342ec3");
        } else if (this.j != null) {
            this.j.dismiss();
            this.j = null;
        }
    }
}
