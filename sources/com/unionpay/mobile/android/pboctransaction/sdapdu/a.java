package com.unionpay.mobile.android.pboctransaction.sdapdu;

import android.content.Context;
import android.util.Log;
import com.unionpay.mobile.android.pboctransaction.AppIdentification;
import com.unionpay.mobile.android.pboctransaction.c;
import com.unionpay.mobile.android.pboctransaction.d;
import com.unionpay.mobile.android.pboctransaction.e;
import com.unionpay.mobile.android.utils.k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class a implements c {
    private Context b = null;
    NativeSDWriter a = null;
    private boolean c = false;

    private static ArrayList<com.unionpay.mobile.android.model.c> b(d dVar) {
        String a;
        String str;
        String str2;
        String str3;
        if (dVar.a() == null) {
            str2 = "uppay";
            str3 = " select UPCard failed!!!!";
        } else {
            String c = dVar.c();
            if (c != null) {
                byte[] a2 = e.a(c);
                int i = 1;
                int i2 = ((a2[0] & 255) << 24) | ((a2[1] & 255) << 16);
                int i3 = Integer.MIN_VALUE;
                int i4 = 0;
                for (int i5 = 0; i5 < 10; i5++) {
                    if ((i3 & i2) == 0) {
                        i4++;
                    }
                    i3 >>>= 1;
                }
                if (i4 <= 0) {
                    return null;
                }
                ArrayList<com.unionpay.mobile.android.model.c> arrayList = new ArrayList<>(i4);
                int i6 = Integer.MIN_VALUE;
                while (i <= i4 && i < 11) {
                    if ((i2 & i6) == 0 && (a = dVar.a(i, com.unionpay.mobile.android.utils.c.a())) != null && a.length() > 0) {
                        String d = e.d(a.substring(0, 40));
                        try {
                            str = new String(e.a(d), "gbk");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                            str = d;
                        }
                        String substring = a.substring(40, 60);
                        arrayList.add(new com.unionpay.mobile.android.model.a(8, Integer.toString(i), str, e.c(substring), 2));
                        k.c("uppay", i + "----" + substring);
                    }
                    i++;
                    i6 >>>= 1;
                }
                return arrayList;
            }
            str2 = "uppay";
            str3 = " getBankCardFileEntry failed!!!!";
        }
        Log.e(str2, str3);
        return null;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final String a(String str) {
        return "";
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final ArrayList<com.unionpay.mobile.android.model.c> a(d dVar) {
        k.c("uppay", "SDEngine.readList() +++");
        ArrayList arrayList = null;
        if (this.c) {
            ArrayList<com.unionpay.mobile.android.model.c> arrayList2 = new ArrayList<>();
            String a = dVar.a(new AppIdentification("A0000003330101", "1.0"));
            if (a != null && a.length() > 0) {
                arrayList = new ArrayList(1);
                arrayList.add(new com.unionpay.mobile.android.model.a(8, "A0000003330101", "", e.c(a), 1));
                k.c("uppay", "A0000003330101----" + a);
            }
            if (arrayList != null && arrayList.size() > 0) {
                arrayList2.addAll(arrayList);
            }
            ArrayList<com.unionpay.mobile.android.model.c> b = b(dVar);
            if (b != null && b.size() > 0) {
                arrayList2.addAll(b);
            }
            k.c("uppay", "SDEngine.readList() ---");
            return arrayList2;
        }
        return null;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a() {
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void a(com.unionpay.mobile.android.pboctransaction.b bVar, Context context) {
        this.b = context;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final byte[] a(byte[] bArr, int i) {
        return e.a(this.a != null ? this.a.a(e.a(bArr)) : "");
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void b() {
        this.a = new NativeSDWriter();
        b.a();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : b.a) {
            arrayList.add(str);
        }
        this.c = this.a.a(arrayList);
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void c() {
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // com.unionpay.mobile.android.pboctransaction.c
    public final void d() {
    }
}
