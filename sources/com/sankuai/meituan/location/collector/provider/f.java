package com.sankuai.meituan.location.collector.provider;

import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.provider.e;
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static String c = "CollectorDataTran ";
    private static final int[] d = {1, 2, 3, 4, 5};
    public int b;
    private int e;
    private byte[] f;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de246300a02b3d795cadbf30d5193f31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de246300a02b3d795cadbf30d5193f31");
        } else {
            this.b = 5120;
        }
    }

    private void a(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "333a79627f39d4b3b282a6862afaf2b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "333a79627f39d4b3b282a6862afaf2b1");
            return;
        }
        this.f[this.e] = b;
        this.e++;
    }

    private void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1bed765767db19e2dbb29f1d3f674d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1bed765767db19e2dbb29f1d3f674d");
            return;
        }
        if (bArr == null) {
            bArr = new byte[6];
        }
        if (bArr.length != 6) {
            LogUtils.a("exception,the length of bytes not 6");
        }
        b(bArr);
    }

    private static byte[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b873c9bec304aefaf9aa757f531da96", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b873c9bec304aefaf9aa757f531da96");
        }
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    private static byte[] a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "920245f2054a9013c90c2004fdf3a504", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "920245f2054a9013c90c2004fdf3a504");
        }
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((j >> (i * 8)) & 255);
        }
        return bArr;
    }

    private static byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8101833ed839c3df00b62cd7005bdc5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8101833ed839c3df00b62cd7005bdc5f");
        }
        String[] split = str.split(CommonConstant.Symbol.COLON);
        if (split == null || split.length != 6) {
            split = new String[6];
            for (int i = 0; i < 6; i++) {
                split[i] = "0";
            }
        }
        byte[] bArr = new byte[6];
        for (int i2 = 0; i2 < split.length; i2++) {
            if (split[i2].length() > 2) {
                split[i2] = split[i2].substring(0, 2);
            }
            bArr[i2] = (byte) Integer.parseInt(split[i2], 16);
        }
        return bArr;
    }

    private static byte[] a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3c80859d1f39169db00fe44593e0806", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3c80859d1f39169db00fe44593e0806");
        }
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = (byte) ((s >> (i * 8)) & 255);
        }
        return bArr;
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c721436baa6691e713f5f2817e5026a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c721436baa6691e713f5f2817e5026a");
            return;
        }
        byte[] a2 = a(i);
        System.arraycopy(a2, 0, this.f, this.e, a2.length);
        this.e += a2.length;
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55ecb142c9734574ee21ca985d4917f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55ecb142c9734574ee21ca985d4917f");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            byte[] bytes = str.getBytes("UTF-8");
            this.f[this.e] = Byte.parseByte(String.valueOf(bytes.length));
            this.e++;
            System.arraycopy(bytes, 0, this.f, this.e, bytes.length);
            this.e += bytes.length;
        } catch (Exception e) {
            this.f[this.e] = 0;
            this.e++;
            LogUtils.a(getClass(), e);
        }
    }

    private void b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64f5590dad5be60bee1ce7ee00366a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64f5590dad5be60bee1ce7ee00366a7");
            return;
        }
        if (bArr == null) {
            LogUtils.a("writeBytes null obj");
        }
        System.arraycopy(bArr, 0, this.f, this.e, bArr.length);
        this.e += bArr.length;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(58:14|(1:16)|17|(1:19)|(2:20|21)|22|(1:24)|25|(2:26|27)|28|(1:30)(1:371)|31|(1:33)|(2:34|35)|36|(1:38)|(2:39|40)|41|(1:43)|(2:44|45)|46|(1:48)|49|50|51|(3:53|(1:55)(1:242)|(4:57|(2:58|(2:60|(2:63|64)(1:62))(2:239|240))|(3:66|(1:237)|70)(1:238)|71)(1:241))(3:243|(1:245)|(6:247|(2:248|(2:250|(2:253|254)(1:252))(2:356|357))|(3:256|(1:354)|260)(1:355)|261|(5:263|(1:265)(1:352)|266|267|290)|353)(32:358|114|(1:116)(5:226|(1:228)|229|230|(1:232)(1:233))|117|(1:119)|120|(1:122)|(3:124|(16:126|(1:128)|129|130|131|(1:133)|134|(1:136)|137|(1:139)|140|(1:142)|143|144|146|147)|156)|157|(11:159|(1:161)|162|(1:224)|166|(1:168)|169|(1:171)|172|(1:174)|175)(1:225)|176|(1:178)|179|180|181|182|(1:184)|185|186|187|188|(1:190)|191|192|193|194|(1:196)|197|198|199|(2:201|202)(2:204|205)|203))|113|114|(0)(0)|117|(0)|120|(0)|(0)|157|(0)(0)|176|(0)|179|180|181|182|(0)|185|186|187|188|(0)|191|192|193|194|(0)|197|198|199|(0)(0)|203) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:14|(1:16)|17|(1:19)|(2:20|21)|22|(1:24)|25|(2:26|27)|28|(1:30)(1:371)|31|(1:33)|34|35|36|(1:38)|(2:39|40)|41|(1:43)|(2:44|45)|46|(1:48)|49|50|51|(3:53|(1:55)(1:242)|(4:57|(2:58|(2:60|(2:63|64)(1:62))(2:239|240))|(3:66|(1:237)|70)(1:238)|71)(1:241))(3:243|(1:245)|(6:247|(2:248|(2:250|(2:253|254)(1:252))(2:356|357))|(3:256|(1:354)|260)(1:355)|261|(5:263|(1:265)(1:352)|266|267|290)|353)(32:358|114|(1:116)(5:226|(1:228)|229|230|(1:232)(1:233))|117|(1:119)|120|(1:122)|(3:124|(16:126|(1:128)|129|130|131|(1:133)|134|(1:136)|137|(1:139)|140|(1:142)|143|144|146|147)|156)|157|(11:159|(1:161)|162|(1:224)|166|(1:168)|169|(1:171)|172|(1:174)|175)(1:225)|176|(1:178)|179|180|181|182|(1:184)|185|186|187|188|(1:190)|191|192|193|194|(1:196)|197|198|199|(2:201|202)(2:204|205)|203))|113|114|(0)(0)|117|(0)|120|(0)|(0)|157|(0)(0)|176|(0)|179|180|181|182|(0)|185|186|187|188|(0)|191|192|193|194|(0)|197|198|199|(0)(0)|203) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:14|(1:16)|17|(1:19)|(2:20|21)|22|(1:24)|25|(2:26|27)|28|(1:30)(1:371)|31|(1:33)|34|35|36|(1:38)|39|40|41|(1:43)|(2:44|45)|46|(1:48)|49|50|51|(3:53|(1:55)(1:242)|(4:57|(2:58|(2:60|(2:63|64)(1:62))(2:239|240))|(3:66|(1:237)|70)(1:238)|71)(1:241))(3:243|(1:245)|(6:247|(2:248|(2:250|(2:253|254)(1:252))(2:356|357))|(3:256|(1:354)|260)(1:355)|261|(5:263|(1:265)(1:352)|266|267|290)|353)(32:358|114|(1:116)(5:226|(1:228)|229|230|(1:232)(1:233))|117|(1:119)|120|(1:122)|(3:124|(16:126|(1:128)|129|130|131|(1:133)|134|(1:136)|137|(1:139)|140|(1:142)|143|144|146|147)|156)|157|(11:159|(1:161)|162|(1:224)|166|(1:168)|169|(1:171)|172|(1:174)|175)(1:225)|176|(1:178)|179|180|181|182|(1:184)|185|186|187|188|(1:190)|191|192|193|194|(1:196)|197|198|199|(2:201|202)(2:204|205)|203))|113|114|(0)(0)|117|(0)|120|(0)|(0)|157|(0)(0)|176|(0)|179|180|181|182|(0)|185|186|187|188|(0)|191|192|193|194|(0)|197|198|199|(0)(0)|203) */
    /* JADX WARN: Can't wrap try/catch for region: R(61:14|(1:16)|17|(1:19)|20|21|22|(1:24)|25|(2:26|27)|28|(1:30)(1:371)|31|(1:33)|34|35|36|(1:38)|39|40|41|(1:43)|(2:44|45)|46|(1:48)|49|50|51|(3:53|(1:55)(1:242)|(4:57|(2:58|(2:60|(2:63|64)(1:62))(2:239|240))|(3:66|(1:237)|70)(1:238)|71)(1:241))(3:243|(1:245)|(6:247|(2:248|(2:250|(2:253|254)(1:252))(2:356|357))|(3:256|(1:354)|260)(1:355)|261|(5:263|(1:265)(1:352)|266|267|290)|353)(32:358|114|(1:116)(5:226|(1:228)|229|230|(1:232)(1:233))|117|(1:119)|120|(1:122)|(3:124|(16:126|(1:128)|129|130|131|(1:133)|134|(1:136)|137|(1:139)|140|(1:142)|143|144|146|147)|156)|157|(11:159|(1:161)|162|(1:224)|166|(1:168)|169|(1:171)|172|(1:174)|175)(1:225)|176|(1:178)|179|180|181|182|(1:184)|185|186|187|188|(1:190)|191|192|193|194|(1:196)|197|198|199|(2:201|202)(2:204|205)|203))|113|114|(0)(0)|117|(0)|120|(0)|(0)|157|(0)(0)|176|(0)|179|180|181|182|(0)|185|186|187|188|(0)|191|192|193|194|(0)|197|198|199|(0)(0)|203) */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0ef8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0ef9, code lost:
        r9 = false;
        r19.f[r19.e] = 0;
        r19.e++;
        com.meituan.android.common.locate.util.LogUtils.a(getClass(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0f68, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0f69, code lost:
        r7 = 0;
        r19.f[r19.e] = 0;
        r19.e++;
        com.meituan.android.common.locate.util.LogUtils.a(getClass(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0fbc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0fbd, code lost:
        r7 = 0;
        r19.f[r19.e] = 0;
        r19.e++;
        com.meituan.android.common.locate.util.LogUtils.a(getClass(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x100e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x100f, code lost:
        r19.f[r19.e] = 0;
        r19.e++;
        com.meituan.android.common.locate.util.LogUtils.a(getClass(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0e77  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0f37  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1059  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1177  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(org.json.JSONArray r20, com.sankuai.meituan.location.collector.provider.CollectorDataBuilder r21) {
        /*
            Method dump skipped, instructions count: 4696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.f.a(org.json.JSONArray, com.sankuai.meituan.location.collector.provider.CollectorDataBuilder):byte[]");
    }

    private void a(CollectorDataBuilder collectorDataBuilder) {
        int i = 1;
        Object[] objArr = {collectorDataBuilder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1807c6e78409df3177d31a6d848a092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1807c6e78409df3177d31a6d848a092");
            return;
        }
        LogUtils.a("appendBluetooths");
        int size = collectorDataBuilder.bles == null ? 0 : collectorDataBuilder.bles.size();
        a((byte) size);
        if (size == 0) {
            return;
        }
        for (e eVar : collectorDataBuilder.bles) {
            if (eVar.a == 0 && (eVar instanceof e.b)) {
                e.b bVar = (e.b) eVar;
                Object[] objArr2 = new Object[i];
                objArr2[0] = bVar;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12268bc4ddd7810c797da3d36880c7a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12268bc4ddd7810c797da3d36880c7a7");
                    i = 1;
                } else {
                    LogUtils.a("parseBeacon");
                    a(bVar.a);
                    String str = bVar.b;
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = str;
                    objArr3[i] = 127;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6e81f7d7d2b37f39a4d85fe556b6738", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6e81f7d7d2b37f39a4d85fe556b6738");
                    } else {
                        if (TextUtils.isEmpty(str)) {
                            str = "";
                        }
                        if (str.length() > 127) {
                            str = str.substring(0, 127);
                        }
                        b(str);
                    }
                    b(bVar.c);
                    b(bVar.d);
                    a(bVar.e);
                    a(bVar.f);
                    short s = bVar.g;
                    Object[] objArr4 = {Short.valueOf(s)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "35d33ffa6192c1897b1b3a541efe54db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "35d33ffa6192c1897b1b3a541efe54db");
                    } else {
                        byte[] a2 = a(s);
                        System.arraycopy(a2, 0, this.f, this.e, a2.length);
                        this.e += a2.length;
                    }
                    a(bVar.h);
                    i = 1;
                }
            } else {
                if (eVar.a == 1 && (eVar instanceof e.c)) {
                    e.c cVar = (e.c) eVar;
                    if (cVar.b == 1) {
                        Object[] objArr5 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6de9b18e890b256304a850a5e725770e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6de9b18e890b256304a850a5e725770e");
                        } else {
                            LogUtils.a("parseClassicBluetooth");
                            a(cVar.a);
                            a(cVar.c);
                            i = 1;
                        }
                    } else if (cVar.b == 2 || cVar.b == 3) {
                        e.a aVar = (e.a) eVar;
                        Object[] objArr6 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "17c85f3cb68c101ad31f7173e7dbace0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "17c85f3cb68c101ad31f7173e7dbace0");
                        } else {
                            LogUtils.a("parseBLE OR DUAL");
                            a(aVar.a);
                            a(aVar.c);
                        }
                        i = 1;
                    }
                }
                i = 1;
            }
        }
    }
}
