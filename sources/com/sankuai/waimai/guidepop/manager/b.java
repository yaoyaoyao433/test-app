package com.sankuai.waimai.guidepop.manager;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.guidepop.utils.e;
import com.sankuai.waimai.mach.node.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final int b = g.a(com.meituan.android.singleton.b.a, 250.0f);
    public Animator c;
    public com.sankuai.waimai.guidepop.manager.a d;
    public AnimatorListenerAdapter e;
    private final Map<String, C0955b> f;

    public static /* synthetic */ Animator a(b bVar, Animator animator) {
        bVar.c = null;
        return null;
    }

    public static /* synthetic */ com.sankuai.waimai.guidepop.manager.a a(b bVar, com.sankuai.waimai.guidepop.manager.a aVar) {
        bVar.d = null;
        return null;
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.node.a aVar, String str, String str2) {
        String str3;
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e406e0fff7b237b71b39b8c26eedd29f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e406e0fff7b237b71b39b8c26eedd29f");
        } else if (aVar != null) {
            View g = aVar.g();
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3fa7f25f55055f6cc8e1dcafc50533a3", RobustBitConfig.DEFAULT_VALUE)) {
                str3 = (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3fa7f25f55055f6cc8e1dcafc50533a3");
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = str + "@" + str2;
            }
            bVar.a(str3, g, 2);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583b0496f86b7565868e7252a7ed0e09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583b0496f86b7565868e7252a7ed0e09");
            return;
        }
        this.e = new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.guidepop.manager.b.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69542f5e9c349d66c95be2012a7cea92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69542f5e9c349d66c95be2012a7cea92");
                    return;
                }
                if (b.this.d != null) {
                    e.a("guide_pop_high_GManager", "onAnimationEnd  回调 onComplete()");
                    b.this.d.a();
                    b.a(b.this, (com.sankuai.waimai.guidepop.manager.a) null);
                }
                b.a(b.this, (Animator) null);
            }
        };
        this.f = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f7309b7ff703766ae735774481bf9e1", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f7309b7ff703766ae735774481bf9e1") : a.a;
    }

    public final void a(String str, View view, int i) {
        Object[] objArr = {str, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8345ab61289ef81a8c2e329e7ec5549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8345ab61289ef81a8c2e329e7ec5549");
        } else if (TextUtils.isEmpty(str)) {
            e.a("guide_pop_high_GManager", "addTargetView  guideId  is empty");
        } else if (view == null) {
            e.a("guide_pop_high_GManager", "addTargetView  view == null  remove  id： " + str);
            this.f.remove(str);
        } else {
            this.f.put(str, new C0955b(view, i));
            e.a("guide_pop_high_GManager", "addTargetView  add id " + str + " type: " + i);
        }
    }

    public final View a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888947f4cb23ee94e257b67590090b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888947f4cb23ee94e257b67590090b0b");
        }
        C0955b c0955b = this.f.get(str);
        if (c0955b == null) {
            e.a("guide_pop_high_GManager", "getTargetView  return id  == null" + str);
            return null;
        }
        View a2 = c0955b.a();
        e.a("guide_pop_high_GManager", "getTargetView  获取 id: " + str + " view: " + a2);
        return a2;
    }

    public final void a(final String str, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> h;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e055084298c0871aa399e5d7e212fceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e055084298c0871aa399e5d7e212fceb");
        } else if (aVar == null || TextUtils.isEmpty(str) || (h = aVar.h()) == null || !h.containsKey("guide_target_view_id")) {
        } else {
            e.a("guide_pop_high_GManager", "findMachNode   匹配:  guide_target_view_id");
            Object obj = h.get("guide_target_view_id");
            if (obj instanceof String) {
                final String str2 = (String) obj;
                com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.guidepop.manager.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                    public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b626e5a9134d78821a07a2298216748", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b626e5a9134d78821a07a2298216748");
                            return;
                        }
                        Map<String, Object> h2 = aVar2.h();
                        if (h2 == null || !h2.containsKey("is_guide_target")) {
                            return;
                        }
                        Object obj2 = h2.get("is_guide_target");
                        if ((obj2 instanceof String) && "1".equals((String) obj2)) {
                            e.a("guide_pop_high_GManager", "findMachNode   匹配 is_guide_target == 1   ");
                            b.a(b.this, aVar2, str, str2);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.guidepop.manager.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0955b {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;
        private int c;

        public C0955b(View view, int i) {
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f449a1ff2f55ec470c1cdc9a269d5b55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f449a1ff2f55ec470c1cdc9a269d5b55");
                return;
            }
            this.b = new WeakReference<>(view);
            this.c = i;
        }

        View a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be0a418f0da6adfc3c6f20c94f79cb7b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be0a418f0da6adfc3c6f20c94f79cb7b") : this.b.get();
        }
    }
}
