package com.sankuai.common.utils;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HtmlDecorator {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    private static final int TO_HTML_PARAGRAPH_FLAG = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface FontSizeGetter {
        int getFontSize(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ConverterBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private FontSizeGetter fontSizeGetter;
        private Html.ImageGetter imageGetter;
        private Html.TagHandler tagHandler;

        public ConverterBuilder setFontSizeGetter(FontSizeGetter fontSizeGetter) {
            this.fontSizeGetter = fontSizeGetter;
            return this;
        }

        public ConverterBuilder setImageGetter(Html.ImageGetter imageGetter) {
            this.imageGetter = imageGetter;
            return this;
        }

        public ConverterBuilder setTagHandler(Html.TagHandler tagHandler) {
            this.tagHandler = tagHandler;
            return this;
        }
    }

    @Deprecated
    public static Spanned fromHtml(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "058fdbb6eca35b20d98d0038108a0495", RobustBitConfig.DEFAULT_VALUE) ? (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "058fdbb6eca35b20d98d0038108a0495") : fromHtml(str, 0, null);
    }

    public static Spanned fromHtml(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cf50b5f7e7862eb866ef69d58878c4c", RobustBitConfig.DEFAULT_VALUE) ? (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cf50b5f7e7862eb866ef69d58878c4c") : fromHtml(str, i, null);
    }

    @Deprecated
    public static Spanned fromHtml(String str, ConverterBuilder converterBuilder) {
        Object[] objArr = {str, converterBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ff40679be02c27d9c96b17be640459f", RobustBitConfig.DEFAULT_VALUE) ? (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ff40679be02c27d9c96b17be640459f") : fromHtml(str, 0, converterBuilder);
    }

    public static Spanned fromHtml(String str, int i, ConverterBuilder converterBuilder) {
        HtmlToSpannedConverter htmlToSpannedConverter;
        Object[] objArr = {str, Integer.valueOf(i), converterBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb6478a0abb83a71b73f1b16f360c921", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb6478a0abb83a71b73f1b16f360c921");
        }
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            if (converterBuilder == null) {
                htmlToSpannedConverter = new HtmlToSpannedConverter(str, null, null, null, xMLReader, i);
            } else {
                htmlToSpannedConverter = new HtmlToSpannedConverter(str, converterBuilder.fontSizeGetter, converterBuilder.imageGetter, converterBuilder.tagHandler, xMLReader, i);
            }
            return htmlToSpannedConverter.convert();
        } catch (ParserConfigurationException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public static String toHtml(Spanned spanned) {
        Object[] objArr = {spanned};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a80b1f61a35aadb522c70d90dafe95f4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a80b1f61a35aadb522c70d90dafe95f4") : Html.toHtml(spanned);
    }

    public static String toHtml(Spanned spanned, int i) {
        Object[] objArr = {spanned, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44216fac56533f3b033d6219d01f514f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44216fac56533f3b033d6219d01f514f");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.toHtml(spanned, i);
        }
        return Html.toHtml(spanned);
    }
}
