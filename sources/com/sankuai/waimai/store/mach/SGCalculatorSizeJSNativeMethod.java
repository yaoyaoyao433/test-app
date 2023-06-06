package com.sankuai.waimai.store.mach;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.annotation.Keep;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGCalculatorSizeJSNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private static final String[] c = {"image", "text", "text_expand_state"};
    protected Context b;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmsmcalculatorSize";
    }

    public static /* synthetic */ void a(SGCalculatorSizeJSNativeMethod sGCalculatorSizeJSNativeMethod, com.sankuai.waimai.mach.jsv8.a aVar, String str, int i, Object obj) {
        Object[] objArr = {aVar, str, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGCalculatorSizeJSNativeMethod, changeQuickRedirect, false, "281a329f72c4912b7788626a957a9e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGCalculatorSizeJSNativeMethod, changeQuickRedirect, false, "281a329f72c4912b7788626a957a9e6b");
        } else if (aVar == null || t.a(str)) {
        } else {
            try {
                aVar.a(str, i.a(new ResponseWrapper(i, obj)));
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public SGCalculatorSizeJSNativeMethod(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0890609b3a3721d59308ae25295dcca0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0890609b3a3721d59308ae25295dcca0");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        return c;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, final String str2, final String str3, final com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139882c8109f436fa1d5778970812966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139882c8109f436fa1d5778970812966");
        } else if (t.a(str)) {
        } else {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3556653) {
                if (hashCode != 100313435) {
                    if (hashCode == 1563353214 && str.equals("text_expand_state")) {
                        c2 = 2;
                    }
                } else if (str.equals("image")) {
                    c2 = 0;
                }
            } else if (str.equals("text")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    Object[] objArr2 = {str2, str3, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a244b19bcff6527d9d2b1b7f1c97fe4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a244b19bcff6527d9d2b1b7f1c97fe4");
                        return;
                    } else {
                        al.b(new Runnable() { // from class: com.sankuai.waimai.store.mach.SGCalculatorSizeJSNativeMethod.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d56abd2f64025d86487fbfbdd0fa029", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d56abd2f64025d86487fbfbdd0fa029");
                                    return;
                                }
                                try {
                                    b.C0608b a2 = m.a(new JSONObject(str2).optString("url"));
                                    a2.g = false;
                                    a2.a(new b.a() { // from class: com.sankuai.waimai.store.mach.SGCalculatorSizeJSNativeMethod.2.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                        public final void a(Bitmap bitmap) {
                                            Object[] objArr4 = {bitmap};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1c5e277aad1b75aee5b12da5cb7d76f1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1c5e277aad1b75aee5b12da5cb7d76f1");
                                            } else if (bitmap != null && !bitmap.isRecycled()) {
                                                SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, 0, new a(bitmap.getWidth(), bitmap.getHeight()));
                                            } else {
                                                SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, -1, null);
                                            }
                                        }

                                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                        public final void a() {
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "55c91be7ce37788ff1b74f288beca736", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "55c91be7ce37788ff1b74f288beca736");
                                            } else {
                                                SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, -1, null);
                                            }
                                        }
                                    });
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.base.log.a.a(e);
                                    SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, -1, null);
                                }
                            }
                        }, getClass().getSimpleName());
                        return;
                    }
                case 1:
                    Object[] objArr3 = {str2, str3, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cadb22792b780fdef63805f54a1ec680", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cadb22792b780fdef63805f54a1ec680");
                        return;
                    } else if (t.a(str2)) {
                        return;
                    } else {
                        al.b(new Runnable() { // from class: com.sankuai.waimai.store.mach.SGCalculatorSizeJSNativeMethod.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "66c4a4d5d6f3a591c0ca99c20c1dbfb0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "66c4a4d5d6f3a591c0ca99c20c1dbfb0");
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    String optString = jSONObject.optString("text");
                                    String optString2 = jSONObject.optString("font_family");
                                    boolean optBoolean = jSONObject.optBoolean("isBold");
                                    int optInt = jSONObject.optInt("font_size");
                                    int optInt2 = jSONObject.optInt("maxWidth");
                                    int optInt3 = jSONObject.optInt("line_spacing");
                                    TextPaint textPaint = new TextPaint();
                                    textPaint.setTextSize(h.a(SGCalculatorSizeJSNativeMethod.this.b, optInt));
                                    try {
                                        textPaint.setTypeface(Typeface.create(optString2, optBoolean ? 1 : 0));
                                    } catch (Exception e) {
                                        com.sankuai.waimai.store.base.log.a.a(e);
                                    }
                                    StaticLayout staticLayout = new StaticLayout(optString, textPaint, h.a(SGCalculatorSizeJSNativeMethod.this.b, optInt2), Layout.Alignment.ALIGN_NORMAL, 1.0f, h.a(SGCalculatorSizeJSNativeMethod.this.b, optInt3), false);
                                    Rect rect = new Rect();
                                    textPaint.getTextBounds(optString, 0, optString.length(), rect);
                                    int lineCount = staticLayout.getLineCount();
                                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                                    SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, 0, new b(Math.min(optInt2, h.b(SGCalculatorSizeJSNativeMethod.this.b, rect.width())), h.b(SGCalculatorSizeJSNativeMethod.this.b, fontMetrics.bottom - fontMetrics.top) * lineCount, lineCount));
                                } catch (Exception e2) {
                                    com.sankuai.waimai.store.base.log.a.a(e2);
                                    SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, -1, null);
                                }
                            }
                        }, getClass().getSimpleName());
                        return;
                    }
                case 2:
                    Object[] objArr4 = {str2, str3, aVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c9be140af8838ac0b1d1abb2471a769", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c9be140af8838ac0b1d1abb2471a769");
                        return;
                    } else {
                        al.b(new Runnable() { // from class: com.sankuai.waimai.store.mach.SGCalculatorSizeJSNativeMethod.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str4;
                                Exception e;
                                JSONObject jSONObject;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a0402d019877cbb9f832507a6d480a43", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a0402d019877cbb9f832507a6d480a43");
                                    return;
                                }
                                try {
                                    jSONObject = new JSONObject(str2);
                                    str4 = jSONObject.optString("text");
                                } catch (Exception e2) {
                                    str4 = "";
                                    e = e2;
                                }
                                try {
                                    String optString = jSONObject.optString("font_family");
                                    boolean optBoolean = jSONObject.optBoolean("isBold");
                                    int optInt = jSONObject.optInt("maxWidth");
                                    int optInt2 = jSONObject.optInt("font_size");
                                    int optInt3 = jSONObject.optInt("line_spacing");
                                    int optInt4 = jSONObject.optInt("expand_threshold");
                                    int optInt5 = jSONObject.optInt("expand_width");
                                    if (optInt4 <= 0 || optInt <= 0) {
                                        throw new IllegalArgumentException("error input params");
                                    }
                                    TextPaint textPaint = new TextPaint();
                                    textPaint.setTextSize(h.a(SGCalculatorSizeJSNativeMethod.this.b, optInt2));
                                    textPaint.setTypeface(Typeface.create(optString, optBoolean ? 1 : 0));
                                    int a2 = com.sankuai.waimai.mach.utils.i.a(optInt);
                                    int a3 = h.a(SGCalculatorSizeJSNativeMethod.this.b, optInt3);
                                    int a4 = com.sankuai.waimai.mach.utils.i.a(optInt5);
                                    StaticLayout staticLayout = new StaticLayout(str4, textPaint, a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, a3, false);
                                    if (staticLayout.getLineCount() > optInt4) {
                                        int i = optInt4 - 1;
                                        int lineEnd = staticLayout.getLineEnd(i);
                                        int lineStart = staticLayout.getLineStart(i);
                                        float lineWidth = staticLayout.getLineWidth(i);
                                        int i2 = (int) (lineWidth - a4);
                                        String str5 = "...  " + str4.substring(lineStart, lineEnd);
                                        int i3 = Integer.MAX_VALUE;
                                        int length = str5.length() - 1;
                                        while (length > 0 && i3 > i2) {
                                            length--;
                                            str5 = str5.substring(0, length);
                                            i3 = (int) textPaint.measureText(str5);
                                        }
                                        SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, 0, new c(true, str4.substring(0, lineStart + (length - 5)) + "...  ", str4));
                                        return;
                                    }
                                    SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, 0, new c(false, "", str4));
                                } catch (Exception e3) {
                                    e = e3;
                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                    SGCalculatorSizeJSNativeMethod.a(SGCalculatorSizeJSNativeMethod.this, aVar, str3, 0, new c(false, "", str4));
                                }
                            }
                        }, getClass().getSimpleName());
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ResponseWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("data")
        public final Object data;
        @SerializedName("status")
        public final int status;

        public ResponseWrapper(int i, Object obj) {
            this.status = i;
            this.data = obj;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        @SerializedName("width")
        public final int a;
        @SerializedName("height")
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b {
        @SerializedName("width")
        public final int a;
        @SerializedName("height")
        public final int b;
        @SerializedName("number_of_lines")
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c {
        @SerializedName("is_expandable")
        public final boolean a;
        @SerializedName("fold_text")
        public final String b;
        @SerializedName("expand_text")
        public final String c;

        public c(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }
    }
}
