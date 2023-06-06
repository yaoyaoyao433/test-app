package com.meituan.msc.mmpviews.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.meituan.android.msc.yoga.s;
import com.meituan.android.msc.yoga.t;
import com.meituan.android.recce.props.gens.EllipsizeMode;
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
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.text.ReactAbsoluteSizeSpan;
import com.meituan.msc.views.text.ReactBackgroundColorSpan;
import com.meituan.msc.views.text.ReactForegroundColorSpan;
import com.meituan.msc.views.text.ReactStrikethroughSpan;
import com.meituan.msc.views.text.ReactUnderlineSpan;
import com.meituan.msc.views.text.b;
import com.meituan.msc.views.text.c;
import com.meituan.msc.views.text.g;
import com.meituan.msc.views.text.h;
import com.meituan.msc.views.text.j;
import com.meituan.msc.views.text.k;
import com.meituan.msc.views.text.l;
import com.meituan.msc.views.text.n;
import com.meituan.msc.views.text.o;
import com.meituan.msc.views.text.p;
import com.meituan.msc.views.text.r;
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
public abstract class MPBaseTextShadowNode extends MPLayoutShadowNode {
    public static ChangeQuickRedirect b;
    protected boolean A;
    protected boolean B;
    @Nullable
    protected String C;
    protected boolean D;
    protected Map<Integer, aa> E;
    @Nullable
    protected j c;
    protected n d;
    protected int e;
    protected boolean f;
    protected int g;
    protected int h;
    protected TextUtils.TruncateAt i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected float n;
    protected float o;
    protected float p;
    protected int q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected float v;
    protected int w;
    protected int x;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce5786ece5780316dffc30c0ceec968", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce5786ece5780316dffc30c0ceec968");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = gVar;
        }

        public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
            Object[] objArr = {spannableStringBuilder, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854bd6e3e03612a40b52efc2da551d2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854bd6e3e03612a40b52efc2da551d2b");
            } else {
                spannableStringBuilder.setSpan(this.d, this.b, this.c, ((i << 16) & 16711680) | ((this.b == 0 ? 18 : 34) & (-16711681)));
            }
        }
    }

    private static void a(MPBaseTextShadowNode mPBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<a> list, n nVar, boolean z, Map<Integer, aa> map, int i) {
        n nVar2;
        int i2;
        ReactShadowNodeImpl reactShadowNodeImpl;
        float D;
        float E;
        Object[] objArr = {mPBaseTextShadowNode, spannableStringBuilder, list, nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c099f010aa9411c37e8c9bb0320be38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c099f010aa9411c37e8c9bb0320be38");
            return;
        }
        if (nVar != null) {
            nVar2 = nVar.a(mPBaseTextShadowNode.d);
        } else {
            nVar2 = mPBaseTextShadowNode.d;
        }
        n nVar3 = nVar2;
        int m = mPBaseTextShadowNode.m();
        int i3 = 0;
        while (i3 < m) {
            ReactShadowNodeImpl j = mPBaseTextShadowNode.e(i3);
            if (j instanceof MPRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) r.a(((MPRawTextShadowNode) j).b, nVar3.h));
                i2 = m;
                reactShadowNodeImpl = j;
            } else if (j instanceof MPBaseTextShadowNode) {
                i2 = m;
                reactShadowNodeImpl = j;
                a((MPBaseTextShadowNode) j, spannableStringBuilder, list, nVar3, z, map, spannableStringBuilder.length());
            } else {
                i2 = m;
                reactShadowNodeImpl = j;
                if (reactShadowNodeImpl instanceof MPTextInlineImageShadowNode) {
                    spannableStringBuilder.append("0");
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((MPTextInlineImageShadowNode) reactShadowNodeImpl).c()));
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
            list.add(new a(i, length, new ReactForegroundColorSpan(mPBaseTextShadowNode.e)));
            if (mPBaseTextShadowNode.f) {
                list.add(new a(i, length, new ReactBackgroundColorSpan(mPBaseTextShadowNode.g)));
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
            if (mPBaseTextShadowNode.w != -1 || mPBaseTextShadowNode.x != -1 || mPBaseTextShadowNode.y != null) {
                list.add(new a(i, length, new c(mPBaseTextShadowNode.w, mPBaseTextShadowNode.x, mPBaseTextShadowNode.C, mPBaseTextShadowNode.y, mPBaseTextShadowNode.t().getAssets())));
            }
            if (mPBaseTextShadowNode.r) {
                list.add(new a(i, length, new ReactUnderlineSpan()));
            }
            if (mPBaseTextShadowNode.s) {
                list.add(new a(i, length, new ReactStrikethroughSpan()));
            }
            if ((mPBaseTextShadowNode.n != 0.0f || mPBaseTextShadowNode.o != 0.0f || mPBaseTextShadowNode.p != 0.0f) && Color.alpha(mPBaseTextShadowNode.q) != 0) {
                list.add(new a(i, length, new l(mPBaseTextShadowNode.n, mPBaseTextShadowNode.o, mPBaseTextShadowNode.p, mPBaseTextShadowNode.q)));
            }
            float b2 = nVar3.b();
            if (!Float.isNaN(b2) && (nVar == null || nVar.b() != b2)) {
                list.add(new a(i, length, new b(b2)));
            }
            list.add(new a(i, length, new h(mPBaseTextShadowNode.R)));
        }
    }

    public static Spannable a(MPBaseTextShadowNode mPBaseTextShadowNode, String str, boolean z, com.meituan.msc.uimanager.n nVar) {
        int i;
        int i2 = 0;
        Object[] objArr = {mPBaseTextShadowNode, null, (byte) 1, nVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25ca495d62d12f23c3ba71a7e8e6b584", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spannable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25ca495d62d12f23c3ba71a7e8e6b584");
        }
        com.facebook.infer.annotation.a.a(nVar != null, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        a(mPBaseTextShadowNode, spannableStringBuilder, arrayList, null, true, hashMap, 0);
        mPBaseTextShadowNode.D = false;
        mPBaseTextShadowNode.E = hashMap;
        float f = Float.NaN;
        for (a aVar : arrayList) {
            boolean z2 = aVar.d instanceof o;
            if (z2 || (aVar.d instanceof p)) {
                if (z2) {
                    i = ((o) aVar.d).b();
                    mPBaseTextShadowNode.D = true;
                } else {
                    p pVar = (p) aVar.d;
                    int i3 = pVar.d;
                    aa aaVar = (aa) hashMap.get(Integer.valueOf(pVar.b));
                    nVar.c(aaVar);
                    aaVar.b(mPBaseTextShadowNode);
                    i = i3;
                }
                if (Float.isNaN(f) || i > f) {
                    f = i;
                }
            }
            aVar.a(spannableStringBuilder, i2);
            i2++;
        }
        mPBaseTextShadowNode.d.g = f;
        return spannableStringBuilder;
    }

    public MPBaseTextShadowNode() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e6140edc77fdbd9d57184dc3e8f6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e6140edc77fdbd9d57184dc3e8f6d8");
        }
    }

    public MPBaseTextShadowNode(@Nullable j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233797d2429bbabb3cb7fa57a9ef43e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233797d2429bbabb3cb7fa57a9ef43e5");
            return;
        }
        this.e = -16777216;
        this.f = false;
        this.h = -1;
        this.i = TextUtils.TruncateAt.END;
        this.j = 0;
        this.k = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.l = 0;
        int i2 = Build.VERSION.SDK_INT;
        this.m = 0;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR;
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = false;
        this.v = 0.0f;
        this.w = 0;
        this.x = 0;
        this.y = "";
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = false;
        this.d = new n();
        this.c = jVar;
    }

    @ReactProp(defaultInt = -1, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumberOfLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c12ece582513c7d7c4ab32a5d670b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c12ece582513c7d7c4ab32a5d670b5");
            return;
        }
        if (i == 0) {
            i = -1;
        }
        this.h = i;
        e();
    }

    @ReactProp(name = EllipsizeMode.LOWER_CASE_NAME)
    public void setEllipsizeMode(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb80c5e2cf307cbdd7d0879feb743af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb80c5e2cf307cbdd7d0879feb743af");
            return;
        }
        if (str == null || str.equals("tail")) {
            this.i = TextUtils.TruncateAt.END;
        } else if (str.equals(PicassoBounceOnTouchListener.HEAD_BOUNCE)) {
            this.i = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            this.i = TextUtils.TruncateAt.MIDDLE;
        } else if (str.equals("clip")) {
            this.i = null;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
        }
        e();
    }

    @ReactProp(defaultFloat = Float.NaN, name = LineHeight.LOWER_CASE_NAME)
    public void setLineHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba32ec453434bcd2acf8583787cdd8fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba32ec453434bcd2acf8583787cdd8fe");
        } else if (f < 0.0f) {
        } else {
            this.d.d = com.meituan.msc.uimanager.s.c(f);
            e();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = LetterSpacing.LOWER_CASE_NAME)
    public void setLetterSpacing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38358e38009c6eaab57eccf53f7157f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38358e38009c6eaab57eccf53f7157f9");
            return;
        }
        this.d.e = f;
        e();
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232aaa5d958c41cb2565ec38b7ed210c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232aaa5d958c41cb2565ec38b7ed210c");
        } else if (z != this.d.b) {
            this.d.b = z;
            e();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb938b657b79896e03a3426732d57a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb938b657b79896e03a3426732d57a2f");
        } else if (f != this.d.f) {
            this.d.a(f);
            e();
        }
    }

    @ReactProp(name = TextAlign.LOWER_CASE_NAME)
    public void setTextAlign(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c411e52a488cb4fbc5ea09fef4dadd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c411e52a488cb4fbc5ea09fef4dadd");
            return;
        }
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m = 1;
            }
            this.j = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.m = 0;
            }
            if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
                this.j = 0;
            } else if ("left".equals(str)) {
                this.j = 3;
            } else if ("right".equals(str)) {
                this.j = 5;
            } else if ("center".equals(str)) {
                this.j = 1;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
            }
        }
        e();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa02eac1de7568f9fc29bc0abfc0e67a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa02eac1de7568f9fc29bc0abfc0e67a");
            return;
        }
        this.d.c = com.meituan.msc.uimanager.s.c(com.meituan.msc.uimanager.s.a(dynamic));
        e();
    }

    @ReactProp(customType = "Color", defaultInt = -10066330, name = "color")
    public void setColor(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97c680f5753a3805c118e4f026d023a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97c680f5753a3805c118e4f026d023a");
        } else if (num == null) {
        } else {
            this.e = num.intValue();
            e();
        }
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bcd51f86a9f852e0bf6a895ccc87c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bcd51f86a9f852e0bf6a895ccc87c4e");
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
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e44593e22f6634196541904f0b187910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e44593e22f6634196541904f0b187910");
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(this.y);
        if ((isEmpty && isEmpty2) || TextUtils.equals(this.y, str)) {
            return;
        }
        this.y = str;
        this.B = true;
        e();
    }

    @ReactProp(name = FontWeight.LOWER_CASE_NAME)
    public void setFontWeight(@Nullable Dynamic dynamic) {
        int i;
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b52610a950a3127265259be33c5e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b52610a950a3127265259be33c5e3f");
        } else if (dynamic == null) {
        } else {
            ReadableType type = dynamic.getType();
            if (type == ReadableType.String) {
                i = k.a(dynamic.asString());
            } else if (type != ReadableType.Number) {
                return;
            } else {
                int asInt = dynamic.asInt();
                Object[] objArr2 = {Integer.valueOf(asInt)};
                ChangeQuickRedirect changeQuickRedirect2 = k.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b4f0cd4aee07d23c66f371bee6cb758a", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b4f0cd4aee07d23c66f371bee6cb758a")).intValue();
                } else {
                    int i2 = -1;
                    if (asInt >= 500) {
                        i2 = 1;
                    } else if (asInt != -1) {
                        i2 = 0;
                    }
                    i = i2;
                }
            }
            if (i != this.x) {
                this.x = i;
                this.A = true;
                e();
            }
        }
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080e41e6cf39e09a0ec96d1cf15b0dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080e41e6cf39e09a0ec96d1cf15b0dc8");
            return;
        }
        String a2 = k.a(readableArray);
        if (TextUtils.equals(a2, this.C)) {
            return;
        }
        this.C = a2;
        e();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47cc57ea2f0749de5ba9762336b96658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47cc57ea2f0749de5ba9762336b96658");
            return;
        }
        int b2 = k.b(str);
        if (b2 != this.w) {
            this.w = b2;
            this.z = true;
            e();
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.t = z;
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(@Nullable String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1caf1dc06d8a3a7d8fa032d4bf4aa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1caf1dc06d8a3a7d8fa032d4bf4aa9");
            return;
        }
        this.r = false;
        this.s = false;
        if (str != null) {
            for (String str2 : str.split(StringUtil.SPACE)) {
                if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE.equals(str2)) {
                    this.r = true;
                } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH.equals(str2)) {
                    this.s = true;
                }
            }
        }
        e();
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538378b413e27e39d68fba8b79410c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538378b413e27e39d68fba8b79410c95");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            if (str == null || "highQuality".equals(str)) {
                this.k = 1;
            } else if ("simple".equals(str)) {
                this.k = 0;
            } else if ("balanced".equals(str)) {
                this.k = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            e();
        }
    }

    @ReactProp(name = ReactBaseTextShadowNode.PROP_SHADOW_OFFSET)
    public void setTextShadowOffset(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad57fa5d38f3ed7d09c647d7bba0af86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad57fa5d38f3ed7d09c647d7bba0af86");
            return;
        }
        this.n = 0.0f;
        this.o = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.n = com.meituan.msc.uimanager.s.a(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.o = com.meituan.msc.uimanager.s.a(readableMap.getDouble("height"));
            }
        }
        e();
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d762dfb861c8f6006058257add23a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d762dfb861c8f6006058257add23a8");
        } else if (f != this.p) {
            this.p = f;
            e();
        }
    }

    @ReactProp(customType = "Color", defaultInt = ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788fb789e97122cd4432432d652b0f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788fb789e97122cd4432432d652b0f18");
        } else if (i != this.q) {
            this.q = i;
            e();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a2c60926e4f43f02c8cfd3fe9be57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a2c60926e4f43f02c8cfd3fe9be57b");
            return;
        }
        if (str != null) {
            if (!"none".equals(str)) {
                if (!"uppercase".equals(str)) {
                    if (!"lowercase".equals(str)) {
                        if (!"capitalize".equals(str)) {
                            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
                        }
                        this.d.h = r.CAPITALIZE;
                    } else {
                        this.d.h = r.LOWERCASE;
                    }
                } else {
                    this.d.h = r.UPPERCASE;
                }
            } else {
                this.d.h = r.NONE;
            }
        } else {
            this.d.h = r.UNSET;
        }
        e();
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a3e8d053d31d1c175231d8cb4ecaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a3e8d053d31d1c175231d8cb4ecaec");
        } else if (z != this.u) {
            this.u = z;
            e();
        }
    }

    @ReactProp(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1858dee1419d4ed3ed84df5061ddaf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1858dee1419d4ed3ed84df5061ddaf0");
        } else if (f != this.v) {
            this.v = f;
            e();
        }
    }
}
