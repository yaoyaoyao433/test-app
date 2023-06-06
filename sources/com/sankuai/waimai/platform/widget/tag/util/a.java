package com.sankuai.waimai.platform.widget.tag.util;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.widget.tag.model.f;
import com.sankuai.waimai.platform.widget.tag.model.g;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.e;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @NonNull
    public static List<com.sankuai.waimai.platform.widget.tag.model.d> a(Context context, List<com.sankuai.waimai.platform.widget.tag.api.d> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbf2d704440763fd141aaa2bd97d97de", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbf2d704440763fd141aaa2bd97d97de") : a(context, list, (com.sankuai.waimai.platform.mach.tag.c) null);
    }

    @NonNull
    public static List<com.sankuai.waimai.platform.widget.tag.model.d> a(Context context, List<com.sankuai.waimai.platform.widget.tag.api.d> list, com.sankuai.waimai.platform.mach.tag.c cVar) {
        Object[] objArr = {context, list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07acfc89d5d37646c12057a984c92bf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07acfc89d5d37646c12057a984c92bf4");
        }
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        com.sankuai.waimai.report.c.a(com.sankuai.waimai.report.b.a);
        for (com.sankuai.waimai.platform.widget.tag.api.d dVar : list) {
            if (dVar != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                com.sankuai.waimai.platform.widget.tag.model.d a2 = a(context, dVar, cVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (!com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
            com.sankuai.waimai.report.c.a(com.sankuai.waimai.report.b.b);
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    private static com.sankuai.waimai.platform.widget.tag.model.d a(Context context, com.sankuai.waimai.platform.widget.tag.api.d dVar, com.sankuai.waimai.platform.mach.tag.c cVar) {
        int i;
        List<com.sankuai.waimai.platform.widget.tag.model.a> emptyList;
        g gVar;
        e e;
        com.sankuai.waimai.platform.widget.tag.virtualview.render.a a2;
        com.sankuai.waimai.platform.widget.tag.model.a aVar;
        h e2;
        Object[] objArr = {context, dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "664de1e78a75dfed5c9d8ffe92cc00d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.tag.model.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "664de1e78a75dfed5c9d8ffe92cc00d1");
        }
        if (dVar == null) {
            return null;
        }
        com.sankuai.waimai.platform.widget.tag.model.d d = com.sankuai.waimai.platform.widget.tag.model.d.d();
        d.d = dVar.ruleId;
        d.e = dVar.clickUrl;
        d.n = a(context, (com.sankuai.waimai.platform.widget.tag.api.a) dVar, cVar);
        d.g = dVar.useSpecificMargin;
        d.h = b.a(context, b(dVar.marginBottom));
        d.j = dVar.clickCallbackInfo;
        d.o = dVar.clickExposeInfo;
        if (dVar.useDynamicHeight) {
            i = a(dVar.tagHeight, 0);
        } else {
            i = cVar != null ? cVar.c : 0;
        }
        d.i = b.a(context, i > 0 ? i : 16.0f);
        if (dVar.subTagBaseInfoList == null || dVar.subTagBaseInfoList.isEmpty()) {
            emptyList = Collections.emptyList();
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.tag.log.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b633c9dd12d79c80ea61be6f13f4b7a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b633c9dd12d79c80ea61be6f13f4b7a8");
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tagData", k.a().toJson(dVar, com.sankuai.waimai.platform.widget.tag.api.d.class));
                } catch (Exception unused) {
                }
                i.d(new com.sankuai.waimai.platform.widget.tag.log.b().a("dynamic_tag").b("empty_subtag_data").d(jSONObject.toString()).c("业务侧传递过来的子标签数组为空").b());
            }
        } else {
            emptyList = null;
            for (com.sankuai.waimai.platform.widget.tag.api.e eVar : dVar.subTagBaseInfoList) {
                if (eVar != null) {
                    if (emptyList == null) {
                        emptyList = new ArrayList<>();
                    }
                    Object[] objArr3 = {context, d, eVar, cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c83c2e076e1e057b2d7a408dfeed0571", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (com.sankuai.waimai.platform.widget.tag.model.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c83c2e076e1e057b2d7a408dfeed0571");
                    } else if (eVar == null) {
                        aVar = null;
                    } else {
                        if (eVar.a == 0) {
                            Object[] objArr4 = {context, eVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8d2c60e090fad7b99263a69abe8a687b", RobustBitConfig.DEFAULT_VALUE)) {
                                e2 = (h) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8d2c60e090fad7b99263a69abe8a687b");
                            } else {
                                e2 = h.e();
                                e2.e = b(eVar.l) > 400.0f;
                                e2.f = eVar.h;
                                e2.g = eVar.i;
                                e2.d = b.b(context, a(eVar.k, 11.0f));
                                e2.i = b.a(context, b(eVar.m));
                                e2.h = a(eVar.j, (Integer) (-16777216)).intValue();
                            }
                            gVar = g.a(e2, d != null ? d.i : 0);
                        } else if (eVar.a == 1) {
                            com.sankuai.waimai.platform.widget.tag.model.c d2 = com.sankuai.waimai.platform.widget.tag.model.c.d();
                            Object[] objArr5 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "d8b9e8ba8ed40f5bfb4c22d3ee23c018", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (com.sankuai.waimai.platform.widget.tag.virtualview.render.a) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "d8b9e8ba8ed40f5bfb4c22d3ee23c018");
                            } else {
                                a2 = com.sankuai.waimai.platform.widget.tag.virtualview.render.a.a(TextUtils.isEmpty(eVar.e) ? Uri.EMPTY : Uri.parse(eVar.e));
                            }
                            d2.p = a2;
                            d2.q = b.a(context, b(eVar.f));
                            d2.r = b.a(context, b(eVar.g));
                            gVar = d2;
                        } else if (eVar.a == 2) {
                            gVar = f.a(b.a(context, b(eVar.f)), b.a(context, b(eVar.g)));
                        } else if (eVar.a == 3) {
                            Object[] objArr6 = {context, eVar};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "bb0633a7db5c6f2339fb9c10171aebb5", RobustBitConfig.DEFAULT_VALUE)) {
                                e = (e) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "bb0633a7db5c6f2339fb9c10171aebb5");
                            } else {
                                e = e.e();
                                e.e = b(eVar.l) > 400.0f;
                                e.f = eVar.h;
                                e.g = eVar.i;
                                e.d = b.b(context, a(eVar.k, 11.0f));
                                e.i = b.a(context, b(eVar.m));
                                e.h = a(eVar.j, (Integer) (-16777216));
                                e.j = a(eVar.p, 1);
                                e.k = b.a(context, a(eVar.q, 0.0f));
                                e.l = b.a(context, b(eVar.r));
                            }
                            gVar = com.sankuai.waimai.platform.widget.tag.model.e.a(e);
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            gVar.e = eVar.a;
                            gVar.d = eVar.b;
                            gVar.f = b.a(context, b(eVar.c));
                            gVar.g = b.a(context, b(eVar.d));
                            gVar.n = a(context, eVar, cVar);
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
        d.f = emptyList;
        return d;
    }

    private static com.sankuai.waimai.platform.widget.tag.virtualview.render.g a(Context context, com.sankuai.waimai.platform.widget.tag.api.a aVar, com.sankuai.waimai.platform.mach.tag.c cVar) {
        float f;
        Object[] objArr = {context, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "878f94c6948011d54ba5bf04d40ef9d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.tag.virtualview.render.g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "878f94c6948011d54ba5bf04d40ef9d6");
        }
        if (aVar == null) {
            return null;
        }
        g.a e = g.a.e();
        e.i = a(aVar.backgroundColor);
        e.e = com.sankuai.waimai.platform.widget.tag.a.a(aVar.backgroundImage);
        e.d = a(aVar);
        if (aVar.gradientColor != null) {
            e.h = aVar.gradientColor.c;
            e.f = a(aVar.gradientColor.a);
            e.g = a(aVar.gradientColor.b);
        }
        e.f();
        g.b e2 = g.b.e();
        e2.d = a(aVar.borderColor);
        if (e2.d != null) {
            if (aVar.useDynamicBorderWidth) {
                f = b(aVar.borderWidth);
            } else if (aVar instanceof com.sankuai.waimai.platform.widget.tag.api.d) {
                if (cVar != null) {
                    f = cVar.a;
                }
                f = 0.0f;
            } else {
                if ((aVar instanceof com.sankuai.waimai.platform.widget.tag.api.e) && cVar != null) {
                    f = cVar.b;
                }
                f = 0.0f;
            }
            if (f <= 0.0f) {
                f = 0.5f;
            }
            e2.e = b.a(context, f);
        }
        if (aVar.cornerRadiusArray != null && aVar.cornerRadiusArray.length >= 4) {
            e2.f = new float[4];
            for (int i = 0; i < 4; i++) {
                e2.f[i] = b.a(context, a(aVar.cornerRadiusArray[i], 0.0f));
            }
        } else {
            e2.f = null;
        }
        return com.sankuai.waimai.platform.widget.tag.virtualview.render.g.a(e, e2, a(aVar.alignment, 0));
    }

    private static String a(com.sankuai.waimai.platform.widget.tag.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2dc6fe0e07aa99acab09639addc5564", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2dc6fe0e07aa99acab09639addc5564");
        }
        String str = aVar.backgroundUrl;
        if (str == null || str.indexOf(58) == -1) {
            return null;
        }
        return str;
    }

    private static Integer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21532ca631f9466702a90188c16555e4", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21532ca631f9466702a90188c16555e4") : a(str, (Integer) null);
    }

    private static Integer a(String str, Integer num) {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e52ddec1156fc90dfc479122ea45739", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e52ddec1156fc90dfc479122ea45739");
        }
        if (TextUtils.isEmpty(str)) {
            return num;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return num;
        }
    }

    private static float b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e83f70d69d626d21ab79148a7e91056a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e83f70d69d626d21ab79148a7e91056a")).floatValue() : a(str, 0.0f);
    }

    private static float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1493ed85d334ba382292cb7410fde1de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1493ed85d334ba382292cb7410fde1de")).floatValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d387bc780eab43b236090dc21138643", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d387bc780eab43b236090dc21138643")).intValue();
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
