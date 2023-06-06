package com.sankuai.waimai.store.mach.sm_dynamic_tag;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.mach.utils.i;
import com.sankuai.waimai.platform.mach.tag.b;
import com.sankuai.waimai.platform.mach.tag.c;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualtag.g;
import com.sankuai.waimai.platform.widget.tag.virtualtag.j;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<TagCanvasView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    private List<d> d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private c j;
    private g k;
    private boolean r;
    private int s;
    private com.sankuai.waimai.mach.parser.d t;

    public static /* synthetic */ void b(a aVar, com.sankuai.waimai.platform.widget.tag.api.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "00eaea9f8606743fb3a5f4da66d9390c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "00eaea9f8606743fb3a5f4da66d9390c");
            return;
        }
        try {
            String a2 = aVar.a(cVar);
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(cVar.a));
            hashMap.put("data", cVar.b);
            hashMap.put("click_url", a2);
            LinkedList linkedList = new LinkedList();
            linkedList.add(hashMap);
            aVar.m.asyncCallJSMethod(aVar.t.b, linkedList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(TagCanvasView tagCanvasView) {
        TagCanvasView tagCanvasView2 = tagCanvasView;
        Object[] objArr = {tagCanvasView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45a263f92d425ff72fb24c157b175fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45a263f92d425ff72fb24c157b175fb");
            return;
        }
        super.a((a) tagCanvasView2);
        if (tagCanvasView2 instanceof b) {
            ((b) tagCanvasView2).a(this.b, this.c);
        }
        tagCanvasView2.setMaxLines(this.e);
        tagCanvasView2.setTagSpace(this.g);
        tagCanvasView2.setLineSpace(this.h);
        if (this.k != null) {
            this.k.h = new CanvasView.a.InterfaceC1104a() { // from class: com.sankuai.waimai.store.mach.sm_dynamic_tag.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a.InterfaceC1104a
                public final boolean a(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map) {
                    Object[] objArr2 = {cVar, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14d7a69b29bb41c912aae1c3e9b824df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14d7a69b29bb41c912aae1c3e9b824df")).booleanValue() : !TextUtils.isEmpty(a.this.a(cVar));
                }

                @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a.InterfaceC1104a
                public final void b(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map) {
                    Object[] objArr2 = {cVar, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1b413a6b97c8d9ce3dbae9c2199230c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1b413a6b97c8d9ce3dbae9c2199230c");
                    } else {
                        a.b(a.this, cVar);
                    }
                }
            };
            tagCanvasView2.setAdapter(this.k);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ TagCanvasView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0e257459b4de0f8782477840833f63", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0e257459b4de0f8782477840833f63");
        }
        b bVar = new b(context);
        bVar.a(this.b, this.c);
        return bVar;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d276214791be86d6bb38e9b8779f4be3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d276214791be86d6bb38e9b8779f4be3");
            return;
        }
        this.d = new ArrayList();
        this.e = 1;
        this.f = 1;
        this.r = false;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "840b3fd0ddcd071b109940aa5f0b2225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "840b3fd0ddcd071b109940aa5f0b2225");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        String b = b(NumberOfLines.NAME);
        if (i(b)) {
            this.e = (int) com.sankuai.waimai.mach.utils.g.a(b);
        } else {
            this.e = 1;
        }
        if (this.e <= 0) {
            this.e = Integer.MAX_VALUE;
        }
        String a2 = a("collapsed-lines");
        if (i(a2)) {
            this.f = f(a2);
        } else {
            this.f = 1;
        }
        String a3 = a("expanded");
        if (i(a3)) {
            this.i = g(a3);
        }
        Activity activity = this.m != null ? this.m.getActivity() : null;
        String a4 = a("tag-spacing");
        if (i(a4)) {
            this.g = (int) i.c(a4);
        } else if (activity != null) {
            this.g = com.sankuai.waimai.foundation.utils.g.a(activity, 4.0f);
        }
        String a5 = a("line-spacing");
        if (i(a5)) {
            this.h = (int) i.c(a5);
        } else if (activity != null) {
            this.h = com.sankuai.waimai.foundation.utils.g.a(activity, 4.0f);
        }
        this.j = null;
        try {
            Map map = (Map) k().get("native-dynamic-info");
            if (map != null && !map.isEmpty()) {
                this.j = new c();
                this.j.c = f(String.valueOf(map.get("nativeTagHeight")));
                this.j.a = c(String.valueOf(map.get("nativeBorderWidth")));
                this.j.b = c(String.valueOf(map.get("nativeSubTagBorderWidth")));
            }
        } catch (Exception unused) {
        }
        if (k() != null && (k().get("@sm-tag-click") instanceof com.sankuai.waimai.mach.parser.d)) {
            this.t = (com.sankuai.waimai.mach.parser.d) k().get("@sm-tag-click");
        }
        this.d.clear();
        Map<String, Object> k = k();
        if (k == null || !k.containsKey("data")) {
            return;
        }
        Object obj = k.get("data");
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof d) {
                    this.d.add((d) obj2);
                } else if (obj2 instanceof Map) {
                    try {
                        dVar = (d) k.a().fromJson(k.a().toJson(obj2), (Class<Object>) d.class);
                    } catch (Exception unused2) {
                        dVar = null;
                    }
                    if (dVar != null) {
                        this.d.add(dVar);
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void j() {
        Map<String, Object> a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b1e8e94043b74edce0827fd9c058d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b1e8e94043b74edce0827fd9c058d4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b1b5f9a896caabb6ca8021d9e92291f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b1b5f9a896caabb6ca8021d9e92291f");
        } else {
            com.sankuai.waimai.mach.node.a aVar = this.n.e;
            if (aVar != null && !this.r && (!this.i || this.f >= this.s)) {
                Iterator<com.sankuai.waimai.mach.node.a> it = aVar.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().h().containsKey("dynamic-tag-arrow")) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "048258c661ae9294375b51e001bdbc06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "048258c661ae9294375b51e001bdbc06");
        } else if (this.k == null || this.m == null || (a2 = a(this.k.b())) == null || a2.isEmpty()) {
        } else {
            this.m.sendJsEvent("dynamic_tags_render_event", a2);
        }
    }

    private Map<String, Object> a(List<j> list) {
        int intValue;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1346aa270a3d311b5cef586221b7142e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1346aa270a3d311b5cef586221b7142e");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (j jVar : list) {
            for (com.sankuai.waimai.platform.widget.tag.virtualtag.d dVar : jVar.d()) {
                for (com.sankuai.waimai.platform.widget.tag.virtualtag.i<?> iVar : dVar.d()) {
                    if (iVar.h >= 0) {
                        String valueOf = String.valueOf(iVar.h);
                        if (hashMap.get(valueOf) instanceof Integer) {
                            try {
                                intValue = ((Integer) hashMap.get(valueOf)).intValue();
                            } catch (Exception unused) {
                            }
                            hashMap.put(valueOf, Integer.valueOf(intValue + 1));
                        }
                        intValue = 0;
                        hashMap.put(valueOf, Integer.valueOf(intValue + 1));
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(com.sankuai.waimai.platform.widget.tag.api.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551d704264ab3ce63936bf28f8388668", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551d704264ab3ce63936bf28f8388668");
        }
        if (cVar == null || cVar.b == null) {
            return "";
        }
        for (d dVar : this.d) {
            if (dVar.clickCallbackInfo != null && dVar.clickCallbackInfo.b != null && cVar.b.equals(dVar.clickCallbackInfo.b)) {
                return dVar.clickUrl;
            }
        }
        return "";
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5a2a975a86cccf41419317cd4153d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5a2a975a86cccf41419317cd4153d8")).longValue();
        }
        if (this.m == null) {
            return 0L;
        }
        Activity activity = this.m.getActivity();
        TagCanvasView tagCanvasView = new TagCanvasView(activity);
        if (this.k == null) {
            this.k = new g(activity, com.sankuai.waimai.platform.widget.tag.util.a.a(activity, this.d, this.j));
        }
        tagCanvasView.setAdapter(this.k);
        tagCanvasView.setMaxLines(this.e);
        tagCanvasView.setTagSpace(this.g);
        tagCanvasView.setLineSpace(this.h);
        tagCanvasView.setPadding((int) dVar.c(YogaEdge.LEFT).d, (int) dVar.c(YogaEdge.TOP).d, (int) dVar.c(YogaEdge.RIGHT).d, (int) dVar.c(YogaEdge.BOTTOM).d);
        int a2 = SizeSpec.a(f, yogaMeasureMode);
        int a3 = SizeSpec.a(f2, yogaMeasureMode2);
        tagCanvasView.measure(a2, a3);
        this.b = a2;
        this.c = a3;
        int measuredWidth = tagCanvasView.getMeasuredWidth();
        int measuredHeight = tagCanvasView.getMeasuredHeight();
        this.r = this.k.d;
        this.s = this.k.b().size();
        tagCanvasView.setAdapter(null);
        return com.facebook.yoga.c.a(measuredWidth, measuredHeight);
    }
}
