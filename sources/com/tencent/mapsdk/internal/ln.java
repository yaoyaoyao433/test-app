package com.tencent.mapsdk.internal;

import android.net.Uri;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.map.tools.net.processor.ResponseProcessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ln implements RequestProcessor, ResponseProcessor {
    private static final String h = "NetFlow";
    private static final boolean i = false;
    protected String b;
    protected double c;
    protected double d;
    protected long e;
    protected long f;
    protected int g;
    private HashMap<String, String> j = new HashMap<>();
    protected boolean a = false;

    public ln() {
    }

    public ln(HashMap<String, String> hashMap) {
        this.j.putAll(hashMap);
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public void onRequest(NetRequest netRequest) throws Exception {
        Uri parse;
        boolean z;
        String scheme = Uri.parse(netRequest.url).getScheme();
        if (scheme == null || !scheme.startsWith("http")) {
            z = false;
        } else {
            String str = parse.getHost() + parse.getPath();
            if (this.j.containsKey(str)) {
                this.b = this.j.get(str);
                this.a = true;
            } else {
                Iterator<String> it = this.j.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (str.contains(next)) {
                        this.b = this.j.get(next);
                        this.a = true;
                        break;
                    }
                }
            }
            z = this.a;
        }
        if (z) {
            this.c = netRequest.url.getBytes().length;
            if (netRequest.postData != null) {
                this.c += netRequest.postData.length;
            }
            for (Map.Entry<String, String> entry : netRequest.mapHeaders.entrySet()) {
                this.c += entry.getKey().getBytes().length + entry.getValue().getBytes().length;
            }
            this.c /= 1024.0d;
            this.c = Math.round(this.c * 1000.0d) / 1000.0d;
            this.e = System.currentTimeMillis();
        }
    }

    public void onResponse(NetResponse netResponse) throws Exception {
        if (this.a && netResponse.available()) {
            this.g = netResponse.statusCode;
            if (netResponse.errorCode != 0) {
                if (netResponse.errorData != null) {
                    this.d = netResponse.errorData.length;
                } else {
                    this.d = -1.0d;
                }
            } else if (netResponse.data != null) {
                this.d = netResponse.data.length;
            } else {
                this.d = -1.0d;
            }
            this.d /= 1024.0d;
            this.d = Math.round(this.d * 1000.0d) / 1000.0d;
        } else {
            this.g = -100;
        }
        this.f = System.currentTimeMillis();
    }

    private boolean a(String str) {
        Uri parse;
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || !scheme.startsWith("http")) {
            return false;
        }
        String str2 = parse.getHost() + parse.getPath();
        if (this.j.containsKey(str2)) {
            this.b = this.j.get(str2);
            this.a = true;
        } else {
            Iterator<String> it = this.j.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (str2.contains(next)) {
                    this.b = this.j.get(next);
                    this.a = true;
                    break;
                }
            }
        }
        return this.a;
    }
}
