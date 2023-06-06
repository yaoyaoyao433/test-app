package com.sankuai.common.utils;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
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
import android.util.TypedValue;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.sankuai.common.utils.HtmlDecorator;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HtmlToSpannedConverter implements ContentHandler {
    private static final Map<String, Integer> COLOR_NAME_CSS_MAP;
    private static final HashMap<String, Integer> COLOR_NAME_MAP;
    private static final float[] HEADING_SIZES = {1.5f, 1.4f, 1.3f, 1.2f, 1.1f, 1.0f};
    private static Pattern backgroundColorPattern;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Pattern fontSizePattern;
    private static Pattern foregroundColorPattern;
    private static Pattern numberPattern;
    private static Pattern signedNumberPattern;
    private static Pattern textAlignPattern;
    private static Pattern textDecorationPattern;
    private static Pattern verticalAlignPattern;
    private int flags;
    private HtmlDecorator.FontSizeGetter fontSizeGetter;
    private Html.ImageGetter imageGetter;
    private XMLReader reader;
    private String source;
    private SpannableStringBuilder spannableStringBuilder;
    private Html.TagHandler tagHandler;

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        COLOR_NAME_MAP = hashMap;
        hashMap.put("black", -16777216);
        COLOR_NAME_MAP.put("darkgray", -12303292);
        COLOR_NAME_MAP.put("gray", -7829368);
        COLOR_NAME_MAP.put("lightgray", -3355444);
        COLOR_NAME_MAP.put("white", -1);
        COLOR_NAME_MAP.put("red", Integer.valueOf((int) SupportMenu.CATEGORY_MASK));
        COLOR_NAME_MAP.put("green", -16711936);
        COLOR_NAME_MAP.put("blue", -16776961);
        COLOR_NAME_MAP.put("yellow", Integer.valueOf((int) InputDeviceCompat.SOURCE_ANY));
        COLOR_NAME_MAP.put("cyan", -16711681);
        COLOR_NAME_MAP.put("magenta", -65281);
        COLOR_NAME_MAP.put("aqua", -16711681);
        COLOR_NAME_MAP.put("fuchsia", -65281);
        COLOR_NAME_MAP.put("lime", -16711936);
        COLOR_NAME_MAP.put("maroon", -8388608);
        COLOR_NAME_MAP.put("navy", -16777088);
        COLOR_NAME_MAP.put("olive", -8355840);
        COLOR_NAME_MAP.put("purple", -8388480);
        COLOR_NAME_MAP.put("silver", -4144960);
        COLOR_NAME_MAP.put("teal", -16744320);
        HashMap hashMap2 = new HashMap();
        COLOR_NAME_CSS_MAP = hashMap2;
        hashMap2.put("darkgray", -5658199);
        COLOR_NAME_CSS_MAP.put("gray", -8355712);
        COLOR_NAME_CSS_MAP.put("lightgray", -2894893);
        COLOR_NAME_CSS_MAP.put("darkgrey", -5658199);
        COLOR_NAME_CSS_MAP.put("grey", -8355712);
        COLOR_NAME_CSS_MAP.put("lightgrey", -2894893);
        COLOR_NAME_CSS_MAP.put("green", -16744448);
    }

    private static Pattern getNumberPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f9213fe322f717526522df1a1b4b4b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f9213fe322f717526522df1a1b4b4b2");
        }
        if (numberPattern == null) {
            numberPattern = Pattern.compile("[\\D]*([\\d.]*)[\\D]*");
        }
        return numberPattern;
    }

    private static Pattern getTextAlignPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1507777a682ee61339f9b9d05d8dab9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1507777a682ee61339f9b9d05d8dab9");
        }
        if (textAlignPattern == null) {
            textAlignPattern = Pattern.compile("(?:\\s+|\\A)text-align\\s*:\\s*(\\S*)\\b");
        }
        return textAlignPattern;
    }

    private static Pattern getForegroundColorPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4f8470280b9b6d07576485ece97d727", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4f8470280b9b6d07576485ece97d727");
        }
        if (foregroundColorPattern == null) {
            foregroundColorPattern = Pattern.compile("(?:\\s+|\\A)color\\s*:\\s*(\\S*)\\b");
        }
        return foregroundColorPattern;
    }

    private static Pattern getBackgroundColorPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3d5e0477832b12bc1f5d99a9ca088ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3d5e0477832b12bc1f5d99a9ca088ea");
        }
        if (backgroundColorPattern == null) {
            backgroundColorPattern = Pattern.compile("(?:\\s+|\\A)background(?:-color)?\\s*:\\s*(\\S*)\\b");
        }
        return backgroundColorPattern;
    }

    private static Pattern getTextDecorationPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee70cd028de76e3cfa8bc7eb9562933b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee70cd028de76e3cfa8bc7eb9562933b");
        }
        if (textDecorationPattern == null) {
            textDecorationPattern = Pattern.compile("(?:\\s+|\\A)text-decoration\\s*:\\s*(\\S*)\\b");
        }
        return textDecorationPattern;
    }

    private static Pattern getFontSizePattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d228c489289ff24c1652152d3954c846", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d228c489289ff24c1652152d3954c846");
        }
        if (fontSizePattern == null) {
            fontSizePattern = Pattern.compile("(?:\\s+|\\A)(?:font-)?size\\s*:\\s*(\\S*)\\b");
        }
        return fontSizePattern;
    }

    private static Pattern getVerticalAlignPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "350392690bac622c9110c05fa68db8ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "350392690bac622c9110c05fa68db8ed");
        }
        if (verticalAlignPattern == null) {
            verticalAlignPattern = Pattern.compile("(?:\\s+|\\A)vertical-align\\s*:\\s*(\\S*)\\b");
        }
        return verticalAlignPattern;
    }

    private static Pattern getSignedNumberPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b43f8139097d388440c6dede639d7c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b43f8139097d388440c6dede639d7c1");
        }
        if (signedNumberPattern == null) {
            signedNumberPattern = Pattern.compile("[^-\\d]*(-?)([\\d.]*)[\\D]*");
        }
        return signedNumberPattern;
    }

    public HtmlToSpannedConverter(String str, HtmlDecorator.FontSizeGetter fontSizeGetter, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, XMLReader xMLReader, int i) {
        Object[] objArr = {str, fontSizeGetter, imageGetter, tagHandler, xMLReader, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04c9b0b42d6a5eadb8f392e3eb9f314f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04c9b0b42d6a5eadb8f392e3eb9f314f");
            return;
        }
        this.source = str;
        this.spannableStringBuilder = new SpannableStringBuilder();
        this.fontSizeGetter = fontSizeGetter;
        this.imageGetter = imageGetter;
        this.tagHandler = tagHandler;
        this.reader = xMLReader;
        this.flags = i;
    }

    public Spanned convert() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58429686b477b9381ab58e6e10683ca5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58429686b477b9381ab58e6e10683ca5");
        }
        this.reader.setContentHandler(this);
        try {
            this.reader.parse(new InputSource(new StringReader(this.source)));
            Object[] spans = this.spannableStringBuilder.getSpans(0, this.spannableStringBuilder.length(), ParagraphStyle.class);
            for (int i = 0; i < spans.length; i++) {
                int spanStart = this.spannableStringBuilder.getSpanStart(spans[i]);
                int spanEnd = this.spannableStringBuilder.getSpanEnd(spans[i]);
                int i2 = spanEnd - 2;
                if (i2 >= 0 && this.spannableStringBuilder.charAt(spanEnd - 1) == '\n' && this.spannableStringBuilder.charAt(i2) == '\n') {
                    spanEnd--;
                }
                if (spanEnd == spanStart) {
                    this.spannableStringBuilder.removeSpan(spans[i]);
                } else {
                    this.spannableStringBuilder.setSpan(spans[i], spanStart, spanEnd, 51);
                }
            }
            return this.spannableStringBuilder;
        } catch (IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    private void handleStartTag(String str, Attributes attributes) {
        Object[] objArr = {str, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ab3df1b3ef64110a5dc458a782d73ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ab3df1b3ef64110a5dc458a782d73ac");
        } else if (str.equalsIgnoreCase(BrightRemindSetting.BRIGHT_REMIND)) {
        } else {
            if (str.equalsIgnoreCase("p")) {
                startBlockElement(this.spannableStringBuilder, attributes, getMarginParagraph());
                startCssStyle(this.spannableStringBuilder, attributes);
            } else if (str.equalsIgnoreCase("ul")) {
                startBlockElement(this.spannableStringBuilder, attributes, getMarginList());
            } else if (str.equalsIgnoreCase(AppIconSetting.LARGE_ICON_URL)) {
                startLi(this.spannableStringBuilder, attributes);
            } else if (str.equalsIgnoreCase("div")) {
                startBlockElement(this.spannableStringBuilder, attributes, getMarginDiv());
            } else if (str.equalsIgnoreCase("span")) {
                startCssStyle(this.spannableStringBuilder, attributes);
            } else if (str.equalsIgnoreCase("strong")) {
                start(this.spannableStringBuilder, new Bold());
            } else if (str.equalsIgnoreCase("b")) {
                start(this.spannableStringBuilder, new Bold());
            } else if (str.equalsIgnoreCase("em")) {
                start(this.spannableStringBuilder, new Italic());
            } else if (str.equalsIgnoreCase("cite")) {
                start(this.spannableStringBuilder, new Italic());
            } else if (str.equalsIgnoreCase("dfn")) {
                start(this.spannableStringBuilder, new Italic());
            } else if (str.equalsIgnoreCase("i")) {
                start(this.spannableStringBuilder, new Italic());
            } else if (str.equalsIgnoreCase("big")) {
                start(this.spannableStringBuilder, new Big());
            } else if (str.equalsIgnoreCase("small")) {
                start(this.spannableStringBuilder, new Small());
            } else if (str.equalsIgnoreCase("font")) {
                startCssStyle(this.spannableStringBuilder, attributes);
                startFont(this.spannableStringBuilder, attributes);
            } else if (str.equalsIgnoreCase("blockquote")) {
                startBlockquote(this.spannableStringBuilder, attributes);
            } else if (str.equalsIgnoreCase(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
                start(this.spannableStringBuilder, new Monospace());
            } else if (str.equalsIgnoreCase("a")) {
                startA(this.spannableStringBuilder, attributes);
            } else if (str.equalsIgnoreCase("u")) {
                start(this.spannableStringBuilder, new Underline());
            } else if (str.equalsIgnoreCase("del")) {
                start(this.spannableStringBuilder, new Strikethrough());
            } else if (str.equalsIgnoreCase("s")) {
                start(this.spannableStringBuilder, new Strikethrough());
            } else if (str.equalsIgnoreCase("strike")) {
                start(this.spannableStringBuilder, new Strikethrough());
            } else if (str.equalsIgnoreCase("sup")) {
                start(this.spannableStringBuilder, new Super());
            } else if (str.equalsIgnoreCase("sub")) {
                start(this.spannableStringBuilder, new Sub());
            } else if (str.length() == 2 && Character.toLowerCase(str.charAt(0)) == 'h' && str.charAt(1) >= '1' && str.charAt(1) <= '6') {
                startHeading(this.spannableStringBuilder, attributes, str.charAt(1) - '1');
            } else if (str.equalsIgnoreCase(SocialConstants.PARAM_IMG_URL) || this.tagHandler == null) {
            } else {
                this.tagHandler.handleTag(true, str, this.spannableStringBuilder, this.reader);
            }
        }
    }

    private void handleEndTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f81f46c5f1a35de4e0bdb7a45bb1382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f81f46c5f1a35de4e0bdb7a45bb1382");
        } else if (str.equalsIgnoreCase(BrightRemindSetting.BRIGHT_REMIND)) {
            handleBr(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("p")) {
            endCssStyle(this.spannableStringBuilder);
            endBlockElement(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("ul")) {
            endBlockElement(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase(AppIconSetting.LARGE_ICON_URL)) {
            endLi(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("div")) {
            endBlockElement(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("span")) {
            endCssStyle(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("strong")) {
            end(this.spannableStringBuilder, Bold.class, new StyleSpan(1));
        } else if (str.equalsIgnoreCase("b")) {
            end(this.spannableStringBuilder, Bold.class, new StyleSpan(1));
        } else if (str.equalsIgnoreCase("em")) {
            end(this.spannableStringBuilder, Italic.class, new StyleSpan(2));
        } else if (str.equalsIgnoreCase("cite")) {
            end(this.spannableStringBuilder, Italic.class, new StyleSpan(2));
        } else if (str.equalsIgnoreCase("dfn")) {
            end(this.spannableStringBuilder, Italic.class, new StyleSpan(2));
        } else if (str.equalsIgnoreCase("i")) {
            end(this.spannableStringBuilder, Italic.class, new StyleSpan(2));
        } else if (str.equalsIgnoreCase("big")) {
            end(this.spannableStringBuilder, Big.class, new RelativeSizeSpan(1.25f));
        } else if (str.equalsIgnoreCase("small")) {
            end(this.spannableStringBuilder, Small.class, new RelativeSizeSpan(0.8f));
        } else if (str.equalsIgnoreCase("font")) {
            endFont(this.spannableStringBuilder);
            endCssStyle(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("blockquote")) {
            endBlockquote(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
            end(this.spannableStringBuilder, Monospace.class, new TypefaceSpan("monospace"));
        } else if (str.equalsIgnoreCase("a")) {
            endA(this.spannableStringBuilder);
        } else if (str.equalsIgnoreCase("u")) {
            end(this.spannableStringBuilder, Underline.class, new UnderlineSpan());
        } else if (str.equalsIgnoreCase("del")) {
            end(this.spannableStringBuilder, Strikethrough.class, new StrikethroughSpan());
        } else if (str.equalsIgnoreCase("s")) {
            end(this.spannableStringBuilder, Strikethrough.class, new StrikethroughSpan());
        } else if (str.equalsIgnoreCase("strike")) {
            end(this.spannableStringBuilder, Strikethrough.class, new StrikethroughSpan());
        } else if (str.equalsIgnoreCase("sup")) {
            end(this.spannableStringBuilder, Super.class, new SuperscriptSpan());
        } else if (str.equalsIgnoreCase("sub")) {
            end(this.spannableStringBuilder, Sub.class, new SubscriptSpan());
        } else if (str.length() == 2 && Character.toLowerCase(str.charAt(0)) == 'h' && str.charAt(1) >= '1' && str.charAt(1) <= '6') {
            endHeading(this.spannableStringBuilder);
        } else if (this.tagHandler != null) {
            this.tagHandler.handleTag(false, str, this.spannableStringBuilder, this.reader);
        }
    }

    private int getMarginParagraph() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc9db2ae803458dacac414410ad9c4a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc9db2ae803458dacac414410ad9c4a0")).intValue() : getMargin(1);
    }

    private int getMarginHeading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d49bf1c17e764ee1bb715762a53fe2f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d49bf1c17e764ee1bb715762a53fe2f1")).intValue() : getMargin(2);
    }

    private int getMarginListItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a05cb7727a0f311ea42034b28dfd294", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a05cb7727a0f311ea42034b28dfd294")).intValue() : getMargin(4);
    }

    private int getMarginList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa48979374a39e0f743eeb6c039a2558", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa48979374a39e0f743eeb6c039a2558")).intValue() : getMargin(8);
    }

    private int getMarginDiv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccd520f930b1f2cfe3c9c15f5d4cf54a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccd520f930b1f2cfe3c9c15f5d4cf54a")).intValue() : getMargin(16);
    }

    private int getMarginBlockquote() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "038775ae39b4f445c42e7bcf6cfa319f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "038775ae39b4f445c42e7bcf6cfa319f")).intValue() : getMargin(32);
    }

    private int getMargin(int i) {
        return (i & this.flags) != 0 ? 1 : 2;
    }

    private static void appendNewlines(Editable editable, int i) {
        int i2 = 0;
        Object[] objArr = {editable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4f656f880fbce5a70b00035ec5b7087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4f656f880fbce5a70b00035ec5b7087");
            return;
        }
        int length = editable.length();
        if (length == 0) {
            return;
        }
        for (int i3 = length - 1; i3 >= 0 && editable.charAt(i3) == '\n'; i3--) {
            i2++;
        }
        while (i2 < i) {
            editable.append("\n");
            i2++;
        }
    }

    private static void startBlockElement(Editable editable, Attributes attributes, int i) {
        Object[] objArr = {editable, attributes, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c52464ba007a04365818c5fefb2ee11f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c52464ba007a04365818c5fefb2ee11f");
            return;
        }
        editable.length();
        if (i > 0) {
            appendNewlines(editable, i);
            start(editable, new Newline(i));
        }
        String value = attributes.getValue("", "style");
        if (value != null) {
            Matcher matcher = getTextAlignPattern().matcher(value);
            if (matcher.find()) {
                String group = matcher.group(1);
                if (group.equalsIgnoreCase("start")) {
                    start(editable, new Alignment(Layout.Alignment.ALIGN_NORMAL));
                } else if (group.equalsIgnoreCase("center")) {
                    start(editable, new Alignment(Layout.Alignment.ALIGN_CENTER));
                } else if (group.equalsIgnoreCase("end")) {
                    start(editable, new Alignment(Layout.Alignment.ALIGN_OPPOSITE));
                }
            }
        }
    }

    private static void endBlockElement(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "341ad620643e2bb0f0a37fd2977a5f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "341ad620643e2bb0f0a37fd2977a5f14");
            return;
        }
        Newline newline = (Newline) getLast(editable, Newline.class);
        if (newline != null) {
            appendNewlines(editable, newline.numNewlines);
            editable.removeSpan(newline);
        }
        Alignment alignment = (Alignment) getLast(editable, Alignment.class);
        if (alignment != null) {
            setSpanFromMark(editable, alignment, new AlignmentSpan.Standard(alignment.alignment));
        }
    }

    private static void handleBr(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1709b674b766e51b479209ebe26b10e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1709b674b766e51b479209ebe26b10e8");
        } else {
            editable.append('\n');
        }
    }

    private void startLi(Editable editable, Attributes attributes) {
        Object[] objArr = {editable, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57bf2115904de6db6746b8e8e574e82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57bf2115904de6db6746b8e8e574e82d");
            return;
        }
        startBlockElement(editable, attributes, getMarginListItem());
        start(editable, new Bullet());
        startCssStyle(editable, attributes);
    }

    private static void endLi(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd17bd1d7a0ebc4096384f4988c6d085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd17bd1d7a0ebc4096384f4988c6d085");
            return;
        }
        endCssStyle(editable);
        endBlockElement(editable);
        end(editable, Bullet.class, new BulletSpan());
    }

    private void startBlockquote(Editable editable, Attributes attributes) {
        Object[] objArr = {editable, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60d9a221bec825eaedd478888490e39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60d9a221bec825eaedd478888490e39a");
            return;
        }
        startBlockElement(editable, attributes, getMarginBlockquote());
        start(editable, new Blockquote());
    }

    private static void endBlockquote(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fd36a93cf82de8c15d90e9c3df7729b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fd36a93cf82de8c15d90e9c3df7729b");
            return;
        }
        endBlockElement(editable);
        end(editable, Blockquote.class, new QuoteSpan());
    }

    private void startHeading(Editable editable, Attributes attributes, int i) {
        Object[] objArr = {editable, attributes, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a1486f977995449a0474c45213bca36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a1486f977995449a0474c45213bca36");
            return;
        }
        startBlockElement(editable, attributes, getMarginHeading());
        start(editable, new Heading(i));
    }

    private static void endHeading(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c8ac36f7765f7f6cfdf826190c59ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c8ac36f7765f7f6cfdf826190c59ba7");
            return;
        }
        Heading heading = (Heading) getLast(editable, Heading.class);
        if (heading != null) {
            setSpanFromMark(editable, heading, new RelativeSizeSpan(HEADING_SIZES[heading.level]), new StyleSpan(1));
        }
        endBlockElement(editable);
    }

    private static <T> T getLast(Spanned spanned, Class<T> cls) {
        Object[] objArr = {spanned, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9861004a457c67dbf6a84df0a23f9cfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9861004a457c67dbf6a84df0a23f9cfb");
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[spans.length - 1];
    }

    private static void setSpanFromMark(Spannable spannable, Object obj, Object... objArr) {
        Object[] objArr2 = {spannable, obj, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d5ac15f3df21775239260995c1831d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d5ac15f3df21775239260995c1831d4e");
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

    private static void start(Editable editable, Object obj) {
        Object[] objArr = {editable, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e9c557dc35047ae738a539c50547b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e9c557dc35047ae738a539c50547b69");
            return;
        }
        int length = editable.length();
        editable.setSpan(obj, length, length, 17);
    }

    private static void end(Editable editable, Class cls, Object obj) {
        Object[] objArr = {editable, cls, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "486d5965e01f27138a1ae7ad9bd2fbc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "486d5965e01f27138a1ae7ad9bd2fbc8");
            return;
        }
        editable.length();
        Object last = getLast(editable, cls);
        if (last != null) {
            setSpanFromMark(editable, last, obj);
        }
    }

    private void startCssStyle(Editable editable, Attributes attributes) {
        Integer verticalAlignPx;
        int fontSize;
        Integer htmlColor;
        Integer htmlColor2;
        Object[] objArr = {editable, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "105c50171c9ba31c577e6a5cdbd8afae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "105c50171c9ba31c577e6a5cdbd8afae");
            return;
        }
        String value = attributes.getValue("", "style");
        if (value != null) {
            Matcher matcher = getForegroundColorPattern().matcher(value);
            if (matcher.find() && (htmlColor2 = getHtmlColor(matcher.group(1))) != null) {
                start(editable, new Foreground(htmlColor2.intValue()));
            }
            Matcher matcher2 = getBackgroundColorPattern().matcher(value);
            if (matcher2.find() && (htmlColor = getHtmlColor(matcher2.group(1))) != null) {
                start(editable, new Background(htmlColor.intValue()));
            }
            Matcher matcher3 = getTextDecorationPattern().matcher(value);
            if (matcher3.find() && matcher3.group(1).equalsIgnoreCase(DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH)) {
                start(editable, new Strikethrough());
            }
            Matcher matcher4 = getFontSizePattern().matcher(value);
            if (matcher4.find() && (fontSize = getFontSize(matcher4.group(1))) > 0) {
                start(editable, new Size(fontSize));
            }
            Matcher matcher5 = getVerticalAlignPattern().matcher(value);
            if (!matcher5.find() || (verticalAlignPx = getVerticalAlignPx(matcher5.group(1))) == null) {
                return;
            }
            start(editable, new VerticalAlign(verticalAlignPx.intValue()));
        }
    }

    private static void endCssStyle(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aee0d8664e70fa46e40e973f6972f534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aee0d8664e70fa46e40e973f6972f534");
            return;
        }
        VerticalAlign verticalAlign = (VerticalAlign) getLast(editable, VerticalAlign.class);
        if (verticalAlign != null) {
            setSpanFromMark(editable, verticalAlign, new VerticalAlignSpan(verticalAlign.baselineShift));
        }
        Size size = (Size) getLast(editable, Size.class);
        if (size != null) {
            setSpanFromMark(editable, size, new AbsoluteSizeSpan(size.size, true));
        }
        Strikethrough strikethrough = (Strikethrough) getLast(editable, Strikethrough.class);
        if (strikethrough != null) {
            setSpanFromMark(editable, strikethrough, new StrikethroughSpan());
        }
        Background background = (Background) getLast(editable, Background.class);
        if (background != null) {
            setSpanFromMark(editable, background, new BackgroundColorSpan(background.backgroundColor));
        }
        Foreground foreground = (Foreground) getLast(editable, Foreground.class);
        if (foreground != null) {
            setSpanFromMark(editable, foreground, new ForegroundColorSpan(foreground.foregroundColor));
        }
    }

    private void startFont(Editable editable, Attributes attributes) {
        Integer verticalAlignPx;
        int fontSize;
        Integer htmlColor;
        Integer htmlColor2;
        Object[] objArr = {editable, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253c3fa48fca88ecfff756d332bb075a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253c3fa48fca88ecfff756d332bb075a");
            return;
        }
        String value = attributes.getValue("", "color");
        String value2 = attributes.getValue("", BackgroundColor.NAME);
        String value3 = attributes.getValue("", "face");
        String value4 = attributes.getValue("", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
        String value5 = attributes.getValue("", "vertical-align");
        if (!TextUtils.isEmpty(value) && (htmlColor2 = getHtmlColor(value)) != null) {
            start(editable, new Foreground(htmlColor2.intValue()));
        }
        if (!TextUtils.isEmpty(value2) && (htmlColor = getHtmlColor(value2)) != null) {
            start(editable, new Background(htmlColor.intValue()));
        }
        if (!TextUtils.isEmpty(value3)) {
            start(editable, new Font(value3));
        }
        if (!TextUtils.isEmpty(value4) && (fontSize = getFontSize(value4)) != -1) {
            start(editable, new Size(fontSize));
        }
        if (TextUtils.isEmpty(value5) || (verticalAlignPx = getVerticalAlignPx(value5)) == null) {
            return;
        }
        start(editable, new VerticalAlign(verticalAlignPx.intValue()));
    }

    private static void endFont(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e021cff482393c9653eb3907666f7ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e021cff482393c9653eb3907666f7ba4");
            return;
        }
        VerticalAlign verticalAlign = (VerticalAlign) getLast(editable, VerticalAlign.class);
        if (verticalAlign != null) {
            setSpanFromMark(editable, verticalAlign, new VerticalAlignSpan(verticalAlign.baselineShift));
        }
        Size size = (Size) getLast(editable, Size.class);
        if (size != null) {
            setSpanFromMark(editable, size, new AbsoluteSizeSpan(size.size));
        }
        Font font = (Font) getLast(editable, Font.class);
        if (font != null) {
            setSpanFromMark(editable, font, new TypefaceSpan(font.face));
        }
        Background background = (Background) getLast(editable, Background.class);
        if (background != null) {
            setSpanFromMark(editable, background, new BackgroundColorSpan(background.backgroundColor));
        }
        Foreground foreground = (Foreground) getLast(editable, Foreground.class);
        if (foreground != null) {
            setSpanFromMark(editable, foreground, new ForegroundColorSpan(foreground.foregroundColor));
        }
    }

    private static void startA(Editable editable, Attributes attributes) {
        Object[] objArr = {editable, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ea189c52c1ee9acf36a1d6afbeb5aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ea189c52c1ee9acf36a1d6afbeb5aae");
        } else {
            start(editable, new Href(attributes.getValue("", "href")));
        }
    }

    private static void endA(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27a603b77a81b326e02eb0924bf71e8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27a603b77a81b326e02eb0924bf71e8a");
            return;
        }
        Href href = (Href) getLast(editable, Href.class);
        if (href == null || href.href == null) {
            return;
        }
        setSpanFromMark(editable, href, new URLSpan(href.href));
    }

    private static Integer convertIntegerToColor(String str, Integer num) {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0171542e50ff2a3edfb9be077d0a2cb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0171542e50ff2a3edfb9be077d0a2cb8");
        }
        if (num == null || str == null) {
            return null;
        }
        if ((num.intValue() & (-16777216)) == 0) {
            int length = str.length();
            if ((!str.startsWith("0x00") || length != 10) && (!str.startsWith("#00") || length != 9)) {
                return Integer.valueOf(num.intValue() | (-16777216));
            }
        }
        return num;
    }

    private static Integer convertValueToInteger(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4618fac51b2e6f4c5e324f9a86885611", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4618fac51b2e6f4c5e324f9a86885611");
        }
        if (charSequence == null) {
            return null;
        }
        try {
            long longValue = Long.decode(charSequence.toString()).longValue();
            if (((-4294967296L) & longValue) != 0) {
                return null;
            }
            return Integer.valueOf((int) longValue);
        } catch (Exception unused) {
            return null;
        }
    }

    private Integer getHtmlColor(String str) {
        Integer num;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e8830ac2eea11daa1a0a310a5fd1d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e8830ac2eea11daa1a0a310a5fd1d8");
        }
        if ((this.flags & 256) != 256 || (num = COLOR_NAME_CSS_MAP.get(str.toLowerCase(Locale.US))) == null) {
            Integer num2 = COLOR_NAME_MAP.get(str.toLowerCase(Locale.ROOT));
            if (num2 != null) {
                return num2;
            }
            try {
                return convertIntegerToColor(str, convertValueToInteger(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return num;
    }

    private int getFontSize(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "856a7f286a17d6f9fe3a747a0164fec7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "856a7f286a17d6f9fe3a747a0164fec7")).intValue();
        }
        if (this.fontSizeGetter != null) {
            return this.fontSizeGetter.getFontSize(str);
        }
        Matcher matcher = getNumberPattern().matcher(str);
        if (matcher.find()) {
            try {
                return (int) ((Integer.parseInt(matcher.group(1)) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return -1;
    }

    private Integer getVerticalAlignPx(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "537013fb8a719fa923dc25db97e10f3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "537013fb8a719fa923dc25db97e10f3a");
        }
        if (str == null) {
            return null;
        }
        Matcher matcher = getSignedNumberPattern().matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            try {
                int applyDimension = (int) (TypedValue.applyDimension(1, Integer.parseInt(matcher.group(2)), Resources.getSystem().getDisplayMetrics()) + 0.5d);
                if (group == null || group.isEmpty()) {
                    applyDimension = -applyDimension;
                }
                return Integer.valueOf(applyDimension);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        Object[] objArr = {str, str2, str3, attributes};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1410adb0c2f29aa19fbab434f36ca4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1410adb0c2f29aa19fbab434f36ca4af");
        } else {
            handleStartTag(str2, attributes);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141085a7b5d0bd7bc4ae789a6b430b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141085a7b5d0bd7bc4ae789a6b430b8e");
        } else {
            handleEndTag(str2);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        char charAt;
        Object[] objArr = {cArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "773273b66642bb380110811bf71b6bbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "773273b66642bb380110811bf71b6bbc");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3 + i];
            if (c == ' ' || c == '\n') {
                int length = sb.length();
                if (length == 0) {
                    int length2 = this.spannableStringBuilder.length();
                    charAt = length2 == 0 ? '\n' : this.spannableStringBuilder.charAt(length2 - 1);
                } else {
                    charAt = sb.charAt(length - 1);
                }
                if (charAt != ' ' && charAt != '\n') {
                    sb.append(Constants.SPACE);
                }
            } else {
                sb.append(c);
            }
        }
        this.spannableStringBuilder.append((CharSequence) sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Bold {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Bold() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Italic {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Italic() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Underline {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Underline() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Strikethrough {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Strikethrough() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Big {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Big() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Small {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Small() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Monospace {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Monospace() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Blockquote {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Blockquote() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Super {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Super() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Sub {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Sub() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Bullet {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Bullet() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Font {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String face;

        public Font(String str) {
            this.face = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Size {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int size;

        public Size(int i) {
            this.size = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Href {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String href;

        public Href(String str) {
            this.href = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Foreground {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int foregroundColor;

        public Foreground(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63762a5ff4b98374c20188879b22dd29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63762a5ff4b98374c20188879b22dd29");
            } else {
                this.foregroundColor = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Background {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int backgroundColor;

        public Background(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcd91aadd9044210f77c13a07e17cea8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcd91aadd9044210f77c13a07e17cea8");
            } else {
                this.backgroundColor = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Heading {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int level;

        public Heading(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "955bda5bf01ddc01cf2d8bab43e08697", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "955bda5bf01ddc01cf2d8bab43e08697");
            } else {
                this.level = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Newline {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int numNewlines;

        public Newline(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9755a7a1d1618c30265ecb3b31b9a25d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9755a7a1d1618c30265ecb3b31b9a25d");
            } else {
                this.numNewlines = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Alignment {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Layout.Alignment alignment;

        public Alignment(Layout.Alignment alignment) {
            Object[] objArr = {alignment};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71daba53573208fd0a3604a8f4fe47a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71daba53573208fd0a3604a8f4fe47a3");
            } else {
                this.alignment = alignment;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class VerticalAlign {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int baselineShift;

        public VerticalAlign(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a66b190edae25d76bf70fbc04492f5c3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a66b190edae25d76bf70fbc04492f5c3");
            } else {
                this.baselineShift = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class VerticalAlignSpan extends MetricAffectingSpan {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int baselineShift;

        public VerticalAlignSpan(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "969d0c428519c4fd1f3faa6e8917e1e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "969d0c428519c4fd1f3faa6e8917e1e8");
            } else {
                this.baselineShift = i;
            }
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NonNull TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e0558cd72d235b39c7fc0543d34321c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e0558cd72d235b39c7fc0543d34321c");
            } else {
                textPaint.baselineShift += this.baselineShift;
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48ae07d919601fd257fe7953dfd5d4ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48ae07d919601fd257fe7953dfd5d4ed");
            } else {
                textPaint.baselineShift += this.baselineShift;
            }
        }
    }
}
