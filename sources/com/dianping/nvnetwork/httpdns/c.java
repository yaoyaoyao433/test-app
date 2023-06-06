package com.dianping.nvnetwork.httpdns;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IHornCallback;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    public static boolean c = true;
    private static volatile c d;
    volatile boolean b;
    private HashMap<String, a> e;
    private ReentrantReadWriteLock f;
    private ReentrantReadWriteLock.ReadLock g;
    private ReentrantReadWriteLock.WriteLock h;
    private IHornCallback i;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595805523aea33c64aacf1a4cb8a2759", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595805523aea33c64aacf1a4cb8a2759");
            return;
        }
        this.e = new HashMap<>();
        this.f = new ReentrantReadWriteLock();
        this.g = this.f.readLock();
        this.h = this.f.writeLock();
        this.b = false;
        this.i = new IHornCallback() { // from class: com.dianping.nvnetwork.httpdns.c.1
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.stub.IHornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf29499094f19cd3a785faefee94282d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf29499094f19cd3a785faefee94282d");
                } else if (z) {
                    c.this.b(str);
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6904b2b975bdaf99e1a16174ae1c2c37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6904b2b975bdaf99e1a16174ae1c2c37");
        } else if (NVLinker.getHorn() == null) {
            this.b = false;
        } else {
            NVLinker.getHorn().register("sharkdns", this.i);
            b(NVLinker.getHorn().accessCache("sharkdns"));
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0653ca083bef5ee306e522622d806aef", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0653ca083bef5ee306e522622d806aef");
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        boolean optBoolean;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "020bb482387acb577ae3e6306b341b21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "020bb482387acb577ae3e6306b341b21");
        } else if (!TextUtils.isEmpty(str)) {
            new StringBuilder("horn config ").append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap hashMap = new HashMap();
                LinkedList linkedList = new LinkedList();
                if (jSONObject.has("o2")) {
                    optBoolean = jSONObject.optBoolean("o2");
                } else {
                    optBoolean = jSONObject.has("o") ? jSONObject.optBoolean("o") : false;
                }
                if (jSONObject.has("sni")) {
                    c = jSONObject.optBoolean("sni", true);
                }
                if (optBoolean) {
                    JSONArray jSONArray = jSONObject.getJSONArray("l");
                    if (jSONArray != null && jSONArray.length() != 0) {
                        this.b = true;
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string = jSONObject2.getString("h");
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("l");
                            if (!TextUtils.isEmpty(string)) {
                                string = string.toLowerCase();
                                linkedList.add(string);
                            }
                            if (jSONArray2 != null && jSONArray2.length() > 0) {
                                LinkedList linkedList2 = new LinkedList();
                                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                    linkedList2.add(jSONArray2.getString(i2));
                                }
                                if (!linkedList2.isEmpty() && !TextUtils.isEmpty(string)) {
                                    a aVar = new a();
                                    aVar.b = string;
                                    aVar.d = linkedList2;
                                    if (aVar.a()) {
                                        hashMap.put(string, aVar);
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                d.a(linkedList);
                Object[] objArr2 = {hashMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc312b633912e3e67695b28eb95445cc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc312b633912e3e67695b28eb95445cc");
                    return;
                }
                this.h.lock();
                this.e.clear();
                this.e.putAll(hashMap);
                this.h.unlock();
            } catch (Exception unused) {
            }
        }
    }

    public final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d071ecd25425fd8a47908646607f9dd", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d071ecd25425fd8a47908646607f9dd");
        }
        try {
            this.g.lock();
            return this.e.get(str);
        } finally {
            this.g.unlock();
        }
    }
}
