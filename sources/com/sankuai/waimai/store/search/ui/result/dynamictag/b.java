package com.sankuai.waimai.store.search.ui.result.dynamictag;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.platform.widget.tag.model.f;
import com.sankuai.waimai.platform.widget.tag.model.g;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.e;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @NonNull
    public static List<c> a(Context context, List<SGSearchTagInfo> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c1b5dab3e3d31270ad30c8df123f615", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c1b5dab3e3d31270ad30c8df123f615");
        }
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        for (SGSearchTagInfo sGSearchTagInfo : list) {
            if (sGSearchTagInfo != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c a2 = a(context, sGSearchTagInfo);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    private static c a(Context context, SGSearchTagInfo sGSearchTagInfo) {
        List<com.sankuai.waimai.platform.widget.tag.model.a> emptyList;
        g gVar;
        e e;
        com.sankuai.waimai.platform.widget.tag.virtualview.render.a a2;
        com.sankuai.waimai.platform.widget.tag.model.a aVar;
        h e2;
        Object[] objArr = {context, sGSearchTagInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e976168b7b713ce544eb53d9a2124c63", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e976168b7b713ce544eb53d9a2124c63");
        }
        if (sGSearchTagInfo == null) {
            return null;
        }
        c d = c.d();
        d.l = sGSearchTagInfo.priority;
        d.g = sGSearchTagInfo.ruleId;
        d.h = sGSearchTagInfo.clickUrl;
        d.e = a(context, (com.sankuai.waimai.platform.widget.tag.api.a) sGSearchTagInfo);
        d.j = sGSearchTagInfo.useSpecificMargin;
        d.k = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(sGSearchTagInfo.marginBottom));
        if (sGSearchTagInfo.subTagBaseInfoList == null || sGSearchTagInfo.subTagBaseInfoList.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = null;
            for (com.sankuai.waimai.platform.widget.tag.api.e eVar : sGSearchTagInfo.subTagBaseInfoList) {
                if (eVar != null) {
                    if (emptyList == null) {
                        emptyList = new ArrayList<>();
                    }
                    Object[] objArr2 = {context, eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a43bdf003497117a3b2fba5ef3e89e9c", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (com.sankuai.waimai.platform.widget.tag.model.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a43bdf003497117a3b2fba5ef3e89e9c");
                    } else if (eVar == null) {
                        aVar = null;
                    } else {
                        if (eVar.a == 0) {
                            Object[] objArr3 = {context, eVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "257e268f549b512380eec1b53af20a8f", RobustBitConfig.DEFAULT_VALUE)) {
                                e2 = (h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "257e268f549b512380eec1b53af20a8f");
                            } else {
                                e2 = h.e();
                                e2.e = b(eVar.l) > 400.0f;
                                e2.f = eVar.h;
                                e2.d = com.sankuai.waimai.platform.widget.tag.util.b.b(context, a(eVar.k, 11.0f));
                                e2.i = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.m));
                                e2.h = a(eVar.j, (Integer) (-16777216)).intValue();
                            }
                            gVar = g.a(e2);
                        } else if (eVar.a == 1) {
                            com.sankuai.waimai.platform.widget.tag.model.c d2 = com.sankuai.waimai.platform.widget.tag.model.c.d();
                            Object[] objArr4 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2e29ee416ddb6e39a8e17d76e858a3ae", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (com.sankuai.waimai.platform.widget.tag.virtualview.render.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2e29ee416ddb6e39a8e17d76e858a3ae");
                            } else {
                                a2 = com.sankuai.waimai.platform.widget.tag.virtualview.render.a.a(TextUtils.isEmpty(eVar.e) ? Uri.EMPTY : Uri.parse(eVar.e));
                            }
                            d2.p = a2;
                            d2.q = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.f));
                            d2.r = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.g));
                            gVar = d2;
                        } else if (eVar.a == 2) {
                            gVar = f.a(com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.f)), com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.g)));
                        } else if (eVar.a == 3) {
                            Object[] objArr5 = {context, eVar};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4d06fc220edce3d1a5f985770647b0f4", RobustBitConfig.DEFAULT_VALUE)) {
                                e = (e) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4d06fc220edce3d1a5f985770647b0f4");
                            } else {
                                e = e.e();
                                e.e = b(eVar.l) > 400.0f;
                                e.f = eVar.h;
                                e.d = com.sankuai.waimai.platform.widget.tag.util.b.b(context, a(eVar.k, 11.0f));
                                e.i = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.m));
                                e.h = a(eVar.j, (Integer) (-16777216));
                                e.j = a(eVar.p, 1);
                                e.k = com.sankuai.waimai.platform.widget.tag.util.b.a(context, a(eVar.q, 0.0f));
                                e.l = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.r));
                            }
                            gVar = com.sankuai.waimai.platform.widget.tag.model.e.a(e);
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            gVar.e = eVar.a;
                            gVar.d = eVar.b;
                            gVar.f = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.c));
                            gVar.g = com.sankuai.waimai.platform.widget.tag.util.b.a(context, b(eVar.d));
                            gVar.n = a(context, eVar);
                            gVar.i = eVar.o;
                            gVar.h = eVar.n;
                        }
                        aVar = gVar;
                    }
                    if (aVar != null) {
                        emptyList.add(aVar);
                    }
                }
            }
        }
        if (emptyList == null) {
            emptyList = Collections.emptyList();
        }
        d.i = emptyList;
        return d;
    }

    private static com.sankuai.waimai.platform.widget.tag.virtualview.render.g a(Context context, com.sankuai.waimai.platform.widget.tag.api.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ba65c84cb0e3164408a3d471691531f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.tag.virtualview.render.g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ba65c84cb0e3164408a3d471691531f");
        }
        if (aVar == null) {
            return null;
        }
        g.a e = g.a.e();
        e.i = a(aVar.backgroundColor);
        e.e = null;
        e.d = aVar.backgroundUrl;
        if (aVar.gradientColor != null) {
            e.h = aVar.gradientColor.c;
            e.f = a(aVar.gradientColor.a);
            e.g = a(aVar.gradientColor.b);
        }
        e.f();
        g.b e2 = g.b.e();
        e2.d = a(aVar.borderColor);
        if (e2.d != null) {
            e2.e = com.sankuai.waimai.platform.widget.tag.util.b.a(context, 0.5f);
        }
        if (aVar.cornerRadiusArray != null && aVar.cornerRadiusArray.length >= 4) {
            e2.f = new float[4];
            for (int i = 0; i < 4; i++) {
                e2.f[i] = com.sankuai.waimai.platform.widget.tag.util.b.a(context, a(aVar.cornerRadiusArray[i], 0.0f));
            }
        } else {
            e2.f = null;
        }
        return com.sankuai.waimai.platform.widget.tag.virtualview.render.g.a(e, e2, a(aVar.alignment, 0));
    }

    private static Integer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e65fb232aea8ab6cbf5cabf9db576b7a", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e65fb232aea8ab6cbf5cabf9db576b7a") : a(str, (Integer) null);
    }

    private static Integer a(String str, Integer num) {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e70f30dc3275829a7722285386042bf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e70f30dc3275829a7722285386042bf7");
        }
        return Integer.valueOf(ColorUtils.a(str, num != null ? num.intValue() : 0));
    }

    private static float b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f990c46028a052c6d5a316add3a2e911", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f990c46028a052c6d5a316add3a2e911")).floatValue() : a(str, 0.0f);
    }

    private static float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b6ae69fef674d0422b77d0a47a10041", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b6ae69fef674d0422b77d0a47a10041")).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    private static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a89149763238d54123c56dd5eb3e7ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a89149763238d54123c56dd5eb3e7ae")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
