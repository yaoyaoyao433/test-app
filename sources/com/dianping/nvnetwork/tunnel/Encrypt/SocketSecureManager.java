package com.dianping.nvnetwork.tunnel.Encrypt;

import com.dianping.nvnetwork.tunnel.Encrypt.d;
import com.dianping.nvnetwork.tunnel.Encrypt.e;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.tunnel.tool.Log;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SocketSecureManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, SocketSecureManager> mCache = new HashMap();
    private final List<OnSocketSecureManagerEventLisenter> _ls;
    private e addSocketManage;
    private ReentrantLock arrayLock;
    private ArrayList<SocketSecureCell> arraySocket;
    private CacheSecureInfo cacheSecureInfo;
    private AtomicBoolean isEncrypted;
    private AtomicBoolean isEncrypting;
    private c rsaCacheInfo;
    private d secureInfo;

    /* loaded from: classes.dex */
    public interface OnSocketSecureManagerEventLisenter {
        void onCreateB2KeyInfoEvent(boolean z, String str, int i);

        void onSignB2KeyEvent(boolean z, String str, int i);
    }

    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public String b;
    }

    private SocketSecureCell getRandomSocketSecureCell() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cfc114bd9d504ca95f1551529e29a1c", 6917529027641081856L)) {
            return (SocketSecureCell) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cfc114bd9d504ca95f1551529e29a1c");
        }
        this.arrayLock.lock();
        try {
            if (!this.arraySocket.isEmpty()) {
                Collections.shuffle(this.arraySocket);
                Iterator<SocketSecureCell> it = this.arraySocket.iterator();
                while (it.hasNext()) {
                    SocketSecureCell next = it.next();
                    if (next.isSocketConnected() && next.isSocketConnected()) {
                        return next;
                    }
                }
            }
            this.arrayLock.unlock();
            return null;
        } finally {
            this.arrayLock.unlock();
        }
    }

    public static SocketSecureManager newInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a7e4a4da8e223d0a66a8f7f1a8ed55f", 6917529027641081856L) ? (SocketSecureManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a7e4a4da8e223d0a66a8f7f1a8ed55f") : newInstance("default");
    }

    public static SocketSecureManager newInstance(String str) {
        Object obj;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57009c0f73df73014019eb09707d0758", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57009c0f73df73014019eb09707d0758");
        } else {
            if (!mCache.containsKey(str)) {
                synchronized (mCache) {
                    if (!mCache.containsKey(str)) {
                        mCache.put(str, new SocketSecureManager());
                    }
                }
            }
            obj = mCache.get(str);
        }
        return (SocketSecureManager) obj;
    }

    public void addOnSocketSecureManagerEventLisenter(OnSocketSecureManagerEventLisenter onSocketSecureManagerEventLisenter) {
        Object[] objArr = {onSocketSecureManagerEventLisenter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7180c0f67c9657fb9111b07c34f8412c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7180c0f67c9657fb9111b07c34f8412c");
            return;
        }
        synchronized (this._ls) {
            this._ls.add(onSocketSecureManagerEventLisenter);
        }
    }

    public void addSocketSecureHandler(SocketSecureCell socketSecureCell) {
        Object[] objArr = {socketSecureCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28d5f8030423a403099521fc5275a9e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28d5f8030423a403099521fc5275a9e6");
            return;
        }
        this.arrayLock.lock();
        try {
            this.arraySocket.add(socketSecureCell);
        } finally {
            this.arrayLock.unlock();
        }
    }

    public void clearFromCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bccb485f2c91fa4d816cfcbfd41a2580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bccb485f2c91fa4d816cfcbfd41a2580");
            return;
        }
        synchronized (mCache) {
            Iterator<Map.Entry<String, SocketSecureManager>> it = mCache.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, SocketSecureManager> next = it.next();
                if (next.getValue() == this) {
                    mCache.remove(next.getKey());
                    break;
                }
            }
        }
    }

    public void createProtocolData(SecureProtocolData secureProtocolData) {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c5aca1d401ce3e23fa689878958f781", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c5aca1d401ce3e23fa689878958f781");
        } else {
            SecureTools.createProtocolData(secureProtocolData, this);
        }
    }

    public byte[] decryptData(byte[] bArr, String str) throws Exception {
        Object[] objArr = {bArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6743441b46b22306ff748cd911223f70", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6743441b46b22306ff748cd911223f70") : SecureTools.decryptDataByKey(bArr, str.getBytes());
    }

    public byte[] encryptData(byte[] bArr, String str) throws Exception {
        Object[] objArr = {bArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "befa17aeccaf2daffc212c85e92d9fe4", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "befa17aeccaf2daffc212c85e92d9fe4") : SecureTools.encryptDataByKey(bArr, str.getBytes());
    }

    public synchronized String getB2keyByB2(String str, String str2) {
        d.a b;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbae114e7001faeb4fe4736dd3a867a5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbae114e7001faeb4fe4736dd3a867a5");
        }
        String str3 = "";
        if (str.equals(this.secureInfo.b) && (b = this.secureInfo.b(str2)) != null) {
            str3 = b.c;
        }
        return str3;
    }

    public a getEncriptData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0019e8ca01b19a1a8885dae955ca11d7", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0019e8ca01b19a1a8885dae955ca11d7");
        }
        d.a a2 = this.secureInfo.a();
        String str2 = this.secureInfo.b;
        a aVar = new a();
        if (a2 != null && isEncrypted() && !SecureTools.isEmpty(str2) && !SecureTools.isEmpty(a2.c)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("b", a2.b);
                jSONObject.put("t", str2);
                jSONObject.put("i", str);
                aVar.a = jSONObject.toString();
                aVar.b = a2.c;
            } catch (Exception unused) {
            }
        }
        return aVar;
    }

    public ByteBuffer getProtocolData(SecureProtocolData secureProtocolData) {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55e14c934273fb55ebffd03bfca59ca4", 6917529027641081856L) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55e14c934273fb55ebffd03bfca59ca4") : SecureTools.getProtocolData(secureProtocolData, this);
    }

    public synchronized void handlerSecureProtocol(SocketSecureCell socketSecureCell, SecureProtocolData secureProtocolData) {
        Object[] objArr = {socketSecureCell, secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be8d97800866b0ef64e0547cf4764de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be8d97800866b0ef64e0547cf4764de");
        } else {
            this.addSocketManage.a(socketSecureCell, secureProtocolData);
        }
    }

    public boolean isEncrypted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "201fe25893309a14361c432c860ac8dd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "201fe25893309a14361c432c860ac8dd")).booleanValue() : this.isEncrypted.get();
    }

    public void onCreateB2KeyInfoEvent(boolean z, String str, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "210fad68d8dffa98f54ee955864ec568", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "210fad68d8dffa98f54ee955864ec568");
            return;
        }
        synchronized (this._ls) {
            for (OnSocketSecureManagerEventLisenter onSocketSecureManagerEventLisenter : this._ls) {
                onSocketSecureManagerEventLisenter.onCreateB2KeyInfoEvent(z, str, i);
            }
        }
    }

    public void onSignB2KeyEvent(boolean z, String str, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9a974112c924efce0c4e36368cef003", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9a974112c924efce0c4e36368cef003");
            return;
        }
        synchronized (this._ls) {
            for (OnSocketSecureManagerEventLisenter onSocketSecureManagerEventLisenter : this._ls) {
                onSocketSecureManagerEventLisenter.onSignB2KeyEvent(z, str, i);
            }
        }
    }

    public void removeOnSocketSecureManagerEventListener(OnSocketSecureManagerEventLisenter onSocketSecureManagerEventLisenter) {
        Object[] objArr = {onSocketSecureManagerEventLisenter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24047ec93e33c10cee2b2cde8a071b4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24047ec93e33c10cee2b2cde8a071b4d");
            return;
        }
        synchronized (this._ls) {
            this._ls.remove(onSocketSecureManagerEventLisenter);
        }
    }

    public synchronized void removeSecureInfo2Local() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c79ec0d26e686c5fadf4f550ce21501", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c79ec0d26e686c5fadf4f550ce21501");
            return;
        }
        if (this.cacheSecureInfo != null) {
            this.cacheSecureInfo.removeSecureInfoFromCache();
        }
    }

    public void removeSocketSecureHandler(SocketSecureCell socketSecureCell) {
        Object[] objArr = {socketSecureCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037f142129aca15b613f2d6ba555a30b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037f142129aca15b613f2d6ba555a30b");
            return;
        }
        this.arrayLock.lock();
        ArrayList arrayList = new ArrayList();
        try {
            this.arraySocket.add(socketSecureCell);
            if (!this.arraySocket.isEmpty()) {
                Iterator<SocketSecureCell> it = this.arraySocket.iterator();
                while (it.hasNext()) {
                    SocketSecureCell next = it.next();
                    if (next == socketSecureCell) {
                        arrayList.add(next);
                        closeSocketSecureCell(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.arraySocket.removeAll(arrayList);
            }
        } finally {
            this.arrayLock.unlock();
        }
    }

    public synchronized void saveSecureInfo2Local() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71586e1794130d2f07bf2a9ab88a19f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71586e1794130d2f07bf2a9ab88a19f3");
            return;
        }
        d.a a2 = this.secureInfo.a();
        if (a2 != null && a2.a() && !SecureTools.isEmpty(this.secureInfo.b)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", this.secureInfo.b);
                jSONObject.put(com.huawei.hms.opendevice.c.a, a2.d);
                jSONObject.put("b", a2.b);
                jSONObject.put("a", a2.c);
                String jSONObject2 = jSONObject.toString();
                if (this.cacheSecureInfo != null) {
                    this.cacheSecureInfo.writeSecureInfo2Cache(SecureTools.encryptBASE64(SecureTools.encryptDataByKey(jSONObject2.getBytes(), this.cacheSecureInfo.getSecureKey().getBytes())).trim());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setEncrypted(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f363d4b582a7203e5c1c72fdde76ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f363d4b582a7203e5c1c72fdde76ed3");
        } else {
            this.isEncrypted.set(z);
        }
    }

    public void setDeviceInfo(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da364d79df15b9c97074876ae72320dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da364d79df15b9c97074876ae72320dd");
        } else if (this.addSocketManage != null) {
            e eVar = this.addSocketManage;
            Object[] objArr2 = {str, str2, str3, str4};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "b17c373f9b1ec8acec5f7a76c962c57d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "b17c373f9b1ec8acec5f7a76c962c57d");
                return;
            }
            eVar.c = new b();
            eVar.c.c = str3;
            eVar.c.d = str4;
            eVar.c.b = str2;
            eVar.c.a = str;
        }
    }

    public void enableSignB2key(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e280ce75790b51417f7c84f20f0d5104", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e280ce75790b51417f7c84f20f0d5104");
        } else if (this.addSocketManage != null) {
            this.addSocketManage.d = z;
        }
    }

    public SocketSecureManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b0b2cc670c9de5e4b4e47656d3892db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b0b2cc670c9de5e4b4e47656d3892db");
            return;
        }
        this.arrayLock = new ReentrantLock();
        this.arraySocket = new ArrayList<>();
        this._ls = new ArrayList();
        this.isEncrypting = new AtomicBoolean(false);
        this.isEncrypted = new AtomicBoolean(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        this.rsaCacheInfo = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c016550b3fd04301e6adb6fdcc6ddb2b", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c016550b3fd04301e6adb6fdcc6ddb2b") : new c();
        this.secureInfo = d.c();
        c cVar = this.rsaCacheInfo;
        d dVar = this.secureInfo;
        Object[] objArr3 = {cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect4 = e.a;
        this.addSocketManage = PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "9f03225ee546ed98a6f068e4d18443d0", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "9f03225ee546ed98a6f068e4d18443d0") : new e(cVar, dVar);
        this.addSocketManage.f = this;
    }

    public void initRSAKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7bcac0eaa6de315c06563caf6854d97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7bcac0eaa6de315c06563caf6854d97");
        } else if (this.rsaCacheInfo != null) {
            c cVar = this.rsaCacheInfo;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "6965941d818af6058a475f7acf44d7e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "6965941d818af6058a475f7acf44d7e3");
            } else if (cVar.b || cVar.b()) {
            } else {
                cVar.b = true;
                Log.d("encrypt > init rsa start");
                cVar.a();
                Log.d("encrypt > init rsa end");
            }
        }
    }

    public void setCacheSecureInfo(CacheSecureInfo cacheSecureInfo) {
        Object[] objArr = {cacheSecureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a652ddd0da736609e5e39b3af37b8c28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a652ddd0da736609e5e39b3af37b8c28");
        } else if (cacheSecureInfo != null) {
            this.cacheSecureInfo = cacheSecureInfo;
            String readSecureInfoFromCache = cacheSecureInfo.readSecureInfoFromCache();
            d.a aVar = new d.a();
            if (SecureTools.isEmpty(readSecureInfoFromCache) || this.cacheSecureInfo.getSecureKey() == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(SecureTools.decryptDataByKey(SecureTools.decryptBASE64(readSecureInfoFromCache.trim()), this.cacheSecureInfo.getSecureKey().getBytes())));
                aVar.b = jSONObject.getString("b");
                aVar.c = jSONObject.getString("a");
                aVar.d = jSONObject.getLong(com.huawei.hms.opendevice.c.a);
                this.secureInfo.b = jSONObject.getString("t");
                if (!aVar.a() || SecureTools.isEmpty(this.secureInfo.b)) {
                    return;
                }
                this.secureInfo.a(aVar.b, aVar.c, aVar.d);
                this.isEncrypted.set(true);
                this.addSocketManage.b = e.a.SUCCESS_CREATE_KEY;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b8f6c78334e7e7c2715204b53bcf7a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b8f6c78334e7e7c2715204b53bcf7a2");
        } else if (this.isEncrypted.get() || !this.isEncrypting.compareAndSet(false, true)) {
        } else {
            SocketSecureCell randomSocketSecureCell = getRandomSocketSecureCell();
            if (randomSocketSecureCell != null) {
                e eVar = this.addSocketManage;
                Object[] objArr2 = {randomSocketSecureCell};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "d5054b5433adcf963b87abba5e9e6add", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "d5054b5433adcf963b87abba5e9e6add");
                } else {
                    if (eVar.e != null && !eVar.e.isSocketConnected() && eVar.b == e.a.CREATE_KEY_REQUEST) {
                        eVar.b = e.a.NONE;
                    }
                    if (eVar.e == null) {
                        eVar.e = randomSocketSecureCell;
                    }
                    if (eVar.b == e.a.NONE) {
                        eVar.a(randomSocketSecureCell, (String) null, SecureProtocol.DataPacketType.CREATE_KEY_REQUEST.getType());
                    }
                }
            }
            this.isEncrypting.set(false);
        }
    }

    private synchronized void closeSocketSecureCell(SocketSecureCell socketSecureCell) {
        e.a aVar;
        Object[] objArr = {socketSecureCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e3d2e111c9e15b23a98ede1be59390", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e3d2e111c9e15b23a98ede1be59390");
            return;
        }
        e eVar = this.addSocketManage;
        Object[] objArr2 = {socketSecureCell};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "bc3d6f5d926b5fbc6886543cb990cafa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "bc3d6f5d926b5fbc6886543cb990cafa");
            return;
        }
        if (eVar.e != null && eVar.e == socketSecureCell) {
            if (eVar.b == e.a.CREATE_KEY_REQUEST) {
                aVar = e.a.NONE;
            } else if (eVar.b == e.a.CHANGE_KEY_REQUEST) {
                aVar = e.a.SUCCESS_CREATE_KEY;
            }
            eVar.b = aVar;
        }
        eVar.e = null;
    }
}
