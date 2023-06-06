package com.sankuai.xm.file.transfer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.file.bean.SdkServerResult;
import com.sankuai.xm.file.bean.StatisticEntry;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.imextra.impl.sessionpresent.db.DBSessionMsgSpecialTag;
import com.sankuai.xm.monitor.cat.c;
import com.sankuai.xm.network.c;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;
    protected int b;
    protected List<d> c;
    public TransferContext d;
    protected int e;
    protected long f;
    protected com.sankuai.xm.network.analyse.b g;
    protected short h;
    private int i;
    private int j;

    public abstract void c();

    public final String d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824fe4d311ee817016cb339e4c0bf350", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824fe4d311ee817016cb339e4c0bf350");
        }
        switch (i) {
            case 2:
                return DBSessionMsgSpecialTag.CHAT;
            case 3:
                return "groupchat";
            case 4:
                return "pubchat";
            default:
                return DBSessionMsgSpecialTag.CHAT;
        }
    }

    public a(int i, long j, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8913dd473b3bec3f28988c7fb4d21f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8913dd473b3bec3f28988c7fb4d21f");
            return;
        }
        this.h = (short) 0;
        this.b = 0;
        this.c = new ArrayList();
        this.d = null;
        this.e = i;
        this.f = j;
        this.i = i2;
        this.j = i3;
        this.g = new com.sankuai.xm.network.analyse.b();
    }

    public final synchronized void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45559e20785fdac9f866d2d869d36682", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45559e20785fdac9f866d2d869d36682");
            return;
        }
        if (dVar != null && !this.c.contains(dVar)) {
            this.c.add(dVar);
        }
    }

    public final synchronized void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467bf8cba7478e50f6444996ecd45a10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467bf8cba7478e50f6444996ecd45a10");
            return;
        }
        if (dVar != null) {
            this.c.remove(dVar);
        }
    }

    public final void a(short s) {
        this.h = s;
    }

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf6c2ebe763c02de6e3452bd62222a5", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf6c2ebe763c02de6e3452bd62222a5");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Message.FROM_APPID, Integer.valueOf(this.i));
        hashMap.put(Message.TO_APPID, Integer.valueOf(this.j));
        return hashMap;
    }

    public final TransferContext bU_() {
        return this.d;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a2e7ba377791e714f8f70bce86632c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a2e7ba377791e714f8f70bce86632c");
            return;
        }
        this.d.setState(i);
        ArrayList<d> arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(this.c);
        }
        for (d dVar : arrayList) {
            dVar.onStateChanged(this.d, i);
        }
    }

    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32434cee59163752775ea5581d203831", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32434cee59163752775ea5581d203831");
            return;
        }
        this.d.setCurrentProgress(j);
        ArrayList<d> arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(this.c);
        }
        for (d dVar : arrayList) {
            dVar.onProgress(this.d, j, j2);
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ca1f9703ca6f50ca1233c840e2e2ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ca1f9703ca6f50ca1233c840e2e2ca");
            return;
        }
        this.b = i;
        ArrayList<d> arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(this.c);
        }
        for (d dVar : arrayList) {
            dVar.onError(this.d, this.d.getServerResCode() != 0 ? this.d.getServerResCode() : i, str);
        }
        a(6);
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9351f58cf048228de481691017af120", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9351f58cf048228de481691017af120");
            return;
        }
        String serverResMessage = this.d.getServerResMessage();
        a(i, (serverResMessage == null || serverResMessage.length() == 0) ? "File error" : "File error");
    }

    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9829b565dd3f9ec85c6ce52e450d6562", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9829b565dd3f9ec85c6ce52e450d6562");
            return;
        }
        this.d.getStatisticEntry().httpCode = i;
        StatisticEntry statisticEntry = this.d.getStatisticEntry();
        statisticEntry.msg = str + "------ request-id:" + str2;
    }

    public final void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ed232f7d4f5d09275c94b9121fcb51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ed232f7d4f5d09275c94b9121fcb51");
            return;
        }
        String v = aVar.c() != null ? aVar.c().v() : "";
        int a2 = aVar.a();
        if (a2 != 5000 && a2 != -1001 && a2 != -1002) {
            this.d.setHttpCode(aVar.d());
            this.d.setServerResCode(aVar.a());
            this.d.setServerResMessage(aVar.b());
        }
        int a3 = aVar.a();
        a(a3, "url:" + aVar.e() + StringUtil.SPACE + aVar.b(), v);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c45d07d540207d3024ef96ff203e47d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c45d07d540207d3024ef96ff203e47d6");
        } else {
            a(1, str, str2);
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79975cce9243fea94c6d7f87de28c71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79975cce9243fea94c6d7f87de28c71");
            return;
        }
        this.d.getStatisticEntry().taskEndTime = System.currentTimeMillis();
        StatisticEntry statisticEntry = this.d.getStatisticEntry();
        if (this.d.getServerResCode() != 0) {
            i = this.d.getServerResCode();
        }
        statisticEntry.bizCode = i;
    }

    public final void a(long j, int i, long j2, int i2, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52b3fed22c40ee9d9f07ab9eaef78650", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52b3fed22c40ee9d9f07ab9eaef78650");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", com.sankuai.xm.file.proxy.c.a("/file/upload.json"));
        hashMap.put("request_size", Integer.valueOf(String.valueOf(j)));
        hashMap.put("code", Integer.valueOf(i2));
        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE, Integer.valueOf(i));
        hashMap.put("time", Long.valueOf(j / (System.currentTimeMillis() - j2)));
        hashMap.put("extraData", "requestId:" + str + "extraData:" + str2);
        c.a.a.a(hashMap);
    }

    public final String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ebaf7de48b78dbb58da6ecd9af61e8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ebaf7de48b78dbb58da6ecd9af61e8");
        }
        if (inputStream == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                return sb.toString();
            }
        }
    }

    private SdkServerResult b(com.sankuai.xm.network.http.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced747dfe38e5bfdd720fb2925d8a3b3", 6917529027641081856L)) {
            return (SdkServerResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced747dfe38e5bfdd720fb2925d8a3b3");
        }
        try {
            String a2 = a(bVar.e());
            if (a2 == null || a2.length() <= 0) {
                return null;
            }
            SdkServerResult sdkServerResult = new SdkServerResult();
            sdkServerResult.deserializeJson(a2);
            return sdkServerResult;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean a(com.sankuai.xm.network.http.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef99e519b90786f517a7c5de1664680d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef99e519b90786f517a7c5de1664680d")).booleanValue();
        }
        int d = bVar.d();
        this.d.setHttpCode(d);
        if (d == 200 || d == 206 || d == 201 || d == 301 || d == 302 || d == 304) {
            return true;
        }
        com.sankuai.xm.file.util.b.d("AbstractTask::checkResponseData fail http code:%d", Integer.valueOf(d));
        SdkServerResult b = b(bVar);
        if (b != null && b.hasError()) {
            this.d.setServerResCode(b.getResCode());
            this.d.setServerResMessage(b.getErrorMessage());
        } else {
            this.d.setServerResCode(d);
        }
        return false;
    }
}
