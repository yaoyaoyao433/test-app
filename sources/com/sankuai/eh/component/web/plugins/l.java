package com.sankuai.eh.component.web.plugins;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.gson.JsonElement;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends b {
    public static ChangeQuickRedirect a;
    private com.sankuai.eh.plugins.spa.a b;

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "00";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "trans";
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88191312a5e9aca202202610996b5dbc", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88191312a5e9aca202202610996b5dbc") : new String[]{"onViewCrated", "onKNBJSCall"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        boolean booleanValue;
        boolean z;
        boolean z2;
        boolean z3;
        Bitmap bitmap;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9536a98f0c55ff54beda98c47b20497e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9536a98f0c55ff54beda98c47b20497e");
            return;
        }
        String a2 = aVar.a();
        char c = 65535;
        int hashCode = a2.hashCode();
        if (hashCode != -1011630009) {
            if (hashCode == 1018055493 && a2.equals("onViewCrated")) {
                c = 0;
            }
        } else if (a2.equals("onKNBJSCall")) {
            c = 1;
        }
        switch (c) {
            case 0:
                this.b = new com.sankuai.eh.plugins.spa.a(this.d.i);
                return;
            case 1:
                if (this.b == null) {
                    return;
                }
                if ("transStart".equals(aVar.b())) {
                    h();
                    int optInt = aVar.c().optInt(Constants.SPEED_METER_STEP);
                    com.sankuai.eh.component.web.bridge.c cVar = (com.sankuai.eh.component.web.bridge.c) aVar.d();
                    com.sankuai.eh.plugins.spa.a aVar2 = this.b;
                    Object[] objArr2 = {Integer.valueOf(optInt)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.plugins.spa.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "15ed84742f8b15d0f85f233dfecfbebc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "15ed84742f8b15d0f85f233dfecfbebc");
                    } else {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.plugins.spa.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "a3a1ff09d90be38340a905788c935028", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "a3a1ff09d90be38340a905788c935028")).booleanValue();
                        } else {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.service.utils.d.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f25166fe7a238611afe37b3381587ee4", RobustBitConfig.DEFAULT_VALUE)) {
                                booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f25166fe7a238611afe37b3381587ee4")).booleanValue();
                            } else {
                                if (com.sankuai.eh.component.service.utils.d.b == null) {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.component.service.utils.d.a;
                                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e32928c6a86262d5e7ca8aac46403e3e", RobustBitConfig.DEFAULT_VALUE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e32928c6a86262d5e7ca8aac46403e3e")).booleanValue();
                                    } else {
                                        int a3 = com.sankuai.eh.component.service.utils.d.a();
                                        z = a3 > 0 && a3 / 1024 <= 1024;
                                    }
                                    com.sankuai.eh.component.service.utils.d.b = Boolean.valueOf(z);
                                }
                                booleanValue = com.sankuai.eh.component.service.utils.d.b.booleanValue();
                            }
                            if (!booleanValue) {
                                Context b = com.sankuai.eh.component.service.a.b();
                                Object[] objArr6 = {b};
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.eh.component.service.utils.d.a;
                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "83e68270e13de0d92d9c875e8adf9215", RobustBitConfig.DEFAULT_VALUE)) {
                                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "83e68270e13de0d92d9c875e8adf9215")).booleanValue();
                                } else if (b instanceof Activity) {
                                    ActivityManager activityManager = (ActivityManager) b.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    if (activityManager != null) {
                                        activityManager.getMemoryInfo(memoryInfo);
                                    }
                                    z3 = memoryInfo.lowMemory;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            View view = aVar2.d;
                            Object[] objArr7 = {view};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.eh.plugins.spa.a.a;
                            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "9f1c651a1591f9266b27b1f080316082", RobustBitConfig.DEFAULT_VALUE)) {
                                bitmap = (Bitmap) PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "9f1c651a1591f9266b27b1f080316082");
                            } else if (view != null) {
                                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                                Canvas canvas = new Canvas(createBitmap);
                                view.draw(canvas);
                                canvas.setBitmap(null);
                                bitmap = createBitmap;
                            } else {
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                if (optInt > 0) {
                                    aVar2.e.setImageBitmap(bitmap);
                                    aVar2.e.setVisibility(0);
                                } else if (optInt < 0) {
                                    aVar2.e.setImageBitmap(bitmap);
                                    aVar2.e.setVisibility(0);
                                    aVar2.e.bringToFront();
                                }
                                aVar2.d.setVisibility(4);
                            }
                        }
                    }
                    cVar.a(null);
                    return;
                } else if ("transComplete".equals(aVar.b())) {
                    int optInt2 = aVar.c().optInt("dr");
                    com.sankuai.eh.component.web.bridge.c cVar2 = (com.sankuai.eh.component.web.bridge.c) aVar.d();
                    com.sankuai.eh.plugins.spa.a aVar3 = this.b;
                    Object[] objArr8 = {Integer.valueOf(optInt2), (byte) 1};
                    ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.eh.plugins.spa.a.a;
                    if (PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "d314d6471befdb15569e4ccae2a8023f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "d314d6471befdb15569e4ccae2a8023f");
                    } else if (aVar3.d.getVisibility() != 0) {
                        if (optInt2 > 0) {
                            aVar3.d.startAnimation(aVar3.b);
                        } else if (optInt2 < 0) {
                            aVar3.e.startAnimation(aVar3.c);
                        }
                    }
                    cVar2.a(null);
                    a(true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
