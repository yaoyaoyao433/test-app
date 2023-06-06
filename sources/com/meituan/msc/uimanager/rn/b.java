package com.meituan.msc.uimanager.rn;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import com.facebook.yoga.e;
import com.meituan.android.msc.yoga.g;
import com.meituan.android.msc.yoga.h;
import com.meituan.android.msc.yoga.i;
import com.meituan.android.msc.yoga.j;
import com.meituan.android.msc.yoga.k;
import com.meituan.android.msc.yoga.m;
import com.meituan.android.msc.yoga.q;
import com.meituan.android.msc.yoga.r;
import com.meituan.android.msc.yoga.s;
import com.meituan.android.msc.yoga.t;
import com.meituan.android.msc.yoga.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static YogaAlign a(com.meituan.android.msc.yoga.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "018448abe9d8b49813751137cc6cef14", RobustBitConfig.DEFAULT_VALUE)) {
            return (YogaAlign) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "018448abe9d8b49813751137cc6cef14");
        }
        switch (aVar) {
            case AUTO:
                return YogaAlign.AUTO;
            case FLEX_START:
                return YogaAlign.FLEX_START;
            case CENTER:
                return YogaAlign.CENTER;
            case FLEX_END:
                return YogaAlign.FLEX_END;
            case STRETCH:
                return YogaAlign.STRETCH;
            case BASELINE:
                return YogaAlign.BASELINE;
            case SPACE_BETWEEN:
                return YogaAlign.SPACE_BETWEEN;
            case SPACE_AROUND:
                return YogaAlign.SPACE_AROUND;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + aVar);
        }
    }

    private static s a(YogaUnit yogaUnit) {
        Object[] objArr = {yogaUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48baa1dc4a9f51966603b915efcb66fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48baa1dc4a9f51966603b915efcb66fb");
        }
        switch (yogaUnit) {
            case UNDEFINED:
                return s.UNDEFINED;
            case POINT:
                return s.POINT;
            case PERCENT:
                return s.PERCENT;
            case AUTO:
                return s.AUTO;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + yogaUnit);
        }
    }

    public static YogaEdge a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4225667a4d6fdbe6b455b7e3367ec150", RobustBitConfig.DEFAULT_VALUE)) {
            return (YogaEdge) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4225667a4d6fdbe6b455b7e3367ec150");
        }
        switch (iVar) {
            case LEFT:
                return YogaEdge.LEFT;
            case TOP:
                return YogaEdge.TOP;
            case RIGHT:
                return YogaEdge.RIGHT;
            case BOTTOM:
                return YogaEdge.BOTTOM;
            case START:
                return YogaEdge.START;
            case END:
                return YogaEdge.END;
            case HORIZONTAL:
                return YogaEdge.HORIZONTAL;
            case VERTICAL:
                return YogaEdge.VERTICAL;
            case ALL:
                return YogaEdge.ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + iVar);
        }
    }

    public static t a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f8a3e501b5fea0bfc0a4810bb0b29e8", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f8a3e501b5fea0bfc0a4810bb0b29e8") : new t(eVar.d, a(eVar.e));
    }

    public static m a(YogaMeasureMode yogaMeasureMode) {
        Object[] objArr = {yogaMeasureMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6768be104618ff39d4bd6efe3ca76947", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6768be104618ff39d4bd6efe3ca76947");
        }
        switch (yogaMeasureMode) {
            case UNDEFINED:
                return m.UNDEFINED;
            case EXACTLY:
                return m.EXACTLY;
            case AT_MOST:
                return m.AT_MOST;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + yogaMeasureMode);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.uimanager.rn.b$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;
        public static final /* synthetic */ int[] i;
        public static final /* synthetic */ int[] j;
        public static final /* synthetic */ int[] k;
        public static final /* synthetic */ int[] l;
        public static final /* synthetic */ int[] m;
        public static final /* synthetic */ int[] n;
        public static final /* synthetic */ int[] o;
        public static final /* synthetic */ int[] p;
        public static final /* synthetic */ int[] r;
        public static final /* synthetic */ int[] s;
        public static final /* synthetic */ int[] v = new int[m.valuesCustom().length];

        static {
            try {
                v[m.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                v[m.EXACTLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                v[m.AT_MOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            u = new int[YogaMeasureMode.values().length];
            try {
                u[YogaMeasureMode.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                u[YogaMeasureMode.EXACTLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                u[YogaMeasureMode.AT_MOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            t = new int[i.valuesCustom().length];
            try {
                t[i.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                t[i.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                t[i.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                t[i.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                t[i.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                t[i.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                t[i.HORIZONTAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                t[i.VERTICAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                t[i.ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            s = new int[YogaEdge.values().length];
            try {
                s[YogaEdge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                s[YogaEdge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                s[YogaEdge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                s[YogaEdge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                s[YogaEdge.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                s[YogaEdge.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                s[YogaEdge.HORIZONTAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                s[YogaEdge.VERTICAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                s[YogaEdge.ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            r = new int[s.valuesCustom().length];
            try {
                r[s.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                r[s.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                r[s.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                r[s.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            q = new int[YogaUnit.values().length];
            try {
                q[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                q[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                q[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                q[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            p = new int[h.valuesCustom().length];
            try {
                p[h.FLEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                p[h.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                p[h.MSCFLEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                p[h.BlockFlow.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                p[h.Inline.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                p[h.Block.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            o = new int[YogaDisplay.values().length];
            try {
                o[YogaDisplay.FLEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                o[YogaDisplay.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            n = new int[q.valuesCustom().length];
            try {
                n[q.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                n[q.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                n[q.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            m = new int[YogaOverflow.values().length];
            try {
                m[YogaOverflow.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                m[YogaOverflow.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                m[YogaOverflow.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            l = new int[u.valuesCustom().length];
            try {
                l[u.NO_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                l[u.WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                l[u.WRAP_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            k = new int[YogaWrap.values().length];
            try {
                k[YogaWrap.NO_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                k[YogaWrap.WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                k[YogaWrap.WRAP_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            j = new int[r.valuesCustom().length];
            try {
                j[r.RELATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                j[r.ABSOLUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                j[r.STATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                j[r.FIXED.ordinal()] = 4;
            } catch (NoSuchFieldError unused56) {
            }
            i = new int[YogaPositionType.values().length];
            try {
                i[YogaPositionType.RELATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                i[YogaPositionType.ABSOLUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            h = new int[com.meituan.android.msc.yoga.a.valuesCustom().length];
            try {
                h[com.meituan.android.msc.yoga.a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.FLEX_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.FLEX_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.STRETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.SPACE_AROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                h[com.meituan.android.msc.yoga.a.SPACE_EVENLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused67) {
            }
            g = new int[YogaAlign.values().length];
            try {
                g[YogaAlign.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                g[YogaAlign.FLEX_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                g[YogaAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                g[YogaAlign.FLEX_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                g[YogaAlign.STRETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                g[YogaAlign.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                g[YogaAlign.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                g[YogaAlign.SPACE_AROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused75) {
            }
            f = new int[k.valuesCustom().length];
            try {
                f[k.FLEX_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f[k.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f[k.FLEX_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f[k.SPACE_BETWEEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f[k.SPACE_AROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f[k.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused81) {
            }
            e = new int[YogaJustify.values().length];
            try {
                e[YogaJustify.FLEX_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                e[YogaJustify.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                e[YogaJustify.FLEX_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                e[YogaJustify.SPACE_BETWEEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                e[YogaJustify.SPACE_AROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                e[YogaJustify.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused87) {
            }
            d = new int[j.valuesCustom().length];
            try {
                d[j.COLUMN.ordinal()] = 1;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                d[j.COLUMN_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                d[j.ROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                d[j.ROW_REVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused91) {
            }
            c = new int[YogaFlexDirection.values().length];
            try {
                c[YogaFlexDirection.COLUMN.ordinal()] = 1;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                c[YogaFlexDirection.COLUMN_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                c[YogaFlexDirection.ROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                c[YogaFlexDirection.ROW_REVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused95) {
            }
            b = new int[g.valuesCustom().length];
            try {
                b[g.INHERIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                b[g.LTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                b[g.RTL.ordinal()] = 3;
            } catch (NoSuchFieldError unused98) {
            }
            a = new int[YogaDirection.values().length];
            try {
                a[YogaDirection.INHERIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                a[YogaDirection.LTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                a[YogaDirection.RTL.ordinal()] = 3;
            } catch (NoSuchFieldError unused101) {
            }
        }
    }
}
