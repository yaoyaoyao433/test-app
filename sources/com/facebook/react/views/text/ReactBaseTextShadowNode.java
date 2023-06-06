package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.w;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaUnit;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@TargetApi(23)
/* loaded from: classes.dex */
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final int UNSET = -1;
    protected boolean mAdjustsFontSizeToFit;
    protected int mBackgroundColor;
    protected int mColor;
    protected boolean mContainsImages;
    @Nullable
    protected String mFontFamily;
    @Nullable
    protected String mFontFeatureSettings;
    protected int mFontStyle;
    protected int mFontWeight;
    public int mHyphenationFrequency;
    public boolean mIncludeFontPadding;
    protected Map<Integer, af> mInlineViews;
    protected boolean mIsBackgroundColorSet;
    protected boolean mIsColorSet;
    protected boolean mIsLineThroughTextDecorationSet;
    protected boolean mIsUnderlineTextDecorationSet;
    public int mJustificationMode;
    protected float mMinimumFontScale;
    public int mNumberOfLines;
    @Nullable
    protected j mReactTextViewManagerCallback;
    protected int mTextAlign;
    public n mTextAttributes;
    public int mTextBreakStrategy;
    protected int mTextShadowColor;
    protected float mTextShadowOffsetDx;
    protected float mTextShadowOffsetDy;
    protected float mTextShadowRadius;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        protected int a;
        protected int b;
        protected g c;

        a(int i, int i2, g gVar) {
            this.a = i;
            this.b = i2;
            this.c = gVar;
        }

        public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.c, this.a, this.b, ((i << 16) & 16711680) | ((this.a == 0 ? 18 : 34) & (-16711681)));
        }
    }

    private static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<a> list, n nVar, boolean z, Map<Integer, af> map, int i) {
        n nVar2;
        float layoutWidth;
        float layoutHeight;
        if (nVar != null) {
            n nVar3 = reactBaseTextShadowNode.mTextAttributes;
            n nVar4 = new n();
            nVar4.a = nVar.a;
            nVar4.b = !Float.isNaN(nVar3.b) ? nVar3.b : nVar.b;
            nVar4.c = !Float.isNaN(nVar3.c) ? nVar3.c : nVar.c;
            nVar4.d = !Float.isNaN(nVar3.d) ? nVar3.d : nVar.d;
            nVar4.e = !Float.isNaN(nVar3.e) ? nVar3.e : nVar.e;
            nVar4.f = !Float.isNaN(nVar3.f) ? nVar3.f : nVar.f;
            nVar4.g = nVar3.g != r.UNSET ? nVar3.g : nVar.g;
            nVar2 = nVar4;
        } else {
            nVar2 = reactBaseTextShadowNode.mTextAttributes;
        }
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i2);
            if (childAt instanceof ReactRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) r.a(((ReactRawTextShadowNode) childAt).getText(), nVar2.g));
            } else if (childAt instanceof ReactBaseTextShadowNode) {
                buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list, nVar2, z, map, spannableStringBuilder.length());
            } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).a()));
            } else if (z) {
                int reactTag = childAt.getReactTag();
                com.facebook.yoga.e styleWidth = childAt.getStyleWidth();
                com.facebook.yoga.e styleHeight = childAt.getStyleHeight();
                if (styleWidth.e != YogaUnit.POINT || styleHeight.e != YogaUnit.POINT) {
                    childAt.calculateLayout();
                    layoutWidth = childAt.getLayoutWidth();
                    layoutHeight = childAt.getLayoutHeight();
                } else {
                    layoutWidth = styleWidth.d;
                    layoutHeight = styleHeight.d;
                }
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new p(reactTag, (int) layoutWidth, (int) layoutHeight)));
                map.put(Integer.valueOf(reactTag), childAt);
                childAt.markUpdateSeen();
            } else {
                throw new com.facebook.react.uimanager.i("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new a(i, length, new ReactForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new a(i, length, new ReactBackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                float c = nVar2.c();
                if (!Float.isNaN(c) && (nVar == null || nVar.c() != c)) {
                    list.add(new a(i, length, new com.facebook.react.views.text.a(c)));
                }
            }
            int a2 = nVar2.a();
            if (nVar == null || nVar.a() != a2) {
                list.add(new a(i, length, new ReactAbsoluteSizeSpan(a2)));
            }
            if (reactBaseTextShadowNode.mFontStyle != -1 || reactBaseTextShadowNode.mFontWeight != -1 || reactBaseTextShadowNode.mFontFamily != null) {
                list.add(new a(i, length, new c(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFeatureSettings, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new a(i, length, new ReactUnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new a(i, length, new ReactStrikethroughSpan()));
            }
            if ((reactBaseTextShadowNode.mTextShadowOffsetDx != 0.0f || reactBaseTextShadowNode.mTextShadowOffsetDy != 0.0f || reactBaseTextShadowNode.mTextShadowRadius != 0.0f) && Color.alpha(reactBaseTextShadowNode.mTextShadowColor) != 0) {
                list.add(new a(i, length, new l(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            float b = nVar2.b();
            if (!Float.isNaN(b) && (nVar == null || nVar.b() != b)) {
                list.add(new a(i, length, new b(b)));
            }
            list.add(new a(i, length, new h(reactBaseTextShadowNode.getReactTag())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, String str, boolean z, t tVar) {
        int i;
        int i2 = 0;
        com.facebook.infer.annotation.a.a((z && tVar == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = z ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) r.a(str, reactBaseTextShadowNode.mTextAttributes.g));
        }
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList, null, z, hashMap, 0);
        reactBaseTextShadowNode.mContainsImages = false;
        reactBaseTextShadowNode.mInlineViews = hashMap;
        float f = Float.NaN;
        for (a aVar : arrayList) {
            boolean z2 = aVar.c instanceof o;
            if (z2 || (aVar.c instanceof p)) {
                if (z2) {
                    i = ((o) aVar.c).f();
                    reactBaseTextShadowNode.mContainsImages = true;
                } else {
                    p pVar = (p) aVar.c;
                    int i3 = pVar.c;
                    af afVar = (af) hashMap.get(Integer.valueOf(pVar.a));
                    tVar.b(afVar);
                    afVar.setLayoutParent(reactBaseTextShadowNode);
                    i = i3;
                }
                if (Float.isNaN(f) || i > f) {
                    f = i;
                }
            }
            aVar.a(spannableStringBuilder, i2);
            i2++;
        }
        reactBaseTextShadowNode.mTextAttributes.f = f;
        return spannableStringBuilder;
    }

    public ReactBaseTextShadowNode() {
        this(null);
    }

    public ReactBaseTextShadowNode(@Nullable j jVar) {
        this.mIsColorSet = false;
        this.mIsBackgroundColorSet = false;
        this.mNumberOfLines = -1;
        this.mTextAlign = 0;
        this.mTextBreakStrategy = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.mHyphenationFrequency = 0;
        int i2 = Build.VERSION.SDK_INT;
        this.mJustificationMode = 0;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 0.0f;
        this.mTextShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mAdjustsFontSizeToFit = false;
        this.mMinimumFontScale = 0.0f;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mFontFeatureSettings = null;
        this.mContainsImages = false;
        this.mTextAttributes = new n();
        this.mReactTextViewManagerCallback = jVar;
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() == YogaDirection.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i == 3) {
                return 5;
            }
            return i;
        }
        return i;
    }

    @ReactProp(defaultInt = -1, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = LineHeight.LOWER_CASE_NAME)
    public void setLineHeight(float f) {
        this.mTextAttributes.c = f;
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = LetterSpacing.LOWER_CASE_NAME)
    public void setLetterSpacing(float f) {
        this.mTextAttributes.d = f;
        markUpdated();
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.mTextAttributes.a) {
            this.mTextAttributes.a = z;
            markUpdated();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.mTextAttributes.e) {
            this.mTextAttributes.b(f);
            markUpdated();
        }
    }

    @ReactProp(name = TextAlign.LOWER_CASE_NAME)
    public void setTextAlign(@Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 1;
            }
            this.mTextAlign = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 0;
            }
            if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
                this.mTextAlign = 0;
            } else if ("left".equals(str)) {
                this.mTextAlign = 3;
            } else if ("right".equals(str)) {
                this.mTextAlign = 5;
            } else if ("center".equals(str)) {
                this.mTextAlign = 1;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
            }
        }
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(Dynamic dynamic) {
        this.mTextAttributes.b = w.a(dynamic);
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = -10066330, name = "color")
    public void setColor(@Nullable Integer num) {
        this.mIsColorSet = num != null;
        if (this.mIsColorSet) {
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(@Nullable Integer num) {
        if (isVirtual()) {
            this.mIsBackgroundColorSet = num != null;
            if (this.mIsBackgroundColorSet) {
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(@Nullable String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(name = FontWeight.LOWER_CASE_NAME)
    public void setFontWeight(@Nullable String str) {
        int a2 = k.a(str);
        if (a2 != this.mFontWeight) {
            this.mFontWeight = a2;
            markUpdated();
        }
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(@Nullable ReadableArray readableArray) {
        String a2 = k.a(readableArray);
        if (TextUtils.equals(a2, this.mFontFeatureSettings)) {
            return;
        }
        this.mFontFeatureSettings = a2;
        markUpdated();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(@Nullable String str) {
        int b = k.b(str);
        if (b != this.mFontStyle) {
            this.mFontStyle = b;
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(@Nullable String str) {
        String[] split;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(StringUtil.SPACE)) {
                if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE.equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH.equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
        markUpdated();
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(@Nullable String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "highQuality".equals(str)) {
            this.mTextBreakStrategy = 1;
        } else if ("simple".equals(str)) {
            this.mTextBreakStrategy = 0;
        } else if ("balanced".equals(str)) {
            this.mTextBreakStrategy = 2;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        }
        markUpdated();
    }

    @ReactProp(name = PROP_SHADOW_OFFSET)
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = w.a((float) readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = w.a((float) readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", defaultInt = DEFAULT_TEXT_SHADOW_COLOR, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
            markUpdated();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(@Nullable String str) {
        if (str == null) {
            this.mTextAttributes.g = r.UNSET;
        } else if ("none".equals(str)) {
            this.mTextAttributes.g = r.NONE;
        } else if ("uppercase".equals(str)) {
            this.mTextAttributes.g = r.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            this.mTextAttributes.g = r.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            this.mTextAttributes.g = r.CAPITALIZE;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
        markUpdated();
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.mAdjustsFontSizeToFit) {
            this.mAdjustsFontSizeToFit = z;
            markUpdated();
        }
    }

    @ReactProp(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.mMinimumFontScale) {
            this.mMinimumFontScale = f;
            markUpdated();
        }
    }
}
