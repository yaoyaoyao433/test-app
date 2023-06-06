package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.APNMatchTools;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public final class al {
    public static final Pattern a = Pattern.compile("([^\\s;]+)(.*)");
    public static final Pattern b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);
    public static final Pattern c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* loaded from: classes6.dex */
    public static final class a extends FilterInputStream {
        private boolean a;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            int read;
            if (this.a || (read = super.read(bArr, i, i2)) == -1) {
                this.a = true;
                return -1;
            }
            return read;
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public int a;
        public Map<String, String> b;

        public final String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.a), this.b.toString());
        }
    }

    public static aj a(Context context, String str, Map<String, String> map) {
        return a(context, str, "POST", null, a(map));
    }

    public static String a(Context context, URL url) {
        return a(context, url, false, null, "UTF-8", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.io.Closeable, java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static String a(String str, Map<String, String> map, File file, String str2) {
        FileInputStream fileInputStream = null;
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes(StringUtil.CRLF_STRING);
                FileInputStream fileInputStream2 = new FileInputStream((File) file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                        dataOutputStream.flush();
                    }
                    dataOutputStream.writeBytes(StringUtil.CRLF_STRING);
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes(StringUtil.CRLF_STRING);
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    file = new BufferedReader(new InputStreamReader(new a(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String readLine = file.readLine();
                            if (readLine == null) {
                                String stringBuffer2 = stringBuffer.toString();
                                com.xiaomi.push.b.a(fileInputStream2);
                                com.xiaomi.push.b.a((Closeable) file);
                                return stringBuffer2;
                            }
                            stringBuffer.append(readLine);
                        } catch (IOException e) {
                            e = e;
                            throw new IOException("IOException:" + e.getClass().getSimpleName());
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            com.xiaomi.push.b.a(fileInputStream);
                            com.xiaomi.push.b.a((Closeable) file);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            file = 0;
        }
    }

    private static String a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e) {
                    com.xiaomi.channel.commonutils.logger.c.a("Failed to convert from params map to string: " + e);
                    com.xiaomi.channel.commonutils.logger.c.a("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static boolean a(Context context) {
        return j(context) >= 0;
    }

    private static HttpURLConnection b(Context context, URL url) {
        return (HttpURLConnection) HttpURLWrapper.wrapURLConnection(("http".equals(url.getProtocol()) && k(context)) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
    }

    public static boolean b(Context context) {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        z = networkCapabilities.hasCapability(16);
                    }
                } catch (Exception unused) {
                }
            } else {
                z = a(context);
            }
            return !z && c(context);
        }
        z = false;
        if (z) {
        }
    }

    public static boolean c(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && 1 == activeNetworkInfo.getType();
    }

    public static boolean e(Context context) {
        NetworkInfo l = l(context);
        return l != null && l.getType() == 0 && 20 == l.getSubtype();
    }

    public static boolean f(Context context) {
        NetworkInfo l = l(context);
        return l != null && l.getType() == 0 && 13 == l.getSubtype();
    }

    public static boolean g(Context context) {
        NetworkInfo l = l(context);
        if (l != null && l.getType() == 0) {
            String subtypeName = l.getSubtypeName();
            if (!MTCellInfo.TYPE_TDSCDMA.equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName) && !MTCellInfo.TYPE_WCDMA.equalsIgnoreCase(subtypeName)) {
                switch (l.getSubtype()) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        break;
                    case 4:
                    case 7:
                    case 11:
                    case 13:
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        NetworkInfo l = l(context);
        if (l != null && l.getType() == 0) {
            int subtype = l.getSubtype();
            if (subtype == 4 || subtype == 7 || subtype == 11) {
                return true;
            }
            switch (subtype) {
                case 1:
                case 2:
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public static String i(Context context) {
        if (d(context)) {
            return "wifi";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return "";
                }
                return (activeNetworkInfo.getTypeName() + CommonConstant.Symbol.MINUS + activeNetworkInfo.getSubtypeName() + CommonConstant.Symbol.MINUS + activeNetworkInfo.getExtraInfo()).toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    private static int j(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    private static boolean k(Context context) {
        ConnectivityManager connectivityManager;
        if ("CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso())) {
            try {
                connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            } catch (Exception unused) {
            }
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            return !TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && extraInfo.contains(APNMatchTools.APNNet.CTWAP);
        }
        return false;
    }

    private static NetworkInfo l(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    private static InputStream a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, b bVar) {
        String str3;
        if (context != null) {
            if (url != null) {
                if (!z) {
                    String url2 = url.toString();
                    if (TextUtils.isEmpty(url2)) {
                        str3 = null;
                    } else {
                        new String();
                        str3 = String.format("%s&key=%s", url2, aq.a(String.format("%sbe988a6134bc8254465424e5a70ef037", url2)));
                    }
                    url = new URL(str3);
                }
                try {
                    HttpURLConnection.setFollowRedirects(true);
                    HttpURLConnection b2 = b(context, url);
                    b2.setConnectTimeout(10000);
                    b2.setReadTimeout(15000);
                    if (!TextUtils.isEmpty(str)) {
                        b2.setRequestProperty("User-Agent", str);
                    }
                    if (str2 != null) {
                        b2.setRequestProperty("Cookie", str2);
                    }
                    return new a(b2.getInputStream());
                } catch (IOException e) {
                    throw new IOException("IOException:" + e.getClass().getSimpleName());
                } catch (Throwable th) {
                    throw new IOException(th.getMessage());
                }
            }
            throw new IllegalArgumentException("url");
        }
        throw new IllegalArgumentException("context");
    }

    private static String a(Context context, URL url, boolean z, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = a(context, url, false, null, null, null, null);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 == read) {
                        com.xiaomi.push.b.a(inputStream);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, read);
                }
            } catch (Throwable th) {
                th = th;
                com.xiaomi.push.b.a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    private static aj a(Context context, String str, String str2, Map<String, String> map, String str3) {
        BufferedReader bufferedReader;
        aj ajVar = new aj();
        OutputStream outputStream = null;
        try {
            try {
                try {
                    HttpURLConnection b2 = b(context, new URL(str));
                    b2.setConnectTimeout(10000);
                    b2.setReadTimeout(15000);
                    b2.setRequestMethod(str2);
                    int i = 0;
                    if (!TextUtils.isEmpty(str3)) {
                        b2.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream outputStream2 = b2.getOutputStream();
                        try {
                            outputStream2.write(bytes, 0, bytes.length);
                            outputStream2.flush();
                            outputStream2.close();
                        } catch (IOException e) {
                            e = e;
                            throw new IOException("err while request " + str + CommonConstant.Symbol.COLON + e.getClass().getSimpleName());
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                    ajVar.a = b2.getResponseCode();
                    com.xiaomi.channel.commonutils.logger.c.a("Http POST Response Code: " + ajVar.a);
                    while (true) {
                        String headerFieldKey = b2.getHeaderFieldKey(i);
                        String headerField = b2.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new a(b2.getErrorStream())));
                            }
                        } else {
                            ajVar.b.put(headerFieldKey, headerField);
                            i = i + 1 + 1;
                        }
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new a(b2.getInputStream())));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                String property = System.getProperty("line.separator");
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    stringBuffer.append(readLine);
                    stringBuffer.append(property);
                }
                ajVar.c = stringBuffer.toString();
                bufferedReader.close();
                com.xiaomi.push.b.a((Closeable) null);
                com.xiaomi.push.b.a((Closeable) null);
                return ajVar;
            } catch (IOException e3) {
                e = e3;
                throw new IOException("err while request " + str + CommonConstant.Symbol.COLON + e.getClass().getSimpleName());
            } catch (Throwable th3) {
                th = th3;
                throw new IOException(th.getMessage());
            }
        } catch (Throwable th4) {
            th = th4;
            str2 = 0;
        }
    }
}
