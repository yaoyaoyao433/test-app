package com.sankuai.waimai.machpro.component.view;

import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.machpro.component.image.b b;
    b c;

    public a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d211404a651419dcbcb6f2053998fe05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d211404a651419dcbcb6f2053998fe05");
        } else {
            this.c = bVar;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72bffeb05c5ca96e481cf9903aa5ced5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72bffeb05c5ca96e481cf9903aa5ced5");
        } else if (this.b != null) {
        } else {
            this.b = new com.sankuai.waimai.machpro.component.image.b(this.c.c());
            com.facebook.yoga.d yogaNode = this.b.getYogaNode();
            yogaNode.g(100.0f);
            yogaNode.i(100.0f);
            yogaNode.a(YogaPositionType.ABSOLUTE);
            this.b.updateAttribute("disableCdnOptimization", Boolean.TRUE);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c47633ab19bb5b6320ebcd5d87a8d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c47633ab19bb5b6320ebcd5d87a8d26");
        } else if (str == null || this.b == null) {
        } else {
            String trim = str.trim();
            char c = 65535;
            switch (trim.hashCode()) {
                case -1881872635:
                    if (trim.equals(DynamicTitleParser.PARSER_KEY_STRETCH)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1687059567:
                    if (trim.equals("top right")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1614504594:
                    if (trim.equals("heightFix")) {
                        c = 18;
                        break;
                    }
                    break;
                case -1387149201:
                    if (trim.equals("widthFix")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1383228885:
                    if (trim.equals("bottom")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1364013995:
                    if (trim.equals("center")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1362001767:
                    if (trim.equals("aspectFit")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1024435214:
                    if (trim.equals("top left")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -797304696:
                    if (trim.equals("scaleToFill")) {
                        c = 2;
                        break;
                    }
                    break;
                case -667379492:
                    if (trim.equals("bottom left")) {
                        c = 15;
                        break;
                    }
                    break;
                case 115029:
                    if (trim.equals("top")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3317767:
                    if (trim.equals("left")) {
                        c = 11;
                        break;
                    }
                    break;
                case 94852023:
                    if (trim.equals(DynamicTitleParser.PARSER_VAL_STRETCH_COVER)) {
                        c = 4;
                        break;
                    }
                    break;
                case 108511772:
                    if (trim.equals("right")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 727618043:
                    if (trim.equals("aspectFill")) {
                        c = 1;
                        break;
                    }
                    break;
                case 727792767:
                    if (trim.equals("aspectLeft")) {
                        c = 6;
                        break;
                    }
                    break;
                case 791733223:
                    if (trim.equals("bottom right")) {
                        c = 16;
                        break;
                    }
                    break;
                case 951526612:
                    if (trim.equals("contain")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1092400292:
                    if (trim.equals("aspectRight")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    this.b.updateAttribute(ResizeMode.LOWER_CASE_NAME, trim);
                    break;
                default:
                    ArrayList<String> c2 = com.sankuai.waimai.machpro.util.b.c(trim);
                    if (c2.size() >= 2) {
                        this.b.getYogaNode().f(com.sankuai.waimai.machpro.util.b.a((Object) c2.get(0)));
                        this.b.getYogaNode().h(com.sankuai.waimai.machpro.util.b.a((Object) c2.get(1)));
                        this.b.updateAttribute(ResizeMode.LOWER_CASE_NAME, "contain");
                        break;
                    }
                    break;
            }
            this.b.requestLayout();
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e4cc52b93cdbe3a437aa2cbd5fe712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e4cc52b93cdbe3a437aa2cbd5fe712");
        } else if (this.b == null) {
        } else {
            ArrayList<String> c = com.sankuai.waimai.machpro.util.b.c(str);
            if (c.size() >= 2) {
                this.b.getYogaNode().f(YogaEdge.LEFT, com.sankuai.waimai.machpro.util.b.a((Object) c.get(0)));
                this.b.getYogaNode().f(YogaEdge.TOP, com.sankuai.waimai.machpro.util.b.a((Object) c.get(1)));
                this.b.requestLayout();
            }
        }
    }
}
