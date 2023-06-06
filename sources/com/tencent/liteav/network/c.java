package com.tencent.liteav.network;

import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.common.CommonConstant;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    private final String c = "https://tcdns.myqcloud.com/queryip";
    private final String d = "https://tcdnsipv6.myqcloud.com/queryip";
    private final String e = "forward_stream";
    private final String f = "forward_num";
    private final String g = "request_type";
    private final String h = "sdk_version";
    private final String i = "51451748-d8f2-4629-9071-db2983aa7251";
    private final int j = 5;
    private final int k = 2;
    public b a = null;
    public int b = 5;
    private Thread l = null;

    public void a(final String str, final int i) {
        this.l = new Thread("TXCPushRoute") { // from class: com.tencent.liteav.network.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (c.this.a == null) {
                    return;
                }
                ArrayList<a> arrayList = new ArrayList<>();
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        break;
                    }
                    try {
                        String a = c.this.a(str, i, i2 < 5 ? "https://tcdns.myqcloud.com/queryip" : "https://tcdnsipv6.myqcloud.com/queryip");
                        try {
                            JSONObject jSONObject = new JSONObject(a);
                            if (jSONObject.has("use") && jSONObject.getInt("use") == 0) {
                                break;
                            }
                        } catch (Exception e) {
                            TXCLog.e("TXCIntelligentRoute", "get value from json failed.", e);
                        }
                        ArrayList<a> a2 = c.this.a(a);
                        if (a2 != null) {
                            try {
                                if (a2.size() > 0) {
                                    arrayList = a2;
                                    break;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                arrayList = a2;
                                TXCLog.e("TXCIntelligentRoute", "get json string failed.", e);
                                i2++;
                            }
                        }
                        sleep(1000L, 0);
                        arrayList = a2;
                    } catch (Exception e3) {
                        e = e3;
                        TXCLog.e("TXCIntelligentRoute", "get json string failed.", e);
                        i2++;
                    }
                    i2++;
                }
                c.this.a.onFetchDone(0, arrayList);
            }
        };
        this.l.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, int i, String str2) {
        InputStream b;
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            b = b(str, i, str2);
        } catch (IOException e) {
            TXCLog.e("TXCIntelligentRoute", "get json string from url failed.", e);
        }
        if (b == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            stringBuffer.append(readLine);
        }
        return stringBuffer.toString();
    }

    private InputStream b(String str, int i, String str2) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str2).openConnection());
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("forward_stream", str);
            httpURLConnection.setRequestProperty("forward_num", "2");
            httpURLConnection.setRequestProperty("sdk_version", TXCCommonUtil.getSDKVersionStr());
            if (i == 1) {
                httpURLConnection.setRequestProperty("request_type", "1");
            } else if (i == 2) {
                httpURLConnection.setRequestProperty("request_type", "2");
            } else {
                httpURLConnection.setRequestProperty("request_type", "3");
            }
            if (this.b > 0) {
                httpURLConnection.setConnectTimeout(this.b * 1000);
                httpURLConnection.setReadTimeout(this.b * 1000);
            }
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e) {
            TXCLog.e("TXCIntelligentRoute", "http failed.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v9, types: [int] */
    public ArrayList<a> a(String str) {
        JSONArray jSONArray;
        ArrayList<a> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("state") == 0 && (jSONArray = jSONObject.getJSONObject("content").getJSONArray(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    a a = a((JSONObject) jSONArray.opt(i));
                    if (a != null && a.c) {
                        arrayList.add(a);
                    }
                }
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    a a2 = a((JSONObject) jSONArray.opt(i2));
                    if (a2 != null && !a2.c) {
                        arrayList.add(a2);
                    }
                }
                ?? r10 = (com.tencent.liteav.basic.d.c.a().a("Network", "EnableRouteOptimize") > 1L ? 1 : (com.tencent.liteav.basic.d.c.a().a("Network", "EnableRouteOptimize") == 1L ? 0 : -1));
                try {
                    if (r10 == 0 && m.a().c()) {
                        ArrayList<a> a3 = a(arrayList, true);
                        a(a3);
                        return a3;
                    }
                    long a4 = com.tencent.liteav.basic.d.c.a().a("Network", "RouteSamplingMaxCount");
                    if (a4 >= 1) {
                        long a5 = m.a().a("51451748-d8f2-4629-9071-db2983aa7251");
                        if (a5 <= a4) {
                            ArrayList<a> a6 = a(arrayList, false);
                            m.a().a("51451748-d8f2-4629-9071-db2983aa7251", a5 + 1);
                            arrayList = a6;
                        }
                    }
                    a(arrayList);
                    return arrayList;
                } catch (JSONException e) {
                    arrayList = r10;
                    e = e;
                    TXCLog.e("TXCIntelligentRoute", "get records from json string failed.", e);
                    return arrayList;
                }
            }
            return null;
        } catch (JSONException e2) {
            e = e2;
        }
    }

    private a a(JSONObject jSONObject) {
        a aVar = new a();
        try {
            aVar.a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            aVar.b = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            aVar.e = 0;
            aVar.c = false;
            aVar.d = c(aVar.a);
            if (jSONObject.has("type") && jSONObject.getInt("type") == 2) {
                aVar.c = true;
            }
            return aVar;
        } catch (JSONException e) {
            TXCLog.e("TXCIntelligentRoute", "get ip record from json object failed.", e);
            return null;
        }
    }

    private boolean b(String str) {
        return str.split(CommonConstant.Symbol.COLON).length > 1;
    }

    private boolean c(String str) {
        if (!b(str) && str != null) {
            for (String str2 : str.split("[.]")) {
                if (!d(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean d(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<a> a(ArrayList<a> arrayList, boolean z) {
        a aVar;
        a aVar2;
        a aVar3 = null;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<a> it = arrayList.iterator();
        loop0: while (true) {
            aVar = aVar3;
            while (it.hasNext()) {
                aVar3 = it.next();
                if (aVar3.c) {
                    arrayList2.add(aVar3);
                } else if (aVar3.d) {
                    break;
                } else {
                    arrayList3.add(aVar3);
                }
            }
        }
        ArrayList<a> arrayList4 = new ArrayList<>();
        while (true) {
            if (arrayList2.size() <= 0 && arrayList3.size() <= 0) {
                break;
            }
            if (z) {
                if (aVar != null) {
                    arrayList4.add(aVar);
                }
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
            } else {
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
                if (aVar != null) {
                    arrayList4.add(aVar);
                }
            }
            if (arrayList3.size() > 0) {
                arrayList4.add(arrayList3.get(0));
                arrayList3.remove(0);
            }
        }
        int size = arrayList4.size();
        if (size > 0 && (aVar2 = (a) arrayList4.get(size - 1)) != null && !c(aVar2.a) && aVar != null) {
            arrayList4.add(aVar);
        }
        return arrayList4;
    }

    private void a(ArrayList<a> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String str = "";
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            str = str + " \n Nearest IP: " + next.a + " Port: " + next.b + " Q Channel: " + next.c;
        }
        TXCLog.e("TXCIntelligentRoute", str);
    }
}
