package com.sankuai.waimai.business.page.homepage.bubble;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.TabBubbleInfo;
import com.sankuai.waimai.business.page.homepage.bubble.c;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class g {
    public static ChangeQuickRedirect a = null;
    private static final String j = "g";
    private static volatile g k;
    public final q b;
    public final List<TabBubbleInfo> c;
    public c d;
    public f e;
    public TabBubbleInfo f;
    public TabBubbleInfo g;
    public String h;
    public boolean i;
    private int l;
    private ArrayList<a> m;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, boolean z);

        void b(int i, boolean z);
    }

    public static /* synthetic */ void a(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "1566a7968d3c7e661ed29fb1d456e9e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "1566a7968d3c7e661ed29fb1d456e9e2");
            return;
        }
        Map<String, ?> b = gVar.b.b();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (String str : b.keySet()) {
            if (gVar.b.b(str, -1L) < currentTimeMillis) {
                gVar.b.b(str);
            }
        }
    }

    public static /* synthetic */ void a(g gVar, TabBubbleInfo tabBubbleInfo, boolean z) {
        Object[] objArr = {tabBubbleInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "2d9e293ef7c8fd1107a5cc8941665391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "2d9e293ef7c8fd1107a5cc8941665391");
        } else if (gVar.m != null && gVar.m.size() > 0) {
            for (int size = gVar.m.size() - 1; size >= 0; size--) {
                a aVar = gVar.m.get(size);
                if (aVar != null) {
                    aVar.a(gVar.a(tabBubbleInfo), z);
                }
            }
        }
    }

    public static /* synthetic */ void b(g gVar, TabBubbleInfo tabBubbleInfo, boolean z) {
        Object[] objArr = {tabBubbleInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "0c21e92132c1960b9638e47c1ab7806b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "0c21e92132c1960b9638e47c1ab7806b");
        } else if (gVar.m != null && gVar.m.size() > 0) {
            for (int size = gVar.m.size() - 1; size >= 0; size--) {
                a aVar = gVar.m.get(size);
                if (aVar != null) {
                    aVar.b(gVar.a(tabBubbleInfo), z);
                }
            }
        }
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7b5bbdaf377204aa5464e2adfe3c362", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7b5bbdaf377204aa5464e2adfe3c362");
        }
        if (k == null) {
            synchronized (g.class) {
                if (k == null) {
                    k = new g();
                }
            }
        }
        return k;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca02ce5cbb007e6d81d4de1c9423596", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca02ce5cbb007e6d81d4de1c9423596");
            return;
        }
        this.c = new ArrayList();
        this.l = -1;
        this.h = "";
        this.i = false;
        this.b = q.a(com.meituan.android.singleton.b.a, "waimai_tab_bubble", 1);
        com.sankuai.waimai.foundation.core.lifecycle.b.a().a(new com.sankuai.waimai.foundation.core.lifecycle.a() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.lifecycle.a
            public final void onAppToForeground(Activity activity) {
            }

            @Override // com.sankuai.waimai.foundation.core.lifecycle.a
            public final void onAppToBackground(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c749a66b56ab0f4a8d0b1aebd5a45147", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c749a66b56ab0f4a8d0b1aebd5a45147");
                } else {
                    g.this.a(-1, 2);
                }
            }
        });
        l.a(new l.a() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.utils.l.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae6d8573c8875bddb13e84414466f046", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae6d8573c8875bddb13e84414466f046");
                } else {
                    g.a(g.this);
                }
            }
        }, "clear-expired-records");
    }

    public final void a(@NonNull Activity activity, @Nullable com.sankuai.waimai.business.page.homepage.view.tab.a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1734ecc95b87ddb6cb0a1093776eedc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1734ecc95b87ddb6cb0a1093776eedc");
        } else {
            a(activity, aVar, false);
        }
    }

    private void a(@NonNull Activity activity, @Nullable com.sankuai.waimai.business.page.homepage.view.tab.a aVar, boolean z) {
        Object[] objArr = {activity, aVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bc23d8f6e15c75507805850a3d14f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bc23d8f6e15c75507805850a3d14f6");
        } else {
            a(activity, aVar, false, 6);
        }
    }

    private void a(@NonNull Activity activity, @Nullable final com.sankuai.waimai.business.page.homepage.view.tab.a aVar, final boolean z, int i) {
        Object[] objArr = {activity, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), 6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62784e3d80775800b56b1e1b699182cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62784e3d80775800b56b1e1b699182cd");
        } else if (activity.isFinishing() || activity.isDestroyed()) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "showBubbleSafety", new Object[0]);
            ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d54984bd32236988a94e1685a5d7cfc4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d54984bd32236988a94e1685a5d7cfc4");
                        return;
                    }
                    try {
                        com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "showBubbleSafety->showBubble", new Object[0]);
                        g.this.a(aVar, z, r4);
                    } catch (WindowManager.BadTokenException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Deprecated
    public final void a(@Nullable com.sankuai.waimai.business.page.homepage.view.tab.a aVar, boolean z, int i) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b09c0ace822dec040573c854047aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b09c0ace822dec040573c854047aa4");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "showBubble", new Object[0]);
            if ((i & 2) == 2 && this.f != null) {
                final TabBubbleInfo tabBubbleInfo = this.f;
                View a2 = aVar.a(a(tabBubbleInfo));
                if (a2 != null && a2.isShown()) {
                    if (this.d == null) {
                        this.d = c.a(com.meituan.android.singleton.b.a);
                        this.d.a(new c.a() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.homepage.bubble.c.a
                            public final void a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "793fcb775738f07e12ffc8b82a5d415b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "793fcb775738f07e12ffc8b82a5d415b");
                                } else {
                                    l.b(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.4.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f176fe4a2205aa05ea08bac01e8d5996", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f176fe4a2205aa05ea08bac01e8d5996");
                                            } else {
                                                g.a(g.this, tabBubbleInfo, true);
                                            }
                                        }
                                    }, "notify_on_big_tab_bubble_shown");
                                }
                            }

                            @Override // com.sankuai.waimai.business.page.homepage.bubble.c.a
                            public final void b() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a17665709dba94c0442fc1c109a9623", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a17665709dba94c0442fc1c109a9623");
                                } else {
                                    l.b(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.4.2
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be8738b72a65d46454789456276db7e7", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be8738b72a65d46454789456276db7e7");
                                            } else {
                                                g.b(g.this, tabBubbleInfo, true);
                                            }
                                        }
                                    }, "notify_on_big_tab_bubble_dismiss");
                                }
                            }
                        });
                    }
                    try {
                        com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "bigPopupBubble.show, tabMsg=" + tabBubbleInfo.message, new Object[0]);
                        this.d.a(a(tabBubbleInfo), a2, tabBubbleInfo.message, z);
                        a(this.l, true);
                    } catch (WindowManager.BadTokenException unused) {
                    }
                }
            }
            if ((i & 4) == 4 && this.g != null) {
                final TabBubbleInfo tabBubbleInfo2 = this.g;
                View a3 = aVar.a(a(tabBubbleInfo2));
                if (a3 != null && a3.getVisibility() == 0) {
                    if (this.e == null) {
                        this.e = f.b(com.meituan.android.singleton.b.a);
                        this.e.a(new c.a() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.homepage.bubble.c.a
                            public final void a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a67126faf8679c9ffe032d0421201925", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a67126faf8679c9ffe032d0421201925");
                                } else {
                                    l.b(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.5.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0198d9d9f06deaa6e8af3e144dec4d7", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0198d9d9f06deaa6e8af3e144dec4d7");
                                            } else {
                                                g.a(g.this, tabBubbleInfo2, false);
                                            }
                                        }
                                    }, "notify_on_small_tab_bubble_shown");
                                }
                            }

                            @Override // com.sankuai.waimai.business.page.homepage.bubble.c.a
                            public final void b() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73731326c901ce98a6eeb2a53eabc02e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73731326c901ce98a6eeb2a53eabc02e");
                                } else {
                                    l.b(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.g.5.2
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84a6c989dfdd54cd4ef39399a3a153fe", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84a6c989dfdd54cd4ef39399a3a153fe");
                                            } else {
                                                g.b(g.this, tabBubbleInfo2, false);
                                            }
                                        }
                                    }, "notify_on_small_tab_bubble_dismiss");
                                }
                            }
                        });
                    }
                    try {
                        com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "smallPopupBubble.show, tabMsg=" + tabBubbleInfo2.message, new Object[0]);
                        this.e.a(a(tabBubbleInfo2), a3, "", z);
                    } catch (WindowManager.BadTokenException unused2) {
                    }
                }
            }
            if (c(2)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1634e4eace1d1076ef0ecc086d808bef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1634e4eace1d1076ef0ecc086d808bef");
                    return;
                }
                String logInfo = this.f != null ? this.f.getLogInfo() : "";
                JudasManualManager.a a4 = JudasManualManager.b("b_ilupeqew").a("c_m84bv26");
                a4.b = AppUtil.generatePageInfoKey(this);
                a4.a(com.sankuai.waimai.mach.utils.b.a(logInfo)).a();
            } else if (c(1)) {
                final b a5 = b.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, a5, changeQuickRedirect3, false, "4c1ff24f490ef22a2ec86754a9bf6539", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a5, changeQuickRedirect3, false, "4c1ff24f490ef22a2ec86754a9bf6539");
                    return;
                }
                a5.e = false;
                if (a5.c == null || a5.c.d != 3) {
                    return;
                }
                l.a(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f2e3ed3aa2e9a3be24ec91c37b5bab28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f2e3ed3aa2e9a3be24ec91c37b5bab28");
                        } else {
                            g.a().a(-1, 2);
                        }
                    }
                }, 10000, "dismiss-content-big-bubble");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.Nullable com.sankuai.waimai.business.page.homepage.view.tab.a r12, boolean r13) {
        /*
            r11 = this;
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r7 = 0
            r13[r7] = r12
            java.lang.Byte r0 = java.lang.Byte.valueOf(r7)
            r8 = 1
            r13[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.page.homepage.bubble.g.a
            java.lang.String r10 = "7d0c907fca73ae3c709b86ea9557fbfb"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r13
            r1 = r11
            r2 = r9
            r4 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L22
            com.meituan.robust.PatchProxy.accessDispatch(r13, r11, r9, r7, r10)
            return
        L22:
            r13 = 3
            if (r12 == 0) goto L4e
            com.sankuai.waimai.business.page.home.model.TabBubbleInfo r0 = r11.f
            if (r0 == 0) goto L4e
            com.sankuai.waimai.business.page.home.model.TabBubbleInfo r0 = r11.f
            int r0 = r11.a(r0)
            android.view.View r0 = r12.a(r0)
            if (r0 == 0) goto L4f
            boolean r1 = r0.isShown()
            if (r1 == 0) goto L4f
            boolean r1 = r11.e()
            if (r1 == 0) goto L4b
            com.sankuai.waimai.business.page.homepage.bubble.c r13 = r11.d
            com.sankuai.waimai.business.page.home.model.TabBubbleInfo r1 = r11.f
            java.lang.String r1 = r1.message
            r13.a(r0, r1)
            goto L4e
        L4b:
            r13 = 1
            r0 = 3
            goto L50
        L4e:
            r13 = 1
        L4f:
            r0 = 1
        L50:
            if (r12 == 0) goto L7b
            com.sankuai.waimai.business.page.home.model.TabBubbleInfo r1 = r11.g
            if (r1 == 0) goto L7b
            com.sankuai.waimai.business.page.home.model.TabBubbleInfo r1 = r11.g
            int r1 = r11.a(r1)
            android.view.View r1 = r12.a(r1)
            if (r1 == 0) goto L79
            boolean r2 = r1.isShown()
            if (r2 == 0) goto L79
            boolean r2 = r11.f()
            if (r2 == 0) goto L76
            com.sankuai.waimai.business.page.homepage.bubble.f r2 = r11.e
            java.lang.String r3 = ""
            r2.a(r1, r3)
            goto L7b
        L76:
            r0 = r0 | 4
            goto L7b
        L79:
            r13 = r13 | 4
        L7b:
            if (r13 == r8) goto L81
            r1 = -1
            r11.a(r1, r13)
        L81:
            if (r0 == r8) goto L95
            java.lang.String r13 = "TabBubble"
            java.lang.String r1 = "updateBubble->showBubble"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: android.view.WindowManager.BadTokenException -> L91
            com.sankuai.waimai.foundation.utils.log.a.b(r13, r1, r2)     // Catch: android.view.WindowManager.BadTokenException -> L91
            r11.a(r12, r7, r0)     // Catch: android.view.WindowManager.BadTokenException -> L91
            return
        L91:
            r12 = move-exception
            r12.printStackTrace()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.homepage.bubble.g.a(com.sankuai.waimai.business.page.homepage.view.tab.a, boolean):void");
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f73605ac6f110e786342750aabf9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f73605ac6f110e786342750aabf9ee");
            return;
        }
        this.d.a(8);
        this.l = -1;
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87cf4afc2695eb6f9353184e721f47a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87cf4afc2695eb6f9353184e721f47a5");
        } else if (this.i) {
        } else {
            if (e() && i >= 0 && z) {
                b();
            } else if (this.l == i || !z) {
            } else {
                this.l = i;
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04e5936f6648ed27d414ebe4955dd98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04e5936f6648ed27d414ebe4955dd98");
        } else {
            a(-1);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6337db71278b5917487c0ec7eb602b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6337db71278b5917487c0ec7eb602b39");
        } else {
            a(i, 6);
        }
    }

    public final void a(int i, int i2) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461f31cdad7e274e860abcae206e716d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461f31cdad7e274e860abcae206e716d");
            return;
        }
        if ((i2 & 2) == 2 && a(this.f, this.d, i)) {
            z = (a(this.f) == 1) | false;
            this.i = true;
            this.f = null;
        } else {
            z = false;
        }
        if ((i2 & 4) == 4 && a(this.g, this.e, i)) {
            z |= a(this.g) == 1;
            this.g = null;
        }
        if (z) {
            b.a().a(i != -1);
        }
    }

    private boolean a(TabBubbleInfo tabBubbleInfo, c cVar, int i) {
        Object[] objArr = {tabBubbleInfo, cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf69ef974f94032860a42d410bdf4277", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf69ef974f94032860a42d410bdf4277")).booleanValue();
        }
        if (tabBubbleInfo == null || cVar == null) {
            return false;
        }
        int a2 = a(tabBubbleInfo);
        if (i == -1 || i == a2) {
            if (a(cVar)) {
                try {
                    cVar.a();
                } catch (Exception unused) {
                }
            }
            this.b.a(tabBubbleInfo.id, tabBubbleInfo.expireTime);
            this.c.remove(tabBubbleInfo);
            return true;
        }
        return false;
    }

    public final boolean d() {
        return (this.f == null && this.g == null) ? false : true;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874a07c450c3065b240f64d16f8e7065", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874a07c450c3065b240f64d16f8e7065")).booleanValue() : a(this.d);
    }

    public boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f803d2e84d2ed4fb519a112127242f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f803d2e84d2ed4fb519a112127242f8")).booleanValue() : a(this.e);
    }

    private boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1e7cdd074dce88c193a5aa19205d8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1e7cdd074dce88c193a5aa19205d8f")).booleanValue() : cVar != null && cVar.b();
    }

    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c66ef4af525535d24a24504e198b9fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c66ef4af525535d24a24504e198b9fb")).booleanValue() : (this.f != null && i == a(this.f)) || (this.g != null && i == a(this.g));
    }

    public final boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d20cac49a3976e0414d744f3367388", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d20cac49a3976e0414d744f3367388")).booleanValue() : b(i) && (e() || f());
    }

    public int a(TabBubbleInfo tabBubbleInfo) {
        Object[] objArr = {tabBubbleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37563326c4bd34eba1cd67eb2e1c2cd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37563326c4bd34eba1cd67eb2e1c2cd2")).intValue();
        }
        int i = tabBubbleInfo != null ? tabBubbleInfo.tabId : -1;
        if (com.sankuai.waimai.foundation.core.a.d() && i == 4) {
            return 2;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            case 6:
            default:
                return -1;
            case 5:
            case 9:
                return 2;
            case 7:
            case 8:
                return 1;
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a6260b32cc9c916c6bee352f7d0378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a6260b32cc9c916c6bee352f7d0378");
            return;
        }
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        if (this.m.contains(aVar)) {
            return;
        }
        this.m.add(aVar);
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ec35961e55c3f7eb3de4d6c8ebd2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ec35961e55c3f7eb3de4d6c8ebd2fd");
        } else if (this.m == null) {
        } else {
            this.m.remove(aVar);
        }
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c527863f17e31deadc050c8b2d2b65b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c527863f17e31deadc050c8b2d2b65b0")).intValue();
        }
        if (e()) {
            return this.d.c();
        }
        return 0;
    }
}
