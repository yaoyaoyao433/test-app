package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.titans.proxy.util.Constants;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final LinkedHashMap<String, String> b;

    static {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        b = linkedHashMap;
        linkedHashMap.put("FFD8FF", CommonConstant.File.JPG);
        b.put("89504E47", "png");
        b.put("47494638", CommonConstant.File.GIF);
        b.put("49492A00", "tif");
        b.put("424D", "bmp");
        b.put("^52494646[0-9A-Z]{8}57454250.*", "webp");
        b.put("41433130", "dwg");
        b.put("38425053", "psd");
        b.put("7B5C727466", "rtf");
        b.put("3C3F786D6C", CommonConstant.File.XML);
        b.put("68746D6C3E", Constants.KEY_CONTENT_TYPE_HTML);
        b.put("44656C69766572792D646174653A", "eml");
        b.put("D0CF11E0", "doc");
        b.put("5374616E64617264204A", "mdb");
        b.put("252150532D41646F6265", "ps");
        b.put("255044462D312E", "pdf");
        b.put("504B0304", "zip");
        b.put("52617221", "rar");
        b.put("^52494646[0-9A-Z]{8}57415645.*", "wav");
        b.put("41564920", "avi");
        b.put("2E524D46", "rm");
        b.put("000001BA", "mpg");
        b.put("000001B3", "mpg");
        b.put("6D6F6F76", "mov");
        b.put("3026B2758E66CF11", "asf");
        b.put("4D546864", MessageStatisticsEntry.PARAM_MSG_ID);
        b.put("1F8B08", "gz");
        b.put("000000186674797068656963", "heic");
        b.put("000000206674797068656963", "heic");
        b.put("^000000(1C|20|18)6674.*", "mp4");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.util.j.a
            java.lang.String r10 = "e324276c91e88fa17d1d573cf4478fdc"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            java.lang.String r11 = c(r11)
            if (r11 != 0) goto L25
            return r2
        L25:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = com.sankuai.xm.base.util.j.b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "^"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L49
            boolean r3 = r11.matches(r1)
            if (r3 != 0) goto L4f
        L49:
            boolean r3 = r11.startsWith(r1)
            if (r3 == 0) goto L2f
        L4f:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r11 = com.sankuai.xm.base.util.j.b
            java.lang.Object r11 = r11.get(r1)
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.j.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.InputStream r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.util.j.a
            java.lang.String r10 = "9a6dc1001ff9afbe93a11f58ebb6ba80"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            java.lang.String r11 = c(r11)
            if (r11 != 0) goto L25
            return r2
        L25:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = com.sankuai.xm.base.util.j.b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "^"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L49
            boolean r3 = r11.matches(r1)
            if (r3 != 0) goto L4f
        L49:
            boolean r3 = r11.startsWith(r1)
            if (r3 == 0) goto L2f
        L4f:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r11 = com.sankuai.xm.base.util.j.b
            java.lang.Object r11 = r11.get(r1)
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.j.a(java.io.InputStream):java.lang.String");
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cd90916bfe57bd9668a9c5fc798b7ac", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cd90916bfe57bd9668a9c5fc798b7ac")).booleanValue() : "mp4".equals(a(str));
    }

    public static boolean b(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25f03a25611795ea6c3902dc580fb4d9", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25f03a25611795ea6c3902dc580fb4d9")).booleanValue() : "mp4".equals(a(inputStream));
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b300f64f5e8e051c5f656bda090e2bfb", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b300f64f5e8e051c5f656bda090e2bfb")).booleanValue() : str2.equalsIgnoreCase(a(str));
    }

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4873846c82ad8da59afbb13a166b25b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4873846c82ad8da59afbb13a166b25b");
        }
        try {
            return c(k.q(str));
        } catch (Exception e) {
            com.sankuai.xm.log.c.a("FileType::getFileHeader path = " + str, e);
            return null;
        }
    }

    private static String c(InputStream inputStream) {
        String sb;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "431f5a2fff30ab7b271619db89e22d53", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "431f5a2fff30ab7b271619db89e22d53");
        }
        try {
            try {
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                inputStream.read(bArr, 0, 16);
                Object[] objArr2 = {bArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "62fa470305a0b13174dd2cbe378b0331", 6917529027641081856L)) {
                    sb = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "62fa470305a0b13174dd2cbe378b0331");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i = 0; i < 16; i++) {
                        String upperCase = Integer.toHexString(bArr[i] & 255).toUpperCase();
                        if (upperCase.length() < 2) {
                            sb2.append(0);
                        }
                        sb2.append(upperCase);
                    }
                    sb = sb2.toString();
                }
                str = sb;
            } catch (Exception e) {
                com.sankuai.xm.log.c.a("FileType::getFileHeader", e);
            }
            return str;
        } finally {
            m.a(inputStream);
        }
    }
}
