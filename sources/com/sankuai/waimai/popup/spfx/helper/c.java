package com.sankuai.waimai.popup.spfx.helper;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.popup.spfx.particle.ParticleField;
import com.sankuai.waimai.popup.spfx.particle.initializers.d;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(@Nullable final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cd2d531a3e78db644f240c955707091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cd2d531a3e78db644f240c955707091");
        } else if (view == null) {
        } else {
            final ViewGroup viewGroup = (ViewGroup) view.getRootView();
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.popup.spfx.helper.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ebf6995ec03501ff430c3f595a806cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ebf6995ec03501ff430c3f595a806cb");
                        return;
                    }
                    viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    com.meituan.roodesign.resfetcher.runtime.c.a(view.getContext(), "waimai_c_wm_c_pagekit_image_special_effect_smock", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.popup.spfx.helper.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.roodesign.resfetcher.runtime.b
                        public final void a(Drawable drawable, boolean z) {
                            Object[] objArr3 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d6045218be82fe3a4b81c84ee58f2ec", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d6045218be82fe3a4b81c84ee58f2ec");
                                return;
                            }
                            com.sankuai.waimai.popup.spfx.particle.b bVar = new com.sankuai.waimai.popup.spfx.particle.b(viewGroup, 60, drawable, 6000L);
                            Object[] objArr4 = {Float.valueOf(-0.015f), Float.valueOf(0.015f), Float.valueOf(-0.02f), Float.valueOf(-0.04f)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.popup.spfx.particle.b.a;
                            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "0f0153bc6727972b6be9169adee876f0", RobustBitConfig.DEFAULT_VALUE)) {
                                bVar = (com.sankuai.waimai.popup.spfx.particle.b) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "0f0153bc6727972b6be9169adee876f0");
                            } else {
                                bVar.i.add(new d(bVar.m * (-0.015f), bVar.m * 0.015f, bVar.m * (-0.02f), bVar.m * (-0.04f)));
                            }
                            Object[] objArr5 = {Float.valueOf(5.0E-6f), 270};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.popup.spfx.particle.b.a;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "46e38d52f00d5a80f932d16004f03633", RobustBitConfig.DEFAULT_VALUE)) {
                                bVar = (com.sankuai.waimai.popup.spfx.particle.b) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "46e38d52f00d5a80f932d16004f03633");
                            } else {
                                bVar.i.add(new com.sankuai.waimai.popup.spfx.particle.initializers.a(5.0E-6f, 5.0E-6f, 270, 270));
                            }
                            Object[] objArr6 = {0, 360};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.popup.spfx.particle.b.a;
                            if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "9e6624e47374f4de58f3da8e73fcc42d", RobustBitConfig.DEFAULT_VALUE)) {
                                bVar = (com.sankuai.waimai.popup.spfx.particle.b) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "9e6624e47374f4de58f3da8e73fcc42d");
                            } else {
                                bVar.i.add(new com.sankuai.waimai.popup.spfx.particle.initializers.c(0, 360));
                            }
                            com.sankuai.waimai.popup.spfx.particle.b a2 = bVar.a(new com.sankuai.waimai.popup.spfx.particle.modifiers.a(120, 0, 0L, 6000L)).a(new com.sankuai.waimai.popup.spfx.particle.modifiers.c(0.1f, 3.0f, 0L, 4000L));
                            View view2 = view;
                            int width = view.getWidth() / 4;
                            int width2 = view.getWidth() / 4;
                            Object[] objArr7 = {view2, Integer.valueOf(width), Integer.valueOf(width2), 1};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.popup.spfx.particle.b.a;
                            if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "76a649d5e09ecff5500fe9e07c2a7e1f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "76a649d5e09ecff5500fe9e07c2a7e1f");
                                return;
                            }
                            int[] iArr = new int[2];
                            view2.getLocationInWindow(iArr);
                            a2.o = (iArr[0] - a2.n[0]) + width;
                            a2.p = ((iArr[0] + view2.getWidth()) - a2.n[0]) - width2;
                            a2.q = (iArr[1] + (view2.getHeight() / 2)) - a2.n[1];
                            a2.r = a2.q;
                            Object[] objArr8 = {1};
                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.popup.spfx.particle.b.a;
                            if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "5c3aa6f07d71df788747954d940a9721", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "5c3aa6f07d71df788747954d940a9721");
                                return;
                            }
                            a2.g = 0;
                            a2.f = 1 / 1000.0f;
                            a2.d = new ParticleField(a2.c.getContext());
                            a2.c.addView(a2.d);
                            a2.h = -1L;
                            a2.d.setParticles(a2.e);
                            a2.a(1);
                            a2.l = a2.j.scheduleAtFixedRate(a2.k, 0L, com.sankuai.waimai.popup.spfx.particle.b.b, TimeUnit.MILLISECONDS);
                        }
                    });
                }
            });
        }
    }
}
