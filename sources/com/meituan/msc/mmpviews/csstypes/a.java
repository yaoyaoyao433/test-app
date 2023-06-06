package com.meituan.msc.mmpviews.csstypes;

import android.graphics.PointF;
import com.BV.LinearGradient.LinearGradientManager;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends d<c> {
    public static ChangeQuickRedirect a;
    public static final a b = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect g;
    }

    @Override // com.meituan.msc.mmpviews.csstypes.d
    public final /* bridge */ /* synthetic */ c a() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.meituan.msc.mmpviews.csstypes.a$c[], T[]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T[]] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [float[]] */
    /* JADX WARN: Type inference failed for: r8v26, types: [float[]] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static a a(ReadableArray readableArray) {
        float[] fArr;
        c cVar;
        int[] iArr;
        c cVar2;
        c cVar3;
        int i = 1;
        char c2 = 0;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        c cVar4 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1be8fe226f205b9d1e081a815d3c9b4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1be8fe226f205b9d1e081a815d3c9b4b");
        }
        if (readableArray == null) {
            return b;
        }
        a aVar = new a();
        aVar.d = new c[readableArray.size()];
        int i2 = 0;
        while (i2 < ((c[]) aVar.d).length) {
            c[] cVarArr = (c[]) aVar.d;
            Dynamic dynamic = readableArray.getDynamic(i2);
            Object[] objArr2 = new Object[i];
            objArr2[c2] = dynamic;
            ChangeQuickRedirect changeQuickRedirect2 = c.g;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5285db67815bc81532453eb31c2baaa4", RobustBitConfig.DEFAULT_VALUE)) {
                cVar3 = (c) PatchProxy.accessDispatch(objArr2, cVar4, changeQuickRedirect2, i, "5285db67815bc81532453eb31c2baaa4");
            } else if (dynamic.getType() == ReadableType.Map) {
                ReadableMap asMap = dynamic.asMap();
                String string = asMap.getString("type");
                if (string == null) {
                    string = "";
                }
                char c3 = 65535;
                int hashCode = string.hashCode();
                if (hashCode != 116079) {
                    if (hashCode == 1520903384 && string.equals("linear-gradient")) {
                        c3 = 0;
                    }
                } else if (string.equals("url")) {
                    c3 = 1;
                }
                switch (c3) {
                    case 0:
                        Object[] objArr3 = new Object[i];
                        objArr3[c2] = asMap;
                        ChangeQuickRedirect changeQuickRedirect3 = C0447a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "aadee03af9788c856d426330584ee84e", RobustBitConfig.DEFAULT_VALUE)) {
                            cVar3 = (C0447a) PatchProxy.accessDispatch(objArr3, cVar4, changeQuickRedirect3, i, "aadee03af9788c856d426330584ee84e");
                            break;
                        } else {
                            C0447a c0447a = new C0447a();
                            c0447a.b = com.meituan.msc.mmpviews.csstypes.helper.a.a(asMap.getArray("firstPoint"));
                            c0447a.c = com.meituan.msc.mmpviews.csstypes.helper.a.a(asMap.getArray("secondPoint"));
                            ReadableArray array = asMap.getArray("offsets");
                            Object[] objArr4 = new Object[i];
                            objArr4[c2] = array;
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.csstypes.helper.a.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "fddccc167a3bc18dd0a450d4ed89947c", RobustBitConfig.DEFAULT_VALUE)) {
                                fArr = (float[]) PatchProxy.accessDispatch(objArr4, cVar4, changeQuickRedirect4, i, "fddccc167a3bc18dd0a450d4ed89947c");
                            } else if (array == null) {
                                fArr = cVar4;
                            } else {
                                int size = array.size();
                                float[] fArr2 = new float[size];
                                for (int i3 = 0; i3 < size; i3++) {
                                    fArr2[i3] = (float) array.getDouble(i3);
                                }
                                fArr = fArr2;
                            }
                            c0447a.e = fArr;
                            ReadableArray array2 = asMap.getArray(LinearGradientManager.PROP_COLORS);
                            Object[] objArr5 = new Object[i];
                            objArr5[0] = array2;
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.mmpviews.csstypes.helper.a.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "fffbf09c00a06d70279cda14c1d14b54", RobustBitConfig.DEFAULT_VALUE)) {
                                cVar = null;
                                iArr = (int[]) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "fffbf09c00a06d70279cda14c1d14b54");
                            } else {
                                cVar = null;
                                if (array2 == null) {
                                    iArr = null;
                                } else {
                                    int size2 = array2.size();
                                    iArr = new int[size2];
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        iArr[i4] = array2.getInt(i4);
                                    }
                                }
                            }
                            c0447a.f = iArr;
                            if (C0447a.a(c0447a.b) && C0447a.a(c0447a.c)) {
                                c0447a.d = false;
                            } else {
                                c0447a.d = true;
                            }
                            cVar2 = c0447a;
                            continue;
                            cVarArr[i2] = cVar2;
                            i2++;
                            cVar4 = cVar;
                            i = 1;
                            c2 = 0;
                        }
                        break;
                    case 1:
                        Object[] objArr6 = new Object[i];
                        objArr6[c2] = asMap;
                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "4d9e0feca416c9758471009241d19128", RobustBitConfig.DEFAULT_VALUE)) {
                            cVar3 = (b) PatchProxy.accessDispatch(objArr6, cVar4, changeQuickRedirect6, i, "4d9e0feca416c9758471009241d19128");
                            break;
                        } else {
                            cVar = cVar4;
                            cVar2 = new b(asMap.getString("value"));
                            break;
                        }
                    default:
                        cVar = cVar4;
                        cVar2 = cVar;
                        continue;
                        cVarArr[i2] = cVar2;
                        i2++;
                        cVar4 = cVar;
                        i = 1;
                        c2 = 0;
                }
                cVarArr[i2] = cVar2;
                i2++;
                cVar4 = cVar;
                i = 1;
                c2 = 0;
            } else {
                throw new IllegalArgumentException("Wrong type value: " + dynamic);
            }
            cVar = cVar4;
            cVar2 = cVar3;
            cVarArr[i2] = cVar2;
            i2++;
            cVar4 = cVar;
            i = 1;
            c2 = 0;
        }
        return aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends c {
        public static ChangeQuickRedirect a;
        public final String b;

        public b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "addea2e7447e642097d807dee9375a9a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "addea2e7447e642097d807dee9375a9a");
            } else {
                this.b = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.mmpviews.csstypes.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0447a extends c {
        public static ChangeQuickRedirect a;
        public PointF b;
        public PointF c;
        public boolean d;
        public float[] e;
        public int[] f;

        private static boolean a(float f) {
            return ((float) ((int) f)) == f;
        }

        public C0447a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aef5a1abdbcee2c4a863be248550911", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aef5a1abdbcee2c4a863be248550911");
            } else {
                this.d = true;
            }
        }

        static boolean a(PointF pointF) {
            Object[] objArr = {pointF};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf863a1e4bd8af307b16b8494b53f755", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf863a1e4bd8af307b16b8494b53f755")).booleanValue() : a(pointF.x) && a(pointF.y);
        }
    }
}
