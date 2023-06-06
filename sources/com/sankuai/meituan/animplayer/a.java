package com.sankuai.meituan.animplayer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public k g;
    public k h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1355d600fb80264b9e5b8eb49ad82e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1355d600fb80264b9e5b8eb49ad82e6");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    public static a a(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c88038fbff283d93445c6a2b729cf389", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c88038fbff283d93445c6a2b729cf389");
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                a a2 = a(fileInputStream2);
                fileInputStream2.close();
                return a2;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static a a(InputStream inputStream) throws Exception {
        C0585a c0585a;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15017c52cf0e7dc2cef437637781997b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15017c52cf0e7dc2cef437637781997b");
        }
        byte[] bArr = new byte[8];
        long j = 0;
        while (inputStream.read(bArr, 0, 8) == 8) {
            Object[] objArr2 = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "afd1c79dc2ceb857d08e2e4b90f81820", RobustBitConfig.DEFAULT_VALUE)) {
                c0585a = (C0585a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "afd1c79dc2ceb857d08e2e4b90f81820");
            } else {
                c0585a = new C0585a();
                c0585a.b = ((bArr[0] & 255) << 24) | 0 | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                c0585a.c = new String(bArr, 4, 4, Charset.forName("US-ASCII"));
            }
            if (c0585a != null) {
                if ("mtap".equals(c0585a.c)) {
                    c0585a.a = j;
                    break;
                } else if ("vapc".endsWith(c0585a.c)) {
                    c0585a.a = j;
                    break;
                } else {
                    j += c0585a.b;
                    long j2 = c0585a.b - 8;
                    if (inputStream.skip(j2) != j2) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        c0585a = null;
        if (c0585a == null) {
            throw new RuntimeException("box not found");
        }
        byte[] bArr2 = new byte[c0585a.b - 8];
        if (inputStream.read(bArr2, 0, bArr2.length) <= 0) {
            throw new RuntimeException("box not found");
        }
        JSONObject jSONObject = new JSONObject(new String(bArr2, 0, bArr2.length, Charset.forName("UTF-8")));
        Object[] objArr3 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1aa2641e9797a72ab8d3df60ffd1274d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1aa2641e9797a72ab8d3df60ffd1274d");
        }
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        aVar.b = jSONObject2.getInt("v");
        if (aVar.b > 2) {
            throw new RuntimeException("version not match");
        }
        aVar.c = jSONObject2.getInt("w");
        aVar.d = jSONObject2.getInt("h");
        aVar.e = jSONObject2.getInt("videoW");
        aVar.f = jSONObject2.getInt("videoH");
        JSONArray jSONArray = jSONObject2.getJSONArray("aFrame");
        aVar.g = new k(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
        JSONArray jSONArray2 = jSONObject2.getJSONArray("rgbFrame");
        aVar.h = new k(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
        return aVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.animplayer.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0585a {
        public long a;
        public int b;
        public String c;

        public C0585a() {
        }
    }
}
