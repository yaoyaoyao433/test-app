package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class cc {

    /* loaded from: classes6.dex */
    public static class a extends cb {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.cb
        public final String a(Context context, String str, List<ak> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (ak akVar : list) {
                    buildUpon.appendQueryParameter(akVar.a(), akVar.b());
                }
                url = new URL(buildUpon.toString());
            }
            return al.a(context, url);
        }
    }

    private static int a(int i, int i2) {
        return (((i2 + TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK) / 1448) * 132) + 1080 + i + i2;
    }

    private static int a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    private static int a(List<ak> list) {
        int i = 0;
        for (ak akVar : list) {
            if (!TextUtils.isEmpty(akVar.a())) {
                i += akVar.a().length();
            }
            if (!TextUtils.isEmpty(akVar.b())) {
                i += akVar.b().length();
            }
        }
        return i * 2;
    }

    public static String a(Context context, String str, List<ak> list, cb cbVar, boolean z) {
        String str2;
        String a2;
        if (al.a(context)) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                bu a3 = by.a().a(str);
                if (a3 != null) {
                    arrayList = a3.a(str);
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                Iterator<String> it = arrayList.iterator();
                String str3 = null;
                while (it.hasNext()) {
                    String next = it.next();
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        a2 = cbVar.a(context, next, arrayList2);
                        try {
                        } catch (IOException e) {
                            e = e;
                            str2 = a2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str2 = str3;
                    }
                    if (!TextUtils.isEmpty(a2)) {
                        if (a3 != null) {
                            try {
                                str2 = a2;
                                try {
                                    a3.a(new URL(next).getHost(), System.currentTimeMillis() - currentTimeMillis, a(cbVar, next, arrayList2, a2));
                                    return str2;
                                } catch (MalformedURLException unused) {
                                    return str2;
                                }
                            } catch (MalformedURLException unused2) {
                            }
                        }
                        return a2;
                    }
                    str2 = a2;
                    if (a3 != null) {
                        try {
                            a3.a(next, System.currentTimeMillis() - currentTimeMillis, a(cbVar, next, arrayList2, str2), null);
                        } catch (IOException e3) {
                            e = e3;
                        }
                    }
                    str3 = str2;
                    e = e3;
                    if (a3 != null) {
                        a3.a(next, System.currentTimeMillis() - currentTimeMillis, a(cbVar, next, arrayList2, str2), e);
                    }
                    e.printStackTrace();
                    str3 = str2;
                }
                return str3;
            } catch (MalformedURLException e4) {
                e4.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static int a(cb cbVar, String str, List<ak> list, String str2) {
        if (cbVar.a == 1) {
            return a(str.length(), a(str2));
        }
        if (cbVar.a == 2) {
            return a(str.length(), a(list), a(str2));
        }
        return -1;
    }
}
