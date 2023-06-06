package com.meituan.android.legwork.ui.util;

import android.graphics.Color;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.legwork.utils.h;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.XMLReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Html.TagHandler {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private Map<String, String> d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3789b29d89012aa9c3ab20a9b2555986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3789b29d89012aa9c3ab20a9b2555986");
        } else {
            this.d = new HashMap();
        }
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, editable, xMLReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5de8619b36774ecaa533b02ca5cb45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5de8619b36774ecaa533b02ca5cb45c");
        } else if ("fontx".equalsIgnoreCase(str)) {
            a(xMLReader);
            if (z) {
                this.b = editable.length();
                return;
            }
            Object[] objArr2 = {editable};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66f9b8ccadd01280921b5d9437356011", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66f9b8ccadd01280921b5d9437356011");
                return;
            }
            this.c = editable.length();
            String str2 = this.d.get("color");
            String str3 = this.d.get(GearsLocator.MALL_WEIGHT);
            String str4 = this.d.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE).split("dp")[0];
            if (!TextUtils.isEmpty(str2)) {
                editable.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), this.b, this.c, 33);
            }
            if (!TextUtils.isEmpty(str4)) {
                editable.setSpan(new AbsoluteSizeSpan(h.a(Integer.parseInt(str4))), this.b, this.c, 33);
            }
            if (TextUtils.equals(str3, DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)) {
                editable.setSpan(new StyleSpan(1), this.b, this.c, 33);
            }
        }
    }

    private void a(XMLReader xMLReader) {
        Object[] objArr = {xMLReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d8631f7e8cd2c4ff42b20aed330fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d8631f7e8cd2c4ff42b20aed330fd0");
            return;
        }
        try {
            Field declaredField = xMLReader.getClass().getDeclaredField("theNewElement");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(xMLReader);
            if (declaredField == null) {
                return;
            }
            Field declaredField2 = obj.getClass().getDeclaredField("theAtts");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("data");
            declaredField3.setAccessible(true);
            String[] strArr = (String[]) declaredField3.get(obj2);
            Field declaredField4 = obj2.getClass().getDeclaredField("length");
            declaredField4.setAccessible(true);
            int intValue = ((Integer) declaredField4.get(obj2)).intValue();
            for (int i = 0; i < intValue; i++) {
                int i2 = i * 5;
                this.d.put(strArr[i2 + 1], strArr[i2 + 4]);
            }
        } catch (Exception e) {
            x.a(e);
        }
    }
}
