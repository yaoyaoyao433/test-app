package com.sankuai.waimai.machpro.component.text;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.props.gens.FontSize;
import com.meituan.android.recce.props.gens.FontStyle;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.machpro.adapter.a;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends e {
    public static ChangeQuickRedirect a;
    private String l;
    private com.sankuai.waimai.machpro.adapter.a m;
    private List<b> n;
    private SpannableString o;
    private final List p;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();
    }

    public static /* synthetic */ void a(d dVar, SpannableString spannableString, b bVar, com.sankuai.waimai.machpro.component.image.a aVar, int i, int i2) {
        Object[] objArr = {spannableString, bVar, aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "293690be3a2d99af181dc2ab865a0a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "293690be3a2d99af181dc2ab865a0a8f");
        } else if (aVar == null || aVar.b() == null) {
        } else {
            Drawable b2 = aVar.b();
            int intrinsicWidth = b2.getIntrinsicWidth();
            int intrinsicHeight = b2.getIntrinsicHeight();
            if (bVar.k > 0) {
                intrinsicWidth = bVar.k;
            }
            if (bVar.l > 0) {
                intrinsicHeight = bVar.l;
            }
            b2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            spannableString.setSpan(new com.sankuai.waimai.machpro.component.text.b(b2), i, i2, 17);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public String a;
        public String b;
        public int c;
        public int d;
        public String e;
        public int f;
        public String g;
        public String h;
        public String i;
        public String j;
        public int k;
        public int l;
        public String m;
        public Integer n;
        public MPJSCallBack o;

        public b() {
            this.a = "text";
            this.b = "";
            this.c = -16777216;
            this.d = 0;
        }

        public b(String str) {
            this.a = "text";
            this.b = "";
            this.c = -16777216;
            this.d = 0;
            this.b = str;
        }
    }

    public d(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03158cb57a047613568bf8010120e8d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03158cb57a047613568bf8010120e8d1");
            return;
        }
        this.l = "aspectFit";
        this.n = new ArrayList();
        this.p = CollectionUtils.asList("font-family", FontStyle.NAME, LineHeight.NAME, FontWeight.NAME, "text-indent", "color");
    }

    @Override // com.sankuai.waimai.machpro.component.text.e, com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public final TextView createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd173ae7239f8e7af0b139c3e1e2fe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd173ae7239f8e7af0b139c3e1e2fe8");
        }
        MPTextView a2 = this.mMachContext.getInstance().a() != null ? this.mMachContext.getInstance().a().a() : null;
        if (a2 == null) {
            a2 = new MPTextView(this.mMachContext.getContext());
        }
        a2.a(this);
        a2.setMaxLines(1);
        a2.setEllipsize(TextUtils.TruncateAt.END);
        a2.setGravity(16);
        a2.setTextSize(0, com.sankuai.waimai.machpro.util.b.b(12.0f));
        this.mMachContext.getInstance().r.a(1);
        return a2;
    }

    @Override // com.sankuai.waimai.machpro.component.text.e, com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65149dec74a8d00d633aa87e3b42f1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65149dec74a8d00d633aa87e3b42f1c2");
            return;
        }
        super.updateViewStyle(str, obj);
        if (this.p.contains(str)) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    @Override // com.sankuai.waimai.machpro.component.text.e, com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        MachArray machArray;
        int i;
        b bVar;
        List<b> list;
        ?? r11 = 0;
        int i2 = 1;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41df96b7208d7a433af9915ff4502573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41df96b7208d7a433af9915ff4502573");
            return;
        }
        super.updateAttribute(str, obj);
        if ("content".equals(str)) {
            this.n.clear();
            if (obj != null && (obj instanceof MachArray)) {
                try {
                    MachArray machArray2 = (MachArray) obj;
                    int i3 = 0;
                    while (i3 < machArray2.size()) {
                        Object obj2 = machArray2.get(i3);
                        if (obj2 instanceof MachMap) {
                            MachMap machMap = (MachMap) obj2;
                            if (machMap != null) {
                                List<b> list2 = this.n;
                                Object[] objArr2 = new Object[i2];
                                objArr2[r11] = machMap;
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f93a907988f96ddec9f9853ee7fe7cf0", RobustBitConfig.DEFAULT_VALUE)) {
                                    machArray = machArray2;
                                    i = i3;
                                    list = list2;
                                    bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r11, "f93a907988f96ddec9f9853ee7fe7cf0");
                                } else {
                                    Object obj3 = machMap.get("text");
                                    Object obj4 = machMap.get("type");
                                    Object obj5 = machMap.get("color");
                                    Object a2 = a(machMap, Arrays.asList("backgroundColor", BackgroundColor.NAME));
                                    Object a3 = a(machMap, Arrays.asList("fontFamily", "font-family"));
                                    Object a4 = a(machMap, Arrays.asList("fontSize", FontSize.NAME));
                                    Object a5 = a(machMap, Arrays.asList(FontWeight.LOWER_CASE_NAME, FontWeight.NAME));
                                    Object a6 = a(machMap, Arrays.asList("fontStyle", FontStyle.NAME));
                                    Object a7 = a(machMap, Arrays.asList("textDecoration", "text-decoration"));
                                    Object obj6 = machMap.get(RaptorUploaderImpl.SRC);
                                    Object obj7 = machMap.get("width");
                                    machArray = machArray2;
                                    Object obj8 = machMap.get("height");
                                    i = i3;
                                    Object obj9 = machMap.get("imageAlign");
                                    Object obj10 = machMap.get("onClick");
                                    Object obj11 = machMap.get("baselineOffset");
                                    bVar = new b();
                                    if (obj3 instanceof String) {
                                        bVar.b = (String) obj3;
                                    }
                                    if (obj4 instanceof String) {
                                        bVar.a = (String) obj4;
                                    }
                                    if (obj5 instanceof String) {
                                        bVar.c = com.sankuai.waimai.machpro.util.b.a(com.sankuai.waimai.machpro.util.b.a(obj5, ""), -16777216);
                                    }
                                    if (bVar.c == -16777216 && this.g != -16777216) {
                                        bVar.c = this.g;
                                    }
                                    if (obj11 instanceof Integer) {
                                        bVar.n = Integer.valueOf((int) com.sankuai.waimai.machpro.util.b.a(obj11));
                                    }
                                    if (a2 instanceof String) {
                                        bVar.d = com.sankuai.waimai.machpro.util.b.a(com.sankuai.waimai.machpro.util.b.a(a2, ""), 0);
                                    }
                                    if (a3 instanceof String) {
                                        bVar.e = (String) a3;
                                    }
                                    bVar.g = com.sankuai.waimai.machpro.util.b.e(com.sankuai.waimai.machpro.util.b.a(a5, ""));
                                    if (a6 instanceof String) {
                                        bVar.h = (String) a6;
                                    }
                                    if (a7 instanceof String) {
                                        bVar.i = (String) a7;
                                    }
                                    bVar.f = (int) com.sankuai.waimai.machpro.util.b.a(a4);
                                    if (obj6 instanceof String) {
                                        bVar.j = (String) obj6;
                                    }
                                    bVar.k = (int) com.sankuai.waimai.machpro.util.b.a(obj7);
                                    bVar.l = (int) com.sankuai.waimai.machpro.util.b.a(obj8);
                                    if (obj9 instanceof String) {
                                        bVar.m = (String) obj9;
                                    }
                                    if (obj10 instanceof MPJSCallBack) {
                                        bVar.o = (MPJSCallBack) obj10;
                                    }
                                    list = list2;
                                }
                                list.add(bVar);
                            } else {
                                machArray = machArray2;
                                i = i3;
                            }
                        } else {
                            machArray = machArray2;
                            i = i3;
                            if (obj2 instanceof String) {
                                this.n.add(new b(obj2.toString()));
                            }
                        }
                        i3 = i + 1;
                        machArray2 = machArray;
                        r11 = 0;
                        i2 = 1;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            b();
        }
    }

    private void b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f3642db701d4af8f48749c41d1a4c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f3642db701d4af8f48749c41d1a4c7");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (b bVar : this.n) {
            if ("image".equals(bVar.a) || ReactTextInputShadowNode.PROP_PLACEHOLDER.equals(bVar.a)) {
                bVar.b = StringUtil.SPACE;
            }
            sb.append(bVar.b);
        }
        this.o = new SpannableString(sb);
        for (b bVar2 : this.n) {
            int length = bVar2.b.length();
            if ("image".equals(bVar2.a) && !TextUtils.isEmpty(bVar2.j)) {
                int i2 = i;
                a(this.o, bVar2, i2, i + length, new c() { // from class: com.sankuai.waimai.machpro.component.text.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.machpro.component.text.d.c
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7325bdcd81536e0fdc256ca0a28c4016", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7325bdcd81536e0fdc256ca0a28c4016");
                            return;
                        }
                        ((TextView) d.this.mView).setText(d.this.o);
                        d.this.requestLayout();
                    }
                });
            } else if (ReactTextInputShadowNode.PROP_PLACEHOLDER.equals(bVar2.a)) {
                b(this.o, bVar2, i, i + length);
            } else {
                int i3 = i + length;
                a(this.o, bVar2, i, i3);
                if (bVar2.o != null) {
                    this.o.setSpan(new a(bVar2.o), i, i3, 17);
                    ((TextView) this.mView).setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            i += length;
        }
        ((TextView) this.mView).setText(this.o);
        requestLayout();
    }

    private void a(SpannableString spannableString, b bVar, int i, int i2) {
        Typeface typeface;
        int i3 = 0;
        Object[] objArr = {spannableString, bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c242a8fda992028087f125e595af5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c242a8fda992028087f125e595af5c");
            return;
        }
        if (this.j > 0) {
            spannableString.setSpan(new LeadingMarginSpan.Standard(this.j, 0), 0, spannableString.length(), 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(bVar.c), i, i2, 17);
        if (bVar.d != 0) {
            spannableString.setSpan(new BackgroundColorSpan(bVar.d), i, i2, 17);
        }
        if (bVar.f > 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(bVar.f, false), i, i2, 17);
        }
        if (!TextUtils.isEmpty(bVar.i)) {
            if (bVar.i.contains(DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE)) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 17);
            } else if (bVar.i.contains(DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH)) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 17);
            }
        }
        boolean equals = DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(bVar.h);
        boolean equals2 = DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(bVar.g);
        Typeface typeface2 = ((TextView) this.mView).getTypeface();
        int style = typeface2 != null ? typeface2.getStyle() : 0;
        if (TextUtils.isEmpty(bVar.h)) {
            equals = DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(this.d) || (style & 2) != 0;
        }
        if (TextUtils.isEmpty(bVar.g)) {
            if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(this.c)) {
                equals2 = true;
            } else {
                equals2 = true;
                if ((style & 1) == 0) {
                    equals2 = false;
                }
            }
        }
        int i4 = equals ? 2 : 0;
        if (equals2) {
            i4 |= 1;
        }
        int i5 = i4;
        spannableString.setSpan(new StyleSpan(i5), i, i2, 17);
        if (TextUtils.isEmpty(bVar.e)) {
            typeface = typeface2;
        } else {
            String[] split = bVar.e.split(CommonConstant.Symbol.COMMA);
            int length = split.length;
            typeface = typeface2;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                typeface = com.sankuai.waimai.machpro.util.b.b(split[i6], i5);
                if (typeface != null) {
                    spannableString.setSpan(new f(typeface), i, i2, 17);
                    break;
                }
                i6++;
            }
        }
        if (typeface == null && this.f != null && this.f.length > 0) {
            String[] strArr = this.f;
            int length2 = strArr.length;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                Typeface b2 = com.sankuai.waimai.machpro.util.b.b(strArr[i3], i5);
                if (b2 != null) {
                    spannableString.setSpan(new f(b2), i, i2, 17);
                    break;
                }
                i3++;
            }
        }
        if (bVar.n != null) {
            spannableString.setSpan(new com.sankuai.waimai.machpro.component.text.a(bVar.n.intValue()), i, i2, 17);
        }
        if (this.k >= 0.0f) {
            spannableString.setSpan(new com.sankuai.waimai.machpro.component.text.c(this.k), i, i2, 17);
        }
    }

    private void a(final SpannableString spannableString, final b bVar, final int i, final int i2, final c cVar) {
        Object[] objArr = {spannableString, bVar, Integer.valueOf(i), Integer.valueOf(i2), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2445c6550c6da38e38e62f8e9e01828c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2445c6550c6da38e38e62f8e9e01828c");
        } else if (TextUtils.isEmpty(bVar.j)) {
        } else {
            a.b bVar2 = new a.b();
            bVar2.j = this.l;
            String str = bVar.j;
            if (str.startsWith("http")) {
                bVar2.c = str;
                bVar2.d = 1;
            } else if (str.startsWith("assets://")) {
                bVar2.d = 2;
                String substring = str.substring(9);
                bVar2.c = com.sankuai.waimai.machpro.util.b.a(this.mMachContext) + substring;
            } else {
                bVar2.c = str;
                bVar2.d = 0;
            }
            if (this.m == null) {
                this.m = com.sankuai.waimai.machpro.f.a().b;
            }
            if (this.m != null) {
                this.m.a(bVar2, new a.InterfaceC1022a() { // from class: com.sankuai.waimai.machpro.component.text.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
                    public final int a(Bitmap bitmap) {
                        return 0;
                    }

                    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
                    public final MachMap b(Bitmap bitmap) {
                        return null;
                    }

                    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
                    public final void a(com.sankuai.waimai.machpro.component.image.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50cc8e4250f1c94ba8081a49351055d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50cc8e4250f1c94ba8081a49351055d6");
                            return;
                        }
                        d.a(d.this, spannableString, bVar, aVar, i, i2);
                        if (cVar != null) {
                            cVar.a();
                        }
                    }

                    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6450629b62d5e25f9d34b94b72f6af1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6450629b62d5e25f9d34b94b72f6af1");
                            return;
                        }
                        com.sankuai.waimai.machpro.util.a.a("MPRichTextComponent", "onLoadFailed " + bVar.j);
                    }

                    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
                    public final void b(com.sankuai.waimai.machpro.component.image.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "797521d8ccc408d9d0286df349da4ac7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "797521d8ccc408d9d0286df349da4ac7");
                            return;
                        }
                        com.sankuai.waimai.machpro.util.a.a("MPRichTextComponent", "onPlaceHolderLoadComplete " + bVar.j);
                    }

                    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
                    public final void c(com.sankuai.waimai.machpro.component.image.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "337f720a9e3dd414472d98b68272cb27", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "337f720a9e3dd414472d98b68272cb27");
                            return;
                        }
                        com.sankuai.waimai.machpro.util.a.a("MPRichTextComponent", "onLoadErrorComplete " + bVar.j);
                    }
                });
            }
        }
    }

    private void b(SpannableString spannableString, b bVar, int i, int i2) {
        Object[] objArr = {spannableString, bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3baf4650034c8469a5cb0775f8fff908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3baf4650034c8469a5cb0775f8fff908");
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(bVar.k, 1);
        gradientDrawable.setBounds(0, 0, bVar.k, 10);
        spannableString.setSpan(new com.sankuai.waimai.machpro.component.text.b(gradientDrawable), i, i2, 17);
    }

    private Object a(MachMap machMap, List<String> list) {
        Object[] objArr = {machMap, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9607e04fc83adf5c7ec1e7bf6fbf97", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9607e04fc83adf5c7ec1e7bf6fbf97");
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = machMap.get(list.get(i));
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ClickableSpan {
        public static ChangeQuickRedirect a;
        private MPJSCallBack b;

        public a(MPJSCallBack mPJSCallBack) {
            Object[] objArr = {mPJSCallBack};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d85e4b48d2b16eabf55b0a119f2e8b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d85e4b48d2b16eabf55b0a119f2e8b");
            } else {
                this.b = mPJSCallBack;
            }
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff66ef433fdae135b65fd3ca2dc395b", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff66ef433fdae135b65fd3ca2dc395b");
            } else if (this.b != null) {
                this.b.invoke((MachMap) null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NonNull TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d4ee935962e21461bbadac9af4e4b0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d4ee935962e21461bbadac9af4e4b0e");
                return;
            }
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }
}
