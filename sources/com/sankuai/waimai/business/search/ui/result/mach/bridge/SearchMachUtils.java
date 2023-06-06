package com.sankuai.waimai.business.search.ui.result.mach.bridge;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.jsv8.a;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchMachUtils implements IBuildMachNativeMethod {
    private static String METHOD_TEXT_WIDTH = "getTextWidth";
    private static String TEXT_STYLE_BOLD = "bold";
    private static String TEXT_STYLE_MEDIUM = "medium";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod
    public JSInvokeNativeMethod getMachHttpMethod(final Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b13b6ce55bddd8e7cf682a4fcc2626c", RobustBitConfig.DEFAULT_VALUE) ? (JSInvokeNativeMethod) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b13b6ce55bddd8e7cf682a4fcc2626c") : new JSInvokeNativeMethod() { // from class: com.sankuai.waimai.business.search.ui.result.mach.bridge.SearchMachUtils.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
            public final String module() {
                return "SearchMachUtils";
            }

            @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
            public final String[] methods() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85b86a02b4d85b0679897f4e2edd3ca3", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85b86a02b4d85b0679897f4e2edd3ca3") : new String[]{SearchMachUtils.METHOD_TEXT_WIDTH};
            }

            @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
            public final void invoke(String str2, String str3, String str4, a aVar) {
                Object[] objArr2 = {str2, str3, str4, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a49e65c349cf03a8dc1aa18443d39672", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a49e65c349cf03a8dc1aa18443d39672");
                } else if (!f.a(activity) && SearchMachUtils.METHOD_TEXT_WIDTH.equals(str2)) {
                    TextStyle textStyle = (TextStyle) b.a().fromJson(str3, (Class<Object>) TextStyle.class);
                    if (textStyle.size > 0 && !TextUtils.isEmpty(textStyle.weight) && !TextUtils.isEmpty(textStyle.content)) {
                        boolean z = (TextUtils.equals(textStyle.weight, SearchMachUtils.TEXT_STYLE_BOLD) || TextUtils.equals(textStyle.weight, SearchMachUtils.TEXT_STYLE_MEDIUM)) ? false : true;
                        Paint paint = new Paint();
                        paint.setTextSize(TypedValue.applyDimension(2, textStyle.size, activity.getResources().getDisplayMetrics()));
                        paint.setTypeface(z ? Typeface.defaultFromStyle(0) : Typeface.defaultFromStyle(1));
                        aVar.a(str4, b.a().toJson(new TextWidth(g.c(activity, paint.measureText(textStyle.content)))));
                        return;
                    }
                    aVar.a(str4, b.a().toJson(new TextWidth(0)));
                }
            }
        };
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    class TextStyle {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String content;
        public int size;
        public String weight;

        public TextStyle() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    class TextWidth {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int width;

        public TextWidth(int i) {
            this.width = i;
        }
    }
}
