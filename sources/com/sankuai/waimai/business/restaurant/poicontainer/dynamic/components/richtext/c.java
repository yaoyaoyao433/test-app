package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.richtext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import java.io.PrintStream;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a<TextView> {
    public static ChangeQuickRedirect i;
    private static Map<String, TextUtils.TruncateAt> j = new TreeMap();
    private static Map<String, Integer> k;

    static {
        TreeMap treeMap = new TreeMap();
        k = treeMap;
        treeMap.put("left", 3);
        k.put("right", 5);
        k.put("top", 48);
        k.put("bottom", 80);
        k.put("center_horizontal", 1);
        k.put("center_vertical", 16);
        j.put(PicassoBounceOnTouchListener.HEAD_BOUNCE, TextUtils.TruncateAt.START);
        j.put("middle", TextUtils.TruncateAt.MIDDLE);
        j.put("tail", TextUtils.TruncateAt.END);
        j.put("clip", null);
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4de3646d199748efc400b0838419f29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4de3646d199748efc400b0838419f29");
        } else {
            this.b = new TextView(this.c);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c12329876bf8df3674b858854da77c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c12329876bf8df3674b858854da77c8");
            return;
        }
        super.a(jSONObject);
        if (jSONObject == null || this.b == 0) {
            return;
        }
        if (jSONObject.has(NumberOfLines.LOWER_CASE_NAME)) {
            ((TextView) this.b).setMaxLines(jSONObject.optInt(NumberOfLines.LOWER_CASE_NAME, Integer.MAX_VALUE));
            if (((TextView) this.b).getMaxLines() == 1) {
                ((TextView) this.b).setSingleLine(true);
                ((TextView) this.b).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if (jSONObject.has("ellipsize")) {
            ((TextView) this.b).setEllipsize(j.get(jSONObject.optString("ellipsize", "tail")));
        }
        if (jSONObject.has(TextAlign.LOWER_CASE_NAME)) {
            ((TextView) this.b).setGravity(k.get(jSONObject.optString(TextAlign.LOWER_CASE_NAME, "center")).intValue());
        }
        if (jSONObject.has(TextAlign.LOWER_CASE_NAME)) {
            ((TextView) this.b).setGravity(k.get(jSONObject.optString(TextAlign.LOWER_CASE_NAME, "center")).intValue());
        }
        if (jSONObject.has("text_line_space_extra")) {
            ((TextView) this.b).setLineSpacing(g.a(this.c, (float) jSONObject.optDouble("text_line_space_extra", 0.0d)), 1.0f);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        int i2;
        char c;
        BitmapDrawable bitmapDrawable;
        StyleSpan styleSpan;
        SpannableString spannableString;
        int a;
        int i3 = 1;
        ?? r12 = 0;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3fd628202f08081bc90480907498bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3fd628202f08081bc90480907498bf");
        } else if (jSONObject == null || this.b == 0) {
        } else {
            if (!jSONObject.has("rich_text")) {
                throw new JSONException("rich_text null");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("rich_text");
            if (optJSONArray.length() == 0) {
                a(8);
            }
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i4 = 0;
            while (i4 < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject.has("text")) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("text");
                    Object[] objArr2 = new Object[i3];
                    objArr2[r12] = optJSONObject2;
                    ChangeQuickRedirect changeQuickRedirect2 = i;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a6ec50f830af2df923ca7f987558432", RobustBitConfig.DEFAULT_VALUE)) {
                        spannableString = (SpannableString) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r12, "7a6ec50f830af2df923ca7f987558432");
                    } else {
                        String optString = optJSONObject2.optString("text");
                        if (TextUtils.isEmpty(optString)) {
                            spannableString = null;
                        } else {
                            SpannableString spannableString2 = new SpannableString(optString);
                            int a2 = ColorUtils.a(optJSONObject2.optString("font_color"), this.c.getResources().getColor(R.color.wm_common_text_main));
                            spannableString2.setSpan(new ForegroundColorSpan(a2), r12, spannableString2.length(), 33);
                            spannableString2.setSpan(new AbsoluteSizeSpan((int) optJSONObject2.optDouble("font_size", 12.0d), true), r12, spannableString2.length(), 33);
                            int a3 = g.a(this.c, (float) optJSONObject2.optDouble("margin_left", 0.0d));
                            int a4 = g.a(this.c, (float) optJSONObject2.optDouble("margin_right", 0.0d));
                            if (optJSONObject2.has("background_color")) {
                                if ((this.c.getResources().getConfiguration().uiMode & 48) == 32) {
                                    a = this.c.getResources().getColor(R.color.transparent);
                                } else {
                                    a = ColorUtils.a(optJSONObject2.optString("background_color"), this.c.getResources().getColor(R.color.wm_common_white));
                                }
                                int a5 = g.a(this.c, (float) optJSONObject2.optDouble("radius", 0.0d));
                                if (a5 > 0) {
                                    spannableString2.setSpan(new e(a5, a, a2, a3, a4, g.a(this.c, 1.5f)), r12, spannableString2.length(), 33);
                                } else {
                                    spannableString2.setSpan(new BackgroundColorSpan(a), r12, spannableString2.length(), 33);
                                }
                            }
                            String optString2 = optJSONObject2.optString("font_style", "");
                            if ("normal".equals(optString2)) {
                                styleSpan = new StyleSpan((int) r12);
                            } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(optString2)) {
                                styleSpan = new StyleSpan(1);
                            } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(optString2)) {
                                styleSpan = new StyleSpan(2);
                            } else {
                                styleSpan = new StyleSpan((int) r12);
                            }
                            spannableString2.setSpan(styleSpan, r12, spannableString2.length(), 33);
                            if (optJSONObject2.optBoolean("strike_through", r12)) {
                                spannableString2.setSpan(new StrikethroughSpan(), r12, spannableString2.length(), 33);
                            }
                            spannableString = spannableString2;
                        }
                    }
                    if (!TextUtils.isEmpty(spannableString)) {
                        spannableStringBuilder.append((CharSequence) spannableString);
                    }
                } else {
                    if (optJSONObject.has("image")) {
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("image");
                        Object[] objArr3 = new Object[2];
                        objArr3[r12] = spannableStringBuilder;
                        objArr3[1] = optJSONObject3;
                        ChangeQuickRedirect changeQuickRedirect3 = i;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38568bfbbafefc2e023969f9c347401c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, r12, "38568bfbbafefc2e023969f9c347401c");
                        } else {
                            spannableStringBuilder.append((CharSequence) StringUtil.SPACE);
                            final String optString3 = optJSONObject3.optString("url");
                            final int a6 = g.a(this.c, (float) optJSONObject3.optDouble("width", 12.0d));
                            final int a7 = g.a(this.c, (float) optJSONObject3.optDouble("height", 12.0d));
                            final int length = spannableStringBuilder.length();
                            jSONArray = optJSONArray;
                            final int a8 = g.a(this.c, (float) optJSONObject3.optDouble("margin_left", 0.0d));
                            final int a9 = g.a(this.c, (float) optJSONObject3.optDouble("margin_right", 0.0d));
                            d a10 = d.a();
                            Object[] objArr4 = {optString3};
                            ChangeQuickRedirect changeQuickRedirect4 = d.a;
                            if (PatchProxy.isSupport(objArr4, a10, changeQuickRedirect4, false, "57dd5da83c07e875f771f2454a71305d", RobustBitConfig.DEFAULT_VALUE)) {
                                c = 0;
                                bitmapDrawable = (BitmapDrawable) PatchProxy.accessDispatch(objArr4, a10, changeQuickRedirect4, false, "57dd5da83c07e875f771f2454a71305d");
                            } else {
                                c = 0;
                                bitmapDrawable = a10.b.get(optString3);
                            }
                            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                            if (bitmapDrawable2 != null) {
                                Object[] objArr5 = new Object[3];
                                objArr5[c] = bitmapDrawable2;
                                objArr5[1] = Integer.valueOf(a6);
                                objArr5[2] = Integer.valueOf(a7);
                                ChangeQuickRedirect changeQuickRedirect5 = i;
                                i2 = i4;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a9be4844b22f3eaad6d0a098d08b7911", RobustBitConfig.DEFAULT_VALUE)) {
                                    Drawable drawable = (Drawable) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a9be4844b22f3eaad6d0a098d08b7911");
                                } else if (bitmapDrawable2.getBitmap().getWidth() != a6) {
                                    new BitmapDrawable(this.c.getResources(), b.a(bitmapDrawable2.getBitmap(), a6, a7));
                                }
                                spannableStringBuilder.setSpan(new a(bitmapDrawable2, 2, a8, a9), length - 1, length, 33);
                                ((TextView) this.b).setText(spannableStringBuilder);
                            } else {
                                i2 = i4;
                                b.C0608b a11 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                a11.b = this.c;
                                a11.c = optString3;
                                a11.f = ImageQualityUtil.b();
                                a11.b(g.a(this.c, a6)).a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.richtext.c.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                    public final void a(Bitmap bitmap) {
                                        Object[] objArr6 = {bitmap};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a6675b307e3e56db3452b29807a0546c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a6675b307e3e56db3452b29807a0546c");
                                            return;
                                        }
                                        BitmapDrawable bitmapDrawable3 = new BitmapDrawable(c.this.c.getResources(), b.a(bitmap, a6, a7));
                                        bitmapDrawable3.setBounds(0, 0, bitmapDrawable3.getIntrinsicWidth(), bitmapDrawable3.getIntrinsicHeight());
                                        a aVar = new a(bitmapDrawable3, 2, a8, a9);
                                        d a12 = d.a();
                                        String str = optString3;
                                        Object[] objArr7 = {str, bitmapDrawable3};
                                        ChangeQuickRedirect changeQuickRedirect7 = d.a;
                                        if (PatchProxy.isSupport(objArr7, a12, changeQuickRedirect7, false, "bc4ac2d60dfd697b5ebf3ff7520571a4", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, a12, changeQuickRedirect7, false, "bc4ac2d60dfd697b5ebf3ff7520571a4");
                                        } else {
                                            a12.b.put(str, bitmapDrawable3);
                                        }
                                        spannableStringBuilder.setSpan(aVar, length - 1, length, 33);
                                        ((TextView) c.this.b).setText(spannableStringBuilder);
                                    }

                                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                    public final void a() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "51c2e7234432528f3b96739483522c2f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "51c2e7234432528f3b96739483522c2f");
                                            return;
                                        }
                                        PrintStream printStream = System.out;
                                        printStream.println("pic load fail: " + optString3);
                                    }
                                });
                            }
                        }
                    } else {
                        jSONArray = optJSONArray;
                        i2 = i4;
                        System.out.println("warning：数据解析失败");
                    }
                    i4 = i2 + 1;
                    optJSONArray = jSONArray;
                    i3 = 1;
                    r12 = 0;
                }
                jSONArray = optJSONArray;
                i2 = i4;
                i4 = i2 + 1;
                optJSONArray = jSONArray;
                i3 = 1;
                r12 = 0;
            }
            ((TextView) this.b).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            super.b(jSONObject);
        }
    }
}
