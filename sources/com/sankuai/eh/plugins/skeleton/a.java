package com.sankuai.eh.plugins.skeleton;

import android.content.Context;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.plugins.skeleton.util.b;
import com.sankuai.eh.plugins.skeleton.vg.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Map<String, WeakReference<com.sankuai.eh.plugins.skeleton.vg.a>> b = new HashMap();

    public static a.C0566a a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f200fee18c4dd697e93c401b90679586", RobustBitConfig.DEFAULT_VALUE) ? (a.C0566a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f200fee18c4dd697e93c401b90679586") : new a.C0566a(viewGroup);
    }

    public static void a(final com.sankuai.eh.plugins.skeleton.vg.a aVar, final a.b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21b2a96193346d0267424642551a22ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21b2a96193346d0267424642551a22ef");
        } else if (aVar != null) {
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.plugins.skeleton.vg.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a5a4d6e8f5b3d3a93b4d4ace9a537912", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a5a4d6e8f5b3d3a93b4d4ace9a537912");
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            b bVar2 = aVar.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            int i = 300;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "f7f69f5c65eb9126d75b5ca25c7a5258", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "f7f69f5c65eb9126d75b5ca25c7a5258")).intValue();
            } else {
                int a2 = com.sankuai.eh.component.service.utils.b.a(bVar2.b.get("hideDuration"), 300);
                if (a2 >= 0) {
                    i = a2;
                }
            }
            alphaAnimation.setDuration(i);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.eh.plugins.skeleton.vg.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr4 = {animation};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d986aafd727eeea196484d525a87b4dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d986aafd727eeea196484d525a87b4dc");
                        return;
                    }
                    aVar.g.removeAllViews();
                    aVar.e.removeView(aVar.b);
                    if (bVar != null) {
                        bVar.a();
                    }
                    com.sankuai.eh.component.service.tools.d.b("删除骨架屏视图");
                }
            });
            aVar.b.startAnimation(alphaAnimation);
        }
    }

    public static boolean b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b1384f53af073968363728e13315610", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b1384f53af073968363728e13315610")).booleanValue();
        }
        if (viewGroup == null) {
            return true;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).getId() == R.id.eh_vg_skeleton) {
                return false;
            }
        }
        return true;
    }

    public static com.sankuai.eh.plugins.skeleton.vg.a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1092c0d4569880bf5114e5926965313", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.eh.plugins.skeleton.vg.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1092c0d4569880bf5114e5926965313");
        }
        WeakReference<com.sankuai.eh.plugins.skeleton.vg.a> weakReference = b.get(f.a(context));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void b(Context context) {
        String b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f268b5efd96d3a802b249f60f60d7cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f268b5efd96d3a802b249f60f60d7cd7");
            return;
        }
        WeakReference<com.sankuai.eh.plugins.skeleton.vg.a> weakReference = b.get(f.a(context));
        if (weakReference != null) {
            com.sankuai.eh.plugins.skeleton.vg.a aVar = weakReference.get();
            Object[] objArr2 = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a04f2a4b1bfdb7fca1d234921985249c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a04f2a4b1bfdb7fca1d234921985249c");
                return;
            }
            d.b a2 = new d.b().a("name", "eh.fcp.show");
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.plugins.skeleton.vg.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a2a523653924d17405fa7d5086378c36", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a2a523653924d17405fa7d5086378c36");
            } else {
                b bVar = aVar.c;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                b2 = PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "01f9f084c82c62fa5dce34283eb230ac", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "01f9f084c82c62fa5dce34283eb230ac") : com.sankuai.eh.component.service.utils.b.b(bVar.b.get("pattern"), "unknown");
            }
            d.a("skt_show", a2.a("pageKey", b2).b);
            a(aVar, null);
            Object[] objArr5 = {context};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "78a994356c133ead4039c664c701f8b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "78a994356c133ead4039c664c701f8b7");
            } else {
                b.remove(f.a(context));
            }
        }
    }
}
