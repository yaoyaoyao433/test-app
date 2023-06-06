package com.sankuai.waimai.mach.component.richtext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ParagraphStyle;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.sankuai.waimai.mach.component.richtext.a;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends DefaultHandler {
    public static ChangeQuickRedirect a;
    private static final float[] b = {1.5f, 1.4f, 1.3f, 1.2f, 1.1f, 1.0f};
    private static Pattern j;
    private static Pattern k;
    private static Pattern l;
    private static Pattern m;
    private static Pattern n;
    private static Pattern o;
    private static final Map<String, Integer> p;
    private Context c;
    private String d;
    private SAXParser e;
    private SpannableStringBuilder f;
    private a.InterfaceC1004a g;
    private a.b h;
    private int i;

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i2, int i3) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
    }

    static {
        HashMap hashMap = new HashMap();
        p = hashMap;
        hashMap.put("darkgray", -5658199);
        p.put("gray", -8355712);
        p.put("lightgray", -2894893);
        p.put("darkgrey", -5658199);
        p.put("grey", -8355712);
        p.put("lightgrey", -2894893);
        p.put("green", -16744448);
    }

    private static Pattern b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4e0b04c7cde02046924e355c889d03e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4e0b04c7cde02046924e355c889d03e");
        }
        if (j == null) {
            j = Pattern.compile("(?:\\s+|\\A)text-align\\s*:\\s*(\\S*)\\b");
        }
        return j;
    }

    private static Pattern c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f1d2cd391edac2611bba0b83add87e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f1d2cd391edac2611bba0b83add87e");
        }
        if (k == null) {
            k = Pattern.compile("(?:\\s+|\\A|;)color\\s*:\\s*([^\\s;]*)\\s*(;\\s*|\\s*\\b)");
        }
        return k;
    }

    private static Pattern d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56241d9616045c665bc154d49573a56d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56241d9616045c665bc154d49573a56d");
        }
        if (l == null) {
            l = Pattern.compile("(?:\\s+|\\A|;)background(?:-color)?\\s*:\\s*([^\\s;]*)\\s*(;\\s*|\\s*\\b)");
        }
        return l;
    }

    private static Pattern e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68a06330ee656afab6a2c75a4c0f1cb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68a06330ee656afab6a2c75a4c0f1cb1");
        }
        if (m == null) {
            m = Pattern.compile("(?:\\s+|\\A)text-decoration\\s*:\\s*(\\S*)\\b");
        }
        return m;
    }

    private static Pattern f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce043f2acdd5972a78e6b0908884f3a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce043f2acdd5972a78e6b0908884f3a4");
        }
        if (n == null) {
            n = Pattern.compile("(?:\\s+|\\A|;)font-size\\s*:\\s*([^\\s;]*)\\s*(;\\s*|\\s*\\b)");
        }
        return n;
    }

    private static Pattern g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c2f3da55db1167bd8b98421365abf9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c2f3da55db1167bd8b98421365abf9a");
        }
        if (o == null) {
            o = Pattern.compile("(?:\\s+|\\A|;)font-weight\\s*:\\s*([^\\s;]*)\\s*(;\\s*|\\s*\\b)");
        }
        return o;
    }

    public b(@NonNull Context context, String str, a.InterfaceC1004a interfaceC1004a, a.b bVar, SAXParser sAXParser, int i2) {
        Object[] objArr = {context, str, interfaceC1004a, bVar, sAXParser, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7fd5cc7021e1788208779ff38119ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7fd5cc7021e1788208779ff38119ae");
            return;
        }
        this.c = context;
        this.d = str;
        this.f = new SpannableStringBuilder();
        this.g = interfaceC1004a;
        this.h = bVar;
        this.e = sAXParser;
        this.i = i2;
    }

    public final Spanned a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6e9b051d542bb11f0368acf14ef1f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6e9b051d542bb11f0368acf14ef1f3");
        }
        try {
            this.e.parse(new InputSource(new StringReader(this.d)), this);
            Object[] spans = this.f.getSpans(0, this.f.length(), ParagraphStyle.class);
            for (int i2 = 0; i2 < spans.length; i2++) {
                int spanStart = this.f.getSpanStart(spans[i2]);
                int spanEnd = this.f.getSpanEnd(spans[i2]);
                int i3 = spanEnd - 2;
                if (i3 >= 0 && this.f.charAt(spanEnd - 1) == '\n' && this.f.charAt(i3) == '\n') {
                    spanEnd--;
                }
                if (spanEnd == spanStart) {
                    this.f.removeSpan(spans[i2]);
                } else {
                    this.f.setSpan(spans[i2], spanStart, spanEnd, 51);
                }
            }
            return this.f;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (SAXException e3) {
            throw new RuntimeException(e3);
        }
    }

    private int a(int i2) {
        return (i2 & this.i) != 0 ? 1 : 2;
    }

    private static void a(Editable editable, int i2) {
        int i3 = 0;
        Object[] objArr = {editable, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d9f65499fa4f4e4aa0d7950a4f8115a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d9f65499fa4f4e4aa0d7950a4f8115a");
            return;
        }
        int length = editable.length();
        if (length == 0) {
            return;
        }
        for (int i4 = length - 1; i4 >= 0 && editable.charAt(i4) == '\n'; i4--) {
            i3++;
        }
        while (i3 < i2) {
            editable.append("\n");
            i3++;
        }
    }

    private static void a(Editable editable, Attributes attributes, int i2) {
        Object[] objArr = {editable, attributes, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52d0ecb4551f71636ea68f98b0b37872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52d0ecb4551f71636ea68f98b0b37872");
            return;
        }
        editable.length();
        if (i2 > 0) {
            a(editable, i2);
            a(editable, new o(i2));
        }
        String value = attributes.getValue("", "style");
        if (value != null) {
            Matcher matcher = b().matcher(value);
            if (matcher.find()) {
                String group = matcher.group(1);
                if (group.equalsIgnoreCase("start")) {
                    a(editable, new a(Layout.Alignment.ALIGN_NORMAL));
                } else if (group.equalsIgnoreCase("center")) {
                    a(editable, new a(Layout.Alignment.ALIGN_CENTER));
                } else if (group.equalsIgnoreCase("end")) {
                    a(editable, new a(Layout.Alignment.ALIGN_OPPOSITE));
                }
            }
        }
    }

    private static void a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3db253862c24dad1bbd7ffb3510832e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3db253862c24dad1bbd7ffb3510832e6");
            return;
        }
        o oVar = (o) a((Spanned) editable, (Class<Object>) o.class);
        if (oVar != null) {
            a(editable, oVar.b);
            editable.removeSpan(oVar);
        }
        a aVar = (a) a((Spanned) editable, (Class<Object>) a.class);
        if (aVar != null) {
            a(editable, aVar, new AlignmentSpan.Standard(aVar.b));
        }
    }

    private static <T> T a(Spanned spanned, Class<T> cls) {
        Object[] objArr = {spanned, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66139953b81cc2ae2ea0923ae60b69c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66139953b81cc2ae2ea0923ae60b69c2");
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[spans.length - 1];
    }

    private static void a(Spannable spannable, Object obj, Object... objArr) {
        Object[] objArr2 = {spannable, obj, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "23589e4ee1dcc2d0e1338e7bc386c94b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "23589e4ee1dcc2d0e1338e7bc386c94b");
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        spannable.removeSpan(obj);
        int length = spannable.length();
        if (spanStart != length) {
            for (Object obj2 : objArr) {
                spannable.setSpan(obj2, spanStart, length, 33);
            }
        }
    }

    private static void a(Editable editable, Object obj) {
        Object[] objArr = {editable, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a61882f5900a83d71fd5ba8bd9d2ec68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a61882f5900a83d71fd5ba8bd9d2ec68");
            return;
        }
        int length = editable.length();
        editable.setSpan(obj, length, length, 17);
    }

    private static void a(Editable editable, Class cls, Object obj) {
        Object[] objArr = {editable, cls, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f376afb0df36987bb91dd7c23636802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f376afb0df36987bb91dd7c23636802");
            return;
        }
        editable.length();
        Object a2 = a((Spanned) editable, (Class<Object>) cls);
        if (a2 != null) {
            a(editable, a2, obj);
        }
    }

    private void a(Editable editable, Attributes attributes) {
        int i2;
        int a2;
        int a3;
        Object[] objArr = {editable, attributes};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c2bb212ede900b9bb9ce95082a923c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c2bb212ede900b9bb9ce95082a923c");
            return;
        }
        String value = attributes.getValue("", "style");
        if (value != null) {
            Matcher matcher = c().matcher(value);
            if (matcher.find() && (a3 = a(matcher.group(1))) != -1) {
                a(editable, new j(a3 | (-16777216)));
            }
            Matcher matcher2 = d().matcher(value);
            if (matcher2.find() && (a2 = a(matcher2.group(1))) != -1) {
                a(editable, new C1005b(a2 | (-16777216)));
            }
            Matcher matcher3 = e().matcher(value);
            if (matcher3.find() && matcher3.group(1).equalsIgnoreCase(DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH)) {
                a(editable, new q());
            }
            Matcher matcher4 = f().matcher(value);
            if (matcher4.find()) {
                try {
                    i2 = Integer.parseInt(matcher4.group(1));
                } catch (Exception unused) {
                    i2 = -1;
                }
                if (i2 >= 0) {
                    a(editable, new h(i2, true));
                }
            }
            Matcher matcher5 = g().matcher(value);
            if (matcher5.find()) {
                a(editable, new i(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equalsIgnoreCase(matcher5.group(1)) ? 1 : 0));
            }
        }
    }

    private static void b(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "287e3137c2412f3c7d007e364d39df9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "287e3137c2412f3c7d007e364d39df9a");
            return;
        }
        q qVar = (q) a((Spanned) editable, (Class<Object>) q.class);
        if (qVar != null) {
            a(editable, qVar, new StrikethroughSpan());
        }
        C1005b c1005b = (C1005b) a((Spanned) editable, (Class<Object>) C1005b.class);
        if (c1005b != null) {
            a(editable, c1005b, new BackgroundColorSpan(c1005b.b));
        }
        j jVar = (j) a((Spanned) editable, (Class<Object>) j.class);
        if (jVar != null) {
            a(editable, jVar, new ForegroundColorSpan(jVar.b));
        }
        h hVar = (h) a((Spanned) editable, (Class<Object>) h.class);
        if (hVar != null) {
            a(editable, hVar, new AbsoluteSizeSpan(hVar.a, hVar.b));
        }
        i iVar = (i) a((Spanned) editable, (Class<Object>) i.class);
        if (iVar != null) {
            a(editable, iVar, new MachStyleSpan(iVar.a));
        }
    }

    private int a(String str) {
        Integer num;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87d5baa66fa70eec3e0f23b87032f3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87d5baa66fa70eec3e0f23b87032f3a")).intValue();
        }
        if ((this.i & 256) == 256 && (num = p.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return Color.parseColor(str);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int a2;
        Object[] objArr = {str, str2, str3, attributes};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1b76f8ff82f66ad75f7a5286beb194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1b76f8ff82f66ad75f7a5286beb194");
            return;
        }
        Object[] objArr2 = {str2, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d68cf4413066cfc71877e0634a6d9f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d68cf4413066cfc71877e0634a6d9f3");
        } else if (str2.equalsIgnoreCase(BrightRemindSetting.BRIGHT_REMIND)) {
        } else {
            if (str2.equalsIgnoreCase("p")) {
                SpannableStringBuilder spannableStringBuilder = this.f;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                a(spannableStringBuilder, attributes, PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eccf90fe664c6097072b5e0b3d2778b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eccf90fe664c6097072b5e0b3d2778b6")).intValue() : a(1));
                a((Editable) this.f, attributes);
            } else if (str2.equalsIgnoreCase("ul")) {
                SpannableStringBuilder spannableStringBuilder2 = this.f;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                a(spannableStringBuilder2, attributes, PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "81ac2e5ade2110836346094db99de2c3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "81ac2e5ade2110836346094db99de2c3")).intValue() : a(8));
            } else {
                if (str2.equalsIgnoreCase(AppIconSetting.LARGE_ICON_URL)) {
                    SpannableStringBuilder spannableStringBuilder3 = this.f;
                    Object[] objArr5 = {spannableStringBuilder3, attributes};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1686133d99acf78649a01bab19764732", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1686133d99acf78649a01bab19764732");
                        return;
                    }
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    a(spannableStringBuilder3, attributes, PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "35ba06f4f764854148fb4b15c6e0c51e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "35ba06f4f764854148fb4b15c6e0c51e")).intValue() : a(4));
                    a(spannableStringBuilder3, new f());
                    a((Editable) spannableStringBuilder3, attributes);
                } else if (str2.equalsIgnoreCase("div")) {
                    SpannableStringBuilder spannableStringBuilder4 = this.f;
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    a(spannableStringBuilder4, attributes, PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3857ae0c2cae24f0ada72de812309154", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3857ae0c2cae24f0ada72de812309154")).intValue() : a(16));
                } else if (str2.equalsIgnoreCase("span")) {
                    a((Editable) this.f, attributes);
                } else if (str2.equalsIgnoreCase("strong")) {
                    a(this.f, new e());
                } else if (str2.equalsIgnoreCase("b")) {
                    a(this.f, new e());
                } else if (str2.equalsIgnoreCase("em")) {
                    a(this.f, new m());
                } else if (str2.equalsIgnoreCase("cite")) {
                    a(this.f, new m());
                } else if (str2.equalsIgnoreCase("dfn")) {
                    a(this.f, new m());
                } else if (str2.equalsIgnoreCase("i")) {
                    a(this.f, new m());
                } else if (str2.equalsIgnoreCase("big")) {
                    a(this.f, new c());
                } else if (str2.equalsIgnoreCase("small")) {
                    a(this.f, new p());
                } else if (str2.equalsIgnoreCase("font")) {
                    SpannableStringBuilder spannableStringBuilder5 = this.f;
                    Object[] objArr8 = {spannableStringBuilder5, attributes};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "eab12dcbfcd396c11ef958229a65feb0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "eab12dcbfcd396c11ef958229a65feb0");
                        return;
                    }
                    String value = attributes.getValue("", "color");
                    String value2 = attributes.getValue("", "face");
                    if (!TextUtils.isEmpty(value) && (a2 = a(value)) != -1) {
                        a(spannableStringBuilder5, new j(a2 | (-16777216)));
                    }
                    if (TextUtils.isEmpty(value2)) {
                        return;
                    }
                    a(spannableStringBuilder5, new g(value2));
                } else if (str2.equalsIgnoreCase("blockquote")) {
                    SpannableStringBuilder spannableStringBuilder6 = this.f;
                    Object[] objArr9 = {spannableStringBuilder6, attributes};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e94c9a5660ddb971203a470cd0f2b437", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e94c9a5660ddb971203a470cd0f2b437");
                        return;
                    }
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    a(spannableStringBuilder6, attributes, PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "36dd91091c95c969efa9ce598c0cf0f0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "36dd91091c95c969efa9ce598c0cf0f0")).intValue() : a(32));
                    a(spannableStringBuilder6, new d());
                } else if (str2.equalsIgnoreCase(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
                    a(this.f, new n());
                } else if (str2.equalsIgnoreCase("a")) {
                    SpannableStringBuilder spannableStringBuilder7 = this.f;
                    Object[] objArr11 = {spannableStringBuilder7, attributes};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "c5eb2afed88b633890926e14489faffa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "c5eb2afed88b633890926e14489faffa");
                    } else {
                        a(spannableStringBuilder7, new l(attributes.getValue("", "href")));
                    }
                } else if (str2.equalsIgnoreCase("u")) {
                    a(this.f, new t());
                } else if (str2.equalsIgnoreCase("del")) {
                    a(this.f, new q());
                } else if (str2.equalsIgnoreCase("s")) {
                    a(this.f, new q());
                } else if (str2.equalsIgnoreCase("strike")) {
                    a(this.f, new q());
                } else if (str2.equalsIgnoreCase("sup")) {
                    a(this.f, new s());
                } else if (str2.equalsIgnoreCase("sub")) {
                    a(this.f, new r());
                } else if (str2.length() == 2 && Character.toLowerCase(str2.charAt(0)) == 'h' && str2.charAt(1) >= '1' && str2.charAt(1) <= '6') {
                    SpannableStringBuilder spannableStringBuilder8 = this.f;
                    int charAt = str2.charAt(1) - '1';
                    Object[] objArr12 = {spannableStringBuilder8, attributes, Integer.valueOf(charAt)};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "ae7a4bbe19baaa292e4b2a273a5b4b2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "ae7a4bbe19baaa292e4b2a273a5b4b2c");
                        return;
                    }
                    Object[] objArr13 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    a(spannableStringBuilder8, attributes, PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "a3d6678b975b1e03db0f5b81144353a4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "a3d6678b975b1e03db0f5b81144353a4")).intValue() : a(2));
                    a(spannableStringBuilder8, new k(charAt));
                } else if (str2.equalsIgnoreCase(SocialConstants.PARAM_IMG_URL)) {
                    SpannableStringBuilder spannableStringBuilder9 = this.f;
                    a.InterfaceC1004a interfaceC1004a = this.g;
                    Object[] objArr14 = {spannableStringBuilder9, attributes, interfaceC1004a};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, null, changeQuickRedirect14, true, "fafdf7eebacb93809134d585eeccf832", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, null, changeQuickRedirect14, true, "fafdf7eebacb93809134d585eeccf832");
                        return;
                    }
                    String value3 = attributes.getValue("", RaptorUploaderImpl.SRC);
                    Drawable a3 = interfaceC1004a != null ? interfaceC1004a.a(value3) : null;
                    int length = spannableStringBuilder9.length();
                    spannableStringBuilder9.append((CharSequence) "￼");
                    spannableStringBuilder9.setSpan(new ImageSpan(a3, value3), length, spannableStringBuilder9.length(), 33);
                } else {
                    str2.equalsIgnoreCase("root");
                }
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7649105cc71896df312ca9ca45445cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7649105cc71896df312ca9ca45445cd6");
            return;
        }
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "750008d24bb147205b1007f7f9a6da2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "750008d24bb147205b1007f7f9a6da2b");
        } else if (str2.equalsIgnoreCase(BrightRemindSetting.BRIGHT_REMIND)) {
            SpannableStringBuilder spannableStringBuilder = this.f;
            Object[] objArr3 = {spannableStringBuilder};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fd4eec0882434f83fa822b586992d93a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fd4eec0882434f83fa822b586992d93a");
            } else {
                spannableStringBuilder.append('\n');
            }
        } else if (str2.equalsIgnoreCase("p")) {
            b(this.f);
            a(this.f);
        } else if (str2.equalsIgnoreCase("ul")) {
            a(this.f);
        } else if (str2.equalsIgnoreCase(AppIconSetting.LARGE_ICON_URL)) {
            SpannableStringBuilder spannableStringBuilder2 = this.f;
            Object[] objArr4 = {spannableStringBuilder2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a677bf5eee50ac1e23a827fd295c8d8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a677bf5eee50ac1e23a827fd295c8d8c");
                return;
            }
            b(spannableStringBuilder2);
            a(spannableStringBuilder2);
            a(spannableStringBuilder2, f.class, new BulletSpan());
        } else if (str2.equalsIgnoreCase("div")) {
            a(this.f);
        } else if (str2.equalsIgnoreCase("span")) {
            b(this.f);
        } else if (str2.equalsIgnoreCase("strong")) {
            a(this.f, e.class, new StyleSpan(1));
        } else if (str2.equalsIgnoreCase("b")) {
            a(this.f, e.class, new StyleSpan(1));
        } else if (str2.equalsIgnoreCase("em")) {
            a(this.f, m.class, new StyleSpan(2));
        } else if (str2.equalsIgnoreCase("cite")) {
            a(this.f, m.class, new StyleSpan(2));
        } else if (str2.equalsIgnoreCase("dfn")) {
            a(this.f, m.class, new StyleSpan(2));
        } else if (str2.equalsIgnoreCase("i")) {
            a(this.f, m.class, new StyleSpan(2));
        } else if (str2.equalsIgnoreCase("big")) {
            a(this.f, c.class, new RelativeSizeSpan(1.25f));
        } else if (str2.equalsIgnoreCase("small")) {
            a(this.f, p.class, new RelativeSizeSpan(0.8f));
        } else if (str2.equalsIgnoreCase("font")) {
            SpannableStringBuilder spannableStringBuilder3 = this.f;
            Object[] objArr5 = {spannableStringBuilder3};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e258ff146d48d005ca6a860f4b0261ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e258ff146d48d005ca6a860f4b0261ff");
                return;
            }
            g gVar = (g) a((Spanned) spannableStringBuilder3, (Class<Object>) g.class);
            if (gVar != null) {
                a(spannableStringBuilder3, gVar, new TypefaceSpan(gVar.a));
            }
            j jVar = (j) a((Spanned) spannableStringBuilder3, (Class<Object>) j.class);
            if (jVar != null) {
                a(spannableStringBuilder3, jVar, new ForegroundColorSpan(jVar.b));
            }
        } else if (str2.equalsIgnoreCase("blockquote")) {
            SpannableStringBuilder spannableStringBuilder4 = this.f;
            Object[] objArr6 = {spannableStringBuilder4};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "212b809cd12560377de8770e4b9be97c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "212b809cd12560377de8770e4b9be97c");
                return;
            }
            a(spannableStringBuilder4);
            a(spannableStringBuilder4, d.class, new QuoteSpan());
        } else if (str2.equalsIgnoreCase(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
            a(this.f, n.class, new TypefaceSpan("monospace"));
        } else if (str2.equalsIgnoreCase("a")) {
            SpannableStringBuilder spannableStringBuilder5 = this.f;
            Object[] objArr7 = {spannableStringBuilder5};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "e0eb8342a603cd6e2f8fb10333d25b0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "e0eb8342a603cd6e2f8fb10333d25b0a");
                return;
            }
            l lVar = (l) a((Spanned) spannableStringBuilder5, (Class<Object>) l.class);
            if (lVar == null || lVar.a == null) {
                return;
            }
            a(spannableStringBuilder5, lVar, new URLSpan(lVar.a));
        } else if (str2.equalsIgnoreCase("u")) {
            a(this.f, t.class, new UnderlineSpan());
        } else if (str2.equalsIgnoreCase("del")) {
            a(this.f, q.class, new StrikethroughSpan());
        } else if (str2.equalsIgnoreCase("s")) {
            a(this.f, q.class, new StrikethroughSpan());
        } else if (str2.equalsIgnoreCase("strike")) {
            a(this.f, q.class, new StrikethroughSpan());
        } else if (str2.equalsIgnoreCase("sup")) {
            a(this.f, s.class, new SuperscriptSpan());
        } else if (str2.equalsIgnoreCase("sub")) {
            a(this.f, r.class, new SubscriptSpan());
        } else if (str2.length() == 2 && Character.toLowerCase(str2.charAt(0)) == 'h' && str2.charAt(1) >= '1' && str2.charAt(1) <= '6') {
            SpannableStringBuilder spannableStringBuilder6 = this.f;
            Object[] objArr8 = {spannableStringBuilder6};
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "c4b69e566e8f460d77fc28091e68acd2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "c4b69e566e8f460d77fc28091e68acd2");
                return;
            }
            k kVar = (k) a((Spanned) spannableStringBuilder6, (Class<Object>) k.class);
            if (kVar != null) {
                a(spannableStringBuilder6, kVar, new RelativeSizeSpan(b[kVar.b]), new StyleSpan(1));
            }
            a(spannableStringBuilder6);
        } else {
            str2.equalsIgnoreCase("root");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i2, int i3) throws SAXException {
        char charAt;
        Object[] objArr = {cArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7121a8e9e462f0d972345d35830ce483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7121a8e9e462f0d972345d35830ce483");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i4 + i2];
            if (c2 == ' ' || c2 == '\n') {
                int length = sb.length();
                if (length == 0) {
                    int length2 = this.f.length();
                    charAt = length2 == 0 ? '\n' : this.f.charAt(length2 - 1);
                } else {
                    charAt = sb.charAt(length - 1);
                }
                if (charAt != ' ' && charAt != '\n') {
                    sb.append(Constants.SPACE);
                }
            } else {
                sb.append(c2);
            }
        }
        this.f.append((CharSequence) sb);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class e {
        public e() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class m {
        public m() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class t {
        public t() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class q {
        public q() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c {
        public c() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class p {
        public p() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class n {
        public n() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d {
        public d() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class s {
        public s() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class r {
        public r() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class f {
        public f() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class g {
        public String a;

        public g(String str) {
            this.a = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class l {
        public String a;

        public l(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class j {
        public static ChangeQuickRedirect a;
        private int b;

        public j(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f720e4dc2f785d5e4f2a8762afb2798a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f720e4dc2f785d5e4f2a8762afb2798a");
            } else {
                this.b = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.component.richtext.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1005b {
        public static ChangeQuickRedirect a;
        private int b;

        public C1005b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784e41d2cd9e0767ed7c525373cf87c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784e41d2cd9e0767ed7c525373cf87c9");
            } else {
                this.b = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class k {
        public static ChangeQuickRedirect a;
        private int b;

        public k(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4c3ce3ade6e831d174b536ebdced63", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4c3ce3ade6e831d174b536ebdced63");
            } else {
                this.b = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class o {
        public static ChangeQuickRedirect a;
        private int b;

        public o(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb9bc44afa5456464d31c3509867713", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb9bc44afa5456464d31c3509867713");
            } else {
                this.b = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private Layout.Alignment b;

        public a(Layout.Alignment alignment) {
            Object[] objArr = {alignment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ebf1428f06e74884aa8d1be8af134a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ebf1428f06e74884aa8d1be8af134a8");
            } else {
                this.b = alignment;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class h {
        public int a;
        public boolean b = true;

        public h(int i, boolean z) {
            this.a = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class i {
        public int a;

        public i(int i) {
            this.a = i;
        }
    }
}
