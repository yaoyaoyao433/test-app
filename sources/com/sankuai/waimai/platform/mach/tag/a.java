package com.sankuai.waimai.platform.mach.tag;

import android.app.Activity;
import android.content.Context;
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
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualtag.g;
import com.sankuai.waimai.platform.widget.tag.virtualtag.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<TagCanvasView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    public g b;
    public int c;
    public int d;
    private List<d> e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private c k;
    private boolean r;
    private int s;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(TagCanvasView tagCanvasView) {
        TagCanvasView tagCanvasView2 = tagCanvasView;
        Object[] objArr = {tagCanvasView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d84a3051d59b4707a642dd7d69620a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d84a3051d59b4707a642dd7d69620a");
            return;
        }
        super.a((a) tagCanvasView2);
        if (tagCanvasView2 instanceof b) {
            ((b) tagCanvasView2).a(this.c, this.d);
        }
        tagCanvasView2.setMaxLines(this.f);
        tagCanvasView2.setTagSpace(this.h);
        tagCanvasView2.setLineSpace(this.i);
        tagCanvasView2.setAdapter(this.b);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ TagCanvasView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd8407f18d96f7819c1698f7be0c40f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd8407f18d96f7819c1698f7be0c40f");
        }
        b bVar = new b(context);
        bVar.a(this.c, this.d);
        return bVar;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a166002e8e3bcc6e180352eb89d87814", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a166002e8e3bcc6e180352eb89d87814");
            return;
        }
        this.e = new ArrayList();
        this.f = 1;
        this.g = 1;
        this.r = false;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8aeac7c1353935917dcdce0dc8a3b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8aeac7c1353935917dcdce0dc8a3b9c");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        String b = b(NumberOfLines.NAME);
        if (i(b)) {
            this.f = (int) com.sankuai.waimai.mach.utils.g.a(b);
        } else {
            this.f = 1;
        }
        if (this.f <= 0) {
            this.f = Integer.MAX_VALUE;
        }
        String a2 = a("collapsed-lines");
        if (i(a2)) {
            this.g = f(a2);
        } else {
            this.g = 1;
        }
        String a3 = a("expanded");
        if (i(a3)) {
            this.j = g(a3);
        }
        Activity activity = this.m != null ? this.m.getActivity() : null;
        String a4 = a("tag-spacing");
        if (i(a4)) {
            this.h = (int) i.c(a4);
        } else if (activity != null) {
            this.h = com.sankuai.waimai.foundation.utils.g.a(activity, 4.0f);
        }
        String a5 = a("line-spacing");
        if (i(a5)) {
            this.i = (int) i.c(a5);
        } else if (activity != null) {
            this.i = com.sankuai.waimai.foundation.utils.g.a(activity, 4.0f);
        }
        this.k = null;
        try {
            Map map = (Map) k().get("native-dynamic-info");
            if (map != null && !map.isEmpty()) {
                this.k = new c();
                this.k.c = f(String.valueOf(map.get("nativeTagHeight")));
                this.k.a = c(String.valueOf(map.get("nativeBorderWidth")));
                this.k.b = c(String.valueOf(map.get("nativeSubTagBorderWidth")));
            }
        } catch (Exception unused) {
        }
        this.e.clear();
        Map<String, Object> k = k();
        if (k == null || !k.containsKey("data")) {
            return;
        }
        Object obj = k.get("data");
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof d) {
                    this.e.add((d) obj2);
                } else if (obj2 instanceof Map) {
                    try {
                        dVar = (d) k.a().fromJson(k.a().toJson(obj2), (Class<Object>) d.class);
                    } catch (Exception unused2) {
                        dVar = null;
                    }
                    if (dVar != null) {
                        this.e.add(dVar);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c13375eb9aebdb8435b020e69af668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c13375eb9aebdb8435b020e69af668");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37849cc9234069b3552ed52973e91f7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37849cc9234069b3552ed52973e91f7c");
        } else {
            com.sankuai.waimai.mach.node.a aVar = this.n.e;
            if (aVar != null && !this.r && (!this.j || this.g >= this.s)) {
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
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "758c076a682280c5c0aa26626aa9f53f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "758c076a682280c5c0aa26626aa9f53f");
        } else if (this.b == null || this.m == null || (a2 = a(this.b.b())) == null || a2.isEmpty()) {
        } else {
            this.m.sendJsEvent("dynamic_tags_render_event", a2);
        }
    }

    private Map<String, Object> a(List<j> list) {
        int intValue;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892458e1cd652a1722aa888b63f28050", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892458e1cd652a1722aa888b63f28050");
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

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe40914c106705887e72fc1cf02bf81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe40914c106705887e72fc1cf02bf81")).longValue();
        }
        if (this.m == null || this.m.getActivity() == null) {
            return 0L;
        }
        Activity activity = this.m.getActivity();
        TagCanvasView tagCanvasView = new TagCanvasView(activity);
        if (this.b == null) {
            this.b = new g(activity, com.sankuai.waimai.platform.widget.tag.util.a.a(activity, this.e, this.k));
        }
        tagCanvasView.setAdapter(this.b);
        tagCanvasView.setMaxLines(this.f);
        tagCanvasView.setTagSpace(this.h);
        tagCanvasView.setLineSpace(this.i);
        tagCanvasView.setPadding((int) dVar.c(YogaEdge.LEFT).d, (int) dVar.c(YogaEdge.TOP).d, (int) dVar.c(YogaEdge.RIGHT).d, (int) dVar.c(YogaEdge.BOTTOM).d);
        int a2 = SizeSpec.a(f, yogaMeasureMode);
        int a3 = SizeSpec.a(f2, yogaMeasureMode2);
        tagCanvasView.measure(a2, a3);
        this.c = a2;
        this.d = a3;
        int measuredWidth = tagCanvasView.getMeasuredWidth();
        int measuredHeight = tagCanvasView.getMeasuredHeight();
        this.r = this.b.d;
        this.s = this.b.b().size();
        tagCanvasView.setAdapter(null);
        return com.facebook.yoga.c.a(measuredWidth, measuredHeight);
    }
}
