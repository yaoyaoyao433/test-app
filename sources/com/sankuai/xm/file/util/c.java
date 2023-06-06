package com.sankuai.xm.file.util;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.j;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b5e7c4458e06a4672f782cee2ced788", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b5e7c4458e06a4672f782cee2ced788")).booleanValue();
        }
        if (k.h(str2)) {
            boolean d = CryptoProxy.c().d(str);
            boolean c = CryptoProxy.c().c(str2);
            if (d) {
                if (c) {
                    return k.e(str, str2);
                }
                return CryptoProxy.c().a(str, str2, 1) == 0;
            } else if (c) {
                return CryptoProxy.c().a(str, str2, 0) == 0;
            } else {
                return k.e(str, str2);
            }
        }
        return false;
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c56c9bb56d616cd8640ae60314042d1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c56c9bb56d616cd8640ae60314042d1");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2;
    }

    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0319fe11819de38e131a2646e2716733", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0319fe11819de38e131a2646e2716733")).longValue();
        }
        if (k.f(str)) {
            try {
                if (!CryptoProxy.c().d(str)) {
                    return k.p(str);
                }
                return CryptoProxy.c().a(str, 1);
            } catch (Throwable th) {
                com.sankuai.xm.log.c.a("FileUtil", th, "getFileRealLength::exception", new Object[0]);
                return -1L;
            }
        }
        return -1L;
    }

    public static String b(String str) {
        InputStream inputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c88963615cc393364ae58b72d2bc6f0c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c88963615cc393364ae58b72d2bc6f0c");
        }
        if (TextUtils.isEmpty(str) || !k.o(str)) {
            return null;
        }
        if (!CryptoProxy.c().d(str)) {
            return j.a(str);
        }
        try {
            inputStream = k.q(str);
            try {
                try {
                    String a2 = j.a(CryptoProxy.c().a(inputStream, 1));
                    m.a(inputStream);
                    return a2;
                } catch (Exception e) {
                    e = e;
                    com.sankuai.xm.log.c.a("FileUtil", e, "getFileType::failed", new Object[0]);
                    m.a(inputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                m.a(inputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m.a(inputStream);
            throw th;
        }
    }

    public static boolean c(String str) {
        InputStream q;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30bfb444772a53ccf8e33a5cd47c91b3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30bfb444772a53ccf8e33a5cd47c91b3")).booleanValue();
        }
        if (!CryptoProxy.c().d(str)) {
            return j.b(str);
        }
        try {
            try {
                q = k.q(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean b = j.b(CryptoProxy.c().a(q, 1));
            m.a(q);
            return b;
        } catch (Exception e2) {
            e = e2;
            inputStream = q;
            com.sankuai.xm.log.c.d(e, "VideoMsgHandler::prepare failed in getting file type.", new Object[0]);
            m.a(inputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            inputStream = q;
            m.a(inputStream);
            throw th;
        }
    }

    public static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        OutputStream outputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee0923fdc5f9a8750e038a8c5b576d34", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee0923fdc5f9a8750e038a8c5b576d34")).booleanValue();
        }
        if (str != null) {
            try {
                try {
                    if (!k.o(str2)) {
                        String substring = str.substring(str.indexOf(CommonConstant.Symbol.COMMA) + 1);
                        OutputStream r = k.r(str2);
                        try {
                            outputStream = CryptoProxy.c().c(str2) ? CryptoProxy.c().a(r, 0) : r;
                            outputStream.write(Base64.decode(substring, 0));
                            outputStream.flush();
                            m.a(outputStream);
                            return true;
                        } catch (Exception | OutOfMemoryError e) {
                            e = e;
                            outputStream = r;
                            com.sankuai.xm.log.c.d("FileUtil", "getFileFromBase64,e=" + e.getMessage(), new Object[0]);
                            m.a(outputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            outputStream = r;
                            m.a(outputStream);
                            throw th;
                        }
                    }
                    m.a(null);
                    return true;
                } catch (Exception | OutOfMemoryError e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        m.a(outputStream);
        return false;
    }
}
