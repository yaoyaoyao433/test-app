package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.TextView;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.q;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends a<TextView> {
    public static ChangeQuickRedirect i;
    private static Map<String, Integer> l = new TreeMap();
    private static Map<String, TextUtils.TruncateAt> m = new TreeMap();
    private static Map<String, Integer> n = new TreeMap();
    @ColorInt
    private int j;
    @ColorInt
    private int k;

    static {
        l.put("left", 3);
        l.put("right", 5);
        l.put("top", 48);
        l.put("bottom", 80);
        l.put("center", 17);
        l.put("center_horizontal", 1);
        l.put("center_vertical", 16);
        m.put(PicassoBounceOnTouchListener.HEAD_BOUNCE, TextUtils.TruncateAt.START);
        m.put("middle", TextUtils.TruncateAt.MIDDLE);
        m.put("tail", TextUtils.TruncateAt.END);
        m.put("clip", null);
        n.put("normal", 0);
        n.put(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD, 1);
        n.put(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC, 2);
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690eef686a613ed3f54d5a4de96a73c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690eef686a613ed3f54d5a4de96a73c3");
        } else {
            this.b = new TextView(this.c);
        }
    }

    public g(Context context, TextView textView) {
        super(context);
        Object[] objArr = {context, textView};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f62aaf1ab3053aad1d583ef9813043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f62aaf1ab3053aad1d583ef9813043");
        } else {
            this.b = textView;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51757ad922ed90cc70d2ba46fbf945b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51757ad922ed90cc70d2ba46fbf945b4");
            return;
        }
        super.a(jSONObject);
        if (jSONObject == null) {
            return;
        }
        ((TextView) this.b).setTextSize((float) jSONObject.optDouble("font_size", 12.0d));
        this.k = ColorUtils.a(jSONObject.optString("font_color", DiagnoseLog.COLOR_ERROR), this.c.getResources().getColor(R.color.wm_common_text_main));
        this.j = ColorUtils.a(jSONObject.optString("highlight_color", ""), this.k);
        ((TextView) this.b).setMaxLines(jSONObject.optInt(NumberOfLines.LOWER_CASE_NAME, Integer.MAX_VALUE));
        if ("AvenirLTPro-Medium".equals(jSONObject.optString("font_family", ""))) {
            new q().a((TextView) this.b);
        }
        ((TextView) this.b).setGravity(l.get(jSONObject.optString(TextAlign.LOWER_CASE_NAME, "center")).intValue());
        ((TextView) this.b).setEllipsize(m.get(jSONObject.optString("ellipsize", "tail")));
        ((TextView) this.b).setMaxWidth(com.sankuai.waimai.foundation.utils.g.a(this.c, jSONObject.optInt("max_width", Integer.MAX_VALUE)));
        ((TextView) this.b).setLineSpacing((float) jSONObject.optDouble("text_line_space_extra", 0.0d), 1.0f);
        String optString = jSONObject.optString("font_style", "normal");
        if ("strike".equals(optString)) {
            ((TextView) this.b).getPaint().setFlags(17);
        } else {
            ((TextView) this.b).setTypeface(Typeface.defaultFromStyle(n.get(optString).intValue()));
        }
        jSONObject.optString("style");
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572772faf1d0e9e296be5eff1950e665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572772faf1d0e9e296be5eff1950e665");
            return;
        }
        super.b(jSONObject);
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("text", "");
                boolean optBoolean = jSONObject.optBoolean(DMKeys.KEY_SELECTED, false);
                if (TextUtils.isEmpty(optString)) {
                    a(8);
                    return;
                }
                a(0);
                ((TextView) this.b).setText(optString);
                if (optBoolean) {
                    ((TextView) this.b).setTextColor(this.j);
                    return;
                } else {
                    ((TextView) this.b).setTextColor(this.k);
                    return;
                }
            } catch (Exception e) {
                throw new RuntimeException("TextComponent data parse wrong", e);
            }
        }
        a(8);
    }
}
