package com.sankuai.waimai.mach.node;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.d;
import com.facebook.yoga.e;
import com.meituan.android.recce.props.gens.AlignContent;
import com.meituan.android.recce.props.gens.AlignItems;
import com.meituan.android.recce.props.gens.AlignSelf;
import com.meituan.android.recce.props.gens.AspectRatio;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.FlexBasis;
import com.meituan.android.recce.props.gens.FlexDirection;
import com.meituan.android.recce.props.gens.FlexGrow;
import com.meituan.android.recce.props.gens.FlexShrink;
import com.meituan.android.recce.props.gens.FlexWrap;
import com.meituan.android.recce.props.gens.JustifyContent;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MaxHeight;
import com.meituan.android.recce.props.gens.MaxWidth;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.MinWidth;
import com.meituan.android.recce.props.gens.PaddingBottom;
import com.meituan.android.recce.props.gens.PaddingLeft;
import com.meituan.android.recce.props.gens.PaddingRight;
import com.meituan.android.recce.props.gens.PaddingTop;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.TemplateNode;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.model.value.c;
import com.sankuai.waimai.mach.model.value.f;
import com.sankuai.waimai.mach.model.value.i;
import com.sankuai.waimai.mach.utils.g;
import com.sankuai.waimai.mach.widget.b;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<HostViewType extends View> implements com.sankuai.waimai.mach.model.a, Serializable {
    public static ChangeQuickRedirect a;
    private Integer A;
    private Integer B;
    private GradientDrawable C;
    private b D;
    private Float E;
    private Float F;
    private Map<String, Object> G;
    private String H;
    public Context b;
    public final d c;
    protected List<a> d;
    public a e;
    public Mach f;
    public VirtualNode g;
    public com.sankuai.waimai.mach.component.base.a<HostViewType> h;
    public String i;
    public String j;
    public boolean k;
    public float l;
    public boolean m;
    public float n;
    public com.sankuai.waimai.mach.model.value.a o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public String[] u;
    public Float v;
    public String w;
    public String x;
    public boolean y;
    private float[] z;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.node.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1019a {
        void a(a aVar);
    }

    private String u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57df23c46ccacc0be110585858fb0d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57df23c46ccacc0be110585858fb0d6") : c().H;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a90d22ab54e67cf738b092c5933f6e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a90d22ab54e67cf738b092c5933f6e5");
        } else {
            c().H = str;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d119e6630850342523d5bb870de35ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d119e6630850342523d5bb870de35ef");
        }
        String u = u();
        if (TextUtils.isEmpty(u)) {
            return "";
        }
        return u + File.separator + APKStructure.Assets_Type + File.separator;
    }

    public final List<a> b() {
        return this.d;
    }

    public final void a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8920f890292a6bd7dd96c6dc2e4a6536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8920f890292a6bd7dd96c6dc2e4a6536");
            return;
        }
        this.f = mach;
        this.b = mach.getCurrentContext();
        this.h.m = mach;
        if (this.d.size() > 0) {
            for (a aVar : this.d) {
                aVar.a(mach);
            }
        }
    }

    public a(com.sankuai.waimai.mach.component.base.a<HostViewType> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78fd1448a593be93caafcd899232ff38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78fd1448a593be93caafcd899232ff38");
            return;
        }
        this.k = false;
        this.m = false;
        this.G = new HashMap();
        this.h = aVar;
        this.c = d.a();
        this.d = new ArrayList();
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a2ec339188971c38b431b7e99ebb1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a2ec339188971c38b431b7e99ebb1b");
            return;
        }
        Object[] objArr2 = {aVar, -1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2db688a591d9b95ab0190e17fd788665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2db688a591d9b95ab0190e17fd788665");
            return;
        }
        int size = this.d.size();
        this.d.add(size, aVar);
        aVar.e = this;
        this.c.a(aVar.c, size);
    }

    public final a a(@NonNull String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13a0f89e24cbb289f1c3d636ec8e808", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13a0f89e24cbb289f1c3d636ec8e808");
        }
        if (this.G == null) {
            this.G = new HashMap();
        }
        this.G.put(str, obj);
        return this;
    }

    @Nullable
    public final Object b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766ffe578080218268bff380e7979850", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766ffe578080218268bff380e7979850");
        }
        if (this.G != null) {
            return this.G.get(str);
        }
        return null;
    }

    public final float d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcfab334a826e840de9d0bd66e601f2a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcfab334a826e840de9d0bd66e601f2a")).floatValue() : this.k ? this.l : this.c.q();
    }

    public final float e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949019b932f82fa9428d3ab2e76abf79", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949019b932f82fa9428d3ab2e76abf79")).floatValue() : this.m ? this.n : this.c.r();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8d5c24a23db7c13190d47a58923392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8d5c24a23db7c13190d47a58923392");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d663204de1f0b1857f301e2d6350381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d663204de1f0b1857f301e2d6350381");
        } else if (this.h != null) {
            this.h.j();
        }
        if (this.d == null || this.d.isEmpty()) {
            return;
        }
        for (a aVar : new ArrayList(this.d)) {
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3134b1fb44db435a0d5ad70b8bf2521d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3134b1fb44db435a0d5ad70b8bf2521d");
        }
        if (this.h.o == null) {
            return b(context);
        }
        return this.h.o;
    }

    public final HostViewType b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806ea75e6bea268d6261b616654108ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (HostViewType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806ea75e6bea268d6261b616654108ba");
        }
        HostViewType c = c(context);
        this.h.a((com.sankuai.waimai.mach.component.base.a<HostViewType>) c);
        return c;
    }

    public final HostViewType g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176682f8a1d89a1be7dbece6456d6c75", RobustBitConfig.DEFAULT_VALUE) ? (HostViewType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176682f8a1d89a1be7dbece6456d6c75") : this.h.o;
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774c0e970ea75bf84b98f30fa1f33ad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774c0e970ea75bf84b98f30fa1f33ad3");
            return;
        }
        if (this.B == null) {
            if (this.A != null) {
                if (this.D == null) {
                    this.D = new b();
                }
                this.D.a(this.A.intValue());
                this.D.a(this.z);
                view.setBackground(this.D);
            } else if (this.C != null) {
                view.setBackground(this.C);
            }
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            b bVar = new b();
            bVar.a(this.B.intValue());
            bVar.a(this.z);
            stateListDrawable.addState(new int[]{16842919}, bVar);
            if (this.C != null) {
                stateListDrawable.addState(StateSet.WILD_CARD, this.C);
            } else {
                b bVar2 = new b();
                bVar2.a(this.A != null ? this.A.intValue() : 0);
                bVar2.a(this.z);
                stateListDrawable.addState(StateSet.WILD_CARD, bVar2);
            }
            view.setBackground(stateListDrawable);
            view.setClickable(true);
        }
        if (this.E != null) {
            view.setAlpha(this.E.floatValue());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.mach.model.a
    public final void onBind(TemplateNode templateNode) {
        String obj;
        GradientDrawable.Orientation a2;
        int indexOf;
        Float valueOf;
        char c;
        float[] b;
        int i = 1;
        Object[] objArr = {templateNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14faa5f007651a03fec3bf18cd93c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14faa5f007651a03fec3bf18cd93c93");
            return;
        }
        Object[] objArr2 = {templateNode};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56bb50d35332ed4b53bb22a26785564e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56bb50d35332ed4b53bb22a26785564e");
        } else {
            Map<String, Object> a3 = templateNode.a();
            if (a3 != null && !a3.isEmpty()) {
                for (Map.Entry<String, Object> entry : a3.entrySet()) {
                    if (m.c()) {
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = entry;
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ebb02298870a19adbed444ba42c18e4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ebb02298870a19adbed444ba42c18e4");
                        } else {
                            String key = entry.getKey();
                            String obj2 = entry.getValue() == null ? "" : entry.getValue().toString();
                            LinkedList linkedList = new LinkedList();
                            switch (key.hashCode()) {
                                case -1820411228:
                                    if (key.equals(BorderBottomRightRadius.NAME)) {
                                        c = '&';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1802976921:
                                    if (key.equals(FlexGrow.NAME)) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1802500706:
                                    if (key.equals(FlexWrap.NAME)) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1779213470:
                                    if (key.equals("box-shadow")) {
                                        c = '\'';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662432227:
                                    if (key.equals(MaxWidth.NAME)) {
                                        c = 27;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1546463658:
                                    if (key.equals(AspectRatio.NAME)) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1502084711:
                                    if (key.equals(PaddingTop.NAME)) {
                                        c = 23;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1454606755:
                                    if (key.equals(FlexShrink.NAME)) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1383304148:
                                    if (key.equals("border")) {
                                        c = '!';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1383228885:
                                    if (key.equals("bottom")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1267206133:
                                    if (key.equals("opacity")) {
                                        c = '(';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1221029593:
                                    if (key.equals("height")) {
                                        c = Constants.SPACE;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1089145580:
                                    if (key.equals(AlignSelf.NAME)) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1081309778:
                                    if (key.equals("margin")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1032412580:
                                    if (key.equals(BorderTopRightRadius.NAME)) {
                                        c = '$';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -889953653:
                                    if (key.equals(MinWidth.NAME)) {
                                        c = 28;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -887955139:
                                    if (key.equals(MarginRight.NAME)) {
                                        c = 20;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -806339567:
                                    if (key.equals("padding")) {
                                        c = 22;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -428786256:
                                    if (key.equals(MaxHeight.NAME)) {
                                        c = 29;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -396426912:
                                    if (key.equals(PaddingRight.NAME)) {
                                        c = 25;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -62830230:
                                    if (key.equals(FlexBasis.NAME)) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 115029:
                                    if (key.equals("top")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3145721:
                                    if (key.equals("flex")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3317767:
                                    if (key.equals("left")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 108511772:
                                    if (key.equals("right")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 113126854:
                                    if (key.equals("width")) {
                                        c = 31;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 122090044:
                                    if (key.equals(JustifyContent.NAME)) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 143541095:
                                    if (key.equals(PaddingBottom.NAME)) {
                                        c = 26;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 299225794:
                                    if (key.equals("active-bg-color")) {
                                        c = '+';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 363559068:
                                    if (key.equals("layout-direction")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 529642498:
                                    if (key.equals("overflow")) {
                                        c = ')';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 587430648:
                                    if (key.equals(AlignItems.NAME)) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 609634231:
                                    if (key.equals(BorderBottomLeftRadius.NAME)) {
                                        c = '%';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 679766083:
                                    if (key.equals(PaddingLeft.NAME)) {
                                        c = 24;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 695731883:
                                    if (key.equals(FlexDirection.NAME)) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 715446705:
                                    if (key.equals(AlignContent.NAME)) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 747804969:
                                    if (key.equals("position")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 881039699:
                                    if (key.equals(BorderRadius.NAME)) {
                                        c = '\"';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 941004998:
                                    if (key.equals(MarginLeft.NAME)) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1352416423:
                                    if (key.equals("transform-origin")) {
                                        c = '*';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1466337535:
                                    if (key.equals(BorderTopLeftRadius.NAME)) {
                                        c = '#';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1877472324:
                                    if (key.equals("active-opacity")) {
                                        c = ',';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1970025654:
                                    if (key.equals(MarginTop.NAME)) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2043213058:
                                    if (key.equals(MinHeight.NAME)) {
                                        c = 30;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2086035242:
                                    if (key.equals(MarginBottom.NAME)) {
                                        c = 21;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    linkedList.add(Float.valueOf(27.0f));
                                    linkedList.add(Float.valueOf(f.a(obj2).a().a()));
                                    break;
                                case 1:
                                    Object[] objArr4 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6832fa7a84938f1972cec3540e1bbccb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6832fa7a84938f1972cec3540e1bbccb");
                                        break;
                                    } else {
                                        e x = x(obj2);
                                        if (!com.facebook.yoga.b.a(x)) {
                                            if (x.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(37.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.TOP.a()));
                                                linkedList.add(Float.valueOf(x.d));
                                                break;
                                            } else if (x.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(38.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.TOP.a()));
                                                linkedList.add(Float.valueOf(x.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Object[] objArr5 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f293dda05f3b34e3d03945de551da844", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f293dda05f3b34e3d03945de551da844");
                                        break;
                                    } else {
                                        e x2 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x2)) {
                                            if (x2.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(37.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.LEFT.a()));
                                                linkedList.add(Float.valueOf(x2.d));
                                                break;
                                            } else if (x2.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(38.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.LEFT.a()));
                                                linkedList.add(Float.valueOf(x2.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    Object[] objArr6 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3c991d2f2284d809383597c54eb8e1f0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3c991d2f2284d809383597c54eb8e1f0");
                                        break;
                                    } else {
                                        e x3 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x3)) {
                                            if (x3.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(37.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.RIGHT.a()));
                                                linkedList.add(Float.valueOf(x3.d));
                                                break;
                                            } else if (x3.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(38.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.RIGHT.a()));
                                                linkedList.add(Float.valueOf(x3.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    Object[] objArr7 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5742d23ae6ef9c12cad23f7a4f5434e0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5742d23ae6ef9c12cad23f7a4f5434e0");
                                        break;
                                    } else {
                                        e x4 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x4)) {
                                            if (x4.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(37.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.BOTTOM.a()));
                                                linkedList.add(Float.valueOf(x4.d));
                                                break;
                                            } else if (x4.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(38.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.BOTTOM.a()));
                                                linkedList.add(Float.valueOf(x4.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 5:
                                    linkedList.add(Float.valueOf(26.0f));
                                    linkedList.add(Float.valueOf(com.sankuai.waimai.mach.model.value.d.a(obj2).a().a()));
                                    break;
                                case 6:
                                    linkedList.add(Float.valueOf(24.0f));
                                    linkedList.add(Float.valueOf(com.sankuai.waimai.mach.model.value.d.a(obj2).a().a()));
                                    break;
                                case 7:
                                    linkedList.add(Float.valueOf(25.0f));
                                    linkedList.add(Float.valueOf(com.sankuai.waimai.mach.model.value.d.a(obj2).a().a()));
                                    break;
                                case '\b':
                                    if (!FpsEvent.TYPE_SCROLL_AUTO.equals(obj2.trim())) {
                                        linkedList.add(Float.valueOf(28.0f));
                                        linkedList.add(Float.valueOf(g.a(obj2)));
                                        break;
                                    }
                                    break;
                                case '\t':
                                    linkedList.add(Float.valueOf(1.0f));
                                    linkedList.add(Float.valueOf(com.sankuai.waimai.mach.model.value.e.a(obj2).a().a()));
                                    break;
                                case '\n':
                                    linkedList.add(Float.valueOf(8.0f));
                                    linkedList.add(Float.valueOf(com.sankuai.waimai.mach.model.value.g.a(obj2).a().a()));
                                    break;
                                case 11:
                                    linkedList.add(Float.valueOf(3.0f));
                                    linkedList.add(Float.valueOf(g.a(obj2)));
                                    break;
                                case '\f':
                                    linkedList.add(Float.valueOf(4.0f));
                                    linkedList.add(Float.valueOf(g.a(obj2)));
                                    break;
                                case '\r':
                                    Object[] objArr8 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "e3faeb04397ff16f78d523c1c5c6248a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "e3faeb04397ff16f78d523c1c5c6248a");
                                        break;
                                    } else {
                                        e x5 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x5)) {
                                            if (x5.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(5.0f));
                                                linkedList.add(Float.valueOf(x5.d));
                                                break;
                                            } else if (x5.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(6.0f));
                                                linkedList.add(Float.valueOf(x5.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 14:
                                    linkedList.add(Float.valueOf(2.0f));
                                    linkedList.add(Float.valueOf(g.a(obj2)));
                                    break;
                                case 15:
                                    linkedList.add(Float.valueOf(23.0f));
                                    linkedList.add(Float.valueOf(c.a(obj2).a().a()));
                                    break;
                                case 16:
                                    linkedList.add(Float.valueOf(0.0f));
                                    linkedList.add(Float.valueOf(i.a(obj2).a().a()));
                                    break;
                                case 17:
                                    Object[] objArr9 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect9 = a;
                                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "43404c51d4287b426c89807fb28b383c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "43404c51d4287b426c89807fb28b383c");
                                        break;
                                    } else {
                                        e x6 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x6)) {
                                            if (x6.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(31.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.ALL.a()));
                                                linkedList.add(Float.valueOf(x6.d));
                                                break;
                                            } else if (x6.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(32.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.ALL.a()));
                                                linkedList.add(Float.valueOf(x6.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 18:
                                    Object[] objArr10 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect10 = a;
                                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "769465f847553a9da3f955c025934912", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "769465f847553a9da3f955c025934912");
                                        break;
                                    } else {
                                        e x7 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x7)) {
                                            if (x7.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(31.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.TOP.a()));
                                                linkedList.add(Float.valueOf(x7.d));
                                                break;
                                            } else if (x7.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(32.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.TOP.a()));
                                                linkedList.add(Float.valueOf(x7.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 19:
                                    Object[] objArr11 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "49442c0c2467b9ebdd0341708879716e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "49442c0c2467b9ebdd0341708879716e");
                                        break;
                                    } else {
                                        e x8 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x8)) {
                                            if (x8.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(31.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.LEFT.a()));
                                                linkedList.add(Float.valueOf(x8.d));
                                                break;
                                            } else if (x8.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(32.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.LEFT.a()));
                                                linkedList.add(Float.valueOf(x8.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 20:
                                    Object[] objArr12 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "395792d9ef4c2fcff1511b264ff7d7db", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "395792d9ef4c2fcff1511b264ff7d7db");
                                        break;
                                    } else {
                                        e x9 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x9)) {
                                            if (x9.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(31.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.RIGHT.a()));
                                                linkedList.add(Float.valueOf(x9.d));
                                                break;
                                            } else if (x9.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(32.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.RIGHT.a()));
                                                linkedList.add(Float.valueOf(x9.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 21:
                                    Object[] objArr13 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect13 = a;
                                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "25ae14284bdf7171b9b8b7f9c4326df9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "25ae14284bdf7171b9b8b7f9c4326df9");
                                        break;
                                    } else {
                                        e x10 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x10)) {
                                            if (x10.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(31.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.BOTTOM.a()));
                                                linkedList.add(Float.valueOf(x10.d));
                                                break;
                                            } else if (x10.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(32.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.BOTTOM.a()));
                                                linkedList.add(Float.valueOf(x10.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 22:
                                    Object[] objArr14 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect14 = a;
                                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "a34f92f37d374b511af23cb44e42bc60", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "a34f92f37d374b511af23cb44e42bc60");
                                        break;
                                    } else {
                                        e x11 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x11)) {
                                            if (x11.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(34.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.ALL.a()));
                                                linkedList.add(Float.valueOf(x11.d));
                                                break;
                                            } else if (x11.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(35.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.ALL.a()));
                                                linkedList.add(Float.valueOf(x11.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 23:
                                    Object[] objArr15 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect15 = a;
                                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "450d8503e886a0ac52d0a2e5e6e8cd5e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "450d8503e886a0ac52d0a2e5e6e8cd5e");
                                        break;
                                    } else {
                                        e x12 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x12)) {
                                            if (x12.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(34.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.TOP.a()));
                                                linkedList.add(Float.valueOf(x12.d));
                                                break;
                                            } else if (x12.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(35.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.TOP.a()));
                                                linkedList.add(Float.valueOf(x12.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 24:
                                    Object[] objArr16 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect16 = a;
                                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "ed7da866da101e0f7f8a057b81d207fd", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "ed7da866da101e0f7f8a057b81d207fd");
                                        break;
                                    } else {
                                        e x13 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x13)) {
                                            if (x13.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(34.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.LEFT.a()));
                                                linkedList.add(Float.valueOf(x13.d));
                                                break;
                                            } else if (x13.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(35.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.LEFT.a()));
                                                linkedList.add(Float.valueOf(x13.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 25:
                                    Object[] objArr17 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect17 = a;
                                    if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "9c86e15f4865bd00308977f1dfda0dbb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "9c86e15f4865bd00308977f1dfda0dbb");
                                        break;
                                    } else {
                                        e x14 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x14)) {
                                            if (x14.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(34.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.RIGHT.a()));
                                                linkedList.add(Float.valueOf(x14.d));
                                                break;
                                            } else if (x14.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(35.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.RIGHT.a()));
                                                linkedList.add(Float.valueOf(x14.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 26:
                                    Object[] objArr18 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect18 = a;
                                    if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "4be9c442972f0ddfe2e6dad60954d57d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "4be9c442972f0ddfe2e6dad60954d57d");
                                        break;
                                    } else {
                                        e x15 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x15)) {
                                            if (x15.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(34.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.BOTTOM.a()));
                                                linkedList.add(Float.valueOf(x15.d));
                                                break;
                                            } else if (x15.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(35.0f));
                                                linkedList.add(Float.valueOf(YogaEdge.BOTTOM.a()));
                                                linkedList.add(Float.valueOf(x15.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 27:
                                    Object[] objArr19 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect19 = a;
                                    if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "90e8d916e6254734a88c1a44217e864e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "90e8d916e6254734a88c1a44217e864e");
                                        break;
                                    } else {
                                        e x16 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x16)) {
                                            if (x16.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(14.0f));
                                                linkedList.add(Float.valueOf(x16.d));
                                                break;
                                            } else if (x16.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(15.0f));
                                                linkedList.add(Float.valueOf(x16.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 28:
                                    Object[] objArr20 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect20 = a;
                                    if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "616907e050264890029fe1201ffb957a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "616907e050264890029fe1201ffb957a");
                                        break;
                                    } else {
                                        e x17 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x17)) {
                                            if (x17.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(12.0f));
                                                linkedList.add(Float.valueOf(x17.d));
                                                break;
                                            } else if (x17.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(13.0f));
                                                linkedList.add(Float.valueOf(x17.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 29:
                                    Object[] objArr21 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect21 = a;
                                    if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "8a3241bc9245c5dfd7c2018c597b9949", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "8a3241bc9245c5dfd7c2018c597b9949");
                                        break;
                                    } else {
                                        e x18 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x18)) {
                                            if (x18.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(21.0f));
                                                linkedList.add(Float.valueOf(x18.d));
                                                break;
                                            } else if (x18.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(22.0f));
                                                linkedList.add(Float.valueOf(x18.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 30:
                                    Object[] objArr22 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect22 = a;
                                    if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "10c594e1ffd4e3bd709daff1a309abe0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "10c594e1ffd4e3bd709daff1a309abe0");
                                        break;
                                    } else {
                                        e x19 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x19)) {
                                            if (x19.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(19.0f));
                                                linkedList.add(Float.valueOf(x19.d));
                                                break;
                                            } else if (x19.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(20.0f));
                                                linkedList.add(Float.valueOf(x19.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 31:
                                    Object[] objArr23 = {obj2, linkedList};
                                    ChangeQuickRedirect changeQuickRedirect23 = a;
                                    if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "34eca167e467d4ac69745fccb067d775", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "34eca167e467d4ac69745fccb067d775");
                                        break;
                                    } else {
                                        e x20 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x20)) {
                                            if (x20.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(9.0f));
                                                linkedList.add(Float.valueOf(x20.d));
                                                break;
                                            } else if (x20.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(10.0f));
                                                linkedList.add(Float.valueOf(x20.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case ' ':
                                    Object[] objArr24 = new Object[2];
                                    objArr24[0] = obj2;
                                    objArr24[i] = linkedList;
                                    ChangeQuickRedirect changeQuickRedirect24 = a;
                                    if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "ad420284868b8bcccc9270957a06f5c7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "ad420284868b8bcccc9270957a06f5c7");
                                        break;
                                    } else {
                                        e x21 = x(obj2);
                                        if (!com.facebook.yoga.b.a(x21)) {
                                            if (x21.e == YogaUnit.POINT) {
                                                linkedList.add(Float.valueOf(16.0f));
                                                linkedList.add(Float.valueOf(x21.d));
                                                break;
                                            } else if (x21.e == YogaUnit.PERCENT) {
                                                linkedList.add(Float.valueOf(17.0f));
                                                linkedList.add(Float.valueOf(x21.d));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case '!':
                                    if (obj2 != null && !"none".equals(obj2.trim())) {
                                        String[] split = obj2.split("\\s+");
                                        if (split.length > 0) {
                                            split[0] = String.valueOf(com.sankuai.waimai.mach.utils.i.c(split[0]));
                                        }
                                        this.o = new com.sankuai.waimai.mach.model.value.a(split);
                                        linkedList.add(Float.valueOf(36.0f));
                                        linkedList.add(Float.valueOf(YogaEdge.ALL.a()));
                                        linkedList.add(Float.valueOf(this.o.a()));
                                        break;
                                    }
                                    break;
                                case '\"':
                                    this.p = com.sankuai.waimai.mach.utils.i.c(obj2);
                                    break;
                                case '#':
                                    this.q = com.sankuai.waimai.mach.utils.i.c(obj2);
                                    break;
                                case '$':
                                    this.r = com.sankuai.waimai.mach.utils.i.c(obj2);
                                    break;
                                case '%':
                                    this.s = com.sankuai.waimai.mach.utils.i.c(obj2);
                                    break;
                                case '&':
                                    this.t = com.sankuai.waimai.mach.utils.i.c(obj2);
                                    break;
                                case '\'':
                                    this.u = obj2.split("\\s+");
                                    break;
                                case '(':
                                    this.E = Float.valueOf(g.a(obj2));
                                    break;
                                case ')':
                                    this.x = obj2;
                                    break;
                                case '*':
                                    this.w = obj2;
                                    break;
                                case '+':
                                    this.B = Integer.valueOf(com.sankuai.waimai.mach.utils.i.a(obj2));
                                    break;
                                case ',':
                                    this.F = Float.valueOf(g.a(obj2));
                                    break;
                            }
                            if (!CollectionUtils.isEmpty(linkedList) && (b = b(linkedList)) != null) {
                                this.c.a(b, b.length);
                            }
                        }
                    } else {
                        a(entry);
                    }
                    i = 1;
                }
                GradientDrawable gradientDrawable = null;
                if (com.sankuai.waimai.mach.utils.i.a()) {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = TemplateNode.a;
                    if (PatchProxy.isSupport(objArr25, templateNode, changeQuickRedirect25, false, "1acc408fe8d662ceab385fcb2e3ae027", RobustBitConfig.DEFAULT_VALUE)) {
                        valueOf = (Float) PatchProxy.accessDispatch(objArr25, templateNode, changeQuickRedirect25, false, "1acc408fe8d662ceab385fcb2e3ae027");
                    } else {
                        valueOf = templateNode.a().containsKey("elevation") ? Float.valueOf(((Double) templateNode.a().get("elevation")).floatValue()) : null;
                    }
                    if (valueOf != null) {
                        this.v = valueOf;
                        this.u = null;
                    }
                }
                float f = this.q > 0.0f ? this.q : this.p;
                float f2 = this.r > 0.0f ? this.r : this.p;
                float f3 = this.t > 0.0f ? this.t : this.p;
                float f4 = this.s > 0.0f ? this.s : this.p;
                this.z = new float[]{f, f, f2, f2, f3, f3, f4, f4};
                Object[] objArr26 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect26 = TemplateNode.a;
                if (PatchProxy.isSupport(objArr26, templateNode, changeQuickRedirect26, false, "7ab369c863c4f4950c7e2314e48c6d3c", RobustBitConfig.DEFAULT_VALUE)) {
                    obj = (String) PatchProxy.accessDispatch(objArr26, templateNode, changeQuickRedirect26, false, "7ab369c863c4f4950c7e2314e48c6d3c");
                } else {
                    obj = templateNode.a().containsKey(BackgroundColor.NAME) ? templateNode.a().get(BackgroundColor.NAME).toString() : null;
                }
                if (!TextUtils.isEmpty(obj)) {
                    if (obj.contains("linear-gradient")) {
                        Object[] objArr27 = {obj};
                        ChangeQuickRedirect changeQuickRedirect27 = com.sankuai.waimai.mach.utils.d.a;
                        if (PatchProxy.isSupport(objArr27, null, changeQuickRedirect27, true, "16c48279cb6319e9f6e1c8911145a7bb", RobustBitConfig.DEFAULT_VALUE)) {
                            gradientDrawable = (GradientDrawable) PatchProxy.accessDispatch(objArr27, null, changeQuickRedirect27, true, "16c48279cb6319e9f6e1c8911145a7bb");
                        } else {
                            int indexOf2 = obj.indexOf(CommonConstant.Symbol.BRACKET_LEFT);
                            if (indexOf2 != -1) {
                                String substring = obj.substring(indexOf2 + 1);
                                if (!TextUtils.isEmpty(substring) && substring.contains(CommonConstant.Symbol.COMMA)) {
                                    int indexOf3 = substring.indexOf(CommonConstant.Symbol.COMMA);
                                    String trim = substring.substring(0, indexOf3).trim();
                                    if (!TextUtils.isEmpty(trim) && (a2 = com.sankuai.waimai.mach.utils.d.a(trim)) != null) {
                                        String substring2 = substring.substring(indexOf3 + 1);
                                        if (!TextUtils.isEmpty(substring2) && substring2.contains(CommonConstant.Symbol.COMMA)) {
                                            int indexOf4 = substring2.indexOf(CommonConstant.Symbol.COMMA);
                                            String trim2 = substring2.substring(0, indexOf4).trim();
                                            String substring3 = substring2.substring(indexOf4 + 1);
                                            if (!TextUtils.isEmpty(substring3) && (indexOf = substring3.indexOf(CommonConstant.Symbol.BRACKET_RIGHT)) != -1) {
                                                String trim3 = substring3.substring(0, indexOf).trim();
                                                if (!TextUtils.isEmpty(trim3)) {
                                                    gradientDrawable = new GradientDrawable(a2, new int[]{com.sankuai.waimai.mach.utils.i.a(trim2), com.sankuai.waimai.mach.utils.i.a(trim3)});
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.C = gradientDrawable;
                        if (this.C != null) {
                            this.C.setCornerRadii(this.z);
                        }
                    } else {
                        this.A = Integer.valueOf(com.sankuai.waimai.mach.utils.i.a(obj));
                    }
                }
            }
        }
        this.h.a(this, false);
    }

    private HostViewType c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439c0c980672a4753c0e8113aca24aef", RobustBitConfig.DEFAULT_VALUE)) {
            return (HostViewType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439c0c980672a4753c0e8113aca24aef");
        }
        com.sankuai.waimai.mach.component.base.a<HostViewType> aVar = this.h;
        Object[] objArr2 = {context, this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.component.base.a.l;
        HostViewType b = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8528c7bb76aca574b7078a7767b7f664", RobustBitConfig.DEFAULT_VALUE) ? (HostViewType) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8528c7bb76aca574b7078a7767b7f664") : aVar.b(context);
        if (b == null) {
            return null;
        }
        try {
            b.setId(this.f.getNextId());
            com.sankuai.waimai.mach.widget.d dVar = new com.sankuai.waimai.mach.widget.d((int) this.c.s(), (int) this.c.t());
            dVar.b = this.o;
            dVar.a(this.p, this.q, this.r, this.t, this.s);
            dVar.r = this.f;
            dVar.a(this.g.getMachExpose());
            dVar.s = this.f.getLogReport();
            dVar.w = this;
            dVar.v = this.f.getClickHandler();
            if (this == c()) {
                dVar.leftMargin = (int) Math.ceil(this.c.e(YogaEdge.LEFT));
                dVar.topMargin = (int) Math.ceil(this.c.e(YogaEdge.TOP));
                dVar.rightMargin = (int) Math.ceil(this.c.e(YogaEdge.RIGHT));
                dVar.bottomMargin = (int) Math.ceil(this.c.e(YogaEdge.BOTTOM));
            } else {
                dVar.leftMargin = (int) d();
                dVar.topMargin = (int) e();
            }
            if (this.u != null && this.u.length > 2) {
                dVar.a(this.u);
            }
            if (!(b instanceof ViewGroup)) {
                b.setPadding((int) (this.c.f(YogaEdge.LEFT) + this.c.g(YogaEdge.LEFT)), (int) (this.c.f(YogaEdge.TOP) + this.c.g(YogaEdge.TOP)), (int) (this.c.f(YogaEdge.RIGHT) + this.c.g(YogaEdge.RIGHT)), (int) (this.c.f(YogaEdge.BOTTOM) + this.c.g(YogaEdge.BOTTOM)));
            }
            a(b);
            if (this.v != null) {
                dVar.u = this.v;
            }
            b.setLayoutParams(dVar);
            return b;
        } catch (Exception e) {
            com.sankuai.waimai.mach.log.b.b("RenderNode", "getSizedHostView:" + e.getMessage());
            return b;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0160, code lost:
        if (r1.equals("top") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.Map.Entry<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.node.a.a(java.util.Map$Entry):void");
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc294f61b8e0eaa5dd67f029a29d1d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc294f61b8e0eaa5dd67f029a29d1d92");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.f(YogaEdge.TOP, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.g(YogaEdge.TOP, x.d);
        }
    }

    private void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62e28e0d33d0bc7a0f6ff3898c69566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62e28e0d33d0bc7a0f6ff3898c69566");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.f(YogaEdge.LEFT, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.g(YogaEdge.LEFT, x.d);
        }
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d89c754847acc19590e005045e7a1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d89c754847acc19590e005045e7a1f");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.f(YogaEdge.RIGHT, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.g(YogaEdge.RIGHT, x.d);
        }
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2225417a6d402f2f9c3620afc6266f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2225417a6d402f2f9c3620afc6266f0");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.f(YogaEdge.BOTTOM, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.g(YogaEdge.BOTTOM, x.d);
        }
    }

    private void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0ae4cf7d341558b9bb8e1f80a8584f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0ae4cf7d341558b9bb8e1f80a8584f");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.d(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.e(x.d);
        }
    }

    private void h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97a641e44890af85cab986bcdfb6aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97a641e44890af85cab986bcdfb6aaa");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.a(YogaEdge.ALL, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.b(YogaEdge.ALL, x.d);
        }
    }

    private void i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77dd50aa1c52967c48f8200a5d52c3ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77dd50aa1c52967c48f8200a5d52c3ee");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.a(YogaEdge.TOP, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.b(YogaEdge.TOP, x.d);
        }
    }

    private void j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3a35d288fa32901d203ded5d0b2e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3a35d288fa32901d203ded5d0b2e97");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.a(YogaEdge.LEFT, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.b(YogaEdge.LEFT, x.d);
        }
    }

    private void k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c09d0c166a7fd02e11a59a629ef1e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c09d0c166a7fd02e11a59a629ef1e5");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.a(YogaEdge.RIGHT, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.b(YogaEdge.RIGHT, x.d);
        }
    }

    private void l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23181c95a8bd40f29a6626c453341cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23181c95a8bd40f29a6626c453341cb");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.a(YogaEdge.BOTTOM, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.b(YogaEdge.BOTTOM, x.d);
        }
    }

    private void m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d278f8099a501825b40d4388e133b7e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d278f8099a501825b40d4388e133b7e4");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.c(YogaEdge.ALL, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.d(YogaEdge.ALL, x.d);
        }
    }

    private void n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bebd9e16fe3a662a2261ccaa15e67cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bebd9e16fe3a662a2261ccaa15e67cb");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.c(YogaEdge.TOP, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.d(YogaEdge.TOP, x.d);
        }
    }

    private void o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7de514682a2fe2dc6269f79bee4190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7de514682a2fe2dc6269f79bee4190");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.c(YogaEdge.LEFT, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.d(YogaEdge.LEFT, x.d);
        }
    }

    private void p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f04806326f94ed114c2ba295397c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f04806326f94ed114c2ba295397c95");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.c(YogaEdge.RIGHT, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.d(YogaEdge.RIGHT, x.d);
        }
    }

    private void q(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97e00a5440644567be17dbac243f5c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97e00a5440644567be17dbac243f5c1");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.c(YogaEdge.BOTTOM, x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.d(YogaEdge.BOTTOM, x.d);
        }
    }

    private void r(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27576e38d8015322a879340365e74a6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27576e38d8015322a879340365e74a6d");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.f(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.g(x.d);
        }
    }

    private void s(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18bd10afef58a77552a6dbd04cfcd9e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18bd10afef58a77552a6dbd04cfcd9e6");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.h(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.i(x.d);
        }
    }

    private void t(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce43cc83505093a8dab9e05916c51a50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce43cc83505093a8dab9e05916c51a50");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.n(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.o(x.d);
        }
    }

    private void u(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f9ac927331fc16fdb3c873f0da9d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f9ac927331fc16fdb3c873f0da9d48");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.j(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.k(x.d);
        }
    }

    private void v(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdec74f336046026d8aaa194aae8a3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdec74f336046026d8aaa194aae8a3a2");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.p(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.q(x.d);
        }
    }

    private void w(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a09017b89a38ce2d23a22cdcf969938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a09017b89a38ce2d23a22cdcf969938");
            return;
        }
        e x = x(str);
        if (com.facebook.yoga.b.a(x)) {
            return;
        }
        if (x.e == YogaUnit.POINT) {
            this.c.l(x.d);
        } else if (x.e == YogaUnit.PERCENT) {
            this.c.m(x.d);
        }
    }

    private static float[] b(List<Float> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f333e9cd7cd31f23cb32676c20d2510", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f333e9cd7cd31f23cb32676c20d2510");
        }
        float[] fArr = new float[list.size()];
        for (Float f : list) {
            fArr[i] = f.floatValue();
            i++;
        }
        return fArr;
    }

    public final Map<String, Object> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952949a6459bc4a3426a59719ee3e425", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952949a6459bc4a3426a59719ee3e425") : this.g.getAttrs();
    }

    public final Map<String, Object> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b718f948d5cbd47e9a53107d3cf993c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b718f948d5cbd47e9a53107d3cf993c") : this.g.getStyle();
    }

    @Nullable
    public final a a(List<a> list) {
        boolean z;
        int i = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc4072a366eff14a86e293216256c65", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc4072a366eff14a86e293216256c65");
        }
        int i2 = 0;
        while (i2 < list.size()) {
            a aVar = list.get(i2);
            Object[] objArr2 = new Object[i];
            objArr2[0] = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5b285c48610bc28f751a6b298062028", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5b285c48610bc28f751a6b298062028")).booleanValue();
            } else {
                z = aVar != null && this.i.equals(aVar.i);
            }
            if (z) {
                return list.get(i2);
            }
            i2++;
            i = 1;
        }
        return null;
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d5d19cc0b5db29d4fa50caf4f7c5a6a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d5d19cc0b5db29d4fa50caf4f7c5a6a")).booleanValue() : o() != null && o().size() > 0;
    }

    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a114aa0362e29ad34a9c2489f5280d51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a114aa0362e29ad34a9c2489f5280d51")).booleanValue() : q() != null;
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62887aef3a6d75636f31abdfdf159d69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62887aef3a6d75636f31abdfdf159d69")).booleanValue() : p() != null && p().size() > 0;
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c67c3ef6194a2578b507d4bbc05480", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c67c3ef6194a2578b507d4bbc05480")).booleanValue() : r() != null;
    }

    public final Map<String, Object> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5639af61d06b334fad3fa6733f14526d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5639af61d06b334fad3fa6733f14526d") : this.g.getViewLxReport();
    }

    public final Map<String, Object> p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6f520d872376e4bd7a23e969b82fa6", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6f520d872376e4bd7a23e969b82fa6") : this.g.getViewShReport();
    }

    public final com.sankuai.waimai.mach.parser.d q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397cd9a3c9e38764b15df3f6d5f14664", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.parser.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397cd9a3c9e38764b15df3f6d5f14664") : this.g.getViewLxReportJSFunction();
    }

    public final com.sankuai.waimai.mach.parser.d r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ce4bb673e5fbddbf050772dad6eb9f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.parser.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ce4bb673e5fbddbf050772dad6eb9f") : this.g.getViewShReportJSFunction();
    }

    public final int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b641cf78e5ff851cf64b675c03ebbd93", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b641cf78e5ff851cf64b675c03ebbd93")).intValue() : (int) this.c.s();
    }

    public final int t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12493ed76821e4893d18808c9965849f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12493ed76821e4893d18808c9965849f")).intValue() : (int) this.c.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [V extends android.view.View, android.view.View] */
    public final void a(com.sankuai.waimai.mach.component.base.a<HostViewType> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75196ee668546ae2ab8094ee325e474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75196ee668546ae2ab8094ee325e474");
        } else if (this.h != aVar) {
            HostViewType hostviewtype = aVar.o;
            if (hostviewtype != 0) {
                ViewParent parent = hostviewtype.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(hostviewtype);
                }
                this.h.o = hostviewtype;
                com.sankuai.waimai.mach.component.base.a<HostViewType> aVar2 = this.h;
                aVar2.p = aVar.p;
                aVar2.q = aVar.q;
                a aVar3 = this.e;
                if (aVar3 != null) {
                    int indexOf = aVar3.d.indexOf(this);
                    com.sankuai.waimai.mach.component.base.a<HostViewType> aVar4 = aVar3.h;
                    if (aVar4 != null) {
                        HostViewType hostviewtype2 = aVar4.o;
                        if (hostviewtype2 instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) hostviewtype2;
                            int childCount = viewGroup.getChildCount();
                            if (childCount != 0 && indexOf < childCount) {
                                viewGroup.addView(hostviewtype, indexOf);
                            } else {
                                viewGroup.addView(hostviewtype);
                            }
                        }
                    }
                }
                aVar.b();
                return;
            }
            b(this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.yoga.e x(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.mach.node.a.a
            java.lang.String r10 = "d805e7877460ee18d7d3605ffd997624"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.facebook.yoga.e r12 = (com.facebook.yoga.e) r12
            return r12
        L1e:
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L37
            float r1 = com.sankuai.waimai.mach.utils.i.b(r12)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L37
            com.facebook.yoga.e r2 = new com.facebook.yoga.e     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L37
            com.facebook.yoga.YogaUnit r3 = com.facebook.yoga.YogaUnit.POINT     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L37
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L37
            r12 = r2
            goto L38
        L32:
            com.facebook.yoga.e r12 = com.facebook.yoga.e.a(r12)
            goto L38
        L37:
            r12 = r0
        L38:
            if (r12 != 0) goto L42
            com.facebook.yoga.e r12 = new com.facebook.yoga.e
            r0 = 0
            com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.POINT
            r12.<init>(r0, r1)
        L42:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.node.a.x(java.lang.String):com.facebook.yoga.e");
    }

    public static void a(a aVar, InterfaceC1019a interfaceC1019a) {
        Object[] objArr = {aVar, interfaceC1019a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8fca31596a12bedd9c56ff7a00ca84b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8fca31596a12bedd9c56ff7a00ca84b");
        } else if (aVar != null) {
            if (interfaceC1019a != null) {
                interfaceC1019a.a(aVar);
            }
            List<a> list = aVar.d;
            if (list == null || list.isEmpty()) {
                return;
            }
            for (a aVar2 : list) {
                if (aVar2 instanceof a) {
                    a(aVar2, interfaceC1019a);
                }
            }
        }
    }

    @NonNull
    public final a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab855b959460e302e3d645ebddd456b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab855b959460e302e3d645ebddd456b");
        }
        a<HostViewType> aVar = this;
        while (aVar.e != null) {
            aVar = aVar.e;
        }
        return aVar;
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d351d11653ca243b56f42d244e465923", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d351d11653ca243b56f42d244e465923")).booleanValue() : this.d != null && this.d.size() > 0;
    }

    public static boolean a(@NonNull a aVar, @NonNull a aVar2, int i) {
        int i2;
        int i3;
        int i4;
        Object[] objArr = {aVar, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f958fdf93f81c7f6039b64851e452f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f958fdf93f81c7f6039b64851e452f8d")).booleanValue();
        }
        d dVar = aVar.c;
        int s = ((int) dVar.s()) + 0;
        int t = ((int) dVar.t()) + 0;
        d dVar2 = aVar2.c;
        int d = (int) aVar2.d();
        int e = (int) aVar2.e();
        int s2 = ((int) dVar2.s()) + d;
        int t2 = ((int) dVar2.t()) + e;
        Object[] objArr2 = {0, 0, Integer.valueOf(s), Integer.valueOf(t), Integer.valueOf(d), Integer.valueOf(e), Integer.valueOf(s2), Integer.valueOf(t2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3dd2dd6931e2354bf9b77e362be33a52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3dd2dd6931e2354bf9b77e362be33a52")).booleanValue();
        }
        int i5 = e + i;
        return i5 > 0 && i5 < t && (i2 = t2 - i) > 0 && i2 < t && (i3 = d + i) > 0 && i3 < s && (i4 = s2 - i) > 0 && i4 < s;
    }
}
