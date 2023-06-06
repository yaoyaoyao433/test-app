package com.meituan.android.ptcommonim.base.mach.bridge;

import android.graphics.Typeface;
import android.support.annotation.Keep;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.mach.jsv8.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTTextJsNativeMethodImpl {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, String str3, a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9b5a45f84603108d4d7d7cf8b746c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9b5a45f84603108d4d7d7cf8b746c1e");
            return;
        }
        JSONObject jSONObject = JsonHelper.toJSONObject(str2);
        String string = JsonHelper.getString(jSONObject, "text");
        if (TextUtils.isEmpty(string)) {
            a(aVar, str3, -1, new TextData("text can't null"));
            return;
        }
        String string2 = JsonHelper.getString(jSONObject, "fontFamily");
        boolean z = JsonHelper.getBoolean(jSONObject, "isBold", false);
        int i = JsonHelper.getInt(jSONObject, "maxWidth", com.meituan.android.ptcommonim.base.util.a.a(com.meituan.android.ptcommonim.base.util.a.a()));
        float f = JsonHelper.getFloat(jSONObject, "paddingLeft", 0.0f);
        float f2 = JsonHelper.getFloat(jSONObject, "paddingRight", 0.0f);
        int i2 = JsonHelper.getInt(jSONObject, "fontSize", 12);
        int i3 = JsonHelper.getInt(jSONObject, "lineSpacing", 0);
        float f3 = (i - f) - f2;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(com.meituan.android.ptcommonim.base.util.a.a(i2));
        textPaint.setTypeface(Typeface.create(string2, z ? 1 : 0));
        StaticLayout staticLayout = new StaticLayout(string, textPaint, com.meituan.android.ptcommonim.base.util.a.a((int) f3), Layout.Alignment.ALIGN_NORMAL, 1.0f, com.meituan.android.ptcommonim.base.util.a.a(i3), false);
        int lineCount = staticLayout.getLineCount();
        a(aVar, str3, 0, new TextData(lineCount > 0 ? com.meituan.android.ptcommonim.base.util.a.a(staticLayout.getLineWidth(lineCount - 1)) : 0.0f, lineCount));
    }

    private static void a(a aVar, String str, int i, TextData textData) {
        Object[] objArr = {aVar, str, Integer.valueOf(i), textData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9c8e6db215eccd4ab89bb1c982010b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9c8e6db215eccd4ab89bb1c982010b4");
        } else if (aVar == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                aVar.a(str, JsonHelper.toJsonString(new ResponseWrapper(i, textData)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class ResponseWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TextData data;
        public int status;

        public ResponseWrapper(int i, TextData textData) {
            this.status = i;
            this.data = textData;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class TextData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public float lastLineWidth;
        public int lineCount;
        public String message;

        public TextData(float f, int i) {
            this.lastLineWidth = f;
            this.lineCount = i;
        }

        public TextData(String str) {
            this.message = str;
        }
    }
}
