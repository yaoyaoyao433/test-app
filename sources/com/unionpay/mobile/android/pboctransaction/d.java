package com.unionpay.mobile.android.pboctransaction;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.tencent.smtt.sdk.TbsListener;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.data.ResultCode;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class d {
    c c;
    com.unionpay.mobile.android.fully.a d;
    private String f;
    private static Date l = new Date(System.currentTimeMillis());
    private static String m = new SimpleDateFormat("yyyyMMddhhmmss").format((java.util.Date) l);
    private static HashMap<String, String> o = new HashMap<>();
    public static String a = "A0000003330101010000000000010000";
    public static String b = "A0000003330101020001050001000000";
    private static d s = null;
    private byte g = 0;
    private byte h = 0;
    private byte i = 1;
    private boolean j = true;
    private boolean k = true;
    private String n = null;
    private final String p = "A0000003334355502D4D4F42494C45";
    private boolean q = false;
    public boolean e = false;
    private String r = "";

    public d(c cVar, com.unionpay.mobile.android.fully.a aVar, String str) {
        this.f = "1.4";
        this.f = str;
        this.c = cVar;
        this.d = aVar;
    }

    private static String a(String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (str == null) {
            return null;
        }
        byte[] a2 = e.a(str);
        int i11 = 0;
        while (i11 < a2.length) {
            int i12 = 1;
            int i13 = ((byte) (a2[i11] & 31)) == 31 ? 2 : 1;
            byte[] bArr = new byte[i13];
            System.arraycopy(a2, i11, bArr, 0, i13);
            if (e.a(bArr, i13).compareToIgnoreCase(str2) == 0) {
                int i14 = i11 + i13;
                if (((byte) (a2[i14] & 128)) != Byte.MIN_VALUE) {
                    i4 = a2[i14];
                } else {
                    i12 = 1 + (a2[i14] & 127);
                    if (i12 != 2) {
                        if (i12 == 3) {
                            i2 = (a2[i14 + 1] & 255) << 8;
                            i3 = a2[i14 + 2];
                        } else if (i12 != 4) {
                            i = 0;
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(a2, i14 + i12, bArr2, 0, i);
                            return e.a(bArr2, i);
                        } else {
                            i2 = ((a2[i14 + 1] & 255) << 16) | ((a2[i14 + 2] & 255) << 8);
                            i3 = a2[i14 + 3];
                        }
                        i = i2 | (i3 & 255);
                        byte[] bArr22 = new byte[i];
                        System.arraycopy(a2, i14 + i12, bArr22, 0, i);
                        return e.a(bArr22, i);
                    }
                    i4 = a2[i14 + 1];
                }
                i = i4 & 255;
                byte[] bArr222 = new byte[i];
                System.arraycopy(a2, i14 + i12, bArr222, 0, i);
                return e.a(bArr222, i);
            }
            if ((a2[i11] & 32) == 32) {
                i5 = i11 + i13;
                if (i5 < a2.length && ((byte) (a2[i5] & 128)) == Byte.MIN_VALUE) {
                    i12 = 1 + (a2[i5] & 127);
                }
            } else {
                i5 = i11 + i13;
                if (i5 >= a2.length || ((byte) (a2[i5] & 128)) != 0) {
                    i12 = i5 < a2.length ? (a2[i5] & 127) + 1 : 0;
                    if (i12 != 2 || (i9 = i5 + 1) >= a2.length) {
                        i6 = (i12 != 3 || (i8 = i5 + 2) >= a2.length) ? (i12 != 4 || (i7 = i5 + 2) >= a2.length) ? 0 : ((a2[i7] & 255) << 8) | ((a2[i5 + 1] & 255) << 16) | (a2[i5 + 3] & 255) : (a2[i8] & 255) | ((a2[i5 + 1] & 255) << 8);
                        i12 += i6;
                    } else {
                        i10 = a2[i9];
                    }
                } else {
                    i10 = a2[i5];
                }
                i6 = i10 & 255;
                i12 += i6;
            }
            i11 = i5 + i12;
        }
        return null;
    }

    private static String a(String str, boolean z) {
        int i;
        byte[] bArr;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.toUpperCase().getBytes();
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(bytes[i2])));
        }
        int length2 = (stringBuffer.length() / 2) + (stringBuffer.length() % 2);
        if (z) {
            i = length2 + 1;
            int i3 = i % 8;
            if (i3 != 0) {
                i += 8 - i3;
            }
            bArr = new byte[i];
            System.arraycopy(e.a(stringBuffer.toString()), 0, bArr, 0, length2);
            bArr[length2] = Byte.MIN_VALUE;
        } else {
            int i4 = length2 % 8;
            i = i4 != 0 ? (8 - i4) + length2 : length2;
            bArr = new byte[i];
            System.arraycopy(e.a(stringBuffer.toString()), 0, bArr, 0, length2);
        }
        return e.a(bArr, i);
    }

    private String a(byte[] bArr) {
        bArr[0] = (byte) (bArr[0] | this.g);
        byte[] a2 = this.c.a(bArr, this.g);
        int length = a2 != null ? a2.length : 0;
        if (length >= 2 && a2[length - 2] == 97) {
            a2 = this.c.a(new byte[]{this.g, -64, 0, 0, a2[length - 1]}, this.g);
            length = a2 != null ? a2.length : 0;
        }
        if (length >= 2 && a2[length - 2] == 108) {
            bArr[bArr.length - 1] = a2[length - 1];
            a2 = this.c.a(bArr, this.g);
            length = a2 != null ? a2.length : 0;
        }
        if (length > 2) {
            int i = length - 2;
            if (a2[i] == -112 && a2[length - 1] == 0) {
                return e.a(a2, i);
            }
        }
        if (length == 2 && a2[length - 2] == -112 && a2[length - 1] == 0) {
            return e.a(a2, 2);
        }
        return null;
    }

    private String a(byte[] bArr, String str) {
        bArr[4] = (byte) (str.length() / 2);
        byte[] bArr2 = new byte[(str.length() / 2) + 5];
        System.arraycopy(bArr, 0, bArr2, 0, 5);
        System.arraycopy(e.a(str), 0, bArr2, 5, str.length() / 2);
        return a(bArr2);
    }

    private static void a(String str, StringBuffer stringBuffer) {
        String str2 = o.get(str);
        String a2 = e.a(new byte[]{(byte) (str2.length() / 2)}, 1);
        stringBuffer.append(str);
        stringBuffer.append(a2);
        stringBuffer.append(str2);
    }

    private String b(String str) {
        if (this.c instanceof com.unionpay.mobile.android.pboctransaction.samsung.f) {
            return this.c.a(str);
        }
        this.g = this.h;
        if (str != null) {
            String a2 = e.a(new byte[]{Integer.valueOf(str.length() / 2).byteValue()});
            return a(e.a("00a40400" + a2 + str));
        }
        return null;
    }

    private void b(byte[] bArr) {
        int length = (m.length() / 2) + 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(e.a(m), 0, bArr2, 0, m.length() / 2);
        bArr2[length - 1] = Byte.MIN_VALUE;
        bArr[4] = (byte) bArr2.length;
        byte[] bArr3 = new byte[bArr2.length + 5];
        System.arraycopy(bArr, 0, bArr3, 0, 5);
        System.arraycopy(bArr2, 0, bArr3, 5, bArr2.length);
        a(bArr3);
    }

    private String c(String str) {
        byte[] a2;
        if (str == null || "9000".equals(str)) {
            StringBuffer stringBuffer = new StringBuffer("80A800000b8309");
            for (String str2 : i("9F7A019F02065F2A02")) {
                Iterator<String> it = o.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (str2.compareToIgnoreCase(next) == 0) {
                            stringBuffer.append(o.get(next));
                            break;
                        }
                    }
                }
            }
            a2 = e.a(stringBuffer.toString());
        } else {
            k.c("uppay", "test for gongshang version 2");
            StringBuffer stringBuffer2 = new StringBuffer("");
            String a3 = a(str, "9F38");
            if (TextUtils.isEmpty(a3)) {
                ByteBuffer allocate = ByteBuffer.allocate(7);
                allocate.put(Byte.MIN_VALUE).put((byte) -88).put((byte) 0).put((byte) 0).put((byte) 2).put((byte) -125).put((byte) 0);
                a2 = allocate.array();
            } else {
                for (String str3 : i(a3)) {
                    Iterator<String> it2 = o.keySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String next2 = it2.next();
                            if (str3.compareToIgnoreCase(next2) == 0) {
                                stringBuffer2.append(o.get(next2));
                                break;
                            }
                        }
                    }
                }
                byte[] a4 = e.a(stringBuffer2.toString());
                ByteBuffer allocate2 = ByteBuffer.allocate(a4.length + 7);
                allocate2.put(Byte.MIN_VALUE).put((byte) -88).put((byte) 0).put((byte) 0).put((byte) (a4.length + 2)).put((byte) -125).put((byte) a4.length).put(a4);
                a2 = allocate2.array();
            }
        }
        return a(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:7:0x004d, B:9:0x0050, B:10:0x0060, B:12:0x0065, B:14:0x007b, B:15:0x007f, B:17:0x0085, B:19:0x0091, B:20:0x0097), top: B:26:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String d(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "80"
            java.lang.String r1 = "8C"
            java.lang.String r2 = "8D"
            java.lang.String r14 = a(r14, r0)
            if (r14 != 0) goto Le
            r14 = 0
            return r14
        Le:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.unionpay.mobile.android.pboctransaction.d.o
            java.lang.String r3 = "82"
            r4 = 0
            r5 = 4
            java.lang.String r6 = r14.substring(r4, r5)
            r0.put(r3, r6)
            java.lang.String r14 = r14.substring(r5)
            byte[] r14 = com.unionpay.mobile.android.pboctransaction.e.a(r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r3 = "5A"
            r0.add(r3)
            java.lang.String r3 = "5F34"
            r0.add(r3)
            java.lang.String r3 = "9F1F"
            r0.add(r3)
            java.lang.String r3 = "57"
            r0.add(r3)
            java.lang.String r3 = "5F24"
            r0.add(r3)
            java.lang.String r3 = "9F10"
            r0.add(r3)
            r0.add(r1)
            r0.add(r2)
            r2 = 0
        L4d:
            int r3 = r14.length     // Catch: java.lang.Exception -> Lb7
            if (r2 >= r3) goto L97
            r3 = 5
            byte[] r3 = new byte[r3]     // Catch: java.lang.Exception -> Lb7
            r3 = {x00c4: FILL_ARRAY_DATA  , data: [0, -78, 0, 0, 0} // fill-array     // Catch: java.lang.Exception -> Lb7
            byte[] r6 = new byte[r5]     // Catch: java.lang.Exception -> Lb7
            java.lang.System.arraycopy(r14, r2, r6, r4, r5)     // Catch: java.lang.Exception -> Lb7
            int r2 = r2 + 4
            r7 = 1
            r7 = r6[r7]     // Catch: java.lang.Exception -> Lb7
        L60:
            r8 = 2
            r9 = r6[r8]     // Catch: java.lang.Exception -> Lb7
            if (r7 > r9) goto L4d
            r3[r5] = r4     // Catch: java.lang.Exception -> Lb7
            r9 = 3
            r10 = r6[r4]     // Catch: java.lang.Exception -> Lb7
            r10 = r10 & (-8)
            r10 = r10 | r5
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> Lb7
            r3[r9] = r10     // Catch: java.lang.Exception -> Lb7
            r3[r8] = r7     // Catch: java.lang.Exception -> Lb7
            int r7 = r7 + 1
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> Lb7
            java.lang.String r8 = r13.a(r3)     // Catch: java.lang.Exception -> Lb7
            if (r8 == 0) goto L60
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Exception -> Lb7
        L7f:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Exception -> Lb7
            if (r10 == 0) goto L60
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> Lb7
            java.lang.String r11 = a(r8, r10)     // Catch: java.lang.Exception -> Lb7
            if (r11 == 0) goto L7f
            java.util.HashMap<java.lang.String, java.lang.String> r12 = com.unionpay.mobile.android.pboctransaction.d.o     // Catch: java.lang.Exception -> Lb7
            r12.put(r10, r11)     // Catch: java.lang.Exception -> Lb7
            goto L7f
        L97:
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lb7
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.unionpay.mobile.android.pboctransaction.d.o     // Catch: java.lang.Exception -> Lb7
            java.lang.String r2 = "5F34"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb7
            r14.<init>(r0)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r0 = "0"
            r14.insert(r4, r0)     // Catch: java.lang.Exception -> Lb7
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.unionpay.mobile.android.pboctransaction.d.o     // Catch: java.lang.Exception -> Lb7
            java.lang.String r2 = "5F34"
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> Lb7
            r0.put(r2, r14)     // Catch: java.lang.Exception -> Lb7
            goto Lbb
        Lb7:
            r14 = move-exception
            r14.printStackTrace()
        Lbb:
            java.util.HashMap<java.lang.String, java.lang.String> r14 = com.unionpay.mobile.android.pboctransaction.d.o
            java.lang.Object r14 = r14.get(r1)
            java.lang.String r14 = (java.lang.String) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.pboctransaction.d.d(java.lang.String):java.lang.String");
    }

    private static void d() {
        String substring = m.substring(2, 8);
        long time = new Date(System.currentTimeMillis()).getTime();
        String valueOf = String.valueOf(time);
        String format = valueOf.length() < 8 ? String.format("%08d", Long.valueOf(time)) : valueOf.substring(valueOf.length() - 8, valueOf.length());
        o.put("9F26", "");
        o.put("9F27", "80");
        o.put("9F10", "");
        o.put("9F37", format);
        o.put("9F36", "");
        o.put("95", "0000000800");
        o.put("9A", substring);
        o.put("9C", "45");
        o.put("9F02", Constant.DEFAULT_BALANCE);
        o.put("5F2A", "0156");
        o.put("82", "");
        o.put("9F1A", "0156");
        o.put("9F03", Constant.DEFAULT_BALANCE);
        o.put("9F33", "A04000");
        o.put("9F34", "420300");
        o.put("9F35", "34");
        o.put("9F1E", "3030303030303030");
        o.put("84", "");
        o.put("9F09", "0001");
        o.put("9F74", "");
        o.put("9F63", "");
        o.put("9F7A", "01");
        o.put("9F21", m.substring(8));
        o.put("9F4E", "0000000000000000000000000000000000000000");
        o.put("DF31", "0100000000");
        o.put("9F66", "36800000");
        o.put("DF60", "00");
    }

    private String e(String str) {
        StringBuffer stringBuffer = new StringBuffer("80AE800034");
        for (String str2 : i(str)) {
            Iterator<String> it = o.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (str2.compareToIgnoreCase(next) == 0) {
                        stringBuffer.append(o.get(next));
                        break;
                    }
                }
            }
        }
        String a2 = a(e.a(stringBuffer.toString()));
        if (a2 != null) {
            o.put("9F27", a2.substring(4, 6));
            o.put("9F36", a2.substring(6, 10));
            o.put("9F26", a2.substring(10, 26));
            o.put("9F10", a2.substring(26));
        }
        return a2;
    }

    private boolean e() {
        String str = o.get("5A");
        while (str.substring(str.length() - 1, str.length()).equalsIgnoreCase("f")) {
            str = str.substring(0, str.length() - 1);
        }
        String f = f(str);
        if (f != null && f.length() != 0) {
            o.put("AN1", f);
            String f2 = f("00000001");
            if (f2 != null && f2.length() != 0) {
                o.put("TID", f2);
                String f3 = f(o.get("9F02"));
                if (f3 != null && f3.length() != 0) {
                    o.put("AMT", f3);
                    String f4 = f("156");
                    if (f4 != null && f4.length() != 0) {
                        o.put("CUR", f4);
                        String str2 = o.get("57");
                        while (true) {
                            if (!str2.substring(str2.length() - 1, str2.length()).equalsIgnoreCase("f") && !str2.substring(str2.length() - 1, str2.length()).equalsIgnoreCase("F")) {
                                break;
                            }
                            str2 = str2.substring(0, str2.length() - 1);
                        }
                        String f5 = f(str2);
                        if (f5 == null || f5.length() == 0) {
                            return false;
                        }
                        o.put("TD2", f5);
                        if (o.get("5F24") != null && o.get("5F24").length() == 6) {
                            String f6 = f(o.get("5F24").substring(0, 4));
                            if (f6 == null || f6.length() == 0) {
                                return false;
                            }
                            o.put("ED", f6);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private String f() {
        this.g = this.i;
        String a2 = a(new byte[]{0, -80, -126, 0, 10});
        if (a2 != null && a2.length() != 0) {
            o.put("CSN", a2);
        }
        this.g = this.h;
        return a2;
    }

    private String f(String str) {
        this.g = this.i;
        String a2 = a(str, false);
        b(new byte[]{Byte.MIN_VALUE, 26, 19, 1, 0});
        String a3 = a(new byte[]{Byte.MIN_VALUE, -6, 0, 0, 0}, a2);
        this.g = this.h;
        return a3;
    }

    private static Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("action_resp_code", "0000");
        return bundle;
    }

    private String g(String str) {
        this.g = this.i;
        byte[] bArr = {Byte.MIN_VALUE, 26, 20, 1, 0};
        byte[] bArr2 = {Byte.MIN_VALUE, -6, 0, 0, 0};
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", Integer.valueOf(str.length())));
        sb.append(str);
        String sb2 = sb.toString();
        StringBuffer stringBuffer = new StringBuffer(sb2);
        for (int i = 0; i < 16 - sb2.length(); i++) {
            stringBuffer.append("F");
        }
        b(bArr);
        String a2 = a(bArr2, stringBuffer.toString());
        if (a2 != null) {
            o.put("PIN", a2);
        }
        this.g = this.h;
        return a2;
    }

    private String h(String str) {
        this.g = this.i;
        byte[] bArr = {Byte.MIN_VALUE, -6, 1, 0, 0};
        String a2 = a(str, true);
        b(new byte[]{Byte.MIN_VALUE, 26, 21, 1, 8});
        while (a2.length() > 448) {
            bArr[2] = 3;
            a(bArr, a2.substring(0, 448).toUpperCase());
            a2 = a2.substring(448);
        }
        bArr[2] = 1;
        if (Build.VERSION.SDK_INT <= 10) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String a3 = a(bArr, a2);
        k.c("uppay", "encryptMac in resp".concat(String.valueOf(a3)));
        if (a3 != null) {
            o.put("MAC", a3.toUpperCase());
        }
        this.g = this.h;
        return a3 != null ? a3.toUpperCase() : a3;
    }

    private static List<String> i(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        byte[] a2 = e.a(str);
        int i = 0;
        while (i < a2.length) {
            int i2 = 1;
            int i3 = ((byte) (a2[i] & 31)) == 31 ? 2 : 1;
            byte[] bArr = new byte[i3];
            System.arraycopy(a2, i, bArr, 0, i3);
            arrayList.add(e.a(bArr, i3));
            int i4 = i + i3;
            if (i4 < a2.length && ((byte) (a2[i4] & 128)) == Byte.MIN_VALUE) {
                i2 = 1 + (a2[i4] & 127);
            }
            i = i4 + i2;
        }
        return arrayList;
    }

    public final synchronized Bundle a(int i, String str, HashMap<String, String> hashMap, String str2) {
        String str3;
        k.c("uppay", "startUPCardPurchase() +++");
        Bundle g = g();
        this.c.b();
        String a2 = a();
        if (a2 != null && a2.length() != 0) {
            k.c("uppay", " ************T1=" + m);
            o.put("PIN", str);
            String g2 = g(PreferenceUtils.decPrefData(o.get("PIN"), str2));
            if (g2 != null && g2.length() != 0) {
                k.c("uppay", " ************T2=" + m);
                String a3 = a(i, m);
                if (a3 != null && a3.length() != 0) {
                    String f = f();
                    if (f != null && f.length() != 0) {
                        String c = e.c(a3.substring(40, 60));
                        String substring = a3.substring(60, 100);
                        String substring2 = a3.substring(100, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM);
                        String substring3 = a3.substring(TbsListener.ErrorCode.INCR_UPDATE_ERROR, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("v", this.f);
                            jSONObject.put("cmd", Constants.EventType.PAY);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject.put("params", jSONObject2);
                            jSONObject2.put("pay_type", "2");
                            jSONObject2.put("pay_mode", "1");
                            jSONObject2.put("bind", "no");
                            jSONObject2.put("carrier_tp", "1");
                            jSONObject2.put("track2_data", substring);
                            jSONObject2.put("track3_data", substring2);
                            jSONObject2.put("csn", o.get("CSN"));
                            jSONObject2.put("submit_time", m);
                            jSONObject2.put("sp_id", "8889");
                            jSONObject2.put(Constant.KEY_PIN, o.get("PIN"));
                            jSONObject2.put("pan", c);
                            jSONObject2.put("dynamic_key_data", substring3);
                            jSONObject2.put("carrier_app_tp", "1");
                            if (hashMap != null && hashMap.keySet() != null && hashMap.keySet().size() > 0) {
                                hashMap.remove("pan");
                                hashMap.remove(Constant.KEY_PIN);
                                for (String str4 : hashMap.keySet()) {
                                    jSONObject2.put(str4, hashMap.get(str4));
                                }
                            }
                            str3 = jSONObject.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                            str3 = "";
                        }
                        k.c("uppay", " ************T3=" + m);
                        g.putString("action_resp_message", this.d.a(str3));
                        this.c.c();
                        d();
                        return g;
                    }
                    this.c.c();
                    g.putString("action_resp_code", ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE);
                    return g;
                }
                this.c.c();
                g.putString("action_resp_code", ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE);
                return g;
            }
            this.c.c();
            g.putString("action_resp_code", ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE);
            return g;
        }
        this.c.c();
        g.putString("action_resp_code", ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE);
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0191 A[Catch: all -> 0x050a, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0058, B:8:0x006a, B:10:0x00ae, B:13:0x00b6, B:15:0x00d2, B:18:0x00da, B:20:0x00f6, B:23:0x00fe, B:25:0x011a, B:28:0x0121, B:30:0x013d, B:33:0x0144, B:35:0x0160, B:44:0x0187, B:46:0x0191, B:49:0x0198, B:51:0x01c2, B:54:0x01ca, B:56:0x01d7, B:59:0x01ec, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0296, B:74:0x02aa, B:75:0x02b5, B:77:0x02bf, B:78:0x02ca, B:80:0x02d4, B:81:0x02df, B:83:0x02e9, B:84:0x02f4, B:86:0x0313, B:87:0x031e, B:89:0x0322, B:91:0x032c, B:92:0x0337, B:94:0x0341, B:95:0x034c, B:97:0x0356, B:98:0x0361, B:99:0x0367, B:101:0x036d, B:103:0x0375, B:104:0x038a, B:106:0x03aa, B:109:0x03b2, B:111:0x040f, B:113:0x041c, B:115:0x0458, B:116:0x0465, B:118:0x046f, B:120:0x047e, B:122:0x0484, B:124:0x048e, B:125:0x04a0, B:127:0x04a6, B:128:0x04b4, B:129:0x04b8, B:132:0x04d2, B:135:0x04e0, B:138:0x04ee, B:141:0x04fc, B:38:0x016a), top: B:149:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198 A[Catch: all -> 0x050a, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0058, B:8:0x006a, B:10:0x00ae, B:13:0x00b6, B:15:0x00d2, B:18:0x00da, B:20:0x00f6, B:23:0x00fe, B:25:0x011a, B:28:0x0121, B:30:0x013d, B:33:0x0144, B:35:0x0160, B:44:0x0187, B:46:0x0191, B:49:0x0198, B:51:0x01c2, B:54:0x01ca, B:56:0x01d7, B:59:0x01ec, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0296, B:74:0x02aa, B:75:0x02b5, B:77:0x02bf, B:78:0x02ca, B:80:0x02d4, B:81:0x02df, B:83:0x02e9, B:84:0x02f4, B:86:0x0313, B:87:0x031e, B:89:0x0322, B:91:0x032c, B:92:0x0337, B:94:0x0341, B:95:0x034c, B:97:0x0356, B:98:0x0361, B:99:0x0367, B:101:0x036d, B:103:0x0375, B:104:0x038a, B:106:0x03aa, B:109:0x03b2, B:111:0x040f, B:113:0x041c, B:115:0x0458, B:116:0x0465, B:118:0x046f, B:120:0x047e, B:122:0x0484, B:124:0x048e, B:125:0x04a0, B:127:0x04a6, B:128:0x04b4, B:129:0x04b8, B:132:0x04d2, B:135:0x04e0, B:138:0x04ee, B:141:0x04fc, B:38:0x016a), top: B:149:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.os.Bundle a(com.unionpay.mobile.android.pboctransaction.AppIdentification r4, java.lang.String r5, java.lang.String r6, java.util.HashMap<java.lang.String, java.lang.String> r7, java.util.HashMap<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.pboctransaction.d.a(com.unionpay.mobile.android.pboctransaction.AppIdentification, java.lang.String, java.lang.String, java.util.HashMap, java.util.HashMap, java.lang.String):android.os.Bundle");
    }

    public final String a() {
        if (this.c instanceof com.unionpay.mobile.android.pboctransaction.samsung.f) {
            return this.c.a("A0000003334355502D4D4F42494C45");
        }
        this.g = this.i;
        return a(new byte[]{0, -92, 4, 0, 15, -96, 0, 0, 3, 51, 67, 85, 80, 45, 77, 79, 66, 73, 76, 69});
    }

    public final String a(int i, String str) {
        String hexString;
        this.g = this.i;
        if (Integer.toHexString(i).length() == 1) {
            hexString = "0" + Integer.toHexString(i);
        } else {
            hexString = Integer.toHexString(i);
        }
        return a(e.a("80F802" + hexString + "08" + str + "80"));
    }

    public final synchronized String a(AppIdentification appIdentification) {
        String a2 = appIdentification.a();
        d();
        b(a2);
        String c = c(null);
        if (c != null && c.length() != 0) {
            String d = d(c);
            if (d != null && d.length() != 0) {
                return o.get("5A");
            }
            return null;
        }
        return null;
    }

    public final String a(String str) {
        this.c.d();
        String b2 = b(str);
        this.c.d();
        return a(b2, "84");
    }

    public final ArrayList<com.unionpay.mobile.android.model.c> b() {
        this.c.d();
        this.c.b();
        ArrayList<com.unionpay.mobile.android.model.c> a2 = this.c.a(this);
        this.c.c();
        return a2;
    }

    public final String c() {
        this.g = this.i;
        return a(e.a("80F2000102"));
    }
}
