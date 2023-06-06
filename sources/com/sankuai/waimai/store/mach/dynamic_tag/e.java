package com.sankuai.waimai.store.mach.dynamic_tag;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.mach.dynamic_tag.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.mach.component.base.a<TagCanvasView> implements YogaMeasureFunction, d.a {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    private List<c> d;
    private List<c> e;
    private final List<Poi.NewLabelInfoListItem> f;
    private final List<PoiVerticality.NewCategoryLabel> g;
    private boolean h;
    private boolean i;
    private com.sankuai.waimai.mach.parser.d j;
    private com.sankuai.waimai.mach.parser.d k;
    private d r;
    private String s;
    private int t;
    private boolean u;
    private boolean v;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void j() {
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b1fb295ad9b27a16b88acee766d5d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b1fb295ad9b27a16b88acee766d5d6");
            return;
        }
        this.f = new LinkedList();
        this.g = new LinkedList();
        this.h = true;
        this.s = "";
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(TagCanvasView tagCanvasView) {
        TagCanvasView tagCanvasView2 = tagCanvasView;
        Object[] objArr = {tagCanvasView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26771522c0194eb285e7176575496676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26771522c0194eb285e7176575496676");
            return;
        }
        super.a((e) tagCanvasView2);
        g();
        i();
        if (tagCanvasView2 instanceof f) {
            ((f) tagCanvasView2).a(this.b, this.c);
        }
        tagCanvasView2.setMaxLines(this.i ? 10 : 1);
        tagCanvasView2.setTagSpace(h.a(tagCanvasView2.getContext(), 4.0f));
        tagCanvasView2.setLineSpace(h.a(tagCanvasView2.getContext(), 8.0f));
        a(tagCanvasView2.getContext());
        tagCanvasView2.setAdapter(this.r);
        h();
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ TagCanvasView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a27d7589f241ea4a9200d933e1cfbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a27d7589f241ea4a9200d933e1cfbf");
        }
        f fVar = new f(context);
        fVar.a(this.b, this.c);
        return fVar;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855534d836bd5040d3d2fa90c267fbd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855534d836bd5040d3d2fa90c267fbd5");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        String a2 = a("expanded");
        if (i(a2)) {
            this.i = g(a2);
        }
        if (k() != null && (k().get("@render-finished") instanceof com.sankuai.waimai.mach.parser.d)) {
            this.j = (com.sankuai.waimai.mach.parser.d) k().get("@render-finished");
        }
        if (k() != null && (k().get("@first-line-visible") instanceof com.sankuai.waimai.mach.parser.d)) {
            this.k = (com.sankuai.waimai.mach.parser.d) k().get("@first-line-visible");
        }
        String a3 = a("is_new_style");
        if (i(a3)) {
            this.h = g(a3);
        }
        this.f.clear();
        this.g.clear();
        Map<String, Object> k = k();
        if (k.containsKey("single_data")) {
            for (Object obj : (List) k.get("single_data")) {
                if (obj instanceof Poi.NewLabelInfoListItem) {
                    this.f.add((Poi.NewLabelInfoListItem) obj);
                } else if (obj instanceof Map) {
                    this.f.add((Poi.NewLabelInfoListItem) i.a(i.a(obj), new TypeToken<Poi.NewLabelInfoListItem>() { // from class: com.sankuai.waimai.store.mach.dynamic_tag.e.1
                    }.getType()));
                }
            }
        }
        if (k.containsKey("multi_data")) {
            for (Object obj2 : (List) k.get("multi_data")) {
                if (obj2 instanceof PoiVerticality.NewCategoryLabel) {
                    this.g.add((PoiVerticality.NewCategoryLabel) obj2);
                } else if (obj2 instanceof Map) {
                    this.g.add((PoiVerticality.NewCategoryLabel) i.a(i.a(obj2), new TypeToken<PoiVerticality.NewCategoryLabel>() { // from class: com.sankuai.waimai.store.mach.dynamic_tag.e.2
                    }.getType()));
                }
            }
        }
        this.v = true;
        g();
    }

    private void f() {
        com.sankuai.waimai.platform.widget.tag.api.e eVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca58823db4ee4488dd152ed627fe664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca58823db4ee4488dd152ed627fe664");
        } else if (!com.sankuai.shangou.stone.util.a.b(this.f)) {
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setTextSize(h.a(e(), 11.0f));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int a2 = h.a(e(), 216.0f);
            int a3 = h.a(e(), 4.0f);
            for (Poi.NewLabelInfoListItem newLabelInfoListItem : this.f) {
                if (newLabelInfoListItem != null && !com.sankuai.shangou.stone.util.a.b(newLabelInfoListItem.subTagBaseInfoList) && (eVar = newLabelInfoListItem.subTagBaseInfoList.get(0)) != null) {
                    sb3.append(eVar.h);
                    sb3.append(";");
                    if (newLabelInfoListItem.priority == 0) {
                        arrayList2.add(eVar.h);
                    } else {
                        arrayList.add(eVar.h);
                    }
                }
            }
            if (sb3.length() > 0) {
                sb3.deleteCharAt(sb3.length() - 1);
            }
            for (String str : arrayList) {
                if (!t.a(str)) {
                    int measureText = a2 - (((int) (paint.measureText(str, 0, str.length()) + 0.5f)) + (a3 * 3));
                    if (measureText < 0) {
                        break;
                    }
                    sb.append(str);
                    sb.append(CommonConstant.Symbol.COMMA);
                    a2 = measureText;
                } else {
                    a2 -= a3 * 2;
                }
            }
            int i = 0;
            while (i < arrayList2.size()) {
                String str2 = (String) arrayList2.get(i);
                if (!t.a(str2)) {
                    int measureText2 = (int) (paint.measureText(str2, 0, str2.length()) + 0.5f);
                    a2 -= i == 0 ? measureText2 + (a3 * 2) : measureText2 + (a3 * 3);
                    if (a2 < 0) {
                        break;
                    }
                    sb2.append(str2);
                    sb2.append(CommonConstant.Symbol.COMMA);
                } else {
                    a2 -= a3 * 2;
                }
                i++;
            }
            sb2.append((CharSequence) sb);
            this.s = sb2.toString();
            if (t.a(this.s)) {
                return;
            }
            this.s = this.s.substring(0, this.s.length() - 1);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c7ee5f04c6fd778b5bf89b045d367d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c7ee5f04c6fd778b5bf89b045d367d");
        } else if (!this.v || this.k == null || this.m == null || this.m.getV8JSEngine() == null || this.m.getActivity() == null) {
        } else {
            f();
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.s);
            this.m.asyncCallJSMethod(this.k.b, linkedList);
            this.v = false;
        }
    }

    private void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada50beb91f4b12ac8caf4f84fdb639b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada50beb91f4b12ac8caf4f84fdb639b");
        } else if (this.r == null) {
            this.r = new d(context, null, this.h);
            this.r.e = this;
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f841d98d3637cf4723e9406c95bd9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f841d98d3637cf4723e9406c95bd9c6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7f0bb28c469551420ff6026b99a9fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7f0bb28c469551420ff6026b99a9fea");
        } else {
            if (!com.sankuai.shangou.stone.util.a.b(this.f)) {
                Context e = e();
                List<Poi.NewLabelInfoListItem> list = this.f;
                Object[] objArr3 = {e, list};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                List<c> list2 = null;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b206d35d24c91fd93d20550f130a8253", RobustBitConfig.DEFAULT_VALUE)) {
                    list2 = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b206d35d24c91fd93d20550f130a8253");
                } else if (!com.sankuai.shangou.stone.util.a.b(list) && e != null) {
                    list2 = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++) {
                        Poi.NewLabelInfoListItem newLabelInfoListItem = list.get(i);
                        if (newLabelInfoListItem != null) {
                            a.a(e, list2, newLabelInfoListItem, i);
                        }
                    }
                }
                this.d = list2;
                u.a(this.o);
            } else {
                u.c(this.o);
            }
            if (!com.sankuai.shangou.stone.util.a.b(this.g)) {
                this.e = a.a(e(), this.g);
            }
        }
        if (this.i) {
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.e)) {
                this.r.b(this.e);
                this.r.notifyChanged();
            }
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.d)) {
            this.r.b(this.d);
            this.r.notifyChanged();
        }
    }

    @Override // com.sankuai.waimai.store.mach.dynamic_tag.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c495ff09d627e09d108d390e06fd599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c495ff09d627e09d108d390e06fd599");
            return;
        }
        this.t = i;
        this.u = true;
        i();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19705ca7d41e90dff9ab11f3b1ac44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19705ca7d41e90dff9ab11f3b1ac44d");
        } else if (!this.u || this.j == null || this.m == null || this.m.getV8JSEngine() == null || this.r == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(Integer.valueOf(this.t));
            linkedList.add(Boolean.valueOf(this.r.d));
            this.m.asyncCallJSMethod(this.j.b, linkedList);
            this.u = false;
        }
    }

    private Context e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdafe5f65db4305489dc93ec2ec30143", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdafe5f65db4305489dc93ec2ec30143") : this.m.getActivity();
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70167d623f62774c0705d0c3e265020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70167d623f62774c0705d0c3e265020")).longValue();
        }
        if (this.m == null || this.m.getActivity() == null) {
            return 0L;
        }
        Context e = e();
        TagCanvasView tagCanvasView = new TagCanvasView(e);
        a(e);
        tagCanvasView.setAdapter(this.r);
        tagCanvasView.setMaxLines(this.i ? 10 : 1);
        tagCanvasView.setTagSpace(h.a(e, 4.0f));
        tagCanvasView.setLineSpace(h.a(e, 8.0f));
        h();
        int a2 = SizeSpec.a(f, yogaMeasureMode);
        int a3 = SizeSpec.a(f2, yogaMeasureMode2);
        tagCanvasView.measure(a2, a3);
        this.b = a2;
        this.c = a3;
        int measuredWidth = tagCanvasView.getMeasuredWidth();
        int measuredHeight = tagCanvasView.getMeasuredHeight();
        tagCanvasView.setAdapter(null);
        return com.facebook.yoga.c.a(measuredWidth, measuredHeight);
    }
}
