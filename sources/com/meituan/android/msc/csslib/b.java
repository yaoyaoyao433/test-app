package com.meituan.android.msc.csslib;

import android.support.v4.view.MotionEventCompat;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.EllipsizeMode;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static a[] c = a.valuesCustom();
    public int b;
    private Map<Integer, JSONObject> d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        ReactTag(0, "id", 1),
        BorderTopStyle(1, "borderTopStyle", 3),
        BorderLeftStyle(2, "borderLeftStyle", 3),
        BorderBottomStyle(3, "borderBottomStyle", 3),
        BorderRightStyle(4, "borderRightStyle", 3),
        BorderTopWidth(5, "borderTopWidth", 2),
        BorderLeftWidth(6, BorderLeftWidth.LOWER_CASE_NAME, 2),
        BorderBottomWidth(7, BorderBottomWidth.LOWER_CASE_NAME, 2),
        BorderRightWidth(8, BorderRightWidth.LOWER_CASE_NAME, 2),
        BorderTopColor(9, BorderTopColor.LOWER_CASE_NAME, 1),
        BorderLeftColor(10, BorderLeftColor.LOWER_CASE_NAME, 1),
        BorderBottomColor(11, BorderBottomColor.LOWER_CASE_NAME, 1),
        BorderRightColor(12, BorderRightColor.LOWER_CASE_NAME, 1),
        OverflowX(13, "overflowX", 255),
        OverflowY(14, "overflowY", 255),
        Color(15, "color", 1),
        BackgroundColor(16, "backgroundColor", 1),
        BoxShadow(17, "boxShadow", 255),
        BackgroundImage(18, DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE, 255),
        BackgroundSize(19, "backgroundSize", 255),
        BackgroundRepeat(20, "backgroundRepeat", 255),
        Opacity(21, "opacity", 255),
        FontSize(22, "fontSize", 255),
        FontFamily(23, "fontFamily", 255),
        FontStyle(24, "fontStyle", 255),
        FontWeight(25, FontWeight.LOWER_CASE_NAME, 255),
        TextAlign(26, TextAlign.LOWER_CASE_NAME, 255),
        VerticalAlign(27, "verticalAlign", 255),
        NumberOfLines(28, NumberOfLines.LOWER_CASE_NAME, 255),
        EllipsizeMode(29, EllipsizeMode.LOWER_CASE_NAME, 255),
        TextDecorationLine(30, "textDecorationLine", 255),
        LetterSpacing(31, LetterSpacing.LOWER_CASE_NAME, 255),
        WordSpacing(32, "wordSpacing", 255),
        TextOverflow(33, "textOverflow", 255),
        WhiteSpace(34, "whiteSpace", 255),
        WordBreak(35, "wordBreak", 255),
        LineHeight(36, LineHeight.LOWER_CASE_NAME, 255),
        PointerEvents(37, "pointerEvents", 255),
        BackdropFilter(38, "backdropFilter", 255),
        BorderTopLeftRadius(39, BorderTopLeftRadius.LOWER_CASE_NAME, 2),
        BorderBottomLeftRadius(40, BorderBottomLeftRadius.LOWER_CASE_NAME, 2),
        BorderTopRightRadius(41, BorderTopRightRadius.LOWER_CASE_NAME, 2),
        BorderBottomRightRadius(42, BorderBottomRightRadius.LOWER_CASE_NAME, 2),
        Overflow(43, "overflow", 3);
        
        public static ChangeQuickRedirect a;
        String T;
        private int U;
        private int V;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d93f250f9a93cb4f1d57ce60abb21ad", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d93f250f9a93cb4f1d57ce60abb21ad") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d29d3fd447b4464b7091cfaaf38bc34", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d29d3fd447b4464b7091cfaaf38bc34") : (a[]) values().clone();
        }

        a(int i, String str, int i2) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df80e77fbf15321f3c941c487b2ca12", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df80e77fbf15321f3c941c487b2ca12");
                return;
            }
            this.U = i;
            this.T = str;
            this.V = i2;
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8345ebf5ebc97672af0b934681c8c754", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8345ebf5ebc97672af0b934681c8c754")).intValue() : this.d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.msc.csslib.b.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7087287b05128a917b4dbbd8de6aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7087287b05128a917b4dbbd8de6aa2");
        }
        return "RenderStyleWrapper{stylesForJSONArray=" + this.d + '}';
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d750cfcf1d4810fefcd2d370ff661916", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d750cfcf1d4810fefcd2d370ff661916")).intValue() : Objects.hash(this.d);
    }

    public final Set<Map.Entry<Integer, JSONObject>> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3b035a4ee40a6ef05df267d05701f0", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3b035a4ee40a6ef05df267d05701f0") : this.d.entrySet();
    }

    public b(byte[] bArr) {
        int a2;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bce8cdce2cef247f8a0fa832da8d0bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bce8cdce2cef247f8a0fa832da8d0bc");
            return;
        }
        this.d = new HashMap();
        this.b = 2;
        int[] iArr = {0};
        while (iArr[0] < bArr.length) {
            Object[] objArr2 = {bArr, iArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a7fcca91e531865efb30a8b546e3933", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a7fcca91e531865efb30a8b546e3933")).intValue();
            } else {
                int i = iArr[0];
                if (c[a(i, bArr)] != a.ReactTag) {
                    throw new RuntimeException("is not Id");
                }
                a2 = a(i + 8, bArr);
                iArr[0] = iArr[0] + 12;
            }
            JSONObject a3 = a(bArr, iArr);
            if (a3.length() != 0) {
                this.d.put(Integer.valueOf(a2), a3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    private JSONObject a(byte[] bArr, int[] iArr) {
        a aVar;
        Float f;
        int i;
        Object[] objArr = {bArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8925dfd70cdbebab257dc81c1bcfe269", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8925dfd70cdbebab257dc81c1bcfe269");
        }
        JSONObject jSONObject = new JSONObject();
        int i2 = iArr[0];
        int i3 = 0;
        while (i2 < bArr.length && (aVar = c[a(i2, bArr)]) != a.ReactTag) {
            int i4 = i2 + 4;
            int a2 = a(i4, bArr);
            int i5 = i4 + 4;
            String str = null;
            switch (a2) {
                case 0:
                    i3 = 1;
                    str = Boolean.valueOf(bArr[i5] == 1);
                    break;
                case 1:
                    f = Integer.valueOf(a(i5, bArr));
                    i3 = 4;
                    str = f;
                    break;
                case 2:
                    Object[] objArr2 = {Integer.valueOf(i5), bArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    f = Float.valueOf(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "059561e12ac22c0e2b3328b447016a68", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "059561e12ac22c0e2b3328b447016a68")).floatValue() : Float.intBitsToFloat((bArr[i5] & 255) | 0 | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24)));
                    i3 = 4;
                    str = f;
                    break;
                case 3:
                case 4:
                case 5:
                    i3 = a(i5, bArr);
                    ?? r9 = i5 + 4;
                    String str2 = i3 == 0 ? "" : new String(bArr, (int) r9, i3);
                    if (a2 == 4) {
                        try {
                            r9 = new JSONObject(str2);
                            i5 = r9;
                            str = r9;
                            break;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            i = r9;
                        }
                    } else {
                        i = r9;
                        if (a2 == 5) {
                            str2 = new JSONArray(str2);
                            i = r9;
                        }
                    }
                    i5 = i;
                    str = str2;
                    break;
            }
            int i6 = i5 + i3;
            iArr[0] = i6;
            try {
                jSONObject.put(aVar.T, str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i2 = i6;
        }
        return jSONObject;
    }

    private static int a(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60b93f3af9f51b9e8493d7008e84df06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60b93f3af9f51b9e8493d7008e84df06")).intValue();
        }
        if (bArr.length >= i + 4) {
            return ((bArr[i + 3] << 24) & (-16777216)) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[i + 2] << 16) & 16711680);
        }
        throw new IllegalStateException("input type length less than required!");
    }
}
