package com.meituan.msc.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.meituan.android.msc.yoga.s;
import com.meituan.android.msc.yoga.t;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.view.RNLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@TargetApi(23)
/* loaded from: classes3.dex */
public abstract class RNBaseTextShadowNode extends RNLayoutShadowNode {
    public static ChangeQuickRedirect a;
    protected Map<Integer, aa> A;
    @Nullable
    protected j b;
    protected n c;
    protected boolean d;
    protected int e;
    protected boolean f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected float m;
    protected float n;
    protected float o;
    protected int p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected float u;
    protected int v;
    protected int w;
    @Nullable
    protected String x;
    @Nullable
    protected String y;
    protected boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        protected int b;
        protected int c;
        protected g d;

        public a(int i, int i2, g gVar) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1364f7a80dc6099be5f50470568f0e0b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1364f7a80dc6099be5f50470568f0e0b");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = gVar;
        }

        public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
            Object[] objArr = {spannableStringBuilder, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1cb77fa62b6f1e95914926e5a58890", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1cb77fa62b6f1e95914926e5a58890");
            } else {
                spannableStringBuilder.setSpan(this.d, this.b, this.c, ((i << 16) & 16711680) | ((this.b == 0 ? 18 : 34) & (-16711681)));
            }
        }
    }

    private static void a(RNBaseTextShadowNode rNBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<a> list, n nVar, boolean z, Map<Integer, aa> map, int i) {
        n nVar2;
        int i2;
        ReactShadowNodeImpl reactShadowNodeImpl;
        float D;
        float E;
        Object[] objArr = {rNBaseTextShadowNode, spannableStringBuilder, list, nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42e173c7687ced9059fe4c1a4fb08ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42e173c7687ced9059fe4c1a4fb08ea1");
            return;
        }
        if (nVar != null) {
            nVar2 = nVar.a(rNBaseTextShadowNode.c);
        } else {
            nVar2 = rNBaseTextShadowNode.c;
        }
        n nVar3 = nVar2;
        int m = rNBaseTextShadowNode.m();
        int i3 = 0;
        while (i3 < m) {
            ReactShadowNodeImpl j = rNBaseTextShadowNode.e(i3);
            if (j instanceof RNRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) r.a(((RNRawTextShadowNode) j).b, nVar3.h));
                i2 = m;
                reactShadowNodeImpl = j;
            } else if (j instanceof RNBaseTextShadowNode) {
                i2 = m;
                reactShadowNodeImpl = j;
                a((RNBaseTextShadowNode) j, spannableStringBuilder, list, nVar3, z, map, spannableStringBuilder.length());
            } else {
                i2 = m;
                reactShadowNodeImpl = j;
                if (reactShadowNodeImpl instanceof RNTextInlineImageShadowNode) {
                    spannableStringBuilder.append("0");
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((RNTextInlineImageShadowNode) reactShadowNodeImpl).c()));
                } else if (z) {
                    int p = reactShadowNodeImpl.p();
                    t J = reactShadowNodeImpl.J();
                    t K = reactShadowNodeImpl.K();
                    if (J.f != s.POINT || K.f != s.POINT) {
                        reactShadowNodeImpl.v();
                        D = reactShadowNodeImpl.D();
                        E = reactShadowNodeImpl.E();
                    } else {
                        D = J.e;
                        E = K.e;
                    }
                    spannableStringBuilder.append("0");
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new p(p, (int) D, (int) E)));
                    map.put(Integer.valueOf(p), reactShadowNodeImpl);
                } else {
                    throw new com.meituan.msc.uimanager.g("Unexpected view type nested under a <Text> or <TextInput> node: " + reactShadowNodeImpl.getClass());
                }
            }
            reactShadowNodeImpl.l();
            i3++;
            m = i2;
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (rNBaseTextShadowNode.d) {
                list.add(new a(i, length, new ReactForegroundColorSpan(rNBaseTextShadowNode.e)));
            }
            if (rNBaseTextShadowNode.f) {
                list.add(new a(i, length, new ReactBackgroundColorSpan(rNBaseTextShadowNode.g)));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                float c = nVar3.c();
                if (!Float.isNaN(c) && (nVar == null || nVar.c() != c)) {
                    list.add(new a(i, length, new com.meituan.msc.views.text.a(c)));
                }
            }
            int a2 = nVar3.a();
            if (nVar == null || nVar.a() != a2) {
                list.add(new a(i, length, new ReactAbsoluteSizeSpan(a2)));
            }
            if (rNBaseTextShadowNode.v != -1 || rNBaseTextShadowNode.w != -1 || rNBaseTextShadowNode.x != null) {
                list.add(new a(i, length, new c(rNBaseTextShadowNode.v, rNBaseTextShadowNode.w, rNBaseTextShadowNode.y, rNBaseTextShadowNode.x, rNBaseTextShadowNode.t().getAssets())));
            }
            if (rNBaseTextShadowNode.q) {
                list.add(new a(i, length, new ReactUnderlineSpan()));
            }
            if (rNBaseTextShadowNode.r) {
                list.add(new a(i, length, new ReactStrikethroughSpan()));
            }
            if ((rNBaseTextShadowNode.m != 0.0f || rNBaseTextShadowNode.n != 0.0f || rNBaseTextShadowNode.o != 0.0f) && Color.alpha(rNBaseTextShadowNode.p) != 0) {
                list.add(new a(i, length, new l(rNBaseTextShadowNode.m, rNBaseTextShadowNode.n, rNBaseTextShadowNode.o, rNBaseTextShadowNode.p)));
            }
            float b = nVar3.b();
            if (!Float.isNaN(b) && (nVar == null || nVar.b() != b)) {
                list.add(new a(i, length, new b(b)));
            }
            list.add(new a(i, length, new h(rNBaseTextShadowNode.R)));
        }
    }

    public static Spannable a(RNBaseTextShadowNode rNBaseTextShadowNode, String str, boolean z, com.meituan.msc.uimanager.n nVar) {
        int i;
        int i2 = 0;
        Object[] objArr = {rNBaseTextShadowNode, null, (byte) 1, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cccb330f958ffd293dfc780d8bd430a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spannable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cccb330f958ffd293dfc780d8bd430a9");
        }
        com.facebook.infer.annotation.a.a(nVar != null, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        a(rNBaseTextShadowNode, spannableStringBuilder, arrayList, null, true, hashMap, 0);
        rNBaseTextShadowNode.z = false;
        rNBaseTextShadowNode.A = hashMap;
        float f = Float.NaN;
        for (a aVar : arrayList) {
            boolean z2 = aVar.d instanceof o;
            if (z2 || (aVar.d instanceof p)) {
                if (z2) {
                    i = ((o) aVar.d).b();
                    rNBaseTextShadowNode.z = true;
                } else {
                    p pVar = (p) aVar.d;
                    int i3 = pVar.d;
                    aa aaVar = (aa) hashMap.get(Integer.valueOf(pVar.b));
                    nVar.c(aaVar);
                    aaVar.b(rNBaseTextShadowNode);
                    i = i3;
                }
                if (Float.isNaN(f) || i > f) {
                    f = i;
                }
            }
            aVar.a(spannableStringBuilder, i2);
            i2++;
        }
        rNBaseTextShadowNode.c.g = f;
        return spannableStringBuilder;
    }

    public RNBaseTextShadowNode() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf499ce86f9cc7f47cfbff2c2ebb2ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf499ce86f9cc7f47cfbff2c2ebb2ba");
        }
    }

    public RNBaseTextShadowNode(@Nullable j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231853ccdb48db4cbca3a87f90f822c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231853ccdb48db4cbca3a87f90f822c7");
            return;
        }
        this.d = false;
        this.f = false;
        this.h = -1;
        this.i = 0;
        this.j = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.k = 0;
        int i2 = Build.VERSION.SDK_INT;
        this.l = 0;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = false;
        this.u = 0.0f;
        this.v = -1;
        this.w = -1;
        this.x = null;
        this.y = null;
        this.z = false;
        this.c = new n();
        this.b = jVar;
    }

    @ReactProp(defaultInt = -1, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumberOfLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be95ba2592e9a940f86d60d87b48050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be95ba2592e9a940f86d60d87b48050");
            return;
        }
        if (i == 0) {
            i = -1;
        }
        this.h = i;
        e();
    }

    @ReactProp(defaultFloat = Float.NaN, name = LineHeight.LOWER_CASE_NAME)
    public void setLineHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1977f8fd28bd76a7a6524c7213d7e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1977f8fd28bd76a7a6524c7213d7e6");
            return;
        }
        this.c.d = f;
        e();
    }

    @ReactProp(defaultFloat = Float.NaN, name = LetterSpacing.LOWER_CASE_NAME)
    public void setLetterSpacing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301a34412bee78a656bf9f56303204ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301a34412bee78a656bf9f56303204ac");
            return;
        }
        this.c.e = f;
        e();
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04f653d8b0484d18be630c9357f5d349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04f653d8b0484d18be630c9357f5d349");
        } else if (z != this.c.b) {
            this.c.b = z;
            e();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8b221c08fe574fbdc9d8267d4fb790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8b221c08fe574fbdc9d8267d4fb790");
        } else if (f != this.c.f) {
            this.c.a(f);
            e();
        }
    }

    @ReactProp(name = TextAlign.LOWER_CASE_NAME)
    public void setTextAlign(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eae589c524a4042cb79dbd32359e2e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eae589c524a4042cb79dbd32359e2e6");
            return;
        }
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.l = 1;
            }
            this.i = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.l = 0;
            }
            if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
                this.i = 0;
            } else if ("left".equals(str)) {
                this.i = 3;
            } else if ("right".equals(str)) {
                this.i = 5;
            } else if ("center".equals(str)) {
                this.i = 1;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
            }
        }
        e();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b03b99239eb8b2cb8ffdc75ee67306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b03b99239eb8b2cb8ffdc75ee67306");
            return;
        }
        this.c.c = com.meituan.msc.uimanager.s.a(dynamic);
        e();
    }

    @ReactProp(customType = "Color", defaultInt = -10066330, name = "color")
    public void setColor(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f744cef37d42e646a2a5efc38202f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f744cef37d42e646a2a5efc38202f8");
            return;
        }
        this.d = num != null;
        if (this.d) {
            this.e = num.intValue();
        }
        e();
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "860d5ef798dbb56e37f051ca99b94d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "860d5ef798dbb56e37f051ca99b94d05");
        } else if (b()) {
            this.f = num != null;
            if (this.f) {
                this.g = num.intValue();
            }
            e();
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61d82fa199ccbef32e8c23e83fcd856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61d82fa199ccbef32e8c23e83fcd856");
            return;
        }
        this.x = str;
        e();
    }

    @ReactProp(name = FontWeight.LOWER_CASE_NAME)
    public void setFontWeight(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b88ed459782b1cdff8da01db6225897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b88ed459782b1cdff8da01db6225897");
            return;
        }
        int a2 = k.a(str);
        if (a2 != this.w) {
            this.w = a2;
            e();
        }
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56215d8c9789a5f7c6c68e783a8c6335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56215d8c9789a5f7c6c68e783a8c6335");
            return;
        }
        String a2 = k.a(readableArray);
        if (TextUtils.equals(a2, this.y)) {
            return;
        }
        this.y = a2;
        e();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628e569b91aea3a5a781819b818ee798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628e569b91aea3a5a781819b818ee798");
            return;
        }
        int b = k.b(str);
        if (b != this.v) {
            this.v = b;
            e();
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.s = z;
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(@Nullable String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc040076feb3db5d98c561955228ab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc040076feb3db5d98c561955228ab4");
            return;
        }
        this.q = false;
        this.r = false;
        if (str != null) {
            for (String str2 : str.split(StringUtil.SPACE)) {
                if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE.equals(str2)) {
                    this.q = true;
                } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH.equals(str2)) {
                    this.r = true;
                }
            }
        }
        e();
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0630d61ada1bf0459dbfd86fca68b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0630d61ada1bf0459dbfd86fca68b8");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            if (str == null || "highQuality".equals(str)) {
                this.j = 1;
            } else if ("simple".equals(str)) {
                this.j = 0;
            } else if ("balanced".equals(str)) {
                this.j = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            e();
        }
    }

    @ReactProp(name = ReactBaseTextShadowNode.PROP_SHADOW_OFFSET)
    public void setTextShadowOffset(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da1eef59be77cd6ca296d0b88473b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da1eef59be77cd6ca296d0b88473b80");
            return;
        }
        this.m = 0.0f;
        this.n = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.m = com.meituan.msc.uimanager.s.a(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.n = com.meituan.msc.uimanager.s.a(readableMap.getDouble("height"));
            }
        }
        e();
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc77ed7769a00916fc214719d374734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc77ed7769a00916fc214719d374734");
        } else if (f != this.o) {
            this.o = f;
            e();
        }
    }

    @ReactProp(customType = "Color", defaultInt = ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd05546b496fa2661b5824d75b09502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd05546b496fa2661b5824d75b09502");
        } else if (i != this.p) {
            this.p = i;
            e();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d348fbe1d70578e268f7789d81bbac20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d348fbe1d70578e268f7789d81bbac20");
            return;
        }
        if (str != null) {
            if (!"none".equals(str)) {
                if (!"uppercase".equals(str)) {
                    if (!"lowercase".equals(str)) {
                        if (!"capitalize".equals(str)) {
                            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
                        }
                        this.c.h = r.CAPITALIZE;
                    } else {
                        this.c.h = r.LOWERCASE;
                    }
                } else {
                    this.c.h = r.UPPERCASE;
                }
            } else {
                this.c.h = r.NONE;
            }
        } else {
            this.c.h = r.UNSET;
        }
        e();
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9379d941a120dd7f2158a870bb520566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9379d941a120dd7f2158a870bb520566");
        } else if (z != this.t) {
            this.t = z;
            e();
        }
    }

    @ReactProp(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "009f77d99852350319927a954ec7d9e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "009f77d99852350319927a954ec7d9e3");
        } else if (f != this.u) {
            this.u = f;
            e();
        }
    }
}
