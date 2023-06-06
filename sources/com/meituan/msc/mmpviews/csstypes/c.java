package com.meituan.msc.mmpviews.csstypes;

import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.mmpviews.csstypes.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends d<a> {
    public static ChangeQuickRedirect a;
    public static final c b;
    private static final a e;

    static {
        a aVar = new a();
        e = aVar;
        aVar.b(3);
        e.b(6);
        b = new c();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.meituan.msc.mmpviews.csstypes.c$a[], T[]] */
    public static c a(ReadableArray readableArray) {
        a aVar;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "163246ef66f3deafe1000e0d769165c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "163246ef66f3deafe1000e0d769165c0");
        }
        if (readableArray == null) {
            return b;
        }
        c cVar = new c();
        cVar.d = new a[readableArray.size()];
        for (int i = 0; i < ((a[]) cVar.d).length; i++) {
            a[] aVarArr = (a[]) cVar.d;
            Dynamic dynamic = readableArray.getDynamic(i);
            Object[] objArr2 = {dynamic};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0144ff24768994f9d8d2857f1fb04f14", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0144ff24768994f9d8d2857f1fb04f14");
            } else if (dynamic != null && !dynamic.isNull()) {
                ReadableMap asMap = dynamic.asMap();
                String string = asMap.getString("type");
                a aVar2 = new a();
                char c = 65535;
                int hashCode = string.hashCode();
                if (hashCode != -1009389006) {
                    if (hashCode != 94852023) {
                        if (hashCode == 951526612 && string.equals("contain")) {
                            c = 1;
                        }
                    } else if (string.equals(DynamicTitleParser.PARSER_VAL_STRETCH_COVER)) {
                        c = 0;
                    }
                } else if (string.equals("size-length")) {
                    c = 2;
                }
                switch (c) {
                    case 0:
                        aVar2.b(1);
                        break;
                    case 1:
                        aVar2.b(2);
                        break;
                    case 2:
                        ReadableArray array = asMap.getArray(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
                        Dynamic dynamic2 = array.getDynamic(0);
                        Dynamic dynamic3 = array.getDynamic(1);
                        Object[] objArr3 = {aVar2, dynamic2, dynamic3};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "927f091013f87541c1242aee6570917a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "927f091013f87541c1242aee6570917a");
                            break;
                        } else {
                            ReadableType type = dynamic2.getType();
                            if (type == ReadableType.Number) {
                                aVar2.b(5);
                                aVar2.b = new e(e.a.Fixed, (float) dynamic2.asDouble());
                            } else if (type == ReadableType.String) {
                                e a2 = e.a(dynamic2.asString());
                                if (a2.a()) {
                                    aVar2.b(3);
                                } else if (a2.b()) {
                                    aVar2.b(4);
                                    aVar2.b = a2;
                                } else {
                                    aVar2.b(5);
                                    aVar2.b = a2;
                                }
                            } else {
                                throw new IllegalArgumentException("Wrong type value: " + dynamic2);
                            }
                            ReadableType type2 = dynamic3.getType();
                            if (type2 == ReadableType.Number) {
                                aVar2.b(8);
                                aVar2.c = new e(e.a.Fixed, (float) dynamic3.asDouble());
                                break;
                            } else if (type2 == ReadableType.String) {
                                e a3 = e.a(dynamic3.asString());
                                if (a3.a()) {
                                    aVar2.b(6);
                                    break;
                                } else if (a3.b()) {
                                    aVar2.b(7);
                                    aVar2.c = a3;
                                    break;
                                } else {
                                    aVar2.b(8);
                                    aVar2.c = a3;
                                    break;
                                }
                            } else {
                                throw new IllegalArgumentException("Wrong type value: " + dynamic3);
                            }
                        }
                    default:
                        aVar2.b(3);
                        aVar2.b(6);
                        break;
                }
                aVar = aVar2;
            } else {
                aVar = e;
            }
            aVarArr[i] = aVar;
        }
        return cVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msc.mmpviews.csstypes.helper.b {
        public static ChangeQuickRedirect a;
        e b;
        e c;

        public a() {
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59b3ed8eb4aeb0a5f28ccd7367d8050", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59b3ed8eb4aeb0a5f28ccd7367d8050")).booleanValue();
            }
            if (b()) {
                return true;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e49d6b4bb51783b92cdd897adffc7779", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e49d6b4bb51783b92cdd897adffc7779")).booleanValue() : a(4);
        }

        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5041d2d870864021548850fe5f51e131", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5041d2d870864021548850fe5f51e131")).booleanValue() : a(5);
        }

        public final float c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f388d722dc601e40494ce4b18b977a2f", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f388d722dc601e40494ce4b18b977a2f")).floatValue() : this.b.b;
        }

        public final float d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329f8afbcb67d0fa6d075b123b0625f4", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329f8afbcb67d0fa6d075b123b0625f4")).floatValue() : this.b.b;
        }

        public final boolean e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85031c51e76a01a53df703bb3dd080e9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85031c51e76a01a53df703bb3dd080e9")).booleanValue() : a(8);
        }

        public final boolean f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b90431ddf3ce3f34465229f4137d0b4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b90431ddf3ce3f34465229f4137d0b4")).booleanValue();
            }
            if (e()) {
                return true;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c3b8ce9a081257ac8bc3df04db2704d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c3b8ce9a081257ac8bc3df04db2704d")).booleanValue() : a(7);
        }

        public final float g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2388b44e2cd96f3ea835b07fa0c19c83", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2388b44e2cd96f3ea835b07fa0c19c83")).floatValue() : this.c.b;
        }

        public final float h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48dd98a97e5e4634266e5c58e0256899", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48dd98a97e5e4634266e5c58e0256899")).floatValue() : this.c.b;
        }
    }

    @Override // com.meituan.msc.mmpviews.csstypes.d
    public final /* bridge */ /* synthetic */ a a() {
        return e;
    }
}
