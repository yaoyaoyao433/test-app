package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.av;
import java.io.File;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes6.dex */
public class d implements b {
    protected Context a;
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.d>> b;

    public d(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.clientreport.processor.e
    public final void a() {
        av.a(this.a, "perf", "perfUploading");
        File[] b = av.b(this.a, "perfUploading");
        if (b == null || b.length <= 0) {
            return;
        }
        for (File file : b) {
            if (file != null) {
                List<String> a = g.a(this.a, file.getAbsolutePath());
                file.delete();
                a(a);
            }
        }
    }

    @Override // com.xiaomi.clientreport.processor.b
    public final void a(HashMap<String, HashMap<String, com.xiaomi.clientreport.data.d>> hashMap) {
        this.b = hashMap;
    }

    public void a(List<String> list) {
        av.a(this.a, list);
    }

    @Override // com.xiaomi.clientreport.processor.f
    public final void b() {
        String absolutePath;
        if (this.b == null) {
            return;
        }
        if (this.b.size() > 0) {
            for (String str : this.b.keySet()) {
                HashMap<String, com.xiaomi.clientreport.data.d> hashMap = this.b.get(str);
                if (hashMap != null && hashMap.size() > 0) {
                    com.xiaomi.clientreport.data.d[] dVarArr = new com.xiaomi.clientreport.data.d[hashMap.size()];
                    hashMap.values().toArray(dVarArr);
                    int i = 0;
                    com.xiaomi.clientreport.data.d dVar = dVarArr[0];
                    String str2 = "";
                    int i2 = dVar.e;
                    String str3 = dVar.f;
                    if (i2 > 0 && !TextUtils.isEmpty(str3)) {
                        str2 = String.valueOf(i2) + "#" + str3;
                    }
                    File externalFilesDir = this.a.getExternalFilesDir("perf");
                    String str4 = null;
                    if (externalFilesDir == null) {
                        com.xiaomi.channel.commonutils.logger.c.d("cannot get folder when to write perf");
                        absolutePath = null;
                    } else {
                        if (!externalFilesDir.exists()) {
                            externalFilesDir.mkdirs();
                        }
                        absolutePath = new File(externalFilesDir, str2).getAbsolutePath();
                    }
                    if (!TextUtils.isEmpty(absolutePath)) {
                        while (true) {
                            if (i >= 20) {
                                break;
                            }
                            String str5 = absolutePath + i;
                            if (av.a(this.a, str5)) {
                                str4 = str5;
                                break;
                            }
                            i++;
                        }
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        g.a(str4, dVarArr);
                    }
                }
            }
        }
        this.b.clear();
    }

    @Override // com.xiaomi.clientreport.processor.f
    public final void a(com.xiaomi.clientreport.data.d dVar) {
        if ((dVar instanceof com.xiaomi.clientreport.data.c) && this.b != null) {
            com.xiaomi.clientreport.data.c cVar = (com.xiaomi.clientreport.data.c) dVar;
            String str = String.valueOf(cVar.e) + "#" + cVar.f;
            String a = g.a(cVar);
            HashMap<String, com.xiaomi.clientreport.data.d> hashMap = this.b.get(str);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            com.xiaomi.clientreport.data.c cVar2 = (com.xiaomi.clientreport.data.c) hashMap.get(a);
            if (cVar2 != null) {
                cVar.b += cVar2.b;
                cVar.c += cVar2.c;
            }
            hashMap.put(a, cVar);
            this.b.put(str, hashMap);
        }
    }
}
